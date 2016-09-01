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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.puntoventa.util.report.CajaDiariaUsuarioConstantesFunciones;

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
public class CajaDiariaUsuarioDetalleFormJInternalFrame extends CajaDiariaUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCajaDiariaUsuario;
	
	protected JMenuBar jmenuBarDetalleCajaDiariaUsuario;
	
	protected JMenu jmenuDetalleCajaDiariaUsuario;
	protected JMenu jmenuDetalleArchivoCajaDiariaUsuario;
	protected JMenu jmenuDetalleAccionesCajaDiariaUsuario;
	protected JMenu jmenuDetalleDatosCajaDiariaUsuario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaDiariaUsuario;	
	protected GridBagConstraints gridBagConstraintsCajaDiariaUsuario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CajaDiariaUsuarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleCajaDiariaUsuario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public CajaDiariaUsuarioSessionBean cajadiariausuarioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CajaSessionBean cajaSessionBean;
	public UsuarioSessionBean usuarioSessionBean;	
	
	public CajaDiariaUsuarioLogic cajadiariausuarioLogic;
	
	public JScrollPane jScrollPanelDatosCajaDiariaUsuario;
	public JScrollPane jScrollPanelDatosEdicionCajaDiariaUsuario;
	public JScrollPane jScrollPanelDatosGeneralCajaDiariaUsuario;
	
	protected JPanel jPanelCamposCajaDiariaUsuario;    
	protected JPanel jPanelCamposOcultosCajaDiariaUsuario;    	
	protected JPanel jPanelAccionesCajaDiariaUsuario;
	protected JPanel jPanelAccionesFormularioCajaDiariaUsuario;
    
	
	
	protected Integer iXPanelCamposCajaDiariaUsuario=0;
	protected Integer iYPanelCamposCajaDiariaUsuario=0;
	
	protected Integer iXPanelCamposOcultosCajaDiariaUsuario=0;
	protected Integer iYPanelCamposOcultosCajaDiariaUsuario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCajaDiariaUsuario;
	public JButton jButtonModificarCajaDiariaUsuario;
	public JButton jButtonActualizarCajaDiariaUsuario;
    public JButton jButtonEliminarCajaDiariaUsuario;
	public JButton jButtonCancelarCajaDiariaUsuario;
    public JButton jButtonGuardarCambiosCajaDiariaUsuario;
	public JButton jButtonGuardarCambiosTablaCajaDiariaUsuario;
	protected JButton jButtonCerrarCajaDiariaUsuario;
	
	
	protected JButton jButtonProcesarInformacionCajaDiariaUsuario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCajaDiariaUsuario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCajaDiariaUsuario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCajaDiariaUsuario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaDiariaUsuario;
	protected JButton jButtonModificarToolBarCajaDiariaUsuario;
	protected JButton jButtonActualizarToolBarCajaDiariaUsuario;
    protected JButton jButtonEliminarToolBarCajaDiariaUsuario;
	protected JButton jButtonCancelarToolBarCajaDiariaUsuario;
    protected JButton jButtonGuardarCambiosToolBarCajaDiariaUsuario;
	protected JButton jButtonGuardarCambiosTablaToolBarCajaDiariaUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaDiariaUsuario;
	protected JButton jButtonCerrarToolBarCajaDiariaUsuario;
	
	protected JButton jButtonProcesarInformacionToolBarCajaDiariaUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaDiariaUsuario;
	protected JMenuItem jMenuItemModificarCajaDiariaUsuario;
	protected JMenuItem jMenuItemActualizarCajaDiariaUsuario;
    protected JMenuItem jMenuItemEliminarCajaDiariaUsuario;
	protected JMenuItem jMenuItemCancelarCajaDiariaUsuario;
    protected JMenuItem jMenuItemGuardarCambiosCajaDiariaUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaDiariaUsuario;
	protected JMenuItem jMenuItemCerrarCajaDiariaUsuario;
	protected JMenuItem jMenuItemDetalleCerrarCajaDiariaUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaDiariaUsuario;
	
	protected JMenuItem jMenuItemProcesarInformacionCajaDiariaUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaDiariaUsuario;
	protected JMenuItem jMenuItemMostrarOcultarCajaDiariaUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaDiariaUsuario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaDiariaUsuario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCajaDiariaUsuario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCajaDiariaUsuario;
	public JLabel jLabelIdCajaDiariaUsuario;
	public JLabel jLabelidCajaDiariaUsuario;
	public JButton jButtonidCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioCajaDiariaUsuario;
	public JLabel jLabelfecha_inicioCajaDiariaUsuario;
	//public JFormattedTextField jDateChooserfecha_inicioCajaDiariaUsuario;

	public JDateChooser jDateChooserfecha_inicioCajaDiariaUsuario;
	public JButton jButtonfecha_inicioCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finCajaDiariaUsuario;
	public JLabel jLabelfecha_finCajaDiariaUsuario;
	//public JFormattedTextField jDateChooserfecha_finCajaDiariaUsuario;

	public JDateChooser jDateChooserfecha_finCajaDiariaUsuario;
	public JButton jButtonfecha_finCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cajaCajaDiariaUsuario;
	public JLabel jLabelnombre_cajaCajaDiariaUsuario;
	public JTextArea jTextAreanombre_cajaCajaDiariaUsuario;
	public JScrollPane jscrollPanenombre_cajaCajaDiariaUsuario;
	public JButton jButtonnombre_cajaCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnombre_usuarioCajaDiariaUsuario;
	public JLabel jLabelnombre_usuarioCajaDiariaUsuario;
	public JTextField jTextFieldnombre_usuarioCajaDiariaUsuario;
	public JButton jButtonnombre_usuarioCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialCajaDiariaUsuario;
	public JLabel jLabelsecuencialCajaDiariaUsuario;
	public JTextField jTextFieldsecuencialCajaDiariaUsuario;
	public JButton jButtonsecuencialCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_clienteCajaDiariaUsuario;
	public JLabel jLabelcodigo_clienteCajaDiariaUsuario;
	public JTextField jTextFieldcodigo_clienteCajaDiariaUsuario;
	public JButton jButtoncodigo_clienteCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteCajaDiariaUsuario;
	public JLabel jLabelnombre_clienteCajaDiariaUsuario;
	public JTextArea jTextAreanombre_clienteCajaDiariaUsuario;
	public JScrollPane jscrollPanenombre_clienteCajaDiariaUsuario;
	public JButton jButtonnombre_clienteCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalCajaDiariaUsuario;
	public JLabel jLabelsubtotalCajaDiariaUsuario;
	public JTextField jTextFieldsubtotalCajaDiariaUsuario;
	public JButton jButtonsubtotalCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelivaCajaDiariaUsuario;
	public JLabel jLabelivaCajaDiariaUsuario;
	public JTextField jTextFieldivaCajaDiariaUsuario;
	public JButton jButtonivaCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoCajaDiariaUsuario;
	public JLabel jLabeldescuentoCajaDiariaUsuario;
	public JTextField jTextFielddescuentoCajaDiariaUsuario;
	public JButton jButtondescuentoCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoCajaDiariaUsuario;
	public JLabel jLabelfinanciamientoCajaDiariaUsuario;
	public JTextField jTextFieldfinanciamientoCajaDiariaUsuario;
	public JButton jButtonfinanciamientoCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfleteCajaDiariaUsuario;
	public JLabel jLabelfleteCajaDiariaUsuario;
	public JTextField jTextFieldfleteCajaDiariaUsuario;
	public JButton jButtonfleteCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPaneliceCajaDiariaUsuario;
	public JLabel jLabeliceCajaDiariaUsuario;
	public JTextField jTextFieldiceCajaDiariaUsuario;
	public JButton jButtoniceCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPaneltotalCajaDiariaUsuario;
	public JLabel jLabeltotalCajaDiariaUsuario;
	public JTextField jTextFieldtotalCajaDiariaUsuario;
	public JButton jButtontotalCajaDiariaUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCajaDiariaUsuario;
	public JLabel jLabelid_empresaCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCajaDiariaUsuario;
	public JButton jButtonid_empresaCajaDiariaUsuario= new JButtonMe();
	public JButton jButtonid_empresaCajaDiariaUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_empresaCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteCajaDiariaUsuario;
	public JLabel jLabelid_clienteCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteCajaDiariaUsuario;
	public JButton jButtonid_clienteCajaDiariaUsuario= new JButtonMe();
	public JButton jButtonid_clienteCajaDiariaUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_clienteCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaCajaDiariaUsuario;
	public JLabel jLabelid_cajaCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaCajaDiariaUsuario;
	public JButton jButtonid_cajaCajaDiariaUsuario= new JButtonMe();
	public JButton jButtonid_cajaCajaDiariaUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_cajaCajaDiariaUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioCajaDiariaUsuario;
	public JLabel jLabelid_usuarioCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioCajaDiariaUsuario;
	public JButton jButtonid_usuarioCajaDiariaUsuario= new JButtonMe();
	public JButton jButtonid_usuarioCajaDiariaUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioCajaDiariaUsuarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCajaDiariaUsuario;
	
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
	public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CajaDiariaUsuarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCajaDiariaUsuario=new JPanel();
				this.jPanelAccionesFormularioCajaDiariaUsuario=new JPanel();
				this.jmenuBarDetalleCajaDiariaUsuario=new JMenuBar();
				this.jTtoolBarDetalleCajaDiariaUsuario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaUsuarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CajaDiariaUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CajaDiariaUsuarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CajaDiariaUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaUsuarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaDiariaUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaUsuarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaDiariaUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaUsuarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaDiariaUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCajaDiariaUsuario() {
		return this.jButtonActualizarToolBarCajaDiariaUsuario;
	}
	
	public JButton getjButtonEliminarToolBarCajaDiariaUsuario() {
		return this.jButtonEliminarToolBarCajaDiariaUsuario;
	}
	
	public JButton getjButtonCancelarToolBarCajaDiariaUsuario() {
		return this.jButtonCancelarToolBarCajaDiariaUsuario;
	}		
	
	public JButton getjButtonProcesarInformacionCajaDiariaUsuario() {
		return this.jButtonProcesarInformacionCajaDiariaUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaDiariaUsuario)	{
		this.jButtonProcesarInformacionCajaDiariaUsuario = jButtonProcesarInformacionCajaDiariaUsuario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaDiariaUsuario() {
		return this.jComboBoxTiposAccionesCajaDiariaUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaDiariaUsuario(
			JComboBox jComboBoxTiposRelacionesCajaDiariaUsuario) {
		this.jComboBoxTiposRelacionesCajaDiariaUsuario = jComboBoxTiposRelacionesCajaDiariaUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaDiariaUsuario(
			JComboBox jComboBoxTiposAccionesCajaDiariaUsuario) {
		this.jComboBoxTiposAccionesCajaDiariaUsuario = jComboBoxTiposAccionesCajaDiariaUsuario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCajaDiariaUsuario() {
		return this.jComboBoxTiposAccionesFormularioCajaDiariaUsuario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCajaDiariaUsuario(
			JComboBox jComboBoxTiposAccionesFormularioCajaDiariaUsuario) {
		this.jComboBoxTiposAccionesFormularioCajaDiariaUsuario = jComboBoxTiposAccionesFormularioCajaDiariaUsuario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean();
		
		this.cajadiariausuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajadiariausuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajadiariausuarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaDiariaUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaDiariaUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaDiariaUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Diaria Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
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
	
		CajaDiariaUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCajaDiariaUsuario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCajaDiariaUsuario=new JButtonMe();
				this.jButtonModificarToolBarCajaDiariaUsuario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCajaDiariaUsuario,this.jTtoolBarDetalleCajaDiariaUsuario,
							"actualizar","actualizar","Actualizar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCajaDiariaUsuario,this.jTtoolBarDetalleCajaDiariaUsuario,
							"eliminar","eliminar","Eliminar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCajaDiariaUsuario,this.jTtoolBarDetalleCajaDiariaUsuario,
							"cancelar","cancelar","Cancelar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCajaDiariaUsuario,this.jTtoolBarDetalleCajaDiariaUsuario,
							"guardarcambios","guardarcambios","Guardar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCajaDiariaUsuario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCajaDiariaUsuario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCajaDiariaUsuario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCajaDiariaUsuario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCajaDiariaUsuario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaDiariaUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaDiariaUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaDiariaUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCajaDiariaUsuario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCajaDiariaUsuario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCajaDiariaUsuario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCajaDiariaUsuario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCajaDiariaUsuario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCajaDiariaUsuario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCajaDiariaUsuario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCajaDiariaUsuario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCajaDiariaUsuario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCajaDiariaUsuario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCajaDiariaUsuario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCajaDiariaUsuario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCajaDiariaUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaDiariaUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaDiariaUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaDiariaUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaDiariaUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaDiariaUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCajaDiariaUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCajaDiariaUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCajaDiariaUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaDiariaUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaDiariaUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaDiariaUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaDiariaUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaDiariaUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaDiariaUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCajaDiariaUsuario.add(this.jMenuItemDetalleCerrarCajaDiariaUsuario);
		
		this.jmenuDetalleAccionesCajaDiariaUsuario.add(this.jMenuItemActualizarCajaDiariaUsuario);
		this.jmenuDetalleAccionesCajaDiariaUsuario.add(this.jMenuItemEliminarCajaDiariaUsuario);
		this.jmenuDetalleAccionesCajaDiariaUsuario.add(this.jMenuItemCancelarCajaDiariaUsuario);		
		
		//this.jmenuDetalleDatosCajaDiariaUsuario.add(this.jMenuItemDetalleAbrirOrderByCajaDiariaUsuario);				
		this.jmenuDetalleDatosCajaDiariaUsuario.add(this.jMenuItemDetalleMostarOcultarCajaDiariaUsuario);				
				
		//this.jmenuDetalleAccionesCajaDiariaUsuario.add(this.jMenuItemGuardarCambiosCajaDiariaUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCajaDiariaUsuario.add(this.jmenuDetalleArchivoCajaDiariaUsuario);		
		this.jmenuBarDetalleCajaDiariaUsuario.add(this.jmenuDetalleAccionesCajaDiariaUsuario);		
		this.jmenuBarDetalleCajaDiariaUsuario.add(this.jmenuDetalleDatosCajaDiariaUsuario);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCajaDiariaUsuario);				
	}
	
	
	public void inicializarElementosCamposCajaDiariaUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCajaDiariaUsuario = new JLabelMe();
		jLabelIdCajaDiariaUsuario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCajaDiariaUsuario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCajaDiariaUsuario= new GridBagLayout();

		this.jPanelidCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);

		jLabelidCajaDiariaUsuario = new JLabel();
		jLabelidCajaDiariaUsuario.setText("Id");

		jLabelidCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioCajaDiariaUsuario = new JLabelMe();
		this.jLabelfecha_inicioCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioCajaDiariaUsuario.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelfecha_inicioCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		//jFormattedTextFieldfecha_inicioCajaDiariaUsuario= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioCajaDiariaUsuario= new JDateChooser();
		jDateChooserfecha_inicioCajaDiariaUsuario.setEnabled(false);
		jDateChooserfecha_inicioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioCajaDiariaUsuario.setDate(new Date());
		jDateChooserfecha_inicioCajaDiariaUsuario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioCajaDiariaUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonfecha_inicioCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonfecha_inicioCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finCajaDiariaUsuario = new JLabelMe();
		this.jLabelfecha_finCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finCajaDiariaUsuario.setToolTipText("Fecha Fin");
		this.jLabelfecha_finCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelfecha_finCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		//jFormattedTextFieldfecha_finCajaDiariaUsuario= new JFormattedTextFieldMe();

		jDateChooserfecha_finCajaDiariaUsuario= new JDateChooser();
		jDateChooserfecha_finCajaDiariaUsuario.setEnabled(false);
		jDateChooserfecha_finCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finCajaDiariaUsuario.setDate(new Date());
		jDateChooserfecha_finCajaDiariaUsuario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finCajaDiariaUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonfecha_finCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonfecha_finCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cajaCajaDiariaUsuario = new JLabelMe();
		this.jLabelnombre_cajaCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA+" : *");
		this.jLabelnombre_cajaCajaDiariaUsuario.setToolTipText("Nombre Caja");
		this.jLabelnombre_cajaCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cajaCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cajaCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cajaCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelnombre_cajaCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextAreanombre_cajaCajaDiariaUsuario= new JTextAreaMe();
		jTextAreanombre_cajaCajaDiariaUsuario.setEnabled(false);
		jTextAreanombre_cajaCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaCajaDiariaUsuario.setLineWrap(true);
		jTextAreanombre_cajaCajaDiariaUsuario.setWrapStyleWord(true);
		jTextAreanombre_cajaCajaDiariaUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cajaCajaDiariaUsuario.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cajaCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cajaCajaDiariaUsuario = new JScrollPane(jTextAreanombre_cajaCajaDiariaUsuario);
		jscrollPanenombre_cajaCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cajaCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cajaCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cajaCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonnombre_cajaCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cajaCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonnombre_cajaCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cajaCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cajaCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cajaCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cajaCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cajaCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cajaCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelnombre_usuarioCajaDiariaUsuario = new JLabelMe();
		this.jLabelnombre_usuarioCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO+" : *");
		this.jLabelnombre_usuarioCajaDiariaUsuario.setToolTipText("Nombre Usuario");
		this.jLabelnombre_usuarioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_usuarioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_usuarioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_usuarioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_usuarioCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_usuarioCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelnombre_usuarioCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextFieldnombre_usuarioCajaDiariaUsuario= new JTextFieldMe();

		jTextFieldnombre_usuarioCajaDiariaUsuario.setEnabled(false);
		jTextFieldnombre_usuarioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_usuarioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_usuarioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_usuarioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_usuarioCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_usuarioCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_usuarioCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialCajaDiariaUsuario = new JLabelMe();
		this.jLabelsecuencialCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialCajaDiariaUsuario.setToolTipText("Secuencial");
		this.jLabelsecuencialCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelsecuencialCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextFieldsecuencialCajaDiariaUsuario= new JTextFieldMe();

		jTextFieldsecuencialCajaDiariaUsuario.setEnabled(false);
		jTextFieldsecuencialCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonsecuencialCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonsecuencialCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_clienteCajaDiariaUsuario = new JLabelMe();
		this.jLabelcodigo_clienteCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE+" : *");
		this.jLabelcodigo_clienteCajaDiariaUsuario.setToolTipText("Codigo Cliente");
		this.jLabelcodigo_clienteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_clienteCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_clienteCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_clienteCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelcodigo_clienteCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextFieldcodigo_clienteCajaDiariaUsuario= new JTextFieldMe();

		jTextFieldcodigo_clienteCajaDiariaUsuario.setEnabled(false);
		jTextFieldcodigo_clienteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_clienteCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_clienteCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_clienteCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_clienteCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteCajaDiariaUsuario = new JLabelMe();
		this.jLabelnombre_clienteCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteCajaDiariaUsuario.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelnombre_clienteCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextAreanombre_clienteCajaDiariaUsuario= new JTextAreaMe();
		jTextAreanombre_clienteCajaDiariaUsuario.setEnabled(false);
		jTextAreanombre_clienteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteCajaDiariaUsuario.setLineWrap(true);
		jTextAreanombre_clienteCajaDiariaUsuario.setWrapStyleWord(true);
		jTextAreanombre_clienteCajaDiariaUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteCajaDiariaUsuario.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteCajaDiariaUsuario = new JScrollPane(jTextAreanombre_clienteCajaDiariaUsuario);
		jscrollPanenombre_clienteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonnombre_clienteCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonnombre_clienteCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalCajaDiariaUsuario = new JLabelMe();
		this.jLabelsubtotalCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalCajaDiariaUsuario.setToolTipText("Subtotal");
		this.jLabelsubtotalCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelsubtotalCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextFieldsubtotalCajaDiariaUsuario= new JTextFieldMe();
		jTextFieldsubtotalCajaDiariaUsuario.setEnabled(false);
		jTextFieldsubtotalCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalCajaDiariaUsuario.setText("0.0");

		this.jButtonsubtotalCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonsubtotalCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonsubtotalCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelivaCajaDiariaUsuario = new JLabelMe();
		this.jLabelivaCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaCajaDiariaUsuario.setToolTipText("Iva");
		this.jLabelivaCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelivaCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextFieldivaCajaDiariaUsuario= new JTextFieldMe();
		jTextFieldivaCajaDiariaUsuario.setEnabled(false);
		jTextFieldivaCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaCajaDiariaUsuario.setText("0.0");

		this.jButtonivaCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonivaCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonivaCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoCajaDiariaUsuario = new JLabelMe();
		this.jLabeldescuentoCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoCajaDiariaUsuario.setToolTipText("Descuento");
		this.jLabeldescuentoCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPaneldescuentoCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextFielddescuentoCajaDiariaUsuario= new JTextFieldMe();
		jTextFielddescuentoCajaDiariaUsuario.setEnabled(false);
		jTextFielddescuentoCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoCajaDiariaUsuario.setText("0.0");

		this.jButtondescuentoCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtondescuentoCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtondescuentoCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoCajaDiariaUsuario = new JLabelMe();
		this.jLabelfinanciamientoCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoCajaDiariaUsuario.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelfinanciamientoCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextFieldfinanciamientoCajaDiariaUsuario= new JTextFieldMe();
		jTextFieldfinanciamientoCajaDiariaUsuario.setEnabled(false);
		jTextFieldfinanciamientoCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoCajaDiariaUsuario.setText("0.0");

		this.jButtonfinanciamientoCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonfinanciamientoCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonfinanciamientoCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelfleteCajaDiariaUsuario = new JLabelMe();
		this.jLabelfleteCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteCajaDiariaUsuario.setToolTipText("Flete");
		this.jLabelfleteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelfleteCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextFieldfleteCajaDiariaUsuario= new JTextFieldMe();
		jTextFieldfleteCajaDiariaUsuario.setEnabled(false);
		jTextFieldfleteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteCajaDiariaUsuario.setText("0.0");

		this.jButtonfleteCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonfleteCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonfleteCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabeliceCajaDiariaUsuario = new JLabelMe();
		this.jLabeliceCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceCajaDiariaUsuario.setToolTipText("Ice");
		this.jLabeliceCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPaneliceCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextFieldiceCajaDiariaUsuario= new JTextFieldMe();
		jTextFieldiceCajaDiariaUsuario.setEnabled(false);
		jTextFieldiceCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceCajaDiariaUsuario.setText("0.0");

		this.jButtoniceCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtoniceCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtoniceCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceCajaDiariaUsuarioBusqueda.setVisible(false);		}


					
		this.jLabeltotalCajaDiariaUsuario = new JLabelMe();
		this.jLabeltotalCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalCajaDiariaUsuario.setToolTipText("Total");
		this.jLabeltotalCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPaneltotalCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jTextFieldtotalCajaDiariaUsuario= new JTextFieldMe();
		jTextFieldtotalCajaDiariaUsuario.setEnabled(false);
		jTextFieldtotalCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalCajaDiariaUsuario.setText("0.0");

		this.jButtontotalCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtontotalCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtontotalCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalCajaDiariaUsuarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCajaDiariaUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCajaDiariaUsuario = new JLabelMe();
		this.jLabelid_empresaCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCajaDiariaUsuario.setToolTipText("Empresa");
		this.jLabelid_empresaCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelid_empresaCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jComboBoxid_empresaCajaDiariaUsuario= new JComboBoxMe();
		jComboBoxid_empresaCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCajaDiariaUsuario.setEnabled(false);

		this.jButtonid_empresaCajaDiariaUsuario= new JButtonMe();
		this.jButtonid_empresaCajaDiariaUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaDiariaUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaDiariaUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaDiariaUsuario.setText("Buscar");
		this.jButtonid_empresaCajaDiariaUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCajaDiariaUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaDiariaUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaDiariaUsuario"));

		this.jButtonid_empresaCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonid_empresaCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonid_empresaCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCajaDiariaUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_empresaCajaDiariaUsuarioUpdate= new JButtonMe();
		this.jButtonid_empresaCajaDiariaUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaDiariaUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaDiariaUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaDiariaUsuarioUpdate.setText("U");
		this.jButtonid_empresaCajaDiariaUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCajaDiariaUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaDiariaUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaDiariaUsuarioUpdate"));



					
		this.jLabelid_clienteCajaDiariaUsuario = new JLabelMe();
		this.jLabelid_clienteCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteCajaDiariaUsuario.setToolTipText("Cliente");
		this.jLabelid_clienteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelid_clienteCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jComboBoxid_clienteCajaDiariaUsuario= new JComboBoxMe();
		jComboBoxid_clienteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_clienteCajaDiariaUsuario.setEnabled(false);

		this.jButtonid_clienteCajaDiariaUsuario= new JButtonMe();
		this.jButtonid_clienteCajaDiariaUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaDiariaUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaDiariaUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCajaDiariaUsuario.setText("Buscar");
		this.jButtonid_clienteCajaDiariaUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteCajaDiariaUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaDiariaUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaDiariaUsuario"));

		this.jButtonid_clienteCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonid_clienteCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonid_clienteCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteCajaDiariaUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_clienteCajaDiariaUsuarioUpdate= new JButtonMe();
		this.jButtonid_clienteCajaDiariaUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaDiariaUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCajaDiariaUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCajaDiariaUsuarioUpdate.setText("U");
		this.jButtonid_clienteCajaDiariaUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteCajaDiariaUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCajaDiariaUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCajaDiariaUsuarioUpdate"));



					
		this.jLabelid_cajaCajaDiariaUsuario = new JLabelMe();
		this.jLabelid_cajaCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaCajaDiariaUsuario.setToolTipText("Caja");
		this.jLabelid_cajaCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelid_cajaCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jComboBoxid_cajaCajaDiariaUsuario= new JComboBoxMe();
		jComboBoxid_cajaCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cajaCajaDiariaUsuario.setEnabled(false);

		this.jButtonid_cajaCajaDiariaUsuario= new JButtonMe();
		this.jButtonid_cajaCajaDiariaUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaDiariaUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaDiariaUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaDiariaUsuario.setText("Buscar");
		this.jButtonid_cajaCajaDiariaUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaCajaDiariaUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaDiariaUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaDiariaUsuario"));

		this.jButtonid_cajaCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonid_cajaCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonid_cajaCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaCajaDiariaUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_cajaCajaDiariaUsuarioUpdate= new JButtonMe();
		this.jButtonid_cajaCajaDiariaUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaDiariaUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaDiariaUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajaDiariaUsuarioUpdate.setText("U");
		this.jButtonid_cajaCajaDiariaUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaCajaDiariaUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaDiariaUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaDiariaUsuarioUpdate"));



					
		this.jLabelid_usuarioCajaDiariaUsuario = new JLabelMe();
		this.jLabelid_usuarioCajaDiariaUsuario.setText(""+CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioCajaDiariaUsuario.setToolTipText("Usuario");
		this.jLabelid_usuarioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioCajaDiariaUsuario.setToolTipText(CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		this.jPanelid_usuarioCajaDiariaUsuario.setLayout(this.gridaBagLayoutCajaDiariaUsuario);


		jComboBoxid_usuarioCajaDiariaUsuario= new JComboBoxMe();
		jComboBoxid_usuarioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioCajaDiariaUsuario.setEnabled(false);

		this.jButtonid_usuarioCajaDiariaUsuario= new JButtonMe();
		this.jButtonid_usuarioCajaDiariaUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajaDiariaUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajaDiariaUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajaDiariaUsuario.setText("Buscar");
		this.jButtonid_usuarioCajaDiariaUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioCajaDiariaUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajaDiariaUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajaDiariaUsuario"));

		this.jButtonid_usuarioCajaDiariaUsuarioBusqueda= new JButtonMe();
		this.jButtonid_usuarioCajaDiariaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaDiariaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaDiariaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCajaDiariaUsuarioBusqueda.setText("U");
		this.jButtonid_usuarioCajaDiariaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioCajaDiariaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajaDiariaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajaDiariaUsuarioBusqueda"));

		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioCajaDiariaUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_usuarioCajaDiariaUsuarioUpdate= new JButtonMe();
		this.jButtonid_usuarioCajaDiariaUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaDiariaUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaDiariaUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCajaDiariaUsuarioUpdate.setText("U");
		this.jButtonid_usuarioCajaDiariaUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioCajaDiariaUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajaDiariaUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajaDiariaUsuarioUpdate"));



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
		//this.jInternalFrameDetalleCajaDiariaUsuario = new CajaDiariaUsuarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Caja Diaria Usuario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaDiariaUsuario= new GridBagLayout();
		

		
		String sToolTipCajaDiariaUsuario="";
		sToolTipCajaDiariaUsuario=CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaDiariaUsuario+="(PuntoVenta.CajaDiariaUsuario)";
		}
		
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaDiariaUsuario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCajaDiariaUsuario = new JButtonMe();
		this.jButtonModificarCajaDiariaUsuario = new JButtonMe();
        this.jButtonActualizarCajaDiariaUsuario = new JButtonMe();
        this.jButtonEliminarCajaDiariaUsuario = new JButtonMe();
        this.jButtonCancelarCajaDiariaUsuario = new JButtonMe();
        this.jButtonGuardarCambiosCajaDiariaUsuario = new JButtonMe();
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario = new JButtonMe();
		this.jButtonCerrarCajaDiariaUsuario = new JButtonMe();
		
		this.jScrollPanelDatosCajaDiariaUsuario = new JScrollPane();   
        this.jScrollPanelDatosEdicionCajaDiariaUsuario = new JScrollPane();
		this.jScrollPanelDatosGeneralCajaDiariaUsuario = new JScrollPane();
				
		
		
		this.jPanelCamposCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Diaria Usuario";
		
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaDiariaUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCajaDiariaUsuario.setName("jPanelCamposCajaDiariaUsuario"); 

		this.jPanelCamposOcultosCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCajaDiariaUsuario.setName("jPanelCamposOcultosCajaDiariaUsuario"); 

        this.jPanelAccionesCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaDiariaUsuario.setToolTipText("Acciones");
        this.jPanelAccionesCajaDiariaUsuario.setName("Acciones"); 

		this.jPanelAccionesFormularioCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCajaDiariaUsuario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCajaDiariaUsuario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCajaDiariaUsuario.setText("Nuevo");
		this.jButtonModificarCajaDiariaUsuario.setText("Editar");
        this.jButtonActualizarCajaDiariaUsuario.setText("Actualizar");
        this.jButtonEliminarCajaDiariaUsuario.setText("Eliminar");
        this.jButtonCancelarCajaDiariaUsuario.setText("Cancelar");
        this.jButtonGuardarCambiosCajaDiariaUsuario.setText("Guardar");
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario.setText("Guardar");
		this.jButtonCerrarCajaDiariaUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaDiariaUsuario,"nuevo_button","Nuevo",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCajaDiariaUsuario,"modificar_button","Editar",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCajaDiariaUsuario,"actualizar_button","Actualizar",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCajaDiariaUsuario,"eliminar_button","Eliminar",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCajaDiariaUsuario,"cancelar_button","Cancelar",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCajaDiariaUsuario,"guardarcambios_button","Guardar",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaDiariaUsuario,"guardarcambiostabla_button","Guardar",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaDiariaUsuario,"cerrar_button","Salir",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCajaDiariaUsuario.setToolTipText("Nuevo"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCajaDiariaUsuario.setToolTipText("Editar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCajaDiariaUsuario.setToolTipText("Actualizar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCajaDiariaUsuario.setToolTipText("Eliminar)"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCajaDiariaUsuario.setToolTipText("Cancelar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCajaDiariaUsuario.setToolTipText("Guardar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario.setToolTipText("Guardar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaDiariaUsuario.setToolTipText("Salir"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaDiariaUsuario";
		inputMap = this.jButtonNuevoCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaDiariaUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaDiariaUsuario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCajaDiariaUsuario";
		inputMap = this.jButtonActualizarCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCajaDiariaUsuario"));
		
		//ELIMINAR
		sMapKey = "EliminarCajaDiariaUsuario";
		inputMap = this.jButtonEliminarCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCajaDiariaUsuario"));
		
		//CANCELAR	
		sMapKey = "CancelarCajaDiariaUsuario";
		inputMap = this.jButtonCancelarCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCajaDiariaUsuario"));
		
		//CERRAR		
		sMapKey = "CerrarCajaDiariaUsuario";
		inputMap = this.jButtonCerrarCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaDiariaUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaDiariaUsuario";
		inputMap = this.jButtonGuardarCambiosTablaCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaDiariaUsuario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCajaDiariaUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCajaDiariaUsuario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCajaDiariaUsuario.setToolTipText("Nuevo CajaDiariaUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCajaDiariaUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCajaDiariaUsuario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCajaDiariaUsuario.setToolTipText("Sin Cerrar Ventana CajaDiariaUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCajaDiariaUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCajaDiariaUsuario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCajaDiariaUsuario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaDiariaUsuario.setText("Accion");
		this.jComboBoxTiposAccionesCajaDiariaUsuario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCajaDiariaUsuario = new JLabelMe();
		
		this.jLabelAccionesCajaDiariaUsuario.setText("Acciones");		
		this.jLabelAccionesCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCajaDiariaUsuario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCajaDiariaUsuario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCajaDiariaUsuario=new JTabbedPane();
		this.jTabbedPaneRelacionesCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCajaDiariaUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaDiariaUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaDiariaUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCajaDiariaUsuario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCajaDiariaUsuario = new GridBagLayout();
		
		this.jPanelCamposCajaDiariaUsuario.setLayout(gridaBagLayoutCamposCajaDiariaUsuario);
		this.jPanelCamposOcultosCajaDiariaUsuario.setLayout(gridaBagLayoutCamposOcultosCajaDiariaUsuario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCajaDiariaUsuario.add(jLabelIdCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCajaDiariaUsuario.add(jLabelidCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCajaDiariaUsuario.add(jLabelid_empresaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaDiariaUsuario.add(jButtonid_empresaCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 3;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaDiariaUsuario.add(jButtonid_empresaCajaDiariaUsuarioUpdate, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCajaDiariaUsuario.add(jComboBoxid_empresaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteCajaDiariaUsuario.add(jLabelid_clienteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteCajaDiariaUsuario.add(jButtonid_clienteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 3;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCajaDiariaUsuario.add(jButtonid_clienteCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 4;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCajaDiariaUsuario.add(jButtonid_clienteCajaDiariaUsuarioUpdate, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteCajaDiariaUsuario.add(jComboBoxid_clienteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaCajaDiariaUsuario.add(jLabelid_cajaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajaDiariaUsuario.add(jButtonid_cajaCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 3;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajaDiariaUsuario.add(jButtonid_cajaCajaDiariaUsuarioUpdate, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaCajaDiariaUsuario.add(jComboBoxid_cajaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioCajaDiariaUsuario.add(jLabelid_usuarioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCajaDiariaUsuario.add(jButtonid_usuarioCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 3;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCajaDiariaUsuario.add(jButtonid_usuarioCajaDiariaUsuarioUpdate, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioCajaDiariaUsuario.add(jComboBoxid_usuarioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioCajaDiariaUsuario.add(jLabelfecha_inicioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioCajaDiariaUsuario.add(jButtonfecha_inicioCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioCajaDiariaUsuario.add(jDateChooserfecha_inicioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finCajaDiariaUsuario.add(jLabelfecha_finCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finCajaDiariaUsuario.add(jButtonfecha_finCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finCajaDiariaUsuario.add(jDateChooserfecha_finCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cajaCajaDiariaUsuario.add(jLabelnombre_cajaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cajaCajaDiariaUsuario.add(jButtonnombre_cajaCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cajaCajaDiariaUsuario.add(jscrollPanenombre_cajaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_usuarioCajaDiariaUsuario.add(jLabelnombre_usuarioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_usuarioCajaDiariaUsuario.add(jButtonnombre_usuarioCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_usuarioCajaDiariaUsuario.add(jTextFieldnombre_usuarioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialCajaDiariaUsuario.add(jLabelsecuencialCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialCajaDiariaUsuario.add(jButtonsecuencialCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialCajaDiariaUsuario.add(jTextFieldsecuencialCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_clienteCajaDiariaUsuario.add(jLabelcodigo_clienteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_clienteCajaDiariaUsuario.add(jButtoncodigo_clienteCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_clienteCajaDiariaUsuario.add(jTextFieldcodigo_clienteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteCajaDiariaUsuario.add(jLabelnombre_clienteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteCajaDiariaUsuario.add(jButtonnombre_clienteCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteCajaDiariaUsuario.add(jscrollPanenombre_clienteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalCajaDiariaUsuario.add(jLabelsubtotalCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalCajaDiariaUsuario.add(jButtonsubtotalCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalCajaDiariaUsuario.add(jTextFieldsubtotalCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaCajaDiariaUsuario.add(jLabelivaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaCajaDiariaUsuario.add(jButtonivaCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaCajaDiariaUsuario.add(jTextFieldivaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoCajaDiariaUsuario.add(jLabeldescuentoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoCajaDiariaUsuario.add(jButtondescuentoCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoCajaDiariaUsuario.add(jTextFielddescuentoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoCajaDiariaUsuario.add(jLabelfinanciamientoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoCajaDiariaUsuario.add(jButtonfinanciamientoCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoCajaDiariaUsuario.add(jTextFieldfinanciamientoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteCajaDiariaUsuario.add(jLabelfleteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteCajaDiariaUsuario.add(jButtonfleteCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteCajaDiariaUsuario.add(jTextFieldfleteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceCajaDiariaUsuario.add(jLabeliceCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceCajaDiariaUsuario.add(jButtoniceCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceCajaDiariaUsuario.add(jTextFieldiceCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalCajaDiariaUsuario.add(jLabeltotalCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 2;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
		this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalCajaDiariaUsuario.add(jButtontotalCajaDiariaUsuarioBusqueda, this.gridBagConstraintsCajaDiariaUsuario);
	}

	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = 1;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalCajaDiariaUsuario.add(jTextFieldtotalCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelidCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelfecha_inicioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelfecha_finCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelnombre_cajaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelnombre_usuarioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelsecuencialCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelcodigo_clienteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelnombre_clienteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelsubtotalCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelivaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPaneldescuentoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelfinanciamientoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPanelfleteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPaneliceCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaDiariaUsuario.add(this.jPaneltotalCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposCajaDiariaUsuario % 2==0) {
		iXPanelCamposCajaDiariaUsuario=0;
		iYPanelCamposCajaDiariaUsuario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposOcultosCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposOcultosCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaDiariaUsuario.add(this.jPanelid_empresaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposOcultosCajaDiariaUsuario % 2==0) {
		iXPanelCamposOcultosCajaDiariaUsuario=0;
		iYPanelCamposOcultosCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposOcultosCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposOcultosCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaDiariaUsuario.add(this.jPanelid_clienteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposOcultosCajaDiariaUsuario % 2==0) {
		iXPanelCamposOcultosCajaDiariaUsuario=0;
		iYPanelCamposOcultosCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposOcultosCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposOcultosCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaDiariaUsuario.add(this.jPanelid_cajaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposOcultosCajaDiariaUsuario % 2==0) {
		iXPanelCamposOcultosCajaDiariaUsuario=0;
		iYPanelCamposOcultosCajaDiariaUsuario++;
	}
	this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaDiariaUsuario.gridy = iYPanelCamposOcultosCajaDiariaUsuario;
	this.gridBagConstraintsCajaDiariaUsuario.gridx = iXPanelCamposOcultosCajaDiariaUsuario++;
	this.gridBagConstraintsCajaDiariaUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaDiariaUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaDiariaUsuario.add(this.jPanelid_usuarioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);



	if(iXPanelCamposOcultosCajaDiariaUsuario % 2==0) {
		iXPanelCamposOcultosCajaDiariaUsuario=0;
		iYPanelCamposOcultosCajaDiariaUsuario++;
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
			
		GridBagLayout gridaBagLayoutAccionesCajaDiariaUsuario= new GridBagLayout();
		this.jPanelAccionesCajaDiariaUsuario.setLayout(gridaBagLayoutAccionesCajaDiariaUsuario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCajaDiariaUsuario= new GridBagLayout();
		this.jPanelAccionesFormularioCajaDiariaUsuario.setLayout(gridaBagLayoutAccionesFormularioCajaDiariaUsuario);
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaDiariaUsuario.add(this.jComboBoxTiposAccionesFormularioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccion++;
			
		this.jPanelAccionesCajaDiariaUsuario.add(this.jButtonModificarCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);							

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx =iPosXAccion++;
			
		this.jPanelAccionesCajaDiariaUsuario.add(this.jButtonEliminarCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
			
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaDiariaUsuario.add(this.jButtonActualizarCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaDiariaUsuario.add(this.jButtonGuardarCambiosCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);	
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx =iPosXAccion++;
		
		this.jPanelAccionesCajaDiariaUsuario.add(this.jButtonCancelarCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaDiariaUsuario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();						
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;		
			//this.gridBagConstraintsCajaDiariaUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaDiariaUsuario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaDiariaUsuario.gridx =0;
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaDiariaUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CajaDiariaUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCajaDiariaUsuario = new CajaDiariaUsuarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Caja Diaria Usuario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Caja Diaria Usuario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Diaria Usuario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CajaDiariaUsuarioModel cajadiariausuarioModel=new CajaDiariaUsuarioModel(this);
			
			//SI USARA CLASE INTERNA
			//CajaDiariaUsuarioModel.CajaDiariaUsuarioFocusTraversalPolicy cajadiariausuarioFocusTraversalPolicy = cajadiariausuarioModel.new CajaDiariaUsuarioFocusTraversalPolicy(this);
			
			//cajadiariausuarioFocusTraversalPolicy.setcajadiariausuarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cajadiariausuarioModel);
			
			
			this.jContentPaneDetalleCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCajaDiariaUsuario = new GridBagLayout();	
			this.jContentPaneDetalleCajaDiariaUsuario.setLayout(gridaBagLayoutDetalleCajaDiariaUsuario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaDiariaUsuario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
				this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
					
				
				this.jContentPaneDetalleCajaDiariaUsuario.add(jTtoolBarDetalleCajaDiariaUsuario, gridBagConstraintsCajaDiariaUsuario);								
				
}
			
			this.jScrollPanelDatosEdicionCajaDiariaUsuario=   new JScrollPane(jContentPaneDetalleCajaDiariaUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCajaDiariaUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	        
			this.jContentPaneDetalleCajaDiariaUsuario.add(jPanelCamposCajaDiariaUsuario, gridBagConstraintsCajaDiariaUsuario);
			
			
			
			
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
						//&& cajadiariausuarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCajaDiariaUsuario= new GridBagConstraints();
						this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
						this.jContentPaneDetalleCajaDiariaUsuario.add(this.jTabbedPaneRelacionesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCajaDiariaUsuario.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCajaDiariaUsuario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
					this.gridBagConstraintsCajaDiariaUsuario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
					
				
					this.jContentPaneDetalleCajaDiariaUsuario.add(jPanelCamposOcultosCajaDiariaUsuario, gridBagConstraintsCajaDiariaUsuario);
				
					this.jPanelCamposOcultosCajaDiariaUsuario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	        this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCajaDiariaUsuario.add(this.jPanelAccionesFormularioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);							
			
			
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
	        this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
	        
			
			this.jContentPaneDetalleCajaDiariaUsuario.add(this.jPanelAccionesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCajaDiariaUsuario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCajaDiariaUsuario=   new JScrollPane(this.jPanelCamposCajaDiariaUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCajaDiariaUsuario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);			
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			
			
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
			
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCajaDiariaUsuario;//jContentPane;
		
		return jScrollPanelDatosEdicionCajaDiariaUsuario;
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
