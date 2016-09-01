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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.TipoComprobanteConstantesFunciones;

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
public class TipoComprobanteDetalleFormJInternalFrame extends TipoComprobanteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoComprobante;
	
	protected JMenuBar jmenuBarDetalleTipoComprobante;
	
	protected JMenu jmenuDetalleTipoComprobante;
	protected JMenu jmenuDetalleArchivoTipoComprobante;
	protected JMenu jmenuDetalleAccionesTipoComprobante;
	protected JMenu jmenuDetalleDatosTipoComprobante;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoComprobante;	
	protected GridBagConstraints gridBagConstraintsTipoComprobante;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoComprobanteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoComprobante;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	
	

	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;
	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransaccionLocal=false;
	public TransaccionLocalSessionBean transaccionlocalSessionBean;

	public TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame=null;
	public TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransaccion=false;
	public TransaccionSessionBean transaccionSessionBean;

	public DocumentoAnuladoBeanSwingJInternalFrame documentoanuladoBeanSwingJInternalFrame=null;
	public DocumentoAnuladoBeanSwingJInternalFrame documentoanuladoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDocumentoAnulado=false;
	public DocumentoAnuladoSessionBean documentoanuladoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoComprobanteLogic tipocomprobanteLogic;
	
	public JScrollPane jScrollPanelDatosTipoComprobante;
	public JScrollPane jScrollPanelDatosEdicionTipoComprobante;
	public JScrollPane jScrollPanelDatosGeneralTipoComprobante;
	
	protected JPanel jPanelCamposTipoComprobante;    
	protected JPanel jPanelCamposOcultosTipoComprobante;    	
	protected JPanel jPanelAccionesTipoComprobante;
	protected JPanel jPanelAccionesFormularioTipoComprobante;
    
	
	
	protected Integer iXPanelCamposTipoComprobante=0;
	protected Integer iYPanelCamposTipoComprobante=0;
	
	protected Integer iXPanelCamposOcultosTipoComprobante=0;
	protected Integer iYPanelCamposOcultosTipoComprobante=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoComprobante;
	public JButton jButtonModificarTipoComprobante;
	public JButton jButtonActualizarTipoComprobante;
    public JButton jButtonEliminarTipoComprobante;
	public JButton jButtonCancelarTipoComprobante;
    public JButton jButtonGuardarCambiosTipoComprobante;
	public JButton jButtonGuardarCambiosTablaTipoComprobante;
	protected JButton jButtonCerrarTipoComprobante;
	
	
	protected JButton jButtonProcesarInformacionTipoComprobante;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoComprobante;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoComprobante;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoComprobante;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoComprobante;
	protected JButton jButtonModificarToolBarTipoComprobante;
	protected JButton jButtonActualizarToolBarTipoComprobante;
    protected JButton jButtonEliminarToolBarTipoComprobante;
	protected JButton jButtonCancelarToolBarTipoComprobante;
    protected JButton jButtonGuardarCambiosToolBarTipoComprobante;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoComprobante;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoComprobante;
	protected JButton jButtonCerrarToolBarTipoComprobante;
	
	protected JButton jButtonProcesarInformacionToolBarTipoComprobante;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoComprobante;
	protected JMenuItem jMenuItemModificarTipoComprobante;
	protected JMenuItem jMenuItemActualizarTipoComprobante;
    protected JMenuItem jMenuItemEliminarTipoComprobante;
	protected JMenuItem jMenuItemCancelarTipoComprobante;
    protected JMenuItem jMenuItemGuardarCambiosTipoComprobante;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoComprobante;
	protected JMenuItem jMenuItemCerrarTipoComprobante;
	protected JMenuItem jMenuItemDetalleCerrarTipoComprobante;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoComprobante;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoComprobante;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoComprobante;
	protected JMenuItem jMenuItemMostrarOcultarTipoComprobante;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoComprobante;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoComprobante;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoComprobante;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoComprobante;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoComprobante;
	public JLabel jLabelIdTipoComprobante;
	public JLabel jLabelidTipoComprobante;
	public JButton jButtonidTipoComprobanteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoComprobante;
	public JLabel jLabelnombreTipoComprobante;
	public JTextArea jTextAreanombreTipoComprobante;
	public JScrollPane jscrollPanenombreTipoComprobante;
	public JButton jButtonnombreTipoComprobanteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoComprobante;
	public JLabel jLabelid_empresaTipoComprobante;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoComprobante;
	public JButton jButtonid_empresaTipoComprobante= new JButtonMe();
	public JButton jButtonid_empresaTipoComprobanteUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoComprobanteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoComprobante;
	
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
	
	public TipoComprobanteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoComprobante=new JPanel();
				this.jPanelAccionesFormularioTipoComprobante=new JPanel();
				this.jmenuBarDetalleTipoComprobante=new JMenuBar();
				this.jTtoolBarDetalleTipoComprobante=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComprobanteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoComprobante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoComprobanteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoComprobante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComprobanteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoComprobante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComprobanteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoComprobante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComprobanteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoComprobante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoComprobante() {
		return this.jButtonActualizarToolBarTipoComprobante;
	}
	
	public JButton getjButtonEliminarToolBarTipoComprobante() {
		return this.jButtonEliminarToolBarTipoComprobante;
	}
	
	public JButton getjButtonCancelarToolBarTipoComprobante() {
		return this.jButtonCancelarToolBarTipoComprobante;
	}		
	
	public JButton getjButtonProcesarInformacionTipoComprobante() {
		return this.jButtonProcesarInformacionTipoComprobante;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoComprobante)	{
		this.jButtonProcesarInformacionTipoComprobante = jButtonProcesarInformacionTipoComprobante;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoComprobante() {
		return this.jComboBoxTiposAccionesTipoComprobante;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoComprobante(
			JComboBox jComboBoxTiposRelacionesTipoComprobante) {
		this.jComboBoxTiposRelacionesTipoComprobante = jComboBoxTiposRelacionesTipoComprobante;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoComprobante(
			JComboBox jComboBoxTiposAccionesTipoComprobante) {
		this.jComboBoxTiposAccionesTipoComprobante = jComboBoxTiposAccionesTipoComprobante;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoComprobante() {
		return this.jComboBoxTiposAccionesFormularioTipoComprobante;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoComprobante(
			JComboBox jComboBoxTiposAccionesFormularioTipoComprobante) {
		this.jComboBoxTiposAccionesFormularioTipoComprobante = jComboBoxTiposAccionesFormularioTipoComprobante;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
		
		this.tipocomprobanteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocomprobanteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocomprobanteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		//this.transaccionSessionBean=new TransaccionSessionBean();
		//this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoComprobanteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Comprobante MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoComprobanteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoComprobante= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoComprobante=new JButtonMe();
				this.jButtonModificarToolBarTipoComprobante=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoComprobante,this.jTtoolBarDetalleTipoComprobante,
							"actualizar","actualizar","Actualizar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoComprobante,this.jTtoolBarDetalleTipoComprobante,
							"eliminar","eliminar","Eliminar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoComprobante,this.jTtoolBarDetalleTipoComprobante,
							"cancelar","cancelar","Cancelar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoComprobante,this.jTtoolBarDetalleTipoComprobante,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoComprobante,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoComprobante,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoComprobante,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoComprobante=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoComprobante=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoComprobante=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoComprobante=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoComprobante=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoComprobante= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoComprobante.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoComprobante,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoComprobante= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoComprobante.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoComprobante,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoComprobante= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoComprobante.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoComprobante,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoComprobante= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoComprobante.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoComprobante,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoComprobante= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoComprobante.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoComprobante,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoComprobante= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoComprobante.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoComprobante,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoComprobante= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoComprobante.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoComprobante,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoComprobante= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoComprobante.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoComprobante,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoComprobante= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoComprobante.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoComprobante,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoComprobante= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoComprobante.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoComprobante,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoComprobante.add(this.jMenuItemDetalleCerrarTipoComprobante);
		
		this.jmenuDetalleAccionesTipoComprobante.add(this.jMenuItemActualizarTipoComprobante);
		this.jmenuDetalleAccionesTipoComprobante.add(this.jMenuItemEliminarTipoComprobante);
		this.jmenuDetalleAccionesTipoComprobante.add(this.jMenuItemCancelarTipoComprobante);		
		
		//this.jmenuDetalleDatosTipoComprobante.add(this.jMenuItemDetalleAbrirOrderByTipoComprobante);				
		this.jmenuDetalleDatosTipoComprobante.add(this.jMenuItemDetalleMostarOcultarTipoComprobante);				
				
		//this.jmenuDetalleAccionesTipoComprobante.add(this.jMenuItemGuardarCambiosTipoComprobante);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoComprobante.add(this.jmenuDetalleArchivoTipoComprobante);		
		this.jmenuBarDetalleTipoComprobante.add(this.jmenuDetalleAccionesTipoComprobante);		
		this.jmenuBarDetalleTipoComprobante.add(this.jmenuDetalleDatosTipoComprobante);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoComprobante.add(this.jmenuDetalleTipoComprobante);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoComprobante);				
	}
	
	
	public void inicializarElementosCamposTipoComprobante() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoComprobante = new JLabelMe();
		jLabelIdTipoComprobante.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoComprobante,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoComprobante = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoComprobante.setToolTipText(TipoComprobanteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoComprobante= new GridBagLayout();

		this.jPanelidTipoComprobante.setLayout(this.gridaBagLayoutTipoComprobante);

		jLabelidTipoComprobante = new JLabel();
		jLabelidTipoComprobante.setText("Id");

		jLabelidTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoComprobante = new JLabelMe();
		this.jLabelnombreTipoComprobante.setText(""+TipoComprobanteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoComprobante.setToolTipText("Nombre");
		this.jLabelnombreTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoComprobante,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoComprobante=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoComprobante.setToolTipText(TipoComprobanteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoComprobante = new GridBagLayout();
		this.jPanelnombreTipoComprobante.setLayout(this.gridaBagLayoutTipoComprobante);


		jTextAreanombreTipoComprobante= new JTextAreaMe();
		jTextAreanombreTipoComprobante.setEnabled(false);
		jTextAreanombreTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoComprobante.setLineWrap(true);
		jTextAreanombreTipoComprobante.setWrapStyleWord(true);
		jTextAreanombreTipoComprobante.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoComprobante.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoComprobante,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoComprobante = new JScrollPane(jTextAreanombreTipoComprobante);
		jscrollPanenombreTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),70));
		jscrollPanenombreTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),70));
		jscrollPanenombreTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),70));

		this.jButtonnombreTipoComprobanteBusqueda= new JButtonMe();
		this.jButtonnombreTipoComprobanteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoComprobanteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoComprobanteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoComprobanteBusqueda.setText("U");
		this.jButtonnombreTipoComprobanteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoComprobanteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoComprobanteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoComprobante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoComprobante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoComprobanteBusqueda"));

		if(this.tipocomprobanteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoComprobanteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoComprobante() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoComprobante = new JLabelMe();
		this.jLabelid_empresaTipoComprobante.setText(""+TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoComprobante.setToolTipText("Empresa");
		this.jLabelid_empresaTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoComprobante,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoComprobante=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoComprobante.setToolTipText(TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoComprobante = new GridBagLayout();
		this.jPanelid_empresaTipoComprobante.setLayout(this.gridaBagLayoutTipoComprobante);


		jComboBoxid_empresaTipoComprobante= new JComboBoxMe();
		jComboBoxid_empresaTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoComprobante,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoComprobante.setEnabled(false);

		this.jButtonid_empresaTipoComprobante= new JButtonMe();
		this.jButtonid_empresaTipoComprobante.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoComprobante.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoComprobante.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoComprobante.setText("Buscar");
		this.jButtonid_empresaTipoComprobante.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoComprobante.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoComprobante,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoComprobante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoComprobante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoComprobante"));

		this.jButtonid_empresaTipoComprobanteBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoComprobanteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComprobanteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComprobanteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoComprobanteBusqueda.setText("U");
		this.jButtonid_empresaTipoComprobanteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoComprobanteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoComprobanteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoComprobante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoComprobante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoComprobanteBusqueda"));

		if(this.tipocomprobanteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoComprobanteBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoComprobanteUpdate= new JButtonMe();
		this.jButtonid_empresaTipoComprobanteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComprobanteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComprobanteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoComprobanteUpdate.setText("U");
		this.jButtonid_empresaTipoComprobanteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoComprobanteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoComprobanteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoComprobante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoComprobante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoComprobanteUpdate"));



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
		//this.jInternalFrameDetalleTipoComprobante = new TipoComprobanteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Comprobante DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoComprobante= new GridBagLayout();
		

		
		String sToolTipTipoComprobante="";
		sToolTipTipoComprobante=TipoComprobanteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoComprobante+="(Contabilidad.TipoComprobante)";
		}
		
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoComprobante+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoComprobante = new JButtonMe();
		this.jButtonModificarTipoComprobante = new JButtonMe();
        this.jButtonActualizarTipoComprobante = new JButtonMe();
        this.jButtonEliminarTipoComprobante = new JButtonMe();
        this.jButtonCancelarTipoComprobante = new JButtonMe();
        this.jButtonGuardarCambiosTipoComprobante = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoComprobante = new JButtonMe();
		this.jButtonCerrarTipoComprobante = new JButtonMe();
		
		this.jScrollPanelDatosTipoComprobante = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoComprobante = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoComprobante = new JScrollPane();
				
		
		
		this.jPanelCamposTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Comprobante";
		
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comprobantes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoComprobante.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoComprobante.setName("jPanelCamposTipoComprobante"); 

		this.jPanelCamposOcultosTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoComprobante.setName("jPanelCamposOcultosTipoComprobante"); 

        this.jPanelAccionesTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoComprobante.setToolTipText("Acciones");
        this.jPanelAccionesTipoComprobante.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoComprobante.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoComprobante.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoComprobante.setText("Nuevo");
		this.jButtonModificarTipoComprobante.setText("Editar");
        this.jButtonActualizarTipoComprobante.setText("Actualizar");
        this.jButtonEliminarTipoComprobante.setText("Eliminar");
        this.jButtonCancelarTipoComprobante.setText("Cancelar");
        this.jButtonGuardarCambiosTipoComprobante.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoComprobante.setText("Guardar");
		this.jButtonCerrarTipoComprobante.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoComprobante,"nuevo_button","Nuevo",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoComprobante,"modificar_button","Editar",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoComprobante,"actualizar_button","Actualizar",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoComprobante,"eliminar_button","Eliminar",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoComprobante,"cancelar_button","Cancelar",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoComprobante,"guardarcambios_button","Guardar",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoComprobante,"guardarcambiostabla_button","Guardar",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoComprobante,"cerrar_button","Salir",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoComprobante.setToolTipText("Nuevo"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoComprobante.setToolTipText("Editar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoComprobante.setToolTipText("Actualizar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoComprobante.setToolTipText("Eliminar)"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoComprobante.setToolTipText("Cancelar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoComprobante.setToolTipText("Guardar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoComprobante.setToolTipText("Guardar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoComprobante.setToolTipText("Salir"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoComprobante";
		inputMap = this.jButtonNuevoTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoComprobante.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoComprobante"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoComprobante";
		inputMap = this.jButtonActualizarTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoComprobante"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoComprobante";
		inputMap = this.jButtonEliminarTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoComprobante"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoComprobante";
		inputMap = this.jButtonCancelarTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoComprobante"));
		
		//CERRAR		
		sMapKey = "CerrarTipoComprobante";
		inputMap = this.jButtonCerrarTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoComprobante"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoComprobante";
		inputMap = this.jButtonGuardarCambiosTablaTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoComprobante"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoComprobante = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoComprobante.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoComprobante.setToolTipText("Nuevo TipoComprobante");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoComprobante = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoComprobante.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoComprobante.setToolTipText("Sin Cerrar Ventana TipoComprobante");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoComprobante = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoComprobante.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoComprobante.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoComprobante = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoComprobante.setText("Accion");
		this.jComboBoxTiposAccionesTipoComprobante.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoComprobante = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoComprobante.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoComprobante.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoComprobante = new JLabelMe();
		
		this.jLabelAccionesTipoComprobante.setText("Acciones");		
		this.jLabelAccionesTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoComprobante();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoComprobante();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoComprobante=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoComprobante,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoComprobante.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoComprobante.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoComprobante.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoComprobante.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoComprobante.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoComprobante.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoComprobante = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoComprobante = new GridBagLayout();
		
		this.jPanelCamposTipoComprobante.setLayout(gridaBagLayoutCamposTipoComprobante);
		this.jPanelCamposOcultosTipoComprobante.setLayout(gridaBagLayoutCamposOcultosTipoComprobante);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
	this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComprobante.gridy = 0;
	this.gridBagConstraintsTipoComprobante.gridx = 0;
	this.gridBagConstraintsTipoComprobante.ipadx = 0;
	this.gridBagConstraintsTipoComprobante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoComprobante.add(jLabelIdTipoComprobante, this.gridBagConstraintsTipoComprobante);



	this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
	this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComprobante.gridy = 0;
	this.gridBagConstraintsTipoComprobante.gridx = 1;
	this.gridBagConstraintsTipoComprobante.ipadx = 0;
	this.gridBagConstraintsTipoComprobante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoComprobante.add(jLabelidTipoComprobante, this.gridBagConstraintsTipoComprobante);


	this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
	this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComprobante.gridy = 0;
	this.gridBagConstraintsTipoComprobante.gridx = 0;
	this.gridBagConstraintsTipoComprobante.ipadx = 0;
	this.gridBagConstraintsTipoComprobante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoComprobante.add(jLabelid_empresaTipoComprobante, this.gridBagConstraintsTipoComprobante);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		//this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = 0;
		this.gridBagConstraintsTipoComprobante.gridx = 2;
		this.gridBagConstraintsTipoComprobante.ipadx = 0;
		this.gridBagConstraintsTipoComprobante.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoComprobante.add(jButtonid_empresaTipoComprobanteBusqueda, this.gridBagConstraintsTipoComprobante);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		//this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = 0;
		this.gridBagConstraintsTipoComprobante.gridx = 3;
		this.gridBagConstraintsTipoComprobante.ipadx = 0;
		this.gridBagConstraintsTipoComprobante.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoComprobante.add(jButtonid_empresaTipoComprobanteUpdate, this.gridBagConstraintsTipoComprobante);
	}

	this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
	this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComprobante.gridy = 0;
	this.gridBagConstraintsTipoComprobante.gridx = 1;
	this.gridBagConstraintsTipoComprobante.ipadx = 0;
	this.gridBagConstraintsTipoComprobante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoComprobante.add(jComboBoxid_empresaTipoComprobante, this.gridBagConstraintsTipoComprobante);


	this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
	this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComprobante.gridy = 0;
	this.gridBagConstraintsTipoComprobante.gridx = 0;
	this.gridBagConstraintsTipoComprobante.ipadx = 0;
	this.gridBagConstraintsTipoComprobante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoComprobante.add(jLabelnombreTipoComprobante, this.gridBagConstraintsTipoComprobante);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		//this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = 0;
		this.gridBagConstraintsTipoComprobante.gridx = 2;
		this.gridBagConstraintsTipoComprobante.ipadx = 0;
		this.gridBagConstraintsTipoComprobante.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoComprobante.add(jButtonnombreTipoComprobanteBusqueda, this.gridBagConstraintsTipoComprobante);
	}

	this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
	this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComprobante.gridy = 0;
	this.gridBagConstraintsTipoComprobante.gridx = 1;
	this.gridBagConstraintsTipoComprobante.ipadx = 0;
	this.gridBagConstraintsTipoComprobante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoComprobante.add(jscrollPanenombreTipoComprobante, this.gridBagConstraintsTipoComprobante);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
	this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoComprobante.gridy = iYPanelCamposTipoComprobante;
	this.gridBagConstraintsTipoComprobante.gridx = iXPanelCamposTipoComprobante++;
	this.gridBagConstraintsTipoComprobante.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoComprobante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoComprobante.add(this.jPanelidTipoComprobante, this.gridBagConstraintsTipoComprobante);



	if(iXPanelCamposTipoComprobante % 1==0) {
		iXPanelCamposTipoComprobante=0;
		iYPanelCamposTipoComprobante++;
	}
	this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
	this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoComprobante.gridy = iYPanelCamposTipoComprobante;
	this.gridBagConstraintsTipoComprobante.gridx = iXPanelCamposTipoComprobante++;
	this.gridBagConstraintsTipoComprobante.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoComprobante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoComprobante.add(this.jPanelnombreTipoComprobante, this.gridBagConstraintsTipoComprobante);



	if(iXPanelCamposTipoComprobante % 1==0) {
		iXPanelCamposTipoComprobante=0;
		iYPanelCamposTipoComprobante++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
	this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoComprobante.gridy = iYPanelCamposOcultosTipoComprobante;
	this.gridBagConstraintsTipoComprobante.gridx = iXPanelCamposOcultosTipoComprobante++;
	this.gridBagConstraintsTipoComprobante.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoComprobante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoComprobante.add(this.jPanelid_empresaTipoComprobante, this.gridBagConstraintsTipoComprobante);



	if(iXPanelCamposOcultosTipoComprobante % 1==0) {
		iXPanelCamposOcultosTipoComprobante=0;
		iYPanelCamposOcultosTipoComprobante++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoComprobante= new GridBagLayout();
		this.jPanelAccionesTipoComprobante.setLayout(gridaBagLayoutAccionesTipoComprobante);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoComprobante= new GridBagLayout();
		this.jPanelAccionesFormularioTipoComprobante.setLayout(gridaBagLayoutAccionesFormularioTipoComprobante);
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoComprobante.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoComprobante.add(this.jComboBoxTiposAccionesFormularioTipoComprobante, this.gridBagConstraintsTipoComprobante);

		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoComprobante.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoComprobante.add(this.jCheckBoxPostAccionNuevoTipoComprobante, this.gridBagConstraintsTipoComprobante);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoComprobante.add(this.jCheckBoxPostAccionSinCerrarTipoComprobante, this.gridBagConstraintsTipoComprobante);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoComprobante.add(this.jCheckBoxPostAccionSinMensajeTipoComprobante, this.gridBagConstraintsTipoComprobante);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = 0;
		this.gridBagConstraintsTipoComprobante.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoComprobante.add(this.jButtonModificarTipoComprobante, this.gridBagConstraintsTipoComprobante);							

		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = 0;
		this.gridBagConstraintsTipoComprobante.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoComprobante.add(this.jButtonEliminarTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
			
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = 0;		
		this.gridBagConstraintsTipoComprobante.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoComprobante.add(this.jButtonActualizarTipoComprobante, this.gridBagConstraintsTipoComprobante);


		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = 0;		
		this.gridBagConstraintsTipoComprobante.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoComprobante.add(this.jButtonGuardarCambiosTipoComprobante, this.gridBagConstraintsTipoComprobante);	
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = 0;		
		this.gridBagConstraintsTipoComprobante.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoComprobante.add(this.jButtonCancelarTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoComprobante = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoComprobante);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();						
			this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoComprobante.gridx = 0;		
			//this.gridBagConstraintsTipoComprobante.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoComprobante.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoComprobante.gridx =0;
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoComprobante.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoComprobante, this.gridBagConstraintsTipoComprobante);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoComprobanteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoComprobante = new TipoComprobanteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Comprobante DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Comprobante DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Comprobante Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoComprobanteModel tipocomprobanteModel=new TipoComprobanteModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoComprobanteModel.TipoComprobanteFocusTraversalPolicy tipocomprobanteFocusTraversalPolicy = tipocomprobanteModel.new TipoComprobanteFocusTraversalPolicy(this);
			
			//tipocomprobanteFocusTraversalPolicy.settipocomprobanteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocomprobanteModel);
			
			
			this.jContentPaneDetalleTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoComprobante = new GridBagLayout();	
			this.jContentPaneDetalleTipoComprobante.setLayout(gridaBagLayoutDetalleTipoComprobante);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoComprobante = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
				this.gridBagConstraintsTipoComprobante.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoComprobante.gridx = 0;
					
				
				this.jContentPaneDetalleTipoComprobante.add(jTtoolBarDetalleTipoComprobante, gridBagConstraintsTipoComprobante);								
				
}
			
			this.jScrollPanelDatosEdicionTipoComprobante=   new JScrollPane(jContentPaneDetalleTipoComprobante,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoComprobante.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoComprobante.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoComprobante.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoComprobante=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoComprobante.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoComprobante.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoComprobante.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoComprobante.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoComprobante.gridx = 0;
	        
			this.jContentPaneDetalleTipoComprobante.add(jPanelCamposTipoComprobante, gridBagConstraintsTipoComprobante);
			
			
			
			
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
						&& tipocomprobanteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDocumentoAnulado(this.puedeCargarPorParteDocumentoAnulado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccion(this.puedeCargarPorParteTransaccion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(this.puedeCargarPorParteTransaccionLocal,false,-1);
					
					if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoComprobante= new GridBagConstraints();
						this.gridBagConstraintsTipoComprobante.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoComprobante.gridx = 0;
						this.jContentPaneDetalleTipoComprobante.add(this.jTabbedPaneRelacionesTipoComprobante, this.gridBagConstraintsTipoComprobante);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoComprobante.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDocumentoAnulado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoComprobante.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
					this.gridBagConstraintsTipoComprobante.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoComprobante.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoComprobante.gridx = 0;
					
				
					this.jContentPaneDetalleTipoComprobante.add(jPanelCamposOcultosTipoComprobante, gridBagConstraintsTipoComprobante);
				
					this.jPanelCamposOcultosTipoComprobante.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsTipoComprobante.gridx = 0;
	        this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoComprobante.add(this.jPanelAccionesFormularioTipoComprobante, this.gridBagConstraintsTipoComprobante);							
			
			
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
	        this.gridBagConstraintsTipoComprobante.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsTipoComprobante.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoComprobante.add(this.jPanelAccionesTipoComprobante, this.gridBagConstraintsTipoComprobante);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoComprobante);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoComprobante=   new JScrollPane(this.jPanelCamposTipoComprobante,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoComprobante.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoComprobante.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoComprobante.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoComprobante.gridx = 0;
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoComprobante.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoComprobante, this.gridBagConstraintsTipoComprobante);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoComprobante.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoComprobante, this.gridBagConstraintsTipoComprobante);			
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoComprobante.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoComprobante, this.gridBagConstraintsTipoComprobante);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComprobante.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoComprobante, this.gridBagConstraintsTipoComprobante);
			
			
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComprobante.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
			
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoComprobante.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoComprobante, this.gridBagConstraintsTipoComprobante);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoComprobante;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoComprobante;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDocumentoAnulado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
		this.documentoanuladoSessionBean.setConGuardarRelaciones(false);
		this.documentoanuladoSessionBean.setEsGuardarRelacionado(true);

		this.documentoanuladoBeanSwingJInternalFrame=null;//new DocumentoAnuladoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.documentoanuladoBeanSwingJInternalFramePopup=new DocumentoAnuladoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.documentoanuladoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {

				DocumentoAnuladoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL;
				DocumentoAnuladoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.documentoanuladoSessionBean.setEsGuardarRelacionado(true);

				this.documentoanuladoBeanSwingJInternalFrame=new DocumentoAnuladoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.documentoanuladoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.documentoanuladoBeanSwingJInternalFrame.setdocumentoanuladoSessionBean(this.documentoanuladoSessionBean);

				//this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
				//this.gridBagConstraintsTipoComprobante.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoComprobante.gridx = 0;
				//this.jContentPaneDetalleTipoComprobante.add(this.documentoanuladoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoComprobante);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoComprobante.add("Documento Anulados",this.documentoanuladoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoComprobante.setComponentAt(iIndexTab,this.documentoanuladoBeanSwingJInternalFrame.getContentPane());
				}

				//DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.documentoanuladoSessionBean.setEsGuardarRelacionado(false);
				this.documentoanuladoBeanSwingJInternalFrame=null;//new DocumentoAnuladoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDocumentoAnulado) {
					this.jTabbedPaneRelacionesTipoComprobante.add("Documento Anulados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTransaccion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transaccionSessionBean=new TransaccionSessionBean();
		this.transaccionSessionBean.setConGuardarRelaciones(false);
		this.transaccionSessionBean.setEsGuardarRelacionado(true);

		this.transaccionBeanSwingJInternalFrame=null;//new TransaccionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transaccionBeanSwingJInternalFramePopup=new TransaccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transaccionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transaccionSessionBean.getEsGuardarRelacionado()) {

				TransaccionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransaccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transaccionSessionBean.setEsGuardarRelacionado(true);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transaccionBeanSwingJInternalFrame.settransaccionSessionBean(this.transaccionSessionBean);

				//this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
				//this.gridBagConstraintsTipoComprobante.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoComprobante.gridx = 0;
				//this.jContentPaneDetalleTipoComprobante.add(this.transaccionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoComprobante);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoComprobante.add("Transacciones",this.transaccionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoComprobante.setComponentAt(iIndexTab,this.transaccionBeanSwingJInternalFrame.getContentPane());
				}

				//TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transaccionSessionBean.setEsGuardarRelacionado(false);
				this.transaccionBeanSwingJInternalFrame=null;//new TransaccionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transaccionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransaccion) {
					this.jTabbedPaneRelacionesTipoComprobante.add("Transacciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTransaccionLocal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		this.transaccionlocalSessionBean.setConGuardarRelaciones(false);
		this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

		this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transaccionlocalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {

				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL=TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

				this.transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.transaccionlocalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transaccionlocalBeanSwingJInternalFrame.settransaccionlocalSessionBean(this.transaccionlocalSessionBean);

				//this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
				//this.gridBagConstraintsTipoComprobante.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoComprobante.gridx = 0;
				//this.jContentPaneDetalleTipoComprobante.add(this.transaccionlocalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoComprobante);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoComprobante.add("Transaccion Locales",this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoComprobante.setComponentAt(iIndexTab,this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				}

				//TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransaccionLocal) {
					this.jTabbedPaneRelacionesTipoComprobante.add("Transaccion Locales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTransaccionLocalBeanSwingJInternalFrame(List<TipoComprobante> tipocomprobantes,TipoComprobante tipocomprobante,TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transaccionlocalBeanSwingJInternalFrame.getTransaccionLocalLogic().setConnexion(this.tipocomprobanteLogic.getConnexion());

					transaccionlocalBeanSwingJInternalFrame.settipocomprobantesForeignKey(tipocomprobantes);
					transaccionlocalBeanSwingJInternalFrame.settipocomprobanteForeignKey(tipocomprobante);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionTipoComprobante(true);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setlidTipoComprobanteActual(tipocomprobante.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transaccionlocalBeanSwingJInternalFrame.cargarCombosForeignKeyTransaccionLocal(transaccionlocalBeanSwingJInternalFrame.isCargarCombosDependencia);
					transaccionlocalBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoComprobante(true);
					transaccionlocalBeanSwingJInternalFrame.setid_tipo_comprobanteFK_IdTipoComprobante(tipocomprobante.getId());

					if(!this.conCargarFormDetalle) {
						transaccionlocalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transaccionlocalBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoComprobanteForeignKey(tipocomprobante,1,false,true,true);
					transaccionlocalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transaccionlocalBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoComprobante");
					transaccionlocalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoComprobante");
					transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(true);
					transaccionlocalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransaccionLocal("n",transaccionlocalBeanSwingJInternalFrame.isGuardarCambiosEnLote, transaccionlocalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transaccionlocalBeanSwingJInternalFrame.setAutoscrolls(true);
					transaccionlocalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("relacionado");
					} else {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");
					}

					transaccionlocalBeanSwingJInternalFrame.getjButtonRecargarInformacionTransaccionLocal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTransaccionBeanSwingJInternalFrame(List<TipoComprobante> tipocomprobantes,TipoComprobante tipocomprobante,TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.tipocomprobanteLogic.getConnexion());

					transaccionBeanSwingJInternalFrame.settipocomprobantesForeignKey(tipocomprobantes);
					transaccionBeanSwingJInternalFrame.settipocomprobanteForeignKey(tipocomprobante);
					transaccionBeanSwingJInternalFrame.transaccionSessionBean.setisBusquedaDesdeForeignKeySesionTipoComprobante(true);
					transaccionBeanSwingJInternalFrame.transaccionSessionBean.setlidTipoComprobanteActual(tipocomprobante.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transaccionBeanSwingJInternalFrame.cargarCombosForeignKeyTransaccion(transaccionBeanSwingJInternalFrame.isCargarCombosDependencia);
					transaccionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoComprobante(true);
					transaccionBeanSwingJInternalFrame.setid_tipo_comprobanteFK_IdTipoComprobante(tipocomprobante.getId());

					if(!this.conCargarFormDetalle) {
						transaccionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transaccionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoComprobanteForeignKey(tipocomprobante,1,false,true,true);
					transaccionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transaccionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoComprobante");
					transaccionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoComprobante");
					transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion(true);
					transaccionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransaccion("n",transaccionBeanSwingJInternalFrame.isGuardarCambiosEnLote, transaccionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transaccionBeanSwingJInternalFrame.setAutoscrolls(true);
					transaccionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transaccionBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccion("relacionado");
					} else {
						transaccionBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccion("no_relacionado");
					}

					transaccionBeanSwingJInternalFrame.getjButtonRecargarInformacionTransaccion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDocumentoAnuladoBeanSwingJInternalFrame(List<TipoComprobante> tipocomprobantes,TipoComprobante tipocomprobante,DocumentoAnuladoBeanSwingJInternalFrame documentoanuladoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//documentoanuladoBeanSwingJInternalFrame=new DocumentoAnuladoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					documentoanuladoBeanSwingJInternalFrame.getDocumentoAnuladoLogic().setConnexion(this.tipocomprobanteLogic.getConnexion());

					documentoanuladoBeanSwingJInternalFrame.settipocomprobantesForeignKey(tipocomprobantes);
					documentoanuladoBeanSwingJInternalFrame.settipocomprobanteForeignKey(tipocomprobante);
					documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setisBusquedaDesdeForeignKeySesionTipoComprobante(true);
					documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setlidTipoComprobanteActual(tipocomprobante.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					documentoanuladoBeanSwingJInternalFrame.cargarCombosForeignKeyDocumentoAnulado(documentoanuladoBeanSwingJInternalFrame.isCargarCombosDependencia);
					documentoanuladoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoComprobante(true);
					documentoanuladoBeanSwingJInternalFrame.setid_tipo_comprobanteFK_IdTipoComprobante(tipocomprobante.getId());

					if(!this.conCargarFormDetalle) {
						documentoanuladoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					documentoanuladoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoComprobanteForeignKey(tipocomprobante,1,false,true,true);
					documentoanuladoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					documentoanuladoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoComprobante");
					documentoanuladoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoComprobante");
					documentoanuladoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDocumentoAnulado(true);
					documentoanuladoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDocumentoAnulado("n",documentoanuladoBeanSwingJInternalFrame.isGuardarCambiosEnLote, documentoanuladoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					documentoanuladoBeanSwingJInternalFrame.setAutoscrolls(true);
					documentoanuladoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						documentoanuladoBeanSwingJInternalFrame.actualizarEstadoPanelsDocumentoAnulado("relacionado");
					} else {
						documentoanuladoBeanSwingJInternalFrame.actualizarEstadoPanelsDocumentoAnulado("no_relacionado");
					}

					documentoanuladoBeanSwingJInternalFrame.getjButtonRecargarInformacionDocumentoAnulado().setVisible(false);

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
