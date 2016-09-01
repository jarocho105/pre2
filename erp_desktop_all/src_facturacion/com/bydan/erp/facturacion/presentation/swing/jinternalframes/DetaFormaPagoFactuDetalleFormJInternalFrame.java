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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.DetaFormaPagoFactuConstantesFunciones;

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
public class DetaFormaPagoFactuDetalleFormJInternalFrame extends DetaFormaPagoFactuBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetaFormaPagoFactu;
	
	protected JMenuBar jmenuBarDetalleDetaFormaPagoFactu;
	
	protected JMenu jmenuDetalleDetaFormaPagoFactu;
	protected JMenu jmenuDetalleArchivoDetaFormaPagoFactu;
	protected JMenu jmenuDetalleAccionesDetaFormaPagoFactu;
	protected JMenu jmenuDetalleDatosDetaFormaPagoFactu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetaFormaPagoFactu;	
	protected GridBagConstraints gridBagConstraintsDetaFormaPagoFactu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetaFormaPagoFactuBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetaFormaPagoFactu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";
	
	public DetaFormaPagoFactuSessionBean detaformapagofactuSessionBean;
	
	

	public DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame=null;
	public DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetaFormaPago=false;
	public DetaFormaPagoSessionBean detaformapagoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;	
	
	public DetaFormaPagoFactuLogic detaformapagofactuLogic;
	
	public JScrollPane jScrollPanelDatosDetaFormaPagoFactu;
	public JScrollPane jScrollPanelDatosEdicionDetaFormaPagoFactu;
	public JScrollPane jScrollPanelDatosGeneralDetaFormaPagoFactu;
	
	protected JPanel jPanelCamposDetaFormaPagoFactu;    
	protected JPanel jPanelCamposOcultosDetaFormaPagoFactu;    	
	protected JPanel jPanelAccionesDetaFormaPagoFactu;
	protected JPanel jPanelAccionesFormularioDetaFormaPagoFactu;
    
	
	
	protected Integer iXPanelCamposDetaFormaPagoFactu=0;
	protected Integer iYPanelCamposDetaFormaPagoFactu=0;
	
	protected Integer iXPanelCamposOcultosDetaFormaPagoFactu=0;
	protected Integer iYPanelCamposOcultosDetaFormaPagoFactu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetaFormaPagoFactu;
	public JButton jButtonModificarDetaFormaPagoFactu;
	public JButton jButtonActualizarDetaFormaPagoFactu;
    public JButton jButtonEliminarDetaFormaPagoFactu;
	public JButton jButtonCancelarDetaFormaPagoFactu;
    public JButton jButtonGuardarCambiosDetaFormaPagoFactu;
	public JButton jButtonGuardarCambiosTablaDetaFormaPagoFactu;
	protected JButton jButtonCerrarDetaFormaPagoFactu;
	
	
	protected JButton jButtonProcesarInformacionDetaFormaPagoFactu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetaFormaPagoFactu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetaFormaPagoFactu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetaFormaPagoFactu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetaFormaPagoFactu;
	protected JButton jButtonModificarToolBarDetaFormaPagoFactu;
	protected JButton jButtonActualizarToolBarDetaFormaPagoFactu;
    protected JButton jButtonEliminarToolBarDetaFormaPagoFactu;
	protected JButton jButtonCancelarToolBarDetaFormaPagoFactu;
    protected JButton jButtonGuardarCambiosToolBarDetaFormaPagoFactu;
	protected JButton jButtonGuardarCambiosTablaToolBarDetaFormaPagoFactu;
	protected JButton jButtonMostrarOcultarTablaToolBarDetaFormaPagoFactu;
	protected JButton jButtonCerrarToolBarDetaFormaPagoFactu;
	
	protected JButton jButtonProcesarInformacionToolBarDetaFormaPagoFactu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetaFormaPagoFactu;
	protected JMenuItem jMenuItemModificarDetaFormaPagoFactu;
	protected JMenuItem jMenuItemActualizarDetaFormaPagoFactu;
    protected JMenuItem jMenuItemEliminarDetaFormaPagoFactu;
	protected JMenuItem jMenuItemCancelarDetaFormaPagoFactu;
    protected JMenuItem jMenuItemGuardarCambiosDetaFormaPagoFactu;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetaFormaPagoFactu;
	protected JMenuItem jMenuItemCerrarDetaFormaPagoFactu;
	protected JMenuItem jMenuItemDetalleCerrarDetaFormaPagoFactu;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetaFormaPagoFactu;
	
	protected JMenuItem jMenuItemProcesarInformacionDetaFormaPagoFactu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetaFormaPagoFactu;
	protected JMenuItem jMenuItemMostrarOcultarDetaFormaPagoFactu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetaFormaPagoFactu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetaFormaPagoFactu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetaFormaPagoFactu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetaFormaPagoFactu;
	public JLabel jLabelIdDetaFormaPagoFactu;
	public JLabel jLabelidDetaFormaPagoFactu;
	public JButton jButtonidDetaFormaPagoFactuBusqueda= new JButtonMe();

	public JPanel jPanelnombreDetaFormaPagoFactu;
	public JLabel jLabelnombreDetaFormaPagoFactu;
	public JTextArea jTextAreanombreDetaFormaPagoFactu;
	public JScrollPane jscrollPanenombreDetaFormaPagoFactu;
	public JButton jButtonnombreDetaFormaPagoFactuBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetaFormaPagoFactu;
	public JLabel jLabeldescripcionDetaFormaPagoFactu;
	public JTextArea jTextAreadescripcionDetaFormaPagoFactu;
	public JScrollPane jscrollPanedescripcionDetaFormaPagoFactu;
	public JButton jButtondescripcionDetaFormaPagoFactuBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetaFormaPagoFactu;
	public JLabel jLabelid_empresaDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetaFormaPagoFactu;
	public JButton jButtonid_empresaDetaFormaPagoFactu= new JButtonMe();
	public JButton jButtonid_empresaDetaFormaPagoFactuUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetaFormaPagoFactuBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoDetaFormaPagoFactu;
	public JLabel jLabelid_tipo_forma_pagoDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu;
	public JButton jButtonid_tipo_forma_pagoDetaFormaPagoFactu= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetaFormaPagoFactu;
	
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
	
	public DetaFormaPagoFactuDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetaFormaPagoFactu=new JPanel();
				this.jPanelAccionesFormularioDetaFormaPagoFactu=new JPanel();
				this.jmenuBarDetalleDetaFormaPagoFactu=new JMenuBar();
				this.jTtoolBarDetalleDetaFormaPagoFactu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoFactuDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetaFormaPagoFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetaFormaPagoFactuDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetaFormaPagoFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoFactuDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaFormaPagoFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoFactuDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaFormaPagoFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoFactuDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetaFormaPagoFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetaFormaPagoFactu() {
		return this.jButtonActualizarToolBarDetaFormaPagoFactu;
	}
	
	public JButton getjButtonEliminarToolBarDetaFormaPagoFactu() {
		return this.jButtonEliminarToolBarDetaFormaPagoFactu;
	}
	
	public JButton getjButtonCancelarToolBarDetaFormaPagoFactu() {
		return this.jButtonCancelarToolBarDetaFormaPagoFactu;
	}		
	
	public JButton getjButtonProcesarInformacionDetaFormaPagoFactu() {
		return this.jButtonProcesarInformacionDetaFormaPagoFactu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetaFormaPagoFactu)	{
		this.jButtonProcesarInformacionDetaFormaPagoFactu = jButtonProcesarInformacionDetaFormaPagoFactu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetaFormaPagoFactu() {
		return this.jComboBoxTiposAccionesDetaFormaPagoFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetaFormaPagoFactu(
			JComboBox jComboBoxTiposRelacionesDetaFormaPagoFactu) {
		this.jComboBoxTiposRelacionesDetaFormaPagoFactu = jComboBoxTiposRelacionesDetaFormaPagoFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetaFormaPagoFactu(
			JComboBox jComboBoxTiposAccionesDetaFormaPagoFactu) {
		this.jComboBoxTiposAccionesDetaFormaPagoFactu = jComboBoxTiposAccionesDetaFormaPagoFactu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetaFormaPagoFactu() {
		return this.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetaFormaPagoFactu(
			JComboBox jComboBoxTiposAccionesFormularioDetaFormaPagoFactu) {
		this.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu = jComboBoxTiposAccionesFormularioDetaFormaPagoFactu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
		
		this.detaformapagofactuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detaformapagofactuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detaformapagofactuSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detaformapagoSessionBean=new DetaFormaPagoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetaFormaPagoFactuJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetaFormaPagoFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetaFormaPagoFactuJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Deta Forma Pago Factu MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
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
	
		DetaFormaPagoFactuJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetaFormaPagoFactu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetaFormaPagoFactu=new JButtonMe();
				this.jButtonModificarToolBarDetaFormaPagoFactu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetaFormaPagoFactu,this.jTtoolBarDetalleDetaFormaPagoFactu,
							"actualizar","actualizar","Actualizar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetaFormaPagoFactu,this.jTtoolBarDetalleDetaFormaPagoFactu,
							"eliminar","eliminar","Eliminar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetaFormaPagoFactu,this.jTtoolBarDetalleDetaFormaPagoFactu,
							"cancelar","cancelar","Cancelar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetaFormaPagoFactu,this.jTtoolBarDetalleDetaFormaPagoFactu,
							"guardarcambios","guardarcambios","Guardar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetaFormaPagoFactu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetaFormaPagoFactu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetaFormaPagoFactu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetaFormaPagoFactu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetaFormaPagoFactu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetaFormaPagoFactu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetaFormaPagoFactu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetaFormaPagoFactu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetaFormaPagoFactu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetaFormaPagoFactu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetaFormaPagoFactu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetaFormaPagoFactu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetaFormaPagoFactu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetaFormaPagoFactu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetaFormaPagoFactu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetaFormaPagoFactu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetaFormaPagoFactu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetaFormaPagoFactu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetaFormaPagoFactu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetaFormaPagoFactu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetaFormaPagoFactu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetaFormaPagoFactu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetaFormaPagoFactu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetaFormaPagoFactu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetaFormaPagoFactu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetaFormaPagoFactu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetaFormaPagoFactu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetaFormaPagoFactu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetaFormaPagoFactu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetaFormaPagoFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetaFormaPagoFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetaFormaPagoFactu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetaFormaPagoFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetaFormaPagoFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetaFormaPagoFactu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetaFormaPagoFactu.add(this.jMenuItemDetalleCerrarDetaFormaPagoFactu);
		
		this.jmenuDetalleAccionesDetaFormaPagoFactu.add(this.jMenuItemActualizarDetaFormaPagoFactu);
		this.jmenuDetalleAccionesDetaFormaPagoFactu.add(this.jMenuItemEliminarDetaFormaPagoFactu);
		this.jmenuDetalleAccionesDetaFormaPagoFactu.add(this.jMenuItemCancelarDetaFormaPagoFactu);		
		
		//this.jmenuDetalleDatosDetaFormaPagoFactu.add(this.jMenuItemDetalleAbrirOrderByDetaFormaPagoFactu);				
		this.jmenuDetalleDatosDetaFormaPagoFactu.add(this.jMenuItemDetalleMostarOcultarDetaFormaPagoFactu);				
				
		//this.jmenuDetalleAccionesDetaFormaPagoFactu.add(this.jMenuItemGuardarCambiosDetaFormaPagoFactu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetaFormaPagoFactu.add(this.jmenuDetalleArchivoDetaFormaPagoFactu);		
		this.jmenuBarDetalleDetaFormaPagoFactu.add(this.jmenuDetalleAccionesDetaFormaPagoFactu);		
		this.jmenuBarDetalleDetaFormaPagoFactu.add(this.jmenuDetalleDatosDetaFormaPagoFactu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDetaFormaPagoFactu.add(this.jmenuDetalleDetaFormaPagoFactu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetaFormaPagoFactu);				
	}
	
	
	public void inicializarElementosCamposDetaFormaPagoFactu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetaFormaPagoFactu = new JLabelMe();
		jLabelIdDetaFormaPagoFactu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetaFormaPagoFactu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetaFormaPagoFactu.setToolTipText(DetaFormaPagoFactuConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetaFormaPagoFactu= new GridBagLayout();

		this.jPanelidDetaFormaPagoFactu.setLayout(this.gridaBagLayoutDetaFormaPagoFactu);

		jLabelidDetaFormaPagoFactu = new JLabel();
		jLabelidDetaFormaPagoFactu.setText("Id");

		jLabelidDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreDetaFormaPagoFactu = new JLabelMe();
		this.jLabelnombreDetaFormaPagoFactu.setText(""+DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDetaFormaPagoFactu.setToolTipText("Nombre");
		this.jLabelnombreDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDetaFormaPagoFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDetaFormaPagoFactu.setToolTipText(DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDetaFormaPagoFactu = new GridBagLayout();
		this.jPanelnombreDetaFormaPagoFactu.setLayout(this.gridaBagLayoutDetaFormaPagoFactu);


		jTextAreanombreDetaFormaPagoFactu= new JTextAreaMe();
		jTextAreanombreDetaFormaPagoFactu.setEnabled(false);
		jTextAreanombreDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetaFormaPagoFactu.setLineWrap(true);
		jTextAreanombreDetaFormaPagoFactu.setWrapStyleWord(true);
		jTextAreanombreDetaFormaPagoFactu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDetaFormaPagoFactu.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDetaFormaPagoFactu = new JScrollPane(jTextAreanombreDetaFormaPagoFactu);
		jscrollPanenombreDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreDetaFormaPagoFactuBusqueda= new JButtonMe();
		this.jButtonnombreDetaFormaPagoFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetaFormaPagoFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetaFormaPagoFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDetaFormaPagoFactuBusqueda.setText("U");
		this.jButtonnombreDetaFormaPagoFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDetaFormaPagoFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDetaFormaPagoFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDetaFormaPagoFactuBusqueda"));

		if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDetaFormaPagoFactuBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetaFormaPagoFactu = new JLabelMe();
		this.jLabeldescripcionDetaFormaPagoFactu.setText(""+DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetaFormaPagoFactu.setToolTipText("Descripcion");
		this.jLabeldescripcionDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetaFormaPagoFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetaFormaPagoFactu.setToolTipText(DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetaFormaPagoFactu = new GridBagLayout();
		this.jPaneldescripcionDetaFormaPagoFactu.setLayout(this.gridaBagLayoutDetaFormaPagoFactu);


		jTextAreadescripcionDetaFormaPagoFactu= new JTextAreaMe();
		jTextAreadescripcionDetaFormaPagoFactu.setEnabled(false);
		jTextAreadescripcionDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaFormaPagoFactu.setLineWrap(true);
		jTextAreadescripcionDetaFormaPagoFactu.setWrapStyleWord(true);
		jTextAreadescripcionDetaFormaPagoFactu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetaFormaPagoFactu.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetaFormaPagoFactu = new JScrollPane(jTextAreadescripcionDetaFormaPagoFactu);
		jscrollPanedescripcionDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetaFormaPagoFactuBusqueda= new JButtonMe();
		this.jButtondescripcionDetaFormaPagoFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetaFormaPagoFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetaFormaPagoFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetaFormaPagoFactuBusqueda.setText("U");
		this.jButtondescripcionDetaFormaPagoFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetaFormaPagoFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetaFormaPagoFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetaFormaPagoFactuBusqueda"));

		if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetaFormaPagoFactuBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetaFormaPagoFactu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetaFormaPagoFactu = new JLabelMe();
		this.jLabelid_empresaDetaFormaPagoFactu.setText(""+DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetaFormaPagoFactu.setToolTipText("Empresa");
		this.jLabelid_empresaDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetaFormaPagoFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetaFormaPagoFactu.setToolTipText(DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetaFormaPagoFactu = new GridBagLayout();
		this.jPanelid_empresaDetaFormaPagoFactu.setLayout(this.gridaBagLayoutDetaFormaPagoFactu);


		jComboBoxid_empresaDetaFormaPagoFactu= new JComboBoxMe();
		jComboBoxid_empresaDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetaFormaPagoFactu.setEnabled(false);

		this.jButtonid_empresaDetaFormaPagoFactu= new JButtonMe();
		this.jButtonid_empresaDetaFormaPagoFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaFormaPagoFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaFormaPagoFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaFormaPagoFactu.setText("Buscar");
		this.jButtonid_empresaDetaFormaPagoFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetaFormaPagoFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaFormaPagoFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaFormaPagoFactu"));

		this.jButtonid_empresaDetaFormaPagoFactuBusqueda= new JButtonMe();
		this.jButtonid_empresaDetaFormaPagoFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaFormaPagoFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaFormaPagoFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetaFormaPagoFactuBusqueda.setText("U");
		this.jButtonid_empresaDetaFormaPagoFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetaFormaPagoFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaFormaPagoFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaFormaPagoFactuBusqueda"));

		if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetaFormaPagoFactuBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetaFormaPagoFactuUpdate= new JButtonMe();
		this.jButtonid_empresaDetaFormaPagoFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaFormaPagoFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaFormaPagoFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetaFormaPagoFactuUpdate.setText("U");
		this.jButtonid_empresaDetaFormaPagoFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetaFormaPagoFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaFormaPagoFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaFormaPagoFactuUpdate"));



					
		this.jLabelid_tipo_forma_pagoDetaFormaPagoFactu = new JLabelMe();
		this.jLabelid_tipo_forma_pagoDetaFormaPagoFactu.setText(""+DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoDetaFormaPagoFactu.setToolTipText("Tipo Forma Pago");
		this.jLabelid_tipo_forma_pagoDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoDetaFormaPagoFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoDetaFormaPagoFactu.setToolTipText(DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutDetaFormaPagoFactu = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoDetaFormaPagoFactu.setLayout(this.gridaBagLayoutDetaFormaPagoFactu);


		jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactu= new JButtonMe();
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactu.setText("Buscar");
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoDetaFormaPagoFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoDetaFormaPagoFactu"));

		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoDetaFormaPagoFactuBusqueda"));

		if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoDetaFormaPagoFactuUpdate"));



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
		//this.jInternalFrameDetalleDetaFormaPagoFactu = new DetaFormaPagoFactuBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Deta Forma Pago Factu DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetaFormaPagoFactu= new GridBagLayout();
		

		
		String sToolTipDetaFormaPagoFactu="";
		sToolTipDetaFormaPagoFactu=DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetaFormaPagoFactu+="(Facturacion.DetaFormaPagoFactu)";
		}
		
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetaFormaPagoFactu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetaFormaPagoFactu = new JButtonMe();
		this.jButtonModificarDetaFormaPagoFactu = new JButtonMe();
        this.jButtonActualizarDetaFormaPagoFactu = new JButtonMe();
        this.jButtonEliminarDetaFormaPagoFactu = new JButtonMe();
        this.jButtonCancelarDetaFormaPagoFactu = new JButtonMe();
        this.jButtonGuardarCambiosDetaFormaPagoFactu = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu = new JButtonMe();
		this.jButtonCerrarDetaFormaPagoFactu = new JButtonMe();
		
		this.jScrollPanelDatosDetaFormaPagoFactu = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetaFormaPagoFactu = new JScrollPane();
		this.jScrollPanelDatosGeneralDetaFormaPagoFactu = new JScrollPane();
				
		
		
		this.jPanelCamposDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Deta Forma Pago Factu";
		
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pago Factus" + this.sPath));
		} else {
			this.jScrollPanelDatosDetaFormaPagoFactu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetaFormaPagoFactu.setName("jPanelCamposDetaFormaPagoFactu"); 

		this.jPanelCamposOcultosDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetaFormaPagoFactu.setName("jPanelCamposOcultosDetaFormaPagoFactu"); 

        this.jPanelAccionesDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetaFormaPagoFactu.setToolTipText("Acciones");
        this.jPanelAccionesDetaFormaPagoFactu.setName("Acciones"); 

		this.jPanelAccionesFormularioDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetaFormaPagoFactu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetaFormaPagoFactu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetaFormaPagoFactu.setText("Nuevo");
		this.jButtonModificarDetaFormaPagoFactu.setText("Editar");
        this.jButtonActualizarDetaFormaPagoFactu.setText("Actualizar");
        this.jButtonEliminarDetaFormaPagoFactu.setText("Eliminar");
        this.jButtonCancelarDetaFormaPagoFactu.setText("Cancelar");
        this.jButtonGuardarCambiosDetaFormaPagoFactu.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.setText("Guardar");
		this.jButtonCerrarDetaFormaPagoFactu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetaFormaPagoFactu,"nuevo_button","Nuevo",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetaFormaPagoFactu,"modificar_button","Editar",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetaFormaPagoFactu,"actualizar_button","Actualizar",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetaFormaPagoFactu,"eliminar_button","Eliminar",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetaFormaPagoFactu,"cancelar_button","Cancelar",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetaFormaPagoFactu,"guardarcambios_button","Guardar",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetaFormaPagoFactu,"guardarcambiostabla_button","Guardar",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetaFormaPagoFactu,"cerrar_button","Salir",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetaFormaPagoFactu.setToolTipText("Nuevo"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetaFormaPagoFactu.setToolTipText("Editar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetaFormaPagoFactu.setToolTipText("Actualizar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetaFormaPagoFactu.setToolTipText("Eliminar)"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetaFormaPagoFactu.setToolTipText("Cancelar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetaFormaPagoFactu.setToolTipText("Guardar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.setToolTipText("Guardar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetaFormaPagoFactu.setToolTipText("Salir"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetaFormaPagoFactu";
		inputMap = this.jButtonNuevoDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetaFormaPagoFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetaFormaPagoFactu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetaFormaPagoFactu";
		inputMap = this.jButtonActualizarDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetaFormaPagoFactu"));
		
		//ELIMINAR
		sMapKey = "EliminarDetaFormaPagoFactu";
		inputMap = this.jButtonEliminarDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetaFormaPagoFactu"));
		
		//CANCELAR	
		sMapKey = "CancelarDetaFormaPagoFactu";
		inputMap = this.jButtonCancelarDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetaFormaPagoFactu"));
		
		//CERRAR		
		sMapKey = "CerrarDetaFormaPagoFactu";
		inputMap = this.jButtonCerrarDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetaFormaPagoFactu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetaFormaPagoFactu";
		inputMap = this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetaFormaPagoFactu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetaFormaPagoFactu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetaFormaPagoFactu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetaFormaPagoFactu.setToolTipText("Nuevo DetaFormaPagoFactu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetaFormaPagoFactu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetaFormaPagoFactu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetaFormaPagoFactu.setToolTipText("Sin Cerrar Ventana DetaFormaPagoFactu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetaFormaPagoFactu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetaFormaPagoFactu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetaFormaPagoFactu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetaFormaPagoFactu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetaFormaPagoFactu.setText("Accion");
		this.jComboBoxTiposAccionesDetaFormaPagoFactu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetaFormaPagoFactu = new JLabelMe();
		
		this.jLabelAccionesDetaFormaPagoFactu.setText("Acciones");		
		this.jLabelAccionesDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetaFormaPagoFactu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetaFormaPagoFactu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetaFormaPagoFactu=new JTabbedPane();
		this.jTabbedPaneRelacionesDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetaFormaPagoFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaFormaPagoFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaFormaPagoFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetaFormaPagoFactu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetaFormaPagoFactu = new GridBagLayout();
		
		this.jPanelCamposDetaFormaPagoFactu.setLayout(gridaBagLayoutCamposDetaFormaPagoFactu);
		this.jPanelCamposOcultosDetaFormaPagoFactu.setLayout(gridaBagLayoutCamposOcultosDetaFormaPagoFactu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetaFormaPagoFactu.add(jLabelIdDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);



	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = 1;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetaFormaPagoFactu.add(jLabelidDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);


	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetaFormaPagoFactu.add(jLabelid_empresaDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 2;
		this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetaFormaPagoFactu.add(jButtonid_empresaDetaFormaPagoFactuBusqueda, this.gridBagConstraintsDetaFormaPagoFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 3;
		this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetaFormaPagoFactu.add(jButtonid_empresaDetaFormaPagoFactuUpdate, this.gridBagConstraintsDetaFormaPagoFactu);
	}

	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = 1;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetaFormaPagoFactu.add(jComboBoxid_empresaDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);


	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoDetaFormaPagoFactu.add(jLabelid_tipo_forma_pagoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 2;
		this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoDetaFormaPagoFactu.add(jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda, this.gridBagConstraintsDetaFormaPagoFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 3;
		this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoDetaFormaPagoFactu.add(jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate, this.gridBagConstraintsDetaFormaPagoFactu);
	}

	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = 1;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoDetaFormaPagoFactu.add(jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);


	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDetaFormaPagoFactu.add(jLabelnombreDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 2;
		this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDetaFormaPagoFactu.add(jButtonnombreDetaFormaPagoFactuBusqueda, this.gridBagConstraintsDetaFormaPagoFactu);
	}

	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = 1;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDetaFormaPagoFactu.add(jscrollPanenombreDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);


	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetaFormaPagoFactu.add(jLabeldescripcionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 2;
		this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetaFormaPagoFactu.add(jButtondescripcionDetaFormaPagoFactuBusqueda, this.gridBagConstraintsDetaFormaPagoFactu);
	}

	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = 1;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetaFormaPagoFactu.add(jscrollPanedescripcionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = iYPanelCamposDetaFormaPagoFactu;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = iXPanelCamposDetaFormaPagoFactu++;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPagoFactu.add(this.jPanelidDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);



	if(iXPanelCamposDetaFormaPagoFactu % 1==0) {
		iXPanelCamposDetaFormaPagoFactu=0;
		iYPanelCamposDetaFormaPagoFactu++;
	}
	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = iYPanelCamposDetaFormaPagoFactu;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = iXPanelCamposDetaFormaPagoFactu++;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPagoFactu.add(this.jPanelid_tipo_forma_pagoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);



	if(iXPanelCamposDetaFormaPagoFactu % 1==0) {
		iXPanelCamposDetaFormaPagoFactu=0;
		iYPanelCamposDetaFormaPagoFactu++;
	}
	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = iYPanelCamposDetaFormaPagoFactu;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = iXPanelCamposDetaFormaPagoFactu++;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPagoFactu.add(this.jPanelnombreDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);



	if(iXPanelCamposDetaFormaPagoFactu % 1==0) {
		iXPanelCamposDetaFormaPagoFactu=0;
		iYPanelCamposDetaFormaPagoFactu++;
	}
	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = iYPanelCamposDetaFormaPagoFactu;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = iXPanelCamposDetaFormaPagoFactu++;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPagoFactu.add(this.jPaneldescripcionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);



	if(iXPanelCamposDetaFormaPagoFactu % 1==0) {
		iXPanelCamposDetaFormaPagoFactu=0;
		iYPanelCamposDetaFormaPagoFactu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPagoFactu.gridy = iYPanelCamposOcultosDetaFormaPagoFactu;
	this.gridBagConstraintsDetaFormaPagoFactu.gridx = iXPanelCamposOcultosDetaFormaPagoFactu++;
	this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPagoFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaFormaPagoFactu.add(this.jPanelid_empresaDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);



	if(iXPanelCamposOcultosDetaFormaPagoFactu % 1==0) {
		iXPanelCamposOcultosDetaFormaPagoFactu=0;
		iYPanelCamposOcultosDetaFormaPagoFactu++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetaFormaPagoFactu= new GridBagLayout();
		this.jPanelAccionesDetaFormaPagoFactu.setLayout(gridaBagLayoutAccionesDetaFormaPagoFactu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetaFormaPagoFactu= new GridBagLayout();
		this.jPanelAccionesFormularioDetaFormaPagoFactu.setLayout(gridaBagLayoutAccionesFormularioDetaFormaPagoFactu);
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetaFormaPagoFactu.add(this.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);

		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetaFormaPagoFactu.add(this.jCheckBoxPostAccionNuevoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetaFormaPagoFactu.add(this.jCheckBoxPostAccionSinCerrarDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetaFormaPagoFactu.add(this.jCheckBoxPostAccionSinMensajeDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetaFormaPagoFactu.add(this.jButtonModificarDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);							

		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetaFormaPagoFactu.add(this.jButtonEliminarDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
			
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetaFormaPagoFactu.add(this.jButtonActualizarDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);


		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetaFormaPagoFactu.add(this.jButtonGuardarCambiosDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);	
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetaFormaPagoFactu.add(this.jButtonCancelarDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetaFormaPagoFactu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetaFormaPagoFactu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();						
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;		
			//this.gridBagConstraintsDetaFormaPagoFactu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx =0;
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetaFormaPagoFactu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetaFormaPagoFactuJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetaFormaPagoFactu = new DetaFormaPagoFactuBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Deta Forma Pago Factu DATOS");
			
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
			
	        //this.setTitle("[FOR] - Deta Forma Pago Factu DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Deta Forma Pago Factu Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetaFormaPagoFactuModel detaformapagofactuModel=new DetaFormaPagoFactuModel(this);
			
			//SI USARA CLASE INTERNA
			//DetaFormaPagoFactuModel.DetaFormaPagoFactuFocusTraversalPolicy detaformapagofactuFocusTraversalPolicy = detaformapagofactuModel.new DetaFormaPagoFactuFocusTraversalPolicy(this);
			
			//detaformapagofactuFocusTraversalPolicy.setdetaformapagofactuJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detaformapagofactuModel);
			
			
			this.jContentPaneDetalleDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetaFormaPagoFactu = new GridBagLayout();	
			this.jContentPaneDetalleDetaFormaPagoFactu.setLayout(gridaBagLayoutDetalleDetaFormaPagoFactu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetaFormaPagoFactu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
				this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
					
				
				this.jContentPaneDetalleDetaFormaPagoFactu.add(jTtoolBarDetalleDetaFormaPagoFactu, gridBagConstraintsDetaFormaPagoFactu);								
				
}
			
			this.jScrollPanelDatosEdicionDetaFormaPagoFactu=   new JScrollPane(jContentPaneDetalleDetaFormaPagoFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetaFormaPagoFactu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
	        
			this.jContentPaneDetalleDetaFormaPagoFactu.add(jPanelCamposDetaFormaPagoFactu, gridBagConstraintsDetaFormaPagoFactu);
			
			
			
			
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
						&& detaformapagofactuSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetaFormaPago(this.puedeCargarPorParteDetaFormaPago,false,-1);
					
					if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetaFormaPagoFactu= new GridBagConstraints();
						this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
						this.jContentPaneDetalleDetaFormaPagoFactu.add(this.jTabbedPaneRelacionesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetaFormaPagoFactu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetaFormaPago(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetaFormaPagoFactu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
					this.gridBagConstraintsDetaFormaPagoFactu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
					
				
					this.jContentPaneDetalleDetaFormaPagoFactu.add(jPanelCamposOcultosDetaFormaPagoFactu, gridBagConstraintsDetaFormaPagoFactu);
				
					this.jPanelCamposOcultosDetaFormaPagoFactu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
	        this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetaFormaPagoFactu.add(this.jPanelAccionesFormularioDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);							
			
			
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
	        this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
	        
			
			this.jContentPaneDetalleDetaFormaPagoFactu.add(this.jPanelAccionesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetaFormaPagoFactu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetaFormaPagoFactu=   new JScrollPane(this.jPanelCamposDetaFormaPagoFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetaFormaPagoFactu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);			
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			
			
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
			
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetaFormaPagoFactu;//jContentPane;
		
		return jScrollPanelDatosEdicionDetaFormaPagoFactu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetaFormaPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detaformapagoSessionBean=new DetaFormaPagoSessionBean();
		this.detaformapagoSessionBean.setConGuardarRelaciones(false);
		this.detaformapagoSessionBean.setEsGuardarRelacionado(true);

		this.detaformapagoBeanSwingJInternalFrame=null;//new DetaFormaPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detaformapagoBeanSwingJInternalFramePopup=new DetaFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detaformapagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detaformapagoSessionBean.getEsGuardarRelacionado()) {

				DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=DetaFormaPagoFactuJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetaFormaPagoFactuJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detaformapagoSessionBean.setEsGuardarRelacionado(true);

				this.detaformapagoBeanSwingJInternalFrame=new DetaFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detaformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detaformapagoBeanSwingJInternalFrame.setdetaformapagoSessionBean(this.detaformapagoSessionBean);

				//this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
				//this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
				//this.jContentPaneDetalleDetaFormaPagoFactu.add(this.detaformapagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetaFormaPagoFactu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetaFormaPagoFactu.add("Deta Forma Pagos",this.detaformapagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetaFormaPagoFactu.setComponentAt(iIndexTab,this.detaformapagoBeanSwingJInternalFrame.getContentPane());
				}

				//DetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detaformapagoSessionBean.setEsGuardarRelacionado(false);
				this.detaformapagoBeanSwingJInternalFrame=null;//new DetaFormaPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detaformapagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetaFormaPago) {
					this.jTabbedPaneRelacionesDetaFormaPagoFactu.add("Deta Forma Pagos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetaFormaPagoBeanSwingJInternalFrame(List<DetaFormaPagoFactu> detaformapagofactus,DetaFormaPagoFactu detaformapagofactu,DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detaformapagoBeanSwingJInternalFrame=new DetaFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detaformapagoBeanSwingJInternalFrame.getDetaFormaPagoLogic().setConnexion(this.detaformapagofactuLogic.getConnexion());

					detaformapagoBeanSwingJInternalFrame.setdetaformapagofactusForeignKey(detaformapagofactus);
					detaformapagoBeanSwingJInternalFrame.setdetaformapagofactuForeignKey(detaformapagofactu);
					detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.setisBusquedaDesdeForeignKeySesionDetaFormaPagoFactu(true);
					detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.setlidDetaFormaPagoFactuActual(detaformapagofactu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detaformapagoBeanSwingJInternalFrame.cargarCombosForeignKeyDetaFormaPago(detaformapagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detaformapagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetaFormaPagoFactu(true);
					detaformapagoBeanSwingJInternalFrame.setid_deta_forma_pago_factuFK_IdDetaFormaPagoFactu(detaformapagofactu.getId());

					if(!this.conCargarFormDetalle) {
						detaformapagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detaformapagoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetaFormaPagoFactuForeignKey(detaformapagofactu,1,false,true,true);
					detaformapagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detaformapagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetaFormaPagoFactu");
					detaformapagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetaFormaPagoFactu");
					detaformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaFormaPago(true);
					detaformapagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetaFormaPago("n",detaformapagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detaformapagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detaformapagoBeanSwingJInternalFrame.setAutoscrolls(true);
					detaformapagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detaformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsDetaFormaPago("relacionado");
					} else {
						detaformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsDetaFormaPago("no_relacionado");
					}

					detaformapagoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetaFormaPago().setVisible(false);

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
