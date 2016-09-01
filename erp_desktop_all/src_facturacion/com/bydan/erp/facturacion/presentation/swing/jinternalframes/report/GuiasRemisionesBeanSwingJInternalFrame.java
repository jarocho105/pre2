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




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

//import com.bydan.erp.facturacion.util.GuiasRemisionesConstantesFunciones;
import com.bydan.erp.facturacion.util.report.GuiasRemisionesParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.GuiasRemisionesParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.GuiasRemisionesBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

//import org.hibernate.collection.PersistentBag;

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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class GuiasRemisionesBeanSwingJInternalFrame extends GuiasRemisionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GuiasRemisionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GuiasRemisiones> guiasremisionesValidator = new ClassValidator<GuiasRemisiones>(GuiasRemisiones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GuiasRemisiones guiasremisiones;	
	public GuiasRemisiones guiasremisionesAux;
	public GuiasRemisiones guiasremisionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GuiasRemisiones guiasremisionesTotales;
	public Long idGuiasRemisionesActual;
	public Long iIdNuevoGuiasRemisiones=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoGuiasRemisiones;
	public Boolean isPermisoNuevoGuiasRemisiones;
	public Boolean isPermisoActualizarGuiasRemisiones;
	public Boolean isPermisoActualizarOriginalGuiasRemisiones;
	public Boolean isPermisoEliminarGuiasRemisiones;
	public Boolean isPermisoGuardarCambiosGuiasRemisiones;
	public Boolean isPermisoConsultaGuiasRemisiones;
	public Boolean isPermisoBusquedaGuiasRemisiones;
	public Boolean isPermisoReporteGuiasRemisiones;
	public Boolean isPermisoPaginacionMedioGuiasRemisiones;
	public Boolean isPermisoPaginacionAltoGuiasRemisiones;
	public Boolean isPermisoPaginacionTodoGuiasRemisiones;
	public Boolean isPermisoCopiarGuiasRemisiones;
	public Boolean isPermisoVerFormGuiasRemisiones;
	public Boolean isPermisoDuplicarGuiasRemisiones;
	public Boolean isPermisoOrdenGuiasRemisiones;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public GuiasRemisionesParameterReturnGeneral guiasremisionesReturnGeneral;
	public GuiasRemisionesParameterReturnGeneral guiasremisionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGuiasRemisiones=false;
	public Boolean esParaAccionDesdeFormularioGuiasRemisiones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected GuiasRemisionesSessionBeanAdditional guiasremisionesSessionBeanAdditional=null;
	
	public GuiasRemisionesSessionBeanAdditional getGuiasRemisionesSessionBeanAdditional() {
		return this.guiasremisionesSessionBeanAdditional;
	}
	
	public void setGuiasRemisionesSessionBeanAdditional(GuiasRemisionesSessionBeanAdditional guiasremisionesSessionBeanAdditional) {
		try {
			this.guiasremisionesSessionBeanAdditional=guiasremisionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected GuiasRemisionesBeanSwingJInternalFrameAdditional guiasremisionesBeanSwingJInternalFrameAdditional=null;
	//public class GuiasRemisionesBeanSwingJInternalFrame
	
	public GuiasRemisionesBeanSwingJInternalFrameAdditional getGuiasRemisionesBeanSwingJInternalFrameAdditional() {
		return this.guiasremisionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setGuiasRemisionesBeanSwingJInternalFrameAdditional(GuiasRemisionesBeanSwingJInternalFrameAdditional guiasremisionesBeanSwingJInternalFrameAdditional) {
		try {
			this.guiasremisionesBeanSwingJInternalFrameAdditional=guiasremisionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public GuiasRemisionesLogic guiasremisionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GuiasRemisiones guiasremisionesBean;
	public GuiasRemisionesConstantesFunciones guiasremisionesConstantesFunciones;
	//public GuiasRemisionesParameterReturnGeneral guiasremisionesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<GuiasRemisiones> guiasremisioness;	
	//public List<GuiasRemisiones> guiasremisionessEliminados;
	//public List<GuiasRemisiones> guiasremisionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGuiasRemisiones=false;
	public Boolean isVisibilidadCeldaDuplicarGuiasRemisiones=true;
	public Boolean isVisibilidadCeldaCopiarGuiasRemisiones=true;
	public Boolean isVisibilidadCeldaVerFormGuiasRemisiones=true;
	public Boolean isVisibilidadCeldaOrdenGuiasRemisiones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;
	public Boolean isVisibilidadCeldaModificarGuiasRemisiones=false;
	public Boolean isVisibilidadCeldaActualizarGuiasRemisiones=false;
	public Boolean isVisibilidadCeldaEliminarGuiasRemisiones=false;
	public Boolean isVisibilidadCeldaCancelarGuiasRemisiones=false;
	public Boolean isVisibilidadCeldaGuardarGuiasRemisiones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGuiasRemisiones=false;	
	
	
	public Boolean isVisibilidadBusquedaGuiasRemisiones=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoGuiasRemisiones() {
		return this.iIdNuevoGuiasRemisiones;
	}

	public void setiIdNuevoGuiasRemisiones(Long iIdNuevoGuiasRemisiones) {
		this.iIdNuevoGuiasRemisiones = iIdNuevoGuiasRemisiones;
	}
	
	public Long getidGuiasRemisionesActual() {
		return this.idGuiasRemisionesActual;
	}

	public void setidGuiasRemisionesActual(Long idGuiasRemisionesActual) {
		this.idGuiasRemisionesActual = idGuiasRemisionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GuiasRemisiones getguiasremisiones() {
		return this.guiasremisiones;
	}

	public void setguiasremisiones(GuiasRemisiones guiasremisiones) {
		this.guiasremisiones = guiasremisiones;
	}
	
	public GuiasRemisiones getguiasremisionesAux() {
		return this.guiasremisionesAux;
	}

	public void setguiasremisionesAux(GuiasRemisiones guiasremisionesAux) {
		this.guiasremisionesAux = guiasremisionesAux;
	}				
	
	public GuiasRemisiones getguiasremisionesAnterior() {
		return this.guiasremisionesAnterior;
	}

	public void setguiasremisionesAnterior(GuiasRemisiones guiasremisionesAnterior) {
		this.guiasremisionesAnterior = guiasremisionesAnterior;
	}	
	
	public GuiasRemisiones getguiasremisionesTotales() {
		return this.guiasremisionesTotales;
	}

	public void setguiasremisionesTotales(GuiasRemisiones guiasremisionesTotales) {
		this.guiasremisionesTotales = guiasremisionesTotales;
	}	
	
	public GuiasRemisiones getguiasremisionesBean() {
		return this.guiasremisionesBean;
	}

	public void setguiasremisionesBean(GuiasRemisiones guiasremisionesBean) {
		this.guiasremisionesBean = guiasremisionesBean;
	}	
	
	public GuiasRemisionesParameterReturnGeneral getguiasremisionesReturnGeneral() {
		return this.guiasremisionesReturnGeneral;
	}

	public void setguiasremisionesReturnGeneral(GuiasRemisionesParameterReturnGeneral guiasremisionesReturnGeneral) {
		this.guiasremisionesReturnGeneral = guiasremisionesReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaGuiasRemisiones=new Date();

	public Date getfecha_emision_desdeBusquedaGuiasRemisiones() {
		return this.fecha_emision_desdeBusquedaGuiasRemisiones;
	}

	public void setfecha_emision_desdeBusquedaGuiasRemisiones(Date fecha_emision_desdeBusquedaGuiasRemisiones) {
		this.fecha_emision_desdeBusquedaGuiasRemisiones = fecha_emision_desdeBusquedaGuiasRemisiones;
	}

;
	public Date fecha_emision_hastaBusquedaGuiasRemisiones=new Date();

	public Date getfecha_emision_hastaBusquedaGuiasRemisiones() {
		return this.fecha_emision_hastaBusquedaGuiasRemisiones;
	}

	public void setfecha_emision_hastaBusquedaGuiasRemisiones(Date fecha_emision_hastaBusquedaGuiasRemisiones) {
		this.fecha_emision_hastaBusquedaGuiasRemisiones = fecha_emision_hastaBusquedaGuiasRemisiones;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public GuiasRemisionesLogic getGuiasRemisionesLogic()	{		
		return guiasremisionesLogic;
	}

	public void setGuiasRemisionesLogic(GuiasRemisionesLogic guiasremisionesLogic) {
		this.guiasremisionesLogic = guiasremisionesLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoGuiasRemisiones() {
		return isEsNuevoGuiasRemisiones;
	}

	public void setIsEsNuevoGuiasRemisiones(Boolean isEsNuevoGuiasRemisiones) {
		this.isEsNuevoGuiasRemisiones = isEsNuevoGuiasRemisiones;
	}

	public Boolean getEsParaAccionDesdeFormularioGuiasRemisiones() {
		return esParaAccionDesdeFormularioGuiasRemisiones;
	}
	
	public void setEsParaAccionDesdeFormularioGuiasRemisiones(Boolean esParaAccionDesdeFormularioGuiasRemisiones) {
		this.esParaAccionDesdeFormularioGuiasRemisiones = esParaAccionDesdeFormularioGuiasRemisiones;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.guiasremisionesSessionBean==null) {
				this.guiasremisionesSessionBean=new GuiasRemisionesSessionBean();
			}

			if(!this.guiasremisionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(guiasremisionesSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.guiasremisiones!=null) {
						this.guiasremisiones.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
						this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaGuiasRemisiones.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
						if(this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.getItemCount()>0) {
							this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaGuiasRemisionesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaGuiasRemisionesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaGuiasRemisionesGenerico!=null && jComboBoxid_empresaGuiasRemisionesGenerico.getItemCount()>0) {
					jComboBoxid_empresaGuiasRemisionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(GuiasRemisiones guiasremisiones,JComboBox jComboBoxid_empresaGuiasRemisionesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaGuiasRemisionesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaGuiasRemisionesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				guiasremisiones.setid_empresa(empresaAux.getId());
				guiasremisiones.setempresa_descripcion(GuiasRemisionesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				guiasremisiones.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { 
							this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { 
					}

					if(!GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
							this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
							this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesGuiasRemisiones() throws Exception {
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public GuiasRemisionesParameterReturnGeneral getGuiasRemisionesParameterGeneral() {
		return this.guiasremisionesParameterGeneral;
	}
	
	public void setGuiasRemisionesParameterGeneral(GuiasRemisionesParameterReturnGeneral guiasremisionesParameterGeneral) {
		this.guiasremisionesParameterGeneral = guiasremisionesParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoGuiasRemisiones() {
		return isPermisoTodoGuiasRemisiones;
	}

	public void setIsPermisoTodoGuiasRemisiones(Boolean isPermisoTodoGuiasRemisiones) {
		this.isPermisoTodoGuiasRemisiones = isPermisoTodoGuiasRemisiones;
	}

	public Boolean getIsPermisoNuevoGuiasRemisiones() {
		return isPermisoNuevoGuiasRemisiones;
	}

	public void setIsPermisoNuevoGuiasRemisiones(Boolean isPermisoNuevoGuiasRemisiones) {
		this.isPermisoNuevoGuiasRemisiones = isPermisoNuevoGuiasRemisiones;
	}

	public Boolean getIsPermisoActualizarGuiasRemisiones() {
		return isPermisoActualizarGuiasRemisiones;
	}

	public void setIsPermisoActualizarGuiasRemisiones(Boolean isPermisoActualizarGuiasRemisiones) {
		this.isPermisoActualizarGuiasRemisiones = isPermisoActualizarGuiasRemisiones;
	}

	public Boolean getIsPermisoEliminarGuiasRemisiones() {
		return isPermisoEliminarGuiasRemisiones;
	}

	public void setIsPermisoEliminarGuiasRemisiones(Boolean isPermisoEliminarGuiasRemisiones) {
		this.isPermisoEliminarGuiasRemisiones = isPermisoEliminarGuiasRemisiones;
	}

	public Boolean getIsPermisoGuardarCambiosGuiasRemisiones() {
		return isPermisoGuardarCambiosGuiasRemisiones;
	}

	public void setIsPermisoGuardarCambiosGuiasRemisiones(Boolean isPermisoGuardarCambiosGuiasRemisiones) {
		this.isPermisoGuardarCambiosGuiasRemisiones = isPermisoGuardarCambiosGuiasRemisiones;
	}
	
	public Boolean getIsPermisoConsultaGuiasRemisiones() {
		return isPermisoConsultaGuiasRemisiones;
	}

	public void setIsPermisoConsultaGuiasRemisiones(Boolean isPermisoConsultaGuiasRemisiones) {
		this.isPermisoConsultaGuiasRemisiones = isPermisoConsultaGuiasRemisiones;
	}

	public Boolean getIsPermisoBusquedaGuiasRemisiones() {
		return isPermisoBusquedaGuiasRemisiones;
	}

	public void setIsPermisoBusquedaGuiasRemisiones(Boolean isPermisoBusquedaGuiasRemisiones) {
		this.isPermisoBusquedaGuiasRemisiones = isPermisoBusquedaGuiasRemisiones;
	}

	public Boolean getIsPermisoReporteGuiasRemisiones() {
		return isPermisoReporteGuiasRemisiones;
	}

	public void setIsPermisoReporteGuiasRemisiones(Boolean isPermisoReporteGuiasRemisiones) {
		this.isPermisoReporteGuiasRemisiones = isPermisoReporteGuiasRemisiones;
	}
	
	public Boolean getIsPermisoPaginacionMedioGuiasRemisiones() {
		return isPermisoPaginacionMedioGuiasRemisiones;
	}

	public void setIsPermisoPaginacionMedioGuiasRemisiones(Boolean isPermisoPaginacionMedioGuiasRemisiones) {
		this.isPermisoPaginacionMedioGuiasRemisiones = isPermisoPaginacionMedioGuiasRemisiones;
	}
	
	public Boolean getIsPermisoPaginacionTodoGuiasRemisiones() {
		return isPermisoPaginacionTodoGuiasRemisiones;
	}

	public void setIsPermisoPaginacionTodoGuiasRemisiones(Boolean isPermisoPaginacionTodoGuiasRemisiones) {
		this.isPermisoPaginacionTodoGuiasRemisiones = isPermisoPaginacionTodoGuiasRemisiones;
	}
	
	public Boolean getIsPermisoPaginacionAltoGuiasRemisiones() {
		return isPermisoPaginacionAltoGuiasRemisiones;
	}

	public void setIsPermisoPaginacionAltoGuiasRemisiones(Boolean isPermisoPaginacionAltoGuiasRemisiones) {
		this.isPermisoPaginacionAltoGuiasRemisiones = isPermisoPaginacionAltoGuiasRemisiones;
	}
	
	public Boolean getIsPermisoCopiarGuiasRemisiones() {
		return isPermisoCopiarGuiasRemisiones;
	}

	public void setIsPermisoCopiarGuiasRemisiones(Boolean isPermisoCopiarGuiasRemisiones) {
		this.isPermisoCopiarGuiasRemisiones = isPermisoCopiarGuiasRemisiones;
	}
	
	public Boolean getIsPermisoVerFormGuiasRemisiones() {
		return isPermisoVerFormGuiasRemisiones;
	}

	public void setIsPermisoVerFormGuiasRemisiones(Boolean isPermisoVerFormGuiasRemisiones) {
		this.isPermisoVerFormGuiasRemisiones = isPermisoVerFormGuiasRemisiones;
	}
	
	public Boolean getIsPermisoDuplicarGuiasRemisiones() {
		return isPermisoDuplicarGuiasRemisiones;
	}

	public void setIsPermisoDuplicarGuiasRemisiones(Boolean isPermisoDuplicarGuiasRemisiones) {
		this.isPermisoDuplicarGuiasRemisiones = isPermisoDuplicarGuiasRemisiones;
	}
	
	public Boolean getIsPermisoOrdenGuiasRemisiones() {
		return isPermisoOrdenGuiasRemisiones;
	}

	public void setIsPermisoOrdenGuiasRemisiones(Boolean isPermisoOrdenGuiasRemisiones) {
		this.isPermisoOrdenGuiasRemisiones = isPermisoOrdenGuiasRemisiones;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoGuiasRemisiones() {
		return isVisibilidadCeldaNuevoGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaNuevoGuiasRemisiones(Boolean isVisibilidadCeldaNuevoGuiasRemisiones) {
		this.isVisibilidadCeldaNuevoGuiasRemisiones = isVisibilidadCeldaNuevoGuiasRemisiones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGuiasRemisiones() {
		return isVisibilidadCeldaDuplicarGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaDuplicarGuiasRemisiones(Boolean isVisibilidadCeldaDuplicarGuiasRemisiones) {
		this.isVisibilidadCeldaDuplicarGuiasRemisiones = isVisibilidadCeldaDuplicarGuiasRemisiones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGuiasRemisiones() {
		return isVisibilidadCeldaCopiarGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaCopiarGuiasRemisiones(Boolean isVisibilidadCeldaCopiarGuiasRemisiones) {
		this.isVisibilidadCeldaCopiarGuiasRemisiones = isVisibilidadCeldaCopiarGuiasRemisiones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGuiasRemisiones() {
		return isVisibilidadCeldaVerFormGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaVerFormGuiasRemisiones(Boolean isVisibilidadCeldaVerFormGuiasRemisiones) {
		this.isVisibilidadCeldaVerFormGuiasRemisiones = isVisibilidadCeldaVerFormGuiasRemisiones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGuiasRemisiones() {
		return isVisibilidadCeldaOrdenGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaOrdenGuiasRemisiones(Boolean isVisibilidadCeldaOrdenGuiasRemisiones) {
		this.isVisibilidadCeldaOrdenGuiasRemisiones = isVisibilidadCeldaOrdenGuiasRemisiones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGuiasRemisiones() {
		return isVisibilidadCeldaNuevoRelacionesGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGuiasRemisiones(Boolean isVisibilidadCeldaNuevoRelacionesGuiasRemisiones) {
		this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones = isVisibilidadCeldaNuevoRelacionesGuiasRemisiones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGuiasRemisiones() {
		return isVisibilidadCeldaModificarGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaModificarGuiasRemisiones(Boolean isVisibilidadCeldaModificarGuiasRemisiones) {
		this.isVisibilidadCeldaModificarGuiasRemisiones = isVisibilidadCeldaModificarGuiasRemisiones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGuiasRemisiones() {
		return isVisibilidadCeldaActualizarGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaActualizarGuiasRemisiones(Boolean isVisibilidadCeldaActualizarGuiasRemisiones) {
		this.isVisibilidadCeldaActualizarGuiasRemisiones = isVisibilidadCeldaActualizarGuiasRemisiones;
	}

	public Boolean getIsVisibilidadCeldaEliminarGuiasRemisiones() {
		return isVisibilidadCeldaEliminarGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaEliminarGuiasRemisiones(Boolean isVisibilidadCeldaEliminarGuiasRemisiones) {
		this.isVisibilidadCeldaEliminarGuiasRemisiones = isVisibilidadCeldaEliminarGuiasRemisiones;
	}

	public Boolean getIsVisibilidadCeldaCancelarGuiasRemisiones() {
		return isVisibilidadCeldaCancelarGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaCancelarGuiasRemisiones(Boolean isVisibilidadCeldaCancelarGuiasRemisiones) {
		this.isVisibilidadCeldaCancelarGuiasRemisiones = isVisibilidadCeldaCancelarGuiasRemisiones;
	}

	public Boolean getIsVisibilidadCeldaGuardarGuiasRemisiones() {
		return isVisibilidadCeldaGuardarGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaGuardarGuiasRemisiones(Boolean isVisibilidadCeldaGuardarGuiasRemisiones) {
		this.isVisibilidadCeldaGuardarGuiasRemisiones = isVisibilidadCeldaGuardarGuiasRemisiones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGuiasRemisiones() {
		return isVisibilidadCeldaGuardarCambiosGuiasRemisiones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGuiasRemisiones(Boolean isVisibilidadCeldaGuardarCambiosGuiasRemisiones) {
		this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones = isVisibilidadCeldaGuardarCambiosGuiasRemisiones;
	}
		
	public GuiasRemisionesSessionBean getguiasremisionesSessionBean() {
		return this.guiasremisionesSessionBean;
	}
	
	public void setguiasremisionesSessionBean(GuiasRemisionesSessionBean guiasremisionesSessionBean) {
		this.guiasremisionesSessionBean=guiasremisionesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaGuiasRemisiones() {
		return this.isVisibilidadBusquedaGuiasRemisiones;
	}

	public void setisVisibilidadBusquedaGuiasRemisiones(Boolean isVisibilidadBusquedaGuiasRemisiones) {
		this.isVisibilidadBusquedaGuiasRemisiones=isVisibilidadBusquedaGuiasRemisiones;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(GuiasRemisiones guiasremisiones)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(guiasremisiones,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(GuiasRemisiones guiasremisiones,GuiasRemisiones guiasremisionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGuiasRemisiones(guiasremisiones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		guiasremisionesAux.setId(guiasremisiones.getId());
		guiasremisionesAux.setVersionRow(guiasremisiones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(GuiasRemisiones guiasremisionesLocal) throws Exception {
		
		if(this.guiasremisionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GuiasRemisiones guiasremisionesLocal) throws Exception {	
		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				guiasremisionesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGuiasRemisionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = guiasremisionesValidator.getInvalidValues(this.guiasremisiones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GuiasRemisiones guiasremisiones,List<GuiasRemisiones> guiasremisioness) throws Exception {
	}		
	
	public void actualizarSelectedLista(GuiasRemisiones guiasremisiones,List<GuiasRemisiones> guiasremisioness) throws Exception {
		try	{			
			GuiasRemisionesConstantesFunciones.actualizarSelectedLista(guiasremisiones,guiasremisioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GuiasRemisiones> guiasremisionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				guiasremisionessLocal=this.guiasremisionesLogic.getGuiasRemisioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				guiasremisionessLocal=this.guiasremisioness;
			}
			//ARCHITECTURE
		
			for(GuiasRemisiones guiasremisionesLocal:guiasremisionessLocal) {
				if(this.permiteMantenimiento(guiasremisionesLocal) && guiasremisionesLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+GuiasRemisionesConstantesFunciones.getGuiasRemisionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GuiasRemisionesConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelnombre_completo_clienteGuiasRemisiones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuiasRemisionesConstantesFunciones.NUMEROPREIMPRESOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelnumero_pre_impreso_facturaGuiasRemisiones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuiasRemisionesConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelsecuencialGuiasRemisiones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuiasRemisionesConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelfecha_emisionGuiasRemisiones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuiasRemisionesConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelfecha_vencimientoGuiasRemisiones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuiasRemisionesConstantesFunciones.NOMBRETIPOTRANSPORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelnombre_tipo_transporteGuiasRemisiones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuiasRemisionesConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelivaGuiasRemisiones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuiasRemisionesConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabeldescuentoGuiasRemisiones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuiasRemisionesConstantesFunciones.OTRO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelotroGuiasRemisiones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuiasRemisionesConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabeltotalGuiasRemisiones,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelnombre_completo_clienteGuiasRemisiones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelnumero_pre_impreso_facturaGuiasRemisiones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelsecuencialGuiasRemisiones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelfecha_emisionGuiasRemisiones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelfecha_vencimientoGuiasRemisiones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelnombre_tipo_transporteGuiasRemisiones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelivaGuiasRemisiones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuiasRemisiones.jLabeldescuentoGuiasRemisiones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelotroGuiasRemisiones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuiasRemisiones.jLabeltotalGuiasRemisiones,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoGuiasRemisiones--;	
		
		
		this.guiasremisionesAux=new GuiasRemisiones();
		
		this.guiasremisionesAux.setId(this.iIdNuevoGuiasRemisiones);
		this.guiasremisionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.guiasremisionesLogic.getGuiasRemisioness().add(this.guiasremisionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.guiasremisioness.add(this.guiasremisionesAux);
		}
		//ARCHITECTURE
		
		this.guiasremisiones=this.guiasremisionesAux;
		
		if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGuiasRemisiones(this.guiasremisiones);
			this.setVariablesObjetoActualToFormularioForeignKeyGuiasRemisiones(this.guiasremisiones);
		}
				
		//this.setDefaultControlesGuiasRemisiones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGuiasRemisiones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGuiasRemisiones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGuiasRemisiones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGuiasRemisiones(this.guiasremisionesBean,this.guiasremisiones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGuiasRemisiones(this.guiasremisionesReturnGeneral,this.guiasremisionesBean,false);
		
		if(this.guiasremisionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGuiasRemisiones(this.guiasremisionesReturnGeneral.getGuiasRemisiones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGuiasRemisiones(this.guiasremisionesReturnGeneral.getGuiasRemisiones());
		}
		
		if(this.guiasremisionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGuiasRemisiones(this.guiasremisionesReturnGeneral.getGuiasRemisiones(),classes);//this.guiasremisionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGuiasRemisiones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGuiasRemisiones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.RecargarFormGuiasRemisiones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGuiasRemisiones(false);
						
			if(guiasremisionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGuiasRemisiones();
			}
			
			this.actualizarVisualTableDatosGuiasRemisiones();
			
			this.jTableDatosGuiasRemisiones.setRowSelectionInterval(this.getIndiceNuevoGuiasRemisiones(), this.getIndiceNuevoGuiasRemisiones());
			
			this.seleccionarFilaTablaGuiasRemisionesActual();
						
			this.actualizarEstadoCeldasBotonesGuiasRemisiones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGuiasRemisiones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emision_desdeGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarfecha_emision_desdeGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emision_hastaGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarfecha_emision_hastaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_completo_clienteGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarnombre_completo_clienteGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarnumero_pre_impreso_facturaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldsecuencialGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarsecuencialGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emisionGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarfecha_emisionGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_vencimientoGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarfecha_vencimientoGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_tipo_transporteGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarnombre_tipo_transporteGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldivaGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarivaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFielddescuentoGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activardescuentoGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldotroGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarotroGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldtotalGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activartotalGuiasRemisiones);	
		//
		this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.setEnabled(isHabilitar && this.guiasremisionesConstantesFunciones.activarid_empresaGuiasRemisiones);
	};
	
	public void setDefaultControlesGuiasRemisiones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGuiasRemisiones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.guiasremisionesSessionBean.setConGuardarRelaciones(true);			
			this.guiasremisionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGuiasRemisiones.jTabbedPaneRelacionesGuiasRemisiones.setVisible(true);
			
					
		} else {
			//this.guiasremisionesSessionBean.setConGuardarRelaciones(false);			
			this.guiasremisionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGuiasRemisiones.jTabbedPaneRelacionesGuiasRemisiones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoGuiasRemisiones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GuiasRemisiones guiasremisionesAux:this.guiasremisionesLogic.getGuiasRemisioness()) {
				if(guiasremisionesAux.getId().equals(this.iIdNuevoGuiasRemisiones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GuiasRemisiones guiasremisionesAux:this.guiasremisioness) {
				if(guiasremisionesAux.getId().equals(this.iIdNuevoGuiasRemisiones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualGuiasRemisiones(GuiasRemisiones guiasremisiones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GuiasRemisiones guiasremisionesAux:this.guiasremisionesLogic.getGuiasRemisioness()) {
				if(guiasremisionesAux.getId().equals(guiasremisiones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GuiasRemisiones guiasremisionesAux:this.guiasremisioness) {
				if(guiasremisionesAux.getId().equals(guiasremisiones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalGuiasRemisiones(GuiasRemisiones guiasremisionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GuiasRemisiones guiasremisionesAux:this.guiasremisionesLogic.getGuiasRemisioness()) {
				if(guiasremisionesAux.getGuiasRemisionesOriginal().getId().equals(guiasremisionesOriginal.getId())) {
					existe=true;
					guiasremisionesOriginal.setId(guiasremisionesAux.getId());
					guiasremisionesOriginal.setVersionRow(guiasremisionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GuiasRemisiones guiasremisionesAux:this.guiasremisioness) {
				if(guiasremisionesAux.getGuiasRemisionesOriginal().getId().equals(guiasremisionesOriginal.getId())) {
					existe=true;
					guiasremisionesOriginal.setId(guiasremisionesAux.getId());
					guiasremisionesOriginal.setVersionRow(guiasremisionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGuiasRemisiones(Boolean esParaCancelar) throws Exception {
		guiasremisionessAux=new ArrayList<GuiasRemisiones>();
		guiasremisionesAux=new GuiasRemisiones();
		
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GuiasRemisiones guiasremisionesAux:this.guiasremisionesLogic.getGuiasRemisioness()) {
					if(guiasremisionesAux.getId()<0) {
						guiasremisionessAux.add(guiasremisionesAux);
					}		
				}
				this.iIdNuevoGuiasRemisiones=0L;
				this.guiasremisionesLogic.getGuiasRemisioness().removeAll(guiasremisionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GuiasRemisiones guiasremisionesAux:this.guiasremisioness) {
					if(guiasremisionesAux.getId()<0) {
						guiasremisionessAux.add(guiasremisionesAux);
					}		
				}
				this.iIdNuevoGuiasRemisiones=0L;
				this.guiasremisioness.removeAll(guiasremisionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGuiasRemisiones 
					&& this.guiasremisionesLogic.getGuiasRemisioness().size()>0
					) {
					guiasremisionesAux=this.guiasremisionesLogic.getGuiasRemisioness().get(this.guiasremisionesLogic.getGuiasRemisioness().size() - 1);
				
					if(guiasremisionesAux.getId()<0) {
						this.guiasremisionesLogic.getGuiasRemisioness().remove(guiasremisionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGuiasRemisiones && this.guiasremisioness.size()>0) {
					guiasremisionesAux=this.guiasremisioness.get(this.guiasremisioness.size() - 1);
				
					if(guiasremisionesAux.getId()<0) {
						this.guiasremisioness.remove(guiasremisionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGuiasRemisiones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(guiasremisiones.getId()<0) {
				this.guiasremisionesLogic.getGuiasRemisioness().remove(this.guiasremisiones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(guiasremisiones.getId()<0) {
				this.guiasremisioness.remove(this.guiasremisiones);
			}
		}			
	}
	
	public void setEstadosInicialesGuiasRemisiones(List<GuiasRemisiones> guiasremisionessAux) throws Exception {
		GuiasRemisionesConstantesFunciones.setEstadosInicialesGuiasRemisiones(guiasremisionessAux);
	}
	
	public void setEstadosInicialesGuiasRemisiones(GuiasRemisiones guiasremisionesAux) throws Exception {
		GuiasRemisionesConstantesFunciones.setEstadosInicialesGuiasRemisiones(guiasremisionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGuiasRemisionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGuiasRemisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGuiasRemisionesActual()) {
				if(!this.isEsNuevoGuiasRemisiones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGuiasRemisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGuiasRemisiones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGuiasRemisionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Guias Remisiones ?", "MANTENIMIENTO DE Guias Remisiones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGuiasRemisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GuiasRemisiones guiasremisiones) throws Exception {
		GuiasRemisionesConstantesFunciones.seleccionarAsignar(this.guiasremisiones,guiasremisiones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGuiasRemisiones=this.isPermisoActualizarOriginalGuiasRemisiones;
			
			
			this.seleccionarAsignar(guiasremisiones);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesGuiasRemisiones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.guiasremisionesSessionBean.setsFuncionBusquedaRapida(this.guiasremisionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoGuiasRemisiones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGuiasRemisiones(esParaCancelar);				
				this.cancelarNuevoGuiasRemisiones(esParaCancelar);								
			}
			
			this.guiasremisiones=new GuiasRemisiones();
			
			this.inicializarGuiasRemisiones();
			
			this.actualizarEstadoCeldasBotonesGuiasRemisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGuiasRemisiones() throws Exception {
		try {
			GuiasRemisionesConstantesFunciones.inicializarGuiasRemisiones(this.guiasremisiones);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.guiasremisionesLogic.getGuiasRemisioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGuiasRemisioness(String sAccionBusqueda,List<GuiasRemisiones> guiasremisionessParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="GuiasRemisiones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GuiasRemisionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GuiasRemisionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GuiasRemisiones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Guias Remisioneses");		
		parameters.put("busquedapor", GuiasRemisionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGuiasRemisiones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GuiasRemisionesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GuiasRemisionesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGuiasRemisiones=new JRBeanArrayDataSource(GuiasRemisionesJInternalFrame.TraerGuiasRemisionesBeans(guiasremisionessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGuiasRemisiones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GuiasRemisionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GuiasRemisionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GuiasRemisionesBean.TraerGuiasRemisionesBeans(guiasremisionessParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteGuiasRemisioness(sAccionBusqueda,sTipoArchivoReporte,guiasremisionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGuiasRemisioness(sAccionBusqueda,sTipoArchivoReporte,guiasremisionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGuiasRemisionesActionPerformed(null);
					//this.generarExcelReporteGuiasRemisioness(sAccionBusqueda,sTipoArchivoReporte,guiasremisionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGuiasRemisioness(sAccionBusqueda,sTipoArchivoReporte,guiasremisionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGuiasRemisioness(sAccionBusqueda,sTipoArchivoReporte,guiasremisionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGuiasRemisioness(sAccionBusqueda,sTipoArchivoReporte,guiasremisionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGuiasRemisioness(String sAccionBusqueda,String sTipoArchivoReporte,List<GuiasRemisiones> guiasremisionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guiasremisiones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GuiasRemisioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGuiasRemisiones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GuiasRemisiones guiasremisiones : guiasremisionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GuiasRemisionesConstantesFunciones.generarExcelReporteDataGuiasRemisiones("NORMAL",row,workbook,guiasremisiones,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guias Remisiones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGuiasRemisiones(String sTipo,Row row,Workbook workbook) {
		
		GuiasRemisionesConstantesFunciones.generarExcelReporteHeaderGuiasRemisiones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGuiasRemisioness(String sAccionBusqueda,String sTipoArchivoReporte,List<GuiasRemisiones> guiasremisionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guiasremisiones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GuiasRemisioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GuiasRemisiones guiasremisiones : guiasremisionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GuiasRemisionesConstantesFunciones.getGuiasRemisionesDescripcion(guiasremisiones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getnumero_pre_impreso_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getnombre_tipo_transporte());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_OTRO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_OTRO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.getotro());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuiasRemisionesConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guiasremisiones.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guias Remisiones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGuiasRemisioness(String sAccionBusqueda,String sTipoArchivoReporte,List<GuiasRemisiones> guiasremisionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GuiasRemisiones> guiasremisionessRespaldo=null;
		
		classes=GuiasRemisionesConstantesFunciones.getClassesRelationshipsOfGuiasRemisiones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.guiasremisionesLogic.setDatosCliente(this.datosCliente);
		this.guiasremisionesLogic.setDatosDeep(this.datosDeep);
		this.guiasremisionesLogic.setIsConDeep(true);
		
		guiasremisionessRespaldo=this.guiasremisionesLogic.getGuiasRemisioness();
		
		this.guiasremisionesLogic.setGuiasRemisioness(guiasremisionessParaReportes);	
		this.guiasremisionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		guiasremisionessParaReportes=this.guiasremisionesLogic.getGuiasRemisioness();
		this.guiasremisionesLogic.setGuiasRemisioness(guiasremisionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guiasremisiones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GuiasRemisioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGuiasRemisiones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GuiasRemisiones guiasremisiones : guiasremisionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGuiasRemisiones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GuiasRemisionesConstantesFunciones.generarExcelReporteDataGuiasRemisiones("NORMAL",row,workbook,guiasremisiones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(GuiasRemisionesConstantesFunciones.getGuiasRemisionesDescripcion(guiasremisiones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guias Remisiones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGuiasRemisiones() throws Exception {		
		this.startProcessGuiasRemisiones(true);
	}
	
	public void startProcessGuiasRemisiones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGuiasRemisiones ,this.jPanelParametrosReportesGuiasRemisiones, this.jScrollPanelDatosGuiasRemisiones,this.jPanelPaginacionGuiasRemisiones, this.jScrollPanelDatosEdicionGuiasRemisiones, this.jPanelAccionesGuiasRemisiones,this.jPanelAccionesFormularioGuiasRemisiones,this.jmenuBarGuiasRemisiones,this.jmenuBarDetalleGuiasRemisiones,this.jTtoolBarGuiasRemisiones,this.jTtoolBarDetalleGuiasRemisiones);		
		
		final JTabbedPane jTabbedPaneBusquedasGuiasRemisiones=this.jTabbedPaneBusquedasGuiasRemisiones; 
		
		final JPanel jPanelParametrosReportesGuiasRemisiones=this.jPanelParametrosReportesGuiasRemisiones;
		//final JScrollPane jScrollPanelDatosGuiasRemisiones=this.jScrollPanelDatosGuiasRemisiones;
		final JTable jTableDatosGuiasRemisiones=this.jTableDatosGuiasRemisiones;		
		final JPanel jPanelPaginacionGuiasRemisiones=this.jPanelPaginacionGuiasRemisiones;
		//final JScrollPane jScrollPanelDatosEdicionGuiasRemisiones=this.jScrollPanelDatosEdicionGuiasRemisiones;
		final JPanel jPanelAccionesGuiasRemisiones=this.jPanelAccionesGuiasRemisiones;
		
		JPanel jPanelCamposAuxiliarGuiasRemisiones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGuiasRemisiones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			jPanelCamposAuxiliarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jPanelCamposGuiasRemisiones;
			jPanelAccionesFormularioAuxiliarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jPanelAccionesFormularioGuiasRemisiones;
		}
		
		final JPanel jPanelCamposGuiasRemisiones=jPanelCamposAuxiliarGuiasRemisiones;
		final JPanel jPanelAccionesFormularioGuiasRemisiones=jPanelAccionesFormularioAuxiliarGuiasRemisiones;
		
		
		final JMenuBar jmenuBarGuiasRemisiones=this.jmenuBarGuiasRemisiones;
		final JToolBar jTtoolBarGuiasRemisiones=this.jTtoolBarGuiasRemisiones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGuiasRemisiones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGuiasRemisiones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			jmenuBarDetalleAuxiliarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jmenuBarDetalleGuiasRemisiones;
			jTtoolBarDetalleAuxiliarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jTtoolBarDetalleGuiasRemisiones;
		}
		
		final JMenuBar jmenuBarDetalleGuiasRemisiones=jmenuBarDetalleAuxiliarGuiasRemisiones;
		final JToolBar jTtoolBarDetalleGuiasRemisiones=jTtoolBarDetalleAuxiliarGuiasRemisiones;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGuiasRemisiones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGuiasRemisiones;
			processRunnable.jTableDatos=jTableDatosGuiasRemisiones;
			processRunnable.jPanelCampos=jPanelCamposGuiasRemisiones;
			processRunnable.jPanelPaginacion=jPanelPaginacionGuiasRemisiones;
			processRunnable.jPanelAcciones=jPanelAccionesGuiasRemisiones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGuiasRemisiones;
			
			
			processRunnable.jmenuBar=jmenuBarGuiasRemisiones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGuiasRemisiones;
			processRunnable.jTtoolBar=jTtoolBarGuiasRemisiones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGuiasRemisiones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGuiasRemisiones ,jPanelParametrosReportesGuiasRemisiones,jTableDatosGuiasRemisiones, /*jScrollPanelDatosGuiasRemisiones,*/jPanelCamposGuiasRemisiones,jPanelPaginacionGuiasRemisiones, /*jScrollPanelDatosEdicionGuiasRemisiones,*/ jPanelAccionesGuiasRemisiones,jPanelAccionesFormularioGuiasRemisiones,jmenuBarGuiasRemisiones,jmenuBarDetalleGuiasRemisiones,jTtoolBarGuiasRemisiones,jTtoolBarDetalleGuiasRemisiones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGuiasRemisiones ,jPanelParametrosReportesGuiasRemisiones, jScrollPanelDatosGuiasRemisiones,jPanelPaginacionGuiasRemisiones, jScrollPanelDatosEdicionGuiasRemisiones, jPanelAccionesGuiasRemisiones,jPanelAccionesFormularioGuiasRemisiones,jmenuBarGuiasRemisiones,jmenuBarDetalleGuiasRemisiones,jTtoolBarGuiasRemisiones,jTtoolBarDetalleGuiasRemisiones);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessGuiasRemisiones() {// throws Exception 
		this.finishProcessGuiasRemisiones(true);
	}
	
	public void finishProcessGuiasRemisiones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGuiasRemisiones ,this.jPanelParametrosReportesGuiasRemisiones, this.jScrollPanelDatosGuiasRemisiones,this.jPanelPaginacionGuiasRemisiones, this.jScrollPanelDatosEdicionGuiasRemisiones, this.jPanelAccionesGuiasRemisiones,this.jPanelAccionesFormularioGuiasRemisiones,this.jmenuBarGuiasRemisiones,this.jmenuBarDetalleGuiasRemisiones,this.jTtoolBarGuiasRemisiones,this.jTtoolBarDetalleGuiasRemisiones);		
		
		final JTabbedPane jTabbedPaneBusquedasGuiasRemisiones=this.jTabbedPaneBusquedasGuiasRemisiones; 
		
		final JPanel jPanelParametrosReportesGuiasRemisiones=this.jPanelParametrosReportesGuiasRemisiones;
		//final JScrollPane jScrollPanelDatosGuiasRemisiones=this.jScrollPanelDatosGuiasRemisiones;
		final JTable jTableDatosGuiasRemisiones=this.jTableDatosGuiasRemisiones;		
		final JPanel jPanelPaginacionGuiasRemisiones=this.jPanelPaginacionGuiasRemisiones;
		//final JScrollPane jScrollPanelDatosEdicionGuiasRemisiones=this.jScrollPanelDatosEdicionGuiasRemisiones;
		final JPanel jPanelAccionesGuiasRemisiones=this.jPanelAccionesGuiasRemisiones;
		
		JPanel jPanelCamposAuxiliarGuiasRemisiones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGuiasRemisiones=new JPanel();
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			jPanelCamposAuxiliarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jPanelCamposGuiasRemisiones;
			jPanelAccionesFormularioAuxiliarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jPanelAccionesFormularioGuiasRemisiones;
		}
		
		final JPanel jPanelCamposGuiasRemisiones=jPanelCamposAuxiliarGuiasRemisiones;
		final JPanel jPanelAccionesFormularioGuiasRemisiones=jPanelAccionesFormularioAuxiliarGuiasRemisiones;
		
		
		final JMenuBar jmenuBarGuiasRemisiones=this.jmenuBarGuiasRemisiones;		
		final JToolBar jTtoolBarGuiasRemisiones=this.jTtoolBarGuiasRemisiones;
				
		JMenuBar jmenuBarDetalleAuxiliarGuiasRemisiones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGuiasRemisiones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			jmenuBarDetalleAuxiliarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jmenuBarDetalleGuiasRemisiones;
			jTtoolBarDetalleAuxiliarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jTtoolBarDetalleGuiasRemisiones;		
		}
		
		final JMenuBar jmenuBarDetalleGuiasRemisiones=jmenuBarDetalleAuxiliarGuiasRemisiones;
		final JToolBar jTtoolBarDetalleGuiasRemisiones=jTtoolBarDetalleAuxiliarGuiasRemisiones;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGuiasRemisiones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGuiasRemisiones;
			processRunnable.jTableDatos=jTableDatosGuiasRemisiones;
			processRunnable.jPanelCampos=jPanelCamposGuiasRemisiones;
			processRunnable.jPanelPaginacion=jPanelPaginacionGuiasRemisiones;
			processRunnable.jPanelAcciones=jPanelAccionesGuiasRemisiones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGuiasRemisiones;
			
			
			processRunnable.jmenuBar=jmenuBarGuiasRemisiones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGuiasRemisiones;
			processRunnable.jTtoolBar=jTtoolBarGuiasRemisiones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGuiasRemisiones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGuiasRemisiones ,jPanelParametrosReportesGuiasRemisiones, jTableDatosGuiasRemisiones,/*jScrollPanelDatosGuiasRemisiones,*/jPanelCamposGuiasRemisiones,jPanelPaginacionGuiasRemisiones, /*jScrollPanelDatosEdicionGuiasRemisiones,*/ jPanelAccionesGuiasRemisiones,jPanelAccionesFormularioGuiasRemisiones,jmenuBarGuiasRemisiones,jmenuBarDetalleGuiasRemisiones,jTtoolBarGuiasRemisiones,jTtoolBarDetalleGuiasRemisiones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGuiasRemisiones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGuiasRemisiones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGuiasRemisiones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGuiasRemisiones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGuiasRemisiones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGuiasRemisiones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGuiasRemisiones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGuiasRemisiones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGuiasRemisiones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.guiasremisionesConstantesFunciones.getsFinalQueryGuiasRemisiones();
		String  finalQueryPaginacionTodos=this.guiasremisionesConstantesFunciones.getsFinalQueryGuiasRemisiones();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=GuiasRemisionesConstantesFunciones.getArrayColumnasGlobalesNoGuiasRemisiones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GuiasRemisionesConstantesFunciones.getArrayColumnasGlobalesGuiasRemisiones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GuiasRemisionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.guiasremisionessEliminados= new ArrayList<GuiasRemisiones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGuiasRemisiones();
		
				///*GuiasRemisionesSessionBean*/this.guiasremisionesSessionBean=new GuiasRemisionesSessionBean();
			
			if(this.guiasremisionesSessionBean==null) {
				this.guiasremisionesSessionBean=new GuiasRemisionesSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=GuiasRemisionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GuiasRemisionesConstantesFunciones.getClassesForeignKeysOfGuiasRemisiones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/guiasremisiones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			guiasremisionessAux= new ArrayList<GuiasRemisiones>();
			
				
			guiasremisionesLogic.setDatosCliente(this.datosCliente);
			guiasremisionesLogic.setDatosDeep(this.datosDeep);
			guiasremisionesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaGuiasRemisiones")) {
				this.sDetalleReporte=GuiasRemisionesConstantesFunciones.getDetalleIndiceBusquedaGuiasRemisiones(fecha_emision_desdeBusquedaGuiasRemisiones,fecha_emision_hastaBusquedaGuiasRemisiones);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					guiasremisionesLogic.getGuiasRemisionessBusquedaGuiasRemisiones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaGuiasRemisiones,fecha_emision_hastaBusquedaGuiasRemisiones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GuiasRemisionesConstantesFunciones.getDetalleIndiceBusquedaGuiasRemisiones(fecha_emision_desdeBusquedaGuiasRemisiones,fecha_emision_hastaBusquedaGuiasRemisiones);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GuiasRemisionesConstantesFunciones.getDetalleIndiceBusquedaGuiasRemisiones(fecha_emision_desdeBusquedaGuiasRemisiones,fecha_emision_hastaBusquedaGuiasRemisiones);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=guiasremisionesLogic.getGuiasRemisioness()==null||guiasremisionesLogic.getGuiasRemisioness().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=guiasremisioness==null|| guiasremisioness.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						guiasremisionessAux=new ArrayList<GuiasRemisiones>();
						guiasremisionessAux.addAll(guiasremisionesLogic.getGuiasRemisioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							guiasremisionessAux=new ArrayList<GuiasRemisiones>();
							guiasremisionessAux.addAll(guiasremisioness);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							guiasremisionesLogic.getGuiasRemisionessBusquedaGuiasRemisiones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaGuiasRemisiones,fecha_emision_hastaBusquedaGuiasRemisiones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GuiasRemisionesConstantesFunciones.getDetalleIndiceBusquedaGuiasRemisiones(fecha_emision_desdeBusquedaGuiasRemisiones,fecha_emision_hastaBusquedaGuiasRemisiones);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GuiasRemisionesConstantesFunciones.getDetalleIndiceBusquedaGuiasRemisiones(fecha_emision_desdeBusquedaGuiasRemisiones,fecha_emision_hastaBusquedaGuiasRemisiones);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGuiasRemisioness("BusquedaGuiasRemisiones",guiasremisionesLogic.getGuiasRemisioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGuiasRemisioness("BusquedaGuiasRemisiones",guiasremisioness);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						guiasremisionesLogic.setGuiasRemisioness(new ArrayList<GuiasRemisiones>());
						guiasremisionesLogic.getGuiasRemisioness().addAll(guiasremisionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							guiasremisioness=new ArrayList<GuiasRemisiones>();
							guiasremisioness.addAll(guiasremisionessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGuiasRemisiones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGuiasRemisiones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=guiasremisionesLogic.getGuiasRemisioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=guiasremisioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=guiasremisionesLogic.getGuiasRemisioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=guiasremisioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GuiasRemisiones guiasremisiones) {
		Boolean permite=true;
		
		if(this.guiasremisiones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GuiasRemisionesConstantesFunciones.getOrderByListaGuiasRemisiones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GuiasRemisionesConstantesFunciones.getOrderByListaGuiasRemisiones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GuiasRemisiones guiasremisiones:guiasremisionesLogic.getGuiasRemisioness()) {
				if(guiasremisiones.getsType().equals(Constantes2.S_TOTALES)) {
					guiasremisionesTotales=guiasremisiones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GuiasRemisiones guiasremisiones:this.guiasremisioness) {
				if(guiasremisiones.getsType().equals(Constantes2.S_TOTALES)) {
					guiasremisionesTotales=guiasremisiones;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.guiasremisionesAux=new GuiasRemisiones();
			this.guiasremisionesAux.setsType(Constantes2.S_TOTALES);
			this.guiasremisionesAux.setIsNew(false);
			this.guiasremisionesAux.setIsChanged(false);
			this.guiasremisionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//GuiasRemisionesConstantesFunciones.TotalizarValoresFilaGuiasRemisiones(this.guiasremisionesLogic.getGuiasRemisioness(),this.guiasremisionesAux);
				
				//this.guiasremisionesLogic.getGuiasRemisioness().add(this.guiasremisionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GuiasRemisionesConstantesFunciones.TotalizarValoresFilaGuiasRemisiones(this.guiasremisioness,this.guiasremisionesAux);
				
				this.guiasremisioness.add(this.guiasremisionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		guiasremisionesTotales=new GuiasRemisiones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.guiasremisionesLogic.getGuiasRemisioness().remove(guiasremisionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.guiasremisioness.remove(guiasremisionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		guiasremisionesTotales=new GuiasRemisiones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GuiasRemisiones guiasremisiones:guiasremisionesLogic.getGuiasRemisioness()) {
				if(guiasremisiones.getsType().equals(Constantes2.S_TOTALES)) {
					guiasremisionesTotales=guiasremisiones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GuiasRemisionesConstantesFunciones.TotalizarValoresFilaGuiasRemisiones(this.guiasremisionesLogic.getGuiasRemisioness(),guiasremisionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GuiasRemisiones guiasremisiones:this.guiasremisioness) {
				if(guiasremisiones.getsType().equals(Constantes2.S_TOTALES)) {
					guiasremisionesTotales=guiasremisiones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GuiasRemisionesConstantesFunciones.TotalizarValoresFilaGuiasRemisiones(this.guiasremisioness,guiasremisionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGuiasRemisionessBusquedaGuiasRemisiones()throws Exception {
		try {
			sAccionBusqueda="BusquedaGuiasRemisiones";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGuiasRemisionessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getGuiasRemisionessBusquedaGuiasRemisiones(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//guiasremisionesLogic.getGuiasRemisionessBusquedaGuiasRemisiones(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGuiasRemisionessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//guiasremisionesLogic.getGuiasRemisionessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosGuiasRemisiones() {
		this.isPermisoTodoGuiasRemisiones=false;
		this.isPermisoNuevoGuiasRemisiones=false;
		this.isPermisoActualizarGuiasRemisiones=false;
		this.isPermisoActualizarOriginalGuiasRemisiones=false;
		this.isPermisoEliminarGuiasRemisiones=false;
		this.isPermisoGuardarCambiosGuiasRemisiones=false;
		this.isPermisoConsultaGuiasRemisiones=true;
		this.isPermisoBusquedaGuiasRemisiones=true;
		this.isPermisoReporteGuiasRemisiones=true;
		this.isPermisoOrdenGuiasRemisiones=false;		
		this.isPermisoPaginacionMedioGuiasRemisiones=false;		
		this.isPermisoPaginacionAltoGuiasRemisiones=false;		
		this.isPermisoPaginacionTodoGuiasRemisiones=false;		
		this.isPermisoCopiarGuiasRemisiones=false;		
		this.isPermisoVerFormGuiasRemisiones=false;		
		this.isPermisoDuplicarGuiasRemisiones=false;
		this.isPermisoOrdenGuiasRemisiones=false;
	}
	
	public void setPermisosUsuarioGuiasRemisiones(Boolean isPermiso) {
		this.isPermisoTodoGuiasRemisiones=isPermiso;
		this.isPermisoNuevoGuiasRemisiones=isPermiso;
		this.isPermisoActualizarGuiasRemisiones=isPermiso;
		this.isPermisoActualizarOriginalGuiasRemisiones=isPermiso;
		this.isPermisoEliminarGuiasRemisiones=isPermiso;
		this.isPermisoGuardarCambiosGuiasRemisiones=isPermiso;
		this.isPermisoConsultaGuiasRemisiones=isPermiso;
		this.isPermisoBusquedaGuiasRemisiones=isPermiso;
		this.isPermisoReporteGuiasRemisiones=isPermiso;
		this.isPermisoOrdenGuiasRemisiones=isPermiso;		
		this.isPermisoPaginacionMedioGuiasRemisiones=isPermiso;		
		this.isPermisoPaginacionAltoGuiasRemisiones=isPermiso;		
		this.isPermisoPaginacionTodoGuiasRemisiones=isPermiso;		
		this.isPermisoCopiarGuiasRemisiones=isPermiso;		
		this.isPermisoVerFormGuiasRemisiones=isPermiso;		
		this.isPermisoDuplicarGuiasRemisiones=isPermiso;
		this.isPermisoOrdenGuiasRemisiones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGuiasRemisiones(Boolean isPermiso) {
		//this.isPermisoTodoGuiasRemisiones=isPermiso;
		this.isPermisoNuevoGuiasRemisiones=isPermiso;
		this.isPermisoActualizarGuiasRemisiones=isPermiso;
		this.isPermisoActualizarOriginalGuiasRemisiones=isPermiso;
		this.isPermisoEliminarGuiasRemisiones=isPermiso;
		this.isPermisoGuardarCambiosGuiasRemisiones=isPermiso;
		//this.isPermisoConsultaGuiasRemisiones=isPermiso;
		//this.isPermisoBusquedaGuiasRemisiones=isPermiso;
		//this.isPermisoReporteGuiasRemisiones=isPermiso;
		//this.isPermisoOrdenGuiasRemisiones=isPermiso;		
		//this.isPermisoPaginacionMedioGuiasRemisiones=isPermiso;		
		//this.isPermisoPaginacionAltoGuiasRemisiones=isPermiso;		
		//this.isPermisoPaginacionTodoGuiasRemisiones=isPermiso;		
		//this.isPermisoCopiarGuiasRemisiones=isPermiso;		
		//this.isPermisoDuplicarGuiasRemisiones=isPermiso;
		//this.isPermisoOrdenGuiasRemisiones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGuiasRemisionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(GuiasRemisionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebGuiasRemisiones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGuiasRemisionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioGuiasRemisionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGuiasRemisionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGuiasRemisionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioGuiasRemisiones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GuiasRemisionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GuiasRemisionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGuiasRemisiones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGuiasRemisiones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGuiasRemisiones=this.isPermisoActualizarGuiasRemisiones;
			this.isPermisoEliminarGuiasRemisiones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGuiasRemisiones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGuiasRemisiones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGuiasRemisiones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGuiasRemisiones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGuiasRemisiones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGuiasRemisiones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGuiasRemisiones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGuiasRemisiones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGuiasRemisiones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGuiasRemisiones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGuiasRemisiones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGuiasRemisiones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGuiasRemisiones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGuiasRemisiones.setToolTipText(this.jTableDatosGuiasRemisiones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGuiasRemisiones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGuiasRemisiones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GuiasRemisionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(GuiasRemisionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioGuiasRemisiones() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyGuiasRemisionesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGuiasRemisionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GuiasRemisionesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyGuiasRemisiones()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.guiasremisionesSessionBean==null) {
				this.guiasremisionesSessionBean=new GuiasRemisionesSessionBean();
			}

			if(!this.guiasremisionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyGuiasRemisiones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGuiasRemisiones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGuiasRemisiones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGuiasRemisiones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGuiasRemisiones(GuiasRemisiones guiasremisiones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGuiasRemisiones(GuiasRemisiones guiasremisiones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGuiasRemisiones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGuiasRemisiones()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGuiasRemisiones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGuiasRemisiones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGuiasRemisiones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGuiasRemisiones()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGuiasRemisiones(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGuiasRemisiones()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.getItemCount()>0) {
				this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public GuiasRemisionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GuiasRemisionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GuiasRemisionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.guiasremisionesSessionBean=new GuiasRemisionesSessionBean(); 
		this.guiasremisionesConstantesFunciones=new GuiasRemisionesConstantesFunciones(); 
		this.guiasremisionesBean=new GuiasRemisiones();//(this.guiasremisionesConstantesFunciones); 		
		this.guiasremisionesReturnGeneral=new GuiasRemisionesParameterReturnGeneral(); 
		
		this.guiasremisionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.guiasremisionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GuiasRemisionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GuiasRemisionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GuiasRemisionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGuiasRemisiones(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.guiasremisionesConstantesFunciones=new GuiasRemisionesConstantesFunciones(); 
			this.guiasremisionesBean=new GuiasRemisiones();//this.guiasremisionesConstantesFunciones); 			
			this.guiasremisionesReturnGeneral=new GuiasRemisionesParameterReturnGeneral(); 
		
			GuiasRemisionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Guias Remisiones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.guiasremisiones=new GuiasRemisiones();
			this.guiasremisioness = new ArrayList<GuiasRemisiones>();
			this.guiasremisionessAux = new ArrayList<GuiasRemisiones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic=new GuiasRemisionesLogic();
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}
			
			//this.guiasremisionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.guiasremisionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGuiasRemisiones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGuiasRemisiones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGuiasRemisiones);	
					}
					
					if(this.jInternalFrameImportacionGuiasRemisiones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGuiasRemisiones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGuiasRemisiones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGuiasRemisiones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGuiasRemisiones);
				this.jInternalFrameDetalleFormGuiasRemisiones.setVisible(false);
				this.jInternalFrameDetalleFormGuiasRemisiones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGuiasRemisiones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGuiasRemisiones);
					this.jInternalFrameReporteDinamicoGuiasRemisiones.setVisible(false);
					this.jInternalFrameReporteDinamicoGuiasRemisiones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGuiasRemisiones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGuiasRemisiones);
					this.jInternalFrameImportacionGuiasRemisiones.setVisible(false);
					this.jInternalFrameImportacionGuiasRemisiones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGuiasRemisiones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGuiasRemisiones);
					this.jInternalFrameOrderByGuiasRemisiones.setVisible(false);
					this.jInternalFrameOrderByGuiasRemisiones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGuiasRemisionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GuiasRemisionesConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.guiasremisionesReturnGeneral=new GuiasRemisionesParameterReturnGeneral();
			
			this.guiasremisionesParameterGeneral=new GuiasRemisionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.guiasremisionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(GuiasRemisionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GuiasRemisionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.guiasremisionesSessionBean.getEsGuardarRelacionado(),this.guiasremisionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GuiasRemisionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.guiasremisionesSessionBean.getEsGuardarRelacionado(),this.guiasremisionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoGuiasRemisiones=false;
			this.isVisibilidadCeldaDuplicarGuiasRemisiones=true;
			this.isVisibilidadCeldaCopiarGuiasRemisiones=true;
			this.isVisibilidadCeldaVerFormGuiasRemisiones=true;
			this.isVisibilidadCeldaOrdenGuiasRemisiones=true;
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;
			this.isVisibilidadCeldaModificarGuiasRemisiones=false;
			this.isVisibilidadCeldaActualizarGuiasRemisiones=false;
			this.isVisibilidadCeldaEliminarGuiasRemisiones=false;
			this.isVisibilidadCeldaCancelarGuiasRemisiones=false;
			this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=false;
			
			
			this.isVisibilidadBusquedaGuiasRemisiones=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGuiasRemisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGuiasRemisiones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGuiasRemisiones(false);
			
			this.setPermisosUsuarioGuiasRemisiones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado() 
				|| (this.guiasremisionesSessionBean.getEsGuardarRelacionado() && this.guiasremisionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGuiasRemisionesClasesRelacionadas();
			}
			
			if(this.guiasremisionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGuiasRemisionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGuiasRemisiones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGuiasRemisiones();
			}
			
			if(!this.isPermisoBusquedaGuiasRemisiones) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GuiasRemisionesConstantesFunciones.getTiposSeleccionarGuiasRemisiones());
				
				this.tiposColumnasSelect=GuiasRemisionesConstantesFunciones.getTiposSeleccionarGuiasRemisiones(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGuiasRemisiones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioGuiasRemisiones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioGuiasRemisiones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGuiasRemisiones() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				guiasremisionesImplementable= (GuiasRemisionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GuiasRemisionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				guiasremisionesImplementableHome= (GuiasRemisionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GuiasRemisionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.guiasremisioness= new ArrayList<GuiasRemisiones>();
			this.guiasremisionessEliminados= new ArrayList<GuiasRemisiones>();
						
			this.isEsNuevoGuiasRemisiones=false;
			this.esParaAccionDesdeFormularioGuiasRemisiones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGuiasRemisiones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGuiasRemisiones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			GuiasRemisionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GuiasRemisionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGuiasRemisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGuiasRemisiones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGuiasRemisiones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGuiasRemisiones();
			}
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGuiasRemisiones.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGuiasRemisiones.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGuiasRemisiones.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGuiasRemisiones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GuiasRemisiones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGuiasRemisiones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGuiasRemisiones")) {
				iIndex=this.jInternalFrameDetalleFormGuiasRemisiones.jTabbedPaneRelacionesGuiasRemisiones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGuiasRemisiones.jTabbedPaneRelacionesGuiasRemisiones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGuiasRemisiones();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyGuiasRemisiones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGuiasRemisiones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGuiasRemisiones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGuiasRemisionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGuiasRemisiones();
		
		this.cargarCombosFrameForeignKeyGuiasRemisiones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGuiasRemisiones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGuiasRemisiones();
		}
	}
	
	
	
	public void jButtonNuevoGuiasRemisionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.guiasremisionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
			
			if(jTableDatosGuiasRemisiones.getRowCount()>=1) {
				jTableDatosGuiasRemisiones.removeRowSelectionInterval(0, jTableDatosGuiasRemisiones.getRowCount()-1);						
			}
			
			this.isEsNuevoGuiasRemisiones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGuiasRemisiones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGuiasRemisiones(true);			
			//this.guiasremisiones=new GuiasRemisiones();
			//this.guiasremisiones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGuiasRemisiones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGuiasRemisiones() ;
			
			if(GuiasRemisionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGuiasRemisiones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.guiasremisiones);	
			this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);				
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
			if(this.guiasremisionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GuiasRemisiones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGuiasRemisionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGuiasRemisiones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGuiasRemisiones.getSelectedRows().length;			
			}
			
			guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGuiasRemisiones--;			
				//GuiasRemisiones guiasremisionesAux= new GuiasRemisiones();			
				//guiasremisionesAux.setId(this.iIdNuevoGuiasRemisiones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GuiasRemisiones guiasremisionesOrigen=new GuiasRemisiones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GuiasRemisiones guiasremisionesOrigen : guiasremisionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							guiasremisionesOrigen =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							guiasremisionesOrigen =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGuiasRemisiones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.guiasremisiones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGuiasRemisiones(guiasremisionesOrigen,this.guiasremisiones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.guiasremisionesLogic.getGuiasRemisioness().add(this.guiasremisionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.guiasremisioness.add(this.guiasremisionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGuiasRemisiones(false);
				
				this.jTableDatosGuiasRemisiones.setRowSelectionInterval(this.getIndiceNuevoGuiasRemisiones(), this.getIndiceNuevoGuiasRemisiones());
				
				int iLastRow =  this.jTableDatosGuiasRemisiones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGuiasRemisiones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGuiasRemisiones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGuiasRemisiones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();									
		
			GuiasRemisiones guiasremisionesOrigen=new GuiasRemisiones();
			GuiasRemisiones guiasremisionesDestino=new GuiasRemisiones();
				
			guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGuiasRemisiones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || guiasremisionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGuiasRemisiones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						guiasremisionesOrigen =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						guiasremisionesOrigen =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						guiasremisionesDestino =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						guiasremisionesDestino =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				guiasremisionesOrigen =guiasremisionessSeleccionados.get(0);
				guiasremisionesDestino =guiasremisionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGuiasRemisiones(guiasremisionesOrigen,guiasremisionesDestino,true,false);
				
				guiasremisionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(guiasremisionesDestino,guiasremisionesLogic.getGuiasRemisioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(guiasremisionesDestino,guiasremisioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGuiasRemisiones(false);
				
				//this.jTableDatosGuiasRemisiones.setRowSelectionInterval(this.getIndiceNuevoGuiasRemisiones(), this.getIndiceNuevoGuiasRemisiones());
				
				int iLastRow =  this.jTableDatosGuiasRemisiones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGuiasRemisiones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGuiasRemisiones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGuiasRemisiones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGuiasRemisiones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGuiasRemisiones.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGuiasRemisiones.setVisible(!isVisible);
			this.jPanelPaginacionGuiasRemisiones.setVisible(!isVisible);
			this.jPanelAccionesGuiasRemisiones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGuiasRemisiones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGuiasRemisiones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGuiasRemisiones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGuiasRemisiones();
			
			this.abrirFrameOrderByGuiasRemisiones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGuiasRemisiones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGuiasRemisiones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGuiasRemisiones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGuiasRemisiones.isMaximum()) {
					this.jInternalFrameDetalleFormGuiasRemisiones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGuiasRemisiones.setSize(this.jInternalFrameDetalleFormGuiasRemisiones.iWidthFormulario,this.jInternalFrameDetalleFormGuiasRemisiones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGuiasRemisiones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGuiasRemisiones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGuiasRemisiones.isMaximum()) {
						this.jInternalFrameDetalleFormGuiasRemisiones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGuiasRemisiones.jContentPaneDetalleGuiasRemisiones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGuiasRemisiones.jTabbedPaneRelacionesGuiasRemisiones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGuiasRemisiones.jContentPaneDetalleGuiasRemisiones.getWidth(),GuiasRemisionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGuiasRemisiones.jTabbedPaneRelacionesGuiasRemisiones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGuiasRemisiones.jContentPaneDetalleGuiasRemisiones.getWidth(),GuiasRemisionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGuiasRemisiones.jTabbedPaneRelacionesGuiasRemisiones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGuiasRemisiones.jContentPaneDetalleGuiasRemisiones.getWidth(),GuiasRemisionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGuiasRemisiones.setVisible(true);
	        this.jInternalFrameDetalleFormGuiasRemisiones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGuiasRemisiones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGuiasRemisiones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGuiasRemisiones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGuiasRemisiones,false,this);
				} else {
					this.jInternalFrameOrderByGuiasRemisiones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGuiasRemisiones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGuiasRemisiones);
				this.jInternalFrameOrderByGuiasRemisiones.setVisible(false);
				this.jInternalFrameOrderByGuiasRemisiones.setSelected(false);
				
				this.jInternalFrameOrderByGuiasRemisiones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGuiasRemisiones"));
				
				this.inicializarActualizarBindingTablaOrderByGuiasRemisiones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGuiasRemisiones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGuiasRemisiones==null) {
				
				this.jInternalFrameImportacionGuiasRemisiones=new ImportacionJInternalFrame(GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGuiasRemisiones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGuiasRemisiones);
				this.jInternalFrameImportacionGuiasRemisiones.setVisible(false);
				this.jInternalFrameImportacionGuiasRemisiones.setSelected(false);


				this.jInternalFrameImportacionGuiasRemisiones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGuiasRemisiones"));
				this.jInternalFrameImportacionGuiasRemisiones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGuiasRemisiones"));
				this.jInternalFrameImportacionGuiasRemisiones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGuiasRemisiones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGuiasRemisiones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGuiasRemisiones==null) {
				this.jInternalFrameReporteDinamicoGuiasRemisiones=new ReporteDinamicoJInternalFrame(GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGuiasRemisiones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGuiasRemisiones);
				this.jInternalFrameReporteDinamicoGuiasRemisiones.setVisible(false);
				this.jInternalFrameReporteDinamicoGuiasRemisiones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGuiasRemisiones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGuiasRemisiones"));
				this.jInternalFrameReporteDinamicoGuiasRemisiones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGuiasRemisiones"));
				this.jInternalFrameReporteDinamicoGuiasRemisiones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGuiasRemisiones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGuiasRemisiones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleGuiasRemisiones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGuiasRemisiones);
			
	       	this.jInternalFrameDetalleFormGuiasRemisiones.setVisible(false);
	        this.jInternalFrameDetalleFormGuiasRemisiones.setSelected(false);
			
			//this.jInternalFrameDetalleFormGuiasRemisiones.dispose();
			//this.jInternalFrameDetalleFormGuiasRemisiones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGuiasRemisiones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGuiasRemisiones.setVisible(true);
	        this.jInternalFrameReporteDinamicoGuiasRemisiones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGuiasRemisiones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGuiasRemisiones.setVisible(true);
	        this.jInternalFrameImportacionGuiasRemisiones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGuiasRemisiones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGuiasRemisiones.setVisible(true);
	        this.jInternalFrameOrderByGuiasRemisiones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGuiasRemisiones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGuiasRemisiones.setVisible(false);
	        this.jInternalFrameOrderByGuiasRemisiones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGuiasRemisiones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGuiasRemisiones.setVisible(false);
	        this.jInternalFrameReporteDinamicoGuiasRemisiones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGuiasRemisiones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGuiasRemisiones.setVisible(false);
	        this.jInternalFrameImportacionGuiasRemisiones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGuiasRemisiones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGuiasRemisiones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGuiasRemisiones(true);
			//this.isEsNuevoGuiasRemisiones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGuiasRemisiones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGuiasRemisiones(false) ;
			
			if(guiasremisionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(GuiasRemisionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGuiasRemisiones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGuiasRemisiones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGuiasRemisionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGuiasRemisiones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGuiasRemisiones(true);
			//this.isEsNuevoGuiasRemisiones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.guiasremisiones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGuiasRemisiones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGuiasRemisiones(false) ;
			
			if(GuiasRemisionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGuiasRemisiones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGuiasRemisiones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGuiasRemisiones(false);
			
			//if(!this.isEsNuevoGuiasRemisiones) {								
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				
			}
			
			if(this.permiteMantenimiento(this.guiasremisiones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGuiasRemisiones=true;
					this.inicializarActualizarBindingTablaGuiasRemisiones(false);
					this.isEsNuevoGuiasRemisiones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGuiasRemisiones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGuiasRemisiones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGuiasRemisiones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGuiasRemisiones(false);
				
				this.habilitarDeshabilitarControlesGuiasRemisiones(false);
			
												
				
				if(GuiasRemisionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGuiasRemisiones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGuiasRemisionesActionPerformed(evt,guiasremisionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGuiasRemisiones(this.guiasremisiones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGuiasRemisiones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,guiasremisionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.guiasremisiones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				this.guiasremisiones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				this.guiasremisiones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.guiasremisiones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GuiasRemisionesModel) this.jTableDatosGuiasRemisiones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGuiasRemisiones=true;
				this.inicializarActualizarBindingTablaGuiasRemisiones(false);
				this.isEsNuevoGuiasRemisiones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGuiasRemisiones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGuiasRemisiones(false);
				
				this.habilitarDeshabilitarControlesGuiasRemisiones(false);
				
				
				
				if(GuiasRemisionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGuiasRemisiones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGuiasRemisiones.getRowCount()>=1) {
				jTableDatosGuiasRemisiones.removeRowSelectionInterval(0, jTableDatosGuiasRemisiones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGuiasRemisiones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGuiasRemisiones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGuiasRemisiones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGuiasRemisiones(false) ;
			
			this.isEsNuevoGuiasRemisiones=false;
			
			if(GuiasRemisionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGuiasRemisiones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGuiasRemisiones(false);
				
				//SI ES MANUAL
				if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGuiasRemisiones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGuiasRemisiones--;			
			//GuiasRemisiones guiasremisionesAux= new GuiasRemisiones();			
			//guiasremisionesAux.setId(this.iIdNuevoGuiasRemisiones);
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGuiasRemisiones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
			
			this.guiasremisiones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.guiasremisionesLogic.getGuiasRemisioness().add(this.guiasremisionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.guiasremisioness.add(this.guiasremisionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGuiasRemisiones(false);
			
			this.jTableDatosGuiasRemisiones.setRowSelectionInterval(this.getIndiceNuevoGuiasRemisiones(), this.getIndiceNuevoGuiasRemisiones());
			
			int iLastRow =  this.jTableDatosGuiasRemisiones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGuiasRemisiones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGuiasRemisiones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGuiasRemisiones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGuiasRemisiones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGuiasRemisiones(false);
			
			//SI ES MANUAL
			if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGuiasRemisiones();
			}
			
			//this.abrirFrameTreeGuiasRemisiones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGuiasRemisiones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGuiasRemisiones.setFileImportacion(this.jInternalFrameImportacionGuiasRemisiones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGuiasRemisiones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGuiasRemisiones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGuiasRemisiones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGuiasRemisiones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();		

		guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GuiasRemisionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GuiasRemisionesBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteGuiasRemisioness("Todos",guiasremisionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guias Remisiones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpresoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpresoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpresoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpresoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoTransporte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoTransporte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoTransporte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoTransporte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuiasRemisionesConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuiasRemisionesConstantesFunciones.LABEL_OTRO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuiasRemisionesConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoGuiasRemisiones.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoria="numero_pre_impreso_factura";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE:
					sNombreCampoCategoria="nombre_tipo_transporte";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_OTRO:
					sNombreCampoCategoria="otro";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoriaValor="numero_pre_impreso_factura";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE:
					sNombreCampoCategoriaValor="nombre_tipo_transporte";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_OTRO:
					sNombreCampoCategoriaValor="otro";
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso_factura");
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Transporte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_transporte");
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_OTRO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Otro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"otro");
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();		
		
		guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guiasremisiones";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("GuiasRemisioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GuiasRemisionesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getnumero_pre_impreso_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getnombre_tipo_transporte());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_IVA);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_OTRO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_OTRO);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.getotro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuiasRemisionesConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(GuiasRemisiones guiasremisiones:guiasremisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guiasremisiones.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelGuiasRemisiones(row);				
			//	iRow++;
			//}				
			
			//for(GuiasRemisiones guiasremisionesAux:guiasremisionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGuiasRemisiones(guiasremisionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guias Remisiones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGuiasRemisiones(false);
			
			//SI ES MANUAL
			if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGuiasRemisiones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGuiasRemisiones(false);
			
			//SI ES MANUAL
			if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGuiasRemisiones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGuiasRemisiones(false);
			
			//SI ES MANUAL
			if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGuiasRemisiones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGuiasRemisiones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGuiasRemisiones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGuiasRemisiones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGuiasRemisiones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGuiasRemisiones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGuiasRemisiones.setMinimumSize(dimensionMinimum);
		this.jTableDatosGuiasRemisiones.setMaximumSize(dimensionMaximum);
		this.jTableDatosGuiasRemisiones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGuiasRemisiones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGuiasRemisiones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGuiasRemisiones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGuiasRemisiones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGuiasRemisiones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGuiasRemisiones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGuiasRemisiones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGuiasRemisiones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GuiasRemisionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGuiasRemisiones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGuiasRemisiones();
		
		this.inicializarActualizarBindingBotonesManualGuiasRemisiones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGuiasRemisiones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGuiasRemisiones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGuiasRemisiones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGuiasRemisiones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGuiasRemisiones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGuiasRemisiones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGuiasRemisiones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGuiasRemisiones.jCheckBoxPostAccionNuevoGuiasRemisiones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGuiasRemisiones.jCheckBoxPostAccionSinCerrarGuiasRemisiones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGuiasRemisiones.jCheckBoxPostAccionSinMensajeGuiasRemisiones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGuiasRemisiones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGuiasRemisiones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGuiasRemisiones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
				this.jInternalFrameDetalleFormGuiasRemisiones.jCheckBoxPostAccionNuevoGuiasRemisiones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGuiasRemisiones.jCheckBoxPostAccionSinCerrarGuiasRemisiones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGuiasRemisiones.jCheckBoxPostAccionSinMensajeGuiasRemisiones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGuiasRemisiones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGuiasRemisiones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGuiasRemisiones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGuiasRemisiones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGuiasRemisiones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGuiasRemisiones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGuiasRemisiones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGuiasRemisiones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGuiasRemisiones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGuiasRemisiones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGuiasRemisiones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGuiasRemisiones(Boolean esInicializar) throws Exception {
		try	{	
			if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGuiasRemisiones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGuiasRemisiones() throws Exception {
		try	{
			if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGuiasRemisiones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGuiasRemisiones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGuiasRemisiones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGuiasRemisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGuiasRemisiones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGuiasRemisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGuiasRemisiones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGuiasRemisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGuiasRemisiones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGuiasRemisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGuiasRemisiones.addItem(reporte);
			}
			
			
			if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGuiasRemisiones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGuiasRemisiones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGuiasRemisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGuiasRemisiones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGuiasRemisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGuiasRemisiones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGuiasRemisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGuiasRemisiones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGuiasRemisiones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGuiasRemisiones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGuiasRemisiones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGuiasRemisiones!=null) {
				this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGuiasRemisiones!=null) {
				this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGuiasRemisiones!=null) {
				
				if(this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=GuiasRemisionesConstantesFunciones.getTiposSeleccionarGuiasRemisiones(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=GuiasRemisionesConstantesFunciones.getTiposSeleccionarGuiasRemisiones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=GuiasRemisionesConstantesFunciones.getTiposSeleccionarGuiasRemisiones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoGuiasRemisiones.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGuiasRemisiones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaGuiasRemisiones=new Date(this.jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.getDate().getTime());
		this.fecha_emision_hastaBusquedaGuiasRemisiones=new Date(this.jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGuiasRemisiones(Boolean esInicializar) throws Exception {				
		if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGuiasRemisiones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGuiasRemisiones() throws Exception {
		this.inicializarActualizarBindingTablaGuiasRemisiones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGuiasRemisiones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGuiasRemisionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGuiasRemisiones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=guiasremisionesLogic.getGuiasRemisioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=guiasremisioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGuiasRemisiones.setModel(new GuiasRemisionesModel(this.guiasremisionesLogic.getGuiasRemisioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGuiasRemisiones.setModel(new GuiasRemisionesModel(this.guiasremisioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGuiasRemisiones!=null && this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGuiasRemisiones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO,guiasremisionesConstantesFunciones.resaltarSeleccionarGuiasRemisiones,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO,guiasremisionesConstantesFunciones.resaltarSeleccionarGuiasRemisiones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_ID));

		if(this.guiasremisionesConstantesFunciones.mostraridGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.guiasremisionesConstantesFunciones.resaltaridGuiasRemisiones,this.guiasremisionesConstantesFunciones.activaridGuiasRemisiones,iSizeTabla,this,true,"idGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guiasremisionesConstantesFunciones.resaltaridGuiasRemisiones,this.guiasremisionesConstantesFunciones.activaridGuiasRemisiones,this,true,"idGuiasRemisiones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.guiasremisionesConstantesFunciones.mostrarnombre_completo_clienteGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.guiasremisionesConstantesFunciones.resaltarnombre_completo_clienteGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarnombre_completo_clienteGuiasRemisiones,iSizeTabla,this,true,"nombre_completo_clienteGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guiasremisionesConstantesFunciones.resaltarnombre_completo_clienteGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarnombre_completo_clienteGuiasRemisiones,this,true,"nombre_completo_clienteGuiasRemisiones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA));

		if(this.guiasremisionesConstantesFunciones.mostrarnumero_pre_impreso_facturaGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.guiasremisionesConstantesFunciones.resaltarnumero_pre_impreso_facturaGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarnumero_pre_impreso_facturaGuiasRemisiones,iSizeTabla,this,true,"numero_pre_impreso_facturaGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guiasremisionesConstantesFunciones.resaltarnumero_pre_impreso_facturaGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarnumero_pre_impreso_facturaGuiasRemisiones,this,true,"numero_pre_impreso_facturaGuiasRemisiones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL));

		if(this.guiasremisionesConstantesFunciones.mostrarsecuencialGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.guiasremisionesConstantesFunciones.resaltarsecuencialGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarsecuencialGuiasRemisiones,iSizeTabla,this,true,"secuencialGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guiasremisionesConstantesFunciones.resaltarsecuencialGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarsecuencialGuiasRemisiones,this,true,"secuencialGuiasRemisiones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION));

		if(this.guiasremisionesConstantesFunciones.mostrarfecha_emisionGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.guiasremisionesConstantesFunciones.resaltarfecha_emisionGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarfecha_emisionGuiasRemisiones,iSizeTabla,this,true,"fecha_emisionGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.guiasremisionesConstantesFunciones.resaltarfecha_emisionGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarfecha_emisionGuiasRemisiones,this,true,"fecha_emisionGuiasRemisiones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.guiasremisionesConstantesFunciones.mostrarfecha_vencimientoGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.guiasremisionesConstantesFunciones.resaltarfecha_vencimientoGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarfecha_vencimientoGuiasRemisiones,iSizeTabla,this,true,"fecha_vencimientoGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.guiasremisionesConstantesFunciones.resaltarfecha_vencimientoGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarfecha_vencimientoGuiasRemisiones,this,true,"fecha_vencimientoGuiasRemisiones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE));

		if(this.guiasremisionesConstantesFunciones.mostrarnombre_tipo_transporteGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.guiasremisionesConstantesFunciones.resaltarnombre_tipo_transporteGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarnombre_tipo_transporteGuiasRemisiones,iSizeTabla,this,true,"nombre_tipo_transporteGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guiasremisionesConstantesFunciones.resaltarnombre_tipo_transporteGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarnombre_tipo_transporteGuiasRemisiones,this,true,"nombre_tipo_transporteGuiasRemisiones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_IVA));

		if(this.guiasremisionesConstantesFunciones.mostrarivaGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.guiasremisionesConstantesFunciones.resaltarivaGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarivaGuiasRemisiones,iSizeTabla,this,true,"ivaGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guiasremisionesConstantesFunciones.resaltarivaGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarivaGuiasRemisiones,this,true,"ivaGuiasRemisiones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO));

		if(this.guiasremisionesConstantesFunciones.mostrardescuentoGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.guiasremisionesConstantesFunciones.resaltardescuentoGuiasRemisiones,this.guiasremisionesConstantesFunciones.activardescuentoGuiasRemisiones,iSizeTabla,this,true,"descuentoGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guiasremisionesConstantesFunciones.resaltardescuentoGuiasRemisiones,this.guiasremisionesConstantesFunciones.activardescuentoGuiasRemisiones,this,true,"descuentoGuiasRemisiones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_OTRO));

		if(this.guiasremisionesConstantesFunciones.mostrarotroGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_OTRO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.guiasremisionesConstantesFunciones.resaltarotroGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarotroGuiasRemisiones,iSizeTabla,this,true,"otroGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guiasremisionesConstantesFunciones.resaltarotroGuiasRemisiones,this.guiasremisionesConstantesFunciones.activarotroGuiasRemisiones,this,true,"otroGuiasRemisiones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,GuiasRemisionesConstantesFunciones.LABEL_TOTAL));

		if(this.guiasremisionesConstantesFunciones.mostrartotalGuiasRemisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuiasRemisionesConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.guiasremisionesConstantesFunciones.resaltartotalGuiasRemisiones,this.guiasremisionesConstantesFunciones.activartotalGuiasRemisiones,iSizeTabla,this,true,"totalGuiasRemisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guiasremisionesConstantesFunciones.resaltartotalGuiasRemisiones,this.guiasremisionesConstantesFunciones.activartotalGuiasRemisiones,this,true,"totalGuiasRemisiones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GuiasRemisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.guiasremisionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.guiasremisionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGuiasRemisiones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.guiasremisionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.guiasremisionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGuiasRemisiones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.guiasremisionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.guiasremisionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGuiasRemisiones.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosGuiasRemisiones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGuiasRemisiones.moveColumn(this.jTableDatosGuiasRemisiones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGuiasRemisiones.moveColumn(this.jTableDatosGuiasRemisiones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGuiasRemisiones.moveColumn(this.jTableDatosGuiasRemisiones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGuiasRemisiones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGuiasRemisiones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGuiasRemisiones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GuiasRemisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGuiasRemisiones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GuiasRemisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GuiasRemisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGuiasRemisiones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGuiasRemisiones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGuiasRemisiones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							//iSize=guiasremisionesLogic.getGuiasRemisioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=guiasremisioness.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosGuiasRemisiones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGuiasRemisiones();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoGuiasRemisiones=false;
					
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
				if(this.guiasremisionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGuiasRemisiones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGuiasRemisiones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGuiasRemisiones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.guiasremisiones.getsType().equals("DUPLICADO")
				   || this.guiasremisiones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGuiasRemisiones=true;
				
				} else {
					this.isEsNuevoGuiasRemisiones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
					if(this.guiasremisiones.getId()>=0 && !this.guiasremisiones.getIsNew()) {						
						this.isEsNuevoGuiasRemisiones=false;
						
					} else {
						this.isEsNuevoGuiasRemisiones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGuiasRemisiones(esRelaciones);						
				
				this.seleccionarGuiasRemisiones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.guiasremisiones.getId()<0) {
					this.isEsNuevoGuiasRemisiones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGuiasRemisiones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGuiasRemisiones(evt,rowIndex);
				}	
				
				if(this.guiasremisionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GuiasRemisiones: " + this.dDif); 
					}
				}								
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGuiasRemisiones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.guiasremisiones)) {
					if(this.guiasremisiones.getId()>0) {
						this.guiasremisiones.setIsDeleted(true);
						
						this.guiasremisionessEliminados.add(this.guiasremisiones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.guiasremisionesLogic.getGuiasRemisioness().remove(this.guiasremisiones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.guiasremisioness.remove(this.guiasremisiones);				
					}
					
					
					((GuiasRemisionesModel) this.jTableDatosGuiasRemisiones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGuiasRemisiones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGuiasRemisiones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGuiasRemisiones) {
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGuiasRemisiones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGuiasRemisiones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGuiasRemisiones(this.guiasremisiones);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGuiasRemisiones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGuiasRemisiones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGuiasRemisiones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGuiasRemisiones(GuiasRemisiones guiasremisiones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGuiasRemisiones(guiasremisiones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGuiasRemisiones(GuiasRemisiones guiasremisiones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGuiasRemisiones(guiasremisiones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGuiasRemisiones(guiasremisiones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGuiasRemisiones(guiasremisiones);
	}
	
	public void setVariablesObjetoActualToFormularioGuiasRemisiones(GuiasRemisiones guiasremisiones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.setText(guiasremisiones.getId().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_completo_clienteGuiasRemisiones.setText(guiasremisiones.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setText(guiasremisiones.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldsecuencialGuiasRemisiones.setText(guiasremisiones.getsecuencial());
			this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emisionGuiasRemisiones.setDate(guiasremisiones.getfecha_emision());
			this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_vencimientoGuiasRemisiones.setDate(guiasremisiones.getfecha_vencimiento());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_tipo_transporteGuiasRemisiones.setText(guiasremisiones.getnombre_tipo_transporte());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldivaGuiasRemisiones.setText(guiasremisiones.getiva().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFielddescuentoGuiasRemisiones.setText(guiasremisiones.getdescuento().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldotroGuiasRemisiones.setText(guiasremisiones.getotro().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldtotalGuiasRemisiones.setText(guiasremisiones.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GuiasRemisiones guiasremisionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,guiasremisionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GuiasRemisiones guiasremisionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				guiasremisionesLocal=this.guiasremisiones;
			} else {
				guiasremisionesLocal=this.guiasremisionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(guiasremisionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGuiasRemisiones(guiasremisionesLocal,true);
					
					if(guiasremisionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(guiasremisionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(guiasremisionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGuiasRemisiones(GuiasRemisiones guiasremisiones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGuiasRemisiones(guiasremisiones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(guiasremisiones);
	}
	
	public void setVariablesFormularioToObjetoActualGuiasRemisiones(GuiasRemisiones guiasremisiones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGuiasRemisiones(guiasremisiones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGuiasRemisiones(GuiasRemisiones guiasremisiones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.getText()==null || this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.getText()=="" || this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.getText()=="Id") {
				this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.setText("0");
			}

			if(conColumnasBase) {guiasremisiones.setId(Long.parseLong(this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelIdGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guiasremisiones.setnombre_completo_cliente(this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_completo_clienteGuiasRemisiones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelnombre_completo_clienteGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guiasremisiones.setnumero_pre_impreso_factura(this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelnumero_pre_impreso_facturaGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guiasremisiones.setsecuencial(this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldsecuencialGuiasRemisiones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelsecuencialGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guiasremisiones.setfecha_emision(this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emisionGuiasRemisiones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelfecha_emisionGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guiasremisiones.setfecha_vencimiento(this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_vencimientoGuiasRemisiones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelfecha_vencimientoGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guiasremisiones.setnombre_tipo_transporte(this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_tipo_transporteGuiasRemisiones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelnombre_tipo_transporteGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guiasremisiones.setiva(Double.parseDouble(this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldivaGuiasRemisiones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelivaGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guiasremisiones.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormGuiasRemisiones.jTextFielddescuentoGuiasRemisiones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabeldescuentoGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guiasremisiones.setotro(Double.parseDouble(this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldotroGuiasRemisiones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_OTRO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabelotroGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guiasremisiones.settotal(Double.parseDouble(this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldtotalGuiasRemisiones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuiasRemisionesConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuiasRemisiones.jLabeltotalGuiasRemisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGuiasRemisiones(GuiasRemisiones guiasremisionesBean,GuiasRemisiones guiasremisiones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGuiasRemisiones(GuiasRemisiones guiasremisionesOrigen,GuiasRemisiones guiasremisiones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && guiasremisionesOrigen.getId()!=null && !guiasremisionesOrigen.getId().equals(0L))) {guiasremisiones.setId(guiasremisionesOrigen.getId());}}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getfecha_emision_desde()!=null && !guiasremisionesOrigen.getfecha_emision_desde().equals(new Date()))) {guiasremisiones.setfecha_emision_desde(guiasremisionesOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getfecha_emision_hasta()!=null && !guiasremisionesOrigen.getfecha_emision_hasta().equals(new Date()))) {guiasremisiones.setfecha_emision_hasta(guiasremisionesOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getnombre_completo_cliente()!=null && !guiasremisionesOrigen.getnombre_completo_cliente().equals(""))) {guiasremisiones.setnombre_completo_cliente(guiasremisionesOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getnumero_pre_impreso_factura()!=null && !guiasremisionesOrigen.getnumero_pre_impreso_factura().equals(""))) {guiasremisiones.setnumero_pre_impreso_factura(guiasremisionesOrigen.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getsecuencial()!=null && !guiasremisionesOrigen.getsecuencial().equals(""))) {guiasremisiones.setsecuencial(guiasremisionesOrigen.getsecuencial());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getfecha_emision()!=null && !guiasremisionesOrigen.getfecha_emision().equals(new Date()))) {guiasremisiones.setfecha_emision(guiasremisionesOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getfecha_vencimiento()!=null && !guiasremisionesOrigen.getfecha_vencimiento().equals(new Date()))) {guiasremisiones.setfecha_vencimiento(guiasremisionesOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getnombre_tipo_transporte()!=null && !guiasremisionesOrigen.getnombre_tipo_transporte().equals(""))) {guiasremisiones.setnombre_tipo_transporte(guiasremisionesOrigen.getnombre_tipo_transporte());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getiva()!=null && !guiasremisionesOrigen.getiva().equals(0.0))) {guiasremisiones.setiva(guiasremisionesOrigen.getiva());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getdescuento()!=null && !guiasremisionesOrigen.getdescuento().equals(0.0))) {guiasremisiones.setdescuento(guiasremisionesOrigen.getdescuento());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.getotro()!=null && !guiasremisionesOrigen.getotro().equals(0.0))) {guiasremisiones.setotro(guiasremisionesOrigen.getotro());}
			if(conDefault || (!conDefault && guiasremisionesOrigen.gettotal()!=null && !guiasremisionesOrigen.gettotal().equals(0.0))) {guiasremisiones.settotal(guiasremisionesOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGuiasRemisiones(GuiasRemisiones guiasremisiones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.setText(guiasremisiones.getId().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_completo_clienteGuiasRemisiones.setText(guiasremisiones.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setText(guiasremisiones.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldsecuencialGuiasRemisiones.setText(guiasremisiones.getsecuencial());
			this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emisionGuiasRemisiones.setDate(guiasremisiones.getfecha_emision());
			this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_vencimientoGuiasRemisiones.setDate(guiasremisiones.getfecha_vencimiento());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_tipo_transporteGuiasRemisiones.setText(guiasremisiones.getnombre_tipo_transporte());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldivaGuiasRemisiones.setText(guiasremisiones.getiva().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFielddescuentoGuiasRemisiones.setText(guiasremisiones.getdescuento().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldotroGuiasRemisiones.setText(guiasremisiones.getotro().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldtotalGuiasRemisiones.setText(guiasremisiones.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGuiasRemisiones(GuiasRemisionesBean guiasremisionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.setText(guiasremisionesBean.getId().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_completo_clienteGuiasRemisiones.setText(guiasremisionesBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setText(guiasremisionesBean.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldsecuencialGuiasRemisiones.setText(guiasremisionesBean.getsecuencial());
			this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emisionGuiasRemisiones.setDate(guiasremisionesBean.getfecha_emision());
			this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_vencimientoGuiasRemisiones.setDate(guiasremisionesBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_tipo_transporteGuiasRemisiones.setText(guiasremisionesBean.getnombre_tipo_transporte());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldivaGuiasRemisiones.setText(guiasremisionesBean.getiva().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFielddescuentoGuiasRemisiones.setText(guiasremisionesBean.getdescuento().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldotroGuiasRemisiones.setText(guiasremisionesBean.getotro().toString());
			this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldtotalGuiasRemisiones.setText(guiasremisionesBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGuiasRemisiones(GuiasRemisionesParameterReturnGeneral guiasremisionesReturnGeneral,GuiasRemisionesBean guiasremisionesBean,Boolean conDefault) throws Exception { 
		try {
			GuiasRemisiones guiasremisionesLocal=new GuiasRemisiones();
			
			guiasremisionesLocal=guiasremisionesReturnGeneral.getGuiasRemisiones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && guiasremisionesLocal.getId()!=null && !guiasremisionesLocal.getId().equals(0L))) {guiasremisionesBean.setId(guiasremisionesLocal.getId());}}
			if(conDefault || (!conDefault && guiasremisionesLocal.getnombre_completo_cliente()!=null && !guiasremisionesLocal.getnombre_completo_cliente().equals(""))) {guiasremisionesBean.setnombre_completo_cliente(guiasremisionesLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && guiasremisionesLocal.getnumero_pre_impreso_factura()!=null && !guiasremisionesLocal.getnumero_pre_impreso_factura().equals(""))) {guiasremisionesBean.setnumero_pre_impreso_factura(guiasremisionesLocal.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && guiasremisionesLocal.getsecuencial()!=null && !guiasremisionesLocal.getsecuencial().equals(""))) {guiasremisionesBean.setsecuencial(guiasremisionesLocal.getsecuencial());}
			if(conDefault || (!conDefault && guiasremisionesLocal.getfecha_emision()!=null && !guiasremisionesLocal.getfecha_emision().equals(new Date()))) {guiasremisionesBean.setfecha_emision(guiasremisionesLocal.getfecha_emision());}
			if(conDefault || (!conDefault && guiasremisionesLocal.getfecha_vencimiento()!=null && !guiasremisionesLocal.getfecha_vencimiento().equals(new Date()))) {guiasremisionesBean.setfecha_vencimiento(guiasremisionesLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && guiasremisionesLocal.getnombre_tipo_transporte()!=null && !guiasremisionesLocal.getnombre_tipo_transporte().equals(""))) {guiasremisionesBean.setnombre_tipo_transporte(guiasremisionesLocal.getnombre_tipo_transporte());}
			if(conDefault || (!conDefault && guiasremisionesLocal.getiva()!=null && !guiasremisionesLocal.getiva().equals(0.0))) {guiasremisionesBean.setiva(guiasremisionesLocal.getiva());}
			if(conDefault || (!conDefault && guiasremisionesLocal.getdescuento()!=null && !guiasremisionesLocal.getdescuento().equals(0.0))) {guiasremisionesBean.setdescuento(guiasremisionesLocal.getdescuento());}
			if(conDefault || (!conDefault && guiasremisionesLocal.getotro()!=null && !guiasremisionesLocal.getotro().equals(0.0))) {guiasremisionesBean.setotro(guiasremisionesLocal.getotro());}
			if(conDefault || (!conDefault && guiasremisionesLocal.gettotal()!=null && !guiasremisionesLocal.gettotal().equals(0.0))) {guiasremisionesBean.settotal(guiasremisionesLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGuiasRemisionesGenerico(Long idGuiasRemisionesSeleccionado,JComboBox jComboBoxGuiasRemisiones,List<GuiasRemisiones> guiasremisionessLocal)throws Exception {
		try {
			GuiasRemisiones  guiasremisionesTemp=null;

			for(GuiasRemisiones guiasremisionesAux:guiasremisionessLocal) {
				if(guiasremisionesAux.getId()!=null && guiasremisionesAux.getId().equals(idGuiasRemisionesSeleccionado)) {
					guiasremisionesTemp=guiasremisionesAux;
					break;
				}
			}

			jComboBoxGuiasRemisiones.setSelectedItem(guiasremisionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGuiasRemisionesGenerico(JComboBox jComboBoxGuiasRemisiones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGuiasRemisiones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGuiasRemisiones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGuiasRemisiones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGuiasRemisiones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			guiasremisiones=(GuiasRemisiones) guiasremisionesLogic.getGuiasRemisioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			guiasremisiones =(GuiasRemisiones) guiasremisioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!guiasremisiones.getIsNew() && !guiasremisiones.getIsChanged() && !guiasremisiones.getIsDeleted()) {
				sDescripcion=guiasremisiones.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=guiasremisiones.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GuiasRemisiones guiasremisionesRow=new GuiasRemisiones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			guiasremisionesRow=(GuiasRemisiones) guiasremisionesLogic.getGuiasRemisioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			guiasremisionesRow=(GuiasRemisiones) guiasremisioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGuiasRemisiones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGuiasRemisiones.setVisible((this.isVisibilidadCeldaNuevoGuiasRemisiones && this.isPermisoNuevoGuiasRemisiones));			
			this.jButtonDuplicarGuiasRemisiones.setVisible((this.isVisibilidadCeldaDuplicarGuiasRemisiones && this.isPermisoDuplicarGuiasRemisiones));			
			this.jButtonCopiarGuiasRemisiones.setVisible((this.isVisibilidadCeldaCopiarGuiasRemisiones && this.isPermisoCopiarGuiasRemisiones));
			this.jButtonVerFormGuiasRemisiones.setVisible((this.isVisibilidadCeldaVerFormGuiasRemisiones && this.isPermisoVerFormGuiasRemisiones));
			
			this.jButtonAbrirOrderByGuiasRemisiones.setVisible((this.isVisibilidadCeldaOrdenGuiasRemisiones && this.isPermisoOrdenGuiasRemisiones));			
			
			this.jButtonNuevoRelacionesGuiasRemisiones.setVisible((this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones && this.isPermisoNuevoGuiasRemisiones));			
			this.jButtonNuevoGuardarCambiosGuiasRemisiones.setVisible((this.isVisibilidadCeldaNuevoGuiasRemisiones && this.isPermisoNuevoGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones));
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonModificarGuiasRemisiones.setVisible((this.isVisibilidadCeldaModificarGuiasRemisiones && this.isPermisoActualizarGuiasRemisiones));	
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonActualizarGuiasRemisiones.setVisible((this.isVisibilidadCeldaActualizarGuiasRemisiones && this.isPermisoActualizarGuiasRemisiones));	
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonEliminarGuiasRemisiones.setVisible((this.isVisibilidadCeldaEliminarGuiasRemisiones && this.isPermisoEliminarGuiasRemisiones));
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonCancelarGuiasRemisiones.setVisible(this.isVisibilidadCeldaCancelarGuiasRemisiones);							
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosGuiasRemisiones.setVisible((this.isVisibilidadCeldaGuardarGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones));			
			
			}
						
			this.jButtonGuardarCambiosTablaGuiasRemisiones.setVisible((this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaNuevoGuiasRemisiones && this.isPermisoNuevoGuiasRemisiones));						
			this.jButtonDuplicarToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaDuplicarGuiasRemisiones && this.isPermisoDuplicarGuiasRemisiones));						
			this.jButtonCopiarToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaCopiarGuiasRemisiones && this.isPermisoCopiarGuiasRemisiones));			
			this.jButtonVerFormToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaVerFormGuiasRemisiones && this.isPermisoVerFormGuiasRemisiones));			
			this.jButtonAbrirOrderByToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaOrdenGuiasRemisiones && this.isPermisoOrdenGuiasRemisiones));
			this.jButtonNuevoRelacionesToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones && this.isPermisoNuevoGuiasRemisiones));			
			this.jButtonNuevoGuardarCambiosToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaNuevoGuiasRemisiones && this.isPermisoNuevoGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones));			
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonModificarToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaModificarGuiasRemisiones && this.isPermisoActualizarGuiasRemisiones));	
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonActualizarToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaActualizarGuiasRemisiones  && this.isPermisoActualizarGuiasRemisiones));	
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonEliminarToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaEliminarGuiasRemisiones && this.isPermisoEliminarGuiasRemisiones));
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonCancelarToolBarGuiasRemisiones.setVisible(this.isVisibilidadCeldaCancelarGuiasRemisiones);				
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaGuardarGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGuiasRemisiones.setVisible((this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGuiasRemisiones.setVisible((this.isVisibilidadCeldaNuevoGuiasRemisiones && this.isPermisoNuevoGuiasRemisiones));			
			this.jMenuItemDuplicarGuiasRemisiones.setVisible((this.isVisibilidadCeldaDuplicarGuiasRemisiones && this.isPermisoDuplicarGuiasRemisiones));			
			this.jMenuItemCopiarGuiasRemisiones.setVisible((this.isVisibilidadCeldaCopiarGuiasRemisiones && this.isPermisoCopiarGuiasRemisiones));			
			this.jMenuItemVerFormGuiasRemisiones.setVisible((this.isVisibilidadCeldaVerFormGuiasRemisiones && this.isPermisoVerFormGuiasRemisiones));			
			this.jMenuItemAbrirOrderByGuiasRemisiones.setVisible((this.isVisibilidadCeldaOrdenGuiasRemisiones && this.isPermisoOrdenGuiasRemisiones));			
			//this.jMenuItemMostrarOcultarGuiasRemisiones.setVisible((this.isVisibilidadCeldaOrdenGuiasRemisiones && this.isPermisoOrdenGuiasRemisiones));
			this.jMenuItemDetalleAbrirOrderByGuiasRemisiones.setVisible((this.isVisibilidadCeldaOrdenGuiasRemisiones && this.isPermisoOrdenGuiasRemisiones));			
			//this.jMenuItemDetalleMostrarOcultarGuiasRemisiones.setVisible((this.isVisibilidadCeldaOrdenGuiasRemisiones && this.isPermisoOrdenGuiasRemisiones));			
			this.jMenuItemNuevoRelacionesGuiasRemisiones.setVisible((this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones && this.isPermisoNuevoGuiasRemisiones));			
			this.jMenuItemNuevoGuardarCambiosGuiasRemisiones.setVisible((this.isVisibilidadCeldaNuevoGuiasRemisiones && this.isPermisoNuevoGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones));									
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemModificarGuiasRemisiones.setVisible((this.isVisibilidadCeldaModificarGuiasRemisiones && this.isPermisoActualizarGuiasRemisiones));	
			this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemActualizarGuiasRemisiones.setVisible((this.isVisibilidadCeldaActualizarGuiasRemisiones && this.isPermisoActualizarGuiasRemisiones));	
			this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemEliminarGuiasRemisiones.setVisible((this.isVisibilidadCeldaEliminarGuiasRemisiones && this.isPermisoEliminarGuiasRemisiones));
			this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemCancelarGuiasRemisiones.setVisible(this.isVisibilidadCeldaCancelarGuiasRemisiones);				
			}
			
			this.jMenuItemGuardarCambiosGuiasRemisiones.setVisible((this.isVisibilidadCeldaGuardarGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones));						
			this.jMenuItemGuardarCambiosTablaGuiasRemisiones.setVisible((this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGuiasRemisiones=this.jButtonNuevoGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaDuplicarGuiasRemisiones=this.jButtonDuplicarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaCopiarGuiasRemisiones=this.jButtonCopiarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaVerFormGuiasRemisiones=this.jButtonVerFormGuiasRemisiones.isVisible();
			
			this.isVisibilidadCeldaOrdenGuiasRemisiones=this.jButtonAbrirOrderByGuiasRemisiones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=this.jButtonNuevoRelacionesGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaModificarGuiasRemisiones=this.jButtonModificarGuiasRemisiones.isVisible();
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			this.isVisibilidadCeldaActualizarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jButtonActualizarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaEliminarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jButtonEliminarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaCancelarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jButtonCancelarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaGuardarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosGuiasRemisiones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=this.jButtonGuardarCambiosTablaGuiasRemisiones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGuiasRemisiones=this.jButtonNuevoToolBarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=this.jButtonNuevoRelacionesToolBarGuiasRemisiones.isVisible();
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			this.isVisibilidadCeldaModificarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jButtonModificarToolBarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaActualizarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jButtonActualizarToolBarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaEliminarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jButtonEliminarToolBarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaCancelarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jButtonCancelarToolBarGuiasRemisiones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGuiasRemisiones=this.jButtonGuardarCambiosToolBarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=this.jButtonGuardarCambiosTablaToolBarGuiasRemisiones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGuiasRemisiones=this.jMenuItemNuevoGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=this.jMenuItemNuevoRelacionesGuiasRemisiones.isVisible();
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			this.isVisibilidadCeldaModificarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemModificarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaActualizarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemActualizarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaEliminarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemEliminarGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaCancelarGuiasRemisiones=this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemCancelarGuiasRemisiones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGuiasRemisiones=this.jMenuItemGuardarCambiosGuiasRemisiones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=this.jMenuItemGuardarCambiosTablaGuiasRemisiones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGuiasRemisiones(Boolean esInicializar) {
		if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.guiasremisionesSessionBean.getConGuardarRelaciones()) {
				//if(this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGuiasRemisiones();
			}
			
			this.inicializarActualizarBindingBotonesManualGuiasRemisiones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGuiasRemisiones() {
		this.jButtonNuevoGuiasRemisiones.setVisible(this.isPermisoNuevoGuiasRemisiones);			
		this.jButtonDuplicarGuiasRemisiones.setVisible(this.isPermisoDuplicarGuiasRemisiones);			
		this.jButtonCopiarGuiasRemisiones.setVisible(this.isPermisoCopiarGuiasRemisiones);			
		this.jButtonVerFormGuiasRemisiones.setVisible(this.isPermisoVerFormGuiasRemisiones);			
		
		this.jButtonAbrirOrderByGuiasRemisiones.setVisible(this.isPermisoOrdenGuiasRemisiones);					
		
		this.jButtonNuevoRelacionesGuiasRemisiones.setVisible(this.isPermisoNuevoGuiasRemisiones);			
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonModificarGuiasRemisiones.setVisible(this.isPermisoActualizarGuiasRemisiones);	
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonActualizarGuiasRemisiones.setVisible(this.isPermisoActualizarGuiasRemisiones);	
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonEliminarGuiasRemisiones.setVisible(this.isPermisoEliminarGuiasRemisiones);
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonCancelarGuiasRemisiones.setVisible(this.isVisibilidadCeldaCancelarGuiasRemisiones);						
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosGuiasRemisiones.setVisible(this.isPermisoGuardarCambiosGuiasRemisiones);							
		}
		
		this.jButtonGuardarCambiosTablaGuiasRemisiones.setVisible(this.isPermisoActualizarGuiasRemisiones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGuiasRemisiones() {
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonModificarGuiasRemisiones.setVisible(this.isPermisoActualizarGuiasRemisiones);	
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonActualizarGuiasRemisiones.setVisible(this.isPermisoActualizarGuiasRemisiones);	
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonEliminarGuiasRemisiones.setVisible(this.isPermisoEliminarGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonCancelarGuiasRemisiones.setVisible(this.isVisibilidadCeldaCancelarGuiasRemisiones);							
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosGuiasRemisiones.setVisible((this.isVisibilidadCeldaGuardarGuiasRemisiones && this.isPermisoGuardarCambiosGuiasRemisiones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGuiasRemisiones() {
		if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGuiasRemisiones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGuiasRemisiones() {
	}
	
	public void jTableDatosGuiasRemisionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGuiasRemisiones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.guiasremisiones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaGuiasRemisionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebGuiasRemisiones(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGuiasRemisiones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGuiasRemisiones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.guiasremisionesLogic.getConnexion());

				if(this.guiasremisiones.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.guiasremisiones.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGuiasRemisiones=(TitledBorder)this.jScrollPanelDatosGuiasRemisiones.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderGuiasRemisiones.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.guiasremisiones.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.guiasremisiones.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.guiasremisiones.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.guiasremisiones.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impreso_facturaGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getnumero_pre_impreso_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso_factura like '%"+this.guiasremisiones.getnumero_pre_impreso_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.guiasremisiones.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.guiasremisiones.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.guiasremisiones.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_transporteGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getnombre_tipo_transporte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_transporte like '%"+this.guiasremisiones.getnombre_tipo_transporte()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.guiasremisiones.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.guiasremisiones.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonotroGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.getotro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where otro = "+this.guiasremisiones.getotro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalGuiasRemisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.getguiasremisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guiasremisiones==null) {
						this.guiasremisiones = new GuiasRemisiones();
					}

					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);
				}

				if(this.guiasremisiones.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.guiasremisiones.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuiasRemisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaGuiasRemisionesGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGuiasRemisiones(false,false);

			this.getGuiasRemisionessBusquedaGuiasRemisiones();

			this.inicializarActualizarBindingGuiasRemisiones(false);

			//if(GuiasRemisionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGuiasRemisiones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaGuiasRemisionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGuiasRemisiones(false,false);

			this.getGuiasRemisionessFK_IdEmpresa();

			this.inicializarActualizarBindingGuiasRemisiones(false);

			//if(GuiasRemisionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGuiasRemisiones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guiasremisionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGuiasRemisiones() {
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
			this.jInternalFrameDetalleFormGuiasRemisiones.setVisible(false);	    			
			this.jInternalFrameDetalleFormGuiasRemisiones.dispose();
			this.jInternalFrameDetalleFormGuiasRemisiones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGuiasRemisiones!=null) {
			this.jInternalFrameReporteDinamicoGuiasRemisiones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGuiasRemisiones.dispose();
			this.jInternalFrameReporteDinamicoGuiasRemisiones=null;
		}
		
		if(this.jInternalFrameImportacionGuiasRemisiones!=null) {
			this.jInternalFrameImportacionGuiasRemisiones.setVisible(false);	    			
			this.jInternalFrameImportacionGuiasRemisiones.dispose();
			this.jInternalFrameImportacionGuiasRemisiones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGuiasRemisiones();
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoGuiasRemisiones")) {
				jButtonNuevoGuiasRemisionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGuiasRemisiones")) {
				jButtonDuplicarGuiasRemisionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGuiasRemisiones")) {
				jButtonCopiarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormGuiasRemisiones")) {
				jButtonVerFormGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGuiasRemisiones")) {
				jButtonNuevoGuiasRemisionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGuiasRemisiones")) {
				jButtonDuplicarGuiasRemisionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGuiasRemisiones")) {
				jButtonNuevoGuiasRemisionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGuiasRemisiones")) {
				jButtonDuplicarGuiasRemisionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGuiasRemisiones")) {
				jButtonNuevoGuiasRemisionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGuiasRemisiones")) {
				jButtonNuevoGuiasRemisionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGuiasRemisiones")) {
				jButtonNuevoGuiasRemisionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGuiasRemisiones")) {
				jButtonModificarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGuiasRemisiones")) {
				jButtonModificarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGuiasRemisiones")) {
				jButtonModificarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGuiasRemisiones")) {
				jButtonActualizarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGuiasRemisiones")) {
				jButtonActualizarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGuiasRemisiones")) {
				jButtonActualizarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarGuiasRemisiones")) {
				jButtonEliminarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGuiasRemisiones")) {
				jButtonEliminarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGuiasRemisiones")) {
				jButtonEliminarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarGuiasRemisiones")) {
				jButtonCancelarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGuiasRemisiones")) {
				jButtonCancelarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGuiasRemisiones")) {
				jButtonCancelarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarGuiasRemisiones")) {
				jButtonCerrarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGuiasRemisiones")) {
				jButtonCerrarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGuiasRemisiones")) {
				jButtonCerrarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGuiasRemisiones")) {
				jButtonMostrarOcultarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGuiasRemisiones")) {
				jButtonCancelarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGuiasRemisiones")) {
				jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGuiasRemisiones")) {
				jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGuiasRemisiones")) {
				jButtonCopiarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGuiasRemisiones")) {
				jButtonVerFormGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGuiasRemisiones")) {
				jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGuiasRemisiones")) {
				jButtonCopiarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGuiasRemisiones")) {
				jButtonVerFormGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGuiasRemisiones")) {
				jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGuiasRemisiones")) {
				jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGuiasRemisiones")) {
				jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGuiasRemisiones")) {
				jButtonRecargarInformacionGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGuiasRemisiones")) {
				jButtonRecargarInformacionGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGuiasRemisiones")) {
				jButtonRecargarInformacionGuiasRemisionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGuiasRemisiones")) {
				jButtonAnterioresGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGuiasRemisiones")) {
				jButtonAnterioresGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGuiasRemisiones")) {
				jButtonAnterioresGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGuiasRemisiones")) {
				jButtonSiguientesGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGuiasRemisiones")) {
				jButtonSiguientesGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGuiasRemisiones")) {
				jButtonSiguientesGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGuiasRemisiones") || sTipo.equals("MenuItemDetalleAbrirOrderByGuiasRemisiones")) {
				jButtonAbrirOrderByGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGuiasRemisiones") || sTipo.equals("MenuItemDetalleMostrarOcultarGuiasRemisiones")) {
				jButtonMostrarOcultarGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGuiasRemisiones")) {
				jButtonNuevoGuardarCambiosGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGuiasRemisiones")) {
				jButtonNuevoGuardarCambiosGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGuiasRemisiones")) {
				jButtonNuevoGuardarCambiosGuiasRemisionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGuiasRemisiones")) {
				jButtonCerrarReporteDinamicoGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGuiasRemisiones")) {
				jButtonGenerarReporteDinamicoGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGuiasRemisiones")) {
				
				jButtonGenerarExcelReporteDinamicoGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGuiasRemisiones")) {
				jButtonCerrarImportacionGuiasRemisionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGuiasRemisiones")) {
				
				jButtonGenerarImportacionGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGuiasRemisiones")) {
				
				jButtonAbrirImportacionGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGuiasRemisiones")) {
				jComboBoxTiposAccionesGuiasRemisionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGuiasRemisiones")) {
				jComboBoxTiposRelacionesGuiasRemisionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGuiasRemisiones")) {
				jComboBoxTiposAccionesGuiasRemisionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGuiasRemisiones")) {
				
				jComboBoxTiposSeleccionarGuiasRemisionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGuiasRemisiones")) {
				jTextFieldValorCampoGeneralGuiasRemisionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGuiasRemisiones")) {
				jButtonAbrirOrderByGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGuiasRemisiones")) {
				jButtonAbrirOrderByGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGuiasRemisiones")) {
				jButtonCerrarOrderByGuiasRemisionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGuiasRemisionesBusqueda")) {
				this.jButtonidGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGuiasRemisionesUpdate")) {
				this.jButtonid_empresaGuiasRemisionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGuiasRemisionesBusqueda")) {
				this.jButtonid_empresaGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeGuiasRemisionesBusqueda")) {
				this.jButtonfecha_emision_desdeGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaGuiasRemisionesBusqueda")) {
				this.jButtonfecha_emision_hastaGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteGuiasRemisionesBusqueda")) {
				this.jButtonnombre_completo_clienteGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaGuiasRemisionesBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialGuiasRemisionesBusqueda")) {
				this.jButtonsecuencialGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionGuiasRemisionesBusqueda")) {
				this.jButtonfecha_emisionGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoGuiasRemisionesBusqueda")) {
				this.jButtonfecha_vencimientoGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_transporteGuiasRemisionesBusqueda")) {
				this.jButtonnombre_tipo_transporteGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaGuiasRemisionesBusqueda")) {
				this.jButtonivaGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoGuiasRemisionesBusqueda")) {
				this.jButtondescuentoGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("otroGuiasRemisionesBusqueda")) {
				this.jButtonotroGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalGuiasRemisionesBusqueda")) {
				this.jButtontotalGuiasRemisionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaGuiasRemisionesGuiasRemisiones")) {
				this.jButtonBusquedaGuiasRemisionesGuiasRemisionesActionPerformed(evt);
			}
			
			;
			
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGuiasRemisiones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuiasRemisionesActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				


				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GuiasRemisiones guiasremisionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				guiasremisionesLocal=this.guiasremisiones;
			} else {
				guiasremisionesLocal=this.guiasremisionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
							
				
				


				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuiasRemisionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuiasRemisionesActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
								
						
				


				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
								
				
				


				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuiasRemisionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuiasRemisionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuiasRemisionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
							
				
				


				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuiasRemisionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuiasRemisionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
								
				
				


				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuiasRemisionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuiasRemisionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuiasRemisionesActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGuiasRemisiones")) {
					jCheckBoxSeleccionarTodosGuiasRemisionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGuiasRemisiones")) {
					jCheckBoxSeleccionadosGuiasRemisionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGuiasRemisiones")) {
					
				}
				
				


				
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
												
				
				


				
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuiasRemisionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuiasRemisionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuiasRemisionesActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guiasremisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guiasremisiones);
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuiasRemisiones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuiasRemisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuiasRemisionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guiasremisionesAnterior =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGuiasRemisiones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGuiasRemisionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGuiasRemisiones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.guiasremisiones =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.guiasremisiones =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.guiasremisiones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGuiasRemisiones")) {
				
				}
				
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGuiasRemisiones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGuiasRemisiones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGuiasRemisiones")) {
			
			}
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGuiasRemisiones();
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
			if(sTipo.equals("NuevoGuiasRemisiones")) {
				jButtonNuevoGuiasRemisionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGuiasRemisiones")) {
				jButtonDuplicarGuiasRemisionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGuiasRemisiones")) {
				jButtonCopiarGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGuiasRemisiones")) {
				jButtonVerFormGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGuiasRemisiones")) {
				jButtonNuevoGuiasRemisionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGuiasRemisiones")) {
				jButtonModificarGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGuiasRemisiones")) {
				jButtonActualizarGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGuiasRemisiones")) {
				jButtonEliminarGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGuiasRemisiones")) {
				jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGuiasRemisiones")) {
				jButtonCancelarGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGuiasRemisiones")) {
				jButtonCerrarGuiasRemisionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGuiasRemisiones")) {
				jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGuiasRemisiones")) {
				jButtonNuevoGuardarCambiosGuiasRemisionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGuiasRemisiones")) {
				jButtonAbrirOrderByGuiasRemisionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGuiasRemisiones")) {
				jButtonRecargarInformacionGuiasRemisionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGuiasRemisiones")) {
				jButtonAnterioresGuiasRemisionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGuiasRemisiones")) {
				jButtonSiguientesGuiasRemisionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGuiasRemisionesBusqueda")) {
				this.jButtonidGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGuiasRemisionesUpdate")) {
				this.jButtonid_empresaGuiasRemisionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGuiasRemisionesBusqueda")) {
				this.jButtonid_empresaGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeGuiasRemisionesBusqueda")) {
				this.jButtonfecha_emision_desdeGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaGuiasRemisionesBusqueda")) {
				this.jButtonfecha_emision_hastaGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteGuiasRemisionesBusqueda")) {
				this.jButtonnombre_completo_clienteGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaGuiasRemisionesBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialGuiasRemisionesBusqueda")) {
				this.jButtonsecuencialGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionGuiasRemisionesBusqueda")) {
				this.jButtonfecha_emisionGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoGuiasRemisionesBusqueda")) {
				this.jButtonfecha_vencimientoGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_transporteGuiasRemisionesBusqueda")) {
				this.jButtonnombre_tipo_transporteGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaGuiasRemisionesBusqueda")) {
				this.jButtonivaGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoGuiasRemisionesBusqueda")) {
				this.jButtondescuentoGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("otroGuiasRemisionesBusqueda")) {
				this.jButtonotroGuiasRemisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalGuiasRemisionesBusqueda")) {
				this.jButtontotalGuiasRemisionesBusquedaActionPerformed(evt);
			}
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGuiasRemisiones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGuiasRemisiones")) {
				closingInternalFrameGuiasRemisiones();
				
			} else if(sTipo.equals("jButtonCancelarGuiasRemisiones")) {
				JInternalFrameBase jInternalFrameDetalleFormGuiasRemisiones = (JInternalFrameBase)evt.getSource();
	            	
	            GuiasRemisionesBeanSwingJInternalFrame jInternalFrameParent=(GuiasRemisionesBeanSwingJInternalFrame)jInternalFrameDetalleFormGuiasRemisiones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGuiasRemisionesActionPerformed(null);
			}
			
			GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.guiasremisiones,new Object(),this.guiasremisionesParameterGeneral,this.guiasremisionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGuiasRemisiones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGuiasRemisiones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGuiasRemisiones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.guiasremisiones)) {
			if(!esControlTabla) {
				if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);			
				}
				
				if(this.guiasremisionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGuiasRemisiones(this.guiasremisiones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGuiasRemisiones(this.guiasremisionesReturnGeneral,this.guiasremisionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.guiasremisionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGuiasRemisiones(classes,this.guiasremisionesReturnGeneral,this.guiasremisionesBean,false);
					}
						
					if(this.guiasremisionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGuiasRemisiones(this.guiasremisionesReturnGeneral.getGuiasRemisiones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGuiasRemisiones(this.guiasremisionesReturnGeneral.getGuiasRemisiones());	
					}
						
					if(this.guiasremisionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGuiasRemisiones(this.guiasremisionesReturnGeneral.getGuiasRemisiones(),classes);//this.guiasremisionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGuiasRemisiones(this.guiasremisiones,classes);//this.guiasremisionesBean);									
				}
			
				if(GuiasRemisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGuiasRemisiones(this.guiasremisiones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGuiasRemisiones(this.guiasremisiones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.guiasremisionesAnterior!=null) {
						this.guiasremisiones=this.guiasremisionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.guiasremisionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.guiasremisionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.guiasremisionesReturnGeneral.getGuiasRemisiones(),guiasremisionesLogic.getGuiasRemisioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.guiasremisionesReturnGeneral.getGuiasRemisiones(),this.guiasremisioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGuiasRemisiones.repaint();
				
				//((AbstractTableModel) this.jTableDatosGuiasRemisiones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGuiasRemisiones();
			}
		}
	}
	
	public void actualizarVisualTableDatosGuiasRemisiones() throws Exception {
		
		GuiasRemisionesModel guiasremisionesModel=(GuiasRemisionesModel)this.jTableDatosGuiasRemisiones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			guiasremisionesModel.guiasremisioness=this.guiasremisionesLogic.getGuiasRemisioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			guiasremisionesModel.guiasremisioness=this.guiasremisioness;
		}
		
		
		((GuiasRemisionesModel) this.jTableDatosGuiasRemisiones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGuiasRemisiones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getguiasremisionesAnterior(),this.guiasremisionesLogic.getGuiasRemisioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getguiasremisionesAnterior(),this.guiasremisioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGuiasRemisiones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGuiasRemisiones(GuiasRemisiones guiasremisiones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.guiasremisiones,new Object(),generalEntityParameterGeneral,this.guiasremisionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.guiasremisionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GuiasRemisionesConstantesFunciones.getClassesRelationshipsOfGuiasRemisiones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GuiasRemisionesConstantesFunciones.getClassesRelationshipsFromStringsOfGuiasRemisiones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGuiasRemisiones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GuiasRemisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.guiasremisiones,new Object(),generalEntityParameterGeneral,this.guiasremisionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGuiasRemisiones(GuiasRemisionesBean guiasremisionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGuiasRemisiones(ArrayList<Classe> classes,GuiasRemisionesReturnGeneral guiasremisionesReturnGeneral,GuiasRemisionesBean guiasremisionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGuiasRemisiones(GuiasRemisiones guiasremisiones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.guiasremisiones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGuiasRemisiones = new GuiasRemisionesDetalleFormJInternalFrame(jDesktopPane,this.guiasremisionesSessionBean.getConGuardarRelaciones(),this.guiasremisionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.setVisible(false);
		this.jInternalFrameDetalleFormGuiasRemisiones.setSelected(false);						
		
		this.jInternalFrameDetalleFormGuiasRemisiones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGuiasRemisiones.guiasremisionesLogic=this.guiasremisionesLogic;
		
		this.cargarCombosFrameForeignKeyGuiasRemisiones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGuiasRemisiones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGuiasRemisiones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGuiasRemisiones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGuiasRemisiones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGuiasRemisiones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGuiasRemisiones"));
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonModificarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"ModificarGuiasRemisiones"));

		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonModificarToolBarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"ModificarToolBarGuiasRemisiones"));
					
		this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemModificarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"MenuItemModificarGuiasRemisiones"));		
		
		
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonActualizarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"ActualizarGuiasRemisiones"));
		
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonActualizarToolBarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGuiasRemisiones"));
						
		this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemActualizarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGuiasRemisiones"));		
		
		
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonEliminarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"EliminarGuiasRemisiones"));
		
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonEliminarToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"EliminarToolBarGuiasRemisiones"));
								
		this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemEliminarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGuiasRemisiones"));		
		
		
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonCancelarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"CancelarGuiasRemisiones"));
		
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonCancelarToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"CancelarToolBarGuiasRemisiones"));
					
		this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemCancelarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGuiasRemisiones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemDetalleCerrarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGuiasRemisiones"));		
		
		
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGuiasRemisiones"));
		
		
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGuiasRemisiones"));
		
		
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGuiasRemisiones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonidGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"idGuiasRemisionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonid_empresaGuiasRemisionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGuiasRemisionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonid_empresaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_emision_desdeGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_emision_hastaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonnombre_completo_clienteGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonsecuencialGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"secuencialGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_emisionGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_vencimientoGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_transporteGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonivaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"ivaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtondescuentoGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"descuentoGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonotroGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"otroGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtontotalGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"totalGuiasRemisionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGuiasRemisiones.jTabbedPaneRelacionesGuiasRemisiones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGuiasRemisiones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGuiasRemisiones"));
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGuiasRemisiones"));
		}
		
		this.jTableDatosGuiasRemisiones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGuiasRemisiones"));
		
		this.jTableDatosGuiasRemisiones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGuiasRemisiones"));
		
		this.jButtonNuevoGuiasRemisiones.addActionListener(new ButtonActionListener(this,"NuevoGuiasRemisiones"));
		
		this.jButtonDuplicarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"DuplicarGuiasRemisiones"));
		
		this.jButtonCopiarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"CopiarGuiasRemisiones"));
		
		this.jButtonVerFormGuiasRemisiones.addActionListener(new ButtonActionListener(this,"VerFormGuiasRemisiones"));
		
		
		this.jButtonNuevoToolBarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"NuevoToolBarGuiasRemisiones"));
			
		this.jButtonDuplicarToolBarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGuiasRemisiones"));
			
		this.jMenuItemNuevoGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuiasRemisiones"));
			
		this.jMenuItemDuplicarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGuiasRemisiones"));		
		
		
		this.jButtonNuevoRelacionesGuiasRemisiones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGuiasRemisiones"));
		
		
		this.jButtonNuevoRelacionesToolBarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGuiasRemisiones"));
			
		this.jMenuItemNuevoRelacionesGuiasRemisiones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGuiasRemisiones"));		
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonModificarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"ModificarGuiasRemisiones"));
		}
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonModificarToolBarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"ModificarToolBarGuiasRemisiones"));
			
			this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemModificarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"MenuItemModificarGuiasRemisiones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonActualizarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"ActualizarGuiasRemisiones"));
		}
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonActualizarToolBarGuiasRemisiones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGuiasRemisiones"));
				
			this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemActualizarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGuiasRemisiones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonEliminarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"EliminarGuiasRemisiones"));
		}
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonEliminarToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"EliminarToolBarGuiasRemisiones"));
						
			this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemEliminarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGuiasRemisiones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonCancelarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"CancelarGuiasRemisiones"));
		}
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonCancelarToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"CancelarToolBarGuiasRemisiones"));
			
			this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemCancelarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGuiasRemisiones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGuiasRemisiones"));		
		
		
		this.jButtonCerrarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"CerrarGuiasRemisiones"));
		
		
		this.jButtonCerrarToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"CerrarToolBarGuiasRemisiones"));
			
		this.jMenuItemCerrarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGuiasRemisiones"));
			
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jMenuItemDetalleCerrarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGuiasRemisiones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosGuiasRemisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosGuiasRemisiones"));
		}
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGuiasRemisiones"));
		}
		
		this.jButtonCopiarToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"CopiarToolBarGuiasRemisiones"));
			
		this.jButtonVerFormToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"VerFormToolBarGuiasRemisiones"));
		
		this.jMenuItemGuardarCambiosGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGuiasRemisiones"));
			
		this.jMenuItemCopiarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGuiasRemisiones"));		
		
		this.jMenuItemVerFormGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGuiasRemisiones"));		
		
		
		this.jButtonGuardarCambiosTablaGuiasRemisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGuiasRemisiones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGuiasRemisiones"));
			
		this.jMenuItemGuardarCambiosTablaGuiasRemisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGuiasRemisiones"));		
		
		
		
		this.jButtonRecargarInformacionGuiasRemisiones.addActionListener (new ButtonActionListener(this,"RecargarInformacionGuiasRemisiones"));
					
		this.jButtonRecargarInformacionToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGuiasRemisiones"));
		
		this.jMenuItemRecargarInformacionGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGuiasRemisiones"));		
		
		
		
		this.jButtonAnterioresGuiasRemisiones.addActionListener (new ButtonActionListener(this,"AnterioresGuiasRemisiones"));
		
		
		this.jButtonAnterioresToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGuiasRemisiones"));
		
		this.jMenuItemAnterioresGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGuiasRemisiones"));		
		
		
		this.jButtonSiguientesGuiasRemisiones.addActionListener (new ButtonActionListener(this,"SiguientesGuiasRemisiones"));
		
		
		this.jButtonSiguientesToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGuiasRemisiones"));
			
		this.jMenuItemSiguientesGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGuiasRemisiones"));
			
		this.jMenuItemAbrirOrderByGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGuiasRemisiones"));
			
		this.jMenuItemMostrarOcultarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGuiasRemisiones"));
			
		this.jMenuItemDetalleAbrirOrderByGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGuiasRemisiones"));
			
		this.jMenuItemDetalleMostarOcultarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGuiasRemisiones"));		
		
		
		this.jButtonNuevoGuardarCambiosGuiasRemisiones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGuiasRemisiones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGuiasRemisiones"));
			
		this.jMenuItemNuevoGuardarCambiosGuiasRemisiones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGuiasRemisiones"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGuiasRemisiones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGuiasRemisiones"));

		this.jCheckBoxSeleccionadosGuiasRemisiones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGuiasRemisiones"));
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGuiasRemisiones"));
		}
		
		
		this.jComboBoxTiposRelacionesGuiasRemisiones.addActionListener (new ButtonActionListener(this,"TiposRelacionesGuiasRemisiones"));
			
		this.jComboBoxTiposAccionesGuiasRemisiones.addActionListener (new ButtonActionListener(this,"TiposAccionesGuiasRemisiones"));
					
		this.jComboBoxTiposSeleccionarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGuiasRemisiones"));
			
		this.jTextFieldValorCampoGeneralGuiasRemisiones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGuiasRemisiones"));		
		
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonidGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"idGuiasRemisionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonid_empresaGuiasRemisionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGuiasRemisionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonid_empresaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_emision_desdeGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_emision_hastaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonnombre_completo_clienteGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonsecuencialGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"secuencialGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_emisionGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_vencimientoGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_transporteGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonivaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"ivaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtondescuentoGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"descuentoGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonotroGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"otroGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtontotalGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"totalGuiasRemisionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaGuiasRemisionesGuiasRemisiones.addActionListener(new ButtonActionListener(this,"BusquedaGuiasRemisionesGuiasRemisiones"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGuiasRemisiones!=null) {
				this.jInternalFrameReporteDinamicoGuiasRemisiones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGuiasRemisiones"));
				this.jInternalFrameReporteDinamicoGuiasRemisiones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGuiasRemisiones"));
				this.jInternalFrameReporteDinamicoGuiasRemisiones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGuiasRemisiones"));
			}
			
			//this.jButtonCerrarReporteDinamicoGuiasRemisiones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGuiasRemisiones"));				
			//this.jButtonGenerarReporteDinamicoGuiasRemisiones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGuiasRemisiones"));
			//this.jButtonGenerarExcelReporteDinamicoGuiasRemisiones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGuiasRemisiones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGuiasRemisiones!=null) {
				this.jInternalFrameImportacionGuiasRemisiones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGuiasRemisiones"));
				this.jInternalFrameImportacionGuiasRemisiones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGuiasRemisiones"));
				this.jInternalFrameImportacionGuiasRemisiones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGuiasRemisiones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGuiasRemisiones.addActionListener (new ButtonActionListener(this,"AbrirOrderByGuiasRemisiones"));
			
			this.jButtonAbrirOrderByToolBarGuiasRemisiones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGuiasRemisiones"));			
			
			if(this.jInternalFrameOrderByGuiasRemisiones!=null) {
				this.jInternalFrameOrderByGuiasRemisiones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGuiasRemisiones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuiasRemisiones.jTabbedPaneRelacionesGuiasRemisiones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGuiasRemisiones"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameGuiasRemisiones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGuiasRemisiones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGuiasRemisiones = (JInternalFrameBase)event.getSource();
	            	
	            GuiasRemisionesBeanSwingJInternalFrame jInternalFrameParent=(GuiasRemisionesBeanSwingJInternalFrame)jInternalFrameDetalleFormGuiasRemisiones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGuiasRemisionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGuiasRemisiones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGuiasRemisionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGuiasRemisiones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGuiasRemisiones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuiasRemisionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuiasRemisionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuiasRemisionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGuiasRemisiones";
		inputMap = this.jButtonNuevoGuiasRemisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGuiasRemisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGuiasRemisionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuiasRemisionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuiasRemisionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuiasRemisionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGuiasRemisiones";
		inputMap = this.jButtonNuevoRelacionesGuiasRemisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGuiasRemisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGuiasRemisionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGuiasRemisiones";
		inputMap = this.jButtonModificarGuiasRemisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGuiasRemisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGuiasRemisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGuiasRemisiones";
		inputMap = this.jButtonActualizarGuiasRemisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGuiasRemisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGuiasRemisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGuiasRemisiones";
		inputMap = this.jButtonEliminarGuiasRemisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGuiasRemisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGuiasRemisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGuiasRemisiones";
		inputMap = this.jButtonCancelarGuiasRemisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGuiasRemisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGuiasRemisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGuiasRemisiones";
		inputMap = this.jButtonCerrarGuiasRemisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGuiasRemisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGuiasRemisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGuiasRemisiones";
		inputMap = this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosGuiasRemisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonGuardarCambiosGuiasRemisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGuiasRemisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGuiasRemisiones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGuiasRemisionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGuiasRemisiones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGuiasRemisionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGuiasRemisiones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGuiasRemisionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGuiasRemisiones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGuiasRemisionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonidGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"idGuiasRemisionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonid_empresaGuiasRemisionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGuiasRemisionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonid_empresaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_emision_desdeGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_emision_hastaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonnombre_completo_clienteGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonsecuencialGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"secuencialGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_emisionGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonfecha_vencimientoGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_transporteGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonivaGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"ivaGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtondescuentoGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"descuentoGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtonotroGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"otroGuiasRemisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuiasRemisiones.jButtontotalGuiasRemisionesBusqueda.addActionListener(new ButtonActionListener(this,"totalGuiasRemisionesBusqueda"));
		
		
		this.jButtonBusquedaGuiasRemisionesGuiasRemisiones.addActionListener(new ButtonActionListener(this,"BusquedaGuiasRemisionesGuiasRemisiones"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGuiasRemisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGuiasRemisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGuiasRemisionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGuiasRemisiones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGuiasRemisiones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GuiasRemisiones guiasremisionesAux:this.guiasremisionesLogic.getGuiasRemisioness()) {
					guiasremisionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GuiasRemisiones guiasremisionesAux:guiasremisioness) {
					guiasremisionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGuiasRemisionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGuiasRemisiones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GuiasRemisiones guiasremisionesAux:this.guiasremisionesLogic.getGuiasRemisioness()) {
						guiasremisionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GuiasRemisiones guiasremisionesAux:guiasremisioness) {
						guiasremisionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GuiasRemisiones guiasremisionesAux:this.guiasremisionesLogic.getGuiasRemisioness()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GuiasRemisiones guiasremisionesAux:guiasremisioness) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGuiasRemisiones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGuiasRemisiones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGuiasRemisiones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGuiasRemisionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGuiasRemisiones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGuiasRemisiones.getSelectedRows();
			
			GuiasRemisiones guiasremisionesLocal=new GuiasRemisiones();
			
			//this.seleccionarTodosGuiasRemisiones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					guiasremisionesLocal =(GuiasRemisiones) this.guiasremisionesLogic.getGuiasRemisioness().toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					guiasremisionesLocal =(GuiasRemisiones) this.guiasremisioness.toArray()[this.jTableDatosGuiasRemisiones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				guiasremisionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GuiasRemisiones guiasremisionesAux:this.guiasremisionesLogic.getGuiasRemisioness()) {
						guiasremisionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GuiasRemisiones guiasremisionesAux:guiasremisioness) {
						guiasremisionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGuiasRemisiones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGuiasRemisiones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGuiasRemisiones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGuiasRemisiones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGuiasRemisionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGuiasRemisionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGuiasRemisionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGuiasRemisiones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGuiasRemisiones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GuiasRemisiones guiasremisionesAux:this.guiasremisionesLogic.getGuiasRemisioness()) {
				
						if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							guiasremisionesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							guiasremisionesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							guiasremisionesAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							guiasremisionesAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							guiasremisionesAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							guiasremisionesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							guiasremisionesAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE)) {
							existe=true;
							guiasremisionesAux.setnombre_tipo_transporte(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_IVA)) {
							existe=true;
							guiasremisionesAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							guiasremisionesAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_OTRO)) {
							existe=true;
							guiasremisionesAux.setotro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							guiasremisionesAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GuiasRemisiones guiasremisionesAux:guiasremisioness) {
					
						if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							guiasremisionesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							guiasremisionesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							guiasremisionesAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							guiasremisionesAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							guiasremisionesAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							guiasremisionesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							guiasremisionesAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE)) {
							existe=true;
							guiasremisionesAux.setnombre_tipo_transporte(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_IVA)) {
							existe=true;
							guiasremisionesAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							guiasremisionesAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_OTRO)) {
							existe=true;
							guiasremisionesAux.setotro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							guiasremisionesAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGuiasRemisiones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGuiasRemisionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGuiasRemisiones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGuiasRemisiones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGuiasRemisiones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGuiasRemisiones) {				
					conSplash=true;//false;										
					
					//this.startProcessGuiasRemisiones(conSplash);
				
					this.generarReporteGuiasRemisionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGuiasRemisionessSeleccionados();
				//this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGuiasRemisionessSeleccionados(false);
				//this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGuiasRemisionessSeleccionados(true);
				//this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGuiasRemisiones();
				
				this.exportarGuiasRemisionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGuiasRemisioness();
				//this.importarGuiasRemisioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGuiasRemisiones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGuiasRemisionessSeleccionados();
				//this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Guias Remisiones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGuiasRemisiones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGuiasRemisiones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGuiasRemisiones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Guias Remisiones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.setSelectedIndex(0);					
				}	
			} 			
			else if(GuiasRemisionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteGuiasRemisiones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessGuiasRemisiones(conSplash);
					
						//this.actualizarParametrosGeneralGuiasRemisiones();
						
						this.generarReporteProcesoAccionGuiasRemisionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(GuiasRemisionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Guias RemisionesES SELECCIONADOS?", "MANTENIMIENTO DE Guias Remisiones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessGuiasRemisiones();
				
						this.actualizarParametrosGeneralGuiasRemisiones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.guiasremisionesReturnGeneral=guiasremisionesLogic.procesarAccionGuiasRemisionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.guiasremisionesLogic.getGuiasRemisioness(),this.guiasremisionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarGuiasRemisionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGuiasRemisiones();
					
					GuiasRemisionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarGuiasRemisionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGuiasRemisiones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxTiposAccionesFormularioGuiasRemisiones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGuiasRemisiones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGuiasRemisionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGuiasRemisiones();
			
			if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();		
			GuiasRemisiones guiasremisiones=new GuiasRemisiones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGuiasRemisiones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGuiasRemisiones.getSelectedItem();
			
			
			
			
			guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(guiasremisionessSeleccionados.size()==1) {
				for(GuiasRemisiones guiasremisionesAux:guiasremisionessSeleccionados) {
					guiasremisiones=guiasremisionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGuiasRemisiones();
			
      		//this.finishProcessGuiasRemisiones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGuiasRemisionesReturnGeneral() throws Exception {
		if(this.guiasremisionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.guiasremisionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.guiasremisionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.guiasremisionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.guiasremisionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.guiasremisionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGuiasRemisiones(false);
		}
		
		if(this.guiasremisionesReturnGeneral.getConRetornoLista() || this.guiasremisionesReturnGeneral.getConRetornoObjeto()) {
			if(this.guiasremisionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.guiasremisionesLogic.setGuiasRemisioness(this.guiasremisionesReturnGeneral.getGuiasRemisioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingGuiasRemisiones(false);
		}
	}
	
	public void actualizarParametrosGeneralGuiasRemisiones() throws Exception {
		
		
	}
	
	public ArrayList<GuiasRemisiones> getGuiasRemisionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGuiasRemisiones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GuiasRemisiones guiasremisionesAux:guiasremisionesLogic.getGuiasRemisioness()) {
					if(guiasremisionesAux.getIsSelected()) {
						guiasremisionessSeleccionados.add(guiasremisionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GuiasRemisiones guiasremisionesAux:this.guiasremisioness) {
					if(guiasremisionesAux.getIsSelected()) {
						guiasremisionessSeleccionados.add(guiasremisionesAux);				
					}
				}
			}
			
			if(guiasremisionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						guiasremisionessSeleccionados.addAll(this.guiasremisionesLogic.getGuiasRemisioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						guiasremisionessSeleccionados.addAll(this.guiasremisioness);				
					}
				}
			}
		} else {
			guiasremisionessSeleccionados.add(this.guiasremisiones);
		}
		
		return guiasremisionessSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteGuiasRemisionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGuiasRemisionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGuiasRemisionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGuiasRemisionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGuiasRemisionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Guias Remisiones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGuiasRemisionessSeleccionados() throws Exception {
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();		
		
		guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGuiasRemisioness("Todos",guiasremisionessSeleccionados);
		
	}	
	
	public void generarReporteNormalGuiasRemisionessSeleccionados() throws Exception {
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();		
		
		guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGuiasRemisioness("Todos",guiasremisionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGuiasRemisionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();
		
		guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGuiasRemisioness("Todos",guiasremisionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGuiasRemisionessSeleccionados() throws Exception {
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGuiasRemisiones();
		
		
		guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGuiasRemisiones();
		
		
		//this.generarReporteGuiasRemisioness("Todos",guiasremisionessSeleccionados ,guiasremisionesImplementable,guiasremisionesImplementableHome);
	}
	
	public void mostrarImportacionGuiasRemisioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGuiasRemisiones();
		
		this.abrirFrameImportacionGuiasRemisiones();		
		
			
		//this.generarReporteGuiasRemisioness("Todos",guiasremisionessSeleccionados ,guiasremisionesImplementable,guiasremisionesImplementableHome);
	}
	
	public void importarGuiasRemisioness() throws Exception {		
	
	}
	
	public void exportarGuiasRemisionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGuiasRemisionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGuiasRemisionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGuiasRemisionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Guias Remisiones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGuiasRemisionessSeleccionados() throws Exception {
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();		
		
		guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guiasremisiones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGuiasRemisiones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GuiasRemisiones guiasremisionesAux:guiasremisionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGuiasRemisiones(guiasremisionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//guiasremisionesAux.setsDetalleGeneralEntityReporte(guiasremisionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guias Remisiones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGuiasRemisiones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_OTRO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuiasRemisionesConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGuiasRemisiones(GuiasRemisiones guiasremisiones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=guiasremisiones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getnumero_pre_impreso_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getnombre_tipo_transporte();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.getotro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guiasremisiones.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGuiasRemisionessSeleccionados() throws Exception {
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();		
		
		guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guiasremisiones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GuiasRemisioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGuiasRemisiones(row);				
				iRow++;
			}				
			
			for(GuiasRemisiones guiasremisionesAux:guiasremisionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGuiasRemisiones(guiasremisionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guias Remisiones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGuiasRemisionessSeleccionados() throws Exception {
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();		
		
		guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guiasremisiones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("guiasremisioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("guiasremisiones");
			//elementRoot.appendChild(element);
		
			for(GuiasRemisiones guiasremisionesAux:guiasremisionessSeleccionados) {
				element = document.createElement("guiasremisiones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGuiasRemisiones(guiasremisionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guias Remisiones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGuiasRemisiones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_OTRO);
		cell = row.createCell(iColumn++);cell.setCellValue(GuiasRemisionesConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGuiasRemisiones(GuiasRemisiones guiasremisiones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getnumero_pre_impreso_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getnombre_tipo_transporte());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.getotro());
		cell = row.createCell(iColumn++);cell.setCellValue(guiasremisiones.gettotal());				
	}
	
	public void setFilaDatosExportarXmlGuiasRemisiones(GuiasRemisiones guiasremisiones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GuiasRemisionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(guiasremisiones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GuiasRemisionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(guiasremisiones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(GuiasRemisionesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(guiasremisiones.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_emision_desde = document.createElement(GuiasRemisionesConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(guiasremisiones.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(GuiasRemisionesConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(guiasremisiones.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_completo_cliente = document.createElement(GuiasRemisionesConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(guiasremisiones.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnumero_pre_impreso_factura = document.createElement(GuiasRemisionesConstantesFunciones.NUMEROPREIMPRESOFACTURA);
		elementnumero_pre_impreso_factura.appendChild(document.createTextNode(guiasremisiones.getnumero_pre_impreso_factura().trim()));
		element.appendChild(elementnumero_pre_impreso_factura);

		Element elementsecuencial = document.createElement(GuiasRemisionesConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(guiasremisiones.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha_emision = document.createElement(GuiasRemisionesConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(guiasremisiones.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(GuiasRemisionesConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(guiasremisiones.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementnombre_tipo_transporte = document.createElement(GuiasRemisionesConstantesFunciones.NOMBRETIPOTRANSPORTE);
		elementnombre_tipo_transporte.appendChild(document.createTextNode(guiasremisiones.getnombre_tipo_transporte().trim()));
		element.appendChild(elementnombre_tipo_transporte);

		Element elementiva = document.createElement(GuiasRemisionesConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(guiasremisiones.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescuento = document.createElement(GuiasRemisionesConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(guiasremisiones.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementotro = document.createElement(GuiasRemisionesConstantesFunciones.OTRO);
		elementotro.appendChild(document.createTextNode(guiasremisiones.getotro().toString().trim()));
		element.appendChild(elementotro);

		Element elementtotal = document.createElement(GuiasRemisionesConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(guiasremisiones.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoGuiasRemisionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GuiasRemisiones> guiasremisionessSeleccionados=new ArrayList<GuiasRemisiones>();
		
		guiasremisionessSeleccionados=this.getGuiasRemisionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoGuiasRemisiones(guiasremisionessSeleccionados);
		
		this.generarReporteGuiasRemisioness("Todos",guiasremisionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGuiasRemisiones(ArrayList<GuiasRemisiones> guiasremisionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GuiasRemisiones guiasremisionesAux:guiasremisionessSeleccionados) {
				guiasremisionesAux.setsDetalleGeneralEntityReporte(guiasremisionesAux.toString());
			
				if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					guiasremisionesAux.setsDescripcionGeneralEntityReporte1(guiasremisionesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					guiasremisionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(guiasremisionesAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					guiasremisionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(guiasremisionesAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					guiasremisionesAux.setsDescripcionGeneralEntityReporte1(guiasremisionesAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
					existe=true;
					guiasremisionesAux.setsDescripcionGeneralEntityReporte1(guiasremisionesAux.getnumero_pre_impreso_factura());
				}
				 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					guiasremisionesAux.setsDescripcionGeneralEntityReporte1(guiasremisionesAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					guiasremisionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(guiasremisionesAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					guiasremisionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(guiasremisionesAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE)) {
					existe=true;
					guiasremisionesAux.setsDescripcionGeneralEntityReporte1(guiasremisionesAux.getnombre_tipo_transporte());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuiasRemisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGuiasRemisiones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGuiasRemisiones=true;
				this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=true;
				this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=true;
			}
			
			this.isVisibilidadCeldaModificarGuiasRemisiones=false;
			this.isVisibilidadCeldaActualizarGuiasRemisiones=false;
			this.isVisibilidadCeldaEliminarGuiasRemisiones=false;
			this.isVisibilidadCeldaCancelarGuiasRemisiones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=true;
				} else {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGuiasRemisiones=false;
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=false;
			this.isVisibilidadCeldaModificarGuiasRemisiones=false;
			this.isVisibilidadCeldaActualizarGuiasRemisiones=true;
			this.isVisibilidadCeldaEliminarGuiasRemisiones=false;
			this.isVisibilidadCeldaCancelarGuiasRemisiones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=true;
				} else {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGuiasRemisiones=false;
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=false;
			this.isVisibilidadCeldaModificarGuiasRemisiones=false;
			this.isVisibilidadCeldaActualizarGuiasRemisiones=true;
			this.isVisibilidadCeldaEliminarGuiasRemisiones=true;
			this.isVisibilidadCeldaCancelarGuiasRemisiones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=true;
				} else {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGuiasRemisiones=false;
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=false;
			this.isVisibilidadCeldaModificarGuiasRemisiones=false;
			this.isVisibilidadCeldaActualizarGuiasRemisiones=true;
			this.isVisibilidadCeldaEliminarGuiasRemisiones=false;
			this.isVisibilidadCeldaCancelarGuiasRemisiones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
				} else {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGuiasRemisiones=true;
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=true;
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=true;
			this.isVisibilidadCeldaModificarGuiasRemisiones=false;
			this.isVisibilidadCeldaActualizarGuiasRemisiones=false;
			this.isVisibilidadCeldaEliminarGuiasRemisiones=false;
			this.isVisibilidadCeldaCancelarGuiasRemisiones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=true;
				} else {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGuiasRemisiones=false;
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=false;
			this.isVisibilidadCeldaActualizarGuiasRemisiones=false;
			this.isVisibilidadCeldaEliminarGuiasRemisiones=false;
			this.isVisibilidadCeldaCancelarGuiasRemisiones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
				} else {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGuiasRemisiones=false;
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=false;
			this.isVisibilidadCeldaModificarGuiasRemisiones=true;
			this.isVisibilidadCeldaActualizarGuiasRemisiones=false;
			this.isVisibilidadCeldaEliminarGuiasRemisiones=false;
			this.isVisibilidadCeldaCancelarGuiasRemisiones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
				} else {
					this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GuiasRemisionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGuiasRemisiones=true;
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=true;
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=true;
		} else {
			this.actualizarEstadoPanelsGuiasRemisiones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGuiasRemisiones=false;
			//this.isVisibilidadCeldaVerFormGuiasRemisiones=false;
			this.isVisibilidadCeldaDuplicarGuiasRemisiones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!guiasremisionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;
		} else {
			this.isVisibilidadCeldaNuevoGuiasRemisiones=false;
			this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(guiasremisionesSessionBean.getEsGuardarRelacionado()) {
			if(!guiasremisionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;												
			}
			
			this.jButtonCerrarGuiasRemisiones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;
		}
		
		if(!this.permiteMantenimiento(this.guiasremisiones)) {
			this.isVisibilidadCeldaActualizarGuiasRemisiones=false;
			this.isVisibilidadCeldaEliminarGuiasRemisiones=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoGuiasRemisiones=false;
		this.isVisibilidadCeldaNuevoRelacionesGuiasRemisiones=false;
		this.isVisibilidadCeldaGuardarCambiosGuiasRemisiones=false;
		//this.isVisibilidadCeldaModificarGuiasRemisiones=true;
		this.isVisibilidadCeldaActualizarGuiasRemisiones=false;
		this.isVisibilidadCeldaEliminarGuiasRemisiones=false;
		//this.isVisibilidadCeldaCancelarGuiasRemisiones=true;			
		this.isVisibilidadCeldaGuardarGuiasRemisiones=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGuiasRemisiones() {
	}
	
	public void actualizarEstadoPanelsGuiasRemisiones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGuiasRemisiones!=null) {
				this.jScrollPanelDatosEdicionGuiasRemisiones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuiasRemisiones!=null) {
				this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGuiasRemisiones!=null) {
				this.jScrollPanelDatosGuiasRemisiones.setVisible(true);
			}
			
			if(this.jPanelPaginacionGuiasRemisiones!=null) {
				this.jPanelPaginacionGuiasRemisiones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGuiasRemisiones!=null) {
				this.jPanelParametrosReportesGuiasRemisiones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGuiasRemisiones!=null) {
				this.jScrollPanelDatosEdicionGuiasRemisiones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuiasRemisiones!=null) {
				this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGuiasRemisiones!=null) {
				this.jScrollPanelDatosGuiasRemisiones.setVisible(false);
			}
			
			if(this.jPanelPaginacionGuiasRemisiones!=null) {
				this.jPanelPaginacionGuiasRemisiones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGuiasRemisiones!=null) {
				this.jPanelParametrosReportesGuiasRemisiones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGuiasRemisiones!=null) {
				this.jScrollPanelDatosEdicionGuiasRemisiones.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuiasRemisiones!=null) {
				this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGuiasRemisiones!=null) {
				this.jScrollPanelDatosGuiasRemisiones.setVisible(false);
			}
			
			if(this.jPanelPaginacionGuiasRemisiones!=null) {
				this.jPanelPaginacionGuiasRemisiones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGuiasRemisiones!=null) {
				this.jPanelParametrosReportesGuiasRemisiones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGuiasRemisiones!=null) {
				this.jScrollPanelDatosEdicionGuiasRemisiones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuiasRemisiones!=null) {
				this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGuiasRemisiones!=null) {
				this.jScrollPanelDatosGuiasRemisiones.setVisible(false);
			}
			
			if(this.jPanelPaginacionGuiasRemisiones!=null) {
				this.jPanelPaginacionGuiasRemisiones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGuiasRemisiones!=null) {
				this.jPanelParametrosReportesGuiasRemisiones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGuiasRemisiones!=null) {
				this.jScrollPanelDatosEdicionGuiasRemisiones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuiasRemisiones!=null) {
				this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGuiasRemisiones!=null) {
				this.jScrollPanelDatosGuiasRemisiones.setVisible(true);
			}
			
			if(this.jPanelPaginacionGuiasRemisiones!=null) {
				this.jPanelPaginacionGuiasRemisiones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGuiasRemisiones!=null) {
				this.jPanelParametrosReportesGuiasRemisiones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGuiasRemisiones!=null) {
				this.jScrollPanelDatosEdicionGuiasRemisiones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuiasRemisiones!=null) {
				this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGuiasRemisiones!=null) {
				this.jScrollPanelDatosGuiasRemisiones.setVisible(true);
			}
			
			if(this.jPanelPaginacionGuiasRemisiones!=null) {
				this.jPanelPaginacionGuiasRemisiones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGuiasRemisiones!=null) {
				this.jPanelParametrosReportesGuiasRemisiones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGuiasRemisiones!=null) {
				this.jScrollPanelDatosEdicionGuiasRemisiones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuiasRemisiones!=null) {
				this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGuiasRemisiones!=null) {
				this.jScrollPanelDatosGuiasRemisiones.setVisible(true);
			}
			
			if(this.jPanelPaginacionGuiasRemisiones!=null) {
				this.jPanelPaginacionGuiasRemisiones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGuiasRemisiones!=null) {
				this.jPanelParametrosReportesGuiasRemisiones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGuiasRemisiones!=null) {
					this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGuiasRemisiones!=null) {
				this.jPanelParametrosReportesGuiasRemisiones.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuiasRemisiones!=null) {
				this.jTabbedPaneBusquedasGuiasRemisiones.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGuiasRemisiones!=null) {
				this.jPanelParametrosReportesGuiasRemisiones.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaGuiasRemisiones=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaGuiasRemisiones) {this.jTabbedPaneBusquedasGuiasRemisiones.remove(jPanelBusquedaGuiasRemisionesGuiasRemisiones);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaGuiasRemisiones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGuiasRemisiones() {
		this.updateBorderResaltarBusquedasFormularioGuiasRemisiones();
		this.updateVisibilidadBusquedasFormularioGuiasRemisiones();
		this.updateHabilitarBusquedasFormularioGuiasRemisiones();
	}
	
	public void updateBorderResaltarBusquedasFormularioGuiasRemisiones() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGuiasRemisiones.getComponents().length>0) {
	

		if(this.guiasremisionesConstantesFunciones.resaltarBusquedaGuiasRemisionesGuiasRemisiones!=null) {
			index= this.jTabbedPaneBusquedasGuiasRemisiones.indexOfComponent(this.jPanelBusquedaGuiasRemisionesGuiasRemisiones);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGuiasRemisiones.getComponent(index);
				jPanel.setBorder(this.guiasremisionesConstantesFunciones.resaltarBusquedaGuiasRemisionesGuiasRemisiones);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGuiasRemisiones() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGuiasRemisiones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGuiasRemisiones.indexOfComponent(this.jPanelBusquedaGuiasRemisionesGuiasRemisiones);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGuiasRemisiones.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.guiasremisionesConstantesFunciones.mostrarBusquedaGuiasRemisionesGuiasRemisiones);
			if(!this.guiasremisionesConstantesFunciones.mostrarBusquedaGuiasRemisionesGuiasRemisiones && index>-1) {
				this.jTabbedPaneBusquedasGuiasRemisiones.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGuiasRemisiones() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGuiasRemisiones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGuiasRemisiones.indexOfComponent(this.jPanelBusquedaGuiasRemisionesGuiasRemisiones);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGuiasRemisiones.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.guiasremisionesConstantesFunciones.activarBusquedaGuiasRemisionesGuiasRemisiones);
				this.jTabbedPaneBusquedasGuiasRemisiones.setEnabledAt(index,this.guiasremisionesConstantesFunciones.activarBusquedaGuiasRemisionesGuiasRemisiones);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGuiasRemisiones(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaGuiasRemisiones")) {
			index= this.jTabbedPaneBusquedasGuiasRemisiones.indexOfComponent(this.jPanelBusquedaGuiasRemisionesGuiasRemisiones);

			this.jTabbedPaneBusquedasGuiasRemisiones.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGuiasRemisiones.getComponent(index);

			this.guiasremisionesConstantesFunciones.setResaltarBusquedaGuiasRemisionesGuiasRemisiones(resaltar);

			jPanel.setBorder(this.guiasremisionesConstantesFunciones.resaltarBusquedaGuiasRemisionesGuiasRemisiones);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGuiasRemisiones.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioGuiasRemisiones() throws Exception {

		if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGuiasRemisiones();
		this.updateVisibilidadResaltarControlesFormularioGuiasRemisiones();
		this.updateHabilitarResaltarControlesFormularioGuiasRemisiones();
		
	}
	
	public void updateBorderResaltarControlesFormularioGuiasRemisiones() throws Exception {
		if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.guiasremisionesConstantesFunciones.resaltaridGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltaridGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarid_empresaGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarid_empresaGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarfecha_emision_desdeGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emision_desdeGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarfecha_emision_desdeGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarfecha_emision_hastaGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emision_hastaGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarfecha_emision_hastaGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarnombre_completo_clienteGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_completo_clienteGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarnombre_completo_clienteGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarnumero_pre_impreso_facturaGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarnumero_pre_impreso_facturaGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarsecuencialGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldsecuencialGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarsecuencialGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarfecha_emisionGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emisionGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarfecha_emisionGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarfecha_vencimientoGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_vencimientoGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarfecha_vencimientoGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarnombre_tipo_transporteGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_tipo_transporteGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarnombre_tipo_transporteGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarivaGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldivaGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarivaGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltardescuentoGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jTextFielddescuentoGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltardescuentoGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltarotroGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldotroGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltarotroGuiasRemisiones);}
		if(this.guiasremisionesConstantesFunciones.resaltartotalGuiasRemisiones!=null && this.jInternalFrameDetalleFormGuiasRemisiones!=null) {this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldtotalGuiasRemisiones.setBorder(this.guiasremisionesConstantesFunciones.resaltartotalGuiasRemisiones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGuiasRemisiones() throws Exception {		
		if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
	
		//this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostraridGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelidGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostraridGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarid_empresaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelid_empresaGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarid_empresaGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emision_desdeGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarfecha_emision_desdeGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelfecha_emision_desdeGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarfecha_emision_desdeGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emision_hastaGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarfecha_emision_hastaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelfecha_emision_hastaGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarfecha_emision_hastaGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_completo_clienteGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarnombre_completo_clienteGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelnombre_completo_clienteGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarnombre_completo_clienteGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarnumero_pre_impreso_facturaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelnumero_pre_impreso_facturaGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarnumero_pre_impreso_facturaGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldsecuencialGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarsecuencialGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelsecuencialGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarsecuencialGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emisionGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarfecha_emisionGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelfecha_emisionGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarfecha_emisionGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_vencimientoGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarfecha_vencimientoGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelfecha_vencimientoGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarfecha_vencimientoGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_tipo_transporteGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarnombre_tipo_transporteGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelnombre_tipo_transporteGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarnombre_tipo_transporteGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldivaGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarivaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelivaGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarivaGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jTextFielddescuentoGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrardescuentoGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPaneldescuentoGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrardescuentoGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldotroGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarotroGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPanelotroGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrarotroGuiasRemisiones);
		//this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldtotalGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrartotalGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jPaneltotalGuiasRemisiones.setVisible(this.guiasremisionesConstantesFunciones.mostrartotalGuiasRemisiones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGuiasRemisiones() throws Exception {
		if(this.jInternalFrameDetalleFormGuiasRemisiones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGuiasRemisiones!=null) {
	
		this.jInternalFrameDetalleFormGuiasRemisiones.jLabelidGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activaridGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jComboBoxid_empresaGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarid_empresaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emision_desdeGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarfecha_emision_desdeGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emision_hastaGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarfecha_emision_hastaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_completo_clienteGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarnombre_completo_clienteGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarnumero_pre_impreso_facturaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldsecuencialGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarsecuencialGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_emisionGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarfecha_emisionGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jDateChooserfecha_vencimientoGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarfecha_vencimientoGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextAreanombre_tipo_transporteGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarnombre_tipo_transporteGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldivaGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarivaGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFielddescuentoGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activardescuentoGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldotroGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activarotroGuiasRemisiones);
		this.jInternalFrameDetalleFormGuiasRemisiones.jTextFieldtotalGuiasRemisiones.setEnabled(this.guiasremisionesConstantesFunciones.activartotalGuiasRemisiones);
		}
	}
	
		
}