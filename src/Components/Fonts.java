/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rogel
 */
public class Fonts {
    private Font font = null;
    public String awesomeSolid = "Font Awesome 5 Free-Solid-900.otf";
    
    public Font Fonts(String fontName, int style, float size) {
        try {
            InputStream input = getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, input);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Fonts.class.getName()).log(Level.SEVERE, null, ex);
        }
        Font tfont = font.deriveFont(style, size);
        return tfont;
    }
}
