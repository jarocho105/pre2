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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoMonedaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoMonedaDetalleFormJInternalFrame extends TipoMonedaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoMoneda;
	
	protected JMenuBar jmenuBarDetalleTipoMoneda;
	
	protected JMenu jmenuDetalleTipoMoneda;
	protected JMenu jmenuDetalleArchivoTipoMoneda;
	protected JMenu jmenuDetalleAccionesTipoMoneda;
	protected JMenu jmenuDetalleDatosTipoMoneda;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMoneda;	
	protected GridBagConstraints gridBagConstraintsTipoMoneda;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoMonedaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoMoneda;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoMonedaSessionBean tipomonedaSessionBean;
	
	

	public ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFrame=null;
	public ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroContabilidadDefecto=false;
	public ParametroContabilidadDefectoSessionBean parametrocontabilidaddefectoSessionBean;
	
		
	
	public TipoMonedaLogic tipomonedaLogic;
	
	public JScrollPane jScrollPanelDatosTipoMoneda;
	public JScrollPane jScrollPanelDatosEdicionTipoMoneda;
	public JScrollPane jScrollPanelDatosGeneralTipoMoneda;
	
	protected JPanel jPanelCamposTipoMoneda;    
	protected JPanel jPanelCamposOcultosTipoMoneda;    	
	protected JPanel jPanelAccionesTipoMoneda;
	protected JPanel jPanelAccionesFormularioTipoMoneda;
    
	
	
	protected Integer iXPanelCamposTipoMoneda=0;
	protected Integer iYPanelCamposTipoMoneda=0;
	
	protected Integer iXPanelCamposOcultosTipoMoneda=0;
	protected Integer iYPanelCamposOcultosTipoMoneda=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoMoneda;
	public JButton jButtonModificarTipoMoneda;
	public JButton jButtonActualizarTipoMoneda;
    public JButton jButtonEliminarTipoMoneda;
	public JButton jButtonCancelarTipoMoneda;
    public JButton jButtonGuardarCambiosTipoMoneda;
	public JButton jButtonGuardarCambiosTablaTipoMoneda;
	protected JButton jButtonCerrarTipoMoneda;
	
	
	protected JButton jButtonProcesarInformacionTipoMoneda;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoMoneda;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoMoneda;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoMoneda;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMoneda;
	protected JButton jButtonModificarToolBarTipoMoneda;
	protected JButton jButtonActualizarToolBarTipoMoneda;
    protected JButton jButtonEliminarToolBarTipoMoneda;
	protected JButton jButtonCancelarToolBarTipoMoneda;
    protected JButton jButtonGuardarCambiosToolBarTipoMoneda;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoMoneda;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMoneda;
	protected JButton jButtonCerrarToolBarTipoMoneda;
	
	protected JButton jButtonProcesarInformacionToolBarTipoMoneda;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMoneda;
	protected JMenuItem jMenuItemModificarTipoMoneda;
	protected JMenuItem jMenuItemActualizarTipoMoneda;
    protected JMenuItem jMenuItemEliminarTipoMoneda;
	protected JMenuItem jMenuItemCancelarTipoMoneda;
    protected JMenuItem jMenuItemGuardarCambiosTipoMoneda;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMoneda;
	protected JMenuItem jMenuItemCerrarTipoMoneda;
	protected JMenuItem jMenuItemDetalleCerrarTipoMoneda;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMoneda;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoMoneda;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMoneda;
	protected JMenuItem jMenuItemMostrarOcultarTipoMoneda;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMoneda;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMoneda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMoneda;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoMoneda;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoMoneda;
	public JLabel jLabelIdTipoMoneda;
	public JTextFieldMe jTextFieldidTipoMoneda;
	public JButton jButtonidTipoMonedaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoMoneda;
	public JLabel jLabelnombreTipoMoneda;
	public JTextField jTextFieldnombreTipoMoneda;
	public JButton jButtonnombreTipoMonedaBusqueda= new JButtonMe();

	public JPanel jPanelsiglaTipoMoneda;
	public JLabel jLabelsiglaTipoMoneda;
	public JTextField jTextFieldsiglaTipoMoneda;
	public JButton jButtonsiglaTipoMonedaBusqueda= new JButtonMe();

	public JPanel jPanelsimboloTipoMoneda;
	public JLabel jLabelsimboloTipoMoneda;
	public JTextField jTextFieldsimboloTipoMoneda;
	public JButton jButtonsimboloTipoMonedaBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoTipoMoneda;
	public JLabel jLabelesta_activoTipoMoneda;
	public JCheckBox jCheckBoxesta_activoTipoMoneda;
	public JButton jButtonesta_activoTipoMonedaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoMoneda;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoMonedaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoMoneda=new JPanel();
				this.jPanelAccionesFormularioTipoMoneda=new JPanel();
				this.jmenuBarDetalleTipoMoneda=new JMenuBar();
				this.jTtoolBarDetalleTipoMoneda=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMonedaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoMoneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoMonedaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoMoneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMonedaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMoneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMonedaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMoneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMonedaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMoneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoMoneda() {
		return this.jButtonActualizarToolBarTipoMoneda;
	}
	
	public JButton getjButtonEliminarToolBarTipoMoneda() {
		return this.jButtonEliminarToolBarTipoMoneda;
	}
	
	public JButton getjButtonCancelarToolBarTipoMoneda() {
		return this.jButtonCancelarToolBarTipoMoneda;
	}		
	
	public JButton getjButtonProcesarInformacionTipoMoneda() {
		return this.jButtonProcesarInformacionTipoMoneda;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMoneda)	{
		this.jButtonProcesarInformacionTipoMoneda = jButtonProcesarInformacionTipoMoneda;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMoneda() {
		return this.jComboBoxTiposAccionesTipoMoneda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMoneda(
			JComboBox jComboBoxTiposRelacionesTipoMoneda) {
		this.jComboBoxTiposRelacionesTipoMoneda = jComboBoxTiposRelacionesTipoMoneda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMoneda(
			JComboBox jComboBoxTiposAccionesTipoMoneda) {
		this.jComboBoxTiposAccionesTipoMoneda = jComboBoxTiposAccionesTipoMoneda;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoMoneda() {
		return this.jComboBoxTiposAccionesFormularioTipoMoneda;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoMoneda(
			JComboBox jComboBoxTiposAccionesFormularioTipoMoneda) {
		this.jComboBoxTiposAccionesFormularioTipoMoneda = jComboBoxTiposAccionesFormularioTipoMoneda;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipomonedaSessionBean=new TipoMonedaSessionBean();
		
		this.tipomonedaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomonedaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomonedaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMonedaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMonedaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMonedaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Moneda MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoMonedaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoMoneda= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoMoneda=new JButtonMe();
				this.jButtonModificarToolBarTipoMoneda=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoMoneda,this.jTtoolBarDetalleTipoMoneda,
							"actualizar","actualizar","Actualizar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoMoneda,this.jTtoolBarDetalleTipoMoneda,
							"eliminar","eliminar","Eliminar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoMoneda,this.jTtoolBarDetalleTipoMoneda,
							"cancelar","cancelar","Cancelar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoMoneda,this.jTtoolBarDetalleTipoMoneda,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoMoneda=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoMoneda=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoMoneda=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoMoneda=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoMoneda=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMoneda= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMoneda.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMoneda,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoMoneda= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoMoneda.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoMoneda,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoMoneda= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoMoneda.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoMoneda,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoMoneda= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoMoneda.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoMoneda,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoMoneda= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoMoneda.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoMoneda,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoMoneda= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMoneda.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMoneda,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMoneda= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMoneda.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMoneda,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoMoneda= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoMoneda.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoMoneda,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMoneda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMoneda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMoneda,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMoneda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMoneda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMoneda,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoMoneda.add(this.jMenuItemDetalleCerrarTipoMoneda);
		
		this.jmenuDetalleAccionesTipoMoneda.add(this.jMenuItemActualizarTipoMoneda);
		this.jmenuDetalleAccionesTipoMoneda.add(this.jMenuItemEliminarTipoMoneda);
		this.jmenuDetalleAccionesTipoMoneda.add(this.jMenuItemCancelarTipoMoneda);		
		
		//this.jmenuDetalleDatosTipoMoneda.add(this.jMenuItemDetalleAbrirOrderByTipoMoneda);				
		this.jmenuDetalleDatosTipoMoneda.add(this.jMenuItemDetalleMostarOcultarTipoMoneda);				
				
		//this.jmenuDetalleAccionesTipoMoneda.add(this.jMenuItemGuardarCambiosTipoMoneda);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoMoneda.add(this.jmenuDetalleArchivoTipoMoneda);		
		this.jmenuBarDetalleTipoMoneda.add(this.jmenuDetalleAccionesTipoMoneda);		
		this.jmenuBarDetalleTipoMoneda.add(this.jmenuDetalleDatosTipoMoneda);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoMoneda.add(this.jmenuDetalleTipoMoneda);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoMoneda);				
	}
	
	
	public void inicializarElementosCamposTipoMoneda() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoMoneda = new JLabelMe();
		jLabelIdTipoMoneda.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoMoneda = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoMoneda.setToolTipText(TipoMonedaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoMoneda= new GridBagLayout();

		this.jPanelidTipoMoneda.setLayout(this.gridaBagLayoutTipoMoneda);

		jTextFieldidTipoMoneda = new JTextFieldMe();
		jTextFieldidTipoMoneda.setText("Id");

		jTextFieldidTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoMoneda = new JLabelMe();
		this.jLabelnombreTipoMoneda.setText(""+TipoMonedaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoMoneda.setToolTipText("Nombre");
		this.jLabelnombreTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoMoneda.setToolTipText(TipoMonedaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoMoneda = new GridBagLayout();
		this.jPanelnombreTipoMoneda.setLayout(this.gridaBagLayoutTipoMoneda);


		jTextFieldnombreTipoMoneda= new JTextFieldMe();

		jTextFieldnombreTipoMoneda.setEnabled(false);
		jTextFieldnombreTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoMonedaBusqueda= new JButtonMe();
		this.jButtonnombreTipoMonedaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMonedaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMonedaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoMonedaBusqueda.setText("U");
		this.jButtonnombreTipoMonedaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoMonedaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoMonedaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoMonedaBusqueda"));

		if(this.tipomonedaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoMonedaBusqueda.setVisible(false);		}


					
		this.jLabelsiglaTipoMoneda = new JLabelMe();
		this.jLabelsiglaTipoMoneda.setText(""+TipoMonedaConstantesFunciones.LABEL_SIGLA+" : *");
		this.jLabelsiglaTipoMoneda.setToolTipText("Sigla");
		this.jLabelsiglaTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglaTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglaTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglaTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglaTipoMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglaTipoMoneda.setToolTipText(TipoMonedaConstantesFunciones.LABEL_SIGLA);
		this.gridaBagLayoutTipoMoneda = new GridBagLayout();
		this.jPanelsiglaTipoMoneda.setLayout(this.gridaBagLayoutTipoMoneda);


		jTextFieldsiglaTipoMoneda= new JTextFieldMe();

		jTextFieldsiglaTipoMoneda.setEnabled(false);
		jTextFieldsiglaTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglaTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglaTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglaTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglaTipoMonedaBusqueda= new JButtonMe();
		this.jButtonsiglaTipoMonedaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglaTipoMonedaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglaTipoMonedaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglaTipoMonedaBusqueda.setText("U");
		this.jButtonsiglaTipoMonedaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglaTipoMonedaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglaTipoMonedaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglaTipoMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglaTipoMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglaTipoMonedaBusqueda"));

		if(this.tipomonedaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglaTipoMonedaBusqueda.setVisible(false);		}


					
		this.jLabelsimboloTipoMoneda = new JLabelMe();
		this.jLabelsimboloTipoMoneda.setText(""+TipoMonedaConstantesFunciones.LABEL_SIMBOLO+" : *");
		this.jLabelsimboloTipoMoneda.setToolTipText("Simbolo");
		this.jLabelsimboloTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsimboloTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsimboloTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsimboloTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsimboloTipoMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsimboloTipoMoneda.setToolTipText(TipoMonedaConstantesFunciones.LABEL_SIMBOLO);
		this.gridaBagLayoutTipoMoneda = new GridBagLayout();
		this.jPanelsimboloTipoMoneda.setLayout(this.gridaBagLayoutTipoMoneda);


		jTextFieldsimboloTipoMoneda= new JTextFieldMe();

		jTextFieldsimboloTipoMoneda.setEnabled(false);
		jTextFieldsimboloTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsimboloTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsimboloTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsimboloTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsimboloTipoMonedaBusqueda= new JButtonMe();
		this.jButtonsimboloTipoMonedaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsimboloTipoMonedaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsimboloTipoMonedaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsimboloTipoMonedaBusqueda.setText("U");
		this.jButtonsimboloTipoMonedaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsimboloTipoMonedaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsimboloTipoMonedaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsimboloTipoMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsimboloTipoMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"simboloTipoMonedaBusqueda"));

		if(this.tipomonedaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsimboloTipoMonedaBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoTipoMoneda = new JLabelMe();
		this.jLabelesta_activoTipoMoneda.setText(""+TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoTipoMoneda.setToolTipText("Esta Activo");
		this.jLabelesta_activoTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoTipoMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoTipoMoneda.setToolTipText(TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutTipoMoneda = new GridBagLayout();
		this.jPanelesta_activoTipoMoneda.setLayout(this.gridaBagLayoutTipoMoneda);


		jCheckBoxesta_activoTipoMoneda= new JCheckBoxMe();
		jCheckBoxesta_activoTipoMoneda.setEnabled(false);

		jCheckBoxesta_activoTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoTipoMonedaBusqueda= new JButtonMe();
		this.jButtonesta_activoTipoMonedaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoTipoMonedaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoTipoMonedaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoTipoMonedaBusqueda.setText("U");
		this.jButtonesta_activoTipoMonedaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoTipoMonedaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoTipoMonedaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoTipoMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoTipoMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoTipoMonedaBusqueda"));

		if(this.tipomonedaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoTipoMonedaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoMoneda() {
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
		//this.jInternalFrameDetalleTipoMoneda = new TipoMonedaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Moneda DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMoneda= new GridBagLayout();
		

		
		String sToolTipTipoMoneda="";
		sToolTipTipoMoneda=TipoMonedaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMoneda+="(Contabilidad.TipoMoneda)";
		}
		
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMoneda+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoMoneda = new JButtonMe();
		this.jButtonModificarTipoMoneda = new JButtonMe();
        this.jButtonActualizarTipoMoneda = new JButtonMe();
        this.jButtonEliminarTipoMoneda = new JButtonMe();
        this.jButtonCancelarTipoMoneda = new JButtonMe();
        this.jButtonGuardarCambiosTipoMoneda = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoMoneda = new JButtonMe();
		this.jButtonCerrarTipoMoneda = new JButtonMe();
		
		this.jScrollPanelDatosTipoMoneda = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoMoneda = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoMoneda = new JScrollPane();
				
		
		
		this.jPanelCamposTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Moneda";
		
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Monedas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMoneda.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoMoneda.setName("jPanelCamposTipoMoneda"); 

		this.jPanelCamposOcultosTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoMoneda.setName("jPanelCamposOcultosTipoMoneda"); 

        this.jPanelAccionesTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMoneda.setToolTipText("Acciones");
        this.jPanelAccionesTipoMoneda.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoMoneda.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoMoneda.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoMoneda.setText("Nuevo");
		this.jButtonModificarTipoMoneda.setText("Editar");
        this.jButtonActualizarTipoMoneda.setText("Actualizar");
        this.jButtonEliminarTipoMoneda.setText("Eliminar");
        this.jButtonCancelarTipoMoneda.setText("Cancelar");
        this.jButtonGuardarCambiosTipoMoneda.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoMoneda.setText("Guardar");
		this.jButtonCerrarTipoMoneda.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMoneda,"nuevo_button","Nuevo",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoMoneda,"modificar_button","Editar",this.tipomonedaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoMoneda,"actualizar_button","Actualizar",this.tipomonedaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoMoneda,"eliminar_button","Eliminar",this.tipomonedaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoMoneda,"cancelar_button","Cancelar",this.tipomonedaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoMoneda,"guardarcambios_button","Guardar",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMoneda,"guardarcambiostabla_button","Guardar",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMoneda,"cerrar_button","Salir",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoMoneda.setToolTipText("Nuevo"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoMoneda.setToolTipText("Editar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoMoneda.setToolTipText("Actualizar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoMoneda.setToolTipText("Eliminar)"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoMoneda.setToolTipText("Cancelar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoMoneda.setToolTipText("Guardar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoMoneda.setToolTipText("Guardar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMoneda.setToolTipText("Salir"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMoneda";
		inputMap = this.jButtonNuevoTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMoneda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMoneda"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoMoneda";
		inputMap = this.jButtonActualizarTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoMoneda"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoMoneda";
		inputMap = this.jButtonEliminarTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoMoneda"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoMoneda";
		inputMap = this.jButtonCancelarTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoMoneda"));
		
		//CERRAR		
		sMapKey = "CerrarTipoMoneda";
		inputMap = this.jButtonCerrarTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMoneda"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMoneda";
		inputMap = this.jButtonGuardarCambiosTablaTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMoneda"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoMoneda = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoMoneda.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoMoneda.setToolTipText("Nuevo TipoMoneda");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoMoneda = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoMoneda.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoMoneda.setToolTipText("Sin Cerrar Ventana TipoMoneda");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoMoneda = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoMoneda.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoMoneda.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoMoneda = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMoneda.setText("Accion");
		this.jComboBoxTiposAccionesTipoMoneda.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoMoneda = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoMoneda.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoMoneda.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoMoneda = new JLabelMe();
		
		this.jLabelAccionesTipoMoneda.setText("Acciones");		
		this.jLabelAccionesTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoMoneda();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoMoneda();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoMoneda=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoMoneda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMoneda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMoneda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoMoneda.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMoneda.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMoneda.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoMoneda = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoMoneda = new GridBagLayout();
		
		this.jPanelCamposTipoMoneda.setLayout(gridaBagLayoutCamposTipoMoneda);
		this.jPanelCamposOcultosTipoMoneda.setLayout(gridaBagLayoutCamposOcultosTipoMoneda);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoneda.gridy = 0;
	this.gridBagConstraintsTipoMoneda.gridx = 0;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoMoneda.add(jLabelIdTipoMoneda, this.gridBagConstraintsTipoMoneda);



	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoneda.gridy = 0;
	this.gridBagConstraintsTipoMoneda.gridx = 1;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoMoneda.add(jTextFieldidTipoMoneda, this.gridBagConstraintsTipoMoneda);


	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoneda.gridy = 0;
	this.gridBagConstraintsTipoMoneda.gridx = 0;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoMoneda.add(jLabelnombreTipoMoneda, this.gridBagConstraintsTipoMoneda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		//this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = 0;
		this.gridBagConstraintsTipoMoneda.gridx = 2;
		this.gridBagConstraintsTipoMoneda.ipadx = 0;
		this.gridBagConstraintsTipoMoneda.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoMoneda.add(jButtonnombreTipoMonedaBusqueda, this.gridBagConstraintsTipoMoneda);
	}

	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoneda.gridy = 0;
	this.gridBagConstraintsTipoMoneda.gridx = 1;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoMoneda.add(jTextFieldnombreTipoMoneda, this.gridBagConstraintsTipoMoneda);


	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoneda.gridy = 0;
	this.gridBagConstraintsTipoMoneda.gridx = 0;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglaTipoMoneda.add(jLabelsiglaTipoMoneda, this.gridBagConstraintsTipoMoneda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		//this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = 0;
		this.gridBagConstraintsTipoMoneda.gridx = 2;
		this.gridBagConstraintsTipoMoneda.ipadx = 0;
		this.gridBagConstraintsTipoMoneda.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglaTipoMoneda.add(jButtonsiglaTipoMonedaBusqueda, this.gridBagConstraintsTipoMoneda);
	}

	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoneda.gridy = 0;
	this.gridBagConstraintsTipoMoneda.gridx = 1;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglaTipoMoneda.add(jTextFieldsiglaTipoMoneda, this.gridBagConstraintsTipoMoneda);


	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoneda.gridy = 0;
	this.gridBagConstraintsTipoMoneda.gridx = 0;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsimboloTipoMoneda.add(jLabelsimboloTipoMoneda, this.gridBagConstraintsTipoMoneda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		//this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = 0;
		this.gridBagConstraintsTipoMoneda.gridx = 2;
		this.gridBagConstraintsTipoMoneda.ipadx = 0;
		this.gridBagConstraintsTipoMoneda.insets = new Insets(0, 0, 0, 0);
		this.jPanelsimboloTipoMoneda.add(jButtonsimboloTipoMonedaBusqueda, this.gridBagConstraintsTipoMoneda);
	}

	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoneda.gridy = 0;
	this.gridBagConstraintsTipoMoneda.gridx = 1;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsimboloTipoMoneda.add(jTextFieldsimboloTipoMoneda, this.gridBagConstraintsTipoMoneda);


	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoneda.gridy = 0;
	this.gridBagConstraintsTipoMoneda.gridx = 0;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoTipoMoneda.add(jLabelesta_activoTipoMoneda, this.gridBagConstraintsTipoMoneda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		//this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = 0;
		this.gridBagConstraintsTipoMoneda.gridx = 2;
		this.gridBagConstraintsTipoMoneda.ipadx = 0;
		this.gridBagConstraintsTipoMoneda.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoTipoMoneda.add(jButtonesta_activoTipoMonedaBusqueda, this.gridBagConstraintsTipoMoneda);
	}

	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoneda.gridy = 0;
	this.gridBagConstraintsTipoMoneda.gridx = 1;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoTipoMoneda.add(jCheckBoxesta_activoTipoMoneda, this.gridBagConstraintsTipoMoneda);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMoneda.gridy = iYPanelCamposTipoMoneda;
	this.gridBagConstraintsTipoMoneda.gridx = iXPanelCamposTipoMoneda++;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMoneda.add(this.jPanelidTipoMoneda, this.gridBagConstraintsTipoMoneda);



	if(iXPanelCamposTipoMoneda % 1==0) {
		iXPanelCamposTipoMoneda=0;
		iYPanelCamposTipoMoneda++;
	}
	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMoneda.gridy = iYPanelCamposTipoMoneda;
	this.gridBagConstraintsTipoMoneda.gridx = iXPanelCamposTipoMoneda++;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMoneda.add(this.jPanelnombreTipoMoneda, this.gridBagConstraintsTipoMoneda);



	if(iXPanelCamposTipoMoneda % 1==0) {
		iXPanelCamposTipoMoneda=0;
		iYPanelCamposTipoMoneda++;
	}
	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMoneda.gridy = iYPanelCamposTipoMoneda;
	this.gridBagConstraintsTipoMoneda.gridx = iXPanelCamposTipoMoneda++;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMoneda.add(this.jPanelsiglaTipoMoneda, this.gridBagConstraintsTipoMoneda);



	if(iXPanelCamposTipoMoneda % 1==0) {
		iXPanelCamposTipoMoneda=0;
		iYPanelCamposTipoMoneda++;
	}
	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMoneda.gridy = iYPanelCamposTipoMoneda;
	this.gridBagConstraintsTipoMoneda.gridx = iXPanelCamposTipoMoneda++;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMoneda.add(this.jPanelsimboloTipoMoneda, this.gridBagConstraintsTipoMoneda);



	if(iXPanelCamposTipoMoneda % 1==0) {
		iXPanelCamposTipoMoneda=0;
		iYPanelCamposTipoMoneda++;
	}
	this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMoneda.gridy = iYPanelCamposTipoMoneda;
	this.gridBagConstraintsTipoMoneda.gridx = iXPanelCamposTipoMoneda++;
	this.gridBagConstraintsTipoMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMoneda.add(this.jPanelesta_activoTipoMoneda, this.gridBagConstraintsTipoMoneda);



	if(iXPanelCamposTipoMoneda % 1==0) {
		iXPanelCamposTipoMoneda=0;
		iYPanelCamposTipoMoneda++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoMoneda= new GridBagLayout();
		this.jPanelAccionesTipoMoneda.setLayout(gridaBagLayoutAccionesTipoMoneda);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoMoneda= new GridBagLayout();
		this.jPanelAccionesFormularioTipoMoneda.setLayout(gridaBagLayoutAccionesFormularioTipoMoneda);
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMoneda.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMoneda.add(this.jComboBoxTiposAccionesFormularioTipoMoneda, this.gridBagConstraintsTipoMoneda);

		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMoneda.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMoneda.add(this.jCheckBoxPostAccionNuevoTipoMoneda, this.gridBagConstraintsTipoMoneda);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipomonedaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMoneda.add(this.jCheckBoxPostAccionSinCerrarTipoMoneda, this.gridBagConstraintsTipoMoneda);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipomonedaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMoneda.add(this.jCheckBoxPostAccionSinMensajeTipoMoneda, this.gridBagConstraintsTipoMoneda);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = 0;
		this.gridBagConstraintsTipoMoneda.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoMoneda.add(this.jButtonModificarTipoMoneda, this.gridBagConstraintsTipoMoneda);							

		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = 0;
		this.gridBagConstraintsTipoMoneda.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoMoneda.add(this.jButtonEliminarTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
			
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = 0;		
		this.gridBagConstraintsTipoMoneda.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMoneda.add(this.jButtonActualizarTipoMoneda, this.gridBagConstraintsTipoMoneda);


		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = 0;		
		this.gridBagConstraintsTipoMoneda.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMoneda.add(this.jButtonGuardarCambiosTipoMoneda, this.gridBagConstraintsTipoMoneda);	
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = 0;		
		this.gridBagConstraintsTipoMoneda.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoMoneda.add(this.jButtonCancelarTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMoneda = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMoneda);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();						
			this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMoneda.gridx = 0;		
			//this.gridBagConstraintsTipoMoneda.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMoneda.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMoneda.gridx =0;
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMoneda.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMoneda, this.gridBagConstraintsTipoMoneda);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoMonedaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoMoneda = new TipoMonedaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Moneda DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Moneda DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Moneda Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoMonedaModel tipomonedaModel=new TipoMonedaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoMonedaModel.TipoMonedaFocusTraversalPolicy tipomonedaFocusTraversalPolicy = tipomonedaModel.new TipoMonedaFocusTraversalPolicy(this);
			
			//tipomonedaFocusTraversalPolicy.settipomonedaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipomonedaModel);
			
			
			this.jContentPaneDetalleTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoMoneda = new GridBagLayout();	
			this.jContentPaneDetalleTipoMoneda.setLayout(gridaBagLayoutDetalleTipoMoneda);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMoneda = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
				this.gridBagConstraintsTipoMoneda.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoMoneda.gridx = 0;
					
				
				this.jContentPaneDetalleTipoMoneda.add(jTtoolBarDetalleTipoMoneda, gridBagConstraintsTipoMoneda);								
				
}
			
			this.jScrollPanelDatosEdicionTipoMoneda=   new JScrollPane(jContentPaneDetalleTipoMoneda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMoneda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMoneda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMoneda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoMoneda=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMoneda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMoneda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMoneda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoMoneda.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoMoneda.gridx = 0;
	        
			this.jContentPaneDetalleTipoMoneda.add(jPanelCamposTipoMoneda, gridBagConstraintsTipoMoneda);
			
			
			
			
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
						&& tipomonedaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(this.puedeCargarPorParteParametroContabilidadDefecto,false,-1);
					
					if(this.tipomonedaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoMoneda= new GridBagConstraints();
						this.gridBagConstraintsTipoMoneda.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoMoneda.gridx = 0;
						this.jContentPaneDetalleTipoMoneda.add(this.jTabbedPaneRelacionesTipoMoneda, this.gridBagConstraintsTipoMoneda);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoMoneda.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoMoneda.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
					this.gridBagConstraintsTipoMoneda.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoMoneda.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoMoneda.gridx = 0;
					
				
					this.jContentPaneDetalleTipoMoneda.add(jPanelCamposOcultosTipoMoneda, gridBagConstraintsTipoMoneda);
				
					this.jPanelCamposOcultosTipoMoneda.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoMoneda.gridx = 0;
	        this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoMoneda.add(this.jPanelAccionesFormularioTipoMoneda, this.gridBagConstraintsTipoMoneda);							
			
			
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
	        this.gridBagConstraintsTipoMoneda.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoMoneda.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoMoneda.add(this.jPanelAccionesTipoMoneda, this.gridBagConstraintsTipoMoneda);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoMoneda);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoMoneda=   new JScrollPane(this.jPanelCamposTipoMoneda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMoneda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMoneda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMoneda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoMoneda.gridx = 0;
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoMoneda.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoMoneda, this.gridBagConstraintsTipoMoneda);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMoneda.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoMoneda, this.gridBagConstraintsTipoMoneda);			
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMoneda.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoMoneda, this.gridBagConstraintsTipoMoneda);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoneda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMoneda, this.gridBagConstraintsTipoMoneda);
			
			
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoneda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
			
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoneda.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMoneda, this.gridBagConstraintsTipoMoneda);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoMoneda;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoMoneda;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		this.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocontabilidaddefectoBeanSwingJInternalFrame=null;//new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocontabilidaddefectoBeanSwingJInternalFramePopup=new ParametroContabilidadDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoMonedaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoMonedaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocontabilidaddefectoBeanSwingJInternalFrame=new ParametroContabilidadDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocontabilidaddefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocontabilidaddefectoBeanSwingJInternalFrame.setparametrocontabilidaddefectoSessionBean(this.parametrocontabilidaddefectoSessionBean);

				//this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
				//this.gridBagConstraintsTipoMoneda.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoMoneda.gridx = 0;
				//this.jContentPaneDetalleTipoMoneda.add(this.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoMoneda);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoMoneda.add("Parametro Contabilidad Defectos",this.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoMoneda.setComponentAt(iIndexTab,this.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocontabilidaddefectoBeanSwingJInternalFrame=null;//new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroContabilidadDefecto) {
					this.jTabbedPaneRelacionesTipoMoneda.add("Parametro Contabilidad Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroContabilidadDefectoBeanSwingJInternalFrame(List<TipoMoneda> tipomonedas,TipoMoneda tipomoneda,ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocontabilidaddefectoBeanSwingJInternalFrame=new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocontabilidaddefectoBeanSwingJInternalFrame.getParametroContabilidadDefectoLogic().setConnexion(this.tipomonedaLogic.getConnexion());

					parametrocontabilidaddefectoBeanSwingJInternalFrame.settipomonedasForeignKey(tipomonedas);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.settipomonedaForeignKey(tipomoneda);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoMoneda(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setlidTipoMonedaActual(tipomoneda.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocontabilidaddefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroContabilidadDefecto(parametrocontabilidaddefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoMoneda(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setid_tipo_monedaFK_IdTipoMoneda(tipomoneda.getId());

					if(!this.conCargarFormDetalle) {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocontabilidaddefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoMonedaForeignKey(tipomoneda,1,false,true,true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocontabilidaddefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoMoneda");
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoMoneda");
					parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContabilidadDefecto(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("n",parametrocontabilidaddefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocontabilidaddefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContabilidadDefecto("relacionado");
					} else {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContabilidadDefecto("no_relacionado");
					}

					parametrocontabilidaddefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroContabilidadDefecto().setVisible(false);

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
