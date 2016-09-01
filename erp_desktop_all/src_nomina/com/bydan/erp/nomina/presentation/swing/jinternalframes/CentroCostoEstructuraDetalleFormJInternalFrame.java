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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.CentroCostoEstructuraConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class CentroCostoEstructuraDetalleFormJInternalFrame extends CentroCostoEstructuraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCentroCostoEstructura;
	
	protected JMenuBar jmenuBarDetalleCentroCostoEstructura;
	
	protected JMenu jmenuDetalleCentroCostoEstructura;
	protected JMenu jmenuDetalleArchivoCentroCostoEstructura;
	protected JMenu jmenuDetalleAccionesCentroCostoEstructura;
	protected JMenu jmenuDetalleDatosCentroCostoEstructura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCentroCostoEstructura;	
	protected GridBagConstraints gridBagConstraintsCentroCostoEstructura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CentroCostoEstructuraBeanSwingJInternalFrameAdditional jInternalFrameDetalleCentroCostoEstructura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public CentroCostoEstructuraSessionBean centrocostoestructuraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;	
	
	public CentroCostoEstructuraLogic centrocostoestructuraLogic;
	
	public JScrollPane jScrollPanelDatosCentroCostoEstructura;
	public JScrollPane jScrollPanelDatosEdicionCentroCostoEstructura;
	public JScrollPane jScrollPanelDatosGeneralCentroCostoEstructura;
	
	protected JPanel jPanelCamposCentroCostoEstructura;    
	protected JPanel jPanelCamposOcultosCentroCostoEstructura;    	
	protected JPanel jPanelAccionesCentroCostoEstructura;
	protected JPanel jPanelAccionesFormularioCentroCostoEstructura;
    
	
	
	protected Integer iXPanelCamposCentroCostoEstructura=0;
	protected Integer iYPanelCamposCentroCostoEstructura=0;
	
	protected Integer iXPanelCamposOcultosCentroCostoEstructura=0;
	protected Integer iYPanelCamposOcultosCentroCostoEstructura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCentroCostoEstructura;
	public JButton jButtonModificarCentroCostoEstructura;
	public JButton jButtonActualizarCentroCostoEstructura;
    public JButton jButtonEliminarCentroCostoEstructura;
	public JButton jButtonCancelarCentroCostoEstructura;
    public JButton jButtonGuardarCambiosCentroCostoEstructura;
	public JButton jButtonGuardarCambiosTablaCentroCostoEstructura;
	protected JButton jButtonCerrarCentroCostoEstructura;
	
	
	protected JButton jButtonProcesarInformacionCentroCostoEstructura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCentroCostoEstructura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCentroCostoEstructura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCentroCostoEstructura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCentroCostoEstructura;
	protected JButton jButtonModificarToolBarCentroCostoEstructura;
	protected JButton jButtonActualizarToolBarCentroCostoEstructura;
    protected JButton jButtonEliminarToolBarCentroCostoEstructura;
	protected JButton jButtonCancelarToolBarCentroCostoEstructura;
    protected JButton jButtonGuardarCambiosToolBarCentroCostoEstructura;
	protected JButton jButtonGuardarCambiosTablaToolBarCentroCostoEstructura;
	protected JButton jButtonMostrarOcultarTablaToolBarCentroCostoEstructura;
	protected JButton jButtonCerrarToolBarCentroCostoEstructura;
	
	protected JButton jButtonProcesarInformacionToolBarCentroCostoEstructura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCentroCostoEstructura;
	protected JMenuItem jMenuItemModificarCentroCostoEstructura;
	protected JMenuItem jMenuItemActualizarCentroCostoEstructura;
    protected JMenuItem jMenuItemEliminarCentroCostoEstructura;
	protected JMenuItem jMenuItemCancelarCentroCostoEstructura;
    protected JMenuItem jMenuItemGuardarCambiosCentroCostoEstructura;
	protected JMenuItem jMenuItemGuardarCambiosTablaCentroCostoEstructura;
	protected JMenuItem jMenuItemCerrarCentroCostoEstructura;
	protected JMenuItem jMenuItemDetalleCerrarCentroCostoEstructura;
	protected JMenuItem jMenuItemDetalleMostarOcultarCentroCostoEstructura;
	
	protected JMenuItem jMenuItemProcesarInformacionCentroCostoEstructura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCentroCostoEstructura;
	protected JMenuItem jMenuItemMostrarOcultarCentroCostoEstructura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCentroCostoEstructura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCentroCostoEstructura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCentroCostoEstructura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCentroCostoEstructura;
	public JLabel jLabelIdCentroCostoEstructura;
	public JLabel jLabelidCentroCostoEstructura;
	public JButton jButtonidCentroCostoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeCentroCostoEstructura;
	public JLabel jLabelporcentajeCentroCostoEstructura;
	public JTextField jTextFieldporcentajeCentroCostoEstructura;
	public JButton jButtonporcentajeCentroCostoEstructuraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCentroCostoEstructura;
	public JLabel jLabelid_empresaCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCentroCostoEstructura;
	public JButton jButtonid_empresaCentroCostoEstructura= new JButtonMe();
	public JButton jButtonid_empresaCentroCostoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_empresaCentroCostoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCentroCostoEstructura;
	public JLabel jLabelid_sucursalCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCentroCostoEstructura;
	public JButton jButtonid_sucursalCentroCostoEstructura= new JButtonMe();
	public JButton jButtonid_sucursalCentroCostoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCentroCostoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraCentroCostoEstructura;
	public JLabel jLabelid_estructuraCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraCentroCostoEstructura;
	public JButton jButtonid_estructuraCentroCostoEstructura= new JButtonMe();
	public JButton jButtonid_estructuraCentroCostoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_estructuraCentroCostoEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraCentroCostoEstructuraArbol= new JButtonMe();

	public JPanel jPanelid_centro_costoCentroCostoEstructura;
	public JLabel jLabelid_centro_costoCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoCentroCostoEstructura;
	public JButton jButtonid_centro_costoCentroCostoEstructura= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoEstructuraArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCentroCostoEstructura;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CentroCostoEstructuraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCentroCostoEstructura=new JPanel();
				this.jPanelAccionesFormularioCentroCostoEstructura=new JPanel();
				this.jmenuBarDetalleCentroCostoEstructura=new JMenuBar();
				this.jTtoolBarDetalleCentroCostoEstructura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoEstructuraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CentroCostoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CentroCostoEstructuraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CentroCostoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoEstructuraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoEstructuraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoEstructuraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CentroCostoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCentroCostoEstructura() {
		return this.jButtonActualizarToolBarCentroCostoEstructura;
	}
	
	public JButton getjButtonEliminarToolBarCentroCostoEstructura() {
		return this.jButtonEliminarToolBarCentroCostoEstructura;
	}
	
	public JButton getjButtonCancelarToolBarCentroCostoEstructura() {
		return this.jButtonCancelarToolBarCentroCostoEstructura;
	}		
	
	public JButton getjButtonProcesarInformacionCentroCostoEstructura() {
		return this.jButtonProcesarInformacionCentroCostoEstructura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCentroCostoEstructura)	{
		this.jButtonProcesarInformacionCentroCostoEstructura = jButtonProcesarInformacionCentroCostoEstructura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCentroCostoEstructura() {
		return this.jComboBoxTiposAccionesCentroCostoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCentroCostoEstructura(
			JComboBox jComboBoxTiposRelacionesCentroCostoEstructura) {
		this.jComboBoxTiposRelacionesCentroCostoEstructura = jComboBoxTiposRelacionesCentroCostoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCentroCostoEstructura(
			JComboBox jComboBoxTiposAccionesCentroCostoEstructura) {
		this.jComboBoxTiposAccionesCentroCostoEstructura = jComboBoxTiposAccionesCentroCostoEstructura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCentroCostoEstructura() {
		return this.jComboBoxTiposAccionesFormularioCentroCostoEstructura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCentroCostoEstructura(
			JComboBox jComboBoxTiposAccionesFormularioCentroCostoEstructura) {
		this.jComboBoxTiposAccionesFormularioCentroCostoEstructura = jComboBoxTiposAccionesFormularioCentroCostoEstructura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
		
		this.centrocostoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.centrocostoestructuraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CentroCostoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CentroCostoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CentroCostoEstructuraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Centro Costo Estructura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
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
	
		CentroCostoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCentroCostoEstructura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCentroCostoEstructura=new JButtonMe();
				this.jButtonModificarToolBarCentroCostoEstructura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCentroCostoEstructura,this.jTtoolBarDetalleCentroCostoEstructura,
							"actualizar","actualizar","Actualizar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCentroCostoEstructura,this.jTtoolBarDetalleCentroCostoEstructura,
							"eliminar","eliminar","Eliminar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCentroCostoEstructura,this.jTtoolBarDetalleCentroCostoEstructura,
							"cancelar","cancelar","Cancelar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCentroCostoEstructura,this.jTtoolBarDetalleCentroCostoEstructura,
							"guardarcambios","guardarcambios","Guardar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCentroCostoEstructura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCentroCostoEstructura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCentroCostoEstructura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCentroCostoEstructura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCentroCostoEstructura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCentroCostoEstructura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCentroCostoEstructura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCentroCostoEstructura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCentroCostoEstructura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCentroCostoEstructura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCentroCostoEstructura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCentroCostoEstructura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCentroCostoEstructura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCentroCostoEstructura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCentroCostoEstructura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCentroCostoEstructura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCentroCostoEstructura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCentroCostoEstructura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCentroCostoEstructura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCentroCostoEstructura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCentroCostoEstructura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCentroCostoEstructura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCentroCostoEstructura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCentroCostoEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCentroCostoEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCentroCostoEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCentroCostoEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCentroCostoEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCentroCostoEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCentroCostoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCentroCostoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCentroCostoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCentroCostoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCentroCostoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCentroCostoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCentroCostoEstructura.add(this.jMenuItemDetalleCerrarCentroCostoEstructura);
		
		this.jmenuDetalleAccionesCentroCostoEstructura.add(this.jMenuItemActualizarCentroCostoEstructura);
		this.jmenuDetalleAccionesCentroCostoEstructura.add(this.jMenuItemEliminarCentroCostoEstructura);
		this.jmenuDetalleAccionesCentroCostoEstructura.add(this.jMenuItemCancelarCentroCostoEstructura);		
		
		//this.jmenuDetalleDatosCentroCostoEstructura.add(this.jMenuItemDetalleAbrirOrderByCentroCostoEstructura);				
		this.jmenuDetalleDatosCentroCostoEstructura.add(this.jMenuItemDetalleMostarOcultarCentroCostoEstructura);				
				
		//this.jmenuDetalleAccionesCentroCostoEstructura.add(this.jMenuItemGuardarCambiosCentroCostoEstructura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCentroCostoEstructura.add(this.jmenuDetalleArchivoCentroCostoEstructura);		
		this.jmenuBarDetalleCentroCostoEstructura.add(this.jmenuDetalleAccionesCentroCostoEstructura);		
		this.jmenuBarDetalleCentroCostoEstructura.add(this.jmenuDetalleDatosCentroCostoEstructura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCentroCostoEstructura);				
	}
	
	
	public void inicializarElementosCamposCentroCostoEstructura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCentroCostoEstructura = new JLabelMe();
		jLabelIdCentroCostoEstructura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCentroCostoEstructura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCentroCostoEstructura.setToolTipText(CentroCostoEstructuraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCentroCostoEstructura= new GridBagLayout();

		this.jPanelidCentroCostoEstructura.setLayout(this.gridaBagLayoutCentroCostoEstructura);

		jLabelidCentroCostoEstructura = new JLabel();
		jLabelidCentroCostoEstructura.setText("Id");

		jLabelidCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeCentroCostoEstructura = new JLabelMe();
		this.jLabelporcentajeCentroCostoEstructura.setText(""+CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeCentroCostoEstructura.setToolTipText("Porcentaje");
		this.jLabelporcentajeCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeCentroCostoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeCentroCostoEstructura.setToolTipText(CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutCentroCostoEstructura = new GridBagLayout();
		this.jPanelporcentajeCentroCostoEstructura.setLayout(this.gridaBagLayoutCentroCostoEstructura);


		jTextFieldporcentajeCentroCostoEstructura= new JTextFieldMe();
		jTextFieldporcentajeCentroCostoEstructura.setEnabled(false);
		jTextFieldporcentajeCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeCentroCostoEstructura.setText("0.0");

		this.jButtonporcentajeCentroCostoEstructuraBusqueda= new JButtonMe();
		this.jButtonporcentajeCentroCostoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeCentroCostoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeCentroCostoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeCentroCostoEstructuraBusqueda.setText("U");
		this.jButtonporcentajeCentroCostoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeCentroCostoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeCentroCostoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeCentroCostoEstructuraBusqueda"));

		if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeCentroCostoEstructuraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCentroCostoEstructura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCentroCostoEstructura = new JLabelMe();
		this.jLabelid_empresaCentroCostoEstructura.setText(""+CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCentroCostoEstructura.setToolTipText("Empresa");
		this.jLabelid_empresaCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCentroCostoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCentroCostoEstructura.setToolTipText(CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCentroCostoEstructura = new GridBagLayout();
		this.jPanelid_empresaCentroCostoEstructura.setLayout(this.gridaBagLayoutCentroCostoEstructura);


		jComboBoxid_empresaCentroCostoEstructura= new JComboBoxMe();
		jComboBoxid_empresaCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCentroCostoEstructura.setEnabled(false);

		this.jButtonid_empresaCentroCostoEstructura= new JButtonMe();
		this.jButtonid_empresaCentroCostoEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCostoEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCostoEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCostoEstructura.setText("Buscar");
		this.jButtonid_empresaCentroCostoEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCentroCostoEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoEstructura"));

		this.jButtonid_empresaCentroCostoEstructuraBusqueda= new JButtonMe();
		this.jButtonid_empresaCentroCostoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCentroCostoEstructuraBusqueda.setText("U");
		this.jButtonid_empresaCentroCostoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCentroCostoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoEstructuraBusqueda"));

		if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCentroCostoEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_empresaCentroCostoEstructuraUpdate= new JButtonMe();
		this.jButtonid_empresaCentroCostoEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCentroCostoEstructuraUpdate.setText("U");
		this.jButtonid_empresaCentroCostoEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCentroCostoEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoEstructuraUpdate"));



					
		this.jLabelid_sucursalCentroCostoEstructura = new JLabelMe();
		this.jLabelid_sucursalCentroCostoEstructura.setText(""+CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCentroCostoEstructura.setToolTipText("Sucursal");
		this.jLabelid_sucursalCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCentroCostoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCentroCostoEstructura.setToolTipText(CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCentroCostoEstructura = new GridBagLayout();
		this.jPanelid_sucursalCentroCostoEstructura.setLayout(this.gridaBagLayoutCentroCostoEstructura);


		jComboBoxid_sucursalCentroCostoEstructura= new JComboBoxMe();
		jComboBoxid_sucursalCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCentroCostoEstructura.setEnabled(false);

		this.jButtonid_sucursalCentroCostoEstructura= new JButtonMe();
		this.jButtonid_sucursalCentroCostoEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCentroCostoEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCentroCostoEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCentroCostoEstructura.setText("Buscar");
		this.jButtonid_sucursalCentroCostoEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCentroCostoEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCentroCostoEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCentroCostoEstructura"));

		this.jButtonid_sucursalCentroCostoEstructuraBusqueda= new JButtonMe();
		this.jButtonid_sucursalCentroCostoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCentroCostoEstructuraBusqueda.setText("U");
		this.jButtonid_sucursalCentroCostoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCentroCostoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCentroCostoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCentroCostoEstructuraBusqueda"));

		if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCentroCostoEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCentroCostoEstructuraUpdate= new JButtonMe();
		this.jButtonid_sucursalCentroCostoEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCentroCostoEstructuraUpdate.setText("U");
		this.jButtonid_sucursalCentroCostoEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCentroCostoEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCentroCostoEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCentroCostoEstructuraUpdate"));



					
		this.jLabelid_estructuraCentroCostoEstructura = new JLabelMe();
		this.jLabelid_estructuraCentroCostoEstructura.setText(""+CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraCentroCostoEstructura.setToolTipText("Estructura");
		this.jLabelid_estructuraCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraCentroCostoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraCentroCostoEstructura.setToolTipText(CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutCentroCostoEstructura = new GridBagLayout();
		this.jPanelid_estructuraCentroCostoEstructura.setLayout(this.gridaBagLayoutCentroCostoEstructura);


		jComboBoxid_estructuraCentroCostoEstructura= new JComboBoxMe();
		jComboBoxid_estructuraCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraCentroCostoEstructura= new JButtonMe();
		this.jButtonid_estructuraCentroCostoEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCentroCostoEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCentroCostoEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCentroCostoEstructura.setText("Buscar");
		this.jButtonid_estructuraCentroCostoEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraCentroCostoEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCentroCostoEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCentroCostoEstructura"));

		this.jButtonid_estructuraCentroCostoEstructuraBusqueda= new JButtonMe();
		this.jButtonid_estructuraCentroCostoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCentroCostoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCentroCostoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraCentroCostoEstructuraBusqueda.setText("U");
		this.jButtonid_estructuraCentroCostoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraCentroCostoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCentroCostoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCentroCostoEstructuraBusqueda"));

		if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraCentroCostoEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_estructuraCentroCostoEstructuraUpdate= new JButtonMe();
		this.jButtonid_estructuraCentroCostoEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCentroCostoEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCentroCostoEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraCentroCostoEstructuraUpdate.setText("U");
		this.jButtonid_estructuraCentroCostoEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraCentroCostoEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCentroCostoEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCentroCostoEstructuraUpdate"));


		jButtonid_estructuraCentroCostoEstructuraArbol= new JButtonMe();
		jButtonid_estructuraCentroCostoEstructuraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraCentroCostoEstructuraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraCentroCostoEstructuraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraCentroCostoEstructuraArbol.setText("Arbol");
		jButtonid_estructuraCentroCostoEstructuraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraCentroCostoEstructuraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCentroCostoEstructuraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCentroCostoEstructuraArbol"));



					
		this.jLabelid_centro_costoCentroCostoEstructura = new JLabelMe();
		this.jLabelid_centro_costoCentroCostoEstructura.setText(""+CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoCentroCostoEstructura.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoCentroCostoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoCentroCostoEstructura.setToolTipText(CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutCentroCostoEstructura = new GridBagLayout();
		this.jPanelid_centro_costoCentroCostoEstructura.setLayout(this.gridaBagLayoutCentroCostoEstructura);


		jComboBoxid_centro_costoCentroCostoEstructura= new JComboBoxMe();
		jComboBoxid_centro_costoCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoCentroCostoEstructura= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCostoEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCostoEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCostoEstructura.setText("Buscar");
		this.jButtonid_centro_costoCentroCostoEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoCentroCostoEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoEstructura"));

		this.jButtonid_centro_costoCentroCostoEstructuraBusqueda= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCentroCostoEstructuraBusqueda.setText("U");
		this.jButtonid_centro_costoCentroCostoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoCentroCostoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoEstructuraBusqueda"));

		if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoCentroCostoEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoCentroCostoEstructuraUpdate= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCentroCostoEstructuraUpdate.setText("U");
		this.jButtonid_centro_costoCentroCostoEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoCentroCostoEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoEstructuraUpdate"));


		jButtonid_centro_costoCentroCostoEstructuraArbol= new JButtonMe();
		jButtonid_centro_costoCentroCostoEstructuraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoEstructuraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoEstructuraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoEstructuraArbol.setText("Arbol");
		jButtonid_centro_costoCentroCostoEstructuraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoCentroCostoEstructuraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoEstructuraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoEstructuraArbol"));



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
		//this.jInternalFrameDetalleCentroCostoEstructura = new CentroCostoEstructuraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Centro Costo Estructura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCentroCostoEstructura= new GridBagLayout();
		

		
		String sToolTipCentroCostoEstructura="";
		sToolTipCentroCostoEstructura=CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCentroCostoEstructura+="(Nomina.CentroCostoEstructura)";
		}
		
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
			sToolTipCentroCostoEstructura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCentroCostoEstructura = new JButtonMe();
		this.jButtonModificarCentroCostoEstructura = new JButtonMe();
        this.jButtonActualizarCentroCostoEstructura = new JButtonMe();
        this.jButtonEliminarCentroCostoEstructura = new JButtonMe();
        this.jButtonCancelarCentroCostoEstructura = new JButtonMe();
        this.jButtonGuardarCambiosCentroCostoEstructura = new JButtonMe();
		this.jButtonGuardarCambiosTablaCentroCostoEstructura = new JButtonMe();
		this.jButtonCerrarCentroCostoEstructura = new JButtonMe();
		
		this.jScrollPanelDatosCentroCostoEstructura = new JScrollPane();   
        this.jScrollPanelDatosEdicionCentroCostoEstructura = new JScrollPane();
		this.jScrollPanelDatosGeneralCentroCostoEstructura = new JScrollPane();
				
		
		
		this.jPanelCamposCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Centro Costo Estructura";
		
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Estructuras" + this.sPath));
		} else {
			this.jScrollPanelDatosCentroCostoEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCentroCostoEstructura.setName("jPanelCamposCentroCostoEstructura"); 

		this.jPanelCamposOcultosCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCentroCostoEstructura.setName("jPanelCamposOcultosCentroCostoEstructura"); 

        this.jPanelAccionesCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCentroCostoEstructura.setToolTipText("Acciones");
        this.jPanelAccionesCentroCostoEstructura.setName("Acciones"); 

		this.jPanelAccionesFormularioCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCentroCostoEstructura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCentroCostoEstructura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCentroCostoEstructura.setText("Nuevo");
		this.jButtonModificarCentroCostoEstructura.setText("Editar");
        this.jButtonActualizarCentroCostoEstructura.setText("Actualizar");
        this.jButtonEliminarCentroCostoEstructura.setText("Eliminar");
        this.jButtonCancelarCentroCostoEstructura.setText("Cancelar");
        this.jButtonGuardarCambiosCentroCostoEstructura.setText("Guardar");
		this.jButtonGuardarCambiosTablaCentroCostoEstructura.setText("Guardar");
		this.jButtonCerrarCentroCostoEstructura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCentroCostoEstructura,"nuevo_button","Nuevo",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCentroCostoEstructura,"modificar_button","Editar",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCentroCostoEstructura,"actualizar_button","Actualizar",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCentroCostoEstructura,"eliminar_button","Eliminar",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCentroCostoEstructura,"cancelar_button","Cancelar",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCentroCostoEstructura,"guardarcambios_button","Guardar",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCentroCostoEstructura,"guardarcambiostabla_button","Guardar",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCentroCostoEstructura,"cerrar_button","Salir",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCentroCostoEstructura.setToolTipText("Nuevo"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCentroCostoEstructura.setToolTipText("Editar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCentroCostoEstructura.setToolTipText("Actualizar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCentroCostoEstructura.setToolTipText("Eliminar)"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCentroCostoEstructura.setToolTipText("Cancelar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCentroCostoEstructura.setToolTipText("Guardar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCentroCostoEstructura.setToolTipText("Guardar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCentroCostoEstructura.setToolTipText("Salir"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCentroCostoEstructura";
		inputMap = this.jButtonNuevoCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCentroCostoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCentroCostoEstructura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCentroCostoEstructura";
		inputMap = this.jButtonActualizarCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCentroCostoEstructura"));
		
		//ELIMINAR
		sMapKey = "EliminarCentroCostoEstructura";
		inputMap = this.jButtonEliminarCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCentroCostoEstructura"));
		
		//CANCELAR	
		sMapKey = "CancelarCentroCostoEstructura";
		inputMap = this.jButtonCancelarCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCentroCostoEstructura"));
		
		//CERRAR		
		sMapKey = "CerrarCentroCostoEstructura";
		inputMap = this.jButtonCerrarCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCentroCostoEstructura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCentroCostoEstructura";
		inputMap = this.jButtonGuardarCambiosTablaCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCentroCostoEstructura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCentroCostoEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCentroCostoEstructura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCentroCostoEstructura.setToolTipText("Nuevo CentroCostoEstructura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCentroCostoEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCentroCostoEstructura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCentroCostoEstructura.setToolTipText("Sin Cerrar Ventana CentroCostoEstructura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCentroCostoEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCentroCostoEstructura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCentroCostoEstructura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCentroCostoEstructura.setText("Accion");
		this.jComboBoxTiposAccionesCentroCostoEstructura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCentroCostoEstructura = new JLabelMe();
		
		this.jLabelAccionesCentroCostoEstructura.setText("Acciones");		
		this.jLabelAccionesCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCentroCostoEstructura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCentroCostoEstructura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCentroCostoEstructura=new JTabbedPane();
		this.jTabbedPaneRelacionesCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCentroCostoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCentroCostoEstructura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCentroCostoEstructura = new GridBagLayout();
		
		this.jPanelCamposCentroCostoEstructura.setLayout(gridaBagLayoutCamposCentroCostoEstructura);
		this.jPanelCamposOcultosCentroCostoEstructura.setLayout(gridaBagLayoutCamposOcultosCentroCostoEstructura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCentroCostoEstructura.add(jLabelIdCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 1;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCentroCostoEstructura.add(jLabelidCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);


	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCentroCostoEstructura.add(jLabelid_empresaCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 2;
		this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
		this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCentroCostoEstructura.add(jButtonid_empresaCentroCostoEstructuraBusqueda, this.gridBagConstraintsCentroCostoEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 3;
		this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
		this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCentroCostoEstructura.add(jButtonid_empresaCentroCostoEstructuraUpdate, this.gridBagConstraintsCentroCostoEstructura);
	}

	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 1;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCentroCostoEstructura.add(jComboBoxid_empresaCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);


	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCentroCostoEstructura.add(jLabelid_sucursalCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 2;
		this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
		this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCentroCostoEstructura.add(jButtonid_sucursalCentroCostoEstructuraBusqueda, this.gridBagConstraintsCentroCostoEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 3;
		this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
		this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCentroCostoEstructura.add(jButtonid_sucursalCentroCostoEstructuraUpdate, this.gridBagConstraintsCentroCostoEstructura);
	}

	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 1;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCentroCostoEstructura.add(jComboBoxid_sucursalCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);


	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraCentroCostoEstructura.add(jLabelid_estructuraCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 2;
		this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
		this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraCentroCostoEstructura.add(jButtonid_estructuraCentroCostoEstructuraBusqueda, this.gridBagConstraintsCentroCostoEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 3;
		this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
		this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraCentroCostoEstructura.add(jButtonid_estructuraCentroCostoEstructuraUpdate, this.gridBagConstraintsCentroCostoEstructura);
	}

	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 1;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraCentroCostoEstructura.add(jComboBoxid_estructuraCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);


	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoCentroCostoEstructura.add(jLabelid_centro_costoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 2;
		this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
		this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCentroCostoEstructura.add(jButtonid_centro_costoCentroCostoEstructuraBusqueda, this.gridBagConstraintsCentroCostoEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 3;
		this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
		this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCentroCostoEstructura.add(jButtonid_centro_costoCentroCostoEstructuraUpdate, this.gridBagConstraintsCentroCostoEstructura);
	}

	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 1;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoCentroCostoEstructura.add(jComboBoxid_centro_costoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);


	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeCentroCostoEstructura.add(jLabelporcentajeCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 2;
		this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
		this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeCentroCostoEstructura.add(jButtonporcentajeCentroCostoEstructuraBusqueda, this.gridBagConstraintsCentroCostoEstructura);
	}

	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
	this.gridBagConstraintsCentroCostoEstructura.gridx = 1;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeCentroCostoEstructura.add(jTextFieldporcentajeCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoEstructura.gridy = iYPanelCamposCentroCostoEstructura;
	this.gridBagConstraintsCentroCostoEstructura.gridx = iXPanelCamposCentroCostoEstructura++;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoEstructura.add(this.jPanelidCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(iXPanelCamposCentroCostoEstructura % 1==0) {
		iXPanelCamposCentroCostoEstructura=0;
		iYPanelCamposCentroCostoEstructura++;
	}
	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoEstructura.gridy = iYPanelCamposCentroCostoEstructura;
	this.gridBagConstraintsCentroCostoEstructura.gridx = iXPanelCamposCentroCostoEstructura++;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoEstructura.add(this.jPanelid_estructuraCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(iXPanelCamposCentroCostoEstructura % 1==0) {
		iXPanelCamposCentroCostoEstructura=0;
		iYPanelCamposCentroCostoEstructura++;
	}
	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoEstructura.gridy = iYPanelCamposCentroCostoEstructura;
	this.gridBagConstraintsCentroCostoEstructura.gridx = iXPanelCamposCentroCostoEstructura++;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoEstructura.add(this.jPanelid_centro_costoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(iXPanelCamposCentroCostoEstructura % 1==0) {
		iXPanelCamposCentroCostoEstructura=0;
		iYPanelCamposCentroCostoEstructura++;
	}
	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoEstructura.gridy = iYPanelCamposCentroCostoEstructura;
	this.gridBagConstraintsCentroCostoEstructura.gridx = iXPanelCamposCentroCostoEstructura++;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoEstructura.add(this.jPanelporcentajeCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(iXPanelCamposCentroCostoEstructura % 1==0) {
		iXPanelCamposCentroCostoEstructura=0;
		iYPanelCamposCentroCostoEstructura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoEstructura.gridy = iYPanelCamposOcultosCentroCostoEstructura;
	this.gridBagConstraintsCentroCostoEstructura.gridx = iXPanelCamposOcultosCentroCostoEstructura++;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCentroCostoEstructura.add(this.jPanelid_empresaCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(iXPanelCamposOcultosCentroCostoEstructura % 1==0) {
		iXPanelCamposOcultosCentroCostoEstructura=0;
		iYPanelCamposOcultosCentroCostoEstructura++;
	}
	this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoEstructura.gridy = iYPanelCamposOcultosCentroCostoEstructura;
	this.gridBagConstraintsCentroCostoEstructura.gridx = iXPanelCamposOcultosCentroCostoEstructura++;
	this.gridBagConstraintsCentroCostoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCentroCostoEstructura.add(this.jPanelid_sucursalCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);



	if(iXPanelCamposOcultosCentroCostoEstructura % 1==0) {
		iXPanelCamposOcultosCentroCostoEstructura=0;
		iYPanelCamposOcultosCentroCostoEstructura++;
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
			
		GridBagLayout gridaBagLayoutAccionesCentroCostoEstructura= new GridBagLayout();
		this.jPanelAccionesCentroCostoEstructura.setLayout(gridaBagLayoutAccionesCentroCostoEstructura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCentroCostoEstructura= new GridBagLayout();
		this.jPanelAccionesFormularioCentroCostoEstructura.setLayout(gridaBagLayoutAccionesFormularioCentroCostoEstructura);
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCentroCostoEstructura.add(this.jComboBoxTiposAccionesFormularioCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCentroCostoEstructura.add(this.jCheckBoxPostAccionNuevoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCentroCostoEstructura.add(this.jCheckBoxPostAccionSinCerrarCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCentroCostoEstructura.add(this.jCheckBoxPostAccionSinMensajeCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccion++;
			
		this.jPanelAccionesCentroCostoEstructura.add(this.jButtonModificarCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);							

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx =iPosXAccion++;
			
		this.jPanelAccionesCentroCostoEstructura.add(this.jButtonEliminarCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
			
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccion++;
		
		this.jPanelAccionesCentroCostoEstructura.add(this.jButtonActualizarCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);


		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccion++;
		
		this.jPanelAccionesCentroCostoEstructura.add(this.jButtonGuardarCambiosCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);	
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;		
		this.gridBagConstraintsCentroCostoEstructura.gridx =iPosXAccion++;
		
		this.jPanelAccionesCentroCostoEstructura.add(this.jButtonCancelarCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCentroCostoEstructura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCentroCostoEstructura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();						
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCostoEstructura.gridx = 0;		
			//this.gridBagConstraintsCentroCostoEstructura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCentroCostoEstructura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCentroCostoEstructura.gridx =0;
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCentroCostoEstructura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CentroCostoEstructuraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCentroCostoEstructura = new CentroCostoEstructuraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Centro Costo Estructura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Centro Costo Estructura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Costo Estructura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CentroCostoEstructuraModel centrocostoestructuraModel=new CentroCostoEstructuraModel(this);
			
			//SI USARA CLASE INTERNA
			//CentroCostoEstructuraModel.CentroCostoEstructuraFocusTraversalPolicy centrocostoestructuraFocusTraversalPolicy = centrocostoestructuraModel.new CentroCostoEstructuraFocusTraversalPolicy(this);
			
			//centrocostoestructuraFocusTraversalPolicy.setcentrocostoestructuraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(centrocostoestructuraModel);
			
			
			this.jContentPaneDetalleCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCentroCostoEstructura = new GridBagLayout();	
			this.jContentPaneDetalleCentroCostoEstructura.setLayout(gridaBagLayoutDetalleCentroCostoEstructura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCentroCostoEstructura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
				this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
					
				
				this.jContentPaneDetalleCentroCostoEstructura.add(jTtoolBarDetalleCentroCostoEstructura, gridBagConstraintsCentroCostoEstructura);								
				
}
			
			this.jScrollPanelDatosEdicionCentroCostoEstructura=   new JScrollPane(jContentPaneDetalleCentroCostoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCentroCostoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCentroCostoEstructura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCentroCostoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
	        
			this.jContentPaneDetalleCentroCostoEstructura.add(jPanelCamposCentroCostoEstructura, gridBagConstraintsCentroCostoEstructura);
			
			
			
			
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
						&& centrocostoestructuraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCentroCostoEstructura= new GridBagConstraints();
						this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
						this.jContentPaneDetalleCentroCostoEstructura.add(this.jTabbedPaneRelacionesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCentroCostoEstructura.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCentroCostoEstructura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
					this.gridBagConstraintsCentroCostoEstructura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
					
				
					this.jContentPaneDetalleCentroCostoEstructura.add(jPanelCamposOcultosCentroCostoEstructura, gridBagConstraintsCentroCostoEstructura);
				
					this.jPanelCamposOcultosCentroCostoEstructura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
	        this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCentroCostoEstructura.add(this.jPanelAccionesFormularioCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);							
			
			
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
	        this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
	        
			
			this.jContentPaneDetalleCentroCostoEstructura.add(this.jPanelAccionesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCentroCostoEstructura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCentroCostoEstructura=   new JScrollPane(this.jPanelCamposCentroCostoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCentroCostoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCentroCostoEstructura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);			
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			
			
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
			
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoEstructura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCentroCostoEstructura;//jContentPane;
		
		return jScrollPanelDatosEdicionCentroCostoEstructura;
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
