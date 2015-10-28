package me.schmidhalter.directorylist;

import me.schmidhalter.directorylist.model.*;

public class Main {

	public static void main(String[] args) {
		if(args.length != 2)
			throw new IllegalArgumentException("Programm benötigt folgende Parameter: Pfad Rekursionstiefe");
		
		
		String pfad = args[0];
		int recursion = Integer.parseInt(args[1]);
		 
		IDirectoryItem root = getFromPath(pfad, recursion);
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
