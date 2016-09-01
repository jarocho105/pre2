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

import com.bydan.erp.facturacion.util.TasaConstantesFunciones;
import com.bydan.erp.facturacion.util.TasaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TasaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TasaBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TasaBeanSwingJInternalFrame extends TasaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TasaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Tasa> tasaValidator = new ClassValidator<Tasa>(Tasa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Tasa tasa;	
	public Tasa tasaAux;
	public Tasa tasaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Tasa tasaTotales;
	public Long idTasaActual;
	public Long iIdNuevoTasa=0L;
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
	
	public Boolean isPermisoTodoTasa;
	public Boolean isPermisoNuevoTasa;
	public Boolean isPermisoActualizarTasa;
	public Boolean isPermisoActualizarOriginalTasa;
	public Boolean isPermisoEliminarTasa;
	public Boolean isPermisoGuardarCambiosTasa;
	public Boolean isPermisoConsultaTasa;
	public Boolean isPermisoBusquedaTasa;
	public Boolean isPermisoReporteTasa;
	public Boolean isPermisoPaginacionMedioTasa;
	public Boolean isPermisoPaginacionAltoTasa;
	public Boolean isPermisoPaginacionTodoTasa;
	public Boolean isPermisoCopiarTasa;
	public Boolean isPermisoVerFormTasa;
	public Boolean isPermisoDuplicarTasa;
	public Boolean isPermisoOrdenTasa;
	
	
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
	
	public TasaParameterReturnGeneral tasaReturnGeneral;
	public TasaParameterReturnGeneral tasaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTasa=false;
	public Boolean esParaAccionDesdeFormularioTasa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TasaSessionBeanAdditional tasaSessionBeanAdditional=null;
	
	public TasaSessionBeanAdditional getTasaSessionBeanAdditional() {
		return this.tasaSessionBeanAdditional;
	}
	
	public void setTasaSessionBeanAdditional(TasaSessionBeanAdditional tasaSessionBeanAdditional) {
		try {
			this.tasaSessionBeanAdditional=tasaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TasaBeanSwingJInternalFrameAdditional tasaBeanSwingJInternalFrameAdditional=null;
	//public class TasaBeanSwingJInternalFrame
	
	public TasaBeanSwingJInternalFrameAdditional getTasaBeanSwingJInternalFrameAdditional() {
		return this.tasaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTasaBeanSwingJInternalFrameAdditional(TasaBeanSwingJInternalFrameAdditional tasaBeanSwingJInternalFrameAdditional) {
		try {
			this.tasaBeanSwingJInternalFrameAdditional=tasaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TasaLogic tasaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Tasa tasaBean;
	public TasaConstantesFunciones tasaConstantesFunciones;
	//public TasaParameterReturnGeneral tasaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Tasa> tasas;	
	//public List<Tasa> tasasEliminados;
	//public List<Tasa> tasasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTasa=false;
	public Boolean isVisibilidadCeldaDuplicarTasa=true;
	public Boolean isVisibilidadCeldaCopiarTasa=true;
	public Boolean isVisibilidadCeldaVerFormTasa=true;
	public Boolean isVisibilidadCeldaOrdenTasa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTasa=false;
	public Boolean isVisibilidadCeldaModificarTasa=false;
	public Boolean isVisibilidadCeldaActualizarTasa=false;
	public Boolean isVisibilidadCeldaEliminarTasa=false;
	public Boolean isVisibilidadCeldaCancelarTasa=false;
	public Boolean isVisibilidadCeldaGuardarTasa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTasa=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTasa() {
		return this.iIdNuevoTasa;
	}

	public void setiIdNuevoTasa(Long iIdNuevoTasa) {
		this.iIdNuevoTasa = iIdNuevoTasa;
	}
	
	public Long getidTasaActual() {
		return this.idTasaActual;
	}

	public void setidTasaActual(Long idTasaActual) {
		this.idTasaActual = idTasaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Tasa gettasa() {
		return this.tasa;
	}

	public void settasa(Tasa tasa) {
		this.tasa = tasa;
	}
	
	public Tasa gettasaAux() {
		return this.tasaAux;
	}

	public void settasaAux(Tasa tasaAux) {
		this.tasaAux = tasaAux;
	}				
	
	public Tasa gettasaAnterior() {
		return this.tasaAnterior;
	}

	public void settasaAnterior(Tasa tasaAnterior) {
		this.tasaAnterior = tasaAnterior;
	}	
	
	public Tasa gettasaTotales() {
		return this.tasaTotales;
	}

	public void settasaTotales(Tasa tasaTotales) {
		this.tasaTotales = tasaTotales;
	}	
	
	public Tasa gettasaBean() {
		return this.tasaBean;
	}

	public void settasaBean(Tasa tasaBean) {
		this.tasaBean = tasaBean;
	}	
	
	public TasaParameterReturnGeneral gettasaReturnGeneral() {
		return this.tasaReturnGeneral;
	}

	public void settasaReturnGeneral(TasaParameterReturnGeneral tasaReturnGeneral) {
		this.tasaReturnGeneral = tasaReturnGeneral;
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
	
	
	public TasaLogic getTasaLogic()	{		
		return tasaLogic;
	}

	public void setTasaLogic(TasaLogic tasaLogic) {
		this.tasaLogic = tasaLogic;
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
	
	public Boolean getIsEsNuevoTasa() {
		return isEsNuevoTasa;
	}

	public void setIsEsNuevoTasa(Boolean isEsNuevoTasa) {
		this.isEsNuevoTasa = isEsNuevoTasa;
	}

	public Boolean getEsParaAccionDesdeFormularioTasa() {
		return esParaAccionDesdeFormularioTasa;
	}
	
	public void setEsParaAccionDesdeFormularioTasa(Boolean esParaAccionDesdeFormularioTasa) {
		this.esParaAccionDesdeFormularioTasa = esParaAccionDesdeFormularioTasa;
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

			if(this.tasaSessionBean==null) {
				this.tasaSessionBean=new TasaSessionBean();
			}

			if(!this.tasaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tasaSessionBean.getlidEmpresaActual());
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

					if(this.tasa!=null) {
						this.tasa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTasa!=null) {
						this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTasa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTasa!=null) {
						if(this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTasaGenerico)throws Exception
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
				jComboBoxid_empresaTasaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTasaGenerico!=null && jComboBoxid_empresaTasaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTasaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Tasa tasa,JComboBox jComboBoxid_empresaTasaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTasaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTasaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tasa.setid_empresa(empresaAux.getId());
				tasa.setempresa_descripcion(TasaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tasa.setEmpresa(empresaAux);			}
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

					if(!TasaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTasa!=null) { 
							this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTasa!=null) { 
					}

					if(!TasaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTasa!=null) {
							this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTasa!=null) {
							this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTasa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TasaConstantesFunciones.refrescarForeignKeysDescripcionesTasa(this.tasaLogic.getTasas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TasaConstantesFunciones.refrescarForeignKeysDescripcionesTasa(this.tasas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tasaLogic.setTasas(this.tasas);
			tasaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TasaParameterReturnGeneral getTasaParameterGeneral() {
		return this.tasaParameterGeneral;
	}
	
	public void setTasaParameterGeneral(TasaParameterReturnGeneral tasaParameterGeneral) {
		this.tasaParameterGeneral = tasaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTasa() {
		return isPermisoTodoTasa;
	}

	public void setIsPermisoTodoTasa(Boolean isPermisoTodoTasa) {
		this.isPermisoTodoTasa = isPermisoTodoTasa;
	}

	public Boolean getIsPermisoNuevoTasa() {
		return isPermisoNuevoTasa;
	}

	public void setIsPermisoNuevoTasa(Boolean isPermisoNuevoTasa) {
		this.isPermisoNuevoTasa = isPermisoNuevoTasa;
	}

	public Boolean getIsPermisoActualizarTasa() {
		return isPermisoActualizarTasa;
	}

	public void setIsPermisoActualizarTasa(Boolean isPermisoActualizarTasa) {
		this.isPermisoActualizarTasa = isPermisoActualizarTasa;
	}

	public Boolean getIsPermisoEliminarTasa() {
		return isPermisoEliminarTasa;
	}

	public void setIsPermisoEliminarTasa(Boolean isPermisoEliminarTasa) {
		this.isPermisoEliminarTasa = isPermisoEliminarTasa;
	}

	public Boolean getIsPermisoGuardarCambiosTasa() {
		return isPermisoGuardarCambiosTasa;
	}

	public void setIsPermisoGuardarCambiosTasa(Boolean isPermisoGuardarCambiosTasa) {
		this.isPermisoGuardarCambiosTasa = isPermisoGuardarCambiosTasa;
	}
	
	public Boolean getIsPermisoConsultaTasa() {
		return isPermisoConsultaTasa;
	}

	public void setIsPermisoConsultaTasa(Boolean isPermisoConsultaTasa) {
		this.isPermisoConsultaTasa = isPermisoConsultaTasa;
	}

	public Boolean getIsPermisoBusquedaTasa() {
		return isPermisoBusquedaTasa;
	}

	public void setIsPermisoBusquedaTasa(Boolean isPermisoBusquedaTasa) {
		this.isPermisoBusquedaTasa = isPermisoBusquedaTasa;
	}

	public Boolean getIsPermisoReporteTasa() {
		return isPermisoReporteTasa;
	}

	public void setIsPermisoReporteTasa(Boolean isPermisoReporteTasa) {
		this.isPermisoReporteTasa = isPermisoReporteTasa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTasa() {
		return isPermisoPaginacionMedioTasa;
	}

	public void setIsPermisoPaginacionMedioTasa(Boolean isPermisoPaginacionMedioTasa) {
		this.isPermisoPaginacionMedioTasa = isPermisoPaginacionMedioTasa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTasa() {
		return isPermisoPaginacionTodoTasa;
	}

	public void setIsPermisoPaginacionTodoTasa(Boolean isPermisoPaginacionTodoTasa) {
		this.isPermisoPaginacionTodoTasa = isPermisoPaginacionTodoTasa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTasa() {
		return isPermisoPaginacionAltoTasa;
	}

	public void setIsPermisoPaginacionAltoTasa(Boolean isPermisoPaginacionAltoTasa) {
		this.isPermisoPaginacionAltoTasa = isPermisoPaginacionAltoTasa;
	}
	
	public Boolean getIsPermisoCopiarTasa() {
		return isPermisoCopiarTasa;
	}

	public void setIsPermisoCopiarTasa(Boolean isPermisoCopiarTasa) {
		this.isPermisoCopiarTasa = isPermisoCopiarTasa;
	}
	
	public Boolean getIsPermisoVerFormTasa() {
		return isPermisoVerFormTasa;
	}

	public void setIsPermisoVerFormTasa(Boolean isPermisoVerFormTasa) {
		this.isPermisoVerFormTasa = isPermisoVerFormTasa;
	}
	
	public Boolean getIsPermisoDuplicarTasa() {
		return isPermisoDuplicarTasa;
	}

	public void setIsPermisoDuplicarTasa(Boolean isPermisoDuplicarTasa) {
		this.isPermisoDuplicarTasa = isPermisoDuplicarTasa;
	}
	
	public Boolean getIsPermisoOrdenTasa() {
		return isPermisoOrdenTasa;
	}

	public void setIsPermisoOrdenTasa(Boolean isPermisoOrdenTasa) {
		this.isPermisoOrdenTasa = isPermisoOrdenTasa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTasa() {
		return isVisibilidadCeldaNuevoTasa;
	}

	public void setIsVisibilidadCeldaNuevoTasa(Boolean isVisibilidadCeldaNuevoTasa) {
		this.isVisibilidadCeldaNuevoTasa = isVisibilidadCeldaNuevoTasa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTasa() {
		return isVisibilidadCeldaDuplicarTasa;
	}

	public void setIsVisibilidadCeldaDuplicarTasa(Boolean isVisibilidadCeldaDuplicarTasa) {
		this.isVisibilidadCeldaDuplicarTasa = isVisibilidadCeldaDuplicarTasa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTasa() {
		return isVisibilidadCeldaCopiarTasa;
	}

	public void setIsVisibilidadCeldaCopiarTasa(Boolean isVisibilidadCeldaCopiarTasa) {
		this.isVisibilidadCeldaCopiarTasa = isVisibilidadCeldaCopiarTasa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTasa() {
		return isVisibilidadCeldaVerFormTasa;
	}

	public void setIsVisibilidadCeldaVerFormTasa(Boolean isVisibilidadCeldaVerFormTasa) {
		this.isVisibilidadCeldaVerFormTasa = isVisibilidadCeldaVerFormTasa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTasa() {
		return isVisibilidadCeldaOrdenTasa;
	}

	public void setIsVisibilidadCeldaOrdenTasa(Boolean isVisibilidadCeldaOrdenTasa) {
		this.isVisibilidadCeldaOrdenTasa = isVisibilidadCeldaOrdenTasa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTasa() {
		return isVisibilidadCeldaNuevoRelacionesTasa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTasa(Boolean isVisibilidadCeldaNuevoRelacionesTasa) {
		this.isVisibilidadCeldaNuevoRelacionesTasa = isVisibilidadCeldaNuevoRelacionesTasa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTasa() {
		return isVisibilidadCeldaModificarTasa;
	}

	public void setIsVisibilidadCeldaModificarTasa(Boolean isVisibilidadCeldaModificarTasa) {
		this.isVisibilidadCeldaModificarTasa = isVisibilidadCeldaModificarTasa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTasa() {
		return isVisibilidadCeldaActualizarTasa;
	}

	public void setIsVisibilidadCeldaActualizarTasa(Boolean isVisibilidadCeldaActualizarTasa) {
		this.isVisibilidadCeldaActualizarTasa = isVisibilidadCeldaActualizarTasa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTasa() {
		return isVisibilidadCeldaEliminarTasa;
	}

	public void setIsVisibilidadCeldaEliminarTasa(Boolean isVisibilidadCeldaEliminarTasa) {
		this.isVisibilidadCeldaEliminarTasa = isVisibilidadCeldaEliminarTasa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTasa() {
		return isVisibilidadCeldaCancelarTasa;
	}

	public void setIsVisibilidadCeldaCancelarTasa(Boolean isVisibilidadCeldaCancelarTasa) {
		this.isVisibilidadCeldaCancelarTasa = isVisibilidadCeldaCancelarTasa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTasa() {
		return isVisibilidadCeldaGuardarTasa;
	}

	public void setIsVisibilidadCeldaGuardarTasa(Boolean isVisibilidadCeldaGuardarTasa) {
		this.isVisibilidadCeldaGuardarTasa = isVisibilidadCeldaGuardarTasa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTasa() {
		return isVisibilidadCeldaGuardarCambiosTasa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTasa(Boolean isVisibilidadCeldaGuardarCambiosTasa) {
		this.isVisibilidadCeldaGuardarCambiosTasa = isVisibilidadCeldaGuardarCambiosTasa;
	}
		
	public TasaSessionBean gettasaSessionBean() {
		return this.tasaSessionBean;
	}
	
	public void settasaSessionBean(TasaSessionBean tasaSessionBean) {
		this.tasaSessionBean=tasaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTasa(Tasa tasa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tasa,null);
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
	
	public void bugActualizarReferenciaActual(Tasa tasa,Tasa tasaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTasa(tasa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tasaAux.setId(tasa.getId());
		tasaAux.setVersionRow(tasa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTasa();
		
			int intSelectedRow = this.jTableDatosTasa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TasaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTasa(this.tasa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tasaValidator.getInvalidValues(this.tasa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tasaLogic.setDatosCliente(datosCliente);
			tasaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tasaAux=new  Tasa();
				
				tasaAux.setIsNew(true);
				tasaAux.setIsChanged(true);
				
				tasaAux.setTasaOriginal(this.tasa);
				
				tasaAux.setId(this.tasa.getId());	
				tasaAux.setVersionRow(this.tasa.getVersionRow());	
				tasaAux.setid_empresa(this.tasa.getid_empresa());	
				tasaAux.setvalor(this.tasa.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tasaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tasaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tasaAux,tasaLogic.getTasas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tasaAux,tasas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tasaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tasaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tasaLogic.saveTasas();//WithConnection
						//tasaLogic.getSetVersionRowTasas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tasa,tasaAux);
					
					this.refrescarForeignKeysDescripcionesTasa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tasaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tasaLogic.saveTasaRelaciones(tasaAux);//WithConnection
								//tasaLogic.getSetVersionRowTasas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tasa,tasaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tasaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tasaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tasaAux,tasaLogic.getTasas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tasaAux,tasas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tasa,tasaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tasaAux=new  Tasa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tasaSessionBean.getEsGuardarRelacionado() 
					|| (this.tasaSessionBean.getEsGuardarRelacionado() && this.tasa.getId()>=0)) {
						
					tasaAux.setIsNew(false);
				}
				
				tasaAux.setIsDeleted(false);
			
				tasaAux.setId(this.tasa.getId());	
				tasaAux.setVersionRow(this.tasa.getVersionRow());	
				tasaAux.setid_empresa(this.tasa.getid_empresa());	
				tasaAux.setvalor(this.tasa.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tasaAux,tasaLogic.getTasas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tasaAux,tasas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tasaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tasaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tasaLogic.saveTasas();//WithConnection
						//tasaLogic.getSetVersionRowTasas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tasa,tasaAux);
					
					this.refrescarForeignKeysDescripcionesTasa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tasaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tasaLogic.saveTasaRelaciones(tasaAux);//WithConnection
								//tasaLogic.getSetVersionRowTasas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tasa,tasaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tasaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tasaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tasaAux,tasaLogic.getTasas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tasaAux,tasas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tasa,tasaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tasaAux=new  Tasa();
				
				tasaAux.setIsNew(false);
				tasaAux.setIsChanged(false);
				
				tasaAux.setIsDeleted(true);
				
				tasaAux.setId(this.tasa.getId());	
				tasaAux.setVersionRow(this.tasa.getVersionRow());	
				tasaAux.setid_empresa(this.tasa.getid_empresa());	
				tasaAux.setvalor(this.tasa.getvalor());	
				
				if(this.tasaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tasaAux.getId()>=0) {	
						this.tasasEliminados.add(tasaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tasaAux,tasaLogic.getTasas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tasaAux,tasas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tasaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tasaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tasaLogic.saveTasas();//WithConnection
						//tasaLogic.getSetVersionRowTasas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tasaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tasaLogic.saveTasaRelaciones(tasaAux);//WithConnection
								//tasaLogic.getSetVersionRowTasas();//WithConnection
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
							if(this.tasaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tasaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tasaAux,tasaLogic.getTasas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tasaAux,tasas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.getTasas().addAll(this.tasasEliminados);
					
					tasaLogic.saveTasas();//WithConnection
					//tasaLogic.getSetVersionRowTasas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTasa();
				
				this.tasasEliminados= new ArrayList<Tasa>();		
			}
			
			if(this.tasaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tasaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tasa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tasa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tasa=tasaAux;
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
      		//this.finishProcessTasa();
      	}
		
	}	
	
	public void actualizarRelaciones(Tasa tasaLocal) throws Exception {
		
		if(this.tasaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Tasa tasaLocal) throws Exception {	
		if(this.tasaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tasaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTasaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTasa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tasaValidator.getInvalidValues(this.tasa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Tasa tasa,List<Tasa> tasas) throws Exception {
		try	{		
			TasaConstantesFunciones.actualizarLista(tasa,tasas,this.tasaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Tasa tasa,List<Tasa> tasas) throws Exception {
		try	{			
			TasaConstantesFunciones.actualizarSelectedLista(tasa,tasas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Tasa> tasasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tasasLocal=this.tasaLogic.getTasas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tasasLocal=this.tasas;
			}
			//ARCHITECTURE
		
			for(Tasa tasaLocal:tasasLocal) {
				if(this.permiteMantenimiento(tasaLocal) && tasaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TasaConstantesFunciones.getTasaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TasaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTasa.jLabelid_empresaTasa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TasaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTasa.jLabelvalorTasa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTasa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTasa.jLabelid_empresaTasa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTasa.jLabelvalorTasa,"");
		
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
		this.iIdNuevoTasa--;	
		
		
		this.tasaAux=new Tasa();
		
		this.tasaAux.setId(this.iIdNuevoTasa);
		this.tasaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tasaLogic.getTasas().add(this.tasaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tasas.add(this.tasaAux);
		}
		//ARCHITECTURE
		
		this.tasa=this.tasaAux;
		
		if(TasaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTasa(this.tasa);
			this.setVariablesObjetoActualToFormularioForeignKeyTasa(this.tasa);
		}
				
		//this.setDefaultControlesTasa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTasa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTasa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTasa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTasa(this.tasaBean,this.tasa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TasaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tasaSessionBean.getConGuardarRelaciones()) {
			classes=TasaConstantesFunciones.getClassesRelationshipsOfTasa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tasaReturnGeneral=tasaLogic.procesarEventosTasasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tasaLogic.getTasas(),this.tasa,this.tasaParameterGeneral,this.isEsNuevoTasa,classes);//this.tasaLogic.getTasa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTasa(this.tasaReturnGeneral,this.tasaBean,false);
		
		if(this.tasaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTasa(this.tasaReturnGeneral.getTasa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTasa(this.tasaReturnGeneral.getTasa());
		}
		
		if(this.tasaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTasa(this.tasaReturnGeneral.getTasa(),classes);//this.tasaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTasa(this.tasa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTasa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTasa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TasaBeanSwingJInternalFrameAdditional.RecargarFormTasa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTasa(false);
						
			if(tasaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TasaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTasa();
			}
			
			this.actualizarVisualTableDatosTasa();
			
			this.jTableDatosTasa.setRowSelectionInterval(this.getIndiceNuevoTasa(), this.getIndiceNuevoTasa());
			
			this.seleccionarFilaTablaTasaActual();
						
			this.actualizarEstadoCeldasBotonesTasa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTasa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTasa.jTextFieldvalorTasa.setEnabled(isHabilitar && this.tasaConstantesFunciones.activarvalorTasa);	
		//
		this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.setEnabled(isHabilitar && this.tasaConstantesFunciones.activarid_empresaTasa);
	};
	
	public void setDefaultControlesTasa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTasa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tasaSessionBean.setConGuardarRelaciones(true);			
			this.tasaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTasa.jTabbedPaneRelacionesTasa.setVisible(true);
			
					
		} else {
			//this.tasaSessionBean.setConGuardarRelaciones(false);			
			this.tasaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTasa.jTabbedPaneRelacionesTasa.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTasa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Tasa tasaAux:this.tasaLogic.getTasas()) {
				if(tasaAux.getId().equals(this.iIdNuevoTasa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Tasa tasaAux:this.tasas) {
				if(tasaAux.getId().equals(this.iIdNuevoTasa)) {
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
	
	public int getIndiceActualTasa(Tasa tasa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Tasa tasaAux:this.tasaLogic.getTasas()) {
				if(tasaAux.getId().equals(tasa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Tasa tasaAux:this.tasas) {
				if(tasaAux.getId().equals(tasa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTasa(Tasa tasaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Tasa tasaAux:this.tasaLogic.getTasas()) {
				if(tasaAux.getTasaOriginal().getId().equals(tasaOriginal.getId())) {
					existe=true;
					tasaOriginal.setId(tasaAux.getId());
					tasaOriginal.setVersionRow(tasaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Tasa tasaAux:this.tasas) {
				if(tasaAux.getTasaOriginal().getId().equals(tasaOriginal.getId())) {
					existe=true;
					tasaOriginal.setId(tasaAux.getId());
					tasaOriginal.setVersionRow(tasaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTasa(Boolean esParaCancelar) throws Exception {
		tasasAux=new ArrayList<Tasa>();
		tasaAux=new Tasa();
		
		if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Tasa tasaAux:this.tasaLogic.getTasas()) {
					if(tasaAux.getId()<0) {
						tasasAux.add(tasaAux);
					}		
				}
				this.iIdNuevoTasa=0L;
				this.tasaLogic.getTasas().removeAll(tasasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Tasa tasaAux:this.tasas) {
					if(tasaAux.getId()<0) {
						tasasAux.add(tasaAux);
					}		
				}
				this.iIdNuevoTasa=0L;
				this.tasas.removeAll(tasasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTasa 
					&& this.tasaLogic.getTasas().size()>0
					) {
					tasaAux=this.tasaLogic.getTasas().get(this.tasaLogic.getTasas().size() - 1);
				
					if(tasaAux.getId()<0) {
						this.tasaLogic.getTasas().remove(tasaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTasa && this.tasas.size()>0) {
					tasaAux=this.tasas.get(this.tasas.size() - 1);
				
					if(tasaAux.getId()<0) {
						this.tasas.remove(tasaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTasa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tasa.getId()<0) {
				this.tasaLogic.getTasas().remove(this.tasa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tasa.getId()<0) {
				this.tasas.remove(this.tasa);
			}
		}			
	}
	
	public void setEstadosInicialesTasa(List<Tasa> tasasAux) throws Exception {
		TasaConstantesFunciones.setEstadosInicialesTasa(tasasAux);
	}
	
	public void setEstadosInicialesTasa(Tasa tasaAux) throws Exception {
		TasaConstantesFunciones.setEstadosInicialesTasa(tasaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTasaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTasa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTasaActual()) {
				if(!this.isEsNuevoTasa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTasa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTasa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTasaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tasa ?", "MANTENIMIENTO DE Tasa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTasa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Tasa tasa) throws Exception {
		TasaConstantesFunciones.seleccionarAsignar(this.tasa,tasa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTasa=this.isPermisoActualizarOriginalTasa;
			
			
			this.seleccionarAsignar(tasa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TasaConstantesFunciones.quitarEspaciosTasa(this.tasa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTasa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tasaSessionBean.setsFuncionBusquedaRapida(this.tasaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTasa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTasa(esParaCancelar);				
				this.cancelarNuevoTasa(esParaCancelar);								
			}
			
			this.tasa=new Tasa();
			
			this.inicializarTasa();
			
			this.actualizarEstadoCeldasBotonesTasa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTasa() throws Exception {
		try {
			TasaConstantesFunciones.inicializarTasa(this.tasa);
			
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
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tasaLogic.getTasas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTasas(String sAccionBusqueda,List<Tasa> tasasParaReportes) throws Exception {
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
					sPathReporteFinal="Tasa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TasaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TasaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Tasa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tasas");		
		parameters.put("busquedapor", TasaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTasa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TasaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TasaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTasa=new JRBeanArrayDataSource(TasaJInternalFrame.TraerTasaBeans(tasasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTasa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TasaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TasaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TasaBean.TraerTasaBeans(tasasParaReportes).toArray()));
							
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
				this.generarExcelReporteTasas(sAccionBusqueda,sTipoArchivoReporte,tasasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTasas(sAccionBusqueda,sTipoArchivoReporte,tasasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTasaActionPerformed(null);
					//this.generarExcelReporteTasas(sAccionBusqueda,sTipoArchivoReporte,tasasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTasas(sAccionBusqueda,sTipoArchivoReporte,tasasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTasas(sAccionBusqueda,sTipoArchivoReporte,tasasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTasas(sAccionBusqueda,sTipoArchivoReporte,tasasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTasas(String sAccionBusqueda,String sTipoArchivoReporte,List<Tasa> tasasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tasa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Tasas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTasa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Tasa tasa : tasasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TasaConstantesFunciones.generarExcelReporteDataTasa("NORMAL",row,workbook,tasa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tasaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tasa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTasa(String sTipo,Row row,Workbook workbook) {
		
		TasaConstantesFunciones.generarExcelReporteHeaderTasa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTasas(String sAccionBusqueda,String sTipoArchivoReporte,List<Tasa> tasasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tasa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Tasas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Tasa tasa : tasasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TasaConstantesFunciones.getTasaDescripcion(tasa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TasaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TasaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tasa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TasaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TasaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tasa.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tasaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tasa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTasas(String sAccionBusqueda,String sTipoArchivoReporte,List<Tasa> tasasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Tasa> tasasRespaldo=null;
		
		classes=TasaConstantesFunciones.getClassesRelationshipsOfTasa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tasaLogic.setDatosCliente(this.datosCliente);
		this.tasaLogic.setDatosDeep(this.datosDeep);
		this.tasaLogic.setIsConDeep(true);
		
		tasasRespaldo=this.tasaLogic.getTasas();
		
		this.tasaLogic.setTasas(tasasParaReportes);	
		this.tasaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tasasParaReportes=this.tasaLogic.getTasas();
		this.tasaLogic.setTasas(tasasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tasa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Tasas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTasa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Tasa tasa : tasasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTasa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TasaConstantesFunciones.generarExcelReporteDataTasa("NORMAL",row,workbook,tasa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TasaConstantesFunciones.getTasaDescripcion(tasa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tasaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tasa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTasa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTasa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTasa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTasa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTasa() throws Exception {		
		this.startProcessTasa(true);
	}
	
	public void startProcessTasa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTasa ,this.jPanelParametrosReportesTasa, this.jScrollPanelDatosTasa,this.jPanelPaginacionTasa, this.jScrollPanelDatosEdicionTasa, this.jPanelAccionesTasa,this.jPanelAccionesFormularioTasa,this.jmenuBarTasa,this.jmenuBarDetalleTasa,this.jTtoolBarTasa,this.jTtoolBarDetalleTasa);		
		
		final JTabbedPane jTabbedPaneBusquedasTasa=this.jTabbedPaneBusquedasTasa; 
		
		final JPanel jPanelParametrosReportesTasa=this.jPanelParametrosReportesTasa;
		//final JScrollPane jScrollPanelDatosTasa=this.jScrollPanelDatosTasa;
		final JTable jTableDatosTasa=this.jTableDatosTasa;		
		final JPanel jPanelPaginacionTasa=this.jPanelPaginacionTasa;
		//final JScrollPane jScrollPanelDatosEdicionTasa=this.jScrollPanelDatosEdicionTasa;
		final JPanel jPanelAccionesTasa=this.jPanelAccionesTasa;
		
		JPanel jPanelCamposAuxiliarTasa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTasa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTasa!=null) {
			jPanelCamposAuxiliarTasa=this.jInternalFrameDetalleFormTasa.jPanelCamposTasa;
			jPanelAccionesFormularioAuxiliarTasa=this.jInternalFrameDetalleFormTasa.jPanelAccionesFormularioTasa;
		}
		
		final JPanel jPanelCamposTasa=jPanelCamposAuxiliarTasa;
		final JPanel jPanelAccionesFormularioTasa=jPanelAccionesFormularioAuxiliarTasa;
		
		
		final JMenuBar jmenuBarTasa=this.jmenuBarTasa;
		final JToolBar jTtoolBarTasa=this.jTtoolBarTasa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTasa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTasa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTasa!=null) {
			jmenuBarDetalleAuxiliarTasa=this.jInternalFrameDetalleFormTasa.jmenuBarDetalleTasa;
			jTtoolBarDetalleAuxiliarTasa=this.jInternalFrameDetalleFormTasa.jTtoolBarDetalleTasa;
		}
		
		final JMenuBar jmenuBarDetalleTasa=jmenuBarDetalleAuxiliarTasa;
		final JToolBar jTtoolBarDetalleTasa=jTtoolBarDetalleAuxiliarTasa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTasa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTasa;
			processRunnable.jTableDatos=jTableDatosTasa;
			processRunnable.jPanelCampos=jPanelCamposTasa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTasa;
			processRunnable.jPanelAcciones=jPanelAccionesTasa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTasa;
			
			
			processRunnable.jmenuBar=jmenuBarTasa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTasa;
			processRunnable.jTtoolBar=jTtoolBarTasa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTasa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTasa ,jPanelParametrosReportesTasa,jTableDatosTasa, /*jScrollPanelDatosTasa,*/jPanelCamposTasa,jPanelPaginacionTasa, /*jScrollPanelDatosEdicionTasa,*/ jPanelAccionesTasa,jPanelAccionesFormularioTasa,jmenuBarTasa,jmenuBarDetalleTasa,jTtoolBarTasa,jTtoolBarDetalleTasa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTasa ,jPanelParametrosReportesTasa, jScrollPanelDatosTasa,jPanelPaginacionTasa, jScrollPanelDatosEdicionTasa, jPanelAccionesTasa,jPanelAccionesFormularioTasa,jmenuBarTasa,jmenuBarDetalleTasa,jTtoolBarTasa,jTtoolBarDetalleTasa);
						
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
	
	public void finishProcessTasa() {// throws Exception 
		this.finishProcessTasa(true);
	}
	
	public void finishProcessTasa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTasa ,this.jPanelParametrosReportesTasa, this.jScrollPanelDatosTasa,this.jPanelPaginacionTasa, this.jScrollPanelDatosEdicionTasa, this.jPanelAccionesTasa,this.jPanelAccionesFormularioTasa,this.jmenuBarTasa,this.jmenuBarDetalleTasa,this.jTtoolBarTasa,this.jTtoolBarDetalleTasa);		
		
		final JTabbedPane jTabbedPaneBusquedasTasa=this.jTabbedPaneBusquedasTasa; 
		
		final JPanel jPanelParametrosReportesTasa=this.jPanelParametrosReportesTasa;
		//final JScrollPane jScrollPanelDatosTasa=this.jScrollPanelDatosTasa;
		final JTable jTableDatosTasa=this.jTableDatosTasa;		
		final JPanel jPanelPaginacionTasa=this.jPanelPaginacionTasa;
		//final JScrollPane jScrollPanelDatosEdicionTasa=this.jScrollPanelDatosEdicionTasa;
		final JPanel jPanelAccionesTasa=this.jPanelAccionesTasa;
		
		JPanel jPanelCamposAuxiliarTasa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTasa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTasa!=null) {
			jPanelCamposAuxiliarTasa=this.jInternalFrameDetalleFormTasa.jPanelCamposTasa;
			jPanelAccionesFormularioAuxiliarTasa=this.jInternalFrameDetalleFormTasa.jPanelAccionesFormularioTasa;
		}
		
		final JPanel jPanelCamposTasa=jPanelCamposAuxiliarTasa;
		final JPanel jPanelAccionesFormularioTasa=jPanelAccionesFormularioAuxiliarTasa;
		
		
		final JMenuBar jmenuBarTasa=this.jmenuBarTasa;		
		final JToolBar jTtoolBarTasa=this.jTtoolBarTasa;
				
		JMenuBar jmenuBarDetalleAuxiliarTasa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTasa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTasa!=null) {
			jmenuBarDetalleAuxiliarTasa=this.jInternalFrameDetalleFormTasa.jmenuBarDetalleTasa;
			jTtoolBarDetalleAuxiliarTasa=this.jInternalFrameDetalleFormTasa.jTtoolBarDetalleTasa;		
		}
		
		final JMenuBar jmenuBarDetalleTasa=jmenuBarDetalleAuxiliarTasa;
		final JToolBar jTtoolBarDetalleTasa=jTtoolBarDetalleAuxiliarTasa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTasa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTasa;
			processRunnable.jTableDatos=jTableDatosTasa;
			processRunnable.jPanelCampos=jPanelCamposTasa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTasa;
			processRunnable.jPanelAcciones=jPanelAccionesTasa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTasa;
			
			
			processRunnable.jmenuBar=jmenuBarTasa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTasa;
			processRunnable.jTtoolBar=jTtoolBarTasa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTasa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTasa ,jPanelParametrosReportesTasa, jTableDatosTasa,/*jScrollPanelDatosTasa,*/jPanelCamposTasa,jPanelPaginacionTasa, /*jScrollPanelDatosEdicionTasa,*/ jPanelAccionesTasa,jPanelAccionesFormularioTasa,jmenuBarTasa,jmenuBarDetalleTasa,jTtoolBarTasa,jTtoolBarDetalleTasa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTasa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTasa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTasa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTasa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTasa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTasa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTasa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTasa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTasa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tasaConstantesFunciones.getsFinalQueryTasa();
		String  finalQueryPaginacionTodos=this.tasaConstantesFunciones.getsFinalQueryTasa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TasaConstantesFunciones.getArrayColumnasGlobalesNoTasa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TasaConstantesFunciones.getArrayColumnasGlobalesTasa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TasaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tasasEliminados= new ArrayList<Tasa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTasa();
		
				///*TasaSessionBean*/this.tasaSessionBean=new TasaSessionBean();
			
			if(this.tasaSessionBean==null) {
				this.tasaSessionBean=new TasaSessionBean();
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
					this.iNumeroPaginacion=TasaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TasaConstantesFunciones.getClassesForeignKeysOfTasa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tasa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tasasAux= new ArrayList<Tasa>();
			
				
			tasaLogic.setDatosCliente(this.datosCliente);
			tasaLogic.setDatosDeep(this.datosDeep);
			tasaLogic.setIsConDeep(true);
			
			
			tasaLogic.getTasaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tasaLogic.getTodosTasas(finalQueryGlobal,pagination);
					
					//tasaLogic.getTodosTasasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tasaLogic.getTasas()==null|| tasaLogic.getTasas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tasasAux= new ArrayList<Tasa>();
							tasasAux.addAll(tasaLogic.getTasas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tasasAux= new ArrayList<Tasa>();
							tasasAux.addAll(tasas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tasaLogic.getTodosTasas(finalQueryGlobal+"",this.pagination);												
							
							//tasaLogic.getTodosTasasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTasas("Todos",tasaLogic.getTasas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tasaLogic.setTasas(new ArrayList<Tasa>());					
							tasaLogic.getTasas().addAll(tasasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tasas=new ArrayList<Tasa>();
							tasas.addAll(tasasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTasa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTasa=this.idActual;
				
				} else if(this.idTasaActual!=null && this.idTasaActual!=0L) {
					idTasa=idTasaActual;
				}
				
					
				this.sDetalleReporte=TasaConstantesFunciones.getDetalleIndicePorId(idTasa);
				
				this.tasas=new ArrayList<Tasa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tasaLogic.getEntity(idTasa);
					
					//tasaLogic.getEntityWithConnection(idTasa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tasaLogic.setTasas(new ArrayList<Tasa>());
					tasaLogic.getTasas().add(tasaLogic.getTasa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tasas=new ArrayList<Tasa>();
					this.tasas.add(tasa);
				}
				
				if(tasaLogic.getTasa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TasaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tasaLogic.getTasasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TasaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TasaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tasaLogic.getTasas()==null||tasaLogic.getTasas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tasas==null|| tasas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tasasAux=new ArrayList<Tasa>();
						tasasAux.addAll(tasaLogic.getTasas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tasasAux=new ArrayList<Tasa>();
							tasasAux.addAll(tasas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tasaLogic.getTasasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TasaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TasaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTasas("FK_IdEmpresa",tasaLogic.getTasas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTasas("FK_IdEmpresa",tasas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tasaLogic.setTasas(new ArrayList<Tasa>());
						tasaLogic.getTasas().addAll(tasasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tasas=new ArrayList<Tasa>();
							tasas.addAll(tasasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTasa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTasa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tasaLogic.getTasas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tasas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tasaLogic.getTasas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tasas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Tasa tasa) {
		Boolean permite=true;
		
		if(this.tasa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TasaConstantesFunciones.getOrderByListaTasa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TasaConstantesFunciones.getOrderByListaTasa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Tasa tasa:tasaLogic.getTasas()) {
				if(tasa.getsType().equals(Constantes2.S_TOTALES)) {
					tasaTotales=tasa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Tasa tasa:this.tasas) {
				if(tasa.getsType().equals(Constantes2.S_TOTALES)) {
					tasaTotales=tasa;
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
			this.tasaAux=new Tasa();
			this.tasaAux.setsType(Constantes2.S_TOTALES);
			this.tasaAux.setIsNew(false);
			this.tasaAux.setIsChanged(false);
			this.tasaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TasaConstantesFunciones.TotalizarValoresFilaTasa(this.tasaLogic.getTasas(),this.tasaAux);
				
				this.tasaLogic.getTasas().add(this.tasaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TasaConstantesFunciones.TotalizarValoresFilaTasa(this.tasas,this.tasaAux);
				
				this.tasas.add(this.tasaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tasaTotales=new Tasa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tasaLogic.getTasas().remove(tasaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tasas.remove(tasaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tasaTotales=new Tasa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Tasa tasa:tasaLogic.getTasas()) {
				if(tasa.getsType().equals(Constantes2.S_TOTALES)) {
					tasaTotales=tasa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TasaConstantesFunciones.TotalizarValoresFilaTasa(this.tasaLogic.getTasas(),tasaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Tasa tasa:this.tasas) {
				if(tasa.getsType().equals(Constantes2.S_TOTALES)) {
					tasaTotales=tasa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TasaConstantesFunciones.TotalizarValoresFilaTasa(this.tasas,tasaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTasasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTasasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tasaLogic.getTasasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTasa() {
		this.isPermisoTodoTasa=false;
		this.isPermisoNuevoTasa=false;
		this.isPermisoActualizarTasa=false;
		this.isPermisoActualizarOriginalTasa=false;
		this.isPermisoEliminarTasa=false;
		this.isPermisoGuardarCambiosTasa=false;
		this.isPermisoConsultaTasa=false;
		this.isPermisoBusquedaTasa=false;
		this.isPermisoReporteTasa=false;		
		this.isPermisoOrdenTasa=false;		
		this.isPermisoPaginacionMedioTasa=false;		
		this.isPermisoPaginacionAltoTasa=false;
		this.isPermisoPaginacionTodoTasa=false;
		this.isPermisoCopiarTasa=false;		
		this.isPermisoVerFormTasa=false;		
		this.isPermisoDuplicarTasa=false;		
		this.isPermisoOrdenTasa=false;		
	}
	
	public void setPermisosUsuarioTasa(Boolean isPermiso) {
		this.isPermisoTodoTasa=isPermiso;
		this.isPermisoNuevoTasa=isPermiso;
		this.isPermisoActualizarTasa=isPermiso;
		this.isPermisoActualizarOriginalTasa=isPermiso;
		this.isPermisoEliminarTasa=isPermiso;
		this.isPermisoGuardarCambiosTasa=isPermiso;
		this.isPermisoConsultaTasa=isPermiso;
		this.isPermisoBusquedaTasa=isPermiso;
		this.isPermisoReporteTasa=isPermiso;
		this.isPermisoOrdenTasa=isPermiso;		
		this.isPermisoPaginacionMedioTasa=isPermiso;		
		this.isPermisoPaginacionAltoTasa=isPermiso;		
		this.isPermisoPaginacionTodoTasa=isPermiso;		
		this.isPermisoCopiarTasa=isPermiso;		
		this.isPermisoVerFormTasa=isPermiso;		
		this.isPermisoDuplicarTasa=isPermiso;
		this.isPermisoOrdenTasa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTasa(Boolean isPermiso) {
		//this.isPermisoTodoTasa=isPermiso;
		this.isPermisoNuevoTasa=isPermiso;
		this.isPermisoActualizarTasa=isPermiso;
		this.isPermisoActualizarOriginalTasa=isPermiso;
		this.isPermisoEliminarTasa=isPermiso;
		this.isPermisoGuardarCambiosTasa=isPermiso;
		//this.isPermisoConsultaTasa=isPermiso;
		//this.isPermisoBusquedaTasa=isPermiso;
		//this.isPermisoReporteTasa=isPermiso;
		//this.isPermisoOrdenTasa=isPermiso;		
		//this.isPermisoPaginacionMedioTasa=isPermiso;		
		//this.isPermisoPaginacionAltoTasa=isPermiso;		
		//this.isPermisoPaginacionTodoTasa=isPermiso;		
		//this.isPermisoCopiarTasa=isPermiso;		
		//this.isPermisoDuplicarTasa=isPermiso;
		//this.isPermisoOrdenTasa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTasaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TasaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTasa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTasaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTasaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTasaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTasaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTasa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TasaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tasaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TasaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTasa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTasa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTasa=this.isPermisoActualizarTasa;
			this.isPermisoEliminarTasa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTasa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTasa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTasa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTasa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTasa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTasa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTasa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTasa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTasa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTasa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTasa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTasa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTasa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tasaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTasa.setToolTipText(this.jTableDatosTasa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTasa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTasa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TasaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TasaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTasa() throws Exception {
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
	public void inicializarCombosForeignKeyTasaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTasaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TasaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTasaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTasaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TasaParameterReturnGeneral tasaReturnGeneral=new TasaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tasaConstantesFunciones.cargarid_empresaTasa)
					 || (this.esRecargarFks && this.tasaConstantesFunciones.cargarid_empresaTasa)) {

					if(!this.tasaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tasaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tasaReturnGeneral=tasaLogic.cargarCombosLoteForeignKeyTasa(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tasaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTasa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tasaSessionBean==null) {
				this.tasaSessionBean=new TasaSessionBean();
			}

			if(!this.tasaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTasa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTasa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTasa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTasa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTasa(Tasa tasa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTasa(Tasa tasa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTasa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTasa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTasa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTasa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTasa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTasa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTasa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTasa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa!=null && this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TasaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TasaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TasaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tasaSessionBean=new TasaSessionBean(); 
		this.tasaConstantesFunciones=new TasaConstantesFunciones(); 
		this.tasaBean=new Tasa();//(this.tasaConstantesFunciones); 		
		this.tasaReturnGeneral=new TasaParameterReturnGeneral(); 
		
		this.tasaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tasaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TasaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TasaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TasaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTasa(true);
			
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
			
			this.tasaConstantesFunciones=new TasaConstantesFunciones(); 
			this.tasaBean=new Tasa();//this.tasaConstantesFunciones); 			
			this.tasaReturnGeneral=new TasaParameterReturnGeneral(); 
		
			TasaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tasa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tasa=new Tasa();
			this.tasas = new ArrayList<Tasa>();
			this.tasasAux = new ArrayList<Tasa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic=new TasaLogic();
				this.tasaLogic.getNewConnexionToDeep("");
			}
			
			//this.tasaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tasaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTasa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTasa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTasa);	
					}
					
					if(this.jInternalFrameImportacionTasa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTasa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTasa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTasa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTasa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTasa);
				this.jInternalFrameDetalleFormTasa.setVisible(false);
				this.jInternalFrameDetalleFormTasa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTasa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTasa);
					this.jInternalFrameReporteDinamicoTasa.setVisible(false);
					this.jInternalFrameReporteDinamicoTasa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTasa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTasa);
					this.jInternalFrameImportacionTasa.setVisible(false);
					this.jInternalFrameImportacionTasa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTasa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTasa);
					this.jInternalFrameOrderByTasa.setVisible(false);
					this.jInternalFrameOrderByTasa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTasaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TasaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tasaReturnGeneral=new TasaParameterReturnGeneral();
			
			this.tasaParameterGeneral=new TasaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tasaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TasaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tasaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TasaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tasaSessionBean.getEsGuardarRelacionado(),this.tasaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TasaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tasaSessionBean.getEsGuardarRelacionado(),this.tasaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTasa=false;
			this.isVisibilidadCeldaDuplicarTasa=true;
			this.isVisibilidadCeldaCopiarTasa=true;
			this.isVisibilidadCeldaVerFormTasa=true;
			this.isVisibilidadCeldaOrdenTasa=true;
			this.isVisibilidadCeldaNuevoRelacionesTasa=false;
			this.isVisibilidadCeldaModificarTasa=false;
			this.isVisibilidadCeldaActualizarTasa=false;
			this.isVisibilidadCeldaEliminarTasa=false;
			this.isVisibilidadCeldaCancelarTasa=false;
			this.isVisibilidadCeldaGuardarTasa=false;
			this.isVisibilidadCeldaGuardarCambiosTasa=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTasa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTasa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTasa(false);
			
			this.setPermisosUsuarioTasa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tasaSessionBean.getEsGuardarRelacionado() 
				|| (this.tasaSessionBean.getEsGuardarRelacionado() && this.tasaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTasaClasesRelacionadas();
			}
			
			if(this.tasaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTasaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TasaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTasa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTasa();
			}
			
			if(!this.isPermisoBusquedaTasa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTasa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tasaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTasa,this.isPermisoPaginacionMedioTasa,this.isPermisoPaginacionTodoTasa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TasaConstantesFunciones.getTiposSeleccionarTasa());
				
				this.tiposColumnasSelect=TasaConstantesFunciones.getTiposSeleccionarTasa(true);
				
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
			//if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTasa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTasa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTasa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTasa() ;
			
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
				tasaImplementable= (TasaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TasaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tasaImplementableHome= (TasaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TasaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tasas= new ArrayList<Tasa>();
			this.tasasEliminados= new ArrayList<Tasa>();
						
			this.isEsNuevoTasa=false;
			this.esParaAccionDesdeFormularioTasa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTasa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTasa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TasaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TasaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTasa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTasa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTasa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTasa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTasa();
			}
			
			TasaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTasa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTasa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTasa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTasa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Tasa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTasa() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTasa")) {
				iIndex=this.jInternalFrameDetalleFormTasa.jTabbedPaneRelacionesTasa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTasa.jTabbedPaneRelacionesTasa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTasa.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTasa();	
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
	
	public void cargarCombosForeignKeyTasa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTasa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTasa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTasaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTasa();
		
		this.cargarCombosFrameForeignKeyTasa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTasa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTasa();
		}
	}
	
	
	
	public void jButtonNuevoTasaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tasaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
			
			if(jTableDatosTasa.getRowCount()>=1) {
				jTableDatosTasa.removeRowSelectionInterval(0, jTableDatosTasa.getRowCount()-1);						
			}
			
			this.isEsNuevoTasa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTasa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTasa(true);			
			//this.tasa=new Tasa();
			//this.tasa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTasa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTasa() ;
			
			if(TasaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTasa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tasa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tasa);				
			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
			if(this.tasaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Tasa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTasaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTasa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTasa.getSelectedRows().length;			
			}
			
			tasasSeleccionados=this.getTasasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTasa--;			
				//Tasa tasaAux= new Tasa();			
				//tasaAux.setId(this.iIdNuevoTasa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Tasa tasaOrigen=new Tasa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Tasa tasaOrigen : tasasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTasa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tasaOrigen =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tasaOrigen =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTasa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tasa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTasa(tasaOrigen,this.tasa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tasaLogic.getTasas().add(this.tasaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tasas.add(this.tasaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTasa(false);
				
				this.jTableDatosTasa.setRowSelectionInterval(this.getIndiceNuevoTasa(), this.getIndiceNuevoTasa());
				
				int iLastRow =  this.jTableDatosTasa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTasa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTasa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTasa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTasaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();									
		
			Tasa tasaOrigen=new Tasa();
			Tasa tasaDestino=new Tasa();
				
			tasasSeleccionados=this.getTasasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTasa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tasasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTasa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tasaOrigen =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tasaOrigen =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tasaDestino =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tasaDestino =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tasaOrigen =tasasSeleccionados.get(0);
				tasaDestino =tasasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTasa(tasaOrigen,tasaDestino,true,false);
				
				tasaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tasaDestino,tasaLogic.getTasas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tasaDestino,tasas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTasa(false);
				
				//this.jTableDatosTasa.setRowSelectionInterval(this.getIndiceNuevoTasa(), this.getIndiceNuevoTasa());
				
				int iLastRow =  this.jTableDatosTasa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTasa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTasa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTasa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTasaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTasa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTasaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTasa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTasa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTasa.setVisible(!isVisible);
			this.jPanelPaginacionTasa.setVisible(!isVisible);
			this.jPanelAccionesTasa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTasaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTasa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTasaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTasa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTasaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTasa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTasaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTasa();
			
			this.abrirFrameOrderByTasa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTasaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTasa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTasa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTasa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTasa.isMaximum()) {
					this.jInternalFrameDetalleFormTasa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTasa.setSize(this.jInternalFrameDetalleFormTasa.iWidthFormulario,this.jInternalFrameDetalleFormTasa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTasa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTasa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTasa.isMaximum()) {
						this.jInternalFrameDetalleFormTasa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTasa.jContentPaneDetalleTasa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTasa.jTabbedPaneRelacionesTasa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTasa.jContentPaneDetalleTasa.getWidth(),TasaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTasa.jTabbedPaneRelacionesTasa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTasa.jContentPaneDetalleTasa.getWidth(),TasaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTasa.jTabbedPaneRelacionesTasa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTasa.jContentPaneDetalleTasa.getWidth(),TasaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTasa.setVisible(true);
	        this.jInternalFrameDetalleFormTasa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTasa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTasa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTasa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTasa,false,this);
				} else {
					this.jInternalFrameOrderByTasa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTasa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTasa);
				this.jInternalFrameOrderByTasa.setVisible(false);
				this.jInternalFrameOrderByTasa.setSelected(false);
				
				this.jInternalFrameOrderByTasa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTasa"));
				
				this.inicializarActualizarBindingTablaOrderByTasa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTasa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTasa==null) {
				
				this.jInternalFrameImportacionTasa=new ImportacionJInternalFrame(TasaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTasa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTasa);
				this.jInternalFrameImportacionTasa.setVisible(false);
				this.jInternalFrameImportacionTasa.setSelected(false);


				this.jInternalFrameImportacionTasa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTasa"));
				this.jInternalFrameImportacionTasa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTasa"));
				this.jInternalFrameImportacionTasa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTasa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTasa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTasa==null) {
				this.jInternalFrameReporteDinamicoTasa=new ReporteDinamicoJInternalFrame(TasaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTasa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTasa);
				this.jInternalFrameReporteDinamicoTasa.setVisible(false);
				this.jInternalFrameReporteDinamicoTasa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTasa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTasa"));
				this.jInternalFrameReporteDinamicoTasa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTasa"));
				this.jInternalFrameReporteDinamicoTasa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTasa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTasa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTasa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTasa);
			
	       	this.jInternalFrameDetalleFormTasa.setVisible(false);
	        this.jInternalFrameDetalleFormTasa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTasa.dispose();
			//this.jInternalFrameDetalleFormTasa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTasa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTasa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTasa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTasa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTasa.setVisible(true);
	        this.jInternalFrameImportacionTasa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTasa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTasa.setVisible(true);
	        this.jInternalFrameOrderByTasa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTasa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTasa.setVisible(false);
	        this.jInternalFrameOrderByTasa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTasa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTasa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTasa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTasa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTasa.setVisible(false);
	        this.jInternalFrameImportacionTasa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTasaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTasa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTasa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTasa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTasa(true);
			//this.isEsNuevoTasa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTasa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTasa(false) ;
			
			if(tasaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TasaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTasa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTasa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTasaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTasa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTasa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTasa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTasa(true);
			//this.isEsNuevoTasa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tasa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTasa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTasa(false) ;
			
			if(TasaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTasa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTasa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTasaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTasa(false);
			
			//if(!this.isEsNuevoTasa) {								
				int intSelectedRow = this.jTableDatosTasa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TasaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTasa(this.tasa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
				
			}
			
			if(this.permiteMantenimiento(this.tasa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tasaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTasa=true;
					this.inicializarActualizarBindingTablaTasa(false);
					this.isEsNuevoTasa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTasa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTasa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTasa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTasa(false);
				
				this.habilitarDeshabilitarControlesTasa(false);
			
												
				
				if(TasaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTasa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTasaActionPerformed(evt,tasaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTasa(this.tasa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTasa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tasaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tasa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTasaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTasa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				this.tasa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				this.tasa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tasa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tasaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TasaModel) this.jTableDatosTasa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTasa=true;
				this.inicializarActualizarBindingTablaTasa(false);
				this.isEsNuevoTasa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTasa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTasa(false);
				
				this.habilitarDeshabilitarControlesTasa(false);
				
				
				
				if(TasaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTasa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTasaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTasa.getRowCount()>=1) {
				jTableDatosTasa.removeRowSelectionInterval(0, jTableDatosTasa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTasa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTasa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTasa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTasa(false) ;
			
			this.isEsNuevoTasa=false;
			
			if(TasaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTasa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTasaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTasa(false);
				
				//SI ES MANUAL
				if(TasaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTasa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTasaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTasa--;			
			//Tasa tasaAux= new Tasa();			
			//tasaAux.setId(this.iIdNuevoTasa);
			
			if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTasa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
			
			this.tasa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tasaLogic.getTasas().add(this.tasaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tasas.add(this.tasaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTasa(false);
			
			this.jTableDatosTasa.setRowSelectionInterval(this.getIndiceNuevoTasa(), this.getIndiceNuevoTasa());
			
			int iLastRow =  this.jTableDatosTasa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTasa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTasa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTasa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTasaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTasa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTasa(false);
			
			//SI ES MANUAL
			if(TasaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTasa();
			}
			
			//this.abrirFrameTreeTasa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTasaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE TasaS ?", "MANTENIMIENTO DE Tasa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTasa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTasa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tasaReturnGeneral=tasaLogic.procesarImportacionTasasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tasaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTasaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTasaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTasa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTasa.setFileImportacion(this.jInternalFrameImportacionTasa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTasa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTasa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTasa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTasa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTasaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();		

		tasasSeleccionados=this.getTasasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TasaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TasaBaseDesign.jrxml";
			
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
			
			this.generarReporteTasas("Todos",tasasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tasaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tasa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTasa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTasa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TasaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TasaConstantesFunciones.LABEL_VALOR:
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
		
		if(this.jInternalFrameReporteDinamicoTasa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTasa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TasaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TasaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTasa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TasaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TasaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTasa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTasa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TasaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TasaConstantesFunciones.LABEL_VALOR:
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
	
	public void jButtonGenerarExcelReporteDinamicoTasaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();		
		
		tasasSeleccionados=this.getTasasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tasa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Tasas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTasa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTasa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TasaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TasaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Tasa tasa:tasasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tasa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TasaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TasaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(Tasa tasa:tasasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tasa.getvalor());
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
			//	this.getFilaCabeceraExportarExcelTasa(row);				
			//	iRow++;
			//}				
			
			//for(Tasa tasaAux:tasasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTasa(tasaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tasaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tasa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tasaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTasa(false);
			
			//SI ES MANUAL
			if(TasaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTasa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTasaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTasa(false);
			
			//SI ES MANUAL
			if(TasaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTasa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTasaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTasa(false);
			
			//SI ES MANUAL
			if(TasaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTasa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTasa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTasa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTasa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTasa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTasa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTasa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTasa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTasa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTasa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTasa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTasa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTasa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTasa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTasa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTasa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTasa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TasaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TasaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTasa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTasa();
		
		this.inicializarActualizarBindingBotonesManualTasa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTasa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTasa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTasa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTasa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTasa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTasa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTasa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTasa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTasa.jCheckBoxPostAccionNuevoTasa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTasa.jCheckBoxPostAccionSinCerrarTasa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTasa.jCheckBoxPostAccionSinMensajeTasa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTasa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTasa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTasa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTasa!=null) {
				this.jInternalFrameDetalleFormTasa.jCheckBoxPostAccionNuevoTasa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTasa.jCheckBoxPostAccionSinCerrarTasa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTasa.jCheckBoxPostAccionSinMensajeTasa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTasa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTasa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTasa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTasa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTasa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTasa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTasa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTasa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTasa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTasa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTasa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTasa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTasa(Boolean esInicializar) throws Exception {
		try	{	
			if(TasaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTasa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTasa() throws Exception {
		try	{
			if(TasaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTasa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTasa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTasa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTasa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTasa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTasa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTasa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTasa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTasa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTasa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTasa.addItem(reporte);
			}
			
			
			if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTasa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTasa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTasa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTasa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTasa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTasa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTasa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTasa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTasa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTasa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTasa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTasa!=null) {
				this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTasa!=null) {
				this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTasa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTasa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTasa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTasa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTasa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTasa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTasa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTasa.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTasa.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TasaConstantesFunciones.getTiposSeleccionarTasa(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTasa.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTasa.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTasa.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TasaConstantesFunciones.getTiposSeleccionarTasa(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTasa.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTasa.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTasa.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TasaConstantesFunciones.getTiposSeleccionarTasa(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTasa.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTasa.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTasa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTasa(Boolean esInicializar) throws Exception {				
		if(TasaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTasa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTasa() throws Exception {
		this.inicializarActualizarBindingTablaTasa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTasa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTasa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTasa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTasa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TasaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTasa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTasa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TasaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTasaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTasaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TasaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTasa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTasa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TasaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTasa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTasa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tasaLogic.getTasas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tasas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TasaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTasa.setModel(new TasaModel(this.tasaLogic.getTasas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTasa.setModel(new TasaModel(this.tasas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTasa!=null && this.jInternalFrameOrderByTasa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTasa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTasa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTasa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TasaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TasaConstantesFunciones.SCLASSWEBTITULO,tasaConstantesFunciones.resaltarSeleccionarTasa,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TasaConstantesFunciones.SCLASSWEBTITULO,tasaConstantesFunciones.resaltarSeleccionarTasa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTasa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTasa,TasaConstantesFunciones.LABEL_ID));

		if(this.tasaConstantesFunciones.mostraridTasa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TasaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tasaConstantesFunciones.resaltaridTasa,this.tasaConstantesFunciones.activaridTasa,iSizeTabla,this,true,"idTasa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tasaConstantesFunciones.resaltaridTasa,this.tasaConstantesFunciones.activaridTasa,this,true,"idTasa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTasa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTasa,TasaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tasaConstantesFunciones.mostrarid_empresaTasa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TasaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tasaConstantesFunciones.resaltarid_empresaTasa,this,this.tasaConstantesFunciones.activarid_empresaTasa,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tasaConstantesFunciones.resaltarid_empresaTasa,this,this.tasaConstantesFunciones.activarid_empresaTasa,false,"id_empresaTasa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TasaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTasa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTasa,TasaConstantesFunciones.LABEL_VALOR));

		if(this.tasaConstantesFunciones.mostrarvalorTasa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TasaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tasaConstantesFunciones.resaltarvalorTasa,this.tasaConstantesFunciones.activarvalorTasa,iSizeTabla,this,true,"valorTasa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tasaConstantesFunciones.resaltarvalorTasa,this.tasaConstantesFunciones.activarvalorTasa,this,true,"valorTasa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TasaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tasaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tasaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tasaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTasa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tasaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tasaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTasa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTasa && this.isPermisoGuardarCambiosTasa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tasaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tasaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTasa.addColumn(tableColumn);
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
			
			this.jTableDatosTasa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTasa && this.isPermisoGuardarCambiosTasa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTasa && this.isPermisoGuardarCambiosTasa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTasa.moveColumn(this.jTableDatosTasa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTasa.moveColumn(this.jTableDatosTasa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTasa.moveColumn(this.jTableDatosTasa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTasa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTasa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTasa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TasaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTasa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTasa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TasaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TasaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTasa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTasa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTasa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tasaLogic.getTasas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tasas.size()-1;
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
		//this.jTableDatosTasa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTasa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTasa();
			
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
				
				//this.isEsNuevoTasa=false;
					
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
				if(this.tasaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTasa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTasa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTasa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tasa.getsType().equals("DUPLICADO")
				   || this.tasa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTasa=true;
				
				} else {
					this.isEsNuevoTasa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
					if(this.tasa.getId()>=0 && !this.tasa.getIsNew()) {						
						this.isEsNuevoTasa=false;
						
					} else {
						this.isEsNuevoTasa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTasa(esRelaciones);						
				
				this.seleccionarTasa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tasa.getId()<0) {
					this.isEsNuevoTasa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTasa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTasa(evt,rowIndex);
				}	
				
				if(this.tasaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Tasa: " + this.dDif); 
					}
				}								
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTasa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tasa)) {
					if(this.tasa.getId()>0) {
						this.tasa.setIsDeleted(true);
						
						this.tasasEliminados.add(this.tasa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tasaLogic.getTasas().remove(this.tasa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tasas.remove(this.tasa);				
					}
					
					
					((TasaModel) this.jTableDatosTasa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTasa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTasa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTasa) {
			
			if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTasa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTasa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TasaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTasa(this.tasa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tasaConstantesFunciones.cargarid_empresaTasa || this.tasaConstantesFunciones.event_dependid_empresaTasa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tasa.getid_empresa());
									//this.inicializarActualizarBindingTasa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tasa.getEmpresa()!=null) {
							this.empresasForeignKey.add(tasa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tasa.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTasa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTasa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTasa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTasa(Tasa tasa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTasa(tasa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTasa(Tasa tasa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTasa(tasa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTasa(tasa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTasa(tasa);
	}
	
	public void setVariablesObjetoActualToFormularioTasa(Tasa tasa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTasa.jLabelidTasa.setText(tasa.getId().toString());
			this.jInternalFrameDetalleFormTasa.jTextFieldvalorTasa.setText(tasa.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Tasa tasaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tasaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Tasa tasaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tasaLocal=this.tasa;
			} else {
				tasaLocal=this.tasaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tasaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTasa(tasaLocal,true);
					
					if(tasaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tasaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tasaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tasaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTasa(Tasa tasa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTasa(tasa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTasa(tasa);
	}
	
	public void setVariablesFormularioToObjetoActualTasa(Tasa tasa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTasa(tasa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTasa(Tasa tasa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTasa.jLabelidTasa.getText()==null || this.jInternalFrameDetalleFormTasa.jLabelidTasa.getText()=="" || this.jInternalFrameDetalleFormTasa.jLabelidTasa.getText()=="Id") {
				this.jInternalFrameDetalleFormTasa.jLabelidTasa.setText("0");
			}

			if(conColumnasBase) {tasa.setId(Long.parseLong(this.jInternalFrameDetalleFormTasa.jLabelidTasa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TasaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTasa.jLabelIdTasa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tasa.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormTasa.jTextFieldvalorTasa.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TasaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTasa.jLabelvalorTasa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTasa(Tasa tasaBean,Tasa tasa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTasa(Tasa tasaOrigen,Tasa tasa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tasaOrigen.getId()!=null && !tasaOrigen.getId().equals(0L))) {tasa.setId(tasaOrigen.getId());}}
			if(conDefault || (!conDefault && tasaOrigen.getvalor()!=null && !tasaOrigen.getvalor().equals(0.0))) {tasa.setvalor(tasaOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTasa(Tasa tasa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTasa.jLabelidTasa.setText(tasa.getId().toString());
			this.jInternalFrameDetalleFormTasa.jTextFieldvalorTasa.setText(tasa.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTasa(TasaBean tasaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTasa.jLabelidTasa.setText(tasaBean.getId().toString());
			this.jInternalFrameDetalleFormTasa.jTextFieldvalorTasa.setText(tasaBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTasa(TasaParameterReturnGeneral tasaReturnGeneral,TasaBean tasaBean,Boolean conDefault) throws Exception { 
		try {
			Tasa tasaLocal=new Tasa();
			
			tasaLocal=tasaReturnGeneral.getTasa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tasaLocal.getId()!=null && !tasaLocal.getId().equals(0L))) {tasaBean.setId(tasaLocal.getId());}}
			if(conDefault || (!conDefault && tasaLocal.getvalor()!=null && !tasaLocal.getvalor().equals(0.0))) {tasaBean.setvalor(tasaLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTasaGenerico(Long idTasaSeleccionado,JComboBox jComboBoxTasa,List<Tasa> tasasLocal)throws Exception {
		try {
			Tasa  tasaTemp=null;

			for(Tasa tasaAux:tasasLocal) {
				if(tasaAux.getId()!=null && tasaAux.getId().equals(idTasaSeleccionado)) {
					tasaTemp=tasaAux;
					break;
				}
			}

			jComboBoxTasa.setSelectedItem(tasaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTasaGenerico(JComboBox jComboBoxTasa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTasa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTasa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTasa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTasa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTasa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTasa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTasa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTasa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTasa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTasa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tasa=(Tasa) tasaLogic.getTasas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tasa =(Tasa) tasas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tasa.getIsNew() && !tasa.getIsChanged() && !tasa.getIsDeleted()) {
				sDescripcion=tasa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tasa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Tasa tasaRow=new Tasa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tasaRow=(Tasa) tasaLogic.getTasas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tasaRow=(Tasa) tasas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTasa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTasa.setVisible((this.isVisibilidadCeldaNuevoTasa && this.isPermisoNuevoTasa));			
			this.jButtonDuplicarTasa.setVisible((this.isVisibilidadCeldaDuplicarTasa && this.isPermisoDuplicarTasa));			
			this.jButtonCopiarTasa.setVisible((this.isVisibilidadCeldaCopiarTasa && this.isPermisoCopiarTasa));
			this.jButtonVerFormTasa.setVisible((this.isVisibilidadCeldaVerFormTasa && this.isPermisoVerFormTasa));
			
			this.jButtonAbrirOrderByTasa.setVisible((this.isVisibilidadCeldaOrdenTasa && this.isPermisoOrdenTasa));			
			
			this.jButtonNuevoRelacionesTasa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTasa && this.isPermisoNuevoTasa));			
			this.jButtonNuevoGuardarCambiosTasa.setVisible((this.isVisibilidadCeldaNuevoTasa && this.isPermisoNuevoTasa && this.isPermisoGuardarCambiosTasa));
			
			if(this.jInternalFrameDetalleFormTasa!=null) {
			this.jInternalFrameDetalleFormTasa.jButtonModificarTasa.setVisible((this.isVisibilidadCeldaModificarTasa && this.isPermisoActualizarTasa));	
			this.jInternalFrameDetalleFormTasa.jButtonActualizarTasa.setVisible((this.isVisibilidadCeldaActualizarTasa && this.isPermisoActualizarTasa));	
			this.jInternalFrameDetalleFormTasa.jButtonEliminarTasa.setVisible((this.isVisibilidadCeldaEliminarTasa && this.isPermisoEliminarTasa));
			this.jInternalFrameDetalleFormTasa.jButtonCancelarTasa.setVisible(this.isVisibilidadCeldaCancelarTasa);							
			this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosTasa.setVisible((this.isVisibilidadCeldaGuardarTasa && this.isPermisoGuardarCambiosTasa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTasa.setVisible((this.isVisibilidadCeldaGuardarCambiosTasa && this.isPermisoGuardarCambiosTasa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTasa.setVisible((this.isVisibilidadCeldaNuevoTasa && this.isPermisoNuevoTasa));						
			this.jButtonDuplicarToolBarTasa.setVisible((this.isVisibilidadCeldaDuplicarTasa && this.isPermisoDuplicarTasa));						
			this.jButtonCopiarToolBarTasa.setVisible((this.isVisibilidadCeldaCopiarTasa && this.isPermisoCopiarTasa));			
			this.jButtonVerFormToolBarTasa.setVisible((this.isVisibilidadCeldaVerFormTasa && this.isPermisoVerFormTasa));			
			this.jButtonAbrirOrderByToolBarTasa.setVisible((this.isVisibilidadCeldaOrdenTasa && this.isPermisoOrdenTasa));
			this.jButtonNuevoRelacionesToolBarTasa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTasa && this.isPermisoNuevoTasa));			
			this.jButtonNuevoGuardarCambiosToolBarTasa.setVisible((this.isVisibilidadCeldaNuevoTasa && this.isPermisoNuevoTasa && this.isPermisoGuardarCambiosTasa));			
			
			if(this.jInternalFrameDetalleFormTasa!=null) {
			this.jInternalFrameDetalleFormTasa.jButtonModificarToolBarTasa.setVisible((this.isVisibilidadCeldaModificarTasa && this.isPermisoActualizarTasa));	
			this.jInternalFrameDetalleFormTasa.jButtonActualizarToolBarTasa.setVisible((this.isVisibilidadCeldaActualizarTasa  && this.isPermisoActualizarTasa));	
			this.jInternalFrameDetalleFormTasa.jButtonEliminarToolBarTasa.setVisible((this.isVisibilidadCeldaEliminarTasa && this.isPermisoEliminarTasa));
			this.jInternalFrameDetalleFormTasa.jButtonCancelarToolBarTasa.setVisible(this.isVisibilidadCeldaCancelarTasa);				
			this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosToolBarTasa.setVisible((this.isVisibilidadCeldaGuardarTasa && this.isPermisoGuardarCambiosTasa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTasa.setVisible((this.isVisibilidadCeldaGuardarCambiosTasa && this.isPermisoGuardarCambiosTasa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTasa.setVisible((this.isVisibilidadCeldaNuevoTasa && this.isPermisoNuevoTasa));			
			this.jMenuItemDuplicarTasa.setVisible((this.isVisibilidadCeldaDuplicarTasa && this.isPermisoDuplicarTasa));			
			this.jMenuItemCopiarTasa.setVisible((this.isVisibilidadCeldaCopiarTasa && this.isPermisoCopiarTasa));			
			this.jMenuItemVerFormTasa.setVisible((this.isVisibilidadCeldaVerFormTasa && this.isPermisoVerFormTasa));			
			this.jMenuItemAbrirOrderByTasa.setVisible((this.isVisibilidadCeldaOrdenTasa && this.isPermisoOrdenTasa));			
			//this.jMenuItemMostrarOcultarTasa.setVisible((this.isVisibilidadCeldaOrdenTasa && this.isPermisoOrdenTasa));
			this.jMenuItemDetalleAbrirOrderByTasa.setVisible((this.isVisibilidadCeldaOrdenTasa && this.isPermisoOrdenTasa));			
			//this.jMenuItemDetalleMostrarOcultarTasa.setVisible((this.isVisibilidadCeldaOrdenTasa && this.isPermisoOrdenTasa));			
			this.jMenuItemNuevoRelacionesTasa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTasa && this.isPermisoNuevoTasa));			
			this.jMenuItemNuevoGuardarCambiosTasa.setVisible((this.isVisibilidadCeldaNuevoTasa && this.isPermisoNuevoTasa && this.isPermisoGuardarCambiosTasa));									
			
			if(this.jInternalFrameDetalleFormTasa!=null) {
			this.jInternalFrameDetalleFormTasa.jMenuItemModificarTasa.setVisible((this.isVisibilidadCeldaModificarTasa && this.isPermisoActualizarTasa));	
			this.jInternalFrameDetalleFormTasa.jMenuItemActualizarTasa.setVisible((this.isVisibilidadCeldaActualizarTasa && this.isPermisoActualizarTasa));	
			this.jInternalFrameDetalleFormTasa.jMenuItemEliminarTasa.setVisible((this.isVisibilidadCeldaEliminarTasa && this.isPermisoEliminarTasa));
			this.jInternalFrameDetalleFormTasa.jMenuItemCancelarTasa.setVisible(this.isVisibilidadCeldaCancelarTasa);				
			}
			
			this.jMenuItemGuardarCambiosTasa.setVisible((this.isVisibilidadCeldaGuardarTasa && this.isPermisoGuardarCambiosTasa));						
			this.jMenuItemGuardarCambiosTablaTasa.setVisible((this.isVisibilidadCeldaGuardarCambiosTasa && this.isPermisoGuardarCambiosTasa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTasa=this.jButtonNuevoTasa.isVisible();
			this.isVisibilidadCeldaDuplicarTasa=this.jButtonDuplicarTasa.isVisible();
			this.isVisibilidadCeldaCopiarTasa=this.jButtonCopiarTasa.isVisible();
			this.isVisibilidadCeldaVerFormTasa=this.jButtonVerFormTasa.isVisible();
			
			this.isVisibilidadCeldaOrdenTasa=this.jButtonAbrirOrderByTasa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTasa=this.jButtonNuevoRelacionesTasa.isVisible();
			this.isVisibilidadCeldaModificarTasa=this.jButtonModificarTasa.isVisible();
			
			if(this.jInternalFrameDetalleFormTasa!=null) {
			this.isVisibilidadCeldaActualizarTasa=this.jInternalFrameDetalleFormTasa.jButtonActualizarTasa.isVisible();
			this.isVisibilidadCeldaEliminarTasa=this.jInternalFrameDetalleFormTasa.jButtonEliminarTasa.isVisible();
			this.isVisibilidadCeldaCancelarTasa=this.jInternalFrameDetalleFormTasa.jButtonCancelarTasa.isVisible();
			this.isVisibilidadCeldaGuardarTasa=this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosTasa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTasa=this.jButtonGuardarCambiosTablaTasa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTasa=this.jButtonNuevoToolBarTasa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTasa=this.jButtonNuevoRelacionesToolBarTasa.isVisible();
			
			if(this.jInternalFrameDetalleFormTasa!=null) {
			this.isVisibilidadCeldaModificarTasa=this.jInternalFrameDetalleFormTasa.jButtonModificarToolBarTasa.isVisible();
			this.isVisibilidadCeldaActualizarTasa=this.jInternalFrameDetalleFormTasa.jButtonActualizarToolBarTasa.isVisible();
			this.isVisibilidadCeldaEliminarTasa=this.jInternalFrameDetalleFormTasa.jButtonEliminarToolBarTasa.isVisible();
			this.isVisibilidadCeldaCancelarTasa=this.jInternalFrameDetalleFormTasa.jButtonCancelarToolBarTasa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTasa=this.jButtonGuardarCambiosToolBarTasa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTasa=this.jButtonGuardarCambiosTablaToolBarTasa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTasa=this.jMenuItemNuevoTasa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTasa=this.jMenuItemNuevoRelacionesTasa.isVisible();
			
			if(this.jInternalFrameDetalleFormTasa!=null) {
			this.isVisibilidadCeldaModificarTasa=this.jInternalFrameDetalleFormTasa.jMenuItemModificarTasa.isVisible();
			this.isVisibilidadCeldaActualizarTasa=this.jInternalFrameDetalleFormTasa.jMenuItemActualizarTasa.isVisible();
			this.isVisibilidadCeldaEliminarTasa=this.jInternalFrameDetalleFormTasa.jMenuItemEliminarTasa.isVisible();
			this.isVisibilidadCeldaCancelarTasa=this.jInternalFrameDetalleFormTasa.jMenuItemCancelarTasa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTasa=this.jMenuItemGuardarCambiosTasa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTasa=this.jMenuItemGuardarCambiosTablaTasa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTasa(Boolean esInicializar) {
		if(TasaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tasaSessionBean.getConGuardarRelaciones()) {
				//if(this.tasaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTasa();
			}
			
			this.inicializarActualizarBindingBotonesManualTasa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTasa() {
		this.jButtonNuevoTasa.setVisible(this.isPermisoNuevoTasa);			
		this.jButtonDuplicarTasa.setVisible(this.isPermisoDuplicarTasa);			
		this.jButtonCopiarTasa.setVisible(this.isPermisoCopiarTasa);			
		this.jButtonVerFormTasa.setVisible(this.isPermisoVerFormTasa);			
		
		this.jButtonAbrirOrderByTasa.setVisible(this.isPermisoOrdenTasa);					
		
		this.jButtonNuevoRelacionesTasa.setVisible(this.isPermisoNuevoTasa);			
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jButtonModificarTasa.setVisible(this.isPermisoActualizarTasa);	
			this.jInternalFrameDetalleFormTasa.jButtonActualizarTasa.setVisible(this.isPermisoActualizarTasa);	
			this.jInternalFrameDetalleFormTasa.jButtonEliminarTasa.setVisible(this.isPermisoEliminarTasa);
			this.jInternalFrameDetalleFormTasa.jButtonCancelarTasa.setVisible(this.isVisibilidadCeldaCancelarTasa);						
			this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosTasa.setVisible(this.isPermisoGuardarCambiosTasa);							
		}
		
		this.jButtonGuardarCambiosTablaTasa.setVisible(this.isPermisoActualizarTasa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTasa() {
		this.jInternalFrameDetalleFormTasa.jButtonModificarTasa.setVisible(this.isPermisoActualizarTasa);	
		this.jInternalFrameDetalleFormTasa.jButtonActualizarTasa.setVisible(this.isPermisoActualizarTasa);	
		this.jInternalFrameDetalleFormTasa.jButtonEliminarTasa.setVisible(this.isPermisoEliminarTasa);
		this.jInternalFrameDetalleFormTasa.jButtonCancelarTasa.setVisible(this.isVisibilidadCeldaCancelarTasa);							
		this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosTasa.setVisible((this.isVisibilidadCeldaGuardarTasa && this.isPermisoGuardarCambiosTasa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTasa() {
		if(TasaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTasa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTasa() {
	}
	
	public void jTableDatosTasaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTasa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTasaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTasa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTasa(this.gettasa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tasa==null) {
						this.tasa = new Tasa();
					}

					this.setVariablesFormularioToObjetoActualTasa(this.tasa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
				}

				if(this.tasa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tasa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTasa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTasaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTasa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTasa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTasa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTasa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTasa(this.gettasa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tasaLogic.getConnexion());

				if(this.tasa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tasa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTasa=(TitledBorder)this.jScrollPanelDatosTasa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTasa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTasaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTasa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTasa(this.gettasa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tasa==null) {
						this.tasa = new Tasa();
					}

					this.setVariablesFormularioToObjetoActualTasa(this.tasa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
				}

				if(this.tasa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tasa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTasa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorTasaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTasa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTasa(this.gettasa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tasa==null) {
						this.tasa = new Tasa();
					}

					this.setVariablesFormularioToObjetoActualTasa(this.tasa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);
				}

				if(this.tasa.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.tasa.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTasa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTasaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTasa(false,false);

			this.getTasasFK_IdEmpresa();

			this.inicializarActualizarBindingTasa(false);

			//if(TasaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTasa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tasaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTasa() {
		if(this.jInternalFrameDetalleFormTasa!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTasa!=null) {
			this.jInternalFrameDetalleFormTasa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTasa.dispose();
			this.jInternalFrameDetalleFormTasa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTasa!=null) {
			this.jInternalFrameReporteDinamicoTasa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTasa.dispose();
			this.jInternalFrameReporteDinamicoTasa=null;
		}
		
		if(this.jInternalFrameImportacionTasa!=null) {
			this.jInternalFrameImportacionTasa.setVisible(false);	    			
			this.jInternalFrameImportacionTasa.dispose();
			this.jInternalFrameImportacionTasa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTasa();
			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTasa")) {
				jButtonNuevoTasaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTasa")) {
				jButtonDuplicarTasaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTasa")) {
				jButtonCopiarTasaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTasa")) {
				jButtonVerFormTasaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTasa")) {
				jButtonNuevoTasaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTasa")) {
				jButtonDuplicarTasaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTasa")) {
				jButtonNuevoTasaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTasa")) {
				jButtonDuplicarTasaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTasa")) {
				jButtonNuevoTasaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTasa")) {
				jButtonNuevoTasaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTasa")) {
				jButtonNuevoTasaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTasa")) {
				jButtonModificarTasaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTasa")) {
				jButtonModificarTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTasa")) {
				jButtonModificarTasaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTasa")) {
				jButtonActualizarTasaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTasa")) {
				jButtonActualizarTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTasa")) {
				jButtonActualizarTasaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTasa")) {
				jButtonEliminarTasaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTasa")) {
				jButtonEliminarTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTasa")) {
				jButtonEliminarTasaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTasa")) {
				jButtonCancelarTasaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTasa")) {
				jButtonCancelarTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTasa")) {
				jButtonCancelarTasaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTasa")) {
				jButtonCerrarTasaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTasa")) {
				jButtonCerrarTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTasa")) {
				jButtonCerrarTasaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTasa")) {
				jButtonMostrarOcultarTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTasa")) {
				jButtonCancelarTasaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTasa")) {
				jButtonGuardarCambiosTasaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTasa")) {
				jButtonGuardarCambiosTasaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTasa")) {
				jButtonCopiarTasaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTasa")) {
				jButtonVerFormTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTasa")) {
				jButtonGuardarCambiosTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTasa")) {
				jButtonCopiarTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTasa")) {
				jButtonVerFormTasaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTasa")) {
				jButtonGuardarCambiosTasaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTasa")) {
				jButtonGuardarCambiosTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTasa")) {
				jButtonGuardarCambiosTasaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTasa")) {
				jButtonRecargarInformacionTasaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTasa")) {
				jButtonRecargarInformacionTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTasa")) {
				jButtonRecargarInformacionTasaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTasa")) {
				jButtonAnterioresTasaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTasa")) {
				jButtonAnterioresTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTasa")) {
				jButtonAnterioresTasaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTasa")) {
				jButtonSiguientesTasaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTasa")) {
				jButtonSiguientesTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTasa")) {
				jButtonSiguientesTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTasa") || sTipo.equals("MenuItemDetalleAbrirOrderByTasa")) {
				jButtonAbrirOrderByTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTasa") || sTipo.equals("MenuItemDetalleMostrarOcultarTasa")) {
				jButtonMostrarOcultarTasaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTasa")) {
				jButtonNuevoGuardarCambiosTasaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTasa")) {
				jButtonNuevoGuardarCambiosTasaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTasa")) {
				jButtonNuevoGuardarCambiosTasaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTasa")) {
				jButtonCerrarReporteDinamicoTasaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTasa")) {
				jButtonGenerarReporteDinamicoTasaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTasa")) {
				
				jButtonGenerarExcelReporteDinamicoTasaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTasa")) {
				jButtonCerrarImportacionTasaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTasa")) {
				
				jButtonGenerarImportacionTasaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTasa")) {
				
				jButtonAbrirImportacionTasaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTasa")) {
				jComboBoxTiposAccionesTasaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTasa")) {
				jComboBoxTiposRelacionesTasaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTasa")) {
				jComboBoxTiposAccionesTasaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTasa")) {
				
				jComboBoxTiposSeleccionarTasaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTasa")) {
				jTextFieldValorCampoGeneralTasaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTasa")) {
				jButtonAbrirOrderByTasaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTasa")) {
				jButtonAbrirOrderByTasaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTasa")) {
				jButtonCerrarOrderByTasaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTasaBusqueda")) {
				this.jButtonidTasaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTasaUpdate")) {
				this.jButtonid_empresaTasaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTasaBusqueda")) {
				this.jButtonid_empresaTasaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorTasaBusqueda")) {
				this.jButtonvalorTasaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTasa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTasaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				


				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Tasa tasaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tasaLocal=this.tasa;
			} else {
				tasaLocal=this.tasaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
							
				
				


				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTasaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTasa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaAnterior =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tasaAnterior =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
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
			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
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
			
			


			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTasaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
								
						
				


				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
								
				
				


				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTasaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTasa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaAnterior =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tasaAnterior =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTasaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTasa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaAnterior =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tasaAnterior =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTasaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
							
				
				


				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTasaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTasa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tasaAnterior =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tasaAnterior =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
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
			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
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
			
			


			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTasaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
								
				
				


				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTasaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTasa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaAnterior =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tasaAnterior =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTasaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTasaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTasa")) {
					jCheckBoxSeleccionarTodosTasaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTasa")) {
					jCheckBoxSeleccionadosTasaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTasa")) {
					
				}
				
				


				
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
												
				
				


				
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTasaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTasa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tasaAnterior =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tasaAnterior =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTasaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
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
			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
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
			
			


			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTasaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tasa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tasa);
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
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
				
				


				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Tasa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Tasa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTasaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTasa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tasaAnterior =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tasaAnterior =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTasa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTasaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTasa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tasa =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tasa =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tasa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTasa")) {
				
				}
				
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTasa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTasa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTasa")) {
			
			}
			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTasa();
			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
			if(sTipo.equals("NuevoTasa")) {
				jButtonNuevoTasaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTasa")) {
				jButtonDuplicarTasaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTasa")) {
				jButtonCopiarTasaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTasa")) {
				jButtonVerFormTasaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTasa")) {
				jButtonNuevoTasaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTasa")) {
				jButtonModificarTasaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTasa")) {
				jButtonActualizarTasaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTasa")) {
				jButtonEliminarTasaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTasa")) {
				jButtonGuardarCambiosTasaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTasa")) {
				jButtonCancelarTasaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTasa")) {
				jButtonCerrarTasaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTasa")) {
				jButtonGuardarCambiosTasaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTasa")) {
				jButtonNuevoGuardarCambiosTasaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTasa")) {
				jButtonAbrirOrderByTasaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTasa")) {
				jButtonRecargarInformacionTasaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTasa")) {
				jButtonAnterioresTasaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTasa")) {
				jButtonSiguientesTasaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTasaBusqueda")) {
				this.jButtonidTasaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTasaUpdate")) {
				this.jButtonid_empresaTasaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTasaBusqueda")) {
				this.jButtonid_empresaTasaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorTasaBusqueda")) {
				this.jButtonvalorTasaBusquedaActionPerformed(evt);
			}
			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTasa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTasa")) {
				closingInternalFrameTasa();
				
			} else if(sTipo.equals("jButtonCancelarTasa")) {
				JInternalFrameBase jInternalFrameDetalleFormTasa = (JInternalFrameBase)evt.getSource();
	            	
	            TasaBeanSwingJInternalFrame jInternalFrameParent=(TasaBeanSwingJInternalFrame)jInternalFrameDetalleFormTasa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTasaActionPerformed(null);
			}
			
			TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tasa,new Object(),this.tasaParameterGeneral,this.tasaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTasa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTasa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTasa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tasa)) {
			if(!esControlTabla) {
				if(TasaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTasa(this.tasa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);			
				}
				
				if(this.tasaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTasa(this.tasa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tasaReturnGeneral=tasaLogic.procesarEventosTasasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tasaLogic.getTasas(),this.tasa,this.tasaParameterGeneral,this.isEsNuevoTasa,classes);//this.tasaLogic.getTasa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTasa(this.tasaReturnGeneral,this.tasaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tasaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTasa(classes,this.tasaReturnGeneral,this.tasaBean,false);
					}
						
					if(this.tasaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTasa(this.tasaReturnGeneral.getTasa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTasa(this.tasaReturnGeneral.getTasa());	
					}
						
					if(this.tasaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTasa(this.tasaReturnGeneral.getTasa(),classes);//this.tasaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTasa(this.tasa,classes);//this.tasaBean);									
				}
			
				if(TasaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTasa(this.tasa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTasa(this.tasa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tasaAnterior!=null) {
						this.tasa=this.tasaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tasaReturnGeneral=tasaLogic.procesarEventosTasasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tasaLogic.getTasas(),this.tasa,this.tasaParameterGeneral,this.isEsNuevoTasa,classes);//this.tasaLogic.getTasa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tasaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tasaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tasaReturnGeneral.getTasa(),tasaLogic.getTasas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tasaReturnGeneral.getTasa(),this.tasas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTasa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTasa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTasa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTasa() throws Exception {
		
		TasaModel tasaModel=(TasaModel)this.jTableDatosTasa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tasaModel.tasas=this.tasaLogic.getTasas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tasaModel.tasas=this.tasas;
		}
		
		
		((TasaModel) this.jTableDatosTasa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTasa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettasaAnterior(),this.tasaLogic.getTasas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettasaAnterior(),this.tasas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTasa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTasa(Tasa tasa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
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
										
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tasa,new Object(),generalEntityParameterGeneral,this.tasaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tasaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TasaConstantesFunciones.getClassesRelationshipsOfTasa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TasaConstantesFunciones.getClassesRelationshipsFromStringsOfTasa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTasa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TasaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tasa,new Object(),generalEntityParameterGeneral,this.tasaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TasaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTasa(TasaBean tasaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTasa(ArrayList<Classe> classes,TasaReturnGeneral tasaReturnGeneral,TasaBean tasaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTasa(Tasa tasa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tasa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTasa = new TasaDetalleFormJInternalFrame(jDesktopPane,this.tasaSessionBean.getConGuardarRelaciones(),this.tasaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTasa);
		this.jInternalFrameDetalleFormTasa.setVisible(false);
		this.jInternalFrameDetalleFormTasa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTasa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTasa.tasaLogic=this.tasaLogic;
		
		this.cargarCombosFrameForeignKeyTasa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTasa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTasa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTasa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTasa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTasa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTasa"));
		
		this.jInternalFrameDetalleFormTasa.jButtonModificarTasa.addActionListener(new ButtonActionListener(this,"ModificarTasa"));

		
		this.jInternalFrameDetalleFormTasa.jButtonModificarToolBarTasa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTasa"));
					
		this.jInternalFrameDetalleFormTasa.jMenuItemModificarTasa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTasa"));		
		
		
		
		this.jInternalFrameDetalleFormTasa.jButtonActualizarTasa.addActionListener (new ButtonActionListener(this,"ActualizarTasa"));
		
		
		this.jInternalFrameDetalleFormTasa.jButtonActualizarToolBarTasa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTasa"));
						
		this.jInternalFrameDetalleFormTasa.jMenuItemActualizarTasa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTasa"));		
		
		
		
		this.jInternalFrameDetalleFormTasa.jButtonEliminarTasa.addActionListener (new ButtonActionListener(this,"EliminarTasa"));
		
		
		this.jInternalFrameDetalleFormTasa.jButtonEliminarToolBarTasa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTasa"));
								
		this.jInternalFrameDetalleFormTasa.jMenuItemEliminarTasa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTasa"));		
		
		
		
		this.jInternalFrameDetalleFormTasa.jButtonCancelarTasa.addActionListener (new ButtonActionListener(this,"CancelarTasa"));
		
		
		this.jInternalFrameDetalleFormTasa.jButtonCancelarToolBarTasa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTasa"));
					
		this.jInternalFrameDetalleFormTasa.jMenuItemCancelarTasa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTasa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTasa.jMenuItemDetalleCerrarTasa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTasa"));		
		
		
		
		this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosToolBarTasa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTasa"));
		
		
		
		this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosToolBarTasa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTasa"));
		
		
		
		this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTasa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTasa.jButtonidTasaBusqueda.addActionListener(new ButtonActionListener(this,"idTasaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTasa.jButtonid_empresaTasaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTasaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTasa.jButtonid_empresaTasaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTasaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTasa.jButtonvalorTasaBusqueda.addActionListener(new ButtonActionListener(this,"valorTasaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTasa.jTabbedPaneRelacionesTasa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTasa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTasa"));
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTasa"));
		}
		
		this.jTableDatosTasa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTasa"));
		
		this.jTableDatosTasa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTasa"));
		
		this.jButtonNuevoTasa.addActionListener(new ButtonActionListener(this,"NuevoTasa"));
		
		this.jButtonDuplicarTasa.addActionListener(new ButtonActionListener(this,"DuplicarTasa"));
		
		this.jButtonCopiarTasa.addActionListener(new ButtonActionListener(this,"CopiarTasa"));
		
		this.jButtonVerFormTasa.addActionListener(new ButtonActionListener(this,"VerFormTasa"));
		
		
		this.jButtonNuevoToolBarTasa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTasa"));
			
		this.jButtonDuplicarToolBarTasa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTasa"));
			
		this.jMenuItemNuevoTasa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTasa"));
			
		this.jMenuItemDuplicarTasa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTasa"));		
		
		
		this.jButtonNuevoRelacionesTasa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTasa"));
		
		
		this.jButtonNuevoRelacionesToolBarTasa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTasa"));
			
		this.jMenuItemNuevoRelacionesTasa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTasa"));		
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jButtonModificarTasa.addActionListener(new ButtonActionListener(this,"ModificarTasa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jButtonModificarToolBarTasa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTasa"));
			
			this.jInternalFrameDetalleFormTasa.jMenuItemModificarTasa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTasa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTasa.jButtonActualizarTasa.addActionListener (new ButtonActionListener(this,"ActualizarTasa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jButtonActualizarToolBarTasa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTasa"));
				
			this.jInternalFrameDetalleFormTasa.jMenuItemActualizarTasa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTasa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jButtonEliminarTasa.addActionListener (new ButtonActionListener(this,"EliminarTasa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jButtonEliminarToolBarTasa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTasa"));
						
			this.jInternalFrameDetalleFormTasa.jMenuItemEliminarTasa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTasa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jButtonCancelarTasa.addActionListener (new ButtonActionListener(this,"CancelarTasa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jButtonCancelarToolBarTasa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTasa"));
			
			this.jInternalFrameDetalleFormTasa.jMenuItemCancelarTasa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTasa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTasa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTasa"));		
		
		
		this.jButtonCerrarTasa.addActionListener (new ButtonActionListener(this,"CerrarTasa"));
		
		
		this.jButtonCerrarToolBarTasa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTasa"));
			
		this.jMenuItemCerrarTasa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTasa"));
			
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jMenuItemDetalleCerrarTasa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTasa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosTasa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTasa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosToolBarTasa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTasa"));
		}
		
		this.jButtonCopiarToolBarTasa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTasa"));
			
		this.jButtonVerFormToolBarTasa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTasa"));
		
		this.jMenuItemGuardarCambiosTasa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTasa"));
			
		this.jMenuItemCopiarTasa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTasa"));		
		
		this.jMenuItemVerFormTasa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTasa"));		
		
		
		this.jButtonGuardarCambiosTablaTasa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTasa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTasa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTasa"));
			
		this.jMenuItemGuardarCambiosTablaTasa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTasa"));		
		
		
		
		this.jButtonRecargarInformacionTasa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTasa"));
					
		this.jButtonRecargarInformacionToolBarTasa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTasa"));
		
		this.jMenuItemRecargarInformacionTasa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTasa"));		
		
		
		
		this.jButtonAnterioresTasa.addActionListener (new ButtonActionListener(this,"AnterioresTasa"));
		
		
		this.jButtonAnterioresToolBarTasa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTasa"));
		
		this.jMenuItemAnterioresTasa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTasa"));		
		
		
		this.jButtonSiguientesTasa.addActionListener (new ButtonActionListener(this,"SiguientesTasa"));
		
		
		this.jButtonSiguientesToolBarTasa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTasa"));
			
		this.jMenuItemSiguientesTasa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTasa"));
			
		this.jMenuItemAbrirOrderByTasa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTasa"));
			
		this.jMenuItemMostrarOcultarTasa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTasa"));
			
		this.jMenuItemDetalleAbrirOrderByTasa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTasa"));
			
		this.jMenuItemDetalleMostarOcultarTasa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTasa"));		
		
		
		this.jButtonNuevoGuardarCambiosTasa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTasa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTasa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTasa"));
			
		this.jMenuItemNuevoGuardarCambiosTasa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTasa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTasa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTasa"));

		this.jCheckBoxSeleccionadosTasa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTasa"));
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTasa"));
		}
		
		
		this.jComboBoxTiposRelacionesTasa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTasa"));
			
		this.jComboBoxTiposAccionesTasa.addActionListener (new ButtonActionListener(this,"TiposAccionesTasa"));
					
		this.jComboBoxTiposSeleccionarTasa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTasa"));
			
		this.jTextFieldValorCampoGeneralTasa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTasa"));		
		
		
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTasa.jButtonidTasaBusqueda.addActionListener(new ButtonActionListener(this,"idTasaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTasa.jButtonid_empresaTasaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTasaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTasa.jButtonid_empresaTasaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTasaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTasa.jButtonvalorTasaBusqueda.addActionListener(new ButtonActionListener(this,"valorTasaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTasa!=null) {
				this.jInternalFrameReporteDinamicoTasa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTasa"));
				this.jInternalFrameReporteDinamicoTasa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTasa"));
				this.jInternalFrameReporteDinamicoTasa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTasa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTasa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTasa"));				
			//this.jButtonGenerarReporteDinamicoTasa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTasa"));
			//this.jButtonGenerarExcelReporteDinamicoTasa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTasa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTasa!=null) {
				this.jInternalFrameImportacionTasa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTasa"));
				this.jInternalFrameImportacionTasa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTasa"));
				this.jInternalFrameImportacionTasa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTasa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTasa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTasa"));
			
			this.jButtonAbrirOrderByToolBarTasa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTasa"));			
			
			if(this.jInternalFrameOrderByTasa!=null) {
				this.jInternalFrameOrderByTasa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTasa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTasa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTasa.jTabbedPaneRelacionesTasa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTasa"));
		
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
            		closingInternalFrameTasa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTasa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTasa = (JInternalFrameBase)event.getSource();
	            	
	            TasaBeanSwingJInternalFrame jInternalFrameParent=(TasaBeanSwingJInternalFrame)jInternalFrameDetalleFormTasa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTasaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTasa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTasaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTasa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTasa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTasaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTasaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTasaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTasa";
		inputMap = this.jButtonNuevoTasa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTasa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTasaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTasaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTasaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTasaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTasa";
		inputMap = this.jButtonNuevoRelacionesTasa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTasa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTasaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTasa";
		inputMap = this.jButtonModificarTasa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTasa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTasaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTasa";
		inputMap = this.jButtonActualizarTasa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTasa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTasaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTasa";
		inputMap = this.jButtonEliminarTasa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTasa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTasaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTasa";
		inputMap = this.jButtonCancelarTasa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTasa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTasaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTasa";
		inputMap = this.jButtonCerrarTasa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTasa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTasaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTasa";
		inputMap = this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosTasa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTasa.jButtonGuardarCambiosTasa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTasaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTasa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTasaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTasa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTasaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTasa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTasaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTasa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTasaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTasa.jButtonidTasaBusqueda.addActionListener(new ButtonActionListener(this,"idTasaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTasa.jButtonid_empresaTasaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTasaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTasa.jButtonid_empresaTasaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTasaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTasa.jButtonvalorTasaBusqueda.addActionListener(new ButtonActionListener(this,"valorTasaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTasa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTasaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTasaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTasa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTasa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Tasa tasaAux:this.tasaLogic.getTasas()) {
					tasaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Tasa tasaAux:tasas) {
					tasaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTasaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTasa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Tasa tasaAux:this.tasaLogic.getTasas()) {
						tasaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Tasa tasaAux:tasas) {
						tasaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Tasa tasaAux:this.tasaLogic.getTasas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Tasa tasaAux:tasas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTasa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTasa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTasa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTasa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTasaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTasa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTasa.getSelectedRows();
			
			Tasa tasaLocal=new Tasa();
			
			//this.seleccionarTodosTasa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tasaLocal =(Tasa) this.tasaLogic.getTasas().toArray()[this.jTableDatosTasa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tasaLocal =(Tasa) this.tasas.toArray()[this.jTableDatosTasa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tasaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Tasa tasaAux:this.tasaLogic.getTasas()) {
						tasaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Tasa tasaAux:tasas) {
						tasaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTasa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTasa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTasa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTasa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTasaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTasaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTasaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTasa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTasa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Tasa tasaAux:this.tasaLogic.getTasas()) {
				
						if(sTipoSeleccionar.equals(TasaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							tasaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Tasa tasaAux:tasas) {
					
						if(sTipoSeleccionar.equals(TasaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							tasaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTasa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTasaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTasa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTasa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTasa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTasa) {				
					conSplash=true;//false;										
					
					//this.startProcessTasa(conSplash);
				
					this.generarReporteTasasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTasasSeleccionados();
				//this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTasasSeleccionados(false);
				//this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTasasSeleccionados(true);
				//this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTasa();
				
				this.exportarTasasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTasas();
				//this.importarTasas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTasa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTasasSeleccionados();
				//this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tasa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTasa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTasa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTasa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tasa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.setSelectedIndex(0);					
				}	
			} 			
			else if(TasaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTasa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTasa(conSplash);
					
						//this.actualizarParametrosGeneralTasa();
						
						this.generarReporteProcesoAccionTasasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TasaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO TasaS SELECCIONADOS?", "MANTENIMIENTO DE Tasa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTasa();
				
						this.actualizarParametrosGeneralTasa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tasaReturnGeneral=tasaLogic.procesarAccionTasasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tasaLogic.getTasas(),this.tasaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTasaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTasa();
					
					TasaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTasaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTasa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTasa.jComboBoxTiposAccionesFormularioTasa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTasa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTasaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTasa();
			
			if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();		
			Tasa tasa=new Tasa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTasa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTasa.getSelectedItem();
			
			
			
			
			tasasSeleccionados=this.getTasasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tasasSeleccionados.size()==1) {
				for(Tasa tasaAux:tasasSeleccionados) {
					tasa=tasaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTasa();
			
      		//this.finishProcessTasa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTasaReturnGeneral() throws Exception {
		if(this.tasaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tasaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tasaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tasaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tasaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tasaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTasa(false);
		}
		
		if(this.tasaReturnGeneral.getConRetornoLista() || this.tasaReturnGeneral.getConRetornoObjeto()) {
			if(this.tasaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tasaLogic.setTasas(this.tasaReturnGeneral.getTasas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tasaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tasaLogic.setTasa(this.tasaReturnGeneral.getTasa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTasa(false);
		}
	}
	
	public void actualizarParametrosGeneralTasa() throws Exception {
		
		
	}
	
	public ArrayList<Tasa> getTasasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTasa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Tasa tasaAux:tasaLogic.getTasas()) {
					if(tasaAux.getIsSelected()) {
						tasasSeleccionados.add(tasaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Tasa tasaAux:this.tasas) {
					if(tasaAux.getIsSelected()) {
						tasasSeleccionados.add(tasaAux);				
					}
				}
			}
			
			if(tasasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tasasSeleccionados.addAll(this.tasaLogic.getTasas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tasasSeleccionados.addAll(this.tasas);				
					}
				}
			}
		} else {
			tasasSeleccionados.add(this.tasa);
		}
		
		return tasasSeleccionados;
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
	
	public void generarReporteTasasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTasasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTasasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTasasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTasasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tasa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTasasSeleccionados() throws Exception {
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();		
		
		tasasSeleccionados=this.getTasasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTasas("Todos",tasasSeleccionados);
		
	}	
	
	public void generarReporteNormalTasasSeleccionados() throws Exception {
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();		
		
		tasasSeleccionados=this.getTasasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTasas("Todos",tasasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTasasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();
		
		tasasSeleccionados=this.getTasasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTasas("Todos",tasasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTasasSeleccionados() throws Exception {
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTasa();
		
		
		tasasSeleccionados=this.getTasasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTasa();
		
		
		//this.generarReporteTasas("Todos",tasasSeleccionados ,tasaImplementable,tasaImplementableHome);
	}
	
	public void mostrarImportacionTasas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTasa();
		
		this.abrirFrameImportacionTasa();		
		
			
		//this.generarReporteTasas("Todos",tasasSeleccionados ,tasaImplementable,tasaImplementableHome);
	}
	
	public void importarTasas() throws Exception {		
	
	}
	
	public void exportarTasasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTasasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTasasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTasasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tasa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTasasSeleccionados() throws Exception {
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();		
		
		tasasSeleccionados=this.getTasasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tasa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTasa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Tasa tasaAux:tasasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTasa(tasaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tasaAux.setsDetalleGeneralEntityReporte(tasaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tasaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tasa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTasa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TasaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TasaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TasaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TasaConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTasa(Tasa tasa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tasa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tasa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tasa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tasa.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTasasSeleccionados() throws Exception {
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();		
		
		tasasSeleccionados=this.getTasasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tasa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Tasas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTasa(row);				
				iRow++;
			}				
			
			for(Tasa tasaAux:tasasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTasa(tasaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tasaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tasa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTasasSeleccionados() throws Exception {
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();		
		
		tasasSeleccionados=this.getTasasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tasa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tasas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tasa");
			//elementRoot.appendChild(element);
		
			for(Tasa tasaAux:tasasSeleccionados) {
				element = document.createElement("tasa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTasa(tasaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tasaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tasa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTasa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TasaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TasaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TasaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TasaConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTasa(Tasa tasa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tasa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tasa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tasa.getvalor());				
	}
	
	public void setFilaDatosExportarXmlTasa(Tasa tasa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TasaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tasa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TasaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tasa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TasaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tasa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementvalor = document.createElement(TasaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(tasa.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoTasasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Tasa> tasasSeleccionados=new ArrayList<Tasa>();
		
		tasasSeleccionados=this.getTasasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTasa(tasasSeleccionados);
		
		this.generarReporteTasas("Todos",tasasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTasa(ArrayList<Tasa> tasasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Tasa tasaAux:tasasSeleccionados) {
				tasaAux.setsDetalleGeneralEntityReporte(tasaAux.toString());
			
				if(sTipoSeleccionar.equals(TasaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tasaAux.setsDescripcionGeneralEntityReporte1(tasaAux.getempresa_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TasaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTasa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTasa=true;
				this.isVisibilidadCeldaNuevoRelacionesTasa=true;
				this.isVisibilidadCeldaGuardarCambiosTasa=true;
			}
			
			this.isVisibilidadCeldaModificarTasa=false;
			this.isVisibilidadCeldaActualizarTasa=false;
			this.isVisibilidadCeldaEliminarTasa=false;
			this.isVisibilidadCeldaCancelarTasa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTasa=true;
				} else {
					this.isVisibilidadCeldaGuardarTasa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTasa=false;
			this.isVisibilidadCeldaNuevoRelacionesTasa=false;
			this.isVisibilidadCeldaGuardarCambiosTasa=false;
			this.isVisibilidadCeldaModificarTasa=false;
			this.isVisibilidadCeldaActualizarTasa=true;
			this.isVisibilidadCeldaEliminarTasa=false;
			this.isVisibilidadCeldaCancelarTasa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTasa=true;
				} else {
					this.isVisibilidadCeldaGuardarTasa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTasa=false;
			this.isVisibilidadCeldaNuevoRelacionesTasa=false;
			this.isVisibilidadCeldaGuardarCambiosTasa=false;
			this.isVisibilidadCeldaModificarTasa=false;
			this.isVisibilidadCeldaActualizarTasa=true;
			this.isVisibilidadCeldaEliminarTasa=true;
			this.isVisibilidadCeldaCancelarTasa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTasa=true;
				} else {
					this.isVisibilidadCeldaGuardarTasa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTasa=false;
			this.isVisibilidadCeldaNuevoRelacionesTasa=false;
			this.isVisibilidadCeldaGuardarCambiosTasa=false;
			this.isVisibilidadCeldaModificarTasa=false;
			this.isVisibilidadCeldaActualizarTasa=true;
			this.isVisibilidadCeldaEliminarTasa=false;
			this.isVisibilidadCeldaCancelarTasa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTasa=false;
				} else {
					this.isVisibilidadCeldaGuardarTasa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTasa=true;
			this.isVisibilidadCeldaNuevoRelacionesTasa=true;
			this.isVisibilidadCeldaGuardarCambiosTasa=true;
			this.isVisibilidadCeldaModificarTasa=false;
			this.isVisibilidadCeldaActualizarTasa=false;
			this.isVisibilidadCeldaEliminarTasa=false;
			this.isVisibilidadCeldaCancelarTasa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTasa=true;
				} else {
					this.isVisibilidadCeldaGuardarTasa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTasa=false;
			this.isVisibilidadCeldaNuevoRelacionesTasa=false;
			this.isVisibilidadCeldaGuardarCambiosTasa=false;
			this.isVisibilidadCeldaActualizarTasa=false;
			this.isVisibilidadCeldaEliminarTasa=false;
			this.isVisibilidadCeldaCancelarTasa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTasa=false;
				} else {
					this.isVisibilidadCeldaGuardarTasa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTasa=false;
			this.isVisibilidadCeldaNuevoRelacionesTasa=false;
			this.isVisibilidadCeldaGuardarCambiosTasa=false;
			this.isVisibilidadCeldaModificarTasa=true;
			this.isVisibilidadCeldaActualizarTasa=false;
			this.isVisibilidadCeldaEliminarTasa=false;
			this.isVisibilidadCeldaCancelarTasa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTasa=false;
				} else {
					this.isVisibilidadCeldaGuardarTasa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TasaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTasa=true;
			this.isVisibilidadCeldaNuevoRelacionesTasa=true;
			this.isVisibilidadCeldaGuardarCambiosTasa=true;
		} else {
			this.actualizarEstadoPanelsTasa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTasa=false;
			//this.isVisibilidadCeldaVerFormTasa=false;
			this.isVisibilidadCeldaDuplicarTasa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tasaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTasa=false;
		} else {
			this.isVisibilidadCeldaNuevoTasa=false;
			this.isVisibilidadCeldaGuardarCambiosTasa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tasaSessionBean.getEsGuardarRelacionado()) {
			if(!tasaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTasa=false;												
			}
			
			this.jButtonCerrarTasa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTasa=false;
		}
		
		if(!this.permiteMantenimiento(this.tasa)) {
			this.isVisibilidadCeldaActualizarTasa=false;
			this.isVisibilidadCeldaEliminarTasa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTasa() {
	}
	
	public void actualizarEstadoPanelsTasa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTasa!=null) {
				this.jScrollPanelDatosEdicionTasa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTasa!=null) {
				this.jTabbedPaneBusquedasTasa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTasa!=null) {
				this.jScrollPanelDatosTasa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTasa!=null) {
				this.jPanelPaginacionTasa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTasa!=null) {
				this.jPanelParametrosReportesTasa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTasa!=null) {
				this.jScrollPanelDatosEdicionTasa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTasa!=null) {
				this.jTabbedPaneBusquedasTasa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTasa!=null) {
				this.jScrollPanelDatosTasa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTasa!=null) {
				this.jPanelPaginacionTasa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTasa!=null) {
				this.jPanelParametrosReportesTasa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTasa!=null) {
				this.jScrollPanelDatosEdicionTasa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTasa!=null) {
				this.jTabbedPaneBusquedasTasa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTasa!=null) {
				this.jScrollPanelDatosTasa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTasa!=null) {
				this.jPanelPaginacionTasa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTasa!=null) {
				this.jPanelParametrosReportesTasa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTasa!=null) {
				this.jScrollPanelDatosEdicionTasa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTasa!=null) {
				this.jTabbedPaneBusquedasTasa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTasa!=null) {
				this.jScrollPanelDatosTasa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTasa!=null) {
				this.jPanelPaginacionTasa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTasa!=null) {
				this.jPanelParametrosReportesTasa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTasa!=null) {
				this.jScrollPanelDatosEdicionTasa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTasa!=null) {
				this.jTabbedPaneBusquedasTasa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTasa!=null) {
				this.jScrollPanelDatosTasa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTasa!=null) {
				this.jPanelPaginacionTasa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTasa!=null) {
				this.jPanelParametrosReportesTasa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTasa!=null) {
				this.jScrollPanelDatosEdicionTasa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTasa!=null) {
				this.jTabbedPaneBusquedasTasa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTasa!=null) {
				this.jScrollPanelDatosTasa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTasa!=null) {
				this.jPanelPaginacionTasa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTasa!=null) {
				this.jPanelParametrosReportesTasa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTasa!=null) {
				this.jScrollPanelDatosEdicionTasa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTasa!=null) {
				this.jTabbedPaneBusquedasTasa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTasa!=null) {
				this.jScrollPanelDatosTasa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTasa!=null) {
				this.jPanelPaginacionTasa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTasa!=null) {
				this.jPanelParametrosReportesTasa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tasaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTasa!=null) {
					this.jTabbedPaneBusquedasTasa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTasa!=null) {
				this.jPanelParametrosReportesTasa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tasaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTasa!=null) {
				this.jTabbedPaneBusquedasTasa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTasa!=null) {
				this.jPanelParametrosReportesTasa.setVisible(true);
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
		
		//TasaSessionBean tasaSessionBean=new TasaSessionBean();
		
		if(this.tasaSessionBean==null) {
			this.tasaSessionBean=new TasaSessionBean();
		}
		
		this.tasaSessionBean.setsUltimaBusquedaTasa(this.getsAccionBusqueda());
		this.tasaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tasaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tasaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TasaSessionBean tasaSessionBean=new TasaSessionBean();
		
		if(this.tasaSessionBean==null) {
			this.tasaSessionBean=new TasaSessionBean();
		}
		
		if(this.tasaSessionBean.getsUltimaBusquedaTasa()!=null&&!this.tasaSessionBean.getsUltimaBusquedaTasa().equals("")) {
			this.setsAccionBusqueda(tasaSessionBean.getsUltimaBusquedaTasa());
			this.setiNumeroPaginacion(tasaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tasaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tasaSessionBean.getid_empresa());
				tasaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tasaSessionBean.setsUltimaBusquedaTasa("");
		this.tasaSessionBean.setiNumeroPaginacion(TasaConstantesFunciones.INUMEROPAGINACION);
		this.tasaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTasa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTasa() {
		this.updateBorderResaltarBusquedasFormularioTasa();
		this.updateVisibilidadBusquedasFormularioTasa();
		this.updateHabilitarBusquedasFormularioTasa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTasa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTasa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTasa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTasa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTasa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTasa.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTasa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTasa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTasa() throws Exception {

		if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTasa();
		this.updateVisibilidadResaltarControlesFormularioTasa();
		this.updateHabilitarResaltarControlesFormularioTasa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTasa() throws Exception {
		if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tasaConstantesFunciones.resaltaridTasa!=null && this.jInternalFrameDetalleFormTasa!=null) {this.jInternalFrameDetalleFormTasa.jLabelidTasa.setBorder(this.tasaConstantesFunciones.resaltaridTasa);}
		if(this.tasaConstantesFunciones.resaltarid_empresaTasa!=null && this.jInternalFrameDetalleFormTasa!=null) {this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.setBorder(this.tasaConstantesFunciones.resaltarid_empresaTasa);}
		if(this.tasaConstantesFunciones.resaltarvalorTasa!=null && this.jInternalFrameDetalleFormTasa!=null) {this.jInternalFrameDetalleFormTasa.jTextFieldvalorTasa.setBorder(this.tasaConstantesFunciones.resaltarvalorTasa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTasa() throws Exception {		
		if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTasa!=null) {
	
		//this.jInternalFrameDetalleFormTasa.jLabelidTasa.setVisible(this.tasaConstantesFunciones.mostraridTasa);
		this.jInternalFrameDetalleFormTasa.jPanelidTasa.setVisible(this.tasaConstantesFunciones.mostraridTasa);
		//this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.setVisible(this.tasaConstantesFunciones.mostrarid_empresaTasa);
		this.jInternalFrameDetalleFormTasa.jPanelid_empresaTasa.setVisible(this.tasaConstantesFunciones.mostrarid_empresaTasa);
		//this.jInternalFrameDetalleFormTasa.jTextFieldvalorTasa.setVisible(this.tasaConstantesFunciones.mostrarvalorTasa);
		this.jInternalFrameDetalleFormTasa.jPanelvalorTasa.setVisible(this.tasaConstantesFunciones.mostrarvalorTasa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTasa() throws Exception {
		if(this.jInternalFrameDetalleFormTasa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTasa!=null) {
	
		this.jInternalFrameDetalleFormTasa.jLabelidTasa.setEnabled(this.tasaConstantesFunciones.activaridTasa);
		this.jInternalFrameDetalleFormTasa.jComboBoxid_empresaTasa.setEnabled(this.tasaConstantesFunciones.activarid_empresaTasa);
		this.jInternalFrameDetalleFormTasa.jTextFieldvalorTasa.setEnabled(this.tasaConstantesFunciones.activarvalorTasa);
		}
	}
	
		
}