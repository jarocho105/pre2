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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.TipoAreaLaboConstantesFunciones;

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
public class TipoAreaLaboDetalleFormJInternalFrame extends TipoAreaLaboBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoAreaLabo;
	
	protected JMenuBar jmenuBarDetalleTipoAreaLabo;
	
	protected JMenu jmenuDetalleTipoAreaLabo;
	protected JMenu jmenuDetalleArchivoTipoAreaLabo;
	protected JMenu jmenuDetalleAccionesTipoAreaLabo;
	protected JMenu jmenuDetalleDatosTipoAreaLabo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAreaLabo;	
	protected GridBagConstraints gridBagConstraintsTipoAreaLabo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoAreaLaboBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoAreaLabo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoAreaLaboSessionBean tipoarealaboSessionBean;
	
	

	public InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFrame=null;
	public InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteInformacionLaboral=false;
	public InformacionLaboralSessionBean informacionlaboralSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoAreaLaboLogic tipoarealaboLogic;
	
	public JScrollPane jScrollPanelDatosTipoAreaLabo;
	public JScrollPane jScrollPanelDatosEdicionTipoAreaLabo;
	public JScrollPane jScrollPanelDatosGeneralTipoAreaLabo;
	
	protected JPanel jPanelCamposTipoAreaLabo;    
	protected JPanel jPanelCamposOcultosTipoAreaLabo;    	
	protected JPanel jPanelAccionesTipoAreaLabo;
	protected JPanel jPanelAccionesFormularioTipoAreaLabo;
    
	
	
	protected Integer iXPanelCamposTipoAreaLabo=0;
	protected Integer iYPanelCamposTipoAreaLabo=0;
	
	protected Integer iXPanelCamposOcultosTipoAreaLabo=0;
	protected Integer iYPanelCamposOcultosTipoAreaLabo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoAreaLabo;
	public JButton jButtonModificarTipoAreaLabo;
	public JButton jButtonActualizarTipoAreaLabo;
    public JButton jButtonEliminarTipoAreaLabo;
	public JButton jButtonCancelarTipoAreaLabo;
    public JButton jButtonGuardarCambiosTipoAreaLabo;
	public JButton jButtonGuardarCambiosTablaTipoAreaLabo;
	protected JButton jButtonCerrarTipoAreaLabo;
	
	
	protected JButton jButtonProcesarInformacionTipoAreaLabo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoAreaLabo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoAreaLabo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoAreaLabo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAreaLabo;
	protected JButton jButtonModificarToolBarTipoAreaLabo;
	protected JButton jButtonActualizarToolBarTipoAreaLabo;
    protected JButton jButtonEliminarToolBarTipoAreaLabo;
	protected JButton jButtonCancelarToolBarTipoAreaLabo;
    protected JButton jButtonGuardarCambiosToolBarTipoAreaLabo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoAreaLabo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAreaLabo;
	protected JButton jButtonCerrarToolBarTipoAreaLabo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoAreaLabo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAreaLabo;
	protected JMenuItem jMenuItemModificarTipoAreaLabo;
	protected JMenuItem jMenuItemActualizarTipoAreaLabo;
    protected JMenuItem jMenuItemEliminarTipoAreaLabo;
	protected JMenuItem jMenuItemCancelarTipoAreaLabo;
    protected JMenuItem jMenuItemGuardarCambiosTipoAreaLabo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAreaLabo;
	protected JMenuItem jMenuItemCerrarTipoAreaLabo;
	protected JMenuItem jMenuItemDetalleCerrarTipoAreaLabo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAreaLabo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoAreaLabo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAreaLabo;
	protected JMenuItem jMenuItemMostrarOcultarTipoAreaLabo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAreaLabo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAreaLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAreaLabo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoAreaLabo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoAreaLabo;
	public JLabel jLabelIdTipoAreaLabo;
	public JLabel jLabelidTipoAreaLabo;
	public JButton jButtonidTipoAreaLaboBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoAreaLabo;
	public JLabel jLabelcodigoTipoAreaLabo;
	public JTextField jTextFieldcodigoTipoAreaLabo;
	public JButton jButtoncodigoTipoAreaLaboBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoAreaLabo;
	public JLabel jLabelnombreTipoAreaLabo;
	public JTextArea jTextAreanombreTipoAreaLabo;
	public JScrollPane jscrollPanenombreTipoAreaLabo;
	public JButton jButtonnombreTipoAreaLaboBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoAreaLabo;
	public JLabel jLabelid_empresaTipoAreaLabo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoAreaLabo;
	public JButton jButtonid_empresaTipoAreaLabo= new JButtonMe();
	public JButton jButtonid_empresaTipoAreaLaboUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoAreaLaboBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoAreaLabo;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoAreaLaboDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoAreaLabo=new JPanel();
				this.jPanelAccionesFormularioTipoAreaLabo=new JPanel();
				this.jmenuBarDetalleTipoAreaLabo=new JMenuBar();
				this.jTtoolBarDetalleTipoAreaLabo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaLaboDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoAreaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoAreaLaboDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoAreaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaLaboDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAreaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaLaboDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAreaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaLaboDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAreaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoAreaLabo() {
		return this.jButtonActualizarToolBarTipoAreaLabo;
	}
	
	public JButton getjButtonEliminarToolBarTipoAreaLabo() {
		return this.jButtonEliminarToolBarTipoAreaLabo;
	}
	
	public JButton getjButtonCancelarToolBarTipoAreaLabo() {
		return this.jButtonCancelarToolBarTipoAreaLabo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoAreaLabo() {
		return this.jButtonProcesarInformacionTipoAreaLabo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAreaLabo)	{
		this.jButtonProcesarInformacionTipoAreaLabo = jButtonProcesarInformacionTipoAreaLabo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAreaLabo() {
		return this.jComboBoxTiposAccionesTipoAreaLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAreaLabo(
			JComboBox jComboBoxTiposRelacionesTipoAreaLabo) {
		this.jComboBoxTiposRelacionesTipoAreaLabo = jComboBoxTiposRelacionesTipoAreaLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAreaLabo(
			JComboBox jComboBoxTiposAccionesTipoAreaLabo) {
		this.jComboBoxTiposAccionesTipoAreaLabo = jComboBoxTiposAccionesTipoAreaLabo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoAreaLabo() {
		return this.jComboBoxTiposAccionesFormularioTipoAreaLabo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoAreaLabo(
			JComboBox jComboBoxTiposAccionesFormularioTipoAreaLabo) {
		this.jComboBoxTiposAccionesFormularioTipoAreaLabo = jComboBoxTiposAccionesFormularioTipoAreaLabo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
		
		this.tipoarealaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoarealaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoarealaboSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAreaLaboJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAreaLaboJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAreaLaboJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Area Labo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoAreaLaboJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoAreaLabo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoAreaLabo=new JButtonMe();
				this.jButtonModificarToolBarTipoAreaLabo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoAreaLabo,this.jTtoolBarDetalleTipoAreaLabo,
							"actualizar","actualizar","Actualizar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoAreaLabo,this.jTtoolBarDetalleTipoAreaLabo,
							"eliminar","eliminar","Eliminar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoAreaLabo,this.jTtoolBarDetalleTipoAreaLabo,
							"cancelar","cancelar","Cancelar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoAreaLabo,this.jTtoolBarDetalleTipoAreaLabo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoAreaLabo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoAreaLabo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoAreaLabo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoAreaLabo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoAreaLabo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAreaLabo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAreaLabo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAreaLabo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoAreaLabo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoAreaLabo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoAreaLabo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoAreaLabo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoAreaLabo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoAreaLabo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoAreaLabo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoAreaLabo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoAreaLabo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoAreaLabo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoAreaLabo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoAreaLabo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoAreaLabo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAreaLabo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAreaLabo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAreaLabo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAreaLabo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAreaLabo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoAreaLabo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoAreaLabo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoAreaLabo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAreaLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAreaLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAreaLabo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAreaLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAreaLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAreaLabo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoAreaLabo.add(this.jMenuItemDetalleCerrarTipoAreaLabo);
		
		this.jmenuDetalleAccionesTipoAreaLabo.add(this.jMenuItemActualizarTipoAreaLabo);
		this.jmenuDetalleAccionesTipoAreaLabo.add(this.jMenuItemEliminarTipoAreaLabo);
		this.jmenuDetalleAccionesTipoAreaLabo.add(this.jMenuItemCancelarTipoAreaLabo);		
		
		//this.jmenuDetalleDatosTipoAreaLabo.add(this.jMenuItemDetalleAbrirOrderByTipoAreaLabo);				
		this.jmenuDetalleDatosTipoAreaLabo.add(this.jMenuItemDetalleMostarOcultarTipoAreaLabo);				
				
		//this.jmenuDetalleAccionesTipoAreaLabo.add(this.jMenuItemGuardarCambiosTipoAreaLabo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoAreaLabo.add(this.jmenuDetalleArchivoTipoAreaLabo);		
		this.jmenuBarDetalleTipoAreaLabo.add(this.jmenuDetalleAccionesTipoAreaLabo);		
		this.jmenuBarDetalleTipoAreaLabo.add(this.jmenuDetalleDatosTipoAreaLabo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoAreaLabo.add(this.jmenuDetalleTipoAreaLabo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoAreaLabo);				
	}
	
	
	public void inicializarElementosCamposTipoAreaLabo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoAreaLabo = new JLabelMe();
		jLabelIdTipoAreaLabo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoAreaLabo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoAreaLabo.setToolTipText(TipoAreaLaboConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoAreaLabo= new GridBagLayout();

		this.jPanelidTipoAreaLabo.setLayout(this.gridaBagLayoutTipoAreaLabo);

		jLabelidTipoAreaLabo = new JLabel();
		jLabelidTipoAreaLabo.setText("Id");

		jLabelidTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoAreaLabo = new JLabelMe();
		this.jLabelcodigoTipoAreaLabo.setText(""+TipoAreaLaboConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoAreaLabo.setToolTipText("Codigo");
		this.jLabelcodigoTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoAreaLabo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoAreaLabo.setToolTipText(TipoAreaLaboConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoAreaLabo = new GridBagLayout();
		this.jPanelcodigoTipoAreaLabo.setLayout(this.gridaBagLayoutTipoAreaLabo);


		jTextFieldcodigoTipoAreaLabo= new JTextFieldMe();

		jTextFieldcodigoTipoAreaLabo.setEnabled(false);
		jTextFieldcodigoTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoAreaLaboBusqueda= new JButtonMe();
		this.jButtoncodigoTipoAreaLaboBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoAreaLaboBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoAreaLaboBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoAreaLaboBusqueda.setText("U");
		this.jButtoncodigoTipoAreaLaboBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoAreaLaboBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoAreaLaboBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoAreaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoAreaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoAreaLaboBusqueda"));

		if(this.tipoarealaboSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoAreaLaboBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoAreaLabo = new JLabelMe();
		this.jLabelnombreTipoAreaLabo.setText(""+TipoAreaLaboConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoAreaLabo.setToolTipText("Nombre");
		this.jLabelnombreTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoAreaLabo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoAreaLabo.setToolTipText(TipoAreaLaboConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoAreaLabo = new GridBagLayout();
		this.jPanelnombreTipoAreaLabo.setLayout(this.gridaBagLayoutTipoAreaLabo);


		jTextAreanombreTipoAreaLabo= new JTextAreaMe();
		jTextAreanombreTipoAreaLabo.setEnabled(false);
		jTextAreanombreTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAreaLabo.setLineWrap(true);
		jTextAreanombreTipoAreaLabo.setWrapStyleWord(true);
		jTextAreanombreTipoAreaLabo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoAreaLabo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoAreaLabo = new JScrollPane(jTextAreanombreTipoAreaLabo);
		jscrollPanenombreTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoAreaLaboBusqueda= new JButtonMe();
		this.jButtonnombreTipoAreaLaboBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAreaLaboBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAreaLaboBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoAreaLaboBusqueda.setText("U");
		this.jButtonnombreTipoAreaLaboBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoAreaLaboBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoAreaLaboBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoAreaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoAreaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoAreaLaboBusqueda"));

		if(this.tipoarealaboSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoAreaLaboBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoAreaLabo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoAreaLabo = new JLabelMe();
		this.jLabelid_empresaTipoAreaLabo.setText(""+TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoAreaLabo.setToolTipText("Empresa");
		this.jLabelid_empresaTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoAreaLabo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoAreaLabo.setToolTipText(TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoAreaLabo = new GridBagLayout();
		this.jPanelid_empresaTipoAreaLabo.setLayout(this.gridaBagLayoutTipoAreaLabo);


		jComboBoxid_empresaTipoAreaLabo= new JComboBoxMe();
		jComboBoxid_empresaTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoAreaLabo.setEnabled(false);

		this.jButtonid_empresaTipoAreaLabo= new JButtonMe();
		this.jButtonid_empresaTipoAreaLabo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAreaLabo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAreaLabo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAreaLabo.setText("Buscar");
		this.jButtonid_empresaTipoAreaLabo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoAreaLabo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAreaLabo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoAreaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAreaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAreaLabo"));

		this.jButtonid_empresaTipoAreaLaboBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoAreaLaboBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAreaLaboBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAreaLaboBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoAreaLaboBusqueda.setText("U");
		this.jButtonid_empresaTipoAreaLaboBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoAreaLaboBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAreaLaboBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoAreaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAreaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAreaLaboBusqueda"));

		if(this.tipoarealaboSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoAreaLaboBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoAreaLaboUpdate= new JButtonMe();
		this.jButtonid_empresaTipoAreaLaboUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAreaLaboUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAreaLaboUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoAreaLaboUpdate.setText("U");
		this.jButtonid_empresaTipoAreaLaboUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoAreaLaboUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAreaLaboUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoAreaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAreaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAreaLaboUpdate"));



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
		//this.jInternalFrameDetalleTipoAreaLabo = new TipoAreaLaboBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Area Labo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAreaLabo= new GridBagLayout();
		

		
		String sToolTipTipoAreaLabo="";
		sToolTipTipoAreaLabo=TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAreaLabo+="(Cartera.TipoAreaLabo)";
		}
		
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAreaLabo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoAreaLabo = new JButtonMe();
		this.jButtonModificarTipoAreaLabo = new JButtonMe();
        this.jButtonActualizarTipoAreaLabo = new JButtonMe();
        this.jButtonEliminarTipoAreaLabo = new JButtonMe();
        this.jButtonCancelarTipoAreaLabo = new JButtonMe();
        this.jButtonGuardarCambiosTipoAreaLabo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoAreaLabo = new JButtonMe();
		this.jButtonCerrarTipoAreaLabo = new JButtonMe();
		
		this.jScrollPanelDatosTipoAreaLabo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoAreaLabo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoAreaLabo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Area Labo";
		
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Labos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAreaLabo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoAreaLabo.setName("jPanelCamposTipoAreaLabo"); 

		this.jPanelCamposOcultosTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoAreaLabo.setName("jPanelCamposOcultosTipoAreaLabo"); 

        this.jPanelAccionesTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAreaLabo.setToolTipText("Acciones");
        this.jPanelAccionesTipoAreaLabo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoAreaLabo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoAreaLabo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoAreaLabo.setText("Nuevo");
		this.jButtonModificarTipoAreaLabo.setText("Editar");
        this.jButtonActualizarTipoAreaLabo.setText("Actualizar");
        this.jButtonEliminarTipoAreaLabo.setText("Eliminar");
        this.jButtonCancelarTipoAreaLabo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoAreaLabo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoAreaLabo.setText("Guardar");
		this.jButtonCerrarTipoAreaLabo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAreaLabo,"nuevo_button","Nuevo",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoAreaLabo,"modificar_button","Editar",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoAreaLabo,"actualizar_button","Actualizar",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoAreaLabo,"eliminar_button","Eliminar",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoAreaLabo,"cancelar_button","Cancelar",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoAreaLabo,"guardarcambios_button","Guardar",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAreaLabo,"guardarcambiostabla_button","Guardar",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAreaLabo,"cerrar_button","Salir",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoAreaLabo.setToolTipText("Nuevo"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoAreaLabo.setToolTipText("Editar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoAreaLabo.setToolTipText("Actualizar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoAreaLabo.setToolTipText("Eliminar)"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoAreaLabo.setToolTipText("Cancelar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoAreaLabo.setToolTipText("Guardar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoAreaLabo.setToolTipText("Guardar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAreaLabo.setToolTipText("Salir"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAreaLabo";
		inputMap = this.jButtonNuevoTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAreaLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAreaLabo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoAreaLabo";
		inputMap = this.jButtonActualizarTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoAreaLabo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoAreaLabo";
		inputMap = this.jButtonEliminarTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoAreaLabo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoAreaLabo";
		inputMap = this.jButtonCancelarTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoAreaLabo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoAreaLabo";
		inputMap = this.jButtonCerrarTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAreaLabo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAreaLabo";
		inputMap = this.jButtonGuardarCambiosTablaTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAreaLabo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoAreaLabo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoAreaLabo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoAreaLabo.setToolTipText("Nuevo TipoAreaLabo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoAreaLabo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoAreaLabo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoAreaLabo.setToolTipText("Sin Cerrar Ventana TipoAreaLabo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoAreaLabo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoAreaLabo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoAreaLabo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoAreaLabo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAreaLabo.setText("Accion");
		this.jComboBoxTiposAccionesTipoAreaLabo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoAreaLabo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoAreaLabo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoAreaLabo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoAreaLabo = new JLabelMe();
		
		this.jLabelAccionesTipoAreaLabo.setText("Acciones");		
		this.jLabelAccionesTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoAreaLabo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoAreaLabo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoAreaLabo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoAreaLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAreaLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAreaLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoAreaLabo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAreaLabo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAreaLabo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoAreaLabo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoAreaLabo = new GridBagLayout();
		
		this.jPanelCamposTipoAreaLabo.setLayout(gridaBagLayoutCamposTipoAreaLabo);
		this.jPanelCamposOcultosTipoAreaLabo.setLayout(gridaBagLayoutCamposOcultosTipoAreaLabo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaLabo.gridy = 0;
	this.gridBagConstraintsTipoAreaLabo.gridx = 0;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoAreaLabo.add(jLabelIdTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);



	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaLabo.gridy = 0;
	this.gridBagConstraintsTipoAreaLabo.gridx = 1;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoAreaLabo.add(jLabelidTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);


	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaLabo.gridy = 0;
	this.gridBagConstraintsTipoAreaLabo.gridx = 0;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoAreaLabo.add(jLabelid_empresaTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = 0;
		this.gridBagConstraintsTipoAreaLabo.gridx = 2;
		this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
		this.gridBagConstraintsTipoAreaLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoAreaLabo.add(jButtonid_empresaTipoAreaLaboBusqueda, this.gridBagConstraintsTipoAreaLabo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = 0;
		this.gridBagConstraintsTipoAreaLabo.gridx = 3;
		this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
		this.gridBagConstraintsTipoAreaLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoAreaLabo.add(jButtonid_empresaTipoAreaLaboUpdate, this.gridBagConstraintsTipoAreaLabo);
	}

	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaLabo.gridy = 0;
	this.gridBagConstraintsTipoAreaLabo.gridx = 1;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoAreaLabo.add(jComboBoxid_empresaTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);


	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaLabo.gridy = 0;
	this.gridBagConstraintsTipoAreaLabo.gridx = 0;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoAreaLabo.add(jLabelcodigoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = 0;
		this.gridBagConstraintsTipoAreaLabo.gridx = 2;
		this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
		this.gridBagConstraintsTipoAreaLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoAreaLabo.add(jButtoncodigoTipoAreaLaboBusqueda, this.gridBagConstraintsTipoAreaLabo);
	}

	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaLabo.gridy = 0;
	this.gridBagConstraintsTipoAreaLabo.gridx = 1;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoAreaLabo.add(jTextFieldcodigoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);


	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaLabo.gridy = 0;
	this.gridBagConstraintsTipoAreaLabo.gridx = 0;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoAreaLabo.add(jLabelnombreTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = 0;
		this.gridBagConstraintsTipoAreaLabo.gridx = 2;
		this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
		this.gridBagConstraintsTipoAreaLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoAreaLabo.add(jButtonnombreTipoAreaLaboBusqueda, this.gridBagConstraintsTipoAreaLabo);
	}

	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaLabo.gridy = 0;
	this.gridBagConstraintsTipoAreaLabo.gridx = 1;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoAreaLabo.add(jscrollPanenombreTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAreaLabo.gridy = iYPanelCamposTipoAreaLabo;
	this.gridBagConstraintsTipoAreaLabo.gridx = iXPanelCamposTipoAreaLabo++;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAreaLabo.add(this.jPanelidTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);



	if(iXPanelCamposTipoAreaLabo % 1==0) {
		iXPanelCamposTipoAreaLabo=0;
		iYPanelCamposTipoAreaLabo++;
	}
	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAreaLabo.gridy = iYPanelCamposTipoAreaLabo;
	this.gridBagConstraintsTipoAreaLabo.gridx = iXPanelCamposTipoAreaLabo++;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAreaLabo.add(this.jPanelcodigoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);



	if(iXPanelCamposTipoAreaLabo % 1==0) {
		iXPanelCamposTipoAreaLabo=0;
		iYPanelCamposTipoAreaLabo++;
	}
	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAreaLabo.gridy = iYPanelCamposTipoAreaLabo;
	this.gridBagConstraintsTipoAreaLabo.gridx = iXPanelCamposTipoAreaLabo++;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAreaLabo.add(this.jPanelnombreTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);



	if(iXPanelCamposTipoAreaLabo % 1==0) {
		iXPanelCamposTipoAreaLabo=0;
		iYPanelCamposTipoAreaLabo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAreaLabo.gridy = iYPanelCamposOcultosTipoAreaLabo;
	this.gridBagConstraintsTipoAreaLabo.gridx = iXPanelCamposOcultosTipoAreaLabo++;
	this.gridBagConstraintsTipoAreaLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAreaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoAreaLabo.add(this.jPanelid_empresaTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);



	if(iXPanelCamposOcultosTipoAreaLabo % 1==0) {
		iXPanelCamposOcultosTipoAreaLabo=0;
		iYPanelCamposOcultosTipoAreaLabo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoAreaLabo= new GridBagLayout();
		this.jPanelAccionesTipoAreaLabo.setLayout(gridaBagLayoutAccionesTipoAreaLabo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoAreaLabo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoAreaLabo.setLayout(gridaBagLayoutAccionesFormularioTipoAreaLabo);
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAreaLabo.add(this.jComboBoxTiposAccionesFormularioTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);

		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAreaLabo.add(this.jCheckBoxPostAccionNuevoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAreaLabo.add(this.jCheckBoxPostAccionSinCerrarTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAreaLabo.add(this.jCheckBoxPostAccionSinMensajeTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = 0;
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoAreaLabo.add(this.jButtonModificarTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);							

		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = 0;
		this.gridBagConstraintsTipoAreaLabo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoAreaLabo.add(this.jButtonEliminarTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
			
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = 0;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAreaLabo.add(this.jButtonActualizarTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);


		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = 0;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAreaLabo.add(this.jButtonGuardarCambiosTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);	
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = 0;		
		this.gridBagConstraintsTipoAreaLabo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoAreaLabo.add(this.jButtonCancelarTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAreaLabo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAreaLabo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();						
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAreaLabo.gridx = 0;		
			//this.gridBagConstraintsTipoAreaLabo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAreaLabo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAreaLabo.gridx =0;
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAreaLabo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoAreaLaboJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoAreaLabo = new TipoAreaLaboBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Area Labo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Area Labo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Area Labo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoAreaLaboModel tipoarealaboModel=new TipoAreaLaboModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoAreaLaboModel.TipoAreaLaboFocusTraversalPolicy tipoarealaboFocusTraversalPolicy = tipoarealaboModel.new TipoAreaLaboFocusTraversalPolicy(this);
			
			//tipoarealaboFocusTraversalPolicy.settipoarealaboJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoarealaboModel);
			
			
			this.jContentPaneDetalleTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoAreaLabo = new GridBagLayout();	
			this.jContentPaneDetalleTipoAreaLabo.setLayout(gridaBagLayoutDetalleTipoAreaLabo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAreaLabo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoAreaLabo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoAreaLabo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoAreaLabo.add(jTtoolBarDetalleTipoAreaLabo, gridBagConstraintsTipoAreaLabo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoAreaLabo=   new JScrollPane(jContentPaneDetalleTipoAreaLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAreaLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAreaLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAreaLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoAreaLabo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAreaLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAreaLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAreaLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoAreaLabo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoAreaLabo.gridx = 0;
	        
			this.jContentPaneDetalleTipoAreaLabo.add(jPanelCamposTipoAreaLabo, gridBagConstraintsTipoAreaLabo);
			
			
			
			
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
						&& tipoarealaboSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameInformacionLaboral(this.puedeCargarPorParteInformacionLaboral,false,-1);
					
					if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoAreaLabo= new GridBagConstraints();
						this.gridBagConstraintsTipoAreaLabo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoAreaLabo.gridx = 0;
						this.jContentPaneDetalleTipoAreaLabo.add(this.jTabbedPaneRelacionesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoAreaLabo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameInformacionLaboral(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoAreaLabo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
					this.gridBagConstraintsTipoAreaLabo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoAreaLabo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoAreaLabo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoAreaLabo.add(jPanelCamposOcultosTipoAreaLabo, gridBagConstraintsTipoAreaLabo);
				
					this.jPanelCamposOcultosTipoAreaLabo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoAreaLabo.gridx = 0;
	        this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoAreaLabo.add(this.jPanelAccionesFormularioTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);							
			
			
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
	        this.gridBagConstraintsTipoAreaLabo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoAreaLabo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoAreaLabo.add(this.jPanelAccionesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoAreaLabo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoAreaLabo=   new JScrollPane(this.jPanelCamposTipoAreaLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAreaLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAreaLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAreaLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoAreaLabo.gridx = 0;
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoAreaLabo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAreaLabo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);			
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAreaLabo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			
			
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
			
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaLabo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoAreaLabo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoAreaLabo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameInformacionLaboral(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		this.informacionlaboralSessionBean.setConGuardarRelaciones(false);
		this.informacionlaboralSessionBean.setEsGuardarRelacionado(true);

		this.informacionlaboralBeanSwingJInternalFrame=null;//new InformacionLaboralBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.informacionlaboralBeanSwingJInternalFramePopup=new InformacionLaboralBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.informacionlaboralBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {

				InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL=TipoAreaLaboJInternalFrame.STIPO_TAMANIO_GENERAL;
				InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoAreaLaboJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.informacionlaboralSessionBean.setEsGuardarRelacionado(true);

				this.informacionlaboralBeanSwingJInternalFrame=new InformacionLaboralBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.informacionlaboralBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.informacionlaboralBeanSwingJInternalFrame.setinformacionlaboralSessionBean(this.informacionlaboralSessionBean);

				//this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
				//this.gridBagConstraintsTipoAreaLabo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoAreaLabo.gridx = 0;
				//this.jContentPaneDetalleTipoAreaLabo.add(this.informacionlaboralBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoAreaLabo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoAreaLabo.add("Informacion Laborales",this.informacionlaboralBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoAreaLabo.setComponentAt(iIndexTab,this.informacionlaboralBeanSwingJInternalFrame.getContentPane());
				}

				//InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.informacionlaboralSessionBean.setEsGuardarRelacionado(false);
				this.informacionlaboralBeanSwingJInternalFrame=null;//new InformacionLaboralBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteInformacionLaboral) {
					this.jTabbedPaneRelacionesTipoAreaLabo.add("Informacion Laborales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarInformacionLaboralBeanSwingJInternalFrame(List<TipoAreaLabo> tipoarealabos,TipoAreaLabo tipoarealabo,InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//informacionlaboralBeanSwingJInternalFrame=new InformacionLaboralBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					informacionlaboralBeanSwingJInternalFrame.getInformacionLaboralLogic().setConnexion(this.tipoarealaboLogic.getConnexion());

					informacionlaboralBeanSwingJInternalFrame.settipoarealabosForeignKey(tipoarealabos);
					informacionlaboralBeanSwingJInternalFrame.settipoarealaboForeignKey(tipoarealabo);
					informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setisBusquedaDesdeForeignKeySesionTipoAreaLabo(true);
					informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setlidTipoAreaLaboActual(tipoarealabo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					informacionlaboralBeanSwingJInternalFrame.cargarCombosForeignKeyInformacionLaboral(informacionlaboralBeanSwingJInternalFrame.isCargarCombosDependencia);
					informacionlaboralBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoAreaLabo(true);
					informacionlaboralBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					informacionlaboralBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoAreaLabo");
					informacionlaboralBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoAreaLabo");
					informacionlaboralBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionLaboral(true);
					informacionlaboralBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesInformacionLaboral("n",informacionlaboralBeanSwingJInternalFrame.isGuardarCambiosEnLote, informacionlaboralBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					informacionlaboralBeanSwingJInternalFrame.setAutoscrolls(true);
					informacionlaboralBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						informacionlaboralBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionLaboral("relacionado");
					} else {
						informacionlaboralBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionLaboral("no_relacionado");
					}

					informacionlaboralBeanSwingJInternalFrame.getjButtonRecargarInformacionInformacionLaboral().setVisible(false);

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
