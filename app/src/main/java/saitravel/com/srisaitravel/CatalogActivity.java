package saitravel.com.srisaitravel;

import android.content.Context;
import android.os.Bundle;


/**
 * (C) Koninklijke Philips N.V., 2015.
 * All rights reserved.
 */
public class CatalogActivity extends MainActivity {
    private int noActionBarTheme = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(noActionBarTheme);

        super.onCreate(savedInstanceState);
    }
    protected void setNoActionBarTheme() {

    }

}
