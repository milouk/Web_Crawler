package com.complet;

import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;

public class MediaCheck {

    public static boolean media(URL url) {

	    Image image = null;
        try {

            image = ImageIO.read(url);

        } catch (Exception e) {

            System.err.println(e);

        }

        if (image != null) {

			return false;

		} else {

			return true;

		}
    }
 }