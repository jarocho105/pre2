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
import com.bydan.erp.inventario.util.UbicacionProduConstantesFunciones;

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
public class UbicacionProduDetalleFormJInternalFrame extends UbicacionProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUbicacionProdu;
	
	protected JMenuBar jmenuBarDetalleUbicacionProdu;
	
	protected JMenu jmenuDetalleUbicacionProdu;
	protected JMenu jmenuDetalleArchivoUbicacionProdu;
	protected JMenu jmenuDetalleAccionesUbicacionProdu;
	protected JMenu jmenuDetalleDatosUbicacionProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUbicacionProdu;	
	protected GridBagConstraints gridBagConstraintsUbicacionProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UbicacionProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleUbicacionProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ubicacionbode="";
	
	public UbicacionProduSessionBean ubicacionproduSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UbicacionBodeSessionBean ubicacionbodeSessionBean;	
	
	public UbicacionProduLogic ubicacionproduLogic;
	
	public JScrollPane jScrollPanelDatosUbicacionProdu;
	public JScrollPane jScrollPanelDatosEdicionUbicacionProdu;
	public JScrollPane jScrollPanelDatosGeneralUbicacionProdu;
	
	protected JPanel jPanelCamposUbicacionProdu;    
	protected JPanel jPanelCamposOcultosUbicacionProdu;    	
	protected JPanel jPanelAccionesUbicacionProdu;
	protected JPanel jPanelAccionesFormularioUbicacionProdu;
    
	
	
	protected Integer iXPanelCamposUbicacionProdu=0;
	protected Integer iYPanelCamposUbicacionProdu=0;
	
	protected Integer iXPanelCamposOcultosUbicacionProdu=0;
	protected Integer iYPanelCamposOcultosUbicacionProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUbicacionProdu;
	public JButton jButtonModificarUbicacionProdu;
	public JButton jButtonActualizarUbicacionProdu;
    public JButton jButtonEliminarUbicacionProdu;
	public JButton jButtonCancelarUbicacionProdu;
    public JButton jButtonGuardarCambiosUbicacionProdu;
	public JButton jButtonGuardarCambiosTablaUbicacionProdu;
	protected JButton jButtonCerrarUbicacionProdu;
	
	
	protected JButton jButtonProcesarInformacionUbicacionProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUbicacionProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUbicacionProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUbicacionProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUbicacionProdu;
	protected JButton jButtonModificarToolBarUbicacionProdu;
	protected JButton jButtonActualizarToolBarUbicacionProdu;
    protected JButton jButtonEliminarToolBarUbicacionProdu;
	protected JButton jButtonCancelarToolBarUbicacionProdu;
    protected JButton jButtonGuardarCambiosToolBarUbicacionProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarUbicacionProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarUbicacionProdu;
	protected JButton jButtonCerrarToolBarUbicacionProdu;
	
	protected JButton jButtonProcesarInformacionToolBarUbicacionProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUbicacionProdu;
	protected JMenuItem jMenuItemModificarUbicacionProdu;
	protected JMenuItem jMenuItemActualizarUbicacionProdu;
    protected JMenuItem jMenuItemEliminarUbicacionProdu;
	protected JMenuItem jMenuItemCancelarUbicacionProdu;
    protected JMenuItem jMenuItemGuardarCambiosUbicacionProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaUbicacionProdu;
	protected JMenuItem jMenuItemCerrarUbicacionProdu;
	protected JMenuItem jMenuItemDetalleCerrarUbicacionProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarUbicacionProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionUbicacionProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUbicacionProdu;
	protected JMenuItem jMenuItemMostrarOcultarUbicacionProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUbicacionProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUbicacionProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUbicacionProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUbicacionProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUbicacionProdu;
	public JLabel jLabelIdUbicacionProdu;
	public JLabel jLabelidUbicacionProdu;
	public JButton jButtonidUbicacionProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaUbicacionProdu;
	public JLabel jLabelid_empresaUbicacionProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaUbicacionProdu;
	public JButton jButtonid_empresaUbicacionProdu= new JButtonMe();
	public JButton jButtonid_empresaUbicacionProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaUbicacionProduBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalUbicacionProdu;
	public JLabel jLabelid_sucursalUbicacionProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalUbicacionProdu;
	public JButton jButtonid_sucursalUbicacionProdu= new JButtonMe();
	public JButton jButtonid_sucursalUbicacionProduUpdate= new JButtonMe();
	public JButton jButtonid_sucursalUbicacionProduBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaUbicacionProdu;
	public JLabel jLabelid_bodegaUbicacionProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaUbicacionProdu;
	public JButton jButtonid_bodegaUbicacionProdu= new JButtonMe();
	public JButton jButtonid_bodegaUbicacionProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaUbicacionProduBusqueda= new JButtonMe();

	public JPanel jPanelid_productoUbicacionProdu;
	public JLabel jLabelid_productoUbicacionProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoUbicacionProdu;
	public JButton jButtonid_productoUbicacionProdu= new JButtonMe();
	public JButton jButtonid_productoUbicacionProduUpdate= new JButtonMe();
	public JButton jButtonid_productoUbicacionProduBusqueda= new JButtonMe();

	public JPanel jPanelid_ubicacion_bodeUbicacionProdu;
	public JLabel jLabelid_ubicacion_bodeUbicacionProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ubicacion_bodeUbicacionProdu;
	public JButton jButtonid_ubicacion_bodeUbicacionProdu= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeUbicacionProduUpdate= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeUbicacionProduBusqueda= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeUbicacionProduArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUbicacionProdu;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public UbicacionProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUbicacionProdu=new JPanel();
				this.jPanelAccionesFormularioUbicacionProdu=new JPanel();
				this.jmenuBarDetalleUbicacionProdu=new JMenuBar();
				this.jTtoolBarDetalleUbicacionProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("UbicacionProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UbicacionProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("UbicacionProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UbicacionProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UbicacionProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UbicacionProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUbicacionProdu() {
		return this.jButtonActualizarToolBarUbicacionProdu;
	}
	
	public JButton getjButtonEliminarToolBarUbicacionProdu() {
		return this.jButtonEliminarToolBarUbicacionProdu;
	}
	
	public JButton getjButtonCancelarToolBarUbicacionProdu() {
		return this.jButtonCancelarToolBarUbicacionProdu;
	}		
	
	public JButton getjButtonProcesarInformacionUbicacionProdu() {
		return this.jButtonProcesarInformacionUbicacionProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUbicacionProdu)	{
		this.jButtonProcesarInformacionUbicacionProdu = jButtonProcesarInformacionUbicacionProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUbicacionProdu() {
		return this.jComboBoxTiposAccionesUbicacionProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUbicacionProdu(
			JComboBox jComboBoxTiposRelacionesUbicacionProdu) {
		this.jComboBoxTiposRelacionesUbicacionProdu = jComboBoxTiposRelacionesUbicacionProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUbicacionProdu(
			JComboBox jComboBoxTiposAccionesUbicacionProdu) {
		this.jComboBoxTiposAccionesUbicacionProdu = jComboBoxTiposAccionesUbicacionProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUbicacionProdu() {
		return this.jComboBoxTiposAccionesFormularioUbicacionProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUbicacionProdu(
			JComboBox jComboBoxTiposAccionesFormularioUbicacionProdu) {
		this.jComboBoxTiposAccionesFormularioUbicacionProdu = jComboBoxTiposAccionesFormularioUbicacionProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
		
		this.ubicacionproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ubicacionproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ubicacionproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UbicacionProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UbicacionProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UbicacionProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ubicacion Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
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
	
		UbicacionProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUbicacionProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUbicacionProdu=new JButtonMe();
				this.jButtonModificarToolBarUbicacionProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUbicacionProdu,this.jTtoolBarDetalleUbicacionProdu,
							"actualizar","actualizar","Actualizar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUbicacionProdu,this.jTtoolBarDetalleUbicacionProdu,
							"eliminar","eliminar","Eliminar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUbicacionProdu,this.jTtoolBarDetalleUbicacionProdu,
							"cancelar","cancelar","Cancelar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUbicacionProdu,this.jTtoolBarDetalleUbicacionProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUbicacionProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUbicacionProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUbicacionProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUbicacionProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUbicacionProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUbicacionProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUbicacionProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUbicacionProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUbicacionProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUbicacionProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUbicacionProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUbicacionProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUbicacionProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUbicacionProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUbicacionProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUbicacionProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUbicacionProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUbicacionProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUbicacionProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUbicacionProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUbicacionProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUbicacionProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUbicacionProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUbicacionProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUbicacionProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUbicacionProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUbicacionProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUbicacionProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUbicacionProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUbicacionProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUbicacionProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUbicacionProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUbicacionProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUbicacionProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUbicacionProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUbicacionProdu.add(this.jMenuItemDetalleCerrarUbicacionProdu);
		
		this.jmenuDetalleAccionesUbicacionProdu.add(this.jMenuItemActualizarUbicacionProdu);
		this.jmenuDetalleAccionesUbicacionProdu.add(this.jMenuItemEliminarUbicacionProdu);
		this.jmenuDetalleAccionesUbicacionProdu.add(this.jMenuItemCancelarUbicacionProdu);		
		
		//this.jmenuDetalleDatosUbicacionProdu.add(this.jMenuItemDetalleAbrirOrderByUbicacionProdu);				
		this.jmenuDetalleDatosUbicacionProdu.add(this.jMenuItemDetalleMostarOcultarUbicacionProdu);				
				
		//this.jmenuDetalleAccionesUbicacionProdu.add(this.jMenuItemGuardarCambiosUbicacionProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUbicacionProdu.add(this.jmenuDetalleArchivoUbicacionProdu);		
		this.jmenuBarDetalleUbicacionProdu.add(this.jmenuDetalleAccionesUbicacionProdu);		
		this.jmenuBarDetalleUbicacionProdu.add(this.jmenuDetalleDatosUbicacionProdu);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUbicacionProdu);				
	}
	
	
	public void inicializarElementosCamposUbicacionProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUbicacionProdu = new JLabelMe();
		jLabelIdUbicacionProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUbicacionProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUbicacionProdu.setToolTipText(UbicacionProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUbicacionProdu= new GridBagLayout();

		this.jPanelidUbicacionProdu.setLayout(this.gridaBagLayoutUbicacionProdu);

		jLabelidUbicacionProdu = new JLabel();
		jLabelidUbicacionProdu.setText("Id");

		jLabelidUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysUbicacionProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaUbicacionProdu = new JLabelMe();
		this.jLabelid_empresaUbicacionProdu.setText(""+UbicacionProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaUbicacionProdu.setToolTipText("Empresa");
		this.jLabelid_empresaUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaUbicacionProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaUbicacionProdu.setToolTipText(UbicacionProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutUbicacionProdu = new GridBagLayout();
		this.jPanelid_empresaUbicacionProdu.setLayout(this.gridaBagLayoutUbicacionProdu);


		jComboBoxid_empresaUbicacionProdu= new JComboBoxMe();
		jComboBoxid_empresaUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaUbicacionProdu.setEnabled(false);

		this.jButtonid_empresaUbicacionProdu= new JButtonMe();
		this.jButtonid_empresaUbicacionProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUbicacionProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUbicacionProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUbicacionProdu.setText("Buscar");
		this.jButtonid_empresaUbicacionProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaUbicacionProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUbicacionProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUbicacionProdu"));

		this.jButtonid_empresaUbicacionProduBusqueda= new JButtonMe();
		this.jButtonid_empresaUbicacionProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUbicacionProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUbicacionProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUbicacionProduBusqueda.setText("U");
		this.jButtonid_empresaUbicacionProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaUbicacionProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUbicacionProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUbicacionProduBusqueda"));

		if(this.ubicacionproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaUbicacionProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaUbicacionProduUpdate= new JButtonMe();
		this.jButtonid_empresaUbicacionProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUbicacionProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUbicacionProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUbicacionProduUpdate.setText("U");
		this.jButtonid_empresaUbicacionProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaUbicacionProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUbicacionProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUbicacionProduUpdate"));



					
		this.jLabelid_sucursalUbicacionProdu = new JLabelMe();
		this.jLabelid_sucursalUbicacionProdu.setText(""+UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalUbicacionProdu.setToolTipText("Sucursal");
		this.jLabelid_sucursalUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalUbicacionProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalUbicacionProdu.setToolTipText(UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutUbicacionProdu = new GridBagLayout();
		this.jPanelid_sucursalUbicacionProdu.setLayout(this.gridaBagLayoutUbicacionProdu);


		jComboBoxid_sucursalUbicacionProdu= new JComboBoxMe();
		jComboBoxid_sucursalUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalUbicacionProdu.setEnabled(false);

		this.jButtonid_sucursalUbicacionProdu= new JButtonMe();
		this.jButtonid_sucursalUbicacionProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUbicacionProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUbicacionProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUbicacionProdu.setText("Buscar");
		this.jButtonid_sucursalUbicacionProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalUbicacionProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUbicacionProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUbicacionProdu"));

		this.jButtonid_sucursalUbicacionProduBusqueda= new JButtonMe();
		this.jButtonid_sucursalUbicacionProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUbicacionProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUbicacionProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalUbicacionProduBusqueda.setText("U");
		this.jButtonid_sucursalUbicacionProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalUbicacionProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUbicacionProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUbicacionProduBusqueda"));

		if(this.ubicacionproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalUbicacionProduBusqueda.setVisible(false);		}

		this.jButtonid_sucursalUbicacionProduUpdate= new JButtonMe();
		this.jButtonid_sucursalUbicacionProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUbicacionProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUbicacionProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalUbicacionProduUpdate.setText("U");
		this.jButtonid_sucursalUbicacionProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalUbicacionProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUbicacionProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUbicacionProduUpdate"));



					
		this.jLabelid_bodegaUbicacionProdu = new JLabelMe();
		this.jLabelid_bodegaUbicacionProdu.setText(""+UbicacionProduConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaUbicacionProdu.setToolTipText("Bodega");
		this.jLabelid_bodegaUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaUbicacionProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaUbicacionProdu.setToolTipText(UbicacionProduConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutUbicacionProdu = new GridBagLayout();
		this.jPanelid_bodegaUbicacionProdu.setLayout(this.gridaBagLayoutUbicacionProdu);


		jComboBoxid_bodegaUbicacionProdu= new JComboBoxMe();
		jComboBoxid_bodegaUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaUbicacionProdu= new JButtonMe();
		this.jButtonid_bodegaUbicacionProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaUbicacionProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaUbicacionProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaUbicacionProdu.setText("Buscar");
		this.jButtonid_bodegaUbicacionProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaUbicacionProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaUbicacionProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaUbicacionProdu"));

		this.jButtonid_bodegaUbicacionProduBusqueda= new JButtonMe();
		this.jButtonid_bodegaUbicacionProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUbicacionProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUbicacionProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaUbicacionProduBusqueda.setText("U");
		this.jButtonid_bodegaUbicacionProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaUbicacionProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaUbicacionProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaUbicacionProduBusqueda"));

		if(this.ubicacionproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaUbicacionProduBusqueda.setVisible(false);		}

		this.jButtonid_bodegaUbicacionProduUpdate= new JButtonMe();
		this.jButtonid_bodegaUbicacionProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUbicacionProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUbicacionProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaUbicacionProduUpdate.setText("U");
		this.jButtonid_bodegaUbicacionProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaUbicacionProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaUbicacionProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaUbicacionProduUpdate"));



					
		this.jLabelid_productoUbicacionProdu = new JLabelMe();
		this.jLabelid_productoUbicacionProdu.setText(""+UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoUbicacionProdu.setToolTipText("Producto");
		this.jLabelid_productoUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoUbicacionProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoUbicacionProdu.setToolTipText(UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutUbicacionProdu = new GridBagLayout();
		this.jPanelid_productoUbicacionProdu.setLayout(this.gridaBagLayoutUbicacionProdu);


		jComboBoxid_productoUbicacionProdu= new JComboBoxMe();
		jComboBoxid_productoUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoUbicacionProdu= new JButtonMe();
		this.jButtonid_productoUbicacionProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoUbicacionProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoUbicacionProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoUbicacionProdu.setText("Buscar");
		this.jButtonid_productoUbicacionProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoUbicacionProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoUbicacionProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoUbicacionProdu"));

		this.jButtonid_productoUbicacionProduBusqueda= new JButtonMe();
		this.jButtonid_productoUbicacionProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoUbicacionProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoUbicacionProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoUbicacionProduBusqueda.setText("U");
		this.jButtonid_productoUbicacionProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoUbicacionProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoUbicacionProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoUbicacionProduBusqueda"));

		if(this.ubicacionproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoUbicacionProduBusqueda.setVisible(false);		}

		this.jButtonid_productoUbicacionProduUpdate= new JButtonMe();
		this.jButtonid_productoUbicacionProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoUbicacionProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoUbicacionProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoUbicacionProduUpdate.setText("U");
		this.jButtonid_productoUbicacionProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoUbicacionProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoUbicacionProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoUbicacionProduUpdate"));



					
		this.jLabelid_ubicacion_bodeUbicacionProdu = new JLabelMe();
		this.jLabelid_ubicacion_bodeUbicacionProdu.setText(""+UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE+" : *");
		this.jLabelid_ubicacion_bodeUbicacionProdu.setToolTipText("Ubicacion Bodega");
		this.jLabelid_ubicacion_bodeUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_ubicacion_bodeUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_ubicacion_bodeUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ubicacion_bodeUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ubicacion_bodeUbicacionProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ubicacion_bodeUbicacionProdu.setToolTipText(UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE);
		this.gridaBagLayoutUbicacionProdu = new GridBagLayout();
		this.jPanelid_ubicacion_bodeUbicacionProdu.setLayout(this.gridaBagLayoutUbicacionProdu);


		jComboBoxid_ubicacion_bodeUbicacionProdu= new JComboBoxMe();
		jComboBoxid_ubicacion_bodeUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ubicacion_bodeUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ubicacion_bodeUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ubicacion_bodeUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ubicacion_bodeUbicacionProdu= new JButtonMe();
		this.jButtonid_ubicacion_bodeUbicacionProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ubicacion_bodeUbicacionProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ubicacion_bodeUbicacionProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ubicacion_bodeUbicacionProdu.setText("Buscar");
		this.jButtonid_ubicacion_bodeUbicacionProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ubicacion_bodeUbicacionProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ubicacion_bodeUbicacionProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ubicacion_bodeUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ubicacion_bodeUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ubicacion_bodeUbicacionProdu"));

		this.jButtonid_ubicacion_bodeUbicacionProduBusqueda= new JButtonMe();
		this.jButtonid_ubicacion_bodeUbicacionProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ubicacion_bodeUbicacionProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ubicacion_bodeUbicacionProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ubicacion_bodeUbicacionProduBusqueda.setText("U");
		this.jButtonid_ubicacion_bodeUbicacionProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ubicacion_bodeUbicacionProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ubicacion_bodeUbicacionProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ubicacion_bodeUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ubicacion_bodeUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ubicacion_bodeUbicacionProduBusqueda"));

		if(this.ubicacionproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ubicacion_bodeUbicacionProduBusqueda.setVisible(false);		}

		this.jButtonid_ubicacion_bodeUbicacionProduUpdate= new JButtonMe();
		this.jButtonid_ubicacion_bodeUbicacionProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ubicacion_bodeUbicacionProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ubicacion_bodeUbicacionProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ubicacion_bodeUbicacionProduUpdate.setText("U");
		this.jButtonid_ubicacion_bodeUbicacionProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ubicacion_bodeUbicacionProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ubicacion_bodeUbicacionProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ubicacion_bodeUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ubicacion_bodeUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ubicacion_bodeUbicacionProduUpdate"));


		jButtonid_ubicacion_bodeUbicacionProduArbol= new JButtonMe();
		jButtonid_ubicacion_bodeUbicacionProduArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_ubicacion_bodeUbicacionProduArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_ubicacion_bodeUbicacionProduArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_ubicacion_bodeUbicacionProduArbol.setText("Arbol");
		jButtonid_ubicacion_bodeUbicacionProduArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_ubicacion_bodeUbicacionProduArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ubicacion_bodeUbicacionProduArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_ubicacion_bodeUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ubicacion_bodeUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ubicacion_bodeUbicacionProduArbol"));



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
		//this.jInternalFrameDetalleUbicacionProdu = new UbicacionProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ubicacion Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUbicacionProdu= new GridBagLayout();
		

		
		String sToolTipUbicacionProdu="";
		sToolTipUbicacionProdu=UbicacionProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUbicacionProdu+="(Inventario.UbicacionProdu)";
		}
		
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipUbicacionProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUbicacionProdu = new JButtonMe();
		this.jButtonModificarUbicacionProdu = new JButtonMe();
        this.jButtonActualizarUbicacionProdu = new JButtonMe();
        this.jButtonEliminarUbicacionProdu = new JButtonMe();
        this.jButtonCancelarUbicacionProdu = new JButtonMe();
        this.jButtonGuardarCambiosUbicacionProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaUbicacionProdu = new JButtonMe();
		this.jButtonCerrarUbicacionProdu = new JButtonMe();
		
		this.jScrollPanelDatosUbicacionProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionUbicacionProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralUbicacionProdu = new JScrollPane();
				
		
		
		this.jPanelCamposUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ubicacion Producto";
		
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosUbicacionProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUbicacionProdu.setName("jPanelCamposUbicacionProdu"); 

		this.jPanelCamposOcultosUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUbicacionProdu.setName("jPanelCamposOcultosUbicacionProdu"); 

        this.jPanelAccionesUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUbicacionProdu.setToolTipText("Acciones");
        this.jPanelAccionesUbicacionProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUbicacionProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUbicacionProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUbicacionProdu.setText("Nuevo");
		this.jButtonModificarUbicacionProdu.setText("Editar");
        this.jButtonActualizarUbicacionProdu.setText("Actualizar");
        this.jButtonEliminarUbicacionProdu.setText("Eliminar");
        this.jButtonCancelarUbicacionProdu.setText("Cancelar");
        this.jButtonGuardarCambiosUbicacionProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaUbicacionProdu.setText("Guardar");
		this.jButtonCerrarUbicacionProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUbicacionProdu,"nuevo_button","Nuevo",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUbicacionProdu,"modificar_button","Editar",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUbicacionProdu,"actualizar_button","Actualizar",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUbicacionProdu,"eliminar_button","Eliminar",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUbicacionProdu,"cancelar_button","Cancelar",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUbicacionProdu,"guardarcambios_button","Guardar",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUbicacionProdu,"guardarcambiostabla_button","Guardar",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUbicacionProdu,"cerrar_button","Salir",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUbicacionProdu.setToolTipText("Nuevo"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUbicacionProdu.setToolTipText("Editar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUbicacionProdu.setToolTipText("Actualizar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUbicacionProdu.setToolTipText("Eliminar)"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUbicacionProdu.setToolTipText("Cancelar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUbicacionProdu.setToolTipText("Guardar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUbicacionProdu.setToolTipText("Guardar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUbicacionProdu.setToolTipText("Salir"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUbicacionProdu";
		inputMap = this.jButtonNuevoUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUbicacionProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUbicacionProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUbicacionProdu";
		inputMap = this.jButtonActualizarUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUbicacionProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarUbicacionProdu";
		inputMap = this.jButtonEliminarUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUbicacionProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarUbicacionProdu";
		inputMap = this.jButtonCancelarUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUbicacionProdu"));
		
		//CERRAR		
		sMapKey = "CerrarUbicacionProdu";
		inputMap = this.jButtonCerrarUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUbicacionProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUbicacionProdu";
		inputMap = this.jButtonGuardarCambiosTablaUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUbicacionProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUbicacionProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUbicacionProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUbicacionProdu.setToolTipText("Nuevo UbicacionProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUbicacionProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUbicacionProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUbicacionProdu.setToolTipText("Sin Cerrar Ventana UbicacionProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUbicacionProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUbicacionProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUbicacionProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesUbicacionProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUbicacionProdu.setText("Accion");
		this.jComboBoxTiposAccionesUbicacionProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUbicacionProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUbicacionProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUbicacionProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUbicacionProdu = new JLabelMe();
		
		this.jLabelAccionesUbicacionProdu.setText("Acciones");		
		this.jLabelAccionesUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUbicacionProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUbicacionProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUbicacionProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUbicacionProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesUbicacionProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUbicacionProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUbicacionProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUbicacionProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUbicacionProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUbicacionProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUbicacionProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUbicacionProdu = new GridBagLayout();
		
		this.jPanelCamposUbicacionProdu.setLayout(gridaBagLayoutCamposUbicacionProdu);
		this.jPanelCamposOcultosUbicacionProdu.setLayout(gridaBagLayoutCamposOcultosUbicacionProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 0;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUbicacionProdu.add(jLabelIdUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 1;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUbicacionProdu.add(jLabelidUbicacionProdu, this.gridBagConstraintsUbicacionProdu);


	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 0;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaUbicacionProdu.add(jLabelid_empresaUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 2;
		this.gridBagConstraintsUbicacionProdu.ipadx = 0;
		this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUbicacionProdu.add(jButtonid_empresaUbicacionProduBusqueda, this.gridBagConstraintsUbicacionProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 3;
		this.gridBagConstraintsUbicacionProdu.ipadx = 0;
		this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUbicacionProdu.add(jButtonid_empresaUbicacionProduUpdate, this.gridBagConstraintsUbicacionProdu);
	}

	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 1;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaUbicacionProdu.add(jComboBoxid_empresaUbicacionProdu, this.gridBagConstraintsUbicacionProdu);


	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 0;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalUbicacionProdu.add(jLabelid_sucursalUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 2;
		this.gridBagConstraintsUbicacionProdu.ipadx = 0;
		this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalUbicacionProdu.add(jButtonid_sucursalUbicacionProduBusqueda, this.gridBagConstraintsUbicacionProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 3;
		this.gridBagConstraintsUbicacionProdu.ipadx = 0;
		this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalUbicacionProdu.add(jButtonid_sucursalUbicacionProduUpdate, this.gridBagConstraintsUbicacionProdu);
	}

	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 1;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalUbicacionProdu.add(jComboBoxid_sucursalUbicacionProdu, this.gridBagConstraintsUbicacionProdu);


	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 0;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaUbicacionProdu.add(jLabelid_bodegaUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 2;
		this.gridBagConstraintsUbicacionProdu.ipadx = 0;
		this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaUbicacionProdu.add(jButtonid_bodegaUbicacionProduBusqueda, this.gridBagConstraintsUbicacionProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 3;
		this.gridBagConstraintsUbicacionProdu.ipadx = 0;
		this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaUbicacionProdu.add(jButtonid_bodegaUbicacionProduUpdate, this.gridBagConstraintsUbicacionProdu);
	}

	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 1;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaUbicacionProdu.add(jComboBoxid_bodegaUbicacionProdu, this.gridBagConstraintsUbicacionProdu);


	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 0;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoUbicacionProdu.add(jLabelid_productoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 2;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoUbicacionProdu.add(jButtonid_productoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 3;
		this.gridBagConstraintsUbicacionProdu.ipadx = 0;
		this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoUbicacionProdu.add(jButtonid_productoUbicacionProduBusqueda, this.gridBagConstraintsUbicacionProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 4;
		this.gridBagConstraintsUbicacionProdu.ipadx = 0;
		this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoUbicacionProdu.add(jButtonid_productoUbicacionProduUpdate, this.gridBagConstraintsUbicacionProdu);
	}

	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 1;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoUbicacionProdu.add(jComboBoxid_productoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);


	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 0;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ubicacion_bodeUbicacionProdu.add(jLabelid_ubicacion_bodeUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 2;
		this.gridBagConstraintsUbicacionProdu.ipadx = 0;
		this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ubicacion_bodeUbicacionProdu.add(jButtonid_ubicacion_bodeUbicacionProduBusqueda, this.gridBagConstraintsUbicacionProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 3;
		this.gridBagConstraintsUbicacionProdu.ipadx = 0;
		this.gridBagConstraintsUbicacionProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ubicacion_bodeUbicacionProdu.add(jButtonid_ubicacion_bodeUbicacionProduUpdate, this.gridBagConstraintsUbicacionProdu);
	}

	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUbicacionProdu.gridy = 0;
	this.gridBagConstraintsUbicacionProdu.gridx = 1;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ubicacion_bodeUbicacionProdu.add(jComboBoxid_ubicacion_bodeUbicacionProdu, this.gridBagConstraintsUbicacionProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionProdu.gridy = iYPanelCamposUbicacionProdu;
	this.gridBagConstraintsUbicacionProdu.gridx = iXPanelCamposUbicacionProdu++;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUbicacionProdu.add(this.jPanelidUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(iXPanelCamposUbicacionProdu % 1==0) {
		iXPanelCamposUbicacionProdu=0;
		iYPanelCamposUbicacionProdu++;
	}
	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionProdu.gridy = iYPanelCamposUbicacionProdu;
	this.gridBagConstraintsUbicacionProdu.gridx = iXPanelCamposUbicacionProdu++;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUbicacionProdu.add(this.jPanelid_bodegaUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(iXPanelCamposUbicacionProdu % 1==0) {
		iXPanelCamposUbicacionProdu=0;
		iYPanelCamposUbicacionProdu++;
	}
	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionProdu.gridy = iYPanelCamposUbicacionProdu;
	this.gridBagConstraintsUbicacionProdu.gridx = iXPanelCamposUbicacionProdu++;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUbicacionProdu.add(this.jPanelid_productoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(iXPanelCamposUbicacionProdu % 1==0) {
		iXPanelCamposUbicacionProdu=0;
		iYPanelCamposUbicacionProdu++;
	}
	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionProdu.gridy = iYPanelCamposUbicacionProdu;
	this.gridBagConstraintsUbicacionProdu.gridx = iXPanelCamposUbicacionProdu++;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUbicacionProdu.add(this.jPanelid_ubicacion_bodeUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(iXPanelCamposUbicacionProdu % 1==0) {
		iXPanelCamposUbicacionProdu=0;
		iYPanelCamposUbicacionProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionProdu.gridy = iYPanelCamposOcultosUbicacionProdu;
	this.gridBagConstraintsUbicacionProdu.gridx = iXPanelCamposOcultosUbicacionProdu++;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUbicacionProdu.add(this.jPanelid_empresaUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(iXPanelCamposOcultosUbicacionProdu % 1==0) {
		iXPanelCamposOcultosUbicacionProdu=0;
		iYPanelCamposOcultosUbicacionProdu++;
	}
	this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUbicacionProdu.gridy = iYPanelCamposOcultosUbicacionProdu;
	this.gridBagConstraintsUbicacionProdu.gridx = iXPanelCamposOcultosUbicacionProdu++;
	this.gridBagConstraintsUbicacionProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUbicacionProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUbicacionProdu.add(this.jPanelid_sucursalUbicacionProdu, this.gridBagConstraintsUbicacionProdu);



	if(iXPanelCamposOcultosUbicacionProdu % 1==0) {
		iXPanelCamposOcultosUbicacionProdu=0;
		iYPanelCamposOcultosUbicacionProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesUbicacionProdu= new GridBagLayout();
		this.jPanelAccionesUbicacionProdu.setLayout(gridaBagLayoutAccionesUbicacionProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUbicacionProdu= new GridBagLayout();
		this.jPanelAccionesFormularioUbicacionProdu.setLayout(gridaBagLayoutAccionesFormularioUbicacionProdu);
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUbicacionProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUbicacionProdu.add(this.jComboBoxTiposAccionesFormularioUbicacionProdu, this.gridBagConstraintsUbicacionProdu);

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUbicacionProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUbicacionProdu.add(this.jCheckBoxPostAccionNuevoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUbicacionProdu.add(this.jCheckBoxPostAccionSinCerrarUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUbicacionProdu.add(this.jCheckBoxPostAccionSinMensajeUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesUbicacionProdu.add(this.jButtonModificarUbicacionProdu, this.gridBagConstraintsUbicacionProdu);							

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesUbicacionProdu.add(this.jButtonEliminarUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
			
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = 0;		
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesUbicacionProdu.add(this.jButtonActualizarUbicacionProdu, this.gridBagConstraintsUbicacionProdu);


		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = 0;		
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesUbicacionProdu.add(this.jButtonGuardarCambiosUbicacionProdu, this.gridBagConstraintsUbicacionProdu);	
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = 0;		
		this.gridBagConstraintsUbicacionProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesUbicacionProdu.add(this.jButtonCancelarUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUbicacionProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUbicacionProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();						
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUbicacionProdu.gridx = 0;		
			//this.gridBagConstraintsUbicacionProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUbicacionProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUbicacionProdu.gridx =0;
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUbicacionProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(UbicacionProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUbicacionProdu = new UbicacionProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ubicacion Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ubicacion Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ubicacion Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UbicacionProduModel ubicacionproduModel=new UbicacionProduModel(this);
			
			//SI USARA CLASE INTERNA
			//UbicacionProduModel.UbicacionProduFocusTraversalPolicy ubicacionproduFocusTraversalPolicy = ubicacionproduModel.new UbicacionProduFocusTraversalPolicy(this);
			
			//ubicacionproduFocusTraversalPolicy.setubicacionproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ubicacionproduModel);
			
			
			this.jContentPaneDetalleUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUbicacionProdu = new GridBagLayout();	
			this.jContentPaneDetalleUbicacionProdu.setLayout(gridaBagLayoutDetalleUbicacionProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUbicacionProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
				this.gridBagConstraintsUbicacionProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUbicacionProdu.gridx = 0;
					
				
				this.jContentPaneDetalleUbicacionProdu.add(jTtoolBarDetalleUbicacionProdu, gridBagConstraintsUbicacionProdu);								
				
}
			
			this.jScrollPanelDatosEdicionUbicacionProdu=   new JScrollPane(jContentPaneDetalleUbicacionProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUbicacionProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUbicacionProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUbicacionProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUbicacionProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUbicacionProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUbicacionProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUbicacionProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUbicacionProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUbicacionProdu.gridx = 0;
	        
			this.jContentPaneDetalleUbicacionProdu.add(jPanelCamposUbicacionProdu, gridBagConstraintsUbicacionProdu);
			
			
			
			
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
						&& ubicacionproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ubicacionproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUbicacionProdu= new GridBagConstraints();
						this.gridBagConstraintsUbicacionProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUbicacionProdu.gridx = 0;
						this.jContentPaneDetalleUbicacionProdu.add(this.jTabbedPaneRelacionesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUbicacionProdu.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUbicacionProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
					this.gridBagConstraintsUbicacionProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUbicacionProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUbicacionProdu.gridx = 0;
					
				
					this.jContentPaneDetalleUbicacionProdu.add(jPanelCamposOcultosUbicacionProdu, gridBagConstraintsUbicacionProdu);
				
					this.jPanelCamposOcultosUbicacionProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsUbicacionProdu.gridx = 0;
	        this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUbicacionProdu.add(this.jPanelAccionesFormularioUbicacionProdu, this.gridBagConstraintsUbicacionProdu);							
			
			
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
	        this.gridBagConstraintsUbicacionProdu.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsUbicacionProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleUbicacionProdu.add(this.jPanelAccionesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUbicacionProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUbicacionProdu=   new JScrollPane(this.jPanelCamposUbicacionProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUbicacionProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUbicacionProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUbicacionProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUbicacionProdu.gridx = 0;
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUbicacionProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUbicacionProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUbicacionProdu, this.gridBagConstraintsUbicacionProdu);			
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUbicacionProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			
			
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
			
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUbicacionProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionUbicacionProdu;
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
