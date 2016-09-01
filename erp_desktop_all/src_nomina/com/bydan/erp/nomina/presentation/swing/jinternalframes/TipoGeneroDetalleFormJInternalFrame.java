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
import com.bydan.erp.nomina.util.TipoGeneroConstantesFunciones;

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
public class TipoGeneroDetalleFormJInternalFrame extends TipoGeneroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGenero;
	
	protected JMenuBar jmenuBarDetalleTipoGenero;
	
	protected JMenu jmenuDetalleTipoGenero;
	protected JMenu jmenuDetalleArchivoTipoGenero;
	protected JMenu jmenuDetalleAccionesTipoGenero;
	protected JMenu jmenuDetalleDatosTipoGenero;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGenero;	
	protected GridBagConstraints gridBagConstraintsTipoGenero;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGeneroBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGenero;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGeneroSessionBean tipogeneroSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame=null;
	public CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargaFamiliar_NM=false;
	public CargaFamiliar_NMSessionBean cargafamiliar_nmSessionBean;

	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;
	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSubCliente=false;
	public SubClienteSessionBean subclienteSessionBean;

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;

	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCarteraDefecto=false;
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;

	public CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame=null;
	public CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargaFamiliar=false;
	public CargaFamiliarSessionBean cargafamiliarSessionBean;
	
		
	
	public TipoGeneroLogic tipogeneroLogic;
	
	public JScrollPane jScrollPanelDatosTipoGenero;
	public JScrollPane jScrollPanelDatosEdicionTipoGenero;
	public JScrollPane jScrollPanelDatosGeneralTipoGenero;
	
	protected JPanel jPanelCamposTipoGenero;    
	protected JPanel jPanelCamposOcultosTipoGenero;    	
	protected JPanel jPanelAccionesTipoGenero;
	protected JPanel jPanelAccionesFormularioTipoGenero;
    
	
	
	protected Integer iXPanelCamposTipoGenero=0;
	protected Integer iYPanelCamposTipoGenero=0;
	
	protected Integer iXPanelCamposOcultosTipoGenero=0;
	protected Integer iYPanelCamposOcultosTipoGenero=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGenero;
	public JButton jButtonModificarTipoGenero;
	public JButton jButtonActualizarTipoGenero;
    public JButton jButtonEliminarTipoGenero;
	public JButton jButtonCancelarTipoGenero;
    public JButton jButtonGuardarCambiosTipoGenero;
	public JButton jButtonGuardarCambiosTablaTipoGenero;
	protected JButton jButtonCerrarTipoGenero;
	
	
	protected JButton jButtonProcesarInformacionTipoGenero;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGenero;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGenero;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGenero;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGenero;
	protected JButton jButtonModificarToolBarTipoGenero;
	protected JButton jButtonActualizarToolBarTipoGenero;
    protected JButton jButtonEliminarToolBarTipoGenero;
	protected JButton jButtonCancelarToolBarTipoGenero;
    protected JButton jButtonGuardarCambiosToolBarTipoGenero;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGenero;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGenero;
	protected JButton jButtonCerrarToolBarTipoGenero;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGenero;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGenero;
	protected JMenuItem jMenuItemModificarTipoGenero;
	protected JMenuItem jMenuItemActualizarTipoGenero;
    protected JMenuItem jMenuItemEliminarTipoGenero;
	protected JMenuItem jMenuItemCancelarTipoGenero;
    protected JMenuItem jMenuItemGuardarCambiosTipoGenero;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGenero;
	protected JMenuItem jMenuItemCerrarTipoGenero;
	protected JMenuItem jMenuItemDetalleCerrarTipoGenero;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGenero;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGenero;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGenero;
	protected JMenuItem jMenuItemMostrarOcultarTipoGenero;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGenero;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGenero;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGenero;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGenero;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGenero;
	public JLabel jLabelIdTipoGenero;
	public JTextFieldMe jTextFieldidTipoGenero;
	public JButton jButtonidTipoGeneroBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoGenero;
	public JLabel jLabelcodigoTipoGenero;
	public JTextField jTextFieldcodigoTipoGenero;
	public JButton jButtoncodigoTipoGeneroBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGenero;
	public JLabel jLabelnombreTipoGenero;
	public JTextArea jTextAreanombreTipoGenero;
	public JScrollPane jscrollPanenombreTipoGenero;
	public JButton jButtonnombreTipoGeneroBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGenero;
	
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
	
	public TipoGeneroDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGenero=new JPanel();
				this.jPanelAccionesFormularioTipoGenero=new JPanel();
				this.jmenuBarDetalleTipoGenero=new JMenuBar();
				this.jTtoolBarDetalleTipoGenero=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGeneroDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGenero No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGeneroDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGenero No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGeneroDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGenero No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGeneroDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGenero No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGeneroDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGenero No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGenero() {
		return this.jButtonActualizarToolBarTipoGenero;
	}
	
	public JButton getjButtonEliminarToolBarTipoGenero() {
		return this.jButtonEliminarToolBarTipoGenero;
	}
	
	public JButton getjButtonCancelarToolBarTipoGenero() {
		return this.jButtonCancelarToolBarTipoGenero;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGenero() {
		return this.jButtonProcesarInformacionTipoGenero;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGenero)	{
		this.jButtonProcesarInformacionTipoGenero = jButtonProcesarInformacionTipoGenero;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGenero() {
		return this.jComboBoxTiposAccionesTipoGenero;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGenero(
			JComboBox jComboBoxTiposRelacionesTipoGenero) {
		this.jComboBoxTiposRelacionesTipoGenero = jComboBoxTiposRelacionesTipoGenero;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGenero(
			JComboBox jComboBoxTiposAccionesTipoGenero) {
		this.jComboBoxTiposAccionesTipoGenero = jComboBoxTiposAccionesTipoGenero;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGenero() {
		return this.jComboBoxTiposAccionesFormularioTipoGenero;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGenero(
			JComboBox jComboBoxTiposAccionesFormularioTipoGenero) {
		this.jComboBoxTiposAccionesFormularioTipoGenero = jComboBoxTiposAccionesFormularioTipoGenero;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogeneroSessionBean=new TipoGeneroSessionBean();
		
		this.tipogeneroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogeneroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogeneroSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		//this.subclienteSessionBean=new SubClienteSessionBean();
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		//this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		//this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGeneroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Genero MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGeneroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGenero= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGenero=new JButtonMe();
				this.jButtonModificarToolBarTipoGenero=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGenero,this.jTtoolBarDetalleTipoGenero,
							"actualizar","actualizar","Actualizar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGenero,this.jTtoolBarDetalleTipoGenero,
							"eliminar","eliminar","Eliminar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGenero,this.jTtoolBarDetalleTipoGenero,
							"cancelar","cancelar","Cancelar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGenero,this.jTtoolBarDetalleTipoGenero,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGenero,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGenero,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGenero,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGenero=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGenero=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGenero=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGenero=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGenero=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGenero= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGenero.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGenero,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGenero= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGenero.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGenero,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGenero= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGenero.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGenero,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGenero= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGenero.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGenero,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGenero= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGenero.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGenero,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGenero= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGenero.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGenero,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGenero= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGenero.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGenero,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGenero= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGenero.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGenero,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGenero= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGenero.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGenero,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGenero= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGenero.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGenero,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGenero.add(this.jMenuItemDetalleCerrarTipoGenero);
		
		this.jmenuDetalleAccionesTipoGenero.add(this.jMenuItemActualizarTipoGenero);
		this.jmenuDetalleAccionesTipoGenero.add(this.jMenuItemEliminarTipoGenero);
		this.jmenuDetalleAccionesTipoGenero.add(this.jMenuItemCancelarTipoGenero);		
		
		//this.jmenuDetalleDatosTipoGenero.add(this.jMenuItemDetalleAbrirOrderByTipoGenero);				
		this.jmenuDetalleDatosTipoGenero.add(this.jMenuItemDetalleMostarOcultarTipoGenero);				
				
		//this.jmenuDetalleAccionesTipoGenero.add(this.jMenuItemGuardarCambiosTipoGenero);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGenero.add(this.jmenuDetalleArchivoTipoGenero);		
		this.jmenuBarDetalleTipoGenero.add(this.jmenuDetalleAccionesTipoGenero);		
		this.jmenuBarDetalleTipoGenero.add(this.jmenuDetalleDatosTipoGenero);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoGenero.add(this.jmenuDetalleTipoGenero);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGenero);				
	}
	
	
	public void inicializarElementosCamposTipoGenero() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGenero = new JLabelMe();
		jLabelIdTipoGenero.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGenero,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGenero = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGenero.setToolTipText(TipoGeneroConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGenero= new GridBagLayout();

		this.jPanelidTipoGenero.setLayout(this.gridaBagLayoutTipoGenero);

		jTextFieldidTipoGenero = new JTextFieldMe();
		jTextFieldidTipoGenero.setText("Id");

		jTextFieldidTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoGenero = new JLabelMe();
		this.jLabelcodigoTipoGenero.setText(""+TipoGeneroConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoGenero.setToolTipText("Codigo");
		this.jLabelcodigoTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoGenero,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoGenero=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoGenero.setToolTipText(TipoGeneroConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoGenero = new GridBagLayout();
		this.jPanelcodigoTipoGenero.setLayout(this.gridaBagLayoutTipoGenero);


		jTextFieldcodigoTipoGenero= new JTextFieldMe();

		jTextFieldcodigoTipoGenero.setEnabled(false);
		jTextFieldcodigoTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoGenero,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoGeneroBusqueda= new JButtonMe();
		this.jButtoncodigoTipoGeneroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGeneroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGeneroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoGeneroBusqueda.setText("U");
		this.jButtoncodigoTipoGeneroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoGeneroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoGeneroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoGenero.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoGenero.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoGeneroBusqueda"));

		if(this.tipogeneroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoGeneroBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoGenero = new JLabelMe();
		this.jLabelnombreTipoGenero.setText(""+TipoGeneroConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGenero.setToolTipText("Nombre");
		this.jLabelnombreTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGenero,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGenero=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGenero.setToolTipText(TipoGeneroConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGenero = new GridBagLayout();
		this.jPanelnombreTipoGenero.setLayout(this.gridaBagLayoutTipoGenero);


		jTextAreanombreTipoGenero= new JTextAreaMe();
		jTextAreanombreTipoGenero.setEnabled(false);
		jTextAreanombreTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGenero.setLineWrap(true);
		jTextAreanombreTipoGenero.setWrapStyleWord(true);
		jTextAreanombreTipoGenero.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGenero.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGenero,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGenero = new JScrollPane(jTextAreanombreTipoGenero);
		jscrollPanenombreTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoGeneroBusqueda= new JButtonMe();
		this.jButtonnombreTipoGeneroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGeneroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGeneroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGeneroBusqueda.setText("U");
		this.jButtonnombreTipoGeneroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGeneroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGeneroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGenero.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGenero.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGeneroBusqueda"));

		if(this.tipogeneroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGeneroBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGenero() {
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
		//this.jInternalFrameDetalleTipoGenero = new TipoGeneroBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Genero DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGenero= new GridBagLayout();
		

		
		String sToolTipTipoGenero="";
		sToolTipTipoGenero=TipoGeneroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGenero+="(Nomina.TipoGenero)";
		}
		
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGenero+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGenero = new JButtonMe();
		this.jButtonModificarTipoGenero = new JButtonMe();
        this.jButtonActualizarTipoGenero = new JButtonMe();
        this.jButtonEliminarTipoGenero = new JButtonMe();
        this.jButtonCancelarTipoGenero = new JButtonMe();
        this.jButtonGuardarCambiosTipoGenero = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGenero = new JButtonMe();
		this.jButtonCerrarTipoGenero = new JButtonMe();
		
		this.jScrollPanelDatosTipoGenero = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGenero = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGenero = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Genero";
		
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Generoes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGenero.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGenero.setName("jPanelCamposTipoGenero"); 

		this.jPanelCamposOcultosTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGenero.setName("jPanelCamposOcultosTipoGenero"); 

        this.jPanelAccionesTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGenero.setToolTipText("Acciones");
        this.jPanelAccionesTipoGenero.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGenero.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGenero.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGenero.setText("Nuevo");
		this.jButtonModificarTipoGenero.setText("Editar");
        this.jButtonActualizarTipoGenero.setText("Actualizar");
        this.jButtonEliminarTipoGenero.setText("Eliminar");
        this.jButtonCancelarTipoGenero.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGenero.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGenero.setText("Guardar");
		this.jButtonCerrarTipoGenero.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGenero,"nuevo_button","Nuevo",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGenero,"modificar_button","Editar",this.tipogeneroSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGenero,"actualizar_button","Actualizar",this.tipogeneroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGenero,"eliminar_button","Eliminar",this.tipogeneroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGenero,"cancelar_button","Cancelar",this.tipogeneroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGenero,"guardarcambios_button","Guardar",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGenero,"guardarcambiostabla_button","Guardar",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGenero,"cerrar_button","Salir",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGenero.setToolTipText("Nuevo"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGenero.setToolTipText("Editar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGenero.setToolTipText("Actualizar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGenero.setToolTipText("Eliminar)"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGenero.setToolTipText("Cancelar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGenero.setToolTipText("Guardar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGenero.setToolTipText("Guardar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGenero.setToolTipText("Salir"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGenero";
		inputMap = this.jButtonNuevoTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGenero.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGenero"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGenero";
		inputMap = this.jButtonActualizarTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGenero"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGenero";
		inputMap = this.jButtonEliminarTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGenero"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGenero";
		inputMap = this.jButtonCancelarTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGenero"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGenero";
		inputMap = this.jButtonCerrarTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGenero"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGenero";
		inputMap = this.jButtonGuardarCambiosTablaTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGenero"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGenero = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGenero.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGenero.setToolTipText("Nuevo TipoGenero");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGenero = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGenero.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGenero.setToolTipText("Sin Cerrar Ventana TipoGenero");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGenero = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGenero.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGenero.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGenero = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGenero.setText("Accion");
		this.jComboBoxTiposAccionesTipoGenero.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGenero = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGenero.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGenero.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGenero = new JLabelMe();
		
		this.jLabelAccionesTipoGenero.setText("Acciones");		
		this.jLabelAccionesTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGenero();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGenero();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGenero=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGenero,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGenero.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGenero.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGenero.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGenero.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGenero.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGenero.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGenero = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGenero = new GridBagLayout();
		
		this.jPanelCamposTipoGenero.setLayout(gridaBagLayoutCamposTipoGenero);
		this.jPanelCamposOcultosTipoGenero.setLayout(gridaBagLayoutCamposOcultosTipoGenero);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGenero = new GridBagConstraints();
	this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGenero.gridy = 0;
	this.gridBagConstraintsTipoGenero.gridx = 0;
	this.gridBagConstraintsTipoGenero.ipadx = 0;
	this.gridBagConstraintsTipoGenero.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGenero.add(jLabelIdTipoGenero, this.gridBagConstraintsTipoGenero);



	this.gridBagConstraintsTipoGenero = new GridBagConstraints();
	this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGenero.gridy = 0;
	this.gridBagConstraintsTipoGenero.gridx = 1;
	this.gridBagConstraintsTipoGenero.ipadx = 0;
	this.gridBagConstraintsTipoGenero.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGenero.add(jTextFieldidTipoGenero, this.gridBagConstraintsTipoGenero);


	this.gridBagConstraintsTipoGenero = new GridBagConstraints();
	this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGenero.gridy = 0;
	this.gridBagConstraintsTipoGenero.gridx = 0;
	this.gridBagConstraintsTipoGenero.ipadx = 0;
	this.gridBagConstraintsTipoGenero.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoGenero.add(jLabelcodigoTipoGenero, this.gridBagConstraintsTipoGenero);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		//this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGenero.gridy = 0;
		this.gridBagConstraintsTipoGenero.gridx = 2;
		this.gridBagConstraintsTipoGenero.ipadx = 0;
		this.gridBagConstraintsTipoGenero.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoGenero.add(jButtoncodigoTipoGeneroBusqueda, this.gridBagConstraintsTipoGenero);
	}

	this.gridBagConstraintsTipoGenero = new GridBagConstraints();
	this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGenero.gridy = 0;
	this.gridBagConstraintsTipoGenero.gridx = 1;
	this.gridBagConstraintsTipoGenero.ipadx = 0;
	this.gridBagConstraintsTipoGenero.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoGenero.add(jTextFieldcodigoTipoGenero, this.gridBagConstraintsTipoGenero);


	this.gridBagConstraintsTipoGenero = new GridBagConstraints();
	this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGenero.gridy = 0;
	this.gridBagConstraintsTipoGenero.gridx = 0;
	this.gridBagConstraintsTipoGenero.ipadx = 0;
	this.gridBagConstraintsTipoGenero.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGenero.add(jLabelnombreTipoGenero, this.gridBagConstraintsTipoGenero);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		//this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGenero.gridy = 0;
		this.gridBagConstraintsTipoGenero.gridx = 2;
		this.gridBagConstraintsTipoGenero.ipadx = 0;
		this.gridBagConstraintsTipoGenero.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGenero.add(jButtonnombreTipoGeneroBusqueda, this.gridBagConstraintsTipoGenero);
	}

	this.gridBagConstraintsTipoGenero = new GridBagConstraints();
	this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGenero.gridy = 0;
	this.gridBagConstraintsTipoGenero.gridx = 1;
	this.gridBagConstraintsTipoGenero.ipadx = 0;
	this.gridBagConstraintsTipoGenero.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGenero.add(jscrollPanenombreTipoGenero, this.gridBagConstraintsTipoGenero);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGenero = new GridBagConstraints();
	this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGenero.gridy = iYPanelCamposTipoGenero;
	this.gridBagConstraintsTipoGenero.gridx = iXPanelCamposTipoGenero++;
	this.gridBagConstraintsTipoGenero.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGenero.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGenero.add(this.jPanelidTipoGenero, this.gridBagConstraintsTipoGenero);



	if(iXPanelCamposTipoGenero % 1==0) {
		iXPanelCamposTipoGenero=0;
		iYPanelCamposTipoGenero++;
	}
	this.gridBagConstraintsTipoGenero = new GridBagConstraints();
	this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGenero.gridy = iYPanelCamposTipoGenero;
	this.gridBagConstraintsTipoGenero.gridx = iXPanelCamposTipoGenero++;
	this.gridBagConstraintsTipoGenero.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGenero.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGenero.add(this.jPanelcodigoTipoGenero, this.gridBagConstraintsTipoGenero);



	if(iXPanelCamposTipoGenero % 1==0) {
		iXPanelCamposTipoGenero=0;
		iYPanelCamposTipoGenero++;
	}
	this.gridBagConstraintsTipoGenero = new GridBagConstraints();
	this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGenero.gridy = iYPanelCamposTipoGenero;
	this.gridBagConstraintsTipoGenero.gridx = iXPanelCamposTipoGenero++;
	this.gridBagConstraintsTipoGenero.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGenero.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGenero.add(this.jPanelnombreTipoGenero, this.gridBagConstraintsTipoGenero);



	if(iXPanelCamposTipoGenero % 1==0) {
		iXPanelCamposTipoGenero=0;
		iYPanelCamposTipoGenero++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGenero= new GridBagLayout();
		this.jPanelAccionesTipoGenero.setLayout(gridaBagLayoutAccionesTipoGenero);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGenero= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGenero.setLayout(gridaBagLayoutAccionesFormularioTipoGenero);
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGenero.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGenero.add(this.jComboBoxTiposAccionesFormularioTipoGenero, this.gridBagConstraintsTipoGenero);

		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGenero.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGenero.add(this.jCheckBoxPostAccionNuevoTipoGenero, this.gridBagConstraintsTipoGenero);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogeneroSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGenero.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGenero.add(this.jCheckBoxPostAccionSinCerrarTipoGenero, this.gridBagConstraintsTipoGenero);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogeneroSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGenero.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGenero.add(this.jCheckBoxPostAccionSinMensajeTipoGenero, this.gridBagConstraintsTipoGenero);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = 0;
		this.gridBagConstraintsTipoGenero.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGenero.add(this.jButtonModificarTipoGenero, this.gridBagConstraintsTipoGenero);							

		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = 0;
		this.gridBagConstraintsTipoGenero.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGenero.add(this.jButtonEliminarTipoGenero, this.gridBagConstraintsTipoGenero);
		
			
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = 0;		
		this.gridBagConstraintsTipoGenero.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGenero.add(this.jButtonActualizarTipoGenero, this.gridBagConstraintsTipoGenero);


		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = 0;		
		this.gridBagConstraintsTipoGenero.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGenero.add(this.jButtonGuardarCambiosTipoGenero, this.gridBagConstraintsTipoGenero);	
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = 0;		
		this.gridBagConstraintsTipoGenero.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGenero.add(this.jButtonCancelarTipoGenero, this.gridBagConstraintsTipoGenero);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGenero = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGenero);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();						
			this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGenero.gridx = 0;		
			//this.gridBagConstraintsTipoGenero.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGenero.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGenero.gridx =0;
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGenero.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGenero, this.gridBagConstraintsTipoGenero);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGeneroJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGenero = new TipoGeneroBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Genero DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Genero DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Genero Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGeneroModel tipogeneroModel=new TipoGeneroModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGeneroModel.TipoGeneroFocusTraversalPolicy tipogeneroFocusTraversalPolicy = tipogeneroModel.new TipoGeneroFocusTraversalPolicy(this);
			
			//tipogeneroFocusTraversalPolicy.settipogeneroJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogeneroModel);
			
			
			this.jContentPaneDetalleTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGenero = new GridBagLayout();	
			this.jContentPaneDetalleTipoGenero.setLayout(gridaBagLayoutDetalleTipoGenero);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGenero = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGenero = new GridBagConstraints();
				this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGenero.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGenero.add(jTtoolBarDetalleTipoGenero, gridBagConstraintsTipoGenero);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGenero=   new JScrollPane(jContentPaneDetalleTipoGenero,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGenero.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGenero.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGenero.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGenero=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGenero.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGenero.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGenero.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGenero.gridx = 0;
	        
			this.jContentPaneDetalleTipoGenero.add(jPanelCamposTipoGenero, gridBagConstraintsTipoGenero);
			
			
			
			
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
						&& tipogeneroSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(this.puedeCargarPorParteCargaFamiliar_NM,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(this.puedeCargarPorParteCargaFamiliar,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(this.puedeCargarPorParteParametroCarteraDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(this.puedeCargarPorParteSubCliente,false,-1);
					
					if(this.tipogeneroSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGenero= new GridBagConstraints();
						this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGenero.gridx = 0;
						this.jContentPaneDetalleTipoGenero.add(this.jTabbedPaneRelacionesTipoGenero, this.gridBagConstraintsTipoGenero);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGenero.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGenero.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGenero = new GridBagConstraints();
					this.gridBagConstraintsTipoGenero.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGenero.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGenero.add(jPanelCamposOcultosTipoGenero, gridBagConstraintsTipoGenero);
				
					this.jPanelCamposOcultosTipoGenero.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;//19;		
	        this.gridBagConstraintsTipoGenero.gridx = 0;
	        this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGenero.add(this.jPanelAccionesFormularioTipoGenero, this.gridBagConstraintsTipoGenero);							
			
			
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
	        this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones;//19;		
	        this.gridBagConstraintsTipoGenero.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGenero.add(this.jPanelAccionesTipoGenero, this.gridBagConstraintsTipoGenero);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGenero);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGenero=   new JScrollPane(this.jPanelCamposTipoGenero,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGenero.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGenero.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGenero.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGenero.gridx = 0;
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGenero.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGenero, this.gridBagConstraintsTipoGenero);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGenero.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGenero, this.gridBagConstraintsTipoGenero);			
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGenero.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGenero, this.gridBagConstraintsTipoGenero);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGenero.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGenero, this.gridBagConstraintsTipoGenero);
			
			
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGenero.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGenero, this.gridBagConstraintsTipoGenero);
		
			
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGenero.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGenero, this.gridBagConstraintsTipoGenero);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGenero;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGenero;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		this.cargafamiliar_nmSessionBean.setConGuardarRelaciones(false);
		this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);

		this.cargafamiliar_nmBeanSwingJInternalFrame=null;//new CargaFamiliar_NMBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargafamiliar_nmBeanSwingJInternalFramePopup=new CargaFamiliar_NMBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargafamiliar_nmBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {

				CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);

				this.cargafamiliar_nmBeanSwingJInternalFrame=new CargaFamiliar_NMBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargafamiliar_nmBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargafamiliar_nmBeanSwingJInternalFrame.setcargafamiliar_nmSessionBean(this.cargafamiliar_nmSessionBean);

				//this.gridBagConstraintsTipoGenero = new GridBagConstraints();
				//this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGenero.gridx = 0;
				//this.jContentPaneDetalleTipoGenero.add(this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGenero);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGenero.add("Carga Familiar_ N Mes",this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGenero.setComponentAt(iIndexTab,this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
				}

				//CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(false);
				this.cargafamiliar_nmBeanSwingJInternalFrame=null;//new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargaFamiliar_NM) {
					this.jTabbedPaneRelacionesTipoGenero.add("Carga Familiar_ N Mes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCargaFamiliar(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		this.cargafamiliarSessionBean.setConGuardarRelaciones(false);
		this.cargafamiliarSessionBean.setEsGuardarRelacionado(true);

		this.cargafamiliarBeanSwingJInternalFrame=null;//new CargaFamiliarBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargafamiliarBeanSwingJInternalFramePopup=new CargaFamiliarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargafamiliarBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {

				CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargafamiliarSessionBean.setEsGuardarRelacionado(true);

				this.cargafamiliarBeanSwingJInternalFrame=new CargaFamiliarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargafamiliarBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargafamiliarBeanSwingJInternalFrame.setcargafamiliarSessionBean(this.cargafamiliarSessionBean);

				//this.gridBagConstraintsTipoGenero = new GridBagConstraints();
				//this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGenero.gridx = 0;
				//this.jContentPaneDetalleTipoGenero.add(this.cargafamiliarBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGenero);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGenero.add("Carga Familiares",this.cargafamiliarBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGenero.setComponentAt(iIndexTab,this.cargafamiliarBeanSwingJInternalFrame.getContentPane());
				}

				//CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargafamiliarSessionBean.setEsGuardarRelacionado(false);
				this.cargafamiliarBeanSwingJInternalFrame=null;//new CargaFamiliarBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargaFamiliar) {
					this.jTabbedPaneRelacionesTipoGenero.add("Carga Familiares",new JPanel());
				}
			}
		}
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

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsTipoGenero = new GridBagConstraints();
				//this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGenero.gridx = 0;
				//this.jContentPaneDetalleTipoGenero.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGenero);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGenero.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGenero.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesTipoGenero.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoSessionBean=new EmpleadoSessionBean();
		this.empleadoSessionBean.setConGuardarRelaciones(false);
		this.empleadoSessionBean.setEsGuardarRelacionado(true);

		this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsTipoGenero = new GridBagConstraints();
				//this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGenero.gridx = 0;
				//this.jContentPaneDetalleTipoGenero.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGenero);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGenero.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGenero.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesTipoGenero.add("Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocarteradefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocarteradefectoBeanSwingJInternalFrame.setparametrocarteradefectoSessionBean(this.parametrocarteradefectoSessionBean);

				//this.gridBagConstraintsTipoGenero = new GridBagConstraints();
				//this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGenero.gridx = 0;
				//this.jContentPaneDetalleTipoGenero.add(this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGenero);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGenero.add("Parametro Cartera Defectos",this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGenero.setComponentAt(iIndexTab,this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCarteraDefecto) {
					this.jTabbedPaneRelacionesTipoGenero.add("Parametro Cartera Defectos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSubCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subclienteSessionBean=new SubClienteSessionBean();
		this.subclienteSessionBean.setConGuardarRelaciones(false);
		this.subclienteSessionBean.setEsGuardarRelacionado(true);

		this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {

				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;
				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.subclienteSessionBean.setEsGuardarRelacionado(true);

				this.subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.subclienteBeanSwingJInternalFrame.setsubclienteSessionBean(this.subclienteSessionBean);

				//this.gridBagConstraintsTipoGenero = new GridBagConstraints();
				//this.gridBagConstraintsTipoGenero.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGenero.gridx = 0;
				//this.jContentPaneDetalleTipoGenero.add(this.subclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGenero);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGenero.add("Sub Clientes",this.subclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGenero.setComponentAt(iIndexTab,this.subclienteBeanSwingJInternalFrame.getContentPane());
				}

				//SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subclienteSessionBean.setEsGuardarRelacionado(false);
				this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubCliente) {
					this.jTabbedPaneRelacionesTipoGenero.add("Sub Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<TipoGenero> tipogeneros,TipoGenero tipogenero,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.tipogeneroLogic.getConnexion());

					clienteBeanSwingJInternalFrame.settipogenerosForeignKey(tipogeneros);
					clienteBeanSwingJInternalFrame.settipogeneroForeignKey(tipogenero);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidTipoGeneroActual(tipogenero.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGenero(true);
					clienteBeanSwingJInternalFrame.setid_tipo_generoFK_IdTipoGenero(tipogenero.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGeneroForeignKey(tipogenero,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGenero");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGenero");
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

		public void cargarCargaFamiliar_NMBeanSwingJInternalFrame(List<TipoGenero> tipogeneros,TipoGenero tipogenero,CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargafamiliar_nmBeanSwingJInternalFrame=new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargafamiliar_nmBeanSwingJInternalFrame.getCargaFamiliar_NMLogic().setConnexion(this.tipogeneroLogic.getConnexion());

					cargafamiliar_nmBeanSwingJInternalFrame.settipogenerosForeignKey(tipogeneros);
					cargafamiliar_nmBeanSwingJInternalFrame.settipogeneroForeignKey(tipogenero);
					cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
					cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setlidTipoGeneroActual(tipogenero.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargafamiliar_nmBeanSwingJInternalFrame.cargarCombosForeignKeyCargaFamiliar_NM(cargafamiliar_nmBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargafamiliar_nmBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGenero(true);
					cargafamiliar_nmBeanSwingJInternalFrame.setid_tipo_generoFK_IdTipoGenero(tipogenero.getId());

					if(!this.conCargarFormDetalle) {
						cargafamiliar_nmBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargafamiliar_nmBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGeneroForeignKey(tipogenero,1,false,true,true);
					cargafamiliar_nmBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargafamiliar_nmBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGenero");
					cargafamiliar_nmBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGenero");
					cargafamiliar_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar_NM(true);
					cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargaFamiliar_NM("n",cargafamiliar_nmBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargafamiliar_nmBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargafamiliar_nmBeanSwingJInternalFrame.setAutoscrolls(true);
					cargafamiliar_nmBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("relacionado");
					} else {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("no_relacionado");
					}

					cargafamiliar_nmBeanSwingJInternalFrame.getjButtonRecargarInformacionCargaFamiliar_NM().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSubClienteBeanSwingJInternalFrame(List<TipoGenero> tipogeneros,TipoGenero tipogenero,SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subclienteBeanSwingJInternalFrame.getSubClienteLogic().setConnexion(this.tipogeneroLogic.getConnexion());

					subclienteBeanSwingJInternalFrame.settipogenerosForeignKey(tipogeneros);
					subclienteBeanSwingJInternalFrame.settipogeneroForeignKey(tipogenero);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setlidTipoGeneroActual(tipogenero.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					subclienteBeanSwingJInternalFrame.cargarCombosForeignKeySubCliente(subclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					subclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGenero(true);
					subclienteBeanSwingJInternalFrame.setid_tipo_generoFK_IdTipoGenero(tipogenero.getId());

					if(!this.conCargarFormDetalle) {
						subclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					subclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGeneroForeignKey(tipogenero,1,false,true,true);
					subclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGenero");
					subclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGenero");
					subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(true);
					subclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSubCliente("n",subclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, subclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					subclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					subclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("relacionado");
					} else {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");
					}

					subclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionSubCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoBeanSwingJInternalFrame(List<TipoGenero> tipogeneros,TipoGenero tipogenero,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.tipogeneroLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.settipogenerosForeignKey(tipogeneros);
					empleadoBeanSwingJInternalFrame.settipogeneroForeignKey(tipogenero);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidTipoGeneroActual(tipogenero.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGenero(true);
					empleadoBeanSwingJInternalFrame.setid_tipo_generoFK_IdTipoGenero(tipogenero.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGeneroForeignKey(tipogenero,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGenero");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGenero");
					empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(true);
					empleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleado("n",empleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("relacionado");
					} else {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");
					}

					empleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroCarteraDefectoBeanSwingJInternalFrame(List<TipoGenero> tipogeneros,TipoGenero tipogenero,ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocarteradefectoBeanSwingJInternalFrame.getParametroCarteraDefectoLogic().setConnexion(this.tipogeneroLogic.getConnexion());

					parametrocarteradefectoBeanSwingJInternalFrame.settipogenerosForeignKey(tipogeneros);
					parametrocarteradefectoBeanSwingJInternalFrame.settipogeneroForeignKey(tipogenero);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setlidTipoGeneroActual(tipogenero.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocarteradefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCarteraDefecto(parametrocarteradefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGenero(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setid_tipo_generoFK_IdTipoGenero(tipogenero.getId());

					if(!this.conCargarFormDetalle) {
						parametrocarteradefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocarteradefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGeneroForeignKey(tipogenero,1,false,true,true);
					parametrocarteradefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocarteradefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGenero");
					parametrocarteradefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGenero");
					parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(true);
					parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCarteraDefecto("n",parametrocarteradefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocarteradefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocarteradefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("relacionado");
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");
					}

					parametrocarteradefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCarteraDefecto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCargaFamiliarBeanSwingJInternalFrame(List<TipoGenero> tipogeneros,TipoGenero tipogenero,CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargafamiliarBeanSwingJInternalFrame=new CargaFamiliarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargafamiliarBeanSwingJInternalFrame.getCargaFamiliarLogic().setConnexion(this.tipogeneroLogic.getConnexion());

					cargafamiliarBeanSwingJInternalFrame.settipogenerosForeignKey(tipogeneros);
					cargafamiliarBeanSwingJInternalFrame.settipogeneroForeignKey(tipogenero);
					cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
					cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setlidTipoGeneroActual(tipogenero.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargafamiliarBeanSwingJInternalFrame.cargarCombosForeignKeyCargaFamiliar(cargafamiliarBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargafamiliarBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGenero(true);
					cargafamiliarBeanSwingJInternalFrame.setid_tipo_generoFK_IdTipoGenero(tipogenero.getId());

					if(!this.conCargarFormDetalle) {
						cargafamiliarBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargafamiliarBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGeneroForeignKey(tipogenero,1,false,true,true);
					cargafamiliarBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargafamiliarBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGenero");
					cargafamiliarBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGenero");
					cargafamiliarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar(true);
					cargafamiliarBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargaFamiliar("n",cargafamiliarBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargafamiliarBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargafamiliarBeanSwingJInternalFrame.setAutoscrolls(true);
					cargafamiliarBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("relacionado");
					} else {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("no_relacionado");
					}

					cargafamiliarBeanSwingJInternalFrame.getjButtonRecargarInformacionCargaFamiliar().setVisible(false);

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
