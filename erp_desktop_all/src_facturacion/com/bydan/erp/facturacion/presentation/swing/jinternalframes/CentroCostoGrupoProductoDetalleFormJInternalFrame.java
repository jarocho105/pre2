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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.CentroCostoGrupoProductoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class CentroCostoGrupoProductoDetalleFormJInternalFrame extends CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCentroCostoGrupoProducto;
	
	protected JMenuBar jmenuBarDetalleCentroCostoGrupoProducto;
	
	protected JMenu jmenuDetalleCentroCostoGrupoProducto;
	protected JMenu jmenuDetalleArchivoCentroCostoGrupoProducto;
	protected JMenu jmenuDetalleAccionesCentroCostoGrupoProducto;
	protected JMenu jmenuDetalleDatosCentroCostoGrupoProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCentroCostoGrupoProducto;	
	protected GridBagConstraints gridBagConstraintsCentroCostoGrupoProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCentroCostoGrupoProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";
	
	public CentroCostoGrupoProductoSessionBean centrocostogrupoproductoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;	
	
	public CentroCostoGrupoProductoLogic centrocostogrupoproductoLogic;
	
	public JScrollPane jScrollPanelDatosCentroCostoGrupoProducto;
	public JScrollPane jScrollPanelDatosEdicionCentroCostoGrupoProducto;
	public JScrollPane jScrollPanelDatosGeneralCentroCostoGrupoProducto;
	
	protected JPanel jPanelCamposCentroCostoGrupoProducto;    
	protected JPanel jPanelCamposOcultosCentroCostoGrupoProducto;    	
	protected JPanel jPanelAccionesCentroCostoGrupoProducto;
	protected JPanel jPanelAccionesFormularioCentroCostoGrupoProducto;
    
	
	
	protected Integer iXPanelCamposCentroCostoGrupoProducto=0;
	protected Integer iYPanelCamposCentroCostoGrupoProducto=0;
	
	protected Integer iXPanelCamposOcultosCentroCostoGrupoProducto=0;
	protected Integer iYPanelCamposOcultosCentroCostoGrupoProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCentroCostoGrupoProducto;
	public JButton jButtonModificarCentroCostoGrupoProducto;
	public JButton jButtonActualizarCentroCostoGrupoProducto;
    public JButton jButtonEliminarCentroCostoGrupoProducto;
	public JButton jButtonCancelarCentroCostoGrupoProducto;
    public JButton jButtonGuardarCambiosCentroCostoGrupoProducto;
	public JButton jButtonGuardarCambiosTablaCentroCostoGrupoProducto;
	protected JButton jButtonCerrarCentroCostoGrupoProducto;
	
	
	protected JButton jButtonProcesarInformacionCentroCostoGrupoProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCentroCostoGrupoProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCentroCostoGrupoProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCentroCostoGrupoProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCentroCostoGrupoProducto;
	protected JButton jButtonModificarToolBarCentroCostoGrupoProducto;
	protected JButton jButtonActualizarToolBarCentroCostoGrupoProducto;
    protected JButton jButtonEliminarToolBarCentroCostoGrupoProducto;
	protected JButton jButtonCancelarToolBarCentroCostoGrupoProducto;
    protected JButton jButtonGuardarCambiosToolBarCentroCostoGrupoProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarCentroCostoGrupoProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarCentroCostoGrupoProducto;
	protected JButton jButtonCerrarToolBarCentroCostoGrupoProducto;
	
	protected JButton jButtonProcesarInformacionToolBarCentroCostoGrupoProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemModificarCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemActualizarCentroCostoGrupoProducto;
    protected JMenuItem jMenuItemEliminarCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemCancelarCentroCostoGrupoProducto;
    protected JMenuItem jMenuItemGuardarCambiosCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemCerrarCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemDetalleCerrarCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemMostrarOcultarCentroCostoGrupoProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCentroCostoGrupoProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCentroCostoGrupoProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCentroCostoGrupoProducto;
	public JLabel jLabelIdCentroCostoGrupoProducto;
	public JLabel jLabelidCentroCostoGrupoProducto;
	public JButton jButtonidCentroCostoGrupoProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCentroCostoGrupoProducto;
	public JLabel jLabeldescripcionCentroCostoGrupoProducto;
	public JTextArea jTextAreadescripcionCentroCostoGrupoProducto;
	public JScrollPane jscrollPanedescripcionCentroCostoGrupoProducto;
	public JButton jButtondescripcionCentroCostoGrupoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCentroCostoGrupoProducto;
	public JLabel jLabelid_empresaCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCentroCostoGrupoProducto;
	public JButton jButtonid_empresaCentroCostoGrupoProducto= new JButtonMe();
	public JButton jButtonid_empresaCentroCostoGrupoProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCentroCostoGrupoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCentroCostoGrupoProducto;
	public JLabel jLabelid_sucursalCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCentroCostoGrupoProducto;
	public JButton jButtonid_sucursalCentroCostoGrupoProducto= new JButtonMe();
	public JButton jButtonid_sucursalCentroCostoGrupoProductoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCentroCostoGrupoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoCentroCostoGrupoProducto;
	public JLabel jLabelid_centro_costoCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoCentroCostoGrupoProducto;
	public JButton jButtonid_centro_costoCentroCostoGrupoProducto= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoGrupoProductoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoGrupoProductoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoGrupoProductoArbol= new JButtonMe();

	public JPanel jPanelid_lineaCentroCostoGrupoProducto;
	public JLabel jLabelid_lineaCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaCentroCostoGrupoProducto;
	public JButton jButtonid_lineaCentroCostoGrupoProducto= new JButtonMe();
	public JButton jButtonid_lineaCentroCostoGrupoProductoUpdate= new JButtonMe();
	public JButton jButtonid_lineaCentroCostoGrupoProductoBusqueda= new JButtonMe();
	public JButton jButtonid_lineaCentroCostoGrupoProductoArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoCentroCostoGrupoProducto;
	public JLabel jLabelid_linea_grupoCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoCentroCostoGrupoProducto;
	public JButton jButtonid_linea_grupoCentroCostoGrupoProducto= new JButtonMe();
	public JButton jButtonid_linea_grupoCentroCostoGrupoProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoCentroCostoGrupoProductoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCentroCostoGrupoProducto;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CentroCostoGrupoProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCentroCostoGrupoProducto=new JPanel();
				this.jPanelAccionesFormularioCentroCostoGrupoProducto=new JPanel();
				this.jmenuBarDetalleCentroCostoGrupoProducto=new JMenuBar();
				this.jTtoolBarDetalleCentroCostoGrupoProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoGrupoProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CentroCostoGrupoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CentroCostoGrupoProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CentroCostoGrupoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoGrupoProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoGrupoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoGrupoProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoGrupoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoGrupoProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CentroCostoGrupoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCentroCostoGrupoProducto() {
		return this.jButtonActualizarToolBarCentroCostoGrupoProducto;
	}
	
	public JButton getjButtonEliminarToolBarCentroCostoGrupoProducto() {
		return this.jButtonEliminarToolBarCentroCostoGrupoProducto;
	}
	
	public JButton getjButtonCancelarToolBarCentroCostoGrupoProducto() {
		return this.jButtonCancelarToolBarCentroCostoGrupoProducto;
	}		
	
	public JButton getjButtonProcesarInformacionCentroCostoGrupoProducto() {
		return this.jButtonProcesarInformacionCentroCostoGrupoProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCentroCostoGrupoProducto)	{
		this.jButtonProcesarInformacionCentroCostoGrupoProducto = jButtonProcesarInformacionCentroCostoGrupoProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCentroCostoGrupoProducto() {
		return this.jComboBoxTiposAccionesCentroCostoGrupoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCentroCostoGrupoProducto(
			JComboBox jComboBoxTiposRelacionesCentroCostoGrupoProducto) {
		this.jComboBoxTiposRelacionesCentroCostoGrupoProducto = jComboBoxTiposRelacionesCentroCostoGrupoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCentroCostoGrupoProducto(
			JComboBox jComboBoxTiposAccionesCentroCostoGrupoProducto) {
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto = jComboBoxTiposAccionesCentroCostoGrupoProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCentroCostoGrupoProducto() {
		return this.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCentroCostoGrupoProducto(
			JComboBox jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto) {
		this.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto = jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
		
		this.centrocostogrupoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostogrupoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CentroCostoGrupoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CentroCostoGrupoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CentroCostoGrupoProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Centro Costo Grupo Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		CentroCostoGrupoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCentroCostoGrupoProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCentroCostoGrupoProducto=new JButtonMe();
				this.jButtonModificarToolBarCentroCostoGrupoProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCentroCostoGrupoProducto,this.jTtoolBarDetalleCentroCostoGrupoProducto,
							"actualizar","actualizar","Actualizar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCentroCostoGrupoProducto,this.jTtoolBarDetalleCentroCostoGrupoProducto,
							"eliminar","eliminar","Eliminar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCentroCostoGrupoProducto,this.jTtoolBarDetalleCentroCostoGrupoProducto,
							"cancelar","cancelar","Cancelar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCentroCostoGrupoProducto,this.jTtoolBarDetalleCentroCostoGrupoProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCentroCostoGrupoProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCentroCostoGrupoProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCentroCostoGrupoProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCentroCostoGrupoProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCentroCostoGrupoProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCentroCostoGrupoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCentroCostoGrupoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCentroCostoGrupoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCentroCostoGrupoProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCentroCostoGrupoProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCentroCostoGrupoProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCentroCostoGrupoProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCentroCostoGrupoProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCentroCostoGrupoProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCentroCostoGrupoProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCentroCostoGrupoProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCentroCostoGrupoProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCentroCostoGrupoProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCentroCostoGrupoProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCentroCostoGrupoProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCentroCostoGrupoProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCentroCostoGrupoProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCentroCostoGrupoProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCentroCostoGrupoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCentroCostoGrupoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCentroCostoGrupoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCentroCostoGrupoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCentroCostoGrupoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCentroCostoGrupoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCentroCostoGrupoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCentroCostoGrupoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCentroCostoGrupoProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCentroCostoGrupoProducto.add(this.jMenuItemDetalleCerrarCentroCostoGrupoProducto);
		
		this.jmenuDetalleAccionesCentroCostoGrupoProducto.add(this.jMenuItemActualizarCentroCostoGrupoProducto);
		this.jmenuDetalleAccionesCentroCostoGrupoProducto.add(this.jMenuItemEliminarCentroCostoGrupoProducto);
		this.jmenuDetalleAccionesCentroCostoGrupoProducto.add(this.jMenuItemCancelarCentroCostoGrupoProducto);		
		
		//this.jmenuDetalleDatosCentroCostoGrupoProducto.add(this.jMenuItemDetalleAbrirOrderByCentroCostoGrupoProducto);				
		this.jmenuDetalleDatosCentroCostoGrupoProducto.add(this.jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto);				
				
		//this.jmenuDetalleAccionesCentroCostoGrupoProducto.add(this.jMenuItemGuardarCambiosCentroCostoGrupoProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCentroCostoGrupoProducto.add(this.jmenuDetalleArchivoCentroCostoGrupoProducto);		
		this.jmenuBarDetalleCentroCostoGrupoProducto.add(this.jmenuDetalleAccionesCentroCostoGrupoProducto);		
		this.jmenuBarDetalleCentroCostoGrupoProducto.add(this.jmenuDetalleDatosCentroCostoGrupoProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCentroCostoGrupoProducto);				
	}
	
	
	public void inicializarElementosCamposCentroCostoGrupoProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCentroCostoGrupoProducto = new JLabelMe();
		jLabelIdCentroCostoGrupoProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCentroCostoGrupoProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCentroCostoGrupoProducto.setToolTipText(CentroCostoGrupoProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCentroCostoGrupoProducto= new GridBagLayout();

		this.jPanelidCentroCostoGrupoProducto.setLayout(this.gridaBagLayoutCentroCostoGrupoProducto);

		jLabelidCentroCostoGrupoProducto = new JLabel();
		jLabelidCentroCostoGrupoProducto.setText("Id");

		jLabelidCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionCentroCostoGrupoProducto = new JLabelMe();
		this.jLabeldescripcionCentroCostoGrupoProducto.setText(""+CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionCentroCostoGrupoProducto.setToolTipText("Descripcion");
		this.jLabeldescripcionCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCentroCostoGrupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCentroCostoGrupoProducto.setToolTipText(CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCentroCostoGrupoProducto = new GridBagLayout();
		this.jPaneldescripcionCentroCostoGrupoProducto.setLayout(this.gridaBagLayoutCentroCostoGrupoProducto);


		jTextAreadescripcionCentroCostoGrupoProducto= new JTextAreaMe();
		jTextAreadescripcionCentroCostoGrupoProducto.setEnabled(false);
		jTextAreadescripcionCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCentroCostoGrupoProducto.setLineWrap(true);
		jTextAreadescripcionCentroCostoGrupoProducto.setWrapStyleWord(true);
		jTextAreadescripcionCentroCostoGrupoProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCentroCostoGrupoProducto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCentroCostoGrupoProducto = new JScrollPane(jTextAreadescripcionCentroCostoGrupoProducto);
		jscrollPanedescripcionCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionCentroCostoGrupoProductoBusqueda= new JButtonMe();
		this.jButtondescripcionCentroCostoGrupoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCentroCostoGrupoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCentroCostoGrupoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCentroCostoGrupoProductoBusqueda.setText("U");
		this.jButtondescripcionCentroCostoGrupoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCentroCostoGrupoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCentroCostoGrupoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCentroCostoGrupoProductoBusqueda"));

		if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCentroCostoGrupoProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCentroCostoGrupoProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCentroCostoGrupoProducto = new JLabelMe();
		this.jLabelid_empresaCentroCostoGrupoProducto.setText(""+CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCentroCostoGrupoProducto.setToolTipText("Empresa");
		this.jLabelid_empresaCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCentroCostoGrupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCentroCostoGrupoProducto.setToolTipText(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCentroCostoGrupoProducto = new GridBagLayout();
		this.jPanelid_empresaCentroCostoGrupoProducto.setLayout(this.gridaBagLayoutCentroCostoGrupoProducto);


		jComboBoxid_empresaCentroCostoGrupoProducto= new JComboBoxMe();
		jComboBoxid_empresaCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCentroCostoGrupoProducto.setEnabled(false);

		this.jButtonid_empresaCentroCostoGrupoProducto= new JButtonMe();
		this.jButtonid_empresaCentroCostoGrupoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCostoGrupoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCostoGrupoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCostoGrupoProducto.setText("Buscar");
		this.jButtonid_empresaCentroCostoGrupoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCentroCostoGrupoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoGrupoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoGrupoProducto"));

		this.jButtonid_empresaCentroCostoGrupoProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaCentroCostoGrupoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoGrupoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoGrupoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCentroCostoGrupoProductoBusqueda.setText("U");
		this.jButtonid_empresaCentroCostoGrupoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCentroCostoGrupoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoGrupoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoGrupoProductoBusqueda"));

		if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCentroCostoGrupoProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCentroCostoGrupoProductoUpdate= new JButtonMe();
		this.jButtonid_empresaCentroCostoGrupoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoGrupoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoGrupoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCentroCostoGrupoProductoUpdate.setText("U");
		this.jButtonid_empresaCentroCostoGrupoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCentroCostoGrupoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoGrupoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoGrupoProductoUpdate"));



					
		this.jLabelid_sucursalCentroCostoGrupoProducto = new JLabelMe();
		this.jLabelid_sucursalCentroCostoGrupoProducto.setText(""+CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCentroCostoGrupoProducto.setToolTipText("Sucursal");
		this.jLabelid_sucursalCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCentroCostoGrupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCentroCostoGrupoProducto.setToolTipText(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCentroCostoGrupoProducto = new GridBagLayout();
		this.jPanelid_sucursalCentroCostoGrupoProducto.setLayout(this.gridaBagLayoutCentroCostoGrupoProducto);


		jComboBoxid_sucursalCentroCostoGrupoProducto= new JComboBoxMe();
		jComboBoxid_sucursalCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCentroCostoGrupoProducto.setEnabled(false);

		this.jButtonid_sucursalCentroCostoGrupoProducto= new JButtonMe();
		this.jButtonid_sucursalCentroCostoGrupoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCentroCostoGrupoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCentroCostoGrupoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCentroCostoGrupoProducto.setText("Buscar");
		this.jButtonid_sucursalCentroCostoGrupoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCentroCostoGrupoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCentroCostoGrupoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCentroCostoGrupoProducto"));

		this.jButtonid_sucursalCentroCostoGrupoProductoBusqueda= new JButtonMe();
		this.jButtonid_sucursalCentroCostoGrupoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoGrupoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoGrupoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCentroCostoGrupoProductoBusqueda.setText("U");
		this.jButtonid_sucursalCentroCostoGrupoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCentroCostoGrupoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCentroCostoGrupoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCentroCostoGrupoProductoBusqueda"));

		if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCentroCostoGrupoProductoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCentroCostoGrupoProductoUpdate= new JButtonMe();
		this.jButtonid_sucursalCentroCostoGrupoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoGrupoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoGrupoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCentroCostoGrupoProductoUpdate.setText("U");
		this.jButtonid_sucursalCentroCostoGrupoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCentroCostoGrupoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCentroCostoGrupoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCentroCostoGrupoProductoUpdate"));



					
		this.jLabelid_centro_costoCentroCostoGrupoProducto = new JLabelMe();
		this.jLabelid_centro_costoCentroCostoGrupoProducto.setText(""+CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoCentroCostoGrupoProducto.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoCentroCostoGrupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoCentroCostoGrupoProducto.setToolTipText(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutCentroCostoGrupoProducto = new GridBagLayout();
		this.jPanelid_centro_costoCentroCostoGrupoProducto.setLayout(this.gridaBagLayoutCentroCostoGrupoProducto);


		jComboBoxid_centro_costoCentroCostoGrupoProducto= new JComboBoxMe();
		jComboBoxid_centro_costoCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoCentroCostoGrupoProducto= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoGrupoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCostoGrupoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCostoGrupoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCostoGrupoProducto.setText("Buscar");
		this.jButtonid_centro_costoCentroCostoGrupoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoCentroCostoGrupoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoGrupoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoGrupoProducto"));

		this.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda.setText("U");
		this.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoGrupoProductoBusqueda"));

		if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoCentroCostoGrupoProductoUpdate= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoGrupoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoGrupoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoGrupoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCentroCostoGrupoProductoUpdate.setText("U");
		this.jButtonid_centro_costoCentroCostoGrupoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoCentroCostoGrupoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoGrupoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoGrupoProductoUpdate"));


		jButtonid_centro_costoCentroCostoGrupoProductoArbol= new JButtonMe();
		jButtonid_centro_costoCentroCostoGrupoProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoGrupoProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoGrupoProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoGrupoProductoArbol.setText("Arbol");
		jButtonid_centro_costoCentroCostoGrupoProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoCentroCostoGrupoProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoGrupoProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoGrupoProductoArbol"));



					
		this.jLabelid_lineaCentroCostoGrupoProducto = new JLabelMe();
		this.jLabelid_lineaCentroCostoGrupoProducto.setText(""+CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaCentroCostoGrupoProducto.setToolTipText("Linea");
		this.jLabelid_lineaCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaCentroCostoGrupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaCentroCostoGrupoProducto.setToolTipText(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutCentroCostoGrupoProducto = new GridBagLayout();
		this.jPanelid_lineaCentroCostoGrupoProducto.setLayout(this.gridaBagLayoutCentroCostoGrupoProducto);


		jComboBoxid_lineaCentroCostoGrupoProducto= new JComboBoxMe();
		jComboBoxid_lineaCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaCentroCostoGrupoProducto= new JButtonMe();
		this.jButtonid_lineaCentroCostoGrupoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaCentroCostoGrupoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaCentroCostoGrupoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaCentroCostoGrupoProducto.setText("Buscar");
		this.jButtonid_lineaCentroCostoGrupoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaCentroCostoGrupoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaCentroCostoGrupoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaCentroCostoGrupoProducto"));

		this.jButtonid_lineaCentroCostoGrupoProductoBusqueda= new JButtonMe();
		this.jButtonid_lineaCentroCostoGrupoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaCentroCostoGrupoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaCentroCostoGrupoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaCentroCostoGrupoProductoBusqueda.setText("U");
		this.jButtonid_lineaCentroCostoGrupoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaCentroCostoGrupoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaCentroCostoGrupoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaCentroCostoGrupoProductoBusqueda"));

		if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaCentroCostoGrupoProductoBusqueda.setVisible(false);		}

		this.jButtonid_lineaCentroCostoGrupoProductoUpdate= new JButtonMe();
		this.jButtonid_lineaCentroCostoGrupoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaCentroCostoGrupoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaCentroCostoGrupoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaCentroCostoGrupoProductoUpdate.setText("U");
		this.jButtonid_lineaCentroCostoGrupoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaCentroCostoGrupoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaCentroCostoGrupoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaCentroCostoGrupoProductoUpdate"));


		jButtonid_lineaCentroCostoGrupoProductoArbol= new JButtonMe();
		jButtonid_lineaCentroCostoGrupoProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaCentroCostoGrupoProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaCentroCostoGrupoProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaCentroCostoGrupoProductoArbol.setText("Arbol");
		jButtonid_lineaCentroCostoGrupoProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaCentroCostoGrupoProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaCentroCostoGrupoProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaCentroCostoGrupoProductoArbol"));



					
		this.jLabelid_linea_grupoCentroCostoGrupoProducto = new JLabelMe();
		this.jLabelid_linea_grupoCentroCostoGrupoProducto.setText(""+CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoCentroCostoGrupoProducto.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoCentroCostoGrupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoCentroCostoGrupoProducto.setToolTipText(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutCentroCostoGrupoProducto = new GridBagLayout();
		this.jPanelid_linea_grupoCentroCostoGrupoProducto.setLayout(this.gridaBagLayoutCentroCostoGrupoProducto);


		jComboBoxid_linea_grupoCentroCostoGrupoProducto= new JComboBoxMe();
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoCentroCostoGrupoProducto= new JButtonMe();
		this.jButtonid_linea_grupoCentroCostoGrupoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoCentroCostoGrupoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoCentroCostoGrupoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoCentroCostoGrupoProducto.setText("Buscar");
		this.jButtonid_linea_grupoCentroCostoGrupoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoCentroCostoGrupoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoCentroCostoGrupoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoCentroCostoGrupoProducto"));

		this.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda.setText("U");
		this.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoCentroCostoGrupoProductoBusqueda"));

		if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate= new JButtonMe();
		this.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate.setText("U");
		this.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoCentroCostoGrupoProductoUpdate"));


		jButtonid_linea_grupoCentroCostoGrupoProductoArbol= new JButtonMe();
		jButtonid_linea_grupoCentroCostoGrupoProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoCentroCostoGrupoProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoCentroCostoGrupoProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoCentroCostoGrupoProductoArbol.setText("Arbol");
		jButtonid_linea_grupoCentroCostoGrupoProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoCentroCostoGrupoProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoCentroCostoGrupoProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoCentroCostoGrupoProductoArbol"));



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
		//this.jInternalFrameDetalleCentroCostoGrupoProducto = new CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Centro Costo Grupo Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCentroCostoGrupoProducto= new GridBagLayout();
		

		
		String sToolTipCentroCostoGrupoProducto="";
		sToolTipCentroCostoGrupoProducto=CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCentroCostoGrupoProducto+="(Facturacion.CentroCostoGrupoProducto)";
		}
		
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCentroCostoGrupoProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonModificarCentroCostoGrupoProducto = new JButtonMe();
        this.jButtonActualizarCentroCostoGrupoProducto = new JButtonMe();
        this.jButtonEliminarCentroCostoGrupoProducto = new JButtonMe();
        this.jButtonCancelarCentroCostoGrupoProducto = new JButtonMe();
        this.jButtonGuardarCambiosCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonCerrarCentroCostoGrupoProducto = new JButtonMe();
		
		this.jScrollPanelDatosCentroCostoGrupoProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionCentroCostoGrupoProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralCentroCostoGrupoProducto = new JScrollPane();
				
		
		
		this.jPanelCamposCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Centro Costo Grupo Producto";
		
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Grupo Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosCentroCostoGrupoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCentroCostoGrupoProducto.setName("jPanelCamposCentroCostoGrupoProducto"); 

		this.jPanelCamposOcultosCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCentroCostoGrupoProducto.setName("jPanelCamposOcultosCentroCostoGrupoProducto"); 

        this.jPanelAccionesCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCentroCostoGrupoProducto.setToolTipText("Acciones");
        this.jPanelAccionesCentroCostoGrupoProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCentroCostoGrupoProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCentroCostoGrupoProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCentroCostoGrupoProducto.setText("Nuevo");
		this.jButtonModificarCentroCostoGrupoProducto.setText("Editar");
        this.jButtonActualizarCentroCostoGrupoProducto.setText("Actualizar");
        this.jButtonEliminarCentroCostoGrupoProducto.setText("Eliminar");
        this.jButtonCancelarCentroCostoGrupoProducto.setText("Cancelar");
        this.jButtonGuardarCambiosCentroCostoGrupoProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.setText("Guardar");
		this.jButtonCerrarCentroCostoGrupoProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCentroCostoGrupoProducto,"nuevo_button","Nuevo",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCentroCostoGrupoProducto,"modificar_button","Editar",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCentroCostoGrupoProducto,"actualizar_button","Actualizar",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCentroCostoGrupoProducto,"eliminar_button","Eliminar",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCentroCostoGrupoProducto,"cancelar_button","Cancelar",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCentroCostoGrupoProducto,"guardarcambios_button","Guardar",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto,"guardarcambiostabla_button","Guardar",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCentroCostoGrupoProducto,"cerrar_button","Salir",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCentroCostoGrupoProducto.setToolTipText("Nuevo"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCentroCostoGrupoProducto.setToolTipText("Editar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCentroCostoGrupoProducto.setToolTipText("Actualizar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCentroCostoGrupoProducto.setToolTipText("Eliminar)"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCentroCostoGrupoProducto.setToolTipText("Cancelar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCentroCostoGrupoProducto.setToolTipText("Guardar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.setToolTipText("Guardar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCentroCostoGrupoProducto.setToolTipText("Salir"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCentroCostoGrupoProducto";
		inputMap = this.jButtonNuevoCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCentroCostoGrupoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCentroCostoGrupoProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCentroCostoGrupoProducto";
		inputMap = this.jButtonActualizarCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCentroCostoGrupoProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarCentroCostoGrupoProducto";
		inputMap = this.jButtonEliminarCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCentroCostoGrupoProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarCentroCostoGrupoProducto";
		inputMap = this.jButtonCancelarCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCentroCostoGrupoProducto"));
		
		//CERRAR		
		sMapKey = "CerrarCentroCostoGrupoProducto";
		inputMap = this.jButtonCerrarCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCentroCostoGrupoProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCentroCostoGrupoProducto";
		inputMap = this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCentroCostoGrupoProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCentroCostoGrupoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCentroCostoGrupoProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCentroCostoGrupoProducto.setToolTipText("Nuevo CentroCostoGrupoProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCentroCostoGrupoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCentroCostoGrupoProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCentroCostoGrupoProducto.setToolTipText("Sin Cerrar Ventana CentroCostoGrupoProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCentroCostoGrupoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCentroCostoGrupoProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCentroCostoGrupoProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setText("Accion");
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCentroCostoGrupoProducto = new JLabelMe();
		
		this.jLabelAccionesCentroCostoGrupoProducto.setText("Acciones");		
		this.jLabelAccionesCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCentroCostoGrupoProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCentroCostoGrupoProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCentroCostoGrupoProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCentroCostoGrupoProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCentroCostoGrupoProducto = new GridBagLayout();
		
		this.jPanelCamposCentroCostoGrupoProducto.setLayout(gridaBagLayoutCamposCentroCostoGrupoProducto);
		this.jPanelCamposOcultosCentroCostoGrupoProducto.setLayout(gridaBagLayoutCamposOcultosCentroCostoGrupoProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCentroCostoGrupoProducto.add(jLabelIdCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCentroCostoGrupoProducto.add(jLabelidCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);


	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCentroCostoGrupoProducto.add(jLabelid_empresaCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 2;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCentroCostoGrupoProducto.add(jButtonid_empresaCentroCostoGrupoProductoBusqueda, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 3;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCentroCostoGrupoProducto.add(jButtonid_empresaCentroCostoGrupoProductoUpdate, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCentroCostoGrupoProducto.add(jComboBoxid_empresaCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);


	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCentroCostoGrupoProducto.add(jLabelid_sucursalCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 2;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCentroCostoGrupoProducto.add(jButtonid_sucursalCentroCostoGrupoProductoBusqueda, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 3;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCentroCostoGrupoProducto.add(jButtonid_sucursalCentroCostoGrupoProductoUpdate, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCentroCostoGrupoProducto.add(jComboBoxid_sucursalCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);


	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoCentroCostoGrupoProducto.add(jLabelid_centro_costoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 2;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoCentroCostoGrupoProducto.add(jButtonid_centro_costoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 3;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoCentroCostoGrupoProducto.add(jButtonid_centro_costoCentroCostoGrupoProductoArbol, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 4;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCentroCostoGrupoProducto.add(jButtonid_centro_costoCentroCostoGrupoProductoBusqueda, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 5;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCentroCostoGrupoProducto.add(jButtonid_centro_costoCentroCostoGrupoProductoUpdate, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoCentroCostoGrupoProducto.add(jComboBoxid_centro_costoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);


	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaCentroCostoGrupoProducto.add(jLabelid_lineaCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 2;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaCentroCostoGrupoProducto.add(jButtonid_lineaCentroCostoGrupoProductoBusqueda, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 3;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaCentroCostoGrupoProducto.add(jButtonid_lineaCentroCostoGrupoProductoUpdate, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaCentroCostoGrupoProducto.add(jComboBoxid_lineaCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);


	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoCentroCostoGrupoProducto.add(jLabelid_linea_grupoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 2;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoCentroCostoGrupoProducto.add(jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 3;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoCentroCostoGrupoProducto.add(jButtonid_linea_grupoCentroCostoGrupoProductoUpdate, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoCentroCostoGrupoProducto.add(jComboBoxid_linea_grupoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);


	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCentroCostoGrupoProducto.add(jLabeldescripcionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 2;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCentroCostoGrupoProducto.add(jButtondescripcionCentroCostoGrupoProductoBusqueda, this.gridBagConstraintsCentroCostoGrupoProducto);
	}

	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCentroCostoGrupoProducto.add(jscrollPanedescripcionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iYPanelCamposCentroCostoGrupoProducto;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iXPanelCamposCentroCostoGrupoProducto++;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoGrupoProducto.add(this.jPanelidCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(iXPanelCamposCentroCostoGrupoProducto % 1==0) {
		iXPanelCamposCentroCostoGrupoProducto=0;
		iYPanelCamposCentroCostoGrupoProducto++;
	}
	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iYPanelCamposCentroCostoGrupoProducto;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iXPanelCamposCentroCostoGrupoProducto++;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoGrupoProducto.add(this.jPanelid_centro_costoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(iXPanelCamposCentroCostoGrupoProducto % 1==0) {
		iXPanelCamposCentroCostoGrupoProducto=0;
		iYPanelCamposCentroCostoGrupoProducto++;
	}
	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iYPanelCamposCentroCostoGrupoProducto;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iXPanelCamposCentroCostoGrupoProducto++;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoGrupoProducto.add(this.jPanelid_lineaCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(iXPanelCamposCentroCostoGrupoProducto % 1==0) {
		iXPanelCamposCentroCostoGrupoProducto=0;
		iYPanelCamposCentroCostoGrupoProducto++;
	}
	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iYPanelCamposCentroCostoGrupoProducto;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iXPanelCamposCentroCostoGrupoProducto++;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoGrupoProducto.add(this.jPanelid_linea_grupoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(iXPanelCamposCentroCostoGrupoProducto % 1==0) {
		iXPanelCamposCentroCostoGrupoProducto=0;
		iYPanelCamposCentroCostoGrupoProducto++;
	}
	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iYPanelCamposCentroCostoGrupoProducto;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iXPanelCamposCentroCostoGrupoProducto++;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoGrupoProducto.add(this.jPaneldescripcionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(iXPanelCamposCentroCostoGrupoProducto % 1==0) {
		iXPanelCamposCentroCostoGrupoProducto=0;
		iYPanelCamposCentroCostoGrupoProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iYPanelCamposOcultosCentroCostoGrupoProducto;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iXPanelCamposOcultosCentroCostoGrupoProducto++;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCentroCostoGrupoProducto.add(this.jPanelid_empresaCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(iXPanelCamposOcultosCentroCostoGrupoProducto % 1==0) {
		iXPanelCamposOcultosCentroCostoGrupoProducto=0;
		iYPanelCamposOcultosCentroCostoGrupoProducto++;
	}
	this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iYPanelCamposOcultosCentroCostoGrupoProducto;
	this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iXPanelCamposOcultosCentroCostoGrupoProducto++;
	this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoGrupoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCentroCostoGrupoProducto.add(this.jPanelid_sucursalCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);



	if(iXPanelCamposOcultosCentroCostoGrupoProducto % 1==0) {
		iXPanelCamposOcultosCentroCostoGrupoProducto=0;
		iYPanelCamposOcultosCentroCostoGrupoProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesCentroCostoGrupoProducto= new GridBagLayout();
		this.jPanelAccionesCentroCostoGrupoProducto.setLayout(gridaBagLayoutAccionesCentroCostoGrupoProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCentroCostoGrupoProducto= new GridBagLayout();
		this.jPanelAccionesFormularioCentroCostoGrupoProducto.setLayout(gridaBagLayoutAccionesFormularioCentroCostoGrupoProducto);
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCentroCostoGrupoProducto.add(this.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCentroCostoGrupoProducto.add(this.jCheckBoxPostAccionNuevoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCentroCostoGrupoProducto.add(this.jCheckBoxPostAccionSinCerrarCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCentroCostoGrupoProducto.add(this.jCheckBoxPostAccionSinMensajeCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesCentroCostoGrupoProducto.add(this.jButtonModificarCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);							

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesCentroCostoGrupoProducto.add(this.jButtonEliminarCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
			
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesCentroCostoGrupoProducto.add(this.jButtonActualizarCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);


		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesCentroCostoGrupoProducto.add(this.jButtonGuardarCambiosCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);	
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesCentroCostoGrupoProducto.add(this.jButtonCancelarCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCentroCostoGrupoProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCentroCostoGrupoProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();						
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;		
			//this.gridBagConstraintsCentroCostoGrupoProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx =0;
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCentroCostoGrupoProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CentroCostoGrupoProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCentroCostoGrupoProducto = new CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Centro Costo Grupo Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Centro Costo Grupo Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Costo Grupo Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CentroCostoGrupoProductoModel centrocostogrupoproductoModel=new CentroCostoGrupoProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//CentroCostoGrupoProductoModel.CentroCostoGrupoProductoFocusTraversalPolicy centrocostogrupoproductoFocusTraversalPolicy = centrocostogrupoproductoModel.new CentroCostoGrupoProductoFocusTraversalPolicy(this);
			
			//centrocostogrupoproductoFocusTraversalPolicy.setcentrocostogrupoproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(centrocostogrupoproductoModel);
			
			
			this.jContentPaneDetalleCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCentroCostoGrupoProducto = new GridBagLayout();	
			this.jContentPaneDetalleCentroCostoGrupoProducto.setLayout(gridaBagLayoutDetalleCentroCostoGrupoProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCentroCostoGrupoProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
				this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
					
				
				this.jContentPaneDetalleCentroCostoGrupoProducto.add(jTtoolBarDetalleCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);								
				
}
			
			this.jScrollPanelDatosEdicionCentroCostoGrupoProducto=   new JScrollPane(jContentPaneDetalleCentroCostoGrupoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCentroCostoGrupoProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
	        
			this.jContentPaneDetalleCentroCostoGrupoProducto.add(jPanelCamposCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);
			
			
			
			
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
						&& centrocostogrupoproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCentroCostoGrupoProducto= new GridBagConstraints();
						this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
						this.jContentPaneDetalleCentroCostoGrupoProducto.add(this.jTabbedPaneRelacionesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCentroCostoGrupoProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCentroCostoGrupoProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
					this.gridBagConstraintsCentroCostoGrupoProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
					
				
					this.jContentPaneDetalleCentroCostoGrupoProducto.add(jPanelCamposOcultosCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);
				
					this.jPanelCamposOcultosCentroCostoGrupoProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
	        this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCentroCostoGrupoProducto.add(this.jPanelAccionesFormularioCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);							
			
			
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
	        this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleCentroCostoGrupoProducto.add(this.jPanelAccionesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCentroCostoGrupoProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCentroCostoGrupoProducto=   new JScrollPane(this.jPanelCamposCentroCostoGrupoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCentroCostoGrupoProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);			
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			
			
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
			
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCentroCostoGrupoProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionCentroCostoGrupoProducto;
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
