package me.mren.mediaparser;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MetadataViewTest {

	private MetadataView metadataView;

	private final String absolutPath = "absolutPath";

	private List<MetaField> metaFields;

	@Mock
	private MetaField metaField1;

	@Mock
	private MetaField metaField2;

	@Before
	public void before() {
		metaFields = Arrays.asList(metaField1, metaField2);
		metadataView = new MetadataView(absolutPath, metaFields);
	}

	@Test
	public void testGetAbsolutPath() {
		Assert.assertEquals(absolutPath, metadataView.getAbsolutPath());
	}

	@Test
	public void testGetMetadata() {
		Assert.assertEquals(metaFields, metadataView.getMetadata());
	}

}
