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

import com.bydan.erp.produccion.util.TipoManoProduEmpresaConstantesFunciones;
import com.bydan.erp.produccion.util.TipoManoProduEmpresaParameterReturnGeneral;
//import com.bydan.erp.produccion.util.TipoManoProduEmpresaParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.TipoManoProduEmpresaBean;
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
public class TipoManoProduEmpresaBeanSwingJInternalFrame extends TipoManoProduEmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoManoProduEmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoManoProduEmpresa> tipomanoproduempresaValidator = new ClassValidator<TipoManoProduEmpresa>(TipoManoProduEmpresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoManoProduEmpresa tipomanoproduempresa;	
	public TipoManoProduEmpresa tipomanoproduempresaAux;
	public TipoManoProduEmpresa tipomanoproduempresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoManoProduEmpresa tipomanoproduempresaTotales;
	public Long idTipoManoProduEmpresaActual;
	public Long iIdNuevoTipoManoProduEmpresa=0L;
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
	
	public Boolean isPermisoTodoTipoManoProduEmpresa;
	public Boolean isPermisoNuevoTipoManoProduEmpresa;
	public Boolean isPermisoActualizarTipoManoProduEmpresa;
	public Boolean isPermisoActualizarOriginalTipoManoProduEmpresa;
	public Boolean isPermisoEliminarTipoManoProduEmpresa;
	public Boolean isPermisoGuardarCambiosTipoManoProduEmpresa;
	public Boolean isPermisoConsultaTipoManoProduEmpresa;
	public Boolean isPermisoBusquedaTipoManoProduEmpresa;
	public Boolean isPermisoReporteTipoManoProduEmpresa;
	public Boolean isPermisoPaginacionMedioTipoManoProduEmpresa;
	public Boolean isPermisoPaginacionAltoTipoManoProduEmpresa;
	public Boolean isPermisoPaginacionTodoTipoManoProduEmpresa;
	public Boolean isPermisoCopiarTipoManoProduEmpresa;
	public Boolean isPermisoVerFormTipoManoProduEmpresa;
	public Boolean isPermisoDuplicarTipoManoProduEmpresa;
	public Boolean isPermisoOrdenTipoManoProduEmpresa;
	
	
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
	
	public TipoManoProduEmpresaParameterReturnGeneral tipomanoproduempresaReturnGeneral;
	public TipoManoProduEmpresaParameterReturnGeneral tipomanoproduempresaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoManoProduEmpresa=false;
	public Boolean esParaAccionDesdeFormularioTipoManoProduEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoManoProduEmpresaSessionBeanAdditional tipomanoproduempresaSessionBeanAdditional=null;
	
	public TipoManoProduEmpresaSessionBeanAdditional getTipoManoProduEmpresaSessionBeanAdditional() {
		return this.tipomanoproduempresaSessionBeanAdditional;
	}
	
	public void setTipoManoProduEmpresaSessionBeanAdditional(TipoManoProduEmpresaSessionBeanAdditional tipomanoproduempresaSessionBeanAdditional) {
		try {
			this.tipomanoproduempresaSessionBeanAdditional=tipomanoproduempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoManoProduEmpresaBeanSwingJInternalFrameAdditional tipomanoproduempresaBeanSwingJInternalFrameAdditional=null;
	//public class TipoManoProduEmpresaBeanSwingJInternalFrame
	
	public TipoManoProduEmpresaBeanSwingJInternalFrameAdditional getTipoManoProduEmpresaBeanSwingJInternalFrameAdditional() {
		return this.tipomanoproduempresaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoManoProduEmpresaBeanSwingJInternalFrameAdditional(TipoManoProduEmpresaBeanSwingJInternalFrameAdditional tipomanoproduempresaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipomanoproduempresaBeanSwingJInternalFrameAdditional=tipomanoproduempresaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoManoProduEmpresaLogic tipomanoproduempresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoManoProduEmpresa tipomanoproduempresaBean;
	public TipoManoProduEmpresaConstantesFunciones tipomanoproduempresaConstantesFunciones;
	//public TipoManoProduEmpresaParameterReturnGeneral tipomanoproduempresaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoManoProduEmpresa> tipomanoproduempresas;	
	//public List<TipoManoProduEmpresa> tipomanoproduempresasEliminados;
	//public List<TipoManoProduEmpresa> tipomanoproduempresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoManoProduEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarTipoManoProduEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarTipoManoProduEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormTipoManoProduEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenTipoManoProduEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=false;
	public Boolean isVisibilidadCeldaModificarTipoManoProduEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarTipoManoProduEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarTipoManoProduEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarTipoManoProduEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoManoProduEmpresa() {
		return this.iIdNuevoTipoManoProduEmpresa;
	}

	public void setiIdNuevoTipoManoProduEmpresa(Long iIdNuevoTipoManoProduEmpresa) {
		this.iIdNuevoTipoManoProduEmpresa = iIdNuevoTipoManoProduEmpresa;
	}
	
	public Long getidTipoManoProduEmpresaActual() {
		return this.idTipoManoProduEmpresaActual;
	}

	public void setidTipoManoProduEmpresaActual(Long idTipoManoProduEmpresaActual) {
		this.idTipoManoProduEmpresaActual = idTipoManoProduEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoManoProduEmpresa gettipomanoproduempresa() {
		return this.tipomanoproduempresa;
	}

	public void settipomanoproduempresa(TipoManoProduEmpresa tipomanoproduempresa) {
		this.tipomanoproduempresa = tipomanoproduempresa;
	}
	
	public TipoManoProduEmpresa gettipomanoproduempresaAux() {
		return this.tipomanoproduempresaAux;
	}

	public void settipomanoproduempresaAux(TipoManoProduEmpresa tipomanoproduempresaAux) {
		this.tipomanoproduempresaAux = tipomanoproduempresaAux;
	}				
	
	public TipoManoProduEmpresa gettipomanoproduempresaAnterior() {
		return this.tipomanoproduempresaAnterior;
	}

	public void settipomanoproduempresaAnterior(TipoManoProduEmpresa tipomanoproduempresaAnterior) {
		this.tipomanoproduempresaAnterior = tipomanoproduempresaAnterior;
	}	
	
	public TipoManoProduEmpresa gettipomanoproduempresaTotales() {
		return this.tipomanoproduempresaTotales;
	}

	public void settipomanoproduempresaTotales(TipoManoProduEmpresa tipomanoproduempresaTotales) {
		this.tipomanoproduempresaTotales = tipomanoproduempresaTotales;
	}	
	
	public TipoManoProduEmpresa gettipomanoproduempresaBean() {
		return this.tipomanoproduempresaBean;
	}

	public void settipomanoproduempresaBean(TipoManoProduEmpresa tipomanoproduempresaBean) {
		this.tipomanoproduempresaBean = tipomanoproduempresaBean;
	}	
	
	public TipoManoProduEmpresaParameterReturnGeneral gettipomanoproduempresaReturnGeneral() {
		return this.tipomanoproduempresaReturnGeneral;
	}

	public void settipomanoproduempresaReturnGeneral(TipoManoProduEmpresaParameterReturnGeneral tipomanoproduempresaReturnGeneral) {
		this.tipomanoproduempresaReturnGeneral = tipomanoproduempresaReturnGeneral;
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
	
	
	public TipoManoProduEmpresaLogic getTipoManoProduEmpresaLogic()	{		
		return tipomanoproduempresaLogic;
	}

	public void setTipoManoProduEmpresaLogic(TipoManoProduEmpresaLogic tipomanoproduempresaLogic) {
		this.tipomanoproduempresaLogic = tipomanoproduempresaLogic;
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
	
	public Boolean getIsEsNuevoTipoManoProduEmpresa() {
		return isEsNuevoTipoManoProduEmpresa;
	}

	public void setIsEsNuevoTipoManoProduEmpresa(Boolean isEsNuevoTipoManoProduEmpresa) {
		this.isEsNuevoTipoManoProduEmpresa = isEsNuevoTipoManoProduEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoManoProduEmpresa() {
		return esParaAccionDesdeFormularioTipoManoProduEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioTipoManoProduEmpresa(Boolean esParaAccionDesdeFormularioTipoManoProduEmpresa) {
		this.esParaAccionDesdeFormularioTipoManoProduEmpresa = esParaAccionDesdeFormularioTipoManoProduEmpresa;
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

			if(this.tipomanoproduempresaSessionBean==null) {
				this.tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean();
			}

			if(!this.tipomanoproduempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipomanoproduempresaSessionBean.getlidEmpresaActual());
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

					if(this.tipomanoproduempresa!=null) {
						this.tipomanoproduempresa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoManoProduEmpresa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoManoProduEmpresaGenerico)throws Exception
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
				jComboBoxid_empresaTipoManoProduEmpresaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoManoProduEmpresaGenerico!=null && jComboBoxid_empresaTipoManoProduEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoManoProduEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoManoProduEmpresa tipomanoproduempresa,JComboBox jComboBoxid_empresaTipoManoProduEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoManoProduEmpresaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoManoProduEmpresaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipomanoproduempresa.setid_empresa(empresaAux.getId());
				tipomanoproduempresa.setempresa_descripcion(TipoManoProduEmpresaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipomanoproduempresa.setEmpresa(empresaAux);			}
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

					if(!TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { 
					}

					if(!TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoManoProduEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoManoProduEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoManoProduEmpresa(this.tipomanoproduempresaLogic.getTipoManoProduEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoManoProduEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoManoProduEmpresa(this.tipomanoproduempresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipomanoproduempresaLogic.setTipoManoProduEmpresas(this.tipomanoproduempresas);
			tipomanoproduempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoManoProduEmpresaParameterReturnGeneral getTipoManoProduEmpresaParameterGeneral() {
		return this.tipomanoproduempresaParameterGeneral;
	}
	
	public void setTipoManoProduEmpresaParameterGeneral(TipoManoProduEmpresaParameterReturnGeneral tipomanoproduempresaParameterGeneral) {
		this.tipomanoproduempresaParameterGeneral = tipomanoproduempresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoManoProduEmpresa() {
		return isPermisoTodoTipoManoProduEmpresa;
	}

	public void setIsPermisoTodoTipoManoProduEmpresa(Boolean isPermisoTodoTipoManoProduEmpresa) {
		this.isPermisoTodoTipoManoProduEmpresa = isPermisoTodoTipoManoProduEmpresa;
	}

	public Boolean getIsPermisoNuevoTipoManoProduEmpresa() {
		return isPermisoNuevoTipoManoProduEmpresa;
	}

	public void setIsPermisoNuevoTipoManoProduEmpresa(Boolean isPermisoNuevoTipoManoProduEmpresa) {
		this.isPermisoNuevoTipoManoProduEmpresa = isPermisoNuevoTipoManoProduEmpresa;
	}

	public Boolean getIsPermisoActualizarTipoManoProduEmpresa() {
		return isPermisoActualizarTipoManoProduEmpresa;
	}

	public void setIsPermisoActualizarTipoManoProduEmpresa(Boolean isPermisoActualizarTipoManoProduEmpresa) {
		this.isPermisoActualizarTipoManoProduEmpresa = isPermisoActualizarTipoManoProduEmpresa;
	}

	public Boolean getIsPermisoEliminarTipoManoProduEmpresa() {
		return isPermisoEliminarTipoManoProduEmpresa;
	}

	public void setIsPermisoEliminarTipoManoProduEmpresa(Boolean isPermisoEliminarTipoManoProduEmpresa) {
		this.isPermisoEliminarTipoManoProduEmpresa = isPermisoEliminarTipoManoProduEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosTipoManoProduEmpresa() {
		return isPermisoGuardarCambiosTipoManoProduEmpresa;
	}

	public void setIsPermisoGuardarCambiosTipoManoProduEmpresa(Boolean isPermisoGuardarCambiosTipoManoProduEmpresa) {
		this.isPermisoGuardarCambiosTipoManoProduEmpresa = isPermisoGuardarCambiosTipoManoProduEmpresa;
	}
	
	public Boolean getIsPermisoConsultaTipoManoProduEmpresa() {
		return isPermisoConsultaTipoManoProduEmpresa;
	}

	public void setIsPermisoConsultaTipoManoProduEmpresa(Boolean isPermisoConsultaTipoManoProduEmpresa) {
		this.isPermisoConsultaTipoManoProduEmpresa = isPermisoConsultaTipoManoProduEmpresa;
	}

	public Boolean getIsPermisoBusquedaTipoManoProduEmpresa() {
		return isPermisoBusquedaTipoManoProduEmpresa;
	}

	public void setIsPermisoBusquedaTipoManoProduEmpresa(Boolean isPermisoBusquedaTipoManoProduEmpresa) {
		this.isPermisoBusquedaTipoManoProduEmpresa = isPermisoBusquedaTipoManoProduEmpresa;
	}

	public Boolean getIsPermisoReporteTipoManoProduEmpresa() {
		return isPermisoReporteTipoManoProduEmpresa;
	}

	public void setIsPermisoReporteTipoManoProduEmpresa(Boolean isPermisoReporteTipoManoProduEmpresa) {
		this.isPermisoReporteTipoManoProduEmpresa = isPermisoReporteTipoManoProduEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoManoProduEmpresa() {
		return isPermisoPaginacionMedioTipoManoProduEmpresa;
	}

	public void setIsPermisoPaginacionMedioTipoManoProduEmpresa(Boolean isPermisoPaginacionMedioTipoManoProduEmpresa) {
		this.isPermisoPaginacionMedioTipoManoProduEmpresa = isPermisoPaginacionMedioTipoManoProduEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoManoProduEmpresa() {
		return isPermisoPaginacionTodoTipoManoProduEmpresa;
	}

	public void setIsPermisoPaginacionTodoTipoManoProduEmpresa(Boolean isPermisoPaginacionTodoTipoManoProduEmpresa) {
		this.isPermisoPaginacionTodoTipoManoProduEmpresa = isPermisoPaginacionTodoTipoManoProduEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoManoProduEmpresa() {
		return isPermisoPaginacionAltoTipoManoProduEmpresa;
	}

	public void setIsPermisoPaginacionAltoTipoManoProduEmpresa(Boolean isPermisoPaginacionAltoTipoManoProduEmpresa) {
		this.isPermisoPaginacionAltoTipoManoProduEmpresa = isPermisoPaginacionAltoTipoManoProduEmpresa;
	}
	
	public Boolean getIsPermisoCopiarTipoManoProduEmpresa() {
		return isPermisoCopiarTipoManoProduEmpresa;
	}

	public void setIsPermisoCopiarTipoManoProduEmpresa(Boolean isPermisoCopiarTipoManoProduEmpresa) {
		this.isPermisoCopiarTipoManoProduEmpresa = isPermisoCopiarTipoManoProduEmpresa;
	}
	
	public Boolean getIsPermisoVerFormTipoManoProduEmpresa() {
		return isPermisoVerFormTipoManoProduEmpresa;
	}

	public void setIsPermisoVerFormTipoManoProduEmpresa(Boolean isPermisoVerFormTipoManoProduEmpresa) {
		this.isPermisoVerFormTipoManoProduEmpresa = isPermisoVerFormTipoManoProduEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarTipoManoProduEmpresa() {
		return isPermisoDuplicarTipoManoProduEmpresa;
	}

	public void setIsPermisoDuplicarTipoManoProduEmpresa(Boolean isPermisoDuplicarTipoManoProduEmpresa) {
		this.isPermisoDuplicarTipoManoProduEmpresa = isPermisoDuplicarTipoManoProduEmpresa;
	}
	
	public Boolean getIsPermisoOrdenTipoManoProduEmpresa() {
		return isPermisoOrdenTipoManoProduEmpresa;
	}

	public void setIsPermisoOrdenTipoManoProduEmpresa(Boolean isPermisoOrdenTipoManoProduEmpresa) {
		this.isPermisoOrdenTipoManoProduEmpresa = isPermisoOrdenTipoManoProduEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoManoProduEmpresa() {
		return isVisibilidadCeldaNuevoTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoTipoManoProduEmpresa(Boolean isVisibilidadCeldaNuevoTipoManoProduEmpresa) {
		this.isVisibilidadCeldaNuevoTipoManoProduEmpresa = isVisibilidadCeldaNuevoTipoManoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoManoProduEmpresa() {
		return isVisibilidadCeldaDuplicarTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarTipoManoProduEmpresa(Boolean isVisibilidadCeldaDuplicarTipoManoProduEmpresa) {
		this.isVisibilidadCeldaDuplicarTipoManoProduEmpresa = isVisibilidadCeldaDuplicarTipoManoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoManoProduEmpresa() {
		return isVisibilidadCeldaCopiarTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarTipoManoProduEmpresa(Boolean isVisibilidadCeldaCopiarTipoManoProduEmpresa) {
		this.isVisibilidadCeldaCopiarTipoManoProduEmpresa = isVisibilidadCeldaCopiarTipoManoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoManoProduEmpresa() {
		return isVisibilidadCeldaVerFormTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormTipoManoProduEmpresa(Boolean isVisibilidadCeldaVerFormTipoManoProduEmpresa) {
		this.isVisibilidadCeldaVerFormTipoManoProduEmpresa = isVisibilidadCeldaVerFormTipoManoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoManoProduEmpresa() {
		return isVisibilidadCeldaOrdenTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenTipoManoProduEmpresa(Boolean isVisibilidadCeldaOrdenTipoManoProduEmpresa) {
		this.isVisibilidadCeldaOrdenTipoManoProduEmpresa = isVisibilidadCeldaOrdenTipoManoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa = isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoManoProduEmpresa() {
		return isVisibilidadCeldaModificarTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaModificarTipoManoProduEmpresa(Boolean isVisibilidadCeldaModificarTipoManoProduEmpresa) {
		this.isVisibilidadCeldaModificarTipoManoProduEmpresa = isVisibilidadCeldaModificarTipoManoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoManoProduEmpresa() {
		return isVisibilidadCeldaActualizarTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarTipoManoProduEmpresa(Boolean isVisibilidadCeldaActualizarTipoManoProduEmpresa) {
		this.isVisibilidadCeldaActualizarTipoManoProduEmpresa = isVisibilidadCeldaActualizarTipoManoProduEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoManoProduEmpresa() {
		return isVisibilidadCeldaEliminarTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarTipoManoProduEmpresa(Boolean isVisibilidadCeldaEliminarTipoManoProduEmpresa) {
		this.isVisibilidadCeldaEliminarTipoManoProduEmpresa = isVisibilidadCeldaEliminarTipoManoProduEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoManoProduEmpresa() {
		return isVisibilidadCeldaCancelarTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarTipoManoProduEmpresa(Boolean isVisibilidadCeldaCancelarTipoManoProduEmpresa) {
		this.isVisibilidadCeldaCancelarTipoManoProduEmpresa = isVisibilidadCeldaCancelarTipoManoProduEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoManoProduEmpresa() {
		return isVisibilidadCeldaGuardarTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarTipoManoProduEmpresa(Boolean isVisibilidadCeldaGuardarTipoManoProduEmpresa) {
		this.isVisibilidadCeldaGuardarTipoManoProduEmpresa = isVisibilidadCeldaGuardarTipoManoProduEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa() {
		return isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa(Boolean isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa = isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa;
	}
		
	public TipoManoProduEmpresaSessionBean gettipomanoproduempresaSessionBean() {
		return this.tipomanoproduempresaSessionBean;
	}
	
	public void settipomanoproduempresaSessionBean(TipoManoProduEmpresaSessionBean tipomanoproduempresaSessionBean) {
		this.tipomanoproduempresaSessionBean=tipomanoproduempresaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipomanoproduempresa,null);
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
	
	public void bugActualizarReferenciaActual(TipoManoProduEmpresa tipomanoproduempresa,TipoManoProduEmpresa tipomanoproduempresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoManoProduEmpresa(tipomanoproduempresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipomanoproduempresaAux.setId(tipomanoproduempresa.getId());
		tipomanoproduempresaAux.setVersionRow(tipomanoproduempresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoManoProduEmpresa();
		
			int intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipomanoproduempresaValidator.getInvalidValues(this.tipomanoproduempresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipomanoproduempresaLogic.setDatosCliente(datosCliente);
			tipomanoproduempresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipomanoproduempresaAux=new  TipoManoProduEmpresa();
				
				tipomanoproduempresaAux.setIsNew(true);
				tipomanoproduempresaAux.setIsChanged(true);
				
				tipomanoproduempresaAux.setTipoManoProduEmpresaOriginal(this.tipomanoproduempresa);
				
				tipomanoproduempresaAux.setId(this.tipomanoproduempresa.getId());	
				tipomanoproduempresaAux.setVersionRow(this.tipomanoproduempresa.getVersionRow());	
				tipomanoproduempresaAux.setid_empresa(this.tipomanoproduempresa.getid_empresa());	
				tipomanoproduempresaAux.setnombre(this.tipomanoproduempresa.getnombre());	
				tipomanoproduempresaAux.setdescripcion(this.tipomanoproduempresa.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipomanoproduempresaAux,tipomanoproduempresaLogic.getTipoManoProduEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomanoproduempresaAux,tipomanoproduempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomanoproduempresaLogic.saveTipoManoProduEmpresas();//WithConnection
						//tipomanoproduempresaLogic.getSetVersionRowTipoManoProduEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomanoproduempresa,tipomanoproduempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoManoProduEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomanoproduempresaLogic.saveTipoManoProduEmpresaRelaciones(tipomanoproduempresaAux);//WithConnection
								//tipomanoproduempresaLogic.getSetVersionRowTipoManoProduEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomanoproduempresa,tipomanoproduempresaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomanoproduempresaAux,tipomanoproduempresaLogic.getTipoManoProduEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomanoproduempresaAux,tipomanoproduempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomanoproduempresa,tipomanoproduempresaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipomanoproduempresaAux=new  TipoManoProduEmpresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado() && this.tipomanoproduempresa.getId()>=0)) {
						
					tipomanoproduempresaAux.setIsNew(false);
				}
				
				tipomanoproduempresaAux.setIsDeleted(false);
			
				tipomanoproduempresaAux.setId(this.tipomanoproduempresa.getId());	
				tipomanoproduempresaAux.setVersionRow(this.tipomanoproduempresa.getVersionRow());	
				tipomanoproduempresaAux.setid_empresa(this.tipomanoproduempresa.getid_empresa());	
				tipomanoproduempresaAux.setnombre(this.tipomanoproduempresa.getnombre());	
				tipomanoproduempresaAux.setdescripcion(this.tipomanoproduempresa.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomanoproduempresaAux,tipomanoproduempresaLogic.getTipoManoProduEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomanoproduempresaAux,tipomanoproduempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomanoproduempresaLogic.saveTipoManoProduEmpresas();//WithConnection
						//tipomanoproduempresaLogic.getSetVersionRowTipoManoProduEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomanoproduempresa,tipomanoproduempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoManoProduEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomanoproduempresaLogic.saveTipoManoProduEmpresaRelaciones(tipomanoproduempresaAux);//WithConnection
								//tipomanoproduempresaLogic.getSetVersionRowTipoManoProduEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomanoproduempresa,tipomanoproduempresaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomanoproduempresaAux,tipomanoproduempresaLogic.getTipoManoProduEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomanoproduempresaAux,tipomanoproduempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomanoproduempresa,tipomanoproduempresaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipomanoproduempresaAux=new  TipoManoProduEmpresa();
				
				tipomanoproduempresaAux.setIsNew(false);
				tipomanoproduempresaAux.setIsChanged(false);
				
				tipomanoproduempresaAux.setIsDeleted(true);
				
				tipomanoproduempresaAux.setId(this.tipomanoproduempresa.getId());	
				tipomanoproduempresaAux.setVersionRow(this.tipomanoproduempresa.getVersionRow());	
				tipomanoproduempresaAux.setid_empresa(this.tipomanoproduempresa.getid_empresa());	
				tipomanoproduempresaAux.setnombre(this.tipomanoproduempresa.getnombre());	
				tipomanoproduempresaAux.setdescripcion(this.tipomanoproduempresa.getdescripcion());	
				
				if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipomanoproduempresaAux.getId()>=0) {	
						this.tipomanoproduempresasEliminados.add(tipomanoproduempresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipomanoproduempresaAux,tipomanoproduempresaLogic.getTipoManoProduEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomanoproduempresaAux,tipomanoproduempresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomanoproduempresaLogic.saveTipoManoProduEmpresas();//WithConnection
						//tipomanoproduempresaLogic.getSetVersionRowTipoManoProduEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomanoproduempresaLogic.saveTipoManoProduEmpresaRelaciones(tipomanoproduempresaAux);//WithConnection
								//tipomanoproduempresaLogic.getSetVersionRowTipoManoProduEmpresas();//WithConnection
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
							if(this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipomanoproduempresaAux,tipomanoproduempresaLogic.getTipoManoProduEmpresas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipomanoproduempresaAux,tipomanoproduempresas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().addAll(this.tipomanoproduempresasEliminados);
					
					tipomanoproduempresaLogic.saveTipoManoProduEmpresas();//WithConnection
					//tipomanoproduempresaLogic.getSetVersionRowTipoManoProduEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoManoProduEmpresa();
				
				this.tipomanoproduempresasEliminados= new ArrayList<TipoManoProduEmpresa>();		
			}
			
			if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Mano Obra Produccion Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipomanoproduempresa=tipomanoproduempresaAux;
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
      		//this.finishProcessTipoManoProduEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoManoProduEmpresa tipomanoproduempresaLocal) throws Exception {
		
		if(this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoManoProduEmpresa tipomanoproduempresaLocal) throws Exception {	
		if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipomanoproduempresaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoManoProduEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipomanoproduempresaValidator.getInvalidValues(this.tipomanoproduempresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoManoProduEmpresa tipomanoproduempresa,List<TipoManoProduEmpresa> tipomanoproduempresas) throws Exception {
		try	{		
			TipoManoProduEmpresaConstantesFunciones.actualizarLista(tipomanoproduempresa,tipomanoproduempresas,this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoManoProduEmpresa tipomanoproduempresa,List<TipoManoProduEmpresa> tipomanoproduempresas) throws Exception {
		try	{			
			TipoManoProduEmpresaConstantesFunciones.actualizarSelectedLista(tipomanoproduempresa,tipomanoproduempresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoManoProduEmpresa> tipomanoproduempresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipomanoproduempresasLocal=this.tipomanoproduempresaLogic.getTipoManoProduEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipomanoproduempresasLocal=this.tipomanoproduempresas;
			}
			//ARCHITECTURE
		
			for(TipoManoProduEmpresa tipomanoproduempresaLocal:tipomanoproduempresasLocal) {
				if(this.permiteMantenimiento(tipomanoproduempresaLocal) && tipomanoproduempresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoManoProduEmpresaConstantesFunciones.getTipoManoProduEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoManoProduEmpresaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelid_empresaTipoManoProduEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoManoProduEmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelnombreTipoManoProduEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoManoProduEmpresaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabeldescripcionTipoManoProduEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelid_empresaTipoManoProduEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelnombreTipoManoProduEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabeldescripcionTipoManoProduEmpresa,"");
		
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
		this.iIdNuevoTipoManoProduEmpresa--;	
		
		
		this.tipomanoproduempresaAux=new TipoManoProduEmpresa();
		
		this.tipomanoproduempresaAux.setId(this.iIdNuevoTipoManoProduEmpresa);
		this.tipomanoproduempresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().add(this.tipomanoproduempresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipomanoproduempresas.add(this.tipomanoproduempresaAux);
		}
		//ARCHITECTURE
		
		this.tipomanoproduempresa=this.tipomanoproduempresaAux;
		
		if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoManoProduEmpresa(this.tipomanoproduempresa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoManoProduEmpresa(this.tipomanoproduempresa);
		}
				
		//this.setDefaultControlesTipoManoProduEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoManoProduEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoManoProduEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoManoProduEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresaBean,this.tipomanoproduempresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
			classes=TipoManoProduEmpresaConstantesFunciones.getClassesRelationshipsOfTipoManoProduEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipomanoproduempresaReturnGeneral=tipomanoproduempresaLogic.procesarEventosTipoManoProduEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomanoproduempresaLogic.getTipoManoProduEmpresas(),this.tipomanoproduempresa,this.tipomanoproduempresaParameterGeneral,this.isEsNuevoTipoManoProduEmpresa,classes);//this.tipomanoproduempresaLogic.getTipoManoProduEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoManoProduEmpresa(this.tipomanoproduempresaReturnGeneral,this.tipomanoproduempresaBean,false);
		
		if(this.tipomanoproduempresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoManoProduEmpresa(this.tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoManoProduEmpresa(this.tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresa());
		}
		
		if(this.tipomanoproduempresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoManoProduEmpresa(this.tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresa(),classes);//this.tipomanoproduempresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoManoProduEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoManoProduEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.RecargarFormTipoManoProduEmpresa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoManoProduEmpresa(false);
						
			if(tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoManoProduEmpresa();
			}
			
			this.actualizarVisualTableDatosTipoManoProduEmpresa();
			
			this.jTableDatosTipoManoProduEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoManoProduEmpresa(), this.getIndiceNuevoTipoManoProduEmpresa());
			
			this.seleccionarFilaTablaTipoManoProduEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoManoProduEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreanombreTipoManoProduEmpresa.setEnabled(isHabilitar && this.tipomanoproduempresaConstantesFunciones.activarnombreTipoManoProduEmpresa);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreadescripcionTipoManoProduEmpresa.setEnabled(isHabilitar && this.tipomanoproduempresaConstantesFunciones.activardescripcionTipoManoProduEmpresa);	
		//
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.setEnabled(isHabilitar && this.tipomanoproduempresaConstantesFunciones.activarid_empresaTipoManoProduEmpresa);
	};
	
	public void setDefaultControlesTipoManoProduEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoManoProduEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipomanoproduempresaSessionBean.setConGuardarRelaciones(true);			
			this.tipomanoproduempresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTabbedPaneRelacionesTipoManoProduEmpresa.setVisible(true);
			
					
		} else {
			//this.tipomanoproduempresaSessionBean.setConGuardarRelaciones(false);			
			this.tipomanoproduempresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTabbedPaneRelacionesTipoManoProduEmpresa.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoManoProduEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
				if(tipomanoproduempresaAux.getId().equals(this.iIdNuevoTipoManoProduEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresas) {
				if(tipomanoproduempresaAux.getId().equals(this.iIdNuevoTipoManoProduEmpresa)) {
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
	
	public int getIndiceActualTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
				if(tipomanoproduempresaAux.getId().equals(tipomanoproduempresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresas) {
				if(tipomanoproduempresaAux.getId().equals(tipomanoproduempresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
				if(tipomanoproduempresaAux.getTipoManoProduEmpresaOriginal().getId().equals(tipomanoproduempresaOriginal.getId())) {
					existe=true;
					tipomanoproduempresaOriginal.setId(tipomanoproduempresaAux.getId());
					tipomanoproduempresaOriginal.setVersionRow(tipomanoproduempresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresas) {
				if(tipomanoproduempresaAux.getTipoManoProduEmpresaOriginal().getId().equals(tipomanoproduempresaOriginal.getId())) {
					existe=true;
					tipomanoproduempresaOriginal.setId(tipomanoproduempresaAux.getId());
					tipomanoproduempresaOriginal.setVersionRow(tipomanoproduempresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoManoProduEmpresa(Boolean esParaCancelar) throws Exception {
		tipomanoproduempresasAux=new ArrayList<TipoManoProduEmpresa>();
		tipomanoproduempresaAux=new TipoManoProduEmpresa();
		
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
					if(tipomanoproduempresaAux.getId()<0) {
						tipomanoproduempresasAux.add(tipomanoproduempresaAux);
					}		
				}
				this.iIdNuevoTipoManoProduEmpresa=0L;
				this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().removeAll(tipomanoproduempresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresas) {
					if(tipomanoproduempresaAux.getId()<0) {
						tipomanoproduempresasAux.add(tipomanoproduempresaAux);
					}		
				}
				this.iIdNuevoTipoManoProduEmpresa=0L;
				this.tipomanoproduempresas.removeAll(tipomanoproduempresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoManoProduEmpresa 
					&& this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().size()>0
					) {
					tipomanoproduempresaAux=this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().get(this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().size() - 1);
				
					if(tipomanoproduempresaAux.getId()<0) {
						this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().remove(tipomanoproduempresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoManoProduEmpresa && this.tipomanoproduempresas.size()>0) {
					tipomanoproduempresaAux=this.tipomanoproduempresas.get(this.tipomanoproduempresas.size() - 1);
				
					if(tipomanoproduempresaAux.getId()<0) {
						this.tipomanoproduempresas.remove(tipomanoproduempresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoManoProduEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipomanoproduempresa.getId()<0) {
				this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().remove(this.tipomanoproduempresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipomanoproduempresa.getId()<0) {
				this.tipomanoproduempresas.remove(this.tipomanoproduempresa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoManoProduEmpresa(List<TipoManoProduEmpresa> tipomanoproduempresasAux) throws Exception {
		TipoManoProduEmpresaConstantesFunciones.setEstadosInicialesTipoManoProduEmpresa(tipomanoproduempresasAux);
	}
	
	public void setEstadosInicialesTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresaAux) throws Exception {
		TipoManoProduEmpresaConstantesFunciones.setEstadosInicialesTipoManoProduEmpresa(tipomanoproduempresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoManoProduEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoManoProduEmpresaActual()) {
				if(!this.isEsNuevoTipoManoProduEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoManoProduEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoManoProduEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Mano Obra Produccion Empresa ?", "MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoManoProduEmpresa tipomanoproduempresa) throws Exception {
		TipoManoProduEmpresaConstantesFunciones.seleccionarAsignar(this.tipomanoproduempresa,tipomanoproduempresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoManoProduEmpresa=this.isPermisoActualizarOriginalTipoManoProduEmpresa;
			
			
			this.seleccionarAsignar(tipomanoproduempresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoManoProduEmpresaConstantesFunciones.quitarEspaciosTipoManoProduEmpresa(this.tipomanoproduempresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipomanoproduempresaSessionBean.setsFuncionBusquedaRapida(this.tipomanoproduempresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoManoProduEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoManoProduEmpresa(esParaCancelar);				
				this.cancelarNuevoTipoManoProduEmpresa(esParaCancelar);								
			}
			
			this.tipomanoproduempresa=new TipoManoProduEmpresa();
			
			this.inicializarTipoManoProduEmpresa();
			
			this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoManoProduEmpresa() throws Exception {
		try {
			TipoManoProduEmpresaConstantesFunciones.inicializarTipoManoProduEmpresa(this.tipomanoproduempresa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoManoProduEmpresas(String sAccionBusqueda,List<TipoManoProduEmpresa> tipomanoproduempresasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoManoProduEmpresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoManoProduEmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoManoProduEmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoManoProduEmpresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Mano Obra Produccion Empresas");		
		parameters.put("busquedapor", TipoManoProduEmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoManoProduEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoManoProduEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoManoProduEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoManoProduEmpresa=new JRBeanArrayDataSource(TipoManoProduEmpresaJInternalFrame.TraerTipoManoProduEmpresaBeans(tipomanoproduempresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoManoProduEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoManoProduEmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoManoProduEmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoManoProduEmpresaBean.TraerTipoManoProduEmpresaBeans(tipomanoproduempresasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoManoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomanoproduempresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoManoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomanoproduempresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresaActionPerformed(null);
					//this.generarExcelReporteTipoManoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomanoproduempresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoManoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomanoproduempresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoManoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomanoproduempresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoManoProduEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomanoproduempresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoManoProduEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoManoProduEmpresa> tipomanoproduempresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomanoproduempresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoManoProduEmpresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoManoProduEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoManoProduEmpresa tipomanoproduempresa : tipomanoproduempresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoManoProduEmpresaConstantesFunciones.generarExcelReporteDataTipoManoProduEmpresa("NORMAL",row,workbook,tipomanoproduempresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoManoProduEmpresa(String sTipo,Row row,Workbook workbook) {
		
		TipoManoProduEmpresaConstantesFunciones.generarExcelReporteHeaderTipoManoProduEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoManoProduEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoManoProduEmpresa> tipomanoproduempresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomanoproduempresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoManoProduEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoManoProduEmpresa tipomanoproduempresa : tipomanoproduempresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.getTipoManoProduEmpresaDescripcion(tipomanoproduempresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomanoproduempresa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomanoproduempresa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomanoproduempresa.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoManoProduEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoManoProduEmpresa> tipomanoproduempresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoManoProduEmpresa> tipomanoproduempresasRespaldo=null;
		
		classes=TipoManoProduEmpresaConstantesFunciones.getClassesRelationshipsOfTipoManoProduEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipomanoproduempresaLogic.setDatosCliente(this.datosCliente);
		this.tipomanoproduempresaLogic.setDatosDeep(this.datosDeep);
		this.tipomanoproduempresaLogic.setIsConDeep(true);
		
		tipomanoproduempresasRespaldo=this.tipomanoproduempresaLogic.getTipoManoProduEmpresas();
		
		this.tipomanoproduempresaLogic.setTipoManoProduEmpresas(tipomanoproduempresasParaReportes);	
		this.tipomanoproduempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipomanoproduempresasParaReportes=this.tipomanoproduempresaLogic.getTipoManoProduEmpresas();
		this.tipomanoproduempresaLogic.setTipoManoProduEmpresas(tipomanoproduempresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomanoproduempresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoManoProduEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoManoProduEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoManoProduEmpresa tipomanoproduempresa : tipomanoproduempresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoManoProduEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoManoProduEmpresaConstantesFunciones.generarExcelReporteDataTipoManoProduEmpresa("NORMAL",row,workbook,tipomanoproduempresa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.getTipoManoProduEmpresaDescripcion(tipomanoproduempresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoManoProduEmpresa() throws Exception {		
		this.startProcessTipoManoProduEmpresa(true);
	}
	
	public void startProcessTipoManoProduEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoManoProduEmpresa ,this.jPanelParametrosReportesTipoManoProduEmpresa, this.jScrollPanelDatosTipoManoProduEmpresa,this.jPanelPaginacionTipoManoProduEmpresa, this.jScrollPanelDatosEdicionTipoManoProduEmpresa, this.jPanelAccionesTipoManoProduEmpresa,this.jPanelAccionesFormularioTipoManoProduEmpresa,this.jmenuBarTipoManoProduEmpresa,this.jmenuBarDetalleTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,this.jTtoolBarDetalleTipoManoProduEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoManoProduEmpresa=this.jTabbedPaneBusquedasTipoManoProduEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoManoProduEmpresa=this.jPanelParametrosReportesTipoManoProduEmpresa;
		//final JScrollPane jScrollPanelDatosTipoManoProduEmpresa=this.jScrollPanelDatosTipoManoProduEmpresa;
		final JTable jTableDatosTipoManoProduEmpresa=this.jTableDatosTipoManoProduEmpresa;		
		final JPanel jPanelPaginacionTipoManoProduEmpresa=this.jPanelPaginacionTipoManoProduEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoManoProduEmpresa=this.jScrollPanelDatosEdicionTipoManoProduEmpresa;
		final JPanel jPanelAccionesTipoManoProduEmpresa=this.jPanelAccionesTipoManoProduEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoManoProduEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoManoProduEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			jPanelCamposAuxiliarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jPanelCamposTipoManoProduEmpresa;
			jPanelAccionesFormularioAuxiliarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jPanelAccionesFormularioTipoManoProduEmpresa;
		}
		
		final JPanel jPanelCamposTipoManoProduEmpresa=jPanelCamposAuxiliarTipoManoProduEmpresa;
		final JPanel jPanelAccionesFormularioTipoManoProduEmpresa=jPanelAccionesFormularioAuxiliarTipoManoProduEmpresa;
		
		
		final JMenuBar jmenuBarTipoManoProduEmpresa=this.jmenuBarTipoManoProduEmpresa;
		final JToolBar jTtoolBarTipoManoProduEmpresa=this.jTtoolBarTipoManoProduEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoManoProduEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoManoProduEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jmenuBarDetalleTipoManoProduEmpresa;
			jTtoolBarDetalleAuxiliarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTtoolBarDetalleTipoManoProduEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleTipoManoProduEmpresa=jmenuBarDetalleAuxiliarTipoManoProduEmpresa;
		final JToolBar jTtoolBarDetalleTipoManoProduEmpresa=jTtoolBarDetalleAuxiliarTipoManoProduEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoManoProduEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoManoProduEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoManoProduEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoManoProduEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoManoProduEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoManoProduEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoManoProduEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoManoProduEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoManoProduEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoManoProduEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoManoProduEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoManoProduEmpresa ,jPanelParametrosReportesTipoManoProduEmpresa,jTableDatosTipoManoProduEmpresa, /*jScrollPanelDatosTipoManoProduEmpresa,*/jPanelCamposTipoManoProduEmpresa,jPanelPaginacionTipoManoProduEmpresa, /*jScrollPanelDatosEdicionTipoManoProduEmpresa,*/ jPanelAccionesTipoManoProduEmpresa,jPanelAccionesFormularioTipoManoProduEmpresa,jmenuBarTipoManoProduEmpresa,jmenuBarDetalleTipoManoProduEmpresa,jTtoolBarTipoManoProduEmpresa,jTtoolBarDetalleTipoManoProduEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoManoProduEmpresa ,jPanelParametrosReportesTipoManoProduEmpresa, jScrollPanelDatosTipoManoProduEmpresa,jPanelPaginacionTipoManoProduEmpresa, jScrollPanelDatosEdicionTipoManoProduEmpresa, jPanelAccionesTipoManoProduEmpresa,jPanelAccionesFormularioTipoManoProduEmpresa,jmenuBarTipoManoProduEmpresa,jmenuBarDetalleTipoManoProduEmpresa,jTtoolBarTipoManoProduEmpresa,jTtoolBarDetalleTipoManoProduEmpresa);
						
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
	
	public void finishProcessTipoManoProduEmpresa() {// throws Exception 
		this.finishProcessTipoManoProduEmpresa(true);
	}
	
	public void finishProcessTipoManoProduEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoManoProduEmpresa ,this.jPanelParametrosReportesTipoManoProduEmpresa, this.jScrollPanelDatosTipoManoProduEmpresa,this.jPanelPaginacionTipoManoProduEmpresa, this.jScrollPanelDatosEdicionTipoManoProduEmpresa, this.jPanelAccionesTipoManoProduEmpresa,this.jPanelAccionesFormularioTipoManoProduEmpresa,this.jmenuBarTipoManoProduEmpresa,this.jmenuBarDetalleTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,this.jTtoolBarDetalleTipoManoProduEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoManoProduEmpresa=this.jTabbedPaneBusquedasTipoManoProduEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoManoProduEmpresa=this.jPanelParametrosReportesTipoManoProduEmpresa;
		//final JScrollPane jScrollPanelDatosTipoManoProduEmpresa=this.jScrollPanelDatosTipoManoProduEmpresa;
		final JTable jTableDatosTipoManoProduEmpresa=this.jTableDatosTipoManoProduEmpresa;		
		final JPanel jPanelPaginacionTipoManoProduEmpresa=this.jPanelPaginacionTipoManoProduEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoManoProduEmpresa=this.jScrollPanelDatosEdicionTipoManoProduEmpresa;
		final JPanel jPanelAccionesTipoManoProduEmpresa=this.jPanelAccionesTipoManoProduEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoManoProduEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoManoProduEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			jPanelCamposAuxiliarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jPanelCamposTipoManoProduEmpresa;
			jPanelAccionesFormularioAuxiliarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jPanelAccionesFormularioTipoManoProduEmpresa;
		}
		
		final JPanel jPanelCamposTipoManoProduEmpresa=jPanelCamposAuxiliarTipoManoProduEmpresa;
		final JPanel jPanelAccionesFormularioTipoManoProduEmpresa=jPanelAccionesFormularioAuxiliarTipoManoProduEmpresa;
		
		
		final JMenuBar jmenuBarTipoManoProduEmpresa=this.jmenuBarTipoManoProduEmpresa;		
		final JToolBar jTtoolBarTipoManoProduEmpresa=this.jTtoolBarTipoManoProduEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoManoProduEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoManoProduEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jmenuBarDetalleTipoManoProduEmpresa;
			jTtoolBarDetalleAuxiliarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTtoolBarDetalleTipoManoProduEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleTipoManoProduEmpresa=jmenuBarDetalleAuxiliarTipoManoProduEmpresa;
		final JToolBar jTtoolBarDetalleTipoManoProduEmpresa=jTtoolBarDetalleAuxiliarTipoManoProduEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoManoProduEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoManoProduEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoManoProduEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoManoProduEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoManoProduEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoManoProduEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoManoProduEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoManoProduEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoManoProduEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoManoProduEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoManoProduEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoManoProduEmpresa ,jPanelParametrosReportesTipoManoProduEmpresa, jTableDatosTipoManoProduEmpresa,/*jScrollPanelDatosTipoManoProduEmpresa,*/jPanelCamposTipoManoProduEmpresa,jPanelPaginacionTipoManoProduEmpresa, /*jScrollPanelDatosEdicionTipoManoProduEmpresa,*/ jPanelAccionesTipoManoProduEmpresa,jPanelAccionesFormularioTipoManoProduEmpresa,jmenuBarTipoManoProduEmpresa,jmenuBarDetalleTipoManoProduEmpresa,jTtoolBarTipoManoProduEmpresa,jTtoolBarDetalleTipoManoProduEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoManoProduEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoManoProduEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoManoProduEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoManoProduEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoManoProduEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoManoProduEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoManoProduEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoManoProduEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoManoProduEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipomanoproduempresaConstantesFunciones.getsFinalQueryTipoManoProduEmpresa();
		String  finalQueryPaginacionTodos=this.tipomanoproduempresaConstantesFunciones.getsFinalQueryTipoManoProduEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoManoProduEmpresaConstantesFunciones.getArrayColumnasGlobalesNoTipoManoProduEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoManoProduEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoManoProduEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoManoProduEmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipomanoproduempresasEliminados= new ArrayList<TipoManoProduEmpresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoManoProduEmpresa();
		
				///*TipoManoProduEmpresaSessionBean*/this.tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean();
			
			if(this.tipomanoproduempresaSessionBean==null) {
				this.tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean();
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
					this.iNumeroPaginacion=TipoManoProduEmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoManoProduEmpresaConstantesFunciones.getClassesForeignKeysOfTipoManoProduEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipomanoproduempresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipomanoproduempresasAux= new ArrayList<TipoManoProduEmpresa>();
			
				
			tipomanoproduempresaLogic.setDatosCliente(this.datosCliente);
			tipomanoproduempresaLogic.setDatosDeep(this.datosDeep);
			tipomanoproduempresaLogic.setIsConDeep(true);
			
			
			tipomanoproduempresaLogic.getTipoManoProduEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipomanoproduempresaLogic.getTodosTipoManoProduEmpresas(finalQueryGlobal,pagination);
					
					//tipomanoproduempresaLogic.getTodosTipoManoProduEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipomanoproduempresaLogic.getTipoManoProduEmpresas()==null|| tipomanoproduempresaLogic.getTipoManoProduEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomanoproduempresasAux= new ArrayList<TipoManoProduEmpresa>();
							tipomanoproduempresasAux.addAll(tipomanoproduempresaLogic.getTipoManoProduEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomanoproduempresasAux= new ArrayList<TipoManoProduEmpresa>();
							tipomanoproduempresasAux.addAll(tipomanoproduempresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomanoproduempresaLogic.getTodosTipoManoProduEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//tipomanoproduempresaLogic.getTodosTipoManoProduEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoManoProduEmpresas("Todos",tipomanoproduempresaLogic.getTipoManoProduEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomanoproduempresaLogic.setTipoManoProduEmpresas(new ArrayList<TipoManoProduEmpresa>());					
							tipomanoproduempresaLogic.getTipoManoProduEmpresas().addAll(tipomanoproduempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomanoproduempresas=new ArrayList<TipoManoProduEmpresa>();
							tipomanoproduempresas.addAll(tipomanoproduempresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoManoProduEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoManoProduEmpresa=this.idActual;
				
				} else if(this.idTipoManoProduEmpresaActual!=null && this.idTipoManoProduEmpresaActual!=0L) {
					idTipoManoProduEmpresa=idTipoManoProduEmpresaActual;
				}
				
					
				this.sDetalleReporte=TipoManoProduEmpresaConstantesFunciones.getDetalleIndicePorId(idTipoManoProduEmpresa);
				
				this.tipomanoproduempresas=new ArrayList<TipoManoProduEmpresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipomanoproduempresaLogic.getEntity(idTipoManoProduEmpresa);
					
					//tipomanoproduempresaLogic.getEntityWithConnection(idTipoManoProduEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomanoproduempresaLogic.setTipoManoProduEmpresas(new ArrayList<TipoManoProduEmpresa>());
					tipomanoproduempresaLogic.getTipoManoProduEmpresas().add(tipomanoproduempresaLogic.getTipoManoProduEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomanoproduempresas=new ArrayList<TipoManoProduEmpresa>();
					this.tipomanoproduempresas.add(tipomanoproduempresa);
				}
				
				if(tipomanoproduempresaLogic.getTipoManoProduEmpresa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoManoProduEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomanoproduempresaLogic.getTipoManoProduEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoManoProduEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoManoProduEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomanoproduempresaLogic.getTipoManoProduEmpresas()==null||tipomanoproduempresaLogic.getTipoManoProduEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomanoproduempresas==null|| tipomanoproduempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomanoproduempresasAux=new ArrayList<TipoManoProduEmpresa>();
						tipomanoproduempresasAux.addAll(tipomanoproduempresaLogic.getTipoManoProduEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomanoproduempresasAux=new ArrayList<TipoManoProduEmpresa>();
							tipomanoproduempresasAux.addAll(tipomanoproduempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomanoproduempresaLogic.getTipoManoProduEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoManoProduEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoManoProduEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoManoProduEmpresas("FK_IdEmpresa",tipomanoproduempresaLogic.getTipoManoProduEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoManoProduEmpresas("FK_IdEmpresa",tipomanoproduempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomanoproduempresaLogic.setTipoManoProduEmpresas(new ArrayList<TipoManoProduEmpresa>());
						tipomanoproduempresaLogic.getTipoManoProduEmpresas().addAll(tipomanoproduempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomanoproduempresas=new ArrayList<TipoManoProduEmpresa>();
							tipomanoproduempresas.addAll(tipomanoproduempresasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoManoProduEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoManoProduEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomanoproduempresaLogic.getTipoManoProduEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomanoproduempresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomanoproduempresaLogic.getTipoManoProduEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomanoproduempresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoManoProduEmpresa tipomanoproduempresa) {
		Boolean permite=true;
		
		if(this.tipomanoproduempresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoManoProduEmpresaConstantesFunciones.getOrderByListaTipoManoProduEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoManoProduEmpresaConstantesFunciones.getOrderByListaTipoManoProduEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoManoProduEmpresa tipomanoproduempresa:tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
				if(tipomanoproduempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomanoproduempresaTotales=tipomanoproduempresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoManoProduEmpresa tipomanoproduempresa:this.tipomanoproduempresas) {
				if(tipomanoproduempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomanoproduempresaTotales=tipomanoproduempresa;
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
			this.tipomanoproduempresaAux=new TipoManoProduEmpresa();
			this.tipomanoproduempresaAux.setsType(Constantes2.S_TOTALES);
			this.tipomanoproduempresaAux.setIsNew(false);
			this.tipomanoproduempresaAux.setIsChanged(false);
			this.tipomanoproduempresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoManoProduEmpresaConstantesFunciones.TotalizarValoresFilaTipoManoProduEmpresa(this.tipomanoproduempresaLogic.getTipoManoProduEmpresas(),this.tipomanoproduempresaAux);
				
				this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().add(this.tipomanoproduempresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoManoProduEmpresaConstantesFunciones.TotalizarValoresFilaTipoManoProduEmpresa(this.tipomanoproduempresas,this.tipomanoproduempresaAux);
				
				this.tipomanoproduempresas.add(this.tipomanoproduempresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipomanoproduempresaTotales=new TipoManoProduEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().remove(tipomanoproduempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomanoproduempresas.remove(tipomanoproduempresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipomanoproduempresaTotales=new TipoManoProduEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoManoProduEmpresa tipomanoproduempresa:tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
				if(tipomanoproduempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomanoproduempresaTotales=tipomanoproduempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoManoProduEmpresaConstantesFunciones.TotalizarValoresFilaTipoManoProduEmpresa(this.tipomanoproduempresaLogic.getTipoManoProduEmpresas(),tipomanoproduempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoManoProduEmpresa tipomanoproduempresa:this.tipomanoproduempresas) {
				if(tipomanoproduempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomanoproduempresaTotales=tipomanoproduempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoManoProduEmpresaConstantesFunciones.TotalizarValoresFilaTipoManoProduEmpresa(this.tipomanoproduempresas,tipomanoproduempresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoManoProduEmpresasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoManoProduEmpresasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomanoproduempresaLogic.getTipoManoProduEmpresasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoManoProduEmpresa() {
		this.isPermisoTodoTipoManoProduEmpresa=false;
		this.isPermisoNuevoTipoManoProduEmpresa=false;
		this.isPermisoActualizarTipoManoProduEmpresa=false;
		this.isPermisoActualizarOriginalTipoManoProduEmpresa=false;
		this.isPermisoEliminarTipoManoProduEmpresa=false;
		this.isPermisoGuardarCambiosTipoManoProduEmpresa=false;
		this.isPermisoConsultaTipoManoProduEmpresa=false;
		this.isPermisoBusquedaTipoManoProduEmpresa=false;
		this.isPermisoReporteTipoManoProduEmpresa=false;		
		this.isPermisoOrdenTipoManoProduEmpresa=false;		
		this.isPermisoPaginacionMedioTipoManoProduEmpresa=false;		
		this.isPermisoPaginacionAltoTipoManoProduEmpresa=false;
		this.isPermisoPaginacionTodoTipoManoProduEmpresa=false;
		this.isPermisoCopiarTipoManoProduEmpresa=false;		
		this.isPermisoVerFormTipoManoProduEmpresa=false;		
		this.isPermisoDuplicarTipoManoProduEmpresa=false;		
		this.isPermisoOrdenTipoManoProduEmpresa=false;		
	}
	
	public void setPermisosUsuarioTipoManoProduEmpresa(Boolean isPermiso) {
		this.isPermisoTodoTipoManoProduEmpresa=isPermiso;
		this.isPermisoNuevoTipoManoProduEmpresa=isPermiso;
		this.isPermisoActualizarTipoManoProduEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoManoProduEmpresa=isPermiso;
		this.isPermisoEliminarTipoManoProduEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoManoProduEmpresa=isPermiso;
		this.isPermisoConsultaTipoManoProduEmpresa=isPermiso;
		this.isPermisoBusquedaTipoManoProduEmpresa=isPermiso;
		this.isPermisoReporteTipoManoProduEmpresa=isPermiso;
		this.isPermisoOrdenTipoManoProduEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioTipoManoProduEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoTipoManoProduEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoTipoManoProduEmpresa=isPermiso;		
		this.isPermisoCopiarTipoManoProduEmpresa=isPermiso;		
		this.isPermisoVerFormTipoManoProduEmpresa=isPermiso;		
		this.isPermisoDuplicarTipoManoProduEmpresa=isPermiso;
		this.isPermisoOrdenTipoManoProduEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoManoProduEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoTipoManoProduEmpresa=isPermiso;
		this.isPermisoNuevoTipoManoProduEmpresa=isPermiso;
		this.isPermisoActualizarTipoManoProduEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoManoProduEmpresa=isPermiso;
		this.isPermisoEliminarTipoManoProduEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoManoProduEmpresa=isPermiso;
		//this.isPermisoConsultaTipoManoProduEmpresa=isPermiso;
		//this.isPermisoBusquedaTipoManoProduEmpresa=isPermiso;
		//this.isPermisoReporteTipoManoProduEmpresa=isPermiso;
		//this.isPermisoOrdenTipoManoProduEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioTipoManoProduEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoTipoManoProduEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoTipoManoProduEmpresa=isPermiso;		
		//this.isPermisoCopiarTipoManoProduEmpresa=isPermiso;		
		//this.isPermisoDuplicarTipoManoProduEmpresa=isPermiso;
		//this.isPermisoOrdenTipoManoProduEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoManoProduEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoManoProduEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoManoProduEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoManoProduEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoManoProduEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoManoProduEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoManoProduEmpresaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoManoProduEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoManoProduEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoManoProduEmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoManoProduEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoManoProduEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoManoProduEmpresa=this.isPermisoActualizarTipoManoProduEmpresa;
			this.isPermisoEliminarTipoManoProduEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoManoProduEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoManoProduEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoManoProduEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoManoProduEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoManoProduEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoManoProduEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoManoProduEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoManoProduEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoManoProduEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoManoProduEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoManoProduEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoManoProduEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoManoProduEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoManoProduEmpresa.setToolTipText(this.jTableDatosTipoManoProduEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoManoProduEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoManoProduEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoManoProduEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoManoProduEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoManoProduEmpresa() throws Exception {
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
	public void inicializarCombosForeignKeyTipoManoProduEmpresaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoManoProduEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoManoProduEmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoManoProduEmpresaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoManoProduEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoManoProduEmpresaParameterReturnGeneral tipomanoproduempresaReturnGeneral=new TipoManoProduEmpresaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipomanoproduempresaConstantesFunciones.cargarid_empresaTipoManoProduEmpresa)
					 || (this.esRecargarFks && this.tipomanoproduempresaConstantesFunciones.cargarid_empresaTipoManoProduEmpresa)) {

					if(!this.tipomanoproduempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipomanoproduempresaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipomanoproduempresaReturnGeneral=tipomanoproduempresaLogic.cargarCombosLoteForeignKeyTipoManoProduEmpresa(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipomanoproduempresaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoManoProduEmpresa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipomanoproduempresaSessionBean==null) {
				this.tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean();
			}

			if(!this.tipomanoproduempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoManoProduEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoManoProduEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoManoProduEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoManoProduEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoManoProduEmpresa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoManoProduEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoManoProduEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoManoProduEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoManoProduEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoManoProduEmpresa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoManoProduEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoManoProduEmpresa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa!=null && this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoManoProduEmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoManoProduEmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoManoProduEmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean(); 
		this.tipomanoproduempresaConstantesFunciones=new TipoManoProduEmpresaConstantesFunciones(); 
		this.tipomanoproduempresaBean=new TipoManoProduEmpresa();//(this.tipomanoproduempresaConstantesFunciones); 		
		this.tipomanoproduempresaReturnGeneral=new TipoManoProduEmpresaParameterReturnGeneral(); 
		
		this.tipomanoproduempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomanoproduempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoManoProduEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoManoProduEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoManoProduEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoManoProduEmpresa(true);
			
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
			
			this.tipomanoproduempresaConstantesFunciones=new TipoManoProduEmpresaConstantesFunciones(); 
			this.tipomanoproduempresaBean=new TipoManoProduEmpresa();//this.tipomanoproduempresaConstantesFunciones); 			
			this.tipomanoproduempresaReturnGeneral=new TipoManoProduEmpresaParameterReturnGeneral(); 
		
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Mano Obra Produccion Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipomanoproduempresa=new TipoManoProduEmpresa();
			this.tipomanoproduempresas = new ArrayList<TipoManoProduEmpresa>();
			this.tipomanoproduempresasAux = new ArrayList<TipoManoProduEmpresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic=new TipoManoProduEmpresaLogic();
				this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipomanoproduempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipomanoproduempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoManoProduEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoManoProduEmpresa);	
					}
					
					if(this.jInternalFrameImportacionTipoManoProduEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoManoProduEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoManoProduEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoManoProduEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoManoProduEmpresa);
				this.jInternalFrameDetalleFormTipoManoProduEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormTipoManoProduEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa);
					this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoManoProduEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoManoProduEmpresa);
					this.jInternalFrameImportacionTipoManoProduEmpresa.setVisible(false);
					this.jInternalFrameImportacionTipoManoProduEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoManoProduEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoManoProduEmpresa);
					this.jInternalFrameOrderByTipoManoProduEmpresa.setVisible(false);
					this.jInternalFrameOrderByTipoManoProduEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoManoProduEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoManoProduEmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipomanoproduempresaReturnGeneral=new TipoManoProduEmpresaParameterReturnGeneral();
			
			this.tipomanoproduempresaParameterGeneral=new TipoManoProduEmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipomanoproduempresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoManoProduEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoManoProduEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado(),this.tipomanoproduempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoManoProduEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado(),this.tipomanoproduempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaCopiarTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaVerFormTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaOrdenTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaModificarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoManoProduEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoManoProduEmpresa(false);
			
			this.setPermisosUsuarioTipoManoProduEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado() && this.tipomanoproduempresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoManoProduEmpresaClasesRelacionadas();
			}
			
			if(this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoManoProduEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoManoProduEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoManoProduEmpresa();
			}
			
			if(!this.isPermisoBusquedaTipoManoProduEmpresa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoManoProduEmpresa,this.isPermisoPaginacionMedioTipoManoProduEmpresa,this.isPermisoPaginacionTodoTipoManoProduEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoManoProduEmpresaConstantesFunciones.getTiposSeleccionarTipoManoProduEmpresa());
				
				this.tiposColumnasSelect=TipoManoProduEmpresaConstantesFunciones.getTiposSeleccionarTipoManoProduEmpresa(true);
				
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
			//if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoManoProduEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoManoProduEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoManoProduEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoManoProduEmpresa() ;
			
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
				tipomanoproduempresaImplementable= (TipoManoProduEmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoManoProduEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipomanoproduempresaImplementableHome= (TipoManoProduEmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoManoProduEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipomanoproduempresas= new ArrayList<TipoManoProduEmpresa>();
			this.tipomanoproduempresasEliminados= new ArrayList<TipoManoProduEmpresa>();
						
			this.isEsNuevoTipoManoProduEmpresa=false;
			this.esParaAccionDesdeFormularioTipoManoProduEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoManoProduEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoManoProduEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoManoProduEmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoManoProduEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoManoProduEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoManoProduEmpresa();
			}
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoManoProduEmpresa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoManoProduEmpresa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoManoProduEmpresa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoManoProduEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoManoProduEmpresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoManoProduEmpresa() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoManoProduEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTabbedPaneRelacionesTipoManoProduEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTabbedPaneRelacionesTipoManoProduEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoManoProduEmpresa();	
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
	
	public void cargarCombosForeignKeyTipoManoProduEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoManoProduEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoManoProduEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoManoProduEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoManoProduEmpresa();
		
		this.cargarCombosFrameForeignKeyTipoManoProduEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoManoProduEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoManoProduEmpresa();
		}
	}
	
	
	
	public void jButtonNuevoTipoManoProduEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
			
			if(jTableDatosTipoManoProduEmpresa.getRowCount()>=1) {
				jTableDatosTipoManoProduEmpresa.removeRowSelectionInterval(0, jTableDatosTipoManoProduEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoManoProduEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoManoProduEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoManoProduEmpresa(true);			
			//this.tipomanoproduempresa=new TipoManoProduEmpresa();
			//this.tipomanoproduempresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoManoProduEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoManoProduEmpresa() ;
			
			if(TipoManoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoManoProduEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipomanoproduempresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);				
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
			if(this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoManoProduEmpresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoManoProduEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoManoProduEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoManoProduEmpresa.getSelectedRows().length;			
			}
			
			tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoManoProduEmpresa--;			
				//TipoManoProduEmpresa tipomanoproduempresaAux= new TipoManoProduEmpresa();			
				//tipomanoproduempresaAux.setId(this.iIdNuevoTipoManoProduEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoManoProduEmpresa tipomanoproduempresaOrigen=new TipoManoProduEmpresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoManoProduEmpresa tipomanoproduempresaOrigen : tipomanoproduempresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipomanoproduempresaOrigen =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomanoproduempresaOrigen =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoManoProduEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipomanoproduempresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoManoProduEmpresa(tipomanoproduempresaOrigen,this.tipomanoproduempresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().add(this.tipomanoproduempresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomanoproduempresas.add(this.tipomanoproduempresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
				
				this.jTableDatosTipoManoProduEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoManoProduEmpresa(), this.getIndiceNuevoTipoManoProduEmpresa());
				
				int iLastRow =  this.jTableDatosTipoManoProduEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoManoProduEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoManoProduEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();									
		
			TipoManoProduEmpresa tipomanoproduempresaOrigen=new TipoManoProduEmpresa();
			TipoManoProduEmpresa tipomanoproduempresaDestino=new TipoManoProduEmpresa();
				
			tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoManoProduEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipomanoproduempresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoManoProduEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomanoproduempresaOrigen =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomanoproduempresaOrigen =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomanoproduempresaDestino =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomanoproduempresaDestino =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipomanoproduempresaOrigen =tipomanoproduempresasSeleccionados.get(0);
				tipomanoproduempresaDestino =tipomanoproduempresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoManoProduEmpresa(tipomanoproduempresaOrigen,tipomanoproduempresaDestino,true,false);
				
				tipomanoproduempresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomanoproduempresaDestino,tipomanoproduempresaLogic.getTipoManoProduEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomanoproduempresaDestino,tipomanoproduempresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
				
				//this.jTableDatosTipoManoProduEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoManoProduEmpresa(), this.getIndiceNuevoTipoManoProduEmpresa());
				
				int iLastRow =  this.jTableDatosTipoManoProduEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoManoProduEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoManoProduEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoManoProduEmpresa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoManoProduEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionTipoManoProduEmpresa.setVisible(!isVisible);
			this.jPanelAccionesTipoManoProduEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoManoProduEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoManoProduEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoManoProduEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoManoProduEmpresa();
			
			this.abrirFrameOrderByTipoManoProduEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoManoProduEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoManoProduEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoManoProduEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoManoProduEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormTipoManoProduEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoManoProduEmpresa.setSize(this.jInternalFrameDetalleFormTipoManoProduEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormTipoManoProduEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoManoProduEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoManoProduEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoManoProduEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormTipoManoProduEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoManoProduEmpresa.jContentPaneDetalleTipoManoProduEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTabbedPaneRelacionesTipoManoProduEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoManoProduEmpresa.jContentPaneDetalleTipoManoProduEmpresa.getWidth(),TipoManoProduEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTabbedPaneRelacionesTipoManoProduEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoManoProduEmpresa.jContentPaneDetalleTipoManoProduEmpresa.getWidth(),TipoManoProduEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTabbedPaneRelacionesTipoManoProduEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoManoProduEmpresa.jContentPaneDetalleTipoManoProduEmpresa.getWidth(),TipoManoProduEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoManoProduEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormTipoManoProduEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoManoProduEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoManoProduEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoManoProduEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoManoProduEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByTipoManoProduEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoManoProduEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoManoProduEmpresa);
				this.jInternalFrameOrderByTipoManoProduEmpresa.setVisible(false);
				this.jInternalFrameOrderByTipoManoProduEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByTipoManoProduEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoManoProduEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByTipoManoProduEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoManoProduEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoManoProduEmpresa==null) {
				
				this.jInternalFrameImportacionTipoManoProduEmpresa=new ImportacionJInternalFrame(TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoManoProduEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoManoProduEmpresa);
				this.jInternalFrameImportacionTipoManoProduEmpresa.setVisible(false);
				this.jInternalFrameImportacionTipoManoProduEmpresa.setSelected(false);


				this.jInternalFrameImportacionTipoManoProduEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoManoProduEmpresa"));
				this.jInternalFrameImportacionTipoManoProduEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoManoProduEmpresa"));
				this.jInternalFrameImportacionTipoManoProduEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoManoProduEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoManoProduEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa==null) {
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa=new ReporteDinamicoJInternalFrame(TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoManoProduEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa);
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoManoProduEmpresa"));
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoManoProduEmpresa"));
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoManoProduEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoManoProduEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoManoProduEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoManoProduEmpresa);
			
	       	this.jInternalFrameDetalleFormTipoManoProduEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormTipoManoProduEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoManoProduEmpresa.dispose();
			//this.jInternalFrameDetalleFormTipoManoProduEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoManoProduEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoManoProduEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoManoProduEmpresa.setVisible(true);
	        this.jInternalFrameImportacionTipoManoProduEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoManoProduEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoManoProduEmpresa.setVisible(true);
	        this.jInternalFrameOrderByTipoManoProduEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoManoProduEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoManoProduEmpresa.setVisible(false);
	        this.jInternalFrameOrderByTipoManoProduEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoManoProduEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoManoProduEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoManoProduEmpresa.setVisible(false);
	        this.jInternalFrameImportacionTipoManoProduEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoManoProduEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoManoProduEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoManoProduEmpresa(true);
			//this.isEsNuevoTipoManoProduEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoManoProduEmpresa(false) ;
			
			if(tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoManoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoManoProduEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoManoProduEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoManoProduEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoManoProduEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoManoProduEmpresa(true);
			//this.isEsNuevoTipoManoProduEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipomanoproduempresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoManoProduEmpresa(false) ;
			
			if(TipoManoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoManoProduEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoManoProduEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoManoProduEmpresa(false);
			
			//if(!this.isEsNuevoTipoManoProduEmpresa) {								
				int intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
				
			}
			
			if(this.permiteMantenimiento(this.tipomanoproduempresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoManoProduEmpresa=true;
					this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
					this.isEsNuevoTipoManoProduEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoManoProduEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoManoProduEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoManoProduEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoManoProduEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoManoProduEmpresa(false);
			
												
				
				if(TipoManoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoManoProduEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,tipomanoproduempresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoManoProduEmpresa(this.tipomanoproduempresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoManoProduEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipomanoproduempresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipomanoproduempresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipomanoproduempresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipomanoproduempresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipomanoproduempresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoManoProduEmpresaModel) this.jTableDatosTipoManoProduEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoManoProduEmpresa=true;
				this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
				this.isEsNuevoTipoManoProduEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoManoProduEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoManoProduEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoManoProduEmpresa(false);
				
				
				
				if(TipoManoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoManoProduEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoManoProduEmpresa.getRowCount()>=1) {
				jTableDatosTipoManoProduEmpresa.removeRowSelectionInterval(0, jTableDatosTipoManoProduEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoManoProduEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoManoProduEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoManoProduEmpresa(false) ;
			
			this.isEsNuevoTipoManoProduEmpresa=false;
			
			if(TipoManoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoManoProduEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoManoProduEmpresa(false);
				
				//SI ES MANUAL
				if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoManoProduEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoManoProduEmpresa--;			
			//TipoManoProduEmpresa tipomanoproduempresaAux= new TipoManoProduEmpresa();			
			//tipomanoproduempresaAux.setId(this.iIdNuevoTipoManoProduEmpresa);
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoManoProduEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
			
			this.tipomanoproduempresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().add(this.tipomanoproduempresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipomanoproduempresas.add(this.tipomanoproduempresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
			
			this.jTableDatosTipoManoProduEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoManoProduEmpresa(), this.getIndiceNuevoTipoManoProduEmpresa());
			
			int iLastRow =  this.jTableDatosTipoManoProduEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoManoProduEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoManoProduEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoManoProduEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoManoProduEmpresa(false);
			
			//SI ES MANUAL
			if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoManoProduEmpresa();
			}
			
			//this.abrirFrameTreeTipoManoProduEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Mano Obra Produccion EmpresaS ?", "MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoManoProduEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoManoProduEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipomanoproduempresaReturnGeneral=tipomanoproduempresaLogic.procesarImportacionTipoManoProduEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipomanoproduempresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoManoProduEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoManoProduEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoManoProduEmpresa.setFileImportacion(this.jInternalFrameImportacionTipoManoProduEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoManoProduEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoManoProduEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoManoProduEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoManoProduEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();		

		tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoManoProduEmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoManoProduEmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoManoProduEmpresas("Todos",tipomanoproduempresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();		
		
		tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomanoproduempresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoManoProduEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoManoProduEmpresa tipomanoproduempresa:tipomanoproduempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomanoproduempresa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoManoProduEmpresa tipomanoproduempresa:tipomanoproduempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomanoproduempresa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoManoProduEmpresa tipomanoproduempresa:tipomanoproduempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomanoproduempresa.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoManoProduEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoManoProduEmpresa(tipomanoproduempresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoManoProduEmpresa(false);
			
			//SI ES MANUAL
			if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoManoProduEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoManoProduEmpresa(false);
			
			//SI ES MANUAL
			if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoManoProduEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoManoProduEmpresa(false);
			
			//SI ES MANUAL
			if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoManoProduEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoManoProduEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoManoProduEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoManoProduEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoManoProduEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoManoProduEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoManoProduEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoManoProduEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoManoProduEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoManoProduEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoManoProduEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoManoProduEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoManoProduEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoManoProduEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoManoProduEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoManoProduEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoManoProduEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoManoProduEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoManoProduEmpresa();
		
		this.inicializarActualizarBindingBotonesManualTipoManoProduEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoManoProduEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoManoProduEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoManoProduEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoManoProduEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoManoProduEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoManoProduEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jCheckBoxPostAccionNuevoTipoManoProduEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jCheckBoxPostAccionSinCerrarTipoManoProduEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jCheckBoxPostAccionSinMensajeTipoManoProduEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoManoProduEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoManoProduEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
				this.jInternalFrameDetalleFormTipoManoProduEmpresa.jCheckBoxPostAccionNuevoTipoManoProduEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoManoProduEmpresa.jCheckBoxPostAccionSinCerrarTipoManoProduEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoManoProduEmpresa.jCheckBoxPostAccionSinMensajeTipoManoProduEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoManoProduEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoManoProduEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoManoProduEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoManoProduEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoManoProduEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoManoProduEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoManoProduEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoManoProduEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoManoProduEmpresa() throws Exception {
		try	{
			if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoManoProduEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoManoProduEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoManoProduEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoManoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoManoProduEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoManoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoManoProduEmpresa.addItem(reporte);
			}
			
			
			if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoManoProduEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoManoProduEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoManoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoManoProduEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoManoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoManoProduEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoManoProduEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoManoProduEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoManoProduEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoManoProduEmpresa(Boolean esInicializar) throws Exception {				
		if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoManoProduEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoManoProduEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoManoProduEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoManoProduEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoManoProduEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoManoProduEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoManoProduEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoManoProduEmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoManoProduEmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoManoProduEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipomanoproduempresaLogic.getTipoManoProduEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipomanoproduempresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoManoProduEmpresa.setModel(new TipoManoProduEmpresaModel(this.tipomanoproduempresaLogic.getTipoManoProduEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoManoProduEmpresa.setModel(new TipoManoProduEmpresaModel(this.tipomanoproduempresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoManoProduEmpresa!=null && this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoManoProduEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoManoProduEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoManoProduEmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,tipomanoproduempresaConstantesFunciones.resaltarSeleccionarTipoManoProduEmpresa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,tipomanoproduempresaConstantesFunciones.resaltarSeleccionarTipoManoProduEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoManoProduEmpresa,TipoManoProduEmpresaConstantesFunciones.LABEL_ID));

		if(this.tipomanoproduempresaConstantesFunciones.mostraridTipoManoProduEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoManoProduEmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomanoproduempresaConstantesFunciones.resaltaridTipoManoProduEmpresa,this.tipomanoproduempresaConstantesFunciones.activaridTipoManoProduEmpresa,this,true,"idTipoManoProduEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomanoproduempresaConstantesFunciones.resaltaridTipoManoProduEmpresa,this.tipomanoproduempresaConstantesFunciones.activaridTipoManoProduEmpresa,this,true,"idTipoManoProduEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoManoProduEmpresa,TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipomanoproduempresaConstantesFunciones.mostrarid_empresaTipoManoProduEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipomanoproduempresaConstantesFunciones.resaltarid_empresaTipoManoProduEmpresa,this,this.tipomanoproduempresaConstantesFunciones.activarid_empresaTipoManoProduEmpresa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipomanoproduempresaConstantesFunciones.resaltarid_empresaTipoManoProduEmpresa,this,this.tipomanoproduempresaConstantesFunciones.activarid_empresaTipoManoProduEmpresa,false,"id_empresaTipoManoProduEmpresa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoManoProduEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoManoProduEmpresa,TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipomanoproduempresaConstantesFunciones.mostrarnombreTipoManoProduEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomanoproduempresaConstantesFunciones.resaltarnombreTipoManoProduEmpresa,this.tipomanoproduempresaConstantesFunciones.activarnombreTipoManoProduEmpresa,this,true,"nombreTipoManoProduEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomanoproduempresaConstantesFunciones.resaltarnombreTipoManoProduEmpresa,this.tipomanoproduempresaConstantesFunciones.activarnombreTipoManoProduEmpresa,this,true,"nombreTipoManoProduEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoManoProduEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoManoProduEmpresa,TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipomanoproduempresaConstantesFunciones.mostrardescripcionTipoManoProduEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomanoproduempresaConstantesFunciones.resaltardescripcionTipoManoProduEmpresa,this.tipomanoproduempresaConstantesFunciones.activardescripcionTipoManoProduEmpresa,this,true,"descripcionTipoManoProduEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomanoproduempresaConstantesFunciones.resaltardescripcionTipoManoProduEmpresa,this.tipomanoproduempresaConstantesFunciones.activardescripcionTipoManoProduEmpresa,this,true,"descripcionTipoManoProduEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoManoProduEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoManoProduEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoManoProduEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoManoProduEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosTipoManoProduEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoManoProduEmpresa.moveColumn(this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoManoProduEmpresa.moveColumn(this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoManoProduEmpresa.moveColumn(this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoManoProduEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoManoProduEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoManoProduEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoManoProduEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoManoProduEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoManoProduEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipomanoproduempresaLogic.getTipoManoProduEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipomanoproduempresas.size()-1;
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
		//this.jTableDatosTipoManoProduEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoManoProduEmpresa();
			
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
				
				//this.isEsNuevoTipoManoProduEmpresa=false;
					
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
				if(this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoManoProduEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoManoProduEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipomanoproduempresa.getsType().equals("DUPLICADO")
				   || this.tipomanoproduempresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoManoProduEmpresa=true;
				
				} else {
					this.isEsNuevoTipoManoProduEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipomanoproduempresa.getId()>=0 && !this.tipomanoproduempresa.getIsNew()) {						
						this.isEsNuevoTipoManoProduEmpresa=false;
						
					} else {
						this.isEsNuevoTipoManoProduEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoManoProduEmpresa(esRelaciones);						
				
				this.seleccionarTipoManoProduEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipomanoproduempresa.getId()<0) {
					this.isEsNuevoTipoManoProduEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoManoProduEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoManoProduEmpresa(evt,rowIndex);
				}	
				
				if(this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoManoProduEmpresa: " + this.dDif); 
					}
				}								
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoManoProduEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipomanoproduempresa)) {
					if(this.tipomanoproduempresa.getId()>0) {
						this.tipomanoproduempresa.setIsDeleted(true);
						
						this.tipomanoproduempresasEliminados.add(this.tipomanoproduempresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().remove(this.tipomanoproduempresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomanoproduempresas.remove(this.tipomanoproduempresa);				
					}
					
					
					((TipoManoProduEmpresaModel) this.jTableDatosTipoManoProduEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoManoProduEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoManoProduEmpresa) {
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoManoProduEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoManoProduEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoManoProduEmpresa(this.tipomanoproduempresa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipomanoproduempresaConstantesFunciones.cargarid_empresaTipoManoProduEmpresa || this.tipomanoproduempresaConstantesFunciones.event_dependid_empresaTipoManoProduEmpresa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipomanoproduempresa.getid_empresa());
									//this.inicializarActualizarBindingTipoManoProduEmpresa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipomanoproduempresa.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipomanoproduempresa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipomanoproduempresa.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoManoProduEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoManoProduEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoManoProduEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoManoProduEmpresa(tipomanoproduempresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoManoProduEmpresa(tipomanoproduempresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoManoProduEmpresa(tipomanoproduempresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoManoProduEmpresa(tipomanoproduempresa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.setText(tipomanoproduempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreanombreTipoManoProduEmpresa.setText(tipomanoproduempresa.getnombre());
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreadescripcionTipoManoProduEmpresa.setText(tipomanoproduempresa.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoManoProduEmpresa tipomanoproduempresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipomanoproduempresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoManoProduEmpresa tipomanoproduempresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipomanoproduempresaLocal=this.tipomanoproduempresa;
			} else {
				tipomanoproduempresaLocal=this.tipomanoproduempresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipomanoproduempresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoManoProduEmpresa(tipomanoproduempresaLocal,true);
					
					if(tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipomanoproduempresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipomanoproduempresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(tipomanoproduempresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(tipomanoproduempresa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(tipomanoproduempresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.getText()==null || this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.getText()=="" || this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.setText("0");
			}

			if(conColumnasBase) {tipomanoproduempresa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoManoProduEmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelIdTipoManoProduEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomanoproduempresa.setnombre(this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreanombreTipoManoProduEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelnombreTipoManoProduEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomanoproduempresa.setdescripcion(this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreadescripcionTipoManoProduEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabeldescripcionTipoManoProduEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresaBean,TipoManoProduEmpresa tipomanoproduempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresaOrigen,TipoManoProduEmpresa tipomanoproduempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomanoproduempresaOrigen.getId()!=null && !tipomanoproduempresaOrigen.getId().equals(0L))) {tipomanoproduempresa.setId(tipomanoproduempresaOrigen.getId());}}
			if(conDefault || (!conDefault && tipomanoproduempresaOrigen.getnombre()!=null && !tipomanoproduempresaOrigen.getnombre().equals(""))) {tipomanoproduempresa.setnombre(tipomanoproduempresaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipomanoproduempresaOrigen.getdescripcion()!=null && !tipomanoproduempresaOrigen.getdescripcion().equals(""))) {tipomanoproduempresa.setdescripcion(tipomanoproduempresaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.setText(tipomanoproduempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreanombreTipoManoProduEmpresa.setText(tipomanoproduempresa.getnombre());
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreadescripcionTipoManoProduEmpresa.setText(tipomanoproduempresa.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoManoProduEmpresa(TipoManoProduEmpresaBean tipomanoproduempresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.setText(tipomanoproduempresaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreanombreTipoManoProduEmpresa.setText(tipomanoproduempresaBean.getnombre());
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreadescripcionTipoManoProduEmpresa.setText(tipomanoproduempresaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoManoProduEmpresa(TipoManoProduEmpresaParameterReturnGeneral tipomanoproduempresaReturnGeneral,TipoManoProduEmpresaBean tipomanoproduempresaBean,Boolean conDefault) throws Exception { 
		try {
			TipoManoProduEmpresa tipomanoproduempresaLocal=new TipoManoProduEmpresa();
			
			tipomanoproduempresaLocal=tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomanoproduempresaLocal.getId()!=null && !tipomanoproduempresaLocal.getId().equals(0L))) {tipomanoproduempresaBean.setId(tipomanoproduempresaLocal.getId());}}
			if(conDefault || (!conDefault && tipomanoproduempresaLocal.getnombre()!=null && !tipomanoproduempresaLocal.getnombre().equals(""))) {tipomanoproduempresaBean.setnombre(tipomanoproduempresaLocal.getnombre());}
			if(conDefault || (!conDefault && tipomanoproduempresaLocal.getdescripcion()!=null && !tipomanoproduempresaLocal.getdescripcion().equals(""))) {tipomanoproduempresaBean.setdescripcion(tipomanoproduempresaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoManoProduEmpresaGenerico(Long idTipoManoProduEmpresaSeleccionado,JComboBox jComboBoxTipoManoProduEmpresa,List<TipoManoProduEmpresa> tipomanoproduempresasLocal)throws Exception {
		try {
			TipoManoProduEmpresa  tipomanoproduempresaTemp=null;

			for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresasLocal) {
				if(tipomanoproduempresaAux.getId()!=null && tipomanoproduempresaAux.getId().equals(idTipoManoProduEmpresaSeleccionado)) {
					tipomanoproduempresaTemp=tipomanoproduempresaAux;
					break;
				}
			}

			jComboBoxTipoManoProduEmpresa.setSelectedItem(tipomanoproduempresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoManoProduEmpresaGenerico(JComboBox jComboBoxTipoManoProduEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoManoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoManoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoManoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoManoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoManoProduEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoManoProduEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoManoProduEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoManoProduEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoManoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoManoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomanoproduempresa=(TipoManoProduEmpresa) tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomanoproduempresa =(TipoManoProduEmpresa) tipomanoproduempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipomanoproduempresa.getIsNew() && !tipomanoproduempresa.getIsChanged() && !tipomanoproduempresa.getIsDeleted()) {
				sDescripcion=tipomanoproduempresa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipomanoproduempresa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoManoProduEmpresa tipomanoproduempresaRow=new TipoManoProduEmpresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomanoproduempresaRow=(TipoManoProduEmpresa) tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomanoproduempresaRow=(TipoManoProduEmpresa) tipomanoproduempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoManoProduEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoManoProduEmpresa && this.isPermisoNuevoTipoManoProduEmpresa));			
			this.jButtonDuplicarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoManoProduEmpresa && this.isPermisoDuplicarTipoManoProduEmpresa));			
			this.jButtonCopiarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoManoProduEmpresa && this.isPermisoCopiarTipoManoProduEmpresa));
			this.jButtonVerFormTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoManoProduEmpresa && this.isPermisoVerFormTipoManoProduEmpresa));
			
			this.jButtonAbrirOrderByTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoManoProduEmpresa && this.isPermisoOrdenTipoManoProduEmpresa));			
			
			this.jButtonNuevoRelacionesTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa && this.isPermisoNuevoTipoManoProduEmpresa));			
			this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoManoProduEmpresa && this.isPermisoNuevoTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa));
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonModificarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoManoProduEmpresa && this.isPermisoActualizarTipoManoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonActualizarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoManoProduEmpresa && this.isPermisoActualizarTipoManoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonEliminarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoManoProduEmpresa && this.isPermisoEliminarTipoManoProduEmpresa));
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonCancelarTipoManoProduEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoManoProduEmpresa);							
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoManoProduEmpresa && this.isPermisoNuevoTipoManoProduEmpresa));						
			this.jButtonDuplicarToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoManoProduEmpresa && this.isPermisoDuplicarTipoManoProduEmpresa));						
			this.jButtonCopiarToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoManoProduEmpresa && this.isPermisoCopiarTipoManoProduEmpresa));			
			this.jButtonVerFormToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoManoProduEmpresa && this.isPermisoVerFormTipoManoProduEmpresa));			
			this.jButtonAbrirOrderByToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoManoProduEmpresa && this.isPermisoOrdenTipoManoProduEmpresa));
			this.jButtonNuevoRelacionesToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa && this.isPermisoNuevoTipoManoProduEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoManoProduEmpresa && this.isPermisoNuevoTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa));			
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonModificarToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoManoProduEmpresa && this.isPermisoActualizarTipoManoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonActualizarToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoManoProduEmpresa  && this.isPermisoActualizarTipoManoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonEliminarToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoManoProduEmpresa && this.isPermisoEliminarTipoManoProduEmpresa));
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonCancelarToolBarTipoManoProduEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoManoProduEmpresa);				
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoManoProduEmpresa && this.isPermisoNuevoTipoManoProduEmpresa));			
			this.jMenuItemDuplicarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoManoProduEmpresa && this.isPermisoDuplicarTipoManoProduEmpresa));			
			this.jMenuItemCopiarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoManoProduEmpresa && this.isPermisoCopiarTipoManoProduEmpresa));			
			this.jMenuItemVerFormTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoManoProduEmpresa && this.isPermisoVerFormTipoManoProduEmpresa));			
			this.jMenuItemAbrirOrderByTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoManoProduEmpresa && this.isPermisoOrdenTipoManoProduEmpresa));			
			//this.jMenuItemMostrarOcultarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoManoProduEmpresa && this.isPermisoOrdenTipoManoProduEmpresa));
			this.jMenuItemDetalleAbrirOrderByTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoManoProduEmpresa && this.isPermisoOrdenTipoManoProduEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoManoProduEmpresa && this.isPermisoOrdenTipoManoProduEmpresa));			
			this.jMenuItemNuevoRelacionesTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa && this.isPermisoNuevoTipoManoProduEmpresa));			
			this.jMenuItemNuevoGuardarCambiosTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoManoProduEmpresa && this.isPermisoNuevoTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa));									
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemModificarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoManoProduEmpresa && this.isPermisoActualizarTipoManoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemActualizarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoManoProduEmpresa && this.isPermisoActualizarTipoManoProduEmpresa));	
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemEliminarTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoManoProduEmpresa && this.isPermisoEliminarTipoManoProduEmpresa));
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemCancelarTipoManoProduEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoManoProduEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa));						
			this.jMenuItemGuardarCambiosTablaTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=this.jButtonNuevoTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarTipoManoProduEmpresa=this.jButtonDuplicarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarTipoManoProduEmpresa=this.jButtonCopiarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormTipoManoProduEmpresa=this.jButtonVerFormTipoManoProduEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoManoProduEmpresa=this.jButtonAbrirOrderByTipoManoProduEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=this.jButtonNuevoRelacionesTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaModificarTipoManoProduEmpresa=this.jButtonModificarTipoManoProduEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonActualizarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonEliminarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonCancelarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosTipoManoProduEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=this.jButtonNuevoToolBarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=this.jButtonNuevoRelacionesToolBarTipoManoProduEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonModificarToolBarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonActualizarToolBarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonEliminarToolBarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonCancelarToolBarTipoManoProduEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=this.jButtonGuardarCambiosToolBarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=this.jButtonGuardarCambiosTablaToolBarTipoManoProduEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=this.jMenuItemNuevoTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=this.jMenuItemNuevoRelacionesTipoManoProduEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemModificarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemActualizarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemEliminarTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemCancelarTipoManoProduEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=this.jMenuItemGuardarCambiosTipoManoProduEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=this.jMenuItemGuardarCambiosTablaTipoManoProduEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoManoProduEmpresa(Boolean esInicializar) {
		if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoManoProduEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoManoProduEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoManoProduEmpresa() {
		this.jButtonNuevoTipoManoProduEmpresa.setVisible(this.isPermisoNuevoTipoManoProduEmpresa);			
		this.jButtonDuplicarTipoManoProduEmpresa.setVisible(this.isPermisoDuplicarTipoManoProduEmpresa);			
		this.jButtonCopiarTipoManoProduEmpresa.setVisible(this.isPermisoCopiarTipoManoProduEmpresa);			
		this.jButtonVerFormTipoManoProduEmpresa.setVisible(this.isPermisoVerFormTipoManoProduEmpresa);			
		
		this.jButtonAbrirOrderByTipoManoProduEmpresa.setVisible(this.isPermisoOrdenTipoManoProduEmpresa);					
		
		this.jButtonNuevoRelacionesTipoManoProduEmpresa.setVisible(this.isPermisoNuevoTipoManoProduEmpresa);			
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonModificarTipoManoProduEmpresa.setVisible(this.isPermisoActualizarTipoManoProduEmpresa);	
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonActualizarTipoManoProduEmpresa.setVisible(this.isPermisoActualizarTipoManoProduEmpresa);	
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonEliminarTipoManoProduEmpresa.setVisible(this.isPermisoEliminarTipoManoProduEmpresa);
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonCancelarTipoManoProduEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoManoProduEmpresa);						
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosTipoManoProduEmpresa.setVisible(this.isPermisoGuardarCambiosTipoManoProduEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.setVisible(this.isPermisoActualizarTipoManoProduEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoManoProduEmpresa() {
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonModificarTipoManoProduEmpresa.setVisible(this.isPermisoActualizarTipoManoProduEmpresa);	
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonActualizarTipoManoProduEmpresa.setVisible(this.isPermisoActualizarTipoManoProduEmpresa);	
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonEliminarTipoManoProduEmpresa.setVisible(this.isPermisoEliminarTipoManoProduEmpresa);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonCancelarTipoManoProduEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoManoProduEmpresa);							
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosTipoManoProduEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoManoProduEmpresa && this.isPermisoGuardarCambiosTipoManoProduEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoManoProduEmpresa() {
		if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoManoProduEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoManoProduEmpresa() {
	}
	
	public void jTableDatosTipoManoProduEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoManoProduEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoManoProduEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.gettipomanoproduempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomanoproduempresa==null) {
						this.tipomanoproduempresa = new TipoManoProduEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
				}

				if(this.tipomanoproduempresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipomanoproduempresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoManoProduEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoManoProduEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoManoProduEmpresa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoManoProduEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoManoProduEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.gettipomanoproduempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipomanoproduempresaLogic.getConnexion());

				if(this.tipomanoproduempresa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipomanoproduempresa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoManoProduEmpresa=(TitledBorder)this.jScrollPanelDatosTipoManoProduEmpresa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoManoProduEmpresa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoManoProduEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.gettipomanoproduempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomanoproduempresa==null) {
						this.tipomanoproduempresa = new TipoManoProduEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
				}

				if(this.tipomanoproduempresa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipomanoproduempresa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoManoProduEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoManoProduEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.gettipomanoproduempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomanoproduempresa==null) {
						this.tipomanoproduempresa = new TipoManoProduEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
				}

				if(this.tipomanoproduempresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipomanoproduempresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoManoProduEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoManoProduEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.gettipomanoproduempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomanoproduempresa==null) {
						this.tipomanoproduempresa = new TipoManoProduEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);
				}

				if(this.tipomanoproduempresa.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipomanoproduempresa.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoManoProduEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoManoProduEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoManoProduEmpresa(false,false);

			this.getTipoManoProduEmpresasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoManoProduEmpresa(false);

			//if(TipoManoProduEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoManoProduEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomanoproduempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoManoProduEmpresa() {
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.dispose();
			this.jInternalFrameDetalleFormTipoManoProduEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa!=null) {
			this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.dispose();
			this.jInternalFrameReporteDinamicoTipoManoProduEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionTipoManoProduEmpresa!=null) {
			this.jInternalFrameImportacionTipoManoProduEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionTipoManoProduEmpresa.dispose();
			this.jInternalFrameImportacionTipoManoProduEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoManoProduEmpresa();
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoManoProduEmpresa")) {
				jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoManoProduEmpresa")) {
				jButtonDuplicarTipoManoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoManoProduEmpresa")) {
				jButtonCopiarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoManoProduEmpresa")) {
				jButtonVerFormTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoManoProduEmpresa")) {
				jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoManoProduEmpresa")) {
				jButtonDuplicarTipoManoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoManoProduEmpresa")) {
				jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoManoProduEmpresa")) {
				jButtonDuplicarTipoManoProduEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoManoProduEmpresa")) {
				jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoManoProduEmpresa")) {
				jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoManoProduEmpresa")) {
				jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoManoProduEmpresa")) {
				jButtonModificarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoManoProduEmpresa")) {
				jButtonModificarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoManoProduEmpresa")) {
				jButtonModificarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoManoProduEmpresa")) {
				jButtonActualizarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoManoProduEmpresa")) {
				jButtonActualizarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoManoProduEmpresa")) {
				jButtonActualizarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoManoProduEmpresa")) {
				jButtonEliminarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoManoProduEmpresa")) {
				jButtonEliminarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoManoProduEmpresa")) {
				jButtonEliminarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoManoProduEmpresa")) {
				jButtonCancelarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoManoProduEmpresa")) {
				jButtonCancelarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoManoProduEmpresa")) {
				jButtonCancelarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoManoProduEmpresa")) {
				jButtonCerrarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoManoProduEmpresa")) {
				jButtonCerrarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoManoProduEmpresa")) {
				jButtonCerrarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoManoProduEmpresa")) {
				jButtonMostrarOcultarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoManoProduEmpresa")) {
				jButtonCancelarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoManoProduEmpresa")) {
				jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoManoProduEmpresa")) {
				jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoManoProduEmpresa")) {
				jButtonCopiarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoManoProduEmpresa")) {
				jButtonVerFormTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoManoProduEmpresa")) {
				jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoManoProduEmpresa")) {
				jButtonCopiarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoManoProduEmpresa")) {
				jButtonVerFormTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoManoProduEmpresa")) {
				jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoManoProduEmpresa")) {
				jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoManoProduEmpresa")) {
				jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoManoProduEmpresa")) {
				jButtonRecargarInformacionTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoManoProduEmpresa")) {
				jButtonRecargarInformacionTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoManoProduEmpresa")) {
				jButtonRecargarInformacionTipoManoProduEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoManoProduEmpresa")) {
				jButtonAnterioresTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoManoProduEmpresa")) {
				jButtonAnterioresTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoManoProduEmpresa")) {
				jButtonAnterioresTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoManoProduEmpresa")) {
				jButtonSiguientesTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoManoProduEmpresa")) {
				jButtonSiguientesTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoManoProduEmpresa")) {
				jButtonSiguientesTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoManoProduEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoManoProduEmpresa")) {
				jButtonAbrirOrderByTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoManoProduEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoManoProduEmpresa")) {
				jButtonMostrarOcultarTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoManoProduEmpresa")) {
				jButtonNuevoGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoManoProduEmpresa")) {
				jButtonNuevoGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoManoProduEmpresa")) {
				jButtonNuevoGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoManoProduEmpresa")) {
				jButtonCerrarReporteDinamicoTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoManoProduEmpresa")) {
				jButtonGenerarReporteDinamicoTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoManoProduEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoManoProduEmpresa")) {
				jButtonCerrarImportacionTipoManoProduEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoManoProduEmpresa")) {
				
				jButtonGenerarImportacionTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoManoProduEmpresa")) {
				
				jButtonAbrirImportacionTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoManoProduEmpresa")) {
				jComboBoxTiposAccionesTipoManoProduEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoManoProduEmpresa")) {
				jComboBoxTiposRelacionesTipoManoProduEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoManoProduEmpresa")) {
				jComboBoxTiposAccionesTipoManoProduEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoManoProduEmpresa")) {
				
				jComboBoxTiposSeleccionarTipoManoProduEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoManoProduEmpresa")) {
				jTextFieldValorCampoGeneralTipoManoProduEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoManoProduEmpresa")) {
				jButtonAbrirOrderByTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoManoProduEmpresa")) {
				jButtonAbrirOrderByTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoManoProduEmpresa")) {
				jButtonCerrarOrderByTipoManoProduEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoManoProduEmpresaBusqueda")) {
				this.jButtonidTipoManoProduEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoManoProduEmpresaUpdate")) {
				this.jButtonid_empresaTipoManoProduEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoManoProduEmpresaBusqueda")) {
				this.jButtonid_empresaTipoManoProduEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoManoProduEmpresaBusqueda")) {
				this.jButtonnombreTipoManoProduEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoManoProduEmpresaBusqueda")) {
				this.jButtondescripcionTipoManoProduEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoManoProduEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoManoProduEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				


				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoManoProduEmpresa tipomanoproduempresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipomanoproduempresaLocal=this.tipomanoproduempresa;
			} else {
				tipomanoproduempresaLocal=this.tipomanoproduempresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
							
				
				


				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoManoProduEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
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
			
			


			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoManoProduEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
								
						
				


				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
								
				
				


				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoManoProduEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoManoProduEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoManoProduEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
							
				
				


				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoManoProduEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
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
			
			


			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoManoProduEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
								
				
				


				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoManoProduEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoManoProduEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoManoProduEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoManoProduEmpresa")) {
					jCheckBoxSeleccionarTodosTipoManoProduEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoManoProduEmpresa")) {
					jCheckBoxSeleccionadosTipoManoProduEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoManoProduEmpresa")) {
					
				}
				
				


				
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
												
				
				


				
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoManoProduEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoManoProduEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
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
			
			


			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoManoProduEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomanoproduempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomanoproduempresa);
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
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
				
				


				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoManoProduEmpresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoManoProduEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoManoProduEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomanoproduempresaAnterior =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoManoProduEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoManoProduEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoManoProduEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipomanoproduempresa =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipomanoproduempresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoManoProduEmpresa")) {
				
				}
				
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoManoProduEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoManoProduEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoManoProduEmpresa")) {
			
			}
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoManoProduEmpresa();
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoManoProduEmpresa")) {
				jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoManoProduEmpresa")) {
				jButtonDuplicarTipoManoProduEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoManoProduEmpresa")) {
				jButtonCopiarTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoManoProduEmpresa")) {
				jButtonVerFormTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoManoProduEmpresa")) {
				jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoManoProduEmpresa")) {
				jButtonModificarTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoManoProduEmpresa")) {
				jButtonActualizarTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoManoProduEmpresa")) {
				jButtonEliminarTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoManoProduEmpresa")) {
				jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoManoProduEmpresa")) {
				jButtonCancelarTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoManoProduEmpresa")) {
				jButtonCerrarTipoManoProduEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoManoProduEmpresa")) {
				jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoManoProduEmpresa")) {
				jButtonNuevoGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoManoProduEmpresa")) {
				jButtonAbrirOrderByTipoManoProduEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoManoProduEmpresa")) {
				jButtonRecargarInformacionTipoManoProduEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoManoProduEmpresa")) {
				jButtonAnterioresTipoManoProduEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoManoProduEmpresa")) {
				jButtonSiguientesTipoManoProduEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoManoProduEmpresaBusqueda")) {
				this.jButtonidTipoManoProduEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoManoProduEmpresaUpdate")) {
				this.jButtonid_empresaTipoManoProduEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoManoProduEmpresaBusqueda")) {
				this.jButtonid_empresaTipoManoProduEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoManoProduEmpresaBusqueda")) {
				this.jButtonnombreTipoManoProduEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoManoProduEmpresaBusqueda")) {
				this.jButtondescripcionTipoManoProduEmpresaBusquedaActionPerformed(evt);
			}
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoManoProduEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoManoProduEmpresa")) {
				closingInternalFrameTipoManoProduEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarTipoManoProduEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoManoProduEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            TipoManoProduEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoManoProduEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoManoProduEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoManoProduEmpresaActionPerformed(null);
			}
			
			TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomanoproduempresa,new Object(),this.tipomanoproduempresaParameterGeneral,this.tipomanoproduempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoManoProduEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoManoProduEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoManoProduEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipomanoproduempresa)) {
			if(!esControlTabla) {
				if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);			
				}
				
				if(this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomanoproduempresaReturnGeneral=tipomanoproduempresaLogic.procesarEventosTipoManoProduEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomanoproduempresaLogic.getTipoManoProduEmpresas(),this.tipomanoproduempresa,this.tipomanoproduempresaParameterGeneral,this.isEsNuevoTipoManoProduEmpresa,classes);//this.tipomanoproduempresaLogic.getTipoManoProduEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoManoProduEmpresa(this.tipomanoproduempresaReturnGeneral,this.tipomanoproduempresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoManoProduEmpresa(classes,this.tipomanoproduempresaReturnGeneral,this.tipomanoproduempresaBean,false);
					}
						
					if(this.tipomanoproduempresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoManoProduEmpresa(this.tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoManoProduEmpresa(this.tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresa());	
					}
						
					if(this.tipomanoproduempresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoManoProduEmpresa(this.tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresa(),classes);//this.tipomanoproduempresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoManoProduEmpresa(this.tipomanoproduempresa,classes);//this.tipomanoproduempresaBean);									
				}
			
				if(TipoManoProduEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoManoProduEmpresa(this.tipomanoproduempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoManoProduEmpresa(this.tipomanoproduempresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipomanoproduempresaAnterior!=null) {
						this.tipomanoproduempresa=this.tipomanoproduempresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomanoproduempresaReturnGeneral=tipomanoproduempresaLogic.procesarEventosTipoManoProduEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomanoproduempresaLogic.getTipoManoProduEmpresas(),this.tipomanoproduempresa,this.tipomanoproduempresaParameterGeneral,this.isEsNuevoTipoManoProduEmpresa,classes);//this.tipomanoproduempresaLogic.getTipoManoProduEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresa(),tipomanoproduempresaLogic.getTipoManoProduEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresa(),this.tipomanoproduempresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoManoProduEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoManoProduEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoManoProduEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoManoProduEmpresa() throws Exception {
		
		TipoManoProduEmpresaModel tipomanoproduempresaModel=(TipoManoProduEmpresaModel)this.jTableDatosTipoManoProduEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomanoproduempresaModel.tipomanoproduempresas=this.tipomanoproduempresaLogic.getTipoManoProduEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipomanoproduempresaModel.tipomanoproduempresas=this.tipomanoproduempresas;
		}
		
		
		((TipoManoProduEmpresaModel) this.jTableDatosTipoManoProduEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoManoProduEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipomanoproduempresaAnterior(),this.tipomanoproduempresaLogic.getTipoManoProduEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipomanoproduempresaAnterior(),this.tipomanoproduempresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoManoProduEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
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
										
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomanoproduempresa,new Object(),generalEntityParameterGeneral,this.tipomanoproduempresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoManoProduEmpresaConstantesFunciones.getClassesRelationshipsOfTipoManoProduEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoManoProduEmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoManoProduEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoManoProduEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomanoproduempresa,new Object(),generalEntityParameterGeneral,this.tipomanoproduempresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoManoProduEmpresa(TipoManoProduEmpresaBean tipomanoproduempresaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoManoProduEmpresa(ArrayList<Classe> classes,TipoManoProduEmpresaReturnGeneral tipomanoproduempresaReturnGeneral,TipoManoProduEmpresaBean tipomanoproduempresaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipomanoproduempresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa = new TipoManoProduEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipomanoproduempresaSessionBean.getConGuardarRelaciones(),this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoManoProduEmpresa);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.tipomanoproduempresaLogic=this.tipomanoproduempresaLogic;
		
		this.cargarCombosFrameForeignKeyTipoManoProduEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoManoProduEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoManoProduEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoManoProduEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoManoProduEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoManoProduEmpresa"));
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonModificarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoManoProduEmpresa"));

		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonModificarToolBarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoManoProduEmpresa"));
					
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemModificarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoManoProduEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonActualizarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoManoProduEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonActualizarToolBarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoManoProduEmpresa"));
						
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemActualizarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoManoProduEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonEliminarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoManoProduEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonEliminarToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoManoProduEmpresa"));
								
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemEliminarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoManoProduEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonCancelarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoManoProduEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonCancelarToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoManoProduEmpresa"));
					
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemCancelarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoManoProduEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemDetalleCerrarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoManoProduEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoManoProduEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoManoProduEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoManoProduEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonidTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoManoProduEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonid_empresaTipoManoProduEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoManoProduEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonid_empresaTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoManoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonnombreTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoManoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtondescripcionTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoManoProduEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTabbedPaneRelacionesTipoManoProduEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoManoProduEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoManoProduEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoManoProduEmpresa"));
		}
		
		this.jTableDatosTipoManoProduEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoManoProduEmpresa"));
		
		this.jTableDatosTipoManoProduEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoManoProduEmpresa"));
		
		this.jButtonNuevoTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"NuevoTipoManoProduEmpresa"));
		
		this.jButtonDuplicarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarTipoManoProduEmpresa"));
		
		this.jButtonCopiarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"CopiarTipoManoProduEmpresa"));
		
		this.jButtonVerFormTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"VerFormTipoManoProduEmpresa"));
		
		
		this.jButtonNuevoToolBarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoManoProduEmpresa"));
			
		this.jButtonDuplicarToolBarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoManoProduEmpresa"));
			
		this.jMenuItemNuevoTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoManoProduEmpresa"));
			
		this.jMenuItemDuplicarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoManoProduEmpresa"));		
		
		
		this.jButtonNuevoRelacionesTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoManoProduEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoManoProduEmpresa"));
			
		this.jMenuItemNuevoRelacionesTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoManoProduEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonModificarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoManoProduEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonModificarToolBarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoManoProduEmpresa"));
			
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemModificarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoManoProduEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonActualizarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoManoProduEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonActualizarToolBarTipoManoProduEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoManoProduEmpresa"));
				
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemActualizarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoManoProduEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonEliminarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoManoProduEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonEliminarToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoManoProduEmpresa"));
						
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemEliminarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoManoProduEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonCancelarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoManoProduEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonCancelarToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoManoProduEmpresa"));
			
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemCancelarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoManoProduEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoManoProduEmpresa"));		
		
		
		this.jButtonCerrarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"CerrarTipoManoProduEmpresa"));
		
		
		this.jButtonCerrarToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoManoProduEmpresa"));
			
		this.jMenuItemCerrarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoManoProduEmpresa"));
			
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jMenuItemDetalleCerrarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoManoProduEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoManoProduEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoManoProduEmpresa"));
		}
		
		this.jButtonCopiarToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoManoProduEmpresa"));
			
		this.jButtonVerFormToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoManoProduEmpresa"));
		
		this.jMenuItemGuardarCambiosTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoManoProduEmpresa"));
			
		this.jMenuItemCopiarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoManoProduEmpresa"));		
		
		this.jMenuItemVerFormTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoManoProduEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoManoProduEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoManoProduEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoManoProduEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoManoProduEmpresa"));
					
		this.jButtonRecargarInformacionToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoManoProduEmpresa"));
		
		this.jMenuItemRecargarInformacionTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoManoProduEmpresa"));		
		
		
		
		this.jButtonAnterioresTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresTipoManoProduEmpresa"));
		
		
		this.jButtonAnterioresToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoManoProduEmpresa"));
		
		this.jMenuItemAnterioresTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoManoProduEmpresa"));		
		
		
		this.jButtonSiguientesTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesTipoManoProduEmpresa"));
		
		
		this.jButtonSiguientesToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoManoProduEmpresa"));
			
		this.jMenuItemSiguientesTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoManoProduEmpresa"));
			
		this.jMenuItemAbrirOrderByTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoManoProduEmpresa"));
			
		this.jMenuItemMostrarOcultarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoManoProduEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoManoProduEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoManoProduEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoManoProduEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoManoProduEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoManoProduEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoManoProduEmpresa"));

		this.jCheckBoxSeleccionadosTipoManoProduEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoManoProduEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoManoProduEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoManoProduEmpresa"));
			
		this.jComboBoxTiposAccionesTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoManoProduEmpresa"));
					
		this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoManoProduEmpresa"));
			
		this.jTextFieldValorCampoGeneralTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoManoProduEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonidTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoManoProduEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonid_empresaTipoManoProduEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoManoProduEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonid_empresaTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoManoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonnombreTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoManoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtondescripcionTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoManoProduEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoManoProduEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoManoProduEmpresa"));
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoManoProduEmpresa"));
				this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoManoProduEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoManoProduEmpresa"));				
			//this.jButtonGenerarReporteDinamicoTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoManoProduEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoManoProduEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoManoProduEmpresa!=null) {
				this.jInternalFrameImportacionTipoManoProduEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoManoProduEmpresa"));
				this.jInternalFrameImportacionTipoManoProduEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoManoProduEmpresa"));
				this.jInternalFrameImportacionTipoManoProduEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoManoProduEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoManoProduEmpresa"));
			
			this.jButtonAbrirOrderByToolBarTipoManoProduEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoManoProduEmpresa"));			
			
			if(this.jInternalFrameOrderByTipoManoProduEmpresa!=null) {
				this.jInternalFrameOrderByTipoManoProduEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoManoProduEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTabbedPaneRelacionesTipoManoProduEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoManoProduEmpresa"));
		
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
            		closingInternalFrameTipoManoProduEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoManoProduEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            TipoManoProduEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoManoProduEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoManoProduEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoManoProduEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoManoProduEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoManoProduEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoManoProduEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoManoProduEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoManoProduEmpresa";
		inputMap = this.jButtonNuevoTipoManoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoManoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoManoProduEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoManoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoManoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoManoProduEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoManoProduEmpresa";
		inputMap = this.jButtonModificarTipoManoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoManoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoManoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoManoProduEmpresa";
		inputMap = this.jButtonActualizarTipoManoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoManoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoManoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoManoProduEmpresa";
		inputMap = this.jButtonEliminarTipoManoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoManoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoManoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoManoProduEmpresa";
		inputMap = this.jButtonCancelarTipoManoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoManoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoManoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoManoProduEmpresa";
		inputMap = this.jButtonCerrarTipoManoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoManoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoManoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoManoProduEmpresa";
		inputMap = this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosTipoManoProduEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonGuardarCambiosTipoManoProduEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoManoProduEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoManoProduEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoManoProduEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoManoProduEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoManoProduEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoManoProduEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonidTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoManoProduEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonid_empresaTipoManoProduEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoManoProduEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonid_empresaTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoManoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtonnombreTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoManoProduEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jButtondescripcionTipoManoProduEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoManoProduEmpresaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoManoProduEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoManoProduEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoManoProduEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoManoProduEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
					tipomanoproduempresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresas) {
					tipomanoproduempresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoManoProduEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoManoProduEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
						tipomanoproduempresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresas) {
						tipomanoproduempresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoManoProduEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoManoProduEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoManoProduEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoManoProduEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoManoProduEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoManoProduEmpresa.getSelectedRows();
			
			TipoManoProduEmpresa tipomanoproduempresaLocal=new TipoManoProduEmpresa();
			
			//this.seleccionarTodosTipoManoProduEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomanoproduempresaLocal =(TipoManoProduEmpresa) this.tipomanoproduempresaLogic.getTipoManoProduEmpresas().toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipomanoproduempresaLocal =(TipoManoProduEmpresa) this.tipomanoproduempresas.toArray()[this.jTableDatosTipoManoProduEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipomanoproduempresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
						tipomanoproduempresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresas) {
						tipomanoproduempresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoManoProduEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoManoProduEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoManoProduEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoManoProduEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoManoProduEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoManoProduEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoManoProduEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoManoProduEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
				
						if(sTipoSeleccionar.equals(TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomanoproduempresaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipomanoproduempresaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresas) {
					
						if(sTipoSeleccionar.equals(TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomanoproduempresaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipomanoproduempresaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoManoProduEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoManoProduEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoManoProduEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoManoProduEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoManoProduEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoManoProduEmpresa(conSplash);
				
					this.generarReporteTipoManoProduEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoManoProduEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoManoProduEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoManoProduEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoManoProduEmpresa();
				
				this.exportarTipoManoProduEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoManoProduEmpresas();
				//this.importarTipoManoProduEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoManoProduEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoManoProduEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoManoProduEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoManoProduEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoManoProduEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoManoProduEmpresaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoManoProduEmpresa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoManoProduEmpresa(conSplash);
					
						//this.actualizarParametrosGeneralTipoManoProduEmpresa();
						
						this.generarReporteProcesoAccionTipoManoProduEmpresasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Mano Obra Produccion EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoManoProduEmpresa();
				
						this.actualizarParametrosGeneralTipoManoProduEmpresa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipomanoproduempresaReturnGeneral=tipomanoproduempresaLogic.procesarAccionTipoManoProduEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipomanoproduempresaLogic.getTipoManoProduEmpresas(),this.tipomanoproduempresaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoManoProduEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoManoProduEmpresa();
					
					TipoManoProduEmpresaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoManoProduEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoManoProduEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoManoProduEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoManoProduEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoManoProduEmpresa();
			
			if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();		
			TipoManoProduEmpresa tipomanoproduempresa=new TipoManoProduEmpresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoManoProduEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoManoProduEmpresa.getSelectedItem();
			
			
			
			
			tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipomanoproduempresasSeleccionados.size()==1) {
				for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresasSeleccionados) {
					tipomanoproduempresa=tipomanoproduempresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoManoProduEmpresa();
			
      		//this.finishProcessTipoManoProduEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoManoProduEmpresaReturnGeneral() throws Exception {
		if(this.tipomanoproduempresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipomanoproduempresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipomanoproduempresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipomanoproduempresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipomanoproduempresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipomanoproduempresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoManoProduEmpresa(false);
		}
		
		if(this.tipomanoproduempresaReturnGeneral.getConRetornoLista() || this.tipomanoproduempresaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipomanoproduempresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomanoproduempresaLogic.setTipoManoProduEmpresas(this.tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipomanoproduempresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomanoproduempresaLogic.setTipoManoProduEmpresa(this.tipomanoproduempresaReturnGeneral.getTipoManoProduEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoManoProduEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoManoProduEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<TipoManoProduEmpresa> getTipoManoProduEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoManoProduEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresaLogic.getTipoManoProduEmpresas()) {
					if(tipomanoproduempresaAux.getIsSelected()) {
						tipomanoproduempresasSeleccionados.add(tipomanoproduempresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoManoProduEmpresa tipomanoproduempresaAux:this.tipomanoproduempresas) {
					if(tipomanoproduempresaAux.getIsSelected()) {
						tipomanoproduempresasSeleccionados.add(tipomanoproduempresaAux);				
					}
				}
			}
			
			if(tipomanoproduempresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipomanoproduempresasSeleccionados.addAll(this.tipomanoproduempresaLogic.getTipoManoProduEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipomanoproduempresasSeleccionados.addAll(this.tipomanoproduempresas);				
					}
				}
			}
		} else {
			tipomanoproduempresasSeleccionados.add(this.tipomanoproduempresa);
		}
		
		return tipomanoproduempresasSeleccionados;
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
	
	public void generarReporteTipoManoProduEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoManoProduEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoManoProduEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoManoProduEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoManoProduEmpresasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Mano Obra Produccion Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoManoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();		
		
		tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoManoProduEmpresas("Todos",tipomanoproduempresasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoManoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();		
		
		tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoManoProduEmpresas("Todos",tipomanoproduempresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoManoProduEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();
		
		tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoManoProduEmpresas("Todos",tipomanoproduempresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoManoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoManoProduEmpresa();
		
		
		tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoManoProduEmpresa();
		
		
		//this.generarReporteTipoManoProduEmpresas("Todos",tipomanoproduempresasSeleccionados ,tipomanoproduempresaImplementable,tipomanoproduempresaImplementableHome);
	}
	
	public void mostrarImportacionTipoManoProduEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoManoProduEmpresa();
		
		this.abrirFrameImportacionTipoManoProduEmpresa();		
		
			
		//this.generarReporteTipoManoProduEmpresas("Todos",tipomanoproduempresasSeleccionados ,tipomanoproduempresaImplementable,tipomanoproduempresaImplementableHome);
	}
	
	public void importarTipoManoProduEmpresas() throws Exception {		
	
	}
	
	public void exportarTipoManoProduEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoManoProduEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoManoProduEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoManoProduEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Mano Obra Produccion Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoManoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();		
		
		tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomanoproduempresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoManoProduEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoManoProduEmpresa(tipomanoproduempresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipomanoproduempresaAux.setsDetalleGeneralEntityReporte(tipomanoproduempresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoManoProduEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoManoProduEmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoManoProduEmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipomanoproduempresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomanoproduempresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomanoproduempresa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomanoproduempresa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomanoproduempresa.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoManoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();		
		
		tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomanoproduempresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoManoProduEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoManoProduEmpresa(row);				
				iRow++;
			}				
			
			for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoManoProduEmpresa(tipomanoproduempresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoManoProduEmpresasSeleccionados() throws Exception {
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();		
		
		tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomanoproduempresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipomanoproduempresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipomanoproduempresa");
			//elementRoot.appendChild(element);
		
			for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresasSeleccionados) {
				element = document.createElement("tipomanoproduempresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoManoProduEmpresa(tipomanoproduempresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mano Obra Produccion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoManoProduEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipomanoproduempresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomanoproduempresa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomanoproduempresa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomanoproduempresa.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoManoProduEmpresa(TipoManoProduEmpresa tipomanoproduempresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoManoProduEmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipomanoproduempresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoManoProduEmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipomanoproduempresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoManoProduEmpresaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipomanoproduempresa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoManoProduEmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipomanoproduempresa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoManoProduEmpresaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipomanoproduempresa.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoManoProduEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados=new ArrayList<TipoManoProduEmpresa>();
		
		tipomanoproduempresasSeleccionados=this.getTipoManoProduEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoManoProduEmpresa(tipomanoproduempresasSeleccionados);
		
		this.generarReporteTipoManoProduEmpresas("Todos",tipomanoproduempresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoManoProduEmpresa(ArrayList<TipoManoProduEmpresa> tipomanoproduempresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresasSeleccionados) {
				tipomanoproduempresaAux.setsDetalleGeneralEntityReporte(tipomanoproduempresaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipomanoproduempresaAux.setsDescripcionGeneralEntityReporte1(tipomanoproduempresaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipomanoproduempresaAux.setsDescripcionGeneralEntityReporte1(tipomanoproduempresaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipomanoproduempresaAux.setsDescripcionGeneralEntityReporte1(tipomanoproduempresaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoManoProduEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoManoProduEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaModificarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaModificarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaModificarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaModificarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaModificarTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoManoProduEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoManoProduEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoManoProduEmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=true;
		} else {
			this.actualizarEstadoPanelsTipoManoProduEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoManoProduEmpresa=false;
			//this.isVisibilidadCeldaVerFormTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoManoProduEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoManoProduEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
			if(!tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=false;												
			}
			
			this.jButtonCerrarTipoManoProduEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoManoProduEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.tipomanoproduempresa)) {
			this.isVisibilidadCeldaActualizarTipoManoProduEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoManoProduEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoManoProduEmpresa() {
	}
	
	public void actualizarEstadoPanelsTipoManoProduEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoManoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoManoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoManoProduEmpresa!=null) {
				this.jPanelPaginacionTipoManoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoManoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoManoProduEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoManoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoManoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoManoProduEmpresa!=null) {
				this.jPanelPaginacionTipoManoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoManoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoManoProduEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoManoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoManoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoManoProduEmpresa!=null) {
				this.jPanelPaginacionTipoManoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoManoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoManoProduEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoManoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoManoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoManoProduEmpresa!=null) {
				this.jPanelPaginacionTipoManoProduEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoManoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoManoProduEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoManoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoManoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoManoProduEmpresa!=null) {
				this.jPanelPaginacionTipoManoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoManoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoManoProduEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoManoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoManoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoManoProduEmpresa!=null) {
				this.jPanelPaginacionTipoManoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoManoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoManoProduEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoManoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoManoProduEmpresa!=null) {
				this.jScrollPanelDatosTipoManoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoManoProduEmpresa!=null) {
				this.jPanelPaginacionTipoManoProduEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoManoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoManoProduEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoManoProduEmpresa!=null) {
					this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoManoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoManoProduEmpresa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoManoProduEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoManoProduEmpresa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoManoProduEmpresa!=null) {
				this.jPanelParametrosReportesTipoManoProduEmpresa.setVisible(true);
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
		
		//TipoManoProduEmpresaSessionBean tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean();
		
		if(this.tipomanoproduempresaSessionBean==null) {
			this.tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean();
		}
		
		this.tipomanoproduempresaSessionBean.setsUltimaBusquedaTipoManoProduEmpresa(this.getsAccionBusqueda());
		this.tipomanoproduempresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipomanoproduempresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipomanoproduempresaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoManoProduEmpresaSessionBean tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean();
		
		if(this.tipomanoproduempresaSessionBean==null) {
			this.tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean();
		}
		
		if(this.tipomanoproduempresaSessionBean.getsUltimaBusquedaTipoManoProduEmpresa()!=null&&!this.tipomanoproduempresaSessionBean.getsUltimaBusquedaTipoManoProduEmpresa().equals("")) {
			this.setsAccionBusqueda(tipomanoproduempresaSessionBean.getsUltimaBusquedaTipoManoProduEmpresa());
			this.setiNumeroPaginacion(tipomanoproduempresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipomanoproduempresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipomanoproduempresaSessionBean.getid_empresa());
				tipomanoproduempresaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipomanoproduempresaSessionBean.setsUltimaBusquedaTipoManoProduEmpresa("");
		this.tipomanoproduempresaSessionBean.setiNumeroPaginacion(TipoManoProduEmpresaConstantesFunciones.INUMEROPAGINACION);
		this.tipomanoproduempresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoManoProduEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoManoProduEmpresa() {
		this.updateBorderResaltarBusquedasFormularioTipoManoProduEmpresa();
		this.updateVisibilidadBusquedasFormularioTipoManoProduEmpresa();
		this.updateHabilitarBusquedasFormularioTipoManoProduEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoManoProduEmpresa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoManoProduEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoManoProduEmpresa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoManoProduEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoManoProduEmpresa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoManoProduEmpresa.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoManoProduEmpresa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoManoProduEmpresa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoManoProduEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoManoProduEmpresa();
		this.updateVisibilidadResaltarControlesFormularioTipoManoProduEmpresa();
		this.updateHabilitarResaltarControlesFormularioTipoManoProduEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoManoProduEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipomanoproduempresaConstantesFunciones.resaltaridTipoManoProduEmpresa!=null && this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.setBorder(this.tipomanoproduempresaConstantesFunciones.resaltaridTipoManoProduEmpresa);}
		if(this.tipomanoproduempresaConstantesFunciones.resaltarid_empresaTipoManoProduEmpresa!=null && this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.setBorder(this.tipomanoproduempresaConstantesFunciones.resaltarid_empresaTipoManoProduEmpresa);}
		if(this.tipomanoproduempresaConstantesFunciones.resaltarnombreTipoManoProduEmpresa!=null && this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreanombreTipoManoProduEmpresa.setBorder(this.tipomanoproduempresaConstantesFunciones.resaltarnombreTipoManoProduEmpresa);}
		if(this.tipomanoproduempresaConstantesFunciones.resaltardescripcionTipoManoProduEmpresa!=null && this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreadescripcionTipoManoProduEmpresa.setBorder(this.tipomanoproduempresaConstantesFunciones.resaltardescripcionTipoManoProduEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoManoProduEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.setVisible(this.tipomanoproduempresaConstantesFunciones.mostraridTipoManoProduEmpresa);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jPanelidTipoManoProduEmpresa.setVisible(this.tipomanoproduempresaConstantesFunciones.mostraridTipoManoProduEmpresa);
		//this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.setVisible(this.tipomanoproduempresaConstantesFunciones.mostrarid_empresaTipoManoProduEmpresa);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jPanelid_empresaTipoManoProduEmpresa.setVisible(this.tipomanoproduempresaConstantesFunciones.mostrarid_empresaTipoManoProduEmpresa);
		//this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreanombreTipoManoProduEmpresa.setVisible(this.tipomanoproduempresaConstantesFunciones.mostrarnombreTipoManoProduEmpresa);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jPanelnombreTipoManoProduEmpresa.setVisible(this.tipomanoproduempresaConstantesFunciones.mostrarnombreTipoManoProduEmpresa);
		//this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreadescripcionTipoManoProduEmpresa.setVisible(this.tipomanoproduempresaConstantesFunciones.mostrardescripcionTipoManoProduEmpresa);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jPaneldescripcionTipoManoProduEmpresa.setVisible(this.tipomanoproduempresaConstantesFunciones.mostrardescripcionTipoManoProduEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoManoProduEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoManoProduEmpresa!=null) {
	
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jLabelidTipoManoProduEmpresa.setEnabled(this.tipomanoproduempresaConstantesFunciones.activaridTipoManoProduEmpresa);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jComboBoxid_empresaTipoManoProduEmpresa.setEnabled(this.tipomanoproduempresaConstantesFunciones.activarid_empresaTipoManoProduEmpresa);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreanombreTipoManoProduEmpresa.setEnabled(this.tipomanoproduempresaConstantesFunciones.activarnombreTipoManoProduEmpresa);
		this.jInternalFrameDetalleFormTipoManoProduEmpresa.jTextAreadescripcionTipoManoProduEmpresa.setEnabled(this.tipomanoproduempresaConstantesFunciones.activardescripcionTipoManoProduEmpresa);
		}
	}
	
		
}