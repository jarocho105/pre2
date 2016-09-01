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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.VentasGeneralesConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class VentasGeneralesDetalleFormJInternalFrame extends VentasGeneralesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVentasGenerales;
	
	protected JMenuBar jmenuBarDetalleVentasGenerales;
	
	protected JMenu jmenuDetalleVentasGenerales;
	protected JMenu jmenuDetalleArchivoVentasGenerales;
	protected JMenu jmenuDetalleAccionesVentasGenerales;
	protected JMenu jmenuDetalleDatosVentasGenerales;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasGenerales;	
	protected GridBagConstraints gridBagConstraintsVentasGenerales;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VentasGeneralesBeanSwingJInternalFrameAdditional jInternalFrameDetalleVentasGenerales;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public VentasGeneralesSessionBean ventasgeneralesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public VentasGeneralesLogic ventasgeneralesLogic;
	
	public JScrollPane jScrollPanelDatosVentasGenerales;
	public JScrollPane jScrollPanelDatosEdicionVentasGenerales;
	public JScrollPane jScrollPanelDatosGeneralVentasGenerales;
	
	protected JPanel jPanelCamposVentasGenerales;    
	protected JPanel jPanelCamposOcultosVentasGenerales;    	
	protected JPanel jPanelAccionesVentasGenerales;
	protected JPanel jPanelAccionesFormularioVentasGenerales;
    
	
	
	protected Integer iXPanelCamposVentasGenerales=0;
	protected Integer iYPanelCamposVentasGenerales=0;
	
	protected Integer iXPanelCamposOcultosVentasGenerales=0;
	protected Integer iYPanelCamposOcultosVentasGenerales=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVentasGenerales;
	public JButton jButtonModificarVentasGenerales;
	public JButton jButtonActualizarVentasGenerales;
    public JButton jButtonEliminarVentasGenerales;
	public JButton jButtonCancelarVentasGenerales;
    public JButton jButtonGuardarCambiosVentasGenerales;
	public JButton jButtonGuardarCambiosTablaVentasGenerales;
	protected JButton jButtonCerrarVentasGenerales;
	
	
	protected JButton jButtonProcesarInformacionVentasGenerales;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVentasGenerales;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVentasGenerales;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVentasGenerales;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasGenerales;
	protected JButton jButtonModificarToolBarVentasGenerales;
	protected JButton jButtonActualizarToolBarVentasGenerales;
    protected JButton jButtonEliminarToolBarVentasGenerales;
	protected JButton jButtonCancelarToolBarVentasGenerales;
    protected JButton jButtonGuardarCambiosToolBarVentasGenerales;
	protected JButton jButtonGuardarCambiosTablaToolBarVentasGenerales;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasGenerales;
	protected JButton jButtonCerrarToolBarVentasGenerales;
	
	protected JButton jButtonProcesarInformacionToolBarVentasGenerales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasGenerales;
	protected JMenuItem jMenuItemModificarVentasGenerales;
	protected JMenuItem jMenuItemActualizarVentasGenerales;
    protected JMenuItem jMenuItemEliminarVentasGenerales;
	protected JMenuItem jMenuItemCancelarVentasGenerales;
    protected JMenuItem jMenuItemGuardarCambiosVentasGenerales;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasGenerales;
	protected JMenuItem jMenuItemCerrarVentasGenerales;
	protected JMenuItem jMenuItemDetalleCerrarVentasGenerales;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasGenerales;
	
	protected JMenuItem jMenuItemProcesarInformacionVentasGenerales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasGenerales;
	protected JMenuItem jMenuItemMostrarOcultarVentasGenerales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasGenerales;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasGenerales;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVentasGenerales;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVentasGenerales;
	public JLabel jLabelIdVentasGenerales;
	public JLabel jLabelidVentasGenerales;
	public JButton jButtonidVentasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeVentasGenerales;
	public JLabel jLabelfecha_emision_desdeVentasGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_desdeVentasGenerales;

	public JDateChooser jDateChooserfecha_emision_desdeVentasGenerales;
	public JButton jButtonfecha_emision_desdeVentasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaVentasGenerales;
	public JLabel jLabelfecha_emision_hastaVentasGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaVentasGenerales;

	public JDateChooser jDateChooserfecha_emision_hastaVentasGenerales;
	public JButton jButtonfecha_emision_hastaVentasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoVentasGenerales;
	public JLabel jLabelnombre_productoVentasGenerales;
	public JTextArea jTextAreanombre_productoVentasGenerales;
	public JScrollPane jscrollPanenombre_productoVentasGenerales;
	public JButton jButtonnombre_productoVentasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelmontoVentasGenerales;
	public JLabel jLabelmontoVentasGenerales;
	public JTextField jTextFieldmontoVentasGenerales;
	public JButton jButtonmontoVentasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoVentasGenerales;
	public JLabel jLabelcodigo_productoVentasGenerales;
	public JTextField jTextFieldcodigo_productoVentasGenerales;
	public JButton jButtoncodigo_productoVentasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnotas_creditoVentasGenerales;
	public JLabel jLabelnotas_creditoVentasGenerales;
	public JTextField jTextFieldnotas_creditoVentasGenerales;
	public JButton jButtonnotas_creditoVentasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelventa_netaVentasGenerales;
	public JLabel jLabelventa_netaVentasGenerales;
	public JTextField jTextFieldventa_netaVentasGenerales;
	public JButton jButtonventa_netaVentasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeVentasGenerales;
	public JLabel jLabelporcentajeVentasGenerales;
	public JTextField jTextFieldporcentajeVentasGenerales;
	public JButton jButtonporcentajeVentasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelacumuladoVentasGenerales;
	public JLabel jLabelacumuladoVentasGenerales;
	public JTextField jTextFieldacumuladoVentasGenerales;
	public JButton jButtonacumuladoVentasGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneltipoVentasGenerales;
	public JLabel jLabeltipoVentasGenerales;
	public JTextField jTextFieldtipoVentasGenerales;
	public JButton jButtontipoVentasGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVentasGenerales;
	public JLabel jLabelid_empresaVentasGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVentasGenerales;
	public JButton jButtonid_empresaVentasGenerales= new JButtonMe();
	public JButton jButtonid_empresaVentasGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_empresaVentasGeneralesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVentasGenerales;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VentasGeneralesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVentasGenerales=new JPanel();
				this.jPanelAccionesFormularioVentasGenerales=new JPanel();
				this.jmenuBarDetalleVentasGenerales=new JMenuBar();
				this.jTtoolBarDetalleVentasGenerales=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasGeneralesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VentasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VentasGeneralesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VentasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasGeneralesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasGeneralesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasGeneralesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVentasGenerales() {
		return this.jButtonActualizarToolBarVentasGenerales;
	}
	
	public JButton getjButtonEliminarToolBarVentasGenerales() {
		return this.jButtonEliminarToolBarVentasGenerales;
	}
	
	public JButton getjButtonCancelarToolBarVentasGenerales() {
		return this.jButtonCancelarToolBarVentasGenerales;
	}		
	
	public JButton getjButtonProcesarInformacionVentasGenerales() {
		return this.jButtonProcesarInformacionVentasGenerales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasGenerales)	{
		this.jButtonProcesarInformacionVentasGenerales = jButtonProcesarInformacionVentasGenerales;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasGenerales() {
		return this.jComboBoxTiposAccionesVentasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasGenerales(
			JComboBox jComboBoxTiposRelacionesVentasGenerales) {
		this.jComboBoxTiposRelacionesVentasGenerales = jComboBoxTiposRelacionesVentasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasGenerales(
			JComboBox jComboBoxTiposAccionesVentasGenerales) {
		this.jComboBoxTiposAccionesVentasGenerales = jComboBoxTiposAccionesVentasGenerales;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVentasGenerales() {
		return this.jComboBoxTiposAccionesFormularioVentasGenerales;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVentasGenerales(
			JComboBox jComboBoxTiposAccionesFormularioVentasGenerales) {
		this.jComboBoxTiposAccionesFormularioVentasGenerales = jComboBoxTiposAccionesFormularioVentasGenerales;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ventasgeneralesSessionBean=new VentasGeneralesSessionBean();
		
		this.ventasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventasgeneralesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasGeneralesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Generales MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
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
	
		VentasGeneralesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVentasGenerales= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVentasGenerales=new JButtonMe();
				this.jButtonModificarToolBarVentasGenerales=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVentasGenerales,this.jTtoolBarDetalleVentasGenerales,
							"actualizar","actualizar","Actualizar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVentasGenerales,this.jTtoolBarDetalleVentasGenerales,
							"eliminar","eliminar","Eliminar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVentasGenerales,this.jTtoolBarDetalleVentasGenerales,
							"cancelar","cancelar","Cancelar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVentasGenerales,this.jTtoolBarDetalleVentasGenerales,
							"guardarcambios","guardarcambios","Guardar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVentasGenerales=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVentasGenerales=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVentasGenerales=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVentasGenerales=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVentasGenerales=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasGenerales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasGenerales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasGenerales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVentasGenerales= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVentasGenerales.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVentasGenerales,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVentasGenerales= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVentasGenerales.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVentasGenerales,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVentasGenerales= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVentasGenerales.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVentasGenerales,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVentasGenerales= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVentasGenerales.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVentasGenerales,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVentasGenerales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasGenerales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasGenerales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVentasGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVentasGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVentasGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVentasGenerales.add(this.jMenuItemDetalleCerrarVentasGenerales);
		
		this.jmenuDetalleAccionesVentasGenerales.add(this.jMenuItemActualizarVentasGenerales);
		this.jmenuDetalleAccionesVentasGenerales.add(this.jMenuItemEliminarVentasGenerales);
		this.jmenuDetalleAccionesVentasGenerales.add(this.jMenuItemCancelarVentasGenerales);		
		
		//this.jmenuDetalleDatosVentasGenerales.add(this.jMenuItemDetalleAbrirOrderByVentasGenerales);				
		this.jmenuDetalleDatosVentasGenerales.add(this.jMenuItemDetalleMostarOcultarVentasGenerales);				
				
		//this.jmenuDetalleAccionesVentasGenerales.add(this.jMenuItemGuardarCambiosVentasGenerales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVentasGenerales.add(this.jmenuDetalleArchivoVentasGenerales);		
		this.jmenuBarDetalleVentasGenerales.add(this.jmenuDetalleAccionesVentasGenerales);		
		this.jmenuBarDetalleVentasGenerales.add(this.jmenuDetalleDatosVentasGenerales);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVentasGenerales);				
	}
	
	
	public void inicializarElementosCamposVentasGenerales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVentasGenerales = new JLabelMe();
		jLabelIdVentasGenerales.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVentasGenerales = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVentasGenerales= new GridBagLayout();

		this.jPanelidVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);

		jLabelidVentasGenerales = new JLabel();
		jLabelidVentasGenerales.setText("Id");

		jLabelidVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeVentasGenerales = new JLabelMe();
		this.jLabelfecha_emision_desdeVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeVentasGenerales.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPanelfecha_emision_desdeVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		//jFormattedTextFieldfecha_emision_desdeVentasGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeVentasGenerales= new JDateChooser();
		jDateChooserfecha_emision_desdeVentasGenerales.setEnabled(false);
		jDateChooserfecha_emision_desdeVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeVentasGenerales.setDate(new Date());
		jDateChooserfecha_emision_desdeVentasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeVentasGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeVentasGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeVentasGeneralesBusqueda.setText("U");
		this.jButtonfecha_emision_desdeVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeVentasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaVentasGenerales = new JLabelMe();
		this.jLabelfecha_emision_hastaVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaVentasGenerales.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPanelfecha_emision_hastaVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		//jFormattedTextFieldfecha_emision_hastaVentasGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaVentasGenerales= new JDateChooser();
		jDateChooserfecha_emision_hastaVentasGenerales.setEnabled(false);
		jDateChooserfecha_emision_hastaVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaVentasGenerales.setDate(new Date());
		jDateChooserfecha_emision_hastaVentasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaVentasGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaVentasGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaVentasGeneralesBusqueda.setText("U");
		this.jButtonfecha_emision_hastaVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaVentasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoVentasGenerales = new JLabelMe();
		this.jLabelnombre_productoVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoVentasGenerales.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPanelnombre_productoVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		jTextAreanombre_productoVentasGenerales= new JTextAreaMe();
		jTextAreanombre_productoVentasGenerales.setEnabled(false);
		jTextAreanombre_productoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentasGenerales.setLineWrap(true);
		jTextAreanombre_productoVentasGenerales.setWrapStyleWord(true);
		jTextAreanombre_productoVentasGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoVentasGenerales.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoVentasGenerales = new JScrollPane(jTextAreanombre_productoVentasGenerales);
		jscrollPanenombre_productoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoVentasGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_productoVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoVentasGeneralesBusqueda.setText("U");
		this.jButtonnombre_productoVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoVentasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelmontoVentasGenerales = new JLabelMe();
		this.jLabelmontoVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoVentasGenerales.setToolTipText("Monto");
		this.jLabelmontoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPanelmontoVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		jTextFieldmontoVentasGenerales= new JTextFieldMe();
		jTextFieldmontoVentasGenerales.setEnabled(false);
		jTextFieldmontoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoVentasGenerales.setText("0.0");

		this.jButtonmontoVentasGeneralesBusqueda= new JButtonMe();
		this.jButtonmontoVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoVentasGeneralesBusqueda.setText("U");
		this.jButtonmontoVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoVentasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoVentasGenerales = new JLabelMe();
		this.jLabelcodigo_productoVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoVentasGenerales.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPanelcodigo_productoVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		jTextFieldcodigo_productoVentasGenerales= new JTextFieldMe();

		jTextFieldcodigo_productoVentasGenerales.setEnabled(false);
		jTextFieldcodigo_productoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoVentasGeneralesBusqueda= new JButtonMe();
		this.jButtoncodigo_productoVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoVentasGeneralesBusqueda.setText("U");
		this.jButtoncodigo_productoVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoVentasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnotas_creditoVentasGenerales = new JLabelMe();
		this.jLabelnotas_creditoVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO+" : *");
		this.jLabelnotas_creditoVentasGenerales.setToolTipText("Notas Credito");
		this.jLabelnotas_creditoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnotas_creditoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnotas_creditoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnotas_creditoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnotas_creditoVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnotas_creditoVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPanelnotas_creditoVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		jTextFieldnotas_creditoVentasGenerales= new JTextFieldMe();
		jTextFieldnotas_creditoVentasGenerales.setEnabled(false);
		jTextFieldnotas_creditoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnotas_creditoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnotas_creditoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnotas_creditoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnotas_creditoVentasGenerales.setText("0.0");

		this.jButtonnotas_creditoVentasGeneralesBusqueda= new JButtonMe();
		this.jButtonnotas_creditoVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnotas_creditoVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnotas_creditoVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnotas_creditoVentasGeneralesBusqueda.setText("U");
		this.jButtonnotas_creditoVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnotas_creditoVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnotas_creditoVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnotas_creditoVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnotas_creditoVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"notas_creditoVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnotas_creditoVentasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelventa_netaVentasGenerales = new JLabelMe();
		this.jLabelventa_netaVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_VENTANETA+" : *");
		this.jLabelventa_netaVentasGenerales.setToolTipText("Venta Neta");
		this.jLabelventa_netaVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelventa_netaVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelventa_netaVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelventa_netaVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelventa_netaVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelventa_netaVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_VENTANETA);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPanelventa_netaVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		jTextFieldventa_netaVentasGenerales= new JTextFieldMe();
		jTextFieldventa_netaVentasGenerales.setEnabled(false);
		jTextFieldventa_netaVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldventa_netaVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldventa_netaVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldventa_netaVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldventa_netaVentasGenerales.setText("0.0");

		this.jButtonventa_netaVentasGeneralesBusqueda= new JButtonMe();
		this.jButtonventa_netaVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonventa_netaVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonventa_netaVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonventa_netaVentasGeneralesBusqueda.setText("U");
		this.jButtonventa_netaVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonventa_netaVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonventa_netaVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldventa_netaVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldventa_netaVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"venta_netaVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonventa_netaVentasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeVentasGenerales = new JLabelMe();
		this.jLabelporcentajeVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeVentasGenerales.setToolTipText("Porcentaje");
		this.jLabelporcentajeVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPanelporcentajeVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		jTextFieldporcentajeVentasGenerales= new JTextFieldMe();
		jTextFieldporcentajeVentasGenerales.setEnabled(false);
		jTextFieldporcentajeVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeVentasGenerales.setText("0.0");

		this.jButtonporcentajeVentasGeneralesBusqueda= new JButtonMe();
		this.jButtonporcentajeVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeVentasGeneralesBusqueda.setText("U");
		this.jButtonporcentajeVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeVentasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelacumuladoVentasGenerales = new JLabelMe();
		this.jLabelacumuladoVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_ACUMULADO+" : *");
		this.jLabelacumuladoVentasGenerales.setToolTipText("Acumulado");
		this.jLabelacumuladoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacumuladoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacumuladoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelacumuladoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelacumuladoVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelacumuladoVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_ACUMULADO);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPanelacumuladoVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		jTextFieldacumuladoVentasGenerales= new JTextFieldMe();
		jTextFieldacumuladoVentasGenerales.setEnabled(false);
		jTextFieldacumuladoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacumuladoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacumuladoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldacumuladoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldacumuladoVentasGenerales.setText("0.0");

		this.jButtonacumuladoVentasGeneralesBusqueda= new JButtonMe();
		this.jButtonacumuladoVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacumuladoVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacumuladoVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonacumuladoVentasGeneralesBusqueda.setText("U");
		this.jButtonacumuladoVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonacumuladoVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonacumuladoVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldacumuladoVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldacumuladoVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"acumuladoVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonacumuladoVentasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeltipoVentasGenerales = new JLabelMe();
		this.jLabeltipoVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoVentasGenerales.setToolTipText("Tipo");
		this.jLabeltipoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPaneltipoVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		jTextFieldtipoVentasGenerales= new JTextFieldMe();

		jTextFieldtipoVentasGenerales.setEnabled(false);
		jTextFieldtipoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipoVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoVentasGeneralesBusqueda= new JButtonMe();
		this.jButtontipoVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoVentasGeneralesBusqueda.setText("U");
		this.jButtontipoVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipoVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipoVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoVentasGeneralesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVentasGenerales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVentasGenerales = new JLabelMe();
		this.jLabelid_empresaVentasGenerales.setText(""+VentasGeneralesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVentasGenerales.setToolTipText("Empresa");
		this.jLabelid_empresaVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVentasGenerales.setToolTipText(VentasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVentasGenerales = new GridBagLayout();
		this.jPanelid_empresaVentasGenerales.setLayout(this.gridaBagLayoutVentasGenerales);


		jComboBoxid_empresaVentasGenerales= new JComboBoxMe();
		jComboBoxid_empresaVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVentasGenerales.setEnabled(false);

		this.jButtonid_empresaVentasGenerales= new JButtonMe();
		this.jButtonid_empresaVentasGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasGenerales.setText("Buscar");
		this.jButtonid_empresaVentasGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVentasGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasGenerales"));

		this.jButtonid_empresaVentasGeneralesBusqueda= new JButtonMe();
		this.jButtonid_empresaVentasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasGeneralesBusqueda.setText("U");
		this.jButtonid_empresaVentasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVentasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasGeneralesBusqueda"));

		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVentasGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_empresaVentasGeneralesUpdate= new JButtonMe();
		this.jButtonid_empresaVentasGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasGeneralesUpdate.setText("U");
		this.jButtonid_empresaVentasGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVentasGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasGeneralesUpdate"));



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
		//this.jInternalFrameDetalleVentasGenerales = new VentasGeneralesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ventas Generales DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasGenerales= new GridBagLayout();
		

		
		String sToolTipVentasGenerales="";
		sToolTipVentasGenerales=VentasGeneralesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasGenerales+="(Facturacion.VentasGenerales)";
		}
		
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasGenerales+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVentasGenerales = new JButtonMe();
		this.jButtonModificarVentasGenerales = new JButtonMe();
        this.jButtonActualizarVentasGenerales = new JButtonMe();
        this.jButtonEliminarVentasGenerales = new JButtonMe();
        this.jButtonCancelarVentasGenerales = new JButtonMe();
        this.jButtonGuardarCambiosVentasGenerales = new JButtonMe();
		this.jButtonGuardarCambiosTablaVentasGenerales = new JButtonMe();
		this.jButtonCerrarVentasGenerales = new JButtonMe();
		
		this.jScrollPanelDatosVentasGenerales = new JScrollPane();   
        this.jScrollPanelDatosEdicionVentasGenerales = new JScrollPane();
		this.jScrollPanelDatosGeneralVentasGenerales = new JScrollPane();
				
		
		
		this.jPanelCamposVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Generales";
		
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Generaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVentasGenerales.setName("jPanelCamposVentasGenerales"); 

		this.jPanelCamposOcultosVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVentasGenerales.setName("jPanelCamposOcultosVentasGenerales"); 

        this.jPanelAccionesVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasGenerales.setToolTipText("Acciones");
        this.jPanelAccionesVentasGenerales.setName("Acciones"); 

		this.jPanelAccionesFormularioVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVentasGenerales.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVentasGenerales.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVentasGenerales.setText("Nuevo");
		this.jButtonModificarVentasGenerales.setText("Editar");
        this.jButtonActualizarVentasGenerales.setText("Actualizar");
        this.jButtonEliminarVentasGenerales.setText("Eliminar");
        this.jButtonCancelarVentasGenerales.setText("Cancelar");
        this.jButtonGuardarCambiosVentasGenerales.setText("Guardar");
		this.jButtonGuardarCambiosTablaVentasGenerales.setText("Guardar");
		this.jButtonCerrarVentasGenerales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasGenerales,"nuevo_button","Nuevo",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVentasGenerales,"modificar_button","Editar",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVentasGenerales,"actualizar_button","Actualizar",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVentasGenerales,"eliminar_button","Eliminar",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVentasGenerales,"cancelar_button","Cancelar",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVentasGenerales,"guardarcambios_button","Guardar",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasGenerales,"guardarcambiostabla_button","Guardar",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasGenerales,"cerrar_button","Salir",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVentasGenerales.setToolTipText("Nuevo"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVentasGenerales.setToolTipText("Editar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVentasGenerales.setToolTipText("Actualizar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVentasGenerales.setToolTipText("Eliminar)"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVentasGenerales.setToolTipText("Cancelar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVentasGenerales.setToolTipText("Guardar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVentasGenerales.setToolTipText("Guardar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasGenerales.setToolTipText("Salir"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasGenerales";
		inputMap = this.jButtonNuevoVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasGenerales"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVentasGenerales";
		inputMap = this.jButtonActualizarVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVentasGenerales"));
		
		//ELIMINAR
		sMapKey = "EliminarVentasGenerales";
		inputMap = this.jButtonEliminarVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVentasGenerales"));
		
		//CANCELAR	
		sMapKey = "CancelarVentasGenerales";
		inputMap = this.jButtonCancelarVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVentasGenerales"));
		
		//CERRAR		
		sMapKey = "CerrarVentasGenerales";
		inputMap = this.jButtonCerrarVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasGenerales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasGenerales";
		inputMap = this.jButtonGuardarCambiosTablaVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasGenerales"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVentasGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVentasGenerales.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVentasGenerales.setToolTipText("Nuevo VentasGenerales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVentasGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVentasGenerales.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVentasGenerales.setToolTipText("Sin Cerrar Ventana VentasGenerales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVentasGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVentasGenerales.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVentasGenerales.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVentasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasGenerales.setText("Accion");
		this.jComboBoxTiposAccionesVentasGenerales.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVentasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVentasGenerales.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVentasGenerales.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVentasGenerales = new JLabelMe();
		
		this.jLabelAccionesVentasGenerales.setText("Acciones");		
		this.jLabelAccionesVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVentasGenerales();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVentasGenerales();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVentasGenerales=new JTabbedPane();
		this.jTabbedPaneRelacionesVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVentasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVentasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVentasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasGenerales.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVentasGenerales = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVentasGenerales = new GridBagLayout();
		
		this.jPanelCamposVentasGenerales.setLayout(gridaBagLayoutCamposVentasGenerales);
		this.jPanelCamposOcultosVentasGenerales.setLayout(gridaBagLayoutCamposOcultosVentasGenerales);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVentasGenerales.add(jLabelIdVentasGenerales, this.gridBagConstraintsVentasGenerales);



	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVentasGenerales.add(jLabelidVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVentasGenerales.add(jLabelid_empresaVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasGenerales.add(jButtonid_empresaVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 3;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasGenerales.add(jButtonid_empresaVentasGeneralesUpdate, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVentasGenerales.add(jComboBoxid_empresaVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeVentasGenerales.add(jLabelfecha_emision_desdeVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeVentasGenerales.add(jButtonfecha_emision_desdeVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeVentasGenerales.add(jDateChooserfecha_emision_desdeVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaVentasGenerales.add(jLabelfecha_emision_hastaVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaVentasGenerales.add(jButtonfecha_emision_hastaVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaVentasGenerales.add(jDateChooserfecha_emision_hastaVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoVentasGenerales.add(jLabelnombre_productoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoVentasGenerales.add(jButtonnombre_productoVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoVentasGenerales.add(jscrollPanenombre_productoVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoVentasGenerales.add(jLabelmontoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoVentasGenerales.add(jButtonmontoVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoVentasGenerales.add(jTextFieldmontoVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoVentasGenerales.add(jLabelcodigo_productoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoVentasGenerales.add(jButtoncodigo_productoVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoVentasGenerales.add(jTextFieldcodigo_productoVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnotas_creditoVentasGenerales.add(jLabelnotas_creditoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnotas_creditoVentasGenerales.add(jButtonnotas_creditoVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnotas_creditoVentasGenerales.add(jTextFieldnotas_creditoVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelventa_netaVentasGenerales.add(jLabelventa_netaVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelventa_netaVentasGenerales.add(jButtonventa_netaVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelventa_netaVentasGenerales.add(jTextFieldventa_netaVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeVentasGenerales.add(jLabelporcentajeVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeVentasGenerales.add(jButtonporcentajeVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeVentasGenerales.add(jTextFieldporcentajeVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelacumuladoVentasGenerales.add(jLabelacumuladoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelacumuladoVentasGenerales.add(jButtonacumuladoVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelacumuladoVentasGenerales.add(jTextFieldacumuladoVentasGenerales, this.gridBagConstraintsVentasGenerales);


	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 0;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoVentasGenerales.add(jLabeltipoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 2;
		this.gridBagConstraintsVentasGenerales.ipadx = 0;
		this.gridBagConstraintsVentasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoVentasGenerales.add(jButtontipoVentasGeneralesBusqueda, this.gridBagConstraintsVentasGenerales);
	}

	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasGenerales.gridy = 0;
	this.gridBagConstraintsVentasGenerales.gridx = 1;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoVentasGenerales.add(jTextFieldtipoVentasGenerales, this.gridBagConstraintsVentasGenerales);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPanelidVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPanelfecha_emision_desdeVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPanelfecha_emision_hastaVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPanelnombre_productoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPanelmontoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPanelcodigo_productoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPanelnotas_creditoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPanelventa_netaVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPanelporcentajeVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPanelacumuladoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasGenerales.add(this.jPaneltipoVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposVentasGenerales % 1==0) {
		iXPanelCamposVentasGenerales=0;
		iYPanelCamposVentasGenerales++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasGenerales.gridy = iYPanelCamposOcultosVentasGenerales;
	this.gridBagConstraintsVentasGenerales.gridx = iXPanelCamposOcultosVentasGenerales++;
	this.gridBagConstraintsVentasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasGenerales.add(this.jPanelid_empresaVentasGenerales, this.gridBagConstraintsVentasGenerales);



	if(iXPanelCamposOcultosVentasGenerales % 1==0) {
		iXPanelCamposOcultosVentasGenerales=0;
		iYPanelCamposOcultosVentasGenerales++;
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
			
		GridBagLayout gridaBagLayoutAccionesVentasGenerales= new GridBagLayout();
		this.jPanelAccionesVentasGenerales.setLayout(gridaBagLayoutAccionesVentasGenerales);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVentasGenerales= new GridBagLayout();
		this.jPanelAccionesFormularioVentasGenerales.setLayout(gridaBagLayoutAccionesFormularioVentasGenerales);
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVentasGenerales.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVentasGenerales.add(this.jComboBoxTiposAccionesFormularioVentasGenerales, this.gridBagConstraintsVentasGenerales);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = iPosXAccion++;
			
		this.jPanelAccionesVentasGenerales.add(this.jButtonModificarVentasGenerales, this.gridBagConstraintsVentasGenerales);							

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx =iPosXAccion++;
			
		this.jPanelAccionesVentasGenerales.add(this.jButtonEliminarVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
			
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = 0;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasGenerales.add(this.jButtonActualizarVentasGenerales, this.gridBagConstraintsVentasGenerales);


		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = 0;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasGenerales.add(this.jButtonGuardarCambiosVentasGenerales, this.gridBagConstraintsVentasGenerales);	
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = 0;		
		this.gridBagConstraintsVentasGenerales.gridx =iPosXAccion++;
		
		this.jPanelAccionesVentasGenerales.add(this.jButtonCancelarVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasGenerales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasGenerales);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();						
			this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasGenerales.gridx = 0;		
			//this.gridBagConstraintsVentasGenerales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasGenerales.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasGenerales.gridx =0;
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasGenerales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasGenerales, this.gridBagConstraintsVentasGenerales);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VentasGeneralesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVentasGenerales = new VentasGeneralesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ventas Generales DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ventas Generales DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Generales Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VentasGeneralesModel ventasgeneralesModel=new VentasGeneralesModel(this);
			
			//SI USARA CLASE INTERNA
			//VentasGeneralesModel.VentasGeneralesFocusTraversalPolicy ventasgeneralesFocusTraversalPolicy = ventasgeneralesModel.new VentasGeneralesFocusTraversalPolicy(this);
			
			//ventasgeneralesFocusTraversalPolicy.setventasgeneralesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ventasgeneralesModel);
			
			
			this.jContentPaneDetalleVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVentasGenerales = new GridBagLayout();	
			this.jContentPaneDetalleVentasGenerales.setLayout(gridaBagLayoutDetalleVentasGenerales);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasGenerales = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
				this.gridBagConstraintsVentasGenerales.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVentasGenerales.gridx = 0;
					
				
				this.jContentPaneDetalleVentasGenerales.add(jTtoolBarDetalleVentasGenerales, gridBagConstraintsVentasGenerales);								
				
}
			
			this.jScrollPanelDatosEdicionVentasGenerales=   new JScrollPane(jContentPaneDetalleVentasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVentasGenerales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVentasGenerales.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVentasGenerales.gridx = 0;
	        
			this.jContentPaneDetalleVentasGenerales.add(jPanelCamposVentasGenerales, gridBagConstraintsVentasGenerales);
			
			
			
			
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
						//&& ventasgeneralesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ventasgeneralesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVentasGenerales= new GridBagConstraints();
						this.gridBagConstraintsVentasGenerales.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVentasGenerales.gridx = 0;
						this.jContentPaneDetalleVentasGenerales.add(this.jTabbedPaneRelacionesVentasGenerales, this.gridBagConstraintsVentasGenerales);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVentasGenerales.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVentasGenerales.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
					this.gridBagConstraintsVentasGenerales.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVentasGenerales.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVentasGenerales.gridx = 0;
					
				
					this.jContentPaneDetalleVentasGenerales.add(jPanelCamposOcultosVentasGenerales, gridBagConstraintsVentasGenerales);
				
					this.jPanelCamposOcultosVentasGenerales.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVentasGenerales.gridx = 0;
	        this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVentasGenerales.add(this.jPanelAccionesFormularioVentasGenerales, this.gridBagConstraintsVentasGenerales);							
			
			
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
	        this.gridBagConstraintsVentasGenerales.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVentasGenerales.gridx = 0;
	        
			
			this.jContentPaneDetalleVentasGenerales.add(this.jPanelAccionesVentasGenerales, this.gridBagConstraintsVentasGenerales);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVentasGenerales);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVentasGenerales=   new JScrollPane(this.jPanelCamposVentasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVentasGenerales.gridx = 0;
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVentasGenerales.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVentasGenerales, this.gridBagConstraintsVentasGenerales);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasGenerales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVentasGenerales, this.gridBagConstraintsVentasGenerales);			
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasGenerales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVentasGenerales, this.gridBagConstraintsVentasGenerales);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasGenerales, this.gridBagConstraintsVentasGenerales);
			
			
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
			
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasGenerales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasGenerales, this.gridBagConstraintsVentasGenerales);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVentasGenerales;//jContentPane;
		
		return jScrollPanelDatosEdicionVentasGenerales;
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
