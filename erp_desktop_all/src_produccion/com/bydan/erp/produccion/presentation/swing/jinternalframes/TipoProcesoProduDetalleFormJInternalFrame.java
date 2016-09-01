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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.produccion.util.TipoProcesoProduConstantesFunciones;

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
public class TipoProcesoProduDetalleFormJInternalFrame extends TipoProcesoProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoProcesoProdu;
	
	protected JMenuBar jmenuBarDetalleTipoProcesoProdu;
	
	protected JMenu jmenuDetalleTipoProcesoProdu;
	protected JMenu jmenuDetalleArchivoTipoProcesoProdu;
	protected JMenu jmenuDetalleAccionesTipoProcesoProdu;
	protected JMenu jmenuDetalleDatosTipoProcesoProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProcesoProdu;	
	protected GridBagConstraints gridBagConstraintsTipoProcesoProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoProcesoProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoProcesoProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoProcesoProduSessionBean tipoprocesoproduSessionBean;
	
	

	public PedidoDetaProduBeanSwingJInternalFrame pedidodetaproduBeanSwingJInternalFrame=null;
	public PedidoDetaProduBeanSwingJInternalFrame pedidodetaproduBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoDetaProdu=false;
	public PedidoDetaProduSessionBean pedidodetaproduSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoProcesoProduLogic tipoprocesoproduLogic;
	
	public JScrollPane jScrollPanelDatosTipoProcesoProdu;
	public JScrollPane jScrollPanelDatosEdicionTipoProcesoProdu;
	public JScrollPane jScrollPanelDatosGeneralTipoProcesoProdu;
	
	protected JPanel jPanelCamposTipoProcesoProdu;    
	protected JPanel jPanelCamposOcultosTipoProcesoProdu;    	
	protected JPanel jPanelAccionesTipoProcesoProdu;
	protected JPanel jPanelAccionesFormularioTipoProcesoProdu;
    
	
	
	protected Integer iXPanelCamposTipoProcesoProdu=0;
	protected Integer iYPanelCamposTipoProcesoProdu=0;
	
	protected Integer iXPanelCamposOcultosTipoProcesoProdu=0;
	protected Integer iYPanelCamposOcultosTipoProcesoProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoProcesoProdu;
	public JButton jButtonModificarTipoProcesoProdu;
	public JButton jButtonActualizarTipoProcesoProdu;
    public JButton jButtonEliminarTipoProcesoProdu;
	public JButton jButtonCancelarTipoProcesoProdu;
    public JButton jButtonGuardarCambiosTipoProcesoProdu;
	public JButton jButtonGuardarCambiosTablaTipoProcesoProdu;
	protected JButton jButtonCerrarTipoProcesoProdu;
	
	
	protected JButton jButtonProcesarInformacionTipoProcesoProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoProcesoProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoProcesoProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoProcesoProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProcesoProdu;
	protected JButton jButtonModificarToolBarTipoProcesoProdu;
	protected JButton jButtonActualizarToolBarTipoProcesoProdu;
    protected JButton jButtonEliminarToolBarTipoProcesoProdu;
	protected JButton jButtonCancelarToolBarTipoProcesoProdu;
    protected JButton jButtonGuardarCambiosToolBarTipoProcesoProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoProcesoProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProcesoProdu;
	protected JButton jButtonCerrarToolBarTipoProcesoProdu;
	
	protected JButton jButtonProcesarInformacionToolBarTipoProcesoProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProcesoProdu;
	protected JMenuItem jMenuItemModificarTipoProcesoProdu;
	protected JMenuItem jMenuItemActualizarTipoProcesoProdu;
    protected JMenuItem jMenuItemEliminarTipoProcesoProdu;
	protected JMenuItem jMenuItemCancelarTipoProcesoProdu;
    protected JMenuItem jMenuItemGuardarCambiosTipoProcesoProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProcesoProdu;
	protected JMenuItem jMenuItemCerrarTipoProcesoProdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoProcesoProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProcesoProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoProcesoProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProcesoProdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoProcesoProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProcesoProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProcesoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProcesoProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoProcesoProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoProcesoProdu;
	public JLabel jLabelIdTipoProcesoProdu;
	public JTextFieldMe jTextFieldidTipoProcesoProdu;
	public JButton jButtonidTipoProcesoProduBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoProcesoProdu;
	public JLabel jLabelnombreTipoProcesoProdu;
	public JTextArea jTextAreanombreTipoProcesoProdu;
	public JScrollPane jscrollPanenombreTipoProcesoProdu;
	public JButton jButtonnombreTipoProcesoProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoProcesoProdu;
	public JLabel jLabeldescripcionTipoProcesoProdu;
	public JTextArea jTextAreadescripcionTipoProcesoProdu;
	public JScrollPane jscrollPanedescripcionTipoProcesoProdu;
	public JButton jButtondescripcionTipoProcesoProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoProcesoProdu;
	public JLabel jLabelid_empresaTipoProcesoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoProcesoProdu;
	public JButton jButtonid_empresaTipoProcesoProdu= new JButtonMe();
	public JButton jButtonid_empresaTipoProcesoProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoProcesoProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoProcesoProdu;
	
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
	
	public TipoProcesoProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoProcesoProdu=new JPanel();
				this.jPanelAccionesFormularioTipoProcesoProdu=new JPanel();
				this.jmenuBarDetalleTipoProcesoProdu=new JMenuBar();
				this.jTtoolBarDetalleTipoProcesoProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoProcesoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoProcesoProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoProcesoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProcesoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoProcesoProdu() {
		return this.jButtonActualizarToolBarTipoProcesoProdu;
	}
	
	public JButton getjButtonEliminarToolBarTipoProcesoProdu() {
		return this.jButtonEliminarToolBarTipoProcesoProdu;
	}
	
	public JButton getjButtonCancelarToolBarTipoProcesoProdu() {
		return this.jButtonCancelarToolBarTipoProcesoProdu;
	}		
	
	public JButton getjButtonProcesarInformacionTipoProcesoProdu() {
		return this.jButtonProcesarInformacionTipoProcesoProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProcesoProdu)	{
		this.jButtonProcesarInformacionTipoProcesoProdu = jButtonProcesarInformacionTipoProcesoProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProcesoProdu() {
		return this.jComboBoxTiposAccionesTipoProcesoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProcesoProdu(
			JComboBox jComboBoxTiposRelacionesTipoProcesoProdu) {
		this.jComboBoxTiposRelacionesTipoProcesoProdu = jComboBoxTiposRelacionesTipoProcesoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProcesoProdu(
			JComboBox jComboBoxTiposAccionesTipoProcesoProdu) {
		this.jComboBoxTiposAccionesTipoProcesoProdu = jComboBoxTiposAccionesTipoProcesoProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoProcesoProdu() {
		return this.jComboBoxTiposAccionesFormularioTipoProcesoProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoProcesoProdu(
			JComboBox jComboBoxTiposAccionesFormularioTipoProcesoProdu) {
		this.jComboBoxTiposAccionesFormularioTipoProcesoProdu = jComboBoxTiposAccionesFormularioTipoProcesoProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
		
		this.tipoprocesoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprocesoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprocesoproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProcesoProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProcesoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProcesoProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Proceso Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoProcesoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoProcesoProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoProcesoProdu=new JButtonMe();
				this.jButtonModificarToolBarTipoProcesoProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoProcesoProdu,this.jTtoolBarDetalleTipoProcesoProdu,
							"actualizar","actualizar","Actualizar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoProcesoProdu,this.jTtoolBarDetalleTipoProcesoProdu,
							"eliminar","eliminar","Eliminar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoProcesoProdu,this.jTtoolBarDetalleTipoProcesoProdu,
							"cancelar","cancelar","Cancelar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoProcesoProdu,this.jTtoolBarDetalleTipoProcesoProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoProcesoProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoProcesoProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoProcesoProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoProcesoProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoProcesoProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProcesoProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProcesoProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProcesoProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoProcesoProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoProcesoProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoProcesoProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoProcesoProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoProcesoProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoProcesoProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoProcesoProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoProcesoProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoProcesoProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoProcesoProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoProcesoProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoProcesoProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoProcesoProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProcesoProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProcesoProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProcesoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProcesoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProcesoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoProcesoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoProcesoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoProcesoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProcesoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProcesoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProcesoProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProcesoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProcesoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProcesoProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoProcesoProdu.add(this.jMenuItemDetalleCerrarTipoProcesoProdu);
		
		this.jmenuDetalleAccionesTipoProcesoProdu.add(this.jMenuItemActualizarTipoProcesoProdu);
		this.jmenuDetalleAccionesTipoProcesoProdu.add(this.jMenuItemEliminarTipoProcesoProdu);
		this.jmenuDetalleAccionesTipoProcesoProdu.add(this.jMenuItemCancelarTipoProcesoProdu);		
		
		//this.jmenuDetalleDatosTipoProcesoProdu.add(this.jMenuItemDetalleAbrirOrderByTipoProcesoProdu);				
		this.jmenuDetalleDatosTipoProcesoProdu.add(this.jMenuItemDetalleMostarOcultarTipoProcesoProdu);				
				
		//this.jmenuDetalleAccionesTipoProcesoProdu.add(this.jMenuItemGuardarCambiosTipoProcesoProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoProcesoProdu.add(this.jmenuDetalleArchivoTipoProcesoProdu);		
		this.jmenuBarDetalleTipoProcesoProdu.add(this.jmenuDetalleAccionesTipoProcesoProdu);		
		this.jmenuBarDetalleTipoProcesoProdu.add(this.jmenuDetalleDatosTipoProcesoProdu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoProcesoProdu.add(this.jmenuDetalleTipoProcesoProdu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoProcesoProdu);				
	}
	
	
	public void inicializarElementosCamposTipoProcesoProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoProcesoProdu = new JLabelMe();
		jLabelIdTipoProcesoProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoProcesoProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoProcesoProdu.setToolTipText(TipoProcesoProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoProcesoProdu= new GridBagLayout();

		this.jPanelidTipoProcesoProdu.setLayout(this.gridaBagLayoutTipoProcesoProdu);

		jTextFieldidTipoProcesoProdu = new JTextFieldMe();
		jTextFieldidTipoProcesoProdu.setText("Id");

		jTextFieldidTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoProcesoProdu = new JLabelMe();
		this.jLabelnombreTipoProcesoProdu.setText(""+TipoProcesoProduConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoProcesoProdu.setToolTipText("Nombre");
		this.jLabelnombreTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoProcesoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoProcesoProdu.setToolTipText(TipoProcesoProduConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoProcesoProdu = new GridBagLayout();
		this.jPanelnombreTipoProcesoProdu.setLayout(this.gridaBagLayoutTipoProcesoProdu);


		jTextAreanombreTipoProcesoProdu= new JTextAreaMe();
		jTextAreanombreTipoProcesoProdu.setEnabled(false);
		jTextAreanombreTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProcesoProdu.setLineWrap(true);
		jTextAreanombreTipoProcesoProdu.setWrapStyleWord(true);
		jTextAreanombreTipoProcesoProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoProcesoProdu.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoProcesoProdu = new JScrollPane(jTextAreanombreTipoProcesoProdu);
		jscrollPanenombreTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoProcesoProduBusqueda= new JButtonMe();
		this.jButtonnombreTipoProcesoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProcesoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProcesoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoProcesoProduBusqueda.setText("U");
		this.jButtonnombreTipoProcesoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoProcesoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoProcesoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoProcesoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoProcesoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoProcesoProduBusqueda"));

		if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoProcesoProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoProcesoProdu = new JLabelMe();
		this.jLabeldescripcionTipoProcesoProdu.setText(""+TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoProcesoProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoProcesoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoProcesoProdu.setToolTipText(TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoProcesoProdu = new GridBagLayout();
		this.jPaneldescripcionTipoProcesoProdu.setLayout(this.gridaBagLayoutTipoProcesoProdu);


		jTextAreadescripcionTipoProcesoProdu= new JTextAreaMe();
		jTextAreadescripcionTipoProcesoProdu.setEnabled(false);
		jTextAreadescripcionTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoProcesoProdu.setLineWrap(true);
		jTextAreadescripcionTipoProcesoProdu.setWrapStyleWord(true);
		jTextAreadescripcionTipoProcesoProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoProcesoProdu.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoProcesoProdu = new JScrollPane(jTextAreadescripcionTipoProcesoProdu);
		jscrollPanedescripcionTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoProcesoProduBusqueda= new JButtonMe();
		this.jButtondescripcionTipoProcesoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoProcesoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoProcesoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoProcesoProduBusqueda.setText("U");
		this.jButtondescripcionTipoProcesoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoProcesoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoProcesoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoProcesoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoProcesoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoProcesoProduBusqueda"));

		if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoProcesoProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoProcesoProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoProcesoProdu = new JLabelMe();
		this.jLabelid_empresaTipoProcesoProdu.setText(""+TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoProcesoProdu.setToolTipText("Empresa");
		this.jLabelid_empresaTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoProcesoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoProcesoProdu.setToolTipText(TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoProcesoProdu = new GridBagLayout();
		this.jPanelid_empresaTipoProcesoProdu.setLayout(this.gridaBagLayoutTipoProcesoProdu);


		jComboBoxid_empresaTipoProcesoProdu= new JComboBoxMe();
		jComboBoxid_empresaTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoProcesoProdu.setEnabled(false);

		this.jButtonid_empresaTipoProcesoProdu= new JButtonMe();
		this.jButtonid_empresaTipoProcesoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProcesoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProcesoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProcesoProdu.setText("Buscar");
		this.jButtonid_empresaTipoProcesoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoProcesoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProcesoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoProcesoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProcesoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProcesoProdu"));

		this.jButtonid_empresaTipoProcesoProduBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoProcesoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProcesoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProcesoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoProcesoProduBusqueda.setText("U");
		this.jButtonid_empresaTipoProcesoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoProcesoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProcesoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoProcesoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProcesoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProcesoProduBusqueda"));

		if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoProcesoProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoProcesoProduUpdate= new JButtonMe();
		this.jButtonid_empresaTipoProcesoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProcesoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProcesoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoProcesoProduUpdate.setText("U");
		this.jButtonid_empresaTipoProcesoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoProcesoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProcesoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoProcesoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProcesoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProcesoProduUpdate"));



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
		//this.jInternalFrameDetalleTipoProcesoProdu = new TipoProcesoProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Proceso Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProcesoProdu= new GridBagLayout();
		

		
		String sToolTipTipoProcesoProdu="";
		sToolTipTipoProcesoProdu=TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProcesoProdu+="(Produccion.TipoProcesoProdu)";
		}
		
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProcesoProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoProcesoProdu = new JButtonMe();
		this.jButtonModificarTipoProcesoProdu = new JButtonMe();
        this.jButtonActualizarTipoProcesoProdu = new JButtonMe();
        this.jButtonEliminarTipoProcesoProdu = new JButtonMe();
        this.jButtonCancelarTipoProcesoProdu = new JButtonMe();
        this.jButtonGuardarCambiosTipoProcesoProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoProcesoProdu = new JButtonMe();
		this.jButtonCerrarTipoProcesoProdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoProcesoProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoProcesoProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoProcesoProdu = new JScrollPane();
				
		
		
		this.jPanelCamposTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Proceso Produccion";
		
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Produccions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProcesoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoProcesoProdu.setName("jPanelCamposTipoProcesoProdu"); 

		this.jPanelCamposOcultosTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoProcesoProdu.setName("jPanelCamposOcultosTipoProcesoProdu"); 

        this.jPanelAccionesTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProcesoProdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoProcesoProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoProcesoProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoProcesoProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoProcesoProdu.setText("Nuevo");
		this.jButtonModificarTipoProcesoProdu.setText("Editar");
        this.jButtonActualizarTipoProcesoProdu.setText("Actualizar");
        this.jButtonEliminarTipoProcesoProdu.setText("Eliminar");
        this.jButtonCancelarTipoProcesoProdu.setText("Cancelar");
        this.jButtonGuardarCambiosTipoProcesoProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoProcesoProdu.setText("Guardar");
		this.jButtonCerrarTipoProcesoProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProcesoProdu,"nuevo_button","Nuevo",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoProcesoProdu,"modificar_button","Editar",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoProcesoProdu,"actualizar_button","Actualizar",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoProcesoProdu,"eliminar_button","Eliminar",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoProcesoProdu,"cancelar_button","Cancelar",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoProcesoProdu,"guardarcambios_button","Guardar",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProcesoProdu,"guardarcambiostabla_button","Guardar",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProcesoProdu,"cerrar_button","Salir",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoProcesoProdu.setToolTipText("Nuevo"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoProcesoProdu.setToolTipText("Editar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoProcesoProdu.setToolTipText("Actualizar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoProcesoProdu.setToolTipText("Eliminar)"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoProcesoProdu.setToolTipText("Cancelar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoProcesoProdu.setToolTipText("Guardar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoProcesoProdu.setToolTipText("Guardar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProcesoProdu.setToolTipText("Salir"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProcesoProdu";
		inputMap = this.jButtonNuevoTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProcesoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProcesoProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoProcesoProdu";
		inputMap = this.jButtonActualizarTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoProcesoProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoProcesoProdu";
		inputMap = this.jButtonEliminarTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoProcesoProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoProcesoProdu";
		inputMap = this.jButtonCancelarTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoProcesoProdu"));
		
		//CERRAR		
		sMapKey = "CerrarTipoProcesoProdu";
		inputMap = this.jButtonCerrarTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProcesoProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProcesoProdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProcesoProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoProcesoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoProcesoProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoProcesoProdu.setToolTipText("Nuevo TipoProcesoProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoProcesoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoProcesoProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoProcesoProdu.setToolTipText("Sin Cerrar Ventana TipoProcesoProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoProcesoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoProcesoProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoProcesoProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoProcesoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProcesoProdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoProcesoProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoProcesoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoProcesoProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoProcesoProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoProcesoProdu = new JLabelMe();
		
		this.jLabelAccionesTipoProcesoProdu.setText("Acciones");		
		this.jLabelAccionesTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoProcesoProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoProcesoProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoProcesoProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoProcesoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoProcesoProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProcesoProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProcesoProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoProcesoProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoProcesoProdu = new GridBagLayout();
		
		this.jPanelCamposTipoProcesoProdu.setLayout(gridaBagLayoutCamposTipoProcesoProdu);
		this.jPanelCamposOcultosTipoProcesoProdu.setLayout(gridaBagLayoutCamposOcultosTipoProcesoProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoProcesoProdu.add(jLabelIdTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);



	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoProdu.gridx = 1;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoProcesoProdu.add(jTextFieldidTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);


	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoProcesoProdu.add(jLabelid_empresaTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoProdu.gridx = 2;
		this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
		this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoProcesoProdu.add(jButtonid_empresaTipoProcesoProduBusqueda, this.gridBagConstraintsTipoProcesoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoProdu.gridx = 3;
		this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
		this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoProcesoProdu.add(jButtonid_empresaTipoProcesoProduUpdate, this.gridBagConstraintsTipoProcesoProdu);
	}

	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoProdu.gridx = 1;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoProcesoProdu.add(jComboBoxid_empresaTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);


	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoProcesoProdu.add(jLabelnombreTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoProdu.gridx = 2;
		this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
		this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoProcesoProdu.add(jButtonnombreTipoProcesoProduBusqueda, this.gridBagConstraintsTipoProcesoProdu);
	}

	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoProdu.gridx = 1;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoProcesoProdu.add(jscrollPanenombreTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);


	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoProcesoProdu.add(jLabeldescripcionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoProdu.gridx = 2;
		this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
		this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoProcesoProdu.add(jButtondescripcionTipoProcesoProduBusqueda, this.gridBagConstraintsTipoProcesoProdu);
	}

	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoProdu.gridx = 1;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoProcesoProdu.add(jscrollPanedescripcionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoProdu.gridy = iYPanelCamposTipoProcesoProdu;
	this.gridBagConstraintsTipoProcesoProdu.gridx = iXPanelCamposTipoProcesoProdu++;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProcesoProdu.add(this.jPanelidTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);



	if(iXPanelCamposTipoProcesoProdu % 1==0) {
		iXPanelCamposTipoProcesoProdu=0;
		iYPanelCamposTipoProcesoProdu++;
	}
	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoProdu.gridy = iYPanelCamposTipoProcesoProdu;
	this.gridBagConstraintsTipoProcesoProdu.gridx = iXPanelCamposTipoProcesoProdu++;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProcesoProdu.add(this.jPanelnombreTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);



	if(iXPanelCamposTipoProcesoProdu % 1==0) {
		iXPanelCamposTipoProcesoProdu=0;
		iYPanelCamposTipoProcesoProdu++;
	}
	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoProdu.gridy = iYPanelCamposTipoProcesoProdu;
	this.gridBagConstraintsTipoProcesoProdu.gridx = iXPanelCamposTipoProcesoProdu++;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProcesoProdu.add(this.jPaneldescripcionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);



	if(iXPanelCamposTipoProcesoProdu % 1==0) {
		iXPanelCamposTipoProcesoProdu=0;
		iYPanelCamposTipoProcesoProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoProdu.gridy = iYPanelCamposOcultosTipoProcesoProdu;
	this.gridBagConstraintsTipoProcesoProdu.gridx = iXPanelCamposOcultosTipoProcesoProdu++;
	this.gridBagConstraintsTipoProcesoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoProcesoProdu.add(this.jPanelid_empresaTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);



	if(iXPanelCamposOcultosTipoProcesoProdu % 1==0) {
		iXPanelCamposOcultosTipoProcesoProdu=0;
		iYPanelCamposOcultosTipoProcesoProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoProcesoProdu= new GridBagLayout();
		this.jPanelAccionesTipoProcesoProdu.setLayout(gridaBagLayoutAccionesTipoProcesoProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoProcesoProdu= new GridBagLayout();
		this.jPanelAccionesFormularioTipoProcesoProdu.setLayout(gridaBagLayoutAccionesFormularioTipoProcesoProdu);
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProcesoProdu.add(this.jComboBoxTiposAccionesFormularioTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);

		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProcesoProdu.add(this.jCheckBoxPostAccionNuevoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProcesoProdu.add(this.jCheckBoxPostAccionSinCerrarTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProcesoProdu.add(this.jCheckBoxPostAccionSinMensajeTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoProcesoProdu.add(this.jButtonModificarTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);							

		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoProcesoProdu.add(this.jButtonEliminarTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
			
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = 0;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProcesoProdu.add(this.jButtonActualizarTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);


		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = 0;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProcesoProdu.add(this.jButtonGuardarCambiosTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);	
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = 0;		
		this.gridBagConstraintsTipoProcesoProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoProcesoProdu.add(this.jButtonCancelarTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProcesoProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProcesoProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProcesoProdu.gridx = 0;		
			//this.gridBagConstraintsTipoProcesoProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProcesoProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProcesoProdu.gridx =0;
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProcesoProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoProcesoProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoProcesoProdu = new TipoProcesoProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Proceso Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Proceso Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Proceso Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoProcesoProduModel tipoprocesoproduModel=new TipoProcesoProduModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoProcesoProduModel.TipoProcesoProduFocusTraversalPolicy tipoprocesoproduFocusTraversalPolicy = tipoprocesoproduModel.new TipoProcesoProduFocusTraversalPolicy(this);
			
			//tipoprocesoproduFocusTraversalPolicy.settipoprocesoproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoprocesoproduModel);
			
			
			this.jContentPaneDetalleTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoProcesoProdu = new GridBagLayout();	
			this.jContentPaneDetalleTipoProcesoProdu.setLayout(gridaBagLayoutDetalleTipoProcesoProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProcesoProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
					
				
				this.jContentPaneDetalleTipoProcesoProdu.add(jTtoolBarDetalleTipoProcesoProdu, gridBagConstraintsTipoProcesoProdu);								
				
}
			
			this.jScrollPanelDatosEdicionTipoProcesoProdu=   new JScrollPane(jContentPaneDetalleTipoProcesoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProcesoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoProcesoProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProcesoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
	        
			this.jContentPaneDetalleTipoProcesoProdu.add(jPanelCamposTipoProcesoProdu, gridBagConstraintsTipoProcesoProdu);
			
			
			
			
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
						&& tipoprocesoproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePedidoDetaProdu(this.puedeCargarPorPartePedidoDetaProdu,false,-1);
					
					if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoProcesoProdu= new GridBagConstraints();
						this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
						this.jContentPaneDetalleTipoProcesoProdu.add(this.jTabbedPaneRelacionesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoProcesoProdu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePedidoDetaProdu(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoProcesoProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
					this.gridBagConstraintsTipoProcesoProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
					
				
					this.jContentPaneDetalleTipoProcesoProdu.add(jPanelCamposOcultosTipoProcesoProdu, gridBagConstraintsTipoProcesoProdu);
				
					this.jPanelCamposOcultosTipoProcesoProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
	        this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoProcesoProdu.add(this.jPanelAccionesFormularioTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);							
			
			
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
	        this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoProcesoProdu.add(this.jPanelAccionesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoProcesoProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoProcesoProdu=   new JScrollPane(this.jPanelCamposTipoProcesoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProcesoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoProcesoProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);			
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			
			
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
			
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoProcesoProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoProcesoProdu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePedidoDetaProdu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
		this.pedidodetaproduSessionBean.setConGuardarRelaciones(false);
		this.pedidodetaproduSessionBean.setEsGuardarRelacionado(true);

		this.pedidodetaproduBeanSwingJInternalFrame=null;//new PedidoDetaProduBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidodetaproduBeanSwingJInternalFramePopup=new PedidoDetaProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidodetaproduBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {

				PedidoDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProcesoProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProcesoProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidodetaproduSessionBean.setEsGuardarRelacionado(true);

				this.pedidodetaproduBeanSwingJInternalFrame=new PedidoDetaProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.pedidodetaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidodetaproduBeanSwingJInternalFrame.setpedidodetaproduSessionBean(this.pedidodetaproduSessionBean);

				//this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
				//this.jContentPaneDetalleTipoProcesoProdu.add(this.pedidodetaproduBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProcesoProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProcesoProdu.add("Pedido Detalle Producciones",this.pedidodetaproduBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProcesoProdu.setComponentAt(iIndexTab,this.pedidodetaproduBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidodetaproduSessionBean.setEsGuardarRelacionado(false);
				this.pedidodetaproduBeanSwingJInternalFrame=null;//new PedidoDetaProduBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoDetaProdu) {
					this.jTabbedPaneRelacionesTipoProcesoProdu.add("Pedido Detalle Producciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPedidoDetaProduBeanSwingJInternalFrame(List<TipoProcesoProdu> tipoprocesoprodus,TipoProcesoProdu tipoprocesoprodu,PedidoDetaProduBeanSwingJInternalFrame pedidodetaproduBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidodetaproduBeanSwingJInternalFrame=new PedidoDetaProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidodetaproduBeanSwingJInternalFrame.getPedidoDetaProduLogic().setConnexion(this.tipoprocesoproduLogic.getConnexion());

					pedidodetaproduBeanSwingJInternalFrame.settipoprocesoprodusForeignKey(tipoprocesoprodus);
					pedidodetaproduBeanSwingJInternalFrame.settipoprocesoproduForeignKey(tipoprocesoprodu);
					pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setisBusquedaDesdeForeignKeySesionTipoProcesoProdu(true);
					pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setlidTipoProcesoProduActual(tipoprocesoprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidodetaproduBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoDetaProdu(pedidodetaproduBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidodetaproduBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProcesoProdu(true);
					pedidodetaproduBeanSwingJInternalFrame.setid_tipo_proceso_produFK_IdTipoProcesoProdu(tipoprocesoprodu.getId());

					if(!this.conCargarFormDetalle) {
						pedidodetaproduBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidodetaproduBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProcesoProduForeignKey(tipoprocesoprodu,1,false,true,true);
					pedidodetaproduBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidodetaproduBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProcesoProdu");
					pedidodetaproduBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProcesoProdu");
					pedidodetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoDetaProdu(true);
					pedidodetaproduBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoDetaProdu("n",pedidodetaproduBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidodetaproduBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidodetaproduBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidodetaproduBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidodetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoDetaProdu("relacionado");
					} else {
						pedidodetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoDetaProdu("no_relacionado");
					}

					pedidodetaproduBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoDetaProdu().setVisible(false);

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
