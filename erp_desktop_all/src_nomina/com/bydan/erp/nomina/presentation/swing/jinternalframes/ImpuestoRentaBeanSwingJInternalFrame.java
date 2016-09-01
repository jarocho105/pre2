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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.ImpuestoRentaConstantesFunciones;
import com.bydan.erp.nomina.util.ImpuestoRentaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.ImpuestoRentaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.ImpuestoRentaBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class ImpuestoRentaBeanSwingJInternalFrame extends ImpuestoRentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ImpuestoRentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ImpuestoRenta> impuestorentaValidator = new ClassValidator<ImpuestoRenta>(ImpuestoRenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ImpuestoRenta impuestorenta;	
	public ImpuestoRenta impuestorentaAux;
	public ImpuestoRenta impuestorentaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ImpuestoRenta impuestorentaTotales;
	public Long idImpuestoRentaActual;
	public Long iIdNuevoImpuestoRenta=0L;
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
	
	public Boolean isPermisoTodoImpuestoRenta;
	public Boolean isPermisoNuevoImpuestoRenta;
	public Boolean isPermisoActualizarImpuestoRenta;
	public Boolean isPermisoActualizarOriginalImpuestoRenta;
	public Boolean isPermisoEliminarImpuestoRenta;
	public Boolean isPermisoGuardarCambiosImpuestoRenta;
	public Boolean isPermisoConsultaImpuestoRenta;
	public Boolean isPermisoBusquedaImpuestoRenta;
	public Boolean isPermisoReporteImpuestoRenta;
	public Boolean isPermisoPaginacionMedioImpuestoRenta;
	public Boolean isPermisoPaginacionAltoImpuestoRenta;
	public Boolean isPermisoPaginacionTodoImpuestoRenta;
	public Boolean isPermisoCopiarImpuestoRenta;
	public Boolean isPermisoVerFormImpuestoRenta;
	public Boolean isPermisoDuplicarImpuestoRenta;
	public Boolean isPermisoOrdenImpuestoRenta;
	
	
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
	
	public ImpuestoRentaParameterReturnGeneral impuestorentaReturnGeneral;
	public ImpuestoRentaParameterReturnGeneral impuestorentaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoImpuestoRenta=false;
	public Boolean esParaAccionDesdeFormularioImpuestoRenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ImpuestoRentaSessionBeanAdditional impuestorentaSessionBeanAdditional=null;
	
	public ImpuestoRentaSessionBeanAdditional getImpuestoRentaSessionBeanAdditional() {
		return this.impuestorentaSessionBeanAdditional;
	}
	
	public void setImpuestoRentaSessionBeanAdditional(ImpuestoRentaSessionBeanAdditional impuestorentaSessionBeanAdditional) {
		try {
			this.impuestorentaSessionBeanAdditional=impuestorentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ImpuestoRentaBeanSwingJInternalFrameAdditional impuestorentaBeanSwingJInternalFrameAdditional=null;
	//public class ImpuestoRentaBeanSwingJInternalFrame
	
	public ImpuestoRentaBeanSwingJInternalFrameAdditional getImpuestoRentaBeanSwingJInternalFrameAdditional() {
		return this.impuestorentaBeanSwingJInternalFrameAdditional;
	}
	
	public void setImpuestoRentaBeanSwingJInternalFrameAdditional(ImpuestoRentaBeanSwingJInternalFrameAdditional impuestorentaBeanSwingJInternalFrameAdditional) {
		try {
			this.impuestorentaBeanSwingJInternalFrameAdditional=impuestorentaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ImpuestoRentaLogic impuestorentaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ImpuestoRenta impuestorentaBean;
	public ImpuestoRentaConstantesFunciones impuestorentaConstantesFunciones;
	//public ImpuestoRentaParameterReturnGeneral impuestorentaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ImpuestoRenta> impuestorentas;	
	//public List<ImpuestoRenta> impuestorentasEliminados;
	//public List<ImpuestoRenta> impuestorentasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaDuplicarImpuestoRenta=true;
	public Boolean isVisibilidadCeldaCopiarImpuestoRenta=true;
	public Boolean isVisibilidadCeldaVerFormImpuestoRenta=true;
	public Boolean isVisibilidadCeldaOrdenImpuestoRenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesImpuestoRenta=false;
	public Boolean isVisibilidadCeldaModificarImpuestoRenta=false;
	public Boolean isVisibilidadCeldaActualizarImpuestoRenta=false;
	public Boolean isVisibilidadCeldaEliminarImpuestoRenta=false;
	public Boolean isVisibilidadCeldaCancelarImpuestoRenta=false;
	public Boolean isVisibilidadCeldaGuardarImpuestoRenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosImpuestoRenta=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoImpuestoRenta() {
		return this.iIdNuevoImpuestoRenta;
	}

	public void setiIdNuevoImpuestoRenta(Long iIdNuevoImpuestoRenta) {
		this.iIdNuevoImpuestoRenta = iIdNuevoImpuestoRenta;
	}
	
	public Long getidImpuestoRentaActual() {
		return this.idImpuestoRentaActual;
	}

	public void setidImpuestoRentaActual(Long idImpuestoRentaActual) {
		this.idImpuestoRentaActual = idImpuestoRentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ImpuestoRenta getimpuestorenta() {
		return this.impuestorenta;
	}

	public void setimpuestorenta(ImpuestoRenta impuestorenta) {
		this.impuestorenta = impuestorenta;
	}
	
	public ImpuestoRenta getimpuestorentaAux() {
		return this.impuestorentaAux;
	}

	public void setimpuestorentaAux(ImpuestoRenta impuestorentaAux) {
		this.impuestorentaAux = impuestorentaAux;
	}				
	
	public ImpuestoRenta getimpuestorentaAnterior() {
		return this.impuestorentaAnterior;
	}

	public void setimpuestorentaAnterior(ImpuestoRenta impuestorentaAnterior) {
		this.impuestorentaAnterior = impuestorentaAnterior;
	}	
	
	public ImpuestoRenta getimpuestorentaTotales() {
		return this.impuestorentaTotales;
	}

	public void setimpuestorentaTotales(ImpuestoRenta impuestorentaTotales) {
		this.impuestorentaTotales = impuestorentaTotales;
	}	
	
	public ImpuestoRenta getimpuestorentaBean() {
		return this.impuestorentaBean;
	}

	public void setimpuestorentaBean(ImpuestoRenta impuestorentaBean) {
		this.impuestorentaBean = impuestorentaBean;
	}	
	
	public ImpuestoRentaParameterReturnGeneral getimpuestorentaReturnGeneral() {
		return this.impuestorentaReturnGeneral;
	}

	public void setimpuestorentaReturnGeneral(ImpuestoRentaParameterReturnGeneral impuestorentaReturnGeneral) {
		this.impuestorentaReturnGeneral = impuestorentaReturnGeneral;
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
	
	
	public ImpuestoRentaLogic getImpuestoRentaLogic()	{		
		return impuestorentaLogic;
	}

	public void setImpuestoRentaLogic(ImpuestoRentaLogic impuestorentaLogic) {
		this.impuestorentaLogic = impuestorentaLogic;
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
	
	public Boolean getIsEsNuevoImpuestoRenta() {
		return isEsNuevoImpuestoRenta;
	}

	public void setIsEsNuevoImpuestoRenta(Boolean isEsNuevoImpuestoRenta) {
		this.isEsNuevoImpuestoRenta = isEsNuevoImpuestoRenta;
	}

	public Boolean getEsParaAccionDesdeFormularioImpuestoRenta() {
		return esParaAccionDesdeFormularioImpuestoRenta;
	}
	
	public void setEsParaAccionDesdeFormularioImpuestoRenta(Boolean esParaAccionDesdeFormularioImpuestoRenta) {
		this.esParaAccionDesdeFormularioImpuestoRenta = esParaAccionDesdeFormularioImpuestoRenta;
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

			if(this.impuestorentaSessionBean==null) {
				this.impuestorentaSessionBean=new ImpuestoRentaSessionBean();
			}

			if(!this.impuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(impuestorentaSessionBean.getlidEmpresaActual());
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

					if(this.impuestorenta!=null) {
						this.impuestorenta.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
						this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaImpuestoRenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
						if(this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaImpuestoRentaGenerico)throws Exception
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
				jComboBoxid_empresaImpuestoRentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaImpuestoRentaGenerico!=null && jComboBoxid_empresaImpuestoRentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaImpuestoRentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ImpuestoRenta impuestorenta,JComboBox jComboBoxid_empresaImpuestoRentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaImpuestoRentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaImpuestoRentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				impuestorenta.setid_empresa(empresaAux.getId());
				impuestorenta.setempresa_descripcion(ImpuestoRentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				impuestorenta.setEmpresa(empresaAux);			}
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

					if(!ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { 
							this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { 
					}

					if(!ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesImpuestoRenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ImpuestoRentaConstantesFunciones.refrescarForeignKeysDescripcionesImpuestoRenta(this.impuestorentaLogic.getImpuestoRentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ImpuestoRentaConstantesFunciones.refrescarForeignKeysDescripcionesImpuestoRenta(this.impuestorentas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//impuestorentaLogic.setImpuestoRentas(this.impuestorentas);
			impuestorentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ImpuestoRentaParameterReturnGeneral getImpuestoRentaParameterGeneral() {
		return this.impuestorentaParameterGeneral;
	}
	
	public void setImpuestoRentaParameterGeneral(ImpuestoRentaParameterReturnGeneral impuestorentaParameterGeneral) {
		this.impuestorentaParameterGeneral = impuestorentaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoImpuestoRenta() {
		return isPermisoTodoImpuestoRenta;
	}

	public void setIsPermisoTodoImpuestoRenta(Boolean isPermisoTodoImpuestoRenta) {
		this.isPermisoTodoImpuestoRenta = isPermisoTodoImpuestoRenta;
	}

	public Boolean getIsPermisoNuevoImpuestoRenta() {
		return isPermisoNuevoImpuestoRenta;
	}

	public void setIsPermisoNuevoImpuestoRenta(Boolean isPermisoNuevoImpuestoRenta) {
		this.isPermisoNuevoImpuestoRenta = isPermisoNuevoImpuestoRenta;
	}

	public Boolean getIsPermisoActualizarImpuestoRenta() {
		return isPermisoActualizarImpuestoRenta;
	}

	public void setIsPermisoActualizarImpuestoRenta(Boolean isPermisoActualizarImpuestoRenta) {
		this.isPermisoActualizarImpuestoRenta = isPermisoActualizarImpuestoRenta;
	}

	public Boolean getIsPermisoEliminarImpuestoRenta() {
		return isPermisoEliminarImpuestoRenta;
	}

	public void setIsPermisoEliminarImpuestoRenta(Boolean isPermisoEliminarImpuestoRenta) {
		this.isPermisoEliminarImpuestoRenta = isPermisoEliminarImpuestoRenta;
	}

	public Boolean getIsPermisoGuardarCambiosImpuestoRenta() {
		return isPermisoGuardarCambiosImpuestoRenta;
	}

	public void setIsPermisoGuardarCambiosImpuestoRenta(Boolean isPermisoGuardarCambiosImpuestoRenta) {
		this.isPermisoGuardarCambiosImpuestoRenta = isPermisoGuardarCambiosImpuestoRenta;
	}
	
	public Boolean getIsPermisoConsultaImpuestoRenta() {
		return isPermisoConsultaImpuestoRenta;
	}

	public void setIsPermisoConsultaImpuestoRenta(Boolean isPermisoConsultaImpuestoRenta) {
		this.isPermisoConsultaImpuestoRenta = isPermisoConsultaImpuestoRenta;
	}

	public Boolean getIsPermisoBusquedaImpuestoRenta() {
		return isPermisoBusquedaImpuestoRenta;
	}

	public void setIsPermisoBusquedaImpuestoRenta(Boolean isPermisoBusquedaImpuestoRenta) {
		this.isPermisoBusquedaImpuestoRenta = isPermisoBusquedaImpuestoRenta;
	}

	public Boolean getIsPermisoReporteImpuestoRenta() {
		return isPermisoReporteImpuestoRenta;
	}

	public void setIsPermisoReporteImpuestoRenta(Boolean isPermisoReporteImpuestoRenta) {
		this.isPermisoReporteImpuestoRenta = isPermisoReporteImpuestoRenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioImpuestoRenta() {
		return isPermisoPaginacionMedioImpuestoRenta;
	}

	public void setIsPermisoPaginacionMedioImpuestoRenta(Boolean isPermisoPaginacionMedioImpuestoRenta) {
		this.isPermisoPaginacionMedioImpuestoRenta = isPermisoPaginacionMedioImpuestoRenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoImpuestoRenta() {
		return isPermisoPaginacionTodoImpuestoRenta;
	}

	public void setIsPermisoPaginacionTodoImpuestoRenta(Boolean isPermisoPaginacionTodoImpuestoRenta) {
		this.isPermisoPaginacionTodoImpuestoRenta = isPermisoPaginacionTodoImpuestoRenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoImpuestoRenta() {
		return isPermisoPaginacionAltoImpuestoRenta;
	}

	public void setIsPermisoPaginacionAltoImpuestoRenta(Boolean isPermisoPaginacionAltoImpuestoRenta) {
		this.isPermisoPaginacionAltoImpuestoRenta = isPermisoPaginacionAltoImpuestoRenta;
	}
	
	public Boolean getIsPermisoCopiarImpuestoRenta() {
		return isPermisoCopiarImpuestoRenta;
	}

	public void setIsPermisoCopiarImpuestoRenta(Boolean isPermisoCopiarImpuestoRenta) {
		this.isPermisoCopiarImpuestoRenta = isPermisoCopiarImpuestoRenta;
	}
	
	public Boolean getIsPermisoVerFormImpuestoRenta() {
		return isPermisoVerFormImpuestoRenta;
	}

	public void setIsPermisoVerFormImpuestoRenta(Boolean isPermisoVerFormImpuestoRenta) {
		this.isPermisoVerFormImpuestoRenta = isPermisoVerFormImpuestoRenta;
	}
	
	public Boolean getIsPermisoDuplicarImpuestoRenta() {
		return isPermisoDuplicarImpuestoRenta;
	}

	public void setIsPermisoDuplicarImpuestoRenta(Boolean isPermisoDuplicarImpuestoRenta) {
		this.isPermisoDuplicarImpuestoRenta = isPermisoDuplicarImpuestoRenta;
	}
	
	public Boolean getIsPermisoOrdenImpuestoRenta() {
		return isPermisoOrdenImpuestoRenta;
	}

	public void setIsPermisoOrdenImpuestoRenta(Boolean isPermisoOrdenImpuestoRenta) {
		this.isPermisoOrdenImpuestoRenta = isPermisoOrdenImpuestoRenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoImpuestoRenta() {
		return isVisibilidadCeldaNuevoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaNuevoImpuestoRenta(Boolean isVisibilidadCeldaNuevoImpuestoRenta) {
		this.isVisibilidadCeldaNuevoImpuestoRenta = isVisibilidadCeldaNuevoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarImpuestoRenta() {
		return isVisibilidadCeldaDuplicarImpuestoRenta;
	}

	public void setIsVisibilidadCeldaDuplicarImpuestoRenta(Boolean isVisibilidadCeldaDuplicarImpuestoRenta) {
		this.isVisibilidadCeldaDuplicarImpuestoRenta = isVisibilidadCeldaDuplicarImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarImpuestoRenta() {
		return isVisibilidadCeldaCopiarImpuestoRenta;
	}

	public void setIsVisibilidadCeldaCopiarImpuestoRenta(Boolean isVisibilidadCeldaCopiarImpuestoRenta) {
		this.isVisibilidadCeldaCopiarImpuestoRenta = isVisibilidadCeldaCopiarImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormImpuestoRenta() {
		return isVisibilidadCeldaVerFormImpuestoRenta;
	}

	public void setIsVisibilidadCeldaVerFormImpuestoRenta(Boolean isVisibilidadCeldaVerFormImpuestoRenta) {
		this.isVisibilidadCeldaVerFormImpuestoRenta = isVisibilidadCeldaVerFormImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenImpuestoRenta() {
		return isVisibilidadCeldaOrdenImpuestoRenta;
	}

	public void setIsVisibilidadCeldaOrdenImpuestoRenta(Boolean isVisibilidadCeldaOrdenImpuestoRenta) {
		this.isVisibilidadCeldaOrdenImpuestoRenta = isVisibilidadCeldaOrdenImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesImpuestoRenta() {
		return isVisibilidadCeldaNuevoRelacionesImpuestoRenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesImpuestoRenta(Boolean isVisibilidadCeldaNuevoRelacionesImpuestoRenta) {
		this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta = isVisibilidadCeldaNuevoRelacionesImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarImpuestoRenta() {
		return isVisibilidadCeldaModificarImpuestoRenta;
	}

	public void setIsVisibilidadCeldaModificarImpuestoRenta(Boolean isVisibilidadCeldaModificarImpuestoRenta) {
		this.isVisibilidadCeldaModificarImpuestoRenta = isVisibilidadCeldaModificarImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarImpuestoRenta() {
		return isVisibilidadCeldaActualizarImpuestoRenta;
	}

	public void setIsVisibilidadCeldaActualizarImpuestoRenta(Boolean isVisibilidadCeldaActualizarImpuestoRenta) {
		this.isVisibilidadCeldaActualizarImpuestoRenta = isVisibilidadCeldaActualizarImpuestoRenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarImpuestoRenta() {
		return isVisibilidadCeldaEliminarImpuestoRenta;
	}

	public void setIsVisibilidadCeldaEliminarImpuestoRenta(Boolean isVisibilidadCeldaEliminarImpuestoRenta) {
		this.isVisibilidadCeldaEliminarImpuestoRenta = isVisibilidadCeldaEliminarImpuestoRenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarImpuestoRenta() {
		return isVisibilidadCeldaCancelarImpuestoRenta;
	}

	public void setIsVisibilidadCeldaCancelarImpuestoRenta(Boolean isVisibilidadCeldaCancelarImpuestoRenta) {
		this.isVisibilidadCeldaCancelarImpuestoRenta = isVisibilidadCeldaCancelarImpuestoRenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarImpuestoRenta() {
		return isVisibilidadCeldaGuardarImpuestoRenta;
	}

	public void setIsVisibilidadCeldaGuardarImpuestoRenta(Boolean isVisibilidadCeldaGuardarImpuestoRenta) {
		this.isVisibilidadCeldaGuardarImpuestoRenta = isVisibilidadCeldaGuardarImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosImpuestoRenta() {
		return isVisibilidadCeldaGuardarCambiosImpuestoRenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosImpuestoRenta(Boolean isVisibilidadCeldaGuardarCambiosImpuestoRenta) {
		this.isVisibilidadCeldaGuardarCambiosImpuestoRenta = isVisibilidadCeldaGuardarCambiosImpuestoRenta;
	}
		
	public ImpuestoRentaSessionBean getimpuestorentaSessionBean() {
		return this.impuestorentaSessionBean;
	}
	
	public void setimpuestorentaSessionBean(ImpuestoRentaSessionBean impuestorentaSessionBean) {
		this.impuestorentaSessionBean=impuestorentaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(ImpuestoRenta impuestorenta)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(impuestorenta,null);
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
	
	public void bugActualizarReferenciaActual(ImpuestoRenta impuestorenta,ImpuestoRenta impuestorentaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalImpuestoRenta(impuestorenta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		impuestorentaAux.setId(impuestorenta.getId());
		impuestorentaAux.setVersionRow(impuestorenta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessImpuestoRenta();
		
			int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = impuestorentaValidator.getInvalidValues(this.impuestorenta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			impuestorentaLogic.setDatosCliente(datosCliente);
			impuestorentaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				impuestorentaAux=new  ImpuestoRenta();
				
				impuestorentaAux.setIsNew(true);
				impuestorentaAux.setIsChanged(true);
				
				impuestorentaAux.setImpuestoRentaOriginal(this.impuestorenta);
				
				impuestorentaAux.setId(this.impuestorenta.getId());	
				impuestorentaAux.setVersionRow(this.impuestorenta.getVersionRow());	
				impuestorentaAux.setid_empresa(this.impuestorenta.getid_empresa());	
				impuestorentaAux.setdesde(this.impuestorenta.getdesde());	
				impuestorentaAux.sethasta(this.impuestorenta.gethasta());	
				impuestorentaAux.setimpuesto(this.impuestorenta.getimpuesto());	
				impuestorentaAux.setporcentaje(this.impuestorenta.getporcentaje());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.impuestorentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.impuestorentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(impuestorentaAux,impuestorentaLogic.getImpuestoRentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(impuestorentaAux,impuestorentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.impuestorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.impuestorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestorentaLogic.saveImpuestoRentas();//WithConnection
						//impuestorentaLogic.getSetVersionRowImpuestoRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.impuestorenta,impuestorentaAux);
					
					this.refrescarForeignKeysDescripcionesImpuestoRenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.impuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								impuestorentaLogic.saveImpuestoRentaRelaciones(impuestorentaAux);//WithConnection
								//impuestorentaLogic.getSetVersionRowImpuestoRentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.impuestorenta,impuestorentaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.impuestorentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.impuestorentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(impuestorentaAux,impuestorentaLogic.getImpuestoRentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(impuestorentaAux,impuestorentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.impuestorenta,impuestorentaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				impuestorentaAux=new  ImpuestoRenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.impuestorentaSessionBean.getEsGuardarRelacionado() 
					|| (this.impuestorentaSessionBean.getEsGuardarRelacionado() && this.impuestorenta.getId()>=0)) {
						
					impuestorentaAux.setIsNew(false);
				}
				
				impuestorentaAux.setIsDeleted(false);
			
				impuestorentaAux.setId(this.impuestorenta.getId());	
				impuestorentaAux.setVersionRow(this.impuestorenta.getVersionRow());	
				impuestorentaAux.setid_empresa(this.impuestorenta.getid_empresa());	
				impuestorentaAux.setdesde(this.impuestorenta.getdesde());	
				impuestorentaAux.sethasta(this.impuestorenta.gethasta());	
				impuestorentaAux.setimpuesto(this.impuestorenta.getimpuesto());	
				impuestorentaAux.setporcentaje(this.impuestorenta.getporcentaje());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(impuestorentaAux,impuestorentaLogic.getImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(impuestorentaAux,impuestorentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.impuestorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.impuestorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestorentaLogic.saveImpuestoRentas();//WithConnection
						//impuestorentaLogic.getSetVersionRowImpuestoRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.impuestorenta,impuestorentaAux);
					
					this.refrescarForeignKeysDescripcionesImpuestoRenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.impuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								impuestorentaLogic.saveImpuestoRentaRelaciones(impuestorentaAux);//WithConnection
								//impuestorentaLogic.getSetVersionRowImpuestoRentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.impuestorenta,impuestorentaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.impuestorentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.impuestorentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(impuestorentaAux,impuestorentaLogic.getImpuestoRentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(impuestorentaAux,impuestorentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.impuestorenta,impuestorentaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				impuestorentaAux=new  ImpuestoRenta();
				
				impuestorentaAux.setIsNew(false);
				impuestorentaAux.setIsChanged(false);
				
				impuestorentaAux.setIsDeleted(true);
				
				impuestorentaAux.setId(this.impuestorenta.getId());	
				impuestorentaAux.setVersionRow(this.impuestorenta.getVersionRow());	
				impuestorentaAux.setid_empresa(this.impuestorenta.getid_empresa());	
				impuestorentaAux.setdesde(this.impuestorenta.getdesde());	
				impuestorentaAux.sethasta(this.impuestorenta.gethasta());	
				impuestorentaAux.setimpuesto(this.impuestorenta.getimpuesto());	
				impuestorentaAux.setporcentaje(this.impuestorenta.getporcentaje());	
				
				if(this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.impuestorentaAux.getId()>=0) {	
						this.impuestorentasEliminados.add(impuestorentaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(impuestorentaAux,impuestorentaLogic.getImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(impuestorentaAux,impuestorentas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.impuestorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.impuestorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestorentaLogic.saveImpuestoRentas();//WithConnection
						//impuestorentaLogic.getSetVersionRowImpuestoRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.impuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								impuestorentaLogic.saveImpuestoRentaRelaciones(impuestorentaAux);//WithConnection
								//impuestorentaLogic.getSetVersionRowImpuestoRentas();//WithConnection
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
							if(this.impuestorentaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.impuestorentaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(impuestorentaAux,impuestorentaLogic.getImpuestoRentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(impuestorentaAux,impuestorentas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.getImpuestoRentas().addAll(this.impuestorentasEliminados);
					
					impuestorentaLogic.saveImpuestoRentas();//WithConnection
					//impuestorentaLogic.getSetVersionRowImpuestoRentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesImpuestoRenta();
				
				this.impuestorentasEliminados= new ArrayList<ImpuestoRenta>();		
			}
			
			if(this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Impuesto Renta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.impuestorenta=impuestorentaAux;
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
      		//this.finishProcessImpuestoRenta();
      	}
		
	}	
	
	public void actualizarRelaciones(ImpuestoRenta impuestorentaLocal) throws Exception {
		
		if(this.impuestorentaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ImpuestoRenta impuestorentaLocal) throws Exception {	
		if(this.impuestorentaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				impuestorentaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarImpuestoRentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = impuestorentaValidator.getInvalidValues(this.impuestorenta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ImpuestoRenta impuestorenta,List<ImpuestoRenta> impuestorentas) throws Exception {
		try	{		
			ImpuestoRentaConstantesFunciones.actualizarLista(impuestorenta,impuestorentas,this.impuestorentaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ImpuestoRenta impuestorenta,List<ImpuestoRenta> impuestorentas) throws Exception {
		try	{			
			ImpuestoRentaConstantesFunciones.actualizarSelectedLista(impuestorenta,impuestorentas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ImpuestoRenta> impuestorentasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				impuestorentasLocal=this.impuestorentaLogic.getImpuestoRentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				impuestorentasLocal=this.impuestorentas;
			}
			//ARCHITECTURE
		
			for(ImpuestoRenta impuestorentaLocal:impuestorentasLocal) {
				if(this.permiteMantenimiento(impuestorentaLocal) && impuestorentaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ImpuestoRentaConstantesFunciones.getImpuestoRentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ImpuestoRentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoRenta.jLabelid_empresaImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ImpuestoRentaConstantesFunciones.DESDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoRenta.jLabeldesdeImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ImpuestoRentaConstantesFunciones.HASTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoRenta.jLabelhastaImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ImpuestoRentaConstantesFunciones.IMPUESTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoRenta.jLabelimpuestoImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ImpuestoRentaConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoRenta.jLabelporcentajeImpuestoRenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormImpuestoRenta.jLabelid_empresaImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormImpuestoRenta.jLabeldesdeImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormImpuestoRenta.jLabelhastaImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormImpuestoRenta.jLabelimpuestoImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormImpuestoRenta.jLabelporcentajeImpuestoRenta,"");
		
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
		this.iIdNuevoImpuestoRenta--;	
		
		
		this.impuestorentaAux=new ImpuestoRenta();
		
		this.impuestorentaAux.setId(this.iIdNuevoImpuestoRenta);
		this.impuestorentaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.impuestorentaLogic.getImpuestoRentas().add(this.impuestorentaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.impuestorentas.add(this.impuestorentaAux);
		}
		//ARCHITECTURE
		
		this.impuestorenta=this.impuestorentaAux;
		
		if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioImpuestoRenta(this.impuestorenta);
			this.setVariablesObjetoActualToFormularioForeignKeyImpuestoRenta(this.impuestorenta);
		}
				
		//this.setDefaultControlesImpuestoRenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyImpuestoRenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyImpuestoRenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyImpuestoRenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualImpuestoRenta(this.impuestorentaBean,this.impuestorenta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ImpuestoRentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.impuestorentaSessionBean.getConGuardarRelaciones()) {
			classes=ImpuestoRentaConstantesFunciones.getClassesRelationshipsOfImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.impuestorentaReturnGeneral=impuestorentaLogic.procesarEventosImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.impuestorentaLogic.getImpuestoRentas(),this.impuestorenta,this.impuestorentaParameterGeneral,this.isEsNuevoImpuestoRenta,classes);//this.impuestorentaLogic.getImpuestoRenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanImpuestoRenta(this.impuestorentaReturnGeneral,this.impuestorentaBean,false);
		
		if(this.impuestorentaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyImpuestoRenta(this.impuestorentaReturnGeneral.getImpuestoRenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioImpuestoRenta(this.impuestorentaReturnGeneral.getImpuestoRenta());
		}
		
		if(this.impuestorentaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioImpuestoRenta(this.impuestorentaReturnGeneral.getImpuestoRenta(),classes);//this.impuestorentaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyImpuestoRenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyImpuestoRenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.RecargarFormImpuestoRenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingImpuestoRenta(false);
						
			if(impuestorentaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualImpuestoRenta();
			}
			
			this.actualizarVisualTableDatosImpuestoRenta();
			
			this.jTableDatosImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoImpuestoRenta(), this.getIndiceNuevoImpuestoRenta());
			
			this.seleccionarFilaTablaImpuestoRentaActual();
						
			this.actualizarEstadoCeldasBotonesImpuestoRenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesImpuestoRenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormImpuestoRenta.jTextFielddesdeImpuestoRenta.setEnabled(isHabilitar && this.impuestorentaConstantesFunciones.activardesdeImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldhastaImpuestoRenta.setEnabled(isHabilitar && this.impuestorentaConstantesFunciones.activarhastaImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldimpuestoImpuestoRenta.setEnabled(isHabilitar && this.impuestorentaConstantesFunciones.activarimpuestoImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldporcentajeImpuestoRenta.setEnabled(isHabilitar && this.impuestorentaConstantesFunciones.activarporcentajeImpuestoRenta);	
		//
		this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.setEnabled(isHabilitar && this.impuestorentaConstantesFunciones.activarid_empresaImpuestoRenta);
	};
	
	public void setDefaultControlesImpuestoRenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoImpuestoRenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.impuestorentaSessionBean.setConGuardarRelaciones(true);			
			this.impuestorentaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormImpuestoRenta.jTabbedPaneRelacionesImpuestoRenta.setVisible(true);
			
					
		} else {
			//this.impuestorentaSessionBean.setConGuardarRelaciones(false);			
			this.impuestorentaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormImpuestoRenta.jTabbedPaneRelacionesImpuestoRenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoImpuestoRenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ImpuestoRenta impuestorentaAux:this.impuestorentaLogic.getImpuestoRentas()) {
				if(impuestorentaAux.getId().equals(this.iIdNuevoImpuestoRenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ImpuestoRenta impuestorentaAux:this.impuestorentas) {
				if(impuestorentaAux.getId().equals(this.iIdNuevoImpuestoRenta)) {
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
	
	public int getIndiceActualImpuestoRenta(ImpuestoRenta impuestorenta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ImpuestoRenta impuestorentaAux:this.impuestorentaLogic.getImpuestoRentas()) {
				if(impuestorentaAux.getId().equals(impuestorenta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ImpuestoRenta impuestorentaAux:this.impuestorentas) {
				if(impuestorentaAux.getId().equals(impuestorenta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalImpuestoRenta(ImpuestoRenta impuestorentaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ImpuestoRenta impuestorentaAux:this.impuestorentaLogic.getImpuestoRentas()) {
				if(impuestorentaAux.getImpuestoRentaOriginal().getId().equals(impuestorentaOriginal.getId())) {
					existe=true;
					impuestorentaOriginal.setId(impuestorentaAux.getId());
					impuestorentaOriginal.setVersionRow(impuestorentaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ImpuestoRenta impuestorentaAux:this.impuestorentas) {
				if(impuestorentaAux.getImpuestoRentaOriginal().getId().equals(impuestorentaOriginal.getId())) {
					existe=true;
					impuestorentaOriginal.setId(impuestorentaAux.getId());
					impuestorentaOriginal.setVersionRow(impuestorentaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosImpuestoRenta(Boolean esParaCancelar) throws Exception {
		impuestorentasAux=new ArrayList<ImpuestoRenta>();
		impuestorentaAux=new ImpuestoRenta();
		
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ImpuestoRenta impuestorentaAux:this.impuestorentaLogic.getImpuestoRentas()) {
					if(impuestorentaAux.getId()<0) {
						impuestorentasAux.add(impuestorentaAux);
					}		
				}
				this.iIdNuevoImpuestoRenta=0L;
				this.impuestorentaLogic.getImpuestoRentas().removeAll(impuestorentasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ImpuestoRenta impuestorentaAux:this.impuestorentas) {
					if(impuestorentaAux.getId()<0) {
						impuestorentasAux.add(impuestorentaAux);
					}		
				}
				this.iIdNuevoImpuestoRenta=0L;
				this.impuestorentas.removeAll(impuestorentasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoImpuestoRenta 
					&& this.impuestorentaLogic.getImpuestoRentas().size()>0
					) {
					impuestorentaAux=this.impuestorentaLogic.getImpuestoRentas().get(this.impuestorentaLogic.getImpuestoRentas().size() - 1);
				
					if(impuestorentaAux.getId()<0) {
						this.impuestorentaLogic.getImpuestoRentas().remove(impuestorentaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoImpuestoRenta && this.impuestorentas.size()>0) {
					impuestorentaAux=this.impuestorentas.get(this.impuestorentas.size() - 1);
				
					if(impuestorentaAux.getId()<0) {
						this.impuestorentas.remove(impuestorentaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoImpuestoRenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(impuestorenta.getId()<0) {
				this.impuestorentaLogic.getImpuestoRentas().remove(this.impuestorenta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(impuestorenta.getId()<0) {
				this.impuestorentas.remove(this.impuestorenta);
			}
		}			
	}
	
	public void setEstadosInicialesImpuestoRenta(List<ImpuestoRenta> impuestorentasAux) throws Exception {
		ImpuestoRentaConstantesFunciones.setEstadosInicialesImpuestoRenta(impuestorentasAux);
	}
	
	public void setEstadosInicialesImpuestoRenta(ImpuestoRenta impuestorentaAux) throws Exception {
		ImpuestoRentaConstantesFunciones.setEstadosInicialesImpuestoRenta(impuestorentaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarImpuestoRentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarImpuestoRentaActual()) {
				if(!this.isEsNuevoImpuestoRenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoImpuestoRenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarImpuestoRentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Impuesto Renta ?", "MANTENIMIENTO DE Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ImpuestoRenta impuestorenta) throws Exception {
		ImpuestoRentaConstantesFunciones.seleccionarAsignar(this.impuestorenta,impuestorenta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarImpuestoRenta=this.isPermisoActualizarOriginalImpuestoRenta;
			
			
			this.seleccionarAsignar(impuestorenta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ImpuestoRentaConstantesFunciones.quitarEspaciosImpuestoRenta(this.impuestorenta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesImpuestoRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.impuestorentaSessionBean.setsFuncionBusquedaRapida(this.impuestorentaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoImpuestoRenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosImpuestoRenta(esParaCancelar);				
				this.cancelarNuevoImpuestoRenta(esParaCancelar);								
			}
			
			this.impuestorenta=new ImpuestoRenta();
			
			this.inicializarImpuestoRenta();
			
			this.actualizarEstadoCeldasBotonesImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarImpuestoRenta() throws Exception {
		try {
			ImpuestoRentaConstantesFunciones.inicializarImpuestoRenta(this.impuestorenta);
			
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
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.impuestorentaLogic.getImpuestoRentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteImpuestoRentas(String sAccionBusqueda,List<ImpuestoRenta> impuestorentasParaReportes) throws Exception {
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
					sPathReporteFinal="ImpuestoRenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ImpuestoRentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ImpuestoRentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ImpuestoRenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Impuesto Rentas");		
		parameters.put("busquedapor", ImpuestoRentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceImpuestoRenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ImpuestoRentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ImpuestoRentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceImpuestoRenta=new JRBeanArrayDataSource(ImpuestoRentaJInternalFrame.TraerImpuestoRentaBeans(impuestorentasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceImpuestoRenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ImpuestoRentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ImpuestoRentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ImpuestoRentaBean.TraerImpuestoRentaBeans(impuestorentasParaReportes).toArray()));
							
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
				this.generarExcelReporteImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,impuestorentasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,impuestorentasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoImpuestoRentaActionPerformed(null);
					//this.generarExcelReporteImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,impuestorentasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,impuestorentasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,impuestorentasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,impuestorentasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteImpuestoRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ImpuestoRenta> impuestorentasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestorenta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ImpuestoRentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderImpuestoRenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ImpuestoRenta impuestorenta : impuestorentasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ImpuestoRentaConstantesFunciones.generarExcelReporteDataImpuestoRenta("NORMAL",row,workbook,impuestorenta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderImpuestoRenta(String sTipo,Row row,Workbook workbook) {
		
		ImpuestoRentaConstantesFunciones.generarExcelReporteHeaderImpuestoRenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalImpuestoRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ImpuestoRenta> impuestorentasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestorenta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ImpuestoRentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ImpuestoRenta impuestorenta : impuestorentasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ImpuestoRentaConstantesFunciones.getImpuestoRentaDescripcion(impuestorenta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(impuestorenta.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ImpuestoRentaConstantesFunciones.LABEL_DESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_DESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(impuestorenta.getdesde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ImpuestoRentaConstantesFunciones.LABEL_HASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_HASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(impuestorenta.gethasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(impuestorenta.getimpuesto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(impuestorenta.getporcentaje());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesImpuestoRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ImpuestoRenta> impuestorentasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ImpuestoRenta> impuestorentasRespaldo=null;
		
		classes=ImpuestoRentaConstantesFunciones.getClassesRelationshipsOfImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.impuestorentaLogic.setDatosCliente(this.datosCliente);
		this.impuestorentaLogic.setDatosDeep(this.datosDeep);
		this.impuestorentaLogic.setIsConDeep(true);
		
		impuestorentasRespaldo=this.impuestorentaLogic.getImpuestoRentas();
		
		this.impuestorentaLogic.setImpuestoRentas(impuestorentasParaReportes);	
		this.impuestorentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		impuestorentasParaReportes=this.impuestorentaLogic.getImpuestoRentas();
		this.impuestorentaLogic.setImpuestoRentas(impuestorentasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestorenta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ImpuestoRentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderImpuestoRenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ImpuestoRenta impuestorenta : impuestorentasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderImpuestoRenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ImpuestoRentaConstantesFunciones.generarExcelReporteDataImpuestoRenta("NORMAL",row,workbook,impuestorenta,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ImpuestoRentaConstantesFunciones.getImpuestoRentaDescripcion(impuestorenta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoImpuestoRenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessImpuestoRenta() throws Exception {		
		this.startProcessImpuestoRenta(true);
	}
	
	public void startProcessImpuestoRenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasImpuestoRenta ,this.jPanelParametrosReportesImpuestoRenta, this.jScrollPanelDatosImpuestoRenta,this.jPanelPaginacionImpuestoRenta, this.jScrollPanelDatosEdicionImpuestoRenta, this.jPanelAccionesImpuestoRenta,this.jPanelAccionesFormularioImpuestoRenta,this.jmenuBarImpuestoRenta,this.jmenuBarDetalleImpuestoRenta,this.jTtoolBarImpuestoRenta,this.jTtoolBarDetalleImpuestoRenta);		
		
		final JTabbedPane jTabbedPaneBusquedasImpuestoRenta=this.jTabbedPaneBusquedasImpuestoRenta; 
		
		final JPanel jPanelParametrosReportesImpuestoRenta=this.jPanelParametrosReportesImpuestoRenta;
		//final JScrollPane jScrollPanelDatosImpuestoRenta=this.jScrollPanelDatosImpuestoRenta;
		final JTable jTableDatosImpuestoRenta=this.jTableDatosImpuestoRenta;		
		final JPanel jPanelPaginacionImpuestoRenta=this.jPanelPaginacionImpuestoRenta;
		//final JScrollPane jScrollPanelDatosEdicionImpuestoRenta=this.jScrollPanelDatosEdicionImpuestoRenta;
		final JPanel jPanelAccionesImpuestoRenta=this.jPanelAccionesImpuestoRenta;
		
		JPanel jPanelCamposAuxiliarImpuestoRenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarImpuestoRenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			jPanelCamposAuxiliarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jPanelCamposImpuestoRenta;
			jPanelAccionesFormularioAuxiliarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jPanelAccionesFormularioImpuestoRenta;
		}
		
		final JPanel jPanelCamposImpuestoRenta=jPanelCamposAuxiliarImpuestoRenta;
		final JPanel jPanelAccionesFormularioImpuestoRenta=jPanelAccionesFormularioAuxiliarImpuestoRenta;
		
		
		final JMenuBar jmenuBarImpuestoRenta=this.jmenuBarImpuestoRenta;
		final JToolBar jTtoolBarImpuestoRenta=this.jTtoolBarImpuestoRenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarImpuestoRenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarImpuestoRenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			jmenuBarDetalleAuxiliarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jmenuBarDetalleImpuestoRenta;
			jTtoolBarDetalleAuxiliarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jTtoolBarDetalleImpuestoRenta;
		}
		
		final JMenuBar jmenuBarDetalleImpuestoRenta=jmenuBarDetalleAuxiliarImpuestoRenta;
		final JToolBar jTtoolBarDetalleImpuestoRenta=jTtoolBarDetalleAuxiliarImpuestoRenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasImpuestoRenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesImpuestoRenta;
			processRunnable.jTableDatos=jTableDatosImpuestoRenta;
			processRunnable.jPanelCampos=jPanelCamposImpuestoRenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionImpuestoRenta;
			processRunnable.jPanelAcciones=jPanelAccionesImpuestoRenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioImpuestoRenta;
			
			
			processRunnable.jmenuBar=jmenuBarImpuestoRenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleImpuestoRenta;
			processRunnable.jTtoolBar=jTtoolBarImpuestoRenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleImpuestoRenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasImpuestoRenta ,jPanelParametrosReportesImpuestoRenta,jTableDatosImpuestoRenta, /*jScrollPanelDatosImpuestoRenta,*/jPanelCamposImpuestoRenta,jPanelPaginacionImpuestoRenta, /*jScrollPanelDatosEdicionImpuestoRenta,*/ jPanelAccionesImpuestoRenta,jPanelAccionesFormularioImpuestoRenta,jmenuBarImpuestoRenta,jmenuBarDetalleImpuestoRenta,jTtoolBarImpuestoRenta,jTtoolBarDetalleImpuestoRenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasImpuestoRenta ,jPanelParametrosReportesImpuestoRenta, jScrollPanelDatosImpuestoRenta,jPanelPaginacionImpuestoRenta, jScrollPanelDatosEdicionImpuestoRenta, jPanelAccionesImpuestoRenta,jPanelAccionesFormularioImpuestoRenta,jmenuBarImpuestoRenta,jmenuBarDetalleImpuestoRenta,jTtoolBarImpuestoRenta,jTtoolBarDetalleImpuestoRenta);
						
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
	
	public void finishProcessImpuestoRenta() {// throws Exception 
		this.finishProcessImpuestoRenta(true);
	}
	
	public void finishProcessImpuestoRenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasImpuestoRenta ,this.jPanelParametrosReportesImpuestoRenta, this.jScrollPanelDatosImpuestoRenta,this.jPanelPaginacionImpuestoRenta, this.jScrollPanelDatosEdicionImpuestoRenta, this.jPanelAccionesImpuestoRenta,this.jPanelAccionesFormularioImpuestoRenta,this.jmenuBarImpuestoRenta,this.jmenuBarDetalleImpuestoRenta,this.jTtoolBarImpuestoRenta,this.jTtoolBarDetalleImpuestoRenta);		
		
		final JTabbedPane jTabbedPaneBusquedasImpuestoRenta=this.jTabbedPaneBusquedasImpuestoRenta; 
		
		final JPanel jPanelParametrosReportesImpuestoRenta=this.jPanelParametrosReportesImpuestoRenta;
		//final JScrollPane jScrollPanelDatosImpuestoRenta=this.jScrollPanelDatosImpuestoRenta;
		final JTable jTableDatosImpuestoRenta=this.jTableDatosImpuestoRenta;		
		final JPanel jPanelPaginacionImpuestoRenta=this.jPanelPaginacionImpuestoRenta;
		//final JScrollPane jScrollPanelDatosEdicionImpuestoRenta=this.jScrollPanelDatosEdicionImpuestoRenta;
		final JPanel jPanelAccionesImpuestoRenta=this.jPanelAccionesImpuestoRenta;
		
		JPanel jPanelCamposAuxiliarImpuestoRenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarImpuestoRenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			jPanelCamposAuxiliarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jPanelCamposImpuestoRenta;
			jPanelAccionesFormularioAuxiliarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jPanelAccionesFormularioImpuestoRenta;
		}
		
		final JPanel jPanelCamposImpuestoRenta=jPanelCamposAuxiliarImpuestoRenta;
		final JPanel jPanelAccionesFormularioImpuestoRenta=jPanelAccionesFormularioAuxiliarImpuestoRenta;
		
		
		final JMenuBar jmenuBarImpuestoRenta=this.jmenuBarImpuestoRenta;		
		final JToolBar jTtoolBarImpuestoRenta=this.jTtoolBarImpuestoRenta;
				
		JMenuBar jmenuBarDetalleAuxiliarImpuestoRenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarImpuestoRenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			jmenuBarDetalleAuxiliarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jmenuBarDetalleImpuestoRenta;
			jTtoolBarDetalleAuxiliarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jTtoolBarDetalleImpuestoRenta;		
		}
		
		final JMenuBar jmenuBarDetalleImpuestoRenta=jmenuBarDetalleAuxiliarImpuestoRenta;
		final JToolBar jTtoolBarDetalleImpuestoRenta=jTtoolBarDetalleAuxiliarImpuestoRenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasImpuestoRenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesImpuestoRenta;
			processRunnable.jTableDatos=jTableDatosImpuestoRenta;
			processRunnable.jPanelCampos=jPanelCamposImpuestoRenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionImpuestoRenta;
			processRunnable.jPanelAcciones=jPanelAccionesImpuestoRenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioImpuestoRenta;
			
			
			processRunnable.jmenuBar=jmenuBarImpuestoRenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleImpuestoRenta;
			processRunnable.jTtoolBar=jTtoolBarImpuestoRenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleImpuestoRenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasImpuestoRenta ,jPanelParametrosReportesImpuestoRenta, jTableDatosImpuestoRenta,/*jScrollPanelDatosImpuestoRenta,*/jPanelCamposImpuestoRenta,jPanelPaginacionImpuestoRenta, /*jScrollPanelDatosEdicionImpuestoRenta,*/ jPanelAccionesImpuestoRenta,jPanelAccionesFormularioImpuestoRenta,jmenuBarImpuestoRenta,jmenuBarDetalleImpuestoRenta,jTtoolBarImpuestoRenta,jTtoolBarDetalleImpuestoRenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesImpuestoRenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarImpuestoRenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuImpuestoRenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarImpuestoRenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarImpuestoRenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleImpuestoRenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuImpuestoRenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarImpuestoRenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleImpuestoRenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.impuestorentaConstantesFunciones.getsFinalQueryImpuestoRenta();
		String  finalQueryPaginacionTodos=this.impuestorentaConstantesFunciones.getsFinalQueryImpuestoRenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ImpuestoRentaConstantesFunciones.getArrayColumnasGlobalesNoImpuestoRenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ImpuestoRentaConstantesFunciones.getArrayColumnasGlobalesImpuestoRenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ImpuestoRentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.impuestorentasEliminados= new ArrayList<ImpuestoRenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessImpuestoRenta();
		
				///*ImpuestoRentaSessionBean*/this.impuestorentaSessionBean=new ImpuestoRentaSessionBean();
			
			if(this.impuestorentaSessionBean==null) {
				this.impuestorentaSessionBean=new ImpuestoRentaSessionBean();
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
					this.iNumeroPaginacion=ImpuestoRentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ImpuestoRentaConstantesFunciones.getClassesForeignKeysOfImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/impuestorenta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			impuestorentasAux= new ArrayList<ImpuestoRenta>();
			
				
			impuestorentaLogic.setDatosCliente(this.datosCliente);
			impuestorentaLogic.setDatosDeep(this.datosDeep);
			impuestorentaLogic.setIsConDeep(true);
			
			
			impuestorentaLogic.getImpuestoRentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					impuestorentaLogic.getTodosImpuestoRentas(finalQueryGlobal,pagination);
					
					//impuestorentaLogic.getTodosImpuestoRentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(impuestorentaLogic.getImpuestoRentas()==null|| impuestorentaLogic.getImpuestoRentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							impuestorentasAux= new ArrayList<ImpuestoRenta>();
							impuestorentasAux.addAll(impuestorentaLogic.getImpuestoRentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestorentasAux= new ArrayList<ImpuestoRenta>();
							impuestorentasAux.addAll(impuestorentas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							impuestorentaLogic.getTodosImpuestoRentas(finalQueryGlobal+"",this.pagination);												
							
							//impuestorentaLogic.getTodosImpuestoRentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteImpuestoRentas("Todos",impuestorentaLogic.getImpuestoRentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							impuestorentaLogic.setImpuestoRentas(new ArrayList<ImpuestoRenta>());					
							impuestorentaLogic.getImpuestoRentas().addAll(impuestorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestorentas=new ArrayList<ImpuestoRenta>();
							impuestorentas.addAll(impuestorentasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idImpuestoRenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idImpuestoRenta=this.idActual;
				
				} else if(this.idImpuestoRentaActual!=null && this.idImpuestoRentaActual!=0L) {
					idImpuestoRenta=idImpuestoRentaActual;
				}
				
					
				this.sDetalleReporte=ImpuestoRentaConstantesFunciones.getDetalleIndicePorId(idImpuestoRenta);
				
				this.impuestorentas=new ArrayList<ImpuestoRenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					impuestorentaLogic.getEntity(idImpuestoRenta);
					
					//impuestorentaLogic.getEntityWithConnection(idImpuestoRenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					impuestorentaLogic.setImpuestoRentas(new ArrayList<ImpuestoRenta>());
					impuestorentaLogic.getImpuestoRentas().add(impuestorentaLogic.getImpuestoRenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.impuestorentas=new ArrayList<ImpuestoRenta>();
					this.impuestorentas.add(impuestorenta);
				}
				
				if(impuestorentaLogic.getImpuestoRenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					impuestorentaLogic.getImpuestoRentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=impuestorentaLogic.getImpuestoRentas()==null||impuestorentaLogic.getImpuestoRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=impuestorentas==null|| impuestorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestorentasAux=new ArrayList<ImpuestoRenta>();
						impuestorentasAux.addAll(impuestorentaLogic.getImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestorentasAux=new ArrayList<ImpuestoRenta>();
							impuestorentasAux.addAll(impuestorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							impuestorentaLogic.getImpuestoRentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteImpuestoRentas("FK_IdEmpresa",impuestorentaLogic.getImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteImpuestoRentas("FK_IdEmpresa",impuestorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestorentaLogic.setImpuestoRentas(new ArrayList<ImpuestoRenta>());
						impuestorentaLogic.getImpuestoRentas().addAll(impuestorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestorentas=new ArrayList<ImpuestoRenta>();
							impuestorentas.addAll(impuestorentasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesImpuestoRenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessImpuestoRenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=impuestorentaLogic.getImpuestoRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=impuestorentas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=impuestorentaLogic.getImpuestoRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=impuestorentas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ImpuestoRenta impuestorenta) {
		Boolean permite=true;
		
		if(this.impuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ImpuestoRentaConstantesFunciones.getOrderByListaImpuestoRenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ImpuestoRentaConstantesFunciones.getOrderByListaImpuestoRenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ImpuestoRenta impuestorenta:impuestorentaLogic.getImpuestoRentas()) {
				if(impuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					impuestorentaTotales=impuestorenta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ImpuestoRenta impuestorenta:this.impuestorentas) {
				if(impuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					impuestorentaTotales=impuestorenta;
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
			this.impuestorentaAux=new ImpuestoRenta();
			this.impuestorentaAux.setsType(Constantes2.S_TOTALES);
			this.impuestorentaAux.setIsNew(false);
			this.impuestorentaAux.setIsChanged(false);
			this.impuestorentaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ImpuestoRentaConstantesFunciones.TotalizarValoresFilaImpuestoRenta(this.impuestorentaLogic.getImpuestoRentas(),this.impuestorentaAux);
				
				this.impuestorentaLogic.getImpuestoRentas().add(this.impuestorentaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ImpuestoRentaConstantesFunciones.TotalizarValoresFilaImpuestoRenta(this.impuestorentas,this.impuestorentaAux);
				
				this.impuestorentas.add(this.impuestorentaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		impuestorentaTotales=new ImpuestoRenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.impuestorentaLogic.getImpuestoRentas().remove(impuestorentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.impuestorentas.remove(impuestorentaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		impuestorentaTotales=new ImpuestoRenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ImpuestoRenta impuestorenta:impuestorentaLogic.getImpuestoRentas()) {
				if(impuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					impuestorentaTotales=impuestorenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ImpuestoRentaConstantesFunciones.TotalizarValoresFilaImpuestoRenta(this.impuestorentaLogic.getImpuestoRentas(),impuestorentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ImpuestoRenta impuestorenta:this.impuestorentas) {
				if(impuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					impuestorentaTotales=impuestorenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ImpuestoRentaConstantesFunciones.TotalizarValoresFilaImpuestoRenta(this.impuestorentas,impuestorentaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getImpuestoRentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getImpuestoRentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					impuestorentaLogic.getImpuestoRentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosImpuestoRenta() {
		this.isPermisoTodoImpuestoRenta=false;
		this.isPermisoNuevoImpuestoRenta=false;
		this.isPermisoActualizarImpuestoRenta=false;
		this.isPermisoActualizarOriginalImpuestoRenta=false;
		this.isPermisoEliminarImpuestoRenta=false;
		this.isPermisoGuardarCambiosImpuestoRenta=false;
		this.isPermisoConsultaImpuestoRenta=false;
		this.isPermisoBusquedaImpuestoRenta=false;
		this.isPermisoReporteImpuestoRenta=false;		
		this.isPermisoOrdenImpuestoRenta=false;		
		this.isPermisoPaginacionMedioImpuestoRenta=false;		
		this.isPermisoPaginacionAltoImpuestoRenta=false;
		this.isPermisoPaginacionTodoImpuestoRenta=false;
		this.isPermisoCopiarImpuestoRenta=false;		
		this.isPermisoVerFormImpuestoRenta=false;		
		this.isPermisoDuplicarImpuestoRenta=false;		
		this.isPermisoOrdenImpuestoRenta=false;		
	}
	
	public void setPermisosUsuarioImpuestoRenta(Boolean isPermiso) {
		this.isPermisoTodoImpuestoRenta=isPermiso;
		this.isPermisoNuevoImpuestoRenta=isPermiso;
		this.isPermisoActualizarImpuestoRenta=isPermiso;
		this.isPermisoActualizarOriginalImpuestoRenta=isPermiso;
		this.isPermisoEliminarImpuestoRenta=isPermiso;
		this.isPermisoGuardarCambiosImpuestoRenta=isPermiso;
		this.isPermisoConsultaImpuestoRenta=isPermiso;
		this.isPermisoBusquedaImpuestoRenta=isPermiso;
		this.isPermisoReporteImpuestoRenta=isPermiso;
		this.isPermisoOrdenImpuestoRenta=isPermiso;		
		this.isPermisoPaginacionMedioImpuestoRenta=isPermiso;		
		this.isPermisoPaginacionAltoImpuestoRenta=isPermiso;		
		this.isPermisoPaginacionTodoImpuestoRenta=isPermiso;		
		this.isPermisoCopiarImpuestoRenta=isPermiso;		
		this.isPermisoVerFormImpuestoRenta=isPermiso;		
		this.isPermisoDuplicarImpuestoRenta=isPermiso;
		this.isPermisoOrdenImpuestoRenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioImpuestoRenta(Boolean isPermiso) {
		//this.isPermisoTodoImpuestoRenta=isPermiso;
		this.isPermisoNuevoImpuestoRenta=isPermiso;
		this.isPermisoActualizarImpuestoRenta=isPermiso;
		this.isPermisoActualizarOriginalImpuestoRenta=isPermiso;
		this.isPermisoEliminarImpuestoRenta=isPermiso;
		this.isPermisoGuardarCambiosImpuestoRenta=isPermiso;
		//this.isPermisoConsultaImpuestoRenta=isPermiso;
		//this.isPermisoBusquedaImpuestoRenta=isPermiso;
		//this.isPermisoReporteImpuestoRenta=isPermiso;
		//this.isPermisoOrdenImpuestoRenta=isPermiso;		
		//this.isPermisoPaginacionMedioImpuestoRenta=isPermiso;		
		//this.isPermisoPaginacionAltoImpuestoRenta=isPermiso;		
		//this.isPermisoPaginacionTodoImpuestoRenta=isPermiso;		
		//this.isPermisoCopiarImpuestoRenta=isPermiso;		
		//this.isPermisoDuplicarImpuestoRenta=isPermiso;
		//this.isPermisoOrdenImpuestoRenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioImpuestoRentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebImpuestoRenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioImpuestoRentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioImpuestoRentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionImpuestoRentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioImpuestoRentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioImpuestoRenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ImpuestoRentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoImpuestoRenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarImpuestoRenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalImpuestoRenta=this.isPermisoActualizarImpuestoRenta;
			this.isPermisoEliminarImpuestoRenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosImpuestoRenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaImpuestoRenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaImpuestoRenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoImpuestoRenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteImpuestoRenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenImpuestoRenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioImpuestoRenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoImpuestoRenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoImpuestoRenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarImpuestoRenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormImpuestoRenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarImpuestoRenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenImpuestoRenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosImpuestoRenta.setToolTipText(this.jTableDatosImpuestoRenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioImpuestoRenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioImpuestoRenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioImpuestoRenta() throws Exception {
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
	public void inicializarCombosForeignKeyImpuestoRentaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyImpuestoRentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ImpuestoRentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyImpuestoRentaListas(false);
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
	
	public void cargarCombosLoteForeignKeyImpuestoRentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ImpuestoRentaParameterReturnGeneral impuestorentaReturnGeneral=new ImpuestoRentaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.impuestorentaConstantesFunciones.cargarid_empresaImpuestoRenta)
					 || (this.esRecargarFks && this.impuestorentaConstantesFunciones.cargarid_empresaImpuestoRenta)) {

					if(!this.impuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+impuestorentaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				impuestorentaReturnGeneral=impuestorentaLogic.cargarCombosLoteForeignKeyImpuestoRenta(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=impuestorentaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyImpuestoRenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.impuestorentaSessionBean==null) {
				this.impuestorentaSessionBean=new ImpuestoRentaSessionBean();
			}

			if(!this.impuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyImpuestoRenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyImpuestoRenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyImpuestoRenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyImpuestoRenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyImpuestoRenta(ImpuestoRenta impuestorenta)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyImpuestoRenta(ImpuestoRenta impuestorenta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyImpuestoRenta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyImpuestoRenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyImpuestoRenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyImpuestoRenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroImpuestoRenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyImpuestoRenta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyImpuestoRenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyImpuestoRenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta!=null && this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ImpuestoRentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ImpuestoRentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ImpuestoRentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.impuestorentaSessionBean=new ImpuestoRentaSessionBean(); 
		this.impuestorentaConstantesFunciones=new ImpuestoRentaConstantesFunciones(); 
		this.impuestorentaBean=new ImpuestoRenta();//(this.impuestorentaConstantesFunciones); 		
		this.impuestorentaReturnGeneral=new ImpuestoRentaParameterReturnGeneral(); 
		
		this.impuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.impuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ImpuestoRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ImpuestoRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ImpuestoRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessImpuestoRenta(true);
			
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
			
			this.impuestorentaConstantesFunciones=new ImpuestoRentaConstantesFunciones(); 
			this.impuestorentaBean=new ImpuestoRenta();//this.impuestorentaConstantesFunciones); 			
			this.impuestorentaReturnGeneral=new ImpuestoRentaParameterReturnGeneral(); 
		
			ImpuestoRentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Impuesto Renta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.impuestorenta=new ImpuestoRenta();
			this.impuestorentas = new ArrayList<ImpuestoRenta>();
			this.impuestorentasAux = new ArrayList<ImpuestoRenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic=new ImpuestoRentaLogic();
				this.impuestorentaLogic.getNewConnexionToDeep("");
			}
			
			//this.impuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.impuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormImpuestoRenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoImpuestoRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoImpuestoRenta);	
					}
					
					if(this.jInternalFrameImportacionImpuestoRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionImpuestoRenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByImpuestoRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByImpuestoRenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormImpuestoRenta);
				this.jInternalFrameDetalleFormImpuestoRenta.setVisible(false);
				this.jInternalFrameDetalleFormImpuestoRenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoImpuestoRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoImpuestoRenta);
					this.jInternalFrameReporteDinamicoImpuestoRenta.setVisible(false);
					this.jInternalFrameReporteDinamicoImpuestoRenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionImpuestoRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionImpuestoRenta);
					this.jInternalFrameImportacionImpuestoRenta.setVisible(false);
					this.jInternalFrameImportacionImpuestoRenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByImpuestoRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByImpuestoRenta);
					this.jInternalFrameOrderByImpuestoRenta.setVisible(false);
					this.jInternalFrameOrderByImpuestoRenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idImpuestoRentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ImpuestoRentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.impuestorentaReturnGeneral=new ImpuestoRentaParameterReturnGeneral();
			
			this.impuestorentaParameterGeneral=new ImpuestoRentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.impuestorentaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ImpuestoRentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.impuestorentaSessionBean.getEsGuardarRelacionado(),this.impuestorentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ImpuestoRentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.impuestorentaSessionBean.getEsGuardarRelacionado(),this.impuestorentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoImpuestoRenta=false;
			this.isVisibilidadCeldaDuplicarImpuestoRenta=true;
			this.isVisibilidadCeldaCopiarImpuestoRenta=true;
			this.isVisibilidadCeldaVerFormImpuestoRenta=true;
			this.isVisibilidadCeldaOrdenImpuestoRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=false;
			this.isVisibilidadCeldaModificarImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosImpuestoRenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioImpuestoRenta(false);
			
			this.setPermisosUsuarioImpuestoRenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.impuestorentaSessionBean.getEsGuardarRelacionado() 
				|| (this.impuestorentaSessionBean.getEsGuardarRelacionado() && this.impuestorentaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioImpuestoRentaClasesRelacionadas();
			}
			
			if(this.impuestorentaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioImpuestoRentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosImpuestoRenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualImpuestoRenta();
			}
			
			if(!this.isPermisoBusquedaImpuestoRenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasImpuestoRenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioImpuestoRenta,this.isPermisoPaginacionMedioImpuestoRenta,this.isPermisoPaginacionTodoImpuestoRenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ImpuestoRentaConstantesFunciones.getTiposSeleccionarImpuestoRenta());
				
				this.tiposColumnasSelect=ImpuestoRentaConstantesFunciones.getTiposSeleccionarImpuestoRenta(true);
				
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
			//if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioImpuestoRenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioImpuestoRenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioImpuestoRenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesImpuestoRenta() ;
			
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
				impuestorentaImplementable= (ImpuestoRentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ImpuestoRentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				impuestorentaImplementableHome= (ImpuestoRentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ImpuestoRentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.impuestorentas= new ArrayList<ImpuestoRenta>();
			this.impuestorentasEliminados= new ArrayList<ImpuestoRenta>();
						
			this.isEsNuevoImpuestoRenta=false;
			this.esParaAccionDesdeFormularioImpuestoRenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyImpuestoRenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroImpuestoRenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ImpuestoRentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ImpuestoRentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingImpuestoRenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioImpuestoRenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioImpuestoRenta();
			}
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasImpuestoRenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasImpuestoRenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasImpuestoRenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessImpuestoRenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ImpuestoRenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectImpuestoRenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesImpuestoRenta")) {
				iIndex=this.jInternalFrameDetalleFormImpuestoRenta.jTabbedPaneRelacionesImpuestoRenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormImpuestoRenta.jTabbedPaneRelacionesImpuestoRenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessImpuestoRenta();	
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
	
	public void cargarCombosForeignKeyImpuestoRenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyImpuestoRenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyImpuestoRenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyImpuestoRentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyImpuestoRenta();
		
		this.cargarCombosFrameForeignKeyImpuestoRenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyImpuestoRenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyImpuestoRenta();
		}
	}
	
	
	
	public void jButtonNuevoImpuestoRentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.impuestorentaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
			
			if(jTableDatosImpuestoRenta.getRowCount()>=1) {
				jTableDatosImpuestoRenta.removeRowSelectionInterval(0, jTableDatosImpuestoRenta.getRowCount()-1);						
			}
			
			this.isEsNuevoImpuestoRenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoImpuestoRenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesImpuestoRenta(true);			
			//this.impuestorenta=new ImpuestoRenta();
			//this.impuestorenta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesImpuestoRenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImpuestoRenta() ;
			
			if(ImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleImpuestoRenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.impuestorenta);	
			this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);				
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
			if(this.impuestorentaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ImpuestoRenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarImpuestoRentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosImpuestoRenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosImpuestoRenta.getSelectedRows().length;			
			}
			
			impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoImpuestoRenta--;			
				//ImpuestoRenta impuestorentaAux= new ImpuestoRenta();			
				//impuestorentaAux.setId(this.iIdNuevoImpuestoRenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ImpuestoRenta impuestorentaOrigen=new ImpuestoRenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ImpuestoRenta impuestorentaOrigen : impuestorentasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							impuestorentaOrigen =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestorentaOrigen =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaImpuestoRenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.impuestorenta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosImpuestoRenta(impuestorentaOrigen,this.impuestorenta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.impuestorentaLogic.getImpuestoRentas().add(this.impuestorentaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.impuestorentas.add(this.impuestorentaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaImpuestoRenta(false);
				
				this.jTableDatosImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoImpuestoRenta(), this.getIndiceNuevoImpuestoRenta());
				
				int iLastRow =  this.jTableDatosImpuestoRenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosImpuestoRenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosImpuestoRenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaImpuestoRenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();									
		
			ImpuestoRenta impuestorentaOrigen=new ImpuestoRenta();
			ImpuestoRenta impuestorentaDestino=new ImpuestoRenta();
				
			impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosImpuestoRenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || impuestorentasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosImpuestoRenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestorentaOrigen =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						impuestorentaOrigen =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestorentaDestino =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						impuestorentaDestino =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				impuestorentaOrigen =impuestorentasSeleccionados.get(0);
				impuestorentaDestino =impuestorentasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosImpuestoRenta(impuestorentaOrigen,impuestorentaDestino,true,false);
				
				impuestorentaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(impuestorentaDestino,impuestorentaLogic.getImpuestoRentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(impuestorentaDestino,impuestorentas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaImpuestoRenta(false);
				
				//this.jTableDatosImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoImpuestoRenta(), this.getIndiceNuevoImpuestoRenta());
				
				int iLastRow =  this.jTableDatosImpuestoRenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosImpuestoRenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosImpuestoRenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaImpuestoRenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormImpuestoRenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesImpuestoRenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasImpuestoRenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesImpuestoRenta.setVisible(!isVisible);
			this.jPanelPaginacionImpuestoRenta.setVisible(!isVisible);
			this.jPanelAccionesImpuestoRenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameImpuestoRenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoImpuestoRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionImpuestoRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByImpuestoRenta();
			
			this.abrirFrameOrderByImpuestoRenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByImpuestoRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleImpuestoRenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormImpuestoRenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormImpuestoRenta.isMaximum()) {
					this.jInternalFrameDetalleFormImpuestoRenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormImpuestoRenta.setSize(this.jInternalFrameDetalleFormImpuestoRenta.iWidthFormulario,this.jInternalFrameDetalleFormImpuestoRenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormImpuestoRenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormImpuestoRenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormImpuestoRenta.isMaximum()) {
						this.jInternalFrameDetalleFormImpuestoRenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormImpuestoRenta.jContentPaneDetalleImpuestoRenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormImpuestoRenta.jTabbedPaneRelacionesImpuestoRenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormImpuestoRenta.jContentPaneDetalleImpuestoRenta.getWidth(),ImpuestoRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormImpuestoRenta.jTabbedPaneRelacionesImpuestoRenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormImpuestoRenta.jContentPaneDetalleImpuestoRenta.getWidth(),ImpuestoRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormImpuestoRenta.jTabbedPaneRelacionesImpuestoRenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormImpuestoRenta.jContentPaneDetalleImpuestoRenta.getWidth(),ImpuestoRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormImpuestoRenta.setVisible(true);
	        this.jInternalFrameDetalleFormImpuestoRenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByImpuestoRenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByImpuestoRenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImpuestoRenta,false,this);
				} else {
					this.jInternalFrameOrderByImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImpuestoRenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByImpuestoRenta);
				this.jInternalFrameOrderByImpuestoRenta.setVisible(false);
				this.jInternalFrameOrderByImpuestoRenta.setSelected(false);
				
				this.jInternalFrameOrderByImpuestoRenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByImpuestoRenta"));
				
				this.inicializarActualizarBindingTablaOrderByImpuestoRenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionImpuestoRenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionImpuestoRenta==null) {
				
				this.jInternalFrameImportacionImpuestoRenta=new ImportacionJInternalFrame(ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionImpuestoRenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionImpuestoRenta);
				this.jInternalFrameImportacionImpuestoRenta.setVisible(false);
				this.jInternalFrameImportacionImpuestoRenta.setSelected(false);


				this.jInternalFrameImportacionImpuestoRenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionImpuestoRenta"));
				this.jInternalFrameImportacionImpuestoRenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionImpuestoRenta"));
				this.jInternalFrameImportacionImpuestoRenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionImpuestoRenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoImpuestoRenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoImpuestoRenta==null) {
				this.jInternalFrameReporteDinamicoImpuestoRenta=new ReporteDinamicoJInternalFrame(ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoImpuestoRenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoImpuestoRenta);
				this.jInternalFrameReporteDinamicoImpuestoRenta.setVisible(false);
				this.jInternalFrameReporteDinamicoImpuestoRenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoImpuestoRenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoImpuestoRenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoImpuestoRenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoImpuestoRenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualImpuestoRenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleImpuestoRenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormImpuestoRenta);
			
	       	this.jInternalFrameDetalleFormImpuestoRenta.setVisible(false);
	        this.jInternalFrameDetalleFormImpuestoRenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormImpuestoRenta.dispose();
			//this.jInternalFrameDetalleFormImpuestoRenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoImpuestoRenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoImpuestoRenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoImpuestoRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionImpuestoRenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionImpuestoRenta.setVisible(true);
	        this.jInternalFrameImportacionImpuestoRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByImpuestoRenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByImpuestoRenta.setVisible(true);
	        this.jInternalFrameOrderByImpuestoRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByImpuestoRenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByImpuestoRenta.setVisible(false);
	        this.jInternalFrameOrderByImpuestoRenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoImpuestoRenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoImpuestoRenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoImpuestoRenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionImpuestoRenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionImpuestoRenta.setVisible(false);
	        this.jInternalFrameImportacionImpuestoRenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarImpuestoRenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarImpuestoRenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesImpuestoRenta(true);
			//this.isEsNuevoImpuestoRenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesImpuestoRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesImpuestoRenta(false) ;
			
			if(impuestorentaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleImpuestoRenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImpuestoRenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaImpuestoRentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarImpuestoRenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesImpuestoRenta(true);
			//this.isEsNuevoImpuestoRenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.impuestorenta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesImpuestoRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesImpuestoRenta(false) ;
			
			if(ImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleImpuestoRenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImpuestoRenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesImpuestoRenta(false);
			
			//if(!this.isEsNuevoImpuestoRenta) {								
				int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
				
			}
			
			if(this.permiteMantenimiento(this.impuestorenta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoImpuestoRenta=true;
					this.inicializarActualizarBindingTablaImpuestoRenta(false);
					this.isEsNuevoImpuestoRenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoImpuestoRenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoImpuestoRenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesImpuestoRenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualImpuestoRenta(false);
				
				this.habilitarDeshabilitarControlesImpuestoRenta(false);
			
												
				
				if(ImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleImpuestoRenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoImpuestoRentaActionPerformed(evt,impuestorentaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualImpuestoRenta(this.impuestorenta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosImpuestoRenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,impuestorentaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.impuestorenta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				this.impuestorenta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				this.impuestorenta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.impuestorenta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ImpuestoRentaModel) this.jTableDatosImpuestoRenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoImpuestoRenta=true;
				this.inicializarActualizarBindingTablaImpuestoRenta(false);
				this.isEsNuevoImpuestoRenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesImpuestoRenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualImpuestoRenta(false);
				
				this.habilitarDeshabilitarControlesImpuestoRenta(false);
				
				
				
				if(ImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleImpuestoRenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosImpuestoRenta.getRowCount()>=1) {
				jTableDatosImpuestoRenta.removeRowSelectionInterval(0, jTableDatosImpuestoRenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesImpuestoRenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaImpuestoRenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesImpuestoRenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImpuestoRenta(false) ;
			
			this.isEsNuevoImpuestoRenta=false;
			
			if(ImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleImpuestoRenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingImpuestoRenta(false);
				
				//SI ES MANUAL
				if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualImpuestoRenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoImpuestoRenta--;			
			//ImpuestoRenta impuestorentaAux= new ImpuestoRenta();			
			//impuestorentaAux.setId(this.iIdNuevoImpuestoRenta);
			
			if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaImpuestoRenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
			
			this.impuestorenta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.impuestorentaLogic.getImpuestoRentas().add(this.impuestorentaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.impuestorentas.add(this.impuestorentaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaImpuestoRenta(false);
			
			this.jTableDatosImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoImpuestoRenta(), this.getIndiceNuevoImpuestoRenta());
			
			int iLastRow =  this.jTableDatosImpuestoRenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosImpuestoRenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosImpuestoRenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaImpuestoRenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingImpuestoRenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImpuestoRenta(false);
			
			//SI ES MANUAL
			if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualImpuestoRenta();
			}
			
			//this.abrirFrameTreeImpuestoRenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Impuesto RentaS ?", "MANTENIMIENTO DE Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionImpuestoRenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralImpuestoRenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.impuestorentaReturnGeneral=impuestorentaLogic.procesarImportacionImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.impuestorentaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarImpuestoRentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionImpuestoRenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionImpuestoRenta.setFileImportacion(this.jInternalFrameImportacionImpuestoRenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionImpuestoRenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionImpuestoRenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionImpuestoRenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionImpuestoRenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();		

		impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ImpuestoRentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ImpuestoRentaBaseDesign.jrxml";
			
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
			
			this.generarReporteImpuestoRentas("Todos",impuestorentasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ImpuestoRentaConstantesFunciones.LABEL_DESDE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ImpuestoRentaConstantesFunciones.LABEL_HASTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_puesto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_puesto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_puesto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_puesto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoImpuestoRenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_DESDE:
					sNombreCampoCategoria="desde";
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_HASTA:
					sNombreCampoCategoria="hasta";
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO:
					sNombreCampoCategoria="impuesto";
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_DESDE:
					sNombreCampoCategoriaValor="desde";
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_HASTA:
					sNombreCampoCategoriaValor="hasta";
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO:
					sNombreCampoCategoriaValor="impuesto";
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_DESDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Desde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"desde");
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_HASTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hasta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hasta");
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Impuesto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"impuesto");
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
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
	
	public void jButtonGenerarExcelReporteDinamicoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();		
		
		impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestorenta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ImpuestoRentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ImpuestoRenta impuestorenta:impuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(impuestorenta.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_DESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_DESDE);
					iRow++;

					for(ImpuestoRenta impuestorenta:impuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(impuestorenta.getdesde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_HASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_HASTA);
					iRow++;

					for(ImpuestoRenta impuestorenta:impuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(impuestorenta.gethasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO);
					iRow++;

					for(ImpuestoRenta impuestorenta:impuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(impuestorenta.getimpuesto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ImpuestoRenta impuestorenta:impuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(impuestorenta.getporcentaje());
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
			//	this.getFilaCabeceraExportarExcelImpuestoRenta(row);				
			//	iRow++;
			//}				
			
			//for(ImpuestoRenta impuestorentaAux:impuestorentasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelImpuestoRenta(impuestorentaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
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
				this.impuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImpuestoRenta(false);
			
			//SI ES MANUAL
			if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualImpuestoRenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImpuestoRenta(false);
			
			//SI ES MANUAL
			if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualImpuestoRenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImpuestoRenta(false);
			
			//SI ES MANUAL
			if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualImpuestoRenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaImpuestoRenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosImpuestoRenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosImpuestoRenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosImpuestoRenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosImpuestoRenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosImpuestoRenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosImpuestoRenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosImpuestoRenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingImpuestoRenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingImpuestoRenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingImpuestoRenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaImpuestoRenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesImpuestoRenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasImpuestoRenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesImpuestoRenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesImpuestoRenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualImpuestoRenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaImpuestoRenta();
		
		this.inicializarActualizarBindingBotonesManualImpuestoRenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualImpuestoRenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesImpuestoRenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualImpuestoRenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualImpuestoRenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosImpuestoRenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosImpuestoRenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteImpuestoRenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormImpuestoRenta.jCheckBoxPostAccionNuevoImpuestoRenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormImpuestoRenta.jCheckBoxPostAccionSinCerrarImpuestoRenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormImpuestoRenta.jCheckBoxPostAccionSinMensajeImpuestoRenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosImpuestoRenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosImpuestoRenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteImpuestoRenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
				this.jInternalFrameDetalleFormImpuestoRenta.jCheckBoxPostAccionNuevoImpuestoRenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormImpuestoRenta.jCheckBoxPostAccionSinCerrarImpuestoRenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormImpuestoRenta.jCheckBoxPostAccionSinMensajeImpuestoRenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionImpuestoRenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionImpuestoRenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesImpuestoRenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoImpuestoRenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesImpuestoRenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesImpuestoRenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarImpuestoRenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesImpuestoRenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoImpuestoRenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesImpuestoRenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralImpuestoRenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesImpuestoRenta(Boolean esInicializar) throws Exception {
		try	{	
			if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualImpuestoRenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesImpuestoRenta() throws Exception {
		try	{
			if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualImpuestoRenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleImpuestoRenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualImpuestoRenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesImpuestoRenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesImpuestoRenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesImpuestoRenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionImpuestoRenta.addItem(reporte);
			}
			
			
			if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionImpuestoRenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionImpuestoRenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesImpuestoRenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesImpuestoRenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarImpuestoRenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarImpuestoRenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualImpuestoRenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualImpuestoRenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoImpuestoRenta!=null) {
				this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoImpuestoRenta!=null) {
				this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoImpuestoRenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoImpuestoRenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ImpuestoRentaConstantesFunciones.getTiposSeleccionarImpuestoRenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ImpuestoRentaConstantesFunciones.getTiposSeleccionarImpuestoRenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ImpuestoRentaConstantesFunciones.getTiposSeleccionarImpuestoRenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoImpuestoRenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualImpuestoRenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasImpuestoRenta(Boolean esInicializar) throws Exception {				
		if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualImpuestoRenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaImpuestoRenta() throws Exception {
		this.inicializarActualizarBindingTablaImpuestoRenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByImpuestoRenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ImpuestoRentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ImpuestoRentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosImpuestoRentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoRentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ImpuestoRentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ImpuestoRentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaImpuestoRenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=impuestorentaLogic.getImpuestoRentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=impuestorentas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosImpuestoRenta.setModel(new ImpuestoRentaModel(this.impuestorentaLogic.getImpuestoRentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosImpuestoRenta.setModel(new ImpuestoRentaModel(this.impuestorentas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByImpuestoRenta!=null && this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByImpuestoRenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoRenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ImpuestoRentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,impuestorentaConstantesFunciones.resaltarSeleccionarImpuestoRenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,impuestorentaConstantesFunciones.resaltarSeleccionarImpuestoRenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoRenta,ImpuestoRentaConstantesFunciones.LABEL_ID));

		if(this.impuestorentaConstantesFunciones.mostraridImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImpuestoRentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.impuestorentaConstantesFunciones.resaltaridImpuestoRenta,this.impuestorentaConstantesFunciones.activaridImpuestoRenta,iSizeTabla,this,true,"idImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.impuestorentaConstantesFunciones.resaltaridImpuestoRenta,this.impuestorentaConstantesFunciones.activaridImpuestoRenta,this,true,"idImpuestoRenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoRenta,ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.impuestorentaConstantesFunciones.mostrarid_empresaImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.impuestorentaConstantesFunciones.resaltarid_empresaImpuestoRenta,this,this.impuestorentaConstantesFunciones.activarid_empresaImpuestoRenta,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.impuestorentaConstantesFunciones.resaltarid_empresaImpuestoRenta,this,this.impuestorentaConstantesFunciones.activarid_empresaImpuestoRenta,false,"id_empresaImpuestoRenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoRenta,ImpuestoRentaConstantesFunciones.LABEL_DESDE));

		if(this.impuestorentaConstantesFunciones.mostrardesdeImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImpuestoRentaConstantesFunciones.LABEL_DESDE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.impuestorentaConstantesFunciones.resaltardesdeImpuestoRenta,this.impuestorentaConstantesFunciones.activardesdeImpuestoRenta,iSizeTabla,this,true,"desdeImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.impuestorentaConstantesFunciones.resaltardesdeImpuestoRenta,this.impuestorentaConstantesFunciones.activardesdeImpuestoRenta,this,true,"desdeImpuestoRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoRenta,ImpuestoRentaConstantesFunciones.LABEL_HASTA));

		if(this.impuestorentaConstantesFunciones.mostrarhastaImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImpuestoRentaConstantesFunciones.LABEL_HASTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.impuestorentaConstantesFunciones.resaltarhastaImpuestoRenta,this.impuestorentaConstantesFunciones.activarhastaImpuestoRenta,iSizeTabla,this,true,"hastaImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.impuestorentaConstantesFunciones.resaltarhastaImpuestoRenta,this.impuestorentaConstantesFunciones.activarhastaImpuestoRenta,this,true,"hastaImpuestoRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoRenta,ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO));

		if(this.impuestorentaConstantesFunciones.mostrarimpuestoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.impuestorentaConstantesFunciones.resaltarimpuestoImpuestoRenta,this.impuestorentaConstantesFunciones.activarimpuestoImpuestoRenta,iSizeTabla,this,true,"impuestoImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.impuestorentaConstantesFunciones.resaltarimpuestoImpuestoRenta,this.impuestorentaConstantesFunciones.activarimpuestoImpuestoRenta,this,true,"impuestoImpuestoRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoRenta,ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE));

		if(this.impuestorentaConstantesFunciones.mostrarporcentajeImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.impuestorentaConstantesFunciones.resaltarporcentajeImpuestoRenta,this.impuestorentaConstantesFunciones.activarporcentajeImpuestoRenta,iSizeTabla,this,true,"porcentajeImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.impuestorentaConstantesFunciones.resaltarporcentajeImpuestoRenta,this.impuestorentaConstantesFunciones.activarporcentajeImpuestoRenta,this,true,"porcentajeImpuestoRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.impuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.impuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosImpuestoRenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.impuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.impuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosImpuestoRenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.impuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.impuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosImpuestoRenta.addColumn(tableColumn);
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
			
			this.jTableDatosImpuestoRenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosImpuestoRenta.moveColumn(this.jTableDatosImpuestoRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosImpuestoRenta.moveColumn(this.jTableDatosImpuestoRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosImpuestoRenta.moveColumn(this.jTableDatosImpuestoRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosImpuestoRenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosImpuestoRenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosImpuestoRenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosImpuestoRenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosImpuestoRenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosImpuestoRenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosImpuestoRenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosImpuestoRenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=impuestorentaLogic.getImpuestoRentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=impuestorentas.size()-1;
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
		//this.jTableDatosImpuestoRenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosImpuestoRenta();
			
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
				
				//this.isEsNuevoImpuestoRenta=false;
					
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
				if(this.impuestorentaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormImpuestoRenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosImpuestoRenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosImpuestoRenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.impuestorenta.getsType().equals("DUPLICADO")
				   || this.impuestorenta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoImpuestoRenta=true;
				
				} else {
					this.isEsNuevoImpuestoRenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
					if(this.impuestorenta.getId()>=0 && !this.impuestorenta.getIsNew()) {						
						this.isEsNuevoImpuestoRenta=false;
						
					} else {
						this.isEsNuevoImpuestoRenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoImpuestoRenta(esRelaciones);						
				
				this.seleccionarImpuestoRenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.impuestorenta.getId()<0) {
					this.isEsNuevoImpuestoRenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarImpuestoRenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarImpuestoRenta(evt,rowIndex);
				}	
				
				if(this.impuestorentaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ImpuestoRenta: " + this.dDif); 
					}
				}								
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarImpuestoRenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.impuestorenta)) {
					if(this.impuestorenta.getId()>0) {
						this.impuestorenta.setIsDeleted(true);
						
						this.impuestorentasEliminados.add(this.impuestorenta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.impuestorentaLogic.getImpuestoRentas().remove(this.impuestorenta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.impuestorentas.remove(this.impuestorenta);				
					}
					
					
					((ImpuestoRentaModel) this.jTableDatosImpuestoRenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaImpuestoRenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarImpuestoRenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoImpuestoRenta) {
			
			if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosImpuestoRenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosImpuestoRenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioImpuestoRenta(this.impuestorenta);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.impuestorentaConstantesFunciones.cargarid_empresaImpuestoRenta || this.impuestorentaConstantesFunciones.event_dependid_empresaImpuestoRenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.impuestorenta.getid_empresa());
									//this.inicializarActualizarBindingImpuestoRenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(impuestorenta.getEmpresa()!=null) {
							this.empresasForeignKey.add(impuestorenta.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.impuestorenta.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesImpuestoRenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesImpuestoRenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualImpuestoRenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoImpuestoRenta(ImpuestoRenta impuestorenta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoImpuestoRenta(impuestorenta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoImpuestoRenta(ImpuestoRenta impuestorenta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioImpuestoRenta(impuestorenta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyImpuestoRenta(impuestorenta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyImpuestoRenta(impuestorenta);
	}
	
	public void setVariablesObjetoActualToFormularioImpuestoRenta(ImpuestoRenta impuestorenta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.setText(impuestorenta.getId().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFielddesdeImpuestoRenta.setText(impuestorenta.getdesde().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldhastaImpuestoRenta.setText(impuestorenta.gethasta().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldimpuestoImpuestoRenta.setText(impuestorenta.getimpuesto().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldporcentajeImpuestoRenta.setText(impuestorenta.getporcentaje().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ImpuestoRenta impuestorentaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,impuestorentaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ImpuestoRenta impuestorentaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				impuestorentaLocal=this.impuestorenta;
			} else {
				impuestorentaLocal=this.impuestorentaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(impuestorentaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoImpuestoRenta(impuestorentaLocal,true);
					
					if(impuestorentaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(impuestorentaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(impuestorentaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoImpuestoRenta(ImpuestoRenta impuestorenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualImpuestoRenta(impuestorenta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(impuestorenta);
	}
	
	public void setVariablesFormularioToObjetoActualImpuestoRenta(ImpuestoRenta impuestorenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualImpuestoRenta(impuestorenta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualImpuestoRenta(ImpuestoRenta impuestorenta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.getText()==null || this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.getText()=="" || this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.getText()=="Id") {
				this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.setText("0");
			}

			if(conColumnasBase) {impuestorenta.setId(Long.parseLong(this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ImpuestoRentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoRenta.jLabelIdImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			impuestorenta.setdesde(Double.parseDouble(this.jInternalFrameDetalleFormImpuestoRenta.jTextFielddesdeImpuestoRenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ImpuestoRentaConstantesFunciones.LABEL_DESDE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoRenta.jLabeldesdeImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			impuestorenta.sethasta(Double.parseDouble(this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldhastaImpuestoRenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ImpuestoRentaConstantesFunciones.LABEL_HASTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoRenta.jLabelhastaImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			impuestorenta.setimpuesto(Double.parseDouble(this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldimpuestoImpuestoRenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoRenta.jLabelimpuestoImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			impuestorenta.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldporcentajeImpuestoRenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoRenta.jLabelporcentajeImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualImpuestoRenta(ImpuestoRenta impuestorentaBean,ImpuestoRenta impuestorenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosImpuestoRenta(ImpuestoRenta impuestorentaOrigen,ImpuestoRenta impuestorenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && impuestorentaOrigen.getId()!=null && !impuestorentaOrigen.getId().equals(0L))) {impuestorenta.setId(impuestorentaOrigen.getId());}}
			if(conDefault || (!conDefault && impuestorentaOrigen.getdesde()!=null && !impuestorentaOrigen.getdesde().equals(0.0))) {impuestorenta.setdesde(impuestorentaOrigen.getdesde());}
			if(conDefault || (!conDefault && impuestorentaOrigen.gethasta()!=null && !impuestorentaOrigen.gethasta().equals(0.0))) {impuestorenta.sethasta(impuestorentaOrigen.gethasta());}
			if(conDefault || (!conDefault && impuestorentaOrigen.getimpuesto()!=null && !impuestorentaOrigen.getimpuesto().equals(0.0))) {impuestorenta.setimpuesto(impuestorentaOrigen.getimpuesto());}
			if(conDefault || (!conDefault && impuestorentaOrigen.getporcentaje()!=null && !impuestorentaOrigen.getporcentaje().equals(0.0))) {impuestorenta.setporcentaje(impuestorentaOrigen.getporcentaje());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioImpuestoRenta(ImpuestoRenta impuestorenta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.setText(impuestorenta.getId().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFielddesdeImpuestoRenta.setText(impuestorenta.getdesde().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldhastaImpuestoRenta.setText(impuestorenta.gethasta().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldimpuestoImpuestoRenta.setText(impuestorenta.getimpuesto().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldporcentajeImpuestoRenta.setText(impuestorenta.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioImpuestoRenta(ImpuestoRentaBean impuestorentaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.setText(impuestorentaBean.getId().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFielddesdeImpuestoRenta.setText(impuestorentaBean.getdesde().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldhastaImpuestoRenta.setText(impuestorentaBean.gethasta().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldimpuestoImpuestoRenta.setText(impuestorentaBean.getimpuesto().toString());
			this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldporcentajeImpuestoRenta.setText(impuestorentaBean.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanImpuestoRenta(ImpuestoRentaParameterReturnGeneral impuestorentaReturnGeneral,ImpuestoRentaBean impuestorentaBean,Boolean conDefault) throws Exception { 
		try {
			ImpuestoRenta impuestorentaLocal=new ImpuestoRenta();
			
			impuestorentaLocal=impuestorentaReturnGeneral.getImpuestoRenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && impuestorentaLocal.getId()!=null && !impuestorentaLocal.getId().equals(0L))) {impuestorentaBean.setId(impuestorentaLocal.getId());}}
			if(conDefault || (!conDefault && impuestorentaLocal.getdesde()!=null && !impuestorentaLocal.getdesde().equals(0.0))) {impuestorentaBean.setdesde(impuestorentaLocal.getdesde());}
			if(conDefault || (!conDefault && impuestorentaLocal.gethasta()!=null && !impuestorentaLocal.gethasta().equals(0.0))) {impuestorentaBean.sethasta(impuestorentaLocal.gethasta());}
			if(conDefault || (!conDefault && impuestorentaLocal.getimpuesto()!=null && !impuestorentaLocal.getimpuesto().equals(0.0))) {impuestorentaBean.setimpuesto(impuestorentaLocal.getimpuesto());}
			if(conDefault || (!conDefault && impuestorentaLocal.getporcentaje()!=null && !impuestorentaLocal.getporcentaje().equals(0.0))) {impuestorentaBean.setporcentaje(impuestorentaLocal.getporcentaje());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxImpuestoRentaGenerico(Long idImpuestoRentaSeleccionado,JComboBox jComboBoxImpuestoRenta,List<ImpuestoRenta> impuestorentasLocal)throws Exception {
		try {
			ImpuestoRenta  impuestorentaTemp=null;

			for(ImpuestoRenta impuestorentaAux:impuestorentasLocal) {
				if(impuestorentaAux.getId()!=null && impuestorentaAux.getId().equals(idImpuestoRentaSeleccionado)) {
					impuestorentaTemp=impuestorentaAux;
					break;
				}
			}

			jComboBoxImpuestoRenta.setSelectedItem(impuestorentaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxImpuestoRentaGenerico(JComboBox jComboBoxImpuestoRenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxImpuestoRenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxImpuestoRenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxImpuestoRenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxImpuestoRenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			impuestorenta=(ImpuestoRenta) impuestorentaLogic.getImpuestoRentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			impuestorenta =(ImpuestoRenta) impuestorentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!impuestorenta.getIsNew() && !impuestorenta.getIsChanged() && !impuestorenta.getIsDeleted()) {
				sDescripcion=impuestorenta.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=impuestorenta.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ImpuestoRenta impuestorentaRow=new ImpuestoRenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			impuestorentaRow=(ImpuestoRenta) impuestorentaLogic.getImpuestoRentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			impuestorentaRow=(ImpuestoRenta) impuestorentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualImpuestoRenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoImpuestoRenta && this.isPermisoNuevoImpuestoRenta));			
			this.jButtonDuplicarImpuestoRenta.setVisible((this.isVisibilidadCeldaDuplicarImpuestoRenta && this.isPermisoDuplicarImpuestoRenta));			
			this.jButtonCopiarImpuestoRenta.setVisible((this.isVisibilidadCeldaCopiarImpuestoRenta && this.isPermisoCopiarImpuestoRenta));
			this.jButtonVerFormImpuestoRenta.setVisible((this.isVisibilidadCeldaVerFormImpuestoRenta && this.isPermisoVerFormImpuestoRenta));
			
			this.jButtonAbrirOrderByImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenImpuestoRenta && this.isPermisoOrdenImpuestoRenta));			
			
			this.jButtonNuevoRelacionesImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta && this.isPermisoNuevoImpuestoRenta));			
			this.jButtonNuevoGuardarCambiosImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoImpuestoRenta && this.isPermisoNuevoImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta));
			
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonModificarImpuestoRenta.setVisible((this.isVisibilidadCeldaModificarImpuestoRenta && this.isPermisoActualizarImpuestoRenta));	
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonActualizarImpuestoRenta.setVisible((this.isVisibilidadCeldaActualizarImpuestoRenta && this.isPermisoActualizarImpuestoRenta));	
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonEliminarImpuestoRenta.setVisible((this.isVisibilidadCeldaEliminarImpuestoRenta && this.isPermisoEliminarImpuestoRenta));
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonCancelarImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarImpuestoRenta);							
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoImpuestoRenta && this.isPermisoNuevoImpuestoRenta));						
			this.jButtonDuplicarToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaDuplicarImpuestoRenta && this.isPermisoDuplicarImpuestoRenta));						
			this.jButtonCopiarToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaCopiarImpuestoRenta && this.isPermisoCopiarImpuestoRenta));			
			this.jButtonVerFormToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaVerFormImpuestoRenta && this.isPermisoVerFormImpuestoRenta));			
			this.jButtonAbrirOrderByToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenImpuestoRenta && this.isPermisoOrdenImpuestoRenta));
			this.jButtonNuevoRelacionesToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta && this.isPermisoNuevoImpuestoRenta));			
			this.jButtonNuevoGuardarCambiosToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoImpuestoRenta && this.isPermisoNuevoImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta));			
			
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonModificarToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaModificarImpuestoRenta && this.isPermisoActualizarImpuestoRenta));	
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonActualizarToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaActualizarImpuestoRenta  && this.isPermisoActualizarImpuestoRenta));	
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonEliminarToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaEliminarImpuestoRenta && this.isPermisoEliminarImpuestoRenta));
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonCancelarToolBarImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarImpuestoRenta);				
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoImpuestoRenta && this.isPermisoNuevoImpuestoRenta));			
			this.jMenuItemDuplicarImpuestoRenta.setVisible((this.isVisibilidadCeldaDuplicarImpuestoRenta && this.isPermisoDuplicarImpuestoRenta));			
			this.jMenuItemCopiarImpuestoRenta.setVisible((this.isVisibilidadCeldaCopiarImpuestoRenta && this.isPermisoCopiarImpuestoRenta));			
			this.jMenuItemVerFormImpuestoRenta.setVisible((this.isVisibilidadCeldaVerFormImpuestoRenta && this.isPermisoVerFormImpuestoRenta));			
			this.jMenuItemAbrirOrderByImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenImpuestoRenta && this.isPermisoOrdenImpuestoRenta));			
			//this.jMenuItemMostrarOcultarImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenImpuestoRenta && this.isPermisoOrdenImpuestoRenta));
			this.jMenuItemDetalleAbrirOrderByImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenImpuestoRenta && this.isPermisoOrdenImpuestoRenta));			
			//this.jMenuItemDetalleMostrarOcultarImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenImpuestoRenta && this.isPermisoOrdenImpuestoRenta));			
			this.jMenuItemNuevoRelacionesImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta && this.isPermisoNuevoImpuestoRenta));			
			this.jMenuItemNuevoGuardarCambiosImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoImpuestoRenta && this.isPermisoNuevoImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta));									
			
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemModificarImpuestoRenta.setVisible((this.isVisibilidadCeldaModificarImpuestoRenta && this.isPermisoActualizarImpuestoRenta));	
			this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemActualizarImpuestoRenta.setVisible((this.isVisibilidadCeldaActualizarImpuestoRenta && this.isPermisoActualizarImpuestoRenta));	
			this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemEliminarImpuestoRenta.setVisible((this.isVisibilidadCeldaEliminarImpuestoRenta && this.isPermisoEliminarImpuestoRenta));
			this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemCancelarImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarImpuestoRenta);				
			}
			
			this.jMenuItemGuardarCambiosImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta));						
			this.jMenuItemGuardarCambiosTablaImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoImpuestoRenta=this.jButtonNuevoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaDuplicarImpuestoRenta=this.jButtonDuplicarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCopiarImpuestoRenta=this.jButtonCopiarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaVerFormImpuestoRenta=this.jButtonVerFormImpuestoRenta.isVisible();
			
			this.isVisibilidadCeldaOrdenImpuestoRenta=this.jButtonAbrirOrderByImpuestoRenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=this.jButtonNuevoRelacionesImpuestoRenta.isVisible();
			this.isVisibilidadCeldaModificarImpuestoRenta=this.jButtonModificarImpuestoRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			this.isVisibilidadCeldaActualizarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jButtonActualizarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaEliminarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jButtonEliminarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCancelarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jButtonCancelarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaGuardarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosImpuestoRenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=this.jButtonGuardarCambiosTablaImpuestoRenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoImpuestoRenta=this.jButtonNuevoToolBarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=this.jButtonNuevoRelacionesToolBarImpuestoRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			this.isVisibilidadCeldaModificarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jButtonModificarToolBarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaActualizarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jButtonActualizarToolBarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaEliminarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jButtonEliminarToolBarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCancelarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jButtonCancelarToolBarImpuestoRenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarImpuestoRenta=this.jButtonGuardarCambiosToolBarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=this.jButtonGuardarCambiosTablaToolBarImpuestoRenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoImpuestoRenta=this.jMenuItemNuevoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=this.jMenuItemNuevoRelacionesImpuestoRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			this.isVisibilidadCeldaModificarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemModificarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaActualizarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemActualizarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaEliminarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemEliminarImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCancelarImpuestoRenta=this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemCancelarImpuestoRenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarImpuestoRenta=this.jMenuItemGuardarCambiosImpuestoRenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=this.jMenuItemGuardarCambiosTablaImpuestoRenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesImpuestoRenta(Boolean esInicializar) {
		if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.impuestorentaSessionBean.getConGuardarRelaciones()) {
				//if(this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesImpuestoRenta();
			}
			
			this.inicializarActualizarBindingBotonesManualImpuestoRenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualImpuestoRenta() {
		this.jButtonNuevoImpuestoRenta.setVisible(this.isPermisoNuevoImpuestoRenta);			
		this.jButtonDuplicarImpuestoRenta.setVisible(this.isPermisoDuplicarImpuestoRenta);			
		this.jButtonCopiarImpuestoRenta.setVisible(this.isPermisoCopiarImpuestoRenta);			
		this.jButtonVerFormImpuestoRenta.setVisible(this.isPermisoVerFormImpuestoRenta);			
		
		this.jButtonAbrirOrderByImpuestoRenta.setVisible(this.isPermisoOrdenImpuestoRenta);					
		
		this.jButtonNuevoRelacionesImpuestoRenta.setVisible(this.isPermisoNuevoImpuestoRenta);			
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonModificarImpuestoRenta.setVisible(this.isPermisoActualizarImpuestoRenta);	
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonActualizarImpuestoRenta.setVisible(this.isPermisoActualizarImpuestoRenta);	
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonEliminarImpuestoRenta.setVisible(this.isPermisoEliminarImpuestoRenta);
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonCancelarImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarImpuestoRenta);						
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosImpuestoRenta.setVisible(this.isPermisoGuardarCambiosImpuestoRenta);							
		}
		
		this.jButtonGuardarCambiosTablaImpuestoRenta.setVisible(this.isPermisoActualizarImpuestoRenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleImpuestoRenta() {
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonModificarImpuestoRenta.setVisible(this.isPermisoActualizarImpuestoRenta);	
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonActualizarImpuestoRenta.setVisible(this.isPermisoActualizarImpuestoRenta);	
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonEliminarImpuestoRenta.setVisible(this.isPermisoEliminarImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonCancelarImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarImpuestoRenta);							
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarImpuestoRenta && this.isPermisoGuardarCambiosImpuestoRenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosImpuestoRenta() {
		if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualImpuestoRenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesImpuestoRenta() {
	}
	
	public void jTableDatosImpuestoRentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarImpuestoRenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.getimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.impuestorenta==null) {
						this.impuestorenta = new ImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
				}

				if(this.impuestorenta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.impuestorenta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaImpuestoRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebImpuestoRenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosImpuestoRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosImpuestoRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualImpuestoRenta(this.getimpuestorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.impuestorentaLogic.getConnexion());

				if(this.impuestorenta.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.impuestorenta.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderImpuestoRenta=(TitledBorder)this.jScrollPanelDatosImpuestoRenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderImpuestoRenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.getimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.impuestorenta==null) {
						this.impuestorenta = new ImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
				}

				if(this.impuestorenta.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.impuestorenta.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondesdeImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.getimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.impuestorenta==null) {
						this.impuestorenta = new ImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
				}

				if(this.impuestorenta.getdesde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where desde = "+this.impuestorenta.getdesde().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhastaImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.getimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.impuestorenta==null) {
						this.impuestorenta = new ImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
				}

				if(this.impuestorenta.gethasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hasta = "+this.impuestorenta.gethasta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonimpuestoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.getimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.impuestorenta==null) {
						this.impuestorenta = new ImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
				}

				if(this.impuestorenta.getimpuesto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where impuesto = "+this.impuestorenta.getimpuesto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.getimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.impuestorenta==null) {
						this.impuestorenta = new ImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);
				}

				if(this.impuestorenta.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.impuestorenta.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingImpuestoRenta(false,false);

			this.getImpuestoRentasFK_IdEmpresa();

			this.inicializarActualizarBindingImpuestoRenta(false);

			//if(ImpuestoRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingImpuestoRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameImpuestoRenta() {
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormImpuestoRenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormImpuestoRenta.dispose();
			this.jInternalFrameDetalleFormImpuestoRenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoImpuestoRenta!=null) {
			this.jInternalFrameReporteDinamicoImpuestoRenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoImpuestoRenta.dispose();
			this.jInternalFrameReporteDinamicoImpuestoRenta=null;
		}
		
		if(this.jInternalFrameImportacionImpuestoRenta!=null) {
			this.jInternalFrameImportacionImpuestoRenta.setVisible(false);	    			
			this.jInternalFrameImportacionImpuestoRenta.dispose();
			this.jInternalFrameImportacionImpuestoRenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessImpuestoRenta();
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
			
			if(sTipo.equals("NuevoImpuestoRenta")) {
				jButtonNuevoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarImpuestoRenta")) {
				jButtonDuplicarImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarImpuestoRenta")) {
				jButtonCopiarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormImpuestoRenta")) {
				jButtonVerFormImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarImpuestoRenta")) {
				jButtonNuevoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarImpuestoRenta")) {
				jButtonDuplicarImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoImpuestoRenta")) {
				jButtonNuevoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarImpuestoRenta")) {
				jButtonDuplicarImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesImpuestoRenta")) {
				jButtonNuevoImpuestoRentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarImpuestoRenta")) {
				jButtonNuevoImpuestoRentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesImpuestoRenta")) {
				jButtonNuevoImpuestoRentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarImpuestoRenta")) {
				jButtonModificarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarImpuestoRenta")) {
				jButtonModificarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarImpuestoRenta")) {
				jButtonModificarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarImpuestoRenta")) {
				jButtonActualizarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarImpuestoRenta")) {
				jButtonActualizarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarImpuestoRenta")) {
				jButtonActualizarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarImpuestoRenta")) {
				jButtonEliminarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarImpuestoRenta")) {
				jButtonEliminarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarImpuestoRenta")) {
				jButtonEliminarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarImpuestoRenta")) {
				jButtonCancelarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarImpuestoRenta")) {
				jButtonCancelarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarImpuestoRenta")) {
				jButtonCancelarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarImpuestoRenta")) {
				jButtonCerrarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarImpuestoRenta")) {
				jButtonCerrarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarImpuestoRenta")) {
				jButtonCerrarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarImpuestoRenta")) {
				jButtonMostrarOcultarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarImpuestoRenta")) {
				jButtonCancelarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosImpuestoRenta")) {
				jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarImpuestoRenta")) {
				jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarImpuestoRenta")) {
				jButtonCopiarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarImpuestoRenta")) {
				jButtonVerFormImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosImpuestoRenta")) {
				jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarImpuestoRenta")) {
				jButtonCopiarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormImpuestoRenta")) {
				jButtonVerFormImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaImpuestoRenta")) {
				jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarImpuestoRenta")) {
				jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaImpuestoRenta")) {
				jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionImpuestoRenta")) {
				jButtonRecargarInformacionImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarImpuestoRenta")) {
				jButtonRecargarInformacionImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionImpuestoRenta")) {
				jButtonRecargarInformacionImpuestoRentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresImpuestoRenta")) {
				jButtonAnterioresImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarImpuestoRenta")) {
				jButtonAnterioresImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreImpuestoRenta")) {
				jButtonAnterioresImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesImpuestoRenta")) {
				jButtonSiguientesImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarImpuestoRenta")) {
				jButtonSiguientesImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesImpuestoRenta")) {
				jButtonSiguientesImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByImpuestoRenta") || sTipo.equals("MenuItemDetalleAbrirOrderByImpuestoRenta")) {
				jButtonAbrirOrderByImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarImpuestoRenta") || sTipo.equals("MenuItemDetalleMostrarOcultarImpuestoRenta")) {
				jButtonMostrarOcultarImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosImpuestoRenta")) {
				jButtonNuevoGuardarCambiosImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarImpuestoRenta")) {
				jButtonNuevoGuardarCambiosImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosImpuestoRenta")) {
				jButtonNuevoGuardarCambiosImpuestoRentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoImpuestoRenta")) {
				jButtonCerrarReporteDinamicoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoImpuestoRenta")) {
				jButtonGenerarReporteDinamicoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoImpuestoRenta")) {
				
				jButtonGenerarExcelReporteDinamicoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionImpuestoRenta")) {
				jButtonCerrarImportacionImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionImpuestoRenta")) {
				
				jButtonGenerarImportacionImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionImpuestoRenta")) {
				
				jButtonAbrirImportacionImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesImpuestoRenta")) {
				jComboBoxTiposAccionesImpuestoRentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesImpuestoRenta")) {
				jComboBoxTiposRelacionesImpuestoRentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioImpuestoRenta")) {
				jComboBoxTiposAccionesImpuestoRentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarImpuestoRenta")) {
				
				jComboBoxTiposSeleccionarImpuestoRentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralImpuestoRenta")) {
				jTextFieldValorCampoGeneralImpuestoRentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByImpuestoRenta")) {
				jButtonAbrirOrderByImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarImpuestoRenta")) {
				jButtonAbrirOrderByImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByImpuestoRenta")) {
				jButtonCerrarOrderByImpuestoRentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idImpuestoRentaBusqueda")) {
				this.jButtonidImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaImpuestoRentaUpdate")) {
				this.jButtonid_empresaImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaImpuestoRentaBusqueda")) {
				this.jButtonid_empresaImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("desdeImpuestoRentaBusqueda")) {
				this.jButtondesdeImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hastaImpuestoRentaBusqueda")) {
				this.jButtonhastaImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuestoImpuestoRentaBusqueda")) {
				this.jButtonimpuestoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeImpuestoRentaBusqueda")) {
				this.jButtonporcentajeImpuestoRentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessImpuestoRenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoRentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				


				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ImpuestoRenta impuestorentaLocal=null;
			
			if(!this.getEsControlTabla()) {
				impuestorentaLocal=this.impuestorenta;
			} else {
				impuestorentaLocal=this.impuestorentaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
							
				
				


				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
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
			
			


			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoRentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
								
						
				


				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
								
				
				


				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoRentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
							
				
				


				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoRentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
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
			
			


			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoRentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
								
				
				


				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoRentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoRentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosImpuestoRenta")) {
					jCheckBoxSeleccionarTodosImpuestoRentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosImpuestoRenta")) {
					jCheckBoxSeleccionadosImpuestoRentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarImpuestoRenta")) {
					
				}
				
				


				
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
												
				
				


				
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoRentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoRentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
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
			
			


			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoRentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestorenta);
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
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
				
				


				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoRenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestorentaAnterior =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarImpuestoRenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosImpuestoRentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosImpuestoRenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.impuestorenta =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.impuestorenta =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.impuestorenta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarImpuestoRenta")) {
				
				}
				
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarImpuestoRenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosImpuestoRenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarImpuestoRenta")) {
			
			}
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessImpuestoRenta();
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
			if(sTipo.equals("NuevoImpuestoRenta")) {
				jButtonNuevoImpuestoRentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarImpuestoRenta")) {
				jButtonDuplicarImpuestoRentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarImpuestoRenta")) {
				jButtonCopiarImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormImpuestoRenta")) {
				jButtonVerFormImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesImpuestoRenta")) {
				jButtonNuevoImpuestoRentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarImpuestoRenta")) {
				jButtonModificarImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarImpuestoRenta")) {
				jButtonActualizarImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarImpuestoRenta")) {
				jButtonEliminarImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaImpuestoRenta")) {
				jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarImpuestoRenta")) {
				jButtonCancelarImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImpuestoRenta")) {
				jButtonCerrarImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosImpuestoRenta")) {
				jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosImpuestoRenta")) {
				jButtonNuevoGuardarCambiosImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByImpuestoRenta")) {
				jButtonAbrirOrderByImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionImpuestoRenta")) {
				jButtonRecargarInformacionImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresImpuestoRenta")) {
				jButtonAnterioresImpuestoRentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesImpuestoRenta")) {
				jButtonSiguientesImpuestoRentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idImpuestoRentaBusqueda")) {
				this.jButtonidImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaImpuestoRentaUpdate")) {
				this.jButtonid_empresaImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaImpuestoRentaBusqueda")) {
				this.jButtonid_empresaImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("desdeImpuestoRentaBusqueda")) {
				this.jButtondesdeImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hastaImpuestoRentaBusqueda")) {
				this.jButtonhastaImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuestoImpuestoRentaBusqueda")) {
				this.jButtonimpuestoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeImpuestoRentaBusqueda")) {
				this.jButtonporcentajeImpuestoRentaBusquedaActionPerformed(evt);
			}
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessImpuestoRenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameImpuestoRenta")) {
				closingInternalFrameImpuestoRenta();
				
			} else if(sTipo.equals("jButtonCancelarImpuestoRenta")) {
				JInternalFrameBase jInternalFrameDetalleFormImpuestoRenta = (JInternalFrameBase)evt.getSource();
	            	
	            ImpuestoRentaBeanSwingJInternalFrame jInternalFrameParent=(ImpuestoRentaBeanSwingJInternalFrame)jInternalFrameDetalleFormImpuestoRenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarImpuestoRentaActionPerformed(null);
			}
			
			ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.impuestorenta,new Object(),this.impuestorentaParameterGeneral,this.impuestorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormImpuestoRenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormImpuestoRenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormImpuestoRenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.impuestorenta)) {
			if(!esControlTabla) {
				if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);			
				}
				
				if(this.impuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualImpuestoRenta(this.impuestorenta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.impuestorentaReturnGeneral=impuestorentaLogic.procesarEventosImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.impuestorentaLogic.getImpuestoRentas(),this.impuestorenta,this.impuestorentaParameterGeneral,this.isEsNuevoImpuestoRenta,classes);//this.impuestorentaLogic.getImpuestoRenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanImpuestoRenta(this.impuestorentaReturnGeneral,this.impuestorentaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.impuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanImpuestoRenta(classes,this.impuestorentaReturnGeneral,this.impuestorentaBean,false);
					}
						
					if(this.impuestorentaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyImpuestoRenta(this.impuestorentaReturnGeneral.getImpuestoRenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioImpuestoRenta(this.impuestorentaReturnGeneral.getImpuestoRenta());	
					}
						
					if(this.impuestorentaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioImpuestoRenta(this.impuestorentaReturnGeneral.getImpuestoRenta(),classes);//this.impuestorentaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioImpuestoRenta(this.impuestorenta,classes);//this.impuestorentaBean);									
				}
			
				if(ImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualImpuestoRenta(this.impuestorenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoRenta(this.impuestorenta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.impuestorentaAnterior!=null) {
						this.impuestorenta=this.impuestorentaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.impuestorentaReturnGeneral=impuestorentaLogic.procesarEventosImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.impuestorentaLogic.getImpuestoRentas(),this.impuestorenta,this.impuestorentaParameterGeneral,this.isEsNuevoImpuestoRenta,classes);//this.impuestorentaLogic.getImpuestoRenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.impuestorentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.impuestorentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.impuestorentaReturnGeneral.getImpuestoRenta(),impuestorentaLogic.getImpuestoRentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.impuestorentaReturnGeneral.getImpuestoRenta(),this.impuestorentas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosImpuestoRenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosImpuestoRenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosImpuestoRenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosImpuestoRenta() throws Exception {
		
		ImpuestoRentaModel impuestorentaModel=(ImpuestoRentaModel)this.jTableDatosImpuestoRenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			impuestorentaModel.impuestorentas=this.impuestorentaLogic.getImpuestoRentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			impuestorentaModel.impuestorentas=this.impuestorentas;
		}
		
		
		((ImpuestoRentaModel) this.jTableDatosImpuestoRenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaImpuestoRenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getimpuestorentaAnterior(),this.impuestorentaLogic.getImpuestoRentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getimpuestorentaAnterior(),this.impuestorentas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosImpuestoRenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioImpuestoRenta(ImpuestoRenta impuestorenta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
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
										
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.impuestorenta,new Object(),generalEntityParameterGeneral,this.impuestorentaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.impuestorentaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ImpuestoRentaConstantesFunciones.getClassesRelationshipsOfImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ImpuestoRentaConstantesFunciones.getClassesRelationshipsFromStringsOfImpuestoRenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormImpuestoRenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.impuestorenta,new Object(),generalEntityParameterGeneral,this.impuestorentaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioImpuestoRenta(ImpuestoRentaBean impuestorentaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanImpuestoRenta(ArrayList<Classe> classes,ImpuestoRentaReturnGeneral impuestorentaReturnGeneral,ImpuestoRentaBean impuestorentaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualImpuestoRenta(ImpuestoRenta impuestorenta,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.impuestorenta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormImpuestoRenta = new ImpuestoRentaDetalleFormJInternalFrame(jDesktopPane,this.impuestorentaSessionBean.getConGuardarRelaciones(),this.impuestorentaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.setVisible(false);
		this.jInternalFrameDetalleFormImpuestoRenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormImpuestoRenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormImpuestoRenta.impuestorentaLogic=this.impuestorentaLogic;
		
		this.cargarCombosFrameForeignKeyImpuestoRenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleImpuestoRenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleImpuestoRenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyImpuestoRenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyImpuestoRenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormImpuestoRenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarImpuestoRenta"));
		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonModificarImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarImpuestoRenta"));

		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonModificarToolBarImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarImpuestoRenta"));
					
		this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemModificarImpuestoRenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonActualizarImpuestoRenta.addActionListener (new ButtonActionListener(this,"ActualizarImpuestoRenta"));
		
		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonActualizarToolBarImpuestoRenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarImpuestoRenta"));
						
		this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemActualizarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonEliminarImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarImpuestoRenta"));
		
		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonEliminarToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarImpuestoRenta"));
								
		this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemEliminarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonCancelarImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarImpuestoRenta"));
		
		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonCancelarToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarImpuestoRenta"));
					
		this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemCancelarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarImpuestoRenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemDetalleCerrarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarImpuestoRenta"));
		
		
		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarImpuestoRenta"));
		
		
		
		this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioImpuestoRenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonidImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"idImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonid_empresaImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonid_empresaImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtondesdeImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"desdeImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonhastaImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"hastaImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonimpuestoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"impuestoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonporcentajeImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeImpuestoRentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormImpuestoRenta.jTabbedPaneRelacionesImpuestoRenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesImpuestoRenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameImpuestoRenta"));
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarImpuestoRenta"));
		}
		
		this.jTableDatosImpuestoRenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarImpuestoRenta"));
		
		this.jTableDatosImpuestoRenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarImpuestoRenta"));
		
		this.jButtonNuevoImpuestoRenta.addActionListener(new ButtonActionListener(this,"NuevoImpuestoRenta"));
		
		this.jButtonDuplicarImpuestoRenta.addActionListener(new ButtonActionListener(this,"DuplicarImpuestoRenta"));
		
		this.jButtonCopiarImpuestoRenta.addActionListener(new ButtonActionListener(this,"CopiarImpuestoRenta"));
		
		this.jButtonVerFormImpuestoRenta.addActionListener(new ButtonActionListener(this,"VerFormImpuestoRenta"));
		
		
		this.jButtonNuevoToolBarImpuestoRenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarImpuestoRenta"));
			
		this.jButtonDuplicarToolBarImpuestoRenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarImpuestoRenta"));
			
		this.jMenuItemNuevoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoImpuestoRenta"));
			
		this.jMenuItemDuplicarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarImpuestoRenta"));		
		
		
		this.jButtonNuevoRelacionesImpuestoRenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesImpuestoRenta"));
		
		
		this.jButtonNuevoRelacionesToolBarImpuestoRenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarImpuestoRenta"));
			
		this.jMenuItemNuevoRelacionesImpuestoRenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesImpuestoRenta"));		
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonModificarImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonModificarToolBarImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarImpuestoRenta"));
			
			this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemModificarImpuestoRenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonActualizarImpuestoRenta.addActionListener (new ButtonActionListener(this,"ActualizarImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonActualizarToolBarImpuestoRenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarImpuestoRenta"));
				
			this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemActualizarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonEliminarImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonEliminarToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarImpuestoRenta"));
						
			this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemEliminarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonCancelarImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonCancelarToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarImpuestoRenta"));
			
			this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemCancelarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarImpuestoRenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarImpuestoRenta"));		
		
		
		this.jButtonCerrarImpuestoRenta.addActionListener (new ButtonActionListener(this,"CerrarImpuestoRenta"));
		
		
		this.jButtonCerrarToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarImpuestoRenta"));
			
		this.jMenuItemCerrarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarImpuestoRenta"));
			
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jMenuItemDetalleCerrarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarImpuestoRenta"));
		}
		
		this.jButtonCopiarToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarImpuestoRenta"));
			
		this.jButtonVerFormToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarImpuestoRenta"));
		
		this.jMenuItemGuardarCambiosImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosImpuestoRenta"));
			
		this.jMenuItemCopiarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarImpuestoRenta"));		
		
		this.jMenuItemVerFormImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormImpuestoRenta"));		
		
		
		this.jButtonGuardarCambiosTablaImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaImpuestoRenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarImpuestoRenta"));
			
		this.jMenuItemGuardarCambiosTablaImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaImpuestoRenta"));		
		
		
		
		this.jButtonRecargarInformacionImpuestoRenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionImpuestoRenta"));
					
		this.jButtonRecargarInformacionToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarImpuestoRenta"));
		
		this.jMenuItemRecargarInformacionImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionImpuestoRenta"));		
		
		
		
		this.jButtonAnterioresImpuestoRenta.addActionListener (new ButtonActionListener(this,"AnterioresImpuestoRenta"));
		
		
		this.jButtonAnterioresToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarImpuestoRenta"));
		
		this.jMenuItemAnterioresImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresImpuestoRenta"));		
		
		
		this.jButtonSiguientesImpuestoRenta.addActionListener (new ButtonActionListener(this,"SiguientesImpuestoRenta"));
		
		
		this.jButtonSiguientesToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarImpuestoRenta"));
			
		this.jMenuItemSiguientesImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesImpuestoRenta"));
			
		this.jMenuItemAbrirOrderByImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByImpuestoRenta"));
			
		this.jMenuItemMostrarOcultarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarImpuestoRenta"));
			
		this.jMenuItemDetalleAbrirOrderByImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByImpuestoRenta"));
			
		this.jMenuItemDetalleMostarOcultarImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarImpuestoRenta"));		
		
		
		this.jButtonNuevoGuardarCambiosImpuestoRenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosImpuestoRenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarImpuestoRenta"));
			
		this.jMenuItemNuevoGuardarCambiosImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosImpuestoRenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosImpuestoRenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosImpuestoRenta"));

		this.jCheckBoxSeleccionadosImpuestoRenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosImpuestoRenta"));
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioImpuestoRenta"));
		}
		
		
		this.jComboBoxTiposRelacionesImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesImpuestoRenta"));
			
		this.jComboBoxTiposAccionesImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesImpuestoRenta"));
					
		this.jComboBoxTiposSeleccionarImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarImpuestoRenta"));
			
		this.jTextFieldValorCampoGeneralImpuestoRenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralImpuestoRenta"));		
		
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonidImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"idImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonid_empresaImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonid_empresaImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtondesdeImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"desdeImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonhastaImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"hastaImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonimpuestoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"impuestoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonporcentajeImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeImpuestoRentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoImpuestoRenta!=null) {
				this.jInternalFrameReporteDinamicoImpuestoRenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoImpuestoRenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoImpuestoRenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoImpuestoRenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoImpuestoRenta"));				
			//this.jButtonGenerarReporteDinamicoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoImpuestoRenta"));
			//this.jButtonGenerarExcelReporteDinamicoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoImpuestoRenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionImpuestoRenta!=null) {
				this.jInternalFrameImportacionImpuestoRenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionImpuestoRenta"));
				this.jInternalFrameImportacionImpuestoRenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionImpuestoRenta"));
				this.jInternalFrameImportacionImpuestoRenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionImpuestoRenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByImpuestoRenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByImpuestoRenta"));
			
			this.jButtonAbrirOrderByToolBarImpuestoRenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarImpuestoRenta"));			
			
			if(this.jInternalFrameOrderByImpuestoRenta!=null) {
				this.jInternalFrameOrderByImpuestoRenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByImpuestoRenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoRenta.jTabbedPaneRelacionesImpuestoRenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesImpuestoRenta"));
		
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
            		closingInternalFrameImpuestoRenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormImpuestoRenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormImpuestoRenta = (JInternalFrameBase)event.getSource();
	            	
	            ImpuestoRentaBeanSwingJInternalFrame jInternalFrameParent=(ImpuestoRentaBeanSwingJInternalFrame)jInternalFrameDetalleFormImpuestoRenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarImpuestoRentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosImpuestoRenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosImpuestoRentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosImpuestoRenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosImpuestoRenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoImpuestoRenta";
		inputMap = this.jButtonNuevoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoImpuestoRentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesImpuestoRenta";
		inputMap = this.jButtonNuevoRelacionesImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoImpuestoRentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarImpuestoRenta";
		inputMap = this.jButtonModificarImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarImpuestoRenta";
		inputMap = this.jButtonActualizarImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarImpuestoRenta";
		inputMap = this.jButtonEliminarImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarImpuestoRenta";
		inputMap = this.jButtonCancelarImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarImpuestoRenta";
		inputMap = this.jButtonCerrarImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosImpuestoRenta";
		inputMap = this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonGuardarCambiosImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosImpuestoRenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosImpuestoRentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesImpuestoRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesImpuestoRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarImpuestoRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarImpuestoRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralImpuestoRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralImpuestoRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonidImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"idImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonid_empresaImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonid_empresaImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtondesdeImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"desdeImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonhastaImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"hastaImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonimpuestoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"impuestoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoRenta.jButtonporcentajeImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeImpuestoRentaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarImpuestoRentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarImpuestoRenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosImpuestoRenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ImpuestoRenta impuestorentaAux:this.impuestorentaLogic.getImpuestoRentas()) {
					impuestorentaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ImpuestoRenta impuestorentaAux:impuestorentas) {
					impuestorentaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosImpuestoRentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingImpuestoRenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ImpuestoRenta impuestorentaAux:this.impuestorentaLogic.getImpuestoRentas()) {
						impuestorentaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ImpuestoRenta impuestorentaAux:impuestorentas) {
						impuestorentaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ImpuestoRenta impuestorentaAux:this.impuestorentaLogic.getImpuestoRentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ImpuestoRenta impuestorentaAux:impuestorentas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaImpuestoRenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosImpuestoRenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosImpuestoRenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosImpuestoRenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosImpuestoRentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingImpuestoRenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosImpuestoRenta.getSelectedRows();
			
			ImpuestoRenta impuestorentaLocal=new ImpuestoRenta();
			
			//this.seleccionarTodosImpuestoRenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					impuestorentaLocal =(ImpuestoRenta) this.impuestorentaLogic.getImpuestoRentas().toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					impuestorentaLocal =(ImpuestoRenta) this.impuestorentas.toArray()[this.jTableDatosImpuestoRenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				impuestorentaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ImpuestoRenta impuestorentaAux:this.impuestorentaLogic.getImpuestoRentas()) {
						impuestorentaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ImpuestoRenta impuestorentaAux:impuestorentas) {
						impuestorentaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaImpuestoRenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosImpuestoRenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosImpuestoRenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosImpuestoRenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualImpuestoRentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarImpuestoRentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralImpuestoRentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingImpuestoRenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralImpuestoRenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ImpuestoRenta impuestorentaAux:this.impuestorentaLogic.getImpuestoRentas()) {
				
						if(sTipoSeleccionar.equals(ImpuestoRentaConstantesFunciones.LABEL_DESDE)) {
							existe=true;
							impuestorentaAux.setdesde(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ImpuestoRentaConstantesFunciones.LABEL_HASTA)) {
							existe=true;
							impuestorentaAux.sethasta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO)) {
							existe=true;
							impuestorentaAux.setimpuesto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							impuestorentaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ImpuestoRenta impuestorentaAux:impuestorentas) {
					
						if(sTipoSeleccionar.equals(ImpuestoRentaConstantesFunciones.LABEL_DESDE)) {
							existe=true;
							impuestorentaAux.setdesde(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ImpuestoRentaConstantesFunciones.LABEL_HASTA)) {
							existe=true;
							impuestorentaAux.sethasta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO)) {
							existe=true;
							impuestorentaAux.setimpuesto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							impuestorentaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaImpuestoRenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesImpuestoRentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingImpuestoRenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioImpuestoRenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesImpuestoRenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteImpuestoRenta) {				
					conSplash=true;//false;										
					
					//this.startProcessImpuestoRenta(conSplash);
				
					this.generarReporteImpuestoRentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoImpuestoRentasSeleccionados();
				//this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoImpuestoRentasSeleccionados(false);
				//this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoImpuestoRentasSeleccionados(true);
				//this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessImpuestoRenta();
				
				this.exportarImpuestoRentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionImpuestoRentas();
				//this.importarImpuestoRentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessImpuestoRenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelImpuestoRentasSeleccionados();
				//this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessImpuestoRenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoImpuestoRenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyImpuestoRenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.setSelectedIndex(0);					
				}	
			} 			
			else if(ImpuestoRentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteImpuestoRenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessImpuestoRenta(conSplash);
					
						//this.actualizarParametrosGeneralImpuestoRenta();
						
						this.generarReporteProcesoAccionImpuestoRentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ImpuestoRentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Impuesto RentaS SELECCIONADOS?", "MANTENIMIENTO DE Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessImpuestoRenta();
				
						this.actualizarParametrosGeneralImpuestoRenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.impuestorentaReturnGeneral=impuestorentaLogic.procesarAccionImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.impuestorentaLogic.getImpuestoRentas(),this.impuestorentaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarImpuestoRentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralImpuestoRenta();
					
					ImpuestoRentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarImpuestoRentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesImpuestoRenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxTiposAccionesFormularioImpuestoRenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessImpuestoRenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesImpuestoRentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessImpuestoRenta();
			
			if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();		
			ImpuestoRenta impuestorenta=new ImpuestoRenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingImpuestoRenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesImpuestoRenta.getSelectedItem();
			
			
			
			
			impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(impuestorentasSeleccionados.size()==1) {
				for(ImpuestoRenta impuestorentaAux:impuestorentasSeleccionados) {
					impuestorenta=impuestorentaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessImpuestoRenta();
			
      		//this.finishProcessImpuestoRenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarImpuestoRentaReturnGeneral() throws Exception {
		if(this.impuestorentaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.impuestorentaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.impuestorentaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.impuestorentaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.impuestorentaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.impuestorentaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingImpuestoRenta(false);
		}
		
		if(this.impuestorentaReturnGeneral.getConRetornoLista() || this.impuestorentaReturnGeneral.getConRetornoObjeto()) {
			if(this.impuestorentaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.impuestorentaLogic.setImpuestoRentas(this.impuestorentaReturnGeneral.getImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.impuestorentaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.impuestorentaLogic.setImpuestoRenta(this.impuestorentaReturnGeneral.getImpuestoRenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingImpuestoRenta(false);
		}
	}
	
	public void actualizarParametrosGeneralImpuestoRenta() throws Exception {
		
		
	}
	
	public ArrayList<ImpuestoRenta> getImpuestoRentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioImpuestoRenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ImpuestoRenta impuestorentaAux:impuestorentaLogic.getImpuestoRentas()) {
					if(impuestorentaAux.getIsSelected()) {
						impuestorentasSeleccionados.add(impuestorentaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ImpuestoRenta impuestorentaAux:this.impuestorentas) {
					if(impuestorentaAux.getIsSelected()) {
						impuestorentasSeleccionados.add(impuestorentaAux);				
					}
				}
			}
			
			if(impuestorentasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						impuestorentasSeleccionados.addAll(this.impuestorentaLogic.getImpuestoRentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						impuestorentasSeleccionados.addAll(this.impuestorentas);				
					}
				}
			}
		} else {
			impuestorentasSeleccionados.add(this.impuestorenta);
		}
		
		return impuestorentasSeleccionados;
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
	
	public void generarReporteImpuestoRentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalImpuestoRentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoImpuestoRentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoImpuestoRentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoImpuestoRentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Impuesto Renta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();		
		
		impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteImpuestoRentas("Todos",impuestorentasSeleccionados);
		
	}	
	
	public void generarReporteNormalImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();		
		
		impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteImpuestoRentas("Todos",impuestorentasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionImpuestoRentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();
		
		impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteImpuestoRentas("Todos",impuestorentasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoImpuestoRenta();
		
		
		impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoImpuestoRenta();
		
		
		//this.generarReporteImpuestoRentas("Todos",impuestorentasSeleccionados ,impuestorentaImplementable,impuestorentaImplementableHome);
	}
	
	public void mostrarImportacionImpuestoRentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionImpuestoRenta();
		
		this.abrirFrameImportacionImpuestoRenta();		
		
			
		//this.generarReporteImpuestoRentas("Todos",impuestorentasSeleccionados ,impuestorentaImplementable,impuestorentaImplementableHome);
	}
	
	public void importarImpuestoRentas() throws Exception {		
	
	}
	
	public void exportarImpuestoRentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelImpuestoRentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoImpuestoRentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlImpuestoRentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Impuesto Renta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();		
		
		impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestorenta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarImpuestoRenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ImpuestoRenta impuestorentaAux:impuestorentasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarImpuestoRenta(impuestorentaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//impuestorentaAux.setsDetalleGeneralEntityReporte(impuestorentaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarImpuestoRenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ImpuestoRentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImpuestoRentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImpuestoRentaConstantesFunciones.LABEL_DESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImpuestoRentaConstantesFunciones.LABEL_HASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarImpuestoRenta(ImpuestoRenta impuestorenta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=impuestorenta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=impuestorenta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=impuestorenta.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=impuestorenta.getdesde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=impuestorenta.gethasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=impuestorenta.getimpuesto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=impuestorenta.getporcentaje().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();		
		
		impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestorenta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ImpuestoRentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelImpuestoRenta(row);				
				iRow++;
			}				
			
			for(ImpuestoRenta impuestorentaAux:impuestorentasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelImpuestoRenta(impuestorentaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();		
		
		impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestorenta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("impuestorentas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("impuestorenta");
			//elementRoot.appendChild(element);
		
			for(ImpuestoRenta impuestorentaAux:impuestorentasSeleccionados) {
				element = document.createElement("impuestorenta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlImpuestoRenta(impuestorentaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelImpuestoRenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_DESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_HASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelImpuestoRenta(ImpuestoRenta impuestorenta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(impuestorenta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(impuestorenta.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(impuestorenta.getdesde());
		cell = row.createCell(iColumn++);cell.setCellValue(impuestorenta.gethasta());
		cell = row.createCell(iColumn++);cell.setCellValue(impuestorenta.getimpuesto());
		cell = row.createCell(iColumn++);cell.setCellValue(impuestorenta.getporcentaje());				
	}
	
	public void setFilaDatosExportarXmlImpuestoRenta(ImpuestoRenta impuestorenta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ImpuestoRentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(impuestorenta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ImpuestoRentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(impuestorenta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ImpuestoRentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(impuestorenta.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementdesde = document.createElement(ImpuestoRentaConstantesFunciones.DESDE);
		elementdesde.appendChild(document.createTextNode(impuestorenta.getdesde().toString().trim()));
		element.appendChild(elementdesde);

		Element elementhasta = document.createElement(ImpuestoRentaConstantesFunciones.HASTA);
		elementhasta.appendChild(document.createTextNode(impuestorenta.gethasta().toString().trim()));
		element.appendChild(elementhasta);

		Element elementimpuesto = document.createElement(ImpuestoRentaConstantesFunciones.IMPUESTO);
		elementimpuesto.appendChild(document.createTextNode(impuestorenta.getimpuesto().toString().trim()));
		element.appendChild(elementimpuesto);

		Element elementporcentaje = document.createElement(ImpuestoRentaConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(impuestorenta.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);
	}
	
	public void generarReporteGroupGenericoImpuestoRentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ImpuestoRenta> impuestorentasSeleccionados=new ArrayList<ImpuestoRenta>();
		
		impuestorentasSeleccionados=this.getImpuestoRentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoImpuestoRenta(impuestorentasSeleccionados);
		
		this.generarReporteImpuestoRentas("Todos",impuestorentasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoImpuestoRenta(ArrayList<ImpuestoRenta> impuestorentasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ImpuestoRenta impuestorentaAux:impuestorentasSeleccionados) {
				impuestorentaAux.setsDetalleGeneralEntityReporte(impuestorentaAux.toString());
			
				if(sTipoSeleccionar.equals(ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					impuestorentaAux.setsDescripcionGeneralEntityReporte1(impuestorentaAux.getempresa_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesImpuestoRenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoImpuestoRenta=true;
				this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=true;
				this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=true;
			}
			
			this.isVisibilidadCeldaModificarImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarImpuestoRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoRenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=false;
			this.isVisibilidadCeldaModificarImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarImpuestoRenta=true;
			this.isVisibilidadCeldaEliminarImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoRenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=false;
			this.isVisibilidadCeldaModificarImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarImpuestoRenta=true;
			this.isVisibilidadCeldaEliminarImpuestoRenta=true;
			this.isVisibilidadCeldaCancelarImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoRenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=false;
			this.isVisibilidadCeldaModificarImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarImpuestoRenta=true;
			this.isVisibilidadCeldaEliminarImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoRenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoImpuestoRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=true;
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=true;
			this.isVisibilidadCeldaModificarImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarImpuestoRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoRenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarImpuestoRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoRenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=false;
			this.isVisibilidadCeldaModificarImpuestoRenta=true;
			this.isVisibilidadCeldaActualizarImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoRenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ImpuestoRentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoImpuestoRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=true;
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=true;
		} else {
			this.actualizarEstadoPanelsImpuestoRenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarImpuestoRenta=false;
			//this.isVisibilidadCeldaVerFormImpuestoRenta=false;
			this.isVisibilidadCeldaDuplicarImpuestoRenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!impuestorentaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=false;
		} else {
			this.isVisibilidadCeldaNuevoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoRenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(impuestorentaSessionBean.getEsGuardarRelacionado()) {
			if(!impuestorentaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=false;												
			}
			
			this.jButtonCerrarImpuestoRenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesImpuestoRenta=false;
		}
		
		if(!this.permiteMantenimiento(this.impuestorenta)) {
			this.isVisibilidadCeldaActualizarImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarImpuestoRenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesImpuestoRenta() {
	}
	
	public void actualizarEstadoPanelsImpuestoRenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionImpuestoRenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoRenta!=null) {
				this.jScrollPanelDatosImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionImpuestoRenta!=null) {
				this.jPanelPaginacionImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImpuestoRenta!=null) {
				this.jPanelParametrosReportesImpuestoRenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionImpuestoRenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasImpuestoRenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosImpuestoRenta!=null) {
				this.jScrollPanelDatosImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionImpuestoRenta!=null) {
				this.jPanelPaginacionImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesImpuestoRenta!=null) {
				this.jPanelParametrosReportesImpuestoRenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionImpuestoRenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasImpuestoRenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoRenta!=null) {
				this.jScrollPanelDatosImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionImpuestoRenta!=null) {
				this.jPanelPaginacionImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesImpuestoRenta!=null) {
				this.jPanelParametrosReportesImpuestoRenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionImpuestoRenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasImpuestoRenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoRenta!=null) {
				this.jScrollPanelDatosImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionImpuestoRenta!=null) {
				this.jPanelPaginacionImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesImpuestoRenta!=null) {
				this.jPanelParametrosReportesImpuestoRenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionImpuestoRenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoRenta!=null) {
				this.jScrollPanelDatosImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionImpuestoRenta!=null) {
				this.jPanelPaginacionImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImpuestoRenta!=null) {
				this.jPanelParametrosReportesImpuestoRenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionImpuestoRenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoRenta!=null) {
				this.jScrollPanelDatosImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionImpuestoRenta!=null) {
				this.jPanelPaginacionImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImpuestoRenta!=null) {
				this.jPanelParametrosReportesImpuestoRenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionImpuestoRenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoRenta!=null) {
				this.jScrollPanelDatosImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionImpuestoRenta!=null) {
				this.jPanelPaginacionImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImpuestoRenta!=null) {
				this.jPanelParametrosReportesImpuestoRenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasImpuestoRenta!=null) {
					this.jTabbedPaneBusquedasImpuestoRenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesImpuestoRenta!=null) {
				this.jPanelParametrosReportesImpuestoRenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasImpuestoRenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesImpuestoRenta!=null) {
				this.jPanelParametrosReportesImpuestoRenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ImpuestoRentaSessionBean impuestorentaSessionBean=new ImpuestoRentaSessionBean();
		
		if(this.impuestorentaSessionBean==null) {
			this.impuestorentaSessionBean=new ImpuestoRentaSessionBean();
		}
		
		this.impuestorentaSessionBean.setsUltimaBusquedaImpuestoRenta(this.getsAccionBusqueda());
		this.impuestorentaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.impuestorentaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			impuestorentaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ImpuestoRentaSessionBean impuestorentaSessionBean=new ImpuestoRentaSessionBean();
		
		if(this.impuestorentaSessionBean==null) {
			this.impuestorentaSessionBean=new ImpuestoRentaSessionBean();
		}
		
		if(this.impuestorentaSessionBean.getsUltimaBusquedaImpuestoRenta()!=null&&!this.impuestorentaSessionBean.getsUltimaBusquedaImpuestoRenta().equals("")) {
			this.setsAccionBusqueda(impuestorentaSessionBean.getsUltimaBusquedaImpuestoRenta());
			this.setiNumeroPaginacion(impuestorentaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(impuestorentaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(impuestorentaSessionBean.getid_empresa());
				impuestorentaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.impuestorentaSessionBean.setsUltimaBusquedaImpuestoRenta("");
		this.impuestorentaSessionBean.setiNumeroPaginacion(ImpuestoRentaConstantesFunciones.INUMEROPAGINACION);
		this.impuestorentaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaImpuestoRenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioImpuestoRenta() {
		this.updateBorderResaltarBusquedasFormularioImpuestoRenta();
		this.updateVisibilidadBusquedasFormularioImpuestoRenta();
		this.updateHabilitarBusquedasFormularioImpuestoRenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioImpuestoRenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasImpuestoRenta.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioImpuestoRenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasImpuestoRenta.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioImpuestoRenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasImpuestoRenta.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaImpuestoRenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarImpuestoRenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioImpuestoRenta() throws Exception {

		if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioImpuestoRenta();
		this.updateVisibilidadResaltarControlesFormularioImpuestoRenta();
		this.updateHabilitarResaltarControlesFormularioImpuestoRenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioImpuestoRenta() throws Exception {
		if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.impuestorentaConstantesFunciones.resaltaridImpuestoRenta!=null && this.jInternalFrameDetalleFormImpuestoRenta!=null) {this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.setBorder(this.impuestorentaConstantesFunciones.resaltaridImpuestoRenta);}
		if(this.impuestorentaConstantesFunciones.resaltarid_empresaImpuestoRenta!=null && this.jInternalFrameDetalleFormImpuestoRenta!=null) {this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.setBorder(this.impuestorentaConstantesFunciones.resaltarid_empresaImpuestoRenta);}
		if(this.impuestorentaConstantesFunciones.resaltardesdeImpuestoRenta!=null && this.jInternalFrameDetalleFormImpuestoRenta!=null) {this.jInternalFrameDetalleFormImpuestoRenta.jTextFielddesdeImpuestoRenta.setBorder(this.impuestorentaConstantesFunciones.resaltardesdeImpuestoRenta);}
		if(this.impuestorentaConstantesFunciones.resaltarhastaImpuestoRenta!=null && this.jInternalFrameDetalleFormImpuestoRenta!=null) {this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldhastaImpuestoRenta.setBorder(this.impuestorentaConstantesFunciones.resaltarhastaImpuestoRenta);}
		if(this.impuestorentaConstantesFunciones.resaltarimpuestoImpuestoRenta!=null && this.jInternalFrameDetalleFormImpuestoRenta!=null) {this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldimpuestoImpuestoRenta.setBorder(this.impuestorentaConstantesFunciones.resaltarimpuestoImpuestoRenta);}
		if(this.impuestorentaConstantesFunciones.resaltarporcentajeImpuestoRenta!=null && this.jInternalFrameDetalleFormImpuestoRenta!=null) {this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldporcentajeImpuestoRenta.setBorder(this.impuestorentaConstantesFunciones.resaltarporcentajeImpuestoRenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioImpuestoRenta() throws Exception {		
		if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
	
		//this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostraridImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jPanelidImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostraridImpuestoRenta);
		//this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostrarid_empresaImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jPanelid_empresaImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostrarid_empresaImpuestoRenta);
		//this.jInternalFrameDetalleFormImpuestoRenta.jTextFielddesdeImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostrardesdeImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jPaneldesdeImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostrardesdeImpuestoRenta);
		//this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldhastaImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostrarhastaImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jPanelhastaImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostrarhastaImpuestoRenta);
		//this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldimpuestoImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostrarimpuestoImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jPanelimpuestoImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostrarimpuestoImpuestoRenta);
		//this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldporcentajeImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostrarporcentajeImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jPanelporcentajeImpuestoRenta.setVisible(this.impuestorentaConstantesFunciones.mostrarporcentajeImpuestoRenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioImpuestoRenta() throws Exception {
		if(this.jInternalFrameDetalleFormImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormImpuestoRenta!=null) {
	
		this.jInternalFrameDetalleFormImpuestoRenta.jLabelidImpuestoRenta.setEnabled(this.impuestorentaConstantesFunciones.activaridImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jComboBoxid_empresaImpuestoRenta.setEnabled(this.impuestorentaConstantesFunciones.activarid_empresaImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jTextFielddesdeImpuestoRenta.setEnabled(this.impuestorentaConstantesFunciones.activardesdeImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldhastaImpuestoRenta.setEnabled(this.impuestorentaConstantesFunciones.activarhastaImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldimpuestoImpuestoRenta.setEnabled(this.impuestorentaConstantesFunciones.activarimpuestoImpuestoRenta);
		this.jInternalFrameDetalleFormImpuestoRenta.jTextFieldporcentajeImpuestoRenta.setEnabled(this.impuestorentaConstantesFunciones.activarporcentajeImpuestoRenta);
		}
	}
	
		
}