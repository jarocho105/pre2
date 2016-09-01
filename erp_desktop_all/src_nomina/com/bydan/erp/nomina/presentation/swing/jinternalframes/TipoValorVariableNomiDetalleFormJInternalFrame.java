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
import com.bydan.erp.nomina.util.TipoValorVariableNomiConstantesFunciones;

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
public class TipoValorVariableNomiDetalleFormJInternalFrame extends TipoValorVariableNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoValorVariableNomi;
	
	protected JMenuBar jmenuBarDetalleTipoValorVariableNomi;
	
	protected JMenu jmenuDetalleTipoValorVariableNomi;
	protected JMenu jmenuDetalleArchivoTipoValorVariableNomi;
	protected JMenu jmenuDetalleAccionesTipoValorVariableNomi;
	protected JMenu jmenuDetalleDatosTipoValorVariableNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoValorVariableNomi;	
	protected GridBagConstraints gridBagConstraintsTipoValorVariableNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoValorVariableNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoValorVariableNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoValorVariableNomiSessionBean tipovalorvariablenomiSessionBean;
	
	

	public VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFrame=null;
	public VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteVariableNomi=false;
	public VariableNomiSessionBean variablenomiSessionBean;
	
		
	
	public TipoValorVariableNomiLogic tipovalorvariablenomiLogic;
	
	public JScrollPane jScrollPanelDatosTipoValorVariableNomi;
	public JScrollPane jScrollPanelDatosEdicionTipoValorVariableNomi;
	public JScrollPane jScrollPanelDatosGeneralTipoValorVariableNomi;
	
	protected JPanel jPanelCamposTipoValorVariableNomi;    
	protected JPanel jPanelCamposOcultosTipoValorVariableNomi;    	
	protected JPanel jPanelAccionesTipoValorVariableNomi;
	protected JPanel jPanelAccionesFormularioTipoValorVariableNomi;
    
	
	
	protected Integer iXPanelCamposTipoValorVariableNomi=0;
	protected Integer iYPanelCamposTipoValorVariableNomi=0;
	
	protected Integer iXPanelCamposOcultosTipoValorVariableNomi=0;
	protected Integer iYPanelCamposOcultosTipoValorVariableNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoValorVariableNomi;
	public JButton jButtonModificarTipoValorVariableNomi;
	public JButton jButtonActualizarTipoValorVariableNomi;
    public JButton jButtonEliminarTipoValorVariableNomi;
	public JButton jButtonCancelarTipoValorVariableNomi;
    public JButton jButtonGuardarCambiosTipoValorVariableNomi;
	public JButton jButtonGuardarCambiosTablaTipoValorVariableNomi;
	protected JButton jButtonCerrarTipoValorVariableNomi;
	
	
	protected JButton jButtonProcesarInformacionTipoValorVariableNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoValorVariableNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoValorVariableNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoValorVariableNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoValorVariableNomi;
	protected JButton jButtonModificarToolBarTipoValorVariableNomi;
	protected JButton jButtonActualizarToolBarTipoValorVariableNomi;
    protected JButton jButtonEliminarToolBarTipoValorVariableNomi;
	protected JButton jButtonCancelarToolBarTipoValorVariableNomi;
    protected JButton jButtonGuardarCambiosToolBarTipoValorVariableNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoValorVariableNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoValorVariableNomi;
	protected JButton jButtonCerrarToolBarTipoValorVariableNomi;
	
	protected JButton jButtonProcesarInformacionToolBarTipoValorVariableNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoValorVariableNomi;
	protected JMenuItem jMenuItemModificarTipoValorVariableNomi;
	protected JMenuItem jMenuItemActualizarTipoValorVariableNomi;
    protected JMenuItem jMenuItemEliminarTipoValorVariableNomi;
	protected JMenuItem jMenuItemCancelarTipoValorVariableNomi;
    protected JMenuItem jMenuItemGuardarCambiosTipoValorVariableNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoValorVariableNomi;
	protected JMenuItem jMenuItemCerrarTipoValorVariableNomi;
	protected JMenuItem jMenuItemDetalleCerrarTipoValorVariableNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoValorVariableNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoValorVariableNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoValorVariableNomi;
	protected JMenuItem jMenuItemMostrarOcultarTipoValorVariableNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoValorVariableNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoValorVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoValorVariableNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoValorVariableNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoValorVariableNomi;
	public JLabel jLabelIdTipoValorVariableNomi;
	public JTextFieldMe jTextFieldidTipoValorVariableNomi;
	public JButton jButtonidTipoValorVariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoValorVariableNomi;
	public JLabel jLabelcodigoTipoValorVariableNomi;
	public JTextField jTextFieldcodigoTipoValorVariableNomi;
	public JButton jButtoncodigoTipoValorVariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoValorVariableNomi;
	public JLabel jLabelnombreTipoValorVariableNomi;
	public JTextArea jTextAreanombreTipoValorVariableNomi;
	public JScrollPane jscrollPanenombreTipoValorVariableNomi;
	public JButton jButtonnombreTipoValorVariableNomiBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoValorVariableNomi;
	
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
	
	public TipoValorVariableNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoValorVariableNomi=new JPanel();
				this.jPanelAccionesFormularioTipoValorVariableNomi=new JPanel();
				this.jmenuBarDetalleTipoValorVariableNomi=new JMenuBar();
				this.jTtoolBarDetalleTipoValorVariableNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValorVariableNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoValorVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoValorVariableNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoValorVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValorVariableNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoValorVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValorVariableNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoValorVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValorVariableNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoValorVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoValorVariableNomi() {
		return this.jButtonActualizarToolBarTipoValorVariableNomi;
	}
	
	public JButton getjButtonEliminarToolBarTipoValorVariableNomi() {
		return this.jButtonEliminarToolBarTipoValorVariableNomi;
	}
	
	public JButton getjButtonCancelarToolBarTipoValorVariableNomi() {
		return this.jButtonCancelarToolBarTipoValorVariableNomi;
	}		
	
	public JButton getjButtonProcesarInformacionTipoValorVariableNomi() {
		return this.jButtonProcesarInformacionTipoValorVariableNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoValorVariableNomi)	{
		this.jButtonProcesarInformacionTipoValorVariableNomi = jButtonProcesarInformacionTipoValorVariableNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoValorVariableNomi() {
		return this.jComboBoxTiposAccionesTipoValorVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoValorVariableNomi(
			JComboBox jComboBoxTiposRelacionesTipoValorVariableNomi) {
		this.jComboBoxTiposRelacionesTipoValorVariableNomi = jComboBoxTiposRelacionesTipoValorVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoValorVariableNomi(
			JComboBox jComboBoxTiposAccionesTipoValorVariableNomi) {
		this.jComboBoxTiposAccionesTipoValorVariableNomi = jComboBoxTiposAccionesTipoValorVariableNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoValorVariableNomi() {
		return this.jComboBoxTiposAccionesFormularioTipoValorVariableNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoValorVariableNomi(
			JComboBox jComboBoxTiposAccionesFormularioTipoValorVariableNomi) {
		this.jComboBoxTiposAccionesFormularioTipoValorVariableNomi = jComboBoxTiposAccionesFormularioTipoValorVariableNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipovalorvariablenomiSessionBean=new TipoValorVariableNomiSessionBean();
		
		this.tipovalorvariablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovalorvariablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.variablenomiSessionBean=new VariableNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoValorVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoValorVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoValorVariableNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Valor Variable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoValorVariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoValorVariableNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoValorVariableNomi=new JButtonMe();
				this.jButtonModificarToolBarTipoValorVariableNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoValorVariableNomi,this.jTtoolBarDetalleTipoValorVariableNomi,
							"actualizar","actualizar","Actualizar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoValorVariableNomi,this.jTtoolBarDetalleTipoValorVariableNomi,
							"eliminar","eliminar","Eliminar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoValorVariableNomi,this.jTtoolBarDetalleTipoValorVariableNomi,
							"cancelar","cancelar","Cancelar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoValorVariableNomi,this.jTtoolBarDetalleTipoValorVariableNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoValorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoValorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoValorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoValorVariableNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoValorVariableNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoValorVariableNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoValorVariableNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoValorVariableNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoValorVariableNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoValorVariableNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoValorVariableNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoValorVariableNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoValorVariableNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoValorVariableNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoValorVariableNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoValorVariableNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoValorVariableNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoValorVariableNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoValorVariableNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoValorVariableNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoValorVariableNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoValorVariableNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoValorVariableNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoValorVariableNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoValorVariableNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoValorVariableNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoValorVariableNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoValorVariableNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoValorVariableNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoValorVariableNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoValorVariableNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoValorVariableNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoValorVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoValorVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoValorVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoValorVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoValorVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoValorVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoValorVariableNomi.add(this.jMenuItemDetalleCerrarTipoValorVariableNomi);
		
		this.jmenuDetalleAccionesTipoValorVariableNomi.add(this.jMenuItemActualizarTipoValorVariableNomi);
		this.jmenuDetalleAccionesTipoValorVariableNomi.add(this.jMenuItemEliminarTipoValorVariableNomi);
		this.jmenuDetalleAccionesTipoValorVariableNomi.add(this.jMenuItemCancelarTipoValorVariableNomi);		
		
		//this.jmenuDetalleDatosTipoValorVariableNomi.add(this.jMenuItemDetalleAbrirOrderByTipoValorVariableNomi);				
		this.jmenuDetalleDatosTipoValorVariableNomi.add(this.jMenuItemDetalleMostarOcultarTipoValorVariableNomi);				
				
		//this.jmenuDetalleAccionesTipoValorVariableNomi.add(this.jMenuItemGuardarCambiosTipoValorVariableNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoValorVariableNomi.add(this.jmenuDetalleArchivoTipoValorVariableNomi);		
		this.jmenuBarDetalleTipoValorVariableNomi.add(this.jmenuDetalleAccionesTipoValorVariableNomi);		
		this.jmenuBarDetalleTipoValorVariableNomi.add(this.jmenuDetalleDatosTipoValorVariableNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoValorVariableNomi.add(this.jmenuDetalleTipoValorVariableNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoValorVariableNomi);				
	}
	
	
	public void inicializarElementosCamposTipoValorVariableNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoValorVariableNomi = new JLabelMe();
		jLabelIdTipoValorVariableNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoValorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoValorVariableNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoValorVariableNomi.setToolTipText(TipoValorVariableNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoValorVariableNomi= new GridBagLayout();

		this.jPanelidTipoValorVariableNomi.setLayout(this.gridaBagLayoutTipoValorVariableNomi);

		jTextFieldidTipoValorVariableNomi = new JTextFieldMe();
		jTextFieldidTipoValorVariableNomi.setText("Id");

		jTextFieldidTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoValorVariableNomi = new JLabelMe();
		this.jLabelcodigoTipoValorVariableNomi.setText(""+TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoValorVariableNomi.setToolTipText("Codigo");
		this.jLabelcodigoTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoValorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoValorVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoValorVariableNomi.setToolTipText(TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoValorVariableNomi = new GridBagLayout();
		this.jPanelcodigoTipoValorVariableNomi.setLayout(this.gridaBagLayoutTipoValorVariableNomi);


		jTextFieldcodigoTipoValorVariableNomi= new JTextFieldMe();

		jTextFieldcodigoTipoValorVariableNomi.setEnabled(false);
		jTextFieldcodigoTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoValorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoValorVariableNomiBusqueda= new JButtonMe();
		this.jButtoncodigoTipoValorVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoValorVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoValorVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoValorVariableNomiBusqueda.setText("U");
		this.jButtoncodigoTipoValorVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoValorVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoValorVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoValorVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoValorVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoValorVariableNomiBusqueda"));

		if(this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoValorVariableNomiBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoValorVariableNomi = new JLabelMe();
		this.jLabelnombreTipoValorVariableNomi.setText(""+TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoValorVariableNomi.setToolTipText("Nombre");
		this.jLabelnombreTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoValorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoValorVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoValorVariableNomi.setToolTipText(TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoValorVariableNomi = new GridBagLayout();
		this.jPanelnombreTipoValorVariableNomi.setLayout(this.gridaBagLayoutTipoValorVariableNomi);


		jTextAreanombreTipoValorVariableNomi= new JTextAreaMe();
		jTextAreanombreTipoValorVariableNomi.setEnabled(false);
		jTextAreanombreTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoValorVariableNomi.setLineWrap(true);
		jTextAreanombreTipoValorVariableNomi.setWrapStyleWord(true);
		jTextAreanombreTipoValorVariableNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoValorVariableNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoValorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoValorVariableNomi = new JScrollPane(jTextAreanombreTipoValorVariableNomi);
		jscrollPanenombreTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoValorVariableNomiBusqueda= new JButtonMe();
		this.jButtonnombreTipoValorVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoValorVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoValorVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoValorVariableNomiBusqueda.setText("U");
		this.jButtonnombreTipoValorVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoValorVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoValorVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoValorVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoValorVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoValorVariableNomiBusqueda"));

		if(this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoValorVariableNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoValorVariableNomi() {
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
		//this.jInternalFrameDetalleTipoValorVariableNomi = new TipoValorVariableNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Valor Variable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoValorVariableNomi= new GridBagLayout();
		

		
		String sToolTipTipoValorVariableNomi="";
		sToolTipTipoValorVariableNomi=TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoValorVariableNomi+="(Nomina.TipoValorVariableNomi)";
		}
		
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoValorVariableNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoValorVariableNomi = new JButtonMe();
		this.jButtonModificarTipoValorVariableNomi = new JButtonMe();
        this.jButtonActualizarTipoValorVariableNomi = new JButtonMe();
        this.jButtonEliminarTipoValorVariableNomi = new JButtonMe();
        this.jButtonCancelarTipoValorVariableNomi = new JButtonMe();
        this.jButtonGuardarCambiosTipoValorVariableNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi = new JButtonMe();
		this.jButtonCerrarTipoValorVariableNomi = new JButtonMe();
		
		this.jScrollPanelDatosTipoValorVariableNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoValorVariableNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoValorVariableNomi = new JScrollPane();
				
		
		
		this.jPanelCamposTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Valor Variable";
		
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valor Variables" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoValorVariableNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoValorVariableNomi.setName("jPanelCamposTipoValorVariableNomi"); 

		this.jPanelCamposOcultosTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoValorVariableNomi.setName("jPanelCamposOcultosTipoValorVariableNomi"); 

        this.jPanelAccionesTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoValorVariableNomi.setToolTipText("Acciones");
        this.jPanelAccionesTipoValorVariableNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoValorVariableNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoValorVariableNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoValorVariableNomi.setText("Nuevo");
		this.jButtonModificarTipoValorVariableNomi.setText("Editar");
        this.jButtonActualizarTipoValorVariableNomi.setText("Actualizar");
        this.jButtonEliminarTipoValorVariableNomi.setText("Eliminar");
        this.jButtonCancelarTipoValorVariableNomi.setText("Cancelar");
        this.jButtonGuardarCambiosTipoValorVariableNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi.setText("Guardar");
		this.jButtonCerrarTipoValorVariableNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoValorVariableNomi,"nuevo_button","Nuevo",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoValorVariableNomi,"modificar_button","Editar",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoValorVariableNomi,"actualizar_button","Actualizar",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoValorVariableNomi,"eliminar_button","Eliminar",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoValorVariableNomi,"cancelar_button","Cancelar",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoValorVariableNomi,"guardarcambios_button","Guardar",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoValorVariableNomi,"guardarcambiostabla_button","Guardar",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoValorVariableNomi,"cerrar_button","Salir",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoValorVariableNomi.setToolTipText("Nuevo"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoValorVariableNomi.setToolTipText("Editar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoValorVariableNomi.setToolTipText("Actualizar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoValorVariableNomi.setToolTipText("Eliminar)"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoValorVariableNomi.setToolTipText("Cancelar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoValorVariableNomi.setToolTipText("Guardar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi.setToolTipText("Guardar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoValorVariableNomi.setToolTipText("Salir"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoValorVariableNomi";
		inputMap = this.jButtonNuevoTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoValorVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoValorVariableNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoValorVariableNomi";
		inputMap = this.jButtonActualizarTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoValorVariableNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoValorVariableNomi";
		inputMap = this.jButtonEliminarTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoValorVariableNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoValorVariableNomi";
		inputMap = this.jButtonCancelarTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoValorVariableNomi"));
		
		//CERRAR		
		sMapKey = "CerrarTipoValorVariableNomi";
		inputMap = this.jButtonCerrarTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoValorVariableNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoValorVariableNomi";
		inputMap = this.jButtonGuardarCambiosTablaTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoValorVariableNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoValorVariableNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoValorVariableNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoValorVariableNomi.setToolTipText("Nuevo TipoValorVariableNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoValorVariableNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoValorVariableNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoValorVariableNomi.setToolTipText("Sin Cerrar Ventana TipoValorVariableNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoValorVariableNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoValorVariableNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoValorVariableNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoValorVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoValorVariableNomi.setText("Accion");
		this.jComboBoxTiposAccionesTipoValorVariableNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoValorVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoValorVariableNomi = new JLabelMe();
		
		this.jLabelAccionesTipoValorVariableNomi.setText("Acciones");		
		this.jLabelAccionesTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoValorVariableNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoValorVariableNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoValorVariableNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoValorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoValorVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoValorVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoValorVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoValorVariableNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoValorVariableNomi = new GridBagLayout();
		
		this.jPanelCamposTipoValorVariableNomi.setLayout(gridaBagLayoutCamposTipoValorVariableNomi);
		this.jPanelCamposOcultosTipoValorVariableNomi.setLayout(gridaBagLayoutCamposOcultosTipoValorVariableNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
	this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoValorVariableNomi.add(jLabelIdTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);



	this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoValorVariableNomi.gridx = 1;
	this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoValorVariableNomi.add(jTextFieldidTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);


	this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
	this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoValorVariableNomi.add(jLabelcodigoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 2;
		this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
		this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoValorVariableNomi.add(jButtoncodigoTipoValorVariableNomiBusqueda, this.gridBagConstraintsTipoValorVariableNomi);
	}

	this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoValorVariableNomi.gridx = 1;
	this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoValorVariableNomi.add(jTextFieldcodigoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);


	this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
	this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoValorVariableNomi.add(jLabelnombreTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 2;
		this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
		this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoValorVariableNomi.add(jButtonnombreTipoValorVariableNomiBusqueda, this.gridBagConstraintsTipoValorVariableNomi);
	}

	this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
	this.gridBagConstraintsTipoValorVariableNomi.gridx = 1;
	this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
	this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoValorVariableNomi.add(jscrollPanenombreTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoValorVariableNomi.gridy = iYPanelCamposTipoValorVariableNomi;
	this.gridBagConstraintsTipoValorVariableNomi.gridx = iXPanelCamposTipoValorVariableNomi++;
	this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoValorVariableNomi.add(this.jPanelidTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);



	if(iXPanelCamposTipoValorVariableNomi % 1==0) {
		iXPanelCamposTipoValorVariableNomi=0;
		iYPanelCamposTipoValorVariableNomi++;
	}
	this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoValorVariableNomi.gridy = iYPanelCamposTipoValorVariableNomi;
	this.gridBagConstraintsTipoValorVariableNomi.gridx = iXPanelCamposTipoValorVariableNomi++;
	this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoValorVariableNomi.add(this.jPanelcodigoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);



	if(iXPanelCamposTipoValorVariableNomi % 1==0) {
		iXPanelCamposTipoValorVariableNomi=0;
		iYPanelCamposTipoValorVariableNomi++;
	}
	this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoValorVariableNomi.gridy = iYPanelCamposTipoValorVariableNomi;
	this.gridBagConstraintsTipoValorVariableNomi.gridx = iXPanelCamposTipoValorVariableNomi++;
	this.gridBagConstraintsTipoValorVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoValorVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoValorVariableNomi.add(this.jPanelnombreTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);



	if(iXPanelCamposTipoValorVariableNomi % 1==0) {
		iXPanelCamposTipoValorVariableNomi=0;
		iYPanelCamposTipoValorVariableNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoValorVariableNomi= new GridBagLayout();
		this.jPanelAccionesTipoValorVariableNomi.setLayout(gridaBagLayoutAccionesTipoValorVariableNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoValorVariableNomi= new GridBagLayout();
		this.jPanelAccionesFormularioTipoValorVariableNomi.setLayout(gridaBagLayoutAccionesFormularioTipoValorVariableNomi);
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoValorVariableNomi.add(this.jComboBoxTiposAccionesFormularioTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);

		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoValorVariableNomi.add(this.jCheckBoxPostAccionNuevoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoValorVariableNomi.add(this.jCheckBoxPostAccionSinCerrarTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoValorVariableNomi.add(this.jCheckBoxPostAccionSinMensajeTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoValorVariableNomi.add(this.jButtonModificarTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);							

		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
		this.gridBagConstraintsTipoValorVariableNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoValorVariableNomi.add(this.jButtonEliminarTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
			
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoValorVariableNomi.add(this.jButtonActualizarTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);


		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoValorVariableNomi.add(this.jButtonGuardarCambiosTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);	
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoValorVariableNomi.add(this.jButtonCancelarTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoValorVariableNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoValorVariableNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();						
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;		
			//this.gridBagConstraintsTipoValorVariableNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoValorVariableNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoValorVariableNomi.gridx =0;
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoValorVariableNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoValorVariableNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoValorVariableNomi = new TipoValorVariableNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Valor Variable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Valor Variable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Valor Variable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoValorVariableNomiModel tipovalorvariablenomiModel=new TipoValorVariableNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoValorVariableNomiModel.TipoValorVariableNomiFocusTraversalPolicy tipovalorvariablenomiFocusTraversalPolicy = tipovalorvariablenomiModel.new TipoValorVariableNomiFocusTraversalPolicy(this);
			
			//tipovalorvariablenomiFocusTraversalPolicy.settipovalorvariablenomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipovalorvariablenomiModel);
			
			
			this.jContentPaneDetalleTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoValorVariableNomi = new GridBagLayout();	
			this.jContentPaneDetalleTipoValorVariableNomi.setLayout(gridaBagLayoutDetalleTipoValorVariableNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoValorVariableNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
					
				
				this.jContentPaneDetalleTipoValorVariableNomi.add(jTtoolBarDetalleTipoValorVariableNomi, gridBagConstraintsTipoValorVariableNomi);								
				
}
			
			this.jScrollPanelDatosEdicionTipoValorVariableNomi=   new JScrollPane(jContentPaneDetalleTipoValorVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoValorVariableNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
	        
			this.jContentPaneDetalleTipoValorVariableNomi.add(jPanelCamposTipoValorVariableNomi, gridBagConstraintsTipoValorVariableNomi);
			
			
			
			
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
						&& tipovalorvariablenomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameVariableNomi(this.puedeCargarPorParteVariableNomi,false,-1);
					
					if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoValorVariableNomi= new GridBagConstraints();
						this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
						this.jContentPaneDetalleTipoValorVariableNomi.add(this.jTabbedPaneRelacionesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoValorVariableNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameVariableNomi(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoValorVariableNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
					this.gridBagConstraintsTipoValorVariableNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
					
				
					this.jContentPaneDetalleTipoValorVariableNomi.add(jPanelCamposOcultosTipoValorVariableNomi, gridBagConstraintsTipoValorVariableNomi);
				
					this.jPanelCamposOcultosTipoValorVariableNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
	        this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoValorVariableNomi.add(this.jPanelAccionesFormularioTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);							
			
			
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
	        this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoValorVariableNomi.add(this.jPanelAccionesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoValorVariableNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoValorVariableNomi=   new JScrollPane(this.jPanelCamposTipoValorVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoValorVariableNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);			
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			
			
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
			
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoValorVariableNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoValorVariableNomi;
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

				VariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL=TipoValorVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				VariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoValorVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.variablenomiSessionBean.setEsGuardarRelacionado(true);

				this.variablenomiBeanSwingJInternalFrame=new VariableNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.variablenomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.variablenomiBeanSwingJInternalFrame.setvariablenomiSessionBean(this.variablenomiSessionBean);

				//this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
				//this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
				//this.jContentPaneDetalleTipoValorVariableNomi.add(this.variablenomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoValorVariableNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoValorVariableNomi.add("Variable Nominas",this.variablenomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoValorVariableNomi.setComponentAt(iIndexTab,this.variablenomiBeanSwingJInternalFrame.getContentPane());
				}

				//VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.variablenomiSessionBean.setEsGuardarRelacionado(false);
				this.variablenomiBeanSwingJInternalFrame=null;//new VariableNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVariableNomi) {
					this.jTabbedPaneRelacionesTipoValorVariableNomi.add("Variable Nominas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarVariableNomiBeanSwingJInternalFrame(List<TipoValorVariableNomi> tipovalorvariablenomis,TipoValorVariableNomi tipovalorvariablenomi,VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//variablenomiBeanSwingJInternalFrame=new VariableNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					variablenomiBeanSwingJInternalFrame.getVariableNomiLogic().setConnexion(this.tipovalorvariablenomiLogic.getConnexion());

					variablenomiBeanSwingJInternalFrame.settipovalorvariablenomisForeignKey(tipovalorvariablenomis);
					variablenomiBeanSwingJInternalFrame.settipovalorvariablenomiForeignKey(tipovalorvariablenomi);
					variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setisBusquedaDesdeForeignKeySesionTipoValorVariableNomi(true);
					variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setlidTipoValorVariableNomiActual(tipovalorvariablenomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					variablenomiBeanSwingJInternalFrame.cargarCombosForeignKeyVariableNomi(variablenomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					variablenomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoValorVariableNomi(true);
					variablenomiBeanSwingJInternalFrame.setid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi(tipovalorvariablenomi.getId());

					if(!this.conCargarFormDetalle) {
						variablenomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					variablenomiBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoValorVariableNomiForeignKey(tipovalorvariablenomi,1,false,true,true);
					variablenomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					variablenomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoValorVariableNomi");
					variablenomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoValorVariableNomi");
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
