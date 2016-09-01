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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.DetalleTerminoProformaConstantesFunciones;

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
public class DetalleTerminoProformaDetalleFormJInternalFrame extends DetalleTerminoProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleTerminoProforma;
	
	protected JMenuBar jmenuBarDetalleDetalleTerminoProforma;
	
	protected JMenu jmenuDetalleDetalleTerminoProforma;
	protected JMenu jmenuDetalleArchivoDetalleTerminoProforma;
	protected JMenu jmenuDetalleAccionesDetalleTerminoProforma;
	protected JMenu jmenuDetalleDatosDetalleTerminoProforma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleTerminoProforma;	
	protected GridBagConstraints gridBagConstraintsDetalleTerminoProforma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleTerminoProformaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleTerminoProforma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TerminoProformaBeanSwingJInternalFrame terminoproformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_terminoproforma="";
	
	public DetalleTerminoProformaSessionBean detalleterminoproformaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TerminoProformaSessionBean terminoproformaSessionBean;	
	
	public DetalleTerminoProformaLogic detalleterminoproformaLogic;
	
	public JScrollPane jScrollPanelDatosDetalleTerminoProforma;
	public JScrollPane jScrollPanelDatosEdicionDetalleTerminoProforma;
	public JScrollPane jScrollPanelDatosGeneralDetalleTerminoProforma;
	
	protected JPanel jPanelCamposDetalleTerminoProforma;    
	protected JPanel jPanelCamposOcultosDetalleTerminoProforma;    	
	protected JPanel jPanelAccionesDetalleTerminoProforma;
	protected JPanel jPanelAccionesFormularioDetalleTerminoProforma;
    
	
	
	protected Integer iXPanelCamposDetalleTerminoProforma=0;
	protected Integer iYPanelCamposDetalleTerminoProforma=0;
	
	protected Integer iXPanelCamposOcultosDetalleTerminoProforma=0;
	protected Integer iYPanelCamposOcultosDetalleTerminoProforma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleTerminoProforma;
	public JButton jButtonModificarDetalleTerminoProforma;
	public JButton jButtonActualizarDetalleTerminoProforma;
    public JButton jButtonEliminarDetalleTerminoProforma;
	public JButton jButtonCancelarDetalleTerminoProforma;
    public JButton jButtonGuardarCambiosDetalleTerminoProforma;
	public JButton jButtonGuardarCambiosTablaDetalleTerminoProforma;
	protected JButton jButtonCerrarDetalleTerminoProforma;
	
	
	protected JButton jButtonProcesarInformacionDetalleTerminoProforma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleTerminoProforma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleTerminoProforma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleTerminoProforma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleTerminoProforma;
	protected JButton jButtonModificarToolBarDetalleTerminoProforma;
	protected JButton jButtonActualizarToolBarDetalleTerminoProforma;
    protected JButton jButtonEliminarToolBarDetalleTerminoProforma;
	protected JButton jButtonCancelarToolBarDetalleTerminoProforma;
    protected JButton jButtonGuardarCambiosToolBarDetalleTerminoProforma;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleTerminoProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleTerminoProforma;
	protected JButton jButtonCerrarToolBarDetalleTerminoProforma;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleTerminoProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleTerminoProforma;
	protected JMenuItem jMenuItemModificarDetalleTerminoProforma;
	protected JMenuItem jMenuItemActualizarDetalleTerminoProforma;
    protected JMenuItem jMenuItemEliminarDetalleTerminoProforma;
	protected JMenuItem jMenuItemCancelarDetalleTerminoProforma;
    protected JMenuItem jMenuItemGuardarCambiosDetalleTerminoProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleTerminoProforma;
	protected JMenuItem jMenuItemCerrarDetalleTerminoProforma;
	protected JMenuItem jMenuItemDetalleCerrarDetalleTerminoProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleTerminoProforma;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleTerminoProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleTerminoProforma;
	protected JMenuItem jMenuItemMostrarOcultarDetalleTerminoProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleTerminoProforma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleTerminoProforma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleTerminoProforma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleTerminoProforma;
	public JLabel jLabelIdDetalleTerminoProforma;
	public JLabel jLabelidDetalleTerminoProforma;
	public JButton jButtonidDetalleTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelnumeroDetalleTerminoProforma;
	public JLabel jLabelnumeroDetalleTerminoProforma;
	public JTextField jTextFieldnumeroDetalleTerminoProforma;
	public JButton jButtonnumeroDetalleTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPaneldetalleDetalleTerminoProforma;
	public JLabel jLabeldetalleDetalleTerminoProforma;
	public JTextArea jTextAreadetalleDetalleTerminoProforma;
	public JScrollPane jscrollPanedetalleDetalleTerminoProforma;
	public JButton jButtondetalleDetalleTerminoProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleTerminoProforma;
	public JLabel jLabelid_empresaDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleTerminoProforma;
	public JButton jButtonid_empresaDetalleTerminoProforma= new JButtonMe();
	public JButton jButtonid_empresaDetalleTerminoProformaUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleTerminoProforma;
	public JLabel jLabelid_sucursalDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleTerminoProforma;
	public JButton jButtonid_sucursalDetalleTerminoProforma= new JButtonMe();
	public JButton jButtonid_sucursalDetalleTerminoProformaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_termino_proformaDetalleTerminoProforma;
	public JLabel jLabelid_termino_proformaDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_termino_proformaDetalleTerminoProforma;
	public JButton jButtonid_termino_proformaDetalleTerminoProforma= new JButtonMe();
	public JButton jButtonid_termino_proformaDetalleTerminoProformaUpdate= new JButtonMe();
	public JButton jButtonid_termino_proformaDetalleTerminoProformaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleTerminoProforma;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleTerminoProformaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleTerminoProforma=new JPanel();
				this.jPanelAccionesFormularioDetalleTerminoProforma=new JPanel();
				this.jmenuBarDetalleDetalleTerminoProforma=new JMenuBar();
				this.jTtoolBarDetalleDetalleTerminoProforma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTerminoProformaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleTerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleTerminoProformaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleTerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTerminoProformaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTerminoProformaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTerminoProformaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleTerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleTerminoProforma() {
		return this.jButtonActualizarToolBarDetalleTerminoProforma;
	}
	
	public JButton getjButtonEliminarToolBarDetalleTerminoProforma() {
		return this.jButtonEliminarToolBarDetalleTerminoProforma;
	}
	
	public JButton getjButtonCancelarToolBarDetalleTerminoProforma() {
		return this.jButtonCancelarToolBarDetalleTerminoProforma;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleTerminoProforma() {
		return this.jButtonProcesarInformacionDetalleTerminoProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleTerminoProforma)	{
		this.jButtonProcesarInformacionDetalleTerminoProforma = jButtonProcesarInformacionDetalleTerminoProforma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleTerminoProforma() {
		return this.jComboBoxTiposAccionesDetalleTerminoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleTerminoProforma(
			JComboBox jComboBoxTiposRelacionesDetalleTerminoProforma) {
		this.jComboBoxTiposRelacionesDetalleTerminoProforma = jComboBoxTiposRelacionesDetalleTerminoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleTerminoProforma(
			JComboBox jComboBoxTiposAccionesDetalleTerminoProforma) {
		this.jComboBoxTiposAccionesDetalleTerminoProforma = jComboBoxTiposAccionesDetalleTerminoProforma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleTerminoProforma() {
		return this.jComboBoxTiposAccionesFormularioDetalleTerminoProforma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleTerminoProforma(
			JComboBox jComboBoxTiposAccionesFormularioDetalleTerminoProforma) {
		this.jComboBoxTiposAccionesFormularioDetalleTerminoProforma = jComboBoxTiposAccionesFormularioDetalleTerminoProforma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
		
		this.detalleterminoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleterminoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleterminoproformaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleTerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleTerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleTerminoProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Termino Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleTerminoProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleTerminoProforma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleTerminoProforma=new JButtonMe();
				this.jButtonModificarToolBarDetalleTerminoProforma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleTerminoProforma,this.jTtoolBarDetalleDetalleTerminoProforma,
							"actualizar","actualizar","Actualizar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleTerminoProforma,this.jTtoolBarDetalleDetalleTerminoProforma,
							"eliminar","eliminar","Eliminar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleTerminoProforma,this.jTtoolBarDetalleDetalleTerminoProforma,
							"cancelar","cancelar","Cancelar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleTerminoProforma,this.jTtoolBarDetalleDetalleTerminoProforma,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleTerminoProforma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleTerminoProforma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleTerminoProforma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleTerminoProforma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleTerminoProforma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleTerminoProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleTerminoProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleTerminoProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleTerminoProforma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleTerminoProforma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleTerminoProforma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleTerminoProforma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleTerminoProforma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleTerminoProforma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleTerminoProforma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleTerminoProforma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleTerminoProforma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleTerminoProforma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleTerminoProforma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleTerminoProforma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleTerminoProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleTerminoProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleTerminoProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleTerminoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleTerminoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleTerminoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleTerminoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleTerminoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleTerminoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleTerminoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleTerminoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleTerminoProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleTerminoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleTerminoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleTerminoProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleTerminoProforma.add(this.jMenuItemDetalleCerrarDetalleTerminoProforma);
		
		this.jmenuDetalleAccionesDetalleTerminoProforma.add(this.jMenuItemActualizarDetalleTerminoProforma);
		this.jmenuDetalleAccionesDetalleTerminoProforma.add(this.jMenuItemEliminarDetalleTerminoProforma);
		this.jmenuDetalleAccionesDetalleTerminoProforma.add(this.jMenuItemCancelarDetalleTerminoProforma);		
		
		//this.jmenuDetalleDatosDetalleTerminoProforma.add(this.jMenuItemDetalleAbrirOrderByDetalleTerminoProforma);				
		this.jmenuDetalleDatosDetalleTerminoProforma.add(this.jMenuItemDetalleMostarOcultarDetalleTerminoProforma);				
				
		//this.jmenuDetalleAccionesDetalleTerminoProforma.add(this.jMenuItemGuardarCambiosDetalleTerminoProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleTerminoProforma.add(this.jmenuDetalleArchivoDetalleTerminoProforma);		
		this.jmenuBarDetalleDetalleTerminoProforma.add(this.jmenuDetalleAccionesDetalleTerminoProforma);		
		this.jmenuBarDetalleDetalleTerminoProforma.add(this.jmenuDetalleDatosDetalleTerminoProforma);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleTerminoProforma);				
	}
	
	
	public void inicializarElementosCamposDetalleTerminoProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleTerminoProforma = new JLabelMe();
		jLabelIdDetalleTerminoProforma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleTerminoProforma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleTerminoProforma.setToolTipText(DetalleTerminoProformaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleTerminoProforma= new GridBagLayout();

		this.jPanelidDetalleTerminoProforma.setLayout(this.gridaBagLayoutDetalleTerminoProforma);

		jLabelidDetalleTerminoProforma = new JLabel();
		jLabelidDetalleTerminoProforma.setText("Id");

		jLabelidDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroDetalleTerminoProforma = new JLabelMe();
		this.jLabelnumeroDetalleTerminoProforma.setText(""+DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroDetalleTerminoProforma.setToolTipText("Numero");
		this.jLabelnumeroDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroDetalleTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroDetalleTerminoProforma.setToolTipText(DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutDetalleTerminoProforma = new GridBagLayout();
		this.jPanelnumeroDetalleTerminoProforma.setLayout(this.gridaBagLayoutDetalleTerminoProforma);


		jTextFieldnumeroDetalleTerminoProforma= new JTextFieldMe();
		jTextFieldnumeroDetalleTerminoProforma.setEnabled(false);
		jTextFieldnumeroDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumeroDetalleTerminoProforma.setText("0");

		this.jButtonnumeroDetalleTerminoProformaBusqueda= new JButtonMe();
		this.jButtonnumeroDetalleTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroDetalleTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroDetalleTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroDetalleTerminoProformaBusqueda.setText("U");
		this.jButtonnumeroDetalleTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroDetalleTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroDetalleTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroDetalleTerminoProformaBusqueda"));

		if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroDetalleTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabeldetalleDetalleTerminoProforma = new JLabelMe();
		this.jLabeldetalleDetalleTerminoProforma.setText(""+DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleDetalleTerminoProforma.setToolTipText("Detalle");
		this.jLabeldetalleDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleDetalleTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleDetalleTerminoProforma.setToolTipText(DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutDetalleTerminoProforma = new GridBagLayout();
		this.jPaneldetalleDetalleTerminoProforma.setLayout(this.gridaBagLayoutDetalleTerminoProforma);


		jTextAreadetalleDetalleTerminoProforma= new JTextAreaMe();
		jTextAreadetalleDetalleTerminoProforma.setEnabled(false);
		jTextAreadetalleDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDetalleTerminoProforma.setLineWrap(true);
		jTextAreadetalleDetalleTerminoProforma.setWrapStyleWord(true);
		jTextAreadetalleDetalleTerminoProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleDetalleTerminoProforma.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleDetalleTerminoProforma = new JScrollPane(jTextAreadetalleDetalleTerminoProforma);
		jscrollPanedetalleDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalleDetalleTerminoProformaBusqueda= new JButtonMe();
		this.jButtondetalleDetalleTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleDetalleTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleDetalleTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleDetalleTerminoProformaBusqueda.setText("U");
		this.jButtondetalleDetalleTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleDetalleTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleDetalleTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleDetalleTerminoProformaBusqueda"));

		if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleDetalleTerminoProformaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleTerminoProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleTerminoProforma = new JLabelMe();
		this.jLabelid_empresaDetalleTerminoProforma.setText(""+DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleTerminoProforma.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleTerminoProforma.setToolTipText(DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleTerminoProforma = new GridBagLayout();
		this.jPanelid_empresaDetalleTerminoProforma.setLayout(this.gridaBagLayoutDetalleTerminoProforma);


		jComboBoxid_empresaDetalleTerminoProforma= new JComboBoxMe();
		jComboBoxid_empresaDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleTerminoProforma.setEnabled(false);

		this.jButtonid_empresaDetalleTerminoProforma= new JButtonMe();
		this.jButtonid_empresaDetalleTerminoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleTerminoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleTerminoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleTerminoProforma.setText("Buscar");
		this.jButtonid_empresaDetalleTerminoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleTerminoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleTerminoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleTerminoProforma"));

		this.jButtonid_empresaDetalleTerminoProformaBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleTerminoProformaBusqueda.setText("U");
		this.jButtonid_empresaDetalleTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleTerminoProformaBusqueda"));

		if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleTerminoProformaBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleTerminoProformaUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleTerminoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTerminoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTerminoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleTerminoProformaUpdate.setText("U");
		this.jButtonid_empresaDetalleTerminoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleTerminoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleTerminoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleTerminoProformaUpdate"));



					
		this.jLabelid_sucursalDetalleTerminoProforma = new JLabelMe();
		this.jLabelid_sucursalDetalleTerminoProforma.setText(""+DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleTerminoProforma.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleTerminoProforma.setToolTipText(DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleTerminoProforma = new GridBagLayout();
		this.jPanelid_sucursalDetalleTerminoProforma.setLayout(this.gridaBagLayoutDetalleTerminoProforma);


		jComboBoxid_sucursalDetalleTerminoProforma= new JComboBoxMe();
		jComboBoxid_sucursalDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleTerminoProforma.setEnabled(false);

		this.jButtonid_sucursalDetalleTerminoProforma= new JButtonMe();
		this.jButtonid_sucursalDetalleTerminoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleTerminoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleTerminoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleTerminoProforma.setText("Buscar");
		this.jButtonid_sucursalDetalleTerminoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleTerminoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleTerminoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleTerminoProforma"));

		this.jButtonid_sucursalDetalleTerminoProformaBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleTerminoProformaBusqueda.setText("U");
		this.jButtonid_sucursalDetalleTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleTerminoProformaBusqueda"));

		if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleTerminoProformaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleTerminoProformaUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleTerminoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTerminoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTerminoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleTerminoProformaUpdate.setText("U");
		this.jButtonid_sucursalDetalleTerminoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleTerminoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleTerminoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleTerminoProformaUpdate"));



					
		this.jLabelid_termino_proformaDetalleTerminoProforma = new JLabelMe();
		this.jLabelid_termino_proformaDetalleTerminoProforma.setText(""+DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA+" : *");
		this.jLabelid_termino_proformaDetalleTerminoProforma.setToolTipText("Termino Proforma");
		this.jLabelid_termino_proformaDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_termino_proformaDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_termino_proformaDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_termino_proformaDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_termino_proformaDetalleTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_termino_proformaDetalleTerminoProforma.setToolTipText(DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA);
		this.gridaBagLayoutDetalleTerminoProforma = new GridBagLayout();
		this.jPanelid_termino_proformaDetalleTerminoProforma.setLayout(this.gridaBagLayoutDetalleTerminoProforma);


		jComboBoxid_termino_proformaDetalleTerminoProforma= new JComboBoxMe();
		jComboBoxid_termino_proformaDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_termino_proformaDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_termino_proformaDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_termino_proformaDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_termino_proformaDetalleTerminoProforma= new JButtonMe();
		this.jButtonid_termino_proformaDetalleTerminoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_termino_proformaDetalleTerminoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_termino_proformaDetalleTerminoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_termino_proformaDetalleTerminoProforma.setText("Buscar");
		this.jButtonid_termino_proformaDetalleTerminoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_termino_proformaDetalleTerminoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_termino_proformaDetalleTerminoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_termino_proformaDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_termino_proformaDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_termino_proformaDetalleTerminoProforma"));

		this.jButtonid_termino_proformaDetalleTerminoProformaBusqueda= new JButtonMe();
		this.jButtonid_termino_proformaDetalleTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_termino_proformaDetalleTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_termino_proformaDetalleTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_termino_proformaDetalleTerminoProformaBusqueda.setText("U");
		this.jButtonid_termino_proformaDetalleTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_termino_proformaDetalleTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_termino_proformaDetalleTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_termino_proformaDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_termino_proformaDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_termino_proformaDetalleTerminoProformaBusqueda"));

		if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_termino_proformaDetalleTerminoProformaBusqueda.setVisible(false);		}

		this.jButtonid_termino_proformaDetalleTerminoProformaUpdate= new JButtonMe();
		this.jButtonid_termino_proformaDetalleTerminoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_termino_proformaDetalleTerminoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_termino_proformaDetalleTerminoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_termino_proformaDetalleTerminoProformaUpdate.setText("U");
		this.jButtonid_termino_proformaDetalleTerminoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_termino_proformaDetalleTerminoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_termino_proformaDetalleTerminoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_termino_proformaDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_termino_proformaDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_termino_proformaDetalleTerminoProformaUpdate"));



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
		//this.jInternalFrameDetalleDetalleTerminoProforma = new DetalleTerminoProformaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Termino Proforma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleTerminoProforma= new GridBagLayout();
		

		
		String sToolTipDetalleTerminoProforma="";
		sToolTipDetalleTerminoProforma=DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleTerminoProforma+="(Facturacion.DetalleTerminoProforma)";
		}
		
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleTerminoProforma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleTerminoProforma = new JButtonMe();
		this.jButtonModificarDetalleTerminoProforma = new JButtonMe();
        this.jButtonActualizarDetalleTerminoProforma = new JButtonMe();
        this.jButtonEliminarDetalleTerminoProforma = new JButtonMe();
        this.jButtonCancelarDetalleTerminoProforma = new JButtonMe();
        this.jButtonGuardarCambiosDetalleTerminoProforma = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma = new JButtonMe();
		this.jButtonCerrarDetalleTerminoProforma = new JButtonMe();
		
		this.jScrollPanelDatosDetalleTerminoProforma = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleTerminoProforma = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleTerminoProforma = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Termino Proforma";
		
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Termino Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleTerminoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleTerminoProforma.setName("jPanelCamposDetalleTerminoProforma"); 

		this.jPanelCamposOcultosDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleTerminoProforma.setName("jPanelCamposOcultosDetalleTerminoProforma"); 

        this.jPanelAccionesDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleTerminoProforma.setToolTipText("Acciones");
        this.jPanelAccionesDetalleTerminoProforma.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleTerminoProforma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleTerminoProforma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleTerminoProforma.setText("Nuevo");
		this.jButtonModificarDetalleTerminoProforma.setText("Editar");
        this.jButtonActualizarDetalleTerminoProforma.setText("Actualizar");
        this.jButtonEliminarDetalleTerminoProforma.setText("Eliminar");
        this.jButtonCancelarDetalleTerminoProforma.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleTerminoProforma.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma.setText("Guardar");
		this.jButtonCerrarDetalleTerminoProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleTerminoProforma,"nuevo_button","Nuevo",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleTerminoProforma,"modificar_button","Editar",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleTerminoProforma,"actualizar_button","Actualizar",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleTerminoProforma,"eliminar_button","Eliminar",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleTerminoProforma,"cancelar_button","Cancelar",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleTerminoProforma,"guardarcambios_button","Guardar",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleTerminoProforma,"guardarcambiostabla_button","Guardar",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleTerminoProforma,"cerrar_button","Salir",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleTerminoProforma.setToolTipText("Nuevo"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleTerminoProforma.setToolTipText("Editar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleTerminoProforma.setToolTipText("Actualizar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleTerminoProforma.setToolTipText("Eliminar)"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleTerminoProforma.setToolTipText("Cancelar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleTerminoProforma.setToolTipText("Guardar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma.setToolTipText("Guardar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleTerminoProforma.setToolTipText("Salir"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleTerminoProforma";
		inputMap = this.jButtonNuevoDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleTerminoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleTerminoProforma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleTerminoProforma";
		inputMap = this.jButtonActualizarDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleTerminoProforma"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleTerminoProforma";
		inputMap = this.jButtonEliminarDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleTerminoProforma"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleTerminoProforma";
		inputMap = this.jButtonCancelarDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleTerminoProforma"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleTerminoProforma";
		inputMap = this.jButtonCerrarDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleTerminoProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleTerminoProforma";
		inputMap = this.jButtonGuardarCambiosTablaDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleTerminoProforma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleTerminoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleTerminoProforma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleTerminoProforma.setToolTipText("Nuevo DetalleTerminoProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleTerminoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleTerminoProforma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleTerminoProforma.setToolTipText("Sin Cerrar Ventana DetalleTerminoProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleTerminoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleTerminoProforma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleTerminoProforma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleTerminoProforma.setText("Accion");
		this.jComboBoxTiposAccionesDetalleTerminoProforma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleTerminoProforma = new JLabelMe();
		
		this.jLabelAccionesDetalleTerminoProforma.setText("Acciones");		
		this.jLabelAccionesDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleTerminoProforma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleTerminoProforma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleTerminoProforma=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleTerminoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTerminoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTerminoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleTerminoProforma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleTerminoProforma = new GridBagLayout();
		
		this.jPanelCamposDetalleTerminoProforma.setLayout(gridaBagLayoutCamposDetalleTerminoProforma);
		this.jPanelCamposOcultosDetalleTerminoProforma.setLayout(gridaBagLayoutCamposOcultosDetalleTerminoProforma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleTerminoProforma.add(jLabelIdDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 1;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleTerminoProforma.add(jLabelidDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);


	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleTerminoProforma.add(jLabelid_empresaDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 2;
		this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
		this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleTerminoProforma.add(jButtonid_empresaDetalleTerminoProformaBusqueda, this.gridBagConstraintsDetalleTerminoProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 3;
		this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
		this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleTerminoProforma.add(jButtonid_empresaDetalleTerminoProformaUpdate, this.gridBagConstraintsDetalleTerminoProforma);
	}

	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 1;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleTerminoProforma.add(jComboBoxid_empresaDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);


	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleTerminoProforma.add(jLabelid_sucursalDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 2;
		this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
		this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleTerminoProforma.add(jButtonid_sucursalDetalleTerminoProformaBusqueda, this.gridBagConstraintsDetalleTerminoProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 3;
		this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
		this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleTerminoProforma.add(jButtonid_sucursalDetalleTerminoProformaUpdate, this.gridBagConstraintsDetalleTerminoProforma);
	}

	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 1;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleTerminoProforma.add(jComboBoxid_sucursalDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);


	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_termino_proformaDetalleTerminoProforma.add(jLabelid_termino_proformaDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 2;
		this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
		this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_termino_proformaDetalleTerminoProforma.add(jButtonid_termino_proformaDetalleTerminoProformaBusqueda, this.gridBagConstraintsDetalleTerminoProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 3;
		this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
		this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_termino_proformaDetalleTerminoProforma.add(jButtonid_termino_proformaDetalleTerminoProformaUpdate, this.gridBagConstraintsDetalleTerminoProforma);
	}

	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 1;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_termino_proformaDetalleTerminoProforma.add(jComboBoxid_termino_proformaDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);


	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroDetalleTerminoProforma.add(jLabelnumeroDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 2;
		this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
		this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroDetalleTerminoProforma.add(jButtonnumeroDetalleTerminoProformaBusqueda, this.gridBagConstraintsDetalleTerminoProforma);
	}

	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 1;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroDetalleTerminoProforma.add(jTextFieldnumeroDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);


	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleDetalleTerminoProforma.add(jLabeldetalleDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 2;
		this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
		this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleDetalleTerminoProforma.add(jButtondetalleDetalleTerminoProformaBusqueda, this.gridBagConstraintsDetalleTerminoProforma);
	}

	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = 1;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleDetalleTerminoProforma.add(jscrollPanedetalleDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = iYPanelCamposDetalleTerminoProforma;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = iXPanelCamposDetalleTerminoProforma++;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTerminoProforma.add(this.jPanelidDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(iXPanelCamposDetalleTerminoProforma % 1==0) {
		iXPanelCamposDetalleTerminoProforma=0;
		iYPanelCamposDetalleTerminoProforma++;
	}
	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = iYPanelCamposDetalleTerminoProforma;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = iXPanelCamposDetalleTerminoProforma++;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTerminoProforma.add(this.jPanelid_termino_proformaDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(iXPanelCamposDetalleTerminoProforma % 1==0) {
		iXPanelCamposDetalleTerminoProforma=0;
		iYPanelCamposDetalleTerminoProforma++;
	}
	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = iYPanelCamposDetalleTerminoProforma;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = iXPanelCamposDetalleTerminoProforma++;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTerminoProforma.add(this.jPanelnumeroDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(iXPanelCamposDetalleTerminoProforma % 1==0) {
		iXPanelCamposDetalleTerminoProforma=0;
		iYPanelCamposDetalleTerminoProforma++;
	}
	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = iYPanelCamposDetalleTerminoProforma;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = iXPanelCamposDetalleTerminoProforma++;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTerminoProforma.add(this.jPaneldetalleDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(iXPanelCamposDetalleTerminoProforma % 1==0) {
		iXPanelCamposDetalleTerminoProforma=0;
		iYPanelCamposDetalleTerminoProforma++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = iYPanelCamposOcultosDetalleTerminoProforma;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = iXPanelCamposOcultosDetalleTerminoProforma++;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTerminoProforma.add(this.jPanelid_empresaDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(iXPanelCamposOcultosDetalleTerminoProforma % 1==0) {
		iXPanelCamposOcultosDetalleTerminoProforma=0;
		iYPanelCamposOcultosDetalleTerminoProforma++;
	}
	this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTerminoProforma.gridy = iYPanelCamposOcultosDetalleTerminoProforma;
	this.gridBagConstraintsDetalleTerminoProforma.gridx = iXPanelCamposOcultosDetalleTerminoProforma++;
	this.gridBagConstraintsDetalleTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTerminoProforma.add(this.jPanelid_sucursalDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);



	if(iXPanelCamposOcultosDetalleTerminoProforma % 1==0) {
		iXPanelCamposOcultosDetalleTerminoProforma=0;
		iYPanelCamposOcultosDetalleTerminoProforma++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleTerminoProforma= new GridBagLayout();
		this.jPanelAccionesDetalleTerminoProforma.setLayout(gridaBagLayoutAccionesDetalleTerminoProforma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleTerminoProforma= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleTerminoProforma.setLayout(gridaBagLayoutAccionesFormularioDetalleTerminoProforma);
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleTerminoProforma.add(this.jComboBoxTiposAccionesFormularioDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleTerminoProforma.add(this.jCheckBoxPostAccionNuevoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleTerminoProforma.add(this.jCheckBoxPostAccionSinCerrarDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleTerminoProforma.add(this.jCheckBoxPostAccionSinMensajeDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleTerminoProforma.add(this.jButtonModificarDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);							

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleTerminoProforma.add(this.jButtonEliminarDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
			
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleTerminoProforma.add(this.jButtonActualizarDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);


		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleTerminoProforma.add(this.jButtonGuardarCambiosDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);	
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleTerminoProforma.add(this.jButtonCancelarDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleTerminoProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleTerminoProforma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();						
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;		
			//this.gridBagConstraintsDetalleTerminoProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleTerminoProforma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleTerminoProforma.gridx =0;
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleTerminoProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleTerminoProformaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleTerminoProforma = new DetalleTerminoProformaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Termino Proforma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Termino Proforma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Termino Proforma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleTerminoProformaModel detalleterminoproformaModel=new DetalleTerminoProformaModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleTerminoProformaModel.DetalleTerminoProformaFocusTraversalPolicy detalleterminoproformaFocusTraversalPolicy = detalleterminoproformaModel.new DetalleTerminoProformaFocusTraversalPolicy(this);
			
			//detalleterminoproformaFocusTraversalPolicy.setdetalleterminoproformaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleterminoproformaModel);
			
			
			this.jContentPaneDetalleDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleTerminoProforma = new GridBagLayout();	
			this.jContentPaneDetalleDetalleTerminoProforma.setLayout(gridaBagLayoutDetalleDetalleTerminoProforma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleTerminoProforma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
				this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleTerminoProforma.add(jTtoolBarDetalleDetalleTerminoProforma, gridBagConstraintsDetalleTerminoProforma);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleTerminoProforma=   new JScrollPane(jContentPaneDetalleDetalleTerminoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleTerminoProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
	        
			this.jContentPaneDetalleDetalleTerminoProforma.add(jPanelCamposDetalleTerminoProforma, gridBagConstraintsDetalleTerminoProforma);
			
			
			
			
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
						&& detalleterminoproformaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleTerminoProforma= new GridBagConstraints();
						this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
						this.jContentPaneDetalleDetalleTerminoProforma.add(this.jTabbedPaneRelacionesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleTerminoProforma.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleTerminoProforma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
					this.gridBagConstraintsDetalleTerminoProforma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleTerminoProforma.add(jPanelCamposOcultosDetalleTerminoProforma, gridBagConstraintsDetalleTerminoProforma);
				
					this.jPanelCamposOcultosDetalleTerminoProforma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
	        this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleTerminoProforma.add(this.jPanelAccionesFormularioDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);							
			
			
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
	        this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleTerminoProforma.add(this.jPanelAccionesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleTerminoProforma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleTerminoProforma=   new JScrollPane(this.jPanelCamposDetalleTerminoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleTerminoProforma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);			
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			
			
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
			
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleTerminoProforma;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleTerminoProforma;
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
