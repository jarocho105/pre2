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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoDocumentoGeneralConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoDocumentoGeneralDetalleFormJInternalFrame extends TipoDocumentoGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDocumentoGeneral;
	
	protected JMenuBar jmenuBarDetalleTipoDocumentoGeneral;
	
	protected JMenu jmenuDetalleTipoDocumentoGeneral;
	protected JMenu jmenuDetalleArchivoTipoDocumentoGeneral;
	protected JMenu jmenuDetalleAccionesTipoDocumentoGeneral;
	protected JMenu jmenuDetalleDatosTipoDocumentoGeneral;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDocumentoGeneral;	
	protected GridBagConstraints gridBagConstraintsTipoDocumentoGeneral;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDocumentoGeneralBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDocumentoGeneral;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean;
	
	
	
		
	
	public TipoDocumentoGeneralLogic tipodocumentogeneralLogic;
	
	public JScrollPane jScrollPanelDatosTipoDocumentoGeneral;
	public JScrollPane jScrollPanelDatosEdicionTipoDocumentoGeneral;
	public JScrollPane jScrollPanelDatosGeneralTipoDocumentoGeneral;
	
	protected JPanel jPanelCamposTipoDocumentoGeneral;    
	protected JPanel jPanelCamposOcultosTipoDocumentoGeneral;    	
	protected JPanel jPanelAccionesTipoDocumentoGeneral;
	protected JPanel jPanelAccionesFormularioTipoDocumentoGeneral;
    
	
	
	protected Integer iXPanelCamposTipoDocumentoGeneral=0;
	protected Integer iYPanelCamposTipoDocumentoGeneral=0;
	
	protected Integer iXPanelCamposOcultosTipoDocumentoGeneral=0;
	protected Integer iYPanelCamposOcultosTipoDocumentoGeneral=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDocumentoGeneral;
	public JButton jButtonModificarTipoDocumentoGeneral;
	public JButton jButtonActualizarTipoDocumentoGeneral;
    public JButton jButtonEliminarTipoDocumentoGeneral;
	public JButton jButtonCancelarTipoDocumentoGeneral;
    public JButton jButtonGuardarCambiosTipoDocumentoGeneral;
	public JButton jButtonGuardarCambiosTablaTipoDocumentoGeneral;
	protected JButton jButtonCerrarTipoDocumentoGeneral;
	
	
	protected JButton jButtonProcesarInformacionTipoDocumentoGeneral;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDocumentoGeneral;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDocumentoGeneral;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDocumentoGeneral;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDocumentoGeneral;
	protected JButton jButtonModificarToolBarTipoDocumentoGeneral;
	protected JButton jButtonActualizarToolBarTipoDocumentoGeneral;
    protected JButton jButtonEliminarToolBarTipoDocumentoGeneral;
	protected JButton jButtonCancelarToolBarTipoDocumentoGeneral;
    protected JButton jButtonGuardarCambiosToolBarTipoDocumentoGeneral;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDocumentoGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDocumentoGeneral;
	protected JButton jButtonCerrarToolBarTipoDocumentoGeneral;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDocumentoGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDocumentoGeneral;
	protected JMenuItem jMenuItemModificarTipoDocumentoGeneral;
	protected JMenuItem jMenuItemActualizarTipoDocumentoGeneral;
    protected JMenuItem jMenuItemEliminarTipoDocumentoGeneral;
	protected JMenuItem jMenuItemCancelarTipoDocumentoGeneral;
    protected JMenuItem jMenuItemGuardarCambiosTipoDocumentoGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDocumentoGeneral;
	protected JMenuItem jMenuItemCerrarTipoDocumentoGeneral;
	protected JMenuItem jMenuItemDetalleCerrarTipoDocumentoGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDocumentoGeneral;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDocumentoGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDocumentoGeneral;
	protected JMenuItem jMenuItemMostrarOcultarTipoDocumentoGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDocumentoGeneral;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDocumentoGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDocumentoGeneral;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDocumentoGeneral;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDocumentoGeneral;
	public JLabel jLabelIdTipoDocumentoGeneral;
	public JTextFieldMe jTextFieldidTipoDocumentoGeneral;
	public JButton jButtonidTipoDocumentoGeneralBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDocumentoGeneral;
	public JLabel jLabelcodigoTipoDocumentoGeneral;
	public JTextField jTextFieldcodigoTipoDocumentoGeneral;
	public JButton jButtoncodigoTipoDocumentoGeneralBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDocumentoGeneral;
	public JLabel jLabelnombreTipoDocumentoGeneral;
	public JTextArea jTextAreanombreTipoDocumentoGeneral;
	public JScrollPane jscrollPanenombreTipoDocumentoGeneral;
	public JButton jButtonnombreTipoDocumentoGeneralBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDocumentoGeneral;
	
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
	
	public TipoDocumentoGeneralDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDocumentoGeneral=new JPanel();
				this.jPanelAccionesFormularioTipoDocumentoGeneral=new JPanel();
				this.jmenuBarDetalleTipoDocumentoGeneral=new JMenuBar();
				this.jTtoolBarDetalleTipoDocumentoGeneral=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoGeneralDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDocumentoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDocumentoGeneralDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDocumentoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoGeneralDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumentoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoGeneralDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumentoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoGeneralDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDocumentoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDocumentoGeneral() {
		return this.jButtonActualizarToolBarTipoDocumentoGeneral;
	}
	
	public JButton getjButtonEliminarToolBarTipoDocumentoGeneral() {
		return this.jButtonEliminarToolBarTipoDocumentoGeneral;
	}
	
	public JButton getjButtonCancelarToolBarTipoDocumentoGeneral() {
		return this.jButtonCancelarToolBarTipoDocumentoGeneral;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDocumentoGeneral() {
		return this.jButtonProcesarInformacionTipoDocumentoGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDocumentoGeneral)	{
		this.jButtonProcesarInformacionTipoDocumentoGeneral = jButtonProcesarInformacionTipoDocumentoGeneral;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDocumentoGeneral() {
		return this.jComboBoxTiposAccionesTipoDocumentoGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDocumentoGeneral(
			JComboBox jComboBoxTiposRelacionesTipoDocumentoGeneral) {
		this.jComboBoxTiposRelacionesTipoDocumentoGeneral = jComboBoxTiposRelacionesTipoDocumentoGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDocumentoGeneral(
			JComboBox jComboBoxTiposAccionesTipoDocumentoGeneral) {
		this.jComboBoxTiposAccionesTipoDocumentoGeneral = jComboBoxTiposAccionesTipoDocumentoGeneral;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDocumentoGeneral() {
		return this.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDocumentoGeneral(
			JComboBox jComboBoxTiposAccionesFormularioTipoDocumentoGeneral) {
		this.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral = jComboBoxTiposAccionesFormularioTipoDocumentoGeneral;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodocumentogeneralSessionBean=new TipoDocumentoGeneralSessionBean();
		
		this.tipodocumentogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodocumentogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDocumentoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDocumentoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDocumentoGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Documento General MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDocumentoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDocumentoGeneral= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDocumentoGeneral=new JButtonMe();
				this.jButtonModificarToolBarTipoDocumentoGeneral=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDocumentoGeneral,this.jTtoolBarDetalleTipoDocumentoGeneral,
							"actualizar","actualizar","Actualizar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDocumentoGeneral,this.jTtoolBarDetalleTipoDocumentoGeneral,
							"eliminar","eliminar","Eliminar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDocumentoGeneral,this.jTtoolBarDetalleTipoDocumentoGeneral,
							"cancelar","cancelar","Cancelar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDocumentoGeneral,this.jTtoolBarDetalleTipoDocumentoGeneral,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDocumentoGeneral=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDocumentoGeneral=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDocumentoGeneral=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDocumentoGeneral=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDocumentoGeneral=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDocumentoGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDocumentoGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDocumentoGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDocumentoGeneral= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDocumentoGeneral.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDocumentoGeneral,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDocumentoGeneral= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDocumentoGeneral.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDocumentoGeneral,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDocumentoGeneral= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDocumentoGeneral.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDocumentoGeneral,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDocumentoGeneral= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDocumentoGeneral.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDocumentoGeneral,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDocumentoGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDocumentoGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDocumentoGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDocumentoGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDocumentoGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDocumentoGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDocumentoGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDocumentoGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDocumentoGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDocumentoGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDocumentoGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDocumentoGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDocumentoGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDocumentoGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDocumentoGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDocumentoGeneral.add(this.jMenuItemDetalleCerrarTipoDocumentoGeneral);
		
		this.jmenuDetalleAccionesTipoDocumentoGeneral.add(this.jMenuItemActualizarTipoDocumentoGeneral);
		this.jmenuDetalleAccionesTipoDocumentoGeneral.add(this.jMenuItemEliminarTipoDocumentoGeneral);
		this.jmenuDetalleAccionesTipoDocumentoGeneral.add(this.jMenuItemCancelarTipoDocumentoGeneral);		
		
		//this.jmenuDetalleDatosTipoDocumentoGeneral.add(this.jMenuItemDetalleAbrirOrderByTipoDocumentoGeneral);				
		this.jmenuDetalleDatosTipoDocumentoGeneral.add(this.jMenuItemDetalleMostarOcultarTipoDocumentoGeneral);				
				
		//this.jmenuDetalleAccionesTipoDocumentoGeneral.add(this.jMenuItemGuardarCambiosTipoDocumentoGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDocumentoGeneral.add(this.jmenuDetalleArchivoTipoDocumentoGeneral);		
		this.jmenuBarDetalleTipoDocumentoGeneral.add(this.jmenuDetalleAccionesTipoDocumentoGeneral);		
		this.jmenuBarDetalleTipoDocumentoGeneral.add(this.jmenuDetalleDatosTipoDocumentoGeneral);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDocumentoGeneral);				
	}
	
	
	public void inicializarElementosCamposTipoDocumentoGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDocumentoGeneral = new JLabelMe();
		jLabelIdTipoDocumentoGeneral.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDocumentoGeneral = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDocumentoGeneral.setToolTipText(TipoDocumentoGeneralConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDocumentoGeneral= new GridBagLayout();

		this.jPanelidTipoDocumentoGeneral.setLayout(this.gridaBagLayoutTipoDocumentoGeneral);

		jTextFieldidTipoDocumentoGeneral = new JTextFieldMe();
		jTextFieldidTipoDocumentoGeneral.setText("Id");

		jTextFieldidTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDocumentoGeneral = new JLabelMe();
		this.jLabelcodigoTipoDocumentoGeneral.setText(""+TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDocumentoGeneral.setToolTipText("Codigo");
		this.jLabelcodigoTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDocumentoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDocumentoGeneral.setToolTipText(TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDocumentoGeneral = new GridBagLayout();
		this.jPanelcodigoTipoDocumentoGeneral.setLayout(this.gridaBagLayoutTipoDocumentoGeneral);


		jTextFieldcodigoTipoDocumentoGeneral= new JTextFieldMe();

		jTextFieldcodigoTipoDocumentoGeneral.setEnabled(false);
		jTextFieldcodigoTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDocumentoGeneralBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDocumentoGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDocumentoGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDocumentoGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDocumentoGeneralBusqueda.setText("U");
		this.jButtoncodigoTipoDocumentoGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDocumentoGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDocumentoGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDocumentoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDocumentoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDocumentoGeneralBusqueda"));

		if(this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDocumentoGeneralBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDocumentoGeneral = new JLabelMe();
		this.jLabelnombreTipoDocumentoGeneral.setText(""+TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDocumentoGeneral.setToolTipText("Nombre");
		this.jLabelnombreTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDocumentoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDocumentoGeneral.setToolTipText(TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDocumentoGeneral = new GridBagLayout();
		this.jPanelnombreTipoDocumentoGeneral.setLayout(this.gridaBagLayoutTipoDocumentoGeneral);


		jTextAreanombreTipoDocumentoGeneral= new JTextAreaMe();
		jTextAreanombreTipoDocumentoGeneral.setEnabled(false);
		jTextAreanombreTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDocumentoGeneral.setLineWrap(true);
		jTextAreanombreTipoDocumentoGeneral.setWrapStyleWord(true);
		jTextAreanombreTipoDocumentoGeneral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDocumentoGeneral.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDocumentoGeneral = new JScrollPane(jTextAreanombreTipoDocumentoGeneral);
		jscrollPanenombreTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoDocumentoGeneralBusqueda= new JButtonMe();
		this.jButtonnombreTipoDocumentoGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDocumentoGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDocumentoGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDocumentoGeneralBusqueda.setText("U");
		this.jButtonnombreTipoDocumentoGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDocumentoGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDocumentoGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDocumentoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDocumentoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDocumentoGeneralBusqueda"));

		if(this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDocumentoGeneralBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDocumentoGeneral() {
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
		//this.jInternalFrameDetalleTipoDocumentoGeneral = new TipoDocumentoGeneralBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Documento General DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDocumentoGeneral= new GridBagLayout();
		

		
		String sToolTipTipoDocumentoGeneral="";
		sToolTipTipoDocumentoGeneral=TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDocumentoGeneral+="(Facturacion.TipoDocumentoGeneral)";
		}
		
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDocumentoGeneral+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDocumentoGeneral = new JButtonMe();
		this.jButtonModificarTipoDocumentoGeneral = new JButtonMe();
        this.jButtonActualizarTipoDocumentoGeneral = new JButtonMe();
        this.jButtonEliminarTipoDocumentoGeneral = new JButtonMe();
        this.jButtonCancelarTipoDocumentoGeneral = new JButtonMe();
        this.jButtonGuardarCambiosTipoDocumentoGeneral = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral = new JButtonMe();
		this.jButtonCerrarTipoDocumentoGeneral = new JButtonMe();
		
		this.jScrollPanelDatosTipoDocumentoGeneral = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDocumentoGeneral = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDocumentoGeneral = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Documento General";
		
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Generals" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDocumentoGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDocumentoGeneral.setName("jPanelCamposTipoDocumentoGeneral"); 

		this.jPanelCamposOcultosTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDocumentoGeneral.setName("jPanelCamposOcultosTipoDocumentoGeneral"); 

        this.jPanelAccionesTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDocumentoGeneral.setToolTipText("Acciones");
        this.jPanelAccionesTipoDocumentoGeneral.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDocumentoGeneral.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDocumentoGeneral.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDocumentoGeneral.setText("Nuevo");
		this.jButtonModificarTipoDocumentoGeneral.setText("Editar");
        this.jButtonActualizarTipoDocumentoGeneral.setText("Actualizar");
        this.jButtonEliminarTipoDocumentoGeneral.setText("Eliminar");
        this.jButtonCancelarTipoDocumentoGeneral.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDocumentoGeneral.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.setText("Guardar");
		this.jButtonCerrarTipoDocumentoGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDocumentoGeneral,"nuevo_button","Nuevo",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDocumentoGeneral,"modificar_button","Editar",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDocumentoGeneral,"actualizar_button","Actualizar",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDocumentoGeneral,"eliminar_button","Eliminar",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDocumentoGeneral,"cancelar_button","Cancelar",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDocumentoGeneral,"guardarcambios_button","Guardar",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDocumentoGeneral,"guardarcambiostabla_button","Guardar",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDocumentoGeneral,"cerrar_button","Salir",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDocumentoGeneral.setToolTipText("Nuevo"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDocumentoGeneral.setToolTipText("Editar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDocumentoGeneral.setToolTipText("Actualizar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDocumentoGeneral.setToolTipText("Eliminar)"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDocumentoGeneral.setToolTipText("Cancelar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDocumentoGeneral.setToolTipText("Guardar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.setToolTipText("Guardar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDocumentoGeneral.setToolTipText("Salir"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDocumentoGeneral";
		inputMap = this.jButtonNuevoTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDocumentoGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDocumentoGeneral"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDocumentoGeneral";
		inputMap = this.jButtonActualizarTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDocumentoGeneral"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDocumentoGeneral";
		inputMap = this.jButtonEliminarTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDocumentoGeneral"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDocumentoGeneral";
		inputMap = this.jButtonCancelarTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDocumentoGeneral"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDocumentoGeneral";
		inputMap = this.jButtonCerrarTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDocumentoGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDocumentoGeneral";
		inputMap = this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDocumentoGeneral"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDocumentoGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDocumentoGeneral.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDocumentoGeneral.setToolTipText("Nuevo TipoDocumentoGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDocumentoGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDocumentoGeneral.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDocumentoGeneral.setToolTipText("Sin Cerrar Ventana TipoDocumentoGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDocumentoGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDocumentoGeneral.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDocumentoGeneral.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDocumentoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDocumentoGeneral.setText("Accion");
		this.jComboBoxTiposAccionesTipoDocumentoGeneral.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDocumentoGeneral = new JLabelMe();
		
		this.jLabelAccionesTipoDocumentoGeneral.setText("Acciones");		
		this.jLabelAccionesTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDocumentoGeneral();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDocumentoGeneral();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDocumentoGeneral=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDocumentoGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumentoGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumentoGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDocumentoGeneral = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDocumentoGeneral = new GridBagLayout();
		
		this.jPanelCamposTipoDocumentoGeneral.setLayout(gridaBagLayoutCamposTipoDocumentoGeneral);
		this.jPanelCamposOcultosTipoDocumentoGeneral.setLayout(gridaBagLayoutCamposOcultosTipoDocumentoGeneral);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDocumentoGeneral.add(jLabelIdTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);



	this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.gridx = 1;
	this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDocumentoGeneral.add(jTextFieldidTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);


	this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDocumentoGeneral.add(jLabelcodigoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 2;
		this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
		this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDocumentoGeneral.add(jButtoncodigoTipoDocumentoGeneralBusqueda, this.gridBagConstraintsTipoDocumentoGeneral);
	}

	this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.gridx = 1;
	this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDocumentoGeneral.add(jTextFieldcodigoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);


	this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDocumentoGeneral.add(jLabelnombreTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 2;
		this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
		this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDocumentoGeneral.add(jButtonnombreTipoDocumentoGeneralBusqueda, this.gridBagConstraintsTipoDocumentoGeneral);
	}

	this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.gridx = 1;
	this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDocumentoGeneral.add(jscrollPanenombreTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumentoGeneral.gridy = iYPanelCamposTipoDocumentoGeneral;
	this.gridBagConstraintsTipoDocumentoGeneral.gridx = iXPanelCamposTipoDocumentoGeneral++;
	this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumentoGeneral.add(this.jPanelidTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);



	if(iXPanelCamposTipoDocumentoGeneral % 1==0) {
		iXPanelCamposTipoDocumentoGeneral=0;
		iYPanelCamposTipoDocumentoGeneral++;
	}
	this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumentoGeneral.gridy = iYPanelCamposTipoDocumentoGeneral;
	this.gridBagConstraintsTipoDocumentoGeneral.gridx = iXPanelCamposTipoDocumentoGeneral++;
	this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumentoGeneral.add(this.jPanelcodigoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);



	if(iXPanelCamposTipoDocumentoGeneral % 1==0) {
		iXPanelCamposTipoDocumentoGeneral=0;
		iYPanelCamposTipoDocumentoGeneral++;
	}
	this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumentoGeneral.gridy = iYPanelCamposTipoDocumentoGeneral;
	this.gridBagConstraintsTipoDocumentoGeneral.gridx = iXPanelCamposTipoDocumentoGeneral++;
	this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumentoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumentoGeneral.add(this.jPanelnombreTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);



	if(iXPanelCamposTipoDocumentoGeneral % 1==0) {
		iXPanelCamposTipoDocumentoGeneral=0;
		iYPanelCamposTipoDocumentoGeneral++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDocumentoGeneral= new GridBagLayout();
		this.jPanelAccionesTipoDocumentoGeneral.setLayout(gridaBagLayoutAccionesTipoDocumentoGeneral);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDocumentoGeneral= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDocumentoGeneral.setLayout(gridaBagLayoutAccionesFormularioTipoDocumentoGeneral);
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDocumentoGeneral.add(this.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);

		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDocumentoGeneral.add(this.jCheckBoxPostAccionNuevoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodocumentogeneralSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDocumentoGeneral.add(this.jCheckBoxPostAccionSinCerrarTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodocumentogeneralSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDocumentoGeneral.add(this.jCheckBoxPostAccionSinMensajeTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDocumentoGeneral.add(this.jButtonModificarTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);							

		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDocumentoGeneral.add(this.jButtonEliminarTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
			
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDocumentoGeneral.add(this.jButtonActualizarTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);


		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDocumentoGeneral.add(this.jButtonGuardarCambiosTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);	
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDocumentoGeneral.add(this.jButtonCancelarTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDocumentoGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDocumentoGeneral);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();						
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;		
			//this.gridBagConstraintsTipoDocumentoGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx =0;
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDocumentoGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDocumentoGeneralJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDocumentoGeneral = new TipoDocumentoGeneralBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Documento General DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Documento General DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Documento General Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDocumentoGeneralModel tipodocumentogeneralModel=new TipoDocumentoGeneralModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDocumentoGeneralModel.TipoDocumentoGeneralFocusTraversalPolicy tipodocumentogeneralFocusTraversalPolicy = tipodocumentogeneralModel.new TipoDocumentoGeneralFocusTraversalPolicy(this);
			
			//tipodocumentogeneralFocusTraversalPolicy.settipodocumentogeneralJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodocumentogeneralModel);
			
			
			this.jContentPaneDetalleTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDocumentoGeneral = new GridBagLayout();	
			this.jContentPaneDetalleTipoDocumentoGeneral.setLayout(gridaBagLayoutDetalleTipoDocumentoGeneral);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDocumentoGeneral = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
				this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDocumentoGeneral.add(jTtoolBarDetalleTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDocumentoGeneral=   new JScrollPane(jContentPaneDetalleTipoDocumentoGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDocumentoGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
	        
			this.jContentPaneDetalleTipoDocumentoGeneral.add(jPanelCamposTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);
			
			
			
			
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
						&& tipodocumentogeneralSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDocumentoGeneral= new GridBagConstraints();
						this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
						this.jContentPaneDetalleTipoDocumentoGeneral.add(this.jTabbedPaneRelacionesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDocumentoGeneral.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDocumentoGeneral.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
					this.gridBagConstraintsTipoDocumentoGeneral.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDocumentoGeneral.add(jPanelCamposOcultosTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);
				
					this.jPanelCamposOcultosTipoDocumentoGeneral.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
	        this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDocumentoGeneral.add(this.jPanelAccionesFormularioTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);							
			
			
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
	        this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDocumentoGeneral.add(this.jPanelAccionesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDocumentoGeneral);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDocumentoGeneral=   new JScrollPane(this.jPanelCamposTipoDocumentoGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDocumentoGeneral.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);			
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			
			
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
			
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDocumentoGeneral;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDocumentoGeneral;
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
