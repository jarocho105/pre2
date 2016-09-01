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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.DetalleFacturasProveedoresConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class DetalleFacturasProveedoresDetalleFormJInternalFrame extends DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleFacturasProveedores;
	
	protected JMenuBar jmenuBarDetalleDetalleFacturasProveedores;
	
	protected JMenu jmenuDetalleDetalleFacturasProveedores;
	protected JMenu jmenuDetalleArchivoDetalleFacturasProveedores;
	protected JMenu jmenuDetalleAccionesDetalleFacturasProveedores;
	protected JMenu jmenuDetalleDatosDetalleFacturasProveedores;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleFacturasProveedores;	
	protected GridBagConstraints gridBagConstraintsDetalleFacturasProveedores;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleFacturasProveedores;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public DetalleFacturasProveedoresSessionBean detallefacturasproveedoresSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public DetalleFacturasProveedoresLogic detallefacturasproveedoresLogic;
	
	public JScrollPane jScrollPanelDatosDetalleFacturasProveedores;
	public JScrollPane jScrollPanelDatosEdicionDetalleFacturasProveedores;
	public JScrollPane jScrollPanelDatosGeneralDetalleFacturasProveedores;
	
	protected JPanel jPanelCamposDetalleFacturasProveedores;    
	protected JPanel jPanelCamposOcultosDetalleFacturasProveedores;    	
	protected JPanel jPanelAccionesDetalleFacturasProveedores;
	protected JPanel jPanelAccionesFormularioDetalleFacturasProveedores;
    
	
	
	protected Integer iXPanelCamposDetalleFacturasProveedores=0;
	protected Integer iYPanelCamposDetalleFacturasProveedores=0;
	
	protected Integer iXPanelCamposOcultosDetalleFacturasProveedores=0;
	protected Integer iYPanelCamposOcultosDetalleFacturasProveedores=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleFacturasProveedores;
	public JButton jButtonModificarDetalleFacturasProveedores;
	public JButton jButtonActualizarDetalleFacturasProveedores;
    public JButton jButtonEliminarDetalleFacturasProveedores;
	public JButton jButtonCancelarDetalleFacturasProveedores;
    public JButton jButtonGuardarCambiosDetalleFacturasProveedores;
	public JButton jButtonGuardarCambiosTablaDetalleFacturasProveedores;
	protected JButton jButtonCerrarDetalleFacturasProveedores;
	
	
	protected JButton jButtonProcesarInformacionDetalleFacturasProveedores;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleFacturasProveedores;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleFacturasProveedores;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleFacturasProveedores;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleFacturasProveedores;
	protected JButton jButtonModificarToolBarDetalleFacturasProveedores;
	protected JButton jButtonActualizarToolBarDetalleFacturasProveedores;
    protected JButton jButtonEliminarToolBarDetalleFacturasProveedores;
	protected JButton jButtonCancelarToolBarDetalleFacturasProveedores;
    protected JButton jButtonGuardarCambiosToolBarDetalleFacturasProveedores;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleFacturasProveedores;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleFacturasProveedores;
	protected JButton jButtonCerrarToolBarDetalleFacturasProveedores;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleFacturasProveedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleFacturasProveedores;
	protected JMenuItem jMenuItemModificarDetalleFacturasProveedores;
	protected JMenuItem jMenuItemActualizarDetalleFacturasProveedores;
    protected JMenuItem jMenuItemEliminarDetalleFacturasProveedores;
	protected JMenuItem jMenuItemCancelarDetalleFacturasProveedores;
    protected JMenuItem jMenuItemGuardarCambiosDetalleFacturasProveedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleFacturasProveedores;
	protected JMenuItem jMenuItemCerrarDetalleFacturasProveedores;
	protected JMenuItem jMenuItemDetalleCerrarDetalleFacturasProveedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleFacturasProveedores;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleFacturasProveedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleFacturasProveedores;
	protected JMenuItem jMenuItemMostrarOcultarDetalleFacturasProveedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleFacturasProveedores;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleFacturasProveedores;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleFacturasProveedores;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleFacturasProveedores;
	public JLabel jLabelIdDetalleFacturasProveedores;
	public JLabel jLabelidDetalleFacturasProveedores;
	public JButton jButtonidDetalleFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteDetalleFacturasProveedores;
	public JLabel jLabelnombre_clienteDetalleFacturasProveedores;
	public JTextArea jTextAreanombre_clienteDetalleFacturasProveedores;
	public JScrollPane jscrollPanenombre_clienteDetalleFacturasProveedores;
	public JButton jButtonnombre_clienteDetalleFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_facturasDetalleFacturasProveedores;
	public JLabel jLabelcantidad_facturasDetalleFacturasProveedores;
	public JTextField jTextFieldcantidad_facturasDetalleFacturasProveedores;
	public JButton jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPaneltotal_valorDetalleFacturasProveedores;
	public JLabel jLabeltotal_valorDetalleFacturasProveedores;
	public JTextField jTextFieldtotal_valorDetalleFacturasProveedores;
	public JButton jButtontotal_valorDetalleFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelmesDetalleFacturasProveedores;
	public JLabel jLabelmesDetalleFacturasProveedores;
	public JTextField jTextFieldmesDetalleFacturasProveedores;
	public JButton jButtonmesDetalleFacturasProveedoresBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleFacturasProveedores;
	public JLabel jLabelid_empresaDetalleFacturasProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleFacturasProveedores;
	public JButton jButtonid_empresaDetalleFacturasProveedores= new JButtonMe();
	public JButton jButtonid_empresaDetalleFacturasProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleFacturasProveedoresBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleFacturasProveedores;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleFacturasProveedoresDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleFacturasProveedores=new JPanel();
				this.jPanelAccionesFormularioDetalleFacturasProveedores=new JPanel();
				this.jmenuBarDetalleDetalleFacturasProveedores=new JMenuBar();
				this.jTtoolBarDetalleDetalleFacturasProveedores=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturasProveedoresDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleFacturasProveedoresDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturasProveedoresDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturasProveedoresDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturasProveedoresDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleFacturasProveedores() {
		return this.jButtonActualizarToolBarDetalleFacturasProveedores;
	}
	
	public JButton getjButtonEliminarToolBarDetalleFacturasProveedores() {
		return this.jButtonEliminarToolBarDetalleFacturasProveedores;
	}
	
	public JButton getjButtonCancelarToolBarDetalleFacturasProveedores() {
		return this.jButtonCancelarToolBarDetalleFacturasProveedores;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleFacturasProveedores() {
		return this.jButtonProcesarInformacionDetalleFacturasProveedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleFacturasProveedores)	{
		this.jButtonProcesarInformacionDetalleFacturasProveedores = jButtonProcesarInformacionDetalleFacturasProveedores;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleFacturasProveedores() {
		return this.jComboBoxTiposAccionesDetalleFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleFacturasProveedores(
			JComboBox jComboBoxTiposRelacionesDetalleFacturasProveedores) {
		this.jComboBoxTiposRelacionesDetalleFacturasProveedores = jComboBoxTiposRelacionesDetalleFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleFacturasProveedores(
			JComboBox jComboBoxTiposAccionesDetalleFacturasProveedores) {
		this.jComboBoxTiposAccionesDetalleFacturasProveedores = jComboBoxTiposAccionesDetalleFacturasProveedores;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleFacturasProveedores() {
		return this.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleFacturasProveedores(
			JComboBox jComboBoxTiposAccionesFormularioDetalleFacturasProveedores) {
		this.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores = jComboBoxTiposAccionesFormularioDetalleFacturasProveedores;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallefacturasproveedoresSessionBean=new DetalleFacturasProveedoresSessionBean();
		
		this.detallefacturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallefacturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleFacturasProveedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Facturas Proveedores MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleFacturasProveedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleFacturasProveedores= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleFacturasProveedores=new JButtonMe();
				this.jButtonModificarToolBarDetalleFacturasProveedores=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleDetalleFacturasProveedores,
							"actualizar","actualizar","Actualizar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleDetalleFacturasProveedores,
							"eliminar","eliminar","Eliminar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleDetalleFacturasProveedores,
							"cancelar","cancelar","Cancelar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleDetalleFacturasProveedores,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleFacturasProveedores=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleFacturasProveedores=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleFacturasProveedores=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleFacturasProveedores=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleFacturasProveedores=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleFacturasProveedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleFacturasProveedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleFacturasProveedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleFacturasProveedores= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleFacturasProveedores.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleFacturasProveedores,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleFacturasProveedores= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleFacturasProveedores.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleFacturasProveedores,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleFacturasProveedores= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleFacturasProveedores.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleFacturasProveedores,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleFacturasProveedores= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleFacturasProveedores.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleFacturasProveedores,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleFacturasProveedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleFacturasProveedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleFacturasProveedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleFacturasProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleFacturasProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleFacturasProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleFacturasProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleFacturasProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleFacturasProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleFacturasProveedores.add(this.jMenuItemDetalleCerrarDetalleFacturasProveedores);
		
		this.jmenuDetalleAccionesDetalleFacturasProveedores.add(this.jMenuItemActualizarDetalleFacturasProveedores);
		this.jmenuDetalleAccionesDetalleFacturasProveedores.add(this.jMenuItemEliminarDetalleFacturasProveedores);
		this.jmenuDetalleAccionesDetalleFacturasProveedores.add(this.jMenuItemCancelarDetalleFacturasProveedores);		
		
		//this.jmenuDetalleDatosDetalleFacturasProveedores.add(this.jMenuItemDetalleAbrirOrderByDetalleFacturasProveedores);				
		this.jmenuDetalleDatosDetalleFacturasProveedores.add(this.jMenuItemDetalleMostarOcultarDetalleFacturasProveedores);				
				
		//this.jmenuDetalleAccionesDetalleFacturasProveedores.add(this.jMenuItemGuardarCambiosDetalleFacturasProveedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleFacturasProveedores.add(this.jmenuDetalleArchivoDetalleFacturasProveedores);		
		this.jmenuBarDetalleDetalleFacturasProveedores.add(this.jmenuDetalleAccionesDetalleFacturasProveedores);		
		this.jmenuBarDetalleDetalleFacturasProveedores.add(this.jmenuDetalleDatosDetalleFacturasProveedores);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleFacturasProveedores);				
	}
	
	
	public void inicializarElementosCamposDetalleFacturasProveedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleFacturasProveedores = new JLabelMe();
		jLabelIdDetalleFacturasProveedores.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleFacturasProveedores = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleFacturasProveedores.setToolTipText(DetalleFacturasProveedoresConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleFacturasProveedores= new GridBagLayout();

		this.jPanelidDetalleFacturasProveedores.setLayout(this.gridaBagLayoutDetalleFacturasProveedores);

		jLabelidDetalleFacturasProveedores = new JLabel();
		jLabelidDetalleFacturasProveedores.setText("Id");

		jLabelidDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_clienteDetalleFacturasProveedores = new JLabelMe();
		this.jLabelnombre_clienteDetalleFacturasProveedores.setText(""+DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteDetalleFacturasProveedores.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteDetalleFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteDetalleFacturasProveedores.setToolTipText(DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutDetalleFacturasProveedores = new GridBagLayout();
		this.jPanelnombre_clienteDetalleFacturasProveedores.setLayout(this.gridaBagLayoutDetalleFacturasProveedores);


		jTextAreanombre_clienteDetalleFacturasProveedores= new JTextAreaMe();
		jTextAreanombre_clienteDetalleFacturasProveedores.setEnabled(false);
		jTextAreanombre_clienteDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteDetalleFacturasProveedores.setLineWrap(true);
		jTextAreanombre_clienteDetalleFacturasProveedores.setWrapStyleWord(true);
		jTextAreanombre_clienteDetalleFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteDetalleFacturasProveedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteDetalleFacturasProveedores = new JScrollPane(jTextAreanombre_clienteDetalleFacturasProveedores);
		jscrollPanenombre_clienteDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda.setText("U");
		this.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteDetalleFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteDetalleFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteDetalleFacturasProveedoresBusqueda"));

		if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_facturasDetalleFacturasProveedores = new JLabelMe();
		this.jLabelcantidad_facturasDetalleFacturasProveedores.setText(""+DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS+" : *");
		this.jLabelcantidad_facturasDetalleFacturasProveedores.setToolTipText("Cantad Facturas");
		this.jLabelcantidad_facturasDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_facturasDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_facturasDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_facturasDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_facturasDetalleFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_facturasDetalleFacturasProveedores.setToolTipText(DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS);
		this.gridaBagLayoutDetalleFacturasProveedores = new GridBagLayout();
		this.jPanelcantidad_facturasDetalleFacturasProveedores.setLayout(this.gridaBagLayoutDetalleFacturasProveedores);


		jTextFieldcantidad_facturasDetalleFacturasProveedores= new JTextFieldMe();
		jTextFieldcantidad_facturasDetalleFacturasProveedores.setEnabled(false);
		jTextFieldcantidad_facturasDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_facturasDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_facturasDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_facturasDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_facturasDetalleFacturasProveedores.setText("0");

		this.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda.setText("U");
		this.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_facturasDetalleFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_facturasDetalleFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_facturasDetalleFacturasProveedoresBusqueda"));

		if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabeltotal_valorDetalleFacturasProveedores = new JLabelMe();
		this.jLabeltotal_valorDetalleFacturasProveedores.setText(""+DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR+" : *");
		this.jLabeltotal_valorDetalleFacturasProveedores.setToolTipText("Total Valor");
		this.jLabeltotal_valorDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_valorDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_valorDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_valorDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_valorDetalleFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_valorDetalleFacturasProveedores.setToolTipText(DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR);
		this.gridaBagLayoutDetalleFacturasProveedores = new GridBagLayout();
		this.jPaneltotal_valorDetalleFacturasProveedores.setLayout(this.gridaBagLayoutDetalleFacturasProveedores);


		jTextFieldtotal_valorDetalleFacturasProveedores= new JTextFieldMe();
		jTextFieldtotal_valorDetalleFacturasProveedores.setEnabled(false);
		jTextFieldtotal_valorDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_valorDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_valorDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_valorDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_valorDetalleFacturasProveedores.setText("0.0");

		this.jButtontotal_valorDetalleFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtontotal_valorDetalleFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_valorDetalleFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_valorDetalleFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_valorDetalleFacturasProveedoresBusqueda.setText("U");
		this.jButtontotal_valorDetalleFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_valorDetalleFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_valorDetalleFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_valorDetalleFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_valorDetalleFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_valorDetalleFacturasProveedoresBusqueda"));

		if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_valorDetalleFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelmesDetalleFacturasProveedores = new JLabelMe();
		this.jLabelmesDetalleFacturasProveedores.setText(""+DetalleFacturasProveedoresConstantesFunciones.LABEL_MES+" : *");
		this.jLabelmesDetalleFacturasProveedores.setToolTipText("Mes");
		this.jLabelmesDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmesDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmesDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmesDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmesDetalleFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmesDetalleFacturasProveedores.setToolTipText(DetalleFacturasProveedoresConstantesFunciones.LABEL_MES);
		this.gridaBagLayoutDetalleFacturasProveedores = new GridBagLayout();
		this.jPanelmesDetalleFacturasProveedores.setLayout(this.gridaBagLayoutDetalleFacturasProveedores);


		jTextFieldmesDetalleFacturasProveedores= new JTextFieldMe();
		jTextFieldmesDetalleFacturasProveedores.setEnabled(false);
		jTextFieldmesDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmesDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmesDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmesDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmesDetalleFacturasProveedores.setText("0");

		this.jButtonmesDetalleFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonmesDetalleFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmesDetalleFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmesDetalleFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmesDetalleFacturasProveedoresBusqueda.setText("U");
		this.jButtonmesDetalleFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmesDetalleFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmesDetalleFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmesDetalleFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmesDetalleFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"mesDetalleFacturasProveedoresBusqueda"));

		if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmesDetalleFacturasProveedoresBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleFacturasProveedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleFacturasProveedores = new JLabelMe();
		this.jLabelid_empresaDetalleFacturasProveedores.setText(""+DetalleFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleFacturasProveedores.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleFacturasProveedores.setToolTipText(DetalleFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleFacturasProveedores = new GridBagLayout();
		this.jPanelid_empresaDetalleFacturasProveedores.setLayout(this.gridaBagLayoutDetalleFacturasProveedores);


		jComboBoxid_empresaDetalleFacturasProveedores= new JComboBoxMe();
		jComboBoxid_empresaDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleFacturasProveedores.setEnabled(false);

		this.jButtonid_empresaDetalleFacturasProveedores= new JButtonMe();
		this.jButtonid_empresaDetalleFacturasProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFacturasProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFacturasProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFacturasProveedores.setText("Buscar");
		this.jButtonid_empresaDetalleFacturasProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleFacturasProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturasProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturasProveedores"));

		this.jButtonid_empresaDetalleFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleFacturasProveedoresBusqueda.setText("U");
		this.jButtonid_empresaDetalleFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturasProveedoresBusqueda"));

		if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleFacturasProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleFacturasProveedoresUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleFacturasProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturasProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturasProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleFacturasProveedoresUpdate.setText("U");
		this.jButtonid_empresaDetalleFacturasProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleFacturasProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturasProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturasProveedoresUpdate"));



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
		//this.jInternalFrameDetalleDetalleFacturasProveedores = new DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Facturas Proveedores DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleFacturasProveedores= new GridBagLayout();
		

		
		String sToolTipDetalleFacturasProveedores="";
		sToolTipDetalleFacturasProveedores=DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleFacturasProveedores+="(Cartera.DetalleFacturasProveedores)";
		}
		
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleFacturasProveedores+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleFacturasProveedores = new JButtonMe();
		this.jButtonModificarDetalleFacturasProveedores = new JButtonMe();
        this.jButtonActualizarDetalleFacturasProveedores = new JButtonMe();
        this.jButtonEliminarDetalleFacturasProveedores = new JButtonMe();
        this.jButtonCancelarDetalleFacturasProveedores = new JButtonMe();
        this.jButtonGuardarCambiosDetalleFacturasProveedores = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores = new JButtonMe();
		this.jButtonCerrarDetalleFacturasProveedores = new JButtonMe();
		
		this.jScrollPanelDatosDetalleFacturasProveedores = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleFacturasProveedores = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleFacturasProveedores = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Facturas Proveedores";
		
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas Proveedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleFacturasProveedores.setName("jPanelCamposDetalleFacturasProveedores"); 

		this.jPanelCamposOcultosDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleFacturasProveedores.setName("jPanelCamposOcultosDetalleFacturasProveedores"); 

        this.jPanelAccionesDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleFacturasProveedores.setToolTipText("Acciones");
        this.jPanelAccionesDetalleFacturasProveedores.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleFacturasProveedores.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleFacturasProveedores.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleFacturasProveedores.setText("Nuevo");
		this.jButtonModificarDetalleFacturasProveedores.setText("Editar");
        this.jButtonActualizarDetalleFacturasProveedores.setText("Actualizar");
        this.jButtonEliminarDetalleFacturasProveedores.setText("Eliminar");
        this.jButtonCancelarDetalleFacturasProveedores.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleFacturasProveedores.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.setText("Guardar");
		this.jButtonCerrarDetalleFacturasProveedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleFacturasProveedores,"nuevo_button","Nuevo",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleFacturasProveedores,"modificar_button","Editar",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleFacturasProveedores,"actualizar_button","Actualizar",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleFacturasProveedores,"eliminar_button","Eliminar",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleFacturasProveedores,"cancelar_button","Cancelar",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleFacturasProveedores,"guardarcambios_button","Guardar",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleFacturasProveedores,"guardarcambiostabla_button","Guardar",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleFacturasProveedores,"cerrar_button","Salir",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleFacturasProveedores.setToolTipText("Nuevo"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleFacturasProveedores.setToolTipText("Editar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleFacturasProveedores.setToolTipText("Actualizar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleFacturasProveedores.setToolTipText("Eliminar)"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleFacturasProveedores.setToolTipText("Cancelar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleFacturasProveedores.setToolTipText("Guardar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.setToolTipText("Guardar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleFacturasProveedores.setToolTipText("Salir"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleFacturasProveedores";
		inputMap = this.jButtonNuevoDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleFacturasProveedores"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleFacturasProveedores";
		inputMap = this.jButtonActualizarDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleFacturasProveedores"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleFacturasProveedores";
		inputMap = this.jButtonEliminarDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleFacturasProveedores"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleFacturasProveedores";
		inputMap = this.jButtonCancelarDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleFacturasProveedores"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleFacturasProveedores";
		inputMap = this.jButtonCerrarDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleFacturasProveedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleFacturasProveedores";
		inputMap = this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleFacturasProveedores"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleFacturasProveedores.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleFacturasProveedores.setToolTipText("Nuevo DetalleFacturasProveedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleFacturasProveedores.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleFacturasProveedores.setToolTipText("Sin Cerrar Ventana DetalleFacturasProveedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleFacturasProveedores.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleFacturasProveedores.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleFacturasProveedores.setText("Accion");
		this.jComboBoxTiposAccionesDetalleFacturasProveedores.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleFacturasProveedores = new JLabelMe();
		
		this.jLabelAccionesDetalleFacturasProveedores.setText("Acciones");		
		this.jLabelAccionesDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleFacturasProveedores();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleFacturasProveedores();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleFacturasProveedores=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleFacturasProveedores = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleFacturasProveedores = new GridBagLayout();
		
		this.jPanelCamposDetalleFacturasProveedores.setLayout(gridaBagLayoutCamposDetalleFacturasProveedores);
		this.jPanelCamposOcultosDetalleFacturasProveedores.setLayout(gridaBagLayoutCamposOcultosDetalleFacturasProveedores);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleFacturasProveedores.add(jLabelIdDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 1;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleFacturasProveedores.add(jLabelidDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);


	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleFacturasProveedores.add(jLabelid_empresaDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 2;
		this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleFacturasProveedores.add(jButtonid_empresaDetalleFacturasProveedoresBusqueda, this.gridBagConstraintsDetalleFacturasProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 3;
		this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleFacturasProveedores.add(jButtonid_empresaDetalleFacturasProveedoresUpdate, this.gridBagConstraintsDetalleFacturasProveedores);
	}

	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 1;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleFacturasProveedores.add(jComboBoxid_empresaDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);


	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteDetalleFacturasProveedores.add(jLabelnombre_clienteDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 2;
		this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteDetalleFacturasProveedores.add(jButtonnombre_clienteDetalleFacturasProveedoresBusqueda, this.gridBagConstraintsDetalleFacturasProveedores);
	}

	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 1;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteDetalleFacturasProveedores.add(jscrollPanenombre_clienteDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);


	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_facturasDetalleFacturasProveedores.add(jLabelcantidad_facturasDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 2;
		this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_facturasDetalleFacturasProveedores.add(jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda, this.gridBagConstraintsDetalleFacturasProveedores);
	}

	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 1;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_facturasDetalleFacturasProveedores.add(jTextFieldcantidad_facturasDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);


	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_valorDetalleFacturasProveedores.add(jLabeltotal_valorDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 2;
		this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_valorDetalleFacturasProveedores.add(jButtontotal_valorDetalleFacturasProveedoresBusqueda, this.gridBagConstraintsDetalleFacturasProveedores);
	}

	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 1;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_valorDetalleFacturasProveedores.add(jTextFieldtotal_valorDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);


	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmesDetalleFacturasProveedores.add(jLabelmesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 2;
		this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelmesDetalleFacturasProveedores.add(jButtonmesDetalleFacturasProveedoresBusqueda, this.gridBagConstraintsDetalleFacturasProveedores);
	}

	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = 1;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmesDetalleFacturasProveedores.add(jTextFieldmesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = iYPanelCamposDetalleFacturasProveedores;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = iXPanelCamposDetalleFacturasProveedores++;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturasProveedores.add(this.jPanelidDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(iXPanelCamposDetalleFacturasProveedores % 1==0) {
		iXPanelCamposDetalleFacturasProveedores=0;
		iYPanelCamposDetalleFacturasProveedores++;
	}
	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = iYPanelCamposDetalleFacturasProveedores;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = iXPanelCamposDetalleFacturasProveedores++;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturasProveedores.add(this.jPanelnombre_clienteDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(iXPanelCamposDetalleFacturasProveedores % 1==0) {
		iXPanelCamposDetalleFacturasProveedores=0;
		iYPanelCamposDetalleFacturasProveedores++;
	}
	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = iYPanelCamposDetalleFacturasProveedores;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = iXPanelCamposDetalleFacturasProveedores++;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturasProveedores.add(this.jPanelcantidad_facturasDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(iXPanelCamposDetalleFacturasProveedores % 1==0) {
		iXPanelCamposDetalleFacturasProveedores=0;
		iYPanelCamposDetalleFacturasProveedores++;
	}
	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = iYPanelCamposDetalleFacturasProveedores;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = iXPanelCamposDetalleFacturasProveedores++;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturasProveedores.add(this.jPaneltotal_valorDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(iXPanelCamposDetalleFacturasProveedores % 1==0) {
		iXPanelCamposDetalleFacturasProveedores=0;
		iYPanelCamposDetalleFacturasProveedores++;
	}
	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = iYPanelCamposDetalleFacturasProveedores;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = iXPanelCamposDetalleFacturasProveedores++;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturasProveedores.add(this.jPanelmesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(iXPanelCamposDetalleFacturasProveedores % 1==0) {
		iXPanelCamposDetalleFacturasProveedores=0;
		iYPanelCamposDetalleFacturasProveedores++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturasProveedores.gridy = iYPanelCamposOcultosDetalleFacturasProveedores;
	this.gridBagConstraintsDetalleFacturasProveedores.gridx = iXPanelCamposOcultosDetalleFacturasProveedores++;
	this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFacturasProveedores.add(this.jPanelid_empresaDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);



	if(iXPanelCamposOcultosDetalleFacturasProveedores % 1==0) {
		iXPanelCamposOcultosDetalleFacturasProveedores=0;
		iYPanelCamposOcultosDetalleFacturasProveedores++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleFacturasProveedores= new GridBagLayout();
		this.jPanelAccionesDetalleFacturasProveedores.setLayout(gridaBagLayoutAccionesDetalleFacturasProveedores);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleFacturasProveedores= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleFacturasProveedores.setLayout(gridaBagLayoutAccionesFormularioDetalleFacturasProveedores);
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleFacturasProveedores.add(this.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleFacturasProveedores.add(this.jButtonModificarDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);							

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleFacturasProveedores.add(this.jButtonEliminarDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
			
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleFacturasProveedores.add(this.jButtonActualizarDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);


		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleFacturasProveedores.add(this.jButtonGuardarCambiosDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);	
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleFacturasProveedores.add(this.jButtonCancelarDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleFacturasProveedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleFacturasProveedores);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();						
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;		
			//this.gridBagConstraintsDetalleFacturasProveedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx =0;
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleFacturasProveedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleFacturasProveedores = new DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Facturas Proveedores DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Facturas Proveedores DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Facturas Proveedores Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleFacturasProveedoresModel detallefacturasproveedoresModel=new DetalleFacturasProveedoresModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleFacturasProveedoresModel.DetalleFacturasProveedoresFocusTraversalPolicy detallefacturasproveedoresFocusTraversalPolicy = detallefacturasproveedoresModel.new DetalleFacturasProveedoresFocusTraversalPolicy(this);
			
			//detallefacturasproveedoresFocusTraversalPolicy.setdetallefacturasproveedoresJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallefacturasproveedoresModel);
			
			
			this.jContentPaneDetalleDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleFacturasProveedores = new GridBagLayout();	
			this.jContentPaneDetalleDetalleFacturasProveedores.setLayout(gridaBagLayoutDetalleDetalleFacturasProveedores);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleFacturasProveedores = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
				this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleFacturasProveedores.add(jTtoolBarDetalleDetalleFacturasProveedores, gridBagConstraintsDetalleFacturasProveedores);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleFacturasProveedores=   new JScrollPane(jContentPaneDetalleDetalleFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleFacturasProveedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
	        
			this.jContentPaneDetalleDetalleFacturasProveedores.add(jPanelCamposDetalleFacturasProveedores, gridBagConstraintsDetalleFacturasProveedores);
			
			
			
			
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
						//&& detallefacturasproveedoresSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleFacturasProveedores= new GridBagConstraints();
						this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
						this.jContentPaneDetalleDetalleFacturasProveedores.add(this.jTabbedPaneRelacionesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleFacturasProveedores.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleFacturasProveedores.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
					this.gridBagConstraintsDetalleFacturasProveedores.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleFacturasProveedores.add(jPanelCamposOcultosDetalleFacturasProveedores, gridBagConstraintsDetalleFacturasProveedores);
				
					this.jPanelCamposOcultosDetalleFacturasProveedores.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
	        this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleFacturasProveedores.add(this.jPanelAccionesFormularioDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);							
			
			
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
	        this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleFacturasProveedores.add(this.jPanelAccionesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleFacturasProveedores);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleFacturasProveedores=   new JScrollPane(this.jPanelCamposDetalleFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleFacturasProveedores.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);			
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			
			
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
			
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleFacturasProveedores;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleFacturasProveedores;
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
