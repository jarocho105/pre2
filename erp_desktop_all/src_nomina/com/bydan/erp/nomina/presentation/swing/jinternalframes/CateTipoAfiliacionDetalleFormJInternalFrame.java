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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.CateTipoAfiliacionConstantesFunciones;

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
public class CateTipoAfiliacionDetalleFormJInternalFrame extends CateTipoAfiliacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCateTipoAfiliacion;
	
	protected JMenuBar jmenuBarDetalleCateTipoAfiliacion;
	
	protected JMenu jmenuDetalleCateTipoAfiliacion;
	protected JMenu jmenuDetalleArchivoCateTipoAfiliacion;
	protected JMenu jmenuDetalleAccionesCateTipoAfiliacion;
	protected JMenu jmenuDetalleDatosCateTipoAfiliacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCateTipoAfiliacion;	
	protected GridBagConstraints gridBagConstraintsCateTipoAfiliacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CateTipoAfiliacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleCateTipoAfiliacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public CateTipoAfiliacionSessionBean catetipoafiliacionSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public TipoAfiliacionBeanSwingJInternalFrame tipoafiliacionBeanSwingJInternalFrame=null;
	public TipoAfiliacionBeanSwingJInternalFrame tipoafiliacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTipoAfiliacion=false;
	public TipoAfiliacionSessionBean tipoafiliacionSessionBean;
	
		
	
	public CateTipoAfiliacionLogic catetipoafiliacionLogic;
	
	public JScrollPane jScrollPanelDatosCateTipoAfiliacion;
	public JScrollPane jScrollPanelDatosEdicionCateTipoAfiliacion;
	public JScrollPane jScrollPanelDatosGeneralCateTipoAfiliacion;
	
	protected JPanel jPanelCamposCateTipoAfiliacion;    
	protected JPanel jPanelCamposOcultosCateTipoAfiliacion;    	
	protected JPanel jPanelAccionesCateTipoAfiliacion;
	protected JPanel jPanelAccionesFormularioCateTipoAfiliacion;
    
	
	
	protected Integer iXPanelCamposCateTipoAfiliacion=0;
	protected Integer iYPanelCamposCateTipoAfiliacion=0;
	
	protected Integer iXPanelCamposOcultosCateTipoAfiliacion=0;
	protected Integer iYPanelCamposOcultosCateTipoAfiliacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCateTipoAfiliacion;
	public JButton jButtonModificarCateTipoAfiliacion;
	public JButton jButtonActualizarCateTipoAfiliacion;
    public JButton jButtonEliminarCateTipoAfiliacion;
	public JButton jButtonCancelarCateTipoAfiliacion;
    public JButton jButtonGuardarCambiosCateTipoAfiliacion;
	public JButton jButtonGuardarCambiosTablaCateTipoAfiliacion;
	protected JButton jButtonCerrarCateTipoAfiliacion;
	
	
	protected JButton jButtonProcesarInformacionCateTipoAfiliacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCateTipoAfiliacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCateTipoAfiliacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCateTipoAfiliacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCateTipoAfiliacion;
	protected JButton jButtonModificarToolBarCateTipoAfiliacion;
	protected JButton jButtonActualizarToolBarCateTipoAfiliacion;
    protected JButton jButtonEliminarToolBarCateTipoAfiliacion;
	protected JButton jButtonCancelarToolBarCateTipoAfiliacion;
    protected JButton jButtonGuardarCambiosToolBarCateTipoAfiliacion;
	protected JButton jButtonGuardarCambiosTablaToolBarCateTipoAfiliacion;
	protected JButton jButtonMostrarOcultarTablaToolBarCateTipoAfiliacion;
	protected JButton jButtonCerrarToolBarCateTipoAfiliacion;
	
	protected JButton jButtonProcesarInformacionToolBarCateTipoAfiliacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCateTipoAfiliacion;
	protected JMenuItem jMenuItemModificarCateTipoAfiliacion;
	protected JMenuItem jMenuItemActualizarCateTipoAfiliacion;
    protected JMenuItem jMenuItemEliminarCateTipoAfiliacion;
	protected JMenuItem jMenuItemCancelarCateTipoAfiliacion;
    protected JMenuItem jMenuItemGuardarCambiosCateTipoAfiliacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaCateTipoAfiliacion;
	protected JMenuItem jMenuItemCerrarCateTipoAfiliacion;
	protected JMenuItem jMenuItemDetalleCerrarCateTipoAfiliacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarCateTipoAfiliacion;
	
	protected JMenuItem jMenuItemProcesarInformacionCateTipoAfiliacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCateTipoAfiliacion;
	protected JMenuItem jMenuItemMostrarOcultarCateTipoAfiliacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCateTipoAfiliacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCateTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCateTipoAfiliacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCateTipoAfiliacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCateTipoAfiliacion;
	public JLabel jLabelIdCateTipoAfiliacion;
	public JTextFieldMe jTextFieldidCateTipoAfiliacion;
	public JButton jButtonidCateTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCateTipoAfiliacion;
	public JLabel jLabelcodigoCateTipoAfiliacion;
	public JTextField jTextFieldcodigoCateTipoAfiliacion;
	public JButton jButtoncodigoCateTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPanelnombreCateTipoAfiliacion;
	public JLabel jLabelnombreCateTipoAfiliacion;
	public JTextArea jTextAreanombreCateTipoAfiliacion;
	public JScrollPane jscrollPanenombreCateTipoAfiliacion;
	public JButton jButtonnombreCateTipoAfiliacionBusqueda= new JButtonMe();

	public JPanel jPaneles_defectoCateTipoAfiliacion;
	public JLabel jLabeles_defectoCateTipoAfiliacion;
	public JCheckBox jCheckBoxes_defectoCateTipoAfiliacion;
	public JButton jButtones_defectoCateTipoAfiliacionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCateTipoAfiliacion;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CateTipoAfiliacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCateTipoAfiliacion=new JPanel();
				this.jPanelAccionesFormularioCateTipoAfiliacion=new JPanel();
				this.jmenuBarDetalleCateTipoAfiliacion=new JMenuBar();
				this.jTtoolBarDetalleCateTipoAfiliacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CateTipoAfiliacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CateTipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CateTipoAfiliacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CateTipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CateTipoAfiliacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CateTipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CateTipoAfiliacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CateTipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CateTipoAfiliacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CateTipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCateTipoAfiliacion() {
		return this.jButtonActualizarToolBarCateTipoAfiliacion;
	}
	
	public JButton getjButtonEliminarToolBarCateTipoAfiliacion() {
		return this.jButtonEliminarToolBarCateTipoAfiliacion;
	}
	
	public JButton getjButtonCancelarToolBarCateTipoAfiliacion() {
		return this.jButtonCancelarToolBarCateTipoAfiliacion;
	}		
	
	public JButton getjButtonProcesarInformacionCateTipoAfiliacion() {
		return this.jButtonProcesarInformacionCateTipoAfiliacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCateTipoAfiliacion)	{
		this.jButtonProcesarInformacionCateTipoAfiliacion = jButtonProcesarInformacionCateTipoAfiliacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCateTipoAfiliacion() {
		return this.jComboBoxTiposAccionesCateTipoAfiliacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCateTipoAfiliacion(
			JComboBox jComboBoxTiposRelacionesCateTipoAfiliacion) {
		this.jComboBoxTiposRelacionesCateTipoAfiliacion = jComboBoxTiposRelacionesCateTipoAfiliacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCateTipoAfiliacion(
			JComboBox jComboBoxTiposAccionesCateTipoAfiliacion) {
		this.jComboBoxTiposAccionesCateTipoAfiliacion = jComboBoxTiposAccionesCateTipoAfiliacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCateTipoAfiliacion() {
		return this.jComboBoxTiposAccionesFormularioCateTipoAfiliacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCateTipoAfiliacion(
			JComboBox jComboBoxTiposAccionesFormularioCateTipoAfiliacion) {
		this.jComboBoxTiposAccionesFormularioCateTipoAfiliacion = jComboBoxTiposAccionesFormularioCateTipoAfiliacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean();
		
		this.catetipoafiliacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.catetipoafiliacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.catetipoafiliacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CateTipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CateTipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CateTipoAfiliacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cate Tipo Afiliacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
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
	
		CateTipoAfiliacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCateTipoAfiliacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCateTipoAfiliacion=new JButtonMe();
				this.jButtonModificarToolBarCateTipoAfiliacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCateTipoAfiliacion,this.jTtoolBarDetalleCateTipoAfiliacion,
							"actualizar","actualizar","Actualizar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCateTipoAfiliacion,this.jTtoolBarDetalleCateTipoAfiliacion,
							"eliminar","eliminar","Eliminar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCateTipoAfiliacion,this.jTtoolBarDetalleCateTipoAfiliacion,
							"cancelar","cancelar","Cancelar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCateTipoAfiliacion,this.jTtoolBarDetalleCateTipoAfiliacion,
							"guardarcambios","guardarcambios","Guardar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCateTipoAfiliacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCateTipoAfiliacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCateTipoAfiliacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCateTipoAfiliacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCateTipoAfiliacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCateTipoAfiliacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCateTipoAfiliacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCateTipoAfiliacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCateTipoAfiliacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCateTipoAfiliacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCateTipoAfiliacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCateTipoAfiliacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCateTipoAfiliacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCateTipoAfiliacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCateTipoAfiliacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCateTipoAfiliacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCateTipoAfiliacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCateTipoAfiliacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCateTipoAfiliacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCateTipoAfiliacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCateTipoAfiliacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCateTipoAfiliacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCateTipoAfiliacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCateTipoAfiliacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCateTipoAfiliacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCateTipoAfiliacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCateTipoAfiliacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCateTipoAfiliacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCateTipoAfiliacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCateTipoAfiliacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCateTipoAfiliacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCateTipoAfiliacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCateTipoAfiliacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCateTipoAfiliacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCateTipoAfiliacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCateTipoAfiliacion.add(this.jMenuItemDetalleCerrarCateTipoAfiliacion);
		
		this.jmenuDetalleAccionesCateTipoAfiliacion.add(this.jMenuItemActualizarCateTipoAfiliacion);
		this.jmenuDetalleAccionesCateTipoAfiliacion.add(this.jMenuItemEliminarCateTipoAfiliacion);
		this.jmenuDetalleAccionesCateTipoAfiliacion.add(this.jMenuItemCancelarCateTipoAfiliacion);		
		
		//this.jmenuDetalleDatosCateTipoAfiliacion.add(this.jMenuItemDetalleAbrirOrderByCateTipoAfiliacion);				
		this.jmenuDetalleDatosCateTipoAfiliacion.add(this.jMenuItemDetalleMostarOcultarCateTipoAfiliacion);				
				
		//this.jmenuDetalleAccionesCateTipoAfiliacion.add(this.jMenuItemGuardarCambiosCateTipoAfiliacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCateTipoAfiliacion.add(this.jmenuDetalleArchivoCateTipoAfiliacion);		
		this.jmenuBarDetalleCateTipoAfiliacion.add(this.jmenuDetalleAccionesCateTipoAfiliacion);		
		this.jmenuBarDetalleCateTipoAfiliacion.add(this.jmenuDetalleDatosCateTipoAfiliacion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCateTipoAfiliacion.add(this.jmenuDetalleCateTipoAfiliacion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCateTipoAfiliacion);				
	}
	
	
	public void inicializarElementosCamposCateTipoAfiliacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCateTipoAfiliacion = new JLabelMe();
		jLabelIdCateTipoAfiliacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCateTipoAfiliacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCateTipoAfiliacion.setToolTipText(CateTipoAfiliacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCateTipoAfiliacion= new GridBagLayout();

		this.jPanelidCateTipoAfiliacion.setLayout(this.gridaBagLayoutCateTipoAfiliacion);

		jTextFieldidCateTipoAfiliacion = new JTextFieldMe();
		jTextFieldidCateTipoAfiliacion.setText("Id");

		jTextFieldidCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCateTipoAfiliacion = new JLabelMe();
		this.jLabelcodigoCateTipoAfiliacion.setText(""+CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCateTipoAfiliacion.setToolTipText("Codigo");
		this.jLabelcodigoCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCateTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCateTipoAfiliacion.setToolTipText(CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCateTipoAfiliacion = new GridBagLayout();
		this.jPanelcodigoCateTipoAfiliacion.setLayout(this.gridaBagLayoutCateTipoAfiliacion);


		jTextFieldcodigoCateTipoAfiliacion= new JTextFieldMe();

		jTextFieldcodigoCateTipoAfiliacion.setEnabled(false);
		jTextFieldcodigoCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCateTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtoncodigoCateTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCateTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCateTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCateTipoAfiliacionBusqueda.setText("U");
		this.jButtoncodigoCateTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCateTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCateTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCateTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCateTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCateTipoAfiliacionBusqueda"));

		if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCateTipoAfiliacionBusqueda.setVisible(false);		}


					
		this.jLabelnombreCateTipoAfiliacion = new JLabelMe();
		this.jLabelnombreCateTipoAfiliacion.setText(""+CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCateTipoAfiliacion.setToolTipText("Nombre");
		this.jLabelnombreCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCateTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCateTipoAfiliacion.setToolTipText(CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCateTipoAfiliacion = new GridBagLayout();
		this.jPanelnombreCateTipoAfiliacion.setLayout(this.gridaBagLayoutCateTipoAfiliacion);


		jTextAreanombreCateTipoAfiliacion= new JTextAreaMe();
		jTextAreanombreCateTipoAfiliacion.setEnabled(false);
		jTextAreanombreCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCateTipoAfiliacion.setLineWrap(true);
		jTextAreanombreCateTipoAfiliacion.setWrapStyleWord(true);
		jTextAreanombreCateTipoAfiliacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCateTipoAfiliacion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCateTipoAfiliacion = new JScrollPane(jTextAreanombreCateTipoAfiliacion);
		jscrollPanenombreCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCateTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtonnombreCateTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCateTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCateTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCateTipoAfiliacionBusqueda.setText("U");
		this.jButtonnombreCateTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCateTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCateTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCateTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCateTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCateTipoAfiliacionBusqueda"));

		if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCateTipoAfiliacionBusqueda.setVisible(false);		}


					
		this.jLabeles_defectoCateTipoAfiliacion = new JLabelMe();
		this.jLabeles_defectoCateTipoAfiliacion.setText(""+CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO+" : *");
		this.jLabeles_defectoCateTipoAfiliacion.setToolTipText("Es Defecto");
		this.jLabeles_defectoCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_defectoCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_defectoCateTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_defectoCateTipoAfiliacion.setToolTipText(CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO);
		this.gridaBagLayoutCateTipoAfiliacion = new GridBagLayout();
		this.jPaneles_defectoCateTipoAfiliacion.setLayout(this.gridaBagLayoutCateTipoAfiliacion);


		jCheckBoxes_defectoCateTipoAfiliacion= new JCheckBoxMe();
		jCheckBoxes_defectoCateTipoAfiliacion.setEnabled(false);

		jCheckBoxes_defectoCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_defectoCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_defectoCateTipoAfiliacionBusqueda= new JButtonMe();
		this.jButtones_defectoCateTipoAfiliacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoCateTipoAfiliacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoCateTipoAfiliacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_defectoCateTipoAfiliacionBusqueda.setText("U");
		this.jButtones_defectoCateTipoAfiliacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_defectoCateTipoAfiliacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_defectoCateTipoAfiliacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_defectoCateTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_defectoCateTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_defectoCateTipoAfiliacionBusqueda"));

		if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_defectoCateTipoAfiliacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCateTipoAfiliacion() {
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
		//this.jInternalFrameDetalleCateTipoAfiliacion = new CateTipoAfiliacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cate Tipo Afiliacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCateTipoAfiliacion= new GridBagLayout();
		

		
		String sToolTipCateTipoAfiliacion="";
		sToolTipCateTipoAfiliacion=CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCateTipoAfiliacion+="(Nomina.CateTipoAfiliacion)";
		}
		
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipCateTipoAfiliacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCateTipoAfiliacion = new JButtonMe();
		this.jButtonModificarCateTipoAfiliacion = new JButtonMe();
        this.jButtonActualizarCateTipoAfiliacion = new JButtonMe();
        this.jButtonEliminarCateTipoAfiliacion = new JButtonMe();
        this.jButtonCancelarCateTipoAfiliacion = new JButtonMe();
        this.jButtonGuardarCambiosCateTipoAfiliacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion = new JButtonMe();
		this.jButtonCerrarCateTipoAfiliacion = new JButtonMe();
		
		this.jScrollPanelDatosCateTipoAfiliacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionCateTipoAfiliacion = new JScrollPane();
		this.jScrollPanelDatosGeneralCateTipoAfiliacion = new JScrollPane();
				
		
		
		this.jPanelCamposCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cate Tipo Afiliacion";
		
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cate Tipo Afiliaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosCateTipoAfiliacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCateTipoAfiliacion.setName("jPanelCamposCateTipoAfiliacion"); 

		this.jPanelCamposOcultosCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCateTipoAfiliacion.setName("jPanelCamposOcultosCateTipoAfiliacion"); 

        this.jPanelAccionesCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCateTipoAfiliacion.setToolTipText("Acciones");
        this.jPanelAccionesCateTipoAfiliacion.setName("Acciones"); 

		this.jPanelAccionesFormularioCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCateTipoAfiliacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCateTipoAfiliacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCateTipoAfiliacion.setText("Nuevo");
		this.jButtonModificarCateTipoAfiliacion.setText("Editar");
        this.jButtonActualizarCateTipoAfiliacion.setText("Actualizar");
        this.jButtonEliminarCateTipoAfiliacion.setText("Eliminar");
        this.jButtonCancelarCateTipoAfiliacion.setText("Cancelar");
        this.jButtonGuardarCambiosCateTipoAfiliacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion.setText("Guardar");
		this.jButtonCerrarCateTipoAfiliacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCateTipoAfiliacion,"nuevo_button","Nuevo",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCateTipoAfiliacion,"modificar_button","Editar",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCateTipoAfiliacion,"actualizar_button","Actualizar",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCateTipoAfiliacion,"eliminar_button","Eliminar",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCateTipoAfiliacion,"cancelar_button","Cancelar",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCateTipoAfiliacion,"guardarcambios_button","Guardar",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCateTipoAfiliacion,"guardarcambiostabla_button","Guardar",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCateTipoAfiliacion,"cerrar_button","Salir",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCateTipoAfiliacion.setToolTipText("Nuevo"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCateTipoAfiliacion.setToolTipText("Editar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCateTipoAfiliacion.setToolTipText("Actualizar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCateTipoAfiliacion.setToolTipText("Eliminar)"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCateTipoAfiliacion.setToolTipText("Cancelar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCateTipoAfiliacion.setToolTipText("Guardar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion.setToolTipText("Guardar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCateTipoAfiliacion.setToolTipText("Salir"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCateTipoAfiliacion";
		inputMap = this.jButtonNuevoCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCateTipoAfiliacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCateTipoAfiliacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCateTipoAfiliacion";
		inputMap = this.jButtonActualizarCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCateTipoAfiliacion"));
		
		//ELIMINAR
		sMapKey = "EliminarCateTipoAfiliacion";
		inputMap = this.jButtonEliminarCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCateTipoAfiliacion"));
		
		//CANCELAR	
		sMapKey = "CancelarCateTipoAfiliacion";
		inputMap = this.jButtonCancelarCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCateTipoAfiliacion"));
		
		//CERRAR		
		sMapKey = "CerrarCateTipoAfiliacion";
		inputMap = this.jButtonCerrarCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCateTipoAfiliacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCateTipoAfiliacion";
		inputMap = this.jButtonGuardarCambiosTablaCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCateTipoAfiliacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCateTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCateTipoAfiliacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCateTipoAfiliacion.setToolTipText("Nuevo CateTipoAfiliacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCateTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCateTipoAfiliacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCateTipoAfiliacion.setToolTipText("Sin Cerrar Ventana CateTipoAfiliacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCateTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCateTipoAfiliacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCateTipoAfiliacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCateTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCateTipoAfiliacion.setText("Accion");
		this.jComboBoxTiposAccionesCateTipoAfiliacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCateTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCateTipoAfiliacion = new JLabelMe();
		
		this.jLabelAccionesCateTipoAfiliacion.setText("Acciones");		
		this.jLabelAccionesCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCateTipoAfiliacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCateTipoAfiliacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCateTipoAfiliacion=new JTabbedPane();
		this.jTabbedPaneRelacionesCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCateTipoAfiliacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCateTipoAfiliacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCateTipoAfiliacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCateTipoAfiliacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCateTipoAfiliacion = new GridBagLayout();
		
		this.jPanelCamposCateTipoAfiliacion.setLayout(gridaBagLayoutCamposCateTipoAfiliacion);
		this.jPanelCamposOcultosCateTipoAfiliacion.setLayout(gridaBagLayoutCamposOcultosCateTipoAfiliacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCateTipoAfiliacion.add(jLabelIdCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);



	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCateTipoAfiliacion.add(jTextFieldidCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);


	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCateTipoAfiliacion.add(jLabelcodigoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCateTipoAfiliacion.add(jButtoncodigoCateTipoAfiliacionBusqueda, this.gridBagConstraintsCateTipoAfiliacion);
	}

	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCateTipoAfiliacion.add(jTextFieldcodigoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);


	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCateTipoAfiliacion.add(jLabelnombreCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCateTipoAfiliacion.add(jButtonnombreCateTipoAfiliacionBusqueda, this.gridBagConstraintsCateTipoAfiliacion);
	}

	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCateTipoAfiliacion.add(jscrollPanenombreCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);


	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_defectoCateTipoAfiliacion.add(jLabeles_defectoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 2;
		this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
		this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_defectoCateTipoAfiliacion.add(jButtones_defectoCateTipoAfiliacionBusqueda, this.gridBagConstraintsCateTipoAfiliacion);
	}

	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = 1;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_defectoCateTipoAfiliacion.add(jCheckBoxes_defectoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = iYPanelCamposCateTipoAfiliacion;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = iXPanelCamposCateTipoAfiliacion++;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCateTipoAfiliacion.add(this.jPanelidCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);



	if(iXPanelCamposCateTipoAfiliacion % 1==0) {
		iXPanelCamposCateTipoAfiliacion=0;
		iYPanelCamposCateTipoAfiliacion++;
	}
	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = iYPanelCamposCateTipoAfiliacion;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = iXPanelCamposCateTipoAfiliacion++;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCateTipoAfiliacion.add(this.jPanelcodigoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);



	if(iXPanelCamposCateTipoAfiliacion % 1==0) {
		iXPanelCamposCateTipoAfiliacion=0;
		iYPanelCamposCateTipoAfiliacion++;
	}
	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = iYPanelCamposCateTipoAfiliacion;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = iXPanelCamposCateTipoAfiliacion++;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCateTipoAfiliacion.add(this.jPanelnombreCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);



	if(iXPanelCamposCateTipoAfiliacion % 1==0) {
		iXPanelCamposCateTipoAfiliacion=0;
		iYPanelCamposCateTipoAfiliacion++;
	}
	this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCateTipoAfiliacion.gridy = iYPanelCamposCateTipoAfiliacion;
	this.gridBagConstraintsCateTipoAfiliacion.gridx = iXPanelCamposCateTipoAfiliacion++;
	this.gridBagConstraintsCateTipoAfiliacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCateTipoAfiliacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCateTipoAfiliacion.add(this.jPaneles_defectoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);



	if(iXPanelCamposCateTipoAfiliacion % 1==0) {
		iXPanelCamposCateTipoAfiliacion=0;
		iYPanelCamposCateTipoAfiliacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesCateTipoAfiliacion= new GridBagLayout();
		this.jPanelAccionesCateTipoAfiliacion.setLayout(gridaBagLayoutAccionesCateTipoAfiliacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCateTipoAfiliacion= new GridBagLayout();
		this.jPanelAccionesFormularioCateTipoAfiliacion.setLayout(gridaBagLayoutAccionesFormularioCateTipoAfiliacion);
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCateTipoAfiliacion.add(this.jComboBoxTiposAccionesFormularioCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);

		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCateTipoAfiliacion.add(this.jCheckBoxPostAccionNuevoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCateTipoAfiliacion.add(this.jCheckBoxPostAccionSinCerrarCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCateTipoAfiliacion.add(this.jCheckBoxPostAccionSinMensajeCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesCateTipoAfiliacion.add(this.jButtonModificarCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);							

		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsCateTipoAfiliacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesCateTipoAfiliacion.add(this.jButtonEliminarCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
			
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesCateTipoAfiliacion.add(this.jButtonActualizarCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);


		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesCateTipoAfiliacion.add(this.jButtonGuardarCambiosCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);	
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesCateTipoAfiliacion.add(this.jButtonCancelarCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCateTipoAfiliacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCateTipoAfiliacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();						
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;		
			//this.gridBagConstraintsCateTipoAfiliacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCateTipoAfiliacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCateTipoAfiliacion.gridx =0;
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCateTipoAfiliacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CateTipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCateTipoAfiliacion = new CateTipoAfiliacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cate Tipo Afiliacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cate Tipo Afiliacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cate Tipo Afiliacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CateTipoAfiliacionModel catetipoafiliacionModel=new CateTipoAfiliacionModel(this);
			
			//SI USARA CLASE INTERNA
			//CateTipoAfiliacionModel.CateTipoAfiliacionFocusTraversalPolicy catetipoafiliacionFocusTraversalPolicy = catetipoafiliacionModel.new CateTipoAfiliacionFocusTraversalPolicy(this);
			
			//catetipoafiliacionFocusTraversalPolicy.setcatetipoafiliacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(catetipoafiliacionModel);
			
			
			this.jContentPaneDetalleCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCateTipoAfiliacion = new GridBagLayout();	
			this.jContentPaneDetalleCateTipoAfiliacion.setLayout(gridaBagLayoutDetalleCateTipoAfiliacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCateTipoAfiliacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
				this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
					
				
				this.jContentPaneDetalleCateTipoAfiliacion.add(jTtoolBarDetalleCateTipoAfiliacion, gridBagConstraintsCateTipoAfiliacion);								
				
}
			
			this.jScrollPanelDatosEdicionCateTipoAfiliacion=   new JScrollPane(jContentPaneDetalleCateTipoAfiliacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCateTipoAfiliacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
	        
			this.jContentPaneDetalleCateTipoAfiliacion.add(jPanelCamposCateTipoAfiliacion, gridBagConstraintsCateTipoAfiliacion);
			
			
			
			
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
						&& catetipoafiliacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoAfiliacion(this.puedeCargarPorParteTipoAfiliacion,false,-1);
					
					if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCateTipoAfiliacion= new GridBagConstraints();
						this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
						this.jContentPaneDetalleCateTipoAfiliacion.add(this.jTabbedPaneRelacionesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCateTipoAfiliacion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoAfiliacion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCateTipoAfiliacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
					this.gridBagConstraintsCateTipoAfiliacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
					
				
					this.jContentPaneDetalleCateTipoAfiliacion.add(jPanelCamposOcultosCateTipoAfiliacion, gridBagConstraintsCateTipoAfiliacion);
				
					this.jPanelCamposOcultosCateTipoAfiliacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
	        this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCateTipoAfiliacion.add(this.jPanelAccionesFormularioCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);							
			
			
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
	        this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
	        
			
			this.jContentPaneDetalleCateTipoAfiliacion.add(this.jPanelAccionesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCateTipoAfiliacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCateTipoAfiliacion=   new JScrollPane(this.jPanelCamposCateTipoAfiliacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCateTipoAfiliacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);			
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			
			
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
			
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCateTipoAfiliacion;//jContentPane;
		
		return jScrollPanelDatosEdicionCateTipoAfiliacion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=CateTipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CateTipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
				//this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
				//this.jContentPaneDetalleCateTipoAfiliacion.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCateTipoAfiliacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCateTipoAfiliacion.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCateTipoAfiliacion.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesCateTipoAfiliacion.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTipoAfiliacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
		this.tipoafiliacionSessionBean.setConGuardarRelaciones(false);
		this.tipoafiliacionSessionBean.setEsGuardarRelacionado(true);

		this.tipoafiliacionBeanSwingJInternalFrame=null;//new TipoAfiliacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tipoafiliacionBeanSwingJInternalFramePopup=new TipoAfiliacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tipoafiliacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {

				TipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL=CateTipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				TipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CateTipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tipoafiliacionSessionBean.setEsGuardarRelacionado(true);

				this.tipoafiliacionBeanSwingJInternalFrame=new TipoAfiliacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tipoafiliacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tipoafiliacionBeanSwingJInternalFrame.settipoafiliacionSessionBean(this.tipoafiliacionSessionBean);

				//this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
				//this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
				//this.jContentPaneDetalleCateTipoAfiliacion.add(this.tipoafiliacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCateTipoAfiliacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCateTipoAfiliacion.add("Tipo Afiliaciones",this.tipoafiliacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCateTipoAfiliacion.setComponentAt(iIndexTab,this.tipoafiliacionBeanSwingJInternalFrame.getContentPane());
				}

				//TipoAfiliacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tipoafiliacionSessionBean.setEsGuardarRelacionado(false);
				this.tipoafiliacionBeanSwingJInternalFrame=null;//new TipoAfiliacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTipoAfiliacion) {
					this.jTabbedPaneRelacionesCateTipoAfiliacion.add("Tipo Afiliaciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<CateTipoAfiliacion> catetipoafiliacions,CateTipoAfiliacion catetipoafiliacion,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.catetipoafiliacionLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setcatetipoafiliacionsForeignKey(catetipoafiliacions);
					clienteBeanSwingJInternalFrame.setcatetipoafiliacionForeignKey(catetipoafiliacion);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionCateTipoAfiliacion(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidCateTipoAfiliacionActual(catetipoafiliacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCateTipoAfiliacion(true);
					clienteBeanSwingJInternalFrame.setid_cate_tipo_afiliacionFK_IdCateTipoAfiliacion(catetipoafiliacion.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameCateTipoAfiliacionForeignKey(catetipoafiliacion,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCateTipoAfiliacion");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCateTipoAfiliacion");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTipoAfiliacionBeanSwingJInternalFrame(List<CateTipoAfiliacion> catetipoafiliacions,CateTipoAfiliacion catetipoafiliacion,TipoAfiliacionBeanSwingJInternalFrame tipoafiliacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tipoafiliacionBeanSwingJInternalFrame=new TipoAfiliacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tipoafiliacionBeanSwingJInternalFrame.getTipoAfiliacionLogic().setConnexion(this.catetipoafiliacionLogic.getConnexion());

					tipoafiliacionBeanSwingJInternalFrame.setcatetipoafiliacionsForeignKey(catetipoafiliacions);
					tipoafiliacionBeanSwingJInternalFrame.setcatetipoafiliacionForeignKey(catetipoafiliacion);
					tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionSessionBean.setisBusquedaDesdeForeignKeySesionCateTipoAfiliacion(true);
					tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionSessionBean.setlidCateTipoAfiliacionActual(catetipoafiliacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tipoafiliacionBeanSwingJInternalFrame.cargarCombosForeignKeyTipoAfiliacion(tipoafiliacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					tipoafiliacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaCateTipoAfiliacion(true);
					tipoafiliacionBeanSwingJInternalFrame.setid_cate_tipo_afiliacionFK_IdCateTipoAfiliacion(catetipoafiliacion.getId());

					if(!this.conCargarFormDetalle) {
						tipoafiliacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tipoafiliacionBeanSwingJInternalFrame.setSelectedItemCombosFrameCateTipoAfiliacionForeignKey(catetipoafiliacion,1,false,true,true);
					tipoafiliacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tipoafiliacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdCateTipoAfiliacion");
					tipoafiliacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCateTipoAfiliacion");
					tipoafiliacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoAfiliacion(true);
					tipoafiliacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTipoAfiliacion("n",tipoafiliacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, tipoafiliacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tipoafiliacionBeanSwingJInternalFrame.setAutoscrolls(true);
					tipoafiliacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tipoafiliacionBeanSwingJInternalFrame.actualizarEstadoPanelsTipoAfiliacion("relacionado");
					} else {
						tipoafiliacionBeanSwingJInternalFrame.actualizarEstadoPanelsTipoAfiliacion("no_relacionado");
					}

					tipoafiliacionBeanSwingJInternalFrame.getjButtonRecargarInformacionTipoAfiliacion().setVisible(false);

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
