package me.schmidhalter.directorylist;

import me.schmidhalter.directorylist.model.*;

public class Main {

	public static void main(String[] args) {
		IDirectoryItem root = getFromPath("/", 3);
		System.out.println("Loaded");
		System.out.println(root.explain());

	}

	private static IDirectoryItem getFromPath(String path, int recurseLevel) {

		java.io.File file = new java.io.File(path);
		if (file.isFile()) {
			File fil = new File();
			fil.setName(file.getName());
			return fil;
		}

		else {
			Folder dir = new Folder();
			dir.setName(file.getName());
			if (recurseLevel > 0) {
				java.io.File[] subfiles = file.listFiles();
				if (subfiles != null)
					for (java.io.File f : subfiles) {
						dir.addItem(getFromPath(f.getPath(), recurseLevel - 1));
					}
			}
			return dir;
		}
	}

}
