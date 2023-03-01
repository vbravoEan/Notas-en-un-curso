/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogot� - Colombia)
 * Programa de Ingenier�a de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Gu�a 2 - Actividad 2
 * Ejercicio: notas de un curso
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package notasCurso.interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Panel donde se muestran los datos adicionales y las opciones.
 */
@SuppressWarnings("serial")
public class PanelAdicionales extends JPanel implements ActionListener {

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Comando promedio.
     */
    private static final String PROMEDIO = "PROMEDIO";

    /**
     * Comando mayores.
     */
    private static final String MAYORES = "MAYORES";

    /**
     * Comando opci�n 1: cuantos perdieron
     */
    private static final String OPCION_1 = "OPCION_1";

    /**
     * Comando opci�n 2: la mejor nota
     */
    private static final String OPCION_2 = "OPCION_2";

    /**
     * Comando opci�n 3: el porcentaje de estudiantes pasaron
     */
    private static final String OPCION_3 = "OPCION_3";

    /**
     * Comando opci�n 2: todos ganaron la unidad de estudios
     */
    private static final String OPCION_4 = "OPCION_4";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal.
     */
    private InterfazNotasCurso ventana;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Bot�n promedio.
     */
    private JButton btnPromedio;

    /**
     * Bot�n n�mero de estudiantes con nota mayor al promedio.
     */
    private JButton btnMayores;

    /**
     * Bot�n Extensi�n 1.
     */
    private JButton btnExtension1;

    /**
     * Bot�n Extensi�n 2.
     */
    private JButton btnExtension2;

    /**
     * Bot�n Extensi�n 3.
     */
    private JButton btnExtension3;

    /**
     * Bot�n Extensi�n 4.
     */
    private JButton btnExtension4;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel.
     *
     * @param pPrincipal Ventana principal.
     */
    public PanelAdicionales(InterfazNotasCurso pPrincipal) {
        ventana = pPrincipal;
        setBorder(new TitledBorder("Adicionales"));
        setLayout(new GridLayout(2, 3));

        // Bot�n Promedio
        btnPromedio = new JButton("Promedio");
        btnPromedio.addActionListener(this);
        btnPromedio.setActionCommand(PanelAdicionales.PROMEDIO);
        add(btnPromedio);

        // Bot�n Mayores
        btnMayores = new JButton("# Mayor al promedio");
        btnMayores.addActionListener(this);
        btnMayores.setActionCommand(PanelAdicionales.MAYORES);
        add(btnMayores);

        // Bot�n Extensi�n 1
        btnExtension1 = new JButton("Reprobaron");
        btnExtension1.addActionListener(this);
        btnExtension1.setActionCommand(PanelAdicionales.OPCION_1);
        add(btnExtension1);

        // Bot�n Extensi�n 2
        btnExtension2 = new JButton("Mejor Nota");
        btnExtension2.addActionListener(this);
        btnExtension2.setActionCommand(PanelAdicionales.OPCION_2);
        add(btnExtension2);

        // Bot�n Extensi�n 3
        btnExtension3 = new JButton("Porcentaje Pasaron");
        btnExtension3.addActionListener(this);
        btnExtension3.setActionCommand(PanelAdicionales.OPCION_3);
        add(btnExtension3);

        // Bot�n Extensi�n 4
        btnExtension4 = new JButton("Todos Ganaron?");
        btnExtension4.addActionListener(this);
        btnExtension4.setActionCommand(PanelAdicionales.OPCION_4);
        add(btnExtension4);
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Manejo de eventos de los botones.
     *
     * @param pEvento Evento que gener� la acci�n. pEvento != null.
     */
    public void actionPerformed(ActionEvent pEvento) {
        String comando = pEvento.getActionCommand();
        if (OPCION_1.equals(comando)) {
            ventana.reqFuncOpcion1();
        }
        else if (OPCION_2.equals(comando)) {
            ventana.reqFuncOpcion2();
        }
        else if (OPCION_3.equals(comando)) {
            ventana.reqFuncOpcion3();
        }
        else if (OPCION_4.equals(comando)) {
            ventana.reqFuncOpcion4();
        }
        else if (PROMEDIO.equals(comando)) {
            ventana.mostrarPromedio();
        }
        else if (MAYORES.equals(comando)) {
            ventana.mostrarMayores();
        }
    }
}
