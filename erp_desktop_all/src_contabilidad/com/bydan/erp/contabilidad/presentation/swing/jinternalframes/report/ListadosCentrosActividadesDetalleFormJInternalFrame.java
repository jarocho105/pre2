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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ListadosCentrosActividadesConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ListadosCentrosActividadesDetalleFormJInternalFrame extends ListadosCentrosActividadesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleListadosCentrosActividades;
	
	protected JMenuBar jmenuBarDetalleListadosCentrosActividades;
	
	protected JMenu jmenuDetalleListadosCentrosActividades;
	protected JMenu jmenuDetalleArchivoListadosCentrosActividades;
	protected JMenu jmenuDetalleAccionesListadosCentrosActividades;
	protected JMenu jmenuDetalleDatosListadosCentrosActividades;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadosCentrosActividades;	
	protected GridBagConstraints gridBagConstraintsListadosCentrosActividades;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ListadosCentrosActividadesBeanSwingJInternalFrameAdditional jInternalFrameDetalleListadosCentrosActividades;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadosCentrosActividadesSessionBean listadoscentrosactividadesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ListadosCentrosActividadesLogic listadoscentrosactividadesLogic;
	
	public JScrollPane jScrollPanelDatosListadosCentrosActividades;
	public JScrollPane jScrollPanelDatosEdicionListadosCentrosActividades;
	public JScrollPane jScrollPanelDatosGeneralListadosCentrosActividades;
	
	protected JPanel jPanelCamposListadosCentrosActividades;    
	protected JPanel jPanelCamposOcultosListadosCentrosActividades;    	
	protected JPanel jPanelAccionesListadosCentrosActividades;
	protected JPanel jPanelAccionesFormularioListadosCentrosActividades;
    
	
	
	protected Integer iXPanelCamposListadosCentrosActividades=0;
	protected Integer iYPanelCamposListadosCentrosActividades=0;
	
	protected Integer iXPanelCamposOcultosListadosCentrosActividades=0;
	protected Integer iYPanelCamposOcultosListadosCentrosActividades=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoListadosCentrosActividades;
	public JButton jButtonModificarListadosCentrosActividades;
	public JButton jButtonActualizarListadosCentrosActividades;
    public JButton jButtonEliminarListadosCentrosActividades;
	public JButton jButtonCancelarListadosCentrosActividades;
    public JButton jButtonGuardarCambiosListadosCentrosActividades;
	public JButton jButtonGuardarCambiosTablaListadosCentrosActividades;
	protected JButton jButtonCerrarListadosCentrosActividades;
	
	
	protected JButton jButtonProcesarInformacionListadosCentrosActividades;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoListadosCentrosActividades;
	protected JCheckBox jCheckBoxPostAccionSinCerrarListadosCentrosActividades;
	protected JCheckBox jCheckBoxPostAccionSinMensajeListadosCentrosActividades;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadosCentrosActividades;
	protected JButton jButtonModificarToolBarListadosCentrosActividades;
	protected JButton jButtonActualizarToolBarListadosCentrosActividades;
    protected JButton jButtonEliminarToolBarListadosCentrosActividades;
	protected JButton jButtonCancelarToolBarListadosCentrosActividades;
    protected JButton jButtonGuardarCambiosToolBarListadosCentrosActividades;
	protected JButton jButtonGuardarCambiosTablaToolBarListadosCentrosActividades;
	protected JButton jButtonMostrarOcultarTablaToolBarListadosCentrosActividades;
	protected JButton jButtonCerrarToolBarListadosCentrosActividades;
	
	protected JButton jButtonProcesarInformacionToolBarListadosCentrosActividades;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadosCentrosActividades;
	protected JMenuItem jMenuItemModificarListadosCentrosActividades;
	protected JMenuItem jMenuItemActualizarListadosCentrosActividades;
    protected JMenuItem jMenuItemEliminarListadosCentrosActividades;
	protected JMenuItem jMenuItemCancelarListadosCentrosActividades;
    protected JMenuItem jMenuItemGuardarCambiosListadosCentrosActividades;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadosCentrosActividades;
	protected JMenuItem jMenuItemCerrarListadosCentrosActividades;
	protected JMenuItem jMenuItemDetalleCerrarListadosCentrosActividades;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadosCentrosActividades;
	
	protected JMenuItem jMenuItemProcesarInformacionListadosCentrosActividades;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadosCentrosActividades;
	protected JMenuItem jMenuItemMostrarOcultarListadosCentrosActividades;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadosCentrosActividades;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadosCentrosActividades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadosCentrosActividades;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioListadosCentrosActividades;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidListadosCentrosActividades;
	public JLabel jLabelIdListadosCentrosActividades;
	public JLabel jLabelidListadosCentrosActividades;
	public JButton jButtonidListadosCentrosActividadesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoListadosCentrosActividades;
	public JLabel jLabelcodigoListadosCentrosActividades;
	public JTextField jTextFieldcodigoListadosCentrosActividades;
	public JButton jButtoncodigoListadosCentrosActividadesBusqueda= new JButtonMe();

	public JPanel jPanelnombreListadosCentrosActividades;
	public JLabel jLabelnombreListadosCentrosActividades;
	public JTextArea jTextAreanombreListadosCentrosActividades;
	public JScrollPane jscrollPanenombreListadosCentrosActividades;
	public JButton jButtonnombreListadosCentrosActividadesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaListadosCentrosActividades;
	public JLabel jLabelid_empresaListadosCentrosActividades;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaListadosCentrosActividades;
	public JButton jButtonid_empresaListadosCentrosActividades= new JButtonMe();
	public JButton jButtonid_empresaListadosCentrosActividadesUpdate= new JButtonMe();
	public JButton jButtonid_empresaListadosCentrosActividadesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesListadosCentrosActividades;
	
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
	
	public ListadosCentrosActividadesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposListadosCentrosActividades=new JPanel();
				this.jPanelAccionesFormularioListadosCentrosActividades=new JPanel();
				this.jmenuBarDetalleListadosCentrosActividades=new JMenuBar();
				this.jTtoolBarDetalleListadosCentrosActividades=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosActividadesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ListadosCentrosActividades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ListadosCentrosActividadesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ListadosCentrosActividades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosActividadesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosCentrosActividades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosActividadesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosCentrosActividades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosActividadesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadosCentrosActividades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarListadosCentrosActividades() {
		return this.jButtonActualizarToolBarListadosCentrosActividades;
	}
	
	public JButton getjButtonEliminarToolBarListadosCentrosActividades() {
		return this.jButtonEliminarToolBarListadosCentrosActividades;
	}
	
	public JButton getjButtonCancelarToolBarListadosCentrosActividades() {
		return this.jButtonCancelarToolBarListadosCentrosActividades;
	}		
	
	public JButton getjButtonProcesarInformacionListadosCentrosActividades() {
		return this.jButtonProcesarInformacionListadosCentrosActividades;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadosCentrosActividades)	{
		this.jButtonProcesarInformacionListadosCentrosActividades = jButtonProcesarInformacionListadosCentrosActividades;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadosCentrosActividades() {
		return this.jComboBoxTiposAccionesListadosCentrosActividades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadosCentrosActividades(
			JComboBox jComboBoxTiposRelacionesListadosCentrosActividades) {
		this.jComboBoxTiposRelacionesListadosCentrosActividades = jComboBoxTiposRelacionesListadosCentrosActividades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadosCentrosActividades(
			JComboBox jComboBoxTiposAccionesListadosCentrosActividades) {
		this.jComboBoxTiposAccionesListadosCentrosActividades = jComboBoxTiposAccionesListadosCentrosActividades;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioListadosCentrosActividades() {
		return this.jComboBoxTiposAccionesFormularioListadosCentrosActividades;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioListadosCentrosActividades(
			JComboBox jComboBoxTiposAccionesFormularioListadosCentrosActividades) {
		this.jComboBoxTiposAccionesFormularioListadosCentrosActividades = jComboBoxTiposAccionesFormularioListadosCentrosActividades;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.listadoscentrosactividadesSessionBean=new ListadosCentrosActividadesSessionBean();
		
		this.listadoscentrosactividadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoscentrosactividadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadosCentrosActividadesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadosCentrosActividadesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadosCentrosActividadesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listados Centros Actividades MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
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
	
		ListadosCentrosActividadesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleListadosCentrosActividades= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarListadosCentrosActividades=new JButtonMe();
				this.jButtonModificarToolBarListadosCentrosActividades=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarListadosCentrosActividades,this.jTtoolBarDetalleListadosCentrosActividades,
							"actualizar","actualizar","Actualizar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarListadosCentrosActividades,this.jTtoolBarDetalleListadosCentrosActividades,
							"eliminar","eliminar","Eliminar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarListadosCentrosActividades,this.jTtoolBarDetalleListadosCentrosActividades,
							"cancelar","cancelar","Cancelar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarListadosCentrosActividades,this.jTtoolBarDetalleListadosCentrosActividades,
							"guardarcambios","guardarcambios","Guardar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleListadosCentrosActividades=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleListadosCentrosActividades=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoListadosCentrosActividades=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesListadosCentrosActividades=new JMenuMe("Acciones");
		this.jmenuDetalleDatosListadosCentrosActividades=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadosCentrosActividades= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadosCentrosActividades.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadosCentrosActividades,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarListadosCentrosActividades= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarListadosCentrosActividades.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarListadosCentrosActividades,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarListadosCentrosActividades= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarListadosCentrosActividades.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarListadosCentrosActividades,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarListadosCentrosActividades= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarListadosCentrosActividades.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarListadosCentrosActividades,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarListadosCentrosActividades= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarListadosCentrosActividades.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarListadosCentrosActividades,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosListadosCentrosActividades= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadosCentrosActividades.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadosCentrosActividades,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadosCentrosActividades= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadosCentrosActividades.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadosCentrosActividades,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarListadosCentrosActividades= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarListadosCentrosActividades.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarListadosCentrosActividades,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadosCentrosActividades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadosCentrosActividades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadosCentrosActividades,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadosCentrosActividades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadosCentrosActividades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadosCentrosActividades,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoListadosCentrosActividades.add(this.jMenuItemDetalleCerrarListadosCentrosActividades);
		
		this.jmenuDetalleAccionesListadosCentrosActividades.add(this.jMenuItemActualizarListadosCentrosActividades);
		this.jmenuDetalleAccionesListadosCentrosActividades.add(this.jMenuItemEliminarListadosCentrosActividades);
		this.jmenuDetalleAccionesListadosCentrosActividades.add(this.jMenuItemCancelarListadosCentrosActividades);		
		
		//this.jmenuDetalleDatosListadosCentrosActividades.add(this.jMenuItemDetalleAbrirOrderByListadosCentrosActividades);				
		this.jmenuDetalleDatosListadosCentrosActividades.add(this.jMenuItemDetalleMostarOcultarListadosCentrosActividades);				
				
		//this.jmenuDetalleAccionesListadosCentrosActividades.add(this.jMenuItemGuardarCambiosListadosCentrosActividades);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleListadosCentrosActividades.add(this.jmenuDetalleArchivoListadosCentrosActividades);		
		this.jmenuBarDetalleListadosCentrosActividades.add(this.jmenuDetalleAccionesListadosCentrosActividades);		
		this.jmenuBarDetalleListadosCentrosActividades.add(this.jmenuDetalleDatosListadosCentrosActividades);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleListadosCentrosActividades);				
	}
	
	
	public void inicializarElementosCamposListadosCentrosActividades() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdListadosCentrosActividades = new JLabelMe();
		jLabelIdListadosCentrosActividades.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidListadosCentrosActividades = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidListadosCentrosActividades.setToolTipText(ListadosCentrosActividadesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutListadosCentrosActividades= new GridBagLayout();

		this.jPanelidListadosCentrosActividades.setLayout(this.gridaBagLayoutListadosCentrosActividades);

		jLabelidListadosCentrosActividades = new JLabel();
		jLabelidListadosCentrosActividades.setText("Id");

		jLabelidListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoListadosCentrosActividades = new JLabelMe();
		this.jLabelcodigoListadosCentrosActividades.setText(""+ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoListadosCentrosActividades.setToolTipText("Codigo");
		this.jLabelcodigoListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoListadosCentrosActividades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoListadosCentrosActividades.setToolTipText(ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutListadosCentrosActividades = new GridBagLayout();
		this.jPanelcodigoListadosCentrosActividades.setLayout(this.gridaBagLayoutListadosCentrosActividades);


		jTextFieldcodigoListadosCentrosActividades= new JTextFieldMe();

		jTextFieldcodigoListadosCentrosActividades.setEnabled(false);
		jTextFieldcodigoListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoListadosCentrosActividadesBusqueda= new JButtonMe();
		this.jButtoncodigoListadosCentrosActividadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadosCentrosActividadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadosCentrosActividadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoListadosCentrosActividadesBusqueda.setText("U");
		this.jButtoncodigoListadosCentrosActividadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoListadosCentrosActividadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoListadosCentrosActividadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoListadosCentrosActividades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoListadosCentrosActividades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoListadosCentrosActividadesBusqueda"));

		if(this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoListadosCentrosActividadesBusqueda.setVisible(false);		}


					
		this.jLabelnombreListadosCentrosActividades = new JLabelMe();
		this.jLabelnombreListadosCentrosActividades.setText(""+ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreListadosCentrosActividades.setToolTipText("Nombre");
		this.jLabelnombreListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreListadosCentrosActividades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreListadosCentrosActividades.setToolTipText(ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutListadosCentrosActividades = new GridBagLayout();
		this.jPanelnombreListadosCentrosActividades.setLayout(this.gridaBagLayoutListadosCentrosActividades);


		jTextAreanombreListadosCentrosActividades= new JTextAreaMe();
		jTextAreanombreListadosCentrosActividades.setEnabled(false);
		jTextAreanombreListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadosCentrosActividades.setLineWrap(true);
		jTextAreanombreListadosCentrosActividades.setWrapStyleWord(true);
		jTextAreanombreListadosCentrosActividades.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreListadosCentrosActividades.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreListadosCentrosActividades = new JScrollPane(jTextAreanombreListadosCentrosActividades);
		jscrollPanenombreListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreListadosCentrosActividadesBusqueda= new JButtonMe();
		this.jButtonnombreListadosCentrosActividadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreListadosCentrosActividadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreListadosCentrosActividadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreListadosCentrosActividadesBusqueda.setText("U");
		this.jButtonnombreListadosCentrosActividadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreListadosCentrosActividadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreListadosCentrosActividadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreListadosCentrosActividades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreListadosCentrosActividades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreListadosCentrosActividadesBusqueda"));

		if(this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreListadosCentrosActividadesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysListadosCentrosActividades() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaListadosCentrosActividades = new JLabelMe();
		this.jLabelid_empresaListadosCentrosActividades.setText(""+ListadosCentrosActividadesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaListadosCentrosActividades.setToolTipText("Empresa");
		this.jLabelid_empresaListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaListadosCentrosActividades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaListadosCentrosActividades.setToolTipText(ListadosCentrosActividadesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutListadosCentrosActividades = new GridBagLayout();
		this.jPanelid_empresaListadosCentrosActividades.setLayout(this.gridaBagLayoutListadosCentrosActividades);


		jComboBoxid_empresaListadosCentrosActividades= new JComboBoxMe();
		jComboBoxid_empresaListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaListadosCentrosActividades.setEnabled(false);

		this.jButtonid_empresaListadosCentrosActividades= new JButtonMe();
		this.jButtonid_empresaListadosCentrosActividades.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosCentrosActividades.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosCentrosActividades.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosCentrosActividades.setText("Buscar");
		this.jButtonid_empresaListadosCentrosActividades.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaListadosCentrosActividades.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosCentrosActividades,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaListadosCentrosActividades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosCentrosActividades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosCentrosActividades"));

		this.jButtonid_empresaListadosCentrosActividadesBusqueda= new JButtonMe();
		this.jButtonid_empresaListadosCentrosActividadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosCentrosActividadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosCentrosActividadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadosCentrosActividadesBusqueda.setText("U");
		this.jButtonid_empresaListadosCentrosActividadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaListadosCentrosActividadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosCentrosActividadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaListadosCentrosActividades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosCentrosActividades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosCentrosActividadesBusqueda"));

		if(this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaListadosCentrosActividadesBusqueda.setVisible(false);		}

		this.jButtonid_empresaListadosCentrosActividadesUpdate= new JButtonMe();
		this.jButtonid_empresaListadosCentrosActividadesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosCentrosActividadesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosCentrosActividadesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadosCentrosActividadesUpdate.setText("U");
		this.jButtonid_empresaListadosCentrosActividadesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaListadosCentrosActividadesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosCentrosActividadesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaListadosCentrosActividades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosCentrosActividades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosCentrosActividadesUpdate"));



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
		//this.jInternalFrameDetalleListadosCentrosActividades = new ListadosCentrosActividadesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Listados Centros Actividades DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadosCentrosActividades= new GridBagLayout();
		

		
		String sToolTipListadosCentrosActividades="";
		sToolTipListadosCentrosActividades=ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadosCentrosActividades+="(Contabilidad.ListadosCentrosActividades)";
		}
		
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadosCentrosActividades+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoListadosCentrosActividades = new JButtonMe();
		this.jButtonModificarListadosCentrosActividades = new JButtonMe();
        this.jButtonActualizarListadosCentrosActividades = new JButtonMe();
        this.jButtonEliminarListadosCentrosActividades = new JButtonMe();
        this.jButtonCancelarListadosCentrosActividades = new JButtonMe();
        this.jButtonGuardarCambiosListadosCentrosActividades = new JButtonMe();
		this.jButtonGuardarCambiosTablaListadosCentrosActividades = new JButtonMe();
		this.jButtonCerrarListadosCentrosActividades = new JButtonMe();
		
		this.jScrollPanelDatosListadosCentrosActividades = new JScrollPane();   
        this.jScrollPanelDatosEdicionListadosCentrosActividades = new JScrollPane();
		this.jScrollPanelDatosGeneralListadosCentrosActividades = new JScrollPane();
				
		
		
		this.jPanelCamposListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Listados Centros Actividades";
		
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Actividadeses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadosCentrosActividades.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposListadosCentrosActividades.setName("jPanelCamposListadosCentrosActividades"); 

		this.jPanelCamposOcultosListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosListadosCentrosActividades.setName("jPanelCamposOcultosListadosCentrosActividades"); 

        this.jPanelAccionesListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadosCentrosActividades.setToolTipText("Acciones");
        this.jPanelAccionesListadosCentrosActividades.setName("Acciones"); 

		this.jPanelAccionesFormularioListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioListadosCentrosActividades.setToolTipText("Acciones");
        this.jPanelAccionesFormularioListadosCentrosActividades.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoListadosCentrosActividades.setText("Nuevo");
		this.jButtonModificarListadosCentrosActividades.setText("Editar");
        this.jButtonActualizarListadosCentrosActividades.setText("Actualizar");
        this.jButtonEliminarListadosCentrosActividades.setText("Eliminar");
        this.jButtonCancelarListadosCentrosActividades.setText("Cancelar");
        this.jButtonGuardarCambiosListadosCentrosActividades.setText("Guardar");
		this.jButtonGuardarCambiosTablaListadosCentrosActividades.setText("Guardar");
		this.jButtonCerrarListadosCentrosActividades.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadosCentrosActividades,"nuevo_button","Nuevo",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarListadosCentrosActividades,"modificar_button","Editar",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarListadosCentrosActividades,"actualizar_button","Actualizar",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarListadosCentrosActividades,"eliminar_button","Eliminar",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarListadosCentrosActividades,"cancelar_button","Cancelar",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosListadosCentrosActividades,"guardarcambios_button","Guardar",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadosCentrosActividades,"guardarcambiostabla_button","Guardar",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadosCentrosActividades,"cerrar_button","Salir",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoListadosCentrosActividades.setToolTipText("Nuevo"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarListadosCentrosActividades.setToolTipText("Editar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarListadosCentrosActividades.setToolTipText("Actualizar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarListadosCentrosActividades.setToolTipText("Eliminar)"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarListadosCentrosActividades.setToolTipText("Cancelar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosListadosCentrosActividades.setToolTipText("Guardar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaListadosCentrosActividades.setToolTipText("Guardar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadosCentrosActividades.setToolTipText("Salir"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadosCentrosActividades";
		inputMap = this.jButtonNuevoListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadosCentrosActividades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadosCentrosActividades"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarListadosCentrosActividades";
		inputMap = this.jButtonActualizarListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarListadosCentrosActividades"));
		
		//ELIMINAR
		sMapKey = "EliminarListadosCentrosActividades";
		inputMap = this.jButtonEliminarListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarListadosCentrosActividades"));
		
		//CANCELAR	
		sMapKey = "CancelarListadosCentrosActividades";
		inputMap = this.jButtonCancelarListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarListadosCentrosActividades"));
		
		//CERRAR		
		sMapKey = "CerrarListadosCentrosActividades";
		inputMap = this.jButtonCerrarListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadosCentrosActividades"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadosCentrosActividades";
		inputMap = this.jButtonGuardarCambiosTablaListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadosCentrosActividades"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoListadosCentrosActividades = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoListadosCentrosActividades.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoListadosCentrosActividades.setToolTipText("Nuevo ListadosCentrosActividades");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarListadosCentrosActividades = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarListadosCentrosActividades.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarListadosCentrosActividades.setToolTipText("Sin Cerrar Ventana ListadosCentrosActividades");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeListadosCentrosActividades = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeListadosCentrosActividades.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeListadosCentrosActividades.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesListadosCentrosActividades = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadosCentrosActividades.setText("Accion");
		this.jComboBoxTiposAccionesListadosCentrosActividades.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioListadosCentrosActividades = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesListadosCentrosActividades = new JLabelMe();
		
		this.jLabelAccionesListadosCentrosActividades.setText("Acciones");		
		this.jLabelAccionesListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposListadosCentrosActividades();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysListadosCentrosActividades();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesListadosCentrosActividades=new JTabbedPane();
		this.jTabbedPaneRelacionesListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesListadosCentrosActividades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosCentrosActividades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosCentrosActividades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposListadosCentrosActividades = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosListadosCentrosActividades = new GridBagLayout();
		
		this.jPanelCamposListadosCentrosActividades.setLayout(gridaBagLayoutCamposListadosCentrosActividades);
		this.jPanelCamposOcultosListadosCentrosActividades.setLayout(gridaBagLayoutCamposOcultosListadosCentrosActividades);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
	this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidListadosCentrosActividades.add(jLabelIdListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);



	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
	this.gridBagConstraintsListadosCentrosActividades.gridx = 1;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidListadosCentrosActividades.add(jLabelidListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);


	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
	this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaListadosCentrosActividades.add(jLabelid_empresaListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
		this.gridBagConstraintsListadosCentrosActividades.gridx = 2;
		this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
		this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadosCentrosActividades.add(jButtonid_empresaListadosCentrosActividadesBusqueda, this.gridBagConstraintsListadosCentrosActividades);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
		this.gridBagConstraintsListadosCentrosActividades.gridx = 3;
		this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
		this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadosCentrosActividades.add(jButtonid_empresaListadosCentrosActividadesUpdate, this.gridBagConstraintsListadosCentrosActividades);
	}

	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
	this.gridBagConstraintsListadosCentrosActividades.gridx = 1;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaListadosCentrosActividades.add(jComboBoxid_empresaListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);


	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
	this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoListadosCentrosActividades.add(jLabelcodigoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
		this.gridBagConstraintsListadosCentrosActividades.gridx = 2;
		this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
		this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoListadosCentrosActividades.add(jButtoncodigoListadosCentrosActividadesBusqueda, this.gridBagConstraintsListadosCentrosActividades);
	}

	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
	this.gridBagConstraintsListadosCentrosActividades.gridx = 1;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoListadosCentrosActividades.add(jTextFieldcodigoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);


	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
	this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreListadosCentrosActividades.add(jLabelnombreListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
		this.gridBagConstraintsListadosCentrosActividades.gridx = 2;
		this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
		this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreListadosCentrosActividades.add(jButtonnombreListadosCentrosActividadesBusqueda, this.gridBagConstraintsListadosCentrosActividades);
	}

	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
	this.gridBagConstraintsListadosCentrosActividades.gridx = 1;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreListadosCentrosActividades.add(jscrollPanenombreListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosCentrosActividades.gridy = iYPanelCamposListadosCentrosActividades;
	this.gridBagConstraintsListadosCentrosActividades.gridx = iXPanelCamposListadosCentrosActividades++;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosCentrosActividades.add(this.jPanelidListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);



	if(iXPanelCamposListadosCentrosActividades % 1==0) {
		iXPanelCamposListadosCentrosActividades=0;
		iYPanelCamposListadosCentrosActividades++;
	}
	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosCentrosActividades.gridy = iYPanelCamposListadosCentrosActividades;
	this.gridBagConstraintsListadosCentrosActividades.gridx = iXPanelCamposListadosCentrosActividades++;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosCentrosActividades.add(this.jPanelcodigoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);



	if(iXPanelCamposListadosCentrosActividades % 1==0) {
		iXPanelCamposListadosCentrosActividades=0;
		iYPanelCamposListadosCentrosActividades++;
	}
	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosCentrosActividades.gridy = iYPanelCamposListadosCentrosActividades;
	this.gridBagConstraintsListadosCentrosActividades.gridx = iXPanelCamposListadosCentrosActividades++;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosCentrosActividades.add(this.jPanelnombreListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);



	if(iXPanelCamposListadosCentrosActividades % 1==0) {
		iXPanelCamposListadosCentrosActividades=0;
		iYPanelCamposListadosCentrosActividades++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosCentrosActividades.gridy = iYPanelCamposOcultosListadosCentrosActividades;
	this.gridBagConstraintsListadosCentrosActividades.gridx = iXPanelCamposOcultosListadosCentrosActividades++;
	this.gridBagConstraintsListadosCentrosActividades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosCentrosActividades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadosCentrosActividades.add(this.jPanelid_empresaListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);



	if(iXPanelCamposOcultosListadosCentrosActividades % 1==0) {
		iXPanelCamposOcultosListadosCentrosActividades=0;
		iYPanelCamposOcultosListadosCentrosActividades++;
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
			
		GridBagLayout gridaBagLayoutAccionesListadosCentrosActividades= new GridBagLayout();
		this.jPanelAccionesListadosCentrosActividades.setLayout(gridaBagLayoutAccionesListadosCentrosActividades);
		
		GridBagLayout gridaBagLayoutAccionesFormularioListadosCentrosActividades= new GridBagLayout();
		this.jPanelAccionesFormularioListadosCentrosActividades.setLayout(gridaBagLayoutAccionesFormularioListadosCentrosActividades);
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioListadosCentrosActividades.add(this.jComboBoxTiposAccionesFormularioListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccion++;
			
		this.jPanelAccionesListadosCentrosActividades.add(this.jButtonModificarListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);							

		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
		this.gridBagConstraintsListadosCentrosActividades.gridx =iPosXAccion++;
			
		this.jPanelAccionesListadosCentrosActividades.add(this.jButtonEliminarListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
			
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = 0;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadosCentrosActividades.add(this.jButtonActualizarListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);


		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = 0;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadosCentrosActividades.add(this.jButtonGuardarCambiosListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);	
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = 0;		
		this.gridBagConstraintsListadosCentrosActividades.gridx =iPosXAccion++;
		
		this.jPanelAccionesListadosCentrosActividades.add(this.jButtonCancelarListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadosCentrosActividades = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadosCentrosActividades);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();						
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosCentrosActividades.gridx = 0;		
			//this.gridBagConstraintsListadosCentrosActividades.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadosCentrosActividades.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadosCentrosActividades.gridx =0;
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadosCentrosActividades.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ListadosCentrosActividadesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleListadosCentrosActividades = new ListadosCentrosActividadesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Listados Centros Actividades DATOS");
			
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
			
	        //this.setTitle("[FOR] - Listados Centros Actividades DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listados Centros Actividades Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ListadosCentrosActividadesModel listadoscentrosactividadesModel=new ListadosCentrosActividadesModel(this);
			
			//SI USARA CLASE INTERNA
			//ListadosCentrosActividadesModel.ListadosCentrosActividadesFocusTraversalPolicy listadoscentrosactividadesFocusTraversalPolicy = listadoscentrosactividadesModel.new ListadosCentrosActividadesFocusTraversalPolicy(this);
			
			//listadoscentrosactividadesFocusTraversalPolicy.setlistadoscentrosactividadesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(listadoscentrosactividadesModel);
			
			
			this.jContentPaneDetalleListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleListadosCentrosActividades = new GridBagLayout();	
			this.jContentPaneDetalleListadosCentrosActividades.setLayout(gridaBagLayoutDetalleListadosCentrosActividades);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadosCentrosActividades = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
				this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
					
				
				this.jContentPaneDetalleListadosCentrosActividades.add(jTtoolBarDetalleListadosCentrosActividades, gridBagConstraintsListadosCentrosActividades);								
				
}
			
			this.jScrollPanelDatosEdicionListadosCentrosActividades=   new JScrollPane(jContentPaneDetalleListadosCentrosActividades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadosCentrosActividades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosCentrosActividades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosCentrosActividades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralListadosCentrosActividades=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadosCentrosActividades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosCentrosActividades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosCentrosActividades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			
			
	        this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
	        
			this.jContentPaneDetalleListadosCentrosActividades.add(jPanelCamposListadosCentrosActividades, gridBagConstraintsListadosCentrosActividades);
			
			
			
			
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
						//&& listadoscentrosactividadesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsListadosCentrosActividades= new GridBagConstraints();
						this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyRelaciones++;
						this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
						this.jContentPaneDetalleListadosCentrosActividades.add(this.jTabbedPaneRelacionesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesListadosCentrosActividades.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosListadosCentrosActividades.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
					this.gridBagConstraintsListadosCentrosActividades.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
					
				
					this.jContentPaneDetalleListadosCentrosActividades.add(jPanelCamposOcultosListadosCentrosActividades, gridBagConstraintsListadosCentrosActividades);
				
					this.jPanelCamposOcultosListadosCentrosActividades.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
	        this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleListadosCentrosActividades.add(this.jPanelAccionesFormularioListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);							
			
			
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
	        this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
	        
			
			this.jContentPaneDetalleListadosCentrosActividades.add(this.jPanelAccionesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionListadosCentrosActividades);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionListadosCentrosActividades=   new JScrollPane(this.jPanelCamposListadosCentrosActividades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadosCentrosActividades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosCentrosActividades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosCentrosActividades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsListadosCentrosActividades.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);			
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			
			
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
			
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosActividades.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralListadosCentrosActividades;//jContentPane;
		
		return jScrollPanelDatosEdicionListadosCentrosActividades;
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
