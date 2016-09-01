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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.TrimestreConstantesFunciones;

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
public class TrimestreDetalleFormJInternalFrame extends TrimestreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTrimestre;
	
	protected JMenuBar jmenuBarDetalleTrimestre;
	
	protected JMenu jmenuDetalleTrimestre;
	protected JMenu jmenuDetalleArchivoTrimestre;
	protected JMenu jmenuDetalleAccionesTrimestre;
	protected JMenu jmenuDetalleDatosTrimestre;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTrimestre;	
	protected GridBagConstraints gridBagConstraintsTrimestre;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TrimestreBeanSwingJInternalFrameAdditional jInternalFrameDetalleTrimestre;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TrimestreSessionBean trimestreSessionBean;
	
	
	
		
	
	public TrimestreLogic trimestreLogic;
	
	public JScrollPane jScrollPanelDatosTrimestre;
	public JScrollPane jScrollPanelDatosEdicionTrimestre;
	public JScrollPane jScrollPanelDatosGeneralTrimestre;
	
	protected JPanel jPanelCamposTrimestre;    
	protected JPanel jPanelCamposOcultosTrimestre;    	
	protected JPanel jPanelAccionesTrimestre;
	protected JPanel jPanelAccionesFormularioTrimestre;
    
	
	
	protected Integer iXPanelCamposTrimestre=0;
	protected Integer iYPanelCamposTrimestre=0;
	
	protected Integer iXPanelCamposOcultosTrimestre=0;
	protected Integer iYPanelCamposOcultosTrimestre=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTrimestre;
	public JButton jButtonModificarTrimestre;
	public JButton jButtonActualizarTrimestre;
    public JButton jButtonEliminarTrimestre;
	public JButton jButtonCancelarTrimestre;
    public JButton jButtonGuardarCambiosTrimestre;
	public JButton jButtonGuardarCambiosTablaTrimestre;
	protected JButton jButtonCerrarTrimestre;
	
	
	protected JButton jButtonProcesarInformacionTrimestre;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTrimestre;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTrimestre;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTrimestre;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTrimestre;
	protected JButton jButtonModificarToolBarTrimestre;
	protected JButton jButtonActualizarToolBarTrimestre;
    protected JButton jButtonEliminarToolBarTrimestre;
	protected JButton jButtonCancelarToolBarTrimestre;
    protected JButton jButtonGuardarCambiosToolBarTrimestre;
	protected JButton jButtonGuardarCambiosTablaToolBarTrimestre;
	protected JButton jButtonMostrarOcultarTablaToolBarTrimestre;
	protected JButton jButtonCerrarToolBarTrimestre;
	
	protected JButton jButtonProcesarInformacionToolBarTrimestre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTrimestre;
	protected JMenuItem jMenuItemModificarTrimestre;
	protected JMenuItem jMenuItemActualizarTrimestre;
    protected JMenuItem jMenuItemEliminarTrimestre;
	protected JMenuItem jMenuItemCancelarTrimestre;
    protected JMenuItem jMenuItemGuardarCambiosTrimestre;
	protected JMenuItem jMenuItemGuardarCambiosTablaTrimestre;
	protected JMenuItem jMenuItemCerrarTrimestre;
	protected JMenuItem jMenuItemDetalleCerrarTrimestre;
	protected JMenuItem jMenuItemDetalleMostarOcultarTrimestre;
	
	protected JMenuItem jMenuItemProcesarInformacionTrimestre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTrimestre;
	protected JMenuItem jMenuItemMostrarOcultarTrimestre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTrimestre;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTrimestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTrimestre;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTrimestre;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTrimestre;
	public JLabel jLabelIdTrimestre;
	public JTextFieldMe jTextFieldidTrimestre;
	public JButton jButtonidTrimestreBusqueda= new JButtonMe();

	public JPanel jPanelnombreTrimestre;
	public JLabel jLabelnombreTrimestre;
	public JTextField jTextFieldnombreTrimestre;
	public JButton jButtonnombreTrimestreBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTrimestre;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TrimestreDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTrimestre=new JPanel();
				this.jPanelAccionesFormularioTrimestre=new JPanel();
				this.jmenuBarDetalleTrimestre=new JMenuBar();
				this.jTtoolBarDetalleTrimestre=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TrimestreDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Trimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TrimestreDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Trimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TrimestreDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Trimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TrimestreDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Trimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TrimestreDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Trimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTrimestre() {
		return this.jButtonActualizarToolBarTrimestre;
	}
	
	public JButton getjButtonEliminarToolBarTrimestre() {
		return this.jButtonEliminarToolBarTrimestre;
	}
	
	public JButton getjButtonCancelarToolBarTrimestre() {
		return this.jButtonCancelarToolBarTrimestre;
	}		
	
	public JButton getjButtonProcesarInformacionTrimestre() {
		return this.jButtonProcesarInformacionTrimestre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTrimestre)	{
		this.jButtonProcesarInformacionTrimestre = jButtonProcesarInformacionTrimestre;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTrimestre() {
		return this.jComboBoxTiposAccionesTrimestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTrimestre(
			JComboBox jComboBoxTiposRelacionesTrimestre) {
		this.jComboBoxTiposRelacionesTrimestre = jComboBoxTiposRelacionesTrimestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTrimestre(
			JComboBox jComboBoxTiposAccionesTrimestre) {
		this.jComboBoxTiposAccionesTrimestre = jComboBoxTiposAccionesTrimestre;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTrimestre() {
		return this.jComboBoxTiposAccionesFormularioTrimestre;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTrimestre(
			JComboBox jComboBoxTiposAccionesFormularioTrimestre) {
		this.jComboBoxTiposAccionesFormularioTrimestre = jComboBoxTiposAccionesFormularioTrimestre;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.trimestreSessionBean=new TrimestreSessionBean();
		
		this.trimestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.trimestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.trimestreSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TrimestreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TrimestreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TrimestreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Trimestre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
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
	
		TrimestreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTrimestre= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTrimestre=new JButtonMe();
				this.jButtonModificarToolBarTrimestre=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTrimestre,this.jTtoolBarDetalleTrimestre,
							"actualizar","actualizar","Actualizar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTrimestre,this.jTtoolBarDetalleTrimestre,
							"eliminar","eliminar","Eliminar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTrimestre,this.jTtoolBarDetalleTrimestre,
							"cancelar","cancelar","Cancelar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTrimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTrimestre,this.jTtoolBarDetalleTrimestre,
							"guardarcambios","guardarcambios","Guardar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTrimestre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTrimestre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTrimestre,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTrimestre=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTrimestre=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTrimestre=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTrimestre=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTrimestre=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTrimestre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTrimestre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTrimestre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTrimestre= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTrimestre.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTrimestre,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTrimestre= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTrimestre.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTrimestre,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTrimestre= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTrimestre.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTrimestre,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTrimestre= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTrimestre.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTrimestre,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTrimestre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTrimestre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTrimestre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTrimestre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTrimestre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTrimestre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTrimestre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTrimestre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTrimestre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTrimestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTrimestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTrimestre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTrimestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTrimestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTrimestre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTrimestre.add(this.jMenuItemDetalleCerrarTrimestre);
		
		this.jmenuDetalleAccionesTrimestre.add(this.jMenuItemActualizarTrimestre);
		this.jmenuDetalleAccionesTrimestre.add(this.jMenuItemEliminarTrimestre);
		this.jmenuDetalleAccionesTrimestre.add(this.jMenuItemCancelarTrimestre);		
		
		//this.jmenuDetalleDatosTrimestre.add(this.jMenuItemDetalleAbrirOrderByTrimestre);				
		this.jmenuDetalleDatosTrimestre.add(this.jMenuItemDetalleMostarOcultarTrimestre);				
				
		//this.jmenuDetalleAccionesTrimestre.add(this.jMenuItemGuardarCambiosTrimestre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTrimestre.add(this.jmenuDetalleArchivoTrimestre);		
		this.jmenuBarDetalleTrimestre.add(this.jmenuDetalleAccionesTrimestre);		
		this.jmenuBarDetalleTrimestre.add(this.jmenuDetalleDatosTrimestre);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTrimestre);				
	}
	
	
	public void inicializarElementosCamposTrimestre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTrimestre = new JLabelMe();
		jLabelIdTrimestre.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTrimestre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTrimestre = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTrimestre.setToolTipText(TrimestreConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTrimestre= new GridBagLayout();

		this.jPanelidTrimestre.setLayout(this.gridaBagLayoutTrimestre);

		jTextFieldidTrimestre = new JTextFieldMe();
		jTextFieldidTrimestre.setText("Id");

		jTextFieldidTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTrimestre = new JLabelMe();
		this.jLabelnombreTrimestre.setText(""+TrimestreConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTrimestre.setToolTipText("Nombre");
		this.jLabelnombreTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTrimestre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTrimestre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTrimestre.setToolTipText(TrimestreConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTrimestre = new GridBagLayout();
		this.jPanelnombreTrimestre.setLayout(this.gridaBagLayoutTrimestre);


		jTextFieldnombreTrimestre= new JTextFieldMe();

		jTextFieldnombreTrimestre.setEnabled(false);
		jTextFieldnombreTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTrimestre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTrimestreBusqueda= new JButtonMe();
		this.jButtonnombreTrimestreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTrimestreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTrimestreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTrimestreBusqueda.setText("U");
		this.jButtonnombreTrimestreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTrimestreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTrimestreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTrimestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTrimestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTrimestreBusqueda"));

		if(this.trimestreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTrimestreBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTrimestre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleTrimestre = new TrimestreBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Trimestre DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTrimestre= new GridBagLayout();
		

		
		String sToolTipTrimestre="";
		sToolTipTrimestre=TrimestreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTrimestre+="(Seguridad.Trimestre)";
		}
		
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
			sToolTipTrimestre+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTrimestre = new JButtonMe();
		this.jButtonModificarTrimestre = new JButtonMe();
        this.jButtonActualizarTrimestre = new JButtonMe();
        this.jButtonEliminarTrimestre = new JButtonMe();
        this.jButtonCancelarTrimestre = new JButtonMe();
        this.jButtonGuardarCambiosTrimestre = new JButtonMe();
		this.jButtonGuardarCambiosTablaTrimestre = new JButtonMe();
		this.jButtonCerrarTrimestre = new JButtonMe();
		
		this.jScrollPanelDatosTrimestre = new JScrollPane();   
        this.jScrollPanelDatosEdicionTrimestre = new JScrollPane();
		this.jScrollPanelDatosGeneralTrimestre = new JScrollPane();
				
		
		
		this.jPanelCamposTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Trimestre";
		
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Trimestres" + this.sPath));
		} else {
			this.jScrollPanelDatosTrimestre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTrimestre.setName("jPanelCamposTrimestre"); 

		this.jPanelCamposOcultosTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTrimestre.setName("jPanelCamposOcultosTrimestre"); 

        this.jPanelAccionesTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTrimestre.setToolTipText("Acciones");
        this.jPanelAccionesTrimestre.setName("Acciones"); 

		this.jPanelAccionesFormularioTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTrimestre.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTrimestre.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTrimestre.setText("Nuevo");
		this.jButtonModificarTrimestre.setText("Editar");
        this.jButtonActualizarTrimestre.setText("Actualizar");
        this.jButtonEliminarTrimestre.setText("Eliminar");
        this.jButtonCancelarTrimestre.setText("Cancelar");
        this.jButtonGuardarCambiosTrimestre.setText("Guardar");
		this.jButtonGuardarCambiosTablaTrimestre.setText("Guardar");
		this.jButtonCerrarTrimestre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTrimestre,"nuevo_button","Nuevo",this.trimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTrimestre,"modificar_button","Editar",this.trimestreSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTrimestre,"actualizar_button","Actualizar",this.trimestreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTrimestre,"eliminar_button","Eliminar",this.trimestreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTrimestre,"cancelar_button","Cancelar",this.trimestreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTrimestre,"guardarcambios_button","Guardar",this.trimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTrimestre,"guardarcambiostabla_button","Guardar",this.trimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTrimestre,"cerrar_button","Salir",this.trimestreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTrimestre.setToolTipText("Nuevo"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTrimestre.setToolTipText("Editar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTrimestre.setToolTipText("Actualizar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTrimestre.setToolTipText("Eliminar)"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTrimestre.setToolTipText("Cancelar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTrimestre.setToolTipText("Guardar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTrimestre.setToolTipText("Guardar"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTrimestre.setToolTipText("Salir"+" "+TrimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTrimestre";
		inputMap = this.jButtonNuevoTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTrimestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTrimestre"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTrimestre";
		inputMap = this.jButtonActualizarTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTrimestre"));
		
		//ELIMINAR
		sMapKey = "EliminarTrimestre";
		inputMap = this.jButtonEliminarTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTrimestre"));
		
		//CANCELAR	
		sMapKey = "CancelarTrimestre";
		inputMap = this.jButtonCancelarTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTrimestre"));
		
		//CERRAR		
		sMapKey = "CerrarTrimestre";
		inputMap = this.jButtonCerrarTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTrimestre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTrimestre";
		inputMap = this.jButtonGuardarCambiosTablaTrimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTrimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTrimestre"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTrimestre = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTrimestre.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTrimestre.setToolTipText("Nuevo Trimestre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTrimestre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTrimestre.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTrimestre.setToolTipText("Sin Cerrar Ventana Trimestre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTrimestre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTrimestre.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTrimestre.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTrimestre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTrimestre.setText("Accion");
		this.jComboBoxTiposAccionesTrimestre.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTrimestre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTrimestre.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTrimestre.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTrimestre = new JLabelMe();
		
		this.jLabelAccionesTrimestre.setText("Acciones");		
		this.jLabelAccionesTrimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTrimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTrimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTrimestre();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTrimestre();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTrimestre=new JTabbedPane();
		this.jTabbedPaneRelacionesTrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTrimestre,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTrimestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTrimestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTrimestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTrimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTrimestre.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTrimestre.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTrimestre.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTrimestre, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTrimestre = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTrimestre = new GridBagLayout();
		
		this.jPanelCamposTrimestre.setLayout(gridaBagLayoutCamposTrimestre);
		this.jPanelCamposOcultosTrimestre.setLayout(gridaBagLayoutCamposOcultosTrimestre);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTrimestre = new GridBagConstraints();
	this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTrimestre.gridy = 0;
	this.gridBagConstraintsTrimestre.gridx = 0;
	this.gridBagConstraintsTrimestre.ipadx = 0;
	this.gridBagConstraintsTrimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTrimestre.add(jLabelIdTrimestre, this.gridBagConstraintsTrimestre);



	this.gridBagConstraintsTrimestre = new GridBagConstraints();
	this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTrimestre.gridy = 0;
	this.gridBagConstraintsTrimestre.gridx = 1;
	this.gridBagConstraintsTrimestre.ipadx = 0;
	this.gridBagConstraintsTrimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTrimestre.add(jTextFieldidTrimestre, this.gridBagConstraintsTrimestre);


	this.gridBagConstraintsTrimestre = new GridBagConstraints();
	this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTrimestre.gridy = 0;
	this.gridBagConstraintsTrimestre.gridx = 0;
	this.gridBagConstraintsTrimestre.ipadx = 0;
	this.gridBagConstraintsTrimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTrimestre.add(jLabelnombreTrimestre, this.gridBagConstraintsTrimestre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		//this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTrimestre.gridy = 0;
		this.gridBagConstraintsTrimestre.gridx = 2;
		this.gridBagConstraintsTrimestre.ipadx = 0;
		this.gridBagConstraintsTrimestre.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTrimestre.add(jButtonnombreTrimestreBusqueda, this.gridBagConstraintsTrimestre);
	}

	this.gridBagConstraintsTrimestre = new GridBagConstraints();
	this.gridBagConstraintsTrimestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTrimestre.gridy = 0;
	this.gridBagConstraintsTrimestre.gridx = 1;
	this.gridBagConstraintsTrimestre.ipadx = 0;
	this.gridBagConstraintsTrimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTrimestre.add(jTextFieldnombreTrimestre, this.gridBagConstraintsTrimestre);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTrimestre = new GridBagConstraints();
	this.gridBagConstraintsTrimestre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTrimestre.gridy = iYPanelCamposTrimestre;
	this.gridBagConstraintsTrimestre.gridx = iXPanelCamposTrimestre++;
	this.gridBagConstraintsTrimestre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTrimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTrimestre.add(this.jPanelidTrimestre, this.gridBagConstraintsTrimestre);



	if(iXPanelCamposTrimestre % 1==0) {
		iXPanelCamposTrimestre=0;
		iYPanelCamposTrimestre++;
	}
	this.gridBagConstraintsTrimestre = new GridBagConstraints();
	this.gridBagConstraintsTrimestre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTrimestre.gridy = iYPanelCamposTrimestre;
	this.gridBagConstraintsTrimestre.gridx = iXPanelCamposTrimestre++;
	this.gridBagConstraintsTrimestre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTrimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTrimestre.add(this.jPanelnombreTrimestre, this.gridBagConstraintsTrimestre);



	if(iXPanelCamposTrimestre % 1==0) {
		iXPanelCamposTrimestre=0;
		iYPanelCamposTrimestre++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesTrimestre= new GridBagLayout();
		this.jPanelAccionesTrimestre.setLayout(gridaBagLayoutAccionesTrimestre);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTrimestre= new GridBagLayout();
		this.jPanelAccionesFormularioTrimestre.setLayout(gridaBagLayoutAccionesFormularioTrimestre);
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTrimestre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTrimestre.add(this.jComboBoxTiposAccionesFormularioTrimestre, this.gridBagConstraintsTrimestre);

		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTrimestre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTrimestre.add(this.jCheckBoxPostAccionNuevoTrimestre, this.gridBagConstraintsTrimestre);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.trimestreSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTrimestre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTrimestre.add(this.jCheckBoxPostAccionSinCerrarTrimestre, this.gridBagConstraintsTrimestre);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.trimestreSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTrimestre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTrimestre.add(this.jCheckBoxPostAccionSinMensajeTrimestre, this.gridBagConstraintsTrimestre);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = 0;
		this.gridBagConstraintsTrimestre.gridx = iPosXAccion++;
			
		this.jPanelAccionesTrimestre.add(this.jButtonModificarTrimestre, this.gridBagConstraintsTrimestre);							

		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTrimestre.gridy = 0;
		this.gridBagConstraintsTrimestre.gridx =iPosXAccion++;
			
		this.jPanelAccionesTrimestre.add(this.jButtonEliminarTrimestre, this.gridBagConstraintsTrimestre);
		
			
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = 0;		
		this.gridBagConstraintsTrimestre.gridx = iPosXAccion++;
		
		this.jPanelAccionesTrimestre.add(this.jButtonActualizarTrimestre, this.gridBagConstraintsTrimestre);


		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = 0;		
		this.gridBagConstraintsTrimestre.gridx = iPosXAccion++;
		
		this.jPanelAccionesTrimestre.add(this.jButtonGuardarCambiosTrimestre, this.gridBagConstraintsTrimestre);	
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = 0;		
		this.gridBagConstraintsTrimestre.gridx =iPosXAccion++;
		
		this.jPanelAccionesTrimestre.add(this.jButtonCancelarTrimestre, this.gridBagConstraintsTrimestre);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTrimestre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTrimestre);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTrimestre = new GridBagConstraints();						
			this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTrimestre.gridx = 0;		
			//this.gridBagConstraintsTrimestre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTrimestre.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTrimestre.gridx =0;
		this.gridBagConstraintsTrimestre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTrimestre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTrimestre, this.gridBagConstraintsTrimestre);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TrimestreJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTrimestre = new TrimestreBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Trimestre DATOS");
			
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
			
	        //this.setTitle("[FOR] - Trimestre DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Trimestre Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TrimestreModel trimestreModel=new TrimestreModel(this);
			
			//SI USARA CLASE INTERNA
			//TrimestreModel.TrimestreFocusTraversalPolicy trimestreFocusTraversalPolicy = trimestreModel.new TrimestreFocusTraversalPolicy(this);
			
			//trimestreFocusTraversalPolicy.settrimestreJInternalFrame(this);
			
			this.setFocusTraversalPolicy(trimestreModel);
			
			
			this.jContentPaneDetalleTrimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTrimestre = new GridBagLayout();	
			this.jContentPaneDetalleTrimestre.setLayout(gridaBagLayoutDetalleTrimestre);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTrimestre = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTrimestre = new GridBagConstraints();
				this.gridBagConstraintsTrimestre.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTrimestre.gridx = 0;
					
				
				this.jContentPaneDetalleTrimestre.add(jTtoolBarDetalleTrimestre, gridBagConstraintsTrimestre);								
				
}
			
			this.jScrollPanelDatosEdicionTrimestre=   new JScrollPane(jContentPaneDetalleTrimestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTrimestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTrimestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTrimestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTrimestre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTrimestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTrimestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTrimestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTrimestre.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTrimestre.gridx = 0;
	        
			this.jContentPaneDetalleTrimestre.add(jPanelCamposTrimestre, gridBagConstraintsTrimestre);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& trimestreSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.trimestreSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTrimestre= new GridBagConstraints();
						this.gridBagConstraintsTrimestre.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTrimestre.gridx = 0;
						this.jContentPaneDetalleTrimestre.add(this.jTabbedPaneRelacionesTrimestre, this.gridBagConstraintsTrimestre);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTrimestre.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTrimestre.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTrimestre = new GridBagConstraints();
					this.gridBagConstraintsTrimestre.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTrimestre.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTrimestre.gridx = 0;
					
				
					this.jContentPaneDetalleTrimestre.add(jPanelCamposOcultosTrimestre, gridBagConstraintsTrimestre);
				
					this.jPanelCamposOcultosTrimestre.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTrimestre.gridx = 0;
	        this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTrimestre.add(this.jPanelAccionesFormularioTrimestre, this.gridBagConstraintsTrimestre);							
			
			
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
	        this.gridBagConstraintsTrimestre.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTrimestre.gridx = 0;
	        
			
			this.jContentPaneDetalleTrimestre.add(this.jPanelAccionesTrimestre, this.gridBagConstraintsTrimestre);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTrimestre);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTrimestre=   new JScrollPane(this.jPanelCamposTrimestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTrimestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTrimestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTrimestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTrimestre.gridx = 0;
			this.gridBagConstraintsTrimestre.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTrimestre.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTrimestre.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTrimestre, this.gridBagConstraintsTrimestre);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTrimestre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTrimestre, this.gridBagConstraintsTrimestre);			
			
			this.gridBagConstraintsTrimestre = new GridBagConstraints();
			this.gridBagConstraintsTrimestre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTrimestre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTrimestre, this.gridBagConstraintsTrimestre);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTrimestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTrimestre, this.gridBagConstraintsTrimestre);
			
			
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTrimestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTrimestre, this.gridBagConstraintsTrimestre);
		
			
		this.gridBagConstraintsTrimestre = new GridBagConstraints();
		this.gridBagConstraintsTrimestre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTrimestre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTrimestre, this.gridBagConstraintsTrimestre);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTrimestre;//jContentPane;
		
		return jScrollPanelDatosEdicionTrimestre;
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
