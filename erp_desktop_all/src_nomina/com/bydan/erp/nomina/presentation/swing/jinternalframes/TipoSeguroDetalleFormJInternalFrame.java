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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.TipoSeguroConstantesFunciones;

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
public class TipoSeguroDetalleFormJInternalFrame extends TipoSeguroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoSeguro;
	
	protected JMenuBar jmenuBarDetalleTipoSeguro;
	
	protected JMenu jmenuDetalleTipoSeguro;
	protected JMenu jmenuDetalleArchivoTipoSeguro;
	protected JMenu jmenuDetalleAccionesTipoSeguro;
	protected JMenu jmenuDetalleDatosTipoSeguro;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoSeguro;	
	protected GridBagConstraints gridBagConstraintsTipoSeguro;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoSeguroBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoSeguro;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoSeguroSessionBean tiposeguroSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoSeguroLogic tiposeguroLogic;
	
	public JScrollPane jScrollPanelDatosTipoSeguro;
	public JScrollPane jScrollPanelDatosEdicionTipoSeguro;
	public JScrollPane jScrollPanelDatosGeneralTipoSeguro;
	
	protected JPanel jPanelCamposTipoSeguro;    
	protected JPanel jPanelCamposOcultosTipoSeguro;    	
	protected JPanel jPanelAccionesTipoSeguro;
	protected JPanel jPanelAccionesFormularioTipoSeguro;
    
	
	
	protected Integer iXPanelCamposTipoSeguro=0;
	protected Integer iYPanelCamposTipoSeguro=0;
	
	protected Integer iXPanelCamposOcultosTipoSeguro=0;
	protected Integer iYPanelCamposOcultosTipoSeguro=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoSeguro;
	public JButton jButtonModificarTipoSeguro;
	public JButton jButtonActualizarTipoSeguro;
    public JButton jButtonEliminarTipoSeguro;
	public JButton jButtonCancelarTipoSeguro;
    public JButton jButtonGuardarCambiosTipoSeguro;
	public JButton jButtonGuardarCambiosTablaTipoSeguro;
	protected JButton jButtonCerrarTipoSeguro;
	
	
	protected JButton jButtonProcesarInformacionTipoSeguro;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoSeguro;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoSeguro;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoSeguro;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoSeguro;
	protected JButton jButtonModificarToolBarTipoSeguro;
	protected JButton jButtonActualizarToolBarTipoSeguro;
    protected JButton jButtonEliminarToolBarTipoSeguro;
	protected JButton jButtonCancelarToolBarTipoSeguro;
    protected JButton jButtonGuardarCambiosToolBarTipoSeguro;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoSeguro;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoSeguro;
	protected JButton jButtonCerrarToolBarTipoSeguro;
	
	protected JButton jButtonProcesarInformacionToolBarTipoSeguro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoSeguro;
	protected JMenuItem jMenuItemModificarTipoSeguro;
	protected JMenuItem jMenuItemActualizarTipoSeguro;
    protected JMenuItem jMenuItemEliminarTipoSeguro;
	protected JMenuItem jMenuItemCancelarTipoSeguro;
    protected JMenuItem jMenuItemGuardarCambiosTipoSeguro;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoSeguro;
	protected JMenuItem jMenuItemCerrarTipoSeguro;
	protected JMenuItem jMenuItemDetalleCerrarTipoSeguro;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoSeguro;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoSeguro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoSeguro;
	protected JMenuItem jMenuItemMostrarOcultarTipoSeguro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoSeguro;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoSeguro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoSeguro;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoSeguro;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoSeguro;
	public JLabel jLabelIdTipoSeguro;
	public JLabel jLabelidTipoSeguro;
	public JButton jButtonidTipoSeguroBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoSeguro;
	public JLabel jLabelcodigoTipoSeguro;
	public JTextField jTextFieldcodigoTipoSeguro;
	public JButton jButtoncodigoTipoSeguroBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoSeguro;
	public JLabel jLabelnombreTipoSeguro;
	public JTextArea jTextAreanombreTipoSeguro;
	public JScrollPane jscrollPanenombreTipoSeguro;
	public JButton jButtonnombreTipoSeguroBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoSeguro;
	public JLabel jLabelid_empresaTipoSeguro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoSeguro;
	public JButton jButtonid_empresaTipoSeguro= new JButtonMe();
	public JButton jButtonid_empresaTipoSeguroUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoSeguroBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoSeguro;
	
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
	
	public TipoSeguroDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoSeguro=new JPanel();
				this.jPanelAccionesFormularioTipoSeguro=new JPanel();
				this.jmenuBarDetalleTipoSeguro=new JMenuBar();
				this.jTtoolBarDetalleTipoSeguro=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSeguroDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoSeguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoSeguroDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoSeguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSeguroDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSeguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSeguroDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSeguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSeguroDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoSeguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoSeguro() {
		return this.jButtonActualizarToolBarTipoSeguro;
	}
	
	public JButton getjButtonEliminarToolBarTipoSeguro() {
		return this.jButtonEliminarToolBarTipoSeguro;
	}
	
	public JButton getjButtonCancelarToolBarTipoSeguro() {
		return this.jButtonCancelarToolBarTipoSeguro;
	}		
	
	public JButton getjButtonProcesarInformacionTipoSeguro() {
		return this.jButtonProcesarInformacionTipoSeguro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoSeguro)	{
		this.jButtonProcesarInformacionTipoSeguro = jButtonProcesarInformacionTipoSeguro;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoSeguro() {
		return this.jComboBoxTiposAccionesTipoSeguro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoSeguro(
			JComboBox jComboBoxTiposRelacionesTipoSeguro) {
		this.jComboBoxTiposRelacionesTipoSeguro = jComboBoxTiposRelacionesTipoSeguro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoSeguro(
			JComboBox jComboBoxTiposAccionesTipoSeguro) {
		this.jComboBoxTiposAccionesTipoSeguro = jComboBoxTiposAccionesTipoSeguro;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoSeguro() {
		return this.jComboBoxTiposAccionesFormularioTipoSeguro;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoSeguro(
			JComboBox jComboBoxTiposAccionesFormularioTipoSeguro) {
		this.jComboBoxTiposAccionesFormularioTipoSeguro = jComboBoxTiposAccionesFormularioTipoSeguro;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiposeguroSessionBean=new TipoSeguroSessionBean();
		
		this.tiposeguroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposeguroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposeguroSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoSeguroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoSeguroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoSeguroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Seguro MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoSeguroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoSeguro= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoSeguro=new JButtonMe();
				this.jButtonModificarToolBarTipoSeguro=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoSeguro,this.jTtoolBarDetalleTipoSeguro,
							"actualizar","actualizar","Actualizar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoSeguro,this.jTtoolBarDetalleTipoSeguro,
							"eliminar","eliminar","Eliminar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoSeguro,this.jTtoolBarDetalleTipoSeguro,
							"cancelar","cancelar","Cancelar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoSeguro,this.jTtoolBarDetalleTipoSeguro,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoSeguro=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoSeguro=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoSeguro=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoSeguro=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoSeguro=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoSeguro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoSeguro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoSeguro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoSeguro= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoSeguro.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoSeguro,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoSeguro= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoSeguro.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoSeguro,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoSeguro= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoSeguro.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoSeguro,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoSeguro= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoSeguro.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoSeguro,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoSeguro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoSeguro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoSeguro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoSeguro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoSeguro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoSeguro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoSeguro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoSeguro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoSeguro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoSeguro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoSeguro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoSeguro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoSeguro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoSeguro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoSeguro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoSeguro.add(this.jMenuItemDetalleCerrarTipoSeguro);
		
		this.jmenuDetalleAccionesTipoSeguro.add(this.jMenuItemActualizarTipoSeguro);
		this.jmenuDetalleAccionesTipoSeguro.add(this.jMenuItemEliminarTipoSeguro);
		this.jmenuDetalleAccionesTipoSeguro.add(this.jMenuItemCancelarTipoSeguro);		
		
		//this.jmenuDetalleDatosTipoSeguro.add(this.jMenuItemDetalleAbrirOrderByTipoSeguro);				
		this.jmenuDetalleDatosTipoSeguro.add(this.jMenuItemDetalleMostarOcultarTipoSeguro);				
				
		//this.jmenuDetalleAccionesTipoSeguro.add(this.jMenuItemGuardarCambiosTipoSeguro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoSeguro.add(this.jmenuDetalleArchivoTipoSeguro);		
		this.jmenuBarDetalleTipoSeguro.add(this.jmenuDetalleAccionesTipoSeguro);		
		this.jmenuBarDetalleTipoSeguro.add(this.jmenuDetalleDatosTipoSeguro);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoSeguro);				
	}
	
	
	public void inicializarElementosCamposTipoSeguro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoSeguro = new JLabelMe();
		jLabelIdTipoSeguro.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoSeguro = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoSeguro.setToolTipText(TipoSeguroConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoSeguro= new GridBagLayout();

		this.jPanelidTipoSeguro.setLayout(this.gridaBagLayoutTipoSeguro);

		jLabelidTipoSeguro = new JLabel();
		jLabelidTipoSeguro.setText("Id");

		jLabelidTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoSeguro = new JLabelMe();
		this.jLabelcodigoTipoSeguro.setText(""+TipoSeguroConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoSeguro.setToolTipText("Codigo");
		this.jLabelcodigoTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoSeguro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoSeguro.setToolTipText(TipoSeguroConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoSeguro = new GridBagLayout();
		this.jPanelcodigoTipoSeguro.setLayout(this.gridaBagLayoutTipoSeguro);


		jTextFieldcodigoTipoSeguro= new JTextFieldMe();

		jTextFieldcodigoTipoSeguro.setEnabled(false);
		jTextFieldcodigoTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoSeguroBusqueda= new JButtonMe();
		this.jButtoncodigoTipoSeguroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoSeguroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoSeguroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoSeguroBusqueda.setText("U");
		this.jButtoncodigoTipoSeguroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoSeguroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoSeguroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoSeguroBusqueda"));

		if(this.tiposeguroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoSeguroBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoSeguro = new JLabelMe();
		this.jLabelnombreTipoSeguro.setText(""+TipoSeguroConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoSeguro.setToolTipText("Nombre");
		this.jLabelnombreTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoSeguro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoSeguro.setToolTipText(TipoSeguroConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoSeguro = new GridBagLayout();
		this.jPanelnombreTipoSeguro.setLayout(this.gridaBagLayoutTipoSeguro);


		jTextAreanombreTipoSeguro= new JTextAreaMe();
		jTextAreanombreTipoSeguro.setEnabled(false);
		jTextAreanombreTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSeguro.setLineWrap(true);
		jTextAreanombreTipoSeguro.setWrapStyleWord(true);
		jTextAreanombreTipoSeguro.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoSeguro.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoSeguro = new JScrollPane(jTextAreanombreTipoSeguro);
		jscrollPanenombreTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoSeguroBusqueda= new JButtonMe();
		this.jButtonnombreTipoSeguroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoSeguroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoSeguroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoSeguroBusqueda.setText("U");
		this.jButtonnombreTipoSeguroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoSeguroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoSeguroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoSeguroBusqueda"));

		if(this.tiposeguroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoSeguroBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoSeguro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoSeguro = new JLabelMe();
		this.jLabelid_empresaTipoSeguro.setText(""+TipoSeguroConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoSeguro.setToolTipText("Empresa");
		this.jLabelid_empresaTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoSeguro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoSeguro.setToolTipText(TipoSeguroConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoSeguro = new GridBagLayout();
		this.jPanelid_empresaTipoSeguro.setLayout(this.gridaBagLayoutTipoSeguro);


		jComboBoxid_empresaTipoSeguro= new JComboBoxMe();
		jComboBoxid_empresaTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoSeguro.setEnabled(false);

		this.jButtonid_empresaTipoSeguro= new JButtonMe();
		this.jButtonid_empresaTipoSeguro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSeguro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSeguro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSeguro.setText("Buscar");
		this.jButtonid_empresaTipoSeguro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoSeguro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSeguro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSeguro"));

		this.jButtonid_empresaTipoSeguroBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoSeguroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSeguroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSeguroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoSeguroBusqueda.setText("U");
		this.jButtonid_empresaTipoSeguroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoSeguroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSeguroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSeguroBusqueda"));

		if(this.tiposeguroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoSeguroBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoSeguroUpdate= new JButtonMe();
		this.jButtonid_empresaTipoSeguroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSeguroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSeguroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoSeguroUpdate.setText("U");
		this.jButtonid_empresaTipoSeguroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoSeguroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSeguroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSeguroUpdate"));



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
		//this.jInternalFrameDetalleTipoSeguro = new TipoSeguroBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Seguro DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoSeguro= new GridBagLayout();
		

		
		String sToolTipTipoSeguro="";
		sToolTipTipoSeguro=TipoSeguroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoSeguro+="(Nomina.TipoSeguro)";
		}
		
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoSeguro+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoSeguro = new JButtonMe();
		this.jButtonModificarTipoSeguro = new JButtonMe();
        this.jButtonActualizarTipoSeguro = new JButtonMe();
        this.jButtonEliminarTipoSeguro = new JButtonMe();
        this.jButtonCancelarTipoSeguro = new JButtonMe();
        this.jButtonGuardarCambiosTipoSeguro = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoSeguro = new JButtonMe();
		this.jButtonCerrarTipoSeguro = new JButtonMe();
		
		this.jScrollPanelDatosTipoSeguro = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoSeguro = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoSeguro = new JScrollPane();
				
		
		
		this.jPanelCamposTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Seguro";
		
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Seguros" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoSeguro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoSeguro.setName("jPanelCamposTipoSeguro"); 

		this.jPanelCamposOcultosTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoSeguro.setName("jPanelCamposOcultosTipoSeguro"); 

        this.jPanelAccionesTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoSeguro.setToolTipText("Acciones");
        this.jPanelAccionesTipoSeguro.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoSeguro.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoSeguro.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoSeguro.setText("Nuevo");
		this.jButtonModificarTipoSeguro.setText("Editar");
        this.jButtonActualizarTipoSeguro.setText("Actualizar");
        this.jButtonEliminarTipoSeguro.setText("Eliminar");
        this.jButtonCancelarTipoSeguro.setText("Cancelar");
        this.jButtonGuardarCambiosTipoSeguro.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoSeguro.setText("Guardar");
		this.jButtonCerrarTipoSeguro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoSeguro,"nuevo_button","Nuevo",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoSeguro,"modificar_button","Editar",this.tiposeguroSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoSeguro,"actualizar_button","Actualizar",this.tiposeguroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoSeguro,"eliminar_button","Eliminar",this.tiposeguroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoSeguro,"cancelar_button","Cancelar",this.tiposeguroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoSeguro,"guardarcambios_button","Guardar",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoSeguro,"guardarcambiostabla_button","Guardar",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoSeguro,"cerrar_button","Salir",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoSeguro.setToolTipText("Nuevo"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoSeguro.setToolTipText("Editar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoSeguro.setToolTipText("Actualizar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoSeguro.setToolTipText("Eliminar)"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoSeguro.setToolTipText("Cancelar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoSeguro.setToolTipText("Guardar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoSeguro.setToolTipText("Guardar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoSeguro.setToolTipText("Salir"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoSeguro";
		inputMap = this.jButtonNuevoTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoSeguro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoSeguro"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoSeguro";
		inputMap = this.jButtonActualizarTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoSeguro"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoSeguro";
		inputMap = this.jButtonEliminarTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoSeguro"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoSeguro";
		inputMap = this.jButtonCancelarTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoSeguro"));
		
		//CERRAR		
		sMapKey = "CerrarTipoSeguro";
		inputMap = this.jButtonCerrarTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoSeguro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoSeguro";
		inputMap = this.jButtonGuardarCambiosTablaTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoSeguro"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoSeguro = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoSeguro.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoSeguro.setToolTipText("Nuevo TipoSeguro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoSeguro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoSeguro.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoSeguro.setToolTipText("Sin Cerrar Ventana TipoSeguro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoSeguro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoSeguro.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoSeguro.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoSeguro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoSeguro.setText("Accion");
		this.jComboBoxTiposAccionesTipoSeguro.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoSeguro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoSeguro.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoSeguro.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoSeguro = new JLabelMe();
		
		this.jLabelAccionesTipoSeguro.setText("Acciones");		
		this.jLabelAccionesTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoSeguro();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoSeguro();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoSeguro=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoSeguro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSeguro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSeguro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoSeguro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoSeguro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoSeguro.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoSeguro = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoSeguro = new GridBagLayout();
		
		this.jPanelCamposTipoSeguro.setLayout(gridaBagLayoutCamposTipoSeguro);
		this.jPanelCamposOcultosTipoSeguro.setLayout(gridaBagLayoutCamposOcultosTipoSeguro);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSeguro.gridy = 0;
	this.gridBagConstraintsTipoSeguro.gridx = 0;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoSeguro.add(jLabelIdTipoSeguro, this.gridBagConstraintsTipoSeguro);



	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSeguro.gridy = 0;
	this.gridBagConstraintsTipoSeguro.gridx = 1;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoSeguro.add(jLabelidTipoSeguro, this.gridBagConstraintsTipoSeguro);


	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSeguro.gridy = 0;
	this.gridBagConstraintsTipoSeguro.gridx = 0;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoSeguro.add(jLabelid_empresaTipoSeguro, this.gridBagConstraintsTipoSeguro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		//this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSeguro.gridy = 0;
		this.gridBagConstraintsTipoSeguro.gridx = 2;
		this.gridBagConstraintsTipoSeguro.ipadx = 0;
		this.gridBagConstraintsTipoSeguro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoSeguro.add(jButtonid_empresaTipoSeguroBusqueda, this.gridBagConstraintsTipoSeguro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		//this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSeguro.gridy = 0;
		this.gridBagConstraintsTipoSeguro.gridx = 3;
		this.gridBagConstraintsTipoSeguro.ipadx = 0;
		this.gridBagConstraintsTipoSeguro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoSeguro.add(jButtonid_empresaTipoSeguroUpdate, this.gridBagConstraintsTipoSeguro);
	}

	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSeguro.gridy = 0;
	this.gridBagConstraintsTipoSeguro.gridx = 1;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoSeguro.add(jComboBoxid_empresaTipoSeguro, this.gridBagConstraintsTipoSeguro);


	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSeguro.gridy = 0;
	this.gridBagConstraintsTipoSeguro.gridx = 0;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoSeguro.add(jLabelcodigoTipoSeguro, this.gridBagConstraintsTipoSeguro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		//this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSeguro.gridy = 0;
		this.gridBagConstraintsTipoSeguro.gridx = 2;
		this.gridBagConstraintsTipoSeguro.ipadx = 0;
		this.gridBagConstraintsTipoSeguro.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoSeguro.add(jButtoncodigoTipoSeguroBusqueda, this.gridBagConstraintsTipoSeguro);
	}

	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSeguro.gridy = 0;
	this.gridBagConstraintsTipoSeguro.gridx = 1;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoSeguro.add(jTextFieldcodigoTipoSeguro, this.gridBagConstraintsTipoSeguro);


	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSeguro.gridy = 0;
	this.gridBagConstraintsTipoSeguro.gridx = 0;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoSeguro.add(jLabelnombreTipoSeguro, this.gridBagConstraintsTipoSeguro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		//this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSeguro.gridy = 0;
		this.gridBagConstraintsTipoSeguro.gridx = 2;
		this.gridBagConstraintsTipoSeguro.ipadx = 0;
		this.gridBagConstraintsTipoSeguro.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoSeguro.add(jButtonnombreTipoSeguroBusqueda, this.gridBagConstraintsTipoSeguro);
	}

	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSeguro.gridy = 0;
	this.gridBagConstraintsTipoSeguro.gridx = 1;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoSeguro.add(jscrollPanenombreTipoSeguro, this.gridBagConstraintsTipoSeguro);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSeguro.gridy = iYPanelCamposTipoSeguro;
	this.gridBagConstraintsTipoSeguro.gridx = iXPanelCamposTipoSeguro++;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSeguro.add(this.jPanelidTipoSeguro, this.gridBagConstraintsTipoSeguro);



	if(iXPanelCamposTipoSeguro % 1==0) {
		iXPanelCamposTipoSeguro=0;
		iYPanelCamposTipoSeguro++;
	}
	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSeguro.gridy = iYPanelCamposTipoSeguro;
	this.gridBagConstraintsTipoSeguro.gridx = iXPanelCamposTipoSeguro++;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSeguro.add(this.jPanelcodigoTipoSeguro, this.gridBagConstraintsTipoSeguro);



	if(iXPanelCamposTipoSeguro % 1==0) {
		iXPanelCamposTipoSeguro=0;
		iYPanelCamposTipoSeguro++;
	}
	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSeguro.gridy = iYPanelCamposTipoSeguro;
	this.gridBagConstraintsTipoSeguro.gridx = iXPanelCamposTipoSeguro++;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSeguro.add(this.jPanelnombreTipoSeguro, this.gridBagConstraintsTipoSeguro);



	if(iXPanelCamposTipoSeguro % 1==0) {
		iXPanelCamposTipoSeguro=0;
		iYPanelCamposTipoSeguro++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSeguro.gridy = iYPanelCamposOcultosTipoSeguro;
	this.gridBagConstraintsTipoSeguro.gridx = iXPanelCamposOcultosTipoSeguro++;
	this.gridBagConstraintsTipoSeguro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoSeguro.add(this.jPanelid_empresaTipoSeguro, this.gridBagConstraintsTipoSeguro);



	if(iXPanelCamposOcultosTipoSeguro % 1==0) {
		iXPanelCamposOcultosTipoSeguro=0;
		iYPanelCamposOcultosTipoSeguro++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoSeguro= new GridBagLayout();
		this.jPanelAccionesTipoSeguro.setLayout(gridaBagLayoutAccionesTipoSeguro);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoSeguro= new GridBagLayout();
		this.jPanelAccionesFormularioTipoSeguro.setLayout(gridaBagLayoutAccionesFormularioTipoSeguro);
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoSeguro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoSeguro.add(this.jComboBoxTiposAccionesFormularioTipoSeguro, this.gridBagConstraintsTipoSeguro);

		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoSeguro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoSeguro.add(this.jCheckBoxPostAccionNuevoTipoSeguro, this.gridBagConstraintsTipoSeguro);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiposeguroSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoSeguro.add(this.jCheckBoxPostAccionSinCerrarTipoSeguro, this.gridBagConstraintsTipoSeguro);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiposeguroSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoSeguro.add(this.jCheckBoxPostAccionSinMensajeTipoSeguro, this.gridBagConstraintsTipoSeguro);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = 0;
		this.gridBagConstraintsTipoSeguro.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoSeguro.add(this.jButtonModificarTipoSeguro, this.gridBagConstraintsTipoSeguro);							

		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = 0;
		this.gridBagConstraintsTipoSeguro.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoSeguro.add(this.jButtonEliminarTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
			
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = 0;		
		this.gridBagConstraintsTipoSeguro.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoSeguro.add(this.jButtonActualizarTipoSeguro, this.gridBagConstraintsTipoSeguro);


		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = 0;		
		this.gridBagConstraintsTipoSeguro.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoSeguro.add(this.jButtonGuardarCambiosTipoSeguro, this.gridBagConstraintsTipoSeguro);	
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = 0;		
		this.gridBagConstraintsTipoSeguro.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoSeguro.add(this.jButtonCancelarTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoSeguro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoSeguro);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();						
			this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSeguro.gridx = 0;		
			//this.gridBagConstraintsTipoSeguro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoSeguro.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoSeguro.gridx =0;
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoSeguro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoSeguro, this.gridBagConstraintsTipoSeguro);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoSeguroJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoSeguro = new TipoSeguroBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Seguro DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Seguro DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Seguro Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoSeguroModel tiposeguroModel=new TipoSeguroModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoSeguroModel.TipoSeguroFocusTraversalPolicy tiposeguroFocusTraversalPolicy = tiposeguroModel.new TipoSeguroFocusTraversalPolicy(this);
			
			//tiposeguroFocusTraversalPolicy.settiposeguroJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiposeguroModel);
			
			
			this.jContentPaneDetalleTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoSeguro = new GridBagLayout();	
			this.jContentPaneDetalleTipoSeguro.setLayout(gridaBagLayoutDetalleTipoSeguro);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoSeguro = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
				this.gridBagConstraintsTipoSeguro.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoSeguro.gridx = 0;
					
				
				this.jContentPaneDetalleTipoSeguro.add(jTtoolBarDetalleTipoSeguro, gridBagConstraintsTipoSeguro);								
				
}
			
			this.jScrollPanelDatosEdicionTipoSeguro=   new JScrollPane(jContentPaneDetalleTipoSeguro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoSeguro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSeguro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSeguro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoSeguro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoSeguro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSeguro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSeguro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoSeguro.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoSeguro.gridx = 0;
	        
			this.jContentPaneDetalleTipoSeguro.add(jPanelCamposTipoSeguro, gridBagConstraintsTipoSeguro);
			
			
			
			
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
						&& tiposeguroSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tiposeguroSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoSeguro= new GridBagConstraints();
						this.gridBagConstraintsTipoSeguro.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoSeguro.gridx = 0;
						this.jContentPaneDetalleTipoSeguro.add(this.jTabbedPaneRelacionesTipoSeguro, this.gridBagConstraintsTipoSeguro);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoSeguro.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoSeguro.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
					this.gridBagConstraintsTipoSeguro.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoSeguro.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoSeguro.gridx = 0;
					
				
					this.jContentPaneDetalleTipoSeguro.add(jPanelCamposOcultosTipoSeguro, gridBagConstraintsTipoSeguro);
				
					this.jPanelCamposOcultosTipoSeguro.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoSeguro.gridx = 0;
	        this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoSeguro.add(this.jPanelAccionesFormularioTipoSeguro, this.gridBagConstraintsTipoSeguro);							
			
			
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
	        this.gridBagConstraintsTipoSeguro.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoSeguro.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoSeguro.add(this.jPanelAccionesTipoSeguro, this.gridBagConstraintsTipoSeguro);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoSeguro);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoSeguro=   new JScrollPane(this.jPanelCamposTipoSeguro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoSeguro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSeguro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSeguro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoSeguro.gridx = 0;
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoSeguro.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoSeguro, this.gridBagConstraintsTipoSeguro);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoSeguro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoSeguro, this.gridBagConstraintsTipoSeguro);			
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoSeguro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoSeguro, this.gridBagConstraintsTipoSeguro);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSeguro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoSeguro, this.gridBagConstraintsTipoSeguro);
			
			
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSeguro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
			
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoSeguro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoSeguro, this.gridBagConstraintsTipoSeguro);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoSeguro;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoSeguro;
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
