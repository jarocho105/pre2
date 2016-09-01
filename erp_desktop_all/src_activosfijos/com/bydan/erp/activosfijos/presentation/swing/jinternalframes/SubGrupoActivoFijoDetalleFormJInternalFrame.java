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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.SubGrupoActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class SubGrupoActivoFijoDetalleFormJInternalFrame extends SubGrupoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSubGrupoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleSubGrupoActivoFijo;
	
	protected JMenu jmenuDetalleSubGrupoActivoFijo;
	protected JMenu jmenuDetalleArchivoSubGrupoActivoFijo;
	protected JMenu jmenuDetalleAccionesSubGrupoActivoFijo;
	protected JMenu jmenuDetalleDatosSubGrupoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSubGrupoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsSubGrupoActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SubGrupoActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleSubGrupoActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallegrupoactivofijo="";
	
	public SubGrupoActivoFijoSessionBean subgrupoactivofijoSessionBean;
	
	

	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;
	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleActivoFijo=false;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;	
	
	public SubGrupoActivoFijoLogic subgrupoactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosSubGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionSubGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralSubGrupoActivoFijo;
	
	protected JPanel jPanelCamposSubGrupoActivoFijo;    
	protected JPanel jPanelCamposOcultosSubGrupoActivoFijo;    	
	protected JPanel jPanelAccionesSubGrupoActivoFijo;
	protected JPanel jPanelAccionesFormularioSubGrupoActivoFijo;
    
	
	
	protected Integer iXPanelCamposSubGrupoActivoFijo=0;
	protected Integer iYPanelCamposSubGrupoActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosSubGrupoActivoFijo=0;
	protected Integer iYPanelCamposOcultosSubGrupoActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSubGrupoActivoFijo;
	public JButton jButtonModificarSubGrupoActivoFijo;
	public JButton jButtonActualizarSubGrupoActivoFijo;
    public JButton jButtonEliminarSubGrupoActivoFijo;
	public JButton jButtonCancelarSubGrupoActivoFijo;
    public JButton jButtonGuardarCambiosSubGrupoActivoFijo;
	public JButton jButtonGuardarCambiosTablaSubGrupoActivoFijo;
	protected JButton jButtonCerrarSubGrupoActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionSubGrupoActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSubGrupoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSubGrupoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSubGrupoActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSubGrupoActivoFijo;
	protected JButton jButtonModificarToolBarSubGrupoActivoFijo;
	protected JButton jButtonActualizarToolBarSubGrupoActivoFijo;
    protected JButton jButtonEliminarToolBarSubGrupoActivoFijo;
	protected JButton jButtonCancelarToolBarSubGrupoActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarSubGrupoActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarSubGrupoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarSubGrupoActivoFijo;
	protected JButton jButtonCerrarToolBarSubGrupoActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarSubGrupoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSubGrupoActivoFijo;
	protected JMenuItem jMenuItemModificarSubGrupoActivoFijo;
	protected JMenuItem jMenuItemActualizarSubGrupoActivoFijo;
    protected JMenuItem jMenuItemEliminarSubGrupoActivoFijo;
	protected JMenuItem jMenuItemCancelarSubGrupoActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosSubGrupoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaSubGrupoActivoFijo;
	protected JMenuItem jMenuItemCerrarSubGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarSubGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarSubGrupoActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionSubGrupoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSubGrupoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarSubGrupoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSubGrupoActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSubGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSubGrupoActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSubGrupoActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSubGrupoActivoFijo;
	public JLabel jLabelIdSubGrupoActivoFijo;
	public JLabel jLabelidSubGrupoActivoFijo;
	public JButton jButtonidSubGrupoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoSubGrupoActivoFijo;
	public JLabel jLabelcodigoSubGrupoActivoFijo;
	public JTextField jTextFieldcodigoSubGrupoActivoFijo;
	public JButton jButtoncodigoSubGrupoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnombreSubGrupoActivoFijo;
	public JLabel jLabelnombreSubGrupoActivoFijo;
	public JTextArea jTextAreanombreSubGrupoActivoFijo;
	public JScrollPane jscrollPanenombreSubGrupoActivoFijo;
	public JButton jButtonnombreSubGrupoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelsiglasSubGrupoActivoFijo;
	public JLabel jLabelsiglasSubGrupoActivoFijo;
	public JTextField jTextFieldsiglasSubGrupoActivoFijo;
	public JButton jButtonsiglasSubGrupoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPaneles_vehiculoSubGrupoActivoFijo;
	public JLabel jLabeles_vehiculoSubGrupoActivoFijo;
	public JCheckBox jCheckBoxes_vehiculoSubGrupoActivoFijo;
	public JButton jButtones_vehiculoSubGrupoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSubGrupoActivoFijo;
	public JLabel jLabelid_empresaSubGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSubGrupoActivoFijo;
	public JButton jButtonid_empresaSubGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaSubGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaSubGrupoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_grupo_activo_fijoSubGrupoActivoFijo;
	public JLabel jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo;
	public JButton jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSubGrupoActivoFijo;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SubGrupoActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSubGrupoActivoFijo=new JPanel();
				this.jPanelAccionesFormularioSubGrupoActivoFijo=new JPanel();
				this.jmenuBarDetalleSubGrupoActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleSubGrupoActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SubGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SubGrupoActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SubGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SubGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSubGrupoActivoFijo() {
		return this.jButtonActualizarToolBarSubGrupoActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarSubGrupoActivoFijo() {
		return this.jButtonEliminarToolBarSubGrupoActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarSubGrupoActivoFijo() {
		return this.jButtonCancelarToolBarSubGrupoActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionSubGrupoActivoFijo() {
		return this.jButtonProcesarInformacionSubGrupoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSubGrupoActivoFijo)	{
		this.jButtonProcesarInformacionSubGrupoActivoFijo = jButtonProcesarInformacionSubGrupoActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSubGrupoActivoFijo() {
		return this.jComboBoxTiposAccionesSubGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSubGrupoActivoFijo(
			JComboBox jComboBoxTiposRelacionesSubGrupoActivoFijo) {
		this.jComboBoxTiposRelacionesSubGrupoActivoFijo = jComboBoxTiposRelacionesSubGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSubGrupoActivoFijo(
			JComboBox jComboBoxTiposAccionesSubGrupoActivoFijo) {
		this.jComboBoxTiposAccionesSubGrupoActivoFijo = jComboBoxTiposAccionesSubGrupoActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSubGrupoActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSubGrupoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioSubGrupoActivoFijo) {
		this.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo = jComboBoxTiposAccionesFormularioSubGrupoActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
		
		this.subgrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subgrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SubGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SubGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SubGrupoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sub Grupo Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		SubGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSubGrupoActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSubGrupoActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarSubGrupoActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSubGrupoActivoFijo,this.jTtoolBarDetalleSubGrupoActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSubGrupoActivoFijo,this.jTtoolBarDetalleSubGrupoActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSubGrupoActivoFijo,this.jTtoolBarDetalleSubGrupoActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSubGrupoActivoFijo,this.jTtoolBarDetalleSubGrupoActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSubGrupoActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSubGrupoActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSubGrupoActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSubGrupoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSubGrupoActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSubGrupoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSubGrupoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSubGrupoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSubGrupoActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSubGrupoActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSubGrupoActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSubGrupoActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSubGrupoActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSubGrupoActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSubGrupoActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSubGrupoActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSubGrupoActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSubGrupoActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSubGrupoActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSubGrupoActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSubGrupoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSubGrupoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSubGrupoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSubGrupoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSubGrupoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSubGrupoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSubGrupoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSubGrupoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSubGrupoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSubGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSubGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSubGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSubGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSubGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSubGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSubGrupoActivoFijo.add(this.jMenuItemDetalleCerrarSubGrupoActivoFijo);
		
		this.jmenuDetalleAccionesSubGrupoActivoFijo.add(this.jMenuItemActualizarSubGrupoActivoFijo);
		this.jmenuDetalleAccionesSubGrupoActivoFijo.add(this.jMenuItemEliminarSubGrupoActivoFijo);
		this.jmenuDetalleAccionesSubGrupoActivoFijo.add(this.jMenuItemCancelarSubGrupoActivoFijo);		
		
		//this.jmenuDetalleDatosSubGrupoActivoFijo.add(this.jMenuItemDetalleAbrirOrderBySubGrupoActivoFijo);				
		this.jmenuDetalleDatosSubGrupoActivoFijo.add(this.jMenuItemDetalleMostarOcultarSubGrupoActivoFijo);				
				
		//this.jmenuDetalleAccionesSubGrupoActivoFijo.add(this.jMenuItemGuardarCambiosSubGrupoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSubGrupoActivoFijo.add(this.jmenuDetalleArchivoSubGrupoActivoFijo);		
		this.jmenuBarDetalleSubGrupoActivoFijo.add(this.jmenuDetalleAccionesSubGrupoActivoFijo);		
		this.jmenuBarDetalleSubGrupoActivoFijo.add(this.jmenuDetalleDatosSubGrupoActivoFijo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleSubGrupoActivoFijo.add(this.jmenuDetalleSubGrupoActivoFijo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSubGrupoActivoFijo);				
	}
	
	
	public void inicializarElementosCamposSubGrupoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSubGrupoActivoFijo = new JLabelMe();
		jLabelIdSubGrupoActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSubGrupoActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSubGrupoActivoFijo.setToolTipText(SubGrupoActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSubGrupoActivoFijo= new GridBagLayout();

		this.jPanelidSubGrupoActivoFijo.setLayout(this.gridaBagLayoutSubGrupoActivoFijo);

		jLabelidSubGrupoActivoFijo = new JLabel();
		jLabelidSubGrupoActivoFijo.setText("Id");

		jLabelidSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoSubGrupoActivoFijo = new JLabelMe();
		this.jLabelcodigoSubGrupoActivoFijo.setText(""+SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoSubGrupoActivoFijo.setToolTipText("Codigo");
		this.jLabelcodigoSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoSubGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoSubGrupoActivoFijo.setToolTipText(SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutSubGrupoActivoFijo = new GridBagLayout();
		this.jPanelcodigoSubGrupoActivoFijo.setLayout(this.gridaBagLayoutSubGrupoActivoFijo);


		jTextFieldcodigoSubGrupoActivoFijo= new JTextFieldMe();

		jTextFieldcodigoSubGrupoActivoFijo.setEnabled(false);
		jTextFieldcodigoSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoSubGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtoncodigoSubGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSubGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSubGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoSubGrupoActivoFijoBusqueda.setText("U");
		this.jButtoncodigoSubGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoSubGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoSubGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoSubGrupoActivoFijoBusqueda"));

		if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoSubGrupoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelnombreSubGrupoActivoFijo = new JLabelMe();
		this.jLabelnombreSubGrupoActivoFijo.setText(""+SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSubGrupoActivoFijo.setToolTipText("Nombre");
		this.jLabelnombreSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSubGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSubGrupoActivoFijo.setToolTipText(SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSubGrupoActivoFijo = new GridBagLayout();
		this.jPanelnombreSubGrupoActivoFijo.setLayout(this.gridaBagLayoutSubGrupoActivoFijo);


		jTextAreanombreSubGrupoActivoFijo= new JTextAreaMe();
		jTextAreanombreSubGrupoActivoFijo.setEnabled(false);
		jTextAreanombreSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubGrupoActivoFijo.setLineWrap(true);
		jTextAreanombreSubGrupoActivoFijo.setWrapStyleWord(true);
		jTextAreanombreSubGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreSubGrupoActivoFijo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreSubGrupoActivoFijo = new JScrollPane(jTextAreanombreSubGrupoActivoFijo);
		jscrollPanenombreSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreSubGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonnombreSubGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSubGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSubGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSubGrupoActivoFijoBusqueda.setText("U");
		this.jButtonnombreSubGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSubGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSubGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSubGrupoActivoFijoBusqueda"));

		if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSubGrupoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelsiglasSubGrupoActivoFijo = new JLabelMe();
		this.jLabelsiglasSubGrupoActivoFijo.setText(""+SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasSubGrupoActivoFijo.setToolTipText("Siglas");
		this.jLabelsiglasSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasSubGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasSubGrupoActivoFijo.setToolTipText(SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutSubGrupoActivoFijo = new GridBagLayout();
		this.jPanelsiglasSubGrupoActivoFijo.setLayout(this.gridaBagLayoutSubGrupoActivoFijo);


		jTextFieldsiglasSubGrupoActivoFijo= new JTextFieldMe();

		jTextFieldsiglasSubGrupoActivoFijo.setEnabled(false);
		jTextFieldsiglasSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasSubGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonsiglasSubGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasSubGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasSubGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasSubGrupoActivoFijoBusqueda.setText("U");
		this.jButtonsiglasSubGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasSubGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasSubGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasSubGrupoActivoFijoBusqueda"));

		if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasSubGrupoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabeles_vehiculoSubGrupoActivoFijo = new JLabelMe();
		this.jLabeles_vehiculoSubGrupoActivoFijo.setText(""+SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO+" : *");
		this.jLabeles_vehiculoSubGrupoActivoFijo.setToolTipText("Es Vehiculo");
		this.jLabeles_vehiculoSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_vehiculoSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_vehiculoSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_vehiculoSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_vehiculoSubGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_vehiculoSubGrupoActivoFijo.setToolTipText(SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO);
		this.gridaBagLayoutSubGrupoActivoFijo = new GridBagLayout();
		this.jPaneles_vehiculoSubGrupoActivoFijo.setLayout(this.gridaBagLayoutSubGrupoActivoFijo);


		jCheckBoxes_vehiculoSubGrupoActivoFijo= new JCheckBoxMe();
		jCheckBoxes_vehiculoSubGrupoActivoFijo.setEnabled(false);

		jCheckBoxes_vehiculoSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_vehiculoSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_vehiculoSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_vehiculoSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_vehiculoSubGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtones_vehiculoSubGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_vehiculoSubGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_vehiculoSubGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_vehiculoSubGrupoActivoFijoBusqueda.setText("U");
		this.jButtones_vehiculoSubGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_vehiculoSubGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_vehiculoSubGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_vehiculoSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_vehiculoSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_vehiculoSubGrupoActivoFijoBusqueda"));

		if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_vehiculoSubGrupoActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSubGrupoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSubGrupoActivoFijo = new JLabelMe();
		this.jLabelid_empresaSubGrupoActivoFijo.setText(""+SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSubGrupoActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSubGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSubGrupoActivoFijo.setToolTipText(SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSubGrupoActivoFijo = new GridBagLayout();
		this.jPanelid_empresaSubGrupoActivoFijo.setLayout(this.gridaBagLayoutSubGrupoActivoFijo);


		jComboBoxid_empresaSubGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSubGrupoActivoFijo.setEnabled(false);

		this.jButtonid_empresaSubGrupoActivoFijo= new JButtonMe();
		this.jButtonid_empresaSubGrupoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubGrupoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubGrupoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubGrupoActivoFijo.setText("Buscar");
		this.jButtonid_empresaSubGrupoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSubGrupoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubGrupoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubGrupoActivoFijo"));

		this.jButtonid_empresaSubGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaSubGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSubGrupoActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaSubGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSubGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubGrupoActivoFijoBusqueda"));

		if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSubGrupoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaSubGrupoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaSubGrupoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubGrupoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubGrupoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSubGrupoActivoFijoUpdate.setText("U");
		this.jButtonid_empresaSubGrupoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSubGrupoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubGrupoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubGrupoActivoFijoUpdate"));



					
		this.jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo = new JLabelMe();
		this.jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setText(""+SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO+" : *");
		this.jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setToolTipText("Detalle Grupo Activo Fijo");
		this.jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_grupo_activo_fijoSubGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setToolTipText(SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
		this.gridaBagLayoutSubGrupoActivoFijo = new GridBagLayout();
		this.jPanelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setLayout(this.gridaBagLayoutSubGrupoActivoFijo);


		jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijo= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setText("Buscar");
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoSubGrupoActivoFijo"));

		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda.setText("U");
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda"));

		if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate.setText("U");
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleSubGrupoActivoFijo = new SubGrupoActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sub Grupo Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSubGrupoActivoFijo= new GridBagLayout();
		

		
		String sToolTipSubGrupoActivoFijo="";
		sToolTipSubGrupoActivoFijo=SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSubGrupoActivoFijo+="(ActivosFijos.SubGrupoActivoFijo)";
		}
		
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSubGrupoActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSubGrupoActivoFijo = new JButtonMe();
		this.jButtonModificarSubGrupoActivoFijo = new JButtonMe();
        this.jButtonActualizarSubGrupoActivoFijo = new JButtonMe();
        this.jButtonEliminarSubGrupoActivoFijo = new JButtonMe();
        this.jButtonCancelarSubGrupoActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosSubGrupoActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarSubGrupoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosSubGrupoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionSubGrupoActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralSubGrupoActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sub Grupo Activo Fijo";
		
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosSubGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSubGrupoActivoFijo.setName("jPanelCamposSubGrupoActivoFijo"); 

		this.jPanelCamposOcultosSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSubGrupoActivoFijo.setName("jPanelCamposOcultosSubGrupoActivoFijo"); 

        this.jPanelAccionesSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSubGrupoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesSubGrupoActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSubGrupoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSubGrupoActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSubGrupoActivoFijo.setText("Nuevo");
		this.jButtonModificarSubGrupoActivoFijo.setText("Editar");
        this.jButtonActualizarSubGrupoActivoFijo.setText("Actualizar");
        this.jButtonEliminarSubGrupoActivoFijo.setText("Eliminar");
        this.jButtonCancelarSubGrupoActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosSubGrupoActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.setText("Guardar");
		this.jButtonCerrarSubGrupoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSubGrupoActivoFijo,"nuevo_button","Nuevo",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSubGrupoActivoFijo,"modificar_button","Editar",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSubGrupoActivoFijo,"actualizar_button","Actualizar",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSubGrupoActivoFijo,"eliminar_button","Eliminar",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSubGrupoActivoFijo,"cancelar_button","Cancelar",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSubGrupoActivoFijo,"guardarcambios_button","Guardar",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSubGrupoActivoFijo,"guardarcambiostabla_button","Guardar",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSubGrupoActivoFijo,"cerrar_button","Salir",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSubGrupoActivoFijo.setToolTipText("Nuevo"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSubGrupoActivoFijo.setToolTipText("Editar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSubGrupoActivoFijo.setToolTipText("Actualizar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSubGrupoActivoFijo.setToolTipText("Eliminar)"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSubGrupoActivoFijo.setToolTipText("Cancelar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSubGrupoActivoFijo.setToolTipText("Guardar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.setToolTipText("Guardar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSubGrupoActivoFijo.setToolTipText("Salir"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSubGrupoActivoFijo";
		inputMap = this.jButtonNuevoSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSubGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSubGrupoActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSubGrupoActivoFijo";
		inputMap = this.jButtonActualizarSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSubGrupoActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarSubGrupoActivoFijo";
		inputMap = this.jButtonEliminarSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSubGrupoActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarSubGrupoActivoFijo";
		inputMap = this.jButtonCancelarSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSubGrupoActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarSubGrupoActivoFijo";
		inputMap = this.jButtonCerrarSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSubGrupoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSubGrupoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSubGrupoActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSubGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSubGrupoActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSubGrupoActivoFijo.setToolTipText("Nuevo SubGrupoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSubGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSubGrupoActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSubGrupoActivoFijo.setToolTipText("Sin Cerrar Ventana SubGrupoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSubGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSubGrupoActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSubGrupoActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSubGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSubGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesSubGrupoActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSubGrupoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesSubGrupoActivoFijo.setText("Acciones");		
		this.jLabelAccionesSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSubGrupoActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSubGrupoActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSubGrupoActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSubGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSubGrupoActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSubGrupoActivoFijo = new GridBagLayout();
		
		this.jPanelCamposSubGrupoActivoFijo.setLayout(gridaBagLayoutCamposSubGrupoActivoFijo);
		this.jPanelCamposOcultosSubGrupoActivoFijo.setLayout(gridaBagLayoutCamposOcultosSubGrupoActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSubGrupoActivoFijo.add(jLabelIdSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSubGrupoActivoFijo.add(jLabelidSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);


	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSubGrupoActivoFijo.add(jLabelid_empresaSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSubGrupoActivoFijo.add(jButtonid_empresaSubGrupoActivoFijoBusqueda, this.gridBagConstraintsSubGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 3;
		this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSubGrupoActivoFijo.add(jButtonid_empresaSubGrupoActivoFijoUpdate, this.gridBagConstraintsSubGrupoActivoFijo);
	}

	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSubGrupoActivoFijo.add(jComboBoxid_empresaSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);


	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.add(jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.add(jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda, this.gridBagConstraintsSubGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 3;
		this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.add(jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate, this.gridBagConstraintsSubGrupoActivoFijo);
	}

	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.add(jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);


	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoSubGrupoActivoFijo.add(jLabelcodigoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoSubGrupoActivoFijo.add(jButtoncodigoSubGrupoActivoFijoBusqueda, this.gridBagConstraintsSubGrupoActivoFijo);
	}

	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoSubGrupoActivoFijo.add(jTextFieldcodigoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);


	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSubGrupoActivoFijo.add(jLabelnombreSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSubGrupoActivoFijo.add(jButtonnombreSubGrupoActivoFijoBusqueda, this.gridBagConstraintsSubGrupoActivoFijo);
	}

	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSubGrupoActivoFijo.add(jscrollPanenombreSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);


	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasSubGrupoActivoFijo.add(jLabelsiglasSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasSubGrupoActivoFijo.add(jButtonsiglasSubGrupoActivoFijoBusqueda, this.gridBagConstraintsSubGrupoActivoFijo);
	}

	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasSubGrupoActivoFijo.add(jTextFieldsiglasSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);


	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_vehiculoSubGrupoActivoFijo.add(jLabeles_vehiculoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_vehiculoSubGrupoActivoFijo.add(jButtones_vehiculoSubGrupoActivoFijoBusqueda, this.gridBagConstraintsSubGrupoActivoFijo);
	}

	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_vehiculoSubGrupoActivoFijo.add(jCheckBoxes_vehiculoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = iYPanelCamposSubGrupoActivoFijo;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = iXPanelCamposSubGrupoActivoFijo++;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubGrupoActivoFijo.add(this.jPanelidSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(iXPanelCamposSubGrupoActivoFijo % 1==0) {
		iXPanelCamposSubGrupoActivoFijo=0;
		iYPanelCamposSubGrupoActivoFijo++;
	}
	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = iYPanelCamposSubGrupoActivoFijo;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = iXPanelCamposSubGrupoActivoFijo++;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubGrupoActivoFijo.add(this.jPanelid_detalle_grupo_activo_fijoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(iXPanelCamposSubGrupoActivoFijo % 1==0) {
		iXPanelCamposSubGrupoActivoFijo=0;
		iYPanelCamposSubGrupoActivoFijo++;
	}
	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = iYPanelCamposSubGrupoActivoFijo;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = iXPanelCamposSubGrupoActivoFijo++;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubGrupoActivoFijo.add(this.jPanelcodigoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(iXPanelCamposSubGrupoActivoFijo % 1==0) {
		iXPanelCamposSubGrupoActivoFijo=0;
		iYPanelCamposSubGrupoActivoFijo++;
	}
	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = iYPanelCamposSubGrupoActivoFijo;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = iXPanelCamposSubGrupoActivoFijo++;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubGrupoActivoFijo.add(this.jPanelnombreSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(iXPanelCamposSubGrupoActivoFijo % 1==0) {
		iXPanelCamposSubGrupoActivoFijo=0;
		iYPanelCamposSubGrupoActivoFijo++;
	}
	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = iYPanelCamposSubGrupoActivoFijo;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = iXPanelCamposSubGrupoActivoFijo++;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubGrupoActivoFijo.add(this.jPanelsiglasSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(iXPanelCamposSubGrupoActivoFijo % 1==0) {
		iXPanelCamposSubGrupoActivoFijo=0;
		iYPanelCamposSubGrupoActivoFijo++;
	}
	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = iYPanelCamposSubGrupoActivoFijo;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = iXPanelCamposSubGrupoActivoFijo++;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubGrupoActivoFijo.add(this.jPaneles_vehiculoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(iXPanelCamposSubGrupoActivoFijo % 1==0) {
		iXPanelCamposSubGrupoActivoFijo=0;
		iYPanelCamposSubGrupoActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubGrupoActivoFijo.gridy = iYPanelCamposOcultosSubGrupoActivoFijo;
	this.gridBagConstraintsSubGrupoActivoFijo.gridx = iXPanelCamposOcultosSubGrupoActivoFijo++;
	this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSubGrupoActivoFijo.add(this.jPanelid_empresaSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);



	if(iXPanelCamposOcultosSubGrupoActivoFijo % 1==0) {
		iXPanelCamposOcultosSubGrupoActivoFijo=0;
		iYPanelCamposOcultosSubGrupoActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesSubGrupoActivoFijo= new GridBagLayout();
		this.jPanelAccionesSubGrupoActivoFijo.setLayout(gridaBagLayoutAccionesSubGrupoActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSubGrupoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioSubGrupoActivoFijo.setLayout(gridaBagLayoutAccionesFormularioSubGrupoActivoFijo);
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSubGrupoActivoFijo.add(this.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSubGrupoActivoFijo.add(this.jCheckBoxPostAccionNuevoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSubGrupoActivoFijo.add(this.jCheckBoxPostAccionSinCerrarSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSubGrupoActivoFijo.add(this.jCheckBoxPostAccionSinMensajeSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesSubGrupoActivoFijo.add(this.jButtonModificarSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);							

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesSubGrupoActivoFijo.add(this.jButtonEliminarSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
			
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesSubGrupoActivoFijo.add(this.jButtonActualizarSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);


		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesSubGrupoActivoFijo.add(this.jButtonGuardarCambiosSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);	
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesSubGrupoActivoFijo.add(this.jButtonCancelarSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSubGrupoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSubGrupoActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsSubGrupoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx =0;
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSubGrupoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SubGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSubGrupoActivoFijo = new SubGrupoActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sub Grupo Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sub Grupo Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sub Grupo Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SubGrupoActivoFijoModel subgrupoactivofijoModel=new SubGrupoActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//SubGrupoActivoFijoModel.SubGrupoActivoFijoFocusTraversalPolicy subgrupoactivofijoFocusTraversalPolicy = subgrupoactivofijoModel.new SubGrupoActivoFijoFocusTraversalPolicy(this);
			
			//subgrupoactivofijoFocusTraversalPolicy.setsubgrupoactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(subgrupoactivofijoModel);
			
			
			this.jContentPaneDetalleSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSubGrupoActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleSubGrupoActivoFijo.setLayout(gridaBagLayoutDetalleSubGrupoActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSubGrupoActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleSubGrupoActivoFijo.add(jTtoolBarDetalleSubGrupoActivoFijo, gridBagConstraintsSubGrupoActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionSubGrupoActivoFijo=   new JScrollPane(jContentPaneDetalleSubGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSubGrupoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleSubGrupoActivoFijo.add(jPanelCamposSubGrupoActivoFijo, gridBagConstraintsSubGrupoActivoFijo);
			
			
			
			
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
						&& subgrupoactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(this.puedeCargarPorParteDetalleActivoFijo,false,-1);
					
					if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSubGrupoActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
						this.jContentPaneDetalleSubGrupoActivoFijo.add(this.jTabbedPaneRelacionesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSubGrupoActivoFijo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSubGrupoActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsSubGrupoActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleSubGrupoActivoFijo.add(jPanelCamposOcultosSubGrupoActivoFijo, gridBagConstraintsSubGrupoActivoFijo);
				
					this.jPanelCamposOcultosSubGrupoActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
	        this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSubGrupoActivoFijo.add(this.jPanelAccionesFormularioSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);							
			
			
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleSubGrupoActivoFijo.add(this.jPanelAccionesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSubGrupoActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSubGrupoActivoFijo=   new JScrollPane(this.jPanelCamposSubGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSubGrupoActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);			
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			
			
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
			
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSubGrupoActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionSubGrupoActivoFijo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		this.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
		this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {

				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=SubGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SubGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleactivofijoBeanSwingJInternalFrame.setdetalleactivofijoSessionBean(this.detalleactivofijoSessionBean);

				//this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
				//this.jContentPaneDetalleSubGrupoActivoFijo.add(this.detalleactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSubGrupoActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSubGrupoActivoFijo.add("Detalle Activo Fijos",this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSubGrupoActivoFijo.setComponentAt(iIndexTab,this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleActivoFijo) {
					this.jTabbedPaneRelacionesSubGrupoActivoFijo.add("Detalle Activo Fijos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleActivoFijoBeanSwingJInternalFrame(List<SubGrupoActivoFijo> subgrupoactivofijos,SubGrupoActivoFijo subgrupoactivofijo,DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.subgrupoactivofijoLogic.getConnexion());

					detalleactivofijoBeanSwingJInternalFrame.setsubgrupoactivofijosForeignKey(subgrupoactivofijos);
					detalleactivofijoBeanSwingJInternalFrame.setsubgrupoactivofijoForeignKey(subgrupoactivofijo);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionSubGrupoActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setlidSubGrupoActivoFijoActual(subgrupoactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaSubGrupoActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.setid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijo(subgrupoactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						detalleactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameSubGrupoActivoFijoForeignKey(subgrupoactivofijo,1,false,true,true);
					detalleactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdSubGrupoActivoFijo");
					detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSubGrupoActivoFijo");
					detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleActivoFijo("n",detalleactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("relacionado");
					} else {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");
					}

					detalleactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleActivoFijo().setVisible(false);

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
