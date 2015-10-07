package me.schmidhalter.directorylist.model;

public class File implements IDirectoryItem {
	private String _name;
	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String explain() {
		return "- "+getName();
	}

}
