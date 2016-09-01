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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.RutaConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class RutaDetalleFormJInternalFrame extends RutaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRuta;
	
	protected JMenuBar jmenuBarDetalleRuta;
	
	protected JMenu jmenuDetalleRuta;
	protected JMenu jmenuDetalleArchivoRuta;
	protected JMenu jmenuDetalleAccionesRuta;
	protected JMenu jmenuDetalleDatosRuta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRuta;	
	protected GridBagConstraints gridBagConstraintsRuta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RutaBeanSwingJInternalFrameAdditional jInternalFrameDetalleRuta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected SectorBeanSwingJInternalFrame sectororigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sectororigen="";

	protected SectorBeanSwingJInternalFrame sectordestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sectordestino="";
	
	public RutaSessionBean rutaSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCarteraDefecto=false;
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public SectorSessionBean sectororigenSessionBean;
	public SectorSessionBean sectordestinoSessionBean;	
	
	public RutaLogic rutaLogic;
	
	public JScrollPane jScrollPanelDatosRuta;
	public JScrollPane jScrollPanelDatosEdicionRuta;
	public JScrollPane jScrollPanelDatosGeneralRuta;
	
	protected JPanel jPanelCamposRuta;    
	protected JPanel jPanelCamposOcultosRuta;    	
	protected JPanel jPanelAccionesRuta;
	protected JPanel jPanelAccionesFormularioRuta;
    
	
	
	protected Integer iXPanelCamposRuta=0;
	protected Integer iYPanelCamposRuta=0;
	
	protected Integer iXPanelCamposOcultosRuta=0;
	protected Integer iYPanelCamposOcultosRuta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRuta;
	public JButton jButtonModificarRuta;
	public JButton jButtonActualizarRuta;
    public JButton jButtonEliminarRuta;
	public JButton jButtonCancelarRuta;
    public JButton jButtonGuardarCambiosRuta;
	public JButton jButtonGuardarCambiosTablaRuta;
	protected JButton jButtonCerrarRuta;
	
	
	protected JButton jButtonProcesarInformacionRuta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRuta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRuta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRuta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRuta;
	protected JButton jButtonModificarToolBarRuta;
	protected JButton jButtonActualizarToolBarRuta;
    protected JButton jButtonEliminarToolBarRuta;
	protected JButton jButtonCancelarToolBarRuta;
    protected JButton jButtonGuardarCambiosToolBarRuta;
	protected JButton jButtonGuardarCambiosTablaToolBarRuta;
	protected JButton jButtonMostrarOcultarTablaToolBarRuta;
	protected JButton jButtonCerrarToolBarRuta;
	
	protected JButton jButtonProcesarInformacionToolBarRuta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRuta;
	protected JMenuItem jMenuItemModificarRuta;
	protected JMenuItem jMenuItemActualizarRuta;
    protected JMenuItem jMenuItemEliminarRuta;
	protected JMenuItem jMenuItemCancelarRuta;
    protected JMenuItem jMenuItemGuardarCambiosRuta;
	protected JMenuItem jMenuItemGuardarCambiosTablaRuta;
	protected JMenuItem jMenuItemCerrarRuta;
	protected JMenuItem jMenuItemDetalleCerrarRuta;
	protected JMenuItem jMenuItemDetalleMostarOcultarRuta;
	
	protected JMenuItem jMenuItemProcesarInformacionRuta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRuta;
	protected JMenuItem jMenuItemMostrarOcultarRuta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRuta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRuta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRuta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRuta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRuta;
	public JLabel jLabelIdRuta;
	public JLabel jLabelidRuta;
	public JButton jButtonidRutaBusqueda= new JButtonMe();

	public JPanel jPanelnombreRuta;
	public JLabel jLabelnombreRuta;
	public JTextArea jTextAreanombreRuta;
	public JScrollPane jscrollPanenombreRuta;
	public JButton jButtonnombreRutaBusqueda= new JButtonMe();

	public JPanel jPanelorigenRuta;
	public JLabel jLabelorigenRuta;
	public JTextArea jTextAreaorigenRuta;
	public JScrollPane jscrollPaneorigenRuta;
	public JButton jButtonorigenRutaBusqueda= new JButtonMe();

	public JPanel jPaneldestinoRuta;
	public JLabel jLabeldestinoRuta;
	public JTextArea jTextAreadestinoRuta;
	public JScrollPane jscrollPanedestinoRuta;
	public JButton jButtondestinoRutaBusqueda= new JButtonMe();

	public JPanel jPanelprecioRuta;
	public JLabel jLabelprecioRuta;
	public JTextField jTextFieldprecioRuta;
	public JButton jButtonprecioRutaBusqueda= new JButtonMe();

	public JPanel jPaneldireccionRuta;
	public JLabel jLabeldireccionRuta;
	public JTextArea jTextAreadireccionRuta;
	public JScrollPane jscrollPanedireccionRuta;
	public JButton jButtondireccionRutaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRuta;
	public JLabel jLabelid_empresaRuta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRuta;
	public JButton jButtonid_empresaRuta= new JButtonMe();
	public JButton jButtonid_empresaRutaUpdate= new JButtonMe();
	public JButton jButtonid_empresaRutaBusqueda= new JButtonMe();

	public JPanel jPanelid_paisRuta;
	public JLabel jLabelid_paisRuta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisRuta;
	public JButton jButtonid_paisRuta= new JButtonMe();
	public JButton jButtonid_paisRutaUpdate= new JButtonMe();
	public JButton jButtonid_paisRutaBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadRuta;
	public JLabel jLabelid_ciudadRuta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadRuta;
	public JButton jButtonid_ciudadRuta= new JButtonMe();
	public JButton jButtonid_ciudadRutaUpdate= new JButtonMe();
	public JButton jButtonid_ciudadRutaBusqueda= new JButtonMe();

	public JPanel jPanelid_sector_origenRuta;
	public JLabel jLabelid_sector_origenRuta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sector_origenRuta;
	public JButton jButtonid_sector_origenRuta= new JButtonMe();
	public JButton jButtonid_sector_origenRutaUpdate= new JButtonMe();
	public JButton jButtonid_sector_origenRutaBusqueda= new JButtonMe();

	public JPanel jPanelid_sector_destinoRuta;
	public JLabel jLabelid_sector_destinoRuta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sector_destinoRuta;
	public JButton jButtonid_sector_destinoRuta= new JButtonMe();
	public JButton jButtonid_sector_destinoRutaUpdate= new JButtonMe();
	public JButton jButtonid_sector_destinoRutaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRuta;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RutaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRuta=new JPanel();
				this.jPanelAccionesFormularioRuta=new JPanel();
				this.jmenuBarDetalleRuta=new JMenuBar();
				this.jTtoolBarDetalleRuta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Ruta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RutaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Ruta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ruta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ruta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Ruta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRuta() {
		return this.jButtonActualizarToolBarRuta;
	}
	
	public JButton getjButtonEliminarToolBarRuta() {
		return this.jButtonEliminarToolBarRuta;
	}
	
	public JButton getjButtonCancelarToolBarRuta() {
		return this.jButtonCancelarToolBarRuta;
	}		
	
	public JButton getjButtonProcesarInformacionRuta() {
		return this.jButtonProcesarInformacionRuta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRuta)	{
		this.jButtonProcesarInformacionRuta = jButtonProcesarInformacionRuta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRuta() {
		return this.jComboBoxTiposAccionesRuta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRuta(
			JComboBox jComboBoxTiposRelacionesRuta) {
		this.jComboBoxTiposRelacionesRuta = jComboBoxTiposRelacionesRuta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRuta(
			JComboBox jComboBoxTiposAccionesRuta) {
		this.jComboBoxTiposAccionesRuta = jComboBoxTiposAccionesRuta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRuta() {
		return this.jComboBoxTiposAccionesFormularioRuta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRuta(
			JComboBox jComboBoxTiposAccionesFormularioRuta) {
		this.jComboBoxTiposAccionesFormularioRuta = jComboBoxTiposAccionesFormularioRuta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rutaSessionBean=new RutaSessionBean();
		
		this.rutaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rutaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rutaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RutaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RutaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RutaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ruta MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
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
	
		RutaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRuta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRuta=new JButtonMe();
				this.jButtonModificarToolBarRuta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRuta,this.jTtoolBarDetalleRuta,
							"actualizar","actualizar","Actualizar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRuta,this.jTtoolBarDetalleRuta,
							"eliminar","eliminar","Eliminar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRuta,this.jTtoolBarDetalleRuta,
							"cancelar","cancelar","Cancelar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRuta,this.jTtoolBarDetalleRuta,
							"guardarcambios","guardarcambios","Guardar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRuta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRuta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRuta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRuta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRuta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRuta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRuta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRuta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRuta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRuta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRuta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRuta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRuta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRuta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRuta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRuta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRuta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRuta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRuta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRuta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRuta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRuta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRuta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRuta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRuta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRuta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRuta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRuta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRuta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRuta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRuta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRuta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRuta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRuta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRuta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRuta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRuta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRuta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRuta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRuta.add(this.jMenuItemDetalleCerrarRuta);
		
		this.jmenuDetalleAccionesRuta.add(this.jMenuItemActualizarRuta);
		this.jmenuDetalleAccionesRuta.add(this.jMenuItemEliminarRuta);
		this.jmenuDetalleAccionesRuta.add(this.jMenuItemCancelarRuta);		
		
		//this.jmenuDetalleDatosRuta.add(this.jMenuItemDetalleAbrirOrderByRuta);				
		this.jmenuDetalleDatosRuta.add(this.jMenuItemDetalleMostarOcultarRuta);				
				
		//this.jmenuDetalleAccionesRuta.add(this.jMenuItemGuardarCambiosRuta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRuta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRuta.add(this.jmenuDetalleArchivoRuta);		
		this.jmenuBarDetalleRuta.add(this.jmenuDetalleAccionesRuta);		
		this.jmenuBarDetalleRuta.add(this.jmenuDetalleDatosRuta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleRuta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRuta.add(this.jmenuDetalleRuta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRuta);				
	}
	
	
	public void inicializarElementosCamposRuta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRuta = new JLabelMe();
		jLabelIdRuta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRuta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRuta.setToolTipText(RutaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRuta= new GridBagLayout();

		this.jPanelidRuta.setLayout(this.gridaBagLayoutRuta);

		jLabelidRuta = new JLabel();
		jLabelidRuta.setText("Id");

		jLabelidRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreRuta = new JLabelMe();
		this.jLabelnombreRuta.setText(""+RutaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreRuta.setToolTipText("Nombre");
		this.jLabelnombreRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreRuta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreRuta.setToolTipText(RutaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutRuta = new GridBagLayout();
		this.jPanelnombreRuta.setLayout(this.gridaBagLayoutRuta);


		jTextAreanombreRuta= new JTextAreaMe();
		jTextAreanombreRuta.setEnabled(false);
		jTextAreanombreRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRuta.setLineWrap(true);
		jTextAreanombreRuta.setWrapStyleWord(true);
		jTextAreanombreRuta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreRuta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreRuta = new JScrollPane(jTextAreanombreRuta);
		jscrollPanenombreRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreRutaBusqueda= new JButtonMe();
		this.jButtonnombreRutaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRutaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRutaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreRutaBusqueda.setText("U");
		this.jButtonnombreRutaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreRutaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreRutaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreRutaBusqueda"));

		if(this.rutaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreRutaBusqueda.setVisible(false);		}


					
		this.jLabelorigenRuta = new JLabelMe();
		this.jLabelorigenRuta.setText(""+RutaConstantesFunciones.LABEL_ORIGEN+" : *");
		this.jLabelorigenRuta.setToolTipText("Origen");
		this.jLabelorigenRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorigenRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorigenRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelorigenRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelorigenRuta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelorigenRuta.setToolTipText(RutaConstantesFunciones.LABEL_ORIGEN);
		this.gridaBagLayoutRuta = new GridBagLayout();
		this.jPanelorigenRuta.setLayout(this.gridaBagLayoutRuta);


		jTextAreaorigenRuta= new JTextAreaMe();
		jTextAreaorigenRuta.setEnabled(false);
		jTextAreaorigenRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaorigenRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaorigenRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaorigenRuta.setLineWrap(true);
		jTextAreaorigenRuta.setWrapStyleWord(true);
		jTextAreaorigenRuta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaorigenRuta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaorigenRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneorigenRuta = new JScrollPane(jTextAreaorigenRuta);
		jscrollPaneorigenRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneorigenRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneorigenRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonorigenRutaBusqueda= new JButtonMe();
		this.jButtonorigenRutaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorigenRutaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorigenRutaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonorigenRutaBusqueda.setText("U");
		this.jButtonorigenRutaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonorigenRutaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonorigenRutaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaorigenRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaorigenRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"origenRutaBusqueda"));

		if(this.rutaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonorigenRutaBusqueda.setVisible(false);		}


					
		this.jLabeldestinoRuta = new JLabelMe();
		this.jLabeldestinoRuta.setText(""+RutaConstantesFunciones.LABEL_DESTINO+" : *");
		this.jLabeldestinoRuta.setToolTipText("Destino");
		this.jLabeldestinoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldestinoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldestinoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldestinoRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldestinoRuta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldestinoRuta.setToolTipText(RutaConstantesFunciones.LABEL_DESTINO);
		this.gridaBagLayoutRuta = new GridBagLayout();
		this.jPaneldestinoRuta.setLayout(this.gridaBagLayoutRuta);


		jTextAreadestinoRuta= new JTextAreaMe();
		jTextAreadestinoRuta.setEnabled(false);
		jTextAreadestinoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoRuta.setLineWrap(true);
		jTextAreadestinoRuta.setWrapStyleWord(true);
		jTextAreadestinoRuta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadestinoRuta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadestinoRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedestinoRuta = new JScrollPane(jTextAreadestinoRuta);
		jscrollPanedestinoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedestinoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedestinoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondestinoRutaBusqueda= new JButtonMe();
		this.jButtondestinoRutaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondestinoRutaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondestinoRutaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondestinoRutaBusqueda.setText("U");
		this.jButtondestinoRutaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondestinoRutaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondestinoRutaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadestinoRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadestinoRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"destinoRutaBusqueda"));

		if(this.rutaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondestinoRutaBusqueda.setVisible(false);		}


					
		this.jLabelprecioRuta = new JLabelMe();
		this.jLabelprecioRuta.setText(""+RutaConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioRuta.setToolTipText("Precio");
		this.jLabelprecioRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioRuta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioRuta.setToolTipText(RutaConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutRuta = new GridBagLayout();
		this.jPanelprecioRuta.setLayout(this.gridaBagLayoutRuta);


		jTextFieldprecioRuta= new JTextFieldMe();
		jTextFieldprecioRuta.setEnabled(false);
		jTextFieldprecioRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioRuta.setText("0.0");

		this.jButtonprecioRutaBusqueda= new JButtonMe();
		this.jButtonprecioRutaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioRutaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioRutaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioRutaBusqueda.setText("U");
		this.jButtonprecioRutaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioRutaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioRutaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioRutaBusqueda"));

		if(this.rutaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioRutaBusqueda.setVisible(false);		}


					
		this.jLabeldireccionRuta = new JLabelMe();
		this.jLabeldireccionRuta.setText(""+RutaConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionRuta.setToolTipText("Direccion");
		this.jLabeldireccionRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionRuta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionRuta.setToolTipText(RutaConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutRuta = new GridBagLayout();
		this.jPaneldireccionRuta.setLayout(this.gridaBagLayoutRuta);


		jTextAreadireccionRuta= new JTextAreaMe();
		jTextAreadireccionRuta.setEnabled(false);
		jTextAreadireccionRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionRuta.setLineWrap(true);
		jTextAreadireccionRuta.setWrapStyleWord(true);
		jTextAreadireccionRuta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionRuta.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionRuta = new JScrollPane(jTextAreadireccionRuta);
		jscrollPanedireccionRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionRutaBusqueda= new JButtonMe();
		this.jButtondireccionRutaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionRutaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionRutaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionRutaBusqueda.setText("U");
		this.jButtondireccionRutaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionRutaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionRutaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionRutaBusqueda"));

		if(this.rutaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionRutaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRuta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRuta = new JLabelMe();
		this.jLabelid_empresaRuta.setText(""+RutaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRuta.setToolTipText("Empresa");
		this.jLabelid_empresaRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRuta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRuta.setToolTipText(RutaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRuta = new GridBagLayout();
		this.jPanelid_empresaRuta.setLayout(this.gridaBagLayoutRuta);


		jComboBoxid_empresaRuta= new JComboBoxMe();
		jComboBoxid_empresaRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRuta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRuta.setEnabled(false);

		this.jButtonid_empresaRuta= new JButtonMe();
		this.jButtonid_empresaRuta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRuta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRuta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRuta.setText("Buscar");
		this.jButtonid_empresaRuta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRuta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRuta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRuta"));

		this.jButtonid_empresaRutaBusqueda= new JButtonMe();
		this.jButtonid_empresaRutaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRutaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRutaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRutaBusqueda.setText("U");
		this.jButtonid_empresaRutaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRutaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRutaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRutaBusqueda"));

		if(this.rutaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRutaBusqueda.setVisible(false);		}

		this.jButtonid_empresaRutaUpdate= new JButtonMe();
		this.jButtonid_empresaRutaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRutaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRutaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRutaUpdate.setText("U");
		this.jButtonid_empresaRutaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRutaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRutaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRutaUpdate"));



					
		this.jLabelid_paisRuta = new JLabelMe();
		this.jLabelid_paisRuta.setText(""+RutaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisRuta.setToolTipText("Pais");
		this.jLabelid_paisRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisRuta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisRuta.setToolTipText(RutaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutRuta = new GridBagLayout();
		this.jPanelid_paisRuta.setLayout(this.gridaBagLayoutRuta);


		jComboBoxid_paisRuta= new JComboBoxMe();
		jComboBoxid_paisRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisRuta= new JButtonMe();
		this.jButtonid_paisRuta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisRuta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisRuta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisRuta.setText("Buscar");
		this.jButtonid_paisRuta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisRuta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisRuta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisRuta"));

		this.jButtonid_paisRutaBusqueda= new JButtonMe();
		this.jButtonid_paisRutaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRutaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRutaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisRutaBusqueda.setText("U");
		this.jButtonid_paisRutaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisRutaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisRutaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisRutaBusqueda"));

		if(this.rutaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisRutaBusqueda.setVisible(false);		}

		this.jButtonid_paisRutaUpdate= new JButtonMe();
		this.jButtonid_paisRutaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRutaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRutaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisRutaUpdate.setText("U");
		this.jButtonid_paisRutaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisRutaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisRutaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisRutaUpdate"));



					
		this.jLabelid_ciudadRuta = new JLabelMe();
		this.jLabelid_ciudadRuta.setText(""+RutaConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadRuta.setToolTipText("Ciudad");
		this.jLabelid_ciudadRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadRuta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadRuta.setToolTipText(RutaConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutRuta = new GridBagLayout();
		this.jPanelid_ciudadRuta.setLayout(this.gridaBagLayoutRuta);


		jComboBoxid_ciudadRuta= new JComboBoxMe();
		jComboBoxid_ciudadRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadRuta= new JButtonMe();
		this.jButtonid_ciudadRuta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadRuta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadRuta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadRuta.setText("Buscar");
		this.jButtonid_ciudadRuta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadRuta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadRuta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadRuta"));

		this.jButtonid_ciudadRutaBusqueda= new JButtonMe();
		this.jButtonid_ciudadRutaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadRutaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadRutaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadRutaBusqueda.setText("U");
		this.jButtonid_ciudadRutaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadRutaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadRutaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadRutaBusqueda"));

		if(this.rutaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadRutaBusqueda.setVisible(false);		}

		this.jButtonid_ciudadRutaUpdate= new JButtonMe();
		this.jButtonid_ciudadRutaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadRutaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadRutaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadRutaUpdate.setText("U");
		this.jButtonid_ciudadRutaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadRutaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadRutaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadRutaUpdate"));



					
		this.jLabelid_sector_origenRuta = new JLabelMe();
		this.jLabelid_sector_origenRuta.setText(""+RutaConstantesFunciones.LABEL_IDSECTORORIGEN+" : *");
		this.jLabelid_sector_origenRuta.setToolTipText("Sector Origen");
		this.jLabelid_sector_origenRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sector_origenRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sector_origenRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sector_origenRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sector_origenRuta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sector_origenRuta.setToolTipText(RutaConstantesFunciones.LABEL_IDSECTORORIGEN);
		this.gridaBagLayoutRuta = new GridBagLayout();
		this.jPanelid_sector_origenRuta.setLayout(this.gridaBagLayoutRuta);


		jComboBoxid_sector_origenRuta= new JComboBoxMe();
		jComboBoxid_sector_origenRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sector_origenRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sector_origenRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sector_origenRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sector_origenRuta= new JButtonMe();
		this.jButtonid_sector_origenRuta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sector_origenRuta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sector_origenRuta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sector_origenRuta.setText("Buscar");
		this.jButtonid_sector_origenRuta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sector_origenRuta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sector_origenRuta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sector_origenRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sector_origenRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sector_origenRuta"));

		this.jButtonid_sector_origenRutaBusqueda= new JButtonMe();
		this.jButtonid_sector_origenRutaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sector_origenRutaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sector_origenRutaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sector_origenRutaBusqueda.setText("U");
		this.jButtonid_sector_origenRutaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sector_origenRutaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sector_origenRutaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sector_origenRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sector_origenRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sector_origenRutaBusqueda"));

		if(this.rutaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sector_origenRutaBusqueda.setVisible(false);		}

		this.jButtonid_sector_origenRutaUpdate= new JButtonMe();
		this.jButtonid_sector_origenRutaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sector_origenRutaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sector_origenRutaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sector_origenRutaUpdate.setText("U");
		this.jButtonid_sector_origenRutaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sector_origenRutaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sector_origenRutaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sector_origenRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sector_origenRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sector_origenRutaUpdate"));



					
		this.jLabelid_sector_destinoRuta = new JLabelMe();
		this.jLabelid_sector_destinoRuta.setText(""+RutaConstantesFunciones.LABEL_IDSECTORDESTINO+" : *");
		this.jLabelid_sector_destinoRuta.setToolTipText("Sector Destino");
		this.jLabelid_sector_destinoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sector_destinoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sector_destinoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sector_destinoRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sector_destinoRuta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sector_destinoRuta.setToolTipText(RutaConstantesFunciones.LABEL_IDSECTORDESTINO);
		this.gridaBagLayoutRuta = new GridBagLayout();
		this.jPanelid_sector_destinoRuta.setLayout(this.gridaBagLayoutRuta);


		jComboBoxid_sector_destinoRuta= new JComboBoxMe();
		jComboBoxid_sector_destinoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sector_destinoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sector_destinoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sector_destinoRuta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sector_destinoRuta= new JButtonMe();
		this.jButtonid_sector_destinoRuta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sector_destinoRuta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sector_destinoRuta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sector_destinoRuta.setText("Buscar");
		this.jButtonid_sector_destinoRuta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sector_destinoRuta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sector_destinoRuta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sector_destinoRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sector_destinoRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sector_destinoRuta"));

		this.jButtonid_sector_destinoRutaBusqueda= new JButtonMe();
		this.jButtonid_sector_destinoRutaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sector_destinoRutaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sector_destinoRutaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sector_destinoRutaBusqueda.setText("U");
		this.jButtonid_sector_destinoRutaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sector_destinoRutaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sector_destinoRutaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sector_destinoRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sector_destinoRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sector_destinoRutaBusqueda"));

		if(this.rutaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sector_destinoRutaBusqueda.setVisible(false);		}

		this.jButtonid_sector_destinoRutaUpdate= new JButtonMe();
		this.jButtonid_sector_destinoRutaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sector_destinoRutaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sector_destinoRutaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sector_destinoRutaUpdate.setText("U");
		this.jButtonid_sector_destinoRutaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sector_destinoRutaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sector_destinoRutaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sector_destinoRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sector_destinoRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sector_destinoRutaUpdate"));



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
		//this.jInternalFrameDetalleRuta = new RutaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ruta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRuta= new GridBagLayout();
		

		
		String sToolTipRuta="";
		sToolTipRuta=RutaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRuta+="(Cartera.Ruta)";
		}
		
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
			sToolTipRuta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRuta = new JButtonMe();
		this.jButtonModificarRuta = new JButtonMe();
        this.jButtonActualizarRuta = new JButtonMe();
        this.jButtonEliminarRuta = new JButtonMe();
        this.jButtonCancelarRuta = new JButtonMe();
        this.jButtonGuardarCambiosRuta = new JButtonMe();
		this.jButtonGuardarCambiosTablaRuta = new JButtonMe();
		this.jButtonCerrarRuta = new JButtonMe();
		
		this.jScrollPanelDatosRuta = new JScrollPane();   
        this.jScrollPanelDatosEdicionRuta = new JScrollPane();
		this.jScrollPanelDatosGeneralRuta = new JScrollPane();
				
		
		
		this.jPanelCamposRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ruta";
		
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rutas" + this.sPath));
		} else {
			this.jScrollPanelDatosRuta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRuta.setName("jPanelCamposRuta"); 

		this.jPanelCamposOcultosRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRuta.setName("jPanelCamposOcultosRuta"); 

        this.jPanelAccionesRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRuta.setToolTipText("Acciones");
        this.jPanelAccionesRuta.setName("Acciones"); 

		this.jPanelAccionesFormularioRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRuta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRuta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRuta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRuta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRuta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRuta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRuta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRuta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRuta.setText("Nuevo");
		this.jButtonModificarRuta.setText("Editar");
        this.jButtonActualizarRuta.setText("Actualizar");
        this.jButtonEliminarRuta.setText("Eliminar");
        this.jButtonCancelarRuta.setText("Cancelar");
        this.jButtonGuardarCambiosRuta.setText("Guardar");
		this.jButtonGuardarCambiosTablaRuta.setText("Guardar");
		this.jButtonCerrarRuta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRuta,"nuevo_button","Nuevo",this.rutaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRuta,"modificar_button","Editar",this.rutaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRuta,"actualizar_button","Actualizar",this.rutaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRuta,"eliminar_button","Eliminar",this.rutaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRuta,"cancelar_button","Cancelar",this.rutaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRuta,"guardarcambios_button","Guardar",this.rutaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRuta,"guardarcambiostabla_button","Guardar",this.rutaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRuta,"cerrar_button","Salir",this.rutaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRuta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRuta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRuta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRuta.setToolTipText("Nuevo"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRuta.setToolTipText("Editar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRuta.setToolTipText("Actualizar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRuta.setToolTipText("Eliminar)"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRuta.setToolTipText("Cancelar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRuta.setToolTipText("Guardar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRuta.setToolTipText("Guardar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRuta.setToolTipText("Salir"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRuta";
		inputMap = this.jButtonNuevoRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRuta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRuta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRuta";
		inputMap = this.jButtonActualizarRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRuta"));
		
		//ELIMINAR
		sMapKey = "EliminarRuta";
		inputMap = this.jButtonEliminarRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRuta"));
		
		//CANCELAR	
		sMapKey = "CancelarRuta";
		inputMap = this.jButtonCancelarRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRuta"));
		
		//CERRAR		
		sMapKey = "CerrarRuta";
		inputMap = this.jButtonCerrarRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRuta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRuta";
		inputMap = this.jButtonGuardarCambiosTablaRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRuta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRuta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRuta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRuta.setToolTipText("Nuevo Ruta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRuta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRuta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRuta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRuta.setToolTipText("Sin Cerrar Ventana Ruta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRuta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRuta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRuta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRuta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRuta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRuta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRuta.setText("Accion");
		this.jComboBoxTiposAccionesRuta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRuta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRuta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRuta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRuta = new JLabelMe();
		
		this.jLabelAccionesRuta.setText("Acciones");		
		this.jLabelAccionesRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRuta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRuta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRuta=new JTabbedPane();
		this.jTabbedPaneRelacionesRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRuta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRuta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRuta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRuta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRuta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRuta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRuta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRuta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRuta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRuta = new GridBagLayout();
		
		this.jPanelCamposRuta.setLayout(gridaBagLayoutCamposRuta);
		this.jPanelCamposOcultosRuta.setLayout(gridaBagLayoutCamposOcultosRuta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRuta.add(jLabelIdRuta, this.gridBagConstraintsRuta);



	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRuta.add(jLabelidRuta, this.gridBagConstraintsRuta);


	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRuta.add(jLabelid_empresaRuta, this.gridBagConstraintsRuta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 2;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRuta.add(jButtonid_empresaRutaBusqueda, this.gridBagConstraintsRuta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 3;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRuta.add(jButtonid_empresaRutaUpdate, this.gridBagConstraintsRuta);
	}

	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRuta.add(jComboBoxid_empresaRuta, this.gridBagConstraintsRuta);


	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisRuta.add(jLabelid_paisRuta, this.gridBagConstraintsRuta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 2;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisRuta.add(jButtonid_paisRutaBusqueda, this.gridBagConstraintsRuta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 3;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisRuta.add(jButtonid_paisRutaUpdate, this.gridBagConstraintsRuta);
	}

	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisRuta.add(jComboBoxid_paisRuta, this.gridBagConstraintsRuta);


	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadRuta.add(jLabelid_ciudadRuta, this.gridBagConstraintsRuta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 2;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadRuta.add(jButtonid_ciudadRutaBusqueda, this.gridBagConstraintsRuta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 3;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadRuta.add(jButtonid_ciudadRutaUpdate, this.gridBagConstraintsRuta);
	}

	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadRuta.add(jComboBoxid_ciudadRuta, this.gridBagConstraintsRuta);


	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sector_origenRuta.add(jLabelid_sector_origenRuta, this.gridBagConstraintsRuta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 2;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sector_origenRuta.add(jButtonid_sector_origenRutaBusqueda, this.gridBagConstraintsRuta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 3;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sector_origenRuta.add(jButtonid_sector_origenRutaUpdate, this.gridBagConstraintsRuta);
	}

	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sector_origenRuta.add(jComboBoxid_sector_origenRuta, this.gridBagConstraintsRuta);


	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sector_destinoRuta.add(jLabelid_sector_destinoRuta, this.gridBagConstraintsRuta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 2;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sector_destinoRuta.add(jButtonid_sector_destinoRutaBusqueda, this.gridBagConstraintsRuta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 3;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sector_destinoRuta.add(jButtonid_sector_destinoRutaUpdate, this.gridBagConstraintsRuta);
	}

	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sector_destinoRuta.add(jComboBoxid_sector_destinoRuta, this.gridBagConstraintsRuta);


	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreRuta.add(jLabelnombreRuta, this.gridBagConstraintsRuta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 2;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreRuta.add(jButtonnombreRutaBusqueda, this.gridBagConstraintsRuta);
	}

	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreRuta.add(jscrollPanenombreRuta, this.gridBagConstraintsRuta);


	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelorigenRuta.add(jLabelorigenRuta, this.gridBagConstraintsRuta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 2;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelorigenRuta.add(jButtonorigenRutaBusqueda, this.gridBagConstraintsRuta);
	}

	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelorigenRuta.add(jscrollPaneorigenRuta, this.gridBagConstraintsRuta);


	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldestinoRuta.add(jLabeldestinoRuta, this.gridBagConstraintsRuta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 2;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldestinoRuta.add(jButtondestinoRutaBusqueda, this.gridBagConstraintsRuta);
	}

	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldestinoRuta.add(jscrollPanedestinoRuta, this.gridBagConstraintsRuta);


	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioRuta.add(jLabelprecioRuta, this.gridBagConstraintsRuta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 2;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioRuta.add(jButtonprecioRutaBusqueda, this.gridBagConstraintsRuta);
	}

	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioRuta.add(jTextFieldprecioRuta, this.gridBagConstraintsRuta);


	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 0;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionRuta.add(jLabeldireccionRuta, this.gridBagConstraintsRuta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 2;
		this.gridBagConstraintsRuta.ipadx = 0;
		this.gridBagConstraintsRuta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionRuta.add(jButtondireccionRutaBusqueda, this.gridBagConstraintsRuta);
	}

	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRuta.gridy = 0;
	this.gridBagConstraintsRuta.gridx = 1;
	this.gridBagConstraintsRuta.ipadx = 0;
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionRuta.add(jscrollPanedireccionRuta, this.gridBagConstraintsRuta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRuta.add(this.jPanelidRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposRuta % 1==0) {
		iXPanelCamposRuta=0;
		iYPanelCamposRuta++;
	}
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRuta.add(this.jPanelid_paisRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposRuta % 1==0) {
		iXPanelCamposRuta=0;
		iYPanelCamposRuta++;
	}
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRuta.add(this.jPanelid_ciudadRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposRuta % 1==0) {
		iXPanelCamposRuta=0;
		iYPanelCamposRuta++;
	}
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRuta.add(this.jPanelid_sector_origenRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposRuta % 1==0) {
		iXPanelCamposRuta=0;
		iYPanelCamposRuta++;
	}
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRuta.add(this.jPanelid_sector_destinoRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposRuta % 1==0) {
		iXPanelCamposRuta=0;
		iYPanelCamposRuta++;
	}
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRuta.add(this.jPanelnombreRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposRuta % 1==0) {
		iXPanelCamposRuta=0;
		iYPanelCamposRuta++;
	}
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRuta.add(this.jPanelorigenRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposRuta % 1==0) {
		iXPanelCamposRuta=0;
		iYPanelCamposRuta++;
	}
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRuta.add(this.jPaneldestinoRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposRuta % 1==0) {
		iXPanelCamposRuta=0;
		iYPanelCamposRuta++;
	}
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRuta.add(this.jPanelprecioRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposRuta % 1==0) {
		iXPanelCamposRuta=0;
		iYPanelCamposRuta++;
	}
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRuta.add(this.jPaneldireccionRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposRuta % 1==0) {
		iXPanelCamposRuta=0;
		iYPanelCamposRuta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRuta = new GridBagConstraints();
	this.gridBagConstraintsRuta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRuta.gridy = iYPanelCamposOcultosRuta;
	this.gridBagConstraintsRuta.gridx = iXPanelCamposOcultosRuta++;
	this.gridBagConstraintsRuta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRuta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRuta.add(this.jPanelid_empresaRuta, this.gridBagConstraintsRuta);



	if(iXPanelCamposOcultosRuta % 1==0) {
		iXPanelCamposOcultosRuta=0;
		iYPanelCamposOcultosRuta++;
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
			
		GridBagLayout gridaBagLayoutAccionesRuta= new GridBagLayout();
		this.jPanelAccionesRuta.setLayout(gridaBagLayoutAccionesRuta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRuta= new GridBagLayout();
		this.jPanelAccionesFormularioRuta.setLayout(gridaBagLayoutAccionesFormularioRuta);
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRuta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRuta.add(this.jComboBoxTiposAccionesFormularioRuta, this.gridBagConstraintsRuta);

		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRuta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRuta.add(this.jCheckBoxPostAccionNuevoRuta, this.gridBagConstraintsRuta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.rutaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRuta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRuta.add(this.jCheckBoxPostAccionSinCerrarRuta, this.gridBagConstraintsRuta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.rutaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.rutaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRuta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRuta.add(this.jCheckBoxPostAccionSinMensajeRuta, this.gridBagConstraintsRuta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = iPosXAccion++;
			
		this.jPanelAccionesRuta.add(this.jButtonModificarRuta, this.gridBagConstraintsRuta);							

		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx =iPosXAccion++;
			
		this.jPanelAccionesRuta.add(this.jButtonEliminarRuta, this.gridBagConstraintsRuta);
		
			
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = 0;		
		this.gridBagConstraintsRuta.gridx = iPosXAccion++;
		
		this.jPanelAccionesRuta.add(this.jButtonActualizarRuta, this.gridBagConstraintsRuta);


		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = 0;		
		this.gridBagConstraintsRuta.gridx = iPosXAccion++;
		
		this.jPanelAccionesRuta.add(this.jButtonGuardarCambiosRuta, this.gridBagConstraintsRuta);	
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = 0;		
		this.gridBagConstraintsRuta.gridx =iPosXAccion++;
		
		this.jPanelAccionesRuta.add(this.jButtonCancelarRuta, this.gridBagConstraintsRuta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRuta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRuta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rutaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRuta = new GridBagConstraints();						
			this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRuta.gridx = 0;		
			//this.gridBagConstraintsRuta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRuta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRuta.gridx =0;
		this.gridBagConstraintsRuta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRuta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRuta, this.gridBagConstraintsRuta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RutaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRuta = new RutaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ruta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ruta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ruta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RutaModel rutaModel=new RutaModel(this);
			
			//SI USARA CLASE INTERNA
			//RutaModel.RutaFocusTraversalPolicy rutaFocusTraversalPolicy = rutaModel.new RutaFocusTraversalPolicy(this);
			
			//rutaFocusTraversalPolicy.setrutaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(rutaModel);
			
			
			this.jContentPaneDetalleRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRuta = new GridBagLayout();	
			this.jContentPaneDetalleRuta.setLayout(gridaBagLayoutDetalleRuta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRuta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRuta = new GridBagConstraints();
				this.gridBagConstraintsRuta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRuta.gridx = 0;
					
				
				this.jContentPaneDetalleRuta.add(jTtoolBarDetalleRuta, gridBagConstraintsRuta);								
				
}
			
			this.jScrollPanelDatosEdicionRuta=   new JScrollPane(jContentPaneDetalleRuta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRuta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRuta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRuta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRuta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRuta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRuta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRuta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRuta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRuta.gridx = 0;
	        
			this.jContentPaneDetalleRuta.add(jPanelCamposRuta, gridBagConstraintsRuta);
			
			
			
			
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
						&& rutaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(this.puedeCargarPorParteParametroCarteraDefecto,false,-1);
					
					if(this.rutaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRuta= new GridBagConstraints();
						this.gridBagConstraintsRuta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRuta.gridx = 0;
						this.jContentPaneDetalleRuta.add(this.jTabbedPaneRelacionesRuta, this.gridBagConstraintsRuta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRuta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRuta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRuta = new GridBagConstraints();
					this.gridBagConstraintsRuta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRuta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRuta.gridx = 0;
					
				
					this.jContentPaneDetalleRuta.add(jPanelCamposOcultosRuta, gridBagConstraintsRuta);
				
					this.jPanelCamposOcultosRuta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsRuta.gridx = 0;
	        this.gridBagConstraintsRuta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRuta.add(this.jPanelAccionesFormularioRuta, this.gridBagConstraintsRuta);							
			
			
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
	        this.gridBagConstraintsRuta.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsRuta.gridx = 0;
	        
			
			this.jContentPaneDetalleRuta.add(this.jPanelAccionesRuta, this.gridBagConstraintsRuta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRuta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRuta=   new JScrollPane(this.jPanelCamposRuta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRuta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRuta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRuta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRuta.gridx = 0;
			this.gridBagConstraintsRuta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRuta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRuta, this.gridBagConstraintsRuta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRuta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRuta, this.gridBagConstraintsRuta);			
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRuta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRuta, this.gridBagConstraintsRuta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRuta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRuta, this.gridBagConstraintsRuta);
			
			
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRuta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRuta, this.gridBagConstraintsRuta);
		
			
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRuta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRuta, this.gridBagConstraintsRuta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRuta;//jContentPane;
		
		return jScrollPanelDatosEdicionRuta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=RutaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RutaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsRuta = new GridBagConstraints();
				//this.gridBagConstraintsRuta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRuta.gridx = 0;
				//this.jContentPaneDetalleRuta.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRuta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRuta.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRuta.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesRuta.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=RutaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RutaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocarteradefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocarteradefectoBeanSwingJInternalFrame.setparametrocarteradefectoSessionBean(this.parametrocarteradefectoSessionBean);

				//this.gridBagConstraintsRuta = new GridBagConstraints();
				//this.gridBagConstraintsRuta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRuta.gridx = 0;
				//this.jContentPaneDetalleRuta.add(this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRuta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRuta.add("Parametro Cartera Defectos",this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRuta.setComponentAt(iIndexTab,this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCarteraDefecto) {
					this.jTabbedPaneRelacionesRuta.add("Parametro Cartera Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<Ruta> rutas,Ruta ruta,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.rutaLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setrutasForeignKey(rutas);
					clienteBeanSwingJInternalFrame.setrutaForeignKey(ruta);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionRuta(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidRutaActual(ruta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaRuta(true);
					clienteBeanSwingJInternalFrame.setid_rutaFK_IdRuta(ruta.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameRutaForeignKey(ruta,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdRuta");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRuta");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroCarteraDefectoBeanSwingJInternalFrame(List<Ruta> rutas,Ruta ruta,ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocarteradefectoBeanSwingJInternalFrame.getParametroCarteraDefectoLogic().setConnexion(this.rutaLogic.getConnexion());

					parametrocarteradefectoBeanSwingJInternalFrame.setrutasForeignKey(rutas);
					parametrocarteradefectoBeanSwingJInternalFrame.setrutaForeignKey(ruta);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionRuta(true);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setlidRutaActual(ruta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocarteradefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCarteraDefecto(parametrocarteradefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaRuta(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setid_rutaFK_IdRuta(ruta.getId());

					if(!this.conCargarFormDetalle) {
						parametrocarteradefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocarteradefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameRutaForeignKey(ruta,1,false,true,true);
					parametrocarteradefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocarteradefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdRuta");
					parametrocarteradefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRuta");
					parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(true);
					parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCarteraDefecto("n",parametrocarteradefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocarteradefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocarteradefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("relacionado");
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");
					}

					parametrocarteradefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCarteraDefecto().setVisible(false);

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
