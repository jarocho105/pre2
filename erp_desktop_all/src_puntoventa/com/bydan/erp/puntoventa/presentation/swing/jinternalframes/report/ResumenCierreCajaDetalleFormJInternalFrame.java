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

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.puntoventa.util.report.ResumenCierreCajaConstantesFunciones;

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
public class ResumenCierreCajaDetalleFormJInternalFrame extends ResumenCierreCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleResumenCierreCaja;
	
	protected JMenuBar jmenuBarDetalleResumenCierreCaja;
	
	protected JMenu jmenuDetalleResumenCierreCaja;
	protected JMenu jmenuDetalleArchivoResumenCierreCaja;
	protected JMenu jmenuDetalleAccionesResumenCierreCaja;
	protected JMenu jmenuDetalleDatosResumenCierreCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResumenCierreCaja;	
	protected GridBagConstraints gridBagConstraintsResumenCierreCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ResumenCierreCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleResumenCierreCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public ResumenCierreCajaSessionBean resumencierrecajaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public CajaSessionBean cajaSessionBean;	
	
	public ResumenCierreCajaLogic resumencierrecajaLogic;
	
	public JScrollPane jScrollPanelDatosResumenCierreCaja;
	public JScrollPane jScrollPanelDatosEdicionResumenCierreCaja;
	public JScrollPane jScrollPanelDatosGeneralResumenCierreCaja;
	
	protected JPanel jPanelCamposResumenCierreCaja;    
	protected JPanel jPanelCamposOcultosResumenCierreCaja;    	
	protected JPanel jPanelAccionesResumenCierreCaja;
	protected JPanel jPanelAccionesFormularioResumenCierreCaja;
    
	
	
	protected Integer iXPanelCamposResumenCierreCaja=0;
	protected Integer iYPanelCamposResumenCierreCaja=0;
	
	protected Integer iXPanelCamposOcultosResumenCierreCaja=0;
	protected Integer iYPanelCamposOcultosResumenCierreCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoResumenCierreCaja;
	public JButton jButtonModificarResumenCierreCaja;
	public JButton jButtonActualizarResumenCierreCaja;
    public JButton jButtonEliminarResumenCierreCaja;
	public JButton jButtonCancelarResumenCierreCaja;
    public JButton jButtonGuardarCambiosResumenCierreCaja;
	public JButton jButtonGuardarCambiosTablaResumenCierreCaja;
	protected JButton jButtonCerrarResumenCierreCaja;
	
	
	protected JButton jButtonProcesarInformacionResumenCierreCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoResumenCierreCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarResumenCierreCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeResumenCierreCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResumenCierreCaja;
	protected JButton jButtonModificarToolBarResumenCierreCaja;
	protected JButton jButtonActualizarToolBarResumenCierreCaja;
    protected JButton jButtonEliminarToolBarResumenCierreCaja;
	protected JButton jButtonCancelarToolBarResumenCierreCaja;
    protected JButton jButtonGuardarCambiosToolBarResumenCierreCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarResumenCierreCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarResumenCierreCaja;
	protected JButton jButtonCerrarToolBarResumenCierreCaja;
	
	protected JButton jButtonProcesarInformacionToolBarResumenCierreCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResumenCierreCaja;
	protected JMenuItem jMenuItemModificarResumenCierreCaja;
	protected JMenuItem jMenuItemActualizarResumenCierreCaja;
    protected JMenuItem jMenuItemEliminarResumenCierreCaja;
	protected JMenuItem jMenuItemCancelarResumenCierreCaja;
    protected JMenuItem jMenuItemGuardarCambiosResumenCierreCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaResumenCierreCaja;
	protected JMenuItem jMenuItemCerrarResumenCierreCaja;
	protected JMenuItem jMenuItemDetalleCerrarResumenCierreCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarResumenCierreCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionResumenCierreCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResumenCierreCaja;
	protected JMenuItem jMenuItemMostrarOcultarResumenCierreCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResumenCierreCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResumenCierreCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioResumenCierreCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidResumenCierreCaja;
	public JLabel jLabelIdResumenCierreCaja;
	public JTextFieldMe jTextFieldidResumenCierreCaja;
	public JButton jButtonidResumenCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelfechaResumenCierreCaja;
	public JLabel jLabelfechaResumenCierreCaja;
	//public JFormattedTextField jDateChooserfechaResumenCierreCaja;

	public JDateChooser jDateChooserfechaResumenCierreCaja;
	public JButton jButtonfechaResumenCierreCajaBusqueda= new JButtonMe();

	public JPanel jPaneltipo_pagoResumenCierreCaja;
	public JLabel jLabeltipo_pagoResumenCierreCaja;
	public JTextField jTextFieldtipo_pagoResumenCierreCaja;
	public JButton jButtontipo_pagoResumenCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_usuarioResumenCierreCaja;
	public JLabel jLabelnombre_usuarioResumenCierreCaja;
	public JTextArea jTextAreanombre_usuarioResumenCierreCaja;
	public JScrollPane jscrollPanenombre_usuarioResumenCierreCaja;
	public JButton jButtonnombre_usuarioResumenCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cajaResumenCierreCaja;
	public JLabel jLabelnombre_cajaResumenCierreCaja;
	public JTextArea jTextAreanombre_cajaResumenCierreCaja;
	public JScrollPane jscrollPanenombre_cajaResumenCierreCaja;
	public JButton jButtonnombre_cajaResumenCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelvalorResumenCierreCaja;
	public JLabel jLabelvalorResumenCierreCaja;
	public JTextField jTextFieldvalorResumenCierreCaja;
	public JButton jButtonvalorResumenCierreCajaBusqueda= new JButtonMe();

	public JPanel jPaneltotalResumenCierreCaja;
	public JLabel jLabeltotalResumenCierreCaja;
	public JTextField jTextFieldtotalResumenCierreCaja;
	public JButton jButtontotalResumenCierreCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaResumenCierreCaja;
	public JLabel jLabelid_empresaResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaResumenCierreCaja;
	public JButton jButtonid_empresaResumenCierreCaja= new JButtonMe();
	public JButton jButtonid_empresaResumenCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaResumenCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalResumenCierreCaja;
	public JLabel jLabelid_sucursalResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalResumenCierreCaja;
	public JButton jButtonid_sucursalResumenCierreCaja= new JButtonMe();
	public JButton jButtonid_sucursalResumenCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalResumenCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioResumenCierreCaja;
	public JLabel jLabelid_usuarioResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioResumenCierreCaja;
	public JButton jButtonid_usuarioResumenCierreCaja= new JButtonMe();
	public JButton jButtonid_usuarioResumenCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioResumenCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaResumenCierreCaja;
	public JLabel jLabelid_cajaResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaResumenCierreCaja;
	public JButton jButtonid_cajaResumenCierreCaja= new JButtonMe();
	public JButton jButtonid_cajaResumenCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_cajaResumenCierreCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesResumenCierreCaja;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ResumenCierreCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposResumenCierreCaja=new JPanel();
				this.jPanelAccionesFormularioResumenCierreCaja=new JPanel();
				this.jmenuBarDetalleResumenCierreCaja=new JMenuBar();
				this.jTtoolBarDetalleResumenCierreCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenCierreCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ResumenCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ResumenCierreCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ResumenCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenCierreCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResumenCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenCierreCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResumenCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenCierreCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ResumenCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarResumenCierreCaja() {
		return this.jButtonActualizarToolBarResumenCierreCaja;
	}
	
	public JButton getjButtonEliminarToolBarResumenCierreCaja() {
		return this.jButtonEliminarToolBarResumenCierreCaja;
	}
	
	public JButton getjButtonCancelarToolBarResumenCierreCaja() {
		return this.jButtonCancelarToolBarResumenCierreCaja;
	}		
	
	public JButton getjButtonProcesarInformacionResumenCierreCaja() {
		return this.jButtonProcesarInformacionResumenCierreCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResumenCierreCaja)	{
		this.jButtonProcesarInformacionResumenCierreCaja = jButtonProcesarInformacionResumenCierreCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResumenCierreCaja() {
		return this.jComboBoxTiposAccionesResumenCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResumenCierreCaja(
			JComboBox jComboBoxTiposRelacionesResumenCierreCaja) {
		this.jComboBoxTiposRelacionesResumenCierreCaja = jComboBoxTiposRelacionesResumenCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResumenCierreCaja(
			JComboBox jComboBoxTiposAccionesResumenCierreCaja) {
		this.jComboBoxTiposAccionesResumenCierreCaja = jComboBoxTiposAccionesResumenCierreCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioResumenCierreCaja() {
		return this.jComboBoxTiposAccionesFormularioResumenCierreCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioResumenCierreCaja(
			JComboBox jComboBoxTiposAccionesFormularioResumenCierreCaja) {
		this.jComboBoxTiposAccionesFormularioResumenCierreCaja = jComboBoxTiposAccionesFormularioResumenCierreCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.resumencierrecajaSessionBean=new ResumenCierreCajaSessionBean();
		
		this.resumencierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.resumencierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.resumencierrecajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResumenCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResumenCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResumenCierreCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Resumen Cierre Caja MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
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
	
		ResumenCierreCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleResumenCierreCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarResumenCierreCaja=new JButtonMe();
				this.jButtonModificarToolBarResumenCierreCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarResumenCierreCaja,this.jTtoolBarDetalleResumenCierreCaja,
							"actualizar","actualizar","Actualizar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarResumenCierreCaja,this.jTtoolBarDetalleResumenCierreCaja,
							"eliminar","eliminar","Eliminar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarResumenCierreCaja,this.jTtoolBarDetalleResumenCierreCaja,
							"cancelar","cancelar","Cancelar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarResumenCierreCaja,this.jTtoolBarDetalleResumenCierreCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleResumenCierreCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleResumenCierreCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoResumenCierreCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesResumenCierreCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosResumenCierreCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResumenCierreCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResumenCierreCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResumenCierreCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarResumenCierreCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarResumenCierreCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarResumenCierreCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarResumenCierreCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarResumenCierreCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarResumenCierreCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarResumenCierreCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarResumenCierreCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarResumenCierreCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarResumenCierreCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarResumenCierreCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarResumenCierreCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosResumenCierreCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResumenCierreCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResumenCierreCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResumenCierreCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResumenCierreCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResumenCierreCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarResumenCierreCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarResumenCierreCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarResumenCierreCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResumenCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResumenCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResumenCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResumenCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResumenCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResumenCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoResumenCierreCaja.add(this.jMenuItemDetalleCerrarResumenCierreCaja);
		
		this.jmenuDetalleAccionesResumenCierreCaja.add(this.jMenuItemActualizarResumenCierreCaja);
		this.jmenuDetalleAccionesResumenCierreCaja.add(this.jMenuItemEliminarResumenCierreCaja);
		this.jmenuDetalleAccionesResumenCierreCaja.add(this.jMenuItemCancelarResumenCierreCaja);		
		
		//this.jmenuDetalleDatosResumenCierreCaja.add(this.jMenuItemDetalleAbrirOrderByResumenCierreCaja);				
		this.jmenuDetalleDatosResumenCierreCaja.add(this.jMenuItemDetalleMostarOcultarResumenCierreCaja);				
				
		//this.jmenuDetalleAccionesResumenCierreCaja.add(this.jMenuItemGuardarCambiosResumenCierreCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleResumenCierreCaja.add(this.jmenuDetalleArchivoResumenCierreCaja);		
		this.jmenuBarDetalleResumenCierreCaja.add(this.jmenuDetalleAccionesResumenCierreCaja);		
		this.jmenuBarDetalleResumenCierreCaja.add(this.jmenuDetalleDatosResumenCierreCaja);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleResumenCierreCaja);				
	}
	
	
	public void inicializarElementosCamposResumenCierreCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdResumenCierreCaja = new JLabelMe();
		jLabelIdResumenCierreCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidResumenCierreCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutResumenCierreCaja= new GridBagLayout();

		this.jPanelidResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);

		jTextFieldidResumenCierreCaja = new JTextFieldMe();
		jTextFieldidResumenCierreCaja.setText("Id");

		jTextFieldidResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaResumenCierreCaja = new JLabelMe();
		this.jLabelfechaResumenCierreCaja.setText(""+ResumenCierreCajaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaResumenCierreCaja.setToolTipText("Fecha");
		this.jLabelfechaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		this.jPanelfechaResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);


		//jFormattedTextFieldfechaResumenCierreCaja= new JFormattedTextFieldMe();

		jDateChooserfechaResumenCierreCaja= new JDateChooser();
		jDateChooserfechaResumenCierreCaja.setEnabled(false);
		jDateChooserfechaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaResumenCierreCaja.setDate(new Date());
		jDateChooserfechaResumenCierreCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaResumenCierreCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaResumenCierreCajaBusqueda= new JButtonMe();
		this.jButtonfechaResumenCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaResumenCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaResumenCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaResumenCierreCajaBusqueda.setText("U");
		this.jButtonfechaResumenCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaResumenCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaResumenCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaResumenCierreCajaBusqueda"));

		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaResumenCierreCajaBusqueda.setVisible(false);		}


					
		this.jLabeltipo_pagoResumenCierreCaja = new JLabelMe();
		this.jLabeltipo_pagoResumenCierreCaja.setText(""+ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO+" : *");
		this.jLabeltipo_pagoResumenCierreCaja.setToolTipText("Tipo Pago");
		this.jLabeltipo_pagoResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_pagoResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_pagoResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_pagoResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_pagoResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_pagoResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO);
		this.gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		this.jPaneltipo_pagoResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);


		jTextFieldtipo_pagoResumenCierreCaja= new JTextFieldMe();

		jTextFieldtipo_pagoResumenCierreCaja.setEnabled(false);
		jTextFieldtipo_pagoResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipo_pagoResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipo_pagoResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipo_pagoResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipo_pagoResumenCierreCajaBusqueda= new JButtonMe();
		this.jButtontipo_pagoResumenCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_pagoResumenCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_pagoResumenCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_pagoResumenCierreCajaBusqueda.setText("U");
		this.jButtontipo_pagoResumenCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_pagoResumenCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_pagoResumenCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipo_pagoResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipo_pagoResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_pagoResumenCierreCajaBusqueda"));

		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_pagoResumenCierreCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_usuarioResumenCierreCaja = new JLabelMe();
		this.jLabelnombre_usuarioResumenCierreCaja.setText(""+ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO+" : *");
		this.jLabelnombre_usuarioResumenCierreCaja.setToolTipText("Nombre Usuario");
		this.jLabelnombre_usuarioResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_usuarioResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_usuarioResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_usuarioResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_usuarioResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_usuarioResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO);
		this.gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		this.jPanelnombre_usuarioResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);


		jTextAreanombre_usuarioResumenCierreCaja= new JTextAreaMe();
		jTextAreanombre_usuarioResumenCierreCaja.setEnabled(false);
		jTextAreanombre_usuarioResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_usuarioResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_usuarioResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_usuarioResumenCierreCaja.setLineWrap(true);
		jTextAreanombre_usuarioResumenCierreCaja.setWrapStyleWord(true);
		jTextAreanombre_usuarioResumenCierreCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_usuarioResumenCierreCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_usuarioResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_usuarioResumenCierreCaja = new JScrollPane(jTextAreanombre_usuarioResumenCierreCaja);
		jscrollPanenombre_usuarioResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_usuarioResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_usuarioResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_usuarioResumenCierreCajaBusqueda= new JButtonMe();
		this.jButtonnombre_usuarioResumenCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_usuarioResumenCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_usuarioResumenCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_usuarioResumenCierreCajaBusqueda.setText("U");
		this.jButtonnombre_usuarioResumenCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_usuarioResumenCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_usuarioResumenCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_usuarioResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_usuarioResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_usuarioResumenCierreCajaBusqueda"));

		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_usuarioResumenCierreCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cajaResumenCierreCaja = new JLabelMe();
		this.jLabelnombre_cajaResumenCierreCaja.setText(""+ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA+" : *");
		this.jLabelnombre_cajaResumenCierreCaja.setToolTipText("Nombre Caja");
		this.jLabelnombre_cajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cajaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cajaResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cajaResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA);
		this.gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		this.jPanelnombre_cajaResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);


		jTextAreanombre_cajaResumenCierreCaja= new JTextAreaMe();
		jTextAreanombre_cajaResumenCierreCaja.setEnabled(false);
		jTextAreanombre_cajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaResumenCierreCaja.setLineWrap(true);
		jTextAreanombre_cajaResumenCierreCaja.setWrapStyleWord(true);
		jTextAreanombre_cajaResumenCierreCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cajaResumenCierreCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cajaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cajaResumenCierreCaja = new JScrollPane(jTextAreanombre_cajaResumenCierreCaja);
		jscrollPanenombre_cajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cajaResumenCierreCajaBusqueda= new JButtonMe();
		this.jButtonnombre_cajaResumenCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaResumenCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaResumenCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cajaResumenCierreCajaBusqueda.setText("U");
		this.jButtonnombre_cajaResumenCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cajaResumenCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cajaResumenCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cajaResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cajaResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cajaResumenCierreCajaBusqueda"));

		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cajaResumenCierreCajaBusqueda.setVisible(false);		}


					
		this.jLabelvalorResumenCierreCaja = new JLabelMe();
		this.jLabelvalorResumenCierreCaja.setText(""+ResumenCierreCajaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorResumenCierreCaja.setToolTipText("Valor");
		this.jLabelvalorResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		this.jPanelvalorResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);


		jTextFieldvalorResumenCierreCaja= new JTextFieldMe();
		jTextFieldvalorResumenCierreCaja.setEnabled(false);
		jTextFieldvalorResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorResumenCierreCaja.setText("0.0");

		this.jButtonvalorResumenCierreCajaBusqueda= new JButtonMe();
		this.jButtonvalorResumenCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorResumenCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorResumenCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorResumenCierreCajaBusqueda.setText("U");
		this.jButtonvalorResumenCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorResumenCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorResumenCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorResumenCierreCajaBusqueda"));

		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorResumenCierreCajaBusqueda.setVisible(false);		}


					
		this.jLabeltotalResumenCierreCaja = new JLabelMe();
		this.jLabeltotalResumenCierreCaja.setText(""+ResumenCierreCajaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalResumenCierreCaja.setToolTipText("Total");
		this.jLabeltotalResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		this.jPaneltotalResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);


		jTextFieldtotalResumenCierreCaja= new JTextFieldMe();
		jTextFieldtotalResumenCierreCaja.setEnabled(false);
		jTextFieldtotalResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalResumenCierreCaja.setText("0.0");

		this.jButtontotalResumenCierreCajaBusqueda= new JButtonMe();
		this.jButtontotalResumenCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalResumenCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalResumenCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalResumenCierreCajaBusqueda.setText("U");
		this.jButtontotalResumenCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalResumenCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalResumenCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalResumenCierreCajaBusqueda"));

		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalResumenCierreCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysResumenCierreCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaResumenCierreCaja = new JLabelMe();
		this.jLabelid_empresaResumenCierreCaja.setText(""+ResumenCierreCajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaResumenCierreCaja.setToolTipText("Empresa");
		this.jLabelid_empresaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		this.jPanelid_empresaResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);


		jComboBoxid_empresaResumenCierreCaja= new JComboBoxMe();
		jComboBoxid_empresaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaResumenCierreCaja.setEnabled(false);

		this.jButtonid_empresaResumenCierreCaja= new JButtonMe();
		this.jButtonid_empresaResumenCierreCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResumenCierreCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResumenCierreCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResumenCierreCaja.setText("Buscar");
		this.jButtonid_empresaResumenCierreCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaResumenCierreCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResumenCierreCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResumenCierreCaja"));

		this.jButtonid_empresaResumenCierreCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaResumenCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResumenCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResumenCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaResumenCierreCajaBusqueda.setText("U");
		this.jButtonid_empresaResumenCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaResumenCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResumenCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResumenCierreCajaBusqueda"));

		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaResumenCierreCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaResumenCierreCajaUpdate= new JButtonMe();
		this.jButtonid_empresaResumenCierreCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResumenCierreCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResumenCierreCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaResumenCierreCajaUpdate.setText("U");
		this.jButtonid_empresaResumenCierreCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaResumenCierreCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResumenCierreCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResumenCierreCajaUpdate"));



					
		this.jLabelid_sucursalResumenCierreCaja = new JLabelMe();
		this.jLabelid_sucursalResumenCierreCaja.setText(""+ResumenCierreCajaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalResumenCierreCaja.setToolTipText("Sucursal");
		this.jLabelid_sucursalResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		this.jPanelid_sucursalResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);


		jComboBoxid_sucursalResumenCierreCaja= new JComboBoxMe();
		jComboBoxid_sucursalResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalResumenCierreCaja.setEnabled(false);

		this.jButtonid_sucursalResumenCierreCaja= new JButtonMe();
		this.jButtonid_sucursalResumenCierreCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResumenCierreCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResumenCierreCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResumenCierreCaja.setText("Buscar");
		this.jButtonid_sucursalResumenCierreCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalResumenCierreCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResumenCierreCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResumenCierreCaja"));

		this.jButtonid_sucursalResumenCierreCajaBusqueda= new JButtonMe();
		this.jButtonid_sucursalResumenCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResumenCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResumenCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalResumenCierreCajaBusqueda.setText("U");
		this.jButtonid_sucursalResumenCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalResumenCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResumenCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResumenCierreCajaBusqueda"));

		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalResumenCierreCajaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalResumenCierreCajaUpdate= new JButtonMe();
		this.jButtonid_sucursalResumenCierreCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResumenCierreCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResumenCierreCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalResumenCierreCajaUpdate.setText("U");
		this.jButtonid_sucursalResumenCierreCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalResumenCierreCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResumenCierreCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResumenCierreCajaUpdate"));



					
		this.jLabelid_usuarioResumenCierreCaja = new JLabelMe();
		this.jLabelid_usuarioResumenCierreCaja.setText(""+ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioResumenCierreCaja.setToolTipText("Usuario");
		this.jLabelid_usuarioResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		this.jPanelid_usuarioResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);


		jComboBoxid_usuarioResumenCierreCaja= new JComboBoxMe();
		jComboBoxid_usuarioResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioResumenCierreCaja.setEnabled(false);

		this.jButtonid_usuarioResumenCierreCaja= new JButtonMe();
		this.jButtonid_usuarioResumenCierreCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioResumenCierreCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioResumenCierreCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioResumenCierreCaja.setText("Buscar");
		this.jButtonid_usuarioResumenCierreCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioResumenCierreCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioResumenCierreCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResumenCierreCaja"));

		this.jButtonid_usuarioResumenCierreCajaBusqueda= new JButtonMe();
		this.jButtonid_usuarioResumenCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResumenCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResumenCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioResumenCierreCajaBusqueda.setText("U");
		this.jButtonid_usuarioResumenCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioResumenCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioResumenCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResumenCierreCajaBusqueda"));

		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioResumenCierreCajaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioResumenCierreCajaUpdate= new JButtonMe();
		this.jButtonid_usuarioResumenCierreCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResumenCierreCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResumenCierreCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioResumenCierreCajaUpdate.setText("U");
		this.jButtonid_usuarioResumenCierreCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioResumenCierreCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioResumenCierreCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResumenCierreCajaUpdate"));



					
		this.jLabelid_cajaResumenCierreCaja = new JLabelMe();
		this.jLabelid_cajaResumenCierreCaja.setText(""+ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaResumenCierreCaja.setToolTipText("Caja");
		this.jLabelid_cajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaResumenCierreCaja.setToolTipText(ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		this.jPanelid_cajaResumenCierreCaja.setLayout(this.gridaBagLayoutResumenCierreCaja);


		jComboBoxid_cajaResumenCierreCaja= new JComboBoxMe();
		jComboBoxid_cajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cajaResumenCierreCaja.setEnabled(false);

		this.jButtonid_cajaResumenCierreCaja= new JButtonMe();
		this.jButtonid_cajaResumenCierreCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaResumenCierreCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaResumenCierreCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaResumenCierreCaja.setText("Buscar");
		this.jButtonid_cajaResumenCierreCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaResumenCierreCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaResumenCierreCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaResumenCierreCaja"));

		this.jButtonid_cajaResumenCierreCajaBusqueda= new JButtonMe();
		this.jButtonid_cajaResumenCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaResumenCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaResumenCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaResumenCierreCajaBusqueda.setText("U");
		this.jButtonid_cajaResumenCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaResumenCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaResumenCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaResumenCierreCajaBusqueda"));

		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaResumenCierreCajaBusqueda.setVisible(false);		}

		this.jButtonid_cajaResumenCierreCajaUpdate= new JButtonMe();
		this.jButtonid_cajaResumenCierreCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaResumenCierreCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaResumenCierreCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaResumenCierreCajaUpdate.setText("U");
		this.jButtonid_cajaResumenCierreCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaResumenCierreCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaResumenCierreCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaResumenCierreCajaUpdate"));



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
		//this.jInternalFrameDetalleResumenCierreCaja = new ResumenCierreCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Resumen Cierre Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResumenCierreCaja= new GridBagLayout();
		

		
		String sToolTipResumenCierreCaja="";
		sToolTipResumenCierreCaja=ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResumenCierreCaja+="(PuntoVenta.ResumenCierreCaja)";
		}
		
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipResumenCierreCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoResumenCierreCaja = new JButtonMe();
		this.jButtonModificarResumenCierreCaja = new JButtonMe();
        this.jButtonActualizarResumenCierreCaja = new JButtonMe();
        this.jButtonEliminarResumenCierreCaja = new JButtonMe();
        this.jButtonCancelarResumenCierreCaja = new JButtonMe();
        this.jButtonGuardarCambiosResumenCierreCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaResumenCierreCaja = new JButtonMe();
		this.jButtonCerrarResumenCierreCaja = new JButtonMe();
		
		this.jScrollPanelDatosResumenCierreCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionResumenCierreCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralResumenCierreCaja = new JScrollPane();
				
		
		
		this.jPanelCamposResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Resumen Cierre Caja";
		
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Cierre Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosResumenCierreCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposResumenCierreCaja.setName("jPanelCamposResumenCierreCaja"); 

		this.jPanelCamposOcultosResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosResumenCierreCaja.setName("jPanelCamposOcultosResumenCierreCaja"); 

        this.jPanelAccionesResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResumenCierreCaja.setToolTipText("Acciones");
        this.jPanelAccionesResumenCierreCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioResumenCierreCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioResumenCierreCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoResumenCierreCaja.setText("Nuevo");
		this.jButtonModificarResumenCierreCaja.setText("Editar");
        this.jButtonActualizarResumenCierreCaja.setText("Actualizar");
        this.jButtonEliminarResumenCierreCaja.setText("Eliminar");
        this.jButtonCancelarResumenCierreCaja.setText("Cancelar");
        this.jButtonGuardarCambiosResumenCierreCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaResumenCierreCaja.setText("Guardar");
		this.jButtonCerrarResumenCierreCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResumenCierreCaja,"nuevo_button","Nuevo",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarResumenCierreCaja,"modificar_button","Editar",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarResumenCierreCaja,"actualizar_button","Actualizar",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarResumenCierreCaja,"eliminar_button","Eliminar",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarResumenCierreCaja,"cancelar_button","Cancelar",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosResumenCierreCaja,"guardarcambios_button","Guardar",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResumenCierreCaja,"guardarcambiostabla_button","Guardar",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResumenCierreCaja,"cerrar_button","Salir",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoResumenCierreCaja.setToolTipText("Nuevo"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarResumenCierreCaja.setToolTipText("Editar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarResumenCierreCaja.setToolTipText("Actualizar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarResumenCierreCaja.setToolTipText("Eliminar)"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarResumenCierreCaja.setToolTipText("Cancelar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosResumenCierreCaja.setToolTipText("Guardar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaResumenCierreCaja.setToolTipText("Guardar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResumenCierreCaja.setToolTipText("Salir"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResumenCierreCaja";
		inputMap = this.jButtonNuevoResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResumenCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResumenCierreCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarResumenCierreCaja";
		inputMap = this.jButtonActualizarResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarResumenCierreCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarResumenCierreCaja";
		inputMap = this.jButtonEliminarResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarResumenCierreCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarResumenCierreCaja";
		inputMap = this.jButtonCancelarResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarResumenCierreCaja"));
		
		//CERRAR		
		sMapKey = "CerrarResumenCierreCaja";
		inputMap = this.jButtonCerrarResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResumenCierreCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResumenCierreCaja";
		inputMap = this.jButtonGuardarCambiosTablaResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResumenCierreCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoResumenCierreCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoResumenCierreCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoResumenCierreCaja.setToolTipText("Nuevo ResumenCierreCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarResumenCierreCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarResumenCierreCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarResumenCierreCaja.setToolTipText("Sin Cerrar Ventana ResumenCierreCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeResumenCierreCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeResumenCierreCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeResumenCierreCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResumenCierreCaja.setText("Accion");
		this.jComboBoxTiposAccionesResumenCierreCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioResumenCierreCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioResumenCierreCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesResumenCierreCaja = new JLabelMe();
		
		this.jLabelAccionesResumenCierreCaja.setText("Acciones");		
		this.jLabelAccionesResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposResumenCierreCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysResumenCierreCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesResumenCierreCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesResumenCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResumenCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResumenCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioResumenCierreCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResumenCierreCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResumenCierreCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposResumenCierreCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosResumenCierreCaja = new GridBagLayout();
		
		this.jPanelCamposResumenCierreCaja.setLayout(gridaBagLayoutCamposResumenCierreCaja);
		this.jPanelCamposOcultosResumenCierreCaja.setLayout(gridaBagLayoutCamposOcultosResumenCierreCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidResumenCierreCaja.add(jLabelIdResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidResumenCierreCaja.add(jTextFieldidResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaResumenCierreCaja.add(jLabelid_empresaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 2;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaResumenCierreCaja.add(jButtonid_empresaResumenCierreCajaBusqueda, this.gridBagConstraintsResumenCierreCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 3;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaResumenCierreCaja.add(jButtonid_empresaResumenCierreCajaUpdate, this.gridBagConstraintsResumenCierreCaja);
	}

	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaResumenCierreCaja.add(jComboBoxid_empresaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalResumenCierreCaja.add(jLabelid_sucursalResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 2;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalResumenCierreCaja.add(jButtonid_sucursalResumenCierreCajaBusqueda, this.gridBagConstraintsResumenCierreCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 3;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalResumenCierreCaja.add(jButtonid_sucursalResumenCierreCajaUpdate, this.gridBagConstraintsResumenCierreCaja);
	}

	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalResumenCierreCaja.add(jComboBoxid_sucursalResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioResumenCierreCaja.add(jLabelid_usuarioResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 2;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioResumenCierreCaja.add(jButtonid_usuarioResumenCierreCajaBusqueda, this.gridBagConstraintsResumenCierreCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 3;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioResumenCierreCaja.add(jButtonid_usuarioResumenCierreCajaUpdate, this.gridBagConstraintsResumenCierreCaja);
	}

	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioResumenCierreCaja.add(jComboBoxid_usuarioResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaResumenCierreCaja.add(jLabelid_cajaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 2;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaResumenCierreCaja.add(jButtonid_cajaResumenCierreCajaBusqueda, this.gridBagConstraintsResumenCierreCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 3;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaResumenCierreCaja.add(jButtonid_cajaResumenCierreCajaUpdate, this.gridBagConstraintsResumenCierreCaja);
	}

	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaResumenCierreCaja.add(jComboBoxid_cajaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaResumenCierreCaja.add(jLabelfechaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 2;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaResumenCierreCaja.add(jButtonfechaResumenCierreCajaBusqueda, this.gridBagConstraintsResumenCierreCaja);
	}

	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaResumenCierreCaja.add(jDateChooserfechaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_pagoResumenCierreCaja.add(jLabeltipo_pagoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 2;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_pagoResumenCierreCaja.add(jButtontipo_pagoResumenCierreCajaBusqueda, this.gridBagConstraintsResumenCierreCaja);
	}

	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_pagoResumenCierreCaja.add(jTextFieldtipo_pagoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_usuarioResumenCierreCaja.add(jLabelnombre_usuarioResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 2;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_usuarioResumenCierreCaja.add(jButtonnombre_usuarioResumenCierreCajaBusqueda, this.gridBagConstraintsResumenCierreCaja);
	}

	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_usuarioResumenCierreCaja.add(jscrollPanenombre_usuarioResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cajaResumenCierreCaja.add(jLabelnombre_cajaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 2;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cajaResumenCierreCaja.add(jButtonnombre_cajaResumenCierreCajaBusqueda, this.gridBagConstraintsResumenCierreCaja);
	}

	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cajaResumenCierreCaja.add(jscrollPanenombre_cajaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorResumenCierreCaja.add(jLabelvalorResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 2;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorResumenCierreCaja.add(jButtonvalorResumenCierreCajaBusqueda, this.gridBagConstraintsResumenCierreCaja);
	}

	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorResumenCierreCaja.add(jTextFieldvalorResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalResumenCierreCaja.add(jLabeltotalResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 2;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
		this.gridBagConstraintsResumenCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalResumenCierreCaja.add(jButtontotalResumenCierreCajaBusqueda, this.gridBagConstraintsResumenCierreCaja);
	}

	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenCierreCaja.gridy = 0;
	this.gridBagConstraintsResumenCierreCaja.gridx = 1;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalResumenCierreCaja.add(jTextFieldtotalResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenCierreCaja.add(this.jPanelidResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposResumenCierreCaja % 1==0) {
		iXPanelCamposResumenCierreCaja=0;
		iYPanelCamposResumenCierreCaja++;
	}
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenCierreCaja.add(this.jPanelfechaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposResumenCierreCaja % 1==0) {
		iXPanelCamposResumenCierreCaja=0;
		iYPanelCamposResumenCierreCaja++;
	}
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenCierreCaja.add(this.jPaneltipo_pagoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposResumenCierreCaja % 1==0) {
		iXPanelCamposResumenCierreCaja=0;
		iYPanelCamposResumenCierreCaja++;
	}
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenCierreCaja.add(this.jPanelnombre_usuarioResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposResumenCierreCaja % 1==0) {
		iXPanelCamposResumenCierreCaja=0;
		iYPanelCamposResumenCierreCaja++;
	}
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenCierreCaja.add(this.jPanelnombre_cajaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposResumenCierreCaja % 1==0) {
		iXPanelCamposResumenCierreCaja=0;
		iYPanelCamposResumenCierreCaja++;
	}
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenCierreCaja.add(this.jPanelvalorResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposResumenCierreCaja % 1==0) {
		iXPanelCamposResumenCierreCaja=0;
		iYPanelCamposResumenCierreCaja++;
	}
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenCierreCaja.add(this.jPaneltotalResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposResumenCierreCaja % 1==0) {
		iXPanelCamposResumenCierreCaja=0;
		iYPanelCamposResumenCierreCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposOcultosResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposOcultosResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResumenCierreCaja.add(this.jPanelid_empresaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposOcultosResumenCierreCaja % 1==0) {
		iXPanelCamposOcultosResumenCierreCaja=0;
		iYPanelCamposOcultosResumenCierreCaja++;
	}
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposOcultosResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposOcultosResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResumenCierreCaja.add(this.jPanelid_sucursalResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposOcultosResumenCierreCaja % 1==0) {
		iXPanelCamposOcultosResumenCierreCaja=0;
		iYPanelCamposOcultosResumenCierreCaja++;
	}
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposOcultosResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposOcultosResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResumenCierreCaja.add(this.jPanelid_usuarioResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposOcultosResumenCierreCaja % 1==0) {
		iXPanelCamposOcultosResumenCierreCaja=0;
		iYPanelCamposOcultosResumenCierreCaja++;
	}
	this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenCierreCaja.gridy = iYPanelCamposOcultosResumenCierreCaja;
	this.gridBagConstraintsResumenCierreCaja.gridx = iXPanelCamposOcultosResumenCierreCaja++;
	this.gridBagConstraintsResumenCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResumenCierreCaja.add(this.jPanelid_cajaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);



	if(iXPanelCamposOcultosResumenCierreCaja % 1==0) {
		iXPanelCamposOcultosResumenCierreCaja=0;
		iYPanelCamposOcultosResumenCierreCaja++;
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
			
		GridBagLayout gridaBagLayoutAccionesResumenCierreCaja= new GridBagLayout();
		this.jPanelAccionesResumenCierreCaja.setLayout(gridaBagLayoutAccionesResumenCierreCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioResumenCierreCaja= new GridBagLayout();
		this.jPanelAccionesFormularioResumenCierreCaja.setLayout(gridaBagLayoutAccionesFormularioResumenCierreCaja);
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioResumenCierreCaja.add(this.jComboBoxTiposAccionesFormularioResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesResumenCierreCaja.add(this.jButtonModificarResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);							

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesResumenCierreCaja.add(this.jButtonEliminarResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
			
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesResumenCierreCaja.add(this.jButtonActualizarResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesResumenCierreCaja.add(this.jButtonGuardarCambiosResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);	
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;		
		this.gridBagConstraintsResumenCierreCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesResumenCierreCaja.add(this.jButtonCancelarResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResumenCierreCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();						
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResumenCierreCaja.gridx = 0;		
			//this.gridBagConstraintsResumenCierreCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResumenCierreCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResumenCierreCaja.gridx =0;
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResumenCierreCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ResumenCierreCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleResumenCierreCaja = new ResumenCierreCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Resumen Cierre Caja DATOS");
			
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
			
	        //this.setTitle("[FOR] - Resumen Cierre Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Resumen Cierre Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ResumenCierreCajaModel resumencierrecajaModel=new ResumenCierreCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//ResumenCierreCajaModel.ResumenCierreCajaFocusTraversalPolicy resumencierrecajaFocusTraversalPolicy = resumencierrecajaModel.new ResumenCierreCajaFocusTraversalPolicy(this);
			
			//resumencierrecajaFocusTraversalPolicy.setresumencierrecajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(resumencierrecajaModel);
			
			
			this.jContentPaneDetalleResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleResumenCierreCaja = new GridBagLayout();	
			this.jContentPaneDetalleResumenCierreCaja.setLayout(gridaBagLayoutDetalleResumenCierreCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResumenCierreCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
				this.gridBagConstraintsResumenCierreCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsResumenCierreCaja.gridx = 0;
					
				
				this.jContentPaneDetalleResumenCierreCaja.add(jTtoolBarDetalleResumenCierreCaja, gridBagConstraintsResumenCierreCaja);								
				
}
			
			this.jScrollPanelDatosEdicionResumenCierreCaja=   new JScrollPane(jContentPaneDetalleResumenCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResumenCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResumenCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResumenCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralResumenCierreCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResumenCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResumenCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResumenCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsResumenCierreCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	        
			this.jContentPaneDetalleResumenCierreCaja.add(jPanelCamposResumenCierreCaja, gridBagConstraintsResumenCierreCaja);
			
			
			
			
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
						//&& resumencierrecajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.resumencierrecajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsResumenCierreCaja= new GridBagConstraints();
						this.gridBagConstraintsResumenCierreCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsResumenCierreCaja.gridx = 0;
						this.jContentPaneDetalleResumenCierreCaja.add(this.jTabbedPaneRelacionesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesResumenCierreCaja.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosResumenCierreCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
					this.gridBagConstraintsResumenCierreCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsResumenCierreCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsResumenCierreCaja.gridx = 0;
					
				
					this.jContentPaneDetalleResumenCierreCaja.add(jPanelCamposOcultosResumenCierreCaja, gridBagConstraintsResumenCierreCaja);
				
					this.jPanelCamposOcultosResumenCierreCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	        this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleResumenCierreCaja.add(this.jPanelAccionesFormularioResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);							
			
			
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
	        this.gridBagConstraintsResumenCierreCaja.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsResumenCierreCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleResumenCierreCaja.add(this.jPanelAccionesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionResumenCierreCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionResumenCierreCaja=   new JScrollPane(this.jPanelCamposResumenCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResumenCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResumenCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResumenCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsResumenCierreCaja.gridx = 0;
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsResumenCierreCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResumenCierreCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);			
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResumenCierreCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			
			
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
			
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResumenCierreCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralResumenCierreCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionResumenCierreCaja;
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
