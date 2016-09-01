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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.UbicacionBodeConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class UbicacionBodeDetalleFormJInternalFrame extends UbicacionBodeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUbicacionBode;
	
	protected JMenuBar jmenuBarDetalleUbicacionBode;
	
	protected JMenu jmenuDetalleUbicacionBode;
	protected JMenu jmenuDetalleArchivoUbicacionBode;
	protected JMenu jmenuDetalleAccionesUbicacionBode;
	protected JMenu jmenuDetalleDatosUbicacionBode;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUbicacionBode;	
	protected GridBagConstraints gridBagConstraintsUbicacionBode;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UbicacionBodeBeanSwingJInternalFrameAdditional jInternalFrameDetalleUbicacionBode;		
	
	public UbicacionBodeBeanSwingJInternalFrameTree jInternalFrameTreeUbicacionBode;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ubicacionbode="";
	
	public UbicacionBodeSessionBean ubicacionbodeSessionBean;
	
	

	//public UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrame=null;
	public UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteUbicacionBode=false;

	public UbicacionProduBeanSwingJInternalFrame ubicacionproduBeanSwingJInternalFrame=null;
	public UbicacionProduBeanSwingJInternalFrame ubicacionproduBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteUbicacionProdu=false;
	public UbicacionProduSessionBean ubicacionproduSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;	
	
	public UbicacionBodeLogic ubicacionbodeLogic;
	
	public JScrollPane jScrollPanelDatosUbicacionBode;
	public JScrollPane jScrollPanelDatosEdicionUbicacionBode;
	public JScrollPane jScrollPanelDatosGeneralUbicacionBode;
	
	protected JPanel jPanelCamposUbicacionBode;    
	protected JPanel jPanelCamposOcultosUbicacionBode;    	
	protected JPanel jPanelAccionesUbicacionBode;
	protected JPanel jPanelAccionesFormularioUbicacionBode;
    
	
	
	protected Integer iXPanelCamposUbicacionBode=0;
	protected Integer iYPanelCamposUbicacionBode=0;
	
	protected Integer iXPanelCamposOcultosUbicacionBode=0;
	protected Integer iYPanelCamposOcultosUbicacionBode=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUbicacionBode;
	public JButton jButtonModificarUbicacionBode;
	public JButton jButtonActualizarUbicacionBode;
    public JButton jButtonEliminarUbicacionBode;
	public JButton jButtonCancelarUbicacionBode;
    public JButton jButtonGuardarCambiosUbicacionBode;
	public JButton jButtonGuardarCambiosTablaUbicacionBode;
	protected JButton jButtonCerrarUbicacionBode;
	
	
	protected JButton jButtonProcesarInformacionUbicacionBode;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUbicacionBode;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUbicacionBode;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUbicacionBode;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUbicacionBode;
	protected JButton jButtonModificarToolBarUbicacionBode;
	protected JButton jButtonActualizarToolBarUbicacionBode;
    protected JButton jButtonEliminarToolBarUbicacionBode;
	protected JButton jButtonCancelarToolBarUbicacionBode;
    protected JButton jButtonGuardarCambiosToolBarUbicacionBode;
	protected JButton jButtonGuardarCambiosTablaToolBarUbicacionBode;
	protected JButton jButtonMostrarOcultarTablaToolBarUbicacionBode;
	protected JButton jButtonCerrarToolBarUbicacionBode;
	
	protected JButton jButtonProcesarInformacionToolBarUbicacionBode;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUbicacionBode;
	protected JMenuItem jMenuItemModificarUbicacionBode;
	protected JMenuItem jMenuItemActualizarUbicacionBode;
    protected JMenuItem jMenuItemEliminarUbicacionBode;
	protected JMenuItem jMenuItemCancelarUbicacionBode;
    protected JMenuItem jMenuItemGuardarCambiosUbicacionBode;
	protected JMenuItem jMenuItemGuardarCambiosTablaUbicacionBode;
	protected JMenuItem jMenuItemCerrarUbicacionBode;
	protected JMenuItem jMenuItemDetalleCerrarUbicacionBode;
	protected JMenuItem jMenuItemDetalleMostarOcultarUbicacionBode;
	
	protected JMenuItem jMenuItemProcesarInformacionUbicacionBode;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUbicacionBode;
	protected JMenuItem jMenuItemMostrarOcultarUbicacionBode;
	
	
	//MENU
	
	protected JButton jButtonArbolUbicacionBode;	
	
	protected JLabel jLabelAccionesUbicacionBode;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUbicacionBode;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUbicacionBode;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUbicacionBode;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUbicacionBode;
	public JLabel jLabelIdUbicacionBode;
	public JLabel jLabelidUbicacionBode;
	public JButton jButtonidUbicacionBodeBusqueda= new JButtonMe();

	public JPanel jPanelnombreUbicacionBode;
	public JLabel jLabelnombreUbicacionBode;
	public JTextArea jTextAreanombreUbicacionBode;
	public JScrollPane jscrollPanenombreUbicacionBode;
	public JButton jButtonnombreUbicacionBodeBusqueda= new JButtonMe();

	public JPanel jPanelnivelUbicacionBode;
	public JLabel jLabelnivelUbicacionBode;
	public JTextField jTextFieldnivelUbicacionBode;
	public JButton jButtonnivelUbicacionBodeBusqueda= new JButtonMe();

	public JPanel jPanelordenUbicacionBode;
	public JLabel jLabelordenUbicacionBode;
	public JTextField jTextFieldordenUbicacionBode;
	public JButton jButtonordenUbicacionBodeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaUbicacionBode;
	public JLabel jLabelid_empresaUbicacionBode;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaUbicacionBode;
	public JButton jButtonid_empresaUbicacionBode= new JButtonMe();
	public JButton jButtonid_empresaUbicacionBodeUpdate= new JButtonMe();
	public JButton jButtonid_empresaUbicacionBodeBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalUbicacionBode;
	public JLabel jLabelid_sucursalUbicacionBode;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalUbicacionBode;
	public JButton jButtonid_sucursalUbicacionBode= new JButtonMe();
	public JButton jButtonid_sucursalUbicacionBodeUpdate= new JButtonMe();
	public JButton jButtonid_sucursalUbicacionBodeBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaUbicacionBode;
	public JLabel jLabelid_bodegaUbicacionBode;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaUbicacionBode;
	public JButton jButtonid_bodegaUbicacionBode= new JButtonMe();
	public JButton jButtonid_bodegaUbicacionBodeUpdate= new JButtonMe();
	public JButton jButtonid_bodegaUbicacionBodeBusqueda= new JButtonMe();

	public JPanel jPanelid_ubicacion_bodeUbicacionBode;
	public JLabel jLabelid_ubicacion_bodeUbicacionBode;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ubicacion_bodeUbicacionBode;
	public JButton jButtonid_ubicacion_bodeUbicacionBode= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeUbicacionBodeUpdate= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeUbicacionBodeBusqueda= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeUbicacionBodeArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUbicacionBode;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public UbicacionBodeDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUbicacionBode=new JPanel();
				this.jPanelAccionesFormularioUbicacionBode=new JPanel();
				this.jmenuBarDetalleUbicacionBode=new JMenuBar();
				this.jTtoolBarDetalleUbicacionBode=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionBodeDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("UbicacionBode No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UbicacionBodeDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("UbicacionBode No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionBodeDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UbicacionBode No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionBodeDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UbicacionBode No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionBodeDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UbicacionBode No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUbicacionBode() {
		return this.jButtonActualizarToolBarUbicacionBode;
	}
	
	public JButton getjButtonEliminarToolBarUbicacionBode() {
		return this.jButtonEliminarToolBarUbicacionBode;
	}
	
	public JButton getjButtonCancelarToolBarUbicacionBode() {
		return this.jButtonCancelarToolBarUbicacionBode;
	}		
	
	public JButton getjButtonProcesarInformacionUbicacionBode() {
		return this.jButtonProcesarInformacionUbicacionBode;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUbicacionBode)	{
		this.jButtonProcesarInformacionUbicacionBode = jButtonProcesarInformacionUbicacionBode;
	}
	
	
	public JButton getjButtonArbolUbicacionBode() {
		return this.jButtonArbolUbicacionBode;
	}
	
	public void setjButtonArbol(JButton jButtonArbolUbicacionBode)	{
		this.jButtonArbolUbicacionBode = jButtonArbolUbicacionBode;
	}
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUbicacionBode() {
		return this.jComboBoxTiposAccionesUbicacionBode;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUbicacionBode(
			JComboBox jComboBoxTiposRelacionesUbicacionBode) {
		this.jComboBoxTiposRelacionesUbicacionBode = jComboBoxTiposRelacionesUbicacionBode;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUbicacionBode(
			JComboBox jComboBoxTiposAccionesUbicacionBode) {
		this.jComboBoxTiposAccionesUbicacionBode = jComboBoxTiposAccionesUbicacionBode;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUbicacionBode() {
		return this.jComboBoxTiposAccionesFormularioUbicacionBode;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUbicacionBode(
			JComboBox jComboBoxTiposAccionesFormularioUbicacionBode) {
		this.jComboBoxTiposAccionesFormularioUbicacionBode = jComboBoxTiposAccionesFormularioUbicacionBode;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
		
		this.ubicacionbodeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ubicacionbodeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ubicacionbodeSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
		//this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UbicacionBodeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UbicacionBodeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UbicacionBodeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ubicacion Bode MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
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
	
		UbicacionBodeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUbicacionBode= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUbicacionBode=new JButtonMe();
				this.jButtonModificarToolBarUbicacionBode=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUbicacionBode,this.jTtoolBarDetalleUbicacionBode,
							"actualizar","actualizar","Actualizar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUbicacionBode,this.jTtoolBarDetalleUbicacionBode,
							"eliminar","eliminar","Eliminar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUbicacionBode,this.jTtoolBarDetalleUbicacionBode,
							"cancelar","cancelar","Cancelar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUbicacionBode,this.jTtoolBarDetalleUbicacionBode,
							"guardarcambios","guardarcambios","Guardar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUbicacionBode=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUbicacionBode=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUbicacionBode=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUbicacionBode=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUbicacionBode=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUbicacionBode= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUbicacionBode.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUbicacionBode,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUbicacionBode= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUbicacionBode.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUbicacionBode,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUbicacionBode= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUbicacionBode.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUbicacionBode,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUbicacionBode= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUbicacionBode.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUbicacionBode,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUbicacionBode= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUbicacionBode.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUbicacionBode,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUbicacionBode= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUbicacionBode.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUbicacionBode,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUbicacionBode= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUbicacionBode.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUbicacionBode,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUbicacionBode= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUbicacionBode.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUbicacionBode,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUbicacionBode= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUbicacionBode.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUbicacionBode,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUbicacionBode= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUbicacionBode.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUbicacionBode,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUbicacionBode.add(this.jMenuItemDetalleCerrarUbicacionBode);
		
		this.jmenuDetalleAccionesUbicacionBode.add(this.jMenuItemActualizarUbicacionBode);
		this.jmenuDetalleAccionesUbicacionBode.add(this.jMenuItemEliminarUbicacionBode);
		this.jmenuDetalleAccionesUbicacionBode.add(this.jMenuItemCancelarUbicacionBode);		
		
		//this.jmenuDetalleDatosUbicacionBode.add(this.jMenuItemDetalleAbrirOrderByUbicacionBode);				
		this.jmenuDetalleDatosUbicacionBode.add(this.jMenuItemDetalleMostarOcultarUbicacionBode);				
				
		//this.jmenuDetalleAccionesUbicacionBode.add(this.jMenuItemGuardarCambiosUbicacionBode);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUbicacionBode.add(this.jmenuDetalleArchivoUbicacionBode);		
		this.jmenuBarDetalleUbicacionBode.add(this.jmenuDetalleAccionesUbicacionBode);		
		this.jmenuBarDetalleUbicacionBode.add(this.jmenuDetalleDatosUbicacionBode);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleUbicacionBode.add(this.jmenuDetalleUbicacionBode);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUbicacionBode);				
	}
	
	
	public void inicializarElementosCamposUbicacionBode() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUbicacionBode = new JLabelMe();
		jLabelIdUbicacionBode.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUbicacionBode = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUbicacionBode.setToolTipText(UbicacionBodeConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUbicacionBode= new GridBagLayout();

		this.jPanelidUbicacionBode.setLayout(this.gridaBagLayoutUbicacionBode);

		jLabelidUbicacionBode = new JLabel();
		jLabelidUbicacionBode.setText("Id");

		jLabelidUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreUbicacionBode = new JLabelMe();
		this.jLabelnombreUbicacionBode.setText(""+UbicacionBodeConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreUbicacionBode.setToolTipText("Nombre");
		this.jLabelnombreUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreUbicacionBode=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreUbicacionBode.setToolTipText(UbicacionBodeConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutUbicacionBode = new GridBagLayout();
		this.jPanelnombreUbicacionBode.setLayout(this.gridaBagLayoutUbicacionBode);


		jTextAreanombreUbicacionBode= new JTextAreaMe();
		jTextAreanombreUbicacionBode.setEnabled(false);
		jTextAreanombreUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreUbicacionBode.setLineWrap(true);
		jTextAreanombreUbicacionBode.setWrapStyleWord(true);
		jTextAreanombreUbicacionBode.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreUbicacionBode.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreUbicacionBode = new JScrollPane(jTextAreanombreUbicacionBode);
		jscrollPanenombreUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreUbicacionBodeBusqueda= new JButtonMe();
		this.jButtonnombreUbicacionBodeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreUbicacionBodeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreUbicacionBodeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreUbicacionBodeBusqueda.setText("U");
		this.jButtonnombreUbicacionBodeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreUbicacionBodeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreUbicacionBodeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreUbicacionBodeBusqueda"));

		if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreUbicacionBodeBusqueda.setVisible(false);		}


					
		this.jLabelnivelUbicacionBode = new JLabelMe();
		this.jLabelnivelUbicacionBode.setText(""+UbicacionBodeConstantesFunciones.LABEL_NIVEL+" : *");
		this.jLabelnivelUbicacionBode.setToolTipText("Nivel");
		this.jLabelnivelUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnivelUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnivelUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnivelUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnivelUbicacionBode=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnivelUbicacionBode.setToolTipText(UbicacionBodeConstantesFunciones.LABEL_NIVEL);
		this.gridaBagLayoutUbicacionBode = new GridBagLayout();
		this.jPanelnivelUbicacionBode.setLayout(this.gridaBagLayoutUbicacionBode);


		jTextFieldnivelUbicacionBode= new JTextFieldMe();
		jTextFieldnivelUbicacionBode.setEnabled(false);
		jTextFieldnivelUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnivelUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnivelUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnivelUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnivelUbicacionBode.setText("0");

		this.jButtonnivelUbicacionBodeBusqueda= new JButtonMe();
		this.jButtonnivelUbicacionBodeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnivelUbicacionBodeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnivelUbicacionBodeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnivelUbicacionBodeBusqueda.setText("U");
		this.jButtonnivelUbicacionBodeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnivelUbicacionBodeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnivelUbicacionBodeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnivelUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnivelUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nivelUbicacionBodeBusqueda"));

		if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnivelUbicacionBodeBusqueda.setVisible(false);		}


					
		this.jLabelordenUbicacionBode = new JLabelMe();
		this.jLabelordenUbicacionBode.setText(""+UbicacionBodeConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenUbicacionBode.setToolTipText("Orden");
		this.jLabelordenUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenUbicacionBode=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenUbicacionBode.setToolTipText(UbicacionBodeConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutUbicacionBode = new GridBagLayout();
		this.jPanelordenUbicacionBode.setLayout(this.gridaBagLayoutUbicacionBode);


		jTextFieldordenUbicacionBode= new JTextFieldMe();
		jTextFieldordenUbicacionBode.setEnabled(false);
		jTextFieldordenUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenUbicacionBode.setText("0");

		this.jButtonordenUbicacionBodeBusqueda= new JButtonMe();
		this.jButtonordenUbicacionBodeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenUbicacionBodeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenUbicacionBodeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenUbicacionBodeBusqueda.setText("U");
		this.jButtonordenUbicacionBodeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenUbicacionBodeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenUbicacionBodeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenUbicacionBodeBusqueda"));

		if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenUbicacionBodeBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysUbicacionBode() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaUbicacionBode = new JLabelMe();
		this.jLabelid_empresaUbicacionBode.setText(""+UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaUbicacionBode.setToolTipText("Empresa");
		this.jLabelid_empresaUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaUbicacionBode=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaUbicacionBode.setToolTipText(UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutUbicacionBode = new GridBagLayout();
		this.jPanelid_empresaUbicacionBode.setLayout(this.gridaBagLayoutUbicacionBode);


		jComboBoxid_empresaUbicacionBode= new JComboBoxMe();
		jComboBoxid_empresaUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaUbicacionBode.setEnabled(false);

		this.jButtonid_empresaUbicacionBode= new JButtonMe();
		this.jButtonid_empresaUbicacionBode.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUbicacionBode.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUbicacionBode.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUbicacionBode.setText("Buscar");
		this.jButtonid_empresaUbicacionBode.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaUbicacionBode.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUbicacionBode,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUbicacionBode"));

		this.jButtonid_empresaUbicacionBodeBusqueda= new JButtonMe();
		this.jButtonid_empresaUbicacionBodeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUbicacionBodeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUbicacionBodeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUbicacionBodeBusqueda.setText("U");
		this.jButtonid_empresaUbicacionBodeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaUbicacionBodeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUbicacionBodeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUbicacionBodeBusqueda"));

		if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaUbicacionBodeBusqueda.setVisible(false);		}

		this.jButtonid_empresaUbicacionBodeUpdate= new JButtonMe();
		this.jButtonid_empresaUbicacionBodeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUbicacionBodeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUbicacionBodeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUbicacionBodeUpdate.setText("U");
		this.jButtonid_empresaUbicacionBodeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaUbicacionBodeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUbicacionBodeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUbicacionBodeUpdate"));



					
		this.jLabelid_sucursalUbicacionBode = new JLabelMe();
		this.jLabelid_sucursalUbicacionBode.setText(""+UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalUbicacionBode.setToolTipText("Sucursal");
		this.jLabelid_sucursalUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalUbicacionBode=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalUbicacionBode.setToolTipText(UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutUbicacionBode = new GridBagLayout();
		this.jPanelid_sucursalUbicacionBode.setLayout(this.gridaBagLayoutUbicacionBode);


		jComboBoxid_sucursalUbicacionBode= new JComboBoxMe();
		jComboBoxid_sucursalUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalUbicacionBode.setEnabled(false);

		this.jButtonid_sucursalUbicacionBode= new JButtonMe();
		this.jButtonid_sucursalUbicacionBode.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUbicacionBode.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUbicacionBode.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUbicacionBode.setText("Buscar");
		this.jButtonid_sucursalUbicacionBode.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalUbicacionBode.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUbicacionBode,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUbicacionBode"));

		this.jButtonid_sucursalUbicacionBodeBusqueda= new JButtonMe();
		this.jButtonid_sucursalUbicacionBodeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUbicacionBodeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUbicacionBodeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalUbicacionBodeBusqueda.setText("U");
		this.jButtonid_sucursalUbicacionBodeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalUbicacionBodeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUbicacionBodeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUbicacionBodeBusqueda"));

		if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalUbicacionBodeBusqueda.setVisible(false);		}

		this.jButtonid_sucursalUbicacionBodeUpdate= new JButtonMe();
		this.jButtonid_sucursalUbicacionBodeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUbicacionBodeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUbicacionBodeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalUbicacionBodeUpdate.setText("U");
		this.jButtonid_sucursalUbicacionBodeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalUbicacionBodeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUbicacionBodeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUbicacionBodeUpdate"));



					
		this.jLabelid_bodegaUbicacionBode = new JLabelMe();
		this.jLabelid_bodegaUbicacionBode.setText(""+UbicacionBodeConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaUbicacionBode.setToolTipText("Bodega");
		this.jLabelid_bodegaUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaUbicacionBode=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaUbicacionBode.setToolTipText(UbicacionBodeConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutUbicacionBode = new GridBagLayout();
		this.jPanelid_bodegaUbicacionBode.setLayout(this.gridaBagLayoutUbicacionBode);


		jComboBoxid_bodegaUbicacionBode= new JComboBoxMe();
		jComboBoxid_bodegaUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaUbicacionBode= new JButtonMe();
		this.jButtonid_bodegaUbicacionBode.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaUbicacionBode.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaUbicacionBode.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaUbicacionBode.setText("Buscar");
		this.jButtonid_bodegaUbicacionBode.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaUbicacionBode.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaUbicacionBode,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaUbicacionBode"));

		this.jButtonid_bodegaUbicacionBodeBusqueda= new JButtonMe();
		this.jButtonid_bodegaUbicacionBodeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUbicacionBodeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUbicacionBodeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaUbicacionBodeBusqueda.setText("U");
		this.jButtonid_bodegaUbicacionBodeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaUbicacionBodeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaUbicacionBodeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaUbicacionBodeBusqueda"));

		if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaUbicacionBodeBusqueda.setVisible(false);		}

		this.jButtonid_bodegaUbicacionBodeUpdate= new JButtonMe();
		this.jButtonid_bodegaUbicacionBodeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUbicacionBodeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUbicacionBodeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaUbicacionBodeUpdate.setText("U");
		this.jButtonid_bodegaUbicacionBodeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaUbicacionBodeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaUbicacionBodeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaUbicacionBodeUpdate"));



					
		this.jLabelid_ubicacion_bodeUbicacionBode = new JLabelMe();
		this.jLabelid_ubicacion_bodeUbicacionBode.setText(""+UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE+" : *");
		this.jLabelid_ubicacion_bodeUbicacionBode.setToolTipText("Ubicacion Bodega");
		this.jLabelid_ubicacion_bodeUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_ubicacion_bodeUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_ubicacion_bodeUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ubicacion_bodeUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ubicacion_bodeUbicacionBode=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ubicacion_bodeUbicacionBode.setToolTipText(UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE);
		this.gridaBagLayoutUbicacionBode = new GridBagLayout();
		this.jPanelid_ubicacion_bodeUbicacionBode.setLayout(this.gridaBagLayoutUbicacionBode);


		jComboBoxid_ubicacion_bodeUbicacionBode= new JComboBoxMe();
		jComboBoxid_ubicacion_bodeUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ubicacion_bodeUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ubicacion_bodeUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ubicacion_bodeUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ubicacion_bodeUbicacionBode= new JButtonMe();
		this.jButtonid_ubicacion_bodeUbicacionBode.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ubicacion_bodeUbicacionBode.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ubicacion_bodeUbicacionBode.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ubicacion_bodeUbicacionBode.setText("Buscar");
		this.jButtonid_ubicacion_bodeUbicacionBode.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ubicacion_bodeUbicacionBode.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ubicacion_bodeUbicacionBode,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ubicacion_bodeUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ubicacion_bodeUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ubicacion_bodeUbicacionBode"));

		this.jButtonid_ubicacion_bodeUbicacionBodeBusqueda= new JButtonMe();
		this.jButtonid_ubicacion_bodeUbicacionBodeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ubicacion_bodeUbicacionBodeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ubicacion_bodeUbicacionBodeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ubicacion_bodeUbicacionBodeBusqueda.setText("U");
		this.jButtonid_ubicacion_bodeUbicacionBodeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ubicacion_bodeUbicacionBodeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ubicacion_bodeUbicacionBodeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ubicacion_bodeUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ubicacion_bodeUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ubicacion_bodeUbicacionBodeBusqueda"));

		if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ubicacion_bodeUbicacionBodeBusqueda.setVisible(false);		}

		this.jButtonid_ubicacion_bodeUbicacionBodeUpdate= new JButtonMe();
		this.jButtonid_ubicacion_bodeUbicacionBodeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ubicacion_bodeUbicacionBodeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ubicacion_bodeUbicacionBodeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ubicacion_bodeUbicacionBodeUpdate.setText("U");
		this.jButtonid_ubicacion_bodeUbicacionBodeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ubicacion_bodeUbicacionBodeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ubicacion_bodeUbicacionBodeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ubicacion_bodeUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ubicacion_bodeUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ubicacion_bodeUbicacionBodeUpdate"));


		jButtonid_ubicacion_bodeUbicacionBodeArbol= new JButtonMe();
		jButtonid_ubicacion_bodeUbicacionBodeArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_ubicacion_bodeUbicacionBodeArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_ubicacion_bodeUbicacionBodeArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_ubicacion_bodeUbicacionBodeArbol.setText("Arbol");
		jButtonid_ubicacion_bodeUbicacionBodeArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_ubicacion_bodeUbicacionBodeArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ubicacion_bodeUbicacionBodeArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_ubicacion_bodeUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ubicacion_bodeUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ubicacion_bodeUbicacionBodeArbol"));



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
		//this.jInternalFrameDetalleUbicacionBode = new UbicacionBodeBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ubicacion Bode DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUbicacionBode= new GridBagLayout();
		

		
		String sToolTipUbicacionBode="";
		sToolTipUbicacionBode=UbicacionBodeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUbicacionBode+="(Inventario.UbicacionBode)";
		}
		
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			sToolTipUbicacionBode+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUbicacionBode = new JButtonMe();
		this.jButtonModificarUbicacionBode = new JButtonMe();
        this.jButtonActualizarUbicacionBode = new JButtonMe();
        this.jButtonEliminarUbicacionBode = new JButtonMe();
        this.jButtonCancelarUbicacionBode = new JButtonMe();
        this.jButtonGuardarCambiosUbicacionBode = new JButtonMe();
		this.jButtonGuardarCambiosTablaUbicacionBode = new JButtonMe();
		this.jButtonCerrarUbicacionBode = new JButtonMe();
		
		this.jScrollPanelDatosUbicacionBode = new JScrollPane();   
        this.jScrollPanelDatosEdicionUbicacionBode = new JScrollPane();
		this.jScrollPanelDatosGeneralUbicacionBode = new JScrollPane();
				
		
		
		this.jPanelCamposUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ubicacion Bode";
		
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Bodes" + this.sPath));
		} else {
			this.jScrollPanelDatosUbicacionBode.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUbicacionBode.setName("jPanelCamposUbicacionBode"); 

		this.jPanelCamposOcultosUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUbicacionBode.setName("jPanelCamposOcultosUbicacionBode"); 

        this.jPanelAccionesUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUbicacionBode.setToolTipText("Acciones");
        this.jPanelAccionesUbicacionBode.setName("Acciones"); 

		this.jPanelAccionesFormularioUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUbicacionBode.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUbicacionBode.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUbicacionBode.setText("Nuevo");
		this.jButtonModificarUbicacionBode.setText("Editar");
        this.jButtonActualizarUbicacionBode.setText("Actualizar");
        this.jButtonEliminarUbicacionBode.setText("Eliminar");
        this.jButtonCancelarUbicacionBode.setText("Cancelar");
        this.jButtonGuardarCambiosUbicacionBode.setText("Guardar");
		this.jButtonGuardarCambiosTablaUbicacionBode.setText("Guardar");
		this.jButtonCerrarUbicacionBode.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUbicacionBode,"nuevo_button","Nuevo",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUbicacionBode,"modificar_button","Editar",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUbicacionBode,"actualizar_button","Actualizar",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUbicacionBode,"eliminar_button","Eliminar",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUbicacionBode,"cancelar_button","Cancelar",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUbicacionBode,"guardarcambios_button","Guardar",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUbicacionBode,"guardarcambiostabla_button","Guardar",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUbicacionBode,"cerrar_button","Salir",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUbicacionBode.setToolTipText("Nuevo"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUbicacionBode.setToolTipText("Editar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUbicacionBode.setToolTipText("Actualizar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUbicacionBode.setToolTipText("Eliminar)"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUbicacionBode.setToolTipText("Cancelar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUbicacionBode.setToolTipText("Guardar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUbicacionBode.setToolTipText("Guardar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUbicacionBode.setToolTipText("Salir"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUbicacionBode";
		inputMap = this.jButtonNuevoUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUbicacionBode.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUbicacionBode"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUbicacionBode";
		inputMap = this.jButtonActualizarUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUbicacionBode"));
		
		//ELIMINAR
		sMapKey = "EliminarUbicacionBode";
		inputMap = this.jButtonEliminarUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUbicacionBode"));
		
		//CANCELAR	
		sMapKey = "CancelarUbicacionBode";
		inputMap = this.jButtonCancelarUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUbicacionBode"));
		
		//CERRAR		
		sMapKey = "CerrarUbicacionBode";
		inputMap = this.jButtonCerrarUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUbicacionBode"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUbicacionBode";
		inputMap = this.jButtonGuardarCambiosTablaUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUbicacionBode"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUbicacionBode = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUbicacionBode.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUbicacionBode.setToolTipText("Nuevo UbicacionBode");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUbicacionBode = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUbicacionBode.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUbicacionBode.setToolTipText("Sin Cerrar Ventana UbicacionBode");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUbicacionBode = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUbicacionBode.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUbicacionBode.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
		this.jButtonArbolUbicacionBode = new JButtonMe();
		this.jButtonArbolUbicacionBode.setText("Arbol");		
		this.jButtonArbolUbicacionBode.setToolTipText("Buscar Por Arbol");
				
		
			
			
		this.jComboBoxTiposAccionesUbicacionBode = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUbicacionBode.setText("Accion");
		this.jComboBoxTiposAccionesUbicacionBode.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUbicacionBode = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUbicacionBode.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUbicacionBode.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUbicacionBode = new JLabelMe();
		
		this.jLabelAccionesUbicacionBode.setText("Acciones");		
		this.jLabelAccionesUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUbicacionBode();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUbicacionBode();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUbicacionBode=new JTabbedPane();
		this.jTabbedPaneRelacionesUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUbicacionBode,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		this.jButtonArbolUbicacionBode.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolUbicacionBode.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolUbicacionBode.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposAccionesUbicacionBode.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUbicacionBode.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUbicacionBode.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUbicacionBode.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUbicacionBode.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUbicacionBode.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUbicacionBode = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUbicacionBode = new GridBagLayout();
		
		this.jPanelCamposUbicacionBode.setLayout(gridaBagLayoutCamposUbicacionBode);
		this.jPanelCamposOcultosUbicacionBode.setLayout(gridaBagLayoutCamposOcultosUbicacionBode);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 0;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUbicacionBode.add(jLabelIdUbicacionBode, this.gridBagConstraintsUbicacionBode);



	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 1;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUbicacionBode.add(jLabelidUbicacionBode, this.gridBagConstraintsUbicacionBode);


	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 0;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaUbicacionBode.add(jLabelid_empresaUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 2;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUbicacionBode.add(jButtonid_empresaUbicacionBodeBusqueda, this.gridBagConstraintsUbicacionBode);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 3;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUbicacionBode.add(jButtonid_empresaUbicacionBodeUpdate, this.gridBagConstraintsUbicacionBode);
	}

	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 1;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaUbicacionBode.add(jComboBoxid_empresaUbicacionBode, this.gridBagConstraintsUbicacionBode);


	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 0;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalUbicacionBode.add(jLabelid_sucursalUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 2;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalUbicacionBode.add(jButtonid_sucursalUbicacionBodeBusqueda, this.gridBagConstraintsUbicacionBode);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 3;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalUbicacionBode.add(jButtonid_sucursalUbicacionBodeUpdate, this.gridBagConstraintsUbicacionBode);
	}

	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 1;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalUbicacionBode.add(jComboBoxid_sucursalUbicacionBode, this.gridBagConstraintsUbicacionBode);


	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 0;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaUbicacionBode.add(jLabelid_bodegaUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 2;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaUbicacionBode.add(jButtonid_bodegaUbicacionBodeBusqueda, this.gridBagConstraintsUbicacionBode);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 3;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaUbicacionBode.add(jButtonid_bodegaUbicacionBodeUpdate, this.gridBagConstraintsUbicacionBode);
	}

	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 1;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaUbicacionBode.add(jComboBoxid_bodegaUbicacionBode, this.gridBagConstraintsUbicacionBode);


	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 0;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ubicacion_bodeUbicacionBode.add(jLabelid_ubicacion_bodeUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 2;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ubicacion_bodeUbicacionBode.add(jButtonid_ubicacion_bodeUbicacionBodeBusqueda, this.gridBagConstraintsUbicacionBode);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 3;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ubicacion_bodeUbicacionBode.add(jButtonid_ubicacion_bodeUbicacionBodeUpdate, this.gridBagConstraintsUbicacionBode);
	}

	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 1;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ubicacion_bodeUbicacionBode.add(jComboBoxid_ubicacion_bodeUbicacionBode, this.gridBagConstraintsUbicacionBode);


	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 0;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreUbicacionBode.add(jLabelnombreUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 2;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreUbicacionBode.add(jButtonnombreUbicacionBodeBusqueda, this.gridBagConstraintsUbicacionBode);
	}

	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 1;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreUbicacionBode.add(jscrollPanenombreUbicacionBode, this.gridBagConstraintsUbicacionBode);


	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 0;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnivelUbicacionBode.add(jLabelnivelUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 2;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelnivelUbicacionBode.add(jButtonnivelUbicacionBodeBusqueda, this.gridBagConstraintsUbicacionBode);
	}

	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 1;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnivelUbicacionBode.add(jTextFieldnivelUbicacionBode, this.gridBagConstraintsUbicacionBode);


	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 0;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenUbicacionBode.add(jLabelordenUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 2;
		this.gridBagConstraintsUbicacionBode.ipadx = 0;
		this.gridBagConstraintsUbicacionBode.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenUbicacionBode.add(jButtonordenUbicacionBodeBusqueda, this.gridBagConstraintsUbicacionBode);
	}

	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionBode.gridy = 0;
	this.gridBagConstraintsUbicacionBode.gridx = 1;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenUbicacionBode.add(jTextFieldordenUbicacionBode, this.gridBagConstraintsUbicacionBode);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionBode.gridy = iYPanelCamposUbicacionBode;
	this.gridBagConstraintsUbicacionBode.gridx = iXPanelCamposUbicacionBode++;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUbicacionBode.add(this.jPanelidUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(iXPanelCamposUbicacionBode % 1==0) {
		iXPanelCamposUbicacionBode=0;
		iYPanelCamposUbicacionBode++;
	}
	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionBode.gridy = iYPanelCamposUbicacionBode;
	this.gridBagConstraintsUbicacionBode.gridx = iXPanelCamposUbicacionBode++;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUbicacionBode.add(this.jPanelid_bodegaUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(iXPanelCamposUbicacionBode % 1==0) {
		iXPanelCamposUbicacionBode=0;
		iYPanelCamposUbicacionBode++;
	}
	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionBode.gridy = iYPanelCamposUbicacionBode;
	this.gridBagConstraintsUbicacionBode.gridx = iXPanelCamposUbicacionBode++;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUbicacionBode.add(this.jPanelid_ubicacion_bodeUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(iXPanelCamposUbicacionBode % 1==0) {
		iXPanelCamposUbicacionBode=0;
		iYPanelCamposUbicacionBode++;
	}
	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionBode.gridy = iYPanelCamposUbicacionBode;
	this.gridBagConstraintsUbicacionBode.gridx = iXPanelCamposUbicacionBode++;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUbicacionBode.add(this.jPanelnombreUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(iXPanelCamposUbicacionBode % 1==0) {
		iXPanelCamposUbicacionBode=0;
		iYPanelCamposUbicacionBode++;
	}
	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionBode.gridy = iYPanelCamposUbicacionBode;
	this.gridBagConstraintsUbicacionBode.gridx = iXPanelCamposUbicacionBode++;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUbicacionBode.add(this.jPanelnivelUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(iXPanelCamposUbicacionBode % 1==0) {
		iXPanelCamposUbicacionBode=0;
		iYPanelCamposUbicacionBode++;
	}
	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionBode.gridy = iYPanelCamposUbicacionBode;
	this.gridBagConstraintsUbicacionBode.gridx = iXPanelCamposUbicacionBode++;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUbicacionBode.add(this.jPanelordenUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(iXPanelCamposUbicacionBode % 1==0) {
		iXPanelCamposUbicacionBode=0;
		iYPanelCamposUbicacionBode++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionBode.gridy = iYPanelCamposOcultosUbicacionBode;
	this.gridBagConstraintsUbicacionBode.gridx = iXPanelCamposOcultosUbicacionBode++;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUbicacionBode.add(this.jPanelid_empresaUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(iXPanelCamposOcultosUbicacionBode % 1==0) {
		iXPanelCamposOcultosUbicacionBode=0;
		iYPanelCamposOcultosUbicacionBode++;
	}
	this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionBode.gridy = iYPanelCamposOcultosUbicacionBode;
	this.gridBagConstraintsUbicacionBode.gridx = iXPanelCamposOcultosUbicacionBode++;
	this.gridBagConstraintsUbicacionBode.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionBode.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUbicacionBode.add(this.jPanelid_sucursalUbicacionBode, this.gridBagConstraintsUbicacionBode);



	if(iXPanelCamposOcultosUbicacionBode % 1==0) {
		iXPanelCamposOcultosUbicacionBode=0;
		iYPanelCamposOcultosUbicacionBode++;
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
			
		GridBagLayout gridaBagLayoutAccionesUbicacionBode= new GridBagLayout();
		this.jPanelAccionesUbicacionBode.setLayout(gridaBagLayoutAccionesUbicacionBode);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUbicacionBode= new GridBagLayout();
		this.jPanelAccionesFormularioUbicacionBode.setLayout(gridaBagLayoutAccionesFormularioUbicacionBode);
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUbicacionBode.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUbicacionBode.add(this.jComboBoxTiposAccionesFormularioUbicacionBode, this.gridBagConstraintsUbicacionBode);

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUbicacionBode.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUbicacionBode.add(this.jCheckBoxPostAccionNuevoUbicacionBode, this.gridBagConstraintsUbicacionBode);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUbicacionBode.add(this.jCheckBoxPostAccionSinCerrarUbicacionBode, this.gridBagConstraintsUbicacionBode);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUbicacionBode.add(this.jCheckBoxPostAccionSinMensajeUbicacionBode, this.gridBagConstraintsUbicacionBode);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = iPosXAccion++;
			
		this.jPanelAccionesUbicacionBode.add(this.jButtonModificarUbicacionBode, this.gridBagConstraintsUbicacionBode);							

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx =iPosXAccion++;
			
		this.jPanelAccionesUbicacionBode.add(this.jButtonEliminarUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
			
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = 0;		
		this.gridBagConstraintsUbicacionBode.gridx = iPosXAccion++;
		
		this.jPanelAccionesUbicacionBode.add(this.jButtonActualizarUbicacionBode, this.gridBagConstraintsUbicacionBode);


		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = 0;		
		this.gridBagConstraintsUbicacionBode.gridx = iPosXAccion++;
		
		this.jPanelAccionesUbicacionBode.add(this.jButtonGuardarCambiosUbicacionBode, this.gridBagConstraintsUbicacionBode);	
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = 0;		
		this.gridBagConstraintsUbicacionBode.gridx =iPosXAccion++;
		
		this.jPanelAccionesUbicacionBode.add(this.jButtonCancelarUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUbicacionBode = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUbicacionBode);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();						
			this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUbicacionBode.gridx = 0;		
			//this.gridBagConstraintsUbicacionBode.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUbicacionBode.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUbicacionBode.gridx =0;
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUbicacionBode.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUbicacionBode, this.gridBagConstraintsUbicacionBode);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeUbicacionBode = new UbicacionBodeBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeUbicacionBode.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeUbicacionBode.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeUbicacionBode.setTitle("Ubicacion Bode ARBOL");
		this.jInternalFrameTreeUbicacionBode.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ubicacion Bode Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeUbicacionBode.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeUbicacionBode.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeUbicacionBode.setResizable(true);
	    this.jInternalFrameTreeUbicacionBode.setClosable(true);
	    this.jInternalFrameTreeUbicacionBode.setMaximizable(true);
			
			
		//if(UbicacionBodeJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUbicacionBode = new UbicacionBodeBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ubicacion Bode DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ubicacion Bode DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ubicacion Bode Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UbicacionBodeModel ubicacionbodeModel=new UbicacionBodeModel(this);
			
			//SI USARA CLASE INTERNA
			//UbicacionBodeModel.UbicacionBodeFocusTraversalPolicy ubicacionbodeFocusTraversalPolicy = ubicacionbodeModel.new UbicacionBodeFocusTraversalPolicy(this);
			
			//ubicacionbodeFocusTraversalPolicy.setubicacionbodeJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ubicacionbodeModel);
			
			
			this.jContentPaneDetalleUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUbicacionBode = new GridBagLayout();	
			this.jContentPaneDetalleUbicacionBode.setLayout(gridaBagLayoutDetalleUbicacionBode);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUbicacionBode = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
				this.gridBagConstraintsUbicacionBode.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUbicacionBode.gridx = 0;
					
				
				this.jContentPaneDetalleUbicacionBode.add(jTtoolBarDetalleUbicacionBode, gridBagConstraintsUbicacionBode);								
				
}
			
			this.jScrollPanelDatosEdicionUbicacionBode=   new JScrollPane(jContentPaneDetalleUbicacionBode,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUbicacionBode.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUbicacionBode.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUbicacionBode.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUbicacionBode=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUbicacionBode.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUbicacionBode.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUbicacionBode.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUbicacionBode.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUbicacionBode.gridx = 0;
	        
			this.jContentPaneDetalleUbicacionBode.add(jPanelCamposUbicacionBode, gridBagConstraintsUbicacionBode);
			
			
			
			
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
						&& ubicacionbodeSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameUbicacionBode(this.puedeCargarPorParteUbicacionBode,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUbicacionProdu(this.puedeCargarPorParteUbicacionProdu,false,-1);
					
					if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUbicacionBode= new GridBagConstraints();
						this.gridBagConstraintsUbicacionBode.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUbicacionBode.gridx = 0;
						this.jContentPaneDetalleUbicacionBode.add(this.jTabbedPaneRelacionesUbicacionBode, this.gridBagConstraintsUbicacionBode);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUbicacionBode.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameUbicacionBode(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUbicacionProdu(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUbicacionBode.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
					this.gridBagConstraintsUbicacionBode.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUbicacionBode.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUbicacionBode.gridx = 0;
					
				
					this.jContentPaneDetalleUbicacionBode.add(jPanelCamposOcultosUbicacionBode, gridBagConstraintsUbicacionBode);
				
					this.jPanelCamposOcultosUbicacionBode.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsUbicacionBode.gridx = 0;
	        this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUbicacionBode.add(this.jPanelAccionesFormularioUbicacionBode, this.gridBagConstraintsUbicacionBode);							
			
			
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
	        this.gridBagConstraintsUbicacionBode.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsUbicacionBode.gridx = 0;
	        
			
			this.jContentPaneDetalleUbicacionBode.add(this.jPanelAccionesUbicacionBode, this.gridBagConstraintsUbicacionBode);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUbicacionBode);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUbicacionBode=   new JScrollPane(this.jPanelCamposUbicacionBode,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUbicacionBode.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUbicacionBode.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUbicacionBode.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUbicacionBode.gridx = 0;
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUbicacionBode.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUbicacionBode, this.gridBagConstraintsUbicacionBode);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUbicacionBode.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUbicacionBode, this.gridBagConstraintsUbicacionBode);			
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUbicacionBode.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUbicacionBode, this.gridBagConstraintsUbicacionBode);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionBode.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUbicacionBode, this.gridBagConstraintsUbicacionBode);
			
			
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionBode.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
			
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionBode.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUbicacionBode, this.gridBagConstraintsUbicacionBode);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUbicacionBode;//jContentPane;
		
		return jScrollPanelDatosEdicionUbicacionBode;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameUbicacionBode(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
		this.ubicacionbodeSessionBean.setConGuardarRelaciones(false);
		//this.ubicacionbodeSessionBean.setEsGuardarRelacionado(true);

		this.ubicacionbodeBeanSwingJInternalFrame=null;//new UbicacionBodeBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.ubicacionbodeBeanSwingJInternalFramePopup=new UbicacionBodeBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.ubicacionbodeBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
				UbicacionBodeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UbicacionBodeJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.ubicacionbodeSessionBean.setEsGuardarRelacionado(true);

				this.ubicacionbodeBeanSwingJInternalFrame=new UbicacionBodeBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.ubicacionbodeBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.ubicacionbodeBeanSwingJInternalFrame.setubicacionbodeSessionBean(this.ubicacionbodeSessionBean);

				//this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
				//this.gridBagConstraintsUbicacionBode.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUbicacionBode.gridx = 0;
				//this.jContentPaneDetalleUbicacionBode.add(this.ubicacionbodeBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUbicacionBode);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUbicacionBode.add("Ubicacion Bodes",this.ubicacionbodeBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUbicacionBode.setComponentAt(iIndexTab,this.ubicacionbodeBeanSwingJInternalFrame.getContentPane());
				}

				//UbicacionBodeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.ubicacionbodeSessionBean.setEsGuardarRelacionado(false);
				this.ubicacionbodeBeanSwingJInternalFrame=null;//new UbicacionBodeBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteUbicacionBode) {
					this.jTabbedPaneRelacionesUbicacionBode.add("Ubicacion Bodes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameUbicacionProdu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
		this.ubicacionproduSessionBean.setConGuardarRelaciones(false);
		this.ubicacionproduSessionBean.setEsGuardarRelacionado(true);

		this.ubicacionproduBeanSwingJInternalFrame=null;//new UbicacionProduBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.ubicacionproduBeanSwingJInternalFramePopup=new UbicacionProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.ubicacionproduBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {

				UbicacionProduJInternalFrame.STIPO_TAMANIO_GENERAL=UbicacionBodeJInternalFrame.STIPO_TAMANIO_GENERAL;
				UbicacionProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UbicacionBodeJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.ubicacionproduSessionBean.setEsGuardarRelacionado(true);

				this.ubicacionproduBeanSwingJInternalFrame=new UbicacionProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.ubicacionproduBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.ubicacionproduBeanSwingJInternalFrame.setubicacionproduSessionBean(this.ubicacionproduSessionBean);

				//this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
				//this.gridBagConstraintsUbicacionBode.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUbicacionBode.gridx = 0;
				//this.jContentPaneDetalleUbicacionBode.add(this.ubicacionproduBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUbicacionBode);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUbicacionBode.add("Ubicacion Productos",this.ubicacionproduBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUbicacionBode.setComponentAt(iIndexTab,this.ubicacionproduBeanSwingJInternalFrame.getContentPane());
				}

				//UbicacionProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.ubicacionproduSessionBean.setEsGuardarRelacionado(false);
				this.ubicacionproduBeanSwingJInternalFrame=null;//new UbicacionProduBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteUbicacionProdu) {
					this.jTabbedPaneRelacionesUbicacionBode.add("Ubicacion Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarUbicacionBodeBeanSwingJInternalFrame(List<UbicacionBode> ubicacionbodes,UbicacionBode ubicacionbode,UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//ubicacionbodeBeanSwingJInternalFrame=new UbicacionBodeBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					ubicacionbodeBeanSwingJInternalFrame.getUbicacionBodeLogic().setConnexion(this.ubicacionbodeLogic.getConnexion());

					ubicacionbodeBeanSwingJInternalFrame.setubicacionbodesForeignKey(ubicacionbodes);
					ubicacionbodeBeanSwingJInternalFrame.setubicacionbodeForeignKey(ubicacionbode);
					ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeSessionBean.setisBusquedaDesdeForeignKeySesionUbicacionBode(true);
					ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeSessionBean.setlidUbicacionBodeActual(ubicacionbode.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					ubicacionbodeBeanSwingJInternalFrame.cargarCombosForeignKeyUbicacionBode(ubicacionbodeBeanSwingJInternalFrame.isCargarCombosDependencia);
					ubicacionbodeBeanSwingJInternalFrame.setVisibilidadBusquedasParaUbicacionBode(true);
					ubicacionbodeBeanSwingJInternalFrame.setid_ubicacion_bodeFK_IdUbicacionBode(ubicacionbode.getId());

					if(!this.conCargarFormDetalle) {
						ubicacionbodeBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					ubicacionbodeBeanSwingJInternalFrame.setSelectedItemCombosFrameUbicacionBodeForeignKey(ubicacionbode,1,false,true,true);
					ubicacionbodeBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					ubicacionbodeBeanSwingJInternalFrame.procesarBusqueda("FK_IdUbicacionBode");
					ubicacionbodeBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUbicacionBode");
					ubicacionbodeBeanSwingJInternalFrame.inicializarActualizarBindingTablaUbicacionBode(true);
					ubicacionbodeBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesUbicacionBode("n",ubicacionbodeBeanSwingJInternalFrame.isGuardarCambiosEnLote, ubicacionbodeBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					ubicacionbodeBeanSwingJInternalFrame.setAutoscrolls(true);
					ubicacionbodeBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						ubicacionbodeBeanSwingJInternalFrame.actualizarEstadoPanelsUbicacionBode("relacionado");
					} else {
						ubicacionbodeBeanSwingJInternalFrame.actualizarEstadoPanelsUbicacionBode("no_relacionado");
					}

					ubicacionbodeBeanSwingJInternalFrame.getjButtonRecargarInformacionUbicacionBode().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarUbicacionProduBeanSwingJInternalFrame(List<UbicacionBode> ubicacionbodes,UbicacionBode ubicacionbode,UbicacionProduBeanSwingJInternalFrame ubicacionproduBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//ubicacionproduBeanSwingJInternalFrame=new UbicacionProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					ubicacionproduBeanSwingJInternalFrame.getUbicacionProduLogic().setConnexion(this.ubicacionbodeLogic.getConnexion());

					ubicacionproduBeanSwingJInternalFrame.setubicacionbodesForeignKey(ubicacionbodes);
					ubicacionproduBeanSwingJInternalFrame.setubicacionbodeForeignKey(ubicacionbode);
					ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.setisBusquedaDesdeForeignKeySesionUbicacionBode(true);
					ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.setlidUbicacionBodeActual(ubicacionbode.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					ubicacionproduBeanSwingJInternalFrame.cargarCombosForeignKeyUbicacionProdu(ubicacionproduBeanSwingJInternalFrame.isCargarCombosDependencia);
					ubicacionproduBeanSwingJInternalFrame.setVisibilidadBusquedasParaUbicacionBode(true);
					ubicacionproduBeanSwingJInternalFrame.setid_ubicacion_bodeFK_IdUbicacionBode(ubicacionbode.getId());

					if(!this.conCargarFormDetalle) {
						ubicacionproduBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					ubicacionproduBeanSwingJInternalFrame.setSelectedItemCombosFrameUbicacionBodeForeignKey(ubicacionbode,1,false,true,true);
					ubicacionproduBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					ubicacionproduBeanSwingJInternalFrame.procesarBusqueda("FK_IdUbicacionBode");
					ubicacionproduBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUbicacionBode");
					ubicacionproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaUbicacionProdu(true);
					ubicacionproduBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesUbicacionProdu("n",ubicacionproduBeanSwingJInternalFrame.isGuardarCambiosEnLote, ubicacionproduBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					ubicacionproduBeanSwingJInternalFrame.setAutoscrolls(true);
					ubicacionproduBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						ubicacionproduBeanSwingJInternalFrame.actualizarEstadoPanelsUbicacionProdu("relacionado");
					} else {
						ubicacionproduBeanSwingJInternalFrame.actualizarEstadoPanelsUbicacionProdu("no_relacionado");
					}

					ubicacionproduBeanSwingJInternalFrame.getjButtonRecargarInformacionUbicacionProdu().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
