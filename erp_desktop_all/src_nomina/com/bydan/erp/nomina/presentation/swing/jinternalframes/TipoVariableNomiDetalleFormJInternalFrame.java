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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.nomina.util.TipoVariableNomiConstantesFunciones;

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
public class TipoVariableNomiDetalleFormJInternalFrame extends TipoVariableNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoVariableNomi;
	
	protected JMenuBar jmenuBarDetalleTipoVariableNomi;
	
	protected JMenu jmenuDetalleTipoVariableNomi;
	protected JMenu jmenuDetalleArchivoTipoVariableNomi;
	protected JMenu jmenuDetalleAccionesTipoVariableNomi;
	protected JMenu jmenuDetalleDatosTipoVariableNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoVariableNomi;	
	protected GridBagConstraints gridBagConstraintsTipoVariableNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoVariableNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoVariableNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoVariableNomiSessionBean tipovariablenomiSessionBean;
	
	

	public VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFrame=null;
	public VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteVariableNomi=false;
	public VariableNomiSessionBean variablenomiSessionBean;
	
		
	
	public TipoVariableNomiLogic tipovariablenomiLogic;
	
	public JScrollPane jScrollPanelDatosTipoVariableNomi;
	public JScrollPane jScrollPanelDatosEdicionTipoVariableNomi;
	public JScrollPane jScrollPanelDatosGeneralTipoVariableNomi;
	
	protected JPanel jPanelCamposTipoVariableNomi;    
	protected JPanel jPanelCamposOcultosTipoVariableNomi;    	
	protected JPanel jPanelAccionesTipoVariableNomi;
	protected JPanel jPanelAccionesFormularioTipoVariableNomi;
    
	
	
	protected Integer iXPanelCamposTipoVariableNomi=0;
	protected Integer iYPanelCamposTipoVariableNomi=0;
	
	protected Integer iXPanelCamposOcultosTipoVariableNomi=0;
	protected Integer iYPanelCamposOcultosTipoVariableNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoVariableNomi;
	public JButton jButtonModificarTipoVariableNomi;
	public JButton jButtonActualizarTipoVariableNomi;
    public JButton jButtonEliminarTipoVariableNomi;
	public JButton jButtonCancelarTipoVariableNomi;
    public JButton jButtonGuardarCambiosTipoVariableNomi;
	public JButton jButtonGuardarCambiosTablaTipoVariableNomi;
	protected JButton jButtonCerrarTipoVariableNomi;
	
	
	protected JButton jButtonProcesarInformacionTipoVariableNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoVariableNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoVariableNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoVariableNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoVariableNomi;
	protected JButton jButtonModificarToolBarTipoVariableNomi;
	protected JButton jButtonActualizarToolBarTipoVariableNomi;
    protected JButton jButtonEliminarToolBarTipoVariableNomi;
	protected JButton jButtonCancelarToolBarTipoVariableNomi;
    protected JButton jButtonGuardarCambiosToolBarTipoVariableNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoVariableNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoVariableNomi;
	protected JButton jButtonCerrarToolBarTipoVariableNomi;
	
	protected JButton jButtonProcesarInformacionToolBarTipoVariableNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoVariableNomi;
	protected JMenuItem jMenuItemModificarTipoVariableNomi;
	protected JMenuItem jMenuItemActualizarTipoVariableNomi;
    protected JMenuItem jMenuItemEliminarTipoVariableNomi;
	protected JMenuItem jMenuItemCancelarTipoVariableNomi;
    protected JMenuItem jMenuItemGuardarCambiosTipoVariableNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoVariableNomi;
	protected JMenuItem jMenuItemCerrarTipoVariableNomi;
	protected JMenuItem jMenuItemDetalleCerrarTipoVariableNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoVariableNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoVariableNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoVariableNomi;
	protected JMenuItem jMenuItemMostrarOcultarTipoVariableNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoVariableNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoVariableNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoVariableNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoVariableNomi;
	public JLabel jLabelIdTipoVariableNomi;
	public JTextFieldMe jTextFieldidTipoVariableNomi;
	public JButton jButtonidTipoVariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoVariableNomi;
	public JLabel jLabelcodigoTipoVariableNomi;
	public JTextField jTextFieldcodigoTipoVariableNomi;
	public JButton jButtoncodigoTipoVariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoVariableNomi;
	public JLabel jLabelnombreTipoVariableNomi;
	public JTextArea jTextAreanombreTipoVariableNomi;
	public JScrollPane jscrollPanenombreTipoVariableNomi;
	public JButton jButtonnombreTipoVariableNomiBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoVariableNomi;
	
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
	
	public TipoVariableNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoVariableNomi=new JPanel();
				this.jPanelAccionesFormularioTipoVariableNomi=new JPanel();
				this.jmenuBarDetalleTipoVariableNomi=new JMenuBar();
				this.jTtoolBarDetalleTipoVariableNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVariableNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoVariableNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVariableNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVariableNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVariableNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoVariableNomi() {
		return this.jButtonActualizarToolBarTipoVariableNomi;
	}
	
	public JButton getjButtonEliminarToolBarTipoVariableNomi() {
		return this.jButtonEliminarToolBarTipoVariableNomi;
	}
	
	public JButton getjButtonCancelarToolBarTipoVariableNomi() {
		return this.jButtonCancelarToolBarTipoVariableNomi;
	}		
	
	public JButton getjButtonProcesarInformacionTipoVariableNomi() {
		return this.jButtonProcesarInformacionTipoVariableNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoVariableNomi)	{
		this.jButtonProcesarInformacionTipoVariableNomi = jButtonProcesarInformacionTipoVariableNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoVariableNomi() {
		return this.jComboBoxTiposAccionesTipoVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoVariableNomi(
			JComboBox jComboBoxTiposRelacionesTipoVariableNomi) {
		this.jComboBoxTiposRelacionesTipoVariableNomi = jComboBoxTiposRelacionesTipoVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoVariableNomi(
			JComboBox jComboBoxTiposAccionesTipoVariableNomi) {
		this.jComboBoxTiposAccionesTipoVariableNomi = jComboBoxTiposAccionesTipoVariableNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoVariableNomi() {
		return this.jComboBoxTiposAccionesFormularioTipoVariableNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoVariableNomi(
			JComboBox jComboBoxTiposAccionesFormularioTipoVariableNomi) {
		this.jComboBoxTiposAccionesFormularioTipoVariableNomi = jComboBoxTiposAccionesFormularioTipoVariableNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipovariablenomiSessionBean=new TipoVariableNomiSessionBean();
		
		this.tipovariablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovariablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipovariablenomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.variablenomiSessionBean=new VariableNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoVariableNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Variable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoVariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoVariableNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoVariableNomi=new JButtonMe();
				this.jButtonModificarToolBarTipoVariableNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoVariableNomi,this.jTtoolBarDetalleTipoVariableNomi,
							"actualizar","actualizar","Actualizar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoVariableNomi,this.jTtoolBarDetalleTipoVariableNomi,
							"eliminar","eliminar","Eliminar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoVariableNomi,this.jTtoolBarDetalleTipoVariableNomi,
							"cancelar","cancelar","Cancelar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoVariableNomi,this.jTtoolBarDetalleTipoVariableNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoVariableNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoVariableNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoVariableNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoVariableNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoVariableNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoVariableNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoVariableNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoVariableNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoVariableNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoVariableNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoVariableNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoVariableNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoVariableNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoVariableNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoVariableNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoVariableNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoVariableNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoVariableNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoVariableNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoVariableNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoVariableNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoVariableNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoVariableNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoVariableNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoVariableNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoVariableNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoVariableNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoVariableNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoVariableNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoVariableNomi.add(this.jMenuItemDetalleCerrarTipoVariableNomi);
		
		this.jmenuDetalleAccionesTipoVariableNomi.add(this.jMenuItemActualizarTipoVariableNomi);
		this.jmenuDetalleAccionesTipoVariableNomi.add(this.jMenuItemEliminarTipoVariableNomi);
		this.jmenuDetalleAccionesTipoVariableNomi.add(this.jMenuItemCancelarTipoVariableNomi);		
		
		//this.jmenuDetalleDatosTipoVariableNomi.add(this.jMenuItemDetalleAbrirOrderByTipoVariableNomi);				
		this.jmenuDetalleDatosTipoVariableNomi.add(this.jMenuItemDetalleMostarOcultarTipoVariableNomi);				
				
		//this.jmenuDetalleAccionesTipoVariableNomi.add(this.jMenuItemGuardarCambiosTipoVariableNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoVariableNomi.add(this.jmenuDetalleArchivoTipoVariableNomi);		
		this.jmenuBarDetalleTipoVariableNomi.add(this.jmenuDetalleAccionesTipoVariableNomi);		
		this.jmenuBarDetalleTipoVariableNomi.add(this.jmenuDetalleDatosTipoVariableNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoVariableNomi.add(this.jmenuDetalleTipoVariableNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoVariableNomi);				
	}
	
	
	public void inicializarElementosCamposTipoVariableNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoVariableNomi = new JLabelMe();
		jLabelIdTipoVariableNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoVariableNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoVariableNomi.setToolTipText(TipoVariableNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoVariableNomi= new GridBagLayout();

		this.jPanelidTipoVariableNomi.setLayout(this.gridaBagLayoutTipoVariableNomi);

		jTextFieldidTipoVariableNomi = new JTextFieldMe();
		jTextFieldidTipoVariableNomi.setText("Id");

		jTextFieldidTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoVariableNomi = new JLabelMe();
		this.jLabelcodigoTipoVariableNomi.setText(""+TipoVariableNomiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoVariableNomi.setToolTipText("Codigo");
		this.jLabelcodigoTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoVariableNomi.setToolTipText(TipoVariableNomiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoVariableNomi = new GridBagLayout();
		this.jPanelcodigoTipoVariableNomi.setLayout(this.gridaBagLayoutTipoVariableNomi);


		jTextFieldcodigoTipoVariableNomi= new JTextFieldMe();

		jTextFieldcodigoTipoVariableNomi.setEnabled(false);
		jTextFieldcodigoTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoVariableNomiBusqueda= new JButtonMe();
		this.jButtoncodigoTipoVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoVariableNomiBusqueda.setText("U");
		this.jButtoncodigoTipoVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoVariableNomiBusqueda"));

		if(this.tipovariablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoVariableNomiBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoVariableNomi = new JLabelMe();
		this.jLabelnombreTipoVariableNomi.setText(""+TipoVariableNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoVariableNomi.setToolTipText("Nombre");
		this.jLabelnombreTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoVariableNomi.setToolTipText(TipoVariableNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoVariableNomi = new GridBagLayout();
		this.jPanelnombreTipoVariableNomi.setLayout(this.gridaBagLayoutTipoVariableNomi);


		jTextAreanombreTipoVariableNomi= new JTextAreaMe();
		jTextAreanombreTipoVariableNomi.setEnabled(false);
		jTextAreanombreTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVariableNomi.setLineWrap(true);
		jTextAreanombreTipoVariableNomi.setWrapStyleWord(true);
		jTextAreanombreTipoVariableNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoVariableNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoVariableNomi = new JScrollPane(jTextAreanombreTipoVariableNomi);
		jscrollPanenombreTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoVariableNomiBusqueda= new JButtonMe();
		this.jButtonnombreTipoVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoVariableNomiBusqueda.setText("U");
		this.jButtonnombreTipoVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoVariableNomiBusqueda"));

		if(this.tipovariablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoVariableNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoVariableNomi() {
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
		//this.jInternalFrameDetalleTipoVariableNomi = new TipoVariableNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Variable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoVariableNomi= new GridBagLayout();
		

		
		String sToolTipTipoVariableNomi="";
		sToolTipTipoVariableNomi=TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoVariableNomi+="(Nomina.TipoVariableNomi)";
		}
		
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoVariableNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoVariableNomi = new JButtonMe();
		this.jButtonModificarTipoVariableNomi = new JButtonMe();
        this.jButtonActualizarTipoVariableNomi = new JButtonMe();
        this.jButtonEliminarTipoVariableNomi = new JButtonMe();
        this.jButtonCancelarTipoVariableNomi = new JButtonMe();
        this.jButtonGuardarCambiosTipoVariableNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoVariableNomi = new JButtonMe();
		this.jButtonCerrarTipoVariableNomi = new JButtonMe();
		
		this.jScrollPanelDatosTipoVariableNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoVariableNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoVariableNomi = new JScrollPane();
				
		
		
		this.jPanelCamposTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Variable";
		
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Variables" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoVariableNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoVariableNomi.setName("jPanelCamposTipoVariableNomi"); 

		this.jPanelCamposOcultosTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoVariableNomi.setName("jPanelCamposOcultosTipoVariableNomi"); 

        this.jPanelAccionesTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoVariableNomi.setToolTipText("Acciones");
        this.jPanelAccionesTipoVariableNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoVariableNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoVariableNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoVariableNomi.setText("Nuevo");
		this.jButtonModificarTipoVariableNomi.setText("Editar");
        this.jButtonActualizarTipoVariableNomi.setText("Actualizar");
        this.jButtonEliminarTipoVariableNomi.setText("Eliminar");
        this.jButtonCancelarTipoVariableNomi.setText("Cancelar");
        this.jButtonGuardarCambiosTipoVariableNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoVariableNomi.setText("Guardar");
		this.jButtonCerrarTipoVariableNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoVariableNomi,"nuevo_button","Nuevo",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoVariableNomi,"modificar_button","Editar",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoVariableNomi,"actualizar_button","Actualizar",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoVariableNomi,"eliminar_button","Eliminar",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoVariableNomi,"cancelar_button","Cancelar",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoVariableNomi,"guardarcambios_button","Guardar",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoVariableNomi,"guardarcambiostabla_button","Guardar",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoVariableNomi,"cerrar_button","Salir",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoVariableNomi.setToolTipText("Nuevo"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoVariableNomi.setToolTipText("Editar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoVariableNomi.setToolTipText("Actualizar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoVariableNomi.setToolTipText("Eliminar)"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoVariableNomi.setToolTipText("Cancelar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoVariableNomi.setToolTipText("Guardar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoVariableNomi.setToolTipText("Guardar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoVariableNomi.setToolTipText("Salir"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoVariableNomi";
		inputMap = this.jButtonNuevoTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoVariableNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoVariableNomi";
		inputMap = this.jButtonActualizarTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoVariableNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoVariableNomi";
		inputMap = this.jButtonEliminarTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoVariableNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoVariableNomi";
		inputMap = this.jButtonCancelarTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoVariableNomi"));
		
		//CERRAR		
		sMapKey = "CerrarTipoVariableNomi";
		inputMap = this.jButtonCerrarTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoVariableNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoVariableNomi";
		inputMap = this.jButtonGuardarCambiosTablaTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoVariableNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoVariableNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoVariableNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoVariableNomi.setToolTipText("Nuevo TipoVariableNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoVariableNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoVariableNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoVariableNomi.setToolTipText("Sin Cerrar Ventana TipoVariableNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoVariableNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoVariableNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoVariableNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoVariableNomi.setText("Accion");
		this.jComboBoxTiposAccionesTipoVariableNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoVariableNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoVariableNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoVariableNomi = new JLabelMe();
		
		this.jLabelAccionesTipoVariableNomi.setText("Acciones");		
		this.jLabelAccionesTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoVariableNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoVariableNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoVariableNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoVariableNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoVariableNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoVariableNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoVariableNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoVariableNomi = new GridBagLayout();
		
		this.jPanelCamposTipoVariableNomi.setLayout(gridaBagLayoutCamposTipoVariableNomi);
		this.jPanelCamposOcultosTipoVariableNomi.setLayout(gridaBagLayoutCamposOcultosTipoVariableNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoVariableNomi.gridx = 0;
	this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoVariableNomi.add(jLabelIdTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);



	this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoVariableNomi.gridx = 1;
	this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoVariableNomi.add(jTextFieldidTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);


	this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoVariableNomi.gridx = 0;
	this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoVariableNomi.add(jLabelcodigoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = 0;
		this.gridBagConstraintsTipoVariableNomi.gridx = 2;
		this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
		this.gridBagConstraintsTipoVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoVariableNomi.add(jButtoncodigoTipoVariableNomiBusqueda, this.gridBagConstraintsTipoVariableNomi);
	}

	this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoVariableNomi.gridx = 1;
	this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoVariableNomi.add(jTextFieldcodigoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);


	this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoVariableNomi.gridx = 0;
	this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoVariableNomi.add(jLabelnombreTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = 0;
		this.gridBagConstraintsTipoVariableNomi.gridx = 2;
		this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
		this.gridBagConstraintsTipoVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoVariableNomi.add(jButtonnombreTipoVariableNomiBusqueda, this.gridBagConstraintsTipoVariableNomi);
	}

	this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoVariableNomi.gridx = 1;
	this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoVariableNomi.add(jscrollPanenombreTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVariableNomi.gridy = iYPanelCamposTipoVariableNomi;
	this.gridBagConstraintsTipoVariableNomi.gridx = iXPanelCamposTipoVariableNomi++;
	this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVariableNomi.add(this.jPanelidTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);



	if(iXPanelCamposTipoVariableNomi % 1==0) {
		iXPanelCamposTipoVariableNomi=0;
		iYPanelCamposTipoVariableNomi++;
	}
	this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVariableNomi.gridy = iYPanelCamposTipoVariableNomi;
	this.gridBagConstraintsTipoVariableNomi.gridx = iXPanelCamposTipoVariableNomi++;
	this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVariableNomi.add(this.jPanelcodigoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);



	if(iXPanelCamposTipoVariableNomi % 1==0) {
		iXPanelCamposTipoVariableNomi=0;
		iYPanelCamposTipoVariableNomi++;
	}
	this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVariableNomi.gridy = iYPanelCamposTipoVariableNomi;
	this.gridBagConstraintsTipoVariableNomi.gridx = iXPanelCamposTipoVariableNomi++;
	this.gridBagConstraintsTipoVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVariableNomi.add(this.jPanelnombreTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);



	if(iXPanelCamposTipoVariableNomi % 1==0) {
		iXPanelCamposTipoVariableNomi=0;
		iYPanelCamposTipoVariableNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoVariableNomi= new GridBagLayout();
		this.jPanelAccionesTipoVariableNomi.setLayout(gridaBagLayoutAccionesTipoVariableNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoVariableNomi= new GridBagLayout();
		this.jPanelAccionesFormularioTipoVariableNomi.setLayout(gridaBagLayoutAccionesFormularioTipoVariableNomi);
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoVariableNomi.add(this.jComboBoxTiposAccionesFormularioTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);

		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoVariableNomi.add(this.jCheckBoxPostAccionNuevoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoVariableNomi.add(this.jCheckBoxPostAccionSinCerrarTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoVariableNomi.add(this.jCheckBoxPostAccionSinMensajeTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = 0;
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoVariableNomi.add(this.jButtonModificarTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);							

		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = 0;
		this.gridBagConstraintsTipoVariableNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoVariableNomi.add(this.jButtonEliminarTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
			
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = 0;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoVariableNomi.add(this.jButtonActualizarTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);


		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = 0;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoVariableNomi.add(this.jButtonGuardarCambiosTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);	
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = 0;		
		this.gridBagConstraintsTipoVariableNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoVariableNomi.add(this.jButtonCancelarTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoVariableNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoVariableNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();						
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVariableNomi.gridx = 0;		
			//this.gridBagConstraintsTipoVariableNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoVariableNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoVariableNomi.gridx =0;
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoVariableNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoVariableNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoVariableNomi = new TipoVariableNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Variable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Variable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Variable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoVariableNomiModel tipovariablenomiModel=new TipoVariableNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoVariableNomiModel.TipoVariableNomiFocusTraversalPolicy tipovariablenomiFocusTraversalPolicy = tipovariablenomiModel.new TipoVariableNomiFocusTraversalPolicy(this);
			
			//tipovariablenomiFocusTraversalPolicy.settipovariablenomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipovariablenomiModel);
			
			
			this.jContentPaneDetalleTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoVariableNomi = new GridBagLayout();	
			this.jContentPaneDetalleTipoVariableNomi.setLayout(gridaBagLayoutDetalleTipoVariableNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoVariableNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoVariableNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoVariableNomi.gridx = 0;
					
				
				this.jContentPaneDetalleTipoVariableNomi.add(jTtoolBarDetalleTipoVariableNomi, gridBagConstraintsTipoVariableNomi);								
				
}
			
			this.jScrollPanelDatosEdicionTipoVariableNomi=   new JScrollPane(jContentPaneDetalleTipoVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoVariableNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoVariableNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoVariableNomi.gridx = 0;
	        
			this.jContentPaneDetalleTipoVariableNomi.add(jPanelCamposTipoVariableNomi, gridBagConstraintsTipoVariableNomi);
			
			
			
			
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
						&& tipovariablenomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameVariableNomi(this.puedeCargarPorParteVariableNomi,false,-1);
					
					if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoVariableNomi= new GridBagConstraints();
						this.gridBagConstraintsTipoVariableNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoVariableNomi.gridx = 0;
						this.jContentPaneDetalleTipoVariableNomi.add(this.jTabbedPaneRelacionesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoVariableNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameVariableNomi(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoVariableNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
					this.gridBagConstraintsTipoVariableNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoVariableNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoVariableNomi.gridx = 0;
					
				
					this.jContentPaneDetalleTipoVariableNomi.add(jPanelCamposOcultosTipoVariableNomi, gridBagConstraintsTipoVariableNomi);
				
					this.jPanelCamposOcultosTipoVariableNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoVariableNomi.gridx = 0;
	        this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoVariableNomi.add(this.jPanelAccionesFormularioTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);							
			
			
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
	        this.gridBagConstraintsTipoVariableNomi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoVariableNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoVariableNomi.add(this.jPanelAccionesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoVariableNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoVariableNomi=   new JScrollPane(this.jPanelCamposTipoVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoVariableNomi.gridx = 0;
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoVariableNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoVariableNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);			
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoVariableNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			
			
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
			
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoVariableNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoVariableNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoVariableNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameVariableNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.variablenomiSessionBean=new VariableNomiSessionBean();
		this.variablenomiSessionBean.setConGuardarRelaciones(false);
		this.variablenomiSessionBean.setEsGuardarRelacionado(true);

		this.variablenomiBeanSwingJInternalFrame=null;//new VariableNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.variablenomiBeanSwingJInternalFramePopup=new VariableNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.variablenomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {

				VariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL=TipoVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				VariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.variablenomiSessionBean.setEsGuardarRelacionado(true);

				this.variablenomiBeanSwingJInternalFrame=new VariableNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.variablenomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.variablenomiBeanSwingJInternalFrame.setvariablenomiSessionBean(this.variablenomiSessionBean);

				//this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
				//this.gridBagConstraintsTipoVariableNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoVariableNomi.gridx = 0;
				//this.jContentPaneDetalleTipoVariableNomi.add(this.variablenomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoVariableNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoVariableNomi.add("Variable Nominas",this.variablenomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoVariableNomi.setComponentAt(iIndexTab,this.variablenomiBeanSwingJInternalFrame.getContentPane());
				}

				//VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.variablenomiSessionBean.setEsGuardarRelacionado(false);
				this.variablenomiBeanSwingJInternalFrame=null;//new VariableNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVariableNomi) {
					this.jTabbedPaneRelacionesTipoVariableNomi.add("Variable Nominas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarVariableNomiBeanSwingJInternalFrame(List<TipoVariableNomi> tipovariablenomis,TipoVariableNomi tipovariablenomi,VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//variablenomiBeanSwingJInternalFrame=new VariableNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					variablenomiBeanSwingJInternalFrame.getVariableNomiLogic().setConnexion(this.tipovariablenomiLogic.getConnexion());

					variablenomiBeanSwingJInternalFrame.settipovariablenomisForeignKey(tipovariablenomis);
					variablenomiBeanSwingJInternalFrame.settipovariablenomiForeignKey(tipovariablenomi);
					variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setisBusquedaDesdeForeignKeySesionTipoVariableNomi(true);
					variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setlidTipoVariableNomiActual(tipovariablenomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					variablenomiBeanSwingJInternalFrame.cargarCombosForeignKeyVariableNomi(variablenomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					variablenomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoVariableNomi(true);
					variablenomiBeanSwingJInternalFrame.setid_tipo_variable_nomiFK_IdTipoVariableNomi(tipovariablenomi.getId());

					if(!this.conCargarFormDetalle) {
						variablenomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					variablenomiBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoVariableNomiForeignKey(tipovariablenomi,1,false,true,true);
					variablenomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					variablenomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoVariableNomi");
					variablenomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoVariableNomi");
					variablenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaVariableNomi(true);
					variablenomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesVariableNomi("n",variablenomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, variablenomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					variablenomiBeanSwingJInternalFrame.setAutoscrolls(true);
					variablenomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						variablenomiBeanSwingJInternalFrame.actualizarEstadoPanelsVariableNomi("relacionado");
					} else {
						variablenomiBeanSwingJInternalFrame.actualizarEstadoPanelsVariableNomi("no_relacionado");
					}

					variablenomiBeanSwingJInternalFrame.getjButtonRecargarInformacionVariableNomi().setVisible(false);

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
