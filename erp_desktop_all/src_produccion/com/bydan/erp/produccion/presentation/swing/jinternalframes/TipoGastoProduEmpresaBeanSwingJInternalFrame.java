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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.TipoGastoProduEmpresaConstantesFunciones;
import com.bydan.erp.produccion.util.TipoGastoProduEmpresaParameterReturnGeneral;
//import com.bydan.erp.produccion.util.TipoGastoProduEmpresaParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.TipoGastoProduEmpresaBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
public class TipoGastoProduEmpresaBeanSwingJInternalFrame extends TipoGastoProduEmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGastoProduEmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGastoProduEmpresa> tipogastoproduempresaValidator = new ClassValidator<TipoGastoProduEmpresa>(TipoGastoProduEmpresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGastoProduEmpresa tipogastoproduempresa;	
	public TipoGastoProduEmpresa tipogastoproduempresaAux;
	public TipoGastoProduEmpresa tipogastoproduempresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGastoProduEmpresa tipogastoproduempresaTotales;
	public Long idTipoGastoProduEmpresaActual;
	public Long iIdNuevoTipoGastoProduEmpresa=0L;
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
	
	public Boolean isPermisoTodoTipoGastoProduEmpresa;
	public Boolean isPermisoNuevoTipoGastoProduEmpresa;
	public Boolean isPermisoActualizarTipoGastoProduEmpresa;
	public Boolean isPermisoActualizarOriginalTipoGastoProduEmpresa;
	public Boolean isPermisoEliminarTipoGastoProduEmpresa;
	public Boolean isPermisoGuardarCambiosTipoGastoProduEmpresa;
	public Boolean isPermisoConsultaTipoGastoProduEmpresa;
	public Boolean isPermisoBusquedaTipoGastoProduEmpresa;
	public Boolean isPermisoReporteTipoGastoProduEmpresa;
	public Boolean isPermisoPaginacionMedioTipoGastoProduEmpresa;
	public Boolean isPermisoPaginacionAltoTipoGastoProduEmpresa;
	public Boolean isPermisoPaginacionTodoTipoGastoProduEmpresa;
	public Boolean isPermisoCopiarTipoGastoProduEmpresa;
	public Boolean isPermisoVerFormTipoGastoProduEmpresa;
	public Boolean isPermisoDuplicarTipoGastoProduEmpresa;
	public Boolean isPermisoOrdenTipoGastoProduEmpresa;
	
	
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
	
	public TipoGastoProduEmpresaParameterReturnGeneral tipogastoproduempresaReturnGeneral;
	public TipoGastoProduEmpresaParameterReturnGeneral tipogastoproduempresaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGastoProduEmpresa=false;
	public Boolean esParaAccionDesdeFormularioTipoGastoProduEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoGastoProduEmpresaSessionBeanAdditional tipogastoproduempresaSessionBeanAdditional=null;
	
	public TipoGastoProduEmpresaSessionBeanAdditional getTipoGastoProduEmpresaSessionBeanAdditional() {
		return this.tipogastoproduempresaSessionBeanAdditional;
	}
	
	public void setTipoGastoProduEmpresaSessionBeanAdditional(TipoGastoProduEmpresaSessionBeanAdditional tipogastoproduempresaSessionBeanAdditional) {
		try {
			this.tipogastoproduempresaSessionBeanAdditional=tipogastoproduempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional tipogastoproduempresaBeanSwingJInternalFrameAdditional=null;
	//public class TipoGastoProduEmpresaBeanSwingJInternalFrame
	
	public TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional getTipoGastoProduEmpresaBeanSwingJInternalFrameAdditional() {
		return this.tipogastoproduempresaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoGastoProduEmpresaBeanSwingJInternalFrameAdditional(TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional tipogastoproduempresaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipogastoproduempresaBeanSwingJInternalFrameAdditional=tipogastoproduempresaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGastoProduEmpresaLogic tipogastoproduempresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGastoProduEmpresa tipogastoproduempresaBean;
	public TipoGastoProduEmpresaConstantesFunciones tipogastoproduempresaConstantesFunciones;
	//public TipoGastoProduEmpresaParameterReturnGeneral tipogastoproduempresaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoGastoProduEmpresa> tipogastoproduempresas;	
	//public List<TipoGastoProduEmpresa> tipogastoproduempresasEliminados;
	//public List<TipoGastoProduEmpresa> tipogastoproduempresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGastoProduEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGastoProduEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarTipoGastoProduEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormTipoGastoProduEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenTipoGastoProduEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=false;
	public Boolean isVisibilidadCeldaModificarTipoGastoProduEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarTipoGastoProduEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarTipoGastoProduEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarTipoGastoProduEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoGastoProduEmpresa() {
		return this.iIdNuevoTipoGastoProduEmpresa;
	}

	public void setiIdNuevoTipoGastoProduEmpresa(Long iIdNuevoTipoGastoProduEmpresa) {
		this.iIdNuevoTipoGastoProduEmpresa = iIdNuevoTipoGastoProduEmpresa;
	}
	
	public Long getidTipoGastoProduEmpresaActual() {
		return this.idTipoGastoProduEmpresaActual;
	}

	public void setidTipoGastoProduEmpresaActual(Long idTipoGastoProduEmpresaActual) {
		this.idTipoGastoProduEmpresaActual = idTipoGastoProduEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGastoProduEmpresa gettipogastoproduempresa() {
		return this.tipogastoproduempresa;
	}

	public void settipogastoproduempresa(TipoGastoProduEmpresa tipogastoproduempresa) {
		this.tipogastoproduempresa = tipogastoproduempresa;
	}
	
	public TipoGastoProduEmpresa gettipogastoproduempresaAux() {
		return this.tipogastoproduempresaAux;
	}

	public void settipogastoproduempresaAux(TipoGastoProduEmpresa tipogastoproduempresaAux) {
		this.tipogastoproduempresaAux = tipogastoproduempresaAux;
	}				
	
	public TipoGastoProduEmpresa gettipogastoproduempresaAnterior() {
		return this.tipogastoproduempresaAnterior;
	}

	public void settipogastoproduempresaAnterior(TipoGastoProduEmpresa tipogastoproduempresaAnterior) {
		this.tipogastoproduempresaAnterior = tipogastoproduempresaAnterior;
	}	
	
	public TipoGastoProduEmpresa gettipogastoproduempresaTotales() {
		return this.tipogastoproduempresaTotales;
	}

	public void settipogastoproduempresaTotales(TipoGastoProduEmpresa tipogastoproduempresaTotales) {
		this.tipogastoproduempresaTotales = tipogastoproduempresaTotales;
	}	
	
	public TipoGastoProduEmpresa gettipogastoproduempresaBean() {
		return this.tipogastoproduempresaBean;
	}

	public void settipogastoproduempresaBean(TipoGastoProduEmpresa tipogastoproduempresaBean) {
		this.tipogastoproduempresaBean = tipogastoproduempresaBean;
	}	
	
	public TipoGastoProduEmpresaParameterReturnGeneral gettipogastoproduempresaReturnGeneral() {
		return this.tipogastoproduempresaReturnGeneral;
	}

	public void settipogastoproduempresaReturnGeneral(TipoGastoProduEmpresaParameterReturnGeneral tipogastoproduempresaReturnGeneral) {
		this.tipogastoproduempresaReturnGeneral = tipogastoproduempresaReturnGeneral;
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
	
	
	public TipoGastoProduEmpresaLogic getTipoGastoProduEmpresaLogic()	{		
		return tipogastoproduempresaLogic;
	}

	public void setTipoGastoProduEmpresaLogic(TipoGastoProduEmpresaLogic tipogastoproduempresaLogic) {
		this.tipogastoproduempresaLogic = tipogastoproduempresaLogic;
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
	
	public Boolean getIsEsNuevoTipoGastoProduEmpresa() {
		return isEsNuevoTipoGastoProduEmpresa;
	}

	public void setIsEsNuevoTipoGastoProduEmpresa(Boolean isEsNuevoTipoGastoProduEmpresa) {
		this.isEsNuevoTipoGastoProduEmpresa = isEsNuevoTipoGastoProduEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGastoProduEmpresa() {
		return esParaAccionDesdeFormularioTipoGastoProduEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGastoProduEmpresa(Boolean esParaAccionDesdeFormularioTipoGastoProduEmpresa) {
		this.esParaAccionDesdeFormularioTipoGastoProduEmpresa = esParaAccionDesdeFormularioTipoGastoProduEmpresa;
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

			if(this.tipogastoproduempresaSessionBean==null) {
				this.tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean();
			}

			if(!this.tipogastoproduempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipogastoproduempresaSessionBean.getlidEmpresaActual());
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

					if(this.tipogastoproduempresa!=null) {
						this.tipogastoproduempresa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoGastoProduEmpresa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoGastoProduEmpresaGenerico)throws Exception
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
				jComboBoxid_empresaTipoGastoProduEmpresaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoGastoProduEmpresaGenerico!=null && jComboBoxid_empresaTipoGastoProduEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoGastoProduEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoGastoProduEmpresa tipogastoproduempresa,JComboBox jComboBoxid_empresaTipoGastoProduEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoGastoProduEmpresaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoGastoProduEmpresaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipogastoproduempresa.setid_empresa(empresaAux.getId());
				tipogastoproduempresa.setempresa_descripcion(TipoGastoProduEmpresaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipogastoproduempresa.setEmpresa(empresaAux);			}
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

					if(!TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { 
					}

					if(!TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoGastoProduEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGastoProduEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoGastoProduEmpresa(this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGastoProduEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoGastoProduEmpresa(this.tipogastoproduempresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipogastoproduempresaLogic.setTipoGastoProduEmpresas(this.tipogastoproduempresas);
			tipogastoproduempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoGastoProduEmpresaParameterReturnGeneral getTipoGastoProduEmpresaParameterGeneral() {
		return this.tipogastoproduempresaParameterGeneral;
	}
	
	public void setTipoGastoProduEmpresaParameterGeneral(TipoGastoProduEmpresaParameterReturnGeneral tipogastoproduempresaParameterGeneral) {
		this.tipogastoproduempresaParameterGeneral = tipogastoproduempresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoGastoProduEmpresa() {
		return isPermisoTodoTipoGastoProduEmpresa;
	}

	public void setIsPermisoTodoTipoGastoProduEmpresa(Boolean isPermisoTodoTipoGastoProduEmpresa) {
		this.isPermisoTodoTipoGastoProduEmpresa = isPermisoTodoTipoGastoProduEmpresa;
	}

	public Boolean getIsPermisoNuevoTipoGastoProduEmpresa() {
		return isPermisoNuevoTipoGastoProduEmpresa;
	}

	public void setIsPermisoNuevoTipoGastoProduEmpresa(Boolean isPermisoNuevoTipoGastoProduEmpresa) {
		this.isPermisoNuevoTipoGastoProduEmpresa = isPermisoNuevoTipoGastoProduEmpresa;
	}

	public Boolean getIsPermisoActualizarTipoGastoProduEmpresa() {
		return isPermisoActualizarTipoGastoProduEmpresa;
	}

	public void setIsPermisoActualizarTipoGastoProduEmpresa(Boolean isPermisoActualizarTipoGastoProduEmpresa) {
		this.isPermisoActualizarTipoGastoProduEmpresa = isPermisoActualizarTipoGastoProduEmpresa;
	}

	public Boolean getIsPermisoEliminarTipoGastoProduEmpresa() {
		return isPermisoEliminarTipoGastoProduEmpresa;
	}

	public void setIsPermisoEliminarTipoGastoProduEmpresa(Boolean isPermisoEliminarTipoGastoProduEmpresa) {
		this.isPermisoEliminarTipoGastoProduEmpresa = isPermisoEliminarTipoGastoProduEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGastoProduEmpresa() {
		return isPermisoGuardarCambiosTipoGastoProduEmpresa;
	}

	public void setIsPermisoGuardarCambiosTipoGastoProduEmpresa(Boolean isPermisoGuardarCambiosTipoGastoProduEmpresa) {
		this.isPermisoGuardarCambiosTipoGastoProduEmpresa = isPermisoGuardarCambiosTipoGastoProduEmpresa;
	}
	
	public Boolean getIsPermisoConsultaTipoGastoProduEmpresa() {
		return isPermisoConsultaTipoGastoProduEmpresa;
	}

	public void setIsPermisoConsultaTipoGastoProduEmpresa(Boolean isPermisoConsultaTipoGastoProduEmpresa) {
		this.isPermisoConsultaTipoGastoProduEmpresa = isPermisoConsultaTipoGastoProduEmpresa;
	}

	public Boolean getIsPermisoBusquedaTipoGastoProduEmpresa() {
		return isPermisoBusquedaTipoGastoProduEmpresa;
	}

	public void setIsPermisoBusquedaTipoGastoProduEmpresa(Boolean isPermisoBusquedaTipoGastoProduEmpresa) {
		this.isPermisoBusquedaTipoGastoProduEmpresa = isPermisoBusquedaTipoGastoProduEmpresa;
	}

	public Boolean getIsPermisoReporteTipoGastoProduEmpresa() {
		return isPermisoReporteTipoGastoProduEmpresa;
	}

	public void setIsPermisoReporteTipoGastoProduEmpresa(Boolean isPermisoReporteTipoGastoProduEmpresa) {
		this.isPermisoReporteTipoGastoProduEmpresa = isPermisoReporteTipoGastoProduEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGastoProduEmpresa() {
		return isPermisoPaginacionMedioTipoGastoProduEmpresa;
	}

	public void setIsPermisoPaginacionMedioTipoGastoProduEmpresa(Boolean isPermisoPaginacionMedioTipoGastoProduEmpresa) {
		this.isPermisoPaginacionMedioTipoGastoProduEmpresa = isPermisoPaginacionMedioTipoGastoProduEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGastoProduEmpresa() {
		return isPermisoPaginacionTodoTipoGastoProduEmpresa;
	}

	public void setIsPermisoPaginacionTodoTipoGastoProduEmpresa(Boolean isPermisoPaginacionTodoTipoGastoProduEmpresa) {
		this.isPermisoPaginacionTodoTipoGastoProduEmpresa = isPermisoPaginacionTodoTipoGastoProduEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGastoProduEmpresa() {
		return isPermisoPaginacionAltoTipoGastoProduEmpresa;
	}

	public void setIsPermisoPaginacionAltoTipoGastoProduEmpresa(Boolean isPermisoPaginacionAltoTipoGastoProduEmpresa) {
		this.isPermisoPaginacionAltoTipoGastoProduEmpresa = isPermisoPaginacionAltoTipoGastoProduEmpresa;
	}
	
	public Boolean getIsPermisoCopiarTipoGastoProduEmpresa() {
		return isPermisoCopiarTipoGastoProduEmpresa;
	}

	public void setIsPermisoCopiarTipoGastoProduEmpresa(Boolean isPermisoCopiarTipoGastoProduEmpresa) {
		this.isPermisoCopiarTipoGastoProduEmpresa = isPermisoCopiarTipoGastoProduEmpresa;
	}
	
	public Boolean getIsPermisoVerFormTipoGastoProduEmpresa() {
		return isPermisoVerFormTipoGastoProduEmpresa;
	}

	public void setIsPermisoVerFormTipoGastoProduEmpresa(Boolean isPermisoVerFormTipoGastoProduEmpresa) {
		this.isPermisoVerFormTipoGastoProduEmpresa = isPermisoVerFormTipoGastoProduEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarTipoGastoProduEmpresa() {
		return isPermisoDuplicarTipoGastoProduEmpresa;
	}

	public void setIsPermisoDuplicarTipoGastoProduEmpresa(Boolean isPermisoDuplicarTipoGastoProduEmpresa) {
		this.isPermisoDuplicarTipoGastoProduEmpresa = isPermisoDuplicarTipoGastoProduEmpresa;
	}
	
	public Boolean getIsPermisoOrdenTipoGastoProduEmpresa() {
		return isPermisoOrdenTipoGastoProduEmpresa;
	}

	public void setIsPermisoOrdenTipoGastoProduEmpresa(Boolean isPermisoOrdenTipoGastoProduEmpresa) {
		this.isPermisoOrdenTipoGastoProduEmpresa = isPermisoOrdenTipoGastoProduEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGastoProduEmpresa() {
		return isVisibilidadCeldaNuevoTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoTipoGastoProduEmpresa(Boolean isVisibilidadCeldaNuevoTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa = isVisibilidadCeldaNuevoTipoGastoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGastoProduEmpresa() {
		return isVisibilidadCeldaDuplicarTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGastoProduEmpresa(Boolean isVisibilidadCeldaDuplicarTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaDuplicarTipoGastoProduEmpresa = isVisibilidadCeldaDuplicarTipoGastoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGastoProduEmpresa() {
		return isVisibilidadCeldaCopiarTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarTipoGastoProduEmpresa(Boolean isVisibilidadCeldaCopiarTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaCopiarTipoGastoProduEmpresa = isVisibilidadCeldaCopiarTipoGastoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGastoProduEmpresa() {
		return isVisibilidadCeldaVerFormTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormTipoGastoProduEmpresa(Boolean isVisibilidadCeldaVerFormTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaVerFormTipoGastoProduEmpresa = isVisibilidadCeldaVerFormTipoGastoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGastoProduEmpresa() {
		return isVisibilidadCeldaOrdenTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenTipoGastoProduEmpresa(Boolean isVisibilidadCeldaOrdenTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaOrdenTipoGastoProduEmpresa = isVisibilidadCeldaOrdenTipoGastoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa = isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGastoProduEmpresa() {
		return isVisibilidadCeldaModificarTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaModificarTipoGastoProduEmpresa(Boolean isVisibilidadCeldaModificarTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaModificarTipoGastoProduEmpresa = isVisibilidadCeldaModificarTipoGastoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGastoProduEmpresa() {
		return isVisibilidadCeldaActualizarTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarTipoGastoProduEmpresa(Boolean isVisibilidadCeldaActualizarTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa = isVisibilidadCeldaActualizarTipoGastoProduEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGastoProduEmpresa() {
		return isVisibilidadCeldaEliminarTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarTipoGastoProduEmpresa(Boolean isVisibilidadCeldaEliminarTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa = isVisibilidadCeldaEliminarTipoGastoProduEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGastoProduEmpresa() {
		return isVisibilidadCeldaCancelarTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarTipoGastoProduEmpresa(Boolean isVisibilidadCeldaCancelarTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa = isVisibilidadCeldaCancelarTipoGastoProduEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGastoProduEmpresa() {
		return isVisibilidadCeldaGuardarTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarTipoGastoProduEmpresa(Boolean isVisibilidadCeldaGuardarTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa = isVisibilidadCeldaGuardarTipoGastoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa() {
		return isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa(Boolean isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa = isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa;
	}
		
	public TipoGastoProduEmpresaSessionBean gettipogastoproduempresaSessionBean() {
		return this.tipogastoproduempresaSessionBean;
	}
	
	public void settipogastoproduempresaSessionBean(TipoGastoProduEmpresaSessionBean tipogastoproduempresaSessionBean) {
		this.tipogastoproduempresaSessionBean=tipogastoproduempresaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipogastoproduempresa,null);
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
	
	public void bugActualizarReferenciaActual(TipoGastoProduEmpresa tipogastoproduempresa,TipoGastoProduEmpresa tipogastoproduempresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGastoProduEmpresa(tipogastoproduempresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipogastoproduempresaAux.setId(tipogastoproduempresa.getId());
		tipogastoproduempresaAux.setVersionRow(tipogastoproduempresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGastoProduEmpresa();
		
			int intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipogastoproduempresaValidator.getInvalidValues(this.tipogastoproduempresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipogastoproduempresaLogic.setDatosCliente(datosCliente);
			tipogastoproduempresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipogastoproduempresaAux=new  TipoGastoProduEmpresa();
				
				tipogastoproduempresaAux.setIsNew(true);
				tipogastoproduempresaAux.setIsChanged(true);
				
				tipogastoproduempresaAux.setTipoGastoProduEmpresaOriginal(this.tipogastoproduempresa);
				
				tipogastoproduempresaAux.setId(this.tipogastoproduempresa.getId());	
				tipogastoproduempresaAux.setVersionRow(this.tipogastoproduempresa.getVersionRow());	
				tipogastoproduempresaAux.setid_empresa(this.tipogastoproduempresa.getid_empresa());	
				tipogastoproduempresaAux.setnombre(this.tipogastoproduempresa.getnombre());	
				tipogastoproduempresaAux.setdescripcion(this.tipogastoproduempresa.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipogastoproduempresaAux,tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoproduempresaAux,tipogastoproduempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduempresaLogic.saveTipoGastoProduEmpresas();//WithConnection
						//tipogastoproduempresaLogic.getSetVersionRowTipoGastoProduEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogastoproduempresa,tipogastoproduempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoGastoProduEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogastoproduempresaLogic.saveTipoGastoProduEmpresaRelaciones(tipogastoproduempresaAux);//WithConnection
								//tipogastoproduempresaLogic.getSetVersionRowTipoGastoProduEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipogastoproduempresa,tipogastoproduempresaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipogastoproduempresaAux,tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipogastoproduempresaAux,tipogastoproduempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipogastoproduempresa,tipogastoproduempresaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipogastoproduempresaAux=new  TipoGastoProduEmpresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado() && this.tipogastoproduempresa.getId()>=0)) {
						
					tipogastoproduempresaAux.setIsNew(false);
				}
				
				tipogastoproduempresaAux.setIsDeleted(false);
			
				tipogastoproduempresaAux.setId(this.tipogastoproduempresa.getId());	
				tipogastoproduempresaAux.setVersionRow(this.tipogastoproduempresa.getVersionRow());	
				tipogastoproduempresaAux.setid_empresa(this.tipogastoproduempresa.getid_empresa());	
				tipogastoproduempresaAux.setnombre(this.tipogastoproduempresa.getnombre());	
				tipogastoproduempresaAux.setdescripcion(this.tipogastoproduempresa.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogastoproduempresaAux,tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoproduempresaAux,tipogastoproduempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduempresaLogic.saveTipoGastoProduEmpresas();//WithConnection
						//tipogastoproduempresaLogic.getSetVersionRowTipoGastoProduEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogastoproduempresa,tipogastoproduempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoGastoProduEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogastoproduempresaLogic.saveTipoGastoProduEmpresaRelaciones(tipogastoproduempresaAux);//WithConnection
								//tipogastoproduempresaLogic.getSetVersionRowTipoGastoProduEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipogastoproduempresa,tipogastoproduempresaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipogastoproduempresaAux,tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipogastoproduempresaAux,tipogastoproduempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipogastoproduempresa,tipogastoproduempresaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipogastoproduempresaAux=new  TipoGastoProduEmpresa();
				
				tipogastoproduempresaAux.setIsNew(false);
				tipogastoproduempresaAux.setIsChanged(false);
				
				tipogastoproduempresaAux.setIsDeleted(true);
				
				tipogastoproduempresaAux.setId(this.tipogastoproduempresa.getId());	
				tipogastoproduempresaAux.setVersionRow(this.tipogastoproduempresa.getVersionRow());	
				tipogastoproduempresaAux.setid_empresa(this.tipogastoproduempresa.getid_empresa());	
				tipogastoproduempresaAux.setnombre(this.tipogastoproduempresa.getnombre());	
				tipogastoproduempresaAux.setdescripcion(this.tipogastoproduempresa.getdescripcion());	
				
				if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipogastoproduempresaAux.getId()>=0) {	
						this.tipogastoproduempresasEliminados.add(tipogastoproduempresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipogastoproduempresaAux,tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoproduempresaAux,tipogastoproduempresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduempresaLogic.saveTipoGastoProduEmpresas();//WithConnection
						//tipogastoproduempresaLogic.getSetVersionRowTipoGastoProduEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogastoproduempresaLogic.saveTipoGastoProduEmpresaRelaciones(tipogastoproduempresaAux);//WithConnection
								//tipogastoproduempresaLogic.getSetVersionRowTipoGastoProduEmpresas();//WithConnection
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
							if(this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipogastoproduempresaAux,tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipogastoproduempresaAux,tipogastoproduempresas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().addAll(this.tipogastoproduempresasEliminados);
					
					tipogastoproduempresaLogic.saveTipoGastoProduEmpresas();//WithConnection
					//tipogastoproduempresaLogic.getSetVersionRowTipoGastoProduEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoGastoProduEmpresa();
				
				this.tipogastoproduempresasEliminados= new ArrayList<TipoGastoProduEmpresa>();		
			}
			
			if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Gasto Produccion Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Gasto Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipogastoproduempresa=tipogastoproduempresaAux;
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
      		//this.finishProcessTipoGastoProduEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGastoProduEmpresa tipogastoproduempresaLocal) throws Exception {
		
		if(this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGastoProduEmpresa tipogastoproduempresaLocal) throws Exception {	
		if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipogastoproduempresaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoGastoProduEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipogastoproduempresaValidator.getInvalidValues(this.tipogastoproduempresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGastoProduEmpresa tipogastoproduempresa,List<TipoGastoProduEmpresa> tipogastoproduempresas) throws Exception {
		try	{		
			TipoGastoProduEmpresaConstantesFunciones.actualizarLista(tipogastoproduempresa,tipogastoproduempresas,this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGastoProduEmpresa tipogastoproduempresa,List<TipoGastoProduEmpresa> tipogastoproduempresas) throws Exception {
		try	{			
			TipoGastoProduEmpresaConstantesFunciones.actualizarSelectedLista(tipogastoproduempresa,tipogastoproduempresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGastoProduEmpresa> tipogastoproduempresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipogastoproduempresasLocal=this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipogastoproduempresasLocal=this.tipogastoproduempresas;
			}
			//ARCHITECTURE
		
			for(TipoGastoProduEmpresa tipogastoproduempresaLocal:tipogastoproduempresasLocal) {
				if(this.permiteMantenimiento(tipogastoproduempresaLocal) && tipogastoproduempresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoGastoProduEmpresaConstantesFunciones.getTipoGastoProduEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGastoProduEmpresaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelid_empresaTipoGastoProduEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGastoProduEmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelnombreTipoGastoProduEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGastoProduEmpresaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabeldescripcionTipoGastoProduEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelid_empresaTipoGastoProduEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelnombreTipoGastoProduEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabeldescripcionTipoGastoProduEmpresa,"");
		
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
		this.iIdNuevoTipoGastoProduEmpresa--;	
		
		
		this.tipogastoproduempresaAux=new TipoGastoProduEmpresa();
		
		this.tipogastoproduempresaAux.setId(this.iIdNuevoTipoGastoProduEmpresa);
		this.tipogastoproduempresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().add(this.tipogastoproduempresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipogastoproduempresas.add(this.tipogastoproduempresaAux);
		}
		//ARCHITECTURE
		
		this.tipogastoproduempresa=this.tipogastoproduempresaAux;
		
		if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGastoProduEmpresa(this.tipogastoproduempresa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGastoProduEmpresa(this.tipogastoproduempresa);
		}
				
		//this.setDefaultControlesTipoGastoProduEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGastoProduEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGastoProduEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGastoProduEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresaBean,this.tipogastoproduempresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
			classes=TipoGastoProduEmpresaConstantesFunciones.getClassesRelationshipsOfTipoGastoProduEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipogastoproduempresaReturnGeneral=tipogastoproduempresaLogic.procesarEventosTipoGastoProduEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas(),this.tipogastoproduempresa,this.tipogastoproduempresaParameterGeneral,this.isEsNuevoTipoGastoProduEmpresa,classes);//this.tipogastoproduempresaLogic.getTipoGastoProduEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGastoProduEmpresa(this.tipogastoproduempresaReturnGeneral,this.tipogastoproduempresaBean,false);
		
		if(this.tipogastoproduempresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGastoProduEmpresa(this.tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGastoProduEmpresa(this.tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresa());
		}
		
		if(this.tipogastoproduempresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGastoProduEmpresa(this.tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresa(),classes);//this.tipogastoproduempresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGastoProduEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGastoProduEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.RecargarFormTipoGastoProduEmpresa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
						
			if(tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGastoProduEmpresa();
			}
			
			this.actualizarVisualTableDatosTipoGastoProduEmpresa();
			
			this.jTableDatosTipoGastoProduEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoGastoProduEmpresa(), this.getIndiceNuevoTipoGastoProduEmpresa());
			
			this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGastoProduEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreanombreTipoGastoProduEmpresa.setEnabled(isHabilitar && this.tipogastoproduempresaConstantesFunciones.activarnombreTipoGastoProduEmpresa);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreadescripcionTipoGastoProduEmpresa.setEnabled(isHabilitar && this.tipogastoproduempresaConstantesFunciones.activardescripcionTipoGastoProduEmpresa);	
		//
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.setEnabled(isHabilitar && this.tipogastoproduempresaConstantesFunciones.activarid_empresaTipoGastoProduEmpresa);
	};
	
	public void setDefaultControlesTipoGastoProduEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGastoProduEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipogastoproduempresaSessionBean.setConGuardarRelaciones(true);			
			this.tipogastoproduempresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTabbedPaneRelacionesTipoGastoProduEmpresa.setVisible(true);
			
					
		} else {
			//this.tipogastoproduempresaSessionBean.setConGuardarRelaciones(false);			
			this.tipogastoproduempresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTabbedPaneRelacionesTipoGastoProduEmpresa.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoGastoProduEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
				if(tipogastoproduempresaAux.getId().equals(this.iIdNuevoTipoGastoProduEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresas) {
				if(tipogastoproduempresaAux.getId().equals(this.iIdNuevoTipoGastoProduEmpresa)) {
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
	
	public int getIndiceActualTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
				if(tipogastoproduempresaAux.getId().equals(tipogastoproduempresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresas) {
				if(tipogastoproduempresaAux.getId().equals(tipogastoproduempresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
				if(tipogastoproduempresaAux.getTipoGastoProduEmpresaOriginal().getId().equals(tipogastoproduempresaOriginal.getId())) {
					existe=true;
					tipogastoproduempresaOriginal.setId(tipogastoproduempresaAux.getId());
					tipogastoproduempresaOriginal.setVersionRow(tipogastoproduempresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresas) {
				if(tipogastoproduempresaAux.getTipoGastoProduEmpresaOriginal().getId().equals(tipogastoproduempresaOriginal.getId())) {
					existe=true;
					tipogastoproduempresaOriginal.setId(tipogastoproduempresaAux.getId());
					tipogastoproduempresaOriginal.setVersionRow(tipogastoproduempresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGastoProduEmpresa(Boolean esParaCancelar) throws Exception {
		tipogastoproduempresasAux=new ArrayList<TipoGastoProduEmpresa>();
		tipogastoproduempresaAux=new TipoGastoProduEmpresa();
		
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
					if(tipogastoproduempresaAux.getId()<0) {
						tipogastoproduempresasAux.add(tipogastoproduempresaAux);
					}		
				}
				this.iIdNuevoTipoGastoProduEmpresa=0L;
				this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().removeAll(tipogastoproduempresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresas) {
					if(tipogastoproduempresaAux.getId()<0) {
						tipogastoproduempresasAux.add(tipogastoproduempresaAux);
					}		
				}
				this.iIdNuevoTipoGastoProduEmpresa=0L;
				this.tipogastoproduempresas.removeAll(tipogastoproduempresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGastoProduEmpresa 
					&& this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().size()>0
					) {
					tipogastoproduempresaAux=this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().get(this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().size() - 1);
				
					if(tipogastoproduempresaAux.getId()<0) {
						this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().remove(tipogastoproduempresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGastoProduEmpresa && this.tipogastoproduempresas.size()>0) {
					tipogastoproduempresaAux=this.tipogastoproduempresas.get(this.tipogastoproduempresas.size() - 1);
				
					if(tipogastoproduempresaAux.getId()<0) {
						this.tipogastoproduempresas.remove(tipogastoproduempresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGastoProduEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipogastoproduempresa.getId()<0) {
				this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().remove(this.tipogastoproduempresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipogastoproduempresa.getId()<0) {
				this.tipogastoproduempresas.remove(this.tipogastoproduempresa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGastoProduEmpresa(List<TipoGastoProduEmpresa> tipogastoproduempresasAux) throws Exception {
		TipoGastoProduEmpresaConstantesFunciones.setEstadosInicialesTipoGastoProduEmpresa(tipogastoproduempresasAux);
	}
	
	public void setEstadosInicialesTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresaAux) throws Exception {
		TipoGastoProduEmpresaConstantesFunciones.setEstadosInicialesTipoGastoProduEmpresa(tipogastoproduempresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGastoProduEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGastoProduEmpresaActual()) {
				if(!this.isEsNuevoTipoGastoProduEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGastoProduEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGastoProduEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Gasto Produccion Empresa ?", "MANTENIMIENTO DE Tipo Gasto Produccion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGastoProduEmpresa tipogastoproduempresa) throws Exception {
		TipoGastoProduEmpresaConstantesFunciones.seleccionarAsignar(this.tipogastoproduempresa,tipogastoproduempresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGastoProduEmpresa=this.isPermisoActualizarOriginalTipoGastoProduEmpresa;
			
			
			this.seleccionarAsignar(tipogastoproduempresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGastoProduEmpresaConstantesFunciones.quitarEspaciosTipoGastoProduEmpresa(this.tipogastoproduempresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipogastoproduempresaSessionBean.setsFuncionBusquedaRapida(this.tipogastoproduempresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGastoProduEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGastoProduEmpresa(esParaCancelar);				
				this.cancelarNuevoTipoGastoProduEmpresa(esParaCancelar);								
			}
			
			this.tipogastoproduempresa=new TipoGastoProduEmpresa();
			
			this.inicializarTipoGastoProduEmpresa();
			
			this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGastoProduEmpresa() throws Exception {
		try {
			TipoGastoProduEmpresaConstantesFunciones.inicializarTipoGastoProduEmpresa(this.tipogastoproduempresa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGastoProduEmpresas(String sAccionBusqueda,List<TipoGastoProduEmpresa> tipogastoproduempresasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoGastoProduEmpresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGastoProduEmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGastoProduEmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGastoProduEmpresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Gasto Produccion Empresas");		
		parameters.put("busquedapor", TipoGastoProduEmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGastoProduEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGastoProduEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGastoProduEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGastoProduEmpresa=new JRBeanArrayDataSource(TipoGastoProduEmpresaJInternalFrame.TraerTipoGastoProduEmpresaBeans(tipogastoproduempresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGastoProduEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGastoProduEmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGastoProduEmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGastoProduEmpresaBean.TraerTipoGastoProduEmpresaBeans(tipogastoproduempresasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoGastoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogastoproduempresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGastoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogastoproduempresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresaActionPerformed(null);
					//this.generarExcelReporteTipoGastoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogastoproduempresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGastoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogastoproduempresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGastoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogastoproduempresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGastoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogastoproduempresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGastoProduEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGastoProduEmpresa> tipogastoproduempresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoproduempresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGastoProduEmpresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGastoProduEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGastoProduEmpresa tipogastoproduempresa : tipogastoproduempresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGastoProduEmpresaConstantesFunciones.generarExcelReporteDataTipoGastoProduEmpresa("NORMAL",row,workbook,tipogastoproduempresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGastoProduEmpresa(String sTipo,Row row,Workbook workbook) {
		
		TipoGastoProduEmpresaConstantesFunciones.generarExcelReporteHeaderTipoGastoProduEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGastoProduEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGastoProduEmpresa> tipogastoproduempresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoproduempresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGastoProduEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGastoProduEmpresa tipogastoproduempresa : tipogastoproduempresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.getTipoGastoProduEmpresaDescripcion(tipogastoproduempresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogastoproduempresa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogastoproduempresa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogastoproduempresa.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGastoProduEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGastoProduEmpresa> tipogastoproduempresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGastoProduEmpresa> tipogastoproduempresasRespaldo=null;
		
		classes=TipoGastoProduEmpresaConstantesFunciones.getClassesRelationshipsOfTipoGastoProduEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipogastoproduempresaLogic.setDatosCliente(this.datosCliente);
		this.tipogastoproduempresaLogic.setDatosDeep(this.datosDeep);
		this.tipogastoproduempresaLogic.setIsConDeep(true);
		
		tipogastoproduempresasRespaldo=this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas();
		
		this.tipogastoproduempresaLogic.setTipoGastoProduEmpresas(tipogastoproduempresasParaReportes);	
		this.tipogastoproduempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipogastoproduempresasParaReportes=this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas();
		this.tipogastoproduempresaLogic.setTipoGastoProduEmpresas(tipogastoproduempresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoproduempresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGastoProduEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGastoProduEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGastoProduEmpresa tipogastoproduempresa : tipogastoproduempresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGastoProduEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGastoProduEmpresaConstantesFunciones.generarExcelReporteDataTipoGastoProduEmpresa("NORMAL",row,workbook,tipogastoproduempresa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.getTipoGastoProduEmpresaDescripcion(tipogastoproduempresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGastoProduEmpresa() throws Exception {		
		this.startProcessTipoGastoProduEmpresa(true);
	}
	
	public void startProcessTipoGastoProduEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoGastoProduEmpresa ,this.jPanelParametrosReportesTipoGastoProduEmpresa, this.jScrollPanelDatosTipoGastoProduEmpresa,this.jPanelPaginacionTipoGastoProduEmpresa, this.jScrollPanelDatosEdicionTipoGastoProduEmpresa, this.jPanelAccionesTipoGastoProduEmpresa,this.jPanelAccionesFormularioTipoGastoProduEmpresa,this.jmenuBarTipoGastoProduEmpresa,this.jmenuBarDetalleTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,this.jTtoolBarDetalleTipoGastoProduEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGastoProduEmpresa=this.jTabbedPaneBusquedasTipoGastoProduEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoGastoProduEmpresa=this.jPanelParametrosReportesTipoGastoProduEmpresa;
		//final JScrollPane jScrollPanelDatosTipoGastoProduEmpresa=this.jScrollPanelDatosTipoGastoProduEmpresa;
		final JTable jTableDatosTipoGastoProduEmpresa=this.jTableDatosTipoGastoProduEmpresa;		
		final JPanel jPanelPaginacionTipoGastoProduEmpresa=this.jPanelPaginacionTipoGastoProduEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoGastoProduEmpresa=this.jScrollPanelDatosEdicionTipoGastoProduEmpresa;
		final JPanel jPanelAccionesTipoGastoProduEmpresa=this.jPanelAccionesTipoGastoProduEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoGastoProduEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGastoProduEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			jPanelCamposAuxiliarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jPanelCamposTipoGastoProduEmpresa;
			jPanelAccionesFormularioAuxiliarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jPanelAccionesFormularioTipoGastoProduEmpresa;
		}
		
		final JPanel jPanelCamposTipoGastoProduEmpresa=jPanelCamposAuxiliarTipoGastoProduEmpresa;
		final JPanel jPanelAccionesFormularioTipoGastoProduEmpresa=jPanelAccionesFormularioAuxiliarTipoGastoProduEmpresa;
		
		
		final JMenuBar jmenuBarTipoGastoProduEmpresa=this.jmenuBarTipoGastoProduEmpresa;
		final JToolBar jTtoolBarTipoGastoProduEmpresa=this.jTtoolBarTipoGastoProduEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGastoProduEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGastoProduEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jmenuBarDetalleTipoGastoProduEmpresa;
			jTtoolBarDetalleAuxiliarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTtoolBarDetalleTipoGastoProduEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleTipoGastoProduEmpresa=jmenuBarDetalleAuxiliarTipoGastoProduEmpresa;
		final JToolBar jTtoolBarDetalleTipoGastoProduEmpresa=jTtoolBarDetalleAuxiliarTipoGastoProduEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGastoProduEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGastoProduEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoGastoProduEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoGastoProduEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGastoProduEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGastoProduEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGastoProduEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGastoProduEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGastoProduEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoGastoProduEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGastoProduEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGastoProduEmpresa ,jPanelParametrosReportesTipoGastoProduEmpresa,jTableDatosTipoGastoProduEmpresa, /*jScrollPanelDatosTipoGastoProduEmpresa,*/jPanelCamposTipoGastoProduEmpresa,jPanelPaginacionTipoGastoProduEmpresa, /*jScrollPanelDatosEdicionTipoGastoProduEmpresa,*/ jPanelAccionesTipoGastoProduEmpresa,jPanelAccionesFormularioTipoGastoProduEmpresa,jmenuBarTipoGastoProduEmpresa,jmenuBarDetalleTipoGastoProduEmpresa,jTtoolBarTipoGastoProduEmpresa,jTtoolBarDetalleTipoGastoProduEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGastoProduEmpresa ,jPanelParametrosReportesTipoGastoProduEmpresa, jScrollPanelDatosTipoGastoProduEmpresa,jPanelPaginacionTipoGastoProduEmpresa, jScrollPanelDatosEdicionTipoGastoProduEmpresa, jPanelAccionesTipoGastoProduEmpresa,jPanelAccionesFormularioTipoGastoProduEmpresa,jmenuBarTipoGastoProduEmpresa,jmenuBarDetalleTipoGastoProduEmpresa,jTtoolBarTipoGastoProduEmpresa,jTtoolBarDetalleTipoGastoProduEmpresa);
						
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
	
	public void finishProcessTipoGastoProduEmpresa() {// throws Exception 
		this.finishProcessTipoGastoProduEmpresa(true);
	}
	
	public void finishProcessTipoGastoProduEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoGastoProduEmpresa ,this.jPanelParametrosReportesTipoGastoProduEmpresa, this.jScrollPanelDatosTipoGastoProduEmpresa,this.jPanelPaginacionTipoGastoProduEmpresa, this.jScrollPanelDatosEdicionTipoGastoProduEmpresa, this.jPanelAccionesTipoGastoProduEmpresa,this.jPanelAccionesFormularioTipoGastoProduEmpresa,this.jmenuBarTipoGastoProduEmpresa,this.jmenuBarDetalleTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,this.jTtoolBarDetalleTipoGastoProduEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGastoProduEmpresa=this.jTabbedPaneBusquedasTipoGastoProduEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoGastoProduEmpresa=this.jPanelParametrosReportesTipoGastoProduEmpresa;
		//final JScrollPane jScrollPanelDatosTipoGastoProduEmpresa=this.jScrollPanelDatosTipoGastoProduEmpresa;
		final JTable jTableDatosTipoGastoProduEmpresa=this.jTableDatosTipoGastoProduEmpresa;		
		final JPanel jPanelPaginacionTipoGastoProduEmpresa=this.jPanelPaginacionTipoGastoProduEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoGastoProduEmpresa=this.jScrollPanelDatosEdicionTipoGastoProduEmpresa;
		final JPanel jPanelAccionesTipoGastoProduEmpresa=this.jPanelAccionesTipoGastoProduEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoGastoProduEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGastoProduEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			jPanelCamposAuxiliarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jPanelCamposTipoGastoProduEmpresa;
			jPanelAccionesFormularioAuxiliarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jPanelAccionesFormularioTipoGastoProduEmpresa;
		}
		
		final JPanel jPanelCamposTipoGastoProduEmpresa=jPanelCamposAuxiliarTipoGastoProduEmpresa;
		final JPanel jPanelAccionesFormularioTipoGastoProduEmpresa=jPanelAccionesFormularioAuxiliarTipoGastoProduEmpresa;
		
		
		final JMenuBar jmenuBarTipoGastoProduEmpresa=this.jmenuBarTipoGastoProduEmpresa;		
		final JToolBar jTtoolBarTipoGastoProduEmpresa=this.jTtoolBarTipoGastoProduEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGastoProduEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGastoProduEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jmenuBarDetalleTipoGastoProduEmpresa;
			jTtoolBarDetalleAuxiliarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTtoolBarDetalleTipoGastoProduEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGastoProduEmpresa=jmenuBarDetalleAuxiliarTipoGastoProduEmpresa;
		final JToolBar jTtoolBarDetalleTipoGastoProduEmpresa=jTtoolBarDetalleAuxiliarTipoGastoProduEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGastoProduEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGastoProduEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoGastoProduEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoGastoProduEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGastoProduEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGastoProduEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGastoProduEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGastoProduEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGastoProduEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoGastoProduEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGastoProduEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGastoProduEmpresa ,jPanelParametrosReportesTipoGastoProduEmpresa, jTableDatosTipoGastoProduEmpresa,/*jScrollPanelDatosTipoGastoProduEmpresa,*/jPanelCamposTipoGastoProduEmpresa,jPanelPaginacionTipoGastoProduEmpresa, /*jScrollPanelDatosEdicionTipoGastoProduEmpresa,*/ jPanelAccionesTipoGastoProduEmpresa,jPanelAccionesFormularioTipoGastoProduEmpresa,jmenuBarTipoGastoProduEmpresa,jmenuBarDetalleTipoGastoProduEmpresa,jTtoolBarTipoGastoProduEmpresa,jTtoolBarDetalleTipoGastoProduEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGastoProduEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGastoProduEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGastoProduEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGastoProduEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGastoProduEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGastoProduEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGastoProduEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGastoProduEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGastoProduEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipogastoproduempresaConstantesFunciones.getsFinalQueryTipoGastoProduEmpresa();
		String  finalQueryPaginacionTodos=this.tipogastoproduempresaConstantesFunciones.getsFinalQueryTipoGastoProduEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGastoProduEmpresaConstantesFunciones.getArrayColumnasGlobalesNoTipoGastoProduEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGastoProduEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoGastoProduEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGastoProduEmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipogastoproduempresasEliminados= new ArrayList<TipoGastoProduEmpresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGastoProduEmpresa();
		
				///*TipoGastoProduEmpresaSessionBean*/this.tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean();
			
			if(this.tipogastoproduempresaSessionBean==null) {
				this.tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean();
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
					this.iNumeroPaginacion=TipoGastoProduEmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGastoProduEmpresaConstantesFunciones.getClassesForeignKeysOfTipoGastoProduEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipogastoproduempresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipogastoproduempresasAux= new ArrayList<TipoGastoProduEmpresa>();
			
				
			tipogastoproduempresaLogic.setDatosCliente(this.datosCliente);
			tipogastoproduempresaLogic.setDatosDeep(this.datosDeep);
			tipogastoproduempresaLogic.setIsConDeep(true);
			
			
			tipogastoproduempresaLogic.getTipoGastoProduEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipogastoproduempresaLogic.getTodosTipoGastoProduEmpresas(finalQueryGlobal,pagination);
					
					//tipogastoproduempresaLogic.getTodosTipoGastoProduEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipogastoproduempresaLogic.getTipoGastoProduEmpresas()==null|| tipogastoproduempresaLogic.getTipoGastoProduEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogastoproduempresasAux= new ArrayList<TipoGastoProduEmpresa>();
							tipogastoproduempresasAux.addAll(tipogastoproduempresaLogic.getTipoGastoProduEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoproduempresasAux= new ArrayList<TipoGastoProduEmpresa>();
							tipogastoproduempresasAux.addAll(tipogastoproduempresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogastoproduempresaLogic.getTodosTipoGastoProduEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//tipogastoproduempresaLogic.getTodosTipoGastoProduEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGastoProduEmpresas("Todos",tipogastoproduempresaLogic.getTipoGastoProduEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogastoproduempresaLogic.setTipoGastoProduEmpresas(new ArrayList<TipoGastoProduEmpresa>());					
							tipogastoproduempresaLogic.getTipoGastoProduEmpresas().addAll(tipogastoproduempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoproduempresas=new ArrayList<TipoGastoProduEmpresa>();
							tipogastoproduempresas.addAll(tipogastoproduempresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGastoProduEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGastoProduEmpresa=this.idActual;
				
				} else if(this.idTipoGastoProduEmpresaActual!=null && this.idTipoGastoProduEmpresaActual!=0L) {
					idTipoGastoProduEmpresa=idTipoGastoProduEmpresaActual;
				}
				
					
				this.sDetalleReporte=TipoGastoProduEmpresaConstantesFunciones.getDetalleIndicePorId(idTipoGastoProduEmpresa);
				
				this.tipogastoproduempresas=new ArrayList<TipoGastoProduEmpresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipogastoproduempresaLogic.getEntity(idTipoGastoProduEmpresa);
					
					//tipogastoproduempresaLogic.getEntityWithConnection(idTipoGastoProduEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoproduempresaLogic.setTipoGastoProduEmpresas(new ArrayList<TipoGastoProduEmpresa>());
					tipogastoproduempresaLogic.getTipoGastoProduEmpresas().add(tipogastoproduempresaLogic.getTipoGastoProduEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogastoproduempresas=new ArrayList<TipoGastoProduEmpresa>();
					this.tipogastoproduempresas.add(tipogastoproduempresa);
				}
				
				if(tipogastoproduempresaLogic.getTipoGastoProduEmpresa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoGastoProduEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogastoproduempresaLogic.getTipoGastoProduEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGastoProduEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGastoProduEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogastoproduempresaLogic.getTipoGastoProduEmpresas()==null||tipogastoproduempresaLogic.getTipoGastoProduEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogastoproduempresas==null|| tipogastoproduempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduempresasAux=new ArrayList<TipoGastoProduEmpresa>();
						tipogastoproduempresasAux.addAll(tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoproduempresasAux=new ArrayList<TipoGastoProduEmpresa>();
							tipogastoproduempresasAux.addAll(tipogastoproduempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogastoproduempresaLogic.getTipoGastoProduEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGastoProduEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGastoProduEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGastoProduEmpresas("FK_IdEmpresa",tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGastoProduEmpresas("FK_IdEmpresa",tipogastoproduempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduempresaLogic.setTipoGastoProduEmpresas(new ArrayList<TipoGastoProduEmpresa>());
						tipogastoproduempresaLogic.getTipoGastoProduEmpresas().addAll(tipogastoproduempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoproduempresas=new ArrayList<TipoGastoProduEmpresa>();
							tipogastoproduempresas.addAll(tipogastoproduempresasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGastoProduEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGastoProduEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogastoproduempresaLogic.getTipoGastoProduEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogastoproduempresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogastoproduempresaLogic.getTipoGastoProduEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogastoproduempresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGastoProduEmpresa tipogastoproduempresa) {
		Boolean permite=true;
		
		if(this.tipogastoproduempresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGastoProduEmpresaConstantesFunciones.getOrderByListaTipoGastoProduEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGastoProduEmpresaConstantesFunciones.getOrderByListaTipoGastoProduEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGastoProduEmpresa tipogastoproduempresa:tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
				if(tipogastoproduempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoproduempresaTotales=tipogastoproduempresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGastoProduEmpresa tipogastoproduempresa:this.tipogastoproduempresas) {
				if(tipogastoproduempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoproduempresaTotales=tipogastoproduempresa;
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
			this.tipogastoproduempresaAux=new TipoGastoProduEmpresa();
			this.tipogastoproduempresaAux.setsType(Constantes2.S_TOTALES);
			this.tipogastoproduempresaAux.setIsNew(false);
			this.tipogastoproduempresaAux.setIsChanged(false);
			this.tipogastoproduempresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGastoProduEmpresaConstantesFunciones.TotalizarValoresFilaTipoGastoProduEmpresa(this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas(),this.tipogastoproduempresaAux);
				
				this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().add(this.tipogastoproduempresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGastoProduEmpresaConstantesFunciones.TotalizarValoresFilaTipoGastoProduEmpresa(this.tipogastoproduempresas,this.tipogastoproduempresaAux);
				
				this.tipogastoproduempresas.add(this.tipogastoproduempresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogastoproduempresaTotales=new TipoGastoProduEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().remove(tipogastoproduempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogastoproduempresas.remove(tipogastoproduempresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogastoproduempresaTotales=new TipoGastoProduEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGastoProduEmpresa tipogastoproduempresa:tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
				if(tipogastoproduempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoproduempresaTotales=tipogastoproduempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGastoProduEmpresaConstantesFunciones.TotalizarValoresFilaTipoGastoProduEmpresa(this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas(),tipogastoproduempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGastoProduEmpresa tipogastoproduempresa:this.tipogastoproduempresas) {
				if(tipogastoproduempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoproduempresaTotales=tipogastoproduempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGastoProduEmpresaConstantesFunciones.TotalizarValoresFilaTipoGastoProduEmpresa(this.tipogastoproduempresas,tipogastoproduempresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoGastoProduEmpresasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoGastoProduEmpresasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoproduempresaLogic.getTipoGastoProduEmpresasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoGastoProduEmpresa() {
		this.isPermisoTodoTipoGastoProduEmpresa=false;
		this.isPermisoNuevoTipoGastoProduEmpresa=false;
		this.isPermisoActualizarTipoGastoProduEmpresa=false;
		this.isPermisoActualizarOriginalTipoGastoProduEmpresa=false;
		this.isPermisoEliminarTipoGastoProduEmpresa=false;
		this.isPermisoGuardarCambiosTipoGastoProduEmpresa=false;
		this.isPermisoConsultaTipoGastoProduEmpresa=false;
		this.isPermisoBusquedaTipoGastoProduEmpresa=false;
		this.isPermisoReporteTipoGastoProduEmpresa=false;		
		this.isPermisoOrdenTipoGastoProduEmpresa=false;		
		this.isPermisoPaginacionMedioTipoGastoProduEmpresa=false;		
		this.isPermisoPaginacionAltoTipoGastoProduEmpresa=false;
		this.isPermisoPaginacionTodoTipoGastoProduEmpresa=false;
		this.isPermisoCopiarTipoGastoProduEmpresa=false;		
		this.isPermisoVerFormTipoGastoProduEmpresa=false;		
		this.isPermisoDuplicarTipoGastoProduEmpresa=false;		
		this.isPermisoOrdenTipoGastoProduEmpresa=false;		
	}
	
	public void setPermisosUsuarioTipoGastoProduEmpresa(Boolean isPermiso) {
		this.isPermisoTodoTipoGastoProduEmpresa=isPermiso;
		this.isPermisoNuevoTipoGastoProduEmpresa=isPermiso;
		this.isPermisoActualizarTipoGastoProduEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoGastoProduEmpresa=isPermiso;
		this.isPermisoEliminarTipoGastoProduEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoGastoProduEmpresa=isPermiso;
		this.isPermisoConsultaTipoGastoProduEmpresa=isPermiso;
		this.isPermisoBusquedaTipoGastoProduEmpresa=isPermiso;
		this.isPermisoReporteTipoGastoProduEmpresa=isPermiso;
		this.isPermisoOrdenTipoGastoProduEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioTipoGastoProduEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoTipoGastoProduEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoTipoGastoProduEmpresa=isPermiso;		
		this.isPermisoCopiarTipoGastoProduEmpresa=isPermiso;		
		this.isPermisoVerFormTipoGastoProduEmpresa=isPermiso;		
		this.isPermisoDuplicarTipoGastoProduEmpresa=isPermiso;
		this.isPermisoOrdenTipoGastoProduEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGastoProduEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoTipoGastoProduEmpresa=isPermiso;
		this.isPermisoNuevoTipoGastoProduEmpresa=isPermiso;
		this.isPermisoActualizarTipoGastoProduEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoGastoProduEmpresa=isPermiso;
		this.isPermisoEliminarTipoGastoProduEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoGastoProduEmpresa=isPermiso;
		//this.isPermisoConsultaTipoGastoProduEmpresa=isPermiso;
		//this.isPermisoBusquedaTipoGastoProduEmpresa=isPermiso;
		//this.isPermisoReporteTipoGastoProduEmpresa=isPermiso;
		//this.isPermisoOrdenTipoGastoProduEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGastoProduEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGastoProduEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGastoProduEmpresa=isPermiso;		
		//this.isPermisoCopiarTipoGastoProduEmpresa=isPermiso;		
		//this.isPermisoDuplicarTipoGastoProduEmpresa=isPermiso;
		//this.isPermisoOrdenTipoGastoProduEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGastoProduEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoGastoProduEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGastoProduEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGastoProduEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGastoProduEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGastoProduEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGastoProduEmpresaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoGastoProduEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGastoProduEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGastoProduEmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGastoProduEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGastoProduEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGastoProduEmpresa=this.isPermisoActualizarTipoGastoProduEmpresa;
			this.isPermisoEliminarTipoGastoProduEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGastoProduEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGastoProduEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGastoProduEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGastoProduEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGastoProduEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGastoProduEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGastoProduEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGastoProduEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGastoProduEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGastoProduEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGastoProduEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGastoProduEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGastoProduEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGastoProduEmpresa.setToolTipText(this.jTableDatosTipoGastoProduEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGastoProduEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGastoProduEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGastoProduEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGastoProduEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoGastoProduEmpresa() throws Exception {
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
	public void inicializarCombosForeignKeyTipoGastoProduEmpresaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGastoProduEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGastoProduEmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGastoProduEmpresaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoGastoProduEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoGastoProduEmpresaParameterReturnGeneral tipogastoproduempresaReturnGeneral=new TipoGastoProduEmpresaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipogastoproduempresaConstantesFunciones.cargarid_empresaTipoGastoProduEmpresa)
					 || (this.esRecargarFks && this.tipogastoproduempresaConstantesFunciones.cargarid_empresaTipoGastoProduEmpresa)) {

					if(!this.tipogastoproduempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipogastoproduempresaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipogastoproduempresaReturnGeneral=tipogastoproduempresaLogic.cargarCombosLoteForeignKeyTipoGastoProduEmpresa(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipogastoproduempresaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGastoProduEmpresa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipogastoproduempresaSessionBean==null) {
				this.tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean();
			}

			if(!this.tipogastoproduempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoGastoProduEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGastoProduEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGastoProduEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGastoProduEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGastoProduEmpresa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGastoProduEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGastoProduEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGastoProduEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGastoProduEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGastoProduEmpresa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGastoProduEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGastoProduEmpresa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa!=null && this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoGastoProduEmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGastoProduEmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGastoProduEmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean(); 
		this.tipogastoproduempresaConstantesFunciones=new TipoGastoProduEmpresaConstantesFunciones(); 
		this.tipogastoproduempresaBean=new TipoGastoProduEmpresa();//(this.tipogastoproduempresaConstantesFunciones); 		
		this.tipogastoproduempresaReturnGeneral=new TipoGastoProduEmpresaParameterReturnGeneral(); 
		
		this.tipogastoproduempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoproduempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGastoProduEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGastoProduEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGastoProduEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGastoProduEmpresa(true);
			
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
			
			this.tipogastoproduempresaConstantesFunciones=new TipoGastoProduEmpresaConstantesFunciones(); 
			this.tipogastoproduempresaBean=new TipoGastoProduEmpresa();//this.tipogastoproduempresaConstantesFunciones); 			
			this.tipogastoproduempresaReturnGeneral=new TipoGastoProduEmpresaParameterReturnGeneral(); 
		
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Gasto Produccion Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipogastoproduempresa=new TipoGastoProduEmpresa();
			this.tipogastoproduempresas = new ArrayList<TipoGastoProduEmpresa>();
			this.tipogastoproduempresasAux = new ArrayList<TipoGastoProduEmpresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic=new TipoGastoProduEmpresaLogic();
				this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipogastoproduempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipogastoproduempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGastoProduEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa);	
					}
					
					if(this.jInternalFrameImportacionTipoGastoProduEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGastoProduEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGastoProduEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGastoProduEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGastoProduEmpresa);
				this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa);
					this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGastoProduEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGastoProduEmpresa);
					this.jInternalFrameImportacionTipoGastoProduEmpresa.setVisible(false);
					this.jInternalFrameImportacionTipoGastoProduEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGastoProduEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGastoProduEmpresa);
					this.jInternalFrameOrderByTipoGastoProduEmpresa.setVisible(false);
					this.jInternalFrameOrderByTipoGastoProduEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGastoProduEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGastoProduEmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipogastoproduempresaReturnGeneral=new TipoGastoProduEmpresaParameterReturnGeneral();
			
			this.tipogastoproduempresaParameterGeneral=new TipoGastoProduEmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipogastoproduempresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoGastoProduEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGastoProduEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado(),this.tipogastoproduempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGastoProduEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado(),this.tipogastoproduempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaCopiarTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaVerFormTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaOrdenTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaModificarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGastoProduEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGastoProduEmpresa(false);
			
			this.setPermisosUsuarioTipoGastoProduEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado() && this.tipogastoproduempresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGastoProduEmpresaClasesRelacionadas();
			}
			
			if(this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGastoProduEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGastoProduEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGastoProduEmpresa();
			}
			
			if(!this.isPermisoBusquedaTipoGastoProduEmpresa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGastoProduEmpresa,this.isPermisoPaginacionMedioTipoGastoProduEmpresa,this.isPermisoPaginacionTodoTipoGastoProduEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGastoProduEmpresaConstantesFunciones.getTiposSeleccionarTipoGastoProduEmpresa());
				
				this.tiposColumnasSelect=TipoGastoProduEmpresaConstantesFunciones.getTiposSeleccionarTipoGastoProduEmpresa(true);
				
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
			//if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGastoProduEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoGastoProduEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoGastoProduEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGastoProduEmpresa() ;
			
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
				tipogastoproduempresaImplementable= (TipoGastoProduEmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGastoProduEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipogastoproduempresaImplementableHome= (TipoGastoProduEmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGastoProduEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipogastoproduempresas= new ArrayList<TipoGastoProduEmpresa>();
			this.tipogastoproduempresasEliminados= new ArrayList<TipoGastoProduEmpresa>();
						
			this.isEsNuevoTipoGastoProduEmpresa=false;
			this.esParaAccionDesdeFormularioTipoGastoProduEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGastoProduEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGastoProduEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGastoProduEmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGastoProduEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGastoProduEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGastoProduEmpresa();
			}
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoGastoProduEmpresa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGastoProduEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGastoProduEmpresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGastoProduEmpresa() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoGastoProduEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTabbedPaneRelacionesTipoGastoProduEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTabbedPaneRelacionesTipoGastoProduEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoGastoProduEmpresa();	
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
	
	public void cargarCombosForeignKeyTipoGastoProduEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGastoProduEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGastoProduEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGastoProduEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGastoProduEmpresa();
		
		this.cargarCombosFrameForeignKeyTipoGastoProduEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGastoProduEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGastoProduEmpresa();
		}
	}
	
	
	
	public void jButtonNuevoTipoGastoProduEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
			
			if(jTableDatosTipoGastoProduEmpresa.getRowCount()>=1) {
				jTableDatosTipoGastoProduEmpresa.removeRowSelectionInterval(0, jTableDatosTipoGastoProduEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGastoProduEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGastoProduEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGastoProduEmpresa(true);			
			//this.tipogastoproduempresa=new TipoGastoProduEmpresa();
			//this.tipogastoproduempresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGastoProduEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGastoProduEmpresa() ;
			
			if(TipoGastoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGastoProduEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipogastoproduempresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);				
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
			if(this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGastoProduEmpresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGastoProduEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGastoProduEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGastoProduEmpresa.getSelectedRows().length;			
			}
			
			tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGastoProduEmpresa--;			
				//TipoGastoProduEmpresa tipogastoproduempresaAux= new TipoGastoProduEmpresa();			
				//tipogastoproduempresaAux.setId(this.iIdNuevoTipoGastoProduEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGastoProduEmpresa tipogastoproduempresaOrigen=new TipoGastoProduEmpresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGastoProduEmpresa tipogastoproduempresaOrigen : tipogastoproduempresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipogastoproduempresaOrigen =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoproduempresaOrigen =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGastoProduEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipogastoproduempresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGastoProduEmpresa(tipogastoproduempresaOrigen,this.tipogastoproduempresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().add(this.tipogastoproduempresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogastoproduempresas.add(this.tipogastoproduempresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
				
				this.jTableDatosTipoGastoProduEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoGastoProduEmpresa(), this.getIndiceNuevoTipoGastoProduEmpresa());
				
				int iLastRow =  this.jTableDatosTipoGastoProduEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGastoProduEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGastoProduEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();									
		
			TipoGastoProduEmpresa tipogastoproduempresaOrigen=new TipoGastoProduEmpresa();
			TipoGastoProduEmpresa tipogastoproduempresaDestino=new TipoGastoProduEmpresa();
				
			tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGastoProduEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipogastoproduempresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGastoProduEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduempresaOrigen =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogastoproduempresaOrigen =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoproduempresaDestino =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogastoproduempresaDestino =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipogastoproduempresaOrigen =tipogastoproduempresasSeleccionados.get(0);
				tipogastoproduempresaDestino =tipogastoproduempresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGastoProduEmpresa(tipogastoproduempresaOrigen,tipogastoproduempresaDestino,true,false);
				
				tipogastoproduempresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogastoproduempresaDestino,tipogastoproduempresaLogic.getTipoGastoProduEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoproduempresaDestino,tipogastoproduempresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
				
				//this.jTableDatosTipoGastoProduEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoGastoProduEmpresa(), this.getIndiceNuevoTipoGastoProduEmpresa());
				
				int iLastRow =  this.jTableDatosTipoGastoProduEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGastoProduEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGastoProduEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGastoProduEmpresa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoGastoProduEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionTipoGastoProduEmpresa.setVisible(!isVisible);
			this.jPanelAccionesTipoGastoProduEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGastoProduEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGastoProduEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGastoProduEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGastoProduEmpresa();
			
			this.abrirFrameOrderByTipoGastoProduEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGastoProduEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGastoProduEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGastoProduEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setSize(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormTipoGastoProduEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGastoProduEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGastoProduEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jContentPaneDetalleTipoGastoProduEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTabbedPaneRelacionesTipoGastoProduEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jContentPaneDetalleTipoGastoProduEmpresa.getWidth(),TipoGastoProduEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTabbedPaneRelacionesTipoGastoProduEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jContentPaneDetalleTipoGastoProduEmpresa.getWidth(),TipoGastoProduEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTabbedPaneRelacionesTipoGastoProduEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jContentPaneDetalleTipoGastoProduEmpresa.getWidth(),TipoGastoProduEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGastoProduEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGastoProduEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGastoProduEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGastoProduEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByTipoGastoProduEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGastoProduEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGastoProduEmpresa);
				this.jInternalFrameOrderByTipoGastoProduEmpresa.setVisible(false);
				this.jInternalFrameOrderByTipoGastoProduEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByTipoGastoProduEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGastoProduEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGastoProduEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGastoProduEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGastoProduEmpresa==null) {
				
				this.jInternalFrameImportacionTipoGastoProduEmpresa=new ImportacionJInternalFrame(TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGastoProduEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGastoProduEmpresa);
				this.jInternalFrameImportacionTipoGastoProduEmpresa.setVisible(false);
				this.jInternalFrameImportacionTipoGastoProduEmpresa.setSelected(false);


				this.jInternalFrameImportacionTipoGastoProduEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGastoProduEmpresa"));
				this.jInternalFrameImportacionTipoGastoProduEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGastoProduEmpresa"));
				this.jInternalFrameImportacionTipoGastoProduEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGastoProduEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGastoProduEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa==null) {
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa=new ReporteDinamicoJInternalFrame(TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa);
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGastoProduEmpresa"));
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGastoProduEmpresa"));
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGastoProduEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGastoProduEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoGastoProduEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGastoProduEmpresa);
			
	       	this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGastoProduEmpresa.dispose();
			//this.jInternalFrameDetalleFormTipoGastoProduEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGastoProduEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGastoProduEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGastoProduEmpresa.setVisible(true);
	        this.jInternalFrameImportacionTipoGastoProduEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGastoProduEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setVisible(true);
	        this.jInternalFrameOrderByTipoGastoProduEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGastoProduEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setVisible(false);
	        this.jInternalFrameOrderByTipoGastoProduEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGastoProduEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGastoProduEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGastoProduEmpresa.setVisible(false);
	        this.jInternalFrameImportacionTipoGastoProduEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGastoProduEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGastoProduEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGastoProduEmpresa(true);
			//this.isEsNuevoTipoGastoProduEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGastoProduEmpresa(false) ;
			
			if(tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoGastoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGastoProduEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGastoProduEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGastoProduEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGastoProduEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGastoProduEmpresa(true);
			//this.isEsNuevoTipoGastoProduEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipogastoproduempresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGastoProduEmpresa(false) ;
			
			if(TipoGastoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGastoProduEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGastoProduEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGastoProduEmpresa(false);
			
			//if(!this.isEsNuevoTipoGastoProduEmpresa) {								
				int intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
				
			}
			
			if(this.permiteMantenimiento(this.tipogastoproduempresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGastoProduEmpresa=true;
					this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
					this.isEsNuevoTipoGastoProduEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGastoProduEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGastoProduEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGastoProduEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGastoProduEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoGastoProduEmpresa(false);
			
												
				
				if(TipoGastoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGastoProduEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,tipogastoproduempresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGastoProduEmpresa(this.tipogastoproduempresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGastoProduEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipogastoproduempresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipogastoproduempresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipogastoproduempresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipogastoproduempresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipogastoproduempresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGastoProduEmpresaModel) this.jTableDatosTipoGastoProduEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGastoProduEmpresa=true;
				this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
				this.isEsNuevoTipoGastoProduEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGastoProduEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGastoProduEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoGastoProduEmpresa(false);
				
				
				
				if(TipoGastoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGastoProduEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGastoProduEmpresa.getRowCount()>=1) {
				jTableDatosTipoGastoProduEmpresa.removeRowSelectionInterval(0, jTableDatosTipoGastoProduEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGastoProduEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGastoProduEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGastoProduEmpresa(false) ;
			
			this.isEsNuevoTipoGastoProduEmpresa=false;
			
			if(TipoGastoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGastoProduEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
				
				//SI ES MANUAL
				if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGastoProduEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGastoProduEmpresa--;			
			//TipoGastoProduEmpresa tipogastoproduempresaAux= new TipoGastoProduEmpresa();			
			//tipogastoproduempresaAux.setId(this.iIdNuevoTipoGastoProduEmpresa);
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGastoProduEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
			
			this.tipogastoproduempresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().add(this.tipogastoproduempresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipogastoproduempresas.add(this.tipogastoproduempresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
			
			this.jTableDatosTipoGastoProduEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoGastoProduEmpresa(), this.getIndiceNuevoTipoGastoProduEmpresa());
			
			int iLastRow =  this.jTableDatosTipoGastoProduEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGastoProduEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGastoProduEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
			
			//SI ES MANUAL
			if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGastoProduEmpresa();
			}
			
			//this.abrirFrameTreeTipoGastoProduEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Gasto Produccion EmpresaS ?", "MANTENIMIENTO DE Tipo Gasto Produccion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGastoProduEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGastoProduEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipogastoproduempresaReturnGeneral=tipogastoproduempresaLogic.procesarImportacionTipoGastoProduEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipogastoproduempresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGastoProduEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGastoProduEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGastoProduEmpresa.setFileImportacion(this.jInternalFrameImportacionTipoGastoProduEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGastoProduEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGastoProduEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGastoProduEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGastoProduEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();		

		tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGastoProduEmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGastoProduEmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoGastoProduEmpresas("Todos",tipogastoproduempresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();		
		
		tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoproduempresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoGastoProduEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoGastoProduEmpresa tipogastoproduempresa:tipogastoproduempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogastoproduempresa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGastoProduEmpresa tipogastoproduempresa:tipogastoproduempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogastoproduempresa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoGastoProduEmpresa tipogastoproduempresa:tipogastoproduempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogastoproduempresa.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoGastoProduEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGastoProduEmpresa(tipogastoproduempresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
			
			//SI ES MANUAL
			if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGastoProduEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
			
			//SI ES MANUAL
			if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGastoProduEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
			
			//SI ES MANUAL
			if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGastoProduEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGastoProduEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGastoProduEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGastoProduEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGastoProduEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGastoProduEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGastoProduEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGastoProduEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGastoProduEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGastoProduEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGastoProduEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGastoProduEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGastoProduEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGastoProduEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGastoProduEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGastoProduEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGastoProduEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGastoProduEmpresa();
		
		this.inicializarActualizarBindingBotonesManualTipoGastoProduEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGastoProduEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGastoProduEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGastoProduEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGastoProduEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGastoProduEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGastoProduEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jCheckBoxPostAccionNuevoTipoGastoProduEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jCheckBoxPostAccionSinCerrarTipoGastoProduEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jCheckBoxPostAccionSinMensajeTipoGastoProduEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGastoProduEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGastoProduEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
				this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jCheckBoxPostAccionNuevoTipoGastoProduEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jCheckBoxPostAccionSinCerrarTipoGastoProduEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jCheckBoxPostAccionSinMensajeTipoGastoProduEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGastoProduEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGastoProduEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGastoProduEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGastoProduEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGastoProduEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGastoProduEmpresa() throws Exception {
		try	{
			if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGastoProduEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGastoProduEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGastoProduEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGastoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGastoProduEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.addItem(reporte);
			}
			
			
			if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGastoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGastoProduEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGastoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGastoProduEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGastoProduEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGastoProduEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGastoProduEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGastoProduEmpresa(Boolean esInicializar) throws Exception {				
		if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGastoProduEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGastoProduEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGastoProduEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGastoProduEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGastoProduEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGastoProduEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProduEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGastoProduEmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGastoProduEmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGastoProduEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipogastoproduempresaLogic.getTipoGastoProduEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipogastoproduempresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGastoProduEmpresa.setModel(new TipoGastoProduEmpresaModel(this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGastoProduEmpresa.setModel(new TipoGastoProduEmpresaModel(this.tipogastoproduempresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGastoProduEmpresa!=null && this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGastoProduEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProduEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGastoProduEmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,tipogastoproduempresaConstantesFunciones.resaltarSeleccionarTipoGastoProduEmpresa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,tipogastoproduempresaConstantesFunciones.resaltarSeleccionarTipoGastoProduEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProduEmpresa,TipoGastoProduEmpresaConstantesFunciones.LABEL_ID));

		if(this.tipogastoproduempresaConstantesFunciones.mostraridTipoGastoProduEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoProduEmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipogastoproduempresaConstantesFunciones.resaltaridTipoGastoProduEmpresa,this.tipogastoproduempresaConstantesFunciones.activaridTipoGastoProduEmpresa,this,true,"idTipoGastoProduEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogastoproduempresaConstantesFunciones.resaltaridTipoGastoProduEmpresa,this.tipogastoproduempresaConstantesFunciones.activaridTipoGastoProduEmpresa,this,true,"idTipoGastoProduEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProduEmpresa,TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipogastoproduempresaConstantesFunciones.mostrarid_empresaTipoGastoProduEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipogastoproduempresaConstantesFunciones.resaltarid_empresaTipoGastoProduEmpresa,this,this.tipogastoproduempresaConstantesFunciones.activarid_empresaTipoGastoProduEmpresa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipogastoproduempresaConstantesFunciones.resaltarid_empresaTipoGastoProduEmpresa,this,this.tipogastoproduempresaConstantesFunciones.activarid_empresaTipoGastoProduEmpresa,false,"id_empresaTipoGastoProduEmpresa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGastoProduEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProduEmpresa,TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipogastoproduempresaConstantesFunciones.mostrarnombreTipoGastoProduEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogastoproduempresaConstantesFunciones.resaltarnombreTipoGastoProduEmpresa,this.tipogastoproduempresaConstantesFunciones.activarnombreTipoGastoProduEmpresa,this,true,"nombreTipoGastoProduEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogastoproduempresaConstantesFunciones.resaltarnombreTipoGastoProduEmpresa,this.tipogastoproduempresaConstantesFunciones.activarnombreTipoGastoProduEmpresa,this,true,"nombreTipoGastoProduEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGastoProduEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProduEmpresa,TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipogastoproduempresaConstantesFunciones.mostrardescripcionTipoGastoProduEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogastoproduempresaConstantesFunciones.resaltardescripcionTipoGastoProduEmpresa,this.tipogastoproduempresaConstantesFunciones.activardescripcionTipoGastoProduEmpresa,this,true,"descripcionTipoGastoProduEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogastoproduempresaConstantesFunciones.resaltardescripcionTipoGastoProduEmpresa,this.tipogastoproduempresaConstantesFunciones.activardescripcionTipoGastoProduEmpresa,this,true,"descripcionTipoGastoProduEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGastoProduEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGastoProduEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGastoProduEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGastoProduEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosTipoGastoProduEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGastoProduEmpresa.moveColumn(this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGastoProduEmpresa.moveColumn(this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGastoProduEmpresa.moveColumn(this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGastoProduEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGastoProduEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGastoProduEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGastoProduEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGastoProduEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGastoProduEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipogastoproduempresaLogic.getTipoGastoProduEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipogastoproduempresas.size()-1;
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
		//this.jTableDatosTipoGastoProduEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGastoProduEmpresa();
			
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
				
				//this.isEsNuevoTipoGastoProduEmpresa=false;
					
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
				if(this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGastoProduEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipogastoproduempresa.getsType().equals("DUPLICADO")
				   || this.tipogastoproduempresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGastoProduEmpresa=true;
				
				} else {
					this.isEsNuevoTipoGastoProduEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipogastoproduempresa.getId()>=0 && !this.tipogastoproduempresa.getIsNew()) {						
						this.isEsNuevoTipoGastoProduEmpresa=false;
						
					} else {
						this.isEsNuevoTipoGastoProduEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGastoProduEmpresa(esRelaciones);						
				
				this.seleccionarTipoGastoProduEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipogastoproduempresa.getId()<0) {
					this.isEsNuevoTipoGastoProduEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGastoProduEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGastoProduEmpresa(evt,rowIndex);
				}	
				
				if(this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGastoProduEmpresa: " + this.dDif); 
					}
				}								
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGastoProduEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipogastoproduempresa)) {
					if(this.tipogastoproduempresa.getId()>0) {
						this.tipogastoproduempresa.setIsDeleted(true);
						
						this.tipogastoproduempresasEliminados.add(this.tipogastoproduempresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().remove(this.tipogastoproduempresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogastoproduempresas.remove(this.tipogastoproduempresa);				
					}
					
					
					((TipoGastoProduEmpresaModel) this.jTableDatosTipoGastoProduEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGastoProduEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGastoProduEmpresa) {
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGastoProduEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGastoProduEmpresa(this.tipogastoproduempresa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipogastoproduempresaConstantesFunciones.cargarid_empresaTipoGastoProduEmpresa || this.tipogastoproduempresaConstantesFunciones.event_dependid_empresaTipoGastoProduEmpresa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipogastoproduempresa.getid_empresa());
									//this.inicializarActualizarBindingTipoGastoProduEmpresa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipogastoproduempresa.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipogastoproduempresa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipogastoproduempresa.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGastoProduEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGastoProduEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGastoProduEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGastoProduEmpresa(tipogastoproduempresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGastoProduEmpresa(tipogastoproduempresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGastoProduEmpresa(tipogastoproduempresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGastoProduEmpresa(tipogastoproduempresa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.setText(tipogastoproduempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreanombreTipoGastoProduEmpresa.setText(tipogastoproduempresa.getnombre());
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreadescripcionTipoGastoProduEmpresa.setText(tipogastoproduempresa.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGastoProduEmpresa tipogastoproduempresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipogastoproduempresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGastoProduEmpresa tipogastoproduempresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipogastoproduempresaLocal=this.tipogastoproduempresa;
			} else {
				tipogastoproduempresaLocal=this.tipogastoproduempresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipogastoproduempresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGastoProduEmpresa(tipogastoproduempresaLocal,true);
					
					if(tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipogastoproduempresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipogastoproduempresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(tipogastoproduempresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(tipogastoproduempresa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(tipogastoproduempresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.getText()==null || this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.getText()=="" || this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.setText("0");
			}

			if(conColumnasBase) {tipogastoproduempresa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGastoProduEmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelIdTipoGastoProduEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogastoproduempresa.setnombre(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreanombreTipoGastoProduEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelnombreTipoGastoProduEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogastoproduempresa.setdescripcion(this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreadescripcionTipoGastoProduEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabeldescripcionTipoGastoProduEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresaBean,TipoGastoProduEmpresa tipogastoproduempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresaOrigen,TipoGastoProduEmpresa tipogastoproduempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogastoproduempresaOrigen.getId()!=null && !tipogastoproduempresaOrigen.getId().equals(0L))) {tipogastoproduempresa.setId(tipogastoproduempresaOrigen.getId());}}
			if(conDefault || (!conDefault && tipogastoproduempresaOrigen.getnombre()!=null && !tipogastoproduempresaOrigen.getnombre().equals(""))) {tipogastoproduempresa.setnombre(tipogastoproduempresaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipogastoproduempresaOrigen.getdescripcion()!=null && !tipogastoproduempresaOrigen.getdescripcion().equals(""))) {tipogastoproduempresa.setdescripcion(tipogastoproduempresaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.setText(tipogastoproduempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreanombreTipoGastoProduEmpresa.setText(tipogastoproduempresa.getnombre());
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreadescripcionTipoGastoProduEmpresa.setText(tipogastoproduempresa.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGastoProduEmpresa(TipoGastoProduEmpresaBean tipogastoproduempresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.setText(tipogastoproduempresaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreanombreTipoGastoProduEmpresa.setText(tipogastoproduempresaBean.getnombre());
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreadescripcionTipoGastoProduEmpresa.setText(tipogastoproduempresaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGastoProduEmpresa(TipoGastoProduEmpresaParameterReturnGeneral tipogastoproduempresaReturnGeneral,TipoGastoProduEmpresaBean tipogastoproduempresaBean,Boolean conDefault) throws Exception { 
		try {
			TipoGastoProduEmpresa tipogastoproduempresaLocal=new TipoGastoProduEmpresa();
			
			tipogastoproduempresaLocal=tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogastoproduempresaLocal.getId()!=null && !tipogastoproduempresaLocal.getId().equals(0L))) {tipogastoproduempresaBean.setId(tipogastoproduempresaLocal.getId());}}
			if(conDefault || (!conDefault && tipogastoproduempresaLocal.getnombre()!=null && !tipogastoproduempresaLocal.getnombre().equals(""))) {tipogastoproduempresaBean.setnombre(tipogastoproduempresaLocal.getnombre());}
			if(conDefault || (!conDefault && tipogastoproduempresaLocal.getdescripcion()!=null && !tipogastoproduempresaLocal.getdescripcion().equals(""))) {tipogastoproduempresaBean.setdescripcion(tipogastoproduempresaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGastoProduEmpresaGenerico(Long idTipoGastoProduEmpresaSeleccionado,JComboBox jComboBoxTipoGastoProduEmpresa,List<TipoGastoProduEmpresa> tipogastoproduempresasLocal)throws Exception {
		try {
			TipoGastoProduEmpresa  tipogastoproduempresaTemp=null;

			for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresasLocal) {
				if(tipogastoproduempresaAux.getId()!=null && tipogastoproduempresaAux.getId().equals(idTipoGastoProduEmpresaSeleccionado)) {
					tipogastoproduempresaTemp=tipogastoproduempresaAux;
					break;
				}
			}

			jComboBoxTipoGastoProduEmpresa.setSelectedItem(tipogastoproduempresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGastoProduEmpresaGenerico(JComboBox jComboBoxTipoGastoProduEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGastoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGastoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGastoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGastoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGastoProduEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGastoProduEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGastoProduEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGastoProduEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGastoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGastoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogastoproduempresa=(TipoGastoProduEmpresa) tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogastoproduempresa =(TipoGastoProduEmpresa) tipogastoproduempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipogastoproduempresa.getIsNew() && !tipogastoproduempresa.getIsChanged() && !tipogastoproduempresa.getIsDeleted()) {
				sDescripcion=tipogastoproduempresa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipogastoproduempresa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGastoProduEmpresa tipogastoproduempresaRow=new TipoGastoProduEmpresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogastoproduempresaRow=(TipoGastoProduEmpresa) tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogastoproduempresaRow=(TipoGastoProduEmpresa) tipogastoproduempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGastoProduEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa && this.isPermisoNuevoTipoGastoProduEmpresa));			
			this.jButtonDuplicarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoGastoProduEmpresa && this.isPermisoDuplicarTipoGastoProduEmpresa));			
			this.jButtonCopiarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoGastoProduEmpresa && this.isPermisoCopiarTipoGastoProduEmpresa));
			this.jButtonVerFormTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoGastoProduEmpresa && this.isPermisoVerFormTipoGastoProduEmpresa));
			
			this.jButtonAbrirOrderByTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProduEmpresa && this.isPermisoOrdenTipoGastoProduEmpresa));			
			
			this.jButtonNuevoRelacionesTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa && this.isPermisoNuevoTipoGastoProduEmpresa));			
			this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa && this.isPermisoNuevoTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa));
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonModificarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoGastoProduEmpresa && this.isPermisoActualizarTipoGastoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonActualizarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa && this.isPermisoActualizarTipoGastoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonEliminarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa && this.isPermisoEliminarTipoGastoProduEmpresa));
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonCancelarTipoGastoProduEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa);							
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa && this.isPermisoNuevoTipoGastoProduEmpresa));						
			this.jButtonDuplicarToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoGastoProduEmpresa && this.isPermisoDuplicarTipoGastoProduEmpresa));						
			this.jButtonCopiarToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoGastoProduEmpresa && this.isPermisoCopiarTipoGastoProduEmpresa));			
			this.jButtonVerFormToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoGastoProduEmpresa && this.isPermisoVerFormTipoGastoProduEmpresa));			
			this.jButtonAbrirOrderByToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProduEmpresa && this.isPermisoOrdenTipoGastoProduEmpresa));
			this.jButtonNuevoRelacionesToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa && this.isPermisoNuevoTipoGastoProduEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa && this.isPermisoNuevoTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa));			
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonModificarToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoGastoProduEmpresa && this.isPermisoActualizarTipoGastoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonActualizarToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa  && this.isPermisoActualizarTipoGastoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonEliminarToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa && this.isPermisoEliminarTipoGastoProduEmpresa));
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonCancelarToolBarTipoGastoProduEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa);				
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa && this.isPermisoNuevoTipoGastoProduEmpresa));			
			this.jMenuItemDuplicarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoGastoProduEmpresa && this.isPermisoDuplicarTipoGastoProduEmpresa));			
			this.jMenuItemCopiarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoGastoProduEmpresa && this.isPermisoCopiarTipoGastoProduEmpresa));			
			this.jMenuItemVerFormTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoGastoProduEmpresa && this.isPermisoVerFormTipoGastoProduEmpresa));			
			this.jMenuItemAbrirOrderByTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProduEmpresa && this.isPermisoOrdenTipoGastoProduEmpresa));			
			//this.jMenuItemMostrarOcultarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProduEmpresa && this.isPermisoOrdenTipoGastoProduEmpresa));
			this.jMenuItemDetalleAbrirOrderByTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProduEmpresa && this.isPermisoOrdenTipoGastoProduEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGastoProduEmpresa && this.isPermisoOrdenTipoGastoProduEmpresa));			
			this.jMenuItemNuevoRelacionesTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa && this.isPermisoNuevoTipoGastoProduEmpresa));			
			this.jMenuItemNuevoGuardarCambiosTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa && this.isPermisoNuevoTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa));									
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemModificarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoGastoProduEmpresa && this.isPermisoActualizarTipoGastoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemActualizarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa && this.isPermisoActualizarTipoGastoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemEliminarTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa && this.isPermisoEliminarTipoGastoProduEmpresa));
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemCancelarTipoGastoProduEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa));						
			this.jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=this.jButtonNuevoTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGastoProduEmpresa=this.jButtonDuplicarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarTipoGastoProduEmpresa=this.jButtonCopiarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormTipoGastoProduEmpresa=this.jButtonVerFormTipoGastoProduEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGastoProduEmpresa=this.jButtonAbrirOrderByTipoGastoProduEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=this.jButtonNuevoRelacionesTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaModificarTipoGastoProduEmpresa=this.jButtonModificarTipoGastoProduEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonActualizarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonEliminarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonCancelarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosTipoGastoProduEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=this.jButtonNuevoToolBarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=this.jButtonNuevoRelacionesToolBarTipoGastoProduEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonModificarToolBarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonActualizarToolBarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonEliminarToolBarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonCancelarToolBarTipoGastoProduEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=this.jButtonGuardarCambiosToolBarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=this.jButtonGuardarCambiosTablaToolBarTipoGastoProduEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=this.jMenuItemNuevoTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=this.jMenuItemNuevoRelacionesTipoGastoProduEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemModificarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemActualizarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemEliminarTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemCancelarTipoGastoProduEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=this.jMenuItemGuardarCambiosTipoGastoProduEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=this.jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGastoProduEmpresa(Boolean esInicializar) {
		if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGastoProduEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGastoProduEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGastoProduEmpresa() {
		this.jButtonNuevoTipoGastoProduEmpresa.setVisible(this.isPermisoNuevoTipoGastoProduEmpresa);			
		this.jButtonDuplicarTipoGastoProduEmpresa.setVisible(this.isPermisoDuplicarTipoGastoProduEmpresa);			
		this.jButtonCopiarTipoGastoProduEmpresa.setVisible(this.isPermisoCopiarTipoGastoProduEmpresa);			
		this.jButtonVerFormTipoGastoProduEmpresa.setVisible(this.isPermisoVerFormTipoGastoProduEmpresa);			
		
		this.jButtonAbrirOrderByTipoGastoProduEmpresa.setVisible(this.isPermisoOrdenTipoGastoProduEmpresa);					
		
		this.jButtonNuevoRelacionesTipoGastoProduEmpresa.setVisible(this.isPermisoNuevoTipoGastoProduEmpresa);			
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonModificarTipoGastoProduEmpresa.setVisible(this.isPermisoActualizarTipoGastoProduEmpresa);	
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonActualizarTipoGastoProduEmpresa.setVisible(this.isPermisoActualizarTipoGastoProduEmpresa);	
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonEliminarTipoGastoProduEmpresa.setVisible(this.isPermisoEliminarTipoGastoProduEmpresa);
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonCancelarTipoGastoProduEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa);						
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosTipoGastoProduEmpresa.setVisible(this.isPermisoGuardarCambiosTipoGastoProduEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.setVisible(this.isPermisoActualizarTipoGastoProduEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGastoProduEmpresa() {
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonModificarTipoGastoProduEmpresa.setVisible(this.isPermisoActualizarTipoGastoProduEmpresa);	
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonActualizarTipoGastoProduEmpresa.setVisible(this.isPermisoActualizarTipoGastoProduEmpresa);	
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonEliminarTipoGastoProduEmpresa.setVisible(this.isPermisoEliminarTipoGastoProduEmpresa);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonCancelarTipoGastoProduEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa);							
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosTipoGastoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa && this.isPermisoGuardarCambiosTipoGastoProduEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGastoProduEmpresa() {
		if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGastoProduEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGastoProduEmpresa() {
	}
	
	public void jTableDatosTipoGastoProduEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGastoProduEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGastoProduEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.gettipogastoproduempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogastoproduempresa==null) {
						this.tipogastoproduempresa = new TipoGastoProduEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
				}

				if(this.tipogastoproduempresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipogastoproduempresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoGastoProduEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoGastoProduEmpresa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoGastoProduEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoGastoProduEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.gettipogastoproduempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipogastoproduempresaLogic.getConnexion());

				if(this.tipogastoproduempresa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipogastoproduempresa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoGastoProduEmpresa=(TitledBorder)this.jScrollPanelDatosTipoGastoProduEmpresa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoGastoProduEmpresa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoGastoProduEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.gettipogastoproduempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogastoproduempresa==null) {
						this.tipogastoproduempresa = new TipoGastoProduEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
				}

				if(this.tipogastoproduempresa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipogastoproduempresa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGastoProduEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.gettipogastoproduempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogastoproduempresa==null) {
						this.tipogastoproduempresa = new TipoGastoProduEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
				}

				if(this.tipogastoproduempresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipogastoproduempresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoGastoProduEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.gettipogastoproduempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogastoproduempresa==null) {
						this.tipogastoproduempresa = new TipoGastoProduEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);
				}

				if(this.tipogastoproduempresa.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipogastoproduempresa.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoGastoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false,false);

			this.getTipoGastoProduEmpresasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoGastoProduEmpresa(false);

			//if(TipoGastoProduEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGastoProduEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoproduempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoGastoProduEmpresa() {
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.dispose();
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa!=null) {
			this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.dispose();
			this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionTipoGastoProduEmpresa!=null) {
			this.jInternalFrameImportacionTipoGastoProduEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGastoProduEmpresa.dispose();
			this.jInternalFrameImportacionTipoGastoProduEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGastoProduEmpresa();
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGastoProduEmpresa")) {
				jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGastoProduEmpresa")) {
				jButtonDuplicarTipoGastoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGastoProduEmpresa")) {
				jButtonCopiarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGastoProduEmpresa")) {
				jButtonVerFormTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGastoProduEmpresa")) {
				jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGastoProduEmpresa")) {
				jButtonDuplicarTipoGastoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGastoProduEmpresa")) {
				jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGastoProduEmpresa")) {
				jButtonDuplicarTipoGastoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGastoProduEmpresa")) {
				jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGastoProduEmpresa")) {
				jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGastoProduEmpresa")) {
				jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGastoProduEmpresa")) {
				jButtonModificarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGastoProduEmpresa")) {
				jButtonModificarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGastoProduEmpresa")) {
				jButtonModificarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGastoProduEmpresa")) {
				jButtonActualizarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGastoProduEmpresa")) {
				jButtonActualizarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGastoProduEmpresa")) {
				jButtonActualizarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGastoProduEmpresa")) {
				jButtonEliminarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGastoProduEmpresa")) {
				jButtonEliminarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGastoProduEmpresa")) {
				jButtonEliminarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGastoProduEmpresa")) {
				jButtonCancelarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGastoProduEmpresa")) {
				jButtonCancelarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGastoProduEmpresa")) {
				jButtonCancelarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGastoProduEmpresa")) {
				jButtonCerrarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGastoProduEmpresa")) {
				jButtonCerrarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGastoProduEmpresa")) {
				jButtonCerrarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGastoProduEmpresa")) {
				jButtonMostrarOcultarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGastoProduEmpresa")) {
				jButtonCancelarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGastoProduEmpresa")) {
				jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGastoProduEmpresa")) {
				jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGastoProduEmpresa")) {
				jButtonCopiarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGastoProduEmpresa")) {
				jButtonVerFormTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGastoProduEmpresa")) {
				jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGastoProduEmpresa")) {
				jButtonCopiarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGastoProduEmpresa")) {
				jButtonVerFormTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGastoProduEmpresa")) {
				jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGastoProduEmpresa")) {
				jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGastoProduEmpresa")) {
				jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGastoProduEmpresa")) {
				jButtonRecargarInformacionTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGastoProduEmpresa")) {
				jButtonRecargarInformacionTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGastoProduEmpresa")) {
				jButtonRecargarInformacionTipoGastoProduEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGastoProduEmpresa")) {
				jButtonAnterioresTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGastoProduEmpresa")) {
				jButtonAnterioresTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGastoProduEmpresa")) {
				jButtonAnterioresTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGastoProduEmpresa")) {
				jButtonSiguientesTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGastoProduEmpresa")) {
				jButtonSiguientesTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGastoProduEmpresa")) {
				jButtonSiguientesTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGastoProduEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGastoProduEmpresa")) {
				jButtonAbrirOrderByTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGastoProduEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGastoProduEmpresa")) {
				jButtonMostrarOcultarTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGastoProduEmpresa")) {
				jButtonNuevoGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGastoProduEmpresa")) {
				jButtonNuevoGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGastoProduEmpresa")) {
				jButtonNuevoGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGastoProduEmpresa")) {
				jButtonCerrarReporteDinamicoTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGastoProduEmpresa")) {
				jButtonGenerarReporteDinamicoTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGastoProduEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGastoProduEmpresa")) {
				jButtonCerrarImportacionTipoGastoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGastoProduEmpresa")) {
				
				jButtonGenerarImportacionTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGastoProduEmpresa")) {
				
				jButtonAbrirImportacionTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGastoProduEmpresa")) {
				jComboBoxTiposAccionesTipoGastoProduEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGastoProduEmpresa")) {
				jComboBoxTiposRelacionesTipoGastoProduEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGastoProduEmpresa")) {
				jComboBoxTiposAccionesTipoGastoProduEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGastoProduEmpresa")) {
				
				jComboBoxTiposSeleccionarTipoGastoProduEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGastoProduEmpresa")) {
				jTextFieldValorCampoGeneralTipoGastoProduEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGastoProduEmpresa")) {
				jButtonAbrirOrderByTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGastoProduEmpresa")) {
				jButtonAbrirOrderByTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGastoProduEmpresa")) {
				jButtonCerrarOrderByTipoGastoProduEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGastoProduEmpresaBusqueda")) {
				this.jButtonidTipoGastoProduEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoGastoProduEmpresaUpdate")) {
				this.jButtonid_empresaTipoGastoProduEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoGastoProduEmpresaBusqueda")) {
				this.jButtonid_empresaTipoGastoProduEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGastoProduEmpresaBusqueda")) {
				this.jButtonnombreTipoGastoProduEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoGastoProduEmpresaBusqueda")) {
				this.jButtondescripcionTipoGastoProduEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGastoProduEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				


				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGastoProduEmpresa tipogastoproduempresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogastoproduempresaLocal=this.tipogastoproduempresa;
			} else {
				tipogastoproduempresaLocal=this.tipogastoproduempresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
							
				
				


				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
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
			
			


			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
								
						
				


				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
								
				
				


				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
							
				
				


				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
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
			
			


			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
								
				
				


				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGastoProduEmpresa")) {
					jCheckBoxSeleccionarTodosTipoGastoProduEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGastoProduEmpresa")) {
					jCheckBoxSeleccionadosTipoGastoProduEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGastoProduEmpresa")) {
					
				}
				
				


				
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
												
				
				


				
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
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
			
			


			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogastoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogastoproduempresa);
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
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
				
				


				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGastoProduEmpresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGastoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoProduEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoproduempresaAnterior =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGastoProduEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGastoProduEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGastoProduEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipogastoproduempresa =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipogastoproduempresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGastoProduEmpresa")) {
				
				}
				
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGastoProduEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGastoProduEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGastoProduEmpresa")) {
			
			}
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGastoProduEmpresa();
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGastoProduEmpresa")) {
				jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGastoProduEmpresa")) {
				jButtonDuplicarTipoGastoProduEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGastoProduEmpresa")) {
				jButtonCopiarTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGastoProduEmpresa")) {
				jButtonVerFormTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGastoProduEmpresa")) {
				jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGastoProduEmpresa")) {
				jButtonModificarTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGastoProduEmpresa")) {
				jButtonActualizarTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGastoProduEmpresa")) {
				jButtonEliminarTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGastoProduEmpresa")) {
				jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGastoProduEmpresa")) {
				jButtonCancelarTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGastoProduEmpresa")) {
				jButtonCerrarTipoGastoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGastoProduEmpresa")) {
				jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGastoProduEmpresa")) {
				jButtonNuevoGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGastoProduEmpresa")) {
				jButtonAbrirOrderByTipoGastoProduEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGastoProduEmpresa")) {
				jButtonRecargarInformacionTipoGastoProduEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGastoProduEmpresa")) {
				jButtonAnterioresTipoGastoProduEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGastoProduEmpresa")) {
				jButtonSiguientesTipoGastoProduEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGastoProduEmpresaBusqueda")) {
				this.jButtonidTipoGastoProduEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoGastoProduEmpresaUpdate")) {
				this.jButtonid_empresaTipoGastoProduEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoGastoProduEmpresaBusqueda")) {
				this.jButtonid_empresaTipoGastoProduEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGastoProduEmpresaBusqueda")) {
				this.jButtonnombreTipoGastoProduEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoGastoProduEmpresaBusqueda")) {
				this.jButtondescripcionTipoGastoProduEmpresaBusquedaActionPerformed(evt);
			}
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGastoProduEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGastoProduEmpresa")) {
				closingInternalFrameTipoGastoProduEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarTipoGastoProduEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGastoProduEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGastoProduEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoGastoProduEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGastoProduEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGastoProduEmpresaActionPerformed(null);
			}
			
			TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogastoproduempresa,new Object(),this.tipogastoproduempresaParameterGeneral,this.tipogastoproduempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGastoProduEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGastoProduEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGastoProduEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipogastoproduempresa)) {
			if(!esControlTabla) {
				if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);			
				}
				
				if(this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogastoproduempresaReturnGeneral=tipogastoproduempresaLogic.procesarEventosTipoGastoProduEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas(),this.tipogastoproduempresa,this.tipogastoproduempresaParameterGeneral,this.isEsNuevoTipoGastoProduEmpresa,classes);//this.tipogastoproduempresaLogic.getTipoGastoProduEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGastoProduEmpresa(this.tipogastoproduempresaReturnGeneral,this.tipogastoproduempresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGastoProduEmpresa(classes,this.tipogastoproduempresaReturnGeneral,this.tipogastoproduempresaBean,false);
					}
						
					if(this.tipogastoproduempresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGastoProduEmpresa(this.tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGastoProduEmpresa(this.tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresa());	
					}
						
					if(this.tipogastoproduempresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGastoProduEmpresa(this.tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresa(),classes);//this.tipogastoproduempresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGastoProduEmpresa(this.tipogastoproduempresa,classes);//this.tipogastoproduempresaBean);									
				}
			
				if(TipoGastoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGastoProduEmpresa(this.tipogastoproduempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGastoProduEmpresa(this.tipogastoproduempresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipogastoproduempresaAnterior!=null) {
						this.tipogastoproduempresa=this.tipogastoproduempresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogastoproduempresaReturnGeneral=tipogastoproduempresaLogic.procesarEventosTipoGastoProduEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas(),this.tipogastoproduempresa,this.tipogastoproduempresaParameterGeneral,this.isEsNuevoTipoGastoProduEmpresa,classes);//this.tipogastoproduempresaLogic.getTipoGastoProduEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresa(),tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresa(),this.tipogastoproduempresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGastoProduEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGastoProduEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGastoProduEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGastoProduEmpresa() throws Exception {
		
		TipoGastoProduEmpresaModel tipogastoproduempresaModel=(TipoGastoProduEmpresaModel)this.jTableDatosTipoGastoProduEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogastoproduempresaModel.tipogastoproduempresas=this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipogastoproduempresaModel.tipogastoproduempresas=this.tipogastoproduempresas;
		}
		
		
		((TipoGastoProduEmpresaModel) this.jTableDatosTipoGastoProduEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGastoProduEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipogastoproduempresaAnterior(),this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipogastoproduempresaAnterior(),this.tipogastoproduempresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGastoProduEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
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
										
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogastoproduempresa,new Object(),generalEntityParameterGeneral,this.tipogastoproduempresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGastoProduEmpresaConstantesFunciones.getClassesRelationshipsOfTipoGastoProduEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGastoProduEmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGastoProduEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGastoProduEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogastoproduempresa,new Object(),generalEntityParameterGeneral,this.tipogastoproduempresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGastoProduEmpresa(TipoGastoProduEmpresaBean tipogastoproduempresaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGastoProduEmpresa(ArrayList<Classe> classes,TipoGastoProduEmpresaReturnGeneral tipogastoproduempresaReturnGeneral,TipoGastoProduEmpresaBean tipogastoproduempresaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipogastoproduempresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa = new TipoGastoProduEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipogastoproduempresaSessionBean.getConGuardarRelaciones(),this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGastoProduEmpresa);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.tipogastoproduempresaLogic=this.tipogastoproduempresaLogic;
		
		this.cargarCombosFrameForeignKeyTipoGastoProduEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGastoProduEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGastoProduEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGastoProduEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGastoProduEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGastoProduEmpresa"));
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonModificarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoGastoProduEmpresa"));

		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonModificarToolBarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGastoProduEmpresa"));
					
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemModificarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGastoProduEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonActualizarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoGastoProduEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonActualizarToolBarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGastoProduEmpresa"));
						
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemActualizarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGastoProduEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonEliminarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoGastoProduEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonEliminarToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGastoProduEmpresa"));
								
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemEliminarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGastoProduEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonCancelarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoGastoProduEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonCancelarToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGastoProduEmpresa"));
					
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemCancelarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGastoProduEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemDetalleCerrarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGastoProduEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGastoProduEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGastoProduEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGastoProduEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonidTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGastoProduEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonid_empresaTipoGastoProduEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoGastoProduEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonid_empresaTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoGastoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonnombreTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGastoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtondescripcionTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoGastoProduEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTabbedPaneRelacionesTipoGastoProduEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGastoProduEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGastoProduEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGastoProduEmpresa"));
		}
		
		this.jTableDatosTipoGastoProduEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGastoProduEmpresa"));
		
		this.jTableDatosTipoGastoProduEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGastoProduEmpresa"));
		
		this.jButtonNuevoTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"NuevoTipoGastoProduEmpresa"));
		
		this.jButtonDuplicarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarTipoGastoProduEmpresa"));
		
		this.jButtonCopiarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"CopiarTipoGastoProduEmpresa"));
		
		this.jButtonVerFormTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"VerFormTipoGastoProduEmpresa"));
		
		
		this.jButtonNuevoToolBarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGastoProduEmpresa"));
			
		this.jButtonDuplicarToolBarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGastoProduEmpresa"));
			
		this.jMenuItemNuevoTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGastoProduEmpresa"));
			
		this.jMenuItemDuplicarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGastoProduEmpresa"));		
		
		
		this.jButtonNuevoRelacionesTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGastoProduEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGastoProduEmpresa"));
			
		this.jMenuItemNuevoRelacionesTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGastoProduEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonModificarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoGastoProduEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonModificarToolBarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGastoProduEmpresa"));
			
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemModificarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGastoProduEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonActualizarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoGastoProduEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonActualizarToolBarTipoGastoProduEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGastoProduEmpresa"));
				
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemActualizarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGastoProduEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonEliminarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoGastoProduEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonEliminarToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGastoProduEmpresa"));
						
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemEliminarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGastoProduEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonCancelarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoGastoProduEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonCancelarToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGastoProduEmpresa"));
			
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemCancelarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGastoProduEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGastoProduEmpresa"));		
		
		
		this.jButtonCerrarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"CerrarTipoGastoProduEmpresa"));
		
		
		this.jButtonCerrarToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGastoProduEmpresa"));
			
		this.jMenuItemCerrarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGastoProduEmpresa"));
			
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jMenuItemDetalleCerrarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGastoProduEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGastoProduEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGastoProduEmpresa"));
		}
		
		this.jButtonCopiarToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGastoProduEmpresa"));
			
		this.jButtonVerFormToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGastoProduEmpresa"));
		
		this.jMenuItemGuardarCambiosTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGastoProduEmpresa"));
			
		this.jMenuItemCopiarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGastoProduEmpresa"));		
		
		this.jMenuItemVerFormTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGastoProduEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGastoProduEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGastoProduEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGastoProduEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGastoProduEmpresa"));
					
		this.jButtonRecargarInformacionToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGastoProduEmpresa"));
		
		this.jMenuItemRecargarInformacionTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGastoProduEmpresa"));		
		
		
		
		this.jButtonAnterioresTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresTipoGastoProduEmpresa"));
		
		
		this.jButtonAnterioresToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGastoProduEmpresa"));
		
		this.jMenuItemAnterioresTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGastoProduEmpresa"));		
		
		
		this.jButtonSiguientesTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesTipoGastoProduEmpresa"));
		
		
		this.jButtonSiguientesToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGastoProduEmpresa"));
			
		this.jMenuItemSiguientesTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGastoProduEmpresa"));
			
		this.jMenuItemAbrirOrderByTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGastoProduEmpresa"));
			
		this.jMenuItemMostrarOcultarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGastoProduEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGastoProduEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGastoProduEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGastoProduEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGastoProduEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGastoProduEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGastoProduEmpresa"));

		this.jCheckBoxSeleccionadosTipoGastoProduEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGastoProduEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGastoProduEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGastoProduEmpresa"));
			
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGastoProduEmpresa"));
					
		this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGastoProduEmpresa"));
			
		this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGastoProduEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonidTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGastoProduEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonid_empresaTipoGastoProduEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoGastoProduEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonid_empresaTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoGastoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonnombreTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGastoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtondescripcionTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoGastoProduEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGastoProduEmpresa"));
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGastoProduEmpresa"));
				this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGastoProduEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGastoProduEmpresa"));				
			//this.jButtonGenerarReporteDinamicoTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGastoProduEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGastoProduEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGastoProduEmpresa!=null) {
				this.jInternalFrameImportacionTipoGastoProduEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGastoProduEmpresa"));
				this.jInternalFrameImportacionTipoGastoProduEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGastoProduEmpresa"));
				this.jInternalFrameImportacionTipoGastoProduEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGastoProduEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGastoProduEmpresa"));
			
			this.jButtonAbrirOrderByToolBarTipoGastoProduEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGastoProduEmpresa"));			
			
			if(this.jInternalFrameOrderByTipoGastoProduEmpresa!=null) {
				this.jInternalFrameOrderByTipoGastoProduEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGastoProduEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTabbedPaneRelacionesTipoGastoProduEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGastoProduEmpresa"));
		
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
            		closingInternalFrameTipoGastoProduEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGastoProduEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            TipoGastoProduEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoGastoProduEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGastoProduEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGastoProduEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGastoProduEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGastoProduEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGastoProduEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGastoProduEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGastoProduEmpresa";
		inputMap = this.jButtonNuevoTipoGastoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGastoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGastoProduEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoGastoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGastoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGastoProduEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGastoProduEmpresa";
		inputMap = this.jButtonModificarTipoGastoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGastoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGastoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGastoProduEmpresa";
		inputMap = this.jButtonActualizarTipoGastoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGastoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGastoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGastoProduEmpresa";
		inputMap = this.jButtonEliminarTipoGastoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGastoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGastoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGastoProduEmpresa";
		inputMap = this.jButtonCancelarTipoGastoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGastoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGastoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGastoProduEmpresa";
		inputMap = this.jButtonCerrarTipoGastoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGastoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGastoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGastoProduEmpresa";
		inputMap = this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosTipoGastoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonGuardarCambiosTipoGastoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGastoProduEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGastoProduEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGastoProduEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGastoProduEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGastoProduEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonidTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGastoProduEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonid_empresaTipoGastoProduEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoGastoProduEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonid_empresaTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoGastoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtonnombreTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGastoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jButtondescripcionTipoGastoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoGastoProduEmpresaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGastoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGastoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGastoProduEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGastoProduEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
					tipogastoproduempresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresas) {
					tipogastoproduempresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGastoProduEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
						tipogastoproduempresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresas) {
						tipogastoproduempresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGastoProduEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGastoProduEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProduEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGastoProduEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGastoProduEmpresa.getSelectedRows();
			
			TipoGastoProduEmpresa tipogastoproduempresaLocal=new TipoGastoProduEmpresa();
			
			//this.seleccionarTodosTipoGastoProduEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoproduempresaLocal =(TipoGastoProduEmpresa) this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas().toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipogastoproduempresaLocal =(TipoGastoProduEmpresa) this.tipogastoproduempresas.toArray()[this.jTableDatosTipoGastoProduEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipogastoproduempresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
						tipogastoproduempresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresas) {
						tipogastoproduempresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGastoProduEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGastoProduEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoProduEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGastoProduEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGastoProduEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGastoProduEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
				
						if(sTipoSeleccionar.equals(TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogastoproduempresaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipogastoproduempresaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresas) {
					
						if(sTipoSeleccionar.equals(TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogastoproduempresaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipogastoproduempresaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGastoProduEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGastoProduEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGastoProduEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGastoProduEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGastoProduEmpresa(conSplash);
				
					this.generarReporteTipoGastoProduEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGastoProduEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGastoProduEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGastoProduEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGastoProduEmpresa();
				
				this.exportarTipoGastoProduEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGastoProduEmpresas();
				//this.importarTipoGastoProduEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGastoProduEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGastoProduEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Gasto Produccion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGastoProduEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGastoProduEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGastoProduEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Gasto Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoGastoProduEmpresaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoGastoProduEmpresa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoGastoProduEmpresa(conSplash);
					
						//this.actualizarParametrosGeneralTipoGastoProduEmpresa();
						
						this.generarReporteProcesoAccionTipoGastoProduEmpresasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Gasto Produccion EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Gasto Produccion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoGastoProduEmpresa();
				
						this.actualizarParametrosGeneralTipoGastoProduEmpresa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipogastoproduempresaReturnGeneral=tipogastoproduempresaLogic.procesarAccionTipoGastoProduEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas(),this.tipogastoproduempresaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoGastoProduEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGastoProduEmpresa();
					
					TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoGastoProduEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGastoProduEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGastoProduEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGastoProduEmpresa();
			
			if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();		
			TipoGastoProduEmpresa tipogastoproduempresa=new TipoGastoProduEmpresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGastoProduEmpresa.getSelectedItem();
			
			
			
			
			tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipogastoproduempresasSeleccionados.size()==1) {
				for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresasSeleccionados) {
					tipogastoproduempresa=tipogastoproduempresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGastoProduEmpresa();
			
      		//this.finishProcessTipoGastoProduEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGastoProduEmpresaReturnGeneral() throws Exception {
		if(this.tipogastoproduempresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipogastoproduempresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipogastoproduempresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipogastoproduempresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipogastoproduempresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipogastoproduempresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
		}
		
		if(this.tipogastoproduempresaReturnGeneral.getConRetornoLista() || this.tipogastoproduempresaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipogastoproduempresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogastoproduempresaLogic.setTipoGastoProduEmpresas(this.tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipogastoproduempresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogastoproduempresaLogic.setTipoGastoProduEmpresa(this.tipogastoproduempresaReturnGeneral.getTipoGastoProduEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGastoProduEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGastoProduEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<TipoGastoProduEmpresa> getTipoGastoProduEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGastoProduEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresaLogic.getTipoGastoProduEmpresas()) {
					if(tipogastoproduempresaAux.getIsSelected()) {
						tipogastoproduempresasSeleccionados.add(tipogastoproduempresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGastoProduEmpresa tipogastoproduempresaAux:this.tipogastoproduempresas) {
					if(tipogastoproduempresaAux.getIsSelected()) {
						tipogastoproduempresasSeleccionados.add(tipogastoproduempresaAux);				
					}
				}
			}
			
			if(tipogastoproduempresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipogastoproduempresasSeleccionados.addAll(this.tipogastoproduempresaLogic.getTipoGastoProduEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipogastoproduempresasSeleccionados.addAll(this.tipogastoproduempresas);				
					}
				}
			}
		} else {
			tipogastoproduempresasSeleccionados.add(this.tipogastoproduempresa);
		}
		
		return tipogastoproduempresasSeleccionados;
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
	
	public void generarReporteTipoGastoProduEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGastoProduEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGastoProduEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGastoProduEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGastoProduEmpresasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Gasto Produccion Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGastoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();		
		
		tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGastoProduEmpresas("Todos",tipogastoproduempresasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGastoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();		
		
		tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGastoProduEmpresas("Todos",tipogastoproduempresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGastoProduEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();
		
		tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGastoProduEmpresas("Todos",tipogastoproduempresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGastoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGastoProduEmpresa();
		
		
		tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGastoProduEmpresa();
		
		
		//this.generarReporteTipoGastoProduEmpresas("Todos",tipogastoproduempresasSeleccionados ,tipogastoproduempresaImplementable,tipogastoproduempresaImplementableHome);
	}
	
	public void mostrarImportacionTipoGastoProduEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGastoProduEmpresa();
		
		this.abrirFrameImportacionTipoGastoProduEmpresa();		
		
			
		//this.generarReporteTipoGastoProduEmpresas("Todos",tipogastoproduempresasSeleccionados ,tipogastoproduempresaImplementable,tipogastoproduempresaImplementableHome);
	}
	
	public void importarTipoGastoProduEmpresas() throws Exception {		
	
	}
	
	public void exportarTipoGastoProduEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGastoProduEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGastoProduEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGastoProduEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Gasto Produccion Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGastoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();		
		
		tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoproduempresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGastoProduEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGastoProduEmpresa(tipogastoproduempresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipogastoproduempresaAux.setsDetalleGeneralEntityReporte(tipogastoproduempresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGastoProduEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGastoProduEmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoProduEmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogastoproduempresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogastoproduempresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogastoproduempresa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogastoproduempresa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogastoproduempresa.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGastoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();		
		
		tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoproduempresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGastoProduEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGastoProduEmpresa(row);				
				iRow++;
			}				
			
			for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGastoProduEmpresa(tipogastoproduempresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGastoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();		
		
		tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogastoproduempresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipogastoproduempresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogastoproduempresa");
			//elementRoot.appendChild(element);
		
			for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresasSeleccionados) {
				element = document.createElement("tipogastoproduempresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGastoProduEmpresa(tipogastoproduempresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGastoProduEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipogastoproduempresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogastoproduempresa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogastoproduempresa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogastoproduempresa.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoGastoProduEmpresa(TipoGastoProduEmpresa tipogastoproduempresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGastoProduEmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipogastoproduempresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGastoProduEmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogastoproduempresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoGastoProduEmpresaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipogastoproduempresa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoGastoProduEmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogastoproduempresa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoGastoProduEmpresaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipogastoproduempresa.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoGastoProduEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados=new ArrayList<TipoGastoProduEmpresa>();
		
		tipogastoproduempresasSeleccionados=this.getTipoGastoProduEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGastoProduEmpresa(tipogastoproduempresasSeleccionados);
		
		this.generarReporteTipoGastoProduEmpresas("Todos",tipogastoproduempresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGastoProduEmpresa(ArrayList<TipoGastoProduEmpresa> tipogastoproduempresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGastoProduEmpresa tipogastoproduempresaAux:tipogastoproduempresasSeleccionados) {
				tipogastoproduempresaAux.setsDetalleGeneralEntityReporte(tipogastoproduempresaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipogastoproduempresaAux.setsDescripcionGeneralEntityReporte1(tipogastoproduempresaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipogastoproduempresaAux.setsDescripcionGeneralEntityReporte1(tipogastoproduempresaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipogastoproduempresaAux.setsDescripcionGeneralEntityReporte1(tipogastoproduempresaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGastoProduEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaModificarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaModificarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaModificarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaModificarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaModificarTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGastoProduEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGastoProduEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGastoProduEmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=true;
		} else {
			this.actualizarEstadoPanelsTipoGastoProduEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGastoProduEmpresa=false;
			//this.isVisibilidadCeldaVerFormTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoGastoProduEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGastoProduEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
			if(!tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=false;												
			}
			
			this.jButtonCerrarTipoGastoProduEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGastoProduEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogastoproduempresa)) {
			this.isVisibilidadCeldaActualizarTipoGastoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGastoProduEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGastoProduEmpresa() {
	}
	
	public void actualizarEstadoPanelsTipoGastoProduEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoGastoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGastoProduEmpresa!=null) {
				this.jPanelPaginacionTipoGastoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoGastoProduEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoGastoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGastoProduEmpresa!=null) {
				this.jPanelPaginacionTipoGastoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoGastoProduEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoGastoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGastoProduEmpresa!=null) {
				this.jPanelPaginacionTipoGastoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoGastoProduEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoGastoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGastoProduEmpresa!=null) {
				this.jPanelPaginacionTipoGastoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoGastoProduEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoGastoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGastoProduEmpresa!=null) {
				this.jPanelPaginacionTipoGastoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoGastoProduEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoGastoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGastoProduEmpresa!=null) {
				this.jPanelPaginacionTipoGastoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoGastoProduEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGastoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoGastoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGastoProduEmpresa!=null) {
				this.jPanelPaginacionTipoGastoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGastoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoGastoProduEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa!=null) {
					this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoGastoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoGastoProduEmpresa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoGastoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoGastoProduEmpresa.setVisible(true);
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
		
		//TipoGastoProduEmpresaSessionBean tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean();
		
		if(this.tipogastoproduempresaSessionBean==null) {
			this.tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean();
		}
		
		this.tipogastoproduempresaSessionBean.setsUltimaBusquedaTipoGastoProduEmpresa(this.getsAccionBusqueda());
		this.tipogastoproduempresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipogastoproduempresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipogastoproduempresaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGastoProduEmpresaSessionBean tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean();
		
		if(this.tipogastoproduempresaSessionBean==null) {
			this.tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean();
		}
		
		if(this.tipogastoproduempresaSessionBean.getsUltimaBusquedaTipoGastoProduEmpresa()!=null&&!this.tipogastoproduempresaSessionBean.getsUltimaBusquedaTipoGastoProduEmpresa().equals("")) {
			this.setsAccionBusqueda(tipogastoproduempresaSessionBean.getsUltimaBusquedaTipoGastoProduEmpresa());
			this.setiNumeroPaginacion(tipogastoproduempresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipogastoproduempresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipogastoproduempresaSessionBean.getid_empresa());
				tipogastoproduempresaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipogastoproduempresaSessionBean.setsUltimaBusquedaTipoGastoProduEmpresa("");
		this.tipogastoproduempresaSessionBean.setiNumeroPaginacion(TipoGastoProduEmpresaConstantesFunciones.INUMEROPAGINACION);
		this.tipogastoproduempresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGastoProduEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGastoProduEmpresa() {
		this.updateBorderResaltarBusquedasFormularioTipoGastoProduEmpresa();
		this.updateVisibilidadBusquedasFormularioTipoGastoProduEmpresa();
		this.updateHabilitarBusquedasFormularioTipoGastoProduEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGastoProduEmpresa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGastoProduEmpresa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoGastoProduEmpresa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoGastoProduEmpresa.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoGastoProduEmpresa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoGastoProduEmpresa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoGastoProduEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGastoProduEmpresa();
		this.updateVisibilidadResaltarControlesFormularioTipoGastoProduEmpresa();
		this.updateHabilitarResaltarControlesFormularioTipoGastoProduEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGastoProduEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipogastoproduempresaConstantesFunciones.resaltaridTipoGastoProduEmpresa!=null && this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.setBorder(this.tipogastoproduempresaConstantesFunciones.resaltaridTipoGastoProduEmpresa);}
		if(this.tipogastoproduempresaConstantesFunciones.resaltarid_empresaTipoGastoProduEmpresa!=null && this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.setBorder(this.tipogastoproduempresaConstantesFunciones.resaltarid_empresaTipoGastoProduEmpresa);}
		if(this.tipogastoproduempresaConstantesFunciones.resaltarnombreTipoGastoProduEmpresa!=null && this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreanombreTipoGastoProduEmpresa.setBorder(this.tipogastoproduempresaConstantesFunciones.resaltarnombreTipoGastoProduEmpresa);}
		if(this.tipogastoproduempresaConstantesFunciones.resaltardescripcionTipoGastoProduEmpresa!=null && this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreadescripcionTipoGastoProduEmpresa.setBorder(this.tipogastoproduempresaConstantesFunciones.resaltardescripcionTipoGastoProduEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGastoProduEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.setVisible(this.tipogastoproduempresaConstantesFunciones.mostraridTipoGastoProduEmpresa);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jPanelidTipoGastoProduEmpresa.setVisible(this.tipogastoproduempresaConstantesFunciones.mostraridTipoGastoProduEmpresa);
		//this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.setVisible(this.tipogastoproduempresaConstantesFunciones.mostrarid_empresaTipoGastoProduEmpresa);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jPanelid_empresaTipoGastoProduEmpresa.setVisible(this.tipogastoproduempresaConstantesFunciones.mostrarid_empresaTipoGastoProduEmpresa);
		//this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreanombreTipoGastoProduEmpresa.setVisible(this.tipogastoproduempresaConstantesFunciones.mostrarnombreTipoGastoProduEmpresa);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jPanelnombreTipoGastoProduEmpresa.setVisible(this.tipogastoproduempresaConstantesFunciones.mostrarnombreTipoGastoProduEmpresa);
		//this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreadescripcionTipoGastoProduEmpresa.setVisible(this.tipogastoproduempresaConstantesFunciones.mostrardescripcionTipoGastoProduEmpresa);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jPaneldescripcionTipoGastoProduEmpresa.setVisible(this.tipogastoproduempresaConstantesFunciones.mostrardescripcionTipoGastoProduEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGastoProduEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGastoProduEmpresa!=null) {
	
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jLabelidTipoGastoProduEmpresa.setEnabled(this.tipogastoproduempresaConstantesFunciones.activaridTipoGastoProduEmpresa);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jComboBoxid_empresaTipoGastoProduEmpresa.setEnabled(this.tipogastoproduempresaConstantesFunciones.activarid_empresaTipoGastoProduEmpresa);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreanombreTipoGastoProduEmpresa.setEnabled(this.tipogastoproduempresaConstantesFunciones.activarnombreTipoGastoProduEmpresa);
		this.jInternalFrameDetalleFormTipoGastoProduEmpresa.jTextAreadescripcionTipoGastoProduEmpresa.setEnabled(this.tipogastoproduempresaConstantesFunciones.activardescripcionTipoGastoProduEmpresa);
		}
	}
	
		
}