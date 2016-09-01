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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;




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

import com.bydan.erp.importaciones.util.ValorPorUnidadConstantesFunciones;
import com.bydan.erp.importaciones.util.ValorPorUnidadParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.ValorPorUnidadParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.ValorPorUnidadBean;
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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ValorPorUnidadBeanSwingJInternalFrame extends ValorPorUnidadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ValorPorUnidadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ValorPorUnidad> valorporunidadValidator = new ClassValidator<ValorPorUnidad>(ValorPorUnidad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ValorPorUnidad valorporunidad;	
	public ValorPorUnidad valorporunidadAux;
	public ValorPorUnidad valorporunidadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ValorPorUnidad valorporunidadTotales;
	public Long idValorPorUnidadActual;
	public Long iIdNuevoValorPorUnidad=0L;
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

	public String sFinalQueryComboUnidad="";

	public List<Unidad> unidadsForeignKey;

	public List<Unidad> getunidadsForeignKey() {
		return unidadsForeignKey;
	}

	public void setunidadsForeignKey(List<Unidad> unidadsForeignKey) {
		this.unidadsForeignKey = unidadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidadForeignKey;

	public Unidad getunidadForeignKey() {
		return unidadForeignKey;
	}

	public void setunidadForeignKey(Unidad unidadForeignKey) {
		this.unidadForeignKey = unidadForeignKey;
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
	
	public Boolean isPermisoTodoValorPorUnidad;
	public Boolean isPermisoNuevoValorPorUnidad;
	public Boolean isPermisoActualizarValorPorUnidad;
	public Boolean isPermisoActualizarOriginalValorPorUnidad;
	public Boolean isPermisoEliminarValorPorUnidad;
	public Boolean isPermisoGuardarCambiosValorPorUnidad;
	public Boolean isPermisoConsultaValorPorUnidad;
	public Boolean isPermisoBusquedaValorPorUnidad;
	public Boolean isPermisoReporteValorPorUnidad;
	public Boolean isPermisoPaginacionMedioValorPorUnidad;
	public Boolean isPermisoPaginacionAltoValorPorUnidad;
	public Boolean isPermisoPaginacionTodoValorPorUnidad;
	public Boolean isPermisoCopiarValorPorUnidad;
	public Boolean isPermisoVerFormValorPorUnidad;
	public Boolean isPermisoDuplicarValorPorUnidad;
	public Boolean isPermisoOrdenValorPorUnidad;
	
	
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
	
	public ValorPorUnidadParameterReturnGeneral valorporunidadReturnGeneral;
	public ValorPorUnidadParameterReturnGeneral valorporunidadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoValorPorUnidad=false;
	public Boolean esParaAccionDesdeFormularioValorPorUnidad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ValorPorUnidadSessionBeanAdditional valorporunidadSessionBeanAdditional=null;
	
	public ValorPorUnidadSessionBeanAdditional getValorPorUnidadSessionBeanAdditional() {
		return this.valorporunidadSessionBeanAdditional;
	}
	
	public void setValorPorUnidadSessionBeanAdditional(ValorPorUnidadSessionBeanAdditional valorporunidadSessionBeanAdditional) {
		try {
			this.valorporunidadSessionBeanAdditional=valorporunidadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ValorPorUnidadBeanSwingJInternalFrameAdditional valorporunidadBeanSwingJInternalFrameAdditional=null;
	//public class ValorPorUnidadBeanSwingJInternalFrame
	
	public ValorPorUnidadBeanSwingJInternalFrameAdditional getValorPorUnidadBeanSwingJInternalFrameAdditional() {
		return this.valorporunidadBeanSwingJInternalFrameAdditional;
	}
	
	public void setValorPorUnidadBeanSwingJInternalFrameAdditional(ValorPorUnidadBeanSwingJInternalFrameAdditional valorporunidadBeanSwingJInternalFrameAdditional) {
		try {
			this.valorporunidadBeanSwingJInternalFrameAdditional=valorporunidadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ValorPorUnidadLogic valorporunidadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ValorPorUnidad valorporunidadBean;
	public ValorPorUnidadConstantesFunciones valorporunidadConstantesFunciones;
	//public ValorPorUnidadParameterReturnGeneral valorporunidadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ValorPorUnidad> valorporunidads;	
	//public List<ValorPorUnidad> valorporunidadsEliminados;
	//public List<ValorPorUnidad> valorporunidadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoValorPorUnidad=false;
	public Boolean isVisibilidadCeldaDuplicarValorPorUnidad=true;
	public Boolean isVisibilidadCeldaCopiarValorPorUnidad=true;
	public Boolean isVisibilidadCeldaVerFormValorPorUnidad=true;
	public Boolean isVisibilidadCeldaOrdenValorPorUnidad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesValorPorUnidad=false;
	public Boolean isVisibilidadCeldaModificarValorPorUnidad=false;
	public Boolean isVisibilidadCeldaActualizarValorPorUnidad=false;
	public Boolean isVisibilidadCeldaEliminarValorPorUnidad=false;
	public Boolean isVisibilidadCeldaCancelarValorPorUnidad=false;
	public Boolean isVisibilidadCeldaGuardarValorPorUnidad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosValorPorUnidad=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoValorPorUnidad() {
		return this.iIdNuevoValorPorUnidad;
	}

	public void setiIdNuevoValorPorUnidad(Long iIdNuevoValorPorUnidad) {
		this.iIdNuevoValorPorUnidad = iIdNuevoValorPorUnidad;
	}
	
	public Long getidValorPorUnidadActual() {
		return this.idValorPorUnidadActual;
	}

	public void setidValorPorUnidadActual(Long idValorPorUnidadActual) {
		this.idValorPorUnidadActual = idValorPorUnidadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ValorPorUnidad getvalorporunidad() {
		return this.valorporunidad;
	}

	public void setvalorporunidad(ValorPorUnidad valorporunidad) {
		this.valorporunidad = valorporunidad;
	}
	
	public ValorPorUnidad getvalorporunidadAux() {
		return this.valorporunidadAux;
	}

	public void setvalorporunidadAux(ValorPorUnidad valorporunidadAux) {
		this.valorporunidadAux = valorporunidadAux;
	}				
	
	public ValorPorUnidad getvalorporunidadAnterior() {
		return this.valorporunidadAnterior;
	}

	public void setvalorporunidadAnterior(ValorPorUnidad valorporunidadAnterior) {
		this.valorporunidadAnterior = valorporunidadAnterior;
	}	
	
	public ValorPorUnidad getvalorporunidadTotales() {
		return this.valorporunidadTotales;
	}

	public void setvalorporunidadTotales(ValorPorUnidad valorporunidadTotales) {
		this.valorporunidadTotales = valorporunidadTotales;
	}	
	
	public ValorPorUnidad getvalorporunidadBean() {
		return this.valorporunidadBean;
	}

	public void setvalorporunidadBean(ValorPorUnidad valorporunidadBean) {
		this.valorporunidadBean = valorporunidadBean;
	}	
	
	public ValorPorUnidadParameterReturnGeneral getvalorporunidadReturnGeneral() {
		return this.valorporunidadReturnGeneral;
	}

	public void setvalorporunidadReturnGeneral(ValorPorUnidadParameterReturnGeneral valorporunidadReturnGeneral) {
		this.valorporunidadReturnGeneral = valorporunidadReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_unidadFK_IdUnidad=-1L;

	public Long getid_unidadFK_IdUnidad() {
		return this.id_unidadFK_IdUnidad;
	}

	public void setid_unidadFK_IdUnidad(Long id_unidadFK_IdUnidad) {
		this.id_unidadFK_IdUnidad = id_unidadFK_IdUnidad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ValorPorUnidadLogic getValorPorUnidadLogic()	{		
		return valorporunidadLogic;
	}

	public void setValorPorUnidadLogic(ValorPorUnidadLogic valorporunidadLogic) {
		this.valorporunidadLogic = valorporunidadLogic;
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
	
	public Boolean getIsEsNuevoValorPorUnidad() {
		return isEsNuevoValorPorUnidad;
	}

	public void setIsEsNuevoValorPorUnidad(Boolean isEsNuevoValorPorUnidad) {
		this.isEsNuevoValorPorUnidad = isEsNuevoValorPorUnidad;
	}

	public Boolean getEsParaAccionDesdeFormularioValorPorUnidad() {
		return esParaAccionDesdeFormularioValorPorUnidad;
	}
	
	public void setEsParaAccionDesdeFormularioValorPorUnidad(Boolean esParaAccionDesdeFormularioValorPorUnidad) {
		this.esParaAccionDesdeFormularioValorPorUnidad = esParaAccionDesdeFormularioValorPorUnidad;
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

			if(this.valorporunidadSessionBean==null) {
				this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
			}

			if(!this.valorporunidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(valorporunidadSessionBean.getlidEmpresaActual());
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

	public void cargarCombosUnidadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidadsForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.valorporunidadSessionBean==null) {
				this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
			}

			if(!this.valorporunidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidadsForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(valorporunidadSessionBean.getlidUnidadActual());
					this.unidadsForeignKey.add(unidadLogic.getUnidad());
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

					if(this.valorporunidad!=null) {
						this.valorporunidad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
						this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaValorPorUnidad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
						if(this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaValorPorUnidadGenerico)throws Exception
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
				jComboBoxid_empresaValorPorUnidadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaValorPorUnidadGenerico!=null && jComboBoxid_empresaValorPorUnidadGenerico.getItemCount()>0) {
					jComboBoxid_empresaValorPorUnidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadForeignKey(Long idUnidadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidadTemp!=null) {

					if(this.valorporunidad!=null) {
						this.valorporunidad.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
						this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadValorPorUnidad.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
						if(this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadValorPorUnidad!=null) {
						jComboBoxid_unidadFK_IdUnidadValorPorUnidad.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadValorPorUnidad!=null) {
							//jComboBoxid_unidadFK_IdUnidadValorPorUnidad.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadValorPorUnidad.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadValorPorUnidad.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualUnidadForeignKeyDescripcion(Long idUnidadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadValorPorUnidadGenerico)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(unidadTemp!=null) {
				jComboBoxid_unidadValorPorUnidadGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadValorPorUnidadGenerico!=null && jComboBoxid_unidadValorPorUnidadGenerico.getItemCount()>0) {
					jComboBoxid_unidadValorPorUnidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ValorPorUnidad valorporunidad,JComboBox jComboBoxid_empresaValorPorUnidadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaValorPorUnidadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaValorPorUnidadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				valorporunidad.setid_empresa(empresaAux.getId());
				valorporunidad.setempresa_descripcion(ValorPorUnidadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				valorporunidad.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ValorPorUnidad valorporunidad,JComboBox jComboBoxid_unidadValorPorUnidadGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadValorPorUnidadGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadValorPorUnidadGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				valorporunidad.setid_unidad(unidadAux.getId());
				valorporunidad.setunidad_descripcion(ValorPorUnidadConstantesFunciones.getUnidadDescripcion(unidadAux));
				valorporunidad.setUnidad(unidadAux);			}
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

					if(!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { 
							this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { 
					}

					if(!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { 
							this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { 
					}

					if(!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadValorPorUnidad.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadValorPorUnidad.addItem(unidad);
							}
						}

						if(!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
							this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
							this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUnidadForeignKey(Unidad unidad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
							this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
							this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadValorPorUnidad.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadValorPorUnidad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesValorPorUnidad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ValorPorUnidadConstantesFunciones.refrescarForeignKeysDescripcionesValorPorUnidad(this.valorporunidadLogic.getValorPorUnidads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ValorPorUnidadConstantesFunciones.refrescarForeignKeysDescripcionesValorPorUnidad(this.valorporunidads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//valorporunidadLogic.setValorPorUnidads(this.valorporunidads);
			valorporunidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
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
		
	public ValorPorUnidadParameterReturnGeneral getValorPorUnidadParameterGeneral() {
		return this.valorporunidadParameterGeneral;
	}
	
	public void setValorPorUnidadParameterGeneral(ValorPorUnidadParameterReturnGeneral valorporunidadParameterGeneral) {
		this.valorporunidadParameterGeneral = valorporunidadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoValorPorUnidad() {
		return isPermisoTodoValorPorUnidad;
	}

	public void setIsPermisoTodoValorPorUnidad(Boolean isPermisoTodoValorPorUnidad) {
		this.isPermisoTodoValorPorUnidad = isPermisoTodoValorPorUnidad;
	}

	public Boolean getIsPermisoNuevoValorPorUnidad() {
		return isPermisoNuevoValorPorUnidad;
	}

	public void setIsPermisoNuevoValorPorUnidad(Boolean isPermisoNuevoValorPorUnidad) {
		this.isPermisoNuevoValorPorUnidad = isPermisoNuevoValorPorUnidad;
	}

	public Boolean getIsPermisoActualizarValorPorUnidad() {
		return isPermisoActualizarValorPorUnidad;
	}

	public void setIsPermisoActualizarValorPorUnidad(Boolean isPermisoActualizarValorPorUnidad) {
		this.isPermisoActualizarValorPorUnidad = isPermisoActualizarValorPorUnidad;
	}

	public Boolean getIsPermisoEliminarValorPorUnidad() {
		return isPermisoEliminarValorPorUnidad;
	}

	public void setIsPermisoEliminarValorPorUnidad(Boolean isPermisoEliminarValorPorUnidad) {
		this.isPermisoEliminarValorPorUnidad = isPermisoEliminarValorPorUnidad;
	}

	public Boolean getIsPermisoGuardarCambiosValorPorUnidad() {
		return isPermisoGuardarCambiosValorPorUnidad;
	}

	public void setIsPermisoGuardarCambiosValorPorUnidad(Boolean isPermisoGuardarCambiosValorPorUnidad) {
		this.isPermisoGuardarCambiosValorPorUnidad = isPermisoGuardarCambiosValorPorUnidad;
	}
	
	public Boolean getIsPermisoConsultaValorPorUnidad() {
		return isPermisoConsultaValorPorUnidad;
	}

	public void setIsPermisoConsultaValorPorUnidad(Boolean isPermisoConsultaValorPorUnidad) {
		this.isPermisoConsultaValorPorUnidad = isPermisoConsultaValorPorUnidad;
	}

	public Boolean getIsPermisoBusquedaValorPorUnidad() {
		return isPermisoBusquedaValorPorUnidad;
	}

	public void setIsPermisoBusquedaValorPorUnidad(Boolean isPermisoBusquedaValorPorUnidad) {
		this.isPermisoBusquedaValorPorUnidad = isPermisoBusquedaValorPorUnidad;
	}

	public Boolean getIsPermisoReporteValorPorUnidad() {
		return isPermisoReporteValorPorUnidad;
	}

	public void setIsPermisoReporteValorPorUnidad(Boolean isPermisoReporteValorPorUnidad) {
		this.isPermisoReporteValorPorUnidad = isPermisoReporteValorPorUnidad;
	}
	
	public Boolean getIsPermisoPaginacionMedioValorPorUnidad() {
		return isPermisoPaginacionMedioValorPorUnidad;
	}

	public void setIsPermisoPaginacionMedioValorPorUnidad(Boolean isPermisoPaginacionMedioValorPorUnidad) {
		this.isPermisoPaginacionMedioValorPorUnidad = isPermisoPaginacionMedioValorPorUnidad;
	}
	
	public Boolean getIsPermisoPaginacionTodoValorPorUnidad() {
		return isPermisoPaginacionTodoValorPorUnidad;
	}

	public void setIsPermisoPaginacionTodoValorPorUnidad(Boolean isPermisoPaginacionTodoValorPorUnidad) {
		this.isPermisoPaginacionTodoValorPorUnidad = isPermisoPaginacionTodoValorPorUnidad;
	}
	
	public Boolean getIsPermisoPaginacionAltoValorPorUnidad() {
		return isPermisoPaginacionAltoValorPorUnidad;
	}

	public void setIsPermisoPaginacionAltoValorPorUnidad(Boolean isPermisoPaginacionAltoValorPorUnidad) {
		this.isPermisoPaginacionAltoValorPorUnidad = isPermisoPaginacionAltoValorPorUnidad;
	}
	
	public Boolean getIsPermisoCopiarValorPorUnidad() {
		return isPermisoCopiarValorPorUnidad;
	}

	public void setIsPermisoCopiarValorPorUnidad(Boolean isPermisoCopiarValorPorUnidad) {
		this.isPermisoCopiarValorPorUnidad = isPermisoCopiarValorPorUnidad;
	}
	
	public Boolean getIsPermisoVerFormValorPorUnidad() {
		return isPermisoVerFormValorPorUnidad;
	}

	public void setIsPermisoVerFormValorPorUnidad(Boolean isPermisoVerFormValorPorUnidad) {
		this.isPermisoVerFormValorPorUnidad = isPermisoVerFormValorPorUnidad;
	}
	
	public Boolean getIsPermisoDuplicarValorPorUnidad() {
		return isPermisoDuplicarValorPorUnidad;
	}

	public void setIsPermisoDuplicarValorPorUnidad(Boolean isPermisoDuplicarValorPorUnidad) {
		this.isPermisoDuplicarValorPorUnidad = isPermisoDuplicarValorPorUnidad;
	}
	
	public Boolean getIsPermisoOrdenValorPorUnidad() {
		return isPermisoOrdenValorPorUnidad;
	}

	public void setIsPermisoOrdenValorPorUnidad(Boolean isPermisoOrdenValorPorUnidad) {
		this.isPermisoOrdenValorPorUnidad = isPermisoOrdenValorPorUnidad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoValorPorUnidad() {
		return isVisibilidadCeldaNuevoValorPorUnidad;
	}

	public void setIsVisibilidadCeldaNuevoValorPorUnidad(Boolean isVisibilidadCeldaNuevoValorPorUnidad) {
		this.isVisibilidadCeldaNuevoValorPorUnidad = isVisibilidadCeldaNuevoValorPorUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarValorPorUnidad() {
		return isVisibilidadCeldaDuplicarValorPorUnidad;
	}

	public void setIsVisibilidadCeldaDuplicarValorPorUnidad(Boolean isVisibilidadCeldaDuplicarValorPorUnidad) {
		this.isVisibilidadCeldaDuplicarValorPorUnidad = isVisibilidadCeldaDuplicarValorPorUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarValorPorUnidad() {
		return isVisibilidadCeldaCopiarValorPorUnidad;
	}

	public void setIsVisibilidadCeldaCopiarValorPorUnidad(Boolean isVisibilidadCeldaCopiarValorPorUnidad) {
		this.isVisibilidadCeldaCopiarValorPorUnidad = isVisibilidadCeldaCopiarValorPorUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormValorPorUnidad() {
		return isVisibilidadCeldaVerFormValorPorUnidad;
	}

	public void setIsVisibilidadCeldaVerFormValorPorUnidad(Boolean isVisibilidadCeldaVerFormValorPorUnidad) {
		this.isVisibilidadCeldaVerFormValorPorUnidad = isVisibilidadCeldaVerFormValorPorUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenValorPorUnidad() {
		return isVisibilidadCeldaOrdenValorPorUnidad;
	}

	public void setIsVisibilidadCeldaOrdenValorPorUnidad(Boolean isVisibilidadCeldaOrdenValorPorUnidad) {
		this.isVisibilidadCeldaOrdenValorPorUnidad = isVisibilidadCeldaOrdenValorPorUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesValorPorUnidad() {
		return isVisibilidadCeldaNuevoRelacionesValorPorUnidad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesValorPorUnidad(Boolean isVisibilidadCeldaNuevoRelacionesValorPorUnidad) {
		this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad = isVisibilidadCeldaNuevoRelacionesValorPorUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarValorPorUnidad() {
		return isVisibilidadCeldaModificarValorPorUnidad;
	}

	public void setIsVisibilidadCeldaModificarValorPorUnidad(Boolean isVisibilidadCeldaModificarValorPorUnidad) {
		this.isVisibilidadCeldaModificarValorPorUnidad = isVisibilidadCeldaModificarValorPorUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarValorPorUnidad() {
		return isVisibilidadCeldaActualizarValorPorUnidad;
	}

	public void setIsVisibilidadCeldaActualizarValorPorUnidad(Boolean isVisibilidadCeldaActualizarValorPorUnidad) {
		this.isVisibilidadCeldaActualizarValorPorUnidad = isVisibilidadCeldaActualizarValorPorUnidad;
	}

	public Boolean getIsVisibilidadCeldaEliminarValorPorUnidad() {
		return isVisibilidadCeldaEliminarValorPorUnidad;
	}

	public void setIsVisibilidadCeldaEliminarValorPorUnidad(Boolean isVisibilidadCeldaEliminarValorPorUnidad) {
		this.isVisibilidadCeldaEliminarValorPorUnidad = isVisibilidadCeldaEliminarValorPorUnidad;
	}

	public Boolean getIsVisibilidadCeldaCancelarValorPorUnidad() {
		return isVisibilidadCeldaCancelarValorPorUnidad;
	}

	public void setIsVisibilidadCeldaCancelarValorPorUnidad(Boolean isVisibilidadCeldaCancelarValorPorUnidad) {
		this.isVisibilidadCeldaCancelarValorPorUnidad = isVisibilidadCeldaCancelarValorPorUnidad;
	}

	public Boolean getIsVisibilidadCeldaGuardarValorPorUnidad() {
		return isVisibilidadCeldaGuardarValorPorUnidad;
	}

	public void setIsVisibilidadCeldaGuardarValorPorUnidad(Boolean isVisibilidadCeldaGuardarValorPorUnidad) {
		this.isVisibilidadCeldaGuardarValorPorUnidad = isVisibilidadCeldaGuardarValorPorUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosValorPorUnidad() {
		return isVisibilidadCeldaGuardarCambiosValorPorUnidad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosValorPorUnidad(Boolean isVisibilidadCeldaGuardarCambiosValorPorUnidad) {
		this.isVisibilidadCeldaGuardarCambiosValorPorUnidad = isVisibilidadCeldaGuardarCambiosValorPorUnidad;
	}
		
	public ValorPorUnidadSessionBean getvalorporunidadSessionBean() {
		return this.valorporunidadSessionBean;
	}
	
	public void setvalorporunidadSessionBean(ValorPorUnidadSessionBean valorporunidadSessionBean) {
		this.valorporunidadSessionBean=valorporunidadSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(ValorPorUnidad valorporunidad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(valorporunidad,null);
				this.setActualParaGuardarUnidadForeignKey(valorporunidad,null);
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
	
	public void bugActualizarReferenciaActual(ValorPorUnidad valorporunidad,ValorPorUnidad valorporunidadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalValorPorUnidad(valorporunidad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		valorporunidadAux.setId(valorporunidad.getId());
		valorporunidadAux.setVersionRow(valorporunidad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessValorPorUnidad();
		
			int intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualValorPorUnidad(this.valorporunidad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = valorporunidadValidator.getInvalidValues(this.valorporunidad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			valorporunidadLogic.setDatosCliente(datosCliente);
			valorporunidadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				valorporunidadAux=new  ValorPorUnidad();
				
				valorporunidadAux.setIsNew(true);
				valorporunidadAux.setIsChanged(true);
				
				valorporunidadAux.setValorPorUnidadOriginal(this.valorporunidad);
				
				valorporunidadAux.setId(this.valorporunidad.getId());	
				valorporunidadAux.setVersionRow(this.valorporunidad.getVersionRow());	
				valorporunidadAux.setid_empresa(this.valorporunidad.getid_empresa());	
				valorporunidadAux.setid_unidad(this.valorporunidad.getid_unidad());	
				valorporunidadAux.setvalor(this.valorporunidad.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.valorporunidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.valorporunidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(valorporunidadAux,valorporunidadLogic.getValorPorUnidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(valorporunidadAux,valorporunidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.valorporunidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.valorporunidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						valorporunidadLogic.saveValorPorUnidads();//WithConnection
						//valorporunidadLogic.getSetVersionRowValorPorUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.valorporunidad,valorporunidadAux);
					
					this.refrescarForeignKeysDescripcionesValorPorUnidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.valorporunidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								valorporunidadLogic.saveValorPorUnidadRelaciones(valorporunidadAux);//WithConnection
								//valorporunidadLogic.getSetVersionRowValorPorUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.valorporunidad,valorporunidadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.valorporunidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.valorporunidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(valorporunidadAux,valorporunidadLogic.getValorPorUnidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(valorporunidadAux,valorporunidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.valorporunidad,valorporunidadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				valorporunidadAux=new  ValorPorUnidad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.valorporunidadSessionBean.getEsGuardarRelacionado() 
					|| (this.valorporunidadSessionBean.getEsGuardarRelacionado() && this.valorporunidad.getId()>=0)) {
						
					valorporunidadAux.setIsNew(false);
				}
				
				valorporunidadAux.setIsDeleted(false);
			
				valorporunidadAux.setId(this.valorporunidad.getId());	
				valorporunidadAux.setVersionRow(this.valorporunidad.getVersionRow());	
				valorporunidadAux.setid_empresa(this.valorporunidad.getid_empresa());	
				valorporunidadAux.setid_unidad(this.valorporunidad.getid_unidad());	
				valorporunidadAux.setvalor(this.valorporunidad.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(valorporunidadAux,valorporunidadLogic.getValorPorUnidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(valorporunidadAux,valorporunidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.valorporunidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.valorporunidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						valorporunidadLogic.saveValorPorUnidads();//WithConnection
						//valorporunidadLogic.getSetVersionRowValorPorUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.valorporunidad,valorporunidadAux);
					
					this.refrescarForeignKeysDescripcionesValorPorUnidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.valorporunidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								valorporunidadLogic.saveValorPorUnidadRelaciones(valorporunidadAux);//WithConnection
								//valorporunidadLogic.getSetVersionRowValorPorUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.valorporunidad,valorporunidadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.valorporunidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.valorporunidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(valorporunidadAux,valorporunidadLogic.getValorPorUnidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(valorporunidadAux,valorporunidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.valorporunidad,valorporunidadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				valorporunidadAux=new  ValorPorUnidad();
				
				valorporunidadAux.setIsNew(false);
				valorporunidadAux.setIsChanged(false);
				
				valorporunidadAux.setIsDeleted(true);
				
				valorporunidadAux.setId(this.valorporunidad.getId());	
				valorporunidadAux.setVersionRow(this.valorporunidad.getVersionRow());	
				valorporunidadAux.setid_empresa(this.valorporunidad.getid_empresa());	
				valorporunidadAux.setid_unidad(this.valorporunidad.getid_unidad());	
				valorporunidadAux.setvalor(this.valorporunidad.getvalor());	
				
				if(this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.valorporunidadAux.getId()>=0) {	
						this.valorporunidadsEliminados.add(valorporunidadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(valorporunidadAux,valorporunidadLogic.getValorPorUnidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(valorporunidadAux,valorporunidads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.valorporunidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.valorporunidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						valorporunidadLogic.saveValorPorUnidads();//WithConnection
						//valorporunidadLogic.getSetVersionRowValorPorUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.valorporunidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								valorporunidadLogic.saveValorPorUnidadRelaciones(valorporunidadAux);//WithConnection
								//valorporunidadLogic.getSetVersionRowValorPorUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.valorporunidadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.valorporunidadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(valorporunidadAux,valorporunidadLogic.getValorPorUnidads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(valorporunidadAux,valorporunidads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.getValorPorUnidads().addAll(this.valorporunidadsEliminados);
					
					valorporunidadLogic.saveValorPorUnidads();//WithConnection
					//valorporunidadLogic.getSetVersionRowValorPorUnidads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesValorPorUnidad();
				
				this.valorporunidadsEliminados= new ArrayList<ValorPorUnidad>();		
			}
			
			if(this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Valor Por Unidad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Valor Por Unidad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.valorporunidad=valorporunidadAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessValorPorUnidad();
      	}
		
	}	
	
	public void actualizarRelaciones(ValorPorUnidad valorporunidadLocal) throws Exception {
		
		if(this.valorporunidadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ValorPorUnidad valorporunidadLocal) throws Exception {	
		if(this.valorporunidadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				valorporunidadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				valorporunidadLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarValorPorUnidadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = valorporunidadValidator.getInvalidValues(this.valorporunidad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ValorPorUnidad valorporunidad,List<ValorPorUnidad> valorporunidads) throws Exception {
		try	{		
			ValorPorUnidadConstantesFunciones.actualizarLista(valorporunidad,valorporunidads,this.valorporunidadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ValorPorUnidad valorporunidad,List<ValorPorUnidad> valorporunidads) throws Exception {
		try	{			
			ValorPorUnidadConstantesFunciones.actualizarSelectedLista(valorporunidad,valorporunidads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ValorPorUnidad> valorporunidadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				valorporunidadsLocal=this.valorporunidadLogic.getValorPorUnidads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				valorporunidadsLocal=this.valorporunidads;
			}
			//ARCHITECTURE
		
			for(ValorPorUnidad valorporunidadLocal:valorporunidadsLocal) {
				if(this.permiteMantenimiento(valorporunidadLocal) && valorporunidadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ValorPorUnidadConstantesFunciones.getValorPorUnidadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ValorPorUnidadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorPorUnidad.jLabelid_empresaValorPorUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ValorPorUnidadConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorPorUnidad.jLabelid_unidadValorPorUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ValorPorUnidadConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorPorUnidad.jLabelvalorValorPorUnidad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormValorPorUnidad.jLabelid_empresaValorPorUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormValorPorUnidad.jLabelid_unidadValorPorUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormValorPorUnidad.jLabelvalorValorPorUnidad,"");
		
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
		this.iIdNuevoValorPorUnidad--;	
		
		
		this.valorporunidadAux=new ValorPorUnidad();
		
		this.valorporunidadAux.setId(this.iIdNuevoValorPorUnidad);
		this.valorporunidadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.valorporunidadLogic.getValorPorUnidads().add(this.valorporunidadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.valorporunidads.add(this.valorporunidadAux);
		}
		//ARCHITECTURE
		
		this.valorporunidad=this.valorporunidadAux;
		
		if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioValorPorUnidad(this.valorporunidad);
			this.setVariablesObjetoActualToFormularioForeignKeyValorPorUnidad(this.valorporunidad);
		}
				
		//this.setDefaultControlesValorPorUnidad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyValorPorUnidad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyValorPorUnidad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyValorPorUnidad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualValorPorUnidad(this.valorporunidadBean,this.valorporunidad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ValorPorUnidadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.valorporunidadSessionBean.getConGuardarRelaciones()) {
			classes=ValorPorUnidadConstantesFunciones.getClassesRelationshipsOfValorPorUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.valorporunidadReturnGeneral=valorporunidadLogic.procesarEventosValorPorUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.valorporunidadLogic.getValorPorUnidads(),this.valorporunidad,this.valorporunidadParameterGeneral,this.isEsNuevoValorPorUnidad,classes);//this.valorporunidadLogic.getValorPorUnidad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanValorPorUnidad(this.valorporunidadReturnGeneral,this.valorporunidadBean,false);
		
		if(this.valorporunidadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyValorPorUnidad(this.valorporunidadReturnGeneral.getValorPorUnidad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioValorPorUnidad(this.valorporunidadReturnGeneral.getValorPorUnidad());
		}
		
		if(this.valorporunidadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioValorPorUnidad(this.valorporunidadReturnGeneral.getValorPorUnidad(),classes);//this.valorporunidadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualValorPorUnidad(this.valorporunidad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyValorPorUnidad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyValorPorUnidad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.RecargarFormValorPorUnidad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingValorPorUnidad(false);
						
			if(valorporunidadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualValorPorUnidad();
			}
			
			this.actualizarVisualTableDatosValorPorUnidad();
			
			this.jTableDatosValorPorUnidad.setRowSelectionInterval(this.getIndiceNuevoValorPorUnidad(), this.getIndiceNuevoValorPorUnidad());
			
			this.seleccionarFilaTablaValorPorUnidadActual();
						
			this.actualizarEstadoCeldasBotonesValorPorUnidad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesValorPorUnidad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormValorPorUnidad.jTextFieldvalorValorPorUnidad.setEnabled(isHabilitar && this.valorporunidadConstantesFunciones.activarvalorValorPorUnidad);	
		//
		this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.setEnabled(isHabilitar && this.valorporunidadConstantesFunciones.activarid_empresaValorPorUnidad);
		this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.setEnabled(isHabilitar && this.valorporunidadConstantesFunciones.activarid_unidadValorPorUnidad);
	};
	
	public void setDefaultControlesValorPorUnidad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoValorPorUnidad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.valorporunidadSessionBean.setConGuardarRelaciones(true);			
			this.valorporunidadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormValorPorUnidad.jTabbedPaneRelacionesValorPorUnidad.setVisible(true);
			
					
		} else {
			//this.valorporunidadSessionBean.setConGuardarRelaciones(false);			
			this.valorporunidadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormValorPorUnidad.jTabbedPaneRelacionesValorPorUnidad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoValorPorUnidad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ValorPorUnidad valorporunidadAux:this.valorporunidadLogic.getValorPorUnidads()) {
				if(valorporunidadAux.getId().equals(this.iIdNuevoValorPorUnidad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ValorPorUnidad valorporunidadAux:this.valorporunidads) {
				if(valorporunidadAux.getId().equals(this.iIdNuevoValorPorUnidad)) {
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
	
	public int getIndiceActualValorPorUnidad(ValorPorUnidad valorporunidad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ValorPorUnidad valorporunidadAux:this.valorporunidadLogic.getValorPorUnidads()) {
				if(valorporunidadAux.getId().equals(valorporunidad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ValorPorUnidad valorporunidadAux:this.valorporunidads) {
				if(valorporunidadAux.getId().equals(valorporunidad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalValorPorUnidad(ValorPorUnidad valorporunidadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ValorPorUnidad valorporunidadAux:this.valorporunidadLogic.getValorPorUnidads()) {
				if(valorporunidadAux.getValorPorUnidadOriginal().getId().equals(valorporunidadOriginal.getId())) {
					existe=true;
					valorporunidadOriginal.setId(valorporunidadAux.getId());
					valorporunidadOriginal.setVersionRow(valorporunidadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ValorPorUnidad valorporunidadAux:this.valorporunidads) {
				if(valorporunidadAux.getValorPorUnidadOriginal().getId().equals(valorporunidadOriginal.getId())) {
					existe=true;
					valorporunidadOriginal.setId(valorporunidadAux.getId());
					valorporunidadOriginal.setVersionRow(valorporunidadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosValorPorUnidad(Boolean esParaCancelar) throws Exception {
		valorporunidadsAux=new ArrayList<ValorPorUnidad>();
		valorporunidadAux=new ValorPorUnidad();
		
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ValorPorUnidad valorporunidadAux:this.valorporunidadLogic.getValorPorUnidads()) {
					if(valorporunidadAux.getId()<0) {
						valorporunidadsAux.add(valorporunidadAux);
					}		
				}
				this.iIdNuevoValorPorUnidad=0L;
				this.valorporunidadLogic.getValorPorUnidads().removeAll(valorporunidadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ValorPorUnidad valorporunidadAux:this.valorporunidads) {
					if(valorporunidadAux.getId()<0) {
						valorporunidadsAux.add(valorporunidadAux);
					}		
				}
				this.iIdNuevoValorPorUnidad=0L;
				this.valorporunidads.removeAll(valorporunidadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoValorPorUnidad 
					&& this.valorporunidadLogic.getValorPorUnidads().size()>0
					) {
					valorporunidadAux=this.valorporunidadLogic.getValorPorUnidads().get(this.valorporunidadLogic.getValorPorUnidads().size() - 1);
				
					if(valorporunidadAux.getId()<0) {
						this.valorporunidadLogic.getValorPorUnidads().remove(valorporunidadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoValorPorUnidad && this.valorporunidads.size()>0) {
					valorporunidadAux=this.valorporunidads.get(this.valorporunidads.size() - 1);
				
					if(valorporunidadAux.getId()<0) {
						this.valorporunidads.remove(valorporunidadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoValorPorUnidad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(valorporunidad.getId()<0) {
				this.valorporunidadLogic.getValorPorUnidads().remove(this.valorporunidad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(valorporunidad.getId()<0) {
				this.valorporunidads.remove(this.valorporunidad);
			}
		}			
	}
	
	public void setEstadosInicialesValorPorUnidad(List<ValorPorUnidad> valorporunidadsAux) throws Exception {
		ValorPorUnidadConstantesFunciones.setEstadosInicialesValorPorUnidad(valorporunidadsAux);
	}
	
	public void setEstadosInicialesValorPorUnidad(ValorPorUnidad valorporunidadAux) throws Exception {
		ValorPorUnidadConstantesFunciones.setEstadosInicialesValorPorUnidad(valorporunidadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarValorPorUnidadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesValorPorUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarValorPorUnidadActual()) {
				if(!this.isEsNuevoValorPorUnidad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesValorPorUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoValorPorUnidad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarValorPorUnidadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Valor Por Unidad ?", "MANTENIMIENTO DE Valor Por Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesValorPorUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ValorPorUnidad valorporunidad) throws Exception {
		ValorPorUnidadConstantesFunciones.seleccionarAsignar(this.valorporunidad,valorporunidad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarValorPorUnidad=this.isPermisoActualizarOriginalValorPorUnidad;
			
			
			this.seleccionarAsignar(valorporunidad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ValorPorUnidadConstantesFunciones.quitarEspaciosValorPorUnidad(this.valorporunidad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesValorPorUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.valorporunidadSessionBean.setsFuncionBusquedaRapida(this.valorporunidadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoValorPorUnidad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosValorPorUnidad(esParaCancelar);				
				this.cancelarNuevoValorPorUnidad(esParaCancelar);								
			}
			
			this.valorporunidad=new ValorPorUnidad();
			
			this.inicializarValorPorUnidad();
			
			this.actualizarEstadoCeldasBotonesValorPorUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarValorPorUnidad() throws Exception {
		try {
			ValorPorUnidadConstantesFunciones.inicializarValorPorUnidad(this.valorporunidad);
			
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
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.valorporunidadLogic.getValorPorUnidads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteValorPorUnidads(String sAccionBusqueda,List<ValorPorUnidad> valorporunidadsParaReportes) throws Exception {
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
					sPathReporteFinal="ValorPorUnidad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ValorPorUnidadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ValorPorUnidadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ValorPorUnidad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Valor Por Unidades");		
		parameters.put("busquedapor", ValorPorUnidadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceValorPorUnidad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ValorPorUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ValorPorUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceValorPorUnidad=new JRBeanArrayDataSource(ValorPorUnidadJInternalFrame.TraerValorPorUnidadBeans(valorporunidadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceValorPorUnidad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ValorPorUnidadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ValorPorUnidadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ValorPorUnidadBean.TraerValorPorUnidadBeans(valorporunidadsParaReportes).toArray()));
							
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
				this.generarExcelReporteValorPorUnidads(sAccionBusqueda,sTipoArchivoReporte,valorporunidadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalValorPorUnidads(sAccionBusqueda,sTipoArchivoReporte,valorporunidadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoValorPorUnidadActionPerformed(null);
					//this.generarExcelReporteValorPorUnidads(sAccionBusqueda,sTipoArchivoReporte,valorporunidadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalValorPorUnidads(sAccionBusqueda,sTipoArchivoReporte,valorporunidadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesValorPorUnidads(sAccionBusqueda,sTipoArchivoReporte,valorporunidadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesValorPorUnidads(sAccionBusqueda,sTipoArchivoReporte,valorporunidadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteValorPorUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<ValorPorUnidad> valorporunidadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorporunidad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ValorPorUnidads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderValorPorUnidad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ValorPorUnidad valorporunidad : valorporunidadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ValorPorUnidadConstantesFunciones.generarExcelReporteDataValorPorUnidad("NORMAL",row,workbook,valorporunidad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Por Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderValorPorUnidad(String sTipo,Row row,Workbook workbook) {
		
		ValorPorUnidadConstantesFunciones.generarExcelReporteHeaderValorPorUnidad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalValorPorUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<ValorPorUnidad> valorporunidadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorporunidad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ValorPorUnidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ValorPorUnidad valorporunidad : valorporunidadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ValorPorUnidadConstantesFunciones.getValorPorUnidadDescripcion(valorporunidad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(valorporunidad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(valorporunidad.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ValorPorUnidadConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(valorporunidad.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Por Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesValorPorUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<ValorPorUnidad> valorporunidadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ValorPorUnidad> valorporunidadsRespaldo=null;
		
		classes=ValorPorUnidadConstantesFunciones.getClassesRelationshipsOfValorPorUnidad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.valorporunidadLogic.setDatosCliente(this.datosCliente);
		this.valorporunidadLogic.setDatosDeep(this.datosDeep);
		this.valorporunidadLogic.setIsConDeep(true);
		
		valorporunidadsRespaldo=this.valorporunidadLogic.getValorPorUnidads();
		
		this.valorporunidadLogic.setValorPorUnidads(valorporunidadsParaReportes);	
		this.valorporunidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		valorporunidadsParaReportes=this.valorporunidadLogic.getValorPorUnidads();
		this.valorporunidadLogic.setValorPorUnidads(valorporunidadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorporunidad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ValorPorUnidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderValorPorUnidad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ValorPorUnidad valorporunidad : valorporunidadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderValorPorUnidad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ValorPorUnidadConstantesFunciones.generarExcelReporteDataValorPorUnidad("NORMAL",row,workbook,valorporunidad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ValorPorUnidadConstantesFunciones.getValorPorUnidadDescripcion(valorporunidad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Por Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoValorPorUnidad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessValorPorUnidad() throws Exception {		
		this.startProcessValorPorUnidad(true);
	}
	
	public void startProcessValorPorUnidad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasValorPorUnidad ,this.jPanelParametrosReportesValorPorUnidad, this.jScrollPanelDatosValorPorUnidad,this.jPanelPaginacionValorPorUnidad, this.jScrollPanelDatosEdicionValorPorUnidad, this.jPanelAccionesValorPorUnidad,this.jPanelAccionesFormularioValorPorUnidad,this.jmenuBarValorPorUnidad,this.jmenuBarDetalleValorPorUnidad,this.jTtoolBarValorPorUnidad,this.jTtoolBarDetalleValorPorUnidad);		
		
		final JTabbedPane jTabbedPaneBusquedasValorPorUnidad=this.jTabbedPaneBusquedasValorPorUnidad; 
		
		final JPanel jPanelParametrosReportesValorPorUnidad=this.jPanelParametrosReportesValorPorUnidad;
		//final JScrollPane jScrollPanelDatosValorPorUnidad=this.jScrollPanelDatosValorPorUnidad;
		final JTable jTableDatosValorPorUnidad=this.jTableDatosValorPorUnidad;		
		final JPanel jPanelPaginacionValorPorUnidad=this.jPanelPaginacionValorPorUnidad;
		//final JScrollPane jScrollPanelDatosEdicionValorPorUnidad=this.jScrollPanelDatosEdicionValorPorUnidad;
		final JPanel jPanelAccionesValorPorUnidad=this.jPanelAccionesValorPorUnidad;
		
		JPanel jPanelCamposAuxiliarValorPorUnidad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarValorPorUnidad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			jPanelCamposAuxiliarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jPanelCamposValorPorUnidad;
			jPanelAccionesFormularioAuxiliarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jPanelAccionesFormularioValorPorUnidad;
		}
		
		final JPanel jPanelCamposValorPorUnidad=jPanelCamposAuxiliarValorPorUnidad;
		final JPanel jPanelAccionesFormularioValorPorUnidad=jPanelAccionesFormularioAuxiliarValorPorUnidad;
		
		
		final JMenuBar jmenuBarValorPorUnidad=this.jmenuBarValorPorUnidad;
		final JToolBar jTtoolBarValorPorUnidad=this.jTtoolBarValorPorUnidad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarValorPorUnidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarValorPorUnidad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			jmenuBarDetalleAuxiliarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jmenuBarDetalleValorPorUnidad;
			jTtoolBarDetalleAuxiliarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jTtoolBarDetalleValorPorUnidad;
		}
		
		final JMenuBar jmenuBarDetalleValorPorUnidad=jmenuBarDetalleAuxiliarValorPorUnidad;
		final JToolBar jTtoolBarDetalleValorPorUnidad=jTtoolBarDetalleAuxiliarValorPorUnidad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasValorPorUnidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesValorPorUnidad;
			processRunnable.jTableDatos=jTableDatosValorPorUnidad;
			processRunnable.jPanelCampos=jPanelCamposValorPorUnidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionValorPorUnidad;
			processRunnable.jPanelAcciones=jPanelAccionesValorPorUnidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioValorPorUnidad;
			
			
			processRunnable.jmenuBar=jmenuBarValorPorUnidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleValorPorUnidad;
			processRunnable.jTtoolBar=jTtoolBarValorPorUnidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleValorPorUnidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasValorPorUnidad ,jPanelParametrosReportesValorPorUnidad,jTableDatosValorPorUnidad, /*jScrollPanelDatosValorPorUnidad,*/jPanelCamposValorPorUnidad,jPanelPaginacionValorPorUnidad, /*jScrollPanelDatosEdicionValorPorUnidad,*/ jPanelAccionesValorPorUnidad,jPanelAccionesFormularioValorPorUnidad,jmenuBarValorPorUnidad,jmenuBarDetalleValorPorUnidad,jTtoolBarValorPorUnidad,jTtoolBarDetalleValorPorUnidad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasValorPorUnidad ,jPanelParametrosReportesValorPorUnidad, jScrollPanelDatosValorPorUnidad,jPanelPaginacionValorPorUnidad, jScrollPanelDatosEdicionValorPorUnidad, jPanelAccionesValorPorUnidad,jPanelAccionesFormularioValorPorUnidad,jmenuBarValorPorUnidad,jmenuBarDetalleValorPorUnidad,jTtoolBarValorPorUnidad,jTtoolBarDetalleValorPorUnidad);
						
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
	
	public void finishProcessValorPorUnidad() {// throws Exception 
		this.finishProcessValorPorUnidad(true);
	}
	
	public void finishProcessValorPorUnidad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasValorPorUnidad ,this.jPanelParametrosReportesValorPorUnidad, this.jScrollPanelDatosValorPorUnidad,this.jPanelPaginacionValorPorUnidad, this.jScrollPanelDatosEdicionValorPorUnidad, this.jPanelAccionesValorPorUnidad,this.jPanelAccionesFormularioValorPorUnidad,this.jmenuBarValorPorUnidad,this.jmenuBarDetalleValorPorUnidad,this.jTtoolBarValorPorUnidad,this.jTtoolBarDetalleValorPorUnidad);		
		
		final JTabbedPane jTabbedPaneBusquedasValorPorUnidad=this.jTabbedPaneBusquedasValorPorUnidad; 
		
		final JPanel jPanelParametrosReportesValorPorUnidad=this.jPanelParametrosReportesValorPorUnidad;
		//final JScrollPane jScrollPanelDatosValorPorUnidad=this.jScrollPanelDatosValorPorUnidad;
		final JTable jTableDatosValorPorUnidad=this.jTableDatosValorPorUnidad;		
		final JPanel jPanelPaginacionValorPorUnidad=this.jPanelPaginacionValorPorUnidad;
		//final JScrollPane jScrollPanelDatosEdicionValorPorUnidad=this.jScrollPanelDatosEdicionValorPorUnidad;
		final JPanel jPanelAccionesValorPorUnidad=this.jPanelAccionesValorPorUnidad;
		
		JPanel jPanelCamposAuxiliarValorPorUnidad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarValorPorUnidad=new JPanel();
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			jPanelCamposAuxiliarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jPanelCamposValorPorUnidad;
			jPanelAccionesFormularioAuxiliarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jPanelAccionesFormularioValorPorUnidad;
		}
		
		final JPanel jPanelCamposValorPorUnidad=jPanelCamposAuxiliarValorPorUnidad;
		final JPanel jPanelAccionesFormularioValorPorUnidad=jPanelAccionesFormularioAuxiliarValorPorUnidad;
		
		
		final JMenuBar jmenuBarValorPorUnidad=this.jmenuBarValorPorUnidad;		
		final JToolBar jTtoolBarValorPorUnidad=this.jTtoolBarValorPorUnidad;
				
		JMenuBar jmenuBarDetalleAuxiliarValorPorUnidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarValorPorUnidad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			jmenuBarDetalleAuxiliarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jmenuBarDetalleValorPorUnidad;
			jTtoolBarDetalleAuxiliarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jTtoolBarDetalleValorPorUnidad;		
		}
		
		final JMenuBar jmenuBarDetalleValorPorUnidad=jmenuBarDetalleAuxiliarValorPorUnidad;
		final JToolBar jTtoolBarDetalleValorPorUnidad=jTtoolBarDetalleAuxiliarValorPorUnidad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasValorPorUnidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesValorPorUnidad;
			processRunnable.jTableDatos=jTableDatosValorPorUnidad;
			processRunnable.jPanelCampos=jPanelCamposValorPorUnidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionValorPorUnidad;
			processRunnable.jPanelAcciones=jPanelAccionesValorPorUnidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioValorPorUnidad;
			
			
			processRunnable.jmenuBar=jmenuBarValorPorUnidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleValorPorUnidad;
			processRunnable.jTtoolBar=jTtoolBarValorPorUnidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleValorPorUnidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasValorPorUnidad ,jPanelParametrosReportesValorPorUnidad, jTableDatosValorPorUnidad,/*jScrollPanelDatosValorPorUnidad,*/jPanelCamposValorPorUnidad,jPanelPaginacionValorPorUnidad, /*jScrollPanelDatosEdicionValorPorUnidad,*/ jPanelAccionesValorPorUnidad,jPanelAccionesFormularioValorPorUnidad,jmenuBarValorPorUnidad,jmenuBarDetalleValorPorUnidad,jTtoolBarValorPorUnidad,jTtoolBarDetalleValorPorUnidad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesValorPorUnidad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarValorPorUnidad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuValorPorUnidad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarValorPorUnidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarValorPorUnidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleValorPorUnidad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuValorPorUnidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarValorPorUnidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleValorPorUnidad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.valorporunidadConstantesFunciones.getsFinalQueryValorPorUnidad();
		String  finalQueryPaginacionTodos=this.valorporunidadConstantesFunciones.getsFinalQueryValorPorUnidad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ValorPorUnidadConstantesFunciones.getArrayColumnasGlobalesNoValorPorUnidad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ValorPorUnidadConstantesFunciones.getArrayColumnasGlobalesValorPorUnidad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ValorPorUnidadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.valorporunidadsEliminados= new ArrayList<ValorPorUnidad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessValorPorUnidad();
		
				///*ValorPorUnidadSessionBean*/this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
			
			if(this.valorporunidadSessionBean==null) {
				this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
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
					this.iNumeroPaginacion=ValorPorUnidadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ValorPorUnidadConstantesFunciones.getClassesForeignKeysOfValorPorUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/valorporunidad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			valorporunidadsAux= new ArrayList<ValorPorUnidad>();
			
				
			valorporunidadLogic.setDatosCliente(this.datosCliente);
			valorporunidadLogic.setDatosDeep(this.datosDeep);
			valorporunidadLogic.setIsConDeep(true);
			
			
			valorporunidadLogic.getValorPorUnidadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					valorporunidadLogic.getTodosValorPorUnidads(finalQueryGlobal,pagination);
					
					//valorporunidadLogic.getTodosValorPorUnidadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(valorporunidadLogic.getValorPorUnidads()==null|| valorporunidadLogic.getValorPorUnidads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							valorporunidadsAux= new ArrayList<ValorPorUnidad>();
							valorporunidadsAux.addAll(valorporunidadLogic.getValorPorUnidads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorporunidadsAux= new ArrayList<ValorPorUnidad>();
							valorporunidadsAux.addAll(valorporunidads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							valorporunidadLogic.getTodosValorPorUnidads(finalQueryGlobal+"",this.pagination);												
							
							//valorporunidadLogic.getTodosValorPorUnidadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteValorPorUnidads("Todos",valorporunidadLogic.getValorPorUnidads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							valorporunidadLogic.setValorPorUnidads(new ArrayList<ValorPorUnidad>());					
							valorporunidadLogic.getValorPorUnidads().addAll(valorporunidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorporunidads=new ArrayList<ValorPorUnidad>();
							valorporunidads.addAll(valorporunidadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idValorPorUnidad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idValorPorUnidad=this.idActual;
				
				} else if(this.idValorPorUnidadActual!=null && this.idValorPorUnidadActual!=0L) {
					idValorPorUnidad=idValorPorUnidadActual;
				}
				
					
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndicePorId(idValorPorUnidad);
				
				this.valorporunidads=new ArrayList<ValorPorUnidad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					valorporunidadLogic.getEntity(idValorPorUnidad);
					
					//valorporunidadLogic.getEntityWithConnection(idValorPorUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					valorporunidadLogic.setValorPorUnidads(new ArrayList<ValorPorUnidad>());
					valorporunidadLogic.getValorPorUnidads().add(valorporunidadLogic.getValorPorUnidad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.valorporunidads=new ArrayList<ValorPorUnidad>();
					this.valorporunidads.add(valorporunidad);
				}
				
				if(valorporunidadLogic.getValorPorUnidad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					valorporunidadLogic.getValorPorUnidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=valorporunidadLogic.getValorPorUnidads()==null||valorporunidadLogic.getValorPorUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=valorporunidads==null|| valorporunidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						valorporunidadsAux=new ArrayList<ValorPorUnidad>();
						valorporunidadsAux.addAll(valorporunidadLogic.getValorPorUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorporunidadsAux=new ArrayList<ValorPorUnidad>();
							valorporunidadsAux.addAll(valorporunidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							valorporunidadLogic.getValorPorUnidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteValorPorUnidads("FK_IdEmpresa",valorporunidadLogic.getValorPorUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteValorPorUnidads("FK_IdEmpresa",valorporunidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						valorporunidadLogic.setValorPorUnidads(new ArrayList<ValorPorUnidad>());
						valorporunidadLogic.getValorPorUnidads().addAll(valorporunidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorporunidads=new ArrayList<ValorPorUnidad>();
							valorporunidads.addAll(valorporunidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					valorporunidadLogic.getValorPorUnidadsFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=valorporunidadLogic.getValorPorUnidads()==null||valorporunidadLogic.getValorPorUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=valorporunidads==null|| valorporunidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						valorporunidadsAux=new ArrayList<ValorPorUnidad>();
						valorporunidadsAux.addAll(valorporunidadLogic.getValorPorUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorporunidadsAux=new ArrayList<ValorPorUnidad>();
							valorporunidadsAux.addAll(valorporunidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							valorporunidadLogic.getValorPorUnidadsFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ValorPorUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteValorPorUnidads("FK_IdUnidad",valorporunidadLogic.getValorPorUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteValorPorUnidads("FK_IdUnidad",valorporunidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						valorporunidadLogic.setValorPorUnidads(new ArrayList<ValorPorUnidad>());
						valorporunidadLogic.getValorPorUnidads().addAll(valorporunidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorporunidads=new ArrayList<ValorPorUnidad>();
							valorporunidads.addAll(valorporunidadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesValorPorUnidad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessValorPorUnidad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=valorporunidadLogic.getValorPorUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=valorporunidads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=valorporunidadLogic.getValorPorUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=valorporunidads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ValorPorUnidad valorporunidad) {
		Boolean permite=true;
		
		if(this.valorporunidad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ValorPorUnidadConstantesFunciones.getOrderByListaValorPorUnidad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ValorPorUnidadConstantesFunciones.getOrderByListaValorPorUnidad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ValorPorUnidad valorporunidad:valorporunidadLogic.getValorPorUnidads()) {
				if(valorporunidad.getsType().equals(Constantes2.S_TOTALES)) {
					valorporunidadTotales=valorporunidad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ValorPorUnidad valorporunidad:this.valorporunidads) {
				if(valorporunidad.getsType().equals(Constantes2.S_TOTALES)) {
					valorporunidadTotales=valorporunidad;
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
			this.valorporunidadAux=new ValorPorUnidad();
			this.valorporunidadAux.setsType(Constantes2.S_TOTALES);
			this.valorporunidadAux.setIsNew(false);
			this.valorporunidadAux.setIsChanged(false);
			this.valorporunidadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ValorPorUnidadConstantesFunciones.TotalizarValoresFilaValorPorUnidad(this.valorporunidadLogic.getValorPorUnidads(),this.valorporunidadAux);
				
				this.valorporunidadLogic.getValorPorUnidads().add(this.valorporunidadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ValorPorUnidadConstantesFunciones.TotalizarValoresFilaValorPorUnidad(this.valorporunidads,this.valorporunidadAux);
				
				this.valorporunidads.add(this.valorporunidadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		valorporunidadTotales=new ValorPorUnidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.valorporunidadLogic.getValorPorUnidads().remove(valorporunidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.valorporunidads.remove(valorporunidadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		valorporunidadTotales=new ValorPorUnidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ValorPorUnidad valorporunidad:valorporunidadLogic.getValorPorUnidads()) {
				if(valorporunidad.getsType().equals(Constantes2.S_TOTALES)) {
					valorporunidadTotales=valorporunidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ValorPorUnidadConstantesFunciones.TotalizarValoresFilaValorPorUnidad(this.valorporunidadLogic.getValorPorUnidads(),valorporunidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ValorPorUnidad valorporunidad:this.valorporunidads) {
				if(valorporunidad.getsType().equals(Constantes2.S_TOTALES)) {
					valorporunidadTotales=valorporunidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ValorPorUnidadConstantesFunciones.TotalizarValoresFilaValorPorUnidad(this.valorporunidads,valorporunidadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getValorPorUnidadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getValorPorUnidadsFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getValorPorUnidadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					valorporunidadLogic.getValorPorUnidadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getValorPorUnidadsFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					valorporunidadLogic.getValorPorUnidadsFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosValorPorUnidad() {
		this.isPermisoTodoValorPorUnidad=false;
		this.isPermisoNuevoValorPorUnidad=false;
		this.isPermisoActualizarValorPorUnidad=false;
		this.isPermisoActualizarOriginalValorPorUnidad=false;
		this.isPermisoEliminarValorPorUnidad=false;
		this.isPermisoGuardarCambiosValorPorUnidad=false;
		this.isPermisoConsultaValorPorUnidad=false;
		this.isPermisoBusquedaValorPorUnidad=false;
		this.isPermisoReporteValorPorUnidad=false;		
		this.isPermisoOrdenValorPorUnidad=false;		
		this.isPermisoPaginacionMedioValorPorUnidad=false;		
		this.isPermisoPaginacionAltoValorPorUnidad=false;
		this.isPermisoPaginacionTodoValorPorUnidad=false;
		this.isPermisoCopiarValorPorUnidad=false;		
		this.isPermisoVerFormValorPorUnidad=false;		
		this.isPermisoDuplicarValorPorUnidad=false;		
		this.isPermisoOrdenValorPorUnidad=false;		
	}
	
	public void setPermisosUsuarioValorPorUnidad(Boolean isPermiso) {
		this.isPermisoTodoValorPorUnidad=isPermiso;
		this.isPermisoNuevoValorPorUnidad=isPermiso;
		this.isPermisoActualizarValorPorUnidad=isPermiso;
		this.isPermisoActualizarOriginalValorPorUnidad=isPermiso;
		this.isPermisoEliminarValorPorUnidad=isPermiso;
		this.isPermisoGuardarCambiosValorPorUnidad=isPermiso;
		this.isPermisoConsultaValorPorUnidad=isPermiso;
		this.isPermisoBusquedaValorPorUnidad=isPermiso;
		this.isPermisoReporteValorPorUnidad=isPermiso;
		this.isPermisoOrdenValorPorUnidad=isPermiso;		
		this.isPermisoPaginacionMedioValorPorUnidad=isPermiso;		
		this.isPermisoPaginacionAltoValorPorUnidad=isPermiso;		
		this.isPermisoPaginacionTodoValorPorUnidad=isPermiso;		
		this.isPermisoCopiarValorPorUnidad=isPermiso;		
		this.isPermisoVerFormValorPorUnidad=isPermiso;		
		this.isPermisoDuplicarValorPorUnidad=isPermiso;
		this.isPermisoOrdenValorPorUnidad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioValorPorUnidad(Boolean isPermiso) {
		//this.isPermisoTodoValorPorUnidad=isPermiso;
		this.isPermisoNuevoValorPorUnidad=isPermiso;
		this.isPermisoActualizarValorPorUnidad=isPermiso;
		this.isPermisoActualizarOriginalValorPorUnidad=isPermiso;
		this.isPermisoEliminarValorPorUnidad=isPermiso;
		this.isPermisoGuardarCambiosValorPorUnidad=isPermiso;
		//this.isPermisoConsultaValorPorUnidad=isPermiso;
		//this.isPermisoBusquedaValorPorUnidad=isPermiso;
		//this.isPermisoReporteValorPorUnidad=isPermiso;
		//this.isPermisoOrdenValorPorUnidad=isPermiso;		
		//this.isPermisoPaginacionMedioValorPorUnidad=isPermiso;		
		//this.isPermisoPaginacionAltoValorPorUnidad=isPermiso;		
		//this.isPermisoPaginacionTodoValorPorUnidad=isPermiso;		
		//this.isPermisoCopiarValorPorUnidad=isPermiso;		
		//this.isPermisoDuplicarValorPorUnidad=isPermiso;
		//this.isPermisoOrdenValorPorUnidad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioValorPorUnidadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ValorPorUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebValorPorUnidad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioValorPorUnidadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioValorPorUnidadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionValorPorUnidadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioValorPorUnidadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioValorPorUnidad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ValorPorUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ValorPorUnidadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoValorPorUnidad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarValorPorUnidad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalValorPorUnidad=this.isPermisoActualizarValorPorUnidad;
			this.isPermisoEliminarValorPorUnidad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosValorPorUnidad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaValorPorUnidad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaValorPorUnidad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoValorPorUnidad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteValorPorUnidad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenValorPorUnidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioValorPorUnidad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoValorPorUnidad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoValorPorUnidad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarValorPorUnidad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormValorPorUnidad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarValorPorUnidad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenValorPorUnidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosValorPorUnidad.setToolTipText(this.jTableDatosValorPorUnidad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioValorPorUnidad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioValorPorUnidad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ValorPorUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ValorPorUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioValorPorUnidad() throws Exception {
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
	public void inicializarCombosForeignKeyValorPorUnidadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyValorPorUnidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ValorPorUnidadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyValorPorUnidadListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyUnidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyValorPorUnidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ValorPorUnidadParameterReturnGeneral valorporunidadReturnGeneral=new ValorPorUnidadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.valorporunidadConstantesFunciones.cargarid_empresaValorPorUnidad)
					 || (this.esRecargarFks && this.valorporunidadConstantesFunciones.cargarid_empresaValorPorUnidad)) {

					if(!this.valorporunidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+valorporunidadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.valorporunidadConstantesFunciones.cargarid_unidadValorPorUnidad)
					 || (this.esRecargarFks && this.valorporunidadConstantesFunciones.cargarid_unidadValorPorUnidad)) {

					if(!this.valorporunidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+valorporunidadSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				valorporunidadReturnGeneral=valorporunidadLogic.cargarCombosLoteForeignKeyValorPorUnidad(finalQueryGlobalEmpresa,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=valorporunidadReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=valorporunidadReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyValorPorUnidad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.valorporunidadSessionBean==null) {
				this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
			}

			if(!this.valorporunidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.valorporunidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				Unidad unidad=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidad,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidad.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidadsForeignKey,unidad,true)) {

					this.unidadsForeignKey.add(0,unidad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyValorPorUnidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyValorPorUnidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyValorPorUnidad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyValorPorUnidad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyValorPorUnidad(ValorPorUnidad valorporunidad)throws Exception {	
		try {
			
			this.setActualUnidadForeignKey(valorporunidad.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyValorPorUnidad(ValorPorUnidad valorporunidad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyValorPorUnidad()throws Exception {	
		try {
			
			this.setActualUnidadForeignKey(this.valorporunidadConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyValorPorUnidad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyValorPorUnidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyValorPorUnidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroValorPorUnidad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyValorPorUnidad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyValorPorUnidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyValorPorUnidad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad!=null && this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad!=null && this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ValorPorUnidadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ValorPorUnidadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ValorPorUnidadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.valorporunidadSessionBean=new ValorPorUnidadSessionBean(); 
		this.valorporunidadConstantesFunciones=new ValorPorUnidadConstantesFunciones(); 
		this.valorporunidadBean=new ValorPorUnidad();//(this.valorporunidadConstantesFunciones); 		
		this.valorporunidadReturnGeneral=new ValorPorUnidadParameterReturnGeneral(); 
		
		this.valorporunidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.valorporunidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ValorPorUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ValorPorUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ValorPorUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessValorPorUnidad(true);
			
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
			
			this.valorporunidadConstantesFunciones=new ValorPorUnidadConstantesFunciones(); 
			this.valorporunidadBean=new ValorPorUnidad();//this.valorporunidadConstantesFunciones); 			
			this.valorporunidadReturnGeneral=new ValorPorUnidadParameterReturnGeneral(); 
		
			ValorPorUnidadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Valor Por Unidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.valorporunidad=new ValorPorUnidad();
			this.valorporunidads = new ArrayList<ValorPorUnidad>();
			this.valorporunidadsAux = new ArrayList<ValorPorUnidad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic=new ValorPorUnidadLogic();
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}
			
			//this.valorporunidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.valorporunidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormValorPorUnidad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoValorPorUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoValorPorUnidad);	
					}
					
					if(this.jInternalFrameImportacionValorPorUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionValorPorUnidad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByValorPorUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByValorPorUnidad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormValorPorUnidad);
				this.jInternalFrameDetalleFormValorPorUnidad.setVisible(false);
				this.jInternalFrameDetalleFormValorPorUnidad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoValorPorUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoValorPorUnidad);
					this.jInternalFrameReporteDinamicoValorPorUnidad.setVisible(false);
					this.jInternalFrameReporteDinamicoValorPorUnidad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionValorPorUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionValorPorUnidad);
					this.jInternalFrameImportacionValorPorUnidad.setVisible(false);
					this.jInternalFrameImportacionValorPorUnidad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByValorPorUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByValorPorUnidad);
					this.jInternalFrameOrderByValorPorUnidad.setVisible(false);
					this.jInternalFrameOrderByValorPorUnidad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idValorPorUnidadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ValorPorUnidadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.valorporunidadReturnGeneral=new ValorPorUnidadParameterReturnGeneral();
			
			this.valorporunidadParameterGeneral=new ValorPorUnidadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.valorporunidadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ValorPorUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ValorPorUnidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.valorporunidadSessionBean.getEsGuardarRelacionado(),this.valorporunidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ValorPorUnidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.valorporunidadSessionBean.getEsGuardarRelacionado(),this.valorporunidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoValorPorUnidad=false;
			this.isVisibilidadCeldaDuplicarValorPorUnidad=true;
			this.isVisibilidadCeldaCopiarValorPorUnidad=true;
			this.isVisibilidadCeldaVerFormValorPorUnidad=true;
			this.isVisibilidadCeldaOrdenValorPorUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=false;
			this.isVisibilidadCeldaModificarValorPorUnidad=false;
			this.isVisibilidadCeldaActualizarValorPorUnidad=false;
			this.isVisibilidadCeldaEliminarValorPorUnidad=false;
			this.isVisibilidadCeldaCancelarValorPorUnidad=false;
			this.isVisibilidadCeldaGuardarValorPorUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesValorPorUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosValorPorUnidad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioValorPorUnidad(false);
			
			this.setPermisosUsuarioValorPorUnidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.valorporunidadSessionBean.getEsGuardarRelacionado() 
				|| (this.valorporunidadSessionBean.getEsGuardarRelacionado() && this.valorporunidadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioValorPorUnidadClasesRelacionadas();
			}
			
			if(this.valorporunidadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioValorPorUnidadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosValorPorUnidad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualValorPorUnidad();
			}
			
			if(!this.isPermisoBusquedaValorPorUnidad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasValorPorUnidad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioValorPorUnidad,this.isPermisoPaginacionMedioValorPorUnidad,this.isPermisoPaginacionTodoValorPorUnidad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ValorPorUnidadConstantesFunciones.getTiposSeleccionarValorPorUnidad());
				
				this.tiposColumnasSelect=ValorPorUnidadConstantesFunciones.getTiposSeleccionarValorPorUnidad(true);
				
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
			//if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioValorPorUnidad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioValorPorUnidad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioValorPorUnidad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesValorPorUnidad() ;
			
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
			this.unidadLogic=new UnidadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				valorporunidadImplementable= (ValorPorUnidadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ValorPorUnidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				valorporunidadImplementableHome= (ValorPorUnidadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ValorPorUnidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.valorporunidads= new ArrayList<ValorPorUnidad>();
			this.valorporunidadsEliminados= new ArrayList<ValorPorUnidad>();
						
			this.isEsNuevoValorPorUnidad=false;
			this.esParaAccionDesdeFormularioValorPorUnidad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyValorPorUnidad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroValorPorUnidad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ValorPorUnidadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ValorPorUnidadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesValorPorUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingValorPorUnidad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioValorPorUnidad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioValorPorUnidad();
			}
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasValorPorUnidad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasValorPorUnidad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasValorPorUnidad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessValorPorUnidad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ValorPorUnidad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectValorPorUnidad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesValorPorUnidad")) {
				iIndex=this.jInternalFrameDetalleFormValorPorUnidad.jTabbedPaneRelacionesValorPorUnidad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormValorPorUnidad.jTabbedPaneRelacionesValorPorUnidad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessValorPorUnidad();	
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
	
	public void cargarCombosForeignKeyValorPorUnidad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyValorPorUnidad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyValorPorUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyValorPorUnidadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyValorPorUnidad();
		
		this.cargarCombosFrameForeignKeyValorPorUnidad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyValorPorUnidad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyValorPorUnidad();
		}
	}
	
	

	public void cargarCombosForeignKeyUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoValorPorUnidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.valorporunidadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
			
			if(jTableDatosValorPorUnidad.getRowCount()>=1) {
				jTableDatosValorPorUnidad.removeRowSelectionInterval(0, jTableDatosValorPorUnidad.getRowCount()-1);						
			}
			
			this.isEsNuevoValorPorUnidad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoValorPorUnidad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesValorPorUnidad(true);			
			//this.valorporunidad=new ValorPorUnidad();
			//this.valorporunidad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesValorPorUnidad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualValorPorUnidad() ;
			
			if(ValorPorUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleValorPorUnidad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.valorporunidad);	
			this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);				
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
			if(this.valorporunidadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ValorPorUnidad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarValorPorUnidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosValorPorUnidad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosValorPorUnidad.getSelectedRows().length;			
			}
			
			valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoValorPorUnidad--;			
				//ValorPorUnidad valorporunidadAux= new ValorPorUnidad();			
				//valorporunidadAux.setId(this.iIdNuevoValorPorUnidad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ValorPorUnidad valorporunidadOrigen=new ValorPorUnidad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ValorPorUnidad valorporunidadOrigen : valorporunidadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							valorporunidadOrigen =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorporunidadOrigen =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaValorPorUnidad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.valorporunidad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosValorPorUnidad(valorporunidadOrigen,this.valorporunidad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.valorporunidadLogic.getValorPorUnidads().add(this.valorporunidadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.valorporunidads.add(this.valorporunidadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaValorPorUnidad(false);
				
				this.jTableDatosValorPorUnidad.setRowSelectionInterval(this.getIndiceNuevoValorPorUnidad(), this.getIndiceNuevoValorPorUnidad());
				
				int iLastRow =  this.jTableDatosValorPorUnidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosValorPorUnidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosValorPorUnidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaValorPorUnidad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();									
		
			ValorPorUnidad valorporunidadOrigen=new ValorPorUnidad();
			ValorPorUnidad valorporunidadDestino=new ValorPorUnidad();
				
			valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosValorPorUnidad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || valorporunidadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosValorPorUnidad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						valorporunidadOrigen =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						valorporunidadOrigen =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						valorporunidadDestino =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						valorporunidadDestino =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				valorporunidadOrigen =valorporunidadsSeleccionados.get(0);
				valorporunidadDestino =valorporunidadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosValorPorUnidad(valorporunidadOrigen,valorporunidadDestino,true,false);
				
				valorporunidadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(valorporunidadDestino,valorporunidadLogic.getValorPorUnidads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(valorporunidadDestino,valorporunidads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaValorPorUnidad(false);
				
				//this.jTableDatosValorPorUnidad.setRowSelectionInterval(this.getIndiceNuevoValorPorUnidad(), this.getIndiceNuevoValorPorUnidad());
				
				int iLastRow =  this.jTableDatosValorPorUnidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosValorPorUnidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosValorPorUnidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaValorPorUnidad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormValorPorUnidad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesValorPorUnidad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasValorPorUnidad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesValorPorUnidad.setVisible(!isVisible);
			this.jPanelPaginacionValorPorUnidad.setVisible(!isVisible);
			this.jPanelAccionesValorPorUnidad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameValorPorUnidad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoValorPorUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionValorPorUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByValorPorUnidad();
			
			this.abrirFrameOrderByValorPorUnidad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByValorPorUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleValorPorUnidad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormValorPorUnidad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormValorPorUnidad.isMaximum()) {
					this.jInternalFrameDetalleFormValorPorUnidad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormValorPorUnidad.setSize(this.jInternalFrameDetalleFormValorPorUnidad.iWidthFormulario,this.jInternalFrameDetalleFormValorPorUnidad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormValorPorUnidad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormValorPorUnidad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormValorPorUnidad.isMaximum()) {
						this.jInternalFrameDetalleFormValorPorUnidad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormValorPorUnidad.jContentPaneDetalleValorPorUnidad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormValorPorUnidad.jTabbedPaneRelacionesValorPorUnidad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormValorPorUnidad.jContentPaneDetalleValorPorUnidad.getWidth(),ValorPorUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormValorPorUnidad.jTabbedPaneRelacionesValorPorUnidad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormValorPorUnidad.jContentPaneDetalleValorPorUnidad.getWidth(),ValorPorUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormValorPorUnidad.jTabbedPaneRelacionesValorPorUnidad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormValorPorUnidad.jContentPaneDetalleValorPorUnidad.getWidth(),ValorPorUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormValorPorUnidad.setVisible(true);
	        this.jInternalFrameDetalleFormValorPorUnidad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByValorPorUnidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByValorPorUnidad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByValorPorUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByValorPorUnidad,false,this);
				} else {
					this.jInternalFrameOrderByValorPorUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByValorPorUnidad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByValorPorUnidad);
				this.jInternalFrameOrderByValorPorUnidad.setVisible(false);
				this.jInternalFrameOrderByValorPorUnidad.setSelected(false);
				
				this.jInternalFrameOrderByValorPorUnidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByValorPorUnidad"));
				
				this.inicializarActualizarBindingTablaOrderByValorPorUnidad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionValorPorUnidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionValorPorUnidad==null) {
				
				this.jInternalFrameImportacionValorPorUnidad=new ImportacionJInternalFrame(ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionValorPorUnidad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionValorPorUnidad);
				this.jInternalFrameImportacionValorPorUnidad.setVisible(false);
				this.jInternalFrameImportacionValorPorUnidad.setSelected(false);


				this.jInternalFrameImportacionValorPorUnidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionValorPorUnidad"));
				this.jInternalFrameImportacionValorPorUnidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionValorPorUnidad"));
				this.jInternalFrameImportacionValorPorUnidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionValorPorUnidad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoValorPorUnidad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoValorPorUnidad==null) {
				this.jInternalFrameReporteDinamicoValorPorUnidad=new ReporteDinamicoJInternalFrame(ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoValorPorUnidad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoValorPorUnidad);
				this.jInternalFrameReporteDinamicoValorPorUnidad.setVisible(false);
				this.jInternalFrameReporteDinamicoValorPorUnidad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoValorPorUnidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoValorPorUnidad"));
				this.jInternalFrameReporteDinamicoValorPorUnidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoValorPorUnidad"));
				this.jInternalFrameReporteDinamicoValorPorUnidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoValorPorUnidad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualValorPorUnidad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleValorPorUnidad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormValorPorUnidad);
			
	       	this.jInternalFrameDetalleFormValorPorUnidad.setVisible(false);
	        this.jInternalFrameDetalleFormValorPorUnidad.setSelected(false);
			
			//this.jInternalFrameDetalleFormValorPorUnidad.dispose();
			//this.jInternalFrameDetalleFormValorPorUnidad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoValorPorUnidad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoValorPorUnidad.setVisible(true);
	        this.jInternalFrameReporteDinamicoValorPorUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionValorPorUnidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionValorPorUnidad.setVisible(true);
	        this.jInternalFrameImportacionValorPorUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByValorPorUnidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByValorPorUnidad.setVisible(true);
	        this.jInternalFrameOrderByValorPorUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByValorPorUnidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByValorPorUnidad.setVisible(false);
	        this.jInternalFrameOrderByValorPorUnidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoValorPorUnidad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoValorPorUnidad.setVisible(false);
	        this.jInternalFrameReporteDinamicoValorPorUnidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionValorPorUnidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionValorPorUnidad.setVisible(false);
	        this.jInternalFrameImportacionValorPorUnidad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarValorPorUnidad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarValorPorUnidad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesValorPorUnidad(true);
			//this.isEsNuevoValorPorUnidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesValorPorUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesValorPorUnidad(false) ;
			
			if(valorporunidadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ValorPorUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleValorPorUnidad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualValorPorUnidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaValorPorUnidadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarValorPorUnidad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesValorPorUnidad(true);
			//this.isEsNuevoValorPorUnidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.valorporunidad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesValorPorUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesValorPorUnidad(false) ;
			
			if(ValorPorUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleValorPorUnidad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualValorPorUnidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosValorPorUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorPorUnidad,ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosValorPorUnidad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesValorPorUnidad(false);
			
			//if(!this.isEsNuevoValorPorUnidad) {								
				int intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualValorPorUnidad(this.valorporunidad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
				
			}
			
			if(this.permiteMantenimiento(this.valorporunidad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoValorPorUnidad=true;
					this.inicializarActualizarBindingTablaValorPorUnidad(false);
					this.isEsNuevoValorPorUnidad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoValorPorUnidad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoValorPorUnidad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesValorPorUnidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualValorPorUnidad(false);
				
				this.habilitarDeshabilitarControlesValorPorUnidad(false);
			
												
				
				if(ValorPorUnidadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleValorPorUnidad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoValorPorUnidadActionPerformed(evt,valorporunidadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualValorPorUnidad(this.valorporunidad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosValorPorUnidad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,valorporunidadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.valorporunidad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				this.valorporunidad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				this.valorporunidad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.valorporunidad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ValorPorUnidadModel) this.jTableDatosValorPorUnidad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoValorPorUnidad=true;
				this.inicializarActualizarBindingTablaValorPorUnidad(false);
				this.isEsNuevoValorPorUnidad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesValorPorUnidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualValorPorUnidad(false);
				
				this.habilitarDeshabilitarControlesValorPorUnidad(false);
				
				
				
				if(ValorPorUnidadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleValorPorUnidad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosValorPorUnidad.getRowCount()>=1) {
				jTableDatosValorPorUnidad.removeRowSelectionInterval(0, jTableDatosValorPorUnidad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesValorPorUnidad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaValorPorUnidad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesValorPorUnidad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualValorPorUnidad(false) ;
			
			this.isEsNuevoValorPorUnidad=false;
			
			if(ValorPorUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleValorPorUnidad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingValorPorUnidad(false);
				
				//SI ES MANUAL
				if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualValorPorUnidad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoValorPorUnidad--;			
			//ValorPorUnidad valorporunidadAux= new ValorPorUnidad();			
			//valorporunidadAux.setId(this.iIdNuevoValorPorUnidad);
			
			if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaValorPorUnidad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
			
			this.valorporunidad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.valorporunidadLogic.getValorPorUnidads().add(this.valorporunidadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.valorporunidads.add(this.valorporunidadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaValorPorUnidad(false);
			
			this.jTableDatosValorPorUnidad.setRowSelectionInterval(this.getIndiceNuevoValorPorUnidad(), this.getIndiceNuevoValorPorUnidad());
			
			int iLastRow =  this.jTableDatosValorPorUnidad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosValorPorUnidad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosValorPorUnidad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaValorPorUnidad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingValorPorUnidad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingValorPorUnidad(false);
			
			//SI ES MANUAL
			if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualValorPorUnidad();
			}
			
			//this.abrirFrameTreeValorPorUnidad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Valor Por UnidadES ?", "MANTENIMIENTO DE Valor Por Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionValorPorUnidad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralValorPorUnidad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.valorporunidadReturnGeneral=valorporunidadLogic.procesarImportacionValorPorUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.valorporunidadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarValorPorUnidadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionValorPorUnidad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionValorPorUnidad.setFileImportacion(this.jInternalFrameImportacionValorPorUnidad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionValorPorUnidad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionValorPorUnidad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionValorPorUnidad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionValorPorUnidad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();		

		valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ValorPorUnidadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ValorPorUnidadBaseDesign.jrxml";
			
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
			
			this.generarReporteValorPorUnidads("Todos",valorporunidadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Por Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ValorPorUnidadConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoValorPorUnidad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ValorPorUnidadConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ValorPorUnidadConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ValorPorUnidadConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();		
		
		valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorporunidad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ValorPorUnidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ValorPorUnidad valorporunidad:valorporunidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(valorporunidad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ValorPorUnidad valorporunidad:valorporunidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(valorporunidad.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ValorPorUnidadConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ValorPorUnidad valorporunidad:valorporunidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(valorporunidad.getvalor());
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
			//	this.getFilaCabeceraExportarExcelValorPorUnidad(row);				
			//	iRow++;
			//}				
			
			//for(ValorPorUnidad valorporunidadAux:valorporunidadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelValorPorUnidad(valorporunidadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Por Unidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingValorPorUnidad(false);
			
			//SI ES MANUAL
			if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualValorPorUnidad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingValorPorUnidad(false);
			
			//SI ES MANUAL
			if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualValorPorUnidad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingValorPorUnidad(false);
			
			//SI ES MANUAL
			if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualValorPorUnidad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaValorPorUnidad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosValorPorUnidad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosValorPorUnidad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosValorPorUnidad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosValorPorUnidad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosValorPorUnidad.setMinimumSize(dimensionMinimum);
		this.jTableDatosValorPorUnidad.setMaximumSize(dimensionMaximum);
		this.jTableDatosValorPorUnidad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingValorPorUnidad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingValorPorUnidad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingValorPorUnidad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaValorPorUnidad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesValorPorUnidad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasValorPorUnidad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesValorPorUnidad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesValorPorUnidad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualValorPorUnidad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaValorPorUnidad();
		
		this.inicializarActualizarBindingBotonesManualValorPorUnidad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualValorPorUnidad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesValorPorUnidad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualValorPorUnidad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualValorPorUnidad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosValorPorUnidad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosValorPorUnidad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteValorPorUnidad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormValorPorUnidad.jCheckBoxPostAccionNuevoValorPorUnidad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormValorPorUnidad.jCheckBoxPostAccionSinCerrarValorPorUnidad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormValorPorUnidad.jCheckBoxPostAccionSinMensajeValorPorUnidad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosValorPorUnidad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosValorPorUnidad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteValorPorUnidad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
				this.jInternalFrameDetalleFormValorPorUnidad.jCheckBoxPostAccionNuevoValorPorUnidad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormValorPorUnidad.jCheckBoxPostAccionSinCerrarValorPorUnidad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormValorPorUnidad.jCheckBoxPostAccionSinMensajeValorPorUnidad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionValorPorUnidad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionValorPorUnidad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesValorPorUnidad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoValorPorUnidad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesValorPorUnidad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesValorPorUnidad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarValorPorUnidad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesValorPorUnidad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoValorPorUnidad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesValorPorUnidad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralValorPorUnidad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesValorPorUnidad(Boolean esInicializar) throws Exception {
		try	{	
			if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualValorPorUnidad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesValorPorUnidad() throws Exception {
		try	{
			if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualValorPorUnidad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleValorPorUnidad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualValorPorUnidad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesValorPorUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesValorPorUnidad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesValorPorUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesValorPorUnidad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesValorPorUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesValorPorUnidad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionValorPorUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionValorPorUnidad.addItem(reporte);
			}
			
			
			if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionValorPorUnidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionValorPorUnidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesValorPorUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesValorPorUnidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesValorPorUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesValorPorUnidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarValorPorUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarValorPorUnidad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarValorPorUnidad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualValorPorUnidad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualValorPorUnidad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoValorPorUnidad!=null) {
				this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoValorPorUnidad!=null) {
				this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoValorPorUnidad!=null) {
				
				if(this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoValorPorUnidad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ValorPorUnidadConstantesFunciones.getTiposSeleccionarValorPorUnidad(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ValorPorUnidadConstantesFunciones.getTiposSeleccionarValorPorUnidad(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ValorPorUnidadConstantesFunciones.getTiposSeleccionarValorPorUnidad(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoValorPorUnidad.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualValorPorUnidad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_unidadFK_IdUnidadValorPorUnidad.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadValorPorUnidad.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasValorPorUnidad(Boolean esInicializar) throws Exception {				
		if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualValorPorUnidad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaValorPorUnidad() throws Exception {
		this.inicializarActualizarBindingTablaValorPorUnidad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByValorPorUnidad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ValorPorUnidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ValorPorUnidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosValorPorUnidadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorPorUnidadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ValorPorUnidadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ValorPorUnidadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaValorPorUnidad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=valorporunidadLogic.getValorPorUnidads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=valorporunidads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosValorPorUnidad.setModel(new ValorPorUnidadModel(this.valorporunidadLogic.getValorPorUnidads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosValorPorUnidad.setModel(new ValorPorUnidadModel(this.valorporunidads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByValorPorUnidad!=null && this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByValorPorUnidad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosValorPorUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorPorUnidad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ValorPorUnidadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO,valorporunidadConstantesFunciones.resaltarSeleccionarValorPorUnidad,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO,valorporunidadConstantesFunciones.resaltarSeleccionarValorPorUnidad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosValorPorUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorPorUnidad,ValorPorUnidadConstantesFunciones.LABEL_ID));

		if(this.valorporunidadConstantesFunciones.mostraridValorPorUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ValorPorUnidadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.valorporunidadConstantesFunciones.resaltaridValorPorUnidad,this.valorporunidadConstantesFunciones.activaridValorPorUnidad,iSizeTabla,this,true,"idValorPorUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.valorporunidadConstantesFunciones.resaltaridValorPorUnidad,this.valorporunidadConstantesFunciones.activaridValorPorUnidad,this,true,"idValorPorUnidad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosValorPorUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorPorUnidad,ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.valorporunidadConstantesFunciones.mostrarid_empresaValorPorUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.valorporunidadConstantesFunciones.resaltarid_empresaValorPorUnidad,this,this.valorporunidadConstantesFunciones.activarid_empresaValorPorUnidad,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.valorporunidadConstantesFunciones.resaltarid_empresaValorPorUnidad,this,this.valorporunidadConstantesFunciones.activarid_empresaValorPorUnidad,false,"id_empresaValorPorUnidad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ValorPorUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosValorPorUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorPorUnidad,ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD));

		if(this.valorporunidadConstantesFunciones.mostrarid_unidadValorPorUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.valorporunidadConstantesFunciones.resaltarid_unidadValorPorUnidad,this,this.valorporunidadConstantesFunciones.activarid_unidadValorPorUnidad,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.valorporunidadConstantesFunciones.resaltarid_unidadValorPorUnidad,this,this.valorporunidadConstantesFunciones.activarid_unidadValorPorUnidad,true,"id_unidadValorPorUnidad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ValorPorUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosValorPorUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorPorUnidad,ValorPorUnidadConstantesFunciones.LABEL_VALOR));

		if(this.valorporunidadConstantesFunciones.mostrarvalorValorPorUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ValorPorUnidadConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.valorporunidadConstantesFunciones.resaltarvalorValorPorUnidad,this.valorporunidadConstantesFunciones.activarvalorValorPorUnidad,iSizeTabla,this,true,"valorValorPorUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.valorporunidadConstantesFunciones.resaltarvalorValorPorUnidad,this.valorporunidadConstantesFunciones.activarvalorValorPorUnidad,this,true,"valorValorPorUnidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ValorPorUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.valorporunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.valorporunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosValorPorUnidad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.valorporunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.valorporunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosValorPorUnidad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.valorporunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.valorporunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosValorPorUnidad.addColumn(tableColumn);
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
			
			this.jTableDatosValorPorUnidad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosValorPorUnidad.moveColumn(this.jTableDatosValorPorUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosValorPorUnidad.moveColumn(this.jTableDatosValorPorUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosValorPorUnidad.moveColumn(this.jTableDatosValorPorUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosValorPorUnidad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosValorPorUnidad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosValorPorUnidad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosValorPorUnidad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosValorPorUnidad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosValorPorUnidad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosValorPorUnidad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosValorPorUnidad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=valorporunidadLogic.getValorPorUnidads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=valorporunidads.size()-1;
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
		//this.jTableDatosValorPorUnidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosValorPorUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosValorPorUnidad();
			
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
				
				//this.isEsNuevoValorPorUnidad=false;
					
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
				if(this.valorporunidadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormValorPorUnidad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosValorPorUnidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosValorPorUnidad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.valorporunidad.getsType().equals("DUPLICADO")
				   || this.valorporunidad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoValorPorUnidad=true;
				
				} else {
					this.isEsNuevoValorPorUnidad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
					if(this.valorporunidad.getId()>=0 && !this.valorporunidad.getIsNew()) {						
						this.isEsNuevoValorPorUnidad=false;
						
					} else {
						this.isEsNuevoValorPorUnidad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoValorPorUnidad(esRelaciones);						
				
				this.seleccionarValorPorUnidad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.valorporunidad.getId()<0) {
					this.isEsNuevoValorPorUnidad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarValorPorUnidad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarValorPorUnidad(evt,rowIndex);
				}	
				
				if(this.valorporunidadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ValorPorUnidad: " + this.dDif); 
					}
				}								
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarValorPorUnidad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.valorporunidad)) {
					if(this.valorporunidad.getId()>0) {
						this.valorporunidad.setIsDeleted(true);
						
						this.valorporunidadsEliminados.add(this.valorporunidad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.valorporunidadLogic.getValorPorUnidads().remove(this.valorporunidad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.valorporunidads.remove(this.valorporunidad);				
					}
					
					
					((ValorPorUnidadModel) this.jTableDatosValorPorUnidad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaValorPorUnidad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarValorPorUnidad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoValorPorUnidad) {
			
			if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosValorPorUnidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosValorPorUnidad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioValorPorUnidad(this.valorporunidad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.valorporunidadConstantesFunciones.cargarid_empresaValorPorUnidad || this.valorporunidadConstantesFunciones.event_dependid_empresaValorPorUnidad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.valorporunidad.getid_empresa());
									//this.inicializarActualizarBindingValorPorUnidad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(valorporunidad.getEmpresa()!=null) {
							this.empresasForeignKey.add(valorporunidad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.valorporunidad.getid_empresa(),false,"Formulario");

					//Unidad
					if(!this.valorporunidadConstantesFunciones.cargarid_unidadValorPorUnidad || this.valorporunidadConstantesFunciones.event_dependid_unidadValorPorUnidad) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.valorporunidad.getid_unidad());
									//this.inicializarActualizarBindingValorPorUnidad(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(valorporunidad.getUnidad()!=null) {
							this.unidadsForeignKey.add(valorporunidad.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.valorporunidad.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesValorPorUnidad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesValorPorUnidad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualValorPorUnidad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoValorPorUnidad(ValorPorUnidad valorporunidad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoValorPorUnidad(valorporunidad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoValorPorUnidad(ValorPorUnidad valorporunidad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioValorPorUnidad(valorporunidad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyValorPorUnidad(valorporunidad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyValorPorUnidad(valorporunidad);
	}
	
	public void setVariablesObjetoActualToFormularioValorPorUnidad(ValorPorUnidad valorporunidad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.setText(valorporunidad.getId().toString());
			this.jInternalFrameDetalleFormValorPorUnidad.jTextFieldvalorValorPorUnidad.setText(valorporunidad.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ValorPorUnidad valorporunidadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,valorporunidadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ValorPorUnidad valorporunidadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				valorporunidadLocal=this.valorporunidad;
			} else {
				valorporunidadLocal=this.valorporunidadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(valorporunidadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoValorPorUnidad(valorporunidadLocal,true);
					
					if(valorporunidadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(valorporunidadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(valorporunidadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoValorPorUnidad(ValorPorUnidad valorporunidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualValorPorUnidad(valorporunidad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(valorporunidad);
	}
	
	public void setVariablesFormularioToObjetoActualValorPorUnidad(ValorPorUnidad valorporunidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualValorPorUnidad(valorporunidad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualValorPorUnidad(ValorPorUnidad valorporunidad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.getText()==null || this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.getText()=="" || this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.getText()=="Id") {
				this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.setText("0");
			}

			if(conColumnasBase) {valorporunidad.setId(Long.parseLong(this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ValorPorUnidadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorPorUnidad.jLabelIdValorPorUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			valorporunidad.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormValorPorUnidad.jTextFieldvalorValorPorUnidad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ValorPorUnidadConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorPorUnidad.jLabelvalorValorPorUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualValorPorUnidad(ValorPorUnidad valorporunidadBean,ValorPorUnidad valorporunidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && valorporunidadBean.getid_unidad()!=null && !valorporunidadBean.getid_unidad().equals(-1L))) {valorporunidad.setid_unidad(valorporunidadBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosValorPorUnidad(ValorPorUnidad valorporunidadOrigen,ValorPorUnidad valorporunidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && valorporunidadOrigen.getId()!=null && !valorporunidadOrigen.getId().equals(0L))) {valorporunidad.setId(valorporunidadOrigen.getId());}}
			if(conDefault || (!conDefault && valorporunidadOrigen.getid_unidad()!=null && !valorporunidadOrigen.getid_unidad().equals(-1L))) {valorporunidad.setid_unidad(valorporunidadOrigen.getid_unidad());}
			if(conDefault || (!conDefault && valorporunidadOrigen.getvalor()!=null && !valorporunidadOrigen.getvalor().equals(0.0))) {valorporunidad.setvalor(valorporunidadOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioValorPorUnidad(ValorPorUnidad valorporunidad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.setText(valorporunidad.getId().toString());
			this.jInternalFrameDetalleFormValorPorUnidad.jTextFieldvalorValorPorUnidad.setText(valorporunidad.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioValorPorUnidad(ValorPorUnidadBean valorporunidadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.setText(valorporunidadBean.getId().toString());
			this.jInternalFrameDetalleFormValorPorUnidad.jTextFieldvalorValorPorUnidad.setText(valorporunidadBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanValorPorUnidad(ValorPorUnidadParameterReturnGeneral valorporunidadReturnGeneral,ValorPorUnidadBean valorporunidadBean,Boolean conDefault) throws Exception { 
		try {
			ValorPorUnidad valorporunidadLocal=new ValorPorUnidad();
			
			valorporunidadLocal=valorporunidadReturnGeneral.getValorPorUnidad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && valorporunidadLocal.getId()!=null && !valorporunidadLocal.getId().equals(0L))) {valorporunidadBean.setId(valorporunidadLocal.getId());}}
			if(conDefault || (!conDefault && valorporunidadLocal.getid_unidad()!=null && !valorporunidadLocal.getid_unidad().equals(-1L))) {valorporunidadBean.setid_unidad(valorporunidadLocal.getid_unidad());}
			if(conDefault || (!conDefault && valorporunidadLocal.getvalor()!=null && !valorporunidadLocal.getvalor().equals(0.0))) {valorporunidadBean.setvalor(valorporunidadLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxValorPorUnidadGenerico(Long idValorPorUnidadSeleccionado,JComboBox jComboBoxValorPorUnidad,List<ValorPorUnidad> valorporunidadsLocal)throws Exception {
		try {
			ValorPorUnidad  valorporunidadTemp=null;

			for(ValorPorUnidad valorporunidadAux:valorporunidadsLocal) {
				if(valorporunidadAux.getId()!=null && valorporunidadAux.getId().equals(idValorPorUnidadSeleccionado)) {
					valorporunidadTemp=valorporunidadAux;
					break;
				}
			}

			jComboBoxValorPorUnidad.setSelectedItem(valorporunidadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxValorPorUnidadGenerico(JComboBox jComboBoxValorPorUnidad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxValorPorUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxValorPorUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxValorPorUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxValorPorUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxValorPorUnidad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxValorPorUnidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxValorPorUnidad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxValorPorUnidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxValorPorUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxValorPorUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			valorporunidad=(ValorPorUnidad) valorporunidadLogic.getValorPorUnidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			valorporunidad =(ValorPorUnidad) valorporunidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!valorporunidad.getIsNew() && !valorporunidad.getIsChanged() && !valorporunidad.getIsDeleted()) {
				sDescripcion=valorporunidad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=valorporunidad.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!valorporunidad.getIsNew() && !valorporunidad.getIsChanged() && !valorporunidad.getIsDeleted()) {
				sDescripcion=valorporunidad.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=valorporunidad.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ValorPorUnidad valorporunidadRow=new ValorPorUnidad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			valorporunidadRow=(ValorPorUnidad) valorporunidadLogic.getValorPorUnidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			valorporunidadRow=(ValorPorUnidad) valorporunidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualValorPorUnidad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoValorPorUnidad.setVisible((this.isVisibilidadCeldaNuevoValorPorUnidad && this.isPermisoNuevoValorPorUnidad));			
			this.jButtonDuplicarValorPorUnidad.setVisible((this.isVisibilidadCeldaDuplicarValorPorUnidad && this.isPermisoDuplicarValorPorUnidad));			
			this.jButtonCopiarValorPorUnidad.setVisible((this.isVisibilidadCeldaCopiarValorPorUnidad && this.isPermisoCopiarValorPorUnidad));
			this.jButtonVerFormValorPorUnidad.setVisible((this.isVisibilidadCeldaVerFormValorPorUnidad && this.isPermisoVerFormValorPorUnidad));
			
			this.jButtonAbrirOrderByValorPorUnidad.setVisible((this.isVisibilidadCeldaOrdenValorPorUnidad && this.isPermisoOrdenValorPorUnidad));			
			
			this.jButtonNuevoRelacionesValorPorUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad && this.isPermisoNuevoValorPorUnidad));			
			this.jButtonNuevoGuardarCambiosValorPorUnidad.setVisible((this.isVisibilidadCeldaNuevoValorPorUnidad && this.isPermisoNuevoValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad));
			
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonModificarValorPorUnidad.setVisible((this.isVisibilidadCeldaModificarValorPorUnidad && this.isPermisoActualizarValorPorUnidad));	
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonActualizarValorPorUnidad.setVisible((this.isVisibilidadCeldaActualizarValorPorUnidad && this.isPermisoActualizarValorPorUnidad));	
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonEliminarValorPorUnidad.setVisible((this.isVisibilidadCeldaEliminarValorPorUnidad && this.isPermisoEliminarValorPorUnidad));
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonCancelarValorPorUnidad.setVisible(this.isVisibilidadCeldaCancelarValorPorUnidad);							
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosValorPorUnidad.setVisible((this.isVisibilidadCeldaGuardarValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad));			
			
			}
						
			this.jButtonGuardarCambiosTablaValorPorUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaNuevoValorPorUnidad && this.isPermisoNuevoValorPorUnidad));						
			this.jButtonDuplicarToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaDuplicarValorPorUnidad && this.isPermisoDuplicarValorPorUnidad));						
			this.jButtonCopiarToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaCopiarValorPorUnidad && this.isPermisoCopiarValorPorUnidad));			
			this.jButtonVerFormToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaVerFormValorPorUnidad && this.isPermisoVerFormValorPorUnidad));			
			this.jButtonAbrirOrderByToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaOrdenValorPorUnidad && this.isPermisoOrdenValorPorUnidad));
			this.jButtonNuevoRelacionesToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad && this.isPermisoNuevoValorPorUnidad));			
			this.jButtonNuevoGuardarCambiosToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaNuevoValorPorUnidad && this.isPermisoNuevoValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad));			
			
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonModificarToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaModificarValorPorUnidad && this.isPermisoActualizarValorPorUnidad));	
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonActualizarToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaActualizarValorPorUnidad  && this.isPermisoActualizarValorPorUnidad));	
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonEliminarToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaEliminarValorPorUnidad && this.isPermisoEliminarValorPorUnidad));
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonCancelarToolBarValorPorUnidad.setVisible(this.isVisibilidadCeldaCancelarValorPorUnidad);				
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaGuardarValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarValorPorUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoValorPorUnidad.setVisible((this.isVisibilidadCeldaNuevoValorPorUnidad && this.isPermisoNuevoValorPorUnidad));			
			this.jMenuItemDuplicarValorPorUnidad.setVisible((this.isVisibilidadCeldaDuplicarValorPorUnidad && this.isPermisoDuplicarValorPorUnidad));			
			this.jMenuItemCopiarValorPorUnidad.setVisible((this.isVisibilidadCeldaCopiarValorPorUnidad && this.isPermisoCopiarValorPorUnidad));			
			this.jMenuItemVerFormValorPorUnidad.setVisible((this.isVisibilidadCeldaVerFormValorPorUnidad && this.isPermisoVerFormValorPorUnidad));			
			this.jMenuItemAbrirOrderByValorPorUnidad.setVisible((this.isVisibilidadCeldaOrdenValorPorUnidad && this.isPermisoOrdenValorPorUnidad));			
			//this.jMenuItemMostrarOcultarValorPorUnidad.setVisible((this.isVisibilidadCeldaOrdenValorPorUnidad && this.isPermisoOrdenValorPorUnidad));
			this.jMenuItemDetalleAbrirOrderByValorPorUnidad.setVisible((this.isVisibilidadCeldaOrdenValorPorUnidad && this.isPermisoOrdenValorPorUnidad));			
			//this.jMenuItemDetalleMostrarOcultarValorPorUnidad.setVisible((this.isVisibilidadCeldaOrdenValorPorUnidad && this.isPermisoOrdenValorPorUnidad));			
			this.jMenuItemNuevoRelacionesValorPorUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad && this.isPermisoNuevoValorPorUnidad));			
			this.jMenuItemNuevoGuardarCambiosValorPorUnidad.setVisible((this.isVisibilidadCeldaNuevoValorPorUnidad && this.isPermisoNuevoValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad));									
			
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemModificarValorPorUnidad.setVisible((this.isVisibilidadCeldaModificarValorPorUnidad && this.isPermisoActualizarValorPorUnidad));	
			this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemActualizarValorPorUnidad.setVisible((this.isVisibilidadCeldaActualizarValorPorUnidad && this.isPermisoActualizarValorPorUnidad));	
			this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemEliminarValorPorUnidad.setVisible((this.isVisibilidadCeldaEliminarValorPorUnidad && this.isPermisoEliminarValorPorUnidad));
			this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemCancelarValorPorUnidad.setVisible(this.isVisibilidadCeldaCancelarValorPorUnidad);				
			}
			
			this.jMenuItemGuardarCambiosValorPorUnidad.setVisible((this.isVisibilidadCeldaGuardarValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad));						
			this.jMenuItemGuardarCambiosTablaValorPorUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoValorPorUnidad=this.jButtonNuevoValorPorUnidad.isVisible();
			this.isVisibilidadCeldaDuplicarValorPorUnidad=this.jButtonDuplicarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaCopiarValorPorUnidad=this.jButtonCopiarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaVerFormValorPorUnidad=this.jButtonVerFormValorPorUnidad.isVisible();
			
			this.isVisibilidadCeldaOrdenValorPorUnidad=this.jButtonAbrirOrderByValorPorUnidad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=this.jButtonNuevoRelacionesValorPorUnidad.isVisible();
			this.isVisibilidadCeldaModificarValorPorUnidad=this.jButtonModificarValorPorUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			this.isVisibilidadCeldaActualizarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jButtonActualizarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaEliminarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jButtonEliminarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaCancelarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jButtonCancelarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaGuardarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosValorPorUnidad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=this.jButtonGuardarCambiosTablaValorPorUnidad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoValorPorUnidad=this.jButtonNuevoToolBarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=this.jButtonNuevoRelacionesToolBarValorPorUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			this.isVisibilidadCeldaModificarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jButtonModificarToolBarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaActualizarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jButtonActualizarToolBarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaEliminarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jButtonEliminarToolBarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaCancelarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jButtonCancelarToolBarValorPorUnidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarValorPorUnidad=this.jButtonGuardarCambiosToolBarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=this.jButtonGuardarCambiosTablaToolBarValorPorUnidad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoValorPorUnidad=this.jMenuItemNuevoValorPorUnidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=this.jMenuItemNuevoRelacionesValorPorUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			this.isVisibilidadCeldaModificarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemModificarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaActualizarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemActualizarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaEliminarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemEliminarValorPorUnidad.isVisible();
			this.isVisibilidadCeldaCancelarValorPorUnidad=this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemCancelarValorPorUnidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarValorPorUnidad=this.jMenuItemGuardarCambiosValorPorUnidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=this.jMenuItemGuardarCambiosTablaValorPorUnidad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesValorPorUnidad(Boolean esInicializar) {
		if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.valorporunidadSessionBean.getConGuardarRelaciones()) {
				//if(this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesValorPorUnidad();
			}
			
			this.inicializarActualizarBindingBotonesManualValorPorUnidad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualValorPorUnidad() {
		this.jButtonNuevoValorPorUnidad.setVisible(this.isPermisoNuevoValorPorUnidad);			
		this.jButtonDuplicarValorPorUnidad.setVisible(this.isPermisoDuplicarValorPorUnidad);			
		this.jButtonCopiarValorPorUnidad.setVisible(this.isPermisoCopiarValorPorUnidad);			
		this.jButtonVerFormValorPorUnidad.setVisible(this.isPermisoVerFormValorPorUnidad);			
		
		this.jButtonAbrirOrderByValorPorUnidad.setVisible(this.isPermisoOrdenValorPorUnidad);					
		
		this.jButtonNuevoRelacionesValorPorUnidad.setVisible(this.isPermisoNuevoValorPorUnidad);			
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonModificarValorPorUnidad.setVisible(this.isPermisoActualizarValorPorUnidad);	
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonActualizarValorPorUnidad.setVisible(this.isPermisoActualizarValorPorUnidad);	
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonEliminarValorPorUnidad.setVisible(this.isPermisoEliminarValorPorUnidad);
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonCancelarValorPorUnidad.setVisible(this.isVisibilidadCeldaCancelarValorPorUnidad);						
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosValorPorUnidad.setVisible(this.isPermisoGuardarCambiosValorPorUnidad);							
		}
		
		this.jButtonGuardarCambiosTablaValorPorUnidad.setVisible(this.isPermisoActualizarValorPorUnidad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleValorPorUnidad() {
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonModificarValorPorUnidad.setVisible(this.isPermisoActualizarValorPorUnidad);	
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonActualizarValorPorUnidad.setVisible(this.isPermisoActualizarValorPorUnidad);	
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonEliminarValorPorUnidad.setVisible(this.isPermisoEliminarValorPorUnidad);
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonCancelarValorPorUnidad.setVisible(this.isVisibilidadCeldaCancelarValorPorUnidad);							
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosValorPorUnidad.setVisible((this.isVisibilidadCeldaGuardarValorPorUnidad && this.isPermisoGuardarCambiosValorPorUnidad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosValorPorUnidad() {
		if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualValorPorUnidad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesValorPorUnidad() {
	}
	
	public void jTableDatosValorPorUnidadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarValorPorUnidad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidValorPorUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualValorPorUnidad(this.getvalorporunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.valorporunidad==null) {
						this.valorporunidad = new ValorPorUnidad();
					}

					this.setVariablesFormularioToObjetoActualValorPorUnidad(this.valorporunidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
				}

				if(this.valorporunidad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.valorporunidad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingValorPorUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaValorPorUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebValorPorUnidad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosValorPorUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosValorPorUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualValorPorUnidad(this.getvalorporunidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.valorporunidadLogic.getConnexion());

				if(this.valorporunidad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.valorporunidad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderValorPorUnidad=(TitledBorder)this.jScrollPanelDatosValorPorUnidad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderValorPorUnidad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaValorPorUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualValorPorUnidad(this.getvalorporunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.valorporunidad==null) {
						this.valorporunidad = new ValorPorUnidad();
					}

					this.setVariablesFormularioToObjetoActualValorPorUnidad(this.valorporunidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
				}

				if(this.valorporunidad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.valorporunidad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingValorPorUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadValorPorUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebValorPorUnidad(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosValorPorUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosValorPorUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualValorPorUnidad(this.getvalorporunidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.valorporunidadLogic.getConnexion());

				if(this.valorporunidad.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.valorporunidad.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderValorPorUnidad=(TitledBorder)this.jScrollPanelDatosValorPorUnidad.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderValorPorUnidad.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadValorPorUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualValorPorUnidad(this.getvalorporunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.valorporunidad==null) {
						this.valorporunidad = new ValorPorUnidad();
					}

					this.setVariablesFormularioToObjetoActualValorPorUnidad(this.valorporunidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
				}

				if(this.valorporunidad.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.valorporunidad.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingValorPorUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorValorPorUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualValorPorUnidad(this.getvalorporunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.valorporunidad==null) {
						this.valorporunidad = new ValorPorUnidad();
					}

					this.setVariablesFormularioToObjetoActualValorPorUnidad(this.valorporunidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);
				}

				if(this.valorporunidad.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.valorporunidad.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingValorPorUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingValorPorUnidad(false,false);

			this.getValorPorUnidadsFK_IdEmpresa();

			this.inicializarActualizarBindingValorPorUnidad(false);

			//if(ValorPorUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingValorPorUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadValorPorUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingValorPorUnidad(false,false);

			this.getValorPorUnidadsFK_IdUnidad();

			this.inicializarActualizarBindingValorPorUnidad(false);

			//if(ValorPorUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingValorPorUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorporunidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameValorPorUnidad() {
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
			this.jInternalFrameDetalleFormValorPorUnidad.setVisible(false);	    			
			this.jInternalFrameDetalleFormValorPorUnidad.dispose();
			this.jInternalFrameDetalleFormValorPorUnidad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoValorPorUnidad!=null) {
			this.jInternalFrameReporteDinamicoValorPorUnidad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoValorPorUnidad.dispose();
			this.jInternalFrameReporteDinamicoValorPorUnidad=null;
		}
		
		if(this.jInternalFrameImportacionValorPorUnidad!=null) {
			this.jInternalFrameImportacionValorPorUnidad.setVisible(false);	    			
			this.jInternalFrameImportacionValorPorUnidad.dispose();
			this.jInternalFrameImportacionValorPorUnidad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessValorPorUnidad();
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
			
			if(sTipo.equals("NuevoValorPorUnidad")) {
				jButtonNuevoValorPorUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarValorPorUnidad")) {
				jButtonDuplicarValorPorUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarValorPorUnidad")) {
				jButtonCopiarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormValorPorUnidad")) {
				jButtonVerFormValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarValorPorUnidad")) {
				jButtonNuevoValorPorUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarValorPorUnidad")) {
				jButtonDuplicarValorPorUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoValorPorUnidad")) {
				jButtonNuevoValorPorUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarValorPorUnidad")) {
				jButtonDuplicarValorPorUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesValorPorUnidad")) {
				jButtonNuevoValorPorUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarValorPorUnidad")) {
				jButtonNuevoValorPorUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesValorPorUnidad")) {
				jButtonNuevoValorPorUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarValorPorUnidad")) {
				jButtonModificarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarValorPorUnidad")) {
				jButtonModificarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarValorPorUnidad")) {
				jButtonModificarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarValorPorUnidad")) {
				jButtonActualizarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarValorPorUnidad")) {
				jButtonActualizarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarValorPorUnidad")) {
				jButtonActualizarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarValorPorUnidad")) {
				jButtonEliminarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarValorPorUnidad")) {
				jButtonEliminarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarValorPorUnidad")) {
				jButtonEliminarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarValorPorUnidad")) {
				jButtonCancelarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarValorPorUnidad")) {
				jButtonCancelarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarValorPorUnidad")) {
				jButtonCancelarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarValorPorUnidad")) {
				jButtonCerrarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarValorPorUnidad")) {
				jButtonCerrarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarValorPorUnidad")) {
				jButtonCerrarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarValorPorUnidad")) {
				jButtonMostrarOcultarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarValorPorUnidad")) {
				jButtonCancelarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosValorPorUnidad")) {
				jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarValorPorUnidad")) {
				jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarValorPorUnidad")) {
				jButtonCopiarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarValorPorUnidad")) {
				jButtonVerFormValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosValorPorUnidad")) {
				jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarValorPorUnidad")) {
				jButtonCopiarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormValorPorUnidad")) {
				jButtonVerFormValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaValorPorUnidad")) {
				jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarValorPorUnidad")) {
				jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaValorPorUnidad")) {
				jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionValorPorUnidad")) {
				jButtonRecargarInformacionValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarValorPorUnidad")) {
				jButtonRecargarInformacionValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionValorPorUnidad")) {
				jButtonRecargarInformacionValorPorUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresValorPorUnidad")) {
				jButtonAnterioresValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarValorPorUnidad")) {
				jButtonAnterioresValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreValorPorUnidad")) {
				jButtonAnterioresValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesValorPorUnidad")) {
				jButtonSiguientesValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarValorPorUnidad")) {
				jButtonSiguientesValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesValorPorUnidad")) {
				jButtonSiguientesValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByValorPorUnidad") || sTipo.equals("MenuItemDetalleAbrirOrderByValorPorUnidad")) {
				jButtonAbrirOrderByValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarValorPorUnidad") || sTipo.equals("MenuItemDetalleMostrarOcultarValorPorUnidad")) {
				jButtonMostrarOcultarValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosValorPorUnidad")) {
				jButtonNuevoGuardarCambiosValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarValorPorUnidad")) {
				jButtonNuevoGuardarCambiosValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosValorPorUnidad")) {
				jButtonNuevoGuardarCambiosValorPorUnidadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoValorPorUnidad")) {
				jButtonCerrarReporteDinamicoValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoValorPorUnidad")) {
				jButtonGenerarReporteDinamicoValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoValorPorUnidad")) {
				
				jButtonGenerarExcelReporteDinamicoValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionValorPorUnidad")) {
				jButtonCerrarImportacionValorPorUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionValorPorUnidad")) {
				
				jButtonGenerarImportacionValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionValorPorUnidad")) {
				
				jButtonAbrirImportacionValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesValorPorUnidad")) {
				jComboBoxTiposAccionesValorPorUnidadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesValorPorUnidad")) {
				jComboBoxTiposRelacionesValorPorUnidadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioValorPorUnidad")) {
				jComboBoxTiposAccionesValorPorUnidadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarValorPorUnidad")) {
				
				jComboBoxTiposSeleccionarValorPorUnidadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralValorPorUnidad")) {
				jTextFieldValorCampoGeneralValorPorUnidadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByValorPorUnidad")) {
				jButtonAbrirOrderByValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarValorPorUnidad")) {
				jButtonAbrirOrderByValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByValorPorUnidad")) {
				jButtonCerrarOrderByValorPorUnidadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idValorPorUnidadBusqueda")) {
				this.jButtonidValorPorUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaValorPorUnidadUpdate")) {
				this.jButtonid_empresaValorPorUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaValorPorUnidadBusqueda")) {
				this.jButtonid_empresaValorPorUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadValorPorUnidadUpdate")) {
				this.jButtonid_unidadValorPorUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadValorPorUnidadBusqueda")) {
				this.jButtonid_unidadValorPorUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorValorPorUnidadBusqueda")) {
				this.jButtonvalorValorPorUnidadBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdUnidadValorPorUnidad")) {
				this.jButtonFK_IdUnidadValorPorUnidadActionPerformed(evt);
			}
			
			;
			
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessValorPorUnidad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorPorUnidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				


				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ValorPorUnidad valorporunidadLocal=null;
			
			if(!this.getEsControlTabla()) {
				valorporunidadLocal=this.valorporunidad;
			} else {
				valorporunidadLocal=this.valorporunidadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
							
				
				


				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorPorUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
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
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
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
			
			


			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorPorUnidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
								
						
				


				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
								
				
				


				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorPorUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorPorUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorPorUnidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
							
				
				


				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorPorUnidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
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
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
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
			
			


			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorPorUnidadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
								
				
				


				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorPorUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorPorUnidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorPorUnidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosValorPorUnidad")) {
					jCheckBoxSeleccionarTodosValorPorUnidadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosValorPorUnidad")) {
					jCheckBoxSeleccionadosValorPorUnidadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarValorPorUnidad")) {
					
				}
				
				


				
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
												
				
				


				
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorPorUnidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorPorUnidadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
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
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
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
			
			


			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorPorUnidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorporunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorporunidad);
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
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
				
				


				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorPorUnidad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorPorUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorPorUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorporunidadAnterior =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarValorPorUnidad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosValorPorUnidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosValorPorUnidad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.valorporunidad =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.valorporunidad =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.valorporunidad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarValorPorUnidad")) {
				
				}
				
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarValorPorUnidad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosValorPorUnidad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarValorPorUnidad")) {
			
			}
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessValorPorUnidad();
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
			if(sTipo.equals("NuevoValorPorUnidad")) {
				jButtonNuevoValorPorUnidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarValorPorUnidad")) {
				jButtonDuplicarValorPorUnidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarValorPorUnidad")) {
				jButtonCopiarValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormValorPorUnidad")) {
				jButtonVerFormValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesValorPorUnidad")) {
				jButtonNuevoValorPorUnidadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarValorPorUnidad")) {
				jButtonModificarValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarValorPorUnidad")) {
				jButtonActualizarValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarValorPorUnidad")) {
				jButtonEliminarValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaValorPorUnidad")) {
				jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarValorPorUnidad")) {
				jButtonCancelarValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarValorPorUnidad")) {
				jButtonCerrarValorPorUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosValorPorUnidad")) {
				jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosValorPorUnidad")) {
				jButtonNuevoGuardarCambiosValorPorUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByValorPorUnidad")) {
				jButtonAbrirOrderByValorPorUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionValorPorUnidad")) {
				jButtonRecargarInformacionValorPorUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresValorPorUnidad")) {
				jButtonAnterioresValorPorUnidadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesValorPorUnidad")) {
				jButtonSiguientesValorPorUnidadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idValorPorUnidadBusqueda")) {
				this.jButtonidValorPorUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaValorPorUnidadUpdate")) {
				this.jButtonid_empresaValorPorUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaValorPorUnidadBusqueda")) {
				this.jButtonid_empresaValorPorUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadValorPorUnidadUpdate")) {
				this.jButtonid_unidadValorPorUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadValorPorUnidadBusqueda")) {
				this.jButtonid_unidadValorPorUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorValorPorUnidadBusqueda")) {
				this.jButtonvalorValorPorUnidadBusquedaActionPerformed(evt);
			}
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessValorPorUnidad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameValorPorUnidad")) {
				closingInternalFrameValorPorUnidad();
				
			} else if(sTipo.equals("jButtonCancelarValorPorUnidad")) {
				JInternalFrameBase jInternalFrameDetalleFormValorPorUnidad = (JInternalFrameBase)evt.getSource();
	            	
	            ValorPorUnidadBeanSwingJInternalFrame jInternalFrameParent=(ValorPorUnidadBeanSwingJInternalFrame)jInternalFrameDetalleFormValorPorUnidad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarValorPorUnidadActionPerformed(null);
			}
			
			ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.valorporunidad,new Object(),this.valorporunidadParameterGeneral,this.valorporunidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormValorPorUnidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormValorPorUnidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormValorPorUnidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.valorporunidad)) {
			if(!esControlTabla) {
				if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualValorPorUnidad(this.valorporunidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);			
				}
				
				if(this.valorporunidadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualValorPorUnidad(this.valorporunidad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.valorporunidadReturnGeneral=valorporunidadLogic.procesarEventosValorPorUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.valorporunidadLogic.getValorPorUnidads(),this.valorporunidad,this.valorporunidadParameterGeneral,this.isEsNuevoValorPorUnidad,classes);//this.valorporunidadLogic.getValorPorUnidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanValorPorUnidad(this.valorporunidadReturnGeneral,this.valorporunidadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.valorporunidadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanValorPorUnidad(classes,this.valorporunidadReturnGeneral,this.valorporunidadBean,false);
					}
						
					if(this.valorporunidadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyValorPorUnidad(this.valorporunidadReturnGeneral.getValorPorUnidad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioValorPorUnidad(this.valorporunidadReturnGeneral.getValorPorUnidad());	
					}
						
					if(this.valorporunidadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioValorPorUnidad(this.valorporunidadReturnGeneral.getValorPorUnidad(),classes);//this.valorporunidadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioValorPorUnidad(this.valorporunidad,classes);//this.valorporunidadBean);									
				}
			
				if(ValorPorUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualValorPorUnidad(this.valorporunidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysValorPorUnidad(this.valorporunidad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.valorporunidadAnterior!=null) {
						this.valorporunidad=this.valorporunidadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.valorporunidadReturnGeneral=valorporunidadLogic.procesarEventosValorPorUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.valorporunidadLogic.getValorPorUnidads(),this.valorporunidad,this.valorporunidadParameterGeneral,this.isEsNuevoValorPorUnidad,classes);//this.valorporunidadLogic.getValorPorUnidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.valorporunidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.valorporunidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.valorporunidadReturnGeneral.getValorPorUnidad(),valorporunidadLogic.getValorPorUnidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.valorporunidadReturnGeneral.getValorPorUnidad(),this.valorporunidads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosValorPorUnidad.repaint();
				
				//((AbstractTableModel) this.jTableDatosValorPorUnidad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosValorPorUnidad();
			}
		}
	}
	
	public void actualizarVisualTableDatosValorPorUnidad() throws Exception {
		
		ValorPorUnidadModel valorporunidadModel=(ValorPorUnidadModel)this.jTableDatosValorPorUnidad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			valorporunidadModel.valorporunidads=this.valorporunidadLogic.getValorPorUnidads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			valorporunidadModel.valorporunidads=this.valorporunidads;
		}
		
		
		((ValorPorUnidadModel) this.jTableDatosValorPorUnidad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaValorPorUnidad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvalorporunidadAnterior(),this.valorporunidadLogic.getValorPorUnidads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvalorporunidadAnterior(),this.valorporunidads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosValorPorUnidad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioValorPorUnidad(ValorPorUnidad valorporunidad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
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
										
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.valorporunidad,new Object(),generalEntityParameterGeneral,this.valorporunidadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.valorporunidadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ValorPorUnidadConstantesFunciones.getClassesRelationshipsOfValorPorUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ValorPorUnidadConstantesFunciones.getClassesRelationshipsFromStringsOfValorPorUnidad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormValorPorUnidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ValorPorUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.valorporunidad,new Object(),generalEntityParameterGeneral,this.valorporunidadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioValorPorUnidad(ValorPorUnidadBean valorporunidadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanValorPorUnidad(ArrayList<Classe> classes,ValorPorUnidadReturnGeneral valorporunidadReturnGeneral,ValorPorUnidadBean valorporunidadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualValorPorUnidad(ValorPorUnidad valorporunidad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.valorporunidad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormValorPorUnidad = new ValorPorUnidadDetalleFormJInternalFrame(jDesktopPane,this.valorporunidadSessionBean.getConGuardarRelaciones(),this.valorporunidadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormValorPorUnidad);
		this.jInternalFrameDetalleFormValorPorUnidad.setVisible(false);
		this.jInternalFrameDetalleFormValorPorUnidad.setSelected(false);						
		
		this.jInternalFrameDetalleFormValorPorUnidad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormValorPorUnidad.valorporunidadLogic=this.valorporunidadLogic;
		
		this.cargarCombosFrameForeignKeyValorPorUnidad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleValorPorUnidad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleValorPorUnidad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyValorPorUnidad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyValorPorUnidad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormValorPorUnidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarValorPorUnidad"));
		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonModificarValorPorUnidad.addActionListener(new ButtonActionListener(this,"ModificarValorPorUnidad"));

		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonModificarToolBarValorPorUnidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarValorPorUnidad"));
					
		this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemModificarValorPorUnidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarValorPorUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonActualizarValorPorUnidad.addActionListener (new ButtonActionListener(this,"ActualizarValorPorUnidad"));
		
		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonActualizarToolBarValorPorUnidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarValorPorUnidad"));
						
		this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemActualizarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarValorPorUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonEliminarValorPorUnidad.addActionListener (new ButtonActionListener(this,"EliminarValorPorUnidad"));
		
		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonEliminarToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarValorPorUnidad"));
								
		this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemEliminarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarValorPorUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonCancelarValorPorUnidad.addActionListener (new ButtonActionListener(this,"CancelarValorPorUnidad"));
		
		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonCancelarToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarValorPorUnidad"));
					
		this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemCancelarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarValorPorUnidad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemDetalleCerrarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarValorPorUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarValorPorUnidad"));
		
		
		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarValorPorUnidad"));
		
		
		
		this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioValorPorUnidad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonidValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idValorPorUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_empresaValorPorUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaValorPorUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_empresaValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaValorPorUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_unidadValorPorUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidadValorPorUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_unidadValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadValorPorUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonvalorValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"valorValorPorUnidadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormValorPorUnidad.jTabbedPaneRelacionesValorPorUnidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesValorPorUnidad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameValorPorUnidad"));
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarValorPorUnidad"));
		}
		
		this.jTableDatosValorPorUnidad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarValorPorUnidad"));
		
		this.jTableDatosValorPorUnidad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarValorPorUnidad"));
		
		this.jButtonNuevoValorPorUnidad.addActionListener(new ButtonActionListener(this,"NuevoValorPorUnidad"));
		
		this.jButtonDuplicarValorPorUnidad.addActionListener(new ButtonActionListener(this,"DuplicarValorPorUnidad"));
		
		this.jButtonCopiarValorPorUnidad.addActionListener(new ButtonActionListener(this,"CopiarValorPorUnidad"));
		
		this.jButtonVerFormValorPorUnidad.addActionListener(new ButtonActionListener(this,"VerFormValorPorUnidad"));
		
		
		this.jButtonNuevoToolBarValorPorUnidad.addActionListener(new ButtonActionListener(this,"NuevoToolBarValorPorUnidad"));
			
		this.jButtonDuplicarToolBarValorPorUnidad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarValorPorUnidad"));
			
		this.jMenuItemNuevoValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoValorPorUnidad"));
			
		this.jMenuItemDuplicarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarValorPorUnidad"));		
		
		
		this.jButtonNuevoRelacionesValorPorUnidad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesValorPorUnidad"));
		
		
		this.jButtonNuevoRelacionesToolBarValorPorUnidad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarValorPorUnidad"));
			
		this.jMenuItemNuevoRelacionesValorPorUnidad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesValorPorUnidad"));		
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonModificarValorPorUnidad.addActionListener(new ButtonActionListener(this,"ModificarValorPorUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonModificarToolBarValorPorUnidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarValorPorUnidad"));
			
			this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemModificarValorPorUnidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarValorPorUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonActualizarValorPorUnidad.addActionListener (new ButtonActionListener(this,"ActualizarValorPorUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonActualizarToolBarValorPorUnidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarValorPorUnidad"));
				
			this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemActualizarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarValorPorUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonEliminarValorPorUnidad.addActionListener (new ButtonActionListener(this,"EliminarValorPorUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonEliminarToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarValorPorUnidad"));
						
			this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemEliminarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarValorPorUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonCancelarValorPorUnidad.addActionListener (new ButtonActionListener(this,"CancelarValorPorUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonCancelarToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarValorPorUnidad"));
			
			this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemCancelarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarValorPorUnidad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarValorPorUnidad"));		
		
		
		this.jButtonCerrarValorPorUnidad.addActionListener (new ButtonActionListener(this,"CerrarValorPorUnidad"));
		
		
		this.jButtonCerrarToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"CerrarToolBarValorPorUnidad"));
			
		this.jMenuItemCerrarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarValorPorUnidad"));
			
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jMenuItemDetalleCerrarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarValorPorUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosValorPorUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosValorPorUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarValorPorUnidad"));
		}
		
		this.jButtonCopiarToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"CopiarToolBarValorPorUnidad"));
			
		this.jButtonVerFormToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"VerFormToolBarValorPorUnidad"));
		
		this.jMenuItemGuardarCambiosValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosValorPorUnidad"));
			
		this.jMenuItemCopiarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarValorPorUnidad"));		
		
		this.jMenuItemVerFormValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormValorPorUnidad"));		
		
		
		this.jButtonGuardarCambiosTablaValorPorUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaValorPorUnidad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarValorPorUnidad"));
			
		this.jMenuItemGuardarCambiosTablaValorPorUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaValorPorUnidad"));		
		
		
		
		this.jButtonRecargarInformacionValorPorUnidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionValorPorUnidad"));
					
		this.jButtonRecargarInformacionToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarValorPorUnidad"));
		
		this.jMenuItemRecargarInformacionValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionValorPorUnidad"));		
		
		
		
		this.jButtonAnterioresValorPorUnidad.addActionListener (new ButtonActionListener(this,"AnterioresValorPorUnidad"));
		
		
		this.jButtonAnterioresToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarValorPorUnidad"));
		
		this.jMenuItemAnterioresValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresValorPorUnidad"));		
		
		
		this.jButtonSiguientesValorPorUnidad.addActionListener (new ButtonActionListener(this,"SiguientesValorPorUnidad"));
		
		
		this.jButtonSiguientesToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarValorPorUnidad"));
			
		this.jMenuItemSiguientesValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesValorPorUnidad"));
			
		this.jMenuItemAbrirOrderByValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByValorPorUnidad"));
			
		this.jMenuItemMostrarOcultarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarValorPorUnidad"));
			
		this.jMenuItemDetalleAbrirOrderByValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByValorPorUnidad"));
			
		this.jMenuItemDetalleMostarOcultarValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarValorPorUnidad"));		
		
		
		this.jButtonNuevoGuardarCambiosValorPorUnidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosValorPorUnidad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarValorPorUnidad"));
			
		this.jMenuItemNuevoGuardarCambiosValorPorUnidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosValorPorUnidad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosValorPorUnidad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosValorPorUnidad"));

		this.jCheckBoxSeleccionadosValorPorUnidad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosValorPorUnidad"));
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioValorPorUnidad"));
		}
		
		
		this.jComboBoxTiposRelacionesValorPorUnidad.addActionListener (new ButtonActionListener(this,"TiposRelacionesValorPorUnidad"));
			
		this.jComboBoxTiposAccionesValorPorUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesValorPorUnidad"));
					
		this.jComboBoxTiposSeleccionarValorPorUnidad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarValorPorUnidad"));
			
		this.jTextFieldValorCampoGeneralValorPorUnidad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralValorPorUnidad"));		
		
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonidValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idValorPorUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_empresaValorPorUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaValorPorUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_empresaValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaValorPorUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_unidadValorPorUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidadValorPorUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_unidadValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadValorPorUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonvalorValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"valorValorPorUnidadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdUnidadValorPorUnidad.addActionListener(new ButtonActionListener(this,"FK_IdUnidadValorPorUnidad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoValorPorUnidad!=null) {
				this.jInternalFrameReporteDinamicoValorPorUnidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoValorPorUnidad"));
				this.jInternalFrameReporteDinamicoValorPorUnidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoValorPorUnidad"));
				this.jInternalFrameReporteDinamicoValorPorUnidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoValorPorUnidad"));
			}
			
			//this.jButtonCerrarReporteDinamicoValorPorUnidad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoValorPorUnidad"));				
			//this.jButtonGenerarReporteDinamicoValorPorUnidad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoValorPorUnidad"));
			//this.jButtonGenerarExcelReporteDinamicoValorPorUnidad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoValorPorUnidad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionValorPorUnidad!=null) {
				this.jInternalFrameImportacionValorPorUnidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionValorPorUnidad"));
				this.jInternalFrameImportacionValorPorUnidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionValorPorUnidad"));
				this.jInternalFrameImportacionValorPorUnidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionValorPorUnidad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByValorPorUnidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByValorPorUnidad"));
			
			this.jButtonAbrirOrderByToolBarValorPorUnidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarValorPorUnidad"));			
			
			if(this.jInternalFrameOrderByValorPorUnidad!=null) {
				this.jInternalFrameOrderByValorPorUnidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByValorPorUnidad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorPorUnidad.jTabbedPaneRelacionesValorPorUnidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesValorPorUnidad"));
		
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
            		closingInternalFrameValorPorUnidad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormValorPorUnidad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormValorPorUnidad = (JInternalFrameBase)event.getSource();
	            	
	            ValorPorUnidadBeanSwingJInternalFrame jInternalFrameParent=(ValorPorUnidadBeanSwingJInternalFrame)jInternalFrameDetalleFormValorPorUnidad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarValorPorUnidadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosValorPorUnidad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosValorPorUnidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosValorPorUnidad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosValorPorUnidad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorPorUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorPorUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorPorUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoValorPorUnidad";
		inputMap = this.jButtonNuevoValorPorUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoValorPorUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoValorPorUnidadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorPorUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorPorUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorPorUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesValorPorUnidad";
		inputMap = this.jButtonNuevoRelacionesValorPorUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesValorPorUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoValorPorUnidadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarValorPorUnidad";
		inputMap = this.jButtonModificarValorPorUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarValorPorUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarValorPorUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarValorPorUnidad";
		inputMap = this.jButtonActualizarValorPorUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarValorPorUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarValorPorUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarValorPorUnidad";
		inputMap = this.jButtonEliminarValorPorUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarValorPorUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarValorPorUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarValorPorUnidad";
		inputMap = this.jButtonCancelarValorPorUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarValorPorUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarValorPorUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarValorPorUnidad";
		inputMap = this.jButtonCerrarValorPorUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarValorPorUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarValorPorUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosValorPorUnidad";
		inputMap = this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosValorPorUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonGuardarCambiosValorPorUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosValorPorUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosValorPorUnidad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosValorPorUnidadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesValorPorUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesValorPorUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarValorPorUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarValorPorUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralValorPorUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralValorPorUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonidValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idValorPorUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_empresaValorPorUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaValorPorUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_empresaValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaValorPorUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_unidadValorPorUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidadValorPorUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonid_unidadValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadValorPorUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorPorUnidad.jButtonvalorValorPorUnidadBusqueda.addActionListener(new ButtonActionListener(this,"valorValorPorUnidadBusqueda"));
		
		
		this.jButtonFK_IdUnidadValorPorUnidad.addActionListener(new ButtonActionListener(this,"FK_IdUnidadValorPorUnidad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionValorPorUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionValorPorUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarValorPorUnidadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarValorPorUnidad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosValorPorUnidad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ValorPorUnidad valorporunidadAux:this.valorporunidadLogic.getValorPorUnidads()) {
					valorporunidadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ValorPorUnidad valorporunidadAux:valorporunidads) {
					valorporunidadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosValorPorUnidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingValorPorUnidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ValorPorUnidad valorporunidadAux:this.valorporunidadLogic.getValorPorUnidads()) {
						valorporunidadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ValorPorUnidad valorporunidadAux:valorporunidads) {
						valorporunidadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ValorPorUnidad valorporunidadAux:this.valorporunidadLogic.getValorPorUnidads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ValorPorUnidad valorporunidadAux:valorporunidads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaValorPorUnidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosValorPorUnidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosValorPorUnidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosValorPorUnidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosValorPorUnidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingValorPorUnidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosValorPorUnidad.getSelectedRows();
			
			ValorPorUnidad valorporunidadLocal=new ValorPorUnidad();
			
			//this.seleccionarTodosValorPorUnidad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					valorporunidadLocal =(ValorPorUnidad) this.valorporunidadLogic.getValorPorUnidads().toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					valorporunidadLocal =(ValorPorUnidad) this.valorporunidads.toArray()[this.jTableDatosValorPorUnidad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				valorporunidadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ValorPorUnidad valorporunidadAux:this.valorporunidadLogic.getValorPorUnidads()) {
						valorporunidadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ValorPorUnidad valorporunidadAux:valorporunidads) {
						valorporunidadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaValorPorUnidad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosValorPorUnidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosValorPorUnidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosValorPorUnidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualValorPorUnidadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarValorPorUnidadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralValorPorUnidadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingValorPorUnidad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralValorPorUnidad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ValorPorUnidad valorporunidadAux:this.valorporunidadLogic.getValorPorUnidads()) {
				
						if(sTipoSeleccionar.equals(ValorPorUnidadConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							valorporunidadAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ValorPorUnidad valorporunidadAux:valorporunidads) {
					
						if(sTipoSeleccionar.equals(ValorPorUnidadConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							valorporunidadAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaValorPorUnidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesValorPorUnidadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingValorPorUnidad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioValorPorUnidad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesValorPorUnidad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteValorPorUnidad) {				
					conSplash=true;//false;										
					
					//this.startProcessValorPorUnidad(conSplash);
				
					this.generarReporteValorPorUnidadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoValorPorUnidadsSeleccionados();
				//this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoValorPorUnidadsSeleccionados(false);
				//this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoValorPorUnidadsSeleccionados(true);
				//this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessValorPorUnidad();
				
				this.exportarValorPorUnidadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionValorPorUnidads();
				//this.importarValorPorUnidads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessValorPorUnidad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelValorPorUnidadsSeleccionados();
				//this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Valor Por Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessValorPorUnidad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoValorPorUnidad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyValorPorUnidad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Valor Por Unidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.setSelectedIndex(0);					
				}	
			} 			
			else if(ValorPorUnidadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteValorPorUnidad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessValorPorUnidad(conSplash);
					
						//this.actualizarParametrosGeneralValorPorUnidad();
						
						this.generarReporteProcesoAccionValorPorUnidadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ValorPorUnidadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Valor Por UnidadES SELECCIONADOS?", "MANTENIMIENTO DE Valor Por Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessValorPorUnidad();
				
						this.actualizarParametrosGeneralValorPorUnidad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.valorporunidadReturnGeneral=valorporunidadLogic.procesarAccionValorPorUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.valorporunidadLogic.getValorPorUnidads(),this.valorporunidadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarValorPorUnidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralValorPorUnidad();
					
					ValorPorUnidadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarValorPorUnidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesValorPorUnidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxTiposAccionesFormularioValorPorUnidad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessValorPorUnidad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesValorPorUnidadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessValorPorUnidad();
			
			if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();		
			ValorPorUnidad valorporunidad=new ValorPorUnidad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingValorPorUnidad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesValorPorUnidad.getSelectedItem();
			
			
			
			
			valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(valorporunidadsSeleccionados.size()==1) {
				for(ValorPorUnidad valorporunidadAux:valorporunidadsSeleccionados) {
					valorporunidad=valorporunidadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessValorPorUnidad();
			
      		//this.finishProcessValorPorUnidad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarValorPorUnidadReturnGeneral() throws Exception {
		if(this.valorporunidadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.valorporunidadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.valorporunidadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.valorporunidadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.valorporunidadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.valorporunidadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingValorPorUnidad(false);
		}
		
		if(this.valorporunidadReturnGeneral.getConRetornoLista() || this.valorporunidadReturnGeneral.getConRetornoObjeto()) {
			if(this.valorporunidadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.valorporunidadLogic.setValorPorUnidads(this.valorporunidadReturnGeneral.getValorPorUnidads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.valorporunidadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.valorporunidadLogic.setValorPorUnidad(this.valorporunidadReturnGeneral.getValorPorUnidad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingValorPorUnidad(false);
		}
	}
	
	public void actualizarParametrosGeneralValorPorUnidad() throws Exception {
		
		
	}
	
	public ArrayList<ValorPorUnidad> getValorPorUnidadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioValorPorUnidad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ValorPorUnidad valorporunidadAux:valorporunidadLogic.getValorPorUnidads()) {
					if(valorporunidadAux.getIsSelected()) {
						valorporunidadsSeleccionados.add(valorporunidadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ValorPorUnidad valorporunidadAux:this.valorporunidads) {
					if(valorporunidadAux.getIsSelected()) {
						valorporunidadsSeleccionados.add(valorporunidadAux);				
					}
				}
			}
			
			if(valorporunidadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						valorporunidadsSeleccionados.addAll(this.valorporunidadLogic.getValorPorUnidads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						valorporunidadsSeleccionados.addAll(this.valorporunidads);				
					}
				}
			}
		} else {
			valorporunidadsSeleccionados.add(this.valorporunidad);
		}
		
		return valorporunidadsSeleccionados;
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
	
	public void generarReporteValorPorUnidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalValorPorUnidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoValorPorUnidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoValorPorUnidadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoValorPorUnidadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Valor Por Unidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesValorPorUnidadsSeleccionados() throws Exception {
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();		
		
		valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteValorPorUnidads("Todos",valorporunidadsSeleccionados);
		
	}	
	
	public void generarReporteNormalValorPorUnidadsSeleccionados() throws Exception {
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();		
		
		valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteValorPorUnidads("Todos",valorporunidadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionValorPorUnidadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();
		
		valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteValorPorUnidads("Todos",valorporunidadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoValorPorUnidadsSeleccionados() throws Exception {
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoValorPorUnidad();
		
		
		valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoValorPorUnidad();
		
		
		//this.generarReporteValorPorUnidads("Todos",valorporunidadsSeleccionados ,valorporunidadImplementable,valorporunidadImplementableHome);
	}
	
	public void mostrarImportacionValorPorUnidads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionValorPorUnidad();
		
		this.abrirFrameImportacionValorPorUnidad();		
		
			
		//this.generarReporteValorPorUnidads("Todos",valorporunidadsSeleccionados ,valorporunidadImplementable,valorporunidadImplementableHome);
	}
	
	public void importarValorPorUnidads() throws Exception {		
	
	}
	
	public void exportarValorPorUnidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelValorPorUnidadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoValorPorUnidadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlValorPorUnidadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Valor Por Unidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoValorPorUnidadsSeleccionados() throws Exception {
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();		
		
		valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorporunidad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarValorPorUnidad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ValorPorUnidad valorporunidadAux:valorporunidadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarValorPorUnidad(valorporunidadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//valorporunidadAux.setsDetalleGeneralEntityReporte(valorporunidadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Por Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarValorPorUnidad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ValorPorUnidadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ValorPorUnidadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ValorPorUnidadConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarValorPorUnidad(ValorPorUnidad valorporunidad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=valorporunidad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=valorporunidad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=valorporunidad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=valorporunidad.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=valorporunidad.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelValorPorUnidadsSeleccionados() throws Exception {
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();		
		
		valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorporunidad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ValorPorUnidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelValorPorUnidad(row);				
				iRow++;
			}				
			
			for(ValorPorUnidad valorporunidadAux:valorporunidadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelValorPorUnidad(valorporunidadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Por Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlValorPorUnidadsSeleccionados() throws Exception {
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();		
		
		valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorporunidad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("valorporunidads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("valorporunidad");
			//elementRoot.appendChild(element);
		
			for(ValorPorUnidad valorporunidadAux:valorporunidadsSeleccionados) {
				element = document.createElement("valorporunidad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlValorPorUnidad(valorporunidadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Por Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelValorPorUnidad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ValorPorUnidadConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelValorPorUnidad(ValorPorUnidad valorporunidad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(valorporunidad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(valorporunidad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(valorporunidad.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(valorporunidad.getvalor());				
	}
	
	public void setFilaDatosExportarXmlValorPorUnidad(ValorPorUnidad valorporunidad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ValorPorUnidadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(valorporunidad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ValorPorUnidadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(valorporunidad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ValorPorUnidadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(valorporunidad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementunidad_descripcion = document.createElement(ValorPorUnidadConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(valorporunidad.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementvalor = document.createElement(ValorPorUnidadConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(valorporunidad.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoValorPorUnidadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ValorPorUnidad> valorporunidadsSeleccionados=new ArrayList<ValorPorUnidad>();
		
		valorporunidadsSeleccionados=this.getValorPorUnidadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoValorPorUnidad(valorporunidadsSeleccionados);
		
		this.generarReporteValorPorUnidads("Todos",valorporunidadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoValorPorUnidad(ArrayList<ValorPorUnidad> valorporunidadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ValorPorUnidad valorporunidadAux:valorporunidadsSeleccionados) {
				valorporunidadAux.setsDetalleGeneralEntityReporte(valorporunidadAux.toString());
			
				if(sTipoSeleccionar.equals(ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					valorporunidadAux.setsDescripcionGeneralEntityReporte1(valorporunidadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					valorporunidadAux.setsDescripcionGeneralEntityReporte1(valorporunidadAux.getunidad_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorPorUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesValorPorUnidad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoValorPorUnidad=true;
				this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=true;
				this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=true;
			}
			
			this.isVisibilidadCeldaModificarValorPorUnidad=false;
			this.isVisibilidadCeldaActualizarValorPorUnidad=false;
			this.isVisibilidadCeldaEliminarValorPorUnidad=false;
			this.isVisibilidadCeldaCancelarValorPorUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorPorUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarValorPorUnidad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoValorPorUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=false;
			this.isVisibilidadCeldaModificarValorPorUnidad=false;
			this.isVisibilidadCeldaActualizarValorPorUnidad=true;
			this.isVisibilidadCeldaEliminarValorPorUnidad=false;
			this.isVisibilidadCeldaCancelarValorPorUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorPorUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarValorPorUnidad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoValorPorUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=false;
			this.isVisibilidadCeldaModificarValorPorUnidad=false;
			this.isVisibilidadCeldaActualizarValorPorUnidad=true;
			this.isVisibilidadCeldaEliminarValorPorUnidad=true;
			this.isVisibilidadCeldaCancelarValorPorUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorPorUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarValorPorUnidad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoValorPorUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=false;
			this.isVisibilidadCeldaModificarValorPorUnidad=false;
			this.isVisibilidadCeldaActualizarValorPorUnidad=true;
			this.isVisibilidadCeldaEliminarValorPorUnidad=false;
			this.isVisibilidadCeldaCancelarValorPorUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorPorUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarValorPorUnidad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoValorPorUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=true;
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=true;
			this.isVisibilidadCeldaModificarValorPorUnidad=false;
			this.isVisibilidadCeldaActualizarValorPorUnidad=false;
			this.isVisibilidadCeldaEliminarValorPorUnidad=false;
			this.isVisibilidadCeldaCancelarValorPorUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorPorUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarValorPorUnidad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoValorPorUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=false;
			this.isVisibilidadCeldaActualizarValorPorUnidad=false;
			this.isVisibilidadCeldaEliminarValorPorUnidad=false;
			this.isVisibilidadCeldaCancelarValorPorUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorPorUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarValorPorUnidad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoValorPorUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=false;
			this.isVisibilidadCeldaModificarValorPorUnidad=true;
			this.isVisibilidadCeldaActualizarValorPorUnidad=false;
			this.isVisibilidadCeldaEliminarValorPorUnidad=false;
			this.isVisibilidadCeldaCancelarValorPorUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorPorUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarValorPorUnidad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ValorPorUnidadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoValorPorUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=true;
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=true;
		} else {
			this.actualizarEstadoPanelsValorPorUnidad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarValorPorUnidad=false;
			//this.isVisibilidadCeldaVerFormValorPorUnidad=false;
			this.isVisibilidadCeldaDuplicarValorPorUnidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!valorporunidadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=false;
		} else {
			this.isVisibilidadCeldaNuevoValorPorUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosValorPorUnidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(valorporunidadSessionBean.getEsGuardarRelacionado()) {
			if(!valorporunidadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=false;												
			}
			
			this.jButtonCerrarValorPorUnidad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesValorPorUnidad=false;
		}
		
		if(!this.permiteMantenimiento(this.valorporunidad)) {
			this.isVisibilidadCeldaActualizarValorPorUnidad=false;
			this.isVisibilidadCeldaEliminarValorPorUnidad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesValorPorUnidad() {
	}
	
	public void actualizarEstadoPanelsValorPorUnidad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionValorPorUnidad!=null) {
				this.jScrollPanelDatosEdicionValorPorUnidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorPorUnidad!=null) {
				this.jTabbedPaneBusquedasValorPorUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosValorPorUnidad!=null) {
				this.jScrollPanelDatosValorPorUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionValorPorUnidad!=null) {
				this.jPanelPaginacionValorPorUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesValorPorUnidad!=null) {
				this.jPanelParametrosReportesValorPorUnidad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionValorPorUnidad!=null) {
				this.jScrollPanelDatosEdicionValorPorUnidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorPorUnidad!=null) {
				this.jTabbedPaneBusquedasValorPorUnidad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosValorPorUnidad!=null) {
				this.jScrollPanelDatosValorPorUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionValorPorUnidad!=null) {
				this.jPanelPaginacionValorPorUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesValorPorUnidad!=null) {
				this.jPanelParametrosReportesValorPorUnidad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionValorPorUnidad!=null) {
				this.jScrollPanelDatosEdicionValorPorUnidad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorPorUnidad!=null) {
				this.jTabbedPaneBusquedasValorPorUnidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosValorPorUnidad!=null) {
				this.jScrollPanelDatosValorPorUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionValorPorUnidad!=null) {
				this.jPanelPaginacionValorPorUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesValorPorUnidad!=null) {
				this.jPanelParametrosReportesValorPorUnidad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionValorPorUnidad!=null) {
				this.jScrollPanelDatosEdicionValorPorUnidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorPorUnidad!=null) {
				this.jTabbedPaneBusquedasValorPorUnidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosValorPorUnidad!=null) {
				this.jScrollPanelDatosValorPorUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionValorPorUnidad!=null) {
				this.jPanelPaginacionValorPorUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesValorPorUnidad!=null) {
				this.jPanelParametrosReportesValorPorUnidad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionValorPorUnidad!=null) {
				this.jScrollPanelDatosEdicionValorPorUnidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorPorUnidad!=null) {
				this.jTabbedPaneBusquedasValorPorUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosValorPorUnidad!=null) {
				this.jScrollPanelDatosValorPorUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionValorPorUnidad!=null) {
				this.jPanelPaginacionValorPorUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesValorPorUnidad!=null) {
				this.jPanelParametrosReportesValorPorUnidad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionValorPorUnidad!=null) {
				this.jScrollPanelDatosEdicionValorPorUnidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorPorUnidad!=null) {
				this.jTabbedPaneBusquedasValorPorUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosValorPorUnidad!=null) {
				this.jScrollPanelDatosValorPorUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionValorPorUnidad!=null) {
				this.jPanelPaginacionValorPorUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesValorPorUnidad!=null) {
				this.jPanelParametrosReportesValorPorUnidad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionValorPorUnidad!=null) {
				this.jScrollPanelDatosEdicionValorPorUnidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorPorUnidad!=null) {
				this.jTabbedPaneBusquedasValorPorUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosValorPorUnidad!=null) {
				this.jScrollPanelDatosValorPorUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionValorPorUnidad!=null) {
				this.jPanelPaginacionValorPorUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesValorPorUnidad!=null) {
				this.jPanelParametrosReportesValorPorUnidad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasValorPorUnidad!=null) {
					this.jTabbedPaneBusquedasValorPorUnidad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesValorPorUnidad!=null) {
				this.jPanelParametrosReportesValorPorUnidad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorPorUnidad!=null) {
				this.jTabbedPaneBusquedasValorPorUnidad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesValorPorUnidad!=null) {
				this.jPanelParametrosReportesValorPorUnidad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasValorPorUnidad.remove(jPanelFK_IdUnidadValorPorUnidad);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasValorPorUnidad.remove(jPanelFK_IdUnidadValorPorUnidad);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ValorPorUnidadSessionBean valorporunidadSessionBean=new ValorPorUnidadSessionBean();
		
		if(this.valorporunidadSessionBean==null) {
			this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
		}
		
		this.valorporunidadSessionBean.setsUltimaBusquedaValorPorUnidad(this.getsAccionBusqueda());
		this.valorporunidadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.valorporunidadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			valorporunidadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			valorporunidadSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ValorPorUnidadSessionBean valorporunidadSessionBean=new ValorPorUnidadSessionBean();
		
		if(this.valorporunidadSessionBean==null) {
			this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
		}
		
		if(this.valorporunidadSessionBean.getsUltimaBusquedaValorPorUnidad()!=null&&!this.valorporunidadSessionBean.getsUltimaBusquedaValorPorUnidad().equals("")) {
			this.setsAccionBusqueda(valorporunidadSessionBean.getsUltimaBusquedaValorPorUnidad());
			this.setiNumeroPaginacion(valorporunidadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(valorporunidadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(valorporunidadSessionBean.getid_empresa());
				valorporunidadSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(valorporunidadSessionBean.getid_unidad());
				valorporunidadSessionBean.setid_unidad(-1L);
			}
		}
		
		this.valorporunidadSessionBean.setsUltimaBusquedaValorPorUnidad("");
		this.valorporunidadSessionBean.setiNumeroPaginacion(ValorPorUnidadConstantesFunciones.INUMEROPAGINACION);
		this.valorporunidadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaValorPorUnidad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioValorPorUnidad() {
		this.updateBorderResaltarBusquedasFormularioValorPorUnidad();
		this.updateVisibilidadBusquedasFormularioValorPorUnidad();
		this.updateHabilitarBusquedasFormularioValorPorUnidad();
	}
	
	public void updateBorderResaltarBusquedasFormularioValorPorUnidad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasValorPorUnidad.getComponents().length>0) {
	

		if(this.valorporunidadConstantesFunciones.resaltarFK_IdUnidadValorPorUnidad!=null) {
			index= this.jTabbedPaneBusquedasValorPorUnidad.indexOfComponent(this.jPanelFK_IdUnidadValorPorUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasValorPorUnidad.getComponent(index);
				jPanel.setBorder(this.valorporunidadConstantesFunciones.resaltarFK_IdUnidadValorPorUnidad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioValorPorUnidad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasValorPorUnidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasValorPorUnidad.indexOfComponent(this.jPanelFK_IdUnidadValorPorUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasValorPorUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.valorporunidadConstantesFunciones.mostrarFK_IdUnidadValorPorUnidad);
			if(!this.valorporunidadConstantesFunciones.mostrarFK_IdUnidadValorPorUnidad && index>-1) {
				this.jTabbedPaneBusquedasValorPorUnidad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioValorPorUnidad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasValorPorUnidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasValorPorUnidad.indexOfComponent(this.jPanelFK_IdUnidadValorPorUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasValorPorUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.valorporunidadConstantesFunciones.activarFK_IdUnidadValorPorUnidad);
				this.jTabbedPaneBusquedasValorPorUnidad.setEnabledAt(index,this.valorporunidadConstantesFunciones.activarFK_IdUnidadValorPorUnidad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaValorPorUnidad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasValorPorUnidad.indexOfComponent(this.jPanelFK_IdUnidadValorPorUnidad);

			this.jTabbedPaneBusquedasValorPorUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasValorPorUnidad.getComponent(index);

			this.valorporunidadConstantesFunciones.setResaltarFK_IdUnidadValorPorUnidad(resaltar);

			jPanel.setBorder(this.valorporunidadConstantesFunciones.resaltarFK_IdUnidadValorPorUnidad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarValorPorUnidad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioValorPorUnidad() throws Exception {

		if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioValorPorUnidad();
		this.updateVisibilidadResaltarControlesFormularioValorPorUnidad();
		this.updateHabilitarResaltarControlesFormularioValorPorUnidad();
		
	}
	
	public void updateBorderResaltarControlesFormularioValorPorUnidad() throws Exception {
		if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.valorporunidadConstantesFunciones.resaltaridValorPorUnidad!=null && this.jInternalFrameDetalleFormValorPorUnidad!=null) {this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.setBorder(this.valorporunidadConstantesFunciones.resaltaridValorPorUnidad);}
		if(this.valorporunidadConstantesFunciones.resaltarid_empresaValorPorUnidad!=null && this.jInternalFrameDetalleFormValorPorUnidad!=null) {this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.setBorder(this.valorporunidadConstantesFunciones.resaltarid_empresaValorPorUnidad);}
		if(this.valorporunidadConstantesFunciones.resaltarid_unidadValorPorUnidad!=null && this.jInternalFrameDetalleFormValorPorUnidad!=null) {this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.setBorder(this.valorporunidadConstantesFunciones.resaltarid_unidadValorPorUnidad);}
		if(this.valorporunidadConstantesFunciones.resaltarvalorValorPorUnidad!=null && this.jInternalFrameDetalleFormValorPorUnidad!=null) {this.jInternalFrameDetalleFormValorPorUnidad.jTextFieldvalorValorPorUnidad.setBorder(this.valorporunidadConstantesFunciones.resaltarvalorValorPorUnidad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioValorPorUnidad() throws Exception {		
		if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
	
		//this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.setVisible(this.valorporunidadConstantesFunciones.mostraridValorPorUnidad);
		this.jInternalFrameDetalleFormValorPorUnidad.jPanelidValorPorUnidad.setVisible(this.valorporunidadConstantesFunciones.mostraridValorPorUnidad);
		//this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.setVisible(this.valorporunidadConstantesFunciones.mostrarid_empresaValorPorUnidad);
		this.jInternalFrameDetalleFormValorPorUnidad.jPanelid_empresaValorPorUnidad.setVisible(this.valorporunidadConstantesFunciones.mostrarid_empresaValorPorUnidad);
		//this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.setVisible(this.valorporunidadConstantesFunciones.mostrarid_unidadValorPorUnidad);
		this.jInternalFrameDetalleFormValorPorUnidad.jPanelid_unidadValorPorUnidad.setVisible(this.valorporunidadConstantesFunciones.mostrarid_unidadValorPorUnidad);
		//this.jInternalFrameDetalleFormValorPorUnidad.jTextFieldvalorValorPorUnidad.setVisible(this.valorporunidadConstantesFunciones.mostrarvalorValorPorUnidad);
		this.jInternalFrameDetalleFormValorPorUnidad.jPanelvalorValorPorUnidad.setVisible(this.valorporunidadConstantesFunciones.mostrarvalorValorPorUnidad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioValorPorUnidad() throws Exception {
		if(this.jInternalFrameDetalleFormValorPorUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormValorPorUnidad!=null) {
	
		this.jInternalFrameDetalleFormValorPorUnidad.jLabelidValorPorUnidad.setEnabled(this.valorporunidadConstantesFunciones.activaridValorPorUnidad);
		this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_empresaValorPorUnidad.setEnabled(this.valorporunidadConstantesFunciones.activarid_empresaValorPorUnidad);
		this.jInternalFrameDetalleFormValorPorUnidad.jComboBoxid_unidadValorPorUnidad.setEnabled(this.valorporunidadConstantesFunciones.activarid_unidadValorPorUnidad);
		this.jInternalFrameDetalleFormValorPorUnidad.jTextFieldvalorValorPorUnidad.setEnabled(this.valorporunidadConstantesFunciones.activarvalorValorPorUnidad);
		}
	}
	
		
}