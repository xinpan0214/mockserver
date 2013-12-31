package org.mockserver.model;

import java.util.Collection;

/**
 * @author jamesdbloom
 */
public class Header extends KeyToMultiValue {

    public Header(String name, String... value) {
        super(name, value);
    }

    public Header(String name, Collection<String> value) {
        super(name, value);
    }
}
