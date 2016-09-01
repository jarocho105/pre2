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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.AdicionalesActivosFijosConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class AdicionalesActivosFijosDetalleFormJInternalFrame extends AdicionalesActivosFijosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAdicionalesActivosFijos;
	
	protected JMenuBar jmenuBarDetalleAdicionalesActivosFijos;
	
	protected JMenu jmenuDetalleAdicionalesActivosFijos;
	protected JMenu jmenuDetalleArchivoAdicionalesActivosFijos;
	protected JMenu jmenuDetalleAccionesAdicionalesActivosFijos;
	protected JMenu jmenuDetalleDatosAdicionalesActivosFijos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAdicionalesActivosFijos;	
	protected GridBagConstraints gridBagConstraintsAdicionalesActivosFijos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AdicionalesActivosFijosBeanSwingJInternalFrameAdditional jInternalFrameDetalleAdicionalesActivosFijos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public AdicionalesActivosFijosSessionBean adicionalesactivosfijosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public AdicionalesActivosFijosLogic adicionalesactivosfijosLogic;
	
	public JScrollPane jScrollPanelDatosAdicionalesActivosFijos;
	public JScrollPane jScrollPanelDatosEdicionAdicionalesActivosFijos;
	public JScrollPane jScrollPanelDatosGeneralAdicionalesActivosFijos;
	
	protected JPanel jPanelCamposAdicionalesActivosFijos;    
	protected JPanel jPanelCamposOcultosAdicionalesActivosFijos;    	
	protected JPanel jPanelAccionesAdicionalesActivosFijos;
	protected JPanel jPanelAccionesFormularioAdicionalesActivosFijos;
    
	
	
	protected Integer iXPanelCamposAdicionalesActivosFijos=0;
	protected Integer iYPanelCamposAdicionalesActivosFijos=0;
	
	protected Integer iXPanelCamposOcultosAdicionalesActivosFijos=0;
	protected Integer iYPanelCamposOcultosAdicionalesActivosFijos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAdicionalesActivosFijos;
	public JButton jButtonModificarAdicionalesActivosFijos;
	public JButton jButtonActualizarAdicionalesActivosFijos;
    public JButton jButtonEliminarAdicionalesActivosFijos;
	public JButton jButtonCancelarAdicionalesActivosFijos;
    public JButton jButtonGuardarCambiosAdicionalesActivosFijos;
	public JButton jButtonGuardarCambiosTablaAdicionalesActivosFijos;
	protected JButton jButtonCerrarAdicionalesActivosFijos;
	
	
	protected JButton jButtonProcesarInformacionAdicionalesActivosFijos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAdicionalesActivosFijos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAdicionalesActivosFijos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAdicionalesActivosFijos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAdicionalesActivosFijos;
	protected JButton jButtonModificarToolBarAdicionalesActivosFijos;
	protected JButton jButtonActualizarToolBarAdicionalesActivosFijos;
    protected JButton jButtonEliminarToolBarAdicionalesActivosFijos;
	protected JButton jButtonCancelarToolBarAdicionalesActivosFijos;
    protected JButton jButtonGuardarCambiosToolBarAdicionalesActivosFijos;
	protected JButton jButtonGuardarCambiosTablaToolBarAdicionalesActivosFijos;
	protected JButton jButtonMostrarOcultarTablaToolBarAdicionalesActivosFijos;
	protected JButton jButtonCerrarToolBarAdicionalesActivosFijos;
	
	protected JButton jButtonProcesarInformacionToolBarAdicionalesActivosFijos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAdicionalesActivosFijos;
	protected JMenuItem jMenuItemModificarAdicionalesActivosFijos;
	protected JMenuItem jMenuItemActualizarAdicionalesActivosFijos;
    protected JMenuItem jMenuItemEliminarAdicionalesActivosFijos;
	protected JMenuItem jMenuItemCancelarAdicionalesActivosFijos;
    protected JMenuItem jMenuItemGuardarCambiosAdicionalesActivosFijos;
	protected JMenuItem jMenuItemGuardarCambiosTablaAdicionalesActivosFijos;
	protected JMenuItem jMenuItemCerrarAdicionalesActivosFijos;
	protected JMenuItem jMenuItemDetalleCerrarAdicionalesActivosFijos;
	protected JMenuItem jMenuItemDetalleMostarOcultarAdicionalesActivosFijos;
	
	protected JMenuItem jMenuItemProcesarInformacionAdicionalesActivosFijos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAdicionalesActivosFijos;
	protected JMenuItem jMenuItemMostrarOcultarAdicionalesActivosFijos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAdicionalesActivosFijos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAdicionalesActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAdicionalesActivosFijos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAdicionalesActivosFijos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAdicionalesActivosFijos;
	public JLabel jLabelIdAdicionalesActivosFijos;
	public JLabel jLabelidAdicionalesActivosFijos;
	public JButton jButtonidAdicionalesActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sub_grupoAdicionalesActivosFijos;
	public JLabel jLabelcodigo_sub_grupoAdicionalesActivosFijos;
	public JTextField jTextFieldcodigo_sub_grupoAdicionalesActivosFijos;
	public JButton jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sub_grupoAdicionalesActivosFijos;
	public JLabel jLabelnombre_sub_grupoAdicionalesActivosFijos;
	public JTextArea jTextAreanombre_sub_grupoAdicionalesActivosFijos;
	public JScrollPane jscrollPanenombre_sub_grupoAdicionalesActivosFijos;
	public JButton jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_detalle_grupoAdicionalesActivosFijos;
	public JLabel jLabelcodigo_detalle_grupoAdicionalesActivosFijos;
	public JTextField jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos;
	public JButton jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_detalle_grupoAdicionalesActivosFijos;
	public JLabel jLabelnombre_detalle_grupoAdicionalesActivosFijos;
	public JTextArea jTextAreanombre_detalle_grupoAdicionalesActivosFijos;
	public JScrollPane jscrollPanenombre_detalle_grupoAdicionalesActivosFijos;
	public JButton jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelclaveAdicionalesActivosFijos;
	public JLabel jLabelclaveAdicionalesActivosFijos;
	public JTextField jTextFieldclaveAdicionalesActivosFijos;
	public JButton jButtonclaveAdicionalesActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombreAdicionalesActivosFijos;
	public JLabel jLabelnombreAdicionalesActivosFijos;
	public JTextArea jTextAreanombreAdicionalesActivosFijos;
	public JScrollPane jscrollPanenombreAdicionalesActivosFijos;
	public JButton jButtonnombreAdicionalesActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraAdicionalesActivosFijos;
	public JLabel jLabelfecha_compraAdicionalesActivosFijos;
	//public JFormattedTextField jDateChooserfecha_compraAdicionalesActivosFijos;

	public JDateChooser jDateChooserfecha_compraAdicionalesActivosFijos;
	public JButton jButtonfecha_compraAdicionalesActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelvida_utilAdicionalesActivosFijos;
	public JLabel jLabelvida_utilAdicionalesActivosFijos;
	public JTextField jTextFieldvida_utilAdicionalesActivosFijos;
	public JButton jButtonvida_utilAdicionalesActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_de_compraAdicionalesActivosFijos;
	public JLabel jLabelcosto_de_compraAdicionalesActivosFijos;
	public JTextField jTextFieldcosto_de_compraAdicionalesActivosFijos;
	public JButton jButtoncosto_de_compraAdicionalesActivosFijosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAdicionalesActivosFijos;
	public JLabel jLabelid_empresaAdicionalesActivosFijos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAdicionalesActivosFijos;
	public JButton jButtonid_empresaAdicionalesActivosFijos= new JButtonMe();
	public JButton jButtonid_empresaAdicionalesActivosFijosUpdate= new JButtonMe();
	public JButton jButtonid_empresaAdicionalesActivosFijosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAdicionalesActivosFijos;
	
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
	public int iHeightFormulario=1078;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AdicionalesActivosFijosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAdicionalesActivosFijos=new JPanel();
				this.jPanelAccionesFormularioAdicionalesActivosFijos=new JPanel();
				this.jmenuBarDetalleAdicionalesActivosFijos=new JMenuBar();
				this.jTtoolBarDetalleAdicionalesActivosFijos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AdicionalesActivosFijosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AdicionalesActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AdicionalesActivosFijosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AdicionalesActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AdicionalesActivosFijosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AdicionalesActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AdicionalesActivosFijosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AdicionalesActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AdicionalesActivosFijosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AdicionalesActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAdicionalesActivosFijos() {
		return this.jButtonActualizarToolBarAdicionalesActivosFijos;
	}
	
	public JButton getjButtonEliminarToolBarAdicionalesActivosFijos() {
		return this.jButtonEliminarToolBarAdicionalesActivosFijos;
	}
	
	public JButton getjButtonCancelarToolBarAdicionalesActivosFijos() {
		return this.jButtonCancelarToolBarAdicionalesActivosFijos;
	}		
	
	public JButton getjButtonProcesarInformacionAdicionalesActivosFijos() {
		return this.jButtonProcesarInformacionAdicionalesActivosFijos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAdicionalesActivosFijos)	{
		this.jButtonProcesarInformacionAdicionalesActivosFijos = jButtonProcesarInformacionAdicionalesActivosFijos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAdicionalesActivosFijos() {
		return this.jComboBoxTiposAccionesAdicionalesActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAdicionalesActivosFijos(
			JComboBox jComboBoxTiposRelacionesAdicionalesActivosFijos) {
		this.jComboBoxTiposRelacionesAdicionalesActivosFijos = jComboBoxTiposRelacionesAdicionalesActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAdicionalesActivosFijos(
			JComboBox jComboBoxTiposAccionesAdicionalesActivosFijos) {
		this.jComboBoxTiposAccionesAdicionalesActivosFijos = jComboBoxTiposAccionesAdicionalesActivosFijos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAdicionalesActivosFijos() {
		return this.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAdicionalesActivosFijos(
			JComboBox jComboBoxTiposAccionesFormularioAdicionalesActivosFijos) {
		this.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos = jComboBoxTiposAccionesFormularioAdicionalesActivosFijos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.adicionalesactivosfijosSessionBean=new AdicionalesActivosFijosSessionBean();
		
		this.adicionalesactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.adicionalesactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AdicionalesActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AdicionalesActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AdicionalesActivosFijosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Adicionales Activos Fijos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
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
	
		AdicionalesActivosFijosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAdicionalesActivosFijos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAdicionalesActivosFijos=new JButtonMe();
				this.jButtonModificarToolBarAdicionalesActivosFijos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAdicionalesActivosFijos,this.jTtoolBarDetalleAdicionalesActivosFijos,
							"actualizar","actualizar","Actualizar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAdicionalesActivosFijos,this.jTtoolBarDetalleAdicionalesActivosFijos,
							"eliminar","eliminar","Eliminar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAdicionalesActivosFijos,this.jTtoolBarDetalleAdicionalesActivosFijos,
							"cancelar","cancelar","Cancelar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAdicionalesActivosFijos,this.jTtoolBarDetalleAdicionalesActivosFijos,
							"guardarcambios","guardarcambios","Guardar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAdicionalesActivosFijos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAdicionalesActivosFijos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAdicionalesActivosFijos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAdicionalesActivosFijos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAdicionalesActivosFijos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAdicionalesActivosFijos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAdicionalesActivosFijos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAdicionalesActivosFijos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAdicionalesActivosFijos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAdicionalesActivosFijos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAdicionalesActivosFijos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAdicionalesActivosFijos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAdicionalesActivosFijos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAdicionalesActivosFijos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAdicionalesActivosFijos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAdicionalesActivosFijos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAdicionalesActivosFijos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAdicionalesActivosFijos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAdicionalesActivosFijos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAdicionalesActivosFijos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAdicionalesActivosFijos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAdicionalesActivosFijos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAdicionalesActivosFijos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAdicionalesActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAdicionalesActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAdicionalesActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAdicionalesActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAdicionalesActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAdicionalesActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAdicionalesActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAdicionalesActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAdicionalesActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAdicionalesActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAdicionalesActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAdicionalesActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAdicionalesActivosFijos.add(this.jMenuItemDetalleCerrarAdicionalesActivosFijos);
		
		this.jmenuDetalleAccionesAdicionalesActivosFijos.add(this.jMenuItemActualizarAdicionalesActivosFijos);
		this.jmenuDetalleAccionesAdicionalesActivosFijos.add(this.jMenuItemEliminarAdicionalesActivosFijos);
		this.jmenuDetalleAccionesAdicionalesActivosFijos.add(this.jMenuItemCancelarAdicionalesActivosFijos);		
		
		//this.jmenuDetalleDatosAdicionalesActivosFijos.add(this.jMenuItemDetalleAbrirOrderByAdicionalesActivosFijos);				
		this.jmenuDetalleDatosAdicionalesActivosFijos.add(this.jMenuItemDetalleMostarOcultarAdicionalesActivosFijos);				
				
		//this.jmenuDetalleAccionesAdicionalesActivosFijos.add(this.jMenuItemGuardarCambiosAdicionalesActivosFijos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAdicionalesActivosFijos.add(this.jmenuDetalleArchivoAdicionalesActivosFijos);		
		this.jmenuBarDetalleAdicionalesActivosFijos.add(this.jmenuDetalleAccionesAdicionalesActivosFijos);		
		this.jmenuBarDetalleAdicionalesActivosFijos.add(this.jmenuDetalleDatosAdicionalesActivosFijos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAdicionalesActivosFijos);				
	}
	
	
	public void inicializarElementosCamposAdicionalesActivosFijos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAdicionalesActivosFijos = new JLabelMe();
		jLabelIdAdicionalesActivosFijos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAdicionalesActivosFijos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAdicionalesActivosFijos= new GridBagLayout();

		this.jPanelidAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);

		jLabelidAdicionalesActivosFijos = new JLabel();
		jLabelidAdicionalesActivosFijos.setText("Id");

		jLabelidAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigo_sub_grupoAdicionalesActivosFijos = new JLabelMe();
		this.jLabelcodigo_sub_grupoAdicionalesActivosFijos.setText(""+AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO+" : *");
		this.jLabelcodigo_sub_grupoAdicionalesActivosFijos.setToolTipText("Codigo Sub Grupo");
		this.jLabelcodigo_sub_grupoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sub_grupoAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sub_grupoAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sub_grupoAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		this.gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		this.jPanelcodigo_sub_grupoAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);


		jTextFieldcodigo_sub_grupoAdicionalesActivosFijos= new JTextFieldMe();

		jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setEnabled(false);
		jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sub_grupoAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda= new JButtonMe();
		this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda.setText("U");
		this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sub_grupoAdicionalesActivosFijosBusqueda"));

		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sub_grupoAdicionalesActivosFijos = new JLabelMe();
		this.jLabelnombre_sub_grupoAdicionalesActivosFijos.setText(""+AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO+" : *");
		this.jLabelnombre_sub_grupoAdicionalesActivosFijos.setToolTipText("Nombre Sub Grupo");
		this.jLabelnombre_sub_grupoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sub_grupoAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sub_grupoAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sub_grupoAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		this.gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		this.jPanelnombre_sub_grupoAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);


		jTextAreanombre_sub_grupoAdicionalesActivosFijos= new JTextAreaMe();
		jTextAreanombre_sub_grupoAdicionalesActivosFijos.setEnabled(false);
		jTextAreanombre_sub_grupoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoAdicionalesActivosFijos.setLineWrap(true);
		jTextAreanombre_sub_grupoAdicionalesActivosFijos.setWrapStyleWord(true);
		jTextAreanombre_sub_grupoAdicionalesActivosFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sub_grupoAdicionalesActivosFijos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sub_grupoAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sub_grupoAdicionalesActivosFijos = new JScrollPane(jTextAreanombre_sub_grupoAdicionalesActivosFijos);
		jscrollPanenombre_sub_grupoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda= new JButtonMe();
		this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda.setText("U");
		this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sub_grupoAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sub_grupoAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sub_grupoAdicionalesActivosFijosBusqueda"));

		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_detalle_grupoAdicionalesActivosFijos = new JLabelMe();
		this.jLabelcodigo_detalle_grupoAdicionalesActivosFijos.setText(""+AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO+" : *");
		this.jLabelcodigo_detalle_grupoAdicionalesActivosFijos.setToolTipText("Codigo Detalle Grupo");
		this.jLabelcodigo_detalle_grupoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_detalle_grupoAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_detalle_grupoAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_detalle_grupoAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		this.gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		this.jPanelcodigo_detalle_grupoAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);


		jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos= new JTextFieldMe();

		jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setEnabled(false);
		jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda= new JButtonMe();
		this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda.setText("U");
		this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_detalle_grupoAdicionalesActivosFijosBusqueda"));

		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_detalle_grupoAdicionalesActivosFijos = new JLabelMe();
		this.jLabelnombre_detalle_grupoAdicionalesActivosFijos.setText(""+AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+" : *");
		this.jLabelnombre_detalle_grupoAdicionalesActivosFijos.setToolTipText("Nombre Detalle Grupo");
		this.jLabelnombre_detalle_grupoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_detalle_grupoAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_detalle_grupoAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_detalle_grupoAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		this.gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		this.jPanelnombre_detalle_grupoAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);


		jTextAreanombre_detalle_grupoAdicionalesActivosFijos= new JTextAreaMe();
		jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setEnabled(false);
		jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setLineWrap(true);
		jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setWrapStyleWord(true);
		jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_detalle_grupoAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_detalle_grupoAdicionalesActivosFijos = new JScrollPane(jTextAreanombre_detalle_grupoAdicionalesActivosFijos);
		jscrollPanenombre_detalle_grupoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda= new JButtonMe();
		this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda.setText("U");
		this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_detalle_grupoAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_detalle_grupoAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_detalle_grupoAdicionalesActivosFijosBusqueda"));

		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelclaveAdicionalesActivosFijos = new JLabelMe();
		this.jLabelclaveAdicionalesActivosFijos.setText(""+AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveAdicionalesActivosFijos.setToolTipText("Clave");
		this.jLabelclaveAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		this.jPanelclaveAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);


		jTextFieldclaveAdicionalesActivosFijos= new JTextFieldMe();

		jTextFieldclaveAdicionalesActivosFijos.setEnabled(false);
		jTextFieldclaveAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveAdicionalesActivosFijosBusqueda= new JButtonMe();
		this.jButtonclaveAdicionalesActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveAdicionalesActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveAdicionalesActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveAdicionalesActivosFijosBusqueda.setText("U");
		this.jButtonclaveAdicionalesActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveAdicionalesActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveAdicionalesActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveAdicionalesActivosFijosBusqueda"));

		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveAdicionalesActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombreAdicionalesActivosFijos = new JLabelMe();
		this.jLabelnombreAdicionalesActivosFijos.setText(""+AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreAdicionalesActivosFijos.setToolTipText("Nombre");
		this.jLabelnombreAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		this.jPanelnombreAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);


		jTextAreanombreAdicionalesActivosFijos= new JTextAreaMe();
		jTextAreanombreAdicionalesActivosFijos.setEnabled(false);
		jTextAreanombreAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAdicionalesActivosFijos.setLineWrap(true);
		jTextAreanombreAdicionalesActivosFijos.setWrapStyleWord(true);
		jTextAreanombreAdicionalesActivosFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreAdicionalesActivosFijos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreAdicionalesActivosFijos = new JScrollPane(jTextAreanombreAdicionalesActivosFijos);
		jscrollPanenombreAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreAdicionalesActivosFijosBusqueda= new JButtonMe();
		this.jButtonnombreAdicionalesActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAdicionalesActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAdicionalesActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreAdicionalesActivosFijosBusqueda.setText("U");
		this.jButtonnombreAdicionalesActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreAdicionalesActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreAdicionalesActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreAdicionalesActivosFijosBusqueda"));

		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreAdicionalesActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_compraAdicionalesActivosFijos = new JLabelMe();
		this.jLabelfecha_compraAdicionalesActivosFijos.setText(""+AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraAdicionalesActivosFijos.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		this.jPanelfecha_compraAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);


		//jFormattedTextFieldfecha_compraAdicionalesActivosFijos= new JFormattedTextFieldMe();

		jDateChooserfecha_compraAdicionalesActivosFijos= new JDateChooser();
		jDateChooserfecha_compraAdicionalesActivosFijos.setEnabled(false);
		jDateChooserfecha_compraAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraAdicionalesActivosFijos.setDate(new Date());
		jDateChooserfecha_compraAdicionalesActivosFijos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraAdicionalesActivosFijos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraAdicionalesActivosFijosBusqueda= new JButtonMe();
		this.jButtonfecha_compraAdicionalesActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraAdicionalesActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraAdicionalesActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraAdicionalesActivosFijosBusqueda.setText("U");
		this.jButtonfecha_compraAdicionalesActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraAdicionalesActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraAdicionalesActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraAdicionalesActivosFijosBusqueda"));

		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraAdicionalesActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelvida_utilAdicionalesActivosFijos = new JLabelMe();
		this.jLabelvida_utilAdicionalesActivosFijos.setText(""+AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL+" : *");
		this.jLabelvida_utilAdicionalesActivosFijos.setToolTipText("Va Util");
		this.jLabelvida_utilAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvida_utilAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvida_utilAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvida_utilAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
		this.gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		this.jPanelvida_utilAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);


		jTextFieldvida_utilAdicionalesActivosFijos= new JTextFieldMe();
		jTextFieldvida_utilAdicionalesActivosFijos.setEnabled(false);
		jTextFieldvida_utilAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvida_utilAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvida_utilAdicionalesActivosFijos.setText("0.0");

		this.jButtonvida_utilAdicionalesActivosFijosBusqueda= new JButtonMe();
		this.jButtonvida_utilAdicionalesActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilAdicionalesActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilAdicionalesActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvida_utilAdicionalesActivosFijosBusqueda.setText("U");
		this.jButtonvida_utilAdicionalesActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvida_utilAdicionalesActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvida_utilAdicionalesActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvida_utilAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvida_utilAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"vida_utilAdicionalesActivosFijosBusqueda"));

		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvida_utilAdicionalesActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_de_compraAdicionalesActivosFijos = new JLabelMe();
		this.jLabelcosto_de_compraAdicionalesActivosFijos.setText(""+AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA+" : *");
		this.jLabelcosto_de_compraAdicionalesActivosFijos.setToolTipText("Costo Compra");
		this.jLabelcosto_de_compraAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_de_compraAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_de_compraAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_de_compraAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
		this.gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		this.jPanelcosto_de_compraAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);


		jTextFieldcosto_de_compraAdicionalesActivosFijos= new JTextFieldMe();
		jTextFieldcosto_de_compraAdicionalesActivosFijos.setEnabled(false);
		jTextFieldcosto_de_compraAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_de_compraAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_de_compraAdicionalesActivosFijos.setText("0.0");

		this.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda= new JButtonMe();
		this.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda.setText("U");
		this.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_de_compraAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_de_compraAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_de_compraAdicionalesActivosFijosBusqueda"));

		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAdicionalesActivosFijos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAdicionalesActivosFijos = new JLabelMe();
		this.jLabelid_empresaAdicionalesActivosFijos.setText(""+AdicionalesActivosFijosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAdicionalesActivosFijos.setToolTipText("Empresa");
		this.jLabelid_empresaAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAdicionalesActivosFijos.setToolTipText(AdicionalesActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		this.jPanelid_empresaAdicionalesActivosFijos.setLayout(this.gridaBagLayoutAdicionalesActivosFijos);


		jComboBoxid_empresaAdicionalesActivosFijos= new JComboBoxMe();
		jComboBoxid_empresaAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAdicionalesActivosFijos.setEnabled(false);

		this.jButtonid_empresaAdicionalesActivosFijos= new JButtonMe();
		this.jButtonid_empresaAdicionalesActivosFijos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAdicionalesActivosFijos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAdicionalesActivosFijos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAdicionalesActivosFijos.setText("Buscar");
		this.jButtonid_empresaAdicionalesActivosFijos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAdicionalesActivosFijos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAdicionalesActivosFijos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAdicionalesActivosFijos"));

		this.jButtonid_empresaAdicionalesActivosFijosBusqueda= new JButtonMe();
		this.jButtonid_empresaAdicionalesActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAdicionalesActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAdicionalesActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAdicionalesActivosFijosBusqueda.setText("U");
		this.jButtonid_empresaAdicionalesActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAdicionalesActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAdicionalesActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAdicionalesActivosFijosBusqueda"));

		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAdicionalesActivosFijosBusqueda.setVisible(false);		}

		this.jButtonid_empresaAdicionalesActivosFijosUpdate= new JButtonMe();
		this.jButtonid_empresaAdicionalesActivosFijosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAdicionalesActivosFijosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAdicionalesActivosFijosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAdicionalesActivosFijosUpdate.setText("U");
		this.jButtonid_empresaAdicionalesActivosFijosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAdicionalesActivosFijosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAdicionalesActivosFijosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAdicionalesActivosFijosUpdate"));



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
		//this.jInternalFrameDetalleAdicionalesActivosFijos = new AdicionalesActivosFijosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Adicionales Activos Fijos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAdicionalesActivosFijos= new GridBagLayout();
		

		
		String sToolTipAdicionalesActivosFijos="";
		sToolTipAdicionalesActivosFijos=AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAdicionalesActivosFijos+="(ActivosFijos.AdicionalesActivosFijos)";
		}
		
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
			sToolTipAdicionalesActivosFijos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAdicionalesActivosFijos = new JButtonMe();
		this.jButtonModificarAdicionalesActivosFijos = new JButtonMe();
        this.jButtonActualizarAdicionalesActivosFijos = new JButtonMe();
        this.jButtonEliminarAdicionalesActivosFijos = new JButtonMe();
        this.jButtonCancelarAdicionalesActivosFijos = new JButtonMe();
        this.jButtonGuardarCambiosAdicionalesActivosFijos = new JButtonMe();
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos = new JButtonMe();
		this.jButtonCerrarAdicionalesActivosFijos = new JButtonMe();
		
		this.jScrollPanelDatosAdicionalesActivosFijos = new JScrollPane();   
        this.jScrollPanelDatosEdicionAdicionalesActivosFijos = new JScrollPane();
		this.jScrollPanelDatosGeneralAdicionalesActivosFijos = new JScrollPane();
				
		
		
		this.jPanelCamposAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Adicionales Activos Fijos";
		
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Adicionales Activos Fijoses" + this.sPath));
		} else {
			this.jScrollPanelDatosAdicionalesActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAdicionalesActivosFijos.setName("jPanelCamposAdicionalesActivosFijos"); 

		this.jPanelCamposOcultosAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAdicionalesActivosFijos.setName("jPanelCamposOcultosAdicionalesActivosFijos"); 

        this.jPanelAccionesAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAdicionalesActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesAdicionalesActivosFijos.setName("Acciones"); 

		this.jPanelAccionesFormularioAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAdicionalesActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAdicionalesActivosFijos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAdicionalesActivosFijos.setText("Nuevo");
		this.jButtonModificarAdicionalesActivosFijos.setText("Editar");
        this.jButtonActualizarAdicionalesActivosFijos.setText("Actualizar");
        this.jButtonEliminarAdicionalesActivosFijos.setText("Eliminar");
        this.jButtonCancelarAdicionalesActivosFijos.setText("Cancelar");
        this.jButtonGuardarCambiosAdicionalesActivosFijos.setText("Guardar");
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.setText("Guardar");
		this.jButtonCerrarAdicionalesActivosFijos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAdicionalesActivosFijos,"nuevo_button","Nuevo",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAdicionalesActivosFijos,"modificar_button","Editar",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAdicionalesActivosFijos,"actualizar_button","Actualizar",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAdicionalesActivosFijos,"eliminar_button","Eliminar",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAdicionalesActivosFijos,"cancelar_button","Cancelar",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAdicionalesActivosFijos,"guardarcambios_button","Guardar",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAdicionalesActivosFijos,"guardarcambiostabla_button","Guardar",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAdicionalesActivosFijos,"cerrar_button","Salir",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAdicionalesActivosFijos.setToolTipText("Nuevo"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAdicionalesActivosFijos.setToolTipText("Editar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAdicionalesActivosFijos.setToolTipText("Actualizar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAdicionalesActivosFijos.setToolTipText("Eliminar)"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAdicionalesActivosFijos.setToolTipText("Cancelar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAdicionalesActivosFijos.setToolTipText("Guardar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.setToolTipText("Guardar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAdicionalesActivosFijos.setToolTipText("Salir"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAdicionalesActivosFijos";
		inputMap = this.jButtonNuevoAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAdicionalesActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAdicionalesActivosFijos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAdicionalesActivosFijos";
		inputMap = this.jButtonActualizarAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAdicionalesActivosFijos"));
		
		//ELIMINAR
		sMapKey = "EliminarAdicionalesActivosFijos";
		inputMap = this.jButtonEliminarAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAdicionalesActivosFijos"));
		
		//CANCELAR	
		sMapKey = "CancelarAdicionalesActivosFijos";
		inputMap = this.jButtonCancelarAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAdicionalesActivosFijos"));
		
		//CERRAR		
		sMapKey = "CerrarAdicionalesActivosFijos";
		inputMap = this.jButtonCerrarAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAdicionalesActivosFijos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAdicionalesActivosFijos";
		inputMap = this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAdicionalesActivosFijos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAdicionalesActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAdicionalesActivosFijos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAdicionalesActivosFijos.setToolTipText("Nuevo AdicionalesActivosFijos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAdicionalesActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAdicionalesActivosFijos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAdicionalesActivosFijos.setToolTipText("Sin Cerrar Ventana AdicionalesActivosFijos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAdicionalesActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAdicionalesActivosFijos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAdicionalesActivosFijos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAdicionalesActivosFijos.setText("Accion");
		this.jComboBoxTiposAccionesAdicionalesActivosFijos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAdicionalesActivosFijos = new JLabelMe();
		
		this.jLabelAccionesAdicionalesActivosFijos.setText("Acciones");		
		this.jLabelAccionesAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAdicionalesActivosFijos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAdicionalesActivosFijos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAdicionalesActivosFijos=new JTabbedPane();
		this.jTabbedPaneRelacionesAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAdicionalesActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAdicionalesActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAdicionalesActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAdicionalesActivosFijos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAdicionalesActivosFijos = new GridBagLayout();
		
		this.jPanelCamposAdicionalesActivosFijos.setLayout(gridaBagLayoutCamposAdicionalesActivosFijos);
		this.jPanelCamposOcultosAdicionalesActivosFijos.setLayout(gridaBagLayoutCamposOcultosAdicionalesActivosFijos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAdicionalesActivosFijos.add(jLabelIdAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAdicionalesActivosFijos.add(jLabelidAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAdicionalesActivosFijos.add(jLabelid_empresaAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 2;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAdicionalesActivosFijos.add(jButtonid_empresaAdicionalesActivosFijosBusqueda, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 3;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAdicionalesActivosFijos.add(jButtonid_empresaAdicionalesActivosFijosUpdate, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAdicionalesActivosFijos.add(jComboBoxid_empresaAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sub_grupoAdicionalesActivosFijos.add(jLabelcodigo_sub_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 2;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sub_grupoAdicionalesActivosFijos.add(jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sub_grupoAdicionalesActivosFijos.add(jTextFieldcodigo_sub_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sub_grupoAdicionalesActivosFijos.add(jLabelnombre_sub_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 2;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sub_grupoAdicionalesActivosFijos.add(jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sub_grupoAdicionalesActivosFijos.add(jscrollPanenombre_sub_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_detalle_grupoAdicionalesActivosFijos.add(jLabelcodigo_detalle_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 2;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_detalle_grupoAdicionalesActivosFijos.add(jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_detalle_grupoAdicionalesActivosFijos.add(jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_detalle_grupoAdicionalesActivosFijos.add(jLabelnombre_detalle_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 2;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_detalle_grupoAdicionalesActivosFijos.add(jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_detalle_grupoAdicionalesActivosFijos.add(jscrollPanenombre_detalle_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveAdicionalesActivosFijos.add(jLabelclaveAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 2;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveAdicionalesActivosFijos.add(jButtonclaveAdicionalesActivosFijosBusqueda, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveAdicionalesActivosFijos.add(jTextFieldclaveAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreAdicionalesActivosFijos.add(jLabelnombreAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 2;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreAdicionalesActivosFijos.add(jButtonnombreAdicionalesActivosFijosBusqueda, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreAdicionalesActivosFijos.add(jscrollPanenombreAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraAdicionalesActivosFijos.add(jLabelfecha_compraAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 2;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraAdicionalesActivosFijos.add(jButtonfecha_compraAdicionalesActivosFijosBusqueda, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraAdicionalesActivosFijos.add(jDateChooserfecha_compraAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvida_utilAdicionalesActivosFijos.add(jLabelvida_utilAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 2;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvida_utilAdicionalesActivosFijos.add(jButtonvida_utilAdicionalesActivosFijosBusqueda, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvida_utilAdicionalesActivosFijos.add(jTextFieldvida_utilAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_de_compraAdicionalesActivosFijos.add(jLabelcosto_de_compraAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 2;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_de_compraAdicionalesActivosFijos.add(jButtoncosto_de_compraAdicionalesActivosFijosBusqueda, this.gridBagConstraintsAdicionalesActivosFijos);
	}

	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_de_compraAdicionalesActivosFijos.add(jTextFieldcosto_de_compraAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAdicionalesActivosFijos.add(this.jPanelidAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposAdicionalesActivosFijos % 1==0) {
		iXPanelCamposAdicionalesActivosFijos=0;
		iYPanelCamposAdicionalesActivosFijos++;
	}
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAdicionalesActivosFijos.add(this.jPanelcodigo_sub_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposAdicionalesActivosFijos % 1==0) {
		iXPanelCamposAdicionalesActivosFijos=0;
		iYPanelCamposAdicionalesActivosFijos++;
	}
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAdicionalesActivosFijos.add(this.jPanelnombre_sub_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposAdicionalesActivosFijos % 1==0) {
		iXPanelCamposAdicionalesActivosFijos=0;
		iYPanelCamposAdicionalesActivosFijos++;
	}
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAdicionalesActivosFijos.add(this.jPanelcodigo_detalle_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposAdicionalesActivosFijos % 1==0) {
		iXPanelCamposAdicionalesActivosFijos=0;
		iYPanelCamposAdicionalesActivosFijos++;
	}
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAdicionalesActivosFijos.add(this.jPanelnombre_detalle_grupoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposAdicionalesActivosFijos % 1==0) {
		iXPanelCamposAdicionalesActivosFijos=0;
		iYPanelCamposAdicionalesActivosFijos++;
	}
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAdicionalesActivosFijos.add(this.jPanelclaveAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposAdicionalesActivosFijos % 1==0) {
		iXPanelCamposAdicionalesActivosFijos=0;
		iYPanelCamposAdicionalesActivosFijos++;
	}
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAdicionalesActivosFijos.add(this.jPanelnombreAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposAdicionalesActivosFijos % 1==0) {
		iXPanelCamposAdicionalesActivosFijos=0;
		iYPanelCamposAdicionalesActivosFijos++;
	}
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAdicionalesActivosFijos.add(this.jPanelfecha_compraAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposAdicionalesActivosFijos % 1==0) {
		iXPanelCamposAdicionalesActivosFijos=0;
		iYPanelCamposAdicionalesActivosFijos++;
	}
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAdicionalesActivosFijos.add(this.jPanelvida_utilAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposAdicionalesActivosFijos % 1==0) {
		iXPanelCamposAdicionalesActivosFijos=0;
		iYPanelCamposAdicionalesActivosFijos++;
	}
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAdicionalesActivosFijos.add(this.jPanelcosto_de_compraAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposAdicionalesActivosFijos % 1==0) {
		iXPanelCamposAdicionalesActivosFijos=0;
		iYPanelCamposAdicionalesActivosFijos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAdicionalesActivosFijos.gridy = iYPanelCamposOcultosAdicionalesActivosFijos;
	this.gridBagConstraintsAdicionalesActivosFijos.gridx = iXPanelCamposOcultosAdicionalesActivosFijos++;
	this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAdicionalesActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAdicionalesActivosFijos.add(this.jPanelid_empresaAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);



	if(iXPanelCamposOcultosAdicionalesActivosFijos % 1==0) {
		iXPanelCamposOcultosAdicionalesActivosFijos=0;
		iYPanelCamposOcultosAdicionalesActivosFijos++;
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
			
		GridBagLayout gridaBagLayoutAccionesAdicionalesActivosFijos= new GridBagLayout();
		this.jPanelAccionesAdicionalesActivosFijos.setLayout(gridaBagLayoutAccionesAdicionalesActivosFijos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAdicionalesActivosFijos= new GridBagLayout();
		this.jPanelAccionesFormularioAdicionalesActivosFijos.setLayout(gridaBagLayoutAccionesFormularioAdicionalesActivosFijos);
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAdicionalesActivosFijos.add(this.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccion++;
			
		this.jPanelAccionesAdicionalesActivosFijos.add(this.jButtonModificarAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);							

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx =iPosXAccion++;
			
		this.jPanelAccionesAdicionalesActivosFijos.add(this.jButtonEliminarAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
			
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccion++;
		
		this.jPanelAccionesAdicionalesActivosFijos.add(this.jButtonActualizarAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccion++;
		
		this.jPanelAccionesAdicionalesActivosFijos.add(this.jButtonGuardarCambiosAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);	
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx =iPosXAccion++;
		
		this.jPanelAccionesAdicionalesActivosFijos.add(this.jButtonCancelarAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAdicionalesActivosFijos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();						
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;		
			//this.gridBagConstraintsAdicionalesActivosFijos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx =0;
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAdicionalesActivosFijos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AdicionalesActivosFijosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAdicionalesActivosFijos = new AdicionalesActivosFijosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Adicionales Activos Fijos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Adicionales Activos Fijos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Adicionales Activos Fijos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AdicionalesActivosFijosModel adicionalesactivosfijosModel=new AdicionalesActivosFijosModel(this);
			
			//SI USARA CLASE INTERNA
			//AdicionalesActivosFijosModel.AdicionalesActivosFijosFocusTraversalPolicy adicionalesactivosfijosFocusTraversalPolicy = adicionalesactivosfijosModel.new AdicionalesActivosFijosFocusTraversalPolicy(this);
			
			//adicionalesactivosfijosFocusTraversalPolicy.setadicionalesactivosfijosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(adicionalesactivosfijosModel);
			
			
			this.jContentPaneDetalleAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAdicionalesActivosFijos = new GridBagLayout();	
			this.jContentPaneDetalleAdicionalesActivosFijos.setLayout(gridaBagLayoutDetalleAdicionalesActivosFijos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAdicionalesActivosFijos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
					
				
				this.jContentPaneDetalleAdicionalesActivosFijos.add(jTtoolBarDetalleAdicionalesActivosFijos, gridBagConstraintsAdicionalesActivosFijos);								
				
}
			
			this.jScrollPanelDatosEdicionAdicionalesActivosFijos=   new JScrollPane(jContentPaneDetalleAdicionalesActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAdicionalesActivosFijos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	        
			this.jContentPaneDetalleAdicionalesActivosFijos.add(jPanelCamposAdicionalesActivosFijos, gridBagConstraintsAdicionalesActivosFijos);
			
			
			
			
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
						//&& adicionalesactivosfijosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAdicionalesActivosFijos= new GridBagConstraints();
						this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
						this.jContentPaneDetalleAdicionalesActivosFijos.add(this.jTabbedPaneRelacionesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAdicionalesActivosFijos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAdicionalesActivosFijos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
					this.gridBagConstraintsAdicionalesActivosFijos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
					
				
					this.jContentPaneDetalleAdicionalesActivosFijos.add(jPanelCamposOcultosAdicionalesActivosFijos, gridBagConstraintsAdicionalesActivosFijos);
				
					this.jPanelCamposOcultosAdicionalesActivosFijos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	        this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAdicionalesActivosFijos.add(this.jPanelAccionesFormularioAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);							
			
			
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
	        this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
	        
			
			this.jContentPaneDetalleAdicionalesActivosFijos.add(this.jPanelAccionesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAdicionalesActivosFijos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAdicionalesActivosFijos=   new JScrollPane(this.jPanelCamposAdicionalesActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAdicionalesActivosFijos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);			
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			
			
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
			
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAdicionalesActivosFijos;//jContentPane;
		
		return jScrollPanelDatosEdicionAdicionalesActivosFijos;
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
