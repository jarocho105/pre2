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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.LineaNegocioConstantesFunciones;
import com.bydan.erp.cartera.util.LineaNegocioParameterReturnGeneral;
//import com.bydan.erp.cartera.util.LineaNegocioParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.LineaNegocioBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class LineaNegocioBeanSwingJInternalFrame extends LineaNegocioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(LineaNegocioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<LineaNegocio> lineanegocioValidator = new ClassValidator<LineaNegocio>(LineaNegocio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public LineaNegocio lineanegocio;	
	public LineaNegocio lineanegocioAux;
	public LineaNegocio lineanegocioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public LineaNegocio lineanegocioTotales;
	public Long idLineaNegocioActual;
	public Long iIdNuevoLineaNegocio=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosPoliticasCliente=false;

	public Boolean getIsTienePermisosPoliticasCliente() {
		return isTienePermisosPoliticasCliente;
	}

	public void setIsTienePermisosPoliticasCliente(Boolean isTienePermisosPoliticasCliente) {
		this.isTienePermisosPoliticasCliente= isTienePermisosPoliticasCliente;
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
	
	public Boolean isPermisoTodoLineaNegocio;
	public Boolean isPermisoNuevoLineaNegocio;
	public Boolean isPermisoActualizarLineaNegocio;
	public Boolean isPermisoActualizarOriginalLineaNegocio;
	public Boolean isPermisoEliminarLineaNegocio;
	public Boolean isPermisoGuardarCambiosLineaNegocio;
	public Boolean isPermisoConsultaLineaNegocio;
	public Boolean isPermisoBusquedaLineaNegocio;
	public Boolean isPermisoReporteLineaNegocio;
	public Boolean isPermisoPaginacionMedioLineaNegocio;
	public Boolean isPermisoPaginacionAltoLineaNegocio;
	public Boolean isPermisoPaginacionTodoLineaNegocio;
	public Boolean isPermisoCopiarLineaNegocio;
	public Boolean isPermisoVerFormLineaNegocio;
	public Boolean isPermisoDuplicarLineaNegocio;
	public Boolean isPermisoOrdenLineaNegocio;
	
	
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
	
	public LineaNegocioParameterReturnGeneral lineanegocioReturnGeneral;
	public LineaNegocioParameterReturnGeneral lineanegocioParameterGeneral;
	
	

	public PoliticasClienteLogic politicasclienteLogic=null;

	public PoliticasClienteLogic getPoliticasClienteLogic() {
		return politicasclienteLogic;
	}

	public void setPoliticasClienteLogic(PoliticasClienteLogic politicasclienteLogic) {
		this.politicasclienteLogic = politicasclienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoLineaNegocio=false;
	public Boolean esParaAccionDesdeFormularioLineaNegocio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public LineaNegocioLogic lineanegocioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public LineaNegocio lineanegocioBean;
	public LineaNegocioConstantesFunciones lineanegocioConstantesFunciones;
	//public LineaNegocioParameterReturnGeneral lineanegocioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<LineaNegocio> lineanegocios;	
	//public List<LineaNegocio> lineanegociosEliminados;
	//public List<LineaNegocio> lineanegociosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoLineaNegocio=false;
	public Boolean isVisibilidadCeldaDuplicarLineaNegocio=true;
	public Boolean isVisibilidadCeldaCopiarLineaNegocio=true;
	public Boolean isVisibilidadCeldaVerFormLineaNegocio=true;
	public Boolean isVisibilidadCeldaOrdenLineaNegocio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesLineaNegocio=false;
	public Boolean isVisibilidadCeldaModificarLineaNegocio=false;
	public Boolean isVisibilidadCeldaActualizarLineaNegocio=false;
	public Boolean isVisibilidadCeldaEliminarLineaNegocio=false;
	public Boolean isVisibilidadCeldaCancelarLineaNegocio=false;
	public Boolean isVisibilidadCeldaGuardarLineaNegocio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosLineaNegocio=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoLineaNegocio() {
		return this.iIdNuevoLineaNegocio;
	}

	public void setiIdNuevoLineaNegocio(Long iIdNuevoLineaNegocio) {
		this.iIdNuevoLineaNegocio = iIdNuevoLineaNegocio;
	}
	
	public Long getidLineaNegocioActual() {
		return this.idLineaNegocioActual;
	}

	public void setidLineaNegocioActual(Long idLineaNegocioActual) {
		this.idLineaNegocioActual = idLineaNegocioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public LineaNegocio getlineanegocio() {
		return this.lineanegocio;
	}

	public void setlineanegocio(LineaNegocio lineanegocio) {
		this.lineanegocio = lineanegocio;
	}
	
	public LineaNegocio getlineanegocioAux() {
		return this.lineanegocioAux;
	}

	public void setlineanegocioAux(LineaNegocio lineanegocioAux) {
		this.lineanegocioAux = lineanegocioAux;
	}				
	
	public LineaNegocio getlineanegocioAnterior() {
		return this.lineanegocioAnterior;
	}

	public void setlineanegocioAnterior(LineaNegocio lineanegocioAnterior) {
		this.lineanegocioAnterior = lineanegocioAnterior;
	}	
	
	public LineaNegocio getlineanegocioTotales() {
		return this.lineanegocioTotales;
	}

	public void setlineanegocioTotales(LineaNegocio lineanegocioTotales) {
		this.lineanegocioTotales = lineanegocioTotales;
	}	
	
	public LineaNegocio getlineanegocioBean() {
		return this.lineanegocioBean;
	}

	public void setlineanegocioBean(LineaNegocio lineanegocioBean) {
		this.lineanegocioBean = lineanegocioBean;
	}	
	
	public LineaNegocioParameterReturnGeneral getlineanegocioReturnGeneral() {
		return this.lineanegocioReturnGeneral;
	}

	public void setlineanegocioReturnGeneral(LineaNegocioParameterReturnGeneral lineanegocioReturnGeneral) {
		this.lineanegocioReturnGeneral = lineanegocioReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
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
	
	
	public LineaNegocioLogic getLineaNegocioLogic()	{		
		return lineanegocioLogic;
	}

	public void setLineaNegocioLogic(LineaNegocioLogic lineanegocioLogic) {
		this.lineanegocioLogic = lineanegocioLogic;
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
	
	public Boolean getIsEsNuevoLineaNegocio() {
		return isEsNuevoLineaNegocio;
	}

	public void setIsEsNuevoLineaNegocio(Boolean isEsNuevoLineaNegocio) {
		this.isEsNuevoLineaNegocio = isEsNuevoLineaNegocio;
	}

	public Boolean getEsParaAccionDesdeFormularioLineaNegocio() {
		return esParaAccionDesdeFormularioLineaNegocio;
	}
	
	public void setEsParaAccionDesdeFormularioLineaNegocio(Boolean esParaAccionDesdeFormularioLineaNegocio) {
		this.esParaAccionDesdeFormularioLineaNegocio = esParaAccionDesdeFormularioLineaNegocio;
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

			if(this.lineanegocioSessionBean==null) {
				this.lineanegocioSessionBean=new LineaNegocioSessionBean();
			}

			if(!this.lineanegocioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(lineanegocioSessionBean.getlidEmpresaActual());
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

					if(this.lineanegocio!=null) {
						this.lineanegocio.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
						this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaLineaNegocio.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
						if(this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.getItemCount()>0) {
							this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaLineaNegocioGenerico)throws Exception
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
				jComboBoxid_empresaLineaNegocioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaLineaNegocioGenerico!=null && jComboBoxid_empresaLineaNegocioGenerico.getItemCount()>0) {
					jComboBoxid_empresaLineaNegocioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(LineaNegocio lineanegocio,JComboBox jComboBoxid_empresaLineaNegocioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaLineaNegocioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaLineaNegocioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				lineanegocio.setid_empresa(empresaAux.getId());
				lineanegocio.setempresa_descripcion(LineaNegocioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				lineanegocio.setEmpresa(empresaAux);			}
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

					if(!LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLineaNegocio!=null) { 
							this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLineaNegocio!=null) { 
					}

					if(!LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
							this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
							this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesLineaNegocio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			LineaNegocioConstantesFunciones.refrescarForeignKeysDescripcionesLineaNegocio(this.lineanegocioLogic.getLineaNegocios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			LineaNegocioConstantesFunciones.refrescarForeignKeysDescripcionesLineaNegocio(this.lineanegocios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//lineanegocioLogic.setLineaNegocios(this.lineanegocios);
			lineanegocioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public LineaNegocioParameterReturnGeneral getLineaNegocioParameterGeneral() {
		return this.lineanegocioParameterGeneral;
	}
	
	public void setLineaNegocioParameterGeneral(LineaNegocioParameterReturnGeneral lineanegocioParameterGeneral) {
		this.lineanegocioParameterGeneral = lineanegocioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoLineaNegocio() {
		return isPermisoTodoLineaNegocio;
	}

	public void setIsPermisoTodoLineaNegocio(Boolean isPermisoTodoLineaNegocio) {
		this.isPermisoTodoLineaNegocio = isPermisoTodoLineaNegocio;
	}

	public Boolean getIsPermisoNuevoLineaNegocio() {
		return isPermisoNuevoLineaNegocio;
	}

	public void setIsPermisoNuevoLineaNegocio(Boolean isPermisoNuevoLineaNegocio) {
		this.isPermisoNuevoLineaNegocio = isPermisoNuevoLineaNegocio;
	}

	public Boolean getIsPermisoActualizarLineaNegocio() {
		return isPermisoActualizarLineaNegocio;
	}

	public void setIsPermisoActualizarLineaNegocio(Boolean isPermisoActualizarLineaNegocio) {
		this.isPermisoActualizarLineaNegocio = isPermisoActualizarLineaNegocio;
	}

	public Boolean getIsPermisoEliminarLineaNegocio() {
		return isPermisoEliminarLineaNegocio;
	}

	public void setIsPermisoEliminarLineaNegocio(Boolean isPermisoEliminarLineaNegocio) {
		this.isPermisoEliminarLineaNegocio = isPermisoEliminarLineaNegocio;
	}

	public Boolean getIsPermisoGuardarCambiosLineaNegocio() {
		return isPermisoGuardarCambiosLineaNegocio;
	}

	public void setIsPermisoGuardarCambiosLineaNegocio(Boolean isPermisoGuardarCambiosLineaNegocio) {
		this.isPermisoGuardarCambiosLineaNegocio = isPermisoGuardarCambiosLineaNegocio;
	}
	
	public Boolean getIsPermisoConsultaLineaNegocio() {
		return isPermisoConsultaLineaNegocio;
	}

	public void setIsPermisoConsultaLineaNegocio(Boolean isPermisoConsultaLineaNegocio) {
		this.isPermisoConsultaLineaNegocio = isPermisoConsultaLineaNegocio;
	}

	public Boolean getIsPermisoBusquedaLineaNegocio() {
		return isPermisoBusquedaLineaNegocio;
	}

	public void setIsPermisoBusquedaLineaNegocio(Boolean isPermisoBusquedaLineaNegocio) {
		this.isPermisoBusquedaLineaNegocio = isPermisoBusquedaLineaNegocio;
	}

	public Boolean getIsPermisoReporteLineaNegocio() {
		return isPermisoReporteLineaNegocio;
	}

	public void setIsPermisoReporteLineaNegocio(Boolean isPermisoReporteLineaNegocio) {
		this.isPermisoReporteLineaNegocio = isPermisoReporteLineaNegocio;
	}
	
	public Boolean getIsPermisoPaginacionMedioLineaNegocio() {
		return isPermisoPaginacionMedioLineaNegocio;
	}

	public void setIsPermisoPaginacionMedioLineaNegocio(Boolean isPermisoPaginacionMedioLineaNegocio) {
		this.isPermisoPaginacionMedioLineaNegocio = isPermisoPaginacionMedioLineaNegocio;
	}
	
	public Boolean getIsPermisoPaginacionTodoLineaNegocio() {
		return isPermisoPaginacionTodoLineaNegocio;
	}

	public void setIsPermisoPaginacionTodoLineaNegocio(Boolean isPermisoPaginacionTodoLineaNegocio) {
		this.isPermisoPaginacionTodoLineaNegocio = isPermisoPaginacionTodoLineaNegocio;
	}
	
	public Boolean getIsPermisoPaginacionAltoLineaNegocio() {
		return isPermisoPaginacionAltoLineaNegocio;
	}

	public void setIsPermisoPaginacionAltoLineaNegocio(Boolean isPermisoPaginacionAltoLineaNegocio) {
		this.isPermisoPaginacionAltoLineaNegocio = isPermisoPaginacionAltoLineaNegocio;
	}
	
	public Boolean getIsPermisoCopiarLineaNegocio() {
		return isPermisoCopiarLineaNegocio;
	}

	public void setIsPermisoCopiarLineaNegocio(Boolean isPermisoCopiarLineaNegocio) {
		this.isPermisoCopiarLineaNegocio = isPermisoCopiarLineaNegocio;
	}
	
	public Boolean getIsPermisoVerFormLineaNegocio() {
		return isPermisoVerFormLineaNegocio;
	}

	public void setIsPermisoVerFormLineaNegocio(Boolean isPermisoVerFormLineaNegocio) {
		this.isPermisoVerFormLineaNegocio = isPermisoVerFormLineaNegocio;
	}
	
	public Boolean getIsPermisoDuplicarLineaNegocio() {
		return isPermisoDuplicarLineaNegocio;
	}

	public void setIsPermisoDuplicarLineaNegocio(Boolean isPermisoDuplicarLineaNegocio) {
		this.isPermisoDuplicarLineaNegocio = isPermisoDuplicarLineaNegocio;
	}
	
	public Boolean getIsPermisoOrdenLineaNegocio() {
		return isPermisoOrdenLineaNegocio;
	}

	public void setIsPermisoOrdenLineaNegocio(Boolean isPermisoOrdenLineaNegocio) {
		this.isPermisoOrdenLineaNegocio = isPermisoOrdenLineaNegocio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoLineaNegocio() {
		return isVisibilidadCeldaNuevoLineaNegocio;
	}

	public void setIsVisibilidadCeldaNuevoLineaNegocio(Boolean isVisibilidadCeldaNuevoLineaNegocio) {
		this.isVisibilidadCeldaNuevoLineaNegocio = isVisibilidadCeldaNuevoLineaNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarLineaNegocio() {
		return isVisibilidadCeldaDuplicarLineaNegocio;
	}

	public void setIsVisibilidadCeldaDuplicarLineaNegocio(Boolean isVisibilidadCeldaDuplicarLineaNegocio) {
		this.isVisibilidadCeldaDuplicarLineaNegocio = isVisibilidadCeldaDuplicarLineaNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarLineaNegocio() {
		return isVisibilidadCeldaCopiarLineaNegocio;
	}

	public void setIsVisibilidadCeldaCopiarLineaNegocio(Boolean isVisibilidadCeldaCopiarLineaNegocio) {
		this.isVisibilidadCeldaCopiarLineaNegocio = isVisibilidadCeldaCopiarLineaNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormLineaNegocio() {
		return isVisibilidadCeldaVerFormLineaNegocio;
	}

	public void setIsVisibilidadCeldaVerFormLineaNegocio(Boolean isVisibilidadCeldaVerFormLineaNegocio) {
		this.isVisibilidadCeldaVerFormLineaNegocio = isVisibilidadCeldaVerFormLineaNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenLineaNegocio() {
		return isVisibilidadCeldaOrdenLineaNegocio;
	}

	public void setIsVisibilidadCeldaOrdenLineaNegocio(Boolean isVisibilidadCeldaOrdenLineaNegocio) {
		this.isVisibilidadCeldaOrdenLineaNegocio = isVisibilidadCeldaOrdenLineaNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesLineaNegocio() {
		return isVisibilidadCeldaNuevoRelacionesLineaNegocio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesLineaNegocio(Boolean isVisibilidadCeldaNuevoRelacionesLineaNegocio) {
		this.isVisibilidadCeldaNuevoRelacionesLineaNegocio = isVisibilidadCeldaNuevoRelacionesLineaNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarLineaNegocio() {
		return isVisibilidadCeldaModificarLineaNegocio;
	}

	public void setIsVisibilidadCeldaModificarLineaNegocio(Boolean isVisibilidadCeldaModificarLineaNegocio) {
		this.isVisibilidadCeldaModificarLineaNegocio = isVisibilidadCeldaModificarLineaNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarLineaNegocio() {
		return isVisibilidadCeldaActualizarLineaNegocio;
	}

	public void setIsVisibilidadCeldaActualizarLineaNegocio(Boolean isVisibilidadCeldaActualizarLineaNegocio) {
		this.isVisibilidadCeldaActualizarLineaNegocio = isVisibilidadCeldaActualizarLineaNegocio;
	}

	public Boolean getIsVisibilidadCeldaEliminarLineaNegocio() {
		return isVisibilidadCeldaEliminarLineaNegocio;
	}

	public void setIsVisibilidadCeldaEliminarLineaNegocio(Boolean isVisibilidadCeldaEliminarLineaNegocio) {
		this.isVisibilidadCeldaEliminarLineaNegocio = isVisibilidadCeldaEliminarLineaNegocio;
	}

	public Boolean getIsVisibilidadCeldaCancelarLineaNegocio() {
		return isVisibilidadCeldaCancelarLineaNegocio;
	}

	public void setIsVisibilidadCeldaCancelarLineaNegocio(Boolean isVisibilidadCeldaCancelarLineaNegocio) {
		this.isVisibilidadCeldaCancelarLineaNegocio = isVisibilidadCeldaCancelarLineaNegocio;
	}

	public Boolean getIsVisibilidadCeldaGuardarLineaNegocio() {
		return isVisibilidadCeldaGuardarLineaNegocio;
	}

	public void setIsVisibilidadCeldaGuardarLineaNegocio(Boolean isVisibilidadCeldaGuardarLineaNegocio) {
		this.isVisibilidadCeldaGuardarLineaNegocio = isVisibilidadCeldaGuardarLineaNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosLineaNegocio() {
		return isVisibilidadCeldaGuardarCambiosLineaNegocio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosLineaNegocio(Boolean isVisibilidadCeldaGuardarCambiosLineaNegocio) {
		this.isVisibilidadCeldaGuardarCambiosLineaNegocio = isVisibilidadCeldaGuardarCambiosLineaNegocio;
	}
		
	public LineaNegocioSessionBean getlineanegocioSessionBean() {
		return this.lineanegocioSessionBean;
	}
	
	public void setlineanegocioSessionBean(LineaNegocioSessionBean lineanegocioSessionBean) {
		this.lineanegocioSessionBean=lineanegocioSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(LineaNegocio lineanegocio)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(lineanegocio,null);
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
	
	public void bugActualizarReferenciaActual(LineaNegocio lineanegocio,LineaNegocio lineanegocioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalLineaNegocio(lineanegocio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		lineanegocioAux.setId(lineanegocio.getId());
		lineanegocioAux.setVersionRow(lineanegocio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessLineaNegocio();
		
			int intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualLineaNegocio(this.lineanegocio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = lineanegocioValidator.getInvalidValues(this.lineanegocio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			lineanegocioLogic.setDatosCliente(datosCliente);
			lineanegocioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				lineanegocioAux=new  LineaNegocio();
				
				lineanegocioAux.setIsNew(true);
				lineanegocioAux.setIsChanged(true);
				
				lineanegocioAux.setLineaNegocioOriginal(this.lineanegocio);
				
				lineanegocioAux.setId(this.lineanegocio.getId());	
				lineanegocioAux.setVersionRow(this.lineanegocio.getVersionRow());	
				lineanegocioAux.setid_empresa(this.lineanegocio.getid_empresa());	
				lineanegocioAux.setcodigo(this.lineanegocio.getcodigo());	
				lineanegocioAux.setnombre(this.lineanegocio.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.lineanegocioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.lineanegocioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(lineanegocioAux,lineanegocioLogic.getLineaNegocios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineanegocioAux,lineanegocios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.lineanegocioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineanegocioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegocioLogic.saveLineaNegocios();//WithConnection
						//lineanegocioLogic.getSetVersionRowLineaNegocios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.lineanegocio,lineanegocioAux);
					
					this.refrescarForeignKeysDescripcionesLineaNegocio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineanegocioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				lineanegocioAux=new  LineaNegocio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.lineanegocioSessionBean.getEsGuardarRelacionado() 
					|| (this.lineanegocioSessionBean.getEsGuardarRelacionado() && this.lineanegocio.getId()>=0)) {
						
					lineanegocioAux.setIsNew(false);
				}
				
				lineanegocioAux.setIsDeleted(false);
			
				lineanegocioAux.setId(this.lineanegocio.getId());	
				lineanegocioAux.setVersionRow(this.lineanegocio.getVersionRow());	
				lineanegocioAux.setid_empresa(this.lineanegocio.getid_empresa());	
				lineanegocioAux.setcodigo(this.lineanegocio.getcodigo());	
				lineanegocioAux.setnombre(this.lineanegocio.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(lineanegocioAux,lineanegocioLogic.getLineaNegocios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineanegocioAux,lineanegocios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.lineanegocioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineanegocioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegocioLogic.saveLineaNegocios();//WithConnection
						//lineanegocioLogic.getSetVersionRowLineaNegocios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.lineanegocio,lineanegocioAux);
					
					this.refrescarForeignKeysDescripcionesLineaNegocio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineanegocioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				lineanegocioAux=new  LineaNegocio();
				
				lineanegocioAux.setIsNew(false);
				lineanegocioAux.setIsChanged(false);
				
				lineanegocioAux.setIsDeleted(true);
				
				lineanegocioAux.setId(this.lineanegocio.getId());	
				lineanegocioAux.setVersionRow(this.lineanegocio.getVersionRow());	
				lineanegocioAux.setid_empresa(this.lineanegocio.getid_empresa());	
				lineanegocioAux.setcodigo(this.lineanegocio.getcodigo());	
				lineanegocioAux.setnombre(this.lineanegocio.getnombre());	
				
				if(this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.lineanegocioAux.getId()>=0) {	
						this.lineanegociosEliminados.add(lineanegocioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(lineanegocioAux,lineanegocioLogic.getLineaNegocios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineanegocioAux,lineanegocios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.lineanegocioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineanegocioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegocioLogic.saveLineaNegocios();//WithConnection
						//lineanegocioLogic.getSetVersionRowLineaNegocios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineanegocioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							lineanegocioAux.setPoliticasClientes(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.lineanegocioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.lineanegocioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(lineanegocioAux,lineanegocioLogic.getLineaNegocios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(lineanegocioAux,lineanegocios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.getLineaNegocios().addAll(this.lineanegociosEliminados);
					
					lineanegocioLogic.saveLineaNegocios();//WithConnection
					//lineanegocioLogic.getSetVersionRowLineaNegocios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesLineaNegocio();
				
				this.lineanegociosEliminados= new ArrayList<LineaNegocio>();		
			}
			
			if(this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Linea_negocio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Linea_negocio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.lineanegocio=lineanegocioAux;
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
      		//this.finishProcessLineaNegocio();
      	}
		
	}	
	
	public void actualizarRelaciones(LineaNegocio lineanegocioLocal) throws Exception {
		
		if(this.lineanegocioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				lineanegocioLocal.setPoliticasClientes(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
			
			} else {
			
				lineanegocioLocal.setPoliticasClientes(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.politicasclientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(LineaNegocio lineanegocioLocal) throws Exception {	
		if(this.lineanegocioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				lineanegocioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarLineaNegocioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = lineanegocioValidator.getInvalidValues(this.lineanegocio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(LineaNegocio lineanegocio,List<LineaNegocio> lineanegocios) throws Exception {
		try	{		
			LineaNegocioConstantesFunciones.actualizarLista(lineanegocio,lineanegocios,this.lineanegocioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(LineaNegocio lineanegocio,List<LineaNegocio> lineanegocios) throws Exception {
		try	{			
			LineaNegocioConstantesFunciones.actualizarSelectedLista(lineanegocio,lineanegocios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<LineaNegocio> lineanegociosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				lineanegociosLocal=this.lineanegocioLogic.getLineaNegocios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				lineanegociosLocal=this.lineanegocios;
			}
			//ARCHITECTURE
		
			for(LineaNegocio lineanegocioLocal:lineanegociosLocal) {
				if(this.permiteMantenimiento(lineanegocioLocal) && lineanegocioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+LineaNegocioConstantesFunciones.getLineaNegocioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(LineaNegocioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaNegocio.jLabelid_empresaLineaNegocio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaNegocioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaNegocio.jLabelcodigoLineaNegocio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaNegocioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaNegocio.jLabelnombreLineaNegocio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaNegocio.jLabelid_empresaLineaNegocio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaNegocio.jLabelcodigoLineaNegocio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaNegocio.jLabelnombreLineaNegocio,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PoliticasCliente")) {
			if(this.lineanegocio==null) {
				this.lineanegocio= new LineaNegocio();
			}

			if(this.lineanegocioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLineaNegocio
				this.setVariablesFormularioToObjetoActualLineaNegocio(this.lineanegocio,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);

				this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.getpoliticascliente().setLineaNegocio(this.lineanegocio);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoLineaNegocio--;	
		
		
		this.lineanegocioAux=new LineaNegocio();
		
		this.lineanegocioAux.setId(this.iIdNuevoLineaNegocio);
		this.lineanegocioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.lineanegocioLogic.getLineaNegocios().add(this.lineanegocioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.lineanegocios.add(this.lineanegocioAux);
		}
		//ARCHITECTURE
		
		this.lineanegocio=this.lineanegocioAux;
		
		if(LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioLineaNegocio(this.lineanegocio);
			this.setVariablesObjetoActualToFormularioForeignKeyLineaNegocio(this.lineanegocio);
		}
				
		//this.setDefaultControlesLineaNegocio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyLineaNegocio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyLineaNegocio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyLineaNegocio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLineaNegocio(this.lineanegocioBean,this.lineanegocio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(LineaNegocioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.lineanegocioSessionBean.getConGuardarRelaciones()) {
			classes=LineaNegocioConstantesFunciones.getClassesRelationshipsOfLineaNegocio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.lineanegocioReturnGeneral=lineanegocioLogic.procesarEventosLineaNegociosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lineanegocioLogic.getLineaNegocios(),this.lineanegocio,this.lineanegocioParameterGeneral,this.isEsNuevoLineaNegocio,classes);//this.lineanegocioLogic.getLineaNegocio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanLineaNegocio(this.lineanegocioReturnGeneral,this.lineanegocioBean,false);
		
		if(this.lineanegocioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyLineaNegocio(this.lineanegocioReturnGeneral.getLineaNegocio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioLineaNegocio(this.lineanegocioReturnGeneral.getLineaNegocio());
		}
		
		if(this.lineanegocioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioLineaNegocio(this.lineanegocioReturnGeneral.getLineaNegocio(),classes);//this.lineanegocioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualLineaNegocio(this.lineanegocio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyLineaNegocio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyLineaNegocio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingLineaNegocio(false);
						
			if(lineanegocioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado() && PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPoliticasClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLineaNegocio();
			}
			
			this.actualizarVisualTableDatosLineaNegocio();
			
			this.jTableDatosLineaNegocio.setRowSelectionInterval(this.getIndiceNuevoLineaNegocio(), this.getIndiceNuevoLineaNegocio());
			
			this.seleccionarFilaTablaLineaNegocioActual();
						
			this.actualizarEstadoCeldasBotonesLineaNegocio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesLineaNegocio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormLineaNegocio.jTextFieldcodigoLineaNegocio.setEnabled(isHabilitar && this.lineanegocioConstantesFunciones.activarcodigoLineaNegocio);
		this.jInternalFrameDetalleFormLineaNegocio.jTextAreanombreLineaNegocio.setEnabled(isHabilitar && this.lineanegocioConstantesFunciones.activarnombreLineaNegocio);	
		//
		this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.setEnabled(isHabilitar && this.lineanegocioConstantesFunciones.activarid_empresaLineaNegocio);
	};
	
	public void setDefaultControlesLineaNegocio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoLineaNegocio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.lineanegocioSessionBean.setConGuardarRelaciones(true);			
			this.lineanegocioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormLineaNegocio.jTabbedPaneRelacionesLineaNegocio.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.lineanegocioSessionBean.setConGuardarRelaciones(false);			
			this.lineanegocioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormLineaNegocio.jTabbedPaneRelacionesLineaNegocio.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoLineaNegocio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaNegocio lineanegocioAux:this.lineanegocioLogic.getLineaNegocios()) {
				if(lineanegocioAux.getId().equals(this.iIdNuevoLineaNegocio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaNegocio lineanegocioAux:this.lineanegocios) {
				if(lineanegocioAux.getId().equals(this.iIdNuevoLineaNegocio)) {
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
	
	public int getIndiceActualLineaNegocio(LineaNegocio lineanegocio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaNegocio lineanegocioAux:this.lineanegocioLogic.getLineaNegocios()) {
				if(lineanegocioAux.getId().equals(lineanegocio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaNegocio lineanegocioAux:this.lineanegocios) {
				if(lineanegocioAux.getId().equals(lineanegocio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalLineaNegocio(LineaNegocio lineanegocioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaNegocio lineanegocioAux:this.lineanegocioLogic.getLineaNegocios()) {
				if(lineanegocioAux.getLineaNegocioOriginal().getId().equals(lineanegocioOriginal.getId())) {
					existe=true;
					lineanegocioOriginal.setId(lineanegocioAux.getId());
					lineanegocioOriginal.setVersionRow(lineanegocioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaNegocio lineanegocioAux:this.lineanegocios) {
				if(lineanegocioAux.getLineaNegocioOriginal().getId().equals(lineanegocioOriginal.getId())) {
					existe=true;
					lineanegocioOriginal.setId(lineanegocioAux.getId());
					lineanegocioOriginal.setVersionRow(lineanegocioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosLineaNegocio(Boolean esParaCancelar) throws Exception {
		lineanegociosAux=new ArrayList<LineaNegocio>();
		lineanegocioAux=new LineaNegocio();
		
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LineaNegocio lineanegocioAux:this.lineanegocioLogic.getLineaNegocios()) {
					if(lineanegocioAux.getId()<0) {
						lineanegociosAux.add(lineanegocioAux);
					}		
				}
				this.iIdNuevoLineaNegocio=0L;
				this.lineanegocioLogic.getLineaNegocios().removeAll(lineanegociosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaNegocio lineanegocioAux:this.lineanegocios) {
					if(lineanegocioAux.getId()<0) {
						lineanegociosAux.add(lineanegocioAux);
					}		
				}
				this.iIdNuevoLineaNegocio=0L;
				this.lineanegocios.removeAll(lineanegociosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoLineaNegocio 
					&& this.lineanegocioLogic.getLineaNegocios().size()>0
					) {
					lineanegocioAux=this.lineanegocioLogic.getLineaNegocios().get(this.lineanegocioLogic.getLineaNegocios().size() - 1);
				
					if(lineanegocioAux.getId()<0) {
						this.lineanegocioLogic.getLineaNegocios().remove(lineanegocioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoLineaNegocio && this.lineanegocios.size()>0) {
					lineanegocioAux=this.lineanegocios.get(this.lineanegocios.size() - 1);
				
					if(lineanegocioAux.getId()<0) {
						this.lineanegocios.remove(lineanegocioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoLineaNegocio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(lineanegocio.getId()<0) {
				this.lineanegocioLogic.getLineaNegocios().remove(this.lineanegocio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(lineanegocio.getId()<0) {
				this.lineanegocios.remove(this.lineanegocio);
			}
		}			
	}
	
	public void setEstadosInicialesLineaNegocio(List<LineaNegocio> lineanegociosAux) throws Exception {
		LineaNegocioConstantesFunciones.setEstadosInicialesLineaNegocio(lineanegociosAux);
	}
	
	public void setEstadosInicialesLineaNegocio(LineaNegocio lineanegocioAux) throws Exception {
		LineaNegocioConstantesFunciones.setEstadosInicialesLineaNegocio(lineanegocioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarLineaNegocioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesLineaNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarLineaNegocioActual()) {
				if(!this.isEsNuevoLineaNegocio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesLineaNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoLineaNegocio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarLineaNegocioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Linea_negocio ?", "MANTENIMIENTO DE Linea_negocio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesLineaNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(LineaNegocio lineanegocio) throws Exception {
		LineaNegocioConstantesFunciones.seleccionarAsignar(this.lineanegocio,lineanegocio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarLineaNegocio=this.isPermisoActualizarOriginalLineaNegocio;
			
			
			this.seleccionarAsignar(lineanegocio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LineaNegocioConstantesFunciones.quitarEspaciosLineaNegocio(this.lineanegocio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesLineaNegocio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.lineanegocioSessionBean.setsFuncionBusquedaRapida(this.lineanegocioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoLineaNegocio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosLineaNegocio(esParaCancelar);				
				this.cancelarNuevoLineaNegocio(esParaCancelar);								
			}
			
			this.lineanegocio=new LineaNegocio();
			
			this.inicializarLineaNegocio();
			
			this.actualizarEstadoCeldasBotonesLineaNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarLineaNegocio() throws Exception {
		try {
			LineaNegocioConstantesFunciones.inicializarLineaNegocio(this.lineanegocio);
			
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
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.lineanegocioLogic.getLineaNegocios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteLineaNegocios(String sAccionBusqueda,List<LineaNegocio> lineanegociosParaReportes) throws Exception {
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
					sPathReporteFinal="LineaNegocio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="LineaNegocioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("LineaNegocioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="LineaNegocio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Linea_negocios");		
		parameters.put("busquedapor", LineaNegocioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PoliticasCliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					LineaNegocioLogic lineanegocioLogicAuxiliar=new LineaNegocioLogic();
					lineanegocioLogicAuxiliar.setDatosCliente(lineanegocioLogic.getDatosCliente());				
					lineanegocioLogicAuxiliar.setLineaNegocios(lineanegociosParaReportes);
					
					lineanegocioLogicAuxiliar.cargarRelacionesLoteForeignKeyLineaNegocioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					lineanegociosParaReportes=lineanegocioLogicAuxiliar.getLineaNegocios();
					
					//lineanegocioLogic.getNewConnexionToDeep();
					
					//for (LineaNegocio lineanegocio:lineanegociosParaReportes) {
					//	lineanegocioLogic.deepLoad(lineanegocio, false, DeepLoadType.INCLUDE, classes);
					//}						
					//lineanegocioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//lineanegocioLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePoliticasCliente = AuxiliarReportes.class.getResourceAsStream("PoliticasClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_politicascliente", reportFilePoliticasCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceLineaNegocio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			LineaNegocioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			LineaNegocioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceLineaNegocio=new JRBeanArrayDataSource(LineaNegocioJInternalFrame.TraerLineaNegocioBeans(lineanegociosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceLineaNegocio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+LineaNegocioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+LineaNegocioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(LineaNegocioBean.TraerLineaNegocioBeans(lineanegociosParaReportes).toArray()));
							
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
				this.generarExcelReporteLineaNegocios(sAccionBusqueda,sTipoArchivoReporte,lineanegociosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalLineaNegocios(sAccionBusqueda,sTipoArchivoReporte,lineanegociosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoLineaNegocioActionPerformed(null);
					//this.generarExcelReporteLineaNegocios(sAccionBusqueda,sTipoArchivoReporte,lineanegociosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalLineaNegocios(sAccionBusqueda,sTipoArchivoReporte,lineanegociosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesLineaNegocios(sAccionBusqueda,sTipoArchivoReporte,lineanegociosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesLineaNegocios(sAccionBusqueda,sTipoArchivoReporte,lineanegociosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteLineaNegocios(String sAccionBusqueda,String sTipoArchivoReporte,List<LineaNegocio> lineanegociosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineanegocio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LineaNegocios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLineaNegocio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(LineaNegocio lineanegocio : lineanegociosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			LineaNegocioConstantesFunciones.generarExcelReporteDataLineaNegocio("NORMAL",row,workbook,lineanegocio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea_negocio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderLineaNegocio(String sTipo,Row row,Workbook workbook) {
		
		LineaNegocioConstantesFunciones.generarExcelReporteHeaderLineaNegocio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalLineaNegocios(String sAccionBusqueda,String sTipoArchivoReporte,List<LineaNegocio> lineanegociosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineanegocio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LineaNegocios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(LineaNegocio lineanegocio : lineanegociosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(LineaNegocioConstantesFunciones.getLineaNegocioDescripcion(lineanegocio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaNegocioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineanegocio.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaNegocioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineanegocio.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaNegocioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineanegocio.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea_negocio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesLineaNegocios(String sAccionBusqueda,String sTipoArchivoReporte,List<LineaNegocio> lineanegociosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<LineaNegocio> lineanegociosRespaldo=null;
		
		classes=LineaNegocioConstantesFunciones.getClassesRelationshipsOfLineaNegocio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.lineanegocioLogic.setDatosCliente(this.datosCliente);
		this.lineanegocioLogic.setDatosDeep(this.datosDeep);
		this.lineanegocioLogic.setIsConDeep(true);
		
		lineanegociosRespaldo=this.lineanegocioLogic.getLineaNegocios();
		
		this.lineanegocioLogic.setLineaNegocios(lineanegociosParaReportes);	
		this.lineanegocioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		lineanegociosParaReportes=this.lineanegocioLogic.getLineaNegocios();
		this.lineanegocioLogic.setLineaNegocios(lineanegociosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineanegocio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LineaNegocios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLineaNegocio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(LineaNegocio lineanegocio : lineanegociosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderLineaNegocio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			LineaNegocioConstantesFunciones.generarExcelReporteDataLineaNegocio("NORMAL",row,workbook,lineanegocio,cellStyleDataAux);
		
			
			


				//PoliticasCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(lineanegocio.getPoliticasClientes()!=null && lineanegocio.getPoliticasClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PoliticasClienteConstantesFunciones.generarExcelReporteHeaderPoliticasCliente("RELACIONADO",row,workbook);
				}

				if(lineanegocio.getPoliticasClientes()!=null) {
					i2=0;
					for(PoliticasCliente politicascliente : lineanegocio.getPoliticasClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PoliticasClienteConstantesFunciones.generarExcelReporteDataPoliticasCliente("RELACIONADO",row,workbook,politicascliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(LineaNegocioConstantesFunciones.getLineaNegocioDescripcion(lineanegocio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea_negocio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoLineaNegocio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessLineaNegocio() throws Exception {		
		this.startProcessLineaNegocio(true);
	}
	
	public void startProcessLineaNegocio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasLineaNegocio ,this.jPanelParametrosReportesLineaNegocio, this.jScrollPanelDatosLineaNegocio,this.jPanelPaginacionLineaNegocio, this.jScrollPanelDatosEdicionLineaNegocio, this.jPanelAccionesLineaNegocio,this.jPanelAccionesFormularioLineaNegocio,this.jmenuBarLineaNegocio,this.jmenuBarDetalleLineaNegocio,this.jTtoolBarLineaNegocio,this.jTtoolBarDetalleLineaNegocio);		
		
		final JTabbedPane jTabbedPaneBusquedasLineaNegocio=this.jTabbedPaneBusquedasLineaNegocio; 
		
		final JPanel jPanelParametrosReportesLineaNegocio=this.jPanelParametrosReportesLineaNegocio;
		//final JScrollPane jScrollPanelDatosLineaNegocio=this.jScrollPanelDatosLineaNegocio;
		final JTable jTableDatosLineaNegocio=this.jTableDatosLineaNegocio;		
		final JPanel jPanelPaginacionLineaNegocio=this.jPanelPaginacionLineaNegocio;
		//final JScrollPane jScrollPanelDatosEdicionLineaNegocio=this.jScrollPanelDatosEdicionLineaNegocio;
		final JPanel jPanelAccionesLineaNegocio=this.jPanelAccionesLineaNegocio;
		
		JPanel jPanelCamposAuxiliarLineaNegocio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarLineaNegocio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			jPanelCamposAuxiliarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jPanelCamposLineaNegocio;
			jPanelAccionesFormularioAuxiliarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jPanelAccionesFormularioLineaNegocio;
		}
		
		final JPanel jPanelCamposLineaNegocio=jPanelCamposAuxiliarLineaNegocio;
		final JPanel jPanelAccionesFormularioLineaNegocio=jPanelAccionesFormularioAuxiliarLineaNegocio;
		
		
		final JMenuBar jmenuBarLineaNegocio=this.jmenuBarLineaNegocio;
		final JToolBar jTtoolBarLineaNegocio=this.jTtoolBarLineaNegocio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarLineaNegocio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLineaNegocio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			jmenuBarDetalleAuxiliarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jmenuBarDetalleLineaNegocio;
			jTtoolBarDetalleAuxiliarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jTtoolBarDetalleLineaNegocio;
		}
		
		final JMenuBar jmenuBarDetalleLineaNegocio=jmenuBarDetalleAuxiliarLineaNegocio;
		final JToolBar jTtoolBarDetalleLineaNegocio=jTtoolBarDetalleAuxiliarLineaNegocio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLineaNegocio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLineaNegocio;
			processRunnable.jTableDatos=jTableDatosLineaNegocio;
			processRunnable.jPanelCampos=jPanelCamposLineaNegocio;
			processRunnable.jPanelPaginacion=jPanelPaginacionLineaNegocio;
			processRunnable.jPanelAcciones=jPanelAccionesLineaNegocio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLineaNegocio;
			
			
			processRunnable.jmenuBar=jmenuBarLineaNegocio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLineaNegocio;
			processRunnable.jTtoolBar=jTtoolBarLineaNegocio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLineaNegocio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLineaNegocio ,jPanelParametrosReportesLineaNegocio,jTableDatosLineaNegocio, /*jScrollPanelDatosLineaNegocio,*/jPanelCamposLineaNegocio,jPanelPaginacionLineaNegocio, /*jScrollPanelDatosEdicionLineaNegocio,*/ jPanelAccionesLineaNegocio,jPanelAccionesFormularioLineaNegocio,jmenuBarLineaNegocio,jmenuBarDetalleLineaNegocio,jTtoolBarLineaNegocio,jTtoolBarDetalleLineaNegocio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLineaNegocio ,jPanelParametrosReportesLineaNegocio, jScrollPanelDatosLineaNegocio,jPanelPaginacionLineaNegocio, jScrollPanelDatosEdicionLineaNegocio, jPanelAccionesLineaNegocio,jPanelAccionesFormularioLineaNegocio,jmenuBarLineaNegocio,jmenuBarDetalleLineaNegocio,jTtoolBarLineaNegocio,jTtoolBarDetalleLineaNegocio);
						
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
	
	public void finishProcessLineaNegocio() {// throws Exception 
		this.finishProcessLineaNegocio(true);
	}
	
	public void finishProcessLineaNegocio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasLineaNegocio ,this.jPanelParametrosReportesLineaNegocio, this.jScrollPanelDatosLineaNegocio,this.jPanelPaginacionLineaNegocio, this.jScrollPanelDatosEdicionLineaNegocio, this.jPanelAccionesLineaNegocio,this.jPanelAccionesFormularioLineaNegocio,this.jmenuBarLineaNegocio,this.jmenuBarDetalleLineaNegocio,this.jTtoolBarLineaNegocio,this.jTtoolBarDetalleLineaNegocio);		
		
		final JTabbedPane jTabbedPaneBusquedasLineaNegocio=this.jTabbedPaneBusquedasLineaNegocio; 
		
		final JPanel jPanelParametrosReportesLineaNegocio=this.jPanelParametrosReportesLineaNegocio;
		//final JScrollPane jScrollPanelDatosLineaNegocio=this.jScrollPanelDatosLineaNegocio;
		final JTable jTableDatosLineaNegocio=this.jTableDatosLineaNegocio;		
		final JPanel jPanelPaginacionLineaNegocio=this.jPanelPaginacionLineaNegocio;
		//final JScrollPane jScrollPanelDatosEdicionLineaNegocio=this.jScrollPanelDatosEdicionLineaNegocio;
		final JPanel jPanelAccionesLineaNegocio=this.jPanelAccionesLineaNegocio;
		
		JPanel jPanelCamposAuxiliarLineaNegocio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarLineaNegocio=new JPanel();
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			jPanelCamposAuxiliarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jPanelCamposLineaNegocio;
			jPanelAccionesFormularioAuxiliarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jPanelAccionesFormularioLineaNegocio;
		}
		
		final JPanel jPanelCamposLineaNegocio=jPanelCamposAuxiliarLineaNegocio;
		final JPanel jPanelAccionesFormularioLineaNegocio=jPanelAccionesFormularioAuxiliarLineaNegocio;
		
		
		final JMenuBar jmenuBarLineaNegocio=this.jmenuBarLineaNegocio;		
		final JToolBar jTtoolBarLineaNegocio=this.jTtoolBarLineaNegocio;
				
		JMenuBar jmenuBarDetalleAuxiliarLineaNegocio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLineaNegocio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			jmenuBarDetalleAuxiliarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jmenuBarDetalleLineaNegocio;
			jTtoolBarDetalleAuxiliarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jTtoolBarDetalleLineaNegocio;		
		}
		
		final JMenuBar jmenuBarDetalleLineaNegocio=jmenuBarDetalleAuxiliarLineaNegocio;
		final JToolBar jTtoolBarDetalleLineaNegocio=jTtoolBarDetalleAuxiliarLineaNegocio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLineaNegocio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLineaNegocio;
			processRunnable.jTableDatos=jTableDatosLineaNegocio;
			processRunnable.jPanelCampos=jPanelCamposLineaNegocio;
			processRunnable.jPanelPaginacion=jPanelPaginacionLineaNegocio;
			processRunnable.jPanelAcciones=jPanelAccionesLineaNegocio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLineaNegocio;
			
			
			processRunnable.jmenuBar=jmenuBarLineaNegocio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLineaNegocio;
			processRunnable.jTtoolBar=jTtoolBarLineaNegocio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLineaNegocio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasLineaNegocio ,jPanelParametrosReportesLineaNegocio, jTableDatosLineaNegocio,/*jScrollPanelDatosLineaNegocio,*/jPanelCamposLineaNegocio,jPanelPaginacionLineaNegocio, /*jScrollPanelDatosEdicionLineaNegocio,*/ jPanelAccionesLineaNegocio,jPanelAccionesFormularioLineaNegocio,jmenuBarLineaNegocio,jmenuBarDetalleLineaNegocio,jTtoolBarLineaNegocio,jTtoolBarDetalleLineaNegocio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesLineaNegocio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarLineaNegocio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuLineaNegocio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarLineaNegocio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarLineaNegocio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleLineaNegocio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuLineaNegocio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarLineaNegocio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleLineaNegocio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.lineanegocioConstantesFunciones.getsFinalQueryLineaNegocio();
		String  finalQueryPaginacionTodos=this.lineanegocioConstantesFunciones.getsFinalQueryLineaNegocio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=LineaNegocioConstantesFunciones.getArrayColumnasGlobalesNoLineaNegocio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=LineaNegocioConstantesFunciones.getArrayColumnasGlobalesLineaNegocio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,LineaNegocioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.lineanegociosEliminados= new ArrayList<LineaNegocio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessLineaNegocio();
		
				///*LineaNegocioSessionBean*/this.lineanegocioSessionBean=new LineaNegocioSessionBean();
			
			if(this.lineanegocioSessionBean==null) {
				this.lineanegocioSessionBean=new LineaNegocioSessionBean();
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
					this.iNumeroPaginacion=LineaNegocioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=LineaNegocioConstantesFunciones.getClassesForeignKeysOfLineaNegocio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/lineanegocio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			lineanegociosAux= new ArrayList<LineaNegocio>();
			
				
			lineanegocioLogic.setDatosCliente(this.datosCliente);
			lineanegocioLogic.setDatosDeep(this.datosDeep);
			lineanegocioLogic.setIsConDeep(true);
			
			
			lineanegocioLogic.getLineaNegocioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					lineanegocioLogic.getTodosLineaNegocios(finalQueryGlobal,pagination);
					
					//lineanegocioLogic.getTodosLineaNegociosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(lineanegocioLogic.getLineaNegocios()==null|| lineanegocioLogic.getLineaNegocios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineanegociosAux= new ArrayList<LineaNegocio>();
							lineanegociosAux.addAll(lineanegocioLogic.getLineaNegocios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineanegociosAux= new ArrayList<LineaNegocio>();
							lineanegociosAux.addAll(lineanegocios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineanegocioLogic.getTodosLineaNegocios(finalQueryGlobal+"",this.pagination);												
							
							//lineanegocioLogic.getTodosLineaNegociosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteLineaNegocios("Todos",lineanegocioLogic.getLineaNegocios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineanegocioLogic.setLineaNegocios(new ArrayList<LineaNegocio>());					
							lineanegocioLogic.getLineaNegocios().addAll(lineanegociosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineanegocios=new ArrayList<LineaNegocio>();
							lineanegocios.addAll(lineanegociosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idLineaNegocio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idLineaNegocio=this.idActual;
				
				} else if(this.idLineaNegocioActual!=null && this.idLineaNegocioActual!=0L) {
					idLineaNegocio=idLineaNegocioActual;
				}
				
					
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndicePorId(idLineaNegocio);
				
				this.lineanegocios=new ArrayList<LineaNegocio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					lineanegocioLogic.getEntity(idLineaNegocio);
					
					//lineanegocioLogic.getEntityWithConnection(idLineaNegocio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineanegocioLogic.setLineaNegocios(new ArrayList<LineaNegocio>());
					lineanegocioLogic.getLineaNegocios().add(lineanegocioLogic.getLineaNegocio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineanegocios=new ArrayList<LineaNegocio>();
					this.lineanegocios.add(lineanegocio);
				}
				
				if(lineanegocioLogic.getLineaNegocio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineanegocioLogic.getLineaNegociosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineanegocioLogic.getLineaNegocios()==null||lineanegocioLogic.getLineaNegocios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineanegocios==null|| lineanegocios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegociosAux=new ArrayList<LineaNegocio>();
						lineanegociosAux.addAll(lineanegocioLogic.getLineaNegocios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineanegociosAux=new ArrayList<LineaNegocio>();
							lineanegociosAux.addAll(lineanegocios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineanegocioLogic.getLineaNegociosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaNegocios("BusquedaPorCodigo",lineanegocioLogic.getLineaNegocios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaNegocios("BusquedaPorCodigo",lineanegocios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegocioLogic.setLineaNegocios(new ArrayList<LineaNegocio>());
						lineanegocioLogic.getLineaNegocios().addAll(lineanegociosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineanegocios=new ArrayList<LineaNegocio>();
							lineanegocios.addAll(lineanegociosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineanegocioLogic.getLineaNegociosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineanegocioLogic.getLineaNegocios()==null||lineanegocioLogic.getLineaNegocios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineanegocios==null|| lineanegocios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegociosAux=new ArrayList<LineaNegocio>();
						lineanegociosAux.addAll(lineanegocioLogic.getLineaNegocios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineanegociosAux=new ArrayList<LineaNegocio>();
							lineanegociosAux.addAll(lineanegocios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineanegocioLogic.getLineaNegociosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaNegocios("BusquedaPorNombre",lineanegocioLogic.getLineaNegocios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaNegocios("BusquedaPorNombre",lineanegocios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegocioLogic.setLineaNegocios(new ArrayList<LineaNegocio>());
						lineanegocioLogic.getLineaNegocios().addAll(lineanegociosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineanegocios=new ArrayList<LineaNegocio>();
							lineanegocios.addAll(lineanegociosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineanegocioLogic.getLineaNegociosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineanegocioLogic.getLineaNegocios()==null||lineanegocioLogic.getLineaNegocios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineanegocios==null|| lineanegocios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegociosAux=new ArrayList<LineaNegocio>();
						lineanegociosAux.addAll(lineanegocioLogic.getLineaNegocios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineanegociosAux=new ArrayList<LineaNegocio>();
							lineanegociosAux.addAll(lineanegocios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineanegocioLogic.getLineaNegociosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaNegocioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaNegocios("FK_IdEmpresa",lineanegocioLogic.getLineaNegocios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaNegocios("FK_IdEmpresa",lineanegocios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegocioLogic.setLineaNegocios(new ArrayList<LineaNegocio>());
						lineanegocioLogic.getLineaNegocios().addAll(lineanegociosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineanegocios=new ArrayList<LineaNegocio>();
							lineanegocios.addAll(lineanegociosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesLineaNegocio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessLineaNegocio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=lineanegocioLogic.getLineaNegocios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineanegocios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=lineanegocioLogic.getLineaNegocios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineanegocios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(LineaNegocio lineanegocio) {
		Boolean permite=true;
		
		if(this.lineanegocio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=LineaNegocioConstantesFunciones.getOrderByListaLineaNegocio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=LineaNegocioConstantesFunciones.getOrderByListaLineaNegocio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaNegocio lineanegocio:lineanegocioLogic.getLineaNegocios()) {
				if(lineanegocio.getsType().equals(Constantes2.S_TOTALES)) {
					lineanegocioTotales=lineanegocio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaNegocio lineanegocio:this.lineanegocios) {
				if(lineanegocio.getsType().equals(Constantes2.S_TOTALES)) {
					lineanegocioTotales=lineanegocio;
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
			this.lineanegocioAux=new LineaNegocio();
			this.lineanegocioAux.setsType(Constantes2.S_TOTALES);
			this.lineanegocioAux.setIsNew(false);
			this.lineanegocioAux.setIsChanged(false);
			this.lineanegocioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				LineaNegocioConstantesFunciones.TotalizarValoresFilaLineaNegocio(this.lineanegocioLogic.getLineaNegocios(),this.lineanegocioAux);
				
				this.lineanegocioLogic.getLineaNegocios().add(this.lineanegocioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				LineaNegocioConstantesFunciones.TotalizarValoresFilaLineaNegocio(this.lineanegocios,this.lineanegocioAux);
				
				this.lineanegocios.add(this.lineanegocioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		lineanegocioTotales=new LineaNegocio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.lineanegocioLogic.getLineaNegocios().remove(lineanegocioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.lineanegocios.remove(lineanegocioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		lineanegocioTotales=new LineaNegocio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaNegocio lineanegocio:lineanegocioLogic.getLineaNegocios()) {
				if(lineanegocio.getsType().equals(Constantes2.S_TOTALES)) {
					lineanegocioTotales=lineanegocio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LineaNegocioConstantesFunciones.TotalizarValoresFilaLineaNegocio(this.lineanegocioLogic.getLineaNegocios(),lineanegocioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaNegocio lineanegocio:this.lineanegocios) {
				if(lineanegocio.getsType().equals(Constantes2.S_TOTALES)) {
					lineanegocioTotales=lineanegocio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LineaNegocioConstantesFunciones.TotalizarValoresFilaLineaNegocio(this.lineanegocios,lineanegocioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getLineaNegociosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaNegociosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaNegociosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getLineaNegociosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineanegocioLogic.getLineaNegociosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaNegociosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineanegocioLogic.getLineaNegociosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaNegociosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineanegocioLogic.getLineaNegociosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosLineaNegocio() {
		this.isPermisoTodoLineaNegocio=false;
		this.isPermisoNuevoLineaNegocio=false;
		this.isPermisoActualizarLineaNegocio=false;
		this.isPermisoActualizarOriginalLineaNegocio=false;
		this.isPermisoEliminarLineaNegocio=false;
		this.isPermisoGuardarCambiosLineaNegocio=false;
		this.isPermisoConsultaLineaNegocio=false;
		this.isPermisoBusquedaLineaNegocio=false;
		this.isPermisoReporteLineaNegocio=false;		
		this.isPermisoOrdenLineaNegocio=false;		
		this.isPermisoPaginacionMedioLineaNegocio=false;		
		this.isPermisoPaginacionAltoLineaNegocio=false;
		this.isPermisoPaginacionTodoLineaNegocio=false;
		this.isPermisoCopiarLineaNegocio=false;		
		this.isPermisoVerFormLineaNegocio=false;		
		this.isPermisoDuplicarLineaNegocio=false;		
		this.isPermisoOrdenLineaNegocio=false;		
	}
	
	public void setPermisosUsuarioLineaNegocio(Boolean isPermiso) {
		this.isPermisoTodoLineaNegocio=isPermiso;
		this.isPermisoNuevoLineaNegocio=isPermiso;
		this.isPermisoActualizarLineaNegocio=isPermiso;
		this.isPermisoActualizarOriginalLineaNegocio=isPermiso;
		this.isPermisoEliminarLineaNegocio=isPermiso;
		this.isPermisoGuardarCambiosLineaNegocio=isPermiso;
		this.isPermisoConsultaLineaNegocio=isPermiso;
		this.isPermisoBusquedaLineaNegocio=isPermiso;
		this.isPermisoReporteLineaNegocio=isPermiso;
		this.isPermisoOrdenLineaNegocio=isPermiso;		
		this.isPermisoPaginacionMedioLineaNegocio=isPermiso;		
		this.isPermisoPaginacionAltoLineaNegocio=isPermiso;		
		this.isPermisoPaginacionTodoLineaNegocio=isPermiso;		
		this.isPermisoCopiarLineaNegocio=isPermiso;		
		this.isPermisoVerFormLineaNegocio=isPermiso;		
		this.isPermisoDuplicarLineaNegocio=isPermiso;
		this.isPermisoOrdenLineaNegocio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioLineaNegocio(Boolean isPermiso) {
		//this.isPermisoTodoLineaNegocio=isPermiso;
		this.isPermisoNuevoLineaNegocio=isPermiso;
		this.isPermisoActualizarLineaNegocio=isPermiso;
		this.isPermisoActualizarOriginalLineaNegocio=isPermiso;
		this.isPermisoEliminarLineaNegocio=isPermiso;
		this.isPermisoGuardarCambiosLineaNegocio=isPermiso;
		//this.isPermisoConsultaLineaNegocio=isPermiso;
		//this.isPermisoBusquedaLineaNegocio=isPermiso;
		//this.isPermisoReporteLineaNegocio=isPermiso;
		//this.isPermisoOrdenLineaNegocio=isPermiso;		
		//this.isPermisoPaginacionMedioLineaNegocio=isPermiso;		
		//this.isPermisoPaginacionAltoLineaNegocio=isPermiso;		
		//this.isPermisoPaginacionTodoLineaNegocio=isPermiso;		
		//this.isPermisoCopiarLineaNegocio=isPermiso;		
		//this.isPermisoDuplicarLineaNegocio=isPermiso;
		//this.isPermisoOrdenLineaNegocio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioLineaNegocioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PoliticasClienteConstantesFunciones.SNOMBREOPCION);
		
		if(LineaNegocioJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPoliticasCliente=false;
		this.isTienePermisosPoliticasCliente=this.verificarGetPermisosUsuarioOpcionLineaNegocioClaseRelacionada(this.opcionsRelacionadas,PoliticasClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebLineaNegocio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioLineaNegocioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPoliticasCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioLineaNegocioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionLineaNegocioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioLineaNegocioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPoliticasCliente && this.jInternalFrameDetalleFormLineaNegocio!=null && this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLineaNegocio.jTabbedPaneRelacionesLineaNegocio.remove(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioLineaNegocio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(LineaNegocioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, LineaNegocioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoLineaNegocio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarLineaNegocio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalLineaNegocio=this.isPermisoActualizarLineaNegocio;
			this.isPermisoEliminarLineaNegocio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosLineaNegocio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaLineaNegocio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaLineaNegocio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoLineaNegocio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteLineaNegocio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLineaNegocio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioLineaNegocio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoLineaNegocio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoLineaNegocio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarLineaNegocio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormLineaNegocio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarLineaNegocio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLineaNegocio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosLineaNegocio.setToolTipText(this.jTableDatosLineaNegocio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioLineaNegocio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioLineaNegocio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(LineaNegocioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(LineaNegocioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioLineaNegocio() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPoliticasCliente && this.lineanegocioConstantesFunciones.mostrarPoliticasClienteLineaNegocio && !LineaNegocioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Politicas Cliente");
			reporte.setsDescripcion("Politicas Cliente");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyLineaNegocioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyLineaNegocioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(LineaNegocioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyLineaNegocioListas(false);
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
	
	public void cargarCombosLoteForeignKeyLineaNegocioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			LineaNegocioParameterReturnGeneral lineanegocioReturnGeneral=new LineaNegocioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.lineanegocioConstantesFunciones.cargarid_empresaLineaNegocio)
					 || (this.esRecargarFks && this.lineanegocioConstantesFunciones.cargarid_empresaLineaNegocio)) {

					if(!this.lineanegocioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+lineanegocioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				lineanegocioReturnGeneral=lineanegocioLogic.cargarCombosLoteForeignKeyLineaNegocio(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=lineanegocioReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyLineaNegocio()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.lineanegocioSessionBean==null) {
				this.lineanegocioSessionBean=new LineaNegocioSessionBean();
			}

			if(!this.lineanegocioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyLineaNegocio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyLineaNegocio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyLineaNegocio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyLineaNegocio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyLineaNegocio(LineaNegocio lineanegocio)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyLineaNegocio(LineaNegocio lineanegocio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyLineaNegocio()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyLineaNegocio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyLineaNegocio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyLineaNegocio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroLineaNegocio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyLineaNegocio()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyLineaNegocio(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyLineaNegocio()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio!=null && this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.getItemCount()>0) {
				this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public LineaNegocioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public LineaNegocioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public LineaNegocioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.lineanegocioSessionBean=new LineaNegocioSessionBean(); 
		this.lineanegocioConstantesFunciones=new LineaNegocioConstantesFunciones(); 
		this.lineanegocioBean=new LineaNegocio();//(this.lineanegocioConstantesFunciones); 		
		this.lineanegocioReturnGeneral=new LineaNegocioParameterReturnGeneral(); 
		
		this.lineanegocioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineanegocioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public LineaNegocioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public LineaNegocioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public LineaNegocioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessLineaNegocio(true);
			
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
			
			this.lineanegocioConstantesFunciones=new LineaNegocioConstantesFunciones(); 
			this.lineanegocioBean=new LineaNegocio();//this.lineanegocioConstantesFunciones); 			
			this.lineanegocioReturnGeneral=new LineaNegocioParameterReturnGeneral(); 
		
			LineaNegocioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Linea_negocio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.lineanegocio=new LineaNegocio();
			this.lineanegocios = new ArrayList<LineaNegocio>();
			this.lineanegociosAux = new ArrayList<LineaNegocio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic=new LineaNegocioLogic();
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}
			
			//this.lineanegocioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.lineanegocioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormLineaNegocio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoLineaNegocio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLineaNegocio);	
					}
					
					if(this.jInternalFrameImportacionLineaNegocio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLineaNegocio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByLineaNegocio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByLineaNegocio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormLineaNegocio);
				this.jInternalFrameDetalleFormLineaNegocio.setVisible(false);
				this.jInternalFrameDetalleFormLineaNegocio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoLineaNegocio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLineaNegocio);
					this.jInternalFrameReporteDinamicoLineaNegocio.setVisible(false);
					this.jInternalFrameReporteDinamicoLineaNegocio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionLineaNegocio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionLineaNegocio);
					this.jInternalFrameImportacionLineaNegocio.setVisible(false);
					this.jInternalFrameImportacionLineaNegocio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByLineaNegocio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByLineaNegocio);
					this.jInternalFrameOrderByLineaNegocio.setVisible(false);
					this.jInternalFrameOrderByLineaNegocio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idLineaNegocioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=LineaNegocioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.lineanegocioReturnGeneral=new LineaNegocioParameterReturnGeneral();
			
			this.lineanegocioParameterGeneral=new LineaNegocioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.lineanegocioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(LineaNegocioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PoliticasClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LineaNegocioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.lineanegocioSessionBean.getEsGuardarRelacionado(),this.lineanegocioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LineaNegocioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.lineanegocioSessionBean.getEsGuardarRelacionado(),this.lineanegocioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoLineaNegocio=false;
			this.isVisibilidadCeldaDuplicarLineaNegocio=true;
			this.isVisibilidadCeldaCopiarLineaNegocio=true;
			this.isVisibilidadCeldaVerFormLineaNegocio=true;
			this.isVisibilidadCeldaOrdenLineaNegocio=true;
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=false;
			this.isVisibilidadCeldaModificarLineaNegocio=false;
			this.isVisibilidadCeldaActualizarLineaNegocio=false;
			this.isVisibilidadCeldaEliminarLineaNegocio=false;
			this.isVisibilidadCeldaCancelarLineaNegocio=false;
			this.isVisibilidadCeldaGuardarLineaNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesLineaNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosLineaNegocio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioLineaNegocio(false);
			
			this.setPermisosUsuarioLineaNegocio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineanegocioSessionBean.getEsGuardarRelacionado() 
				|| (this.lineanegocioSessionBean.getEsGuardarRelacionado() && this.lineanegocioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioLineaNegocioClasesRelacionadas();
			}
			
			if(this.lineanegocioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioLineaNegocioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosLineaNegocio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualLineaNegocio();
			}
			
			if(!this.isPermisoBusquedaLineaNegocio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasLineaNegocio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioLineaNegocio,this.isPermisoPaginacionMedioLineaNegocio,this.isPermisoPaginacionTodoLineaNegocio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(LineaNegocioConstantesFunciones.getTiposSeleccionarLineaNegocio());
				
				this.tiposColumnasSelect=LineaNegocioConstantesFunciones.getTiposSeleccionarLineaNegocio(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectLineaNegocio();				
				//this.tiposRelacionesSelect=LineaNegocioConstantesFunciones.getTiposRelacionesLineaNegocio(true);
				
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
			//if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioLineaNegocio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioLineaNegocio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioLineaNegocio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesLineaNegocio() ;
			
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
			
			
			this.politicasclienteLogic=new PoliticasClienteLogic(); 
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
				lineanegocioImplementable= (LineaNegocioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LineaNegocioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				lineanegocioImplementableHome= (LineaNegocioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LineaNegocioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.lineanegocios= new ArrayList<LineaNegocio>();
			this.lineanegociosEliminados= new ArrayList<LineaNegocio>();
						
			this.isEsNuevoLineaNegocio=false;
			this.esParaAccionDesdeFormularioLineaNegocio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyLineaNegocio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroLineaNegocio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=LineaNegocioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesLineaNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingLineaNegocio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioLineaNegocio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioLineaNegocio();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasLineaNegocio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasLineaNegocio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasLineaNegocio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessLineaNegocio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga LineaNegocio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectLineaNegocio() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesLineaNegocio")) {
				iIndex=this.jInternalFrameDetalleFormLineaNegocio.jTabbedPaneRelacionesLineaNegocio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormLineaNegocio.jTabbedPaneRelacionesLineaNegocio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();	
				
				

				if(sTitle.equals("Politicas Clientes")) {
					if(!PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLineaNegocio();

						this.cargarParteTabPanelRelacionadaPoliticasCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessLineaNegocio();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPoliticasCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLineaNegocio.cargarSessionConBeanSwingJInternalFramePoliticasCliente(false,true,iIndex);
		this.jButtonPoliticasClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPoliticasCliente();

		//this.jTabbedPaneRelacionesLineaNegocio.updateUI();
		//this.jTabbedPaneRelacionesLineaNegocio.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLineaNegocio.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PoliticasCliente")) {
				int row=this.jTableDatosLineaNegocio.getSelectedRow();
				jButtonPoliticasClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Politicas Cliente")) {

					if(this.isTienePermisosPoliticasCliente && this.lineanegocioConstantesFunciones.mostrarPoliticasClienteLineaNegocio && !LineaNegocioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Politicas Clientes"+"("+PoliticasClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Politicas Clientes");

						if(lineanegocioConstantesFunciones.resaltarPoliticasClienteLineaNegocio!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineanegocioConstantesFunciones.resaltarPoliticasClienteLineaNegocio);
						}

						jmenuItem.setEnabled(this.lineanegocioConstantesFunciones.activarPoliticasClienteLineaNegocio);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PoliticasCliente"));

						

						this.jInternalFrameDetalleFormLineaNegocio.jmenuDetalleLineaNegocio.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyLineaNegocio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyLineaNegocio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyLineaNegocio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyLineaNegocioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyLineaNegocio();
		
		this.cargarCombosFrameForeignKeyLineaNegocio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyLineaNegocio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyLineaNegocio();
		}
	}
	
	
	
	public void jButtonNuevoLineaNegocioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.lineanegocioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
			
			if(jTableDatosLineaNegocio.getRowCount()>=1) {
				jTableDatosLineaNegocio.removeRowSelectionInterval(0, jTableDatosLineaNegocio.getRowCount()-1);						
			}
			
			this.isEsNuevoLineaNegocio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoLineaNegocio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesLineaNegocio(true);			
			//this.lineanegocio=new LineaNegocio();
			//this.lineanegocio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLineaNegocio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaNegocio() ;
			
			if(LineaNegocioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLineaNegocio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.lineanegocio);	
			this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);				
			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
			if(this.lineanegocioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar LineaNegocio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarLineaNegocioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosLineaNegocio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosLineaNegocio.getSelectedRows().length;			
			}
			
			lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoLineaNegocio--;			
				//LineaNegocio lineanegocioAux= new LineaNegocio();			
				//lineanegocioAux.setId(this.iIdNuevoLineaNegocio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//LineaNegocio lineanegocioOrigen=new LineaNegocio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(LineaNegocio lineanegocioOrigen : lineanegociosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							lineanegocioOrigen =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineanegocioOrigen =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaLineaNegocio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.lineanegocio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosLineaNegocio(lineanegocioOrigen,this.lineanegocio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.lineanegocioLogic.getLineaNegocios().add(this.lineanegocioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.lineanegocios.add(this.lineanegocioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaLineaNegocio(false);
				
				this.jTableDatosLineaNegocio.setRowSelectionInterval(this.getIndiceNuevoLineaNegocio(), this.getIndiceNuevoLineaNegocio());
				
				int iLastRow =  this.jTableDatosLineaNegocio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLineaNegocio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLineaNegocio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLineaNegocio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();									
		
			LineaNegocio lineanegocioOrigen=new LineaNegocio();
			LineaNegocio lineanegocioDestino=new LineaNegocio();
				
			lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosLineaNegocio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || lineanegociosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosLineaNegocio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegocioOrigen =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						lineanegocioOrigen =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineanegocioDestino =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						lineanegocioDestino =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				lineanegocioOrigen =lineanegociosSeleccionados.get(0);
				lineanegocioDestino =lineanegociosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosLineaNegocio(lineanegocioOrigen,lineanegocioDestino,true,false);
				
				lineanegocioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(lineanegocioDestino,lineanegocioLogic.getLineaNegocios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineanegocioDestino,lineanegocios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaLineaNegocio(false);
				
				//this.jTableDatosLineaNegocio.setRowSelectionInterval(this.getIndiceNuevoLineaNegocio(), this.getIndiceNuevoLineaNegocio());
				
				int iLastRow =  this.jTableDatosLineaNegocio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLineaNegocio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLineaNegocio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLineaNegocio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormLineaNegocio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesLineaNegocio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasLineaNegocio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesLineaNegocio.setVisible(!isVisible);
			this.jPanelPaginacionLineaNegocio.setVisible(!isVisible);
			this.jPanelAccionesLineaNegocio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameLineaNegocio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoLineaNegocio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionLineaNegocio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByLineaNegocio();
			
			this.abrirFrameOrderByLineaNegocio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByLineaNegocio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleLineaNegocio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormLineaNegocio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormLineaNegocio.isMaximum()) {
					this.jInternalFrameDetalleFormLineaNegocio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormLineaNegocio.setSize(this.jInternalFrameDetalleFormLineaNegocio.iWidthFormulario,this.jInternalFrameDetalleFormLineaNegocio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormLineaNegocio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormLineaNegocio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormLineaNegocio.isMaximum()) {
						this.jInternalFrameDetalleFormLineaNegocio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormLineaNegocio.jContentPaneDetalleLineaNegocio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormLineaNegocio.jTabbedPaneRelacionesLineaNegocio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormLineaNegocio.jContentPaneDetalleLineaNegocio.getWidth(),LineaNegocioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLineaNegocio.jTabbedPaneRelacionesLineaNegocio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormLineaNegocio.jContentPaneDetalleLineaNegocio.getWidth(),LineaNegocioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLineaNegocio.jTabbedPaneRelacionesLineaNegocio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormLineaNegocio.jContentPaneDetalleLineaNegocio.getWidth(),LineaNegocioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPoliticasCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormLineaNegocio.setVisible(true);
	        this.jInternalFrameDetalleFormLineaNegocio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByLineaNegocio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByLineaNegocio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByLineaNegocio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaNegocio,false,this);
				} else {
					this.jInternalFrameOrderByLineaNegocio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaNegocio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByLineaNegocio);
				this.jInternalFrameOrderByLineaNegocio.setVisible(false);
				this.jInternalFrameOrderByLineaNegocio.setSelected(false);
				
				this.jInternalFrameOrderByLineaNegocio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLineaNegocio"));
				
				this.inicializarActualizarBindingTablaOrderByLineaNegocio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionLineaNegocio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionLineaNegocio==null) {
				
				this.jInternalFrameImportacionLineaNegocio=new ImportacionJInternalFrame(LineaNegocioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLineaNegocio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionLineaNegocio);
				this.jInternalFrameImportacionLineaNegocio.setVisible(false);
				this.jInternalFrameImportacionLineaNegocio.setSelected(false);


				this.jInternalFrameImportacionLineaNegocio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLineaNegocio"));
				this.jInternalFrameImportacionLineaNegocio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLineaNegocio"));
				this.jInternalFrameImportacionLineaNegocio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLineaNegocio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoLineaNegocio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoLineaNegocio==null) {
				this.jInternalFrameReporteDinamicoLineaNegocio=new ReporteDinamicoJInternalFrame(LineaNegocioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLineaNegocio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLineaNegocio);
				this.jInternalFrameReporteDinamicoLineaNegocio.setVisible(false);
				this.jInternalFrameReporteDinamicoLineaNegocio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoLineaNegocio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLineaNegocio"));
				this.jInternalFrameReporteDinamicoLineaNegocio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLineaNegocio"));
				this.jInternalFrameReporteDinamicoLineaNegocio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLineaNegocio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLineaNegocio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPoliticasCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLineaNegocio.jContentPaneDetalleLineaNegocio.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleLineaNegocio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormLineaNegocio);
			
	       	this.jInternalFrameDetalleFormLineaNegocio.setVisible(false);
	        this.jInternalFrameDetalleFormLineaNegocio.setSelected(false);
			
			//this.jInternalFrameDetalleFormLineaNegocio.dispose();
			//this.jInternalFrameDetalleFormLineaNegocio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoLineaNegocio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoLineaNegocio.setVisible(true);
	        this.jInternalFrameReporteDinamicoLineaNegocio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionLineaNegocio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionLineaNegocio.setVisible(true);
	        this.jInternalFrameImportacionLineaNegocio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByLineaNegocio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByLineaNegocio.setVisible(true);
	        this.jInternalFrameOrderByLineaNegocio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByLineaNegocio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByLineaNegocio.setVisible(false);
	        this.jInternalFrameOrderByLineaNegocio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoLineaNegocio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoLineaNegocio.setVisible(false);
	        this.jInternalFrameReporteDinamicoLineaNegocio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionLineaNegocio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionLineaNegocio.setVisible(false);
	        this.jInternalFrameImportacionLineaNegocio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarLineaNegocio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarLineaNegocio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesLineaNegocio(true);
			//this.isEsNuevoLineaNegocio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesLineaNegocio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLineaNegocio(false) ;
			
			if(lineanegocioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado() && PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPoliticasClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(LineaNegocioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLineaNegocio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaNegocio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaLineaNegocioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarLineaNegocio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesLineaNegocio(true);
			//this.isEsNuevoLineaNegocio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.lineanegocio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesLineaNegocio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesLineaNegocio(false) ;
			
			if(LineaNegocioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLineaNegocio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaNegocio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesLineaNegocio(false);
			
			//if(!this.isEsNuevoLineaNegocio) {								
				int intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualLineaNegocio(this.lineanegocio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
				
			}
			
			if(this.permiteMantenimiento(this.lineanegocio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoLineaNegocio=true;
					this.inicializarActualizarBindingTablaLineaNegocio(false);
					this.isEsNuevoLineaNegocio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoLineaNegocio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoLineaNegocio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLineaNegocio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLineaNegocio(false);
				
				this.habilitarDeshabilitarControlesLineaNegocio(false);
			
												
				
				if(LineaNegocioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleLineaNegocio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoLineaNegocioActionPerformed(evt,lineanegocioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualLineaNegocio(this.lineanegocio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosLineaNegocio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,lineanegocioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.lineanegocio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarLineaNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				this.lineanegocio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				this.lineanegocio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.lineanegocio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((LineaNegocioModel) this.jTableDatosLineaNegocio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoLineaNegocio=true;
				this.inicializarActualizarBindingTablaLineaNegocio(false);
				this.isEsNuevoLineaNegocio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLineaNegocio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLineaNegocio(false);
				
				this.habilitarDeshabilitarControlesLineaNegocio(false);
				
				
				
				if(LineaNegocioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleLineaNegocio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarLineaNegocioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosLineaNegocio.getRowCount()>=1) {
				jTableDatosLineaNegocio.removeRowSelectionInterval(0, jTableDatosLineaNegocio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesLineaNegocio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaLineaNegocio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLineaNegocio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaNegocio(false) ;
			
			this.isEsNuevoLineaNegocio=false;
			
			if(LineaNegocioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleLineaNegocio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosLineaNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingLineaNegocio(false);
				
				//SI ES MANUAL
				if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualLineaNegocio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosLineaNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoLineaNegocio--;			
			//LineaNegocio lineanegocioAux= new LineaNegocio();			
			//lineanegocioAux.setId(this.iIdNuevoLineaNegocio);
			
			if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaLineaNegocio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
			
			this.lineanegocio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.lineanegocioLogic.getLineaNegocios().add(this.lineanegocioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.lineanegocios.add(this.lineanegocioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaLineaNegocio(false);
			
			this.jTableDatosLineaNegocio.setRowSelectionInterval(this.getIndiceNuevoLineaNegocio(), this.getIndiceNuevoLineaNegocio());
			
			int iLastRow =  this.jTableDatosLineaNegocio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosLineaNegocio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosLineaNegocio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaLineaNegocio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionLineaNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingLineaNegocio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaNegocio(false);
			
			//SI ES MANUAL
			if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLineaNegocio();
			}
			
			//this.abrirFrameTreeLineaNegocio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionLineaNegocioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Linea_negocioS ?", "MANTENIMIENTO DE Linea_negocio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionLineaNegocio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralLineaNegocio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.lineanegocioReturnGeneral=lineanegocioLogic.procesarImportacionLineaNegociosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.lineanegocioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarLineaNegocioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionLineaNegocioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionLineaNegocio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionLineaNegocio.setFileImportacion(this.jInternalFrameImportacionLineaNegocio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionLineaNegocio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionLineaNegocio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionLineaNegocio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionLineaNegocio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoLineaNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();		

		lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("LineaNegocioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"LineaNegocioBaseDesign.jrxml";
			
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
			
			this.generarReporteLineaNegocios("Todos",lineanegociosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea_negocio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LineaNegocioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaNegocioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaNegocioConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoLineaNegocio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case LineaNegocioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case LineaNegocioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case LineaNegocioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case LineaNegocioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case LineaNegocioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case LineaNegocioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LineaNegocioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case LineaNegocioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case LineaNegocioConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoLineaNegocioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();		
		
		lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineanegocio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("LineaNegocios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case LineaNegocioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(LineaNegocio lineanegocio:lineanegociosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineanegocio.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaNegocioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(LineaNegocio lineanegocio:lineanegociosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineanegocio.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaNegocioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(LineaNegocio lineanegocio:lineanegociosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineanegocio.getnombre());
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
			//	this.getFilaCabeceraExportarExcelLineaNegocio(row);				
			//	iRow++;
			//}				
			
			//for(LineaNegocio lineanegocioAux:lineanegociosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelLineaNegocio(lineanegocioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea_negocio",JOptionPane.INFORMATION_MESSAGE);
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
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaNegocio(false);
			
			//SI ES MANUAL
			if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLineaNegocio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresLineaNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaNegocio(false);
			
			//SI ES MANUAL
			if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLineaNegocio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesLineaNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaNegocio(false);
			
			//SI ES MANUAL
			if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLineaNegocio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaLineaNegocio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosLineaNegocio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosLineaNegocio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosLineaNegocio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosLineaNegocio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosLineaNegocio.setMinimumSize(dimensionMinimum);
		this.jTableDatosLineaNegocio.setMaximumSize(dimensionMaximum);
		this.jTableDatosLineaNegocio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingLineaNegocio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingLineaNegocio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingLineaNegocio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaLineaNegocio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesLineaNegocio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasLineaNegocio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLineaNegocio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesLineaNegocio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualLineaNegocio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaLineaNegocio();
		
		this.inicializarActualizarBindingBotonesManualLineaNegocio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualLineaNegocio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLineaNegocio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualLineaNegocio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualLineaNegocio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosLineaNegocio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosLineaNegocio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteLineaNegocio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormLineaNegocio.jCheckBoxPostAccionNuevoLineaNegocio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormLineaNegocio.jCheckBoxPostAccionSinCerrarLineaNegocio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormLineaNegocio.jCheckBoxPostAccionSinMensajeLineaNegocio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosLineaNegocio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosLineaNegocio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteLineaNegocio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
				this.jInternalFrameDetalleFormLineaNegocio.jCheckBoxPostAccionNuevoLineaNegocio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormLineaNegocio.jCheckBoxPostAccionSinCerrarLineaNegocio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormLineaNegocio.jCheckBoxPostAccionSinMensajeLineaNegocio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionLineaNegocio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionLineaNegocio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesLineaNegocio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoLineaNegocio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesLineaNegocio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesLineaNegocio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarLineaNegocio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesLineaNegocio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoLineaNegocio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesLineaNegocio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralLineaNegocio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesLineaNegocio(Boolean esInicializar) throws Exception {
		try	{	
			if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualLineaNegocio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesLineaNegocio() throws Exception {
		try	{
			if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualLineaNegocio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLineaNegocio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualLineaNegocio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesLineaNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesLineaNegocio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesLineaNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesLineaNegocio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesLineaNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesLineaNegocio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionLineaNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionLineaNegocio.addItem(reporte);
			}
			
			
			if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionLineaNegocio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionLineaNegocio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesLineaNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesLineaNegocio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesLineaNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesLineaNegocio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarLineaNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarLineaNegocio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarLineaNegocio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLineaNegocio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLineaNegocio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLineaNegocio!=null) {
				this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLineaNegocio!=null) {
				this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoLineaNegocio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoLineaNegocio!=null) {
				
				if(this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLineaNegocio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoLineaNegocio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLineaNegocio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLineaNegocio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualLineaNegocio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoLineaNegocio.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreLineaNegocio.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasLineaNegocio(Boolean esInicializar) throws Exception {				
		if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualLineaNegocio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaLineaNegocio() throws Exception {
		this.inicializarActualizarBindingTablaLineaNegocio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByLineaNegocio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new LineaNegocioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new LineaNegocioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosLineaNegocioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaNegocioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new LineaNegocioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new LineaNegocioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaLineaNegocio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=lineanegocioLogic.getLineaNegocios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=lineanegocios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosLineaNegocio.setModel(new LineaNegocioModel(this.lineanegocioLogic.getLineaNegocios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosLineaNegocio.setModel(new LineaNegocioModel(this.lineanegocios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByLineaNegocio!=null && this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByLineaNegocio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosLineaNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaNegocio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new LineaNegocioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO,lineanegocioConstantesFunciones.resaltarSeleccionarLineaNegocio,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO,lineanegocioConstantesFunciones.resaltarSeleccionarLineaNegocio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosLineaNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaNegocio,LineaNegocioConstantesFunciones.LABEL_ID));

		if(this.lineanegocioConstantesFunciones.mostraridLineaNegocio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaNegocioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.lineanegocioConstantesFunciones.resaltaridLineaNegocio,this.lineanegocioConstantesFunciones.activaridLineaNegocio,this,true,"idLineaNegocio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineanegocioConstantesFunciones.resaltaridLineaNegocio,this.lineanegocioConstantesFunciones.activaridLineaNegocio,this,true,"idLineaNegocio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaNegocio,LineaNegocioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.lineanegocioConstantesFunciones.mostrarid_empresaLineaNegocio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaNegocioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.lineanegocioConstantesFunciones.resaltarid_empresaLineaNegocio,this,this.lineanegocioConstantesFunciones.activarid_empresaLineaNegocio));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.lineanegocioConstantesFunciones.resaltarid_empresaLineaNegocio,this,this.lineanegocioConstantesFunciones.activarid_empresaLineaNegocio,false,"id_empresaLineaNegocio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaNegocioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaNegocio,LineaNegocioConstantesFunciones.LABEL_CODIGO));

		if(this.lineanegocioConstantesFunciones.mostrarcodigoLineaNegocio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaNegocioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.lineanegocioConstantesFunciones.resaltarcodigoLineaNegocio,this.lineanegocioConstantesFunciones.activarcodigoLineaNegocio,this,true,"codigoLineaNegocio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineanegocioConstantesFunciones.resaltarcodigoLineaNegocio,this.lineanegocioConstantesFunciones.activarcodigoLineaNegocio,this,true,"codigoLineaNegocio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaNegocioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaNegocio,LineaNegocioConstantesFunciones.LABEL_NOMBRE));

		if(this.lineanegocioConstantesFunciones.mostrarnombreLineaNegocio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaNegocioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.lineanegocioConstantesFunciones.resaltarnombreLineaNegocio,this.lineanegocioConstantesFunciones.activarnombreLineaNegocio,this,true,"nombreLineaNegocio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineanegocioConstantesFunciones.resaltarnombreLineaNegocio,this.lineanegocioConstantesFunciones.activarnombreLineaNegocio,this,true,"nombreLineaNegocio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaNegocioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPoliticasCliente && this.lineanegocioConstantesFunciones.mostrarPoliticasClienteLineaNegocio && !LineaNegocioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Politicas Clientes");
				tableColumn.setHeaderValue("Politicas Clientes");
				tableColumn.setCellRenderer(new PoliticasClienteTableCell(lineanegocioConstantesFunciones.resaltarPoliticasClienteLineaNegocio,this,this.lineanegocioConstantesFunciones.activarPoliticasClienteLineaNegocio));
				tableColumn.setCellEditor(new PoliticasClienteTableCell(lineanegocioConstantesFunciones.resaltarPoliticasClienteLineaNegocio,this,this.lineanegocioConstantesFunciones.activarPoliticasClienteLineaNegocio));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLineaNegocio.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.lineanegocioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.lineanegocioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLineaNegocio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.lineanegocioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.lineanegocioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLineaNegocio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.lineanegocioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.lineanegocioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosLineaNegocio.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.lineanegocioSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosLineaNegocio.addColumn(tableColumn);
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
			
			this.jTableDatosLineaNegocio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.lineanegocioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosLineaNegocio.moveColumn(this.jTableDatosLineaNegocio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosLineaNegocio.moveColumn(this.jTableDatosLineaNegocio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.lineanegocioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosLineaNegocio.moveColumn(this.jTableDatosLineaNegocio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosLineaNegocio.moveColumn(this.jTableDatosLineaNegocio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosLineaNegocio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosLineaNegocio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosLineaNegocio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosLineaNegocio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosLineaNegocio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosLineaNegocio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosLineaNegocio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosLineaNegocio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=lineanegocioLogic.getLineaNegocios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=lineanegocios.size()-1;
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
		//this.jTableDatosLineaNegocio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosLineaNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosLineaNegocio();
			
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
				
				//this.isEsNuevoLineaNegocio=false;
					
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
				if(this.lineanegocioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormLineaNegocio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLineaNegocio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLineaNegocio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.lineanegocio.getsType().equals("DUPLICADO")
				   || this.lineanegocio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoLineaNegocio=true;
				
				} else {
					this.isEsNuevoLineaNegocio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
					if(this.lineanegocio.getId()>=0 && !this.lineanegocio.getIsNew()) {						
						this.isEsNuevoLineaNegocio=false;
						
					} else {
						this.isEsNuevoLineaNegocio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoLineaNegocio(esRelaciones);						
				
				this.seleccionarLineaNegocio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.lineanegocio.getId()<0) {
					this.isEsNuevoLineaNegocio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarLineaNegocio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarLineaNegocio(evt,rowIndex);
				}	
				
				if(this.lineanegocioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion LineaNegocio: " + this.dDif); 
					}
				}								
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarLineaNegocio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.lineanegocio)) {
					if(this.lineanegocio.getId()>0) {
						this.lineanegocio.setIsDeleted(true);
						
						this.lineanegociosEliminados.add(this.lineanegocio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.lineanegocioLogic.getLineaNegocios().remove(this.lineanegocio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.lineanegocios.remove(this.lineanegocio);				
					}
					
					
					((LineaNegocioModel) this.jTableDatosLineaNegocio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaLineaNegocio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarLineaNegocio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoLineaNegocio) {
			
			if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLineaNegocio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLineaNegocio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioLineaNegocio(this.lineanegocio);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.lineanegocioConstantesFunciones.cargarid_empresaLineaNegocio || this.lineanegocioConstantesFunciones.event_dependid_empresaLineaNegocio) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.lineanegocio.getid_empresa());
									//this.inicializarActualizarBindingLineaNegocio(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(lineanegocio.getEmpresa()!=null) {
							this.empresasForeignKey.add(lineanegocio.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.lineanegocio.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesLineaNegocio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesLineaNegocio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLineaNegocio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoLineaNegocio(LineaNegocio lineanegocio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoLineaNegocio(lineanegocio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoLineaNegocio(LineaNegocio lineanegocio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioLineaNegocio(lineanegocio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyLineaNegocio(lineanegocio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyLineaNegocio(lineanegocio);
	}
	
	public void setVariablesObjetoActualToFormularioLineaNegocio(LineaNegocio lineanegocio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.setText(lineanegocio.getId().toString());
			this.jInternalFrameDetalleFormLineaNegocio.jTextFieldcodigoLineaNegocio.setText(lineanegocio.getcodigo());
			this.jInternalFrameDetalleFormLineaNegocio.jTextAreanombreLineaNegocio.setText(lineanegocio.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,LineaNegocio lineanegocioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,lineanegocioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,LineaNegocio lineanegocioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				lineanegocioLocal=this.lineanegocio;
			} else {
				lineanegocioLocal=this.lineanegocioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(lineanegocioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoLineaNegocio(lineanegocioLocal,true);
					
					if(lineanegocioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(lineanegocioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(lineanegocioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoLineaNegocio(LineaNegocio lineanegocio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLineaNegocio(lineanegocio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(lineanegocio);
	}
	
	public void setVariablesFormularioToObjetoActualLineaNegocio(LineaNegocio lineanegocio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLineaNegocio(lineanegocio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualLineaNegocio(LineaNegocio lineanegocio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.getText()==null || this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.getText()=="" || this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.getText()=="Id") {
				this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.setText("0");
			}

			if(conColumnasBase) {lineanegocio.setId(Long.parseLong(this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaNegocioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaNegocio.jLabelIdLineaNegocio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			lineanegocio.setcodigo(this.jInternalFrameDetalleFormLineaNegocio.jTextFieldcodigoLineaNegocio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaNegocioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaNegocio.jLabelcodigoLineaNegocio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			lineanegocio.setnombre(this.jInternalFrameDetalleFormLineaNegocio.jTextAreanombreLineaNegocio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaNegocioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaNegocio.jLabelnombreLineaNegocio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLineaNegocio(LineaNegocio lineanegocioBean,LineaNegocio lineanegocio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosLineaNegocio(LineaNegocio lineanegocioOrigen,LineaNegocio lineanegocio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && lineanegocioOrigen.getId()!=null && !lineanegocioOrigen.getId().equals(0L))) {lineanegocio.setId(lineanegocioOrigen.getId());}}
			if(conDefault || (!conDefault && lineanegocioOrigen.getcodigo()!=null && !lineanegocioOrigen.getcodigo().equals(""))) {lineanegocio.setcodigo(lineanegocioOrigen.getcodigo());}
			if(conDefault || (!conDefault && lineanegocioOrigen.getnombre()!=null && !lineanegocioOrigen.getnombre().equals(""))) {lineanegocio.setnombre(lineanegocioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLineaNegocio(LineaNegocio lineanegocio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.setText(lineanegocio.getId().toString());
			this.jInternalFrameDetalleFormLineaNegocio.jTextFieldcodigoLineaNegocio.setText(lineanegocio.getcodigo());
			this.jInternalFrameDetalleFormLineaNegocio.jTextAreanombreLineaNegocio.setText(lineanegocio.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLineaNegocio(LineaNegocioBean lineanegocioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.setText(lineanegocioBean.getId().toString());
			this.jInternalFrameDetalleFormLineaNegocio.jTextFieldcodigoLineaNegocio.setText(lineanegocioBean.getcodigo());
			this.jInternalFrameDetalleFormLineaNegocio.jTextAreanombreLineaNegocio.setText(lineanegocioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanLineaNegocio(LineaNegocioParameterReturnGeneral lineanegocioReturnGeneral,LineaNegocioBean lineanegocioBean,Boolean conDefault) throws Exception { 
		try {
			LineaNegocio lineanegocioLocal=new LineaNegocio();
			
			lineanegocioLocal=lineanegocioReturnGeneral.getLineaNegocio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && lineanegocioLocal.getId()!=null && !lineanegocioLocal.getId().equals(0L))) {lineanegocioBean.setId(lineanegocioLocal.getId());}}
			if(conDefault || (!conDefault && lineanegocioLocal.getcodigo()!=null && !lineanegocioLocal.getcodigo().equals(""))) {lineanegocioBean.setcodigo(lineanegocioLocal.getcodigo());}
			if(conDefault || (!conDefault && lineanegocioLocal.getnombre()!=null && !lineanegocioLocal.getnombre().equals(""))) {lineanegocioBean.setnombre(lineanegocioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxLineaNegocioGenerico(Long idLineaNegocioSeleccionado,JComboBox jComboBoxLineaNegocio,List<LineaNegocio> lineanegociosLocal)throws Exception {
		try {
			LineaNegocio  lineanegocioTemp=null;

			for(LineaNegocio lineanegocioAux:lineanegociosLocal) {
				if(lineanegocioAux.getId()!=null && lineanegocioAux.getId().equals(idLineaNegocioSeleccionado)) {
					lineanegocioTemp=lineanegocioAux;
					break;
				}
			}

			jComboBoxLineaNegocio.setSelectedItem(lineanegocioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxLineaNegocioGenerico(JComboBox jComboBoxLineaNegocio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxLineaNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLineaNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxLineaNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLineaNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLineaNegocio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxLineaNegocio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLineaNegocio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxLineaNegocio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxLineaNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxLineaNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PoliticasCliente")) {
			jButtonPoliticasClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineanegocio=(LineaNegocio) lineanegocioLogic.getLineaNegocios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			lineanegocio =(LineaNegocio) lineanegocios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!lineanegocio.getIsNew() && !lineanegocio.getIsChanged() && !lineanegocio.getIsDeleted()) {
				sDescripcion=lineanegocio.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=lineanegocio.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		LineaNegocio lineanegocioRow=new LineaNegocio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineanegocioRow=(LineaNegocio) lineanegocioLogic.getLineaNegocios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			lineanegocioRow=(LineaNegocio) lineanegocios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPoliticasClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,LineaNegocio lineanegocio) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLineaNegocio==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineanegocio = (LineaNegocio)this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.lineanegocio = (LineaNegocio)this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(lineanegocio!=null) {
						this.lineanegocio = lineanegocio;
					} else {
						this.lineanegocio = new LineaNegocio();
					}
				}

				if(this.isTienePermisosPoliticasCliente && this.permiteMantenimiento(this.lineanegocio)) {
					PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFramePopup=new PoliticasClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						politicasclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFramePopup;
					} else {
						politicasclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame;
					}

					List<LineaNegocio> lineanegocios=new ArrayList<LineaNegocio>();
					lineanegocios.add(this.lineanegocio);
					if(!esRelacionado) {
						//politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setConGuardarRelaciones(false);
						//politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					politicasclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLineaNegocio.cargarPoliticasClienteBeanSwingJInternalFrame(lineanegocios,this.lineanegocio,politicasclienteBeanSwingJInternalFrame,/*conInicializar,*/politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getConGuardarRelaciones(),politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado());
					politicasclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("no_relacionado");

						politicasclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PoliticasClienteConstantesFunciones.ITAMANIOFILATABLA + (PoliticasClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						politicasclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLineaNegocio=(TitledBorder)this.jScrollPanelDatosLineaNegocio.getBorder();
						TitledBorder titledBorderPoliticasCliente=(TitledBorder)politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.getBorder();

						titledBorderPoliticasCliente.setTitle(titledBorderLineaNegocio.getTitle() + " -> Politicas Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,politicasclienteBeanSwingJInternalFrame);
						}

						politicasclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(politicasclienteBeanSwingJInternalFrame);

						politicasclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineanegocioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Politicas Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualLineaNegocio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoLineaNegocio.setVisible((this.isVisibilidadCeldaNuevoLineaNegocio && this.isPermisoNuevoLineaNegocio));			
			this.jButtonDuplicarLineaNegocio.setVisible((this.isVisibilidadCeldaDuplicarLineaNegocio && this.isPermisoDuplicarLineaNegocio));			
			this.jButtonCopiarLineaNegocio.setVisible((this.isVisibilidadCeldaCopiarLineaNegocio && this.isPermisoCopiarLineaNegocio));
			this.jButtonVerFormLineaNegocio.setVisible((this.isVisibilidadCeldaVerFormLineaNegocio && this.isPermisoVerFormLineaNegocio));
			
			this.jButtonAbrirOrderByLineaNegocio.setVisible((this.isVisibilidadCeldaOrdenLineaNegocio && this.isPermisoOrdenLineaNegocio));			
			
			this.jButtonNuevoRelacionesLineaNegocio.setVisible((this.isVisibilidadCeldaNuevoRelacionesLineaNegocio && this.isPermisoNuevoLineaNegocio));			
			this.jButtonNuevoGuardarCambiosLineaNegocio.setVisible((this.isVisibilidadCeldaNuevoLineaNegocio && this.isPermisoNuevoLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio));
			
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonModificarLineaNegocio.setVisible((this.isVisibilidadCeldaModificarLineaNegocio && this.isPermisoActualizarLineaNegocio));	
			this.jInternalFrameDetalleFormLineaNegocio.jButtonActualizarLineaNegocio.setVisible((this.isVisibilidadCeldaActualizarLineaNegocio && this.isPermisoActualizarLineaNegocio));	
			this.jInternalFrameDetalleFormLineaNegocio.jButtonEliminarLineaNegocio.setVisible((this.isVisibilidadCeldaEliminarLineaNegocio && this.isPermisoEliminarLineaNegocio));
			this.jInternalFrameDetalleFormLineaNegocio.jButtonCancelarLineaNegocio.setVisible(this.isVisibilidadCeldaCancelarLineaNegocio);							
			this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosLineaNegocio.setVisible((this.isVisibilidadCeldaGuardarLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio));			
			
			}
						
			this.jButtonGuardarCambiosTablaLineaNegocio.setVisible((this.isVisibilidadCeldaGuardarCambiosLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaNuevoLineaNegocio && this.isPermisoNuevoLineaNegocio));						
			this.jButtonDuplicarToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaDuplicarLineaNegocio && this.isPermisoDuplicarLineaNegocio));						
			this.jButtonCopiarToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaCopiarLineaNegocio && this.isPermisoCopiarLineaNegocio));			
			this.jButtonVerFormToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaVerFormLineaNegocio && this.isPermisoVerFormLineaNegocio));			
			this.jButtonAbrirOrderByToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaOrdenLineaNegocio && this.isPermisoOrdenLineaNegocio));
			this.jButtonNuevoRelacionesToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaNuevoRelacionesLineaNegocio && this.isPermisoNuevoLineaNegocio));			
			this.jButtonNuevoGuardarCambiosToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaNuevoLineaNegocio && this.isPermisoNuevoLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio));			
			
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonModificarToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaModificarLineaNegocio && this.isPermisoActualizarLineaNegocio));	
			this.jInternalFrameDetalleFormLineaNegocio.jButtonActualizarToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaActualizarLineaNegocio  && this.isPermisoActualizarLineaNegocio));	
			this.jInternalFrameDetalleFormLineaNegocio.jButtonEliminarToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaEliminarLineaNegocio && this.isPermisoEliminarLineaNegocio));
			this.jInternalFrameDetalleFormLineaNegocio.jButtonCancelarToolBarLineaNegocio.setVisible(this.isVisibilidadCeldaCancelarLineaNegocio);				
			this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaGuardarLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarLineaNegocio.setVisible((this.isVisibilidadCeldaGuardarCambiosLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoLineaNegocio.setVisible((this.isVisibilidadCeldaNuevoLineaNegocio && this.isPermisoNuevoLineaNegocio));			
			this.jMenuItemDuplicarLineaNegocio.setVisible((this.isVisibilidadCeldaDuplicarLineaNegocio && this.isPermisoDuplicarLineaNegocio));			
			this.jMenuItemCopiarLineaNegocio.setVisible((this.isVisibilidadCeldaCopiarLineaNegocio && this.isPermisoCopiarLineaNegocio));			
			this.jMenuItemVerFormLineaNegocio.setVisible((this.isVisibilidadCeldaVerFormLineaNegocio && this.isPermisoVerFormLineaNegocio));			
			this.jMenuItemAbrirOrderByLineaNegocio.setVisible((this.isVisibilidadCeldaOrdenLineaNegocio && this.isPermisoOrdenLineaNegocio));			
			//this.jMenuItemMostrarOcultarLineaNegocio.setVisible((this.isVisibilidadCeldaOrdenLineaNegocio && this.isPermisoOrdenLineaNegocio));
			this.jMenuItemDetalleAbrirOrderByLineaNegocio.setVisible((this.isVisibilidadCeldaOrdenLineaNegocio && this.isPermisoOrdenLineaNegocio));			
			//this.jMenuItemDetalleMostrarOcultarLineaNegocio.setVisible((this.isVisibilidadCeldaOrdenLineaNegocio && this.isPermisoOrdenLineaNegocio));			
			this.jMenuItemNuevoRelacionesLineaNegocio.setVisible((this.isVisibilidadCeldaNuevoRelacionesLineaNegocio && this.isPermisoNuevoLineaNegocio));			
			this.jMenuItemNuevoGuardarCambiosLineaNegocio.setVisible((this.isVisibilidadCeldaNuevoLineaNegocio && this.isPermisoNuevoLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio));									
			
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			this.jInternalFrameDetalleFormLineaNegocio.jMenuItemModificarLineaNegocio.setVisible((this.isVisibilidadCeldaModificarLineaNegocio && this.isPermisoActualizarLineaNegocio));	
			this.jInternalFrameDetalleFormLineaNegocio.jMenuItemActualizarLineaNegocio.setVisible((this.isVisibilidadCeldaActualizarLineaNegocio && this.isPermisoActualizarLineaNegocio));	
			this.jInternalFrameDetalleFormLineaNegocio.jMenuItemEliminarLineaNegocio.setVisible((this.isVisibilidadCeldaEliminarLineaNegocio && this.isPermisoEliminarLineaNegocio));
			this.jInternalFrameDetalleFormLineaNegocio.jMenuItemCancelarLineaNegocio.setVisible(this.isVisibilidadCeldaCancelarLineaNegocio);				
			}
			
			this.jMenuItemGuardarCambiosLineaNegocio.setVisible((this.isVisibilidadCeldaGuardarLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio));						
			this.jMenuItemGuardarCambiosTablaLineaNegocio.setVisible((this.isVisibilidadCeldaGuardarCambiosLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoLineaNegocio=this.jButtonNuevoLineaNegocio.isVisible();
			this.isVisibilidadCeldaDuplicarLineaNegocio=this.jButtonDuplicarLineaNegocio.isVisible();
			this.isVisibilidadCeldaCopiarLineaNegocio=this.jButtonCopiarLineaNegocio.isVisible();
			this.isVisibilidadCeldaVerFormLineaNegocio=this.jButtonVerFormLineaNegocio.isVisible();
			
			this.isVisibilidadCeldaOrdenLineaNegocio=this.jButtonAbrirOrderByLineaNegocio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=this.jButtonNuevoRelacionesLineaNegocio.isVisible();
			this.isVisibilidadCeldaModificarLineaNegocio=this.jButtonModificarLineaNegocio.isVisible();
			
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			this.isVisibilidadCeldaActualizarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jButtonActualizarLineaNegocio.isVisible();
			this.isVisibilidadCeldaEliminarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jButtonEliminarLineaNegocio.isVisible();
			this.isVisibilidadCeldaCancelarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jButtonCancelarLineaNegocio.isVisible();
			this.isVisibilidadCeldaGuardarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosLineaNegocio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=this.jButtonGuardarCambiosTablaLineaNegocio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoLineaNegocio=this.jButtonNuevoToolBarLineaNegocio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=this.jButtonNuevoRelacionesToolBarLineaNegocio.isVisible();
			
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			this.isVisibilidadCeldaModificarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jButtonModificarToolBarLineaNegocio.isVisible();
			this.isVisibilidadCeldaActualizarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jButtonActualizarToolBarLineaNegocio.isVisible();
			this.isVisibilidadCeldaEliminarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jButtonEliminarToolBarLineaNegocio.isVisible();
			this.isVisibilidadCeldaCancelarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jButtonCancelarToolBarLineaNegocio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLineaNegocio=this.jButtonGuardarCambiosToolBarLineaNegocio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=this.jButtonGuardarCambiosTablaToolBarLineaNegocio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoLineaNegocio=this.jMenuItemNuevoLineaNegocio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=this.jMenuItemNuevoRelacionesLineaNegocio.isVisible();
			
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			this.isVisibilidadCeldaModificarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jMenuItemModificarLineaNegocio.isVisible();
			this.isVisibilidadCeldaActualizarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jMenuItemActualizarLineaNegocio.isVisible();
			this.isVisibilidadCeldaEliminarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jMenuItemEliminarLineaNegocio.isVisible();
			this.isVisibilidadCeldaCancelarLineaNegocio=this.jInternalFrameDetalleFormLineaNegocio.jMenuItemCancelarLineaNegocio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLineaNegocio=this.jMenuItemGuardarCambiosLineaNegocio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=this.jMenuItemGuardarCambiosTablaLineaNegocio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesLineaNegocio(Boolean esInicializar) {
		if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.lineanegocioSessionBean.getConGuardarRelaciones()) {
				//if(this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesLineaNegocio();
			}
			
			this.inicializarActualizarBindingBotonesManualLineaNegocio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualLineaNegocio() {
		this.jButtonNuevoLineaNegocio.setVisible(this.isPermisoNuevoLineaNegocio);			
		this.jButtonDuplicarLineaNegocio.setVisible(this.isPermisoDuplicarLineaNegocio);			
		this.jButtonCopiarLineaNegocio.setVisible(this.isPermisoCopiarLineaNegocio);			
		this.jButtonVerFormLineaNegocio.setVisible(this.isPermisoVerFormLineaNegocio);			
		
		this.jButtonAbrirOrderByLineaNegocio.setVisible(this.isPermisoOrdenLineaNegocio);					
		
		this.jButtonNuevoRelacionesLineaNegocio.setVisible(this.isPermisoNuevoLineaNegocio);			
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonModificarLineaNegocio.setVisible(this.isPermisoActualizarLineaNegocio);	
			this.jInternalFrameDetalleFormLineaNegocio.jButtonActualizarLineaNegocio.setVisible(this.isPermisoActualizarLineaNegocio);	
			this.jInternalFrameDetalleFormLineaNegocio.jButtonEliminarLineaNegocio.setVisible(this.isPermisoEliminarLineaNegocio);
			this.jInternalFrameDetalleFormLineaNegocio.jButtonCancelarLineaNegocio.setVisible(this.isVisibilidadCeldaCancelarLineaNegocio);						
			this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosLineaNegocio.setVisible(this.isPermisoGuardarCambiosLineaNegocio);							
		}
		
		this.jButtonGuardarCambiosTablaLineaNegocio.setVisible(this.isPermisoActualizarLineaNegocio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleLineaNegocio() {
		this.jInternalFrameDetalleFormLineaNegocio.jButtonModificarLineaNegocio.setVisible(this.isPermisoActualizarLineaNegocio);	
		this.jInternalFrameDetalleFormLineaNegocio.jButtonActualizarLineaNegocio.setVisible(this.isPermisoActualizarLineaNegocio);	
		this.jInternalFrameDetalleFormLineaNegocio.jButtonEliminarLineaNegocio.setVisible(this.isPermisoEliminarLineaNegocio);
		this.jInternalFrameDetalleFormLineaNegocio.jButtonCancelarLineaNegocio.setVisible(this.isVisibilidadCeldaCancelarLineaNegocio);							
		this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosLineaNegocio.setVisible((this.isVisibilidadCeldaGuardarLineaNegocio && this.isPermisoGuardarCambiosLineaNegocio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosLineaNegocio() {
		if(LineaNegocioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualLineaNegocio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesLineaNegocio() {
	}
	
	public void jTableDatosLineaNegocioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarLineaNegocio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidLineaNegocioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaNegocio(this.getlineanegocio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineanegocio==null) {
						this.lineanegocio = new LineaNegocio();
					}

					this.setVariablesFormularioToObjetoActualLineaNegocio(this.lineanegocio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
				}

				if(this.lineanegocio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.lineanegocio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaNegocio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaLineaNegocioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebLineaNegocio(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLineaNegocio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLineaNegocio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLineaNegocio(this.getlineanegocio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.lineanegocioLogic.getConnexion());

				if(this.lineanegocio.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.lineanegocio.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLineaNegocio=(TitledBorder)this.jScrollPanelDatosLineaNegocio.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderLineaNegocio.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaLineaNegocioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaNegocio(this.getlineanegocio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineanegocio==null) {
						this.lineanegocio = new LineaNegocio();
					}

					this.setVariablesFormularioToObjetoActualLineaNegocio(this.lineanegocio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
				}

				if(this.lineanegocio.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.lineanegocio.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaNegocio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoLineaNegocioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaNegocio(this.getlineanegocio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineanegocio==null) {
						this.lineanegocio = new LineaNegocio();
					}

					this.setVariablesFormularioToObjetoActualLineaNegocio(this.lineanegocio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
				}

				if(this.lineanegocio.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.lineanegocio.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaNegocio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreLineaNegocioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaNegocio(this.getlineanegocio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineanegocio==null) {
						this.lineanegocio = new LineaNegocio();
					}

					this.setVariablesFormularioToObjetoActualLineaNegocio(this.lineanegocio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);
				}

				if(this.lineanegocio.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.lineanegocio.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaNegocio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoLineaNegocioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaNegocio(false,false);

			this.getLineaNegociosBusquedaPorCodigo();

			this.inicializarActualizarBindingLineaNegocio(false);

			//if(LineaNegocioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaNegocio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreLineaNegocioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaNegocio(false,false);

			this.getLineaNegociosBusquedaPorNombre();

			this.inicializarActualizarBindingLineaNegocio(false);

			//if(LineaNegocioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaNegocio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaLineaNegocioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaNegocio(false,false);

			this.getLineaNegociosFK_IdEmpresa();

			this.inicializarActualizarBindingLineaNegocio(false);

			//if(LineaNegocioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaNegocio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineanegocioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameLineaNegocio() {
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
		

		if(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
			this.jInternalFrameDetalleFormLineaNegocio.setVisible(false);	    			
			this.jInternalFrameDetalleFormLineaNegocio.dispose();
			this.jInternalFrameDetalleFormLineaNegocio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoLineaNegocio!=null) {
			this.jInternalFrameReporteDinamicoLineaNegocio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoLineaNegocio.dispose();
			this.jInternalFrameReporteDinamicoLineaNegocio=null;
		}
		
		if(this.jInternalFrameImportacionLineaNegocio!=null) {
			this.jInternalFrameImportacionLineaNegocio.setVisible(false);	    			
			this.jInternalFrameImportacionLineaNegocio.dispose();
			this.jInternalFrameImportacionLineaNegocio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessLineaNegocio();
			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
			
			if(sTipo.equals("NuevoLineaNegocio")) {
				jButtonNuevoLineaNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarLineaNegocio")) {
				jButtonDuplicarLineaNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarLineaNegocio")) {
				jButtonCopiarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("VerFormLineaNegocio")) {
				jButtonVerFormLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarLineaNegocio")) {
				jButtonNuevoLineaNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarLineaNegocio")) {
				jButtonDuplicarLineaNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoLineaNegocio")) {
				jButtonNuevoLineaNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarLineaNegocio")) {
				jButtonDuplicarLineaNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesLineaNegocio")) {
				jButtonNuevoLineaNegocioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarLineaNegocio")) {
				jButtonNuevoLineaNegocioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesLineaNegocio")) {
				jButtonNuevoLineaNegocioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarLineaNegocio")) {
				jButtonModificarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarLineaNegocio")) {
				jButtonModificarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarLineaNegocio")) {
				jButtonModificarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarLineaNegocio")) {
				jButtonActualizarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarLineaNegocio")) {
				jButtonActualizarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarLineaNegocio")) {
				jButtonActualizarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("EliminarLineaNegocio")) {
				jButtonEliminarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarLineaNegocio")) {
				jButtonEliminarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarLineaNegocio")) {
				jButtonEliminarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("CancelarLineaNegocio")) {
				jButtonCancelarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarLineaNegocio")) {
				jButtonCancelarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarLineaNegocio")) {
				jButtonCancelarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("CerrarLineaNegocio")) {
				jButtonCerrarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarLineaNegocio")) {
				jButtonCerrarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarLineaNegocio")) {
				jButtonCerrarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarLineaNegocio")) {
				jButtonMostrarOcultarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarLineaNegocio")) {
				jButtonCancelarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosLineaNegocio")) {
				jButtonGuardarCambiosLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarLineaNegocio")) {
				jButtonGuardarCambiosLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarLineaNegocio")) {
				jButtonCopiarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarLineaNegocio")) {
				jButtonVerFormLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosLineaNegocio")) {
				jButtonGuardarCambiosLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarLineaNegocio")) {
				jButtonCopiarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormLineaNegocio")) {
				jButtonVerFormLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaLineaNegocio")) {
				jButtonGuardarCambiosLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarLineaNegocio")) {
				jButtonGuardarCambiosLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaLineaNegocio")) {
				jButtonGuardarCambiosLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionLineaNegocio")) {
				jButtonRecargarInformacionLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarLineaNegocio")) {
				jButtonRecargarInformacionLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionLineaNegocio")) {
				jButtonRecargarInformacionLineaNegocioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresLineaNegocio")) {
				jButtonAnterioresLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarLineaNegocio")) {
				jButtonAnterioresLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreLineaNegocio")) {
				jButtonAnterioresLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesLineaNegocio")) {
				jButtonSiguientesLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarLineaNegocio")) {
				jButtonSiguientesLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesLineaNegocio")) {
				jButtonSiguientesLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByLineaNegocio") || sTipo.equals("MenuItemDetalleAbrirOrderByLineaNegocio")) {
				jButtonAbrirOrderByLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarLineaNegocio") || sTipo.equals("MenuItemDetalleMostrarOcultarLineaNegocio")) {
				jButtonMostrarOcultarLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosLineaNegocio")) {
				jButtonNuevoGuardarCambiosLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarLineaNegocio")) {
				jButtonNuevoGuardarCambiosLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosLineaNegocio")) {
				jButtonNuevoGuardarCambiosLineaNegocioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoLineaNegocio")) {
				jButtonCerrarReporteDinamicoLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoLineaNegocio")) {
				jButtonGenerarReporteDinamicoLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoLineaNegocio")) {
				
				jButtonGenerarExcelReporteDinamicoLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionLineaNegocio")) {
				jButtonCerrarImportacionLineaNegocioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionLineaNegocio")) {
				
				jButtonGenerarImportacionLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionLineaNegocio")) {
				
				jButtonAbrirImportacionLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesLineaNegocio")) {
				jComboBoxTiposAccionesLineaNegocioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesLineaNegocio")) {
				jComboBoxTiposRelacionesLineaNegocioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioLineaNegocio")) {
				jComboBoxTiposAccionesLineaNegocioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarLineaNegocio")) {
				
				jComboBoxTiposSeleccionarLineaNegocioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralLineaNegocio")) {
				jTextFieldValorCampoGeneralLineaNegocioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByLineaNegocio")) {
				jButtonAbrirOrderByLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarLineaNegocio")) {
				jButtonAbrirOrderByLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByLineaNegocio")) {
				jButtonCerrarOrderByLineaNegocioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLineaNegocioBusqueda")) {
				this.jButtonidLineaNegocioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLineaNegocioUpdate")) {
				this.jButtonid_empresaLineaNegocioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLineaNegocioBusqueda")) {
				this.jButtonid_empresaLineaNegocioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoLineaNegocioBusqueda")) {
				this.jButtoncodigoLineaNegocioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLineaNegocioBusqueda")) {
				this.jButtonnombreLineaNegocioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoLineaNegocio")) {
				this.jButtonBusquedaPorCodigoLineaNegocioActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreLineaNegocio")) {
				this.jButtonBusquedaPorNombreLineaNegocioActionPerformed(evt);
			}
			
			;
			
			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessLineaNegocio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaNegocioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				


				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			LineaNegocio lineanegocioLocal=null;
			
			if(!this.getEsControlTabla()) {
				lineanegocioLocal=this.lineanegocio;
			} else {
				lineanegocioLocal=this.lineanegocioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
							
				
				


				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaNegocioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioAnterior =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineanegocioAnterior =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
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
			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
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
			
			


			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaNegocioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
								
						
				


				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
								
				
				


				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaNegocioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioAnterior =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineanegocioAnterior =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaNegocioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioAnterior =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineanegocioAnterior =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaNegocioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
							
				
				


				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaNegocioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineanegocioAnterior =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.lineanegocioAnterior =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
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
			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
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
			
			


			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaNegocioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
								
				
				


				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaNegocioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioAnterior =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineanegocioAnterior =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaNegocioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaNegocioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosLineaNegocio")) {
					jCheckBoxSeleccionarTodosLineaNegocioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosLineaNegocio")) {
					jCheckBoxSeleccionadosLineaNegocioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarLineaNegocio")) {
					
				}
				
				


				
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
												
				
				


				
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaNegocioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineanegocioAnterior =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.lineanegocioAnterior =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaNegocioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
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
			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
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
			
			


			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaNegocioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineanegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineanegocio);
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
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
				
				


				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaNegocio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaNegocioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineanegocioAnterior =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineanegocioAnterior =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarLineaNegocio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosLineaNegocioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosLineaNegocio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.lineanegocio =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.lineanegocio =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.lineanegocio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarLineaNegocio")) {
				
				}
				
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarLineaNegocio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosLineaNegocio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarLineaNegocio")) {
			
			}
			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessLineaNegocio();
			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
			if(sTipo.equals("NuevoLineaNegocio")) {
				jButtonNuevoLineaNegocioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarLineaNegocio")) {
				jButtonDuplicarLineaNegocioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarLineaNegocio")) {
				jButtonCopiarLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormLineaNegocio")) {
				jButtonVerFormLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesLineaNegocio")) {
				jButtonNuevoLineaNegocioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarLineaNegocio")) {
				jButtonModificarLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarLineaNegocio")) {
				jButtonActualizarLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarLineaNegocio")) {
				jButtonEliminarLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaLineaNegocio")) {
				jButtonGuardarCambiosLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLineaNegocio")) {
				jButtonCancelarLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarLineaNegocio")) {
				jButtonCerrarLineaNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosLineaNegocio")) {
				jButtonGuardarCambiosLineaNegocioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosLineaNegocio")) {
				jButtonNuevoGuardarCambiosLineaNegocioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByLineaNegocio")) {
				jButtonAbrirOrderByLineaNegocioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionLineaNegocio")) {
				jButtonRecargarInformacionLineaNegocioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresLineaNegocio")) {
				jButtonAnterioresLineaNegocioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesLineaNegocio")) {
				jButtonSiguientesLineaNegocioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLineaNegocioBusqueda")) {
				this.jButtonidLineaNegocioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLineaNegocioUpdate")) {
				this.jButtonid_empresaLineaNegocioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLineaNegocioBusqueda")) {
				this.jButtonid_empresaLineaNegocioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoLineaNegocioBusqueda")) {
				this.jButtoncodigoLineaNegocioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLineaNegocioBusqueda")) {
				this.jButtonnombreLineaNegocioBusquedaActionPerformed(evt);
			}
			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessLineaNegocio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameLineaNegocio")) {
				closingInternalFrameLineaNegocio();
				
			} else if(sTipo.equals("jButtonCancelarLineaNegocio")) {
				JInternalFrameBase jInternalFrameDetalleFormLineaNegocio = (JInternalFrameBase)evt.getSource();
	            	
	            LineaNegocioBeanSwingJInternalFrame jInternalFrameParent=(LineaNegocioBeanSwingJInternalFrame)jInternalFrameDetalleFormLineaNegocio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarLineaNegocioActionPerformed(null);
			}
			
			LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.lineanegocio,new Object(),this.lineanegocioParameterGeneral,this.lineanegocioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormLineaNegocio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormLineaNegocio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormLineaNegocio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.lineanegocio)) {
			if(!esControlTabla) {
				if(LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualLineaNegocio(this.lineanegocio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);			
				}
				
				if(this.lineanegocioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualLineaNegocio(this.lineanegocio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.lineanegocioReturnGeneral=lineanegocioLogic.procesarEventosLineaNegociosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineanegocioLogic.getLineaNegocios(),this.lineanegocio,this.lineanegocioParameterGeneral,this.isEsNuevoLineaNegocio,classes);//this.lineanegocioLogic.getLineaNegocio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanLineaNegocio(this.lineanegocioReturnGeneral,this.lineanegocioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.lineanegocioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanLineaNegocio(classes,this.lineanegocioReturnGeneral,this.lineanegocioBean,false);
					}
						
					if(this.lineanegocioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyLineaNegocio(this.lineanegocioReturnGeneral.getLineaNegocio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioLineaNegocio(this.lineanegocioReturnGeneral.getLineaNegocio());	
					}
						
					if(this.lineanegocioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioLineaNegocio(this.lineanegocioReturnGeneral.getLineaNegocio(),classes);//this.lineanegocioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioLineaNegocio(this.lineanegocio,classes);//this.lineanegocioBean);									
				}
			
				if(LineaNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualLineaNegocio(this.lineanegocio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaNegocio(this.lineanegocio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.lineanegocioAnterior!=null) {
						this.lineanegocio=this.lineanegocioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.lineanegocioReturnGeneral=lineanegocioLogic.procesarEventosLineaNegociosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineanegocioLogic.getLineaNegocios(),this.lineanegocio,this.lineanegocioParameterGeneral,this.isEsNuevoLineaNegocio,classes);//this.lineanegocioLogic.getLineaNegocio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.lineanegocioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.lineanegocioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.lineanegocioReturnGeneral.getLineaNegocio(),lineanegocioLogic.getLineaNegocios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.lineanegocioReturnGeneral.getLineaNegocio(),this.lineanegocios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosLineaNegocio.repaint();
				
				//((AbstractTableModel) this.jTableDatosLineaNegocio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosLineaNegocio();
			}
		}
	}
	
	public void actualizarVisualTableDatosLineaNegocio() throws Exception {
		
		LineaNegocioModel lineanegocioModel=(LineaNegocioModel)this.jTableDatosLineaNegocio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineanegocioModel.lineanegocios=this.lineanegocioLogic.getLineaNegocios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			lineanegocioModel.lineanegocios=this.lineanegocios;
		}
		
		
		((LineaNegocioModel) this.jTableDatosLineaNegocio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaLineaNegocio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlineanegocioAnterior(),this.lineanegocioLogic.getLineaNegocios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlineanegocioAnterior(),this.lineanegocios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosLineaNegocio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioLineaNegocio(LineaNegocio lineanegocio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(lineanegocio.getPoliticasClientes());
					this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
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
										
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineanegocio,new Object(),generalEntityParameterGeneral,this.lineanegocioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.lineanegocioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=LineaNegocioConstantesFunciones.getClassesRelationshipsOfLineaNegocio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=LineaNegocioConstantesFunciones.getClassesRelationshipsFromStringsOfLineaNegocio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormLineaNegocio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				LineaNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineanegocio,new Object(),generalEntityParameterGeneral,this.lineanegocioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioLineaNegocio(LineaNegocioBean lineanegocioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(lineanegocio.getPoliticasClientes());
					this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanLineaNegocio(ArrayList<Classe> classes,LineaNegocioReturnGeneral lineanegocioReturnGeneral,LineaNegocioBean lineanegocioBean,Boolean conDefault) throws Exception {
		
			this.lineanegocioBean.setPoliticasClientes(lineanegocioReturnGeneral.getLineaNegocio().getPoliticasClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualLineaNegocio(LineaNegocio lineanegocio,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					lineanegocio.setPoliticasClientes(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.lineanegocio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormLineaNegocio = new LineaNegocioDetalleFormJInternalFrame(jDesktopPane,this.lineanegocioSessionBean.getConGuardarRelaciones(),this.lineanegocioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormLineaNegocio);
		this.jInternalFrameDetalleFormLineaNegocio.setVisible(false);
		this.jInternalFrameDetalleFormLineaNegocio.setSelected(false);						
		
		this.jInternalFrameDetalleFormLineaNegocio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormLineaNegocio.lineanegocioLogic=this.lineanegocioLogic;
		
		this.cargarCombosFrameForeignKeyLineaNegocio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleLineaNegocio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLineaNegocio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyLineaNegocio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyLineaNegocio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormLineaNegocio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLineaNegocio"));
		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonModificarLineaNegocio.addActionListener(new ButtonActionListener(this,"ModificarLineaNegocio"));

		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonModificarToolBarLineaNegocio.addActionListener(new ButtonActionListener(this,"ModificarToolBarLineaNegocio"));
					
		this.jInternalFrameDetalleFormLineaNegocio.jMenuItemModificarLineaNegocio.addActionListener(new ButtonActionListener(this,"MenuItemModificarLineaNegocio"));		
		
		
		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonActualizarLineaNegocio.addActionListener (new ButtonActionListener(this,"ActualizarLineaNegocio"));
		
		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonActualizarToolBarLineaNegocio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLineaNegocio"));
						
		this.jInternalFrameDetalleFormLineaNegocio.jMenuItemActualizarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLineaNegocio"));		
		
		
		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonEliminarLineaNegocio.addActionListener (new ButtonActionListener(this,"EliminarLineaNegocio"));
		
		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonEliminarToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"EliminarToolBarLineaNegocio"));
								
		this.jInternalFrameDetalleFormLineaNegocio.jMenuItemEliminarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLineaNegocio"));		
		
		
		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonCancelarLineaNegocio.addActionListener (new ButtonActionListener(this,"CancelarLineaNegocio"));
		
		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonCancelarToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"CancelarToolBarLineaNegocio"));
					
		this.jInternalFrameDetalleFormLineaNegocio.jMenuItemCancelarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLineaNegocio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormLineaNegocio.jMenuItemDetalleCerrarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLineaNegocio"));		
		
		
		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLineaNegocio"));
		
		
		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLineaNegocio"));
		
		
		
		this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLineaNegocio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtonidLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"idLineaNegocioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaNegocio.jButtonid_empresaLineaNegocioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaNegocioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtonid_empresaLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtoncodigoLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"codigoLineaNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtonnombreLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"nombreLineaNegocioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormLineaNegocio.jTabbedPaneRelacionesLineaNegocio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLineaNegocio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameLineaNegocio"));
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLineaNegocio"));
		}
		
		this.jTableDatosLineaNegocio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarLineaNegocio"));
		
		this.jTableDatosLineaNegocio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarLineaNegocio"));
		
		this.jButtonNuevoLineaNegocio.addActionListener(new ButtonActionListener(this,"NuevoLineaNegocio"));
		
		this.jButtonDuplicarLineaNegocio.addActionListener(new ButtonActionListener(this,"DuplicarLineaNegocio"));
		
		this.jButtonCopiarLineaNegocio.addActionListener(new ButtonActionListener(this,"CopiarLineaNegocio"));
		
		this.jButtonVerFormLineaNegocio.addActionListener(new ButtonActionListener(this,"VerFormLineaNegocio"));
		
		
		this.jButtonNuevoToolBarLineaNegocio.addActionListener(new ButtonActionListener(this,"NuevoToolBarLineaNegocio"));
			
		this.jButtonDuplicarToolBarLineaNegocio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarLineaNegocio"));
			
		this.jMenuItemNuevoLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoLineaNegocio"));
			
		this.jMenuItemDuplicarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarLineaNegocio"));		
		
		
		this.jButtonNuevoRelacionesLineaNegocio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesLineaNegocio"));
		
		
		this.jButtonNuevoRelacionesToolBarLineaNegocio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarLineaNegocio"));
			
		this.jMenuItemNuevoRelacionesLineaNegocio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesLineaNegocio"));		
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonModificarLineaNegocio.addActionListener(new ButtonActionListener(this,"ModificarLineaNegocio"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonModificarToolBarLineaNegocio.addActionListener(new ButtonActionListener(this,"ModificarToolBarLineaNegocio"));
			
			this.jInternalFrameDetalleFormLineaNegocio.jMenuItemModificarLineaNegocio.addActionListener(new ButtonActionListener(this,"MenuItemModificarLineaNegocio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormLineaNegocio.jButtonActualizarLineaNegocio.addActionListener (new ButtonActionListener(this,"ActualizarLineaNegocio"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonActualizarToolBarLineaNegocio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLineaNegocio"));
				
			this.jInternalFrameDetalleFormLineaNegocio.jMenuItemActualizarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLineaNegocio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonEliminarLineaNegocio.addActionListener (new ButtonActionListener(this,"EliminarLineaNegocio"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonEliminarToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"EliminarToolBarLineaNegocio"));
						
			this.jInternalFrameDetalleFormLineaNegocio.jMenuItemEliminarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLineaNegocio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonCancelarLineaNegocio.addActionListener (new ButtonActionListener(this,"CancelarLineaNegocio"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonCancelarToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"CancelarToolBarLineaNegocio"));
			
			this.jInternalFrameDetalleFormLineaNegocio.jMenuItemCancelarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLineaNegocio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarLineaNegocio"));		
		
		
		this.jButtonCerrarLineaNegocio.addActionListener (new ButtonActionListener(this,"CerrarLineaNegocio"));
		
		
		this.jButtonCerrarToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"CerrarToolBarLineaNegocio"));
			
		this.jMenuItemCerrarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarLineaNegocio"));
			
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jMenuItemDetalleCerrarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLineaNegocio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosLineaNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosLineaNegocio"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLineaNegocio"));
		}
		
		this.jButtonCopiarToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"CopiarToolBarLineaNegocio"));
			
		this.jButtonVerFormToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"VerFormToolBarLineaNegocio"));
		
		this.jMenuItemGuardarCambiosLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosLineaNegocio"));
			
		this.jMenuItemCopiarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarLineaNegocio"));		
		
		this.jMenuItemVerFormLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormLineaNegocio"));		
		
		
		this.jButtonGuardarCambiosTablaLineaNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLineaNegocio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarLineaNegocio"));
			
		this.jMenuItemGuardarCambiosTablaLineaNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLineaNegocio"));		
		
		
		
		this.jButtonRecargarInformacionLineaNegocio.addActionListener (new ButtonActionListener(this,"RecargarInformacionLineaNegocio"));
					
		this.jButtonRecargarInformacionToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarLineaNegocio"));
		
		this.jMenuItemRecargarInformacionLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionLineaNegocio"));		
		
		
		
		this.jButtonAnterioresLineaNegocio.addActionListener (new ButtonActionListener(this,"AnterioresLineaNegocio"));
		
		
		this.jButtonAnterioresToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarLineaNegocio"));
		
		this.jMenuItemAnterioresLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresLineaNegocio"));		
		
		
		this.jButtonSiguientesLineaNegocio.addActionListener (new ButtonActionListener(this,"SiguientesLineaNegocio"));
		
		
		this.jButtonSiguientesToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarLineaNegocio"));
			
		this.jMenuItemSiguientesLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesLineaNegocio"));
			
		this.jMenuItemAbrirOrderByLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByLineaNegocio"));
			
		this.jMenuItemMostrarOcultarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarLineaNegocio"));
			
		this.jMenuItemDetalleAbrirOrderByLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByLineaNegocio"));
			
		this.jMenuItemDetalleMostarOcultarLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarLineaNegocio"));		
		
		
		this.jButtonNuevoGuardarCambiosLineaNegocio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosLineaNegocio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarLineaNegocio"));
			
		this.jMenuItemNuevoGuardarCambiosLineaNegocio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosLineaNegocio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosLineaNegocio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosLineaNegocio"));

		this.jCheckBoxSeleccionadosLineaNegocio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosLineaNegocio"));
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLineaNegocio"));
		}
		
		
		this.jComboBoxTiposRelacionesLineaNegocio.addActionListener (new ButtonActionListener(this,"TiposRelacionesLineaNegocio"));
			
		this.jComboBoxTiposAccionesLineaNegocio.addActionListener (new ButtonActionListener(this,"TiposAccionesLineaNegocio"));
					
		this.jComboBoxTiposSeleccionarLineaNegocio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarLineaNegocio"));
			
		this.jTextFieldValorCampoGeneralLineaNegocio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralLineaNegocio"));		
		
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtonidLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"idLineaNegocioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaNegocio.jButtonid_empresaLineaNegocioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaNegocioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtonid_empresaLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtoncodigoLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"codigoLineaNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtonnombreLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"nombreLineaNegocioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoLineaNegocio.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoLineaNegocio"));

			this.jButtonBusquedaPorNombreLineaNegocio.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreLineaNegocio"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoLineaNegocio!=null) {
				this.jInternalFrameReporteDinamicoLineaNegocio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLineaNegocio"));
				this.jInternalFrameReporteDinamicoLineaNegocio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLineaNegocio"));
				this.jInternalFrameReporteDinamicoLineaNegocio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLineaNegocio"));
			}
			
			//this.jButtonCerrarReporteDinamicoLineaNegocio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLineaNegocio"));				
			//this.jButtonGenerarReporteDinamicoLineaNegocio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLineaNegocio"));
			//this.jButtonGenerarExcelReporteDinamicoLineaNegocio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLineaNegocio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionLineaNegocio!=null) {
				this.jInternalFrameImportacionLineaNegocio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLineaNegocio"));
				this.jInternalFrameImportacionLineaNegocio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLineaNegocio"));
				this.jInternalFrameImportacionLineaNegocio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLineaNegocio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByLineaNegocio.addActionListener (new ButtonActionListener(this,"AbrirOrderByLineaNegocio"));
			
			this.jButtonAbrirOrderByToolBarLineaNegocio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarLineaNegocio"));			
			
			if(this.jInternalFrameOrderByLineaNegocio!=null) {
				this.jInternalFrameOrderByLineaNegocio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLineaNegocio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaNegocio.jTabbedPaneRelacionesLineaNegocio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLineaNegocio"));
		
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
            		closingInternalFrameLineaNegocio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormLineaNegocio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormLineaNegocio = (JInternalFrameBase)event.getSource();
	            	
	            LineaNegocioBeanSwingJInternalFrame jInternalFrameParent=(LineaNegocioBeanSwingJInternalFrame)jInternalFrameDetalleFormLineaNegocio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarLineaNegocioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosLineaNegocio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosLineaNegocioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosLineaNegocio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosLineaNegocio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaNegocioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaNegocioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaNegocioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoLineaNegocio";
		inputMap = this.jButtonNuevoLineaNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoLineaNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLineaNegocioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaNegocioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaNegocioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaNegocioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesLineaNegocio";
		inputMap = this.jButtonNuevoRelacionesLineaNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesLineaNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLineaNegocioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarLineaNegocio";
		inputMap = this.jButtonModificarLineaNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarLineaNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarLineaNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarLineaNegocio";
		inputMap = this.jButtonActualizarLineaNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarLineaNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarLineaNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarLineaNegocio";
		inputMap = this.jButtonEliminarLineaNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarLineaNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarLineaNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarLineaNegocio";
		inputMap = this.jButtonCancelarLineaNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarLineaNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarLineaNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarLineaNegocio";
		inputMap = this.jButtonCerrarLineaNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarLineaNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarLineaNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosLineaNegocio";
		inputMap = this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosLineaNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormLineaNegocio.jButtonGuardarCambiosLineaNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosLineaNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosLineaNegocio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosLineaNegocioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesLineaNegocio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesLineaNegocioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarLineaNegocio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarLineaNegocioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralLineaNegocio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralLineaNegocioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtonidLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"idLineaNegocioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaNegocio.jButtonid_empresaLineaNegocioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaNegocioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtonid_empresaLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtoncodigoLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"codigoLineaNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaNegocio.jButtonnombreLineaNegocioBusqueda.addActionListener(new ButtonActionListener(this,"nombreLineaNegocioBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoLineaNegocio.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoLineaNegocio"));

		this.jButtonBusquedaPorNombreLineaNegocio.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreLineaNegocio"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionLineaNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionLineaNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarLineaNegocioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarLineaNegocio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosLineaNegocio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(LineaNegocio lineanegocioAux:this.lineanegocioLogic.getLineaNegocios()) {
					lineanegocioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaNegocio lineanegocioAux:lineanegocios) {
					lineanegocioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosLineaNegocioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLineaNegocio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LineaNegocio lineanegocioAux:this.lineanegocioLogic.getLineaNegocios()) {
						lineanegocioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LineaNegocio lineanegocioAux:lineanegocios) {
						lineanegocioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(LineaNegocio lineanegocioAux:this.lineanegocioLogic.getLineaNegocios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LineaNegocio lineanegocioAux:lineanegocios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaLineaNegocio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLineaNegocio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLineaNegocio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLineaNegocio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosLineaNegocioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLineaNegocio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosLineaNegocio.getSelectedRows();
			
			LineaNegocio lineanegocioLocal=new LineaNegocio();
			
			//this.seleccionarTodosLineaNegocio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineanegocioLocal =(LineaNegocio) this.lineanegocioLogic.getLineaNegocios().toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					lineanegocioLocal =(LineaNegocio) this.lineanegocios.toArray()[this.jTableDatosLineaNegocio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				lineanegocioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LineaNegocio lineanegocioAux:this.lineanegocioLogic.getLineaNegocios()) {
						lineanegocioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LineaNegocio lineanegocioAux:lineanegocios) {
						lineanegocioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaLineaNegocio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLineaNegocio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLineaNegocio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLineaNegocio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualLineaNegocioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarLineaNegocioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralLineaNegocioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingLineaNegocio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralLineaNegocio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LineaNegocio lineanegocioAux:this.lineanegocioLogic.getLineaNegocios()) {
				
						if(sTipoSeleccionar.equals(LineaNegocioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							lineanegocioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LineaNegocioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							lineanegocioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaNegocio lineanegocioAux:lineanegocios) {
					
						if(sTipoSeleccionar.equals(LineaNegocioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							lineanegocioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LineaNegocioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							lineanegocioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaLineaNegocio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesLineaNegocioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingLineaNegocio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioLineaNegocio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesLineaNegocio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteLineaNegocio) {				
					conSplash=true;//false;										
					
					//this.startProcessLineaNegocio(conSplash);
				
					this.generarReporteLineaNegociosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaNegocio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoLineaNegociosSeleccionados();
				//this.jComboBoxTiposAccionesLineaNegocio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLineaNegociosSeleccionados(false);
				//this.jComboBoxTiposAccionesLineaNegocio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLineaNegociosSeleccionados(true);
				//this.jComboBoxTiposAccionesLineaNegocio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLineaNegocio();
				
				this.exportarLineaNegociosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaNegocio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionLineaNegocios();
				//this.importarLineaNegocios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaNegocio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLineaNegocio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelLineaNegociosSeleccionados();
				//this.jComboBoxTiposAccionesLineaNegocio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Linea_negocio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessLineaNegocio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoLineaNegocio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyLineaNegocio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Linea_negocio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaNegocio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaNegocio.jComboBoxTiposAccionesFormularioLineaNegocio.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralLineaNegocio();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessLineaNegocio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesLineaNegocioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessLineaNegocio();
			
			if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();		
			LineaNegocio lineanegocio=new LineaNegocio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingLineaNegocio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesLineaNegocio.getSelectedItem();
			
			
			
			
			lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
			//this.sTipoAccion;
			
			if(lineanegociosSeleccionados.size()==1) {
				for(LineaNegocio lineanegocioAux:lineanegociosSeleccionados) {
					lineanegocio=lineanegocioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Politicas Cliente")) {
					jButtonPoliticasClienteActionPerformed(null,rowIndex,true,false,lineanegocio);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessLineaNegocio();
			
      		//this.finishProcessLineaNegocio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarLineaNegocioReturnGeneral() throws Exception {
		if(this.lineanegocioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.lineanegocioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.lineanegocioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.lineanegocioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.lineanegocioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.lineanegocioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingLineaNegocio(false);
		}
		
		if(this.lineanegocioReturnGeneral.getConRetornoLista() || this.lineanegocioReturnGeneral.getConRetornoObjeto()) {
			if(this.lineanegocioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.lineanegocioLogic.setLineaNegocios(this.lineanegocioReturnGeneral.getLineaNegocios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.lineanegocioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.lineanegocioLogic.setLineaNegocio(this.lineanegocioReturnGeneral.getLineaNegocio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingLineaNegocio(false);
		}
	}
	
	public void actualizarParametrosGeneralLineaNegocio() throws Exception {
		
		
	}
	
	public ArrayList<LineaNegocio> getLineaNegociosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioLineaNegocio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(LineaNegocio lineanegocioAux:lineanegocioLogic.getLineaNegocios()) {
					if(lineanegocioAux.getIsSelected()) {
						lineanegociosSeleccionados.add(lineanegocioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaNegocio lineanegocioAux:this.lineanegocios) {
					if(lineanegocioAux.getIsSelected()) {
						lineanegociosSeleccionados.add(lineanegocioAux);				
					}
				}
			}
			
			if(lineanegociosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						lineanegociosSeleccionados.addAll(this.lineanegocioLogic.getLineaNegocios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						lineanegociosSeleccionados.addAll(this.lineanegocios);				
					}
				}
			}
		} else {
			lineanegociosSeleccionados.add(this.lineanegocio);
		}
		
		return lineanegociosSeleccionados;
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
	
	public void generarReporteLineaNegociosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalLineaNegociosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoLineaNegociosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLineaNegociosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLineaNegociosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesLineaNegociosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Linea_negocio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesLineaNegociosSeleccionados() throws Exception {
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();		
		
		lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteLineaNegocios("Todos",lineanegociosSeleccionados);
		
	}	
	
	public void generarReporteNormalLineaNegociosSeleccionados() throws Exception {
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();		
		
		lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteLineaNegocios("Todos",lineanegociosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionLineaNegociosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();
		
		lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteLineaNegocios("Todos",lineanegociosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoLineaNegociosSeleccionados() throws Exception {
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoLineaNegocio();
		
		
		lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoLineaNegocio();
		
		
		//this.generarReporteLineaNegocios("Todos",lineanegociosSeleccionados ,lineanegocioImplementable,lineanegocioImplementableHome);
	}
	
	public void mostrarImportacionLineaNegocios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionLineaNegocio();
		
		this.abrirFrameImportacionLineaNegocio();		
		
			
		//this.generarReporteLineaNegocios("Todos",lineanegociosSeleccionados ,lineanegocioImplementable,lineanegocioImplementableHome);
	}
	
	public void importarLineaNegocios() throws Exception {		
	
	}
	
	public void exportarLineaNegociosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelLineaNegociosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoLineaNegociosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlLineaNegociosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Linea_negocio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoLineaNegociosSeleccionados() throws Exception {
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();		
		
		lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineanegocio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarLineaNegocio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(LineaNegocio lineanegocioAux:lineanegociosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarLineaNegocio(lineanegocioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//lineanegocioAux.setsDetalleGeneralEntityReporte(lineanegocioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea_negocio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarLineaNegocio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=LineaNegocioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaNegocioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaNegocioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaNegocioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaNegocioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarLineaNegocio(LineaNegocio lineanegocio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=lineanegocio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=lineanegocio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineanegocio.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineanegocio.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineanegocio.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelLineaNegociosSeleccionados() throws Exception {
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();		
		
		lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineanegocio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("LineaNegocios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelLineaNegocio(row);				
				iRow++;
			}				
			
			for(LineaNegocio lineanegocioAux:lineanegociosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelLineaNegocio(lineanegocioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea_negocio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlLineaNegociosSeleccionados() throws Exception {
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();		
		
		lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineanegocio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("lineanegocios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("lineanegocio");
			//elementRoot.appendChild(element);
		
			for(LineaNegocio lineanegocioAux:lineanegociosSeleccionados) {
				element = document.createElement("lineanegocio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlLineaNegocio(lineanegocioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea_negocio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelLineaNegocio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaNegocioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelLineaNegocio(LineaNegocio lineanegocio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(lineanegocio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(lineanegocio.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lineanegocio.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(lineanegocio.getnombre());				
	}
	
	public void setFilaDatosExportarXmlLineaNegocio(LineaNegocio lineanegocio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(LineaNegocioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(lineanegocio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(LineaNegocioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(lineanegocio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(LineaNegocioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(lineanegocio.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(LineaNegocioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(lineanegocio.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(LineaNegocioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(lineanegocio.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoLineaNegociosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<LineaNegocio> lineanegociosSeleccionados=new ArrayList<LineaNegocio>();
		
		lineanegociosSeleccionados=this.getLineaNegociosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoLineaNegocio(lineanegociosSeleccionados);
		
		this.generarReporteLineaNegocios("Todos",lineanegociosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoLineaNegocio(ArrayList<LineaNegocio> lineanegociosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(LineaNegocio lineanegocioAux:lineanegociosSeleccionados) {
				lineanegocioAux.setsDetalleGeneralEntityReporte(lineanegocioAux.toString());
			
				if(sTipoSeleccionar.equals(LineaNegocioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					lineanegocioAux.setsDescripcionGeneralEntityReporte1(lineanegocioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaNegocioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					lineanegocioAux.setsDescripcionGeneralEntityReporte1(lineanegocioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(LineaNegocioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					lineanegocioAux.setsDescripcionGeneralEntityReporte1(lineanegocioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesLineaNegocio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoLineaNegocio=true;
				this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=true;
				this.isVisibilidadCeldaGuardarCambiosLineaNegocio=true;
			}
			
			this.isVisibilidadCeldaModificarLineaNegocio=false;
			this.isVisibilidadCeldaActualizarLineaNegocio=false;
			this.isVisibilidadCeldaEliminarLineaNegocio=false;
			this.isVisibilidadCeldaCancelarLineaNegocio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaNegocio=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaNegocio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoLineaNegocio=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=false;
			this.isVisibilidadCeldaModificarLineaNegocio=false;
			this.isVisibilidadCeldaActualizarLineaNegocio=true;
			this.isVisibilidadCeldaEliminarLineaNegocio=false;
			this.isVisibilidadCeldaCancelarLineaNegocio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaNegocio=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaNegocio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoLineaNegocio=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=false;
			this.isVisibilidadCeldaModificarLineaNegocio=false;
			this.isVisibilidadCeldaActualizarLineaNegocio=true;
			this.isVisibilidadCeldaEliminarLineaNegocio=true;
			this.isVisibilidadCeldaCancelarLineaNegocio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaNegocio=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaNegocio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoLineaNegocio=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=false;
			this.isVisibilidadCeldaModificarLineaNegocio=false;
			this.isVisibilidadCeldaActualizarLineaNegocio=true;
			this.isVisibilidadCeldaEliminarLineaNegocio=false;
			this.isVisibilidadCeldaCancelarLineaNegocio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaNegocio=false;
				} else {
					this.isVisibilidadCeldaGuardarLineaNegocio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoLineaNegocio=true;
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=true;
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=true;
			this.isVisibilidadCeldaModificarLineaNegocio=false;
			this.isVisibilidadCeldaActualizarLineaNegocio=false;
			this.isVisibilidadCeldaEliminarLineaNegocio=false;
			this.isVisibilidadCeldaCancelarLineaNegocio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaNegocio=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaNegocio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoLineaNegocio=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=false;
			this.isVisibilidadCeldaActualizarLineaNegocio=false;
			this.isVisibilidadCeldaEliminarLineaNegocio=false;
			this.isVisibilidadCeldaCancelarLineaNegocio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaNegocio=false;
				} else {
					this.isVisibilidadCeldaGuardarLineaNegocio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoLineaNegocio=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=false;
			this.isVisibilidadCeldaModificarLineaNegocio=true;
			this.isVisibilidadCeldaActualizarLineaNegocio=false;
			this.isVisibilidadCeldaEliminarLineaNegocio=false;
			this.isVisibilidadCeldaCancelarLineaNegocio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaNegocio=false;
				} else {
					this.isVisibilidadCeldaGuardarLineaNegocio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(LineaNegocioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoLineaNegocio=true;
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=true;
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=true;
		} else {
			this.actualizarEstadoPanelsLineaNegocio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarLineaNegocio=false;
			//this.isVisibilidadCeldaVerFormLineaNegocio=false;
			this.isVisibilidadCeldaDuplicarLineaNegocio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!lineanegocioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=false;
		} else {
			this.isVisibilidadCeldaNuevoLineaNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosLineaNegocio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(lineanegocioSessionBean.getEsGuardarRelacionado()) {
			if(!lineanegocioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=false;												
			}
			
			this.jButtonCerrarLineaNegocio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesLineaNegocio=false;
		}
		
		if(!this.permiteMantenimiento(this.lineanegocio)) {
			this.isVisibilidadCeldaActualizarLineaNegocio=false;
			this.isVisibilidadCeldaEliminarLineaNegocio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesLineaNegocio() {
		this.isVisibilidadCeldaNuevoLineaNegocio=false;
		this.isVisibilidadCeldaGuardarCambiosLineaNegocio=false;
	}
	
	public void actualizarEstadoPanelsLineaNegocio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionLineaNegocio!=null) {
				this.jScrollPanelDatosEdicionLineaNegocio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaNegocio!=null) {
				this.jTabbedPaneBusquedasLineaNegocio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaNegocio!=null) {
				this.jScrollPanelDatosLineaNegocio.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaNegocio!=null) {
				this.jPanelPaginacionLineaNegocio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaNegocio!=null) {
				this.jPanelParametrosReportesLineaNegocio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionLineaNegocio!=null) {
				this.jScrollPanelDatosEdicionLineaNegocio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaNegocio!=null) {
				this.jTabbedPaneBusquedasLineaNegocio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosLineaNegocio!=null) {
				this.jScrollPanelDatosLineaNegocio.setVisible(false);
			}
			
			if(this.jPanelPaginacionLineaNegocio!=null) {
				this.jPanelPaginacionLineaNegocio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLineaNegocio!=null) {
				this.jPanelParametrosReportesLineaNegocio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionLineaNegocio!=null) {
				this.jScrollPanelDatosEdicionLineaNegocio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaNegocio!=null) {
				this.jTabbedPaneBusquedasLineaNegocio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLineaNegocio!=null) {
				this.jScrollPanelDatosLineaNegocio.setVisible(false);
			}
			
			if(this.jPanelPaginacionLineaNegocio!=null) {
				this.jPanelPaginacionLineaNegocio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLineaNegocio!=null) {
				this.jPanelParametrosReportesLineaNegocio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionLineaNegocio!=null) {
				this.jScrollPanelDatosEdicionLineaNegocio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaNegocio!=null) {
				this.jTabbedPaneBusquedasLineaNegocio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLineaNegocio!=null) {
				this.jScrollPanelDatosLineaNegocio.setVisible(false);
			}
			
			if(this.jPanelPaginacionLineaNegocio!=null) {
				this.jPanelPaginacionLineaNegocio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLineaNegocio!=null) {
				this.jPanelParametrosReportesLineaNegocio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionLineaNegocio!=null) {
				this.jScrollPanelDatosEdicionLineaNegocio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaNegocio!=null) {
				this.jTabbedPaneBusquedasLineaNegocio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaNegocio!=null) {
				this.jScrollPanelDatosLineaNegocio.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaNegocio!=null) {
				this.jPanelPaginacionLineaNegocio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaNegocio!=null) {
				this.jPanelParametrosReportesLineaNegocio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionLineaNegocio!=null) {
				this.jScrollPanelDatosEdicionLineaNegocio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaNegocio!=null) {
				this.jTabbedPaneBusquedasLineaNegocio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaNegocio!=null) {
				this.jScrollPanelDatosLineaNegocio.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaNegocio!=null) {
				this.jPanelPaginacionLineaNegocio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaNegocio!=null) {
				this.jPanelParametrosReportesLineaNegocio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionLineaNegocio!=null) {
				this.jScrollPanelDatosEdicionLineaNegocio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaNegocio!=null) {
				this.jTabbedPaneBusquedasLineaNegocio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaNegocio!=null) {
				this.jScrollPanelDatosLineaNegocio.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaNegocio!=null) {
				this.jPanelPaginacionLineaNegocio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaNegocio!=null) {
				this.jPanelParametrosReportesLineaNegocio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasLineaNegocio!=null) {
					this.jTabbedPaneBusquedasLineaNegocio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesLineaNegocio!=null) {
				this.jPanelParametrosReportesLineaNegocio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaNegocio!=null) {
				this.jTabbedPaneBusquedasLineaNegocio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesLineaNegocio!=null) {
				this.jPanelParametrosReportesLineaNegocio.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasLineaNegocio.remove(jPanelBusquedaPorCodigoLineaNegocio);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasLineaNegocio.remove(jPanelBusquedaPorNombreLineaNegocio);}
		}
		
	}
	
	

	public String registrarSesionLineaNegocioParaPoliticasClientes() throws Exception {
		Boolean isPaginaPopupPoliticasCliente=false;

		try {

			if(this.lineanegocioSessionBean==null) {
				this.lineanegocioSessionBean=new LineaNegocioSessionBean();
			}

			if(this.jInternalFrameDetalleFormLineaNegocio.politicasclienteSessionBean==null) {
				this.jInternalFrameDetalleFormLineaNegocio.politicasclienteSessionBean=new PoliticasClienteSessionBean();
			}

			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteSessionBean.setsPathNavegacionActual(lineanegocioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPoliticasCliente=this.jInternalFrameDetalleFormLineaNegocio.politicasclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente(true);
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente(LineaNegocioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteSessionBean.setisBusquedaDesdeForeignKeySesionLineaNegocio(true);
			this.jInternalFrameDetalleFormLineaNegocio.politicasclienteSessionBean.setlidLineaNegocioActual(this.idLineaNegocioActual);

			lineanegocioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLineaNegocio(true);
			lineanegocioSessionBean.setlIdLineaNegocioActualForeignKey(this.idLineaNegocioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//LineaNegocioSessionBean lineanegocioSessionBean=new LineaNegocioSessionBean();
		
		if(this.lineanegocioSessionBean==null) {
			this.lineanegocioSessionBean=new LineaNegocioSessionBean();
		}
		
		this.lineanegocioSessionBean.setsUltimaBusquedaLineaNegocio(this.getsAccionBusqueda());
		this.lineanegocioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.lineanegocioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			lineanegocioSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			lineanegocioSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			lineanegocioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//LineaNegocioSessionBean lineanegocioSessionBean=new LineaNegocioSessionBean();
		
		if(this.lineanegocioSessionBean==null) {
			this.lineanegocioSessionBean=new LineaNegocioSessionBean();
		}
		
		if(this.lineanegocioSessionBean.getsUltimaBusquedaLineaNegocio()!=null&&!this.lineanegocioSessionBean.getsUltimaBusquedaLineaNegocio().equals("")) {
			this.setsAccionBusqueda(lineanegocioSessionBean.getsUltimaBusquedaLineaNegocio());
			this.setiNumeroPaginacion(lineanegocioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(lineanegocioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(lineanegocioSessionBean.getcodigo());
				lineanegocioSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(lineanegocioSessionBean.getnombre());
				lineanegocioSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(lineanegocioSessionBean.getid_empresa());
				lineanegocioSessionBean.setid_empresa(-1L);
			}
		}
		
		this.lineanegocioSessionBean.setsUltimaBusquedaLineaNegocio("");
		this.lineanegocioSessionBean.setiNumeroPaginacion(LineaNegocioConstantesFunciones.INUMEROPAGINACION);
		this.lineanegocioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaLineaNegocio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioLineaNegocio() {
		this.updateBorderResaltarBusquedasFormularioLineaNegocio();
		this.updateVisibilidadBusquedasFormularioLineaNegocio();
		this.updateHabilitarBusquedasFormularioLineaNegocio();
	}
	
	public void updateBorderResaltarBusquedasFormularioLineaNegocio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasLineaNegocio.getComponents().length>0) {
	

		if(this.lineanegocioConstantesFunciones.resaltarBusquedaPorCodigoLineaNegocio!=null) {
			index= this.jTabbedPaneBusquedasLineaNegocio.indexOfComponent(this.jPanelBusquedaPorCodigoLineaNegocio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaNegocio.getComponent(index);
				jPanel.setBorder(this.lineanegocioConstantesFunciones.resaltarBusquedaPorCodigoLineaNegocio);
			}
		}

		if(this.lineanegocioConstantesFunciones.resaltarBusquedaPorNombreLineaNegocio!=null) {
			index= this.jTabbedPaneBusquedasLineaNegocio.indexOfComponent(this.jPanelBusquedaPorNombreLineaNegocio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaNegocio.getComponent(index);
				jPanel.setBorder(this.lineanegocioConstantesFunciones.resaltarBusquedaPorNombreLineaNegocio);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioLineaNegocio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasLineaNegocio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLineaNegocio.indexOfComponent(this.jPanelBusquedaPorCodigoLineaNegocio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLineaNegocio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineanegocioConstantesFunciones.mostrarBusquedaPorCodigoLineaNegocio);
			if(!this.lineanegocioConstantesFunciones.mostrarBusquedaPorCodigoLineaNegocio && index>-1) {
				this.jTabbedPaneBusquedasLineaNegocio.remove(index);
			}

			index= this.jTabbedPaneBusquedasLineaNegocio.indexOfComponent(this.jPanelBusquedaPorNombreLineaNegocio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLineaNegocio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineanegocioConstantesFunciones.mostrarBusquedaPorNombreLineaNegocio);
			if(!this.lineanegocioConstantesFunciones.mostrarBusquedaPorNombreLineaNegocio && index>-1) {
				this.jTabbedPaneBusquedasLineaNegocio.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioLineaNegocio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasLineaNegocio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLineaNegocio.indexOfComponent(this.jPanelBusquedaPorCodigoLineaNegocio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLineaNegocio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineanegocioConstantesFunciones.activarBusquedaPorCodigoLineaNegocio);
				this.jTabbedPaneBusquedasLineaNegocio.setEnabledAt(index,this.lineanegocioConstantesFunciones.activarBusquedaPorCodigoLineaNegocio);
			}

			index= this.jTabbedPaneBusquedasLineaNegocio.indexOfComponent(this.jPanelBusquedaPorNombreLineaNegocio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLineaNegocio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineanegocioConstantesFunciones.activarBusquedaPorNombreLineaNegocio);
				this.jTabbedPaneBusquedasLineaNegocio.setEnabledAt(index,this.lineanegocioConstantesFunciones.activarBusquedaPorNombreLineaNegocio);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaLineaNegocio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasLineaNegocio.indexOfComponent(this.jPanelBusquedaPorCodigoLineaNegocio);

			this.jTabbedPaneBusquedasLineaNegocio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaNegocio.getComponent(index);

			this.lineanegocioConstantesFunciones.setResaltarBusquedaPorCodigoLineaNegocio(resaltar);

			jPanel.setBorder(this.lineanegocioConstantesFunciones.resaltarBusquedaPorCodigoLineaNegocio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasLineaNegocio.indexOfComponent(this.jPanelBusquedaPorNombreLineaNegocio);

			this.jTabbedPaneBusquedasLineaNegocio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaNegocio.getComponent(index);

			this.lineanegocioConstantesFunciones.setResaltarBusquedaPorNombreLineaNegocio(resaltar);

			jPanel.setBorder(this.lineanegocioConstantesFunciones.resaltarBusquedaPorNombreLineaNegocio);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarLineaNegocio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioLineaNegocio() throws Exception {

		if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioLineaNegocio();
		this.updateVisibilidadResaltarControlesFormularioLineaNegocio();
		this.updateHabilitarResaltarControlesFormularioLineaNegocio();
		
	}
	
	public void updateBorderResaltarControlesFormularioLineaNegocio() throws Exception {
		if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.lineanegocioConstantesFunciones.resaltaridLineaNegocio!=null && this.jInternalFrameDetalleFormLineaNegocio!=null) {this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.setBorder(this.lineanegocioConstantesFunciones.resaltaridLineaNegocio);}
		if(this.lineanegocioConstantesFunciones.resaltarid_empresaLineaNegocio!=null && this.jInternalFrameDetalleFormLineaNegocio!=null) {this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.setBorder(this.lineanegocioConstantesFunciones.resaltarid_empresaLineaNegocio);}
		if(this.lineanegocioConstantesFunciones.resaltarcodigoLineaNegocio!=null && this.jInternalFrameDetalleFormLineaNegocio!=null) {this.jInternalFrameDetalleFormLineaNegocio.jTextFieldcodigoLineaNegocio.setBorder(this.lineanegocioConstantesFunciones.resaltarcodigoLineaNegocio);}
		if(this.lineanegocioConstantesFunciones.resaltarnombreLineaNegocio!=null && this.jInternalFrameDetalleFormLineaNegocio!=null) {this.jInternalFrameDetalleFormLineaNegocio.jTextAreanombreLineaNegocio.setBorder(this.lineanegocioConstantesFunciones.resaltarnombreLineaNegocio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioLineaNegocio() throws Exception {		
		if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
	
		//this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.setVisible(this.lineanegocioConstantesFunciones.mostraridLineaNegocio);
		this.jInternalFrameDetalleFormLineaNegocio.jPanelidLineaNegocio.setVisible(this.lineanegocioConstantesFunciones.mostraridLineaNegocio);
		//this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.setVisible(this.lineanegocioConstantesFunciones.mostrarid_empresaLineaNegocio);
		this.jInternalFrameDetalleFormLineaNegocio.jPanelid_empresaLineaNegocio.setVisible(this.lineanegocioConstantesFunciones.mostrarid_empresaLineaNegocio);
		//this.jInternalFrameDetalleFormLineaNegocio.jTextFieldcodigoLineaNegocio.setVisible(this.lineanegocioConstantesFunciones.mostrarcodigoLineaNegocio);
		this.jInternalFrameDetalleFormLineaNegocio.jPanelcodigoLineaNegocio.setVisible(this.lineanegocioConstantesFunciones.mostrarcodigoLineaNegocio);
		//this.jInternalFrameDetalleFormLineaNegocio.jTextAreanombreLineaNegocio.setVisible(this.lineanegocioConstantesFunciones.mostrarnombreLineaNegocio);
		this.jInternalFrameDetalleFormLineaNegocio.jPanelnombreLineaNegocio.setVisible(this.lineanegocioConstantesFunciones.mostrarnombreLineaNegocio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioLineaNegocio() throws Exception {
		if(this.jInternalFrameDetalleFormLineaNegocio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLineaNegocio!=null) {
	
		this.jInternalFrameDetalleFormLineaNegocio.jLabelidLineaNegocio.setEnabled(this.lineanegocioConstantesFunciones.activaridLineaNegocio);
		this.jInternalFrameDetalleFormLineaNegocio.jComboBoxid_empresaLineaNegocio.setEnabled(this.lineanegocioConstantesFunciones.activarid_empresaLineaNegocio);
		this.jInternalFrameDetalleFormLineaNegocio.jTextFieldcodigoLineaNegocio.setEnabled(this.lineanegocioConstantesFunciones.activarcodigoLineaNegocio);
		this.jInternalFrameDetalleFormLineaNegocio.jTextAreanombreLineaNegocio.setEnabled(this.lineanegocioConstantesFunciones.activarnombreLineaNegocio);
		}
	}
	
		
}