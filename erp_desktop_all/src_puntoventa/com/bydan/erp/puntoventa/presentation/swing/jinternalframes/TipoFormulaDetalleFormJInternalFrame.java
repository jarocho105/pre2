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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TipoFormulaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TipoFormulaDetalleFormJInternalFrame extends TipoFormulaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoFormula;
	
	protected JMenuBar jmenuBarDetalleTipoFormula;
	
	protected JMenu jmenuDetalleTipoFormula;
	protected JMenu jmenuDetalleArchivoTipoFormula;
	protected JMenu jmenuDetalleAccionesTipoFormula;
	protected JMenu jmenuDetalleDatosTipoFormula;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFormula;	
	protected GridBagConstraints gridBagConstraintsTipoFormula;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoFormulaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoFormula;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFormulaSessionBean tipoformulaSessionBean;
	
	

	public FormulaBeanSwingJInternalFrame formulaBeanSwingJInternalFrame=null;
	public FormulaBeanSwingJInternalFrame formulaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormula=false;
	public FormulaSessionBean formulaSessionBean;
	
		
	
	public TipoFormulaLogic tipoformulaLogic;
	
	public JScrollPane jScrollPanelDatosTipoFormula;
	public JScrollPane jScrollPanelDatosEdicionTipoFormula;
	public JScrollPane jScrollPanelDatosGeneralTipoFormula;
	
	protected JPanel jPanelCamposTipoFormula;    
	protected JPanel jPanelCamposOcultosTipoFormula;    	
	protected JPanel jPanelAccionesTipoFormula;
	protected JPanel jPanelAccionesFormularioTipoFormula;
    
	
	
	protected Integer iXPanelCamposTipoFormula=0;
	protected Integer iYPanelCamposTipoFormula=0;
	
	protected Integer iXPanelCamposOcultosTipoFormula=0;
	protected Integer iYPanelCamposOcultosTipoFormula=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoFormula;
	public JButton jButtonModificarTipoFormula;
	public JButton jButtonActualizarTipoFormula;
    public JButton jButtonEliminarTipoFormula;
	public JButton jButtonCancelarTipoFormula;
    public JButton jButtonGuardarCambiosTipoFormula;
	public JButton jButtonGuardarCambiosTablaTipoFormula;
	protected JButton jButtonCerrarTipoFormula;
	
	
	protected JButton jButtonProcesarInformacionTipoFormula;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoFormula;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoFormula;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoFormula;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFormula;
	protected JButton jButtonModificarToolBarTipoFormula;
	protected JButton jButtonActualizarToolBarTipoFormula;
    protected JButton jButtonEliminarToolBarTipoFormula;
	protected JButton jButtonCancelarToolBarTipoFormula;
    protected JButton jButtonGuardarCambiosToolBarTipoFormula;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoFormula;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFormula;
	protected JButton jButtonCerrarToolBarTipoFormula;
	
	protected JButton jButtonProcesarInformacionToolBarTipoFormula;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFormula;
	protected JMenuItem jMenuItemModificarTipoFormula;
	protected JMenuItem jMenuItemActualizarTipoFormula;
    protected JMenuItem jMenuItemEliminarTipoFormula;
	protected JMenuItem jMenuItemCancelarTipoFormula;
    protected JMenuItem jMenuItemGuardarCambiosTipoFormula;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFormula;
	protected JMenuItem jMenuItemCerrarTipoFormula;
	protected JMenuItem jMenuItemDetalleCerrarTipoFormula;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFormula;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoFormula;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFormula;
	protected JMenuItem jMenuItemMostrarOcultarTipoFormula;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFormula;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFormula;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFormula;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoFormula;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoFormula;
	public JLabel jLabelIdTipoFormula;
	public JTextFieldMe jTextFieldidTipoFormula;
	public JButton jButtonidTipoFormulaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoFormula;
	public JLabel jLabelnombreTipoFormula;
	public JTextArea jTextAreanombreTipoFormula;
	public JScrollPane jscrollPanenombreTipoFormula;
	public JButton jButtonnombreTipoFormulaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoFormula;
	public JLabel jLabeldescripcionTipoFormula;
	public JTextArea jTextAreadescripcionTipoFormula;
	public JScrollPane jscrollPanedescripcionTipoFormula;
	public JButton jButtondescripcionTipoFormulaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoFormula;
	
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
	
	public TipoFormulaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoFormula=new JPanel();
				this.jPanelAccionesFormularioTipoFormula=new JPanel();
				this.jmenuBarDetalleTipoFormula=new JMenuBar();
				this.jTtoolBarDetalleTipoFormula=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormulaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoFormula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoFormulaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoFormula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormulaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormulaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormulaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFormula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoFormula() {
		return this.jButtonActualizarToolBarTipoFormula;
	}
	
	public JButton getjButtonEliminarToolBarTipoFormula() {
		return this.jButtonEliminarToolBarTipoFormula;
	}
	
	public JButton getjButtonCancelarToolBarTipoFormula() {
		return this.jButtonCancelarToolBarTipoFormula;
	}		
	
	public JButton getjButtonProcesarInformacionTipoFormula() {
		return this.jButtonProcesarInformacionTipoFormula;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFormula)	{
		this.jButtonProcesarInformacionTipoFormula = jButtonProcesarInformacionTipoFormula;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFormula() {
		return this.jComboBoxTiposAccionesTipoFormula;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFormula(
			JComboBox jComboBoxTiposRelacionesTipoFormula) {
		this.jComboBoxTiposRelacionesTipoFormula = jComboBoxTiposRelacionesTipoFormula;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFormula(
			JComboBox jComboBoxTiposAccionesTipoFormula) {
		this.jComboBoxTiposAccionesTipoFormula = jComboBoxTiposAccionesTipoFormula;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoFormula() {
		return this.jComboBoxTiposAccionesFormularioTipoFormula;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoFormula(
			JComboBox jComboBoxTiposAccionesFormularioTipoFormula) {
		this.jComboBoxTiposAccionesFormularioTipoFormula = jComboBoxTiposAccionesFormularioTipoFormula;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoformulaSessionBean=new TipoFormulaSessionBean();
		
		this.tipoformulaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformulaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoformulaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formulaSessionBean=new FormulaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFormulaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFormulaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFormulaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Formula MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoFormulaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoFormula= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoFormula=new JButtonMe();
				this.jButtonModificarToolBarTipoFormula=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoFormula,this.jTtoolBarDetalleTipoFormula,
							"actualizar","actualizar","Actualizar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoFormula,this.jTtoolBarDetalleTipoFormula,
							"eliminar","eliminar","Eliminar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoFormula,this.jTtoolBarDetalleTipoFormula,
							"cancelar","cancelar","Cancelar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoFormula,this.jTtoolBarDetalleTipoFormula,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoFormula,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoFormula,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoFormula,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoFormula=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoFormula=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoFormula=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoFormula=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoFormula=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFormula= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFormula.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFormula,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoFormula= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoFormula.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoFormula,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoFormula= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoFormula.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoFormula,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoFormula= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoFormula.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoFormula,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoFormula= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoFormula.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoFormula,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoFormula= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFormula.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFormula,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFormula= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFormula.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFormula,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoFormula= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoFormula.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoFormula,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFormula= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFormula.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFormula,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFormula= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFormula.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFormula,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoFormula.add(this.jMenuItemDetalleCerrarTipoFormula);
		
		this.jmenuDetalleAccionesTipoFormula.add(this.jMenuItemActualizarTipoFormula);
		this.jmenuDetalleAccionesTipoFormula.add(this.jMenuItemEliminarTipoFormula);
		this.jmenuDetalleAccionesTipoFormula.add(this.jMenuItemCancelarTipoFormula);		
		
		//this.jmenuDetalleDatosTipoFormula.add(this.jMenuItemDetalleAbrirOrderByTipoFormula);				
		this.jmenuDetalleDatosTipoFormula.add(this.jMenuItemDetalleMostarOcultarTipoFormula);				
				
		//this.jmenuDetalleAccionesTipoFormula.add(this.jMenuItemGuardarCambiosTipoFormula);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoFormula.add(this.jmenuDetalleArchivoTipoFormula);		
		this.jmenuBarDetalleTipoFormula.add(this.jmenuDetalleAccionesTipoFormula);		
		this.jmenuBarDetalleTipoFormula.add(this.jmenuDetalleDatosTipoFormula);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoFormula.add(this.jmenuDetalleTipoFormula);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoFormula);				
	}
	
	
	public void inicializarElementosCamposTipoFormula() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoFormula = new JLabelMe();
		jLabelIdTipoFormula.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoFormula = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoFormula.setToolTipText(TipoFormulaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoFormula= new GridBagLayout();

		this.jPanelidTipoFormula.setLayout(this.gridaBagLayoutTipoFormula);

		jTextFieldidTipoFormula = new JTextFieldMe();
		jTextFieldidTipoFormula.setText("Id");

		jTextFieldidTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoFormula = new JLabelMe();
		this.jLabelnombreTipoFormula.setText(""+TipoFormulaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoFormula.setToolTipText("Nombre");
		this.jLabelnombreTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoFormula=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoFormula.setToolTipText(TipoFormulaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoFormula = new GridBagLayout();
		this.jPanelnombreTipoFormula.setLayout(this.gridaBagLayoutTipoFormula);


		jTextAreanombreTipoFormula= new JTextAreaMe();
		jTextAreanombreTipoFormula.setEnabled(false);
		jTextAreanombreTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormula.setLineWrap(true);
		jTextAreanombreTipoFormula.setWrapStyleWord(true);
		jTextAreanombreTipoFormula.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoFormula.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoFormula = new JScrollPane(jTextAreanombreTipoFormula);
		jscrollPanenombreTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoFormulaBusqueda= new JButtonMe();
		this.jButtonnombreTipoFormulaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFormulaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFormulaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoFormulaBusqueda.setText("U");
		this.jButtonnombreTipoFormulaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoFormulaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoFormulaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoFormulaBusqueda"));

		if(this.tipoformulaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoFormulaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoFormula = new JLabelMe();
		this.jLabeldescripcionTipoFormula.setText(""+TipoFormulaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoFormula.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoFormula=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoFormula.setToolTipText(TipoFormulaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoFormula = new GridBagLayout();
		this.jPaneldescripcionTipoFormula.setLayout(this.gridaBagLayoutTipoFormula);


		jTextAreadescripcionTipoFormula= new JTextAreaMe();
		jTextAreadescripcionTipoFormula.setEnabled(false);
		jTextAreadescripcionTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoFormula.setLineWrap(true);
		jTextAreadescripcionTipoFormula.setWrapStyleWord(true);
		jTextAreadescripcionTipoFormula.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoFormula.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoFormula = new JScrollPane(jTextAreadescripcionTipoFormula);
		jscrollPanedescripcionTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoFormulaBusqueda= new JButtonMe();
		this.jButtondescripcionTipoFormulaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoFormulaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoFormulaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoFormulaBusqueda.setText("U");
		this.jButtondescripcionTipoFormulaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoFormulaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoFormulaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoFormulaBusqueda"));

		if(this.tipoformulaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoFormulaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoFormula() {
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
		//this.jInternalFrameDetalleTipoFormula = new TipoFormulaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Formula DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFormula= new GridBagLayout();
		

		
		String sToolTipTipoFormula="";
		sToolTipTipoFormula=TipoFormulaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFormula+="(PuntoVenta.TipoFormula)";
		}
		
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFormula+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoFormula = new JButtonMe();
		this.jButtonModificarTipoFormula = new JButtonMe();
        this.jButtonActualizarTipoFormula = new JButtonMe();
        this.jButtonEliminarTipoFormula = new JButtonMe();
        this.jButtonCancelarTipoFormula = new JButtonMe();
        this.jButtonGuardarCambiosTipoFormula = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoFormula = new JButtonMe();
		this.jButtonCerrarTipoFormula = new JButtonMe();
		
		this.jScrollPanelDatosTipoFormula = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoFormula = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoFormula = new JScrollPane();
				
		
		
		this.jPanelCamposTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Formula";
		
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formulas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFormula.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoFormula.setName("jPanelCamposTipoFormula"); 

		this.jPanelCamposOcultosTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoFormula.setName("jPanelCamposOcultosTipoFormula"); 

        this.jPanelAccionesTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFormula.setToolTipText("Acciones");
        this.jPanelAccionesTipoFormula.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoFormula.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoFormula.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoFormula.setText("Nuevo");
		this.jButtonModificarTipoFormula.setText("Editar");
        this.jButtonActualizarTipoFormula.setText("Actualizar");
        this.jButtonEliminarTipoFormula.setText("Eliminar");
        this.jButtonCancelarTipoFormula.setText("Cancelar");
        this.jButtonGuardarCambiosTipoFormula.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoFormula.setText("Guardar");
		this.jButtonCerrarTipoFormula.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFormula,"nuevo_button","Nuevo",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoFormula,"modificar_button","Editar",this.tipoformulaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoFormula,"actualizar_button","Actualizar",this.tipoformulaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoFormula,"eliminar_button","Eliminar",this.tipoformulaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoFormula,"cancelar_button","Cancelar",this.tipoformulaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoFormula,"guardarcambios_button","Guardar",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFormula,"guardarcambiostabla_button","Guardar",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFormula,"cerrar_button","Salir",this.tipoformulaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoFormula.setToolTipText("Nuevo"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoFormula.setToolTipText("Editar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoFormula.setToolTipText("Actualizar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoFormula.setToolTipText("Eliminar)"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoFormula.setToolTipText("Cancelar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoFormula.setToolTipText("Guardar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoFormula.setToolTipText("Guardar"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFormula.setToolTipText("Salir"+" "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFormula";
		inputMap = this.jButtonNuevoTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFormula.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFormula"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoFormula";
		inputMap = this.jButtonActualizarTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoFormula"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoFormula";
		inputMap = this.jButtonEliminarTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoFormula"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoFormula";
		inputMap = this.jButtonCancelarTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoFormula"));
		
		//CERRAR		
		sMapKey = "CerrarTipoFormula";
		inputMap = this.jButtonCerrarTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFormula"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFormula";
		inputMap = this.jButtonGuardarCambiosTablaTipoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFormula"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoFormula = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoFormula.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoFormula.setToolTipText("Nuevo TipoFormula");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoFormula = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoFormula.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoFormula.setToolTipText("Sin Cerrar Ventana TipoFormula");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoFormula = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoFormula.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoFormula.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoFormula = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFormula.setText("Accion");
		this.jComboBoxTiposAccionesTipoFormula.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoFormula = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoFormula.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoFormula.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoFormula = new JLabelMe();
		
		this.jLabelAccionesTipoFormula.setText("Acciones");		
		this.jLabelAccionesTipoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoFormula();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoFormula();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoFormula=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoFormula,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoFormula.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormula.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormula.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoFormula.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFormula.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFormula.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoFormula, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoFormula = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoFormula = new GridBagLayout();
		
		this.jPanelCamposTipoFormula.setLayout(gridaBagLayoutCamposTipoFormula);
		this.jPanelCamposOcultosTipoFormula.setLayout(gridaBagLayoutCamposOcultosTipoFormula);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoFormula = new GridBagConstraints();
	this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormula.gridy = 0;
	this.gridBagConstraintsTipoFormula.gridx = 0;
	this.gridBagConstraintsTipoFormula.ipadx = 0;
	this.gridBagConstraintsTipoFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoFormula.add(jLabelIdTipoFormula, this.gridBagConstraintsTipoFormula);



	this.gridBagConstraintsTipoFormula = new GridBagConstraints();
	this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormula.gridy = 0;
	this.gridBagConstraintsTipoFormula.gridx = 1;
	this.gridBagConstraintsTipoFormula.ipadx = 0;
	this.gridBagConstraintsTipoFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoFormula.add(jTextFieldidTipoFormula, this.gridBagConstraintsTipoFormula);


	this.gridBagConstraintsTipoFormula = new GridBagConstraints();
	this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormula.gridy = 0;
	this.gridBagConstraintsTipoFormula.gridx = 0;
	this.gridBagConstraintsTipoFormula.ipadx = 0;
	this.gridBagConstraintsTipoFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoFormula.add(jLabelnombreTipoFormula, this.gridBagConstraintsTipoFormula);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormula.gridy = 0;
		this.gridBagConstraintsTipoFormula.gridx = 2;
		this.gridBagConstraintsTipoFormula.ipadx = 0;
		this.gridBagConstraintsTipoFormula.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoFormula.add(jButtonnombreTipoFormulaBusqueda, this.gridBagConstraintsTipoFormula);
	}

	this.gridBagConstraintsTipoFormula = new GridBagConstraints();
	this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormula.gridy = 0;
	this.gridBagConstraintsTipoFormula.gridx = 1;
	this.gridBagConstraintsTipoFormula.ipadx = 0;
	this.gridBagConstraintsTipoFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoFormula.add(jscrollPanenombreTipoFormula, this.gridBagConstraintsTipoFormula);


	this.gridBagConstraintsTipoFormula = new GridBagConstraints();
	this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormula.gridy = 0;
	this.gridBagConstraintsTipoFormula.gridx = 0;
	this.gridBagConstraintsTipoFormula.ipadx = 0;
	this.gridBagConstraintsTipoFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoFormula.add(jLabeldescripcionTipoFormula, this.gridBagConstraintsTipoFormula);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormula.gridy = 0;
		this.gridBagConstraintsTipoFormula.gridx = 2;
		this.gridBagConstraintsTipoFormula.ipadx = 0;
		this.gridBagConstraintsTipoFormula.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoFormula.add(jButtondescripcionTipoFormulaBusqueda, this.gridBagConstraintsTipoFormula);
	}

	this.gridBagConstraintsTipoFormula = new GridBagConstraints();
	this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormula.gridy = 0;
	this.gridBagConstraintsTipoFormula.gridx = 1;
	this.gridBagConstraintsTipoFormula.ipadx = 0;
	this.gridBagConstraintsTipoFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoFormula.add(jscrollPanedescripcionTipoFormula, this.gridBagConstraintsTipoFormula);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoFormula = new GridBagConstraints();
	this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormula.gridy = iYPanelCamposTipoFormula;
	this.gridBagConstraintsTipoFormula.gridx = iXPanelCamposTipoFormula++;
	this.gridBagConstraintsTipoFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormula.add(this.jPanelidTipoFormula, this.gridBagConstraintsTipoFormula);



	if(iXPanelCamposTipoFormula % 1==0) {
		iXPanelCamposTipoFormula=0;
		iYPanelCamposTipoFormula++;
	}
	this.gridBagConstraintsTipoFormula = new GridBagConstraints();
	this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormula.gridy = iYPanelCamposTipoFormula;
	this.gridBagConstraintsTipoFormula.gridx = iXPanelCamposTipoFormula++;
	this.gridBagConstraintsTipoFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormula.add(this.jPanelnombreTipoFormula, this.gridBagConstraintsTipoFormula);



	if(iXPanelCamposTipoFormula % 1==0) {
		iXPanelCamposTipoFormula=0;
		iYPanelCamposTipoFormula++;
	}
	this.gridBagConstraintsTipoFormula = new GridBagConstraints();
	this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormula.gridy = iYPanelCamposTipoFormula;
	this.gridBagConstraintsTipoFormula.gridx = iXPanelCamposTipoFormula++;
	this.gridBagConstraintsTipoFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormula.add(this.jPaneldescripcionTipoFormula, this.gridBagConstraintsTipoFormula);



	if(iXPanelCamposTipoFormula % 1==0) {
		iXPanelCamposTipoFormula=0;
		iYPanelCamposTipoFormula++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoFormula= new GridBagLayout();
		this.jPanelAccionesTipoFormula.setLayout(gridaBagLayoutAccionesTipoFormula);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoFormula= new GridBagLayout();
		this.jPanelAccionesFormularioTipoFormula.setLayout(gridaBagLayoutAccionesFormularioTipoFormula);
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFormula.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFormula.add(this.jComboBoxTiposAccionesFormularioTipoFormula, this.gridBagConstraintsTipoFormula);

		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFormula.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFormula.add(this.jCheckBoxPostAccionNuevoTipoFormula, this.gridBagConstraintsTipoFormula);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoformulaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFormula.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFormula.add(this.jCheckBoxPostAccionSinCerrarTipoFormula, this.gridBagConstraintsTipoFormula);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoformulaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFormula.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFormula.add(this.jCheckBoxPostAccionSinMensajeTipoFormula, this.gridBagConstraintsTipoFormula);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = 0;
		this.gridBagConstraintsTipoFormula.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoFormula.add(this.jButtonModificarTipoFormula, this.gridBagConstraintsTipoFormula);							

		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormula.gridy = 0;
		this.gridBagConstraintsTipoFormula.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoFormula.add(this.jButtonEliminarTipoFormula, this.gridBagConstraintsTipoFormula);
		
			
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = 0;		
		this.gridBagConstraintsTipoFormula.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFormula.add(this.jButtonActualizarTipoFormula, this.gridBagConstraintsTipoFormula);


		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = 0;		
		this.gridBagConstraintsTipoFormula.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFormula.add(this.jButtonGuardarCambiosTipoFormula, this.gridBagConstraintsTipoFormula);	
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = 0;		
		this.gridBagConstraintsTipoFormula.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoFormula.add(this.jButtonCancelarTipoFormula, this.gridBagConstraintsTipoFormula);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFormula = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFormula);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();						
			this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFormula.gridx = 0;		
			//this.gridBagConstraintsTipoFormula.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFormula.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFormula.gridx =0;
		this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFormula.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFormula, this.gridBagConstraintsTipoFormula);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoFormulaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoFormula = new TipoFormulaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Formula DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Formula DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Formula Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoFormulaModel tipoformulaModel=new TipoFormulaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoFormulaModel.TipoFormulaFocusTraversalPolicy tipoformulaFocusTraversalPolicy = tipoformulaModel.new TipoFormulaFocusTraversalPolicy(this);
			
			//tipoformulaFocusTraversalPolicy.settipoformulaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoformulaModel);
			
			
			this.jContentPaneDetalleTipoFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoFormula = new GridBagLayout();	
			this.jContentPaneDetalleTipoFormula.setLayout(gridaBagLayoutDetalleTipoFormula);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFormula = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoFormula = new GridBagConstraints();
				this.gridBagConstraintsTipoFormula.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoFormula.gridx = 0;
					
				
				this.jContentPaneDetalleTipoFormula.add(jTtoolBarDetalleTipoFormula, gridBagConstraintsTipoFormula);								
				
}
			
			this.jScrollPanelDatosEdicionTipoFormula=   new JScrollPane(jContentPaneDetalleTipoFormula,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFormula.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormula.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormula.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoFormula=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFormula.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormula.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormula.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoFormula.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoFormula.gridx = 0;
	        
			this.jContentPaneDetalleTipoFormula.add(jPanelCamposTipoFormula, gridBagConstraintsTipoFormula);
			
			
			
			
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
						&& tipoformulaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormula(this.puedeCargarPorParteFormula,false,-1);
					
					if(this.tipoformulaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoFormula= new GridBagConstraints();
						this.gridBagConstraintsTipoFormula.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoFormula.gridx = 0;
						this.jContentPaneDetalleTipoFormula.add(this.jTabbedPaneRelacionesTipoFormula, this.gridBagConstraintsTipoFormula);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoFormula.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormula(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoFormula.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoFormula = new GridBagConstraints();
					this.gridBagConstraintsTipoFormula.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoFormula.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoFormula.gridx = 0;
					
				
					this.jContentPaneDetalleTipoFormula.add(jPanelCamposOcultosTipoFormula, gridBagConstraintsTipoFormula);
				
					this.jPanelCamposOcultosTipoFormula.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoFormula.gridx = 0;
	        this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoFormula.add(this.jPanelAccionesFormularioTipoFormula, this.gridBagConstraintsTipoFormula);							
			
			
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
	        this.gridBagConstraintsTipoFormula.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoFormula.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoFormula.add(this.jPanelAccionesTipoFormula, this.gridBagConstraintsTipoFormula);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoFormula);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoFormula=   new JScrollPane(this.jPanelCamposTipoFormula,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFormula.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormula.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormula.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormula.gridx = 0;
			this.gridBagConstraintsTipoFormula.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoFormula.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoFormula.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoFormula, this.gridBagConstraintsTipoFormula);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormula.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoFormula, this.gridBagConstraintsTipoFormula);			
			
			this.gridBagConstraintsTipoFormula = new GridBagConstraints();
			this.gridBagConstraintsTipoFormula.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormula.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoFormula, this.gridBagConstraintsTipoFormula);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormula.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFormula, this.gridBagConstraintsTipoFormula);
			
			
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormula.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFormula, this.gridBagConstraintsTipoFormula);
		
			
		this.gridBagConstraintsTipoFormula = new GridBagConstraints();
		this.gridBagConstraintsTipoFormula.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormula.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFormula, this.gridBagConstraintsTipoFormula);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoFormula;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoFormula;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormula(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formulaSessionBean=new FormulaSessionBean();
		this.formulaSessionBean.setConGuardarRelaciones(false);
		this.formulaSessionBean.setEsGuardarRelacionado(true);

		this.formulaBeanSwingJInternalFrame=null;//new FormulaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formulaBeanSwingJInternalFramePopup=new FormulaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formulaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formulaSessionBean.getEsGuardarRelacionado()) {

				FormulaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFormulaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormulaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFormulaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formulaSessionBean.setEsGuardarRelacionado(true);

				this.formulaBeanSwingJInternalFrame=new FormulaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formulaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formulaBeanSwingJInternalFrame.setformulaSessionBean(this.formulaSessionBean);

				//this.gridBagConstraintsTipoFormula = new GridBagConstraints();
				//this.gridBagConstraintsTipoFormula.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFormula.gridx = 0;
				//this.jContentPaneDetalleTipoFormula.add(this.formulaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFormula);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFormula.add("Formulas",this.formulaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFormula.setComponentAt(iIndexTab,this.formulaBeanSwingJInternalFrame.getContentPane());
				}

				//FormulaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formulaSessionBean.setEsGuardarRelacionado(false);
				this.formulaBeanSwingJInternalFrame=null;//new FormulaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formulaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormula) {
					this.jTabbedPaneRelacionesTipoFormula.add("Formulas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormulaBeanSwingJInternalFrame(List<TipoFormula> tipoformulas,TipoFormula tipoformula,FormulaBeanSwingJInternalFrame formulaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formulaBeanSwingJInternalFrame=new FormulaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formulaBeanSwingJInternalFrame.getFormulaLogic().setConnexion(this.tipoformulaLogic.getConnexion());

					formulaBeanSwingJInternalFrame.settipoformulasForeignKey(tipoformulas);
					formulaBeanSwingJInternalFrame.settipoformulaForeignKey(tipoformula);
					formulaBeanSwingJInternalFrame.formulaSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormula(true);
					formulaBeanSwingJInternalFrame.formulaSessionBean.setlidTipoFormulaActual(tipoformula.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formulaBeanSwingJInternalFrame.cargarCombosForeignKeyFormula(formulaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formulaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFormula(true);
					formulaBeanSwingJInternalFrame.setid_tipo_formulaFK_IdTipoFormula(tipoformula.getId());

					if(!this.conCargarFormDetalle) {
						formulaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formulaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFormulaForeignKey(tipoformula,1,false,true,true);
					formulaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formulaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFormula");
					formulaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFormula");
					formulaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormula(true);
					formulaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormula("n",formulaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formulaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formulaBeanSwingJInternalFrame.setAutoscrolls(true);
					formulaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formulaBeanSwingJInternalFrame.actualizarEstadoPanelsFormula("relacionado");
					} else {
						formulaBeanSwingJInternalFrame.actualizarEstadoPanelsFormula("no_relacionado");
					}

					formulaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormula().setVisible(false);

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
