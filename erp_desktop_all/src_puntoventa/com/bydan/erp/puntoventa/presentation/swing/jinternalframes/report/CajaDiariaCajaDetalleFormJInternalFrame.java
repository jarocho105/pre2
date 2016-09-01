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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.CajaDiariaCajaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class CajaDiariaCajaDetalleFormJInternalFrame extends CajaDiariaCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCajaDiariaCaja;
	
	protected JMenuBar jmenuBarDetalleCajaDiariaCaja;
	
	protected JMenu jmenuDetalleCajaDiariaCaja;
	protected JMenu jmenuDetalleArchivoCajaDiariaCaja;
	protected JMenu jmenuDetalleAccionesCajaDiariaCaja;
	protected JMenu jmenuDetalleDatosCajaDiariaCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaDiariaCaja;	
	protected GridBagConstraints gridBagConstraintsCajaDiariaCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CajaDiariaCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleCajaDiariaCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public CajaDiariaCajaSessionBean cajadiariacajaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CajaSessionBean cajaSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public CajaDiariaCajaLogic cajadiariacajaLogic;
	
	public JScrollPane jScrollPanelDatosCajaDiariaCaja;
	public JScrollPane jScrollPanelDatosEdicionCajaDiariaCaja;
	public JScrollPane jScrollPanelDatosGeneralCajaDiariaCaja;
	
	protected JPanel jPanelCamposCajaDiariaCaja;    
	protected JPanel jPanelCamposOcultosCajaDiariaCaja;    	
	protected JPanel jPanelAccionesCajaDiariaCaja;
	protected JPanel jPanelAccionesFormularioCajaDiariaCaja;
    
	
	
	protected Integer iXPanelCamposCajaDiariaCaja=0;
	protected Integer iYPanelCamposCajaDiariaCaja=0;
	
	protected Integer iXPanelCamposOcultosCajaDiariaCaja=0;
	protected Integer iYPanelCamposOcultosCajaDiariaCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCajaDiariaCaja;
	public JButton jButtonModificarCajaDiariaCaja;
	public JButton jButtonActualizarCajaDiariaCaja;
    public JButton jButtonEliminarCajaDiariaCaja;
	public JButton jButtonCancelarCajaDiariaCaja;
    public JButton jButtonGuardarCambiosCajaDiariaCaja;
	public JButton jButtonGuardarCambiosTablaCajaDiariaCaja;
	protected JButton jButtonCerrarCajaDiariaCaja;
	
	
	protected JButton jButtonProcesarInformacionCajaDiariaCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCajaDiariaCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCajaDiariaCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCajaDiariaCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaDiariaCaja;
	protected JButton jButtonModificarToolBarCajaDiariaCaja;
	protected JButton jButtonActualizarToolBarCajaDiariaCaja;
    protected JButton jButtonEliminarToolBarCajaDiariaCaja;
	protected JButton jButtonCancelarToolBarCajaDiariaCaja;
    protected JButton jButtonGuardarCambiosToolBarCajaDiariaCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarCajaDiariaCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaDiariaCaja;
	protected JButton jButtonCerrarToolBarCajaDiariaCaja;
	
	protected JButton jButtonProcesarInformacionToolBarCajaDiariaCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaDiariaCaja;
	protected JMenuItem jMenuItemModificarCajaDiariaCaja;
	protected JMenuItem jMenuItemActualizarCajaDiariaCaja;
    protected JMenuItem jMenuItemEliminarCajaDiariaCaja;
	protected JMenuItem jMenuItemCancelarCajaDiariaCaja;
    protected JMenuItem jMenuItemGuardarCambiosCajaDiariaCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaDiariaCaja;
	protected JMenuItem jMenuItemCerrarCajaDiariaCaja;
	protected JMenuItem jMenuItemDetalleCerrarCajaDiariaCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaDiariaCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionCajaDiariaCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaDiariaCaja;
	protected JMenuItem jMenuItemMostrarOcultarCajaDiariaCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaDiariaCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaDiariaCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCajaDiariaCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCajaDiariaCaja;
	public JLabel jLabelIdCajaDiariaCaja;
	public JLabel jLabelidCajaDiariaCaja;
	public JButton jButtonidCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioCajaDiariaCaja;
	public JLabel jLabelfecha_inicioCajaDiariaCaja;
	//public JFormattedTextField jDateChooserfecha_inicioCajaDiariaCaja;

	public JDateChooser jDateChooserfecha_inicioCajaDiariaCaja;
	public JButton jButtonfecha_inicioCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finCajaDiariaCaja;
	public JLabel jLabelfecha_finCajaDiariaCaja;
	//public JFormattedTextField jDateChooserfecha_finCajaDiariaCaja;

	public JDateChooser jDateChooserfecha_finCajaDiariaCaja;
	public JButton jButtonfecha_finCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cajaCajaDiariaCaja;
	public JLabel jLabelnombre_cajaCajaDiariaCaja;
	public JTextArea jTextAreanombre_cajaCajaDiariaCaja;
	public JScrollPane jscrollPanenombre_cajaCajaDiariaCaja;
	public JButton jButtonnombre_cajaCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialCajaDiariaCaja;
	public JLabel jLabelsecuencialCajaDiariaCaja;
	public JTextField jTextFieldsecuencialCajaDiariaCaja;
	public JButton jButtonsecuencialCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_clienteCajaDiariaCaja;
	public JLabel jLabelcodigo_clienteCajaDiariaCaja;
	public JTextField jTextFieldcodigo_clienteCajaDiariaCaja;
	public JButton jButtoncodigo_clienteCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteCajaDiariaCaja;
	public JLabel jLabelnombre_clienteCajaDiariaCaja;
	public JTextArea jTextAreanombre_clienteCajaDiariaCaja;
	public JScrollPane jscrollPanenombre_clienteCajaDiariaCaja;
	public JButton jButtonnombre_clienteCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalCajaDiariaCaja;
	public JLabel jLabelsubtotalCajaDiariaCaja;
	public JTextField jTextFieldsubtotalCajaDiariaCaja;
	public JButton jButtonsubtotalCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelivaCajaDiariaCaja;
	public JLabel jLabelivaCajaDiariaCaja;
	public JTextField jTextFieldivaCajaDiariaCaja;
	public JButton jButtonivaCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoCajaDiariaCaja;
	public JLabel jLabeldescuentoCajaDiariaCaja;
	public JTextField jTextFielddescuentoCajaDiariaCaja;
	public JButton jButtondescuentoCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoCajaDiariaCaja;
	public JLabel jLabelfinanciamientoCajaDiariaCaja;
	public JTextField jTextFieldfinanciamientoCajaDiariaCaja;
	public JButton jButtonfinanciamientoCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelfleteCajaDiariaCaja;
	public JLabel jLabelfleteCajaDiariaCaja;
	public JTextField jTextFieldfleteCajaDiariaCaja;
	public JButton jButtonfleteCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPaneliceCajaDiariaCaja;
	public JLabel jLabeliceCajaDiariaCaja;
	public JTextField jTextFieldiceCajaDiariaCaja;
	public JButton jButtoniceCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPaneltotalCajaDiariaCaja;
	public JLabel jLabeltotalCajaDiariaCaja;
	public JTextField jTextFieldtotalCajaDiariaCaja;
	public JButton jButtontotalCajaDiariaCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCajaDiariaCaja;
	public JLabel jLabelid_empresaCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCajaDiariaCaja;
	public JButton jButtonid_empresaCajaDiariaCaja= new JButtonMe();
	public JButton jButtonid_empresaCajaDiariaCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaCajaDiariaCaja;
	public JLabel jLabelid_cajaCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaCajaDiariaCaja;
	public JButton jButtonid_cajaCajaDiariaCaja= new JButtonMe();
	public JButton jButtonid_cajaCajaDiariaCajaUpdate= new JButtonMe();
	public JButton jButtonid_cajaCajaDiariaCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteCajaDiariaCaja;
	public JLabel jLabelid_clienteCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteCajaDiariaCaja;
	public JButton jButtonid_clienteCajaDiariaCaja= new JButtonMe();
	public JButton jButtonid_clienteCajaDiariaCajaUpdate= new JButtonMe();
	public JButton jButtonid_clienteCajaDiariaCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCajaDiariaCaja;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CajaDiariaCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCajaDiariaCaja=new JPanel();
				this.jPanelAccionesFormularioCajaDiariaCaja=new JPanel();
				this.jmenuBarDetalleCajaDiariaCaja=new JMenuBar();
				this.jTtoolBarDetalleCajaDiariaCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CajaDiariaCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CajaDiariaCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CajaDiariaCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaDiariaCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaDiariaCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaDiariaCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCajaDiariaCaja() {
		return this.jButtonActualizarToolBarCajaDiariaCaja;
	}
	
	public JButton getjButtonEliminarToolBarCajaDiariaCaja() {
		return this.jButtonEliminarToolBarCajaDiariaCaja;
	}
	
	public JButton getjButtonCancelarToolBarCajaDiariaCaja() {
		return this.jButtonCancelarToolBarCajaDiariaCaja;
	}		
	
	public JButton getjButtonProcesarInformacionCajaDiariaCaja() {
		return this.jButtonProcesarInformacionCajaDiariaCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaDiariaCaja)	{
		this.jButtonProcesarInformacionCajaDiariaCaja = jButtonProcesarInformacionCajaDiariaCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaDiariaCaja() {
		return this.jComboBoxTiposAccionesCajaDiariaCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaDiariaCaja(
			JComboBox jComboBoxTiposRelacionesCajaDiariaCaja) {
		this.jComboBoxTiposRelacionesCajaDiariaCaja = jComboBoxTiposRelacionesCajaDiariaCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaDiariaCaja(
			JComboBox jComboBoxTiposAccionesCajaDiariaCaja) {
		this.jComboBoxTiposAccionesCajaDiariaCaja = jComboBoxTiposAccionesCajaDiariaCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCajaDiariaCaja() {
		return this.jComboBoxTiposAccionesFormularioCajaDiariaCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCajaDiariaCaja(
			JComboBox jComboBoxTiposAccionesFormularioCajaDiariaCaja) {
		this.jComboBoxTiposAccionesFormularioCajaDiariaCaja = jComboBoxTiposAccionesFormularioCajaDiariaCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cajadiariacajaSessionBean=new CajaDiariaCajaSessionBean();
		
		this.cajadiariacajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajadiariacajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajadiariacajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaDiariaCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaDiariaCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaDiariaCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Diaria Caja MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
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
	
		CajaDiariaCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCajaDiariaCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCajaDiariaCaja=new JButtonMe();
				this.jButtonModificarToolBarCajaDiariaCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCajaDiariaCaja,this.jTtoolBarDetalleCajaDiariaCaja,
							"actualizar","actualizar","Actualizar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCajaDiariaCaja,this.jTtoolBarDetalleCajaDiariaCaja,
							"eliminar","eliminar","Eliminar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCajaDiariaCaja,this.jTtoolBarDetalleCajaDiariaCaja,
							"cancelar","cancelar","Cancelar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCajaDiariaCaja,this.jTtoolBarDetalleCajaDiariaCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCajaDiariaCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCajaDiariaCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCajaDiariaCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCajaDiariaCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCajaDiariaCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaDiariaCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaDiariaCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaDiariaCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCajaDiariaCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCajaDiariaCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCajaDiariaCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCajaDiariaCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCajaDiariaCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCajaDiariaCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCajaDiariaCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCajaDiariaCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCajaDiariaCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCajaDiariaCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCajaDiariaCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCajaDiariaCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCajaDiariaCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaDiariaCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaDiariaCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaDiariaCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaDiariaCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaDiariaCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCajaDiariaCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCajaDiariaCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCajaDiariaCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaDiariaCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaDiariaCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaDiariaCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaDiariaCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaDiariaCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaDiariaCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCajaDiariaCaja.add(this.jMenuItemDetalleCerrarCajaDiariaCaja);
		
		this.jmenuDetalleAccionesCajaDiariaCaja.add(this.jMenuItemActualizarCajaDiariaCaja);
		this.jmenuDetalleAccionesCajaDiariaCaja.add(this.jMenuItemEliminarCajaDiariaCaja);
		this.jmenuDetalleAccionesCajaDiariaCaja.add(this.jMenuItemCancelarCajaDiariaCaja);		
		
		//this.jmenuDetalleDatosCajaDiariaCaja.add(this.jMenuItemDetalleAbrirOrderByCajaDiariaCaja);				
		this.jmenuDetalleDatosCajaDiariaCaja.add(this.jMenuItemDetalleMostarOcultarCajaDiariaCaja);				
				
		//this.jmenuDetalleAccionesCajaDiariaCaja.add(this.jMenuItemGuardarCambiosCajaDiariaCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCajaDiariaCaja.add(this.jmenuDetalleArchivoCajaDiariaCaja);		
		this.jmenuBarDetalleCajaDiariaCaja.add(this.jmenuDetalleAccionesCajaDiariaCaja);		
		this.jmenuBarDetalleCajaDiariaCaja.add(this.jmenuDetalleDatosCajaDiariaCaja);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCajaDiariaCaja);				
	}
	
	
	public void inicializarElementosCamposCajaDiariaCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCajaDiariaCaja = new JLabelMe();
		jLabelIdCajaDiariaCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCajaDiariaCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCajaDiariaCaja= new GridBagLayout();

		this.jPanelidCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);

		jLabelidCajaDiariaCaja = new JLabel();
		jLabelidCajaDiariaCaja.setText("Id");

		jLabelidCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioCajaDiariaCaja = new JLabelMe();
		this.jLabelfecha_inicioCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioCajaDiariaCaja.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelfecha_inicioCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		//jFormattedTextFieldfecha_inicioCajaDiariaCaja= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioCajaDiariaCaja= new JDateChooser();
		jDateChooserfecha_inicioCajaDiariaCaja.setEnabled(false);
		jDateChooserfecha_inicioCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioCajaDiariaCaja.setDate(new Date());
		jDateChooserfecha_inicioCajaDiariaCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioCajaDiariaCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonfecha_inicioCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioCajaDiariaCajaBusqueda.setText("U");
		this.jButtonfecha_inicioCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finCajaDiariaCaja = new JLabelMe();
		this.jLabelfecha_finCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finCajaDiariaCaja.setToolTipText("Fecha Fin");
		this.jLabelfecha_finCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelfecha_finCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		//jFormattedTextFieldfecha_finCajaDiariaCaja= new JFormattedTextFieldMe();

		jDateChooserfecha_finCajaDiariaCaja= new JDateChooser();
		jDateChooserfecha_finCajaDiariaCaja.setEnabled(false);
		jDateChooserfecha_finCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finCajaDiariaCaja.setDate(new Date());
		jDateChooserfecha_finCajaDiariaCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finCajaDiariaCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonfecha_finCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finCajaDiariaCajaBusqueda.setText("U");
		this.jButtonfecha_finCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cajaCajaDiariaCaja = new JLabelMe();
		this.jLabelnombre_cajaCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA+" : *");
		this.jLabelnombre_cajaCajaDiariaCaja.setToolTipText("Nombre Caja");
		this.jLabelnombre_cajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cajaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cajaCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cajaCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelnombre_cajaCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextAreanombre_cajaCajaDiariaCaja= new JTextAreaMe();
		jTextAreanombre_cajaCajaDiariaCaja.setEnabled(false);
		jTextAreanombre_cajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaCajaDiariaCaja.setLineWrap(true);
		jTextAreanombre_cajaCajaDiariaCaja.setWrapStyleWord(true);
		jTextAreanombre_cajaCajaDiariaCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cajaCajaDiariaCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cajaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cajaCajaDiariaCaja = new JScrollPane(jTextAreanombre_cajaCajaDiariaCaja);
		jscrollPanenombre_cajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cajaCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonnombre_cajaCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cajaCajaDiariaCajaBusqueda.setText("U");
		this.jButtonnombre_cajaCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cajaCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cajaCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cajaCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cajaCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cajaCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cajaCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialCajaDiariaCaja = new JLabelMe();
		this.jLabelsecuencialCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialCajaDiariaCaja.setToolTipText("Secuencial");
		this.jLabelsecuencialCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelsecuencialCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextFieldsecuencialCajaDiariaCaja= new JTextFieldMe();

		jTextFieldsecuencialCajaDiariaCaja.setEnabled(false);
		jTextFieldsecuencialCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonsecuencialCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialCajaDiariaCajaBusqueda.setText("U");
		this.jButtonsecuencialCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_clienteCajaDiariaCaja = new JLabelMe();
		this.jLabelcodigo_clienteCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE+" : *");
		this.jLabelcodigo_clienteCajaDiariaCaja.setToolTipText("Codigo Cliente");
		this.jLabelcodigo_clienteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_clienteCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_clienteCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_clienteCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelcodigo_clienteCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextFieldcodigo_clienteCajaDiariaCaja= new JTextFieldMe();

		jTextFieldcodigo_clienteCajaDiariaCaja.setEnabled(false);
		jTextFieldcodigo_clienteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_clienteCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_clienteCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtoncodigo_clienteCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_clienteCajaDiariaCajaBusqueda.setText("U");
		this.jButtoncodigo_clienteCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_clienteCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_clienteCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_clienteCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_clienteCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_clienteCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_clienteCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteCajaDiariaCaja = new JLabelMe();
		this.jLabelnombre_clienteCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteCajaDiariaCaja.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelnombre_clienteCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextAreanombre_clienteCajaDiariaCaja= new JTextAreaMe();
		jTextAreanombre_clienteCajaDiariaCaja.setEnabled(false);
		jTextAreanombre_clienteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteCajaDiariaCaja.setLineWrap(true);
		jTextAreanombre_clienteCajaDiariaCaja.setWrapStyleWord(true);
		jTextAreanombre_clienteCajaDiariaCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteCajaDiariaCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteCajaDiariaCaja = new JScrollPane(jTextAreanombre_clienteCajaDiariaCaja);
		jscrollPanenombre_clienteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonnombre_clienteCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteCajaDiariaCajaBusqueda.setText("U");
		this.jButtonnombre_clienteCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalCajaDiariaCaja = new JLabelMe();
		this.jLabelsubtotalCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalCajaDiariaCaja.setToolTipText("Subtotal");
		this.jLabelsubtotalCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelsubtotalCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextFieldsubtotalCajaDiariaCaja= new JTextFieldMe();
		jTextFieldsubtotalCajaDiariaCaja.setEnabled(false);
		jTextFieldsubtotalCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalCajaDiariaCaja.setText("0.0");

		this.jButtonsubtotalCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonsubtotalCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalCajaDiariaCajaBusqueda.setText("U");
		this.jButtonsubtotalCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabelivaCajaDiariaCaja = new JLabelMe();
		this.jLabelivaCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaCajaDiariaCaja.setToolTipText("Iva");
		this.jLabelivaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelivaCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextFieldivaCajaDiariaCaja= new JTextFieldMe();
		jTextFieldivaCajaDiariaCaja.setEnabled(false);
		jTextFieldivaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaCajaDiariaCaja.setText("0.0");

		this.jButtonivaCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonivaCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaCajaDiariaCajaBusqueda.setText("U");
		this.jButtonivaCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoCajaDiariaCaja = new JLabelMe();
		this.jLabeldescuentoCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoCajaDiariaCaja.setToolTipText("Descuento");
		this.jLabeldescuentoCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPaneldescuentoCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextFielddescuentoCajaDiariaCaja= new JTextFieldMe();
		jTextFielddescuentoCajaDiariaCaja.setEnabled(false);
		jTextFielddescuentoCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoCajaDiariaCaja.setText("0.0");

		this.jButtondescuentoCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtondescuentoCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoCajaDiariaCajaBusqueda.setText("U");
		this.jButtondescuentoCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoCajaDiariaCaja = new JLabelMe();
		this.jLabelfinanciamientoCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoCajaDiariaCaja.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelfinanciamientoCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextFieldfinanciamientoCajaDiariaCaja= new JTextFieldMe();
		jTextFieldfinanciamientoCajaDiariaCaja.setEnabled(false);
		jTextFieldfinanciamientoCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoCajaDiariaCaja.setText("0.0");

		this.jButtonfinanciamientoCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonfinanciamientoCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoCajaDiariaCajaBusqueda.setText("U");
		this.jButtonfinanciamientoCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabelfleteCajaDiariaCaja = new JLabelMe();
		this.jLabelfleteCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteCajaDiariaCaja.setToolTipText("Flete");
		this.jLabelfleteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelfleteCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextFieldfleteCajaDiariaCaja= new JTextFieldMe();
		jTextFieldfleteCajaDiariaCaja.setEnabled(false);
		jTextFieldfleteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteCajaDiariaCaja.setText("0.0");

		this.jButtonfleteCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonfleteCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteCajaDiariaCajaBusqueda.setText("U");
		this.jButtonfleteCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabeliceCajaDiariaCaja = new JLabelMe();
		this.jLabeliceCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceCajaDiariaCaja.setToolTipText("Ice");
		this.jLabeliceCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPaneliceCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextFieldiceCajaDiariaCaja= new JTextFieldMe();
		jTextFieldiceCajaDiariaCaja.setEnabled(false);
		jTextFieldiceCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceCajaDiariaCaja.setText("0.0");

		this.jButtoniceCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtoniceCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceCajaDiariaCajaBusqueda.setText("U");
		this.jButtoniceCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceCajaDiariaCajaBusqueda.setVisible(false);		}


					
		this.jLabeltotalCajaDiariaCaja = new JLabelMe();
		this.jLabeltotalCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalCajaDiariaCaja.setToolTipText("Total");
		this.jLabeltotalCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPaneltotalCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jTextFieldtotalCajaDiariaCaja= new JTextFieldMe();
		jTextFieldtotalCajaDiariaCaja.setEnabled(false);
		jTextFieldtotalCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalCajaDiariaCaja.setText("0.0");

		this.jButtontotalCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtontotalCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalCajaDiariaCajaBusqueda.setText("U");
		this.jButtontotalCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalCajaDiariaCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCajaDiariaCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCajaDiariaCaja = new JLabelMe();
		this.jLabelid_empresaCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCajaDiariaCaja.setToolTipText("Empresa");
		this.jLabelid_empresaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelid_empresaCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jComboBoxid_empresaCajaDiariaCaja= new JComboBoxMe();
		jComboBoxid_empresaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCajaDiariaCaja.setEnabled(false);

		this.jButtonid_empresaCajaDiariaCaja= new JButtonMe();
		this.jButtonid_empresaCajaDiariaCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaDiariaCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaDiariaCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaDiariaCaja.setText("Buscar");
		this.jButtonid_empresaCajaDiariaCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCajaDiariaCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaDiariaCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaDiariaCaja"));

		this.jButtonid_empresaCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaDiariaCajaBusqueda.setText("U");
		this.jButtonid_empresaCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCajaDiariaCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaCajaDiariaCajaUpdate= new JButtonMe();
		this.jButtonid_empresaCajaDiariaCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaDiariaCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaDiariaCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaDiariaCajaUpdate.setText("U");
		this.jButtonid_empresaCajaDiariaCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCajaDiariaCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaDiariaCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaDiariaCajaUpdate"));



					
		this.jLabelid_cajaCajaDiariaCaja = new JLabelMe();
		this.jLabelid_cajaCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaCajaDiariaCaja.setToolTipText("Caja");
		this.jLabelid_cajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelid_cajaCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jComboBoxid_cajaCajaDiariaCaja= new JComboBoxMe();
		jComboBoxid_cajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cajaCajaDiariaCaja.setEnabled(false);

		this.jButtonid_cajaCajaDiariaCaja= new JButtonMe();
		this.jButtonid_cajaCajaDiariaCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaDiariaCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaDiariaCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaDiariaCaja.setText("Buscar");
		this.jButtonid_cajaCajaDiariaCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaCajaDiariaCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaDiariaCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaDiariaCaja"));

		this.jButtonid_cajaCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonid_cajaCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajaDiariaCajaBusqueda.setText("U");
		this.jButtonid_cajaCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaCajaDiariaCajaBusqueda.setVisible(false);		}

		this.jButtonid_cajaCajaDiariaCajaUpdate= new JButtonMe();
		this.jButtonid_cajaCajaDiariaCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaDiariaCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaDiariaCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajaDiariaCajaUpdate.setText("U");
		this.jButtonid_cajaCajaDiariaCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaCajaDiariaCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaDiariaCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaDiariaCajaUpdate"));



					
		this.jLabelid_clienteCajaDiariaCaja = new JLabelMe();
		this.jLabelid_clienteCajaDiariaCaja.setText(""+CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteCajaDiariaCaja.setToolTipText("Cliente");
		this.jLabelid_clienteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteCajaDiariaCaja.setToolTipText(CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		this.jPanelid_clienteCajaDiariaCaja.setLayout(this.gridaBagLayoutCajaDiariaCaja);


		jComboBoxid_clienteCajaDiariaCaja= new JComboBoxMe();
		jComboBoxid_clienteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_clienteCajaDiariaCaja.setEnabled(false);

		this.jButtonid_clienteCajaDiariaCaja= new JButtonMe();
		this.jButtonid_clienteCajaDiariaCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaDiariaCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaDiariaCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaDiariaCaja.setText("Buscar");
		this.jButtonid_clienteCajaDiariaCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteCajaDiariaCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaDiariaCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaDiariaCaja"));

		this.jButtonid_clienteCajaDiariaCajaBusqueda= new JButtonMe();
		this.jButtonid_clienteCajaDiariaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaDiariaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaDiariaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCajaDiariaCajaBusqueda.setText("U");
		this.jButtonid_clienteCajaDiariaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteCajaDiariaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaDiariaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaDiariaCajaBusqueda"));

		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteCajaDiariaCajaBusqueda.setVisible(false);		}

		this.jButtonid_clienteCajaDiariaCajaUpdate= new JButtonMe();
		this.jButtonid_clienteCajaDiariaCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaDiariaCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaDiariaCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCajaDiariaCajaUpdate.setText("U");
		this.jButtonid_clienteCajaDiariaCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteCajaDiariaCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaDiariaCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaDiariaCajaUpdate"));



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
		//this.jInternalFrameDetalleCajaDiariaCaja = new CajaDiariaCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Caja Diaria Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaDiariaCaja= new GridBagLayout();
		

		
		String sToolTipCajaDiariaCaja="";
		sToolTipCajaDiariaCaja=CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaDiariaCaja+="(PuntoVenta.CajaDiariaCaja)";
		}
		
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaDiariaCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCajaDiariaCaja = new JButtonMe();
		this.jButtonModificarCajaDiariaCaja = new JButtonMe();
        this.jButtonActualizarCajaDiariaCaja = new JButtonMe();
        this.jButtonEliminarCajaDiariaCaja = new JButtonMe();
        this.jButtonCancelarCajaDiariaCaja = new JButtonMe();
        this.jButtonGuardarCambiosCajaDiariaCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaCajaDiariaCaja = new JButtonMe();
		this.jButtonCerrarCajaDiariaCaja = new JButtonMe();
		
		this.jScrollPanelDatosCajaDiariaCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionCajaDiariaCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralCajaDiariaCaja = new JScrollPane();
				
		
		
		this.jPanelCamposCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Diaria Caja";
		
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaDiariaCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCajaDiariaCaja.setName("jPanelCamposCajaDiariaCaja"); 

		this.jPanelCamposOcultosCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCajaDiariaCaja.setName("jPanelCamposOcultosCajaDiariaCaja"); 

        this.jPanelAccionesCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaDiariaCaja.setToolTipText("Acciones");
        this.jPanelAccionesCajaDiariaCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCajaDiariaCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCajaDiariaCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCajaDiariaCaja.setText("Nuevo");
		this.jButtonModificarCajaDiariaCaja.setText("Editar");
        this.jButtonActualizarCajaDiariaCaja.setText("Actualizar");
        this.jButtonEliminarCajaDiariaCaja.setText("Eliminar");
        this.jButtonCancelarCajaDiariaCaja.setText("Cancelar");
        this.jButtonGuardarCambiosCajaDiariaCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaCajaDiariaCaja.setText("Guardar");
		this.jButtonCerrarCajaDiariaCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaDiariaCaja,"nuevo_button","Nuevo",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCajaDiariaCaja,"modificar_button","Editar",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCajaDiariaCaja,"actualizar_button","Actualizar",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCajaDiariaCaja,"eliminar_button","Eliminar",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCajaDiariaCaja,"cancelar_button","Cancelar",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCajaDiariaCaja,"guardarcambios_button","Guardar",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaDiariaCaja,"guardarcambiostabla_button","Guardar",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaDiariaCaja,"cerrar_button","Salir",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCajaDiariaCaja.setToolTipText("Nuevo"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCajaDiariaCaja.setToolTipText("Editar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCajaDiariaCaja.setToolTipText("Actualizar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCajaDiariaCaja.setToolTipText("Eliminar)"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCajaDiariaCaja.setToolTipText("Cancelar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCajaDiariaCaja.setToolTipText("Guardar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCajaDiariaCaja.setToolTipText("Guardar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaDiariaCaja.setToolTipText("Salir"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaDiariaCaja";
		inputMap = this.jButtonNuevoCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaDiariaCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaDiariaCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCajaDiariaCaja";
		inputMap = this.jButtonActualizarCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCajaDiariaCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarCajaDiariaCaja";
		inputMap = this.jButtonEliminarCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCajaDiariaCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarCajaDiariaCaja";
		inputMap = this.jButtonCancelarCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCajaDiariaCaja"));
		
		//CERRAR		
		sMapKey = "CerrarCajaDiariaCaja";
		inputMap = this.jButtonCerrarCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaDiariaCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaDiariaCaja";
		inputMap = this.jButtonGuardarCambiosTablaCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaDiariaCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCajaDiariaCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCajaDiariaCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCajaDiariaCaja.setToolTipText("Nuevo CajaDiariaCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCajaDiariaCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCajaDiariaCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCajaDiariaCaja.setToolTipText("Sin Cerrar Ventana CajaDiariaCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCajaDiariaCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCajaDiariaCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCajaDiariaCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaDiariaCaja.setText("Accion");
		this.jComboBoxTiposAccionesCajaDiariaCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCajaDiariaCaja = new JLabelMe();
		
		this.jLabelAccionesCajaDiariaCaja.setText("Acciones");		
		this.jLabelAccionesCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCajaDiariaCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCajaDiariaCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCajaDiariaCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCajaDiariaCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaDiariaCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaDiariaCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCajaDiariaCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCajaDiariaCaja = new GridBagLayout();
		
		this.jPanelCamposCajaDiariaCaja.setLayout(gridaBagLayoutCamposCajaDiariaCaja);
		this.jPanelCamposOcultosCajaDiariaCaja.setLayout(gridaBagLayoutCamposOcultosCajaDiariaCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCajaDiariaCaja.add(jLabelIdCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCajaDiariaCaja.add(jLabelidCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCajaDiariaCaja.add(jLabelid_empresaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaDiariaCaja.add(jButtonid_empresaCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 3;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaDiariaCaja.add(jButtonid_empresaCajaDiariaCajaUpdate, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCajaDiariaCaja.add(jComboBoxid_empresaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaCajaDiariaCaja.add(jLabelid_cajaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajaDiariaCaja.add(jButtonid_cajaCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 3;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajaDiariaCaja.add(jButtonid_cajaCajaDiariaCajaUpdate, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaCajaDiariaCaja.add(jComboBoxid_cajaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteCajaDiariaCaja.add(jLabelid_clienteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteCajaDiariaCaja.add(jButtonid_clienteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 3;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCajaDiariaCaja.add(jButtonid_clienteCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 4;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCajaDiariaCaja.add(jButtonid_clienteCajaDiariaCajaUpdate, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteCajaDiariaCaja.add(jComboBoxid_clienteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioCajaDiariaCaja.add(jLabelfecha_inicioCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioCajaDiariaCaja.add(jButtonfecha_inicioCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioCajaDiariaCaja.add(jDateChooserfecha_inicioCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finCajaDiariaCaja.add(jLabelfecha_finCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finCajaDiariaCaja.add(jButtonfecha_finCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finCajaDiariaCaja.add(jDateChooserfecha_finCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cajaCajaDiariaCaja.add(jLabelnombre_cajaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cajaCajaDiariaCaja.add(jButtonnombre_cajaCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cajaCajaDiariaCaja.add(jscrollPanenombre_cajaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialCajaDiariaCaja.add(jLabelsecuencialCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialCajaDiariaCaja.add(jButtonsecuencialCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialCajaDiariaCaja.add(jTextFieldsecuencialCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_clienteCajaDiariaCaja.add(jLabelcodigo_clienteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_clienteCajaDiariaCaja.add(jButtoncodigo_clienteCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_clienteCajaDiariaCaja.add(jTextFieldcodigo_clienteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteCajaDiariaCaja.add(jLabelnombre_clienteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteCajaDiariaCaja.add(jButtonnombre_clienteCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteCajaDiariaCaja.add(jscrollPanenombre_clienteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalCajaDiariaCaja.add(jLabelsubtotalCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalCajaDiariaCaja.add(jButtonsubtotalCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalCajaDiariaCaja.add(jTextFieldsubtotalCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaCajaDiariaCaja.add(jLabelivaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaCajaDiariaCaja.add(jButtonivaCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaCajaDiariaCaja.add(jTextFieldivaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoCajaDiariaCaja.add(jLabeldescuentoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoCajaDiariaCaja.add(jButtondescuentoCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoCajaDiariaCaja.add(jTextFielddescuentoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoCajaDiariaCaja.add(jLabelfinanciamientoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoCajaDiariaCaja.add(jButtonfinanciamientoCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoCajaDiariaCaja.add(jTextFieldfinanciamientoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteCajaDiariaCaja.add(jLabelfleteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteCajaDiariaCaja.add(jButtonfleteCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteCajaDiariaCaja.add(jTextFieldfleteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceCajaDiariaCaja.add(jLabeliceCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceCajaDiariaCaja.add(jButtoniceCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceCajaDiariaCaja.add(jTextFieldiceCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalCajaDiariaCaja.add(jLabeltotalCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 2;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
		this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalCajaDiariaCaja.add(jButtontotalCajaDiariaCajaBusqueda, this.gridBagConstraintsCajaDiariaCaja);
	}

	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
	this.gridBagConstraintsCajaDiariaCaja.gridx = 1;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalCajaDiariaCaja.add(jTextFieldtotalCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelidCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelfecha_inicioCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelfecha_finCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelnombre_cajaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelsecuencialCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelcodigo_clienteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelnombre_clienteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelsubtotalCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelivaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPaneldescuentoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelfinanciamientoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPanelfleteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPaneliceCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaCaja.add(this.jPaneltotalCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposCajaDiariaCaja % 2==0) {
		iXPanelCamposCajaDiariaCaja=0;
		iYPanelCamposCajaDiariaCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposOcultosCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposOcultosCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaDiariaCaja.add(this.jPanelid_empresaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposOcultosCajaDiariaCaja % 2==0) {
		iXPanelCamposOcultosCajaDiariaCaja=0;
		iYPanelCamposOcultosCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposOcultosCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposOcultosCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaDiariaCaja.add(this.jPanelid_cajaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposOcultosCajaDiariaCaja % 2==0) {
		iXPanelCamposOcultosCajaDiariaCaja=0;
		iYPanelCamposOcultosCajaDiariaCaja++;
	}
	this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaCaja.gridy = iYPanelCamposOcultosCajaDiariaCaja;
	this.gridBagConstraintsCajaDiariaCaja.gridx = iXPanelCamposOcultosCajaDiariaCaja++;
	this.gridBagConstraintsCajaDiariaCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaDiariaCaja.add(this.jPanelid_clienteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);



	if(iXPanelCamposOcultosCajaDiariaCaja % 2==0) {
		iXPanelCamposOcultosCajaDiariaCaja=0;
		iYPanelCamposOcultosCajaDiariaCaja++;
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
			
		GridBagLayout gridaBagLayoutAccionesCajaDiariaCaja= new GridBagLayout();
		this.jPanelAccionesCajaDiariaCaja.setLayout(gridaBagLayoutAccionesCajaDiariaCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCajaDiariaCaja= new GridBagLayout();
		this.jPanelAccionesFormularioCajaDiariaCaja.setLayout(gridaBagLayoutAccionesFormularioCajaDiariaCaja);
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaDiariaCaja.add(this.jComboBoxTiposAccionesFormularioCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesCajaDiariaCaja.add(this.jButtonModificarCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);							

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesCajaDiariaCaja.add(this.jButtonEliminarCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
			
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaDiariaCaja.add(this.jButtonActualizarCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaDiariaCaja.add(this.jButtonGuardarCambiosCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);	
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;		
		this.gridBagConstraintsCajaDiariaCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesCajaDiariaCaja.add(this.jButtonCancelarCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaDiariaCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();						
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaDiariaCaja.gridx = 0;		
			//this.gridBagConstraintsCajaDiariaCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaDiariaCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaDiariaCaja.gridx =0;
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaDiariaCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CajaDiariaCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCajaDiariaCaja = new CajaDiariaCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Caja Diaria Caja DATOS");
			
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
			
	        //this.setTitle("[FOR] - Caja Diaria Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Diaria Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CajaDiariaCajaModel cajadiariacajaModel=new CajaDiariaCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//CajaDiariaCajaModel.CajaDiariaCajaFocusTraversalPolicy cajadiariacajaFocusTraversalPolicy = cajadiariacajaModel.new CajaDiariaCajaFocusTraversalPolicy(this);
			
			//cajadiariacajaFocusTraversalPolicy.setcajadiariacajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cajadiariacajaModel);
			
			
			this.jContentPaneDetalleCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCajaDiariaCaja = new GridBagLayout();	
			this.jContentPaneDetalleCajaDiariaCaja.setLayout(gridaBagLayoutDetalleCajaDiariaCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaDiariaCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
				this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
					
				
				this.jContentPaneDetalleCajaDiariaCaja.add(jTtoolBarDetalleCajaDiariaCaja, gridBagConstraintsCajaDiariaCaja);								
				
}
			
			this.jScrollPanelDatosEdicionCajaDiariaCaja=   new JScrollPane(jContentPaneDetalleCajaDiariaCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaDiariaCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaDiariaCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaDiariaCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCajaDiariaCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaDiariaCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaDiariaCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaDiariaCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	        
			this.jContentPaneDetalleCajaDiariaCaja.add(jPanelCamposCajaDiariaCaja, gridBagConstraintsCajaDiariaCaja);
			
			
			
			
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
						//&& cajadiariacajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cajadiariacajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCajaDiariaCaja= new GridBagConstraints();
						this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
						this.jContentPaneDetalleCajaDiariaCaja.add(this.jTabbedPaneRelacionesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCajaDiariaCaja.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCajaDiariaCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
					this.gridBagConstraintsCajaDiariaCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
					
				
					this.jContentPaneDetalleCajaDiariaCaja.add(jPanelCamposOcultosCajaDiariaCaja, gridBagConstraintsCajaDiariaCaja);
				
					this.jPanelCamposOcultosCajaDiariaCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	        this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCajaDiariaCaja.add(this.jPanelAccionesFormularioCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);							
			
			
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
	        this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleCajaDiariaCaja.add(this.jPanelAccionesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCajaDiariaCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCajaDiariaCaja=   new JScrollPane(this.jPanelCamposCajaDiariaCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaDiariaCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaDiariaCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaDiariaCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCajaDiariaCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);			
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			
			
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
			
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCajaDiariaCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionCajaDiariaCaja;
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
