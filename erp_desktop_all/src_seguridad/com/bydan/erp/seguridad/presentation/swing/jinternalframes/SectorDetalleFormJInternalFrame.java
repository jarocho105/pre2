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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.SectorConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class SectorDetalleFormJInternalFrame extends SectorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSector;
	
	protected JMenuBar jmenuBarDetalleSector;
	
	protected JMenu jmenuDetalleSector;
	protected JMenu jmenuDetalleArchivoSector;
	protected JMenu jmenuDetalleAccionesSector;
	protected JMenu jmenuDetalleDatosSector;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSector;	
	protected GridBagConstraints gridBagConstraintsSector;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SectorBeanSwingJInternalFrameAdditional jInternalFrameDetalleSector;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public SectorSessionBean sectorSessionBean;
	
	

	public RutaBeanSwingJInternalFrame rutaBeanSwingJInternalFrame=null;
	public RutaBeanSwingJInternalFrame rutaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRuta=false;
	public RutaSessionBean rutaSessionBean;

	public SubSectorBeanSwingJInternalFrame subsectorBeanSwingJInternalFrame=null;
	public SubSectorBeanSwingJInternalFrame subsectorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSubSector=false;
	public SubSectorSessionBean subsectorSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public SectorLogic sectorLogic;
	
	public JScrollPane jScrollPanelDatosSector;
	public JScrollPane jScrollPanelDatosEdicionSector;
	public JScrollPane jScrollPanelDatosGeneralSector;
	
	protected JPanel jPanelCamposSector;    
	protected JPanel jPanelCamposOcultosSector;    	
	protected JPanel jPanelAccionesSector;
	protected JPanel jPanelAccionesFormularioSector;
    
	
	
	protected Integer iXPanelCamposSector=0;
	protected Integer iYPanelCamposSector=0;
	
	protected Integer iXPanelCamposOcultosSector=0;
	protected Integer iYPanelCamposOcultosSector=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSector;
	public JButton jButtonModificarSector;
	public JButton jButtonActualizarSector;
    public JButton jButtonEliminarSector;
	public JButton jButtonCancelarSector;
    public JButton jButtonGuardarCambiosSector;
	public JButton jButtonGuardarCambiosTablaSector;
	protected JButton jButtonCerrarSector;
	
	
	protected JButton jButtonProcesarInformacionSector;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSector;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSector;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSector;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSector;
	protected JButton jButtonModificarToolBarSector;
	protected JButton jButtonActualizarToolBarSector;
    protected JButton jButtonEliminarToolBarSector;
	protected JButton jButtonCancelarToolBarSector;
    protected JButton jButtonGuardarCambiosToolBarSector;
	protected JButton jButtonGuardarCambiosTablaToolBarSector;
	protected JButton jButtonMostrarOcultarTablaToolBarSector;
	protected JButton jButtonCerrarToolBarSector;
	
	protected JButton jButtonProcesarInformacionToolBarSector;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSector;
	protected JMenuItem jMenuItemModificarSector;
	protected JMenuItem jMenuItemActualizarSector;
    protected JMenuItem jMenuItemEliminarSector;
	protected JMenuItem jMenuItemCancelarSector;
    protected JMenuItem jMenuItemGuardarCambiosSector;
	protected JMenuItem jMenuItemGuardarCambiosTablaSector;
	protected JMenuItem jMenuItemCerrarSector;
	protected JMenuItem jMenuItemDetalleCerrarSector;
	protected JMenuItem jMenuItemDetalleMostarOcultarSector;
	
	protected JMenuItem jMenuItemProcesarInformacionSector;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSector;
	protected JMenuItem jMenuItemMostrarOcultarSector;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSector;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSector;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSector;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSector;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSector;
	public JLabel jLabelIdSector;
	public JLabel jLabelidSector;
	public JButton jButtonidSectorBusqueda= new JButtonMe();

	public JPanel jPanelnombreSector;
	public JLabel jLabelnombreSector;
	public JTextArea jTextAreanombreSector;
	public JScrollPane jscrollPanenombreSector;
	public JButton jButtonnombreSectorBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionSector;
	public JLabel jLabeldescripcionSector;
	public JTextArea jTextAreadescripcionSector;
	public JScrollPane jscrollPanedescripcionSector;
	public JButton jButtondescripcionSectorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSector;
	public JLabel jLabelid_empresaSector;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSector;
	public JButton jButtonid_empresaSector= new JButtonMe();
	public JButton jButtonid_empresaSectorUpdate= new JButtonMe();
	public JButton jButtonid_empresaSectorBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadSector;
	public JLabel jLabelid_ciudadSector;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadSector;
	public JButton jButtonid_ciudadSector= new JButtonMe();
	public JButton jButtonid_ciudadSectorUpdate= new JButtonMe();
	public JButton jButtonid_ciudadSectorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSector;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SectorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSector=new JPanel();
				this.jPanelAccionesFormularioSector=new JPanel();
				this.jmenuBarDetalleSector=new JMenuBar();
				this.jTtoolBarDetalleSector=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SectorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Sector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SectorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Sector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SectorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SectorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SectorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Sector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSector() {
		return this.jButtonActualizarToolBarSector;
	}
	
	public JButton getjButtonEliminarToolBarSector() {
		return this.jButtonEliminarToolBarSector;
	}
	
	public JButton getjButtonCancelarToolBarSector() {
		return this.jButtonCancelarToolBarSector;
	}		
	
	public JButton getjButtonProcesarInformacionSector() {
		return this.jButtonProcesarInformacionSector;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSector)	{
		this.jButtonProcesarInformacionSector = jButtonProcesarInformacionSector;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSector() {
		return this.jComboBoxTiposAccionesSector;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSector(
			JComboBox jComboBoxTiposRelacionesSector) {
		this.jComboBoxTiposRelacionesSector = jComboBoxTiposRelacionesSector;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSector(
			JComboBox jComboBoxTiposAccionesSector) {
		this.jComboBoxTiposAccionesSector = jComboBoxTiposAccionesSector;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSector() {
		return this.jComboBoxTiposAccionesFormularioSector;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSector(
			JComboBox jComboBoxTiposAccionesFormularioSector) {
		this.jComboBoxTiposAccionesFormularioSector = jComboBoxTiposAccionesFormularioSector;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.sectorSessionBean=new SectorSessionBean();
		
		this.sectorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sectorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sectorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.rutaSessionBean=new RutaSessionBean();
		//this.subsectorSessionBean=new SubSectorSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SectorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SectorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SectorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sector MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
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
	
		SectorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSector= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSector=new JButtonMe();
				this.jButtonModificarToolBarSector=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSector,this.jTtoolBarDetalleSector,
							"actualizar","actualizar","Actualizar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSector,this.jTtoolBarDetalleSector,
							"eliminar","eliminar","Eliminar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSector,this.jTtoolBarDetalleSector,
							"cancelar","cancelar","Cancelar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSector,this.jTtoolBarDetalleSector,
							"guardarcambios","guardarcambios","Guardar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSector,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSector,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSector,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSector=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSector=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSector=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSector=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSector=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSector= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSector.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSector,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSector= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSector.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSector,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSector= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSector.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSector,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSector= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSector.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSector,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSector= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSector.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSector,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSector= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSector.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSector,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSector= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSector.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSector,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSector= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSector.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSector,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSector= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSector.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSector,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSector= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSector.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSector,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSector, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSector.add(this.jMenuItemDetalleCerrarSector);
		
		this.jmenuDetalleAccionesSector.add(this.jMenuItemActualizarSector);
		this.jmenuDetalleAccionesSector.add(this.jMenuItemEliminarSector);
		this.jmenuDetalleAccionesSector.add(this.jMenuItemCancelarSector);		
		
		//this.jmenuDetalleDatosSector.add(this.jMenuItemDetalleAbrirOrderBySector);				
		this.jmenuDetalleDatosSector.add(this.jMenuItemDetalleMostarOcultarSector);				
				
		//this.jmenuDetalleAccionesSector.add(this.jMenuItemGuardarCambiosSector);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSector, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSector.add(this.jmenuDetalleArchivoSector);		
		this.jmenuBarDetalleSector.add(this.jmenuDetalleAccionesSector);		
		this.jmenuBarDetalleSector.add(this.jmenuDetalleDatosSector);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleSector, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleSector.add(this.jmenuDetalleSector);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSector);				
	}
	
	
	public void inicializarElementosCamposSector() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSector = new JLabelMe();
		jLabelIdSector.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSector,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSector = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSector.setToolTipText(SectorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSector= new GridBagLayout();

		this.jPanelidSector.setLayout(this.gridaBagLayoutSector);

		jLabelidSector = new JLabel();
		jLabelidSector.setText("Id");

		jLabelidSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreSector = new JLabelMe();
		this.jLabelnombreSector.setText(""+SectorConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSector.setToolTipText("Nombre");
		this.jLabelnombreSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSector,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSector=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSector.setToolTipText(SectorConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSector = new GridBagLayout();
		this.jPanelnombreSector.setLayout(this.gridaBagLayoutSector);


		jTextAreanombreSector= new JTextAreaMe();
		jTextAreanombreSector.setEnabled(false);
		jTextAreanombreSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSector.setLineWrap(true);
		jTextAreanombreSector.setWrapStyleWord(true);
		jTextAreanombreSector.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreSector.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreSector,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreSector = new JScrollPane(jTextAreanombreSector);
		jscrollPanenombreSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreSectorBusqueda= new JButtonMe();
		this.jButtonnombreSectorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSectorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSectorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSectorBusqueda.setText("U");
		this.jButtonnombreSectorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSectorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSectorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSectorBusqueda"));

		if(this.sectorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSectorBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionSector = new JLabelMe();
		this.jLabeldescripcionSector.setText(""+SectorConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionSector.setToolTipText("Descripcion");
		this.jLabeldescripcionSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionSector,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionSector=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionSector.setToolTipText(SectorConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutSector = new GridBagLayout();
		this.jPaneldescripcionSector.setLayout(this.gridaBagLayoutSector);


		jTextAreadescripcionSector= new JTextAreaMe();
		jTextAreadescripcionSector.setEnabled(false);
		jTextAreadescripcionSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSector.setLineWrap(true);
		jTextAreadescripcionSector.setWrapStyleWord(true);
		jTextAreadescripcionSector.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionSector.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionSector,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionSector = new JScrollPane(jTextAreadescripcionSector);
		jscrollPanedescripcionSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionSectorBusqueda= new JButtonMe();
		this.jButtondescripcionSectorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSectorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSectorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionSectorBusqueda.setText("U");
		this.jButtondescripcionSectorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionSectorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionSectorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionSectorBusqueda"));

		if(this.sectorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionSectorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSector() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSector = new JLabelMe();
		this.jLabelid_empresaSector.setText(""+SectorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSector.setToolTipText("Empresa");
		this.jLabelid_empresaSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSector,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSector=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSector.setToolTipText(SectorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSector = new GridBagLayout();
		this.jPanelid_empresaSector.setLayout(this.gridaBagLayoutSector);


		jComboBoxid_empresaSector= new JComboBoxMe();
		jComboBoxid_empresaSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSector,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSector.setEnabled(false);

		this.jButtonid_empresaSector= new JButtonMe();
		this.jButtonid_empresaSector.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSector.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSector.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSector.setText("Buscar");
		this.jButtonid_empresaSector.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSector.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSector,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSector"));

		this.jButtonid_empresaSectorBusqueda= new JButtonMe();
		this.jButtonid_empresaSectorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSectorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSectorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSectorBusqueda.setText("U");
		this.jButtonid_empresaSectorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSectorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSectorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSectorBusqueda"));

		if(this.sectorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSectorBusqueda.setVisible(false);		}

		this.jButtonid_empresaSectorUpdate= new JButtonMe();
		this.jButtonid_empresaSectorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSectorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSectorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSectorUpdate.setText("U");
		this.jButtonid_empresaSectorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSectorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSectorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSectorUpdate"));



					
		this.jLabelid_ciudadSector = new JLabelMe();
		this.jLabelid_ciudadSector.setText(""+SectorConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadSector.setToolTipText("Ciudad");
		this.jLabelid_ciudadSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadSector,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadSector=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadSector.setToolTipText(SectorConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutSector = new GridBagLayout();
		this.jPanelid_ciudadSector.setLayout(this.gridaBagLayoutSector);


		jComboBoxid_ciudadSector= new JComboBoxMe();
		jComboBoxid_ciudadSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadSector,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadSector= new JButtonMe();
		this.jButtonid_ciudadSector.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadSector.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadSector.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadSector.setText("Buscar");
		this.jButtonid_ciudadSector.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadSector.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadSector,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadSector"));

		this.jButtonid_ciudadSectorBusqueda= new JButtonMe();
		this.jButtonid_ciudadSectorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSectorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSectorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadSectorBusqueda.setText("U");
		this.jButtonid_ciudadSectorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadSectorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadSectorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadSectorBusqueda"));

		if(this.sectorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadSectorBusqueda.setVisible(false);		}

		this.jButtonid_ciudadSectorUpdate= new JButtonMe();
		this.jButtonid_ciudadSectorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSectorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSectorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadSectorUpdate.setText("U");
		this.jButtonid_ciudadSectorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadSectorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadSectorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadSectorUpdate"));



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
		//this.jInternalFrameDetalleSector = new SectorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sector DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSector= new GridBagLayout();
		

		
		String sToolTipSector="";
		sToolTipSector=SectorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSector+="(Seguridad.Sector)";
		}
		
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
			sToolTipSector+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSector = new JButtonMe();
		this.jButtonModificarSector = new JButtonMe();
        this.jButtonActualizarSector = new JButtonMe();
        this.jButtonEliminarSector = new JButtonMe();
        this.jButtonCancelarSector = new JButtonMe();
        this.jButtonGuardarCambiosSector = new JButtonMe();
		this.jButtonGuardarCambiosTablaSector = new JButtonMe();
		this.jButtonCerrarSector = new JButtonMe();
		
		this.jScrollPanelDatosSector = new JScrollPane();   
        this.jScrollPanelDatosEdicionSector = new JScrollPane();
		this.jScrollPanelDatosGeneralSector = new JScrollPane();
				
		
		
		this.jPanelCamposSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sector";
		
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores" + this.sPath));
		} else {
			this.jScrollPanelDatosSector.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSector.setName("jPanelCamposSector"); 

		this.jPanelCamposOcultosSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSector.setName("jPanelCamposOcultosSector"); 

        this.jPanelAccionesSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSector.setToolTipText("Acciones");
        this.jPanelAccionesSector.setName("Acciones"); 

		this.jPanelAccionesFormularioSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSector.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSector.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSector, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSector, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSector, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSector, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSector, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSector, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSector.setText("Nuevo");
		this.jButtonModificarSector.setText("Editar");
        this.jButtonActualizarSector.setText("Actualizar");
        this.jButtonEliminarSector.setText("Eliminar");
        this.jButtonCancelarSector.setText("Cancelar");
        this.jButtonGuardarCambiosSector.setText("Guardar");
		this.jButtonGuardarCambiosTablaSector.setText("Guardar");
		this.jButtonCerrarSector.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSector,"nuevo_button","Nuevo",this.sectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSector,"modificar_button","Editar",this.sectorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSector,"actualizar_button","Actualizar",this.sectorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSector,"eliminar_button","Eliminar",this.sectorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSector,"cancelar_button","Cancelar",this.sectorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSector,"guardarcambios_button","Guardar",this.sectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSector,"guardarcambiostabla_button","Guardar",this.sectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSector,"cerrar_button","Salir",this.sectorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSector, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSector, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSector, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSector.setToolTipText("Nuevo"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSector.setToolTipText("Editar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSector.setToolTipText("Actualizar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSector.setToolTipText("Eliminar)"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSector.setToolTipText("Cancelar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSector.setToolTipText("Guardar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSector.setToolTipText("Guardar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSector.setToolTipText("Salir"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSector";
		inputMap = this.jButtonNuevoSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSector.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSector"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSector";
		inputMap = this.jButtonActualizarSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSector"));
		
		//ELIMINAR
		sMapKey = "EliminarSector";
		inputMap = this.jButtonEliminarSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSector"));
		
		//CANCELAR	
		sMapKey = "CancelarSector";
		inputMap = this.jButtonCancelarSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSector"));
		
		//CERRAR		
		sMapKey = "CerrarSector";
		inputMap = this.jButtonCerrarSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSector"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSector";
		inputMap = this.jButtonGuardarCambiosTablaSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSector"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSector = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSector.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSector.setToolTipText("Nuevo Sector");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSector, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSector = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSector.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSector.setToolTipText("Sin Cerrar Ventana Sector");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSector, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSector = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSector.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSector.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSector, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSector = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSector.setText("Accion");
		this.jComboBoxTiposAccionesSector.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSector = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSector.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSector.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSector = new JLabelMe();
		
		this.jLabelAccionesSector.setText("Acciones");		
		this.jLabelAccionesSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSector();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSector();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSector=new JTabbedPane();
		this.jTabbedPaneRelacionesSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSector,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSector.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSector.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSector.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSector.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSector.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSector.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSector, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSector = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSector = new GridBagLayout();
		
		this.jPanelCamposSector.setLayout(gridaBagLayoutCamposSector);
		this.jPanelCamposOcultosSector.setLayout(gridaBagLayoutCamposOcultosSector);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSector.gridy = 0;
	this.gridBagConstraintsSector.gridx = 0;
	this.gridBagConstraintsSector.ipadx = 0;
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSector.add(jLabelIdSector, this.gridBagConstraintsSector);



	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSector.gridy = 0;
	this.gridBagConstraintsSector.gridx = 1;
	this.gridBagConstraintsSector.ipadx = 0;
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSector.add(jLabelidSector, this.gridBagConstraintsSector);


	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSector.gridy = 0;
	this.gridBagConstraintsSector.gridx = 0;
	this.gridBagConstraintsSector.ipadx = 0;
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSector.add(jLabelid_empresaSector, this.gridBagConstraintsSector);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSector = new GridBagConstraints();
		//this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = 0;
		this.gridBagConstraintsSector.gridx = 2;
		this.gridBagConstraintsSector.ipadx = 0;
		this.gridBagConstraintsSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSector.add(jButtonid_empresaSectorBusqueda, this.gridBagConstraintsSector);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSector = new GridBagConstraints();
		//this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = 0;
		this.gridBagConstraintsSector.gridx = 3;
		this.gridBagConstraintsSector.ipadx = 0;
		this.gridBagConstraintsSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSector.add(jButtonid_empresaSectorUpdate, this.gridBagConstraintsSector);
	}

	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSector.gridy = 0;
	this.gridBagConstraintsSector.gridx = 1;
	this.gridBagConstraintsSector.ipadx = 0;
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSector.add(jComboBoxid_empresaSector, this.gridBagConstraintsSector);


	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSector.gridy = 0;
	this.gridBagConstraintsSector.gridx = 0;
	this.gridBagConstraintsSector.ipadx = 0;
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadSector.add(jLabelid_ciudadSector, this.gridBagConstraintsSector);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSector = new GridBagConstraints();
		//this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = 0;
		this.gridBagConstraintsSector.gridx = 2;
		this.gridBagConstraintsSector.ipadx = 0;
		this.gridBagConstraintsSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadSector.add(jButtonid_ciudadSectorBusqueda, this.gridBagConstraintsSector);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSector = new GridBagConstraints();
		//this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = 0;
		this.gridBagConstraintsSector.gridx = 3;
		this.gridBagConstraintsSector.ipadx = 0;
		this.gridBagConstraintsSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadSector.add(jButtonid_ciudadSectorUpdate, this.gridBagConstraintsSector);
	}

	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSector.gridy = 0;
	this.gridBagConstraintsSector.gridx = 1;
	this.gridBagConstraintsSector.ipadx = 0;
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadSector.add(jComboBoxid_ciudadSector, this.gridBagConstraintsSector);


	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSector.gridy = 0;
	this.gridBagConstraintsSector.gridx = 0;
	this.gridBagConstraintsSector.ipadx = 0;
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSector.add(jLabelnombreSector, this.gridBagConstraintsSector);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSector = new GridBagConstraints();
		//this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = 0;
		this.gridBagConstraintsSector.gridx = 2;
		this.gridBagConstraintsSector.ipadx = 0;
		this.gridBagConstraintsSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSector.add(jButtonnombreSectorBusqueda, this.gridBagConstraintsSector);
	}

	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSector.gridy = 0;
	this.gridBagConstraintsSector.gridx = 1;
	this.gridBagConstraintsSector.ipadx = 0;
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSector.add(jscrollPanenombreSector, this.gridBagConstraintsSector);


	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSector.gridy = 0;
	this.gridBagConstraintsSector.gridx = 0;
	this.gridBagConstraintsSector.ipadx = 0;
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionSector.add(jLabeldescripcionSector, this.gridBagConstraintsSector);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSector = new GridBagConstraints();
		//this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = 0;
		this.gridBagConstraintsSector.gridx = 2;
		this.gridBagConstraintsSector.ipadx = 0;
		this.gridBagConstraintsSector.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionSector.add(jButtondescripcionSectorBusqueda, this.gridBagConstraintsSector);
	}

	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSector.gridy = 0;
	this.gridBagConstraintsSector.gridx = 1;
	this.gridBagConstraintsSector.ipadx = 0;
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionSector.add(jscrollPanedescripcionSector, this.gridBagConstraintsSector);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSector.gridy = iYPanelCamposSector;
	this.gridBagConstraintsSector.gridx = iXPanelCamposSector++;
	this.gridBagConstraintsSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSector.add(this.jPanelidSector, this.gridBagConstraintsSector);



	if(iXPanelCamposSector % 1==0) {
		iXPanelCamposSector=0;
		iYPanelCamposSector++;
	}
	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSector.gridy = iYPanelCamposSector;
	this.gridBagConstraintsSector.gridx = iXPanelCamposSector++;
	this.gridBagConstraintsSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSector.add(this.jPanelid_ciudadSector, this.gridBagConstraintsSector);



	if(iXPanelCamposSector % 1==0) {
		iXPanelCamposSector=0;
		iYPanelCamposSector++;
	}
	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSector.gridy = iYPanelCamposSector;
	this.gridBagConstraintsSector.gridx = iXPanelCamposSector++;
	this.gridBagConstraintsSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSector.add(this.jPanelnombreSector, this.gridBagConstraintsSector);



	if(iXPanelCamposSector % 1==0) {
		iXPanelCamposSector=0;
		iYPanelCamposSector++;
	}
	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSector.gridy = iYPanelCamposSector;
	this.gridBagConstraintsSector.gridx = iXPanelCamposSector++;
	this.gridBagConstraintsSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSector.add(this.jPaneldescripcionSector, this.gridBagConstraintsSector);



	if(iXPanelCamposSector % 1==0) {
		iXPanelCamposSector=0;
		iYPanelCamposSector++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSector = new GridBagConstraints();
	this.gridBagConstraintsSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSector.gridy = iYPanelCamposOcultosSector;
	this.gridBagConstraintsSector.gridx = iXPanelCamposOcultosSector++;
	this.gridBagConstraintsSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSector.add(this.jPanelid_empresaSector, this.gridBagConstraintsSector);



	if(iXPanelCamposOcultosSector % 1==0) {
		iXPanelCamposOcultosSector=0;
		iYPanelCamposOcultosSector++;
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
			
		GridBagLayout gridaBagLayoutAccionesSector= new GridBagLayout();
		this.jPanelAccionesSector.setLayout(gridaBagLayoutAccionesSector);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSector= new GridBagLayout();
		this.jPanelAccionesFormularioSector.setLayout(gridaBagLayoutAccionesFormularioSector);
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSector.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSector.add(this.jComboBoxTiposAccionesFormularioSector, this.gridBagConstraintsSector);

		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSector.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSector.add(this.jCheckBoxPostAccionNuevoSector, this.gridBagConstraintsSector);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.sectorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSector.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSector.add(this.jCheckBoxPostAccionSinCerrarSector, this.gridBagConstraintsSector);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.sectorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.sectorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSector.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSector.add(this.jCheckBoxPostAccionSinMensajeSector, this.gridBagConstraintsSector);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = 0;
		this.gridBagConstraintsSector.gridx = iPosXAccion++;
			
		this.jPanelAccionesSector.add(this.jButtonModificarSector, this.gridBagConstraintsSector);							

		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = 0;
		this.gridBagConstraintsSector.gridx =iPosXAccion++;
			
		this.jPanelAccionesSector.add(this.jButtonEliminarSector, this.gridBagConstraintsSector);
		
			
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = 0;		
		this.gridBagConstraintsSector.gridx = iPosXAccion++;
		
		this.jPanelAccionesSector.add(this.jButtonActualizarSector, this.gridBagConstraintsSector);


		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = 0;		
		this.gridBagConstraintsSector.gridx = iPosXAccion++;
		
		this.jPanelAccionesSector.add(this.jButtonGuardarCambiosSector, this.gridBagConstraintsSector);	
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = 0;		
		this.gridBagConstraintsSector.gridx =iPosXAccion++;
		
		this.jPanelAccionesSector.add(this.jButtonCancelarSector, this.gridBagConstraintsSector);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSector = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSector);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sectorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSector = new GridBagConstraints();						
			this.gridBagConstraintsSector.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSector.gridx = 0;		
			//this.gridBagConstraintsSector.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSector.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSector.gridx =0;
		this.gridBagConstraintsSector.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSector.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSector, this.gridBagConstraintsSector);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SectorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSector = new SectorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sector DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sector DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sector Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SectorModel sectorModel=new SectorModel(this);
			
			//SI USARA CLASE INTERNA
			//SectorModel.SectorFocusTraversalPolicy sectorFocusTraversalPolicy = sectorModel.new SectorFocusTraversalPolicy(this);
			
			//sectorFocusTraversalPolicy.setsectorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(sectorModel);
			
			
			this.jContentPaneDetalleSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSector = new GridBagLayout();	
			this.jContentPaneDetalleSector.setLayout(gridaBagLayoutDetalleSector);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSector = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSector = new GridBagConstraints();
				this.gridBagConstraintsSector.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSector.gridx = 0;
					
				
				this.jContentPaneDetalleSector.add(jTtoolBarDetalleSector, gridBagConstraintsSector);								
				
}
			
			this.jScrollPanelDatosEdicionSector=   new JScrollPane(jContentPaneDetalleSector,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSector.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSector.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSector.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSector=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSector.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSector.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSector.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSector.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSector.gridx = 0;
	        
			this.jContentPaneDetalleSector.add(jPanelCamposSector, gridBagConstraintsSector);
			
			
			
			
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
						&& sectorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameRuta(this.puedeCargarPorParteRuta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubSector(this.puedeCargarPorParteSubSector,false,-1);
					
					if(this.sectorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSector= new GridBagConstraints();
						this.gridBagConstraintsSector.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSector.gridx = 0;
						this.jContentPaneDetalleSector.add(this.jTabbedPaneRelacionesSector, this.gridBagConstraintsSector);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSector.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameRuta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubSector(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSector.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSector = new GridBagConstraints();
					this.gridBagConstraintsSector.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSector.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSector.gridx = 0;
					
				
					this.jContentPaneDetalleSector.add(jPanelCamposOcultosSector, gridBagConstraintsSector);
				
					this.jPanelCamposOcultosSector.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsSector.gridx = 0;
	        this.gridBagConstraintsSector.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSector.add(this.jPanelAccionesFormularioSector, this.gridBagConstraintsSector);							
			
			
			
			this.gridBagConstraintsSector = new GridBagConstraints();
	        this.gridBagConstraintsSector.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsSector.gridx = 0;
	        
			
			this.jContentPaneDetalleSector.add(this.jPanelAccionesSector, this.gridBagConstraintsSector);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSector);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSector=   new JScrollPane(this.jPanelCamposSector,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSector.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSector.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSector.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSector.gridx = 0;
			this.gridBagConstraintsSector.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSector.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSector, this.gridBagConstraintsSector);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSector.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSector, this.gridBagConstraintsSector);			
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSector.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSector, this.gridBagConstraintsSector);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSector.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSector, this.gridBagConstraintsSector);
			
			
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSector.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSector, this.gridBagConstraintsSector);
		
			
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSector.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSector, this.gridBagConstraintsSector);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSector;//jContentPane;
		
		return jScrollPanelDatosEdicionSector;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameRuta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rutaSessionBean=new RutaSessionBean();
		this.rutaSessionBean.setConGuardarRelaciones(false);
		this.rutaSessionBean.setEsGuardarRelacionado(true);

		this.rutaBeanSwingJInternalFrame=null;//new RutaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rutaBeanSwingJInternalFramePopup=new RutaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rutaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rutaSessionBean.getEsGuardarRelacionado()) {

				RutaJInternalFrame.STIPO_TAMANIO_GENERAL=SectorJInternalFrame.STIPO_TAMANIO_GENERAL;
				RutaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SectorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rutaSessionBean.setEsGuardarRelacionado(true);

				this.rutaBeanSwingJInternalFrame=new RutaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rutaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rutaBeanSwingJInternalFrame.setrutaSessionBean(this.rutaSessionBean);

				//this.gridBagConstraintsSector = new GridBagConstraints();
				//this.gridBagConstraintsSector.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSector.gridx = 0;
				//this.jContentPaneDetalleSector.add(this.rutaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSector);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSector.add("Rutas",this.rutaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSector.setComponentAt(iIndexTab,this.rutaBeanSwingJInternalFrame.getContentPane());
				}

				//RutaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rutaSessionBean.setEsGuardarRelacionado(false);
				this.rutaBeanSwingJInternalFrame=null;//new RutaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rutaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRuta) {
					this.jTabbedPaneRelacionesSector.add("Rutas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSubSector(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subsectorSessionBean=new SubSectorSessionBean();
		this.subsectorSessionBean.setConGuardarRelaciones(false);
		this.subsectorSessionBean.setEsGuardarRelacionado(true);

		this.subsectorBeanSwingJInternalFrame=null;//new SubSectorBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subsectorBeanSwingJInternalFramePopup=new SubSectorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subsectorBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.subsectorSessionBean.getEsGuardarRelacionado()) {

				SubSectorJInternalFrame.STIPO_TAMANIO_GENERAL=SectorJInternalFrame.STIPO_TAMANIO_GENERAL;
				SubSectorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SectorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.subsectorSessionBean.setEsGuardarRelacionado(true);

				this.subsectorBeanSwingJInternalFrame=new SubSectorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subsectorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.subsectorBeanSwingJInternalFrame.setsubsectorSessionBean(this.subsectorSessionBean);

				//this.gridBagConstraintsSector = new GridBagConstraints();
				//this.gridBagConstraintsSector.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSector.gridx = 0;
				//this.jContentPaneDetalleSector.add(this.subsectorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSector);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSector.add("Sectores",this.subsectorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSector.setComponentAt(iIndexTab,this.subsectorBeanSwingJInternalFrame.getContentPane());
				}

				//SubSectorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subsectorSessionBean.setEsGuardarRelacionado(false);
				this.subsectorBeanSwingJInternalFrame=null;//new SubSectorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subsectorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubSector) {
					this.jTabbedPaneRelacionesSector.add("Sectores",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarRutaBeanSwingJInternalFrame(List<Sector> sectors,Sector sector,RutaBeanSwingJInternalFrame rutaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rutaBeanSwingJInternalFrame=new RutaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rutaBeanSwingJInternalFrame.getRutaLogic().setConnexion(this.sectorLogic.getConnexion());

					rutaBeanSwingJInternalFrame.setsectororigensForeignKey(sectors);
					rutaBeanSwingJInternalFrame.setsectororigenForeignKey(sector);
					rutaBeanSwingJInternalFrame.rutaSessionBean.setisBusquedaDesdeForeignKeySesionSectorOrigen(true);
					rutaBeanSwingJInternalFrame.rutaSessionBean.setlidSectorOrigenActual(sector.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rutaBeanSwingJInternalFrame.cargarCombosForeignKeyRuta(rutaBeanSwingJInternalFrame.isCargarCombosDependencia);
					rutaBeanSwingJInternalFrame.setVisibilidadBusquedasParaSectorOrigen(true);
					rutaBeanSwingJInternalFrame.setid_sector_origenFK_IdSectorOrigen(sector.getId());

					if(!this.conCargarFormDetalle) {
						rutaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rutaBeanSwingJInternalFrame.setSelectedItemCombosFrameSectorOrigenForeignKey(sector,1,false,true,true);
					rutaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rutaBeanSwingJInternalFrame.procesarBusqueda("FK_IdSector");
					rutaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSector");
					rutaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRuta(true);
					rutaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRuta("n",rutaBeanSwingJInternalFrame.isGuardarCambiosEnLote, rutaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rutaBeanSwingJInternalFrame.setAutoscrolls(true);
					rutaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rutaBeanSwingJInternalFrame.actualizarEstadoPanelsRuta("relacionado");
					} else {
						rutaBeanSwingJInternalFrame.actualizarEstadoPanelsRuta("no_relacionado");
					}

					rutaBeanSwingJInternalFrame.getjButtonRecargarInformacionRuta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSubSectorBeanSwingJInternalFrame(List<Sector> sectors,Sector sector,SubSectorBeanSwingJInternalFrame subsectorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subsectorBeanSwingJInternalFrame=new SubSectorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subsectorBeanSwingJInternalFrame.getSubSectorLogic().setConnexion(this.sectorLogic.getConnexion());

					subsectorBeanSwingJInternalFrame.setsectorsForeignKey(sectors);
					subsectorBeanSwingJInternalFrame.setsectorForeignKey(sector);
					subsectorBeanSwingJInternalFrame.subsectorSessionBean.setisBusquedaDesdeForeignKeySesionSector(true);
					subsectorBeanSwingJInternalFrame.subsectorSessionBean.setlidSectorActual(sector.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					subsectorBeanSwingJInternalFrame.cargarCombosForeignKeySubSector(subsectorBeanSwingJInternalFrame.isCargarCombosDependencia);
					subsectorBeanSwingJInternalFrame.setVisibilidadBusquedasParaSector(true);
					subsectorBeanSwingJInternalFrame.setid_sectorFK_IdSector(sector.getId());

					if(!this.conCargarFormDetalle) {
						subsectorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					subsectorBeanSwingJInternalFrame.setSelectedItemCombosFrameSectorForeignKey(sector,1,false,true,true);
					subsectorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subsectorBeanSwingJInternalFrame.procesarBusqueda("FK_IdSector");
					subsectorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSector");
					subsectorBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubSector(true);
					subsectorBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSubSector("n",subsectorBeanSwingJInternalFrame.isGuardarCambiosEnLote, subsectorBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					subsectorBeanSwingJInternalFrame.setAutoscrolls(true);
					subsectorBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subsectorBeanSwingJInternalFrame.actualizarEstadoPanelsSubSector("relacionado");
					} else {
						subsectorBeanSwingJInternalFrame.actualizarEstadoPanelsSubSector("no_relacionado");
					}

					subsectorBeanSwingJInternalFrame.getjButtonRecargarInformacionSubSector().setVisible(false);

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
