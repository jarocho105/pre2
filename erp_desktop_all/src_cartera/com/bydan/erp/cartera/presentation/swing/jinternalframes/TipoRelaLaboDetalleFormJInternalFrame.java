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
import com.bydan.erp.cartera.util.TipoRelaLaboConstantesFunciones;

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
public class TipoRelaLaboDetalleFormJInternalFrame extends TipoRelaLaboBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRelaLabo;
	
	protected JMenuBar jmenuBarDetalleTipoRelaLabo;
	
	protected JMenu jmenuDetalleTipoRelaLabo;
	protected JMenu jmenuDetalleArchivoTipoRelaLabo;
	protected JMenu jmenuDetalleAccionesTipoRelaLabo;
	protected JMenu jmenuDetalleDatosTipoRelaLabo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRelaLabo;	
	protected GridBagConstraints gridBagConstraintsTipoRelaLabo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRelaLaboBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRelaLabo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoRelaLaboSessionBean tiporelalaboSessionBean;
	
	

	public InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFrame=null;
	public InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteInformacionLaboral=false;
	public InformacionLaboralSessionBean informacionlaboralSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoRelaLaboLogic tiporelalaboLogic;
	
	public JScrollPane jScrollPanelDatosTipoRelaLabo;
	public JScrollPane jScrollPanelDatosEdicionTipoRelaLabo;
	public JScrollPane jScrollPanelDatosGeneralTipoRelaLabo;
	
	protected JPanel jPanelCamposTipoRelaLabo;    
	protected JPanel jPanelCamposOcultosTipoRelaLabo;    	
	protected JPanel jPanelAccionesTipoRelaLabo;
	protected JPanel jPanelAccionesFormularioTipoRelaLabo;
    
	
	
	protected Integer iXPanelCamposTipoRelaLabo=0;
	protected Integer iYPanelCamposTipoRelaLabo=0;
	
	protected Integer iXPanelCamposOcultosTipoRelaLabo=0;
	protected Integer iYPanelCamposOcultosTipoRelaLabo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRelaLabo;
	public JButton jButtonModificarTipoRelaLabo;
	public JButton jButtonActualizarTipoRelaLabo;
    public JButton jButtonEliminarTipoRelaLabo;
	public JButton jButtonCancelarTipoRelaLabo;
    public JButton jButtonGuardarCambiosTipoRelaLabo;
	public JButton jButtonGuardarCambiosTablaTipoRelaLabo;
	protected JButton jButtonCerrarTipoRelaLabo;
	
	
	protected JButton jButtonProcesarInformacionTipoRelaLabo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRelaLabo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRelaLabo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRelaLabo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRelaLabo;
	protected JButton jButtonModificarToolBarTipoRelaLabo;
	protected JButton jButtonActualizarToolBarTipoRelaLabo;
    protected JButton jButtonEliminarToolBarTipoRelaLabo;
	protected JButton jButtonCancelarToolBarTipoRelaLabo;
    protected JButton jButtonGuardarCambiosToolBarTipoRelaLabo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRelaLabo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRelaLabo;
	protected JButton jButtonCerrarToolBarTipoRelaLabo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRelaLabo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRelaLabo;
	protected JMenuItem jMenuItemModificarTipoRelaLabo;
	protected JMenuItem jMenuItemActualizarTipoRelaLabo;
    protected JMenuItem jMenuItemEliminarTipoRelaLabo;
	protected JMenuItem jMenuItemCancelarTipoRelaLabo;
    protected JMenuItem jMenuItemGuardarCambiosTipoRelaLabo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRelaLabo;
	protected JMenuItem jMenuItemCerrarTipoRelaLabo;
	protected JMenuItem jMenuItemDetalleCerrarTipoRelaLabo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRelaLabo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRelaLabo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRelaLabo;
	protected JMenuItem jMenuItemMostrarOcultarTipoRelaLabo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRelaLabo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRelaLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRelaLabo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRelaLabo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRelaLabo;
	public JLabel jLabelIdTipoRelaLabo;
	public JLabel jLabelidTipoRelaLabo;
	public JButton jButtonidTipoRelaLaboBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoRelaLabo;
	public JLabel jLabelcodigoTipoRelaLabo;
	public JTextField jTextFieldcodigoTipoRelaLabo;
	public JButton jButtoncodigoTipoRelaLaboBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRelaLabo;
	public JLabel jLabelnombreTipoRelaLabo;
	public JTextArea jTextAreanombreTipoRelaLabo;
	public JScrollPane jscrollPanenombreTipoRelaLabo;
	public JButton jButtonnombreTipoRelaLaboBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoRelaLabo;
	public JLabel jLabelid_empresaTipoRelaLabo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoRelaLabo;
	public JButton jButtonid_empresaTipoRelaLabo= new JButtonMe();
	public JButton jButtonid_empresaTipoRelaLaboUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoRelaLaboBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRelaLabo;
	
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
	
	public TipoRelaLaboDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRelaLabo=new JPanel();
				this.jPanelAccionesFormularioTipoRelaLabo=new JPanel();
				this.jmenuBarDetalleTipoRelaLabo=new JMenuBar();
				this.jTtoolBarDetalleTipoRelaLabo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRelaLaboDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRelaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRelaLaboDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRelaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRelaLaboDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRelaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRelaLaboDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRelaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRelaLaboDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRelaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRelaLabo() {
		return this.jButtonActualizarToolBarTipoRelaLabo;
	}
	
	public JButton getjButtonEliminarToolBarTipoRelaLabo() {
		return this.jButtonEliminarToolBarTipoRelaLabo;
	}
	
	public JButton getjButtonCancelarToolBarTipoRelaLabo() {
		return this.jButtonCancelarToolBarTipoRelaLabo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRelaLabo() {
		return this.jButtonProcesarInformacionTipoRelaLabo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRelaLabo)	{
		this.jButtonProcesarInformacionTipoRelaLabo = jButtonProcesarInformacionTipoRelaLabo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRelaLabo() {
		return this.jComboBoxTiposAccionesTipoRelaLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRelaLabo(
			JComboBox jComboBoxTiposRelacionesTipoRelaLabo) {
		this.jComboBoxTiposRelacionesTipoRelaLabo = jComboBoxTiposRelacionesTipoRelaLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRelaLabo(
			JComboBox jComboBoxTiposAccionesTipoRelaLabo) {
		this.jComboBoxTiposAccionesTipoRelaLabo = jComboBoxTiposAccionesTipoRelaLabo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRelaLabo() {
		return this.jComboBoxTiposAccionesFormularioTipoRelaLabo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRelaLabo(
			JComboBox jComboBoxTiposAccionesFormularioTipoRelaLabo) {
		this.jComboBoxTiposAccionesFormularioTipoRelaLabo = jComboBoxTiposAccionesFormularioTipoRelaLabo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
		
		this.tiporelalaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporelalaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporelalaboSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRelaLaboJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRelaLaboJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRelaLaboJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Rela Labo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRelaLaboJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRelaLabo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRelaLabo=new JButtonMe();
				this.jButtonModificarToolBarTipoRelaLabo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRelaLabo,this.jTtoolBarDetalleTipoRelaLabo,
							"actualizar","actualizar","Actualizar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRelaLabo,this.jTtoolBarDetalleTipoRelaLabo,
							"eliminar","eliminar","Eliminar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRelaLabo,this.jTtoolBarDetalleTipoRelaLabo,
							"cancelar","cancelar","Cancelar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRelaLabo,this.jTtoolBarDetalleTipoRelaLabo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRelaLabo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRelaLabo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRelaLabo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRelaLabo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRelaLabo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRelaLabo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRelaLabo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRelaLabo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRelaLabo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRelaLabo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRelaLabo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRelaLabo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRelaLabo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRelaLabo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRelaLabo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRelaLabo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRelaLabo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRelaLabo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRelaLabo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRelaLabo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRelaLabo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRelaLabo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRelaLabo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRelaLabo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRelaLabo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRelaLabo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRelaLabo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRelaLabo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRelaLabo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRelaLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRelaLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRelaLabo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRelaLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRelaLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRelaLabo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRelaLabo.add(this.jMenuItemDetalleCerrarTipoRelaLabo);
		
		this.jmenuDetalleAccionesTipoRelaLabo.add(this.jMenuItemActualizarTipoRelaLabo);
		this.jmenuDetalleAccionesTipoRelaLabo.add(this.jMenuItemEliminarTipoRelaLabo);
		this.jmenuDetalleAccionesTipoRelaLabo.add(this.jMenuItemCancelarTipoRelaLabo);		
		
		//this.jmenuDetalleDatosTipoRelaLabo.add(this.jMenuItemDetalleAbrirOrderByTipoRelaLabo);				
		this.jmenuDetalleDatosTipoRelaLabo.add(this.jMenuItemDetalleMostarOcultarTipoRelaLabo);				
				
		//this.jmenuDetalleAccionesTipoRelaLabo.add(this.jMenuItemGuardarCambiosTipoRelaLabo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRelaLabo.add(this.jmenuDetalleArchivoTipoRelaLabo);		
		this.jmenuBarDetalleTipoRelaLabo.add(this.jmenuDetalleAccionesTipoRelaLabo);		
		this.jmenuBarDetalleTipoRelaLabo.add(this.jmenuDetalleDatosTipoRelaLabo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoRelaLabo.add(this.jmenuDetalleTipoRelaLabo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRelaLabo);				
	}
	
	
	public void inicializarElementosCamposTipoRelaLabo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRelaLabo = new JLabelMe();
		jLabelIdTipoRelaLabo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRelaLabo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRelaLabo.setToolTipText(TipoRelaLaboConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRelaLabo= new GridBagLayout();

		this.jPanelidTipoRelaLabo.setLayout(this.gridaBagLayoutTipoRelaLabo);

		jLabelidTipoRelaLabo = new JLabel();
		jLabelidTipoRelaLabo.setText("Id");

		jLabelidTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoRelaLabo = new JLabelMe();
		this.jLabelcodigoTipoRelaLabo.setText(""+TipoRelaLaboConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoRelaLabo.setToolTipText("Codigo");
		this.jLabelcodigoTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoRelaLabo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoRelaLabo.setToolTipText(TipoRelaLaboConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoRelaLabo = new GridBagLayout();
		this.jPanelcodigoTipoRelaLabo.setLayout(this.gridaBagLayoutTipoRelaLabo);


		jTextFieldcodigoTipoRelaLabo= new JTextFieldMe();

		jTextFieldcodigoTipoRelaLabo.setEnabled(false);
		jTextFieldcodigoTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoRelaLaboBusqueda= new JButtonMe();
		this.jButtoncodigoTipoRelaLaboBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRelaLaboBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRelaLaboBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoRelaLaboBusqueda.setText("U");
		this.jButtoncodigoTipoRelaLaboBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoRelaLaboBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoRelaLaboBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoRelaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoRelaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoRelaLaboBusqueda"));

		if(this.tiporelalaboSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoRelaLaboBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoRelaLabo = new JLabelMe();
		this.jLabelnombreTipoRelaLabo.setText(""+TipoRelaLaboConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRelaLabo.setToolTipText("Nombre");
		this.jLabelnombreTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRelaLabo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRelaLabo.setToolTipText(TipoRelaLaboConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRelaLabo = new GridBagLayout();
		this.jPanelnombreTipoRelaLabo.setLayout(this.gridaBagLayoutTipoRelaLabo);


		jTextAreanombreTipoRelaLabo= new JTextAreaMe();
		jTextAreanombreTipoRelaLabo.setEnabled(false);
		jTextAreanombreTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRelaLabo.setLineWrap(true);
		jTextAreanombreTipoRelaLabo.setWrapStyleWord(true);
		jTextAreanombreTipoRelaLabo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRelaLabo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRelaLabo = new JScrollPane(jTextAreanombreTipoRelaLabo);
		jscrollPanenombreTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoRelaLaboBusqueda= new JButtonMe();
		this.jButtonnombreTipoRelaLaboBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRelaLaboBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRelaLaboBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRelaLaboBusqueda.setText("U");
		this.jButtonnombreTipoRelaLaboBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRelaLaboBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRelaLaboBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRelaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRelaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRelaLaboBusqueda"));

		if(this.tiporelalaboSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRelaLaboBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRelaLabo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoRelaLabo = new JLabelMe();
		this.jLabelid_empresaTipoRelaLabo.setText(""+TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoRelaLabo.setToolTipText("Empresa");
		this.jLabelid_empresaTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoRelaLabo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoRelaLabo.setToolTipText(TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoRelaLabo = new GridBagLayout();
		this.jPanelid_empresaTipoRelaLabo.setLayout(this.gridaBagLayoutTipoRelaLabo);


		jComboBoxid_empresaTipoRelaLabo= new JComboBoxMe();
		jComboBoxid_empresaTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoRelaLabo.setEnabled(false);

		this.jButtonid_empresaTipoRelaLabo= new JButtonMe();
		this.jButtonid_empresaTipoRelaLabo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRelaLabo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRelaLabo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRelaLabo.setText("Buscar");
		this.jButtonid_empresaTipoRelaLabo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoRelaLabo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRelaLabo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoRelaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRelaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRelaLabo"));

		this.jButtonid_empresaTipoRelaLaboBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoRelaLaboBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRelaLaboBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRelaLaboBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRelaLaboBusqueda.setText("U");
		this.jButtonid_empresaTipoRelaLaboBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoRelaLaboBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRelaLaboBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoRelaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRelaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRelaLaboBusqueda"));

		if(this.tiporelalaboSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoRelaLaboBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoRelaLaboUpdate= new JButtonMe();
		this.jButtonid_empresaTipoRelaLaboUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRelaLaboUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRelaLaboUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRelaLaboUpdate.setText("U");
		this.jButtonid_empresaTipoRelaLaboUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoRelaLaboUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRelaLaboUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoRelaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRelaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRelaLaboUpdate"));



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
		//this.jInternalFrameDetalleTipoRelaLabo = new TipoRelaLaboBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Rela Labo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRelaLabo= new GridBagLayout();
		

		
		String sToolTipTipoRelaLabo="";
		sToolTipTipoRelaLabo=TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRelaLabo+="(Cartera.TipoRelaLabo)";
		}
		
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRelaLabo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRelaLabo = new JButtonMe();
		this.jButtonModificarTipoRelaLabo = new JButtonMe();
        this.jButtonActualizarTipoRelaLabo = new JButtonMe();
        this.jButtonEliminarTipoRelaLabo = new JButtonMe();
        this.jButtonCancelarTipoRelaLabo = new JButtonMe();
        this.jButtonGuardarCambiosTipoRelaLabo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRelaLabo = new JButtonMe();
		this.jButtonCerrarTipoRelaLabo = new JButtonMe();
		
		this.jScrollPanelDatosTipoRelaLabo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRelaLabo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRelaLabo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Rela Labo";
		
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rela Labos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRelaLabo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRelaLabo.setName("jPanelCamposTipoRelaLabo"); 

		this.jPanelCamposOcultosTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRelaLabo.setName("jPanelCamposOcultosTipoRelaLabo"); 

        this.jPanelAccionesTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRelaLabo.setToolTipText("Acciones");
        this.jPanelAccionesTipoRelaLabo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRelaLabo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRelaLabo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRelaLabo.setText("Nuevo");
		this.jButtonModificarTipoRelaLabo.setText("Editar");
        this.jButtonActualizarTipoRelaLabo.setText("Actualizar");
        this.jButtonEliminarTipoRelaLabo.setText("Eliminar");
        this.jButtonCancelarTipoRelaLabo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRelaLabo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRelaLabo.setText("Guardar");
		this.jButtonCerrarTipoRelaLabo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRelaLabo,"nuevo_button","Nuevo",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRelaLabo,"modificar_button","Editar",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRelaLabo,"actualizar_button","Actualizar",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRelaLabo,"eliminar_button","Eliminar",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRelaLabo,"cancelar_button","Cancelar",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRelaLabo,"guardarcambios_button","Guardar",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRelaLabo,"guardarcambiostabla_button","Guardar",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRelaLabo,"cerrar_button","Salir",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRelaLabo.setToolTipText("Nuevo"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRelaLabo.setToolTipText("Editar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRelaLabo.setToolTipText("Actualizar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRelaLabo.setToolTipText("Eliminar)"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRelaLabo.setToolTipText("Cancelar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRelaLabo.setToolTipText("Guardar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRelaLabo.setToolTipText("Guardar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRelaLabo.setToolTipText("Salir"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRelaLabo";
		inputMap = this.jButtonNuevoTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRelaLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRelaLabo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRelaLabo";
		inputMap = this.jButtonActualizarTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRelaLabo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRelaLabo";
		inputMap = this.jButtonEliminarTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRelaLabo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRelaLabo";
		inputMap = this.jButtonCancelarTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRelaLabo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRelaLabo";
		inputMap = this.jButtonCerrarTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRelaLabo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRelaLabo";
		inputMap = this.jButtonGuardarCambiosTablaTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRelaLabo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRelaLabo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRelaLabo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRelaLabo.setToolTipText("Nuevo TipoRelaLabo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRelaLabo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRelaLabo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRelaLabo.setToolTipText("Sin Cerrar Ventana TipoRelaLabo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRelaLabo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRelaLabo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRelaLabo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRelaLabo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRelaLabo.setText("Accion");
		this.jComboBoxTiposAccionesTipoRelaLabo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRelaLabo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRelaLabo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRelaLabo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRelaLabo = new JLabelMe();
		
		this.jLabelAccionesTipoRelaLabo.setText("Acciones");		
		this.jLabelAccionesTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRelaLabo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRelaLabo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRelaLabo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRelaLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRelaLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRelaLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRelaLabo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRelaLabo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRelaLabo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRelaLabo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRelaLabo = new GridBagLayout();
		
		this.jPanelCamposTipoRelaLabo.setLayout(gridaBagLayoutCamposTipoRelaLabo);
		this.jPanelCamposOcultosTipoRelaLabo.setLayout(gridaBagLayoutCamposOcultosTipoRelaLabo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRelaLabo.gridy = 0;
	this.gridBagConstraintsTipoRelaLabo.gridx = 0;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRelaLabo.add(jLabelIdTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);



	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRelaLabo.gridy = 0;
	this.gridBagConstraintsTipoRelaLabo.gridx = 1;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRelaLabo.add(jLabelidTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);


	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRelaLabo.gridy = 0;
	this.gridBagConstraintsTipoRelaLabo.gridx = 0;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoRelaLabo.add(jLabelid_empresaTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = 0;
		this.gridBagConstraintsTipoRelaLabo.gridx = 2;
		this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
		this.gridBagConstraintsTipoRelaLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRelaLabo.add(jButtonid_empresaTipoRelaLaboBusqueda, this.gridBagConstraintsTipoRelaLabo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = 0;
		this.gridBagConstraintsTipoRelaLabo.gridx = 3;
		this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
		this.gridBagConstraintsTipoRelaLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRelaLabo.add(jButtonid_empresaTipoRelaLaboUpdate, this.gridBagConstraintsTipoRelaLabo);
	}

	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRelaLabo.gridy = 0;
	this.gridBagConstraintsTipoRelaLabo.gridx = 1;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoRelaLabo.add(jComboBoxid_empresaTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);


	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRelaLabo.gridy = 0;
	this.gridBagConstraintsTipoRelaLabo.gridx = 0;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoRelaLabo.add(jLabelcodigoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = 0;
		this.gridBagConstraintsTipoRelaLabo.gridx = 2;
		this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
		this.gridBagConstraintsTipoRelaLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoRelaLabo.add(jButtoncodigoTipoRelaLaboBusqueda, this.gridBagConstraintsTipoRelaLabo);
	}

	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRelaLabo.gridy = 0;
	this.gridBagConstraintsTipoRelaLabo.gridx = 1;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoRelaLabo.add(jTextFieldcodigoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);


	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRelaLabo.gridy = 0;
	this.gridBagConstraintsTipoRelaLabo.gridx = 0;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRelaLabo.add(jLabelnombreTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = 0;
		this.gridBagConstraintsTipoRelaLabo.gridx = 2;
		this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
		this.gridBagConstraintsTipoRelaLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRelaLabo.add(jButtonnombreTipoRelaLaboBusqueda, this.gridBagConstraintsTipoRelaLabo);
	}

	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRelaLabo.gridy = 0;
	this.gridBagConstraintsTipoRelaLabo.gridx = 1;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRelaLabo.add(jscrollPanenombreTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRelaLabo.gridy = iYPanelCamposTipoRelaLabo;
	this.gridBagConstraintsTipoRelaLabo.gridx = iXPanelCamposTipoRelaLabo++;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRelaLabo.add(this.jPanelidTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);



	if(iXPanelCamposTipoRelaLabo % 1==0) {
		iXPanelCamposTipoRelaLabo=0;
		iYPanelCamposTipoRelaLabo++;
	}
	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRelaLabo.gridy = iYPanelCamposTipoRelaLabo;
	this.gridBagConstraintsTipoRelaLabo.gridx = iXPanelCamposTipoRelaLabo++;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRelaLabo.add(this.jPanelcodigoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);



	if(iXPanelCamposTipoRelaLabo % 1==0) {
		iXPanelCamposTipoRelaLabo=0;
		iYPanelCamposTipoRelaLabo++;
	}
	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRelaLabo.gridy = iYPanelCamposTipoRelaLabo;
	this.gridBagConstraintsTipoRelaLabo.gridx = iXPanelCamposTipoRelaLabo++;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRelaLabo.add(this.jPanelnombreTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);



	if(iXPanelCamposTipoRelaLabo % 1==0) {
		iXPanelCamposTipoRelaLabo=0;
		iYPanelCamposTipoRelaLabo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRelaLabo.gridy = iYPanelCamposOcultosTipoRelaLabo;
	this.gridBagConstraintsTipoRelaLabo.gridx = iXPanelCamposOcultosTipoRelaLabo++;
	this.gridBagConstraintsTipoRelaLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRelaLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoRelaLabo.add(this.jPanelid_empresaTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);



	if(iXPanelCamposOcultosTipoRelaLabo % 1==0) {
		iXPanelCamposOcultosTipoRelaLabo=0;
		iYPanelCamposOcultosTipoRelaLabo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRelaLabo= new GridBagLayout();
		this.jPanelAccionesTipoRelaLabo.setLayout(gridaBagLayoutAccionesTipoRelaLabo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRelaLabo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRelaLabo.setLayout(gridaBagLayoutAccionesFormularioTipoRelaLabo);
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRelaLabo.add(this.jComboBoxTiposAccionesFormularioTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);

		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRelaLabo.add(this.jCheckBoxPostAccionNuevoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRelaLabo.add(this.jCheckBoxPostAccionSinCerrarTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRelaLabo.add(this.jCheckBoxPostAccionSinMensajeTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = 0;
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRelaLabo.add(this.jButtonModificarTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);							

		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = 0;
		this.gridBagConstraintsTipoRelaLabo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRelaLabo.add(this.jButtonEliminarTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
			
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = 0;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRelaLabo.add(this.jButtonActualizarTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);


		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = 0;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRelaLabo.add(this.jButtonGuardarCambiosTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);	
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = 0;		
		this.gridBagConstraintsTipoRelaLabo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRelaLabo.add(this.jButtonCancelarTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRelaLabo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRelaLabo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();						
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRelaLabo.gridx = 0;		
			//this.gridBagConstraintsTipoRelaLabo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRelaLabo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRelaLabo.gridx =0;
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRelaLabo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRelaLaboJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRelaLabo = new TipoRelaLaboBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Rela Labo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Rela Labo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Rela Labo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRelaLaboModel tiporelalaboModel=new TipoRelaLaboModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRelaLaboModel.TipoRelaLaboFocusTraversalPolicy tiporelalaboFocusTraversalPolicy = tiporelalaboModel.new TipoRelaLaboFocusTraversalPolicy(this);
			
			//tiporelalaboFocusTraversalPolicy.settiporelalaboJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporelalaboModel);
			
			
			this.jContentPaneDetalleTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRelaLabo = new GridBagLayout();	
			this.jContentPaneDetalleTipoRelaLabo.setLayout(gridaBagLayoutDetalleTipoRelaLabo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRelaLabo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoRelaLabo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRelaLabo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRelaLabo.add(jTtoolBarDetalleTipoRelaLabo, gridBagConstraintsTipoRelaLabo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRelaLabo=   new JScrollPane(jContentPaneDetalleTipoRelaLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRelaLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRelaLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRelaLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRelaLabo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRelaLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRelaLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRelaLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRelaLabo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRelaLabo.gridx = 0;
	        
			this.jContentPaneDetalleTipoRelaLabo.add(jPanelCamposTipoRelaLabo, gridBagConstraintsTipoRelaLabo);
			
			
			
			
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
						&& tiporelalaboSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameInformacionLaboral(this.puedeCargarPorParteInformacionLaboral,false,-1);
					
					if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRelaLabo= new GridBagConstraints();
						this.gridBagConstraintsTipoRelaLabo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRelaLabo.gridx = 0;
						this.jContentPaneDetalleTipoRelaLabo.add(this.jTabbedPaneRelacionesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRelaLabo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameInformacionLaboral(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRelaLabo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
					this.gridBagConstraintsTipoRelaLabo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRelaLabo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRelaLabo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRelaLabo.add(jPanelCamposOcultosTipoRelaLabo, gridBagConstraintsTipoRelaLabo);
				
					this.jPanelCamposOcultosTipoRelaLabo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoRelaLabo.gridx = 0;
	        this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRelaLabo.add(this.jPanelAccionesFormularioTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);							
			
			
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
	        this.gridBagConstraintsTipoRelaLabo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoRelaLabo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRelaLabo.add(this.jPanelAccionesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRelaLabo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRelaLabo=   new JScrollPane(this.jPanelCamposTipoRelaLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRelaLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRelaLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRelaLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRelaLabo.gridx = 0;
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRelaLabo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRelaLabo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);			
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRelaLabo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRelaLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			
			
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRelaLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
			
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRelaLabo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRelaLabo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRelaLabo;
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

				InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL=TipoRelaLaboJInternalFrame.STIPO_TAMANIO_GENERAL;
				InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoRelaLaboJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.informacionlaboralSessionBean.setEsGuardarRelacionado(true);

				this.informacionlaboralBeanSwingJInternalFrame=new InformacionLaboralBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.informacionlaboralBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.informacionlaboralBeanSwingJInternalFrame.setinformacionlaboralSessionBean(this.informacionlaboralSessionBean);

				//this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
				//this.gridBagConstraintsTipoRelaLabo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoRelaLabo.gridx = 0;
				//this.jContentPaneDetalleTipoRelaLabo.add(this.informacionlaboralBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoRelaLabo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoRelaLabo.add("Informacion Laborales",this.informacionlaboralBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoRelaLabo.setComponentAt(iIndexTab,this.informacionlaboralBeanSwingJInternalFrame.getContentPane());
				}

				//InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.informacionlaboralSessionBean.setEsGuardarRelacionado(false);
				this.informacionlaboralBeanSwingJInternalFrame=null;//new InformacionLaboralBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteInformacionLaboral) {
					this.jTabbedPaneRelacionesTipoRelaLabo.add("Informacion Laborales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarInformacionLaboralBeanSwingJInternalFrame(List<TipoRelaLabo> tiporelalabos,TipoRelaLabo tiporelalabo,InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//informacionlaboralBeanSwingJInternalFrame=new InformacionLaboralBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					informacionlaboralBeanSwingJInternalFrame.getInformacionLaboralLogic().setConnexion(this.tiporelalaboLogic.getConnexion());

					informacionlaboralBeanSwingJInternalFrame.settiporelalabosForeignKey(tiporelalabos);
					informacionlaboralBeanSwingJInternalFrame.settiporelalaboForeignKey(tiporelalabo);
					informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setisBusquedaDesdeForeignKeySesionTipoRelaLabo(true);
					informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setlidTipoRelaLaboActual(tiporelalabo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					informacionlaboralBeanSwingJInternalFrame.cargarCombosForeignKeyInformacionLaboral(informacionlaboralBeanSwingJInternalFrame.isCargarCombosDependencia);
					informacionlaboralBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoRelaLabo(true);
					informacionlaboralBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					informacionlaboralBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoRelaLabo");
					informacionlaboralBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoRelaLabo");
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
