/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpets.modelo;

/**
 *
 * @author EDU
 */
public class Persona {

    protected String cedula;
    protected String nombre;
    protected String apellido;

    public static boolean validarCedula(String cedula) {
        boolean esValido = true;
        int pro = 0;
        try {
            long n1 = Integer.parseInt(cedula);

            pro = 1;

        } catch (Exception ex) {
            esValido = false;
        }

        if (pro == 1) {
            int[] num = new int[cedula.length()];

            for (int i = 0; i < num.length; i++) {
                num[i] = (int) cedula.charAt(i) - 48;
            }
            int sum = 0;
            for (int i = 0; i < num.length - 1; i++) {
                if (i % 2 == 0) {
                    int l = num[i] * 2;
                    if (l > 9) {
                        l -= 9;
                        sum += l;
                    } else {
                        sum += l;
                    }
                } else {
                    sum += num[i];
                }
            }
            if (sum % 10 == 0) {

                if ((10 - (sum % 10)) == num[num.length - 1] + 10) {
                } else {
                    esValido = false;
                }
            } else {

                if ((10 - (sum % 10)) == num[num.length - 1]) {
                } else {
                    esValido = false;
                }
            }
        }

        return esValido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
