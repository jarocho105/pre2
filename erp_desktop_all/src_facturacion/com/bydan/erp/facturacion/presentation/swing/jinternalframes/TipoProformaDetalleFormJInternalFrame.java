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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.TipoProformaConstantesFunciones;

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
public class TipoProformaDetalleFormJInternalFrame extends TipoProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoProforma;
	
	protected JMenuBar jmenuBarDetalleTipoProforma;
	
	protected JMenu jmenuDetalleTipoProforma;
	protected JMenu jmenuDetalleArchivoTipoProforma;
	protected JMenu jmenuDetalleAccionesTipoProforma;
	protected JMenu jmenuDetalleDatosTipoProforma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProforma;	
	protected GridBagConstraints gridBagConstraintsTipoProforma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoProformaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoProforma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoProformaSessionBean tipoproformaSessionBean;
	
	

	public ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame=null;
	public ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProforma=false;
	public ProformaSessionBean proformaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoProformaLogic tipoproformaLogic;
	
	public JScrollPane jScrollPanelDatosTipoProforma;
	public JScrollPane jScrollPanelDatosEdicionTipoProforma;
	public JScrollPane jScrollPanelDatosGeneralTipoProforma;
	
	protected JPanel jPanelCamposTipoProforma;    
	protected JPanel jPanelCamposOcultosTipoProforma;    	
	protected JPanel jPanelAccionesTipoProforma;
	protected JPanel jPanelAccionesFormularioTipoProforma;
    
	
	
	protected Integer iXPanelCamposTipoProforma=0;
	protected Integer iYPanelCamposTipoProforma=0;
	
	protected Integer iXPanelCamposOcultosTipoProforma=0;
	protected Integer iYPanelCamposOcultosTipoProforma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoProforma;
	public JButton jButtonModificarTipoProforma;
	public JButton jButtonActualizarTipoProforma;
    public JButton jButtonEliminarTipoProforma;
	public JButton jButtonCancelarTipoProforma;
    public JButton jButtonGuardarCambiosTipoProforma;
	public JButton jButtonGuardarCambiosTablaTipoProforma;
	protected JButton jButtonCerrarTipoProforma;
	
	
	protected JButton jButtonProcesarInformacionTipoProforma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoProforma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoProforma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoProforma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProforma;
	protected JButton jButtonModificarToolBarTipoProforma;
	protected JButton jButtonActualizarToolBarTipoProforma;
    protected JButton jButtonEliminarToolBarTipoProforma;
	protected JButton jButtonCancelarToolBarTipoProforma;
    protected JButton jButtonGuardarCambiosToolBarTipoProforma;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProforma;
	protected JButton jButtonCerrarToolBarTipoProforma;
	
	protected JButton jButtonProcesarInformacionToolBarTipoProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProforma;
	protected JMenuItem jMenuItemModificarTipoProforma;
	protected JMenuItem jMenuItemActualizarTipoProforma;
    protected JMenuItem jMenuItemEliminarTipoProforma;
	protected JMenuItem jMenuItemCancelarTipoProforma;
    protected JMenuItem jMenuItemGuardarCambiosTipoProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProforma;
	protected JMenuItem jMenuItemCerrarTipoProforma;
	protected JMenuItem jMenuItemDetalleCerrarTipoProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProforma;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProforma;
	protected JMenuItem jMenuItemMostrarOcultarTipoProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProforma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProforma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoProforma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoProforma;
	public JLabel jLabelIdTipoProforma;
	public JLabel jLabelidTipoProforma;
	public JButton jButtonidTipoProformaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoProforma;
	public JLabel jLabelcodigoTipoProforma;
	public JTextField jTextFieldcodigoTipoProforma;
	public JButton jButtoncodigoTipoProformaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoProforma;
	public JLabel jLabelnombreTipoProforma;
	public JTextArea jTextAreanombreTipoProforma;
	public JScrollPane jscrollPanenombreTipoProforma;
	public JButton jButtonnombreTipoProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoProforma;
	public JLabel jLabelid_empresaTipoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoProforma;
	public JButton jButtonid_empresaTipoProforma= new JButtonMe();
	public JButton jButtonid_empresaTipoProformaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoProformaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoProforma;
	
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
	
	public TipoProformaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoProforma=new JPanel();
				this.jPanelAccionesFormularioTipoProforma=new JPanel();
				this.jmenuBarDetalleTipoProforma=new JMenuBar();
				this.jTtoolBarDetalleTipoProforma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProformaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoProformaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProformaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProformaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProformaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoProforma() {
		return this.jButtonActualizarToolBarTipoProforma;
	}
	
	public JButton getjButtonEliminarToolBarTipoProforma() {
		return this.jButtonEliminarToolBarTipoProforma;
	}
	
	public JButton getjButtonCancelarToolBarTipoProforma() {
		return this.jButtonCancelarToolBarTipoProforma;
	}		
	
	public JButton getjButtonProcesarInformacionTipoProforma() {
		return this.jButtonProcesarInformacionTipoProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProforma)	{
		this.jButtonProcesarInformacionTipoProforma = jButtonProcesarInformacionTipoProforma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProforma() {
		return this.jComboBoxTiposAccionesTipoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProforma(
			JComboBox jComboBoxTiposRelacionesTipoProforma) {
		this.jComboBoxTiposRelacionesTipoProforma = jComboBoxTiposRelacionesTipoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProforma(
			JComboBox jComboBoxTiposAccionesTipoProforma) {
		this.jComboBoxTiposAccionesTipoProforma = jComboBoxTiposAccionesTipoProforma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoProforma() {
		return this.jComboBoxTiposAccionesFormularioTipoProforma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoProforma(
			JComboBox jComboBoxTiposAccionesFormularioTipoProforma) {
		this.jComboBoxTiposAccionesFormularioTipoProforma = jComboBoxTiposAccionesFormularioTipoProforma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoproformaSessionBean=new TipoProformaSessionBean();
		
		this.tipoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoproformaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.proformaSessionBean=new ProformaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoProforma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoProforma=new JButtonMe();
				this.jButtonModificarToolBarTipoProforma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoProforma,this.jTtoolBarDetalleTipoProforma,
							"actualizar","actualizar","Actualizar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoProforma,this.jTtoolBarDetalleTipoProforma,
							"eliminar","eliminar","Eliminar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoProforma,this.jTtoolBarDetalleTipoProforma,
							"cancelar","cancelar","Cancelar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoProforma,this.jTtoolBarDetalleTipoProforma,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoProforma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoProforma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoProforma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoProforma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoProforma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoProforma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoProforma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoProforma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoProforma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoProforma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoProforma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoProforma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoProforma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoProforma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoProforma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoProforma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoProforma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoProforma.add(this.jMenuItemDetalleCerrarTipoProforma);
		
		this.jmenuDetalleAccionesTipoProforma.add(this.jMenuItemActualizarTipoProforma);
		this.jmenuDetalleAccionesTipoProforma.add(this.jMenuItemEliminarTipoProforma);
		this.jmenuDetalleAccionesTipoProforma.add(this.jMenuItemCancelarTipoProforma);		
		
		//this.jmenuDetalleDatosTipoProforma.add(this.jMenuItemDetalleAbrirOrderByTipoProforma);				
		this.jmenuDetalleDatosTipoProforma.add(this.jMenuItemDetalleMostarOcultarTipoProforma);				
				
		//this.jmenuDetalleAccionesTipoProforma.add(this.jMenuItemGuardarCambiosTipoProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoProforma.add(this.jmenuDetalleArchivoTipoProforma);		
		this.jmenuBarDetalleTipoProforma.add(this.jmenuDetalleAccionesTipoProforma);		
		this.jmenuBarDetalleTipoProforma.add(this.jmenuDetalleDatosTipoProforma);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoProforma.add(this.jmenuDetalleTipoProforma);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoProforma);				
	}
	
	
	public void inicializarElementosCamposTipoProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoProforma = new JLabelMe();
		jLabelIdTipoProforma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoProforma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoProforma.setToolTipText(TipoProformaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoProforma= new GridBagLayout();

		this.jPanelidTipoProforma.setLayout(this.gridaBagLayoutTipoProforma);

		jLabelidTipoProforma = new JLabel();
		jLabelidTipoProforma.setText("Id");

		jLabelidTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoProforma = new JLabelMe();
		this.jLabelcodigoTipoProforma.setText(""+TipoProformaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoProforma.setToolTipText("Codigo");
		this.jLabelcodigoTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoProforma.setToolTipText(TipoProformaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoProforma = new GridBagLayout();
		this.jPanelcodigoTipoProforma.setLayout(this.gridaBagLayoutTipoProforma);


		jTextFieldcodigoTipoProforma= new JTextFieldMe();

		jTextFieldcodigoTipoProforma.setEnabled(false);
		jTextFieldcodigoTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoProformaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoProformaBusqueda.setText("U");
		this.jButtoncodigoTipoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoProformaBusqueda"));

		if(this.tipoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoProformaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoProforma = new JLabelMe();
		this.jLabelnombreTipoProforma.setText(""+TipoProformaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoProforma.setToolTipText("Nombre");
		this.jLabelnombreTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoProforma.setToolTipText(TipoProformaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoProforma = new GridBagLayout();
		this.jPanelnombreTipoProforma.setLayout(this.gridaBagLayoutTipoProforma);


		jTextAreanombreTipoProforma= new JTextAreaMe();
		jTextAreanombreTipoProforma.setEnabled(false);
		jTextAreanombreTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProforma.setLineWrap(true);
		jTextAreanombreTipoProforma.setWrapStyleWord(true);
		jTextAreanombreTipoProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoProforma.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoProforma = new JScrollPane(jTextAreanombreTipoProforma);
		jscrollPanenombreTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoProformaBusqueda= new JButtonMe();
		this.jButtonnombreTipoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoProformaBusqueda.setText("U");
		this.jButtonnombreTipoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoProformaBusqueda"));

		if(this.tipoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoProformaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoProforma = new JLabelMe();
		this.jLabelid_empresaTipoProforma.setText(""+TipoProformaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoProforma.setToolTipText("Empresa");
		this.jLabelid_empresaTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoProforma.setToolTipText(TipoProformaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoProforma = new GridBagLayout();
		this.jPanelid_empresaTipoProforma.setLayout(this.gridaBagLayoutTipoProforma);


		jComboBoxid_empresaTipoProforma= new JComboBoxMe();
		jComboBoxid_empresaTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoProforma.setEnabled(false);

		this.jButtonid_empresaTipoProforma= new JButtonMe();
		this.jButtonid_empresaTipoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProforma.setText("Buscar");
		this.jButtonid_empresaTipoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProforma"));

		this.jButtonid_empresaTipoProformaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoProformaBusqueda.setText("U");
		this.jButtonid_empresaTipoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProformaBusqueda"));

		if(this.tipoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoProformaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoProformaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoProformaUpdate.setText("U");
		this.jButtonid_empresaTipoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProformaUpdate"));



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
		//this.jInternalFrameDetalleTipoProforma = new TipoProformaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Proforma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProforma= new GridBagLayout();
		

		
		String sToolTipTipoProforma="";
		sToolTipTipoProforma=TipoProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProforma+="(Facturacion.TipoProforma)";
		}
		
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProforma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoProforma = new JButtonMe();
		this.jButtonModificarTipoProforma = new JButtonMe();
        this.jButtonActualizarTipoProforma = new JButtonMe();
        this.jButtonEliminarTipoProforma = new JButtonMe();
        this.jButtonCancelarTipoProforma = new JButtonMe();
        this.jButtonGuardarCambiosTipoProforma = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoProforma = new JButtonMe();
		this.jButtonCerrarTipoProforma = new JButtonMe();
		
		this.jScrollPanelDatosTipoProforma = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoProforma = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoProforma = new JScrollPane();
				
		
		
		this.jPanelCamposTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Proforma";
		
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoProforma.setName("jPanelCamposTipoProforma"); 

		this.jPanelCamposOcultosTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoProforma.setName("jPanelCamposOcultosTipoProforma"); 

        this.jPanelAccionesTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProforma.setToolTipText("Acciones");
        this.jPanelAccionesTipoProforma.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoProforma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoProforma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoProforma.setText("Nuevo");
		this.jButtonModificarTipoProforma.setText("Editar");
        this.jButtonActualizarTipoProforma.setText("Actualizar");
        this.jButtonEliminarTipoProforma.setText("Eliminar");
        this.jButtonCancelarTipoProforma.setText("Cancelar");
        this.jButtonGuardarCambiosTipoProforma.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoProforma.setText("Guardar");
		this.jButtonCerrarTipoProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProforma,"nuevo_button","Nuevo",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoProforma,"modificar_button","Editar",this.tipoproformaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoProforma,"actualizar_button","Actualizar",this.tipoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoProforma,"eliminar_button","Eliminar",this.tipoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoProforma,"cancelar_button","Cancelar",this.tipoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoProforma,"guardarcambios_button","Guardar",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProforma,"guardarcambiostabla_button","Guardar",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProforma,"cerrar_button","Salir",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoProforma.setToolTipText("Nuevo"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoProforma.setToolTipText("Editar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoProforma.setToolTipText("Actualizar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoProforma.setToolTipText("Eliminar)"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoProforma.setToolTipText("Cancelar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoProforma.setToolTipText("Guardar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoProforma.setToolTipText("Guardar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProforma.setToolTipText("Salir"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProforma";
		inputMap = this.jButtonNuevoTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProforma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoProforma";
		inputMap = this.jButtonActualizarTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoProforma"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoProforma";
		inputMap = this.jButtonEliminarTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoProforma"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoProforma";
		inputMap = this.jButtonCancelarTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoProforma"));
		
		//CERRAR		
		sMapKey = "CerrarTipoProforma";
		inputMap = this.jButtonCerrarTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProforma";
		inputMap = this.jButtonGuardarCambiosTablaTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProforma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoProforma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoProforma.setToolTipText("Nuevo TipoProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoProforma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoProforma.setToolTipText("Sin Cerrar Ventana TipoProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoProforma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoProforma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProforma.setText("Accion");
		this.jComboBoxTiposAccionesTipoProforma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoProforma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoProforma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoProforma = new JLabelMe();
		
		this.jLabelAccionesTipoProforma.setText("Acciones");		
		this.jLabelAccionesTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoProforma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoProforma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoProforma=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProforma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoProforma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoProforma = new GridBagLayout();
		
		this.jPanelCamposTipoProforma.setLayout(gridaBagLayoutCamposTipoProforma);
		this.jPanelCamposOcultosTipoProforma.setLayout(gridaBagLayoutCamposOcultosTipoProforma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProforma.gridy = 0;
	this.gridBagConstraintsTipoProforma.gridx = 0;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoProforma.add(jLabelIdTipoProforma, this.gridBagConstraintsTipoProforma);



	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProforma.gridy = 0;
	this.gridBagConstraintsTipoProforma.gridx = 1;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoProforma.add(jLabelidTipoProforma, this.gridBagConstraintsTipoProforma);


	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProforma.gridy = 0;
	this.gridBagConstraintsTipoProforma.gridx = 0;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoProforma.add(jLabelid_empresaTipoProforma, this.gridBagConstraintsTipoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = 0;
		this.gridBagConstraintsTipoProforma.gridx = 2;
		this.gridBagConstraintsTipoProforma.ipadx = 0;
		this.gridBagConstraintsTipoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoProforma.add(jButtonid_empresaTipoProformaBusqueda, this.gridBagConstraintsTipoProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = 0;
		this.gridBagConstraintsTipoProforma.gridx = 3;
		this.gridBagConstraintsTipoProforma.ipadx = 0;
		this.gridBagConstraintsTipoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoProforma.add(jButtonid_empresaTipoProformaUpdate, this.gridBagConstraintsTipoProforma);
	}

	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProforma.gridy = 0;
	this.gridBagConstraintsTipoProforma.gridx = 1;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoProforma.add(jComboBoxid_empresaTipoProforma, this.gridBagConstraintsTipoProforma);


	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProforma.gridy = 0;
	this.gridBagConstraintsTipoProforma.gridx = 0;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoProforma.add(jLabelcodigoTipoProforma, this.gridBagConstraintsTipoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = 0;
		this.gridBagConstraintsTipoProforma.gridx = 2;
		this.gridBagConstraintsTipoProforma.ipadx = 0;
		this.gridBagConstraintsTipoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoProforma.add(jButtoncodigoTipoProformaBusqueda, this.gridBagConstraintsTipoProforma);
	}

	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProforma.gridy = 0;
	this.gridBagConstraintsTipoProforma.gridx = 1;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoProforma.add(jTextFieldcodigoTipoProforma, this.gridBagConstraintsTipoProforma);


	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProforma.gridy = 0;
	this.gridBagConstraintsTipoProforma.gridx = 0;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoProforma.add(jLabelnombreTipoProforma, this.gridBagConstraintsTipoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = 0;
		this.gridBagConstraintsTipoProforma.gridx = 2;
		this.gridBagConstraintsTipoProforma.ipadx = 0;
		this.gridBagConstraintsTipoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoProforma.add(jButtonnombreTipoProformaBusqueda, this.gridBagConstraintsTipoProforma);
	}

	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProforma.gridy = 0;
	this.gridBagConstraintsTipoProforma.gridx = 1;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoProforma.add(jscrollPanenombreTipoProforma, this.gridBagConstraintsTipoProforma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProforma.gridy = iYPanelCamposTipoProforma;
	this.gridBagConstraintsTipoProforma.gridx = iXPanelCamposTipoProforma++;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProforma.add(this.jPanelidTipoProforma, this.gridBagConstraintsTipoProforma);



	if(iXPanelCamposTipoProforma % 1==0) {
		iXPanelCamposTipoProforma=0;
		iYPanelCamposTipoProforma++;
	}
	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProforma.gridy = iYPanelCamposTipoProforma;
	this.gridBagConstraintsTipoProforma.gridx = iXPanelCamposTipoProforma++;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProforma.add(this.jPanelcodigoTipoProforma, this.gridBagConstraintsTipoProforma);



	if(iXPanelCamposTipoProforma % 1==0) {
		iXPanelCamposTipoProforma=0;
		iYPanelCamposTipoProforma++;
	}
	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProforma.gridy = iYPanelCamposTipoProforma;
	this.gridBagConstraintsTipoProforma.gridx = iXPanelCamposTipoProforma++;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProforma.add(this.jPanelnombreTipoProforma, this.gridBagConstraintsTipoProforma);



	if(iXPanelCamposTipoProforma % 1==0) {
		iXPanelCamposTipoProforma=0;
		iYPanelCamposTipoProforma++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProforma.gridy = iYPanelCamposOcultosTipoProforma;
	this.gridBagConstraintsTipoProforma.gridx = iXPanelCamposOcultosTipoProforma++;
	this.gridBagConstraintsTipoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoProforma.add(this.jPanelid_empresaTipoProforma, this.gridBagConstraintsTipoProforma);



	if(iXPanelCamposOcultosTipoProforma % 1==0) {
		iXPanelCamposOcultosTipoProforma=0;
		iYPanelCamposOcultosTipoProforma++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoProforma= new GridBagLayout();
		this.jPanelAccionesTipoProforma.setLayout(gridaBagLayoutAccionesTipoProforma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoProforma= new GridBagLayout();
		this.jPanelAccionesFormularioTipoProforma.setLayout(gridaBagLayoutAccionesFormularioTipoProforma);
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProforma.add(this.jComboBoxTiposAccionesFormularioTipoProforma, this.gridBagConstraintsTipoProforma);

		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProforma.add(this.jCheckBoxPostAccionNuevoTipoProforma, this.gridBagConstraintsTipoProforma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoproformaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProforma.add(this.jCheckBoxPostAccionSinCerrarTipoProforma, this.gridBagConstraintsTipoProforma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoproformaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProforma.add(this.jCheckBoxPostAccionSinMensajeTipoProforma, this.gridBagConstraintsTipoProforma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = 0;
		this.gridBagConstraintsTipoProforma.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoProforma.add(this.jButtonModificarTipoProforma, this.gridBagConstraintsTipoProforma);							

		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = 0;
		this.gridBagConstraintsTipoProforma.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoProforma.add(this.jButtonEliminarTipoProforma, this.gridBagConstraintsTipoProforma);
		
			
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = 0;		
		this.gridBagConstraintsTipoProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProforma.add(this.jButtonActualizarTipoProforma, this.gridBagConstraintsTipoProforma);


		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = 0;		
		this.gridBagConstraintsTipoProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProforma.add(this.jButtonGuardarCambiosTipoProforma, this.gridBagConstraintsTipoProforma);	
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = 0;		
		this.gridBagConstraintsTipoProforma.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoProforma.add(this.jButtonCancelarTipoProforma, this.gridBagConstraintsTipoProforma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProforma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();						
			this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProforma.gridx = 0;		
			//this.gridBagConstraintsTipoProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProforma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProforma.gridx =0;
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProforma, this.gridBagConstraintsTipoProforma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoProformaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoProforma = new TipoProformaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Proforma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Proforma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Proforma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoProformaModel tipoproformaModel=new TipoProformaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoProformaModel.TipoProformaFocusTraversalPolicy tipoproformaFocusTraversalPolicy = tipoproformaModel.new TipoProformaFocusTraversalPolicy(this);
			
			//tipoproformaFocusTraversalPolicy.settipoproformaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoproformaModel);
			
			
			this.jContentPaneDetalleTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoProforma = new GridBagLayout();	
			this.jContentPaneDetalleTipoProforma.setLayout(gridaBagLayoutDetalleTipoProforma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProforma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoProforma = new GridBagConstraints();
				this.gridBagConstraintsTipoProforma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoProforma.gridx = 0;
					
				
				this.jContentPaneDetalleTipoProforma.add(jTtoolBarDetalleTipoProforma, gridBagConstraintsTipoProforma);								
				
}
			
			this.jScrollPanelDatosEdicionTipoProforma=   new JScrollPane(jContentPaneDetalleTipoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoProforma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoProforma.gridx = 0;
	        
			this.jContentPaneDetalleTipoProforma.add(jPanelCamposTipoProforma, gridBagConstraintsTipoProforma);
			
			
			
			
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
						&& tipoproformaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameProforma(this.puedeCargarPorParteProforma,false,-1);
					
					if(this.tipoproformaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoProforma= new GridBagConstraints();
						this.gridBagConstraintsTipoProforma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoProforma.gridx = 0;
						this.jContentPaneDetalleTipoProforma.add(this.jTabbedPaneRelacionesTipoProforma, this.gridBagConstraintsTipoProforma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoProforma.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameProforma(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoProforma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoProforma = new GridBagConstraints();
					this.gridBagConstraintsTipoProforma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoProforma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoProforma.gridx = 0;
					
				
					this.jContentPaneDetalleTipoProforma.add(jPanelCamposOcultosTipoProforma, gridBagConstraintsTipoProforma);
				
					this.jPanelCamposOcultosTipoProforma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoProforma.gridx = 0;
	        this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoProforma.add(this.jPanelAccionesFormularioTipoProforma, this.gridBagConstraintsTipoProforma);							
			
			
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
	        this.gridBagConstraintsTipoProforma.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoProforma.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoProforma.add(this.jPanelAccionesTipoProforma, this.gridBagConstraintsTipoProforma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoProforma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoProforma=   new JScrollPane(this.jPanelCamposTipoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoProforma.gridx = 0;
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoProforma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoProforma, this.gridBagConstraintsTipoProforma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoProforma, this.gridBagConstraintsTipoProforma);			
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoProforma, this.gridBagConstraintsTipoProforma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProforma, this.gridBagConstraintsTipoProforma);
			
			
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProforma, this.gridBagConstraintsTipoProforma);
		
			
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProforma, this.gridBagConstraintsTipoProforma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoProforma;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoProforma;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameProforma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.proformaSessionBean=new ProformaSessionBean();
		this.proformaSessionBean.setConGuardarRelaciones(true);
		this.proformaSessionBean.setEsGuardarRelacionado(true);

		this.proformaBeanSwingJInternalFrame=null;//new ProformaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.proformaBeanSwingJInternalFramePopup=new ProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.proformaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.proformaSessionBean.getEsGuardarRelacionado()) {

				ProformaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProformaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.proformaSessionBean.setEsGuardarRelacionado(true);

				this.proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.proformaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.proformaBeanSwingJInternalFrame.setproformaSessionBean(this.proformaSessionBean);

				//this.gridBagConstraintsTipoProforma = new GridBagConstraints();
				//this.gridBagConstraintsTipoProforma.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProforma.gridx = 0;
				//this.jContentPaneDetalleTipoProforma.add(this.proformaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProforma);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProforma.add("Proformas",this.proformaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProforma.setComponentAt(iIndexTab,this.proformaBeanSwingJInternalFrame.getContentPane());
				}

				//ProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.proformaSessionBean.setEsGuardarRelacionado(false);
				this.proformaBeanSwingJInternalFrame=null;//new ProformaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.proformaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProforma) {
					this.jTabbedPaneRelacionesTipoProforma.add("Proformas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProformaBeanSwingJInternalFrame(List<TipoProforma> tipoproformas,TipoProforma tipoproforma,ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					proformaBeanSwingJInternalFrame.getProformaLogic().setConnexion(this.tipoproformaLogic.getConnexion());

					proformaBeanSwingJInternalFrame.settipoproformasForeignKey(tipoproformas);
					proformaBeanSwingJInternalFrame.settipoproformaForeignKey(tipoproforma);
					proformaBeanSwingJInternalFrame.proformaSessionBean.setisBusquedaDesdeForeignKeySesionTipoProforma(true);
					proformaBeanSwingJInternalFrame.proformaSessionBean.setlidTipoProformaActual(tipoproforma.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					proformaBeanSwingJInternalFrame.cargarCombosForeignKeyProforma(proformaBeanSwingJInternalFrame.isCargarCombosDependencia);
					proformaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProforma(true);
					proformaBeanSwingJInternalFrame.setid_tipo_proformaFK_IdTipoProforma(tipoproforma.getId());

					if(!this.conCargarFormDetalle) {
						proformaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					proformaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProformaForeignKey(tipoproforma,1,false,true,true);
					proformaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					proformaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProforma");
					proformaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProforma");
					proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(true);
					proformaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProforma("n",proformaBeanSwingJInternalFrame.isGuardarCambiosEnLote, proformaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					proformaBeanSwingJInternalFrame.setAutoscrolls(true);
					proformaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("relacionado");
					} else {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("no_relacionado");
					}

					proformaBeanSwingJInternalFrame.getjButtonRecargarInformacionProforma().setVisible(false);

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
