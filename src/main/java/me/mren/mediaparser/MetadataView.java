package me.mren.mediaparser;

import java.util.Collections;
import java.util.List;

public class MetadataView {

	private final String absolutPath;

	private final List<MetaField> metaFields;

	MetadataView(final String absolutPath, final List<MetaField> metaFields) {
		this.absolutPath = absolutPath;
		this.metaFields = Collections.unmodifiableList(metaFields);
	}

	public String getAbsolutPath() {
		return absolutPath;
	}

	public List<MetaField> getMetadata() {
		return metaFields;
	}

}
