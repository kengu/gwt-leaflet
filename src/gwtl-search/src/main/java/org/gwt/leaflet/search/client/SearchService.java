package org.gwt.leaflet.search.client;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

/**
 * <b>Search service interface</b>
 *
 */
public interface SearchService extends RestService {
	
	void search(String query, MethodCallback<SearchResult> callback);

}
