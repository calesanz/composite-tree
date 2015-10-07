package me.schmidhalter.directorylist.model;

import java.util.Vector;

public class Folder implements IDirectoryItem {
	private String _name;
	private Vector<IDirectoryItem> _items = new Vector<IDirectoryItem>();
	
	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;
	}
	
	public void addItem(IDirectoryItem item){
		_items.add(item);
	}

	@Override
	public String explain() {
		StringBuilder sb = new StringBuilder();
		sb.append("+ "+getName());
		String linebreak = System.getProperty("line.separator");
		
		for(IDirectoryItem item : _items){
		
			for(String line :item.explain().split(linebreak))
			{
				sb.append(linebreak);
				sb.append("  ");
				sb.append(line);
				
			}
		}
		return sb.toString();
	}

}
