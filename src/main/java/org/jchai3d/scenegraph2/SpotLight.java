/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jchai3d.scenegraph2;

/**
 *
 * @author Usuário
 */
public class SpotLight extends PositionalLight{

    public SpotLight() throws ScenegraphException {
    }
    
    protected float spotExponent;
    
    protected float spotCutOffAngle;
}
