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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.EstadoOrdenProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class EstadoOrdenProduDetalleFormJInternalFrame extends EstadoOrdenProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoOrdenProdu;
	
	protected JMenuBar jmenuBarDetalleEstadoOrdenProdu;
	
	protected JMenu jmenuDetalleEstadoOrdenProdu;
	protected JMenu jmenuDetalleArchivoEstadoOrdenProdu;
	protected JMenu jmenuDetalleAccionesEstadoOrdenProdu;
	protected JMenu jmenuDetalleDatosEstadoOrdenProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoOrdenProdu;	
	protected GridBagConstraints gridBagConstraintsEstadoOrdenProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoOrdenProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoOrdenProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoOrdenProduSessionBean estadoordenproduSessionBean;
	
	

	public PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFrame=null;
	public PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoProdu=false;
	public PedidoProduSessionBean pedidoproduSessionBean;
	
		
	
	public EstadoOrdenProduLogic estadoordenproduLogic;
	
	public JScrollPane jScrollPanelDatosEstadoOrdenProdu;
	public JScrollPane jScrollPanelDatosEdicionEstadoOrdenProdu;
	public JScrollPane jScrollPanelDatosGeneralEstadoOrdenProdu;
	
	protected JPanel jPanelCamposEstadoOrdenProdu;    
	protected JPanel jPanelCamposOcultosEstadoOrdenProdu;    	
	protected JPanel jPanelAccionesEstadoOrdenProdu;
	protected JPanel jPanelAccionesFormularioEstadoOrdenProdu;
    
	
	
	protected Integer iXPanelCamposEstadoOrdenProdu=0;
	protected Integer iYPanelCamposEstadoOrdenProdu=0;
	
	protected Integer iXPanelCamposOcultosEstadoOrdenProdu=0;
	protected Integer iYPanelCamposOcultosEstadoOrdenProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoOrdenProdu;
	public JButton jButtonModificarEstadoOrdenProdu;
	public JButton jButtonActualizarEstadoOrdenProdu;
    public JButton jButtonEliminarEstadoOrdenProdu;
	public JButton jButtonCancelarEstadoOrdenProdu;
    public JButton jButtonGuardarCambiosEstadoOrdenProdu;
	public JButton jButtonGuardarCambiosTablaEstadoOrdenProdu;
	protected JButton jButtonCerrarEstadoOrdenProdu;
	
	
	protected JButton jButtonProcesarInformacionEstadoOrdenProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoOrdenProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoOrdenProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoOrdenProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoOrdenProdu;
	protected JButton jButtonModificarToolBarEstadoOrdenProdu;
	protected JButton jButtonActualizarToolBarEstadoOrdenProdu;
    protected JButton jButtonEliminarToolBarEstadoOrdenProdu;
	protected JButton jButtonCancelarToolBarEstadoOrdenProdu;
    protected JButton jButtonGuardarCambiosToolBarEstadoOrdenProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoOrdenProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoOrdenProdu;
	protected JButton jButtonCerrarToolBarEstadoOrdenProdu;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoOrdenProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoOrdenProdu;
	protected JMenuItem jMenuItemModificarEstadoOrdenProdu;
	protected JMenuItem jMenuItemActualizarEstadoOrdenProdu;
    protected JMenuItem jMenuItemEliminarEstadoOrdenProdu;
	protected JMenuItem jMenuItemCancelarEstadoOrdenProdu;
    protected JMenuItem jMenuItemGuardarCambiosEstadoOrdenProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoOrdenProdu;
	protected JMenuItem jMenuItemCerrarEstadoOrdenProdu;
	protected JMenuItem jMenuItemDetalleCerrarEstadoOrdenProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoOrdenProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoOrdenProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoOrdenProdu;
	protected JMenuItem jMenuItemMostrarOcultarEstadoOrdenProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoOrdenProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoOrdenProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoOrdenProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoOrdenProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoOrdenProdu;
	public JLabel jLabelIdEstadoOrdenProdu;
	public JTextFieldMe jTextFieldidEstadoOrdenProdu;
	public JButton jButtonidEstadoOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoOrdenProdu;
	public JLabel jLabelnombreEstadoOrdenProdu;
	public JTextArea jTextAreanombreEstadoOrdenProdu;
	public JScrollPane jscrollPanenombreEstadoOrdenProdu;
	public JButton jButtonnombreEstadoOrdenProduBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoOrdenProdu;
	
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
	
	public EstadoOrdenProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoOrdenProdu=new JPanel();
				this.jPanelAccionesFormularioEstadoOrdenProdu=new JPanel();
				this.jmenuBarDetalleEstadoOrdenProdu=new JMenuBar();
				this.jTtoolBarDetalleEstadoOrdenProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoOrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoOrdenProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoOrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoOrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoOrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoOrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoOrdenProdu() {
		return this.jButtonActualizarToolBarEstadoOrdenProdu;
	}
	
	public JButton getjButtonEliminarToolBarEstadoOrdenProdu() {
		return this.jButtonEliminarToolBarEstadoOrdenProdu;
	}
	
	public JButton getjButtonCancelarToolBarEstadoOrdenProdu() {
		return this.jButtonCancelarToolBarEstadoOrdenProdu;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoOrdenProdu() {
		return this.jButtonProcesarInformacionEstadoOrdenProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoOrdenProdu)	{
		this.jButtonProcesarInformacionEstadoOrdenProdu = jButtonProcesarInformacionEstadoOrdenProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoOrdenProdu() {
		return this.jComboBoxTiposAccionesEstadoOrdenProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoOrdenProdu(
			JComboBox jComboBoxTiposRelacionesEstadoOrdenProdu) {
		this.jComboBoxTiposRelacionesEstadoOrdenProdu = jComboBoxTiposRelacionesEstadoOrdenProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoOrdenProdu(
			JComboBox jComboBoxTiposAccionesEstadoOrdenProdu) {
		this.jComboBoxTiposAccionesEstadoOrdenProdu = jComboBoxTiposAccionesEstadoOrdenProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoOrdenProdu() {
		return this.jComboBoxTiposAccionesFormularioEstadoOrdenProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoOrdenProdu(
			JComboBox jComboBoxTiposAccionesFormularioEstadoOrdenProdu) {
		this.jComboBoxTiposAccionesFormularioEstadoOrdenProdu = jComboBoxTiposAccionesFormularioEstadoOrdenProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoordenproduSessionBean=new EstadoOrdenProduSessionBean();
		
		this.estadoordenproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoordenproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoordenproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pedidoproduSessionBean=new PedidoProduSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoOrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoOrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoOrdenProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Orden Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoOrdenProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoOrdenProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoOrdenProdu=new JButtonMe();
				this.jButtonModificarToolBarEstadoOrdenProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoOrdenProdu,this.jTtoolBarDetalleEstadoOrdenProdu,
							"actualizar","actualizar","Actualizar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoOrdenProdu,this.jTtoolBarDetalleEstadoOrdenProdu,
							"eliminar","eliminar","Eliminar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoOrdenProdu,this.jTtoolBarDetalleEstadoOrdenProdu,
							"cancelar","cancelar","Cancelar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoOrdenProdu,this.jTtoolBarDetalleEstadoOrdenProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoOrdenProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoOrdenProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoOrdenProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoOrdenProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoOrdenProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoOrdenProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoOrdenProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoOrdenProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoOrdenProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoOrdenProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoOrdenProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoOrdenProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoOrdenProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoOrdenProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoOrdenProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoOrdenProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoOrdenProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoOrdenProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoOrdenProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoOrdenProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoOrdenProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoOrdenProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoOrdenProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoOrdenProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoOrdenProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoOrdenProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoOrdenProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoOrdenProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoOrdenProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoOrdenProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoOrdenProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoOrdenProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoOrdenProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoOrdenProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoOrdenProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoOrdenProdu.add(this.jMenuItemDetalleCerrarEstadoOrdenProdu);
		
		this.jmenuDetalleAccionesEstadoOrdenProdu.add(this.jMenuItemActualizarEstadoOrdenProdu);
		this.jmenuDetalleAccionesEstadoOrdenProdu.add(this.jMenuItemEliminarEstadoOrdenProdu);
		this.jmenuDetalleAccionesEstadoOrdenProdu.add(this.jMenuItemCancelarEstadoOrdenProdu);		
		
		//this.jmenuDetalleDatosEstadoOrdenProdu.add(this.jMenuItemDetalleAbrirOrderByEstadoOrdenProdu);				
		this.jmenuDetalleDatosEstadoOrdenProdu.add(this.jMenuItemDetalleMostarOcultarEstadoOrdenProdu);				
				
		//this.jmenuDetalleAccionesEstadoOrdenProdu.add(this.jMenuItemGuardarCambiosEstadoOrdenProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoOrdenProdu.add(this.jmenuDetalleArchivoEstadoOrdenProdu);		
		this.jmenuBarDetalleEstadoOrdenProdu.add(this.jmenuDetalleAccionesEstadoOrdenProdu);		
		this.jmenuBarDetalleEstadoOrdenProdu.add(this.jmenuDetalleDatosEstadoOrdenProdu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoOrdenProdu.add(this.jmenuDetalleEstadoOrdenProdu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoOrdenProdu);				
	}
	
	
	public void inicializarElementosCamposEstadoOrdenProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoOrdenProdu = new JLabelMe();
		jLabelIdEstadoOrdenProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoOrdenProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoOrdenProdu.setToolTipText(EstadoOrdenProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoOrdenProdu= new GridBagLayout();

		this.jPanelidEstadoOrdenProdu.setLayout(this.gridaBagLayoutEstadoOrdenProdu);

		jTextFieldidEstadoOrdenProdu = new JTextFieldMe();
		jTextFieldidEstadoOrdenProdu.setText("Id");

		jTextFieldidEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreEstadoOrdenProdu = new JLabelMe();
		this.jLabelnombreEstadoOrdenProdu.setText(""+EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoOrdenProdu.setToolTipText("Nombre");
		this.jLabelnombreEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoOrdenProdu.setToolTipText(EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoOrdenProdu = new GridBagLayout();
		this.jPanelnombreEstadoOrdenProdu.setLayout(this.gridaBagLayoutEstadoOrdenProdu);


		jTextAreanombreEstadoOrdenProdu= new JTextAreaMe();
		jTextAreanombreEstadoOrdenProdu.setEnabled(false);
		jTextAreanombreEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoOrdenProdu.setLineWrap(true);
		jTextAreanombreEstadoOrdenProdu.setWrapStyleWord(true);
		jTextAreanombreEstadoOrdenProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoOrdenProdu.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoOrdenProdu = new JScrollPane(jTextAreanombreEstadoOrdenProdu);
		jscrollPanenombreEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoOrdenProduBusqueda= new JButtonMe();
		this.jButtonnombreEstadoOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoOrdenProduBusqueda.setText("U");
		this.jButtonnombreEstadoOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoOrdenProduBusqueda"));

		if(this.estadoordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoOrdenProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoOrdenProdu() {
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
		//this.jInternalFrameDetalleEstadoOrdenProdu = new EstadoOrdenProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Orden Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoOrdenProdu= new GridBagLayout();
		

		
		String sToolTipEstadoOrdenProdu="";
		sToolTipEstadoOrdenProdu=EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoOrdenProdu+="(Produccion.EstadoOrdenProdu)";
		}
		
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoOrdenProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoOrdenProdu = new JButtonMe();
		this.jButtonModificarEstadoOrdenProdu = new JButtonMe();
        this.jButtonActualizarEstadoOrdenProdu = new JButtonMe();
        this.jButtonEliminarEstadoOrdenProdu = new JButtonMe();
        this.jButtonCancelarEstadoOrdenProdu = new JButtonMe();
        this.jButtonGuardarCambiosEstadoOrdenProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu = new JButtonMe();
		this.jButtonCerrarEstadoOrdenProdu = new JButtonMe();
		
		this.jScrollPanelDatosEstadoOrdenProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoOrdenProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoOrdenProdu = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Orden Produccion";
		
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Produccions" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoOrdenProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoOrdenProdu.setName("jPanelCamposEstadoOrdenProdu"); 

		this.jPanelCamposOcultosEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoOrdenProdu.setName("jPanelCamposOcultosEstadoOrdenProdu"); 

        this.jPanelAccionesEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoOrdenProdu.setToolTipText("Acciones");
        this.jPanelAccionesEstadoOrdenProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoOrdenProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoOrdenProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoOrdenProdu.setText("Nuevo");
		this.jButtonModificarEstadoOrdenProdu.setText("Editar");
        this.jButtonActualizarEstadoOrdenProdu.setText("Actualizar");
        this.jButtonEliminarEstadoOrdenProdu.setText("Eliminar");
        this.jButtonCancelarEstadoOrdenProdu.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoOrdenProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu.setText("Guardar");
		this.jButtonCerrarEstadoOrdenProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoOrdenProdu,"nuevo_button","Nuevo",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoOrdenProdu,"modificar_button","Editar",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoOrdenProdu,"actualizar_button","Actualizar",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoOrdenProdu,"eliminar_button","Eliminar",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoOrdenProdu,"cancelar_button","Cancelar",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoOrdenProdu,"guardarcambios_button","Guardar",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoOrdenProdu,"guardarcambiostabla_button","Guardar",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoOrdenProdu,"cerrar_button","Salir",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoOrdenProdu.setToolTipText("Nuevo"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoOrdenProdu.setToolTipText("Editar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoOrdenProdu.setToolTipText("Actualizar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoOrdenProdu.setToolTipText("Eliminar)"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoOrdenProdu.setToolTipText("Cancelar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoOrdenProdu.setToolTipText("Guardar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu.setToolTipText("Guardar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoOrdenProdu.setToolTipText("Salir"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoOrdenProdu";
		inputMap = this.jButtonNuevoEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoOrdenProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoOrdenProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoOrdenProdu";
		inputMap = this.jButtonActualizarEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoOrdenProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoOrdenProdu";
		inputMap = this.jButtonEliminarEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoOrdenProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoOrdenProdu";
		inputMap = this.jButtonCancelarEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoOrdenProdu"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoOrdenProdu";
		inputMap = this.jButtonCerrarEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoOrdenProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoOrdenProdu";
		inputMap = this.jButtonGuardarCambiosTablaEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoOrdenProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoOrdenProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoOrdenProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoOrdenProdu.setToolTipText("Nuevo EstadoOrdenProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoOrdenProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoOrdenProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoOrdenProdu.setToolTipText("Sin Cerrar Ventana EstadoOrdenProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoOrdenProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoOrdenProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoOrdenProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoOrdenProdu.setText("Accion");
		this.jComboBoxTiposAccionesEstadoOrdenProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoOrdenProdu = new JLabelMe();
		
		this.jLabelAccionesEstadoOrdenProdu.setText("Acciones");		
		this.jLabelAccionesEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoOrdenProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoOrdenProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoOrdenProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoOrdenProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoOrdenProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoOrdenProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoOrdenProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoOrdenProdu = new GridBagLayout();
		
		this.jPanelCamposEstadoOrdenProdu.setLayout(gridaBagLayoutCamposEstadoOrdenProdu);
		this.jPanelCamposOcultosEstadoOrdenProdu.setLayout(gridaBagLayoutCamposOcultosEstadoOrdenProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
	this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
	this.gridBagConstraintsEstadoOrdenProdu.ipadx = 0;
	this.gridBagConstraintsEstadoOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoOrdenProdu.add(jLabelIdEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);



	this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
	this.gridBagConstraintsEstadoOrdenProdu.gridx = 1;
	this.gridBagConstraintsEstadoOrdenProdu.ipadx = 0;
	this.gridBagConstraintsEstadoOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoOrdenProdu.add(jTextFieldidEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);


	this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
	this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
	this.gridBagConstraintsEstadoOrdenProdu.ipadx = 0;
	this.gridBagConstraintsEstadoOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoOrdenProdu.add(jLabelnombreEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = 2;
		this.gridBagConstraintsEstadoOrdenProdu.ipadx = 0;
		this.gridBagConstraintsEstadoOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoOrdenProdu.add(jButtonnombreEstadoOrdenProduBusqueda, this.gridBagConstraintsEstadoOrdenProdu);
	}

	this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
	this.gridBagConstraintsEstadoOrdenProdu.gridx = 1;
	this.gridBagConstraintsEstadoOrdenProdu.ipadx = 0;
	this.gridBagConstraintsEstadoOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoOrdenProdu.add(jscrollPanenombreEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoOrdenProdu.gridy = iYPanelCamposEstadoOrdenProdu;
	this.gridBagConstraintsEstadoOrdenProdu.gridx = iXPanelCamposEstadoOrdenProdu++;
	this.gridBagConstraintsEstadoOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoOrdenProdu.add(this.jPanelidEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);



	if(iXPanelCamposEstadoOrdenProdu % 1==0) {
		iXPanelCamposEstadoOrdenProdu=0;
		iYPanelCamposEstadoOrdenProdu++;
	}
	this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoOrdenProdu.gridy = iYPanelCamposEstadoOrdenProdu;
	this.gridBagConstraintsEstadoOrdenProdu.gridx = iXPanelCamposEstadoOrdenProdu++;
	this.gridBagConstraintsEstadoOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoOrdenProdu.add(this.jPanelnombreEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);



	if(iXPanelCamposEstadoOrdenProdu % 1==0) {
		iXPanelCamposEstadoOrdenProdu=0;
		iYPanelCamposEstadoOrdenProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoOrdenProdu= new GridBagLayout();
		this.jPanelAccionesEstadoOrdenProdu.setLayout(gridaBagLayoutAccionesEstadoOrdenProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoOrdenProdu= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoOrdenProdu.setLayout(gridaBagLayoutAccionesFormularioEstadoOrdenProdu);
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoOrdenProdu.add(this.jComboBoxTiposAccionesFormularioEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);

		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoOrdenProdu.add(this.jCheckBoxPostAccionNuevoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoOrdenProdu.add(this.jCheckBoxPostAccionSinCerrarEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoOrdenProdu.add(this.jCheckBoxPostAccionSinMensajeEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoOrdenProdu.add(this.jButtonModificarEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);							

		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
		this.gridBagConstraintsEstadoOrdenProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoOrdenProdu.add(this.jButtonEliminarEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
			
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoOrdenProdu.add(this.jButtonActualizarEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);


		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoOrdenProdu.add(this.jButtonGuardarCambiosEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);	
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoOrdenProdu.add(this.jButtonCancelarEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoOrdenProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoOrdenProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();						
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;		
			//this.gridBagConstraintsEstadoOrdenProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoOrdenProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoOrdenProdu.gridx =0;
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoOrdenProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoOrdenProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoOrdenProdu = new EstadoOrdenProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Orden Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Orden Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Orden Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoOrdenProduModel estadoordenproduModel=new EstadoOrdenProduModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoOrdenProduModel.EstadoOrdenProduFocusTraversalPolicy estadoordenproduFocusTraversalPolicy = estadoordenproduModel.new EstadoOrdenProduFocusTraversalPolicy(this);
			
			//estadoordenproduFocusTraversalPolicy.setestadoordenproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoordenproduModel);
			
			
			this.jContentPaneDetalleEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoOrdenProdu = new GridBagLayout();	
			this.jContentPaneDetalleEstadoOrdenProdu.setLayout(gridaBagLayoutDetalleEstadoOrdenProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoOrdenProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
				this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoOrdenProdu.add(jTtoolBarDetalleEstadoOrdenProdu, gridBagConstraintsEstadoOrdenProdu);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoOrdenProdu=   new JScrollPane(jContentPaneDetalleEstadoOrdenProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoOrdenProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
	        
			this.jContentPaneDetalleEstadoOrdenProdu.add(jPanelCamposEstadoOrdenProdu, gridBagConstraintsEstadoOrdenProdu);
			
			
			
			
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
						&& estadoordenproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePedidoProdu(this.puedeCargarPorPartePedidoProdu,false,-1);
					
					if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoOrdenProdu= new GridBagConstraints();
						this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
						this.jContentPaneDetalleEstadoOrdenProdu.add(this.jTabbedPaneRelacionesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoOrdenProdu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePedidoProdu(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoOrdenProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
					this.gridBagConstraintsEstadoOrdenProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoOrdenProdu.add(jPanelCamposOcultosEstadoOrdenProdu, gridBagConstraintsEstadoOrdenProdu);
				
					this.jPanelCamposOcultosEstadoOrdenProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
	        this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoOrdenProdu.add(this.jPanelAccionesFormularioEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);							
			
			
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
	        this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoOrdenProdu.add(this.jPanelAccionesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoOrdenProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoOrdenProdu=   new JScrollPane(this.jPanelCamposEstadoOrdenProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoOrdenProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);			
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			
			
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
			
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoOrdenProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoOrdenProdu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePedidoProdu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoproduSessionBean=new PedidoProduSessionBean();
		this.pedidoproduSessionBean.setConGuardarRelaciones(false);
		this.pedidoproduSessionBean.setEsGuardarRelacionado(true);

		this.pedidoproduBeanSwingJInternalFrame=null;//new PedidoProduBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoproduBeanSwingJInternalFramePopup=new PedidoProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoproduBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {

				PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoOrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoOrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoproduSessionBean.setEsGuardarRelacionado(true);

				this.pedidoproduBeanSwingJInternalFrame=new PedidoProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.pedidoproduBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoproduBeanSwingJInternalFrame.setpedidoproduSessionBean(this.pedidoproduSessionBean);

				//this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
				//this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
				//this.jContentPaneDetalleEstadoOrdenProdu.add(this.pedidoproduBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoOrdenProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoOrdenProdu.add("Pedido Producciones",this.pedidoproduBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoOrdenProdu.setComponentAt(iIndexTab,this.pedidoproduBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoproduSessionBean.setEsGuardarRelacionado(false);
				this.pedidoproduBeanSwingJInternalFrame=null;//new PedidoProduBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoProdu) {
					this.jTabbedPaneRelacionesEstadoOrdenProdu.add("Pedido Producciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPedidoProduBeanSwingJInternalFrame(List<EstadoOrdenProdu> estadoordenprodus,EstadoOrdenProdu estadoordenprodu,PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoproduBeanSwingJInternalFrame=new PedidoProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoproduBeanSwingJInternalFrame.getPedidoProduLogic().setConnexion(this.estadoordenproduLogic.getConnexion());

					pedidoproduBeanSwingJInternalFrame.setestadoordenprodusForeignKey(estadoordenprodus);
					pedidoproduBeanSwingJInternalFrame.setestadoordenproduForeignKey(estadoordenprodu);
					pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setisBusquedaDesdeForeignKeySesionEstadoOrdenProdu(true);
					pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setlidEstadoOrdenProduActual(estadoordenprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoproduBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoProdu(pedidoproduBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoproduBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoOrdenProdu(true);
					pedidoproduBeanSwingJInternalFrame.setid_estado_orden_produFK_IdEstadoOrdenProdu(estadoordenprodu.getId());

					if(!this.conCargarFormDetalle) {
						pedidoproduBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoproduBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoOrdenProduForeignKey(estadoordenprodu,1,false,true,true);
					pedidoproduBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoproduBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoOrdenProdu");
					pedidoproduBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoOrdenProdu");
					pedidoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoProdu(true);
					pedidoproduBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoProdu("n",pedidoproduBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoproduBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoproduBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoproduBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoProdu("relacionado");
					} else {
						pedidoproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoProdu("no_relacionado");
					}

					pedidoproduBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoProdu().setVisible(false);

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
