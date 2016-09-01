/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.PresupuestosFlujosCajaConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class PresupuestosFlujosCajaDetalleFormJInternalFrame extends PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresupuestosFlujosCaja;
	
	protected JMenuBar jmenuBarDetallePresupuestosFlujosCaja;
	
	protected JMenu jmenuDetallePresupuestosFlujosCaja;
	protected JMenu jmenuDetalleArchivoPresupuestosFlujosCaja;
	protected JMenu jmenuDetalleAccionesPresupuestosFlujosCaja;
	protected JMenu jmenuDetalleDatosPresupuestosFlujosCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestosFlujosCaja;	
	protected GridBagConstraints gridBagConstraintsPresupuestosFlujosCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional jInternalFrameDetallePresupuestosFlujosCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PresupuestosFlujosCajaSessionBean presupuestosflujoscajaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public PresupuestosFlujosCajaLogic presupuestosflujoscajaLogic;
	
	public JScrollPane jScrollPanelDatosPresupuestosFlujosCaja;
	public JScrollPane jScrollPanelDatosEdicionPresupuestosFlujosCaja;
	public JScrollPane jScrollPanelDatosGeneralPresupuestosFlujosCaja;
	
	protected JPanel jPanelCamposPresupuestosFlujosCaja;    
	protected JPanel jPanelCamposOcultosPresupuestosFlujosCaja;    	
	protected JPanel jPanelAccionesPresupuestosFlujosCaja;
	protected JPanel jPanelAccionesFormularioPresupuestosFlujosCaja;
    
	
	
	protected Integer iXPanelCamposPresupuestosFlujosCaja=0;
	protected Integer iYPanelCamposPresupuestosFlujosCaja=0;
	
	protected Integer iXPanelCamposOcultosPresupuestosFlujosCaja=0;
	protected Integer iYPanelCamposOcultosPresupuestosFlujosCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresupuestosFlujosCaja;
	public JButton jButtonModificarPresupuestosFlujosCaja;
	public JButton jButtonActualizarPresupuestosFlujosCaja;
    public JButton jButtonEliminarPresupuestosFlujosCaja;
	public JButton jButtonCancelarPresupuestosFlujosCaja;
    public JButton jButtonGuardarCambiosPresupuestosFlujosCaja;
	public JButton jButtonGuardarCambiosTablaPresupuestosFlujosCaja;
	protected JButton jButtonCerrarPresupuestosFlujosCaja;
	
	
	protected JButton jButtonProcesarInformacionPresupuestosFlujosCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresupuestosFlujosCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresupuestosFlujosCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresupuestosFlujosCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestosFlujosCaja;
	protected JButton jButtonModificarToolBarPresupuestosFlujosCaja;
	protected JButton jButtonActualizarToolBarPresupuestosFlujosCaja;
    protected JButton jButtonEliminarToolBarPresupuestosFlujosCaja;
	protected JButton jButtonCancelarToolBarPresupuestosFlujosCaja;
    protected JButton jButtonGuardarCambiosToolBarPresupuestosFlujosCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarPresupuestosFlujosCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestosFlujosCaja;
	protected JButton jButtonCerrarToolBarPresupuestosFlujosCaja;
	
	protected JButton jButtonProcesarInformacionToolBarPresupuestosFlujosCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemModificarPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemActualizarPresupuestosFlujosCaja;
    protected JMenuItem jMenuItemEliminarPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemCancelarPresupuestosFlujosCaja;
    protected JMenuItem jMenuItemGuardarCambiosPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemCerrarPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestosFlujosCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestosFlujosCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestosFlujosCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestosFlujosCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresupuestosFlujosCaja;
	public JLabel jLabelIdPresupuestosFlujosCaja;
	public JLabel jLabelidPresupuestosFlujosCaja;
	public JButton jButtonidPresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuentaPresupuestosFlujosCaja;
	public JLabel jLabelcodigo_cuentaPresupuestosFlujosCaja;
	public JTextField jTextFieldcodigo_cuentaPresupuestosFlujosCaja;
	public JButton jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPresupuestosFlujosCaja;
	public JLabel jLabelcodigoPresupuestosFlujosCaja;
	public JTextField jTextFieldcodigoPresupuestosFlujosCaja;
	public JButton jButtoncodigoPresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombrePresupuestosFlujosCaja;
	public JLabel jLabelnombrePresupuestosFlujosCaja;
	public JTextArea jTextAreanombrePresupuestosFlujosCaja;
	public JScrollPane jscrollPanenombrePresupuestosFlujosCaja;
	public JButton jButtonnombrePresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_moduloPresupuestosFlujosCaja;
	public JLabel jLabelnombre_moduloPresupuestosFlujosCaja;
	public JTextArea jTextAreanombre_moduloPresupuestosFlujosCaja;
	public JScrollPane jscrollPanenombre_moduloPresupuestosFlujosCaja;
	public JButton jButtonnombre_moduloPresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor1PresupuestosFlujosCaja;
	public JLabel jLabelvalor1PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor1PresupuestosFlujosCaja;
	public JButton jButtonvalor1PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor2PresupuestosFlujosCaja;
	public JLabel jLabelvalor2PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor2PresupuestosFlujosCaja;
	public JButton jButtonvalor2PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor3PresupuestosFlujosCaja;
	public JLabel jLabelvalor3PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor3PresupuestosFlujosCaja;
	public JButton jButtonvalor3PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor4PresupuestosFlujosCaja;
	public JLabel jLabelvalor4PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor4PresupuestosFlujosCaja;
	public JButton jButtonvalor4PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor5PresupuestosFlujosCaja;
	public JLabel jLabelvalor5PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor5PresupuestosFlujosCaja;
	public JButton jButtonvalor5PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor6PresupuestosFlujosCaja;
	public JLabel jLabelvalor6PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor6PresupuestosFlujosCaja;
	public JButton jButtonvalor6PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor7PresupuestosFlujosCaja;
	public JLabel jLabelvalor7PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor7PresupuestosFlujosCaja;
	public JButton jButtonvalor7PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor8PresupuestosFlujosCaja;
	public JLabel jLabelvalor8PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor8PresupuestosFlujosCaja;
	public JButton jButtonvalor8PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor9PresupuestosFlujosCaja;
	public JLabel jLabelvalor9PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor9PresupuestosFlujosCaja;
	public JButton jButtonvalor9PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor10PresupuestosFlujosCaja;
	public JLabel jLabelvalor10PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor10PresupuestosFlujosCaja;
	public JButton jButtonvalor10PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor11PresupuestosFlujosCaja;
	public JLabel jLabelvalor11PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor11PresupuestosFlujosCaja;
	public JButton jButtonvalor11PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalor12PresupuestosFlujosCaja;
	public JLabel jLabelvalor12PresupuestosFlujosCaja;
	public JTextField jTextFieldvalor12PresupuestosFlujosCaja;
	public JButton jButtonvalor12PresupuestosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPaneltotalPresupuestosFlujosCaja;
	public JLabel jLabeltotalPresupuestosFlujosCaja;
	public JTextField jTextFieldtotalPresupuestosFlujosCaja;
	public JButton jButtontotalPresupuestosFlujosCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresupuestosFlujosCaja;
	public JLabel jLabelid_empresaPresupuestosFlujosCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresupuestosFlujosCaja;
	public JButton jButtonid_empresaPresupuestosFlujosCaja= new JButtonMe();
	public JButton jButtonid_empresaPresupuestosFlujosCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresupuestosFlujosCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresupuestosFlujosCaja;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresupuestosFlujosCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresupuestosFlujosCaja=new JPanel();
				this.jPanelAccionesFormularioPresupuestosFlujosCaja=new JPanel();
				this.jmenuBarDetallePresupuestosFlujosCaja=new JMenuBar();
				this.jTtoolBarDetallePresupuestosFlujosCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestosFlujosCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresupuestosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresupuestosFlujosCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresupuestosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestosFlujosCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestosFlujosCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestosFlujosCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarPresupuestosFlujosCaja() {
		return this.jButtonActualizarToolBarPresupuestosFlujosCaja;
	}
	
	public JButton getjButtonEliminarToolBarPresupuestosFlujosCaja() {
		return this.jButtonEliminarToolBarPresupuestosFlujosCaja;
	}
	
	public JButton getjButtonCancelarToolBarPresupuestosFlujosCaja() {
		return this.jButtonCancelarToolBarPresupuestosFlujosCaja;
	}		
	
	public JButton getjButtonProcesarInformacionPresupuestosFlujosCaja() {
		return this.jButtonProcesarInformacionPresupuestosFlujosCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestosFlujosCaja)	{
		this.jButtonProcesarInformacionPresupuestosFlujosCaja = jButtonProcesarInformacionPresupuestosFlujosCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestosFlujosCaja() {
		return this.jComboBoxTiposAccionesPresupuestosFlujosCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestosFlujosCaja(
			JComboBox jComboBoxTiposRelacionesPresupuestosFlujosCaja) {
		this.jComboBoxTiposRelacionesPresupuestosFlujosCaja = jComboBoxTiposRelacionesPresupuestosFlujosCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestosFlujosCaja(
			JComboBox jComboBoxTiposAccionesPresupuestosFlujosCaja) {
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja = jComboBoxTiposAccionesPresupuestosFlujosCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresupuestosFlujosCaja() {
		return this.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresupuestosFlujosCaja(
			JComboBox jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja) {
		this.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja = jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presupuestosflujoscajaSessionBean=new PresupuestosFlujosCajaSessionBean();
		
		this.presupuestosflujoscajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestosflujoscajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestosFlujosCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuestos Flujos Caja MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		PresupuestosFlujosCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresupuestosFlujosCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresupuestosFlujosCaja=new JButtonMe();
				this.jButtonModificarToolBarPresupuestosFlujosCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresupuestosFlujosCaja,this.jTtoolBarDetallePresupuestosFlujosCaja,
							"actualizar","actualizar","Actualizar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresupuestosFlujosCaja,this.jTtoolBarDetallePresupuestosFlujosCaja,
							"eliminar","eliminar","Eliminar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresupuestosFlujosCaja,this.jTtoolBarDetallePresupuestosFlujosCaja,
							"cancelar","cancelar","Cancelar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresupuestosFlujosCaja,this.jTtoolBarDetallePresupuestosFlujosCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresupuestosFlujosCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresupuestosFlujosCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresupuestosFlujosCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresupuestosFlujosCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresupuestosFlujosCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestosFlujosCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestosFlujosCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestosFlujosCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresupuestosFlujosCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresupuestosFlujosCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresupuestosFlujosCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresupuestosFlujosCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresupuestosFlujosCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresupuestosFlujosCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresupuestosFlujosCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresupuestosFlujosCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresupuestosFlujosCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresupuestosFlujosCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresupuestosFlujosCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresupuestosFlujosCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresupuestosFlujosCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestosFlujosCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestosFlujosCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestosFlujosCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestosFlujosCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestosFlujosCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresupuestosFlujosCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresupuestosFlujosCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresupuestosFlujosCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestosFlujosCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestosFlujosCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestosFlujosCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresupuestosFlujosCaja.add(this.jMenuItemDetalleCerrarPresupuestosFlujosCaja);
		
		this.jmenuDetalleAccionesPresupuestosFlujosCaja.add(this.jMenuItemActualizarPresupuestosFlujosCaja);
		this.jmenuDetalleAccionesPresupuestosFlujosCaja.add(this.jMenuItemEliminarPresupuestosFlujosCaja);
		this.jmenuDetalleAccionesPresupuestosFlujosCaja.add(this.jMenuItemCancelarPresupuestosFlujosCaja);		
		
		//this.jmenuDetalleDatosPresupuestosFlujosCaja.add(this.jMenuItemDetalleAbrirOrderByPresupuestosFlujosCaja);				
		this.jmenuDetalleDatosPresupuestosFlujosCaja.add(this.jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja);				
				
		//this.jmenuDetalleAccionesPresupuestosFlujosCaja.add(this.jMenuItemGuardarCambiosPresupuestosFlujosCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresupuestosFlujosCaja.add(this.jmenuDetalleArchivoPresupuestosFlujosCaja);		
		this.jmenuBarDetallePresupuestosFlujosCaja.add(this.jmenuDetalleAccionesPresupuestosFlujosCaja);		
		this.jmenuBarDetallePresupuestosFlujosCaja.add(this.jmenuDetalleDatosPresupuestosFlujosCaja);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresupuestosFlujosCaja);				
	}
	
	
	public void inicializarElementosCamposPresupuestosFlujosCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresupuestosFlujosCaja = new JLabelMe();
		jLabelIdPresupuestosFlujosCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresupuestosFlujosCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresupuestosFlujosCaja= new GridBagLayout();

		this.jPanelidPresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);

		jLabelidPresupuestosFlujosCaja = new JLabel();
		jLabelidPresupuestosFlujosCaja.setText("Id");

		jLabelidPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigo_cuentaPresupuestosFlujosCaja = new JLabelMe();
		this.jLabelcodigo_cuentaPresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA+" : *");
		this.jLabelcodigo_cuentaPresupuestosFlujosCaja.setToolTipText("Codigo Cuenta");
		this.jLabelcodigo_cuentaPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cuentaPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cuentaPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuentaPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuentaPresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuentaPresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelcodigo_cuentaPresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldcodigo_cuentaPresupuestosFlujosCaja= new JTextFieldMe();

		jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setEnabled(false);
		jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuentaPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuentaPresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuentaPresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuentaPresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelcodigoPresupuestosFlujosCaja = new JLabelMe();
		this.jLabelcodigoPresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPresupuestosFlujosCaja.setToolTipText("Codigo");
		this.jLabelcodigoPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelcodigoPresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldcodigoPresupuestosFlujosCaja= new JTextFieldMe();

		jTextFieldcodigoPresupuestosFlujosCaja.setEnabled(false);
		jTextFieldcodigoPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtoncodigoPresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtoncodigoPresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombrePresupuestosFlujosCaja = new JLabelMe();
		this.jLabelnombrePresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePresupuestosFlujosCaja.setToolTipText("Nombre");
		this.jLabelnombrePresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelnombrePresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextAreanombrePresupuestosFlujosCaja= new JTextAreaMe();
		jTextAreanombrePresupuestosFlujosCaja.setEnabled(false);
		jTextAreanombrePresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresupuestosFlujosCaja.setLineWrap(true);
		jTextAreanombrePresupuestosFlujosCaja.setWrapStyleWord(true);
		jTextAreanombrePresupuestosFlujosCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePresupuestosFlujosCaja.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePresupuestosFlujosCaja = new JScrollPane(jTextAreanombrePresupuestosFlujosCaja);
		jscrollPanenombrePresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombrePresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonnombrePresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonnombrePresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_moduloPresupuestosFlujosCaja = new JLabelMe();
		this.jLabelnombre_moduloPresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO+" : *");
		this.jLabelnombre_moduloPresupuestosFlujosCaja.setToolTipText("Nombre Modulo");
		this.jLabelnombre_moduloPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_moduloPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_moduloPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_moduloPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_moduloPresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_moduloPresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelnombre_moduloPresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextAreanombre_moduloPresupuestosFlujosCaja= new JTextAreaMe();
		jTextAreanombre_moduloPresupuestosFlujosCaja.setEnabled(false);
		jTextAreanombre_moduloPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_moduloPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_moduloPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_moduloPresupuestosFlujosCaja.setLineWrap(true);
		jTextAreanombre_moduloPresupuestosFlujosCaja.setWrapStyleWord(true);
		jTextAreanombre_moduloPresupuestosFlujosCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_moduloPresupuestosFlujosCaja.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_moduloPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_moduloPresupuestosFlujosCaja = new JScrollPane(jTextAreanombre_moduloPresupuestosFlujosCaja);
		jscrollPanenombre_moduloPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_moduloPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_moduloPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_moduloPresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_moduloPresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_moduloPresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor1PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor1PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1+" : *");
		this.jLabelvalor1PresupuestosFlujosCaja.setToolTipText("Valor1");
		this.jLabelvalor1PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor1PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor1PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor1PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor1PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor1PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor1PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor1PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor1PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor1PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor1PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor1PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor1PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor1PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor1PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor1PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor1PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor1PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor1PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor1PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor1PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor1PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor1PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor1PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor1PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor1PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor2PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor2PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2+" : *");
		this.jLabelvalor2PresupuestosFlujosCaja.setToolTipText("Valor2");
		this.jLabelvalor2PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor2PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor2PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor2PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor2PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor2PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor2PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor2PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor2PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor2PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor2PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor2PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor2PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor2PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor2PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor2PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor2PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor2PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor2PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor2PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor2PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor2PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor2PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor2PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor2PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor2PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor3PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor3PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3+" : *");
		this.jLabelvalor3PresupuestosFlujosCaja.setToolTipText("Valor3");
		this.jLabelvalor3PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor3PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor3PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor3PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor3PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor3PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor3PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor3PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor3PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor3PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor3PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor3PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor3PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor3PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor3PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor3PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor3PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor3PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor3PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor3PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor3PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor3PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor3PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor3PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor3PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor3PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor4PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor4PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4+" : *");
		this.jLabelvalor4PresupuestosFlujosCaja.setToolTipText("Valor4");
		this.jLabelvalor4PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor4PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor4PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor4PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor4PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor4PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor4PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor4PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor4PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor4PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor4PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor4PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor4PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor4PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor4PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor4PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor4PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor4PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor4PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor4PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor4PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor4PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor4PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor4PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor4PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor4PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor5PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor5PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5+" : *");
		this.jLabelvalor5PresupuestosFlujosCaja.setToolTipText("Valor5");
		this.jLabelvalor5PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor5PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor5PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor5PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor5PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor5PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor5PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor5PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor5PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor5PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor5PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor5PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor5PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor5PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor5PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor5PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor5PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor5PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor5PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor5PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor5PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor5PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor5PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor5PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor5PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor5PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor6PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor6PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6+" : *");
		this.jLabelvalor6PresupuestosFlujosCaja.setToolTipText("Valor6");
		this.jLabelvalor6PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor6PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor6PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor6PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor6PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor6PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor6PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor6PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor6PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor6PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor6PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor6PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor6PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor6PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor6PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor6PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor6PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor6PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor6PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor6PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor6PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor6PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor6PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor6PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor6PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor6PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor7PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor7PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7+" : *");
		this.jLabelvalor7PresupuestosFlujosCaja.setToolTipText("Valor7");
		this.jLabelvalor7PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor7PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor7PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor7PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor7PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor7PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor7PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor7PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor7PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor7PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor7PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor7PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor7PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor7PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor7PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor7PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor7PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor7PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor7PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor7PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor7PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor7PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor7PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor7PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor7PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor7PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor8PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor8PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8+" : *");
		this.jLabelvalor8PresupuestosFlujosCaja.setToolTipText("Valor8");
		this.jLabelvalor8PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor8PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor8PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor8PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor8PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor8PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor8PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor8PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor8PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor8PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor8PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor8PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor8PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor8PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor8PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor8PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor8PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor8PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor8PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor8PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor8PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor8PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor8PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor8PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor8PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor8PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor9PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor9PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9+" : *");
		this.jLabelvalor9PresupuestosFlujosCaja.setToolTipText("Valor9");
		this.jLabelvalor9PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor9PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor9PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor9PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor9PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor9PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor9PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor9PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor9PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor9PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor9PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor9PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor9PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor9PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor9PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor9PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor9PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor9PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor9PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor9PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor9PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor9PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor9PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor9PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor9PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor9PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor10PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor10PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10+" : *");
		this.jLabelvalor10PresupuestosFlujosCaja.setToolTipText("Valor10");
		this.jLabelvalor10PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor10PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor10PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor10PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor10PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor10PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor10PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor10PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor10PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor10PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor10PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor10PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor10PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor10PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor10PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor10PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor10PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor10PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor10PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor10PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor10PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor10PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor10PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor10PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor10PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor10PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor11PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor11PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11+" : *");
		this.jLabelvalor11PresupuestosFlujosCaja.setToolTipText("Valor11");
		this.jLabelvalor11PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor11PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor11PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor11PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor11PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor11PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor11PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor11PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor11PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor11PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor11PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor11PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor11PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor11PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor11PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor11PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor11PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor11PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor11PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor11PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor11PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor11PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor11PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor11PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor11PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor11PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalor12PresupuestosFlujosCaja = new JLabelMe();
		this.jLabelvalor12PresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12+" : *");
		this.jLabelvalor12PresupuestosFlujosCaja.setToolTipText("Valor12");
		this.jLabelvalor12PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor12PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor12PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor12PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor12PresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor12PresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelvalor12PresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldvalor12PresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldvalor12PresupuestosFlujosCaja.setEnabled(false);
		jTextFieldvalor12PresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor12PresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor12PresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor12PresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor12PresupuestosFlujosCaja.setText("0.0");

		this.jButtonvalor12PresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonvalor12PresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor12PresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor12PresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor12PresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonvalor12PresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor12PresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor12PresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor12PresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor12PresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor12PresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor12PresupuestosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabeltotalPresupuestosFlujosCaja = new JLabelMe();
		this.jLabeltotalPresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalPresupuestosFlujosCaja.setToolTipText("Total");
		this.jLabeltotalPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalPresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalPresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPaneltotalPresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jTextFieldtotalPresupuestosFlujosCaja= new JTextFieldMe();
		jTextFieldtotalPresupuestosFlujosCaja.setEnabled(false);
		jTextFieldtotalPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalPresupuestosFlujosCaja.setText("0.0");

		this.jButtontotalPresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtontotalPresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalPresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtontotalPresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalPresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalPresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalPresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalPresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalPresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalPresupuestosFlujosCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresupuestosFlujosCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresupuestosFlujosCaja = new JLabelMe();
		this.jLabelid_empresaPresupuestosFlujosCaja.setText(""+PresupuestosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresupuestosFlujosCaja.setToolTipText("Empresa");
		this.jLabelid_empresaPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresupuestosFlujosCaja.setToolTipText(PresupuestosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		this.jPanelid_empresaPresupuestosFlujosCaja.setLayout(this.gridaBagLayoutPresupuestosFlujosCaja);


		jComboBoxid_empresaPresupuestosFlujosCaja= new JComboBoxMe();
		jComboBoxid_empresaPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresupuestosFlujosCaja.setEnabled(false);

		this.jButtonid_empresaPresupuestosFlujosCaja= new JButtonMe();
		this.jButtonid_empresaPresupuestosFlujosCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestosFlujosCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestosFlujosCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestosFlujosCaja.setText("Buscar");
		this.jButtonid_empresaPresupuestosFlujosCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresupuestosFlujosCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestosFlujosCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestosFlujosCaja"));

		this.jButtonid_empresaPresupuestosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaPresupuestosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestosFlujosCajaBusqueda.setText("U");
		this.jButtonid_empresaPresupuestosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresupuestosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestosFlujosCajaBusqueda"));

		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresupuestosFlujosCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresupuestosFlujosCajaUpdate= new JButtonMe();
		this.jButtonid_empresaPresupuestosFlujosCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestosFlujosCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestosFlujosCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestosFlujosCajaUpdate.setText("U");
		this.jButtonid_empresaPresupuestosFlujosCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresupuestosFlujosCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestosFlujosCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestosFlujosCajaUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetallePresupuestosFlujosCaja = new PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Presupuestos Flujos Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestosFlujosCaja= new GridBagLayout();
		

		
		String sToolTipPresupuestosFlujosCaja="";
		sToolTipPresupuestosFlujosCaja=PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestosFlujosCaja+="(Tesoreria.PresupuestosFlujosCaja)";
		}
		
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestosFlujosCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonModificarPresupuestosFlujosCaja = new JButtonMe();
        this.jButtonActualizarPresupuestosFlujosCaja = new JButtonMe();
        this.jButtonEliminarPresupuestosFlujosCaja = new JButtonMe();
        this.jButtonCancelarPresupuestosFlujosCaja = new JButtonMe();
        this.jButtonGuardarCambiosPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonCerrarPresupuestosFlujosCaja = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestosFlujosCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresupuestosFlujosCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralPresupuestosFlujosCaja = new JScrollPane();
				
		
		
		this.jPanelCamposPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuestos Flujos Caja";
		
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuestos Flujos Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestosFlujosCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresupuestosFlujosCaja.setName("jPanelCamposPresupuestosFlujosCaja"); 

		this.jPanelCamposOcultosPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresupuestosFlujosCaja.setName("jPanelCamposOcultosPresupuestosFlujosCaja"); 

        this.jPanelAccionesPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestosFlujosCaja.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestosFlujosCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresupuestosFlujosCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresupuestosFlujosCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresupuestosFlujosCaja.setText("Nuevo");
		this.jButtonModificarPresupuestosFlujosCaja.setText("Editar");
        this.jButtonActualizarPresupuestosFlujosCaja.setText("Actualizar");
        this.jButtonEliminarPresupuestosFlujosCaja.setText("Eliminar");
        this.jButtonCancelarPresupuestosFlujosCaja.setText("Cancelar");
        this.jButtonGuardarCambiosPresupuestosFlujosCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.setText("Guardar");
		this.jButtonCerrarPresupuestosFlujosCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestosFlujosCaja,"nuevo_button","Nuevo",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresupuestosFlujosCaja,"modificar_button","Editar",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresupuestosFlujosCaja,"actualizar_button","Actualizar",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresupuestosFlujosCaja,"eliminar_button","Eliminar",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresupuestosFlujosCaja,"cancelar_button","Cancelar",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresupuestosFlujosCaja,"guardarcambios_button","Guardar",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja,"guardarcambiostabla_button","Guardar",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestosFlujosCaja,"cerrar_button","Salir",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresupuestosFlujosCaja.setToolTipText("Nuevo"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresupuestosFlujosCaja.setToolTipText("Editar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresupuestosFlujosCaja.setToolTipText("Actualizar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresupuestosFlujosCaja.setToolTipText("Eliminar)"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresupuestosFlujosCaja.setToolTipText("Cancelar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresupuestosFlujosCaja.setToolTipText("Guardar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.setToolTipText("Guardar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestosFlujosCaja.setToolTipText("Salir"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoPresupuestosFlujosCaja";
		inputMap = this.jButtonNuevoPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestosFlujosCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestosFlujosCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresupuestosFlujosCaja";
		inputMap = this.jButtonActualizarPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresupuestosFlujosCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarPresupuestosFlujosCaja";
		inputMap = this.jButtonEliminarPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresupuestosFlujosCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarPresupuestosFlujosCaja";
		inputMap = this.jButtonCancelarPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresupuestosFlujosCaja"));
		
		//CERRAR		
		sMapKey = "CerrarPresupuestosFlujosCaja";
		inputMap = this.jButtonCerrarPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestosFlujosCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestosFlujosCaja";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestosFlujosCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresupuestosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresupuestosFlujosCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresupuestosFlujosCaja.setToolTipText("Nuevo PresupuestosFlujosCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresupuestosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresupuestosFlujosCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresupuestosFlujosCaja.setToolTipText("Sin Cerrar Ventana PresupuestosFlujosCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresupuestosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresupuestosFlujosCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresupuestosFlujosCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresupuestosFlujosCaja = new JLabelMe();
		
		this.jLabelAccionesPresupuestosFlujosCaja.setText("Acciones");		
		this.jLabelAccionesPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresupuestosFlujosCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresupuestosFlujosCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresupuestosFlujosCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresupuestosFlujosCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresupuestosFlujosCaja = new GridBagLayout();
		
		this.jPanelCamposPresupuestosFlujosCaja.setLayout(gridaBagLayoutCamposPresupuestosFlujosCaja);
		this.jPanelCamposOcultosPresupuestosFlujosCaja.setLayout(gridaBagLayoutCamposOcultosPresupuestosFlujosCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresupuestosFlujosCaja.add(jLabelIdPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresupuestosFlujosCaja.add(jLabelidPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresupuestosFlujosCaja.add(jLabelid_empresaPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestosFlujosCaja.add(jButtonid_empresaPresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 3;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestosFlujosCaja.add(jButtonid_empresaPresupuestosFlujosCajaUpdate, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresupuestosFlujosCaja.add(jComboBoxid_empresaPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuentaPresupuestosFlujosCaja.add(jLabelcodigo_cuentaPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuentaPresupuestosFlujosCaja.add(jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuentaPresupuestosFlujosCaja.add(jTextFieldcodigo_cuentaPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPresupuestosFlujosCaja.add(jLabelcodigoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPresupuestosFlujosCaja.add(jButtoncodigoPresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPresupuestosFlujosCaja.add(jTextFieldcodigoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePresupuestosFlujosCaja.add(jLabelnombrePresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePresupuestosFlujosCaja.add(jButtonnombrePresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePresupuestosFlujosCaja.add(jscrollPanenombrePresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_moduloPresupuestosFlujosCaja.add(jLabelnombre_moduloPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_moduloPresupuestosFlujosCaja.add(jButtonnombre_moduloPresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_moduloPresupuestosFlujosCaja.add(jscrollPanenombre_moduloPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor1PresupuestosFlujosCaja.add(jLabelvalor1PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor1PresupuestosFlujosCaja.add(jButtonvalor1PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor1PresupuestosFlujosCaja.add(jTextFieldvalor1PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor2PresupuestosFlujosCaja.add(jLabelvalor2PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor2PresupuestosFlujosCaja.add(jButtonvalor2PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor2PresupuestosFlujosCaja.add(jTextFieldvalor2PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor3PresupuestosFlujosCaja.add(jLabelvalor3PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor3PresupuestosFlujosCaja.add(jButtonvalor3PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor3PresupuestosFlujosCaja.add(jTextFieldvalor3PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor4PresupuestosFlujosCaja.add(jLabelvalor4PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor4PresupuestosFlujosCaja.add(jButtonvalor4PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor4PresupuestosFlujosCaja.add(jTextFieldvalor4PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor5PresupuestosFlujosCaja.add(jLabelvalor5PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor5PresupuestosFlujosCaja.add(jButtonvalor5PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor5PresupuestosFlujosCaja.add(jTextFieldvalor5PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor6PresupuestosFlujosCaja.add(jLabelvalor6PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor6PresupuestosFlujosCaja.add(jButtonvalor6PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor6PresupuestosFlujosCaja.add(jTextFieldvalor6PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor7PresupuestosFlujosCaja.add(jLabelvalor7PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor7PresupuestosFlujosCaja.add(jButtonvalor7PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor7PresupuestosFlujosCaja.add(jTextFieldvalor7PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor8PresupuestosFlujosCaja.add(jLabelvalor8PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor8PresupuestosFlujosCaja.add(jButtonvalor8PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor8PresupuestosFlujosCaja.add(jTextFieldvalor8PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor9PresupuestosFlujosCaja.add(jLabelvalor9PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor9PresupuestosFlujosCaja.add(jButtonvalor9PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor9PresupuestosFlujosCaja.add(jTextFieldvalor9PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor10PresupuestosFlujosCaja.add(jLabelvalor10PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor10PresupuestosFlujosCaja.add(jButtonvalor10PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor10PresupuestosFlujosCaja.add(jTextFieldvalor10PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor11PresupuestosFlujosCaja.add(jLabelvalor11PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor11PresupuestosFlujosCaja.add(jButtonvalor11PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor11PresupuestosFlujosCaja.add(jTextFieldvalor11PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor12PresupuestosFlujosCaja.add(jLabelvalor12PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor12PresupuestosFlujosCaja.add(jButtonvalor12PresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor12PresupuestosFlujosCaja.add(jTextFieldvalor12PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalPresupuestosFlujosCaja.add(jLabeltotalPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 2;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalPresupuestosFlujosCaja.add(jButtontotalPresupuestosFlujosCajaBusqueda, this.gridBagConstraintsPresupuestosFlujosCaja);
	}

	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalPresupuestosFlujosCaja.add(jTextFieldtotalPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelidPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelcodigo_cuentaPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelcodigoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelnombrePresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelnombre_moduloPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor1PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor2PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor3PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor4PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor5PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor6PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor7PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor8PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor9PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor10PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor11PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPanelvalor12PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestosFlujosCaja.add(this.jPaneltotalPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposPresupuestosFlujosCaja=0;
		iYPanelCamposPresupuestosFlujosCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iYPanelCamposOcultosPresupuestosFlujosCaja;
	this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iXPanelCamposOcultosPresupuestosFlujosCaja++;
	this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestosFlujosCaja.add(this.jPanelid_empresaPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);



	if(iXPanelCamposOcultosPresupuestosFlujosCaja % 2==0) {
		iXPanelCamposOcultosPresupuestosFlujosCaja=0;
		iYPanelCamposOcultosPresupuestosFlujosCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresupuestosFlujosCaja= new GridBagLayout();
		this.jPanelAccionesPresupuestosFlujosCaja.setLayout(gridaBagLayoutAccionesPresupuestosFlujosCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresupuestosFlujosCaja= new GridBagLayout();
		this.jPanelAccionesFormularioPresupuestosFlujosCaja.setLayout(gridaBagLayoutAccionesFormularioPresupuestosFlujosCaja);
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestosFlujosCaja.add(this.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresupuestosFlujosCaja.add(this.jButtonModificarPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);							

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresupuestosFlujosCaja.add(this.jButtonEliminarPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
			
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestosFlujosCaja.add(this.jButtonActualizarPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestosFlujosCaja.add(this.jButtonGuardarCambiosPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);	
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresupuestosFlujosCaja.add(this.jButtonCancelarPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestosFlujosCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;		
			//this.gridBagConstraintsPresupuestosFlujosCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx =0;
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestosFlujosCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresupuestosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresupuestosFlujosCaja = new PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Presupuestos Flujos Caja DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Presupuestos Flujos Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuestos Flujos Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresupuestosFlujosCajaModel presupuestosflujoscajaModel=new PresupuestosFlujosCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//PresupuestosFlujosCajaModel.PresupuestosFlujosCajaFocusTraversalPolicy presupuestosflujoscajaFocusTraversalPolicy = presupuestosflujoscajaModel.new PresupuestosFlujosCajaFocusTraversalPolicy(this);
			
			//presupuestosflujoscajaFocusTraversalPolicy.setpresupuestosflujoscajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presupuestosflujoscajaModel);
			
			
			this.jContentPaneDetallePresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresupuestosFlujosCaja = new GridBagLayout();	
			this.jContentPaneDetallePresupuestosFlujosCaja.setLayout(gridaBagLayoutDetallePresupuestosFlujosCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestosFlujosCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
				this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
					
				
				this.jContentPaneDetallePresupuestosFlujosCaja.add(jTtoolBarDetallePresupuestosFlujosCaja, gridBagConstraintsPresupuestosFlujosCaja);								
				
}
			
			this.jScrollPanelDatosEdicionPresupuestosFlujosCaja=   new JScrollPane(jContentPaneDetallePresupuestosFlujosCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresupuestosFlujosCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	        
			this.jContentPaneDetallePresupuestosFlujosCaja.add(jPanelCamposPresupuestosFlujosCaja, gridBagConstraintsPresupuestosFlujosCaja);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						//&& presupuestosflujoscajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresupuestosFlujosCaja= new GridBagConstraints();
						this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
						this.jContentPaneDetallePresupuestosFlujosCaja.add(this.jTabbedPaneRelacionesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresupuestosFlujosCaja.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresupuestosFlujosCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
					this.gridBagConstraintsPresupuestosFlujosCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
					
				
					this.jContentPaneDetallePresupuestosFlujosCaja.add(jPanelCamposOcultosPresupuestosFlujosCaja, gridBagConstraintsPresupuestosFlujosCaja);
				
					this.jPanelCamposOcultosPresupuestosFlujosCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	        this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresupuestosFlujosCaja.add(this.jPanelAccionesFormularioPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);							
			
			
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
	        this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
	        
			
			this.jContentPaneDetallePresupuestosFlujosCaja.add(this.jPanelAccionesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresupuestosFlujosCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresupuestosFlujosCaja=   new JScrollPane(this.jPanelCamposPresupuestosFlujosCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresupuestosFlujosCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);			
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			
			
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
			
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresupuestosFlujosCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionPresupuestosFlujosCaja;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
