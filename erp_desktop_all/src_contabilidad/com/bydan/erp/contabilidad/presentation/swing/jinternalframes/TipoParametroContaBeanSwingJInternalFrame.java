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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.TipoParametroContaConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoParametroContaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoParametroContaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoParametroContaBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class TipoParametroContaBeanSwingJInternalFrame extends TipoParametroContaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoParametroContaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoParametroConta> tipoparametrocontaValidator = new ClassValidator<TipoParametroConta>(TipoParametroConta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoParametroConta tipoparametroconta;	
	public TipoParametroConta tipoparametrocontaAux;
	public TipoParametroConta tipoparametrocontaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoParametroConta tipoparametrocontaTotales;
	public Long idTipoParametroContaActual;
	public Long iIdNuevoTipoParametroConta=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosParametroContaDetalle=false;

	public Boolean getIsTienePermisosParametroContaDetalle() {
		return isTienePermisosParametroContaDetalle;
	}

	public void setIsTienePermisosParametroContaDetalle(Boolean isTienePermisosParametroContaDetalle) {
		this.isTienePermisosParametroContaDetalle= isTienePermisosParametroContaDetalle;
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
	
	public Boolean isPermisoTodoTipoParametroConta;
	public Boolean isPermisoNuevoTipoParametroConta;
	public Boolean isPermisoActualizarTipoParametroConta;
	public Boolean isPermisoActualizarOriginalTipoParametroConta;
	public Boolean isPermisoEliminarTipoParametroConta;
	public Boolean isPermisoGuardarCambiosTipoParametroConta;
	public Boolean isPermisoConsultaTipoParametroConta;
	public Boolean isPermisoBusquedaTipoParametroConta;
	public Boolean isPermisoReporteTipoParametroConta;
	public Boolean isPermisoPaginacionMedioTipoParametroConta;
	public Boolean isPermisoPaginacionAltoTipoParametroConta;
	public Boolean isPermisoPaginacionTodoTipoParametroConta;
	public Boolean isPermisoCopiarTipoParametroConta;
	public Boolean isPermisoVerFormTipoParametroConta;
	public Boolean isPermisoDuplicarTipoParametroConta;
	public Boolean isPermisoOrdenTipoParametroConta;
	
	
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
	
	public TipoParametroContaParameterReturnGeneral tipoparametrocontaReturnGeneral;
	public TipoParametroContaParameterReturnGeneral tipoparametrocontaParameterGeneral;
	
	

	public ParametroContaDetalleLogic parametrocontadetalleLogic=null;

	public ParametroContaDetalleLogic getParametroContaDetalleLogic() {
		return parametrocontadetalleLogic;
	}

	public void setParametroContaDetalleLogic(ParametroContaDetalleLogic parametrocontadetalleLogic) {
		this.parametrocontadetalleLogic = parametrocontadetalleLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoParametroConta=false;
	public Boolean esParaAccionDesdeFormularioTipoParametroConta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoParametroContaSessionBeanAdditional tipoparametrocontaSessionBeanAdditional=null;
	
	public TipoParametroContaSessionBeanAdditional getTipoParametroContaSessionBeanAdditional() {
		return this.tipoparametrocontaSessionBeanAdditional;
	}
	
	public void setTipoParametroContaSessionBeanAdditional(TipoParametroContaSessionBeanAdditional tipoparametrocontaSessionBeanAdditional) {
		try {
			this.tipoparametrocontaSessionBeanAdditional=tipoparametrocontaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoParametroContaBeanSwingJInternalFrameAdditional tipoparametrocontaBeanSwingJInternalFrameAdditional=null;
	//public class TipoParametroContaBeanSwingJInternalFrame
	
	public TipoParametroContaBeanSwingJInternalFrameAdditional getTipoParametroContaBeanSwingJInternalFrameAdditional() {
		return this.tipoparametrocontaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoParametroContaBeanSwingJInternalFrameAdditional(TipoParametroContaBeanSwingJInternalFrameAdditional tipoparametrocontaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoparametrocontaBeanSwingJInternalFrameAdditional=tipoparametrocontaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoParametroContaLogic tipoparametrocontaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoParametroConta tipoparametrocontaBean;
	public TipoParametroContaConstantesFunciones tipoparametrocontaConstantesFunciones;
	//public TipoParametroContaParameterReturnGeneral tipoparametrocontaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoParametroConta> tipoparametrocontas;	
	//public List<TipoParametroConta> tipoparametrocontasEliminados;
	//public List<TipoParametroConta> tipoparametrocontasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoParametroConta=false;
	public Boolean isVisibilidadCeldaDuplicarTipoParametroConta=true;
	public Boolean isVisibilidadCeldaCopiarTipoParametroConta=true;
	public Boolean isVisibilidadCeldaVerFormTipoParametroConta=true;
	public Boolean isVisibilidadCeldaOrdenTipoParametroConta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoParametroConta=false;
	public Boolean isVisibilidadCeldaModificarTipoParametroConta=false;
	public Boolean isVisibilidadCeldaActualizarTipoParametroConta=false;
	public Boolean isVisibilidadCeldaEliminarTipoParametroConta=false;
	public Boolean isVisibilidadCeldaCancelarTipoParametroConta=false;
	public Boolean isVisibilidadCeldaGuardarTipoParametroConta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoParametroConta=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoParametroConta() {
		return this.iIdNuevoTipoParametroConta;
	}

	public void setiIdNuevoTipoParametroConta(Long iIdNuevoTipoParametroConta) {
		this.iIdNuevoTipoParametroConta = iIdNuevoTipoParametroConta;
	}
	
	public Long getidTipoParametroContaActual() {
		return this.idTipoParametroContaActual;
	}

	public void setidTipoParametroContaActual(Long idTipoParametroContaActual) {
		this.idTipoParametroContaActual = idTipoParametroContaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoParametroConta gettipoparametroconta() {
		return this.tipoparametroconta;
	}

	public void settipoparametroconta(TipoParametroConta tipoparametroconta) {
		this.tipoparametroconta = tipoparametroconta;
	}
	
	public TipoParametroConta gettipoparametrocontaAux() {
		return this.tipoparametrocontaAux;
	}

	public void settipoparametrocontaAux(TipoParametroConta tipoparametrocontaAux) {
		this.tipoparametrocontaAux = tipoparametrocontaAux;
	}				
	
	public TipoParametroConta gettipoparametrocontaAnterior() {
		return this.tipoparametrocontaAnterior;
	}

	public void settipoparametrocontaAnterior(TipoParametroConta tipoparametrocontaAnterior) {
		this.tipoparametrocontaAnterior = tipoparametrocontaAnterior;
	}	
	
	public TipoParametroConta gettipoparametrocontaTotales() {
		return this.tipoparametrocontaTotales;
	}

	public void settipoparametrocontaTotales(TipoParametroConta tipoparametrocontaTotales) {
		this.tipoparametrocontaTotales = tipoparametrocontaTotales;
	}	
	
	public TipoParametroConta gettipoparametrocontaBean() {
		return this.tipoparametrocontaBean;
	}

	public void settipoparametrocontaBean(TipoParametroConta tipoparametrocontaBean) {
		this.tipoparametrocontaBean = tipoparametrocontaBean;
	}	
	
	public TipoParametroContaParameterReturnGeneral gettipoparametrocontaReturnGeneral() {
		return this.tipoparametrocontaReturnGeneral;
	}

	public void settipoparametrocontaReturnGeneral(TipoParametroContaParameterReturnGeneral tipoparametrocontaReturnGeneral) {
		this.tipoparametrocontaReturnGeneral = tipoparametrocontaReturnGeneral;
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
	
	
	public TipoParametroContaLogic getTipoParametroContaLogic()	{		
		return tipoparametrocontaLogic;
	}

	public void setTipoParametroContaLogic(TipoParametroContaLogic tipoparametrocontaLogic) {
		this.tipoparametrocontaLogic = tipoparametrocontaLogic;
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
	
	public Boolean getIsEsNuevoTipoParametroConta() {
		return isEsNuevoTipoParametroConta;
	}

	public void setIsEsNuevoTipoParametroConta(Boolean isEsNuevoTipoParametroConta) {
		this.isEsNuevoTipoParametroConta = isEsNuevoTipoParametroConta;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoParametroConta() {
		return esParaAccionDesdeFormularioTipoParametroConta;
	}
	
	public void setEsParaAccionDesdeFormularioTipoParametroConta(Boolean esParaAccionDesdeFormularioTipoParametroConta) {
		this.esParaAccionDesdeFormularioTipoParametroConta = esParaAccionDesdeFormularioTipoParametroConta;
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

			if(this.tipoparametrocontaSessionBean==null) {
				this.tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
			}

			if(!this.tipoparametrocontaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoparametrocontaSessionBean.getlidEmpresaActual());
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

					if(this.tipoparametroconta!=null) {
						this.tipoparametroconta.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
						this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoParametroConta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
						if(this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoParametroContaGenerico)throws Exception
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
				jComboBoxid_empresaTipoParametroContaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoParametroContaGenerico!=null && jComboBoxid_empresaTipoParametroContaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoParametroContaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoParametroConta tipoparametroconta,JComboBox jComboBoxid_empresaTipoParametroContaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoParametroContaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoParametroContaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoparametroconta.setid_empresa(empresaAux.getId());
				tipoparametroconta.setempresa_descripcion(TipoParametroContaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoparametroconta.setEmpresa(empresaAux);			}
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

					if(!TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { 
							this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { 
					}

					if(!TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
							this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
							this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoParametroConta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoParametroContaConstantesFunciones.refrescarForeignKeysDescripcionesTipoParametroConta(this.tipoparametrocontaLogic.getTipoParametroContas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoParametroContaConstantesFunciones.refrescarForeignKeysDescripcionesTipoParametroConta(this.tipoparametrocontas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoparametrocontaLogic.setTipoParametroContas(this.tipoparametrocontas);
			tipoparametrocontaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoParametroContaParameterReturnGeneral getTipoParametroContaParameterGeneral() {
		return this.tipoparametrocontaParameterGeneral;
	}
	
	public void setTipoParametroContaParameterGeneral(TipoParametroContaParameterReturnGeneral tipoparametrocontaParameterGeneral) {
		this.tipoparametrocontaParameterGeneral = tipoparametrocontaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoParametroConta() {
		return isPermisoTodoTipoParametroConta;
	}

	public void setIsPermisoTodoTipoParametroConta(Boolean isPermisoTodoTipoParametroConta) {
		this.isPermisoTodoTipoParametroConta = isPermisoTodoTipoParametroConta;
	}

	public Boolean getIsPermisoNuevoTipoParametroConta() {
		return isPermisoNuevoTipoParametroConta;
	}

	public void setIsPermisoNuevoTipoParametroConta(Boolean isPermisoNuevoTipoParametroConta) {
		this.isPermisoNuevoTipoParametroConta = isPermisoNuevoTipoParametroConta;
	}

	public Boolean getIsPermisoActualizarTipoParametroConta() {
		return isPermisoActualizarTipoParametroConta;
	}

	public void setIsPermisoActualizarTipoParametroConta(Boolean isPermisoActualizarTipoParametroConta) {
		this.isPermisoActualizarTipoParametroConta = isPermisoActualizarTipoParametroConta;
	}

	public Boolean getIsPermisoEliminarTipoParametroConta() {
		return isPermisoEliminarTipoParametroConta;
	}

	public void setIsPermisoEliminarTipoParametroConta(Boolean isPermisoEliminarTipoParametroConta) {
		this.isPermisoEliminarTipoParametroConta = isPermisoEliminarTipoParametroConta;
	}

	public Boolean getIsPermisoGuardarCambiosTipoParametroConta() {
		return isPermisoGuardarCambiosTipoParametroConta;
	}

	public void setIsPermisoGuardarCambiosTipoParametroConta(Boolean isPermisoGuardarCambiosTipoParametroConta) {
		this.isPermisoGuardarCambiosTipoParametroConta = isPermisoGuardarCambiosTipoParametroConta;
	}
	
	public Boolean getIsPermisoConsultaTipoParametroConta() {
		return isPermisoConsultaTipoParametroConta;
	}

	public void setIsPermisoConsultaTipoParametroConta(Boolean isPermisoConsultaTipoParametroConta) {
		this.isPermisoConsultaTipoParametroConta = isPermisoConsultaTipoParametroConta;
	}

	public Boolean getIsPermisoBusquedaTipoParametroConta() {
		return isPermisoBusquedaTipoParametroConta;
	}

	public void setIsPermisoBusquedaTipoParametroConta(Boolean isPermisoBusquedaTipoParametroConta) {
		this.isPermisoBusquedaTipoParametroConta = isPermisoBusquedaTipoParametroConta;
	}

	public Boolean getIsPermisoReporteTipoParametroConta() {
		return isPermisoReporteTipoParametroConta;
	}

	public void setIsPermisoReporteTipoParametroConta(Boolean isPermisoReporteTipoParametroConta) {
		this.isPermisoReporteTipoParametroConta = isPermisoReporteTipoParametroConta;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoParametroConta() {
		return isPermisoPaginacionMedioTipoParametroConta;
	}

	public void setIsPermisoPaginacionMedioTipoParametroConta(Boolean isPermisoPaginacionMedioTipoParametroConta) {
		this.isPermisoPaginacionMedioTipoParametroConta = isPermisoPaginacionMedioTipoParametroConta;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoParametroConta() {
		return isPermisoPaginacionTodoTipoParametroConta;
	}

	public void setIsPermisoPaginacionTodoTipoParametroConta(Boolean isPermisoPaginacionTodoTipoParametroConta) {
		this.isPermisoPaginacionTodoTipoParametroConta = isPermisoPaginacionTodoTipoParametroConta;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoParametroConta() {
		return isPermisoPaginacionAltoTipoParametroConta;
	}

	public void setIsPermisoPaginacionAltoTipoParametroConta(Boolean isPermisoPaginacionAltoTipoParametroConta) {
		this.isPermisoPaginacionAltoTipoParametroConta = isPermisoPaginacionAltoTipoParametroConta;
	}
	
	public Boolean getIsPermisoCopiarTipoParametroConta() {
		return isPermisoCopiarTipoParametroConta;
	}

	public void setIsPermisoCopiarTipoParametroConta(Boolean isPermisoCopiarTipoParametroConta) {
		this.isPermisoCopiarTipoParametroConta = isPermisoCopiarTipoParametroConta;
	}
	
	public Boolean getIsPermisoVerFormTipoParametroConta() {
		return isPermisoVerFormTipoParametroConta;
	}

	public void setIsPermisoVerFormTipoParametroConta(Boolean isPermisoVerFormTipoParametroConta) {
		this.isPermisoVerFormTipoParametroConta = isPermisoVerFormTipoParametroConta;
	}
	
	public Boolean getIsPermisoDuplicarTipoParametroConta() {
		return isPermisoDuplicarTipoParametroConta;
	}

	public void setIsPermisoDuplicarTipoParametroConta(Boolean isPermisoDuplicarTipoParametroConta) {
		this.isPermisoDuplicarTipoParametroConta = isPermisoDuplicarTipoParametroConta;
	}
	
	public Boolean getIsPermisoOrdenTipoParametroConta() {
		return isPermisoOrdenTipoParametroConta;
	}

	public void setIsPermisoOrdenTipoParametroConta(Boolean isPermisoOrdenTipoParametroConta) {
		this.isPermisoOrdenTipoParametroConta = isPermisoOrdenTipoParametroConta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoParametroConta() {
		return isVisibilidadCeldaNuevoTipoParametroConta;
	}

	public void setIsVisibilidadCeldaNuevoTipoParametroConta(Boolean isVisibilidadCeldaNuevoTipoParametroConta) {
		this.isVisibilidadCeldaNuevoTipoParametroConta = isVisibilidadCeldaNuevoTipoParametroConta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoParametroConta() {
		return isVisibilidadCeldaDuplicarTipoParametroConta;
	}

	public void setIsVisibilidadCeldaDuplicarTipoParametroConta(Boolean isVisibilidadCeldaDuplicarTipoParametroConta) {
		this.isVisibilidadCeldaDuplicarTipoParametroConta = isVisibilidadCeldaDuplicarTipoParametroConta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoParametroConta() {
		return isVisibilidadCeldaCopiarTipoParametroConta;
	}

	public void setIsVisibilidadCeldaCopiarTipoParametroConta(Boolean isVisibilidadCeldaCopiarTipoParametroConta) {
		this.isVisibilidadCeldaCopiarTipoParametroConta = isVisibilidadCeldaCopiarTipoParametroConta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoParametroConta() {
		return isVisibilidadCeldaVerFormTipoParametroConta;
	}

	public void setIsVisibilidadCeldaVerFormTipoParametroConta(Boolean isVisibilidadCeldaVerFormTipoParametroConta) {
		this.isVisibilidadCeldaVerFormTipoParametroConta = isVisibilidadCeldaVerFormTipoParametroConta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoParametroConta() {
		return isVisibilidadCeldaOrdenTipoParametroConta;
	}

	public void setIsVisibilidadCeldaOrdenTipoParametroConta(Boolean isVisibilidadCeldaOrdenTipoParametroConta) {
		this.isVisibilidadCeldaOrdenTipoParametroConta = isVisibilidadCeldaOrdenTipoParametroConta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoParametroConta() {
		return isVisibilidadCeldaNuevoRelacionesTipoParametroConta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoParametroConta(Boolean isVisibilidadCeldaNuevoRelacionesTipoParametroConta) {
		this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta = isVisibilidadCeldaNuevoRelacionesTipoParametroConta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoParametroConta() {
		return isVisibilidadCeldaModificarTipoParametroConta;
	}

	public void setIsVisibilidadCeldaModificarTipoParametroConta(Boolean isVisibilidadCeldaModificarTipoParametroConta) {
		this.isVisibilidadCeldaModificarTipoParametroConta = isVisibilidadCeldaModificarTipoParametroConta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoParametroConta() {
		return isVisibilidadCeldaActualizarTipoParametroConta;
	}

	public void setIsVisibilidadCeldaActualizarTipoParametroConta(Boolean isVisibilidadCeldaActualizarTipoParametroConta) {
		this.isVisibilidadCeldaActualizarTipoParametroConta = isVisibilidadCeldaActualizarTipoParametroConta;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoParametroConta() {
		return isVisibilidadCeldaEliminarTipoParametroConta;
	}

	public void setIsVisibilidadCeldaEliminarTipoParametroConta(Boolean isVisibilidadCeldaEliminarTipoParametroConta) {
		this.isVisibilidadCeldaEliminarTipoParametroConta = isVisibilidadCeldaEliminarTipoParametroConta;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoParametroConta() {
		return isVisibilidadCeldaCancelarTipoParametroConta;
	}

	public void setIsVisibilidadCeldaCancelarTipoParametroConta(Boolean isVisibilidadCeldaCancelarTipoParametroConta) {
		this.isVisibilidadCeldaCancelarTipoParametroConta = isVisibilidadCeldaCancelarTipoParametroConta;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoParametroConta() {
		return isVisibilidadCeldaGuardarTipoParametroConta;
	}

	public void setIsVisibilidadCeldaGuardarTipoParametroConta(Boolean isVisibilidadCeldaGuardarTipoParametroConta) {
		this.isVisibilidadCeldaGuardarTipoParametroConta = isVisibilidadCeldaGuardarTipoParametroConta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoParametroConta() {
		return isVisibilidadCeldaGuardarCambiosTipoParametroConta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoParametroConta(Boolean isVisibilidadCeldaGuardarCambiosTipoParametroConta) {
		this.isVisibilidadCeldaGuardarCambiosTipoParametroConta = isVisibilidadCeldaGuardarCambiosTipoParametroConta;
	}
		
	public TipoParametroContaSessionBean gettipoparametrocontaSessionBean() {
		return this.tipoparametrocontaSessionBean;
	}
	
	public void settipoparametrocontaSessionBean(TipoParametroContaSessionBean tipoparametrocontaSessionBean) {
		this.tipoparametrocontaSessionBean=tipoparametrocontaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(TipoParametroConta tipoparametroconta)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoparametroconta,null);
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
	
	public void bugActualizarReferenciaActual(TipoParametroConta tipoparametroconta,TipoParametroConta tipoparametrocontaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoParametroConta(tipoparametroconta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoparametrocontaAux.setId(tipoparametroconta.getId());
		tipoparametrocontaAux.setVersionRow(tipoparametroconta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoParametroConta();
		
			int intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoParametroConta(this.tipoparametroconta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoparametrocontaValidator.getInvalidValues(this.tipoparametroconta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoparametrocontaLogic.setDatosCliente(datosCliente);
			tipoparametrocontaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoparametrocontaAux=new  TipoParametroConta();
				
				tipoparametrocontaAux.setIsNew(true);
				tipoparametrocontaAux.setIsChanged(true);
				
				tipoparametrocontaAux.setTipoParametroContaOriginal(this.tipoparametroconta);
				
				tipoparametrocontaAux.setId(this.tipoparametroconta.getId());	
				tipoparametrocontaAux.setVersionRow(this.tipoparametroconta.getVersionRow());	
				tipoparametrocontaAux.setid_empresa(this.tipoparametroconta.getid_empresa());	
				tipoparametrocontaAux.setcodigo(this.tipoparametroconta.getcodigo());	
				tipoparametrocontaAux.setnombre(this.tipoparametroconta.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparametrocontaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoparametrocontaAux,tipoparametrocontaLogic.getTipoParametroContas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparametrocontaAux,tipoparametrocontas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametrocontaLogic.saveTipoParametroContas();//WithConnection
						//tipoparametrocontaLogic.getSetVersionRowTipoParametroContas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparametroconta,tipoparametrocontaAux);
					
					this.refrescarForeignKeysDescripcionesTipoParametroConta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles().addAll(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalles.addAll(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetallesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparametrocontaLogic.saveTipoParametroContaRelaciones(tipoparametrocontaAux,this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles());//WithConnection
								//tipoparametrocontaLogic.getSetVersionRowTipoParametroContas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparametroconta,tipoparametrocontaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.setParametroContaDetalles(new ArrayList<ParametroContaDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalles= new ArrayList<ParametroContaDetalle>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoparametrocontaAux.setParametroContaDetalles(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparametrocontaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparametrocontaAux,tipoparametrocontaLogic.getTipoParametroContas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparametrocontaAux,tipoparametrocontas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparametroconta,tipoparametrocontaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoparametrocontaAux=new  TipoParametroConta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoparametrocontaSessionBean.getEsGuardarRelacionado() && this.tipoparametroconta.getId()>=0)) {
						
					tipoparametrocontaAux.setIsNew(false);
				}
				
				tipoparametrocontaAux.setIsDeleted(false);
			
				tipoparametrocontaAux.setId(this.tipoparametroconta.getId());	
				tipoparametrocontaAux.setVersionRow(this.tipoparametroconta.getVersionRow());	
				tipoparametrocontaAux.setid_empresa(this.tipoparametroconta.getid_empresa());	
				tipoparametrocontaAux.setcodigo(this.tipoparametroconta.getcodigo());	
				tipoparametrocontaAux.setnombre(this.tipoparametroconta.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparametrocontaAux,tipoparametrocontaLogic.getTipoParametroContas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparametrocontaAux,tipoparametrocontas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametrocontaLogic.saveTipoParametroContas();//WithConnection
						//tipoparametrocontaLogic.getSetVersionRowTipoParametroContas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparametroconta,tipoparametrocontaAux);
					
					this.refrescarForeignKeysDescripcionesTipoParametroConta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles().addAll(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalles.addAll(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetallesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparametrocontaLogic.saveTipoParametroContaRelaciones(tipoparametrocontaAux,this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles());//WithConnection
								//tipoparametrocontaLogic.getSetVersionRowTipoParametroContas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparametroconta,tipoparametrocontaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.setParametroContaDetalles(new ArrayList<ParametroContaDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalles= new ArrayList<ParametroContaDetalle>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoparametrocontaAux.setParametroContaDetalles(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparametrocontaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparametrocontaAux,tipoparametrocontaLogic.getTipoParametroContas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparametrocontaAux,tipoparametrocontas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparametroconta,tipoparametrocontaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoparametrocontaAux=new  TipoParametroConta();
				
				tipoparametrocontaAux.setIsNew(false);
				tipoparametrocontaAux.setIsChanged(false);
				
				tipoparametrocontaAux.setIsDeleted(true);
				
				tipoparametrocontaAux.setId(this.tipoparametroconta.getId());	
				tipoparametrocontaAux.setVersionRow(this.tipoparametroconta.getVersionRow());	
				tipoparametrocontaAux.setid_empresa(this.tipoparametroconta.getid_empresa());	
				tipoparametrocontaAux.setcodigo(this.tipoparametroconta.getcodigo());	
				tipoparametrocontaAux.setnombre(this.tipoparametroconta.getnombre());	
				
				if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoparametrocontaAux.getId()>=0) {	
						this.tipoparametrocontasEliminados.add(tipoparametrocontaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoparametrocontaAux,tipoparametrocontaLogic.getTipoParametroContas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparametrocontaAux,tipoparametrocontas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametrocontaLogic.saveTipoParametroContas();//WithConnection
						//tipoparametrocontaLogic.getSetVersionRowTipoParametroContas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles().addAll(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalles.addAll(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetallesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparametrocontaLogic.saveTipoParametroContaRelaciones(tipoparametrocontaAux,this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles());//WithConnection
								//tipoparametrocontaLogic.getSetVersionRowTipoParametroContas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.setParametroContaDetalles(new ArrayList<ParametroContaDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalles= new ArrayList<ParametroContaDetalle>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoparametrocontaAux.setParametroContaDetalles(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoparametrocontaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoparametrocontaAux,tipoparametrocontaLogic.getTipoParametroContas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoparametrocontaAux,tipoparametrocontas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.getTipoParametroContas().addAll(this.tipoparametrocontasEliminados);
					
					tipoparametrocontaLogic.saveTipoParametroContas();//WithConnection
					//tipoparametrocontaLogic.getSetVersionRowTipoParametroContas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoParametroConta();
				
				this.tipoparametrocontasEliminados= new ArrayList<TipoParametroConta>();		
			}
			
			if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Parametro Conta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Parametro Conta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoparametroconta=tipoparametrocontaAux;
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
      		//this.finishProcessTipoParametroConta();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoParametroConta tipoparametrocontaLocal) throws Exception {
		
		if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoparametrocontaLocal.setParametroContaDetalles(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles());
			
			} else {
			
				tipoparametrocontaLocal.setParametroContaDetalles(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalles);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoParametroConta tipoparametrocontaLocal) throws Exception {	
		if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoparametrocontaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoParametroContaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoparametrocontaValidator.getInvalidValues(this.tipoparametroconta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoParametroConta tipoparametroconta,List<TipoParametroConta> tipoparametrocontas) throws Exception {
		try	{		
			TipoParametroContaConstantesFunciones.actualizarLista(tipoparametroconta,tipoparametrocontas,this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoParametroConta tipoparametroconta,List<TipoParametroConta> tipoparametrocontas) throws Exception {
		try	{			
			TipoParametroContaConstantesFunciones.actualizarSelectedLista(tipoparametroconta,tipoparametrocontas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoParametroConta> tipoparametrocontasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoparametrocontasLocal=this.tipoparametrocontaLogic.getTipoParametroContas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoparametrocontasLocal=this.tipoparametrocontas;
			}
			//ARCHITECTURE
		
			for(TipoParametroConta tipoparametrocontaLocal:tipoparametrocontasLocal) {
				if(this.permiteMantenimiento(tipoparametrocontaLocal) && tipoparametrocontaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoParametroContaConstantesFunciones.getTipoParametroContaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoParametroContaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroConta.jLabelid_empresaTipoParametroConta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoParametroContaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroConta.jLabelcodigoTipoParametroConta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoParametroContaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroConta.jLabelnombreTipoParametroConta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoParametroConta.jLabelid_empresaTipoParametroConta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoParametroConta.jLabelcodigoTipoParametroConta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoParametroConta.jLabelnombreTipoParametroConta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroContaDetalle")) {
			if(this.tipoparametroconta==null) {
				this.tipoparametroconta= new TipoParametroConta();
			}

			if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoParametroConta
				this.setVariablesFormularioToObjetoActualTipoParametroConta(this.tipoparametroconta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);

				this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.getparametrocontadetalle().setTipoParametroConta(this.tipoparametroconta);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoParametroConta--;	
		
		
		this.tipoparametrocontaAux=new TipoParametroConta();
		
		this.tipoparametrocontaAux.setId(this.iIdNuevoTipoParametroConta);
		this.tipoparametrocontaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparametrocontaLogic.getTipoParametroContas().add(this.tipoparametrocontaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoparametrocontas.add(this.tipoparametrocontaAux);
		}
		//ARCHITECTURE
		
		this.tipoparametroconta=this.tipoparametrocontaAux;
		
		if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoParametroConta(this.tipoparametroconta);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParametroConta(this.tipoparametroconta);
		}
				
		//this.setDefaultControlesTipoParametroConta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoParametroConta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoParametroConta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParametroConta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParametroConta(this.tipoparametrocontaBean,this.tipoparametroconta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoParametroContaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
			classes=TipoParametroContaConstantesFunciones.getClassesRelationshipsOfTipoParametroConta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoparametrocontaReturnGeneral=tipoparametrocontaLogic.procesarEventosTipoParametroContasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparametrocontaLogic.getTipoParametroContas(),this.tipoparametroconta,this.tipoparametrocontaParameterGeneral,this.isEsNuevoTipoParametroConta,classes);//this.tipoparametrocontaLogic.getTipoParametroConta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoParametroConta(this.tipoparametrocontaReturnGeneral,this.tipoparametrocontaBean,false);
		
		if(this.tipoparametrocontaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParametroConta(this.tipoparametrocontaReturnGeneral.getTipoParametroConta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoParametroConta(this.tipoparametrocontaReturnGeneral.getTipoParametroConta());
		}
		
		if(this.tipoparametrocontaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoParametroConta(this.tipoparametrocontaReturnGeneral.getTipoParametroConta(),classes);//this.tipoparametrocontaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoParametroConta(this.tipoparametroconta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoParametroConta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoParametroConta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.RecargarFormTipoParametroConta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoParametroConta(false);
						
			if(tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.getEsGuardarRelacionado() && ParametroContaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroContaDetalleActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParametroConta();
			}
			
			this.actualizarVisualTableDatosTipoParametroConta();
			
			this.jTableDatosTipoParametroConta.setRowSelectionInterval(this.getIndiceNuevoTipoParametroConta(), this.getIndiceNuevoTipoParametroConta());
			
			this.seleccionarFilaTablaTipoParametroContaActual();
						
			this.actualizarEstadoCeldasBotonesTipoParametroConta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoParametroConta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoParametroConta.jTextFieldcodigoTipoParametroConta.setEnabled(isHabilitar && this.tipoparametrocontaConstantesFunciones.activarcodigoTipoParametroConta);
		this.jInternalFrameDetalleFormTipoParametroConta.jTextAreanombreTipoParametroConta.setEnabled(isHabilitar && this.tipoparametrocontaConstantesFunciones.activarnombreTipoParametroConta);	
		//
		this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.setEnabled(isHabilitar && this.tipoparametrocontaConstantesFunciones.activarid_empresaTipoParametroConta);
	};
	
	public void setDefaultControlesTipoParametroConta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoParametroConta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoparametrocontaSessionBean.setConGuardarRelaciones(true);			
			this.tipoparametrocontaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoParametroConta.jTabbedPaneRelacionesTipoParametroConta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoparametrocontaSessionBean.setConGuardarRelaciones(false);			
			this.tipoparametrocontaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoParametroConta.jTabbedPaneRelacionesTipoParametroConta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoParametroConta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontaLogic.getTipoParametroContas()) {
				if(tipoparametrocontaAux.getId().equals(this.iIdNuevoTipoParametroConta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontas) {
				if(tipoparametrocontaAux.getId().equals(this.iIdNuevoTipoParametroConta)) {
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
	
	public int getIndiceActualTipoParametroConta(TipoParametroConta tipoparametroconta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontaLogic.getTipoParametroContas()) {
				if(tipoparametrocontaAux.getId().equals(tipoparametroconta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontas) {
				if(tipoparametrocontaAux.getId().equals(tipoparametroconta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoParametroConta(TipoParametroConta tipoparametrocontaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontaLogic.getTipoParametroContas()) {
				if(tipoparametrocontaAux.getTipoParametroContaOriginal().getId().equals(tipoparametrocontaOriginal.getId())) {
					existe=true;
					tipoparametrocontaOriginal.setId(tipoparametrocontaAux.getId());
					tipoparametrocontaOriginal.setVersionRow(tipoparametrocontaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontas) {
				if(tipoparametrocontaAux.getTipoParametroContaOriginal().getId().equals(tipoparametrocontaOriginal.getId())) {
					existe=true;
					tipoparametrocontaOriginal.setId(tipoparametrocontaAux.getId());
					tipoparametrocontaOriginal.setVersionRow(tipoparametrocontaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoParametroConta(Boolean esParaCancelar) throws Exception {
		tipoparametrocontasAux=new ArrayList<TipoParametroConta>();
		tipoparametrocontaAux=new TipoParametroConta();
		
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontaLogic.getTipoParametroContas()) {
					if(tipoparametrocontaAux.getId()<0) {
						tipoparametrocontasAux.add(tipoparametrocontaAux);
					}		
				}
				this.iIdNuevoTipoParametroConta=0L;
				this.tipoparametrocontaLogic.getTipoParametroContas().removeAll(tipoparametrocontasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontas) {
					if(tipoparametrocontaAux.getId()<0) {
						tipoparametrocontasAux.add(tipoparametrocontaAux);
					}		
				}
				this.iIdNuevoTipoParametroConta=0L;
				this.tipoparametrocontas.removeAll(tipoparametrocontasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoParametroConta 
					&& this.tipoparametrocontaLogic.getTipoParametroContas().size()>0
					) {
					tipoparametrocontaAux=this.tipoparametrocontaLogic.getTipoParametroContas().get(this.tipoparametrocontaLogic.getTipoParametroContas().size() - 1);
				
					if(tipoparametrocontaAux.getId()<0) {
						this.tipoparametrocontaLogic.getTipoParametroContas().remove(tipoparametrocontaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoParametroConta && this.tipoparametrocontas.size()>0) {
					tipoparametrocontaAux=this.tipoparametrocontas.get(this.tipoparametrocontas.size() - 1);
				
					if(tipoparametrocontaAux.getId()<0) {
						this.tipoparametrocontas.remove(tipoparametrocontaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoParametroConta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoparametroconta.getId()<0) {
				this.tipoparametrocontaLogic.getTipoParametroContas().remove(this.tipoparametroconta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoparametroconta.getId()<0) {
				this.tipoparametrocontas.remove(this.tipoparametroconta);
			}
		}			
	}
	
	public void setEstadosInicialesTipoParametroConta(List<TipoParametroConta> tipoparametrocontasAux) throws Exception {
		TipoParametroContaConstantesFunciones.setEstadosInicialesTipoParametroConta(tipoparametrocontasAux);
	}
	
	public void setEstadosInicialesTipoParametroConta(TipoParametroConta tipoparametrocontaAux) throws Exception {
		TipoParametroContaConstantesFunciones.setEstadosInicialesTipoParametroConta(tipoparametrocontaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoParametroContaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoParametroConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoParametroContaActual()) {
				if(!this.isEsNuevoTipoParametroConta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoParametroConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoParametroConta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoParametroContaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Parametro Conta ?", "MANTENIMIENTO DE Tipo Parametro Conta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoParametroConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoParametroConta tipoparametroconta) throws Exception {
		TipoParametroContaConstantesFunciones.seleccionarAsignar(this.tipoparametroconta,tipoparametroconta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoParametroConta=this.isPermisoActualizarOriginalTipoParametroConta;
			
			
			this.seleccionarAsignar(tipoparametroconta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParametroContaConstantesFunciones.quitarEspaciosTipoParametroConta(this.tipoparametroconta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoParametroConta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoparametrocontaSessionBean.setsFuncionBusquedaRapida(this.tipoparametrocontaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoParametroConta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoParametroConta(esParaCancelar);				
				this.cancelarNuevoTipoParametroConta(esParaCancelar);								
			}
			
			this.tipoparametroconta=new TipoParametroConta();
			
			this.inicializarTipoParametroConta();
			
			this.actualizarEstadoCeldasBotonesTipoParametroConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoParametroConta() throws Exception {
		try {
			TipoParametroContaConstantesFunciones.inicializarTipoParametroConta(this.tipoparametroconta);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoparametrocontaLogic.getTipoParametroContas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoParametroContas(String sAccionBusqueda,List<TipoParametroConta> tipoparametrocontasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoParametroConta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoParametroContaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoParametroContaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoParametroConta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Parametro Contas");		
		parameters.put("busquedapor", TipoParametroContaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroContaDetalle.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoParametroContaLogic tipoparametrocontaLogicAuxiliar=new TipoParametroContaLogic();
					tipoparametrocontaLogicAuxiliar.setDatosCliente(tipoparametrocontaLogic.getDatosCliente());				
					tipoparametrocontaLogicAuxiliar.setTipoParametroContas(tipoparametrocontasParaReportes);
					
					tipoparametrocontaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoParametroContaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoparametrocontasParaReportes=tipoparametrocontaLogicAuxiliar.getTipoParametroContas();
					
					//tipoparametrocontaLogic.getNewConnexionToDeep();
					
					//for (TipoParametroConta tipoparametroconta:tipoparametrocontasParaReportes) {
					//	tipoparametrocontaLogic.deepLoad(tipoparametroconta, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoparametrocontaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoparametrocontaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroContaDetalle = AuxiliarReportes.class.getResourceAsStream("ParametroContaDetalleDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocontadetalle", reportFileParametroContaDetalle);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoParametroConta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoParametroContaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoParametroContaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoParametroConta=new JRBeanArrayDataSource(TipoParametroContaJInternalFrame.TraerTipoParametroContaBeans(tipoparametrocontasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoParametroConta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoParametroContaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoParametroContaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoParametroContaBean.TraerTipoParametroContaBeans(tipoparametrocontasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoParametroContas(sAccionBusqueda,sTipoArchivoReporte,tipoparametrocontasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoParametroContas(sAccionBusqueda,sTipoArchivoReporte,tipoparametrocontasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoParametroContaActionPerformed(null);
					//this.generarExcelReporteTipoParametroContas(sAccionBusqueda,sTipoArchivoReporte,tipoparametrocontasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoParametroContas(sAccionBusqueda,sTipoArchivoReporte,tipoparametrocontasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoParametroContas(sAccionBusqueda,sTipoArchivoReporte,tipoparametrocontasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoParametroContas(sAccionBusqueda,sTipoArchivoReporte,tipoparametrocontasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoParametroContas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParametroConta> tipoparametrocontasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroconta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParametroContas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParametroConta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoParametroConta tipoparametroconta : tipoparametrocontasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoParametroContaConstantesFunciones.generarExcelReporteDataTipoParametroConta("NORMAL",row,workbook,tipoparametroconta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Conta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoParametroConta(String sTipo,Row row,Workbook workbook) {
		
		TipoParametroContaConstantesFunciones.generarExcelReporteHeaderTipoParametroConta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoParametroContas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParametroConta> tipoparametrocontasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroconta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParametroContas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoParametroConta tipoparametroconta : tipoparametrocontasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoParametroContaConstantesFunciones.getTipoParametroContaDescripcion(tipoparametroconta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoparametroconta.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoParametroContaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoparametroconta.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoParametroContaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoparametroconta.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Conta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoParametroContas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParametroConta> tipoparametrocontasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoParametroConta> tipoparametrocontasRespaldo=null;
		
		classes=TipoParametroContaConstantesFunciones.getClassesRelationshipsOfTipoParametroConta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoparametrocontaLogic.setDatosCliente(this.datosCliente);
		this.tipoparametrocontaLogic.setDatosDeep(this.datosDeep);
		this.tipoparametrocontaLogic.setIsConDeep(true);
		
		tipoparametrocontasRespaldo=this.tipoparametrocontaLogic.getTipoParametroContas();
		
		this.tipoparametrocontaLogic.setTipoParametroContas(tipoparametrocontasParaReportes);	
		this.tipoparametrocontaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoparametrocontasParaReportes=this.tipoparametrocontaLogic.getTipoParametroContas();
		this.tipoparametrocontaLogic.setTipoParametroContas(tipoparametrocontasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroconta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParametroContas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParametroConta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoParametroConta tipoparametroconta : tipoparametrocontasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoParametroConta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoParametroContaConstantesFunciones.generarExcelReporteDataTipoParametroConta("NORMAL",row,workbook,tipoparametroconta,cellStyleDataAux);
		
			
			


				//ParametroContaDetalle
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoparametroconta.getParametroContaDetalles()!=null && tipoparametroconta.getParametroContaDetalles().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroContaDetalleConstantesFunciones.generarExcelReporteHeaderParametroContaDetalle("RELACIONADO",row,workbook);
				}

				if(tipoparametroconta.getParametroContaDetalles()!=null) {
					i2=0;
					for(ParametroContaDetalle parametrocontadetalle : tipoparametroconta.getParametroContaDetalles()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroContaDetalleConstantesFunciones.generarExcelReporteDataParametroContaDetalle("RELACIONADO",row,workbook,parametrocontadetalle,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoParametroContaConstantesFunciones.getTipoParametroContaDescripcion(tipoparametroconta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Conta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParametroConta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoParametroConta() throws Exception {		
		this.startProcessTipoParametroConta(true);
	}
	
	public void startProcessTipoParametroConta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoParametroConta ,this.jPanelParametrosReportesTipoParametroConta, this.jScrollPanelDatosTipoParametroConta,this.jPanelPaginacionTipoParametroConta, this.jScrollPanelDatosEdicionTipoParametroConta, this.jPanelAccionesTipoParametroConta,this.jPanelAccionesFormularioTipoParametroConta,this.jmenuBarTipoParametroConta,this.jmenuBarDetalleTipoParametroConta,this.jTtoolBarTipoParametroConta,this.jTtoolBarDetalleTipoParametroConta);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParametroConta=this.jTabbedPaneBusquedasTipoParametroConta; 
		
		final JPanel jPanelParametrosReportesTipoParametroConta=this.jPanelParametrosReportesTipoParametroConta;
		//final JScrollPane jScrollPanelDatosTipoParametroConta=this.jScrollPanelDatosTipoParametroConta;
		final JTable jTableDatosTipoParametroConta=this.jTableDatosTipoParametroConta;		
		final JPanel jPanelPaginacionTipoParametroConta=this.jPanelPaginacionTipoParametroConta;
		//final JScrollPane jScrollPanelDatosEdicionTipoParametroConta=this.jScrollPanelDatosEdicionTipoParametroConta;
		final JPanel jPanelAccionesTipoParametroConta=this.jPanelAccionesTipoParametroConta;
		
		JPanel jPanelCamposAuxiliarTipoParametroConta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoParametroConta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			jPanelCamposAuxiliarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jPanelCamposTipoParametroConta;
			jPanelAccionesFormularioAuxiliarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jPanelAccionesFormularioTipoParametroConta;
		}
		
		final JPanel jPanelCamposTipoParametroConta=jPanelCamposAuxiliarTipoParametroConta;
		final JPanel jPanelAccionesFormularioTipoParametroConta=jPanelAccionesFormularioAuxiliarTipoParametroConta;
		
		
		final JMenuBar jmenuBarTipoParametroConta=this.jmenuBarTipoParametroConta;
		final JToolBar jTtoolBarTipoParametroConta=this.jTtoolBarTipoParametroConta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoParametroConta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParametroConta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			jmenuBarDetalleAuxiliarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jmenuBarDetalleTipoParametroConta;
			jTtoolBarDetalleAuxiliarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jTtoolBarDetalleTipoParametroConta;
		}
		
		final JMenuBar jmenuBarDetalleTipoParametroConta=jmenuBarDetalleAuxiliarTipoParametroConta;
		final JToolBar jTtoolBarDetalleTipoParametroConta=jTtoolBarDetalleAuxiliarTipoParametroConta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParametroConta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParametroConta;
			processRunnable.jTableDatos=jTableDatosTipoParametroConta;
			processRunnable.jPanelCampos=jPanelCamposTipoParametroConta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParametroConta;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParametroConta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParametroConta;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParametroConta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParametroConta;
			processRunnable.jTtoolBar=jTtoolBarTipoParametroConta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParametroConta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParametroConta ,jPanelParametrosReportesTipoParametroConta,jTableDatosTipoParametroConta, /*jScrollPanelDatosTipoParametroConta,*/jPanelCamposTipoParametroConta,jPanelPaginacionTipoParametroConta, /*jScrollPanelDatosEdicionTipoParametroConta,*/ jPanelAccionesTipoParametroConta,jPanelAccionesFormularioTipoParametroConta,jmenuBarTipoParametroConta,jmenuBarDetalleTipoParametroConta,jTtoolBarTipoParametroConta,jTtoolBarDetalleTipoParametroConta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParametroConta ,jPanelParametrosReportesTipoParametroConta, jScrollPanelDatosTipoParametroConta,jPanelPaginacionTipoParametroConta, jScrollPanelDatosEdicionTipoParametroConta, jPanelAccionesTipoParametroConta,jPanelAccionesFormularioTipoParametroConta,jmenuBarTipoParametroConta,jmenuBarDetalleTipoParametroConta,jTtoolBarTipoParametroConta,jTtoolBarDetalleTipoParametroConta);
						
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
	
	public void finishProcessTipoParametroConta() {// throws Exception 
		this.finishProcessTipoParametroConta(true);
	}
	
	public void finishProcessTipoParametroConta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoParametroConta ,this.jPanelParametrosReportesTipoParametroConta, this.jScrollPanelDatosTipoParametroConta,this.jPanelPaginacionTipoParametroConta, this.jScrollPanelDatosEdicionTipoParametroConta, this.jPanelAccionesTipoParametroConta,this.jPanelAccionesFormularioTipoParametroConta,this.jmenuBarTipoParametroConta,this.jmenuBarDetalleTipoParametroConta,this.jTtoolBarTipoParametroConta,this.jTtoolBarDetalleTipoParametroConta);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParametroConta=this.jTabbedPaneBusquedasTipoParametroConta; 
		
		final JPanel jPanelParametrosReportesTipoParametroConta=this.jPanelParametrosReportesTipoParametroConta;
		//final JScrollPane jScrollPanelDatosTipoParametroConta=this.jScrollPanelDatosTipoParametroConta;
		final JTable jTableDatosTipoParametroConta=this.jTableDatosTipoParametroConta;		
		final JPanel jPanelPaginacionTipoParametroConta=this.jPanelPaginacionTipoParametroConta;
		//final JScrollPane jScrollPanelDatosEdicionTipoParametroConta=this.jScrollPanelDatosEdicionTipoParametroConta;
		final JPanel jPanelAccionesTipoParametroConta=this.jPanelAccionesTipoParametroConta;
		
		JPanel jPanelCamposAuxiliarTipoParametroConta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoParametroConta=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			jPanelCamposAuxiliarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jPanelCamposTipoParametroConta;
			jPanelAccionesFormularioAuxiliarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jPanelAccionesFormularioTipoParametroConta;
		}
		
		final JPanel jPanelCamposTipoParametroConta=jPanelCamposAuxiliarTipoParametroConta;
		final JPanel jPanelAccionesFormularioTipoParametroConta=jPanelAccionesFormularioAuxiliarTipoParametroConta;
		
		
		final JMenuBar jmenuBarTipoParametroConta=this.jmenuBarTipoParametroConta;		
		final JToolBar jTtoolBarTipoParametroConta=this.jTtoolBarTipoParametroConta;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoParametroConta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParametroConta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			jmenuBarDetalleAuxiliarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jmenuBarDetalleTipoParametroConta;
			jTtoolBarDetalleAuxiliarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jTtoolBarDetalleTipoParametroConta;		
		}
		
		final JMenuBar jmenuBarDetalleTipoParametroConta=jmenuBarDetalleAuxiliarTipoParametroConta;
		final JToolBar jTtoolBarDetalleTipoParametroConta=jTtoolBarDetalleAuxiliarTipoParametroConta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParametroConta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParametroConta;
			processRunnable.jTableDatos=jTableDatosTipoParametroConta;
			processRunnable.jPanelCampos=jPanelCamposTipoParametroConta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParametroConta;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParametroConta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParametroConta;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParametroConta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParametroConta;
			processRunnable.jTtoolBar=jTtoolBarTipoParametroConta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParametroConta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoParametroConta ,jPanelParametrosReportesTipoParametroConta, jTableDatosTipoParametroConta,/*jScrollPanelDatosTipoParametroConta,*/jPanelCamposTipoParametroConta,jPanelPaginacionTipoParametroConta, /*jScrollPanelDatosEdicionTipoParametroConta,*/ jPanelAccionesTipoParametroConta,jPanelAccionesFormularioTipoParametroConta,jmenuBarTipoParametroConta,jmenuBarDetalleTipoParametroConta,jTtoolBarTipoParametroConta,jTtoolBarDetalleTipoParametroConta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoParametroConta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoParametroConta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoParametroConta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoParametroConta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoParametroConta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoParametroConta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoParametroConta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoParametroConta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoParametroConta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoparametrocontaConstantesFunciones.getsFinalQueryTipoParametroConta();
		String  finalQueryPaginacionTodos=this.tipoparametrocontaConstantesFunciones.getsFinalQueryTipoParametroConta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoParametroContaConstantesFunciones.getArrayColumnasGlobalesNoTipoParametroConta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoParametroContaConstantesFunciones.getArrayColumnasGlobalesTipoParametroConta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoParametroContaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoparametrocontasEliminados= new ArrayList<TipoParametroConta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoParametroConta();
		
				///*TipoParametroContaSessionBean*/this.tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
			
			if(this.tipoparametrocontaSessionBean==null) {
				this.tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
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
					this.iNumeroPaginacion=TipoParametroContaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoParametroContaConstantesFunciones.getClassesForeignKeysOfTipoParametroConta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoparametroconta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoparametrocontasAux= new ArrayList<TipoParametroConta>();
			
				
			tipoparametrocontaLogic.setDatosCliente(this.datosCliente);
			tipoparametrocontaLogic.setDatosDeep(this.datosDeep);
			tipoparametrocontaLogic.setIsConDeep(true);
			
			
			tipoparametrocontaLogic.getTipoParametroContaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoparametrocontaLogic.getTodosTipoParametroContas(finalQueryGlobal,pagination);
					
					//tipoparametrocontaLogic.getTodosTipoParametroContasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoparametrocontaLogic.getTipoParametroContas()==null|| tipoparametrocontaLogic.getTipoParametroContas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparametrocontasAux= new ArrayList<TipoParametroConta>();
							tipoparametrocontasAux.addAll(tipoparametrocontaLogic.getTipoParametroContas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparametrocontasAux= new ArrayList<TipoParametroConta>();
							tipoparametrocontasAux.addAll(tipoparametrocontas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparametrocontaLogic.getTodosTipoParametroContas(finalQueryGlobal+"",this.pagination);												
							
							//tipoparametrocontaLogic.getTodosTipoParametroContasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoParametroContas("Todos",tipoparametrocontaLogic.getTipoParametroContas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparametrocontaLogic.setTipoParametroContas(new ArrayList<TipoParametroConta>());					
							tipoparametrocontaLogic.getTipoParametroContas().addAll(tipoparametrocontasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparametrocontas=new ArrayList<TipoParametroConta>();
							tipoparametrocontas.addAll(tipoparametrocontasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoParametroConta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoParametroConta=this.idActual;
				
				} else if(this.idTipoParametroContaActual!=null && this.idTipoParametroContaActual!=0L) {
					idTipoParametroConta=idTipoParametroContaActual;
				}
				
					
				this.sDetalleReporte=TipoParametroContaConstantesFunciones.getDetalleIndicePorId(idTipoParametroConta);
				
				this.tipoparametrocontas=new ArrayList<TipoParametroConta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoparametrocontaLogic.getEntity(idTipoParametroConta);
					
					//tipoparametrocontaLogic.getEntityWithConnection(idTipoParametroConta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparametrocontaLogic.setTipoParametroContas(new ArrayList<TipoParametroConta>());
					tipoparametrocontaLogic.getTipoParametroContas().add(tipoparametrocontaLogic.getTipoParametroConta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparametrocontas=new ArrayList<TipoParametroConta>();
					this.tipoparametrocontas.add(tipoparametroconta);
				}
				
				if(tipoparametrocontaLogic.getTipoParametroConta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoParametroContaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoparametrocontaLogic.getTipoParametroContasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoParametroContaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoParametroContaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoparametrocontaLogic.getTipoParametroContas()==null||tipoparametrocontaLogic.getTipoParametroContas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoparametrocontas==null|| tipoparametrocontas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametrocontasAux=new ArrayList<TipoParametroConta>();
						tipoparametrocontasAux.addAll(tipoparametrocontaLogic.getTipoParametroContas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparametrocontasAux=new ArrayList<TipoParametroConta>();
							tipoparametrocontasAux.addAll(tipoparametrocontas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoparametrocontaLogic.getTipoParametroContasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoParametroContaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoParametroContaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoParametroContas("FK_IdEmpresa",tipoparametrocontaLogic.getTipoParametroContas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoParametroContas("FK_IdEmpresa",tipoparametrocontas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametrocontaLogic.setTipoParametroContas(new ArrayList<TipoParametroConta>());
						tipoparametrocontaLogic.getTipoParametroContas().addAll(tipoparametrocontasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparametrocontas=new ArrayList<TipoParametroConta>();
							tipoparametrocontas.addAll(tipoparametrocontasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoParametroConta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoParametroConta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparametrocontaLogic.getTipoParametroContas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparametrocontas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparametrocontaLogic.getTipoParametroContas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparametrocontas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoParametroConta tipoparametroconta) {
		Boolean permite=true;
		
		if(this.tipoparametroconta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoParametroContaConstantesFunciones.getOrderByListaTipoParametroConta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoParametroContaConstantesFunciones.getOrderByListaTipoParametroConta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParametroConta tipoparametroconta:tipoparametrocontaLogic.getTipoParametroContas()) {
				if(tipoparametroconta.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparametrocontaTotales=tipoparametroconta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParametroConta tipoparametroconta:this.tipoparametrocontas) {
				if(tipoparametroconta.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparametrocontaTotales=tipoparametroconta;
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
			this.tipoparametrocontaAux=new TipoParametroConta();
			this.tipoparametrocontaAux.setsType(Constantes2.S_TOTALES);
			this.tipoparametrocontaAux.setIsNew(false);
			this.tipoparametrocontaAux.setIsChanged(false);
			this.tipoparametrocontaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoParametroContaConstantesFunciones.TotalizarValoresFilaTipoParametroConta(this.tipoparametrocontaLogic.getTipoParametroContas(),this.tipoparametrocontaAux);
				
				this.tipoparametrocontaLogic.getTipoParametroContas().add(this.tipoparametrocontaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoParametroContaConstantesFunciones.TotalizarValoresFilaTipoParametroConta(this.tipoparametrocontas,this.tipoparametrocontaAux);
				
				this.tipoparametrocontas.add(this.tipoparametrocontaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoparametrocontaTotales=new TipoParametroConta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparametrocontaLogic.getTipoParametroContas().remove(tipoparametrocontaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparametrocontas.remove(tipoparametrocontaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoparametrocontaTotales=new TipoParametroConta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParametroConta tipoparametroconta:tipoparametrocontaLogic.getTipoParametroContas()) {
				if(tipoparametroconta.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparametrocontaTotales=tipoparametroconta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParametroContaConstantesFunciones.TotalizarValoresFilaTipoParametroConta(this.tipoparametrocontaLogic.getTipoParametroContas(),tipoparametrocontaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParametroConta tipoparametroconta:this.tipoparametrocontas) {
				if(tipoparametroconta.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparametrocontaTotales=tipoparametroconta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParametroContaConstantesFunciones.TotalizarValoresFilaTipoParametroConta(this.tipoparametrocontas,tipoparametrocontaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoParametroContasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoParametroContasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparametrocontaLogic.getTipoParametroContasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoParametroConta() {
		this.isPermisoTodoTipoParametroConta=false;
		this.isPermisoNuevoTipoParametroConta=false;
		this.isPermisoActualizarTipoParametroConta=false;
		this.isPermisoActualizarOriginalTipoParametroConta=false;
		this.isPermisoEliminarTipoParametroConta=false;
		this.isPermisoGuardarCambiosTipoParametroConta=false;
		this.isPermisoConsultaTipoParametroConta=false;
		this.isPermisoBusquedaTipoParametroConta=false;
		this.isPermisoReporteTipoParametroConta=false;		
		this.isPermisoOrdenTipoParametroConta=false;		
		this.isPermisoPaginacionMedioTipoParametroConta=false;		
		this.isPermisoPaginacionAltoTipoParametroConta=false;
		this.isPermisoPaginacionTodoTipoParametroConta=false;
		this.isPermisoCopiarTipoParametroConta=false;		
		this.isPermisoVerFormTipoParametroConta=false;		
		this.isPermisoDuplicarTipoParametroConta=false;		
		this.isPermisoOrdenTipoParametroConta=false;		
	}
	
	public void setPermisosUsuarioTipoParametroConta(Boolean isPermiso) {
		this.isPermisoTodoTipoParametroConta=isPermiso;
		this.isPermisoNuevoTipoParametroConta=isPermiso;
		this.isPermisoActualizarTipoParametroConta=isPermiso;
		this.isPermisoActualizarOriginalTipoParametroConta=isPermiso;
		this.isPermisoEliminarTipoParametroConta=isPermiso;
		this.isPermisoGuardarCambiosTipoParametroConta=isPermiso;
		this.isPermisoConsultaTipoParametroConta=isPermiso;
		this.isPermisoBusquedaTipoParametroConta=isPermiso;
		this.isPermisoReporteTipoParametroConta=isPermiso;
		this.isPermisoOrdenTipoParametroConta=isPermiso;		
		this.isPermisoPaginacionMedioTipoParametroConta=isPermiso;		
		this.isPermisoPaginacionAltoTipoParametroConta=isPermiso;		
		this.isPermisoPaginacionTodoTipoParametroConta=isPermiso;		
		this.isPermisoCopiarTipoParametroConta=isPermiso;		
		this.isPermisoVerFormTipoParametroConta=isPermiso;		
		this.isPermisoDuplicarTipoParametroConta=isPermiso;
		this.isPermisoOrdenTipoParametroConta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoParametroConta(Boolean isPermiso) {
		//this.isPermisoTodoTipoParametroConta=isPermiso;
		this.isPermisoNuevoTipoParametroConta=isPermiso;
		this.isPermisoActualizarTipoParametroConta=isPermiso;
		this.isPermisoActualizarOriginalTipoParametroConta=isPermiso;
		this.isPermisoEliminarTipoParametroConta=isPermiso;
		this.isPermisoGuardarCambiosTipoParametroConta=isPermiso;
		//this.isPermisoConsultaTipoParametroConta=isPermiso;
		//this.isPermisoBusquedaTipoParametroConta=isPermiso;
		//this.isPermisoReporteTipoParametroConta=isPermiso;
		//this.isPermisoOrdenTipoParametroConta=isPermiso;		
		//this.isPermisoPaginacionMedioTipoParametroConta=isPermiso;		
		//this.isPermisoPaginacionAltoTipoParametroConta=isPermiso;		
		//this.isPermisoPaginacionTodoTipoParametroConta=isPermiso;		
		//this.isPermisoCopiarTipoParametroConta=isPermiso;		
		//this.isPermisoDuplicarTipoParametroConta=isPermiso;
		//this.isPermisoOrdenTipoParametroConta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoParametroContaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroContaDetalleConstantesFunciones.SNOMBREOPCION);
		
		if(TipoParametroContaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroContaDetalle=false;
		this.isTienePermisosParametroContaDetalle=this.verificarGetPermisosUsuarioOpcionTipoParametroContaClaseRelacionada(this.opcionsRelacionadas,ParametroContaDetalleConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoParametroConta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoParametroContaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroContaDetalle=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoParametroContaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoParametroContaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoParametroContaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroContaDetalle && this.jInternalFrameDetalleFormTipoParametroConta!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoParametroConta.jTabbedPaneRelacionesTipoParametroConta.remove(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoParametroConta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoParametroContaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoParametroContaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoParametroConta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoParametroConta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoParametroConta=this.isPermisoActualizarTipoParametroConta;
			this.isPermisoEliminarTipoParametroConta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoParametroConta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoParametroConta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoParametroConta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoParametroConta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoParametroConta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParametroConta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoParametroConta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoParametroConta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoParametroConta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoParametroConta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoParametroConta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoParametroConta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParametroConta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoParametroConta.setToolTipText(this.jTableDatosTipoParametroConta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoParametroConta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoParametroConta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoParametroContaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoParametroContaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoParametroConta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroContaDetalle && this.tipoparametrocontaConstantesFunciones.mostrarParametroContaDetalleTipoParametroConta && !TipoParametroContaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Conta Detalle");
			reporte.setsDescripcion("Parametro Conta Detalle");
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
	public void inicializarCombosForeignKeyTipoParametroContaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoParametroContaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoParametroContaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoParametroContaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoParametroContaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoParametroContaParameterReturnGeneral tipoparametrocontaReturnGeneral=new TipoParametroContaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoparametrocontaConstantesFunciones.cargarid_empresaTipoParametroConta)
					 || (this.esRecargarFks && this.tipoparametrocontaConstantesFunciones.cargarid_empresaTipoParametroConta)) {

					if(!this.tipoparametrocontaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoparametrocontaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoparametrocontaReturnGeneral=tipoparametrocontaLogic.cargarCombosLoteForeignKeyTipoParametroConta(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoparametrocontaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoParametroConta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoparametrocontaSessionBean==null) {
				this.tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
			}

			if(!this.tipoparametrocontaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoParametroConta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoParametroConta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoParametroConta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParametroConta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoParametroConta(TipoParametroConta tipoparametroconta)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoParametroConta(TipoParametroConta tipoparametroconta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoParametroConta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParametroConta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoParametroConta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoParametroConta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoParametroConta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoParametroConta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoParametroConta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoParametroConta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta!=null && this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoParametroContaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoParametroContaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoParametroContaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoparametrocontaSessionBean=new TipoParametroContaSessionBean(); 
		this.tipoparametrocontaConstantesFunciones=new TipoParametroContaConstantesFunciones(); 
		this.tipoparametrocontaBean=new TipoParametroConta();//(this.tipoparametrocontaConstantesFunciones); 		
		this.tipoparametrocontaReturnGeneral=new TipoParametroContaParameterReturnGeneral(); 
		
		this.tipoparametrocontaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparametrocontaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoParametroContaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoParametroContaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoParametroContaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoParametroConta(true);
			
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
			
			this.tipoparametrocontaConstantesFunciones=new TipoParametroContaConstantesFunciones(); 
			this.tipoparametrocontaBean=new TipoParametroConta();//this.tipoparametrocontaConstantesFunciones); 			
			this.tipoparametrocontaReturnGeneral=new TipoParametroContaParameterReturnGeneral(); 
		
			TipoParametroContaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Parametro Conta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoparametroconta=new TipoParametroConta();
			this.tipoparametrocontas = new ArrayList<TipoParametroConta>();
			this.tipoparametrocontasAux = new ArrayList<TipoParametroConta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic=new TipoParametroContaLogic();
				this.tipoparametrocontaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoparametrocontaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoparametrocontaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoParametroConta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoParametroConta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParametroConta);	
					}
					
					if(this.jInternalFrameImportacionTipoParametroConta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParametroConta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoParametroConta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoParametroConta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParametroConta);
				this.jInternalFrameDetalleFormTipoParametroConta.setVisible(false);
				this.jInternalFrameDetalleFormTipoParametroConta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoParametroConta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParametroConta);
					this.jInternalFrameReporteDinamicoTipoParametroConta.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoParametroConta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoParametroConta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoParametroConta);
					this.jInternalFrameImportacionTipoParametroConta.setVisible(false);
					this.jInternalFrameImportacionTipoParametroConta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoParametroConta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoParametroConta);
					this.jInternalFrameOrderByTipoParametroConta.setVisible(false);
					this.jInternalFrameOrderByTipoParametroConta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoParametroContaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoParametroContaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoparametrocontaReturnGeneral=new TipoParametroContaParameterReturnGeneral();
			
			this.tipoparametrocontaParameterGeneral=new TipoParametroContaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoparametrocontaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoParametroContaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroContaDetalleConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParametroContaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparametrocontaSessionBean.getEsGuardarRelacionado(),this.tipoparametrocontaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParametroContaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparametrocontaSessionBean.getEsGuardarRelacionado(),this.tipoparametrocontaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoParametroConta=false;
			this.isVisibilidadCeldaDuplicarTipoParametroConta=true;
			this.isVisibilidadCeldaCopiarTipoParametroConta=true;
			this.isVisibilidadCeldaVerFormTipoParametroConta=true;
			this.isVisibilidadCeldaOrdenTipoParametroConta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=false;
			this.isVisibilidadCeldaModificarTipoParametroConta=false;
			this.isVisibilidadCeldaActualizarTipoParametroConta=false;
			this.isVisibilidadCeldaEliminarTipoParametroConta=false;
			this.isVisibilidadCeldaCancelarTipoParametroConta=false;
			this.isVisibilidadCeldaGuardarTipoParametroConta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoParametroConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoParametroConta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoParametroConta(false);
			
			this.setPermisosUsuarioTipoParametroConta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoparametrocontaSessionBean.getEsGuardarRelacionado() && this.tipoparametrocontaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoParametroContaClasesRelacionadas();
			}
			
			if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoParametroContaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoParametroConta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoParametroConta();
			}
			
			if(!this.isPermisoBusquedaTipoParametroConta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoParametroConta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoParametroConta,this.isPermisoPaginacionMedioTipoParametroConta,this.isPermisoPaginacionTodoTipoParametroConta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoParametroContaConstantesFunciones.getTiposSeleccionarTipoParametroConta());
				
				this.tiposColumnasSelect=TipoParametroContaConstantesFunciones.getTiposSeleccionarTipoParametroConta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoParametroConta();				
				//this.tiposRelacionesSelect=TipoParametroContaConstantesFunciones.getTiposRelacionesTipoParametroConta(true);
				
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
			//if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoParametroConta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoParametroConta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoParametroConta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParametroConta() ;
			
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
			
			
			this.parametrocontadetalleLogic=new ParametroContaDetalleLogic(); 
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
				tipoparametrocontaImplementable= (TipoParametroContaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParametroContaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoparametrocontaImplementableHome= (TipoParametroContaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParametroContaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoparametrocontas= new ArrayList<TipoParametroConta>();
			this.tipoparametrocontasEliminados= new ArrayList<TipoParametroConta>();
						
			this.isEsNuevoTipoParametroConta=false;
			this.esParaAccionDesdeFormularioTipoParametroConta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoParametroConta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoParametroConta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoParametroContaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoParametroContaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoParametroConta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoParametroConta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoParametroConta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoParametroConta();
			}
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoParametroConta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoParametroConta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoParametroConta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoParametroConta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoParametroConta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoParametroConta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoParametroConta")) {
				iIndex=this.jInternalFrameDetalleFormTipoParametroConta.jTabbedPaneRelacionesTipoParametroConta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoParametroConta.jTabbedPaneRelacionesTipoParametroConta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Conta Detalles")) {
					if(!ParametroContaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoParametroConta();

						this.cargarParteTabPanelRelacionadaParametroContaDetalle(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoParametroConta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroContaDetalle(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoParametroConta.cargarSessionConBeanSwingJInternalFrameParametroContaDetalle(false,true,iIndex);
		this.jButtonParametroContaDetalleActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroContaDetalle();

		//this.jTabbedPaneRelacionesTipoParametroConta.updateUI();
		//this.jTabbedPaneRelacionesTipoParametroConta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoParametroConta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroContaDetalle")) {
				int row=this.jTableDatosTipoParametroConta.getSelectedRow();
				jButtonParametroContaDetalleActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Conta Detalle")) {

					if(this.isTienePermisosParametroContaDetalle && this.tipoparametrocontaConstantesFunciones.mostrarParametroContaDetalleTipoParametroConta && !TipoParametroContaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Conta Detalles"+"("+ParametroContaDetalleConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Conta Detalles");

						if(tipoparametrocontaConstantesFunciones.resaltarParametroContaDetalleTipoParametroConta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoparametrocontaConstantesFunciones.resaltarParametroContaDetalleTipoParametroConta);
						}

						jmenuItem.setEnabled(this.tipoparametrocontaConstantesFunciones.activarParametroContaDetalleTipoParametroConta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroContaDetalle"));

						

						this.jInternalFrameDetalleFormTipoParametroConta.jmenuDetalleTipoParametroConta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoParametroConta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoParametroConta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoParametroConta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoParametroContaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoParametroConta();
		
		this.cargarCombosFrameForeignKeyTipoParametroConta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoParametroConta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoParametroConta();
		}
	}
	
	
	
	public void jButtonNuevoTipoParametroContaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
			
			if(jTableDatosTipoParametroConta.getRowCount()>=1) {
				jTableDatosTipoParametroConta.removeRowSelectionInterval(0, jTableDatosTipoParametroConta.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoParametroConta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoParametroConta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoParametroConta(true);			
			//this.tipoparametroconta=new TipoParametroConta();
			//this.tipoparametroconta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParametroConta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParametroConta() ;
			
			if(TipoParametroContaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParametroConta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoparametroconta);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);				
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
			if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoParametroConta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoParametroContaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoParametroConta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoParametroConta.getSelectedRows().length;			
			}
			
			tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoParametroConta--;			
				//TipoParametroConta tipoparametrocontaAux= new TipoParametroConta();			
				//tipoparametrocontaAux.setId(this.iIdNuevoTipoParametroConta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoParametroConta tipoparametrocontaOrigen=new TipoParametroConta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoParametroConta tipoparametrocontaOrigen : tipoparametrocontasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoparametrocontaOrigen =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparametrocontaOrigen =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoParametroConta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoparametroconta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoParametroConta(tipoparametrocontaOrigen,this.tipoparametroconta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparametrocontaLogic.getTipoParametroContas().add(this.tipoparametrocontaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparametrocontas.add(this.tipoparametrocontaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoParametroConta(false);
				
				this.jTableDatosTipoParametroConta.setRowSelectionInterval(this.getIndiceNuevoTipoParametroConta(), this.getIndiceNuevoTipoParametroConta());
				
				int iLastRow =  this.jTableDatosTipoParametroConta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParametroConta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParametroConta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParametroConta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();									
		
			TipoParametroConta tipoparametrocontaOrigen=new TipoParametroConta();
			TipoParametroConta tipoparametrocontaDestino=new TipoParametroConta();
				
			tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoParametroConta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoparametrocontasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoParametroConta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametrocontaOrigen =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparametrocontaOrigen =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparametrocontaDestino =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparametrocontaDestino =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoparametrocontaOrigen =tipoparametrocontasSeleccionados.get(0);
				tipoparametrocontaDestino =tipoparametrocontasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoParametroConta(tipoparametrocontaOrigen,tipoparametrocontaDestino,true,false);
				
				tipoparametrocontaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparametrocontaDestino,tipoparametrocontaLogic.getTipoParametroContas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparametrocontaDestino,tipoparametrocontas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoParametroConta(false);
				
				//this.jTableDatosTipoParametroConta.setRowSelectionInterval(this.getIndiceNuevoTipoParametroConta(), this.getIndiceNuevoTipoParametroConta());
				
				int iLastRow =  this.jTableDatosTipoParametroConta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParametroConta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParametroConta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParametroConta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoParametroConta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoParametroConta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoParametroConta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoParametroConta.setVisible(!isVisible);
			this.jPanelPaginacionTipoParametroConta.setVisible(!isVisible);
			this.jPanelAccionesTipoParametroConta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoParametroConta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoParametroConta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoParametroConta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoParametroConta();
			
			this.abrirFrameOrderByTipoParametroConta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoParametroConta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoParametroConta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParametroConta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoParametroConta.isMaximum()) {
					this.jInternalFrameDetalleFormTipoParametroConta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoParametroConta.setSize(this.jInternalFrameDetalleFormTipoParametroConta.iWidthFormulario,this.jInternalFrameDetalleFormTipoParametroConta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoParametroConta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoParametroConta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoParametroConta.isMaximum()) {
						this.jInternalFrameDetalleFormTipoParametroConta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoParametroConta.jContentPaneDetalleTipoParametroConta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoParametroConta.jTabbedPaneRelacionesTipoParametroConta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoParametroConta.jContentPaneDetalleTipoParametroConta.getWidth(),TipoParametroContaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParametroConta.jTabbedPaneRelacionesTipoParametroConta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoParametroConta.jContentPaneDetalleTipoParametroConta.getWidth(),TipoParametroContaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParametroConta.jTabbedPaneRelacionesTipoParametroConta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoParametroConta.jContentPaneDetalleTipoParametroConta.getWidth(),TipoParametroContaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroContaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroContaDetalle();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoParametroConta.setVisible(true);
	        this.jInternalFrameDetalleFormTipoParametroConta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoParametroConta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoParametroConta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoParametroConta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParametroConta,false,this);
				} else {
					this.jInternalFrameOrderByTipoParametroConta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParametroConta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoParametroConta);
				this.jInternalFrameOrderByTipoParametroConta.setVisible(false);
				this.jInternalFrameOrderByTipoParametroConta.setSelected(false);
				
				this.jInternalFrameOrderByTipoParametroConta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParametroConta"));
				
				this.inicializarActualizarBindingTablaOrderByTipoParametroConta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoParametroConta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoParametroConta==null) {
				
				this.jInternalFrameImportacionTipoParametroConta=new ImportacionJInternalFrame(TipoParametroContaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParametroConta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoParametroConta);
				this.jInternalFrameImportacionTipoParametroConta.setVisible(false);
				this.jInternalFrameImportacionTipoParametroConta.setSelected(false);


				this.jInternalFrameImportacionTipoParametroConta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParametroConta"));
				this.jInternalFrameImportacionTipoParametroConta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParametroConta"));
				this.jInternalFrameImportacionTipoParametroConta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParametroConta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoParametroConta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoParametroConta==null) {
				this.jInternalFrameReporteDinamicoTipoParametroConta=new ReporteDinamicoJInternalFrame(TipoParametroContaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParametroConta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParametroConta);
				this.jInternalFrameReporteDinamicoTipoParametroConta.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoParametroConta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoParametroConta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParametroConta"));
				this.jInternalFrameReporteDinamicoTipoParametroConta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParametroConta"));
				this.jInternalFrameReporteDinamicoTipoParametroConta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParametroConta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParametroConta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroContaDetalle() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.jScrollPanelDatosParametroContaDetalle.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoParametroConta.jContentPaneDetalleTipoParametroConta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.jScrollPanelDatosParametroContaDetalle.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.jScrollPanelDatosParametroContaDetalle.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.jScrollPanelDatosParametroContaDetalle.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoParametroConta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParametroConta);
			
	       	this.jInternalFrameDetalleFormTipoParametroConta.setVisible(false);
	        this.jInternalFrameDetalleFormTipoParametroConta.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoParametroConta.dispose();
			//this.jInternalFrameDetalleFormTipoParametroConta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoParametroConta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoParametroConta.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoParametroConta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoParametroConta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoParametroConta.setVisible(true);
	        this.jInternalFrameImportacionTipoParametroConta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoParametroConta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoParametroConta.setVisible(true);
	        this.jInternalFrameOrderByTipoParametroConta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoParametroConta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoParametroConta.setVisible(false);
	        this.jInternalFrameOrderByTipoParametroConta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoParametroConta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoParametroConta.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoParametroConta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoParametroConta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoParametroConta.setVisible(false);
	        this.jInternalFrameImportacionTipoParametroConta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoParametroConta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoParametroConta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoParametroConta(true);
			//this.isEsNuevoTipoParametroConta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoParametroConta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParametroConta(false) ;
			
			if(tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.getEsGuardarRelacionado() && ParametroContaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroContaDetalleActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoParametroContaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParametroConta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParametroConta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoParametroContaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoParametroConta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoParametroConta(true);
			//this.isEsNuevoTipoParametroConta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoparametroconta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoParametroConta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoParametroConta(false) ;
			
			if(TipoParametroContaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParametroConta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParametroConta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoParametroConta(false);
			
			//if(!this.isEsNuevoTipoParametroConta) {								
				int intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoParametroConta(this.tipoparametroconta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
				
			}
			
			if(this.permiteMantenimiento(this.tipoparametroconta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoParametroConta=true;
					this.inicializarActualizarBindingTablaTipoParametroConta(false);
					this.isEsNuevoTipoParametroConta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoParametroConta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoParametroConta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParametroConta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParametroConta(false);
				
				this.habilitarDeshabilitarControlesTipoParametroConta(false);
			
												
				
				if(TipoParametroContaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoParametroConta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoParametroContaActionPerformed(evt,tipoparametrocontaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoParametroConta(this.tipoparametroconta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoParametroConta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoparametrocontaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoparametroconta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				this.tipoparametroconta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				this.tipoparametroconta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoparametroconta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoParametroContaModel) this.jTableDatosTipoParametroConta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoParametroConta=true;
				this.inicializarActualizarBindingTablaTipoParametroConta(false);
				this.isEsNuevoTipoParametroConta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParametroConta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParametroConta(false);
				
				this.habilitarDeshabilitarControlesTipoParametroConta(false);
				
				
				
				if(TipoParametroContaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoParametroConta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoParametroConta.getRowCount()>=1) {
				jTableDatosTipoParametroConta.removeRowSelectionInterval(0, jTableDatosTipoParametroConta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoParametroConta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoParametroConta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParametroConta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParametroConta(false) ;
			
			this.isEsNuevoTipoParametroConta=false;
			
			if(TipoParametroContaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoParametroConta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoParametroConta(false);
				
				//SI ES MANUAL
				if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoParametroConta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoParametroConta--;			
			//TipoParametroConta tipoparametrocontaAux= new TipoParametroConta();			
			//tipoparametrocontaAux.setId(this.iIdNuevoTipoParametroConta);
			
			if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoParametroConta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
			
			this.tipoparametroconta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoparametrocontaLogic.getTipoParametroContas().add(this.tipoparametrocontaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoparametrocontas.add(this.tipoparametrocontaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoParametroConta(false);
			
			this.jTableDatosTipoParametroConta.setRowSelectionInterval(this.getIndiceNuevoTipoParametroConta(), this.getIndiceNuevoTipoParametroConta());
			
			int iLastRow =  this.jTableDatosTipoParametroConta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoParametroConta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoParametroConta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoParametroConta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoParametroConta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParametroConta(false);
			
			//SI ES MANUAL
			if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParametroConta();
			}
			
			//this.abrirFrameTreeTipoParametroConta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Parametro ContaS ?", "MANTENIMIENTO DE Tipo Parametro Conta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoParametroConta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoParametroConta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoparametrocontaReturnGeneral=tipoparametrocontaLogic.procesarImportacionTipoParametroContasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoparametrocontaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoParametroContaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoParametroConta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoParametroConta.setFileImportacion(this.jInternalFrameImportacionTipoParametroConta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoParametroConta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoParametroConta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoParametroConta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoParametroConta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();		

		tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoParametroContaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoParametroContaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoParametroContas("Todos",tipoparametrocontasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Conta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoParametroContaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoParametroContaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoParametroConta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoParametroContaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoParametroContaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoParametroContaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoParametroContaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoParametroContaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoParametroContaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();		
		
		tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroconta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoParametroContas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoParametroConta tipoparametroconta:tipoparametrocontasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoparametroconta.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoParametroContaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoParametroConta tipoparametroconta:tipoparametrocontasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoparametroconta.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoParametroContaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoParametroConta tipoparametroconta:tipoparametrocontasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoparametroconta.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoParametroConta(row);				
			//	iRow++;
			//}				
			
			//for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoParametroConta(tipoparametrocontaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Conta",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoparametrocontaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParametroConta(false);
			
			//SI ES MANUAL
			if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParametroConta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParametroConta(false);
			
			//SI ES MANUAL
			if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParametroConta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParametroConta(false);
			
			//SI ES MANUAL
			if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParametroConta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoParametroConta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoParametroConta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoParametroConta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoParametroConta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoParametroConta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoParametroConta.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoParametroConta.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoParametroConta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoParametroConta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoParametroConta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoParametroConta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoParametroConta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoParametroConta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoParametroConta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParametroConta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoParametroConta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoParametroConta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoParametroConta();
		
		this.inicializarActualizarBindingBotonesManualTipoParametroConta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParametroConta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParametroConta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParametroConta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParametroConta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoParametroConta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoParametroConta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoParametroConta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoParametroConta.jCheckBoxPostAccionNuevoTipoParametroConta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoParametroConta.jCheckBoxPostAccionSinCerrarTipoParametroConta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoParametroConta.jCheckBoxPostAccionSinMensajeTipoParametroConta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoParametroConta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoParametroConta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoParametroConta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
				this.jInternalFrameDetalleFormTipoParametroConta.jCheckBoxPostAccionNuevoTipoParametroConta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoParametroConta.jCheckBoxPostAccionSinCerrarTipoParametroConta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoParametroConta.jCheckBoxPostAccionSinMensajeTipoParametroConta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoParametroConta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoParametroConta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoParametroConta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoParametroConta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoParametroConta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoParametroConta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoParametroConta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoParametroConta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoParametroConta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoParametroConta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoParametroConta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoParametroConta(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParametroConta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoParametroConta() throws Exception {
		try	{
			if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParametroConta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParametroConta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParametroConta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoParametroConta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoParametroConta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoParametroConta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoParametroConta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoParametroConta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoParametroConta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoParametroConta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoParametroConta.addItem(reporte);
			}
			
			
			if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoParametroConta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoParametroConta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoParametroConta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoParametroConta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoParametroConta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoParametroConta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoParametroConta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoParametroConta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoParametroConta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParametroConta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParametroConta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParametroConta!=null) {
				this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParametroConta!=null) {
				this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParametroConta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoParametroConta!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParametroConta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoParametroConta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParametroConta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParametroConta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoParametroConta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoParametroConta(Boolean esInicializar) throws Exception {				
		if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParametroConta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoParametroConta() throws Exception {
		this.inicializarActualizarBindingTablaTipoParametroConta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoParametroConta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoParametroContaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoParametroContaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoParametroContaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroContaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoParametroContaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoParametroContaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoParametroConta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoparametrocontaLogic.getTipoParametroContas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoparametrocontas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoParametroConta.setModel(new TipoParametroContaModel(this.tipoparametrocontaLogic.getTipoParametroContas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoParametroConta.setModel(new TipoParametroContaModel(this.tipoparametrocontas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoParametroConta!=null && this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoParametroConta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoParametroConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroConta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoParametroContaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO,tipoparametrocontaConstantesFunciones.resaltarSeleccionarTipoParametroConta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO,tipoparametrocontaConstantesFunciones.resaltarSeleccionarTipoParametroConta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoParametroConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroConta,TipoParametroContaConstantesFunciones.LABEL_ID));

		if(this.tipoparametrocontaConstantesFunciones.mostraridTipoParametroConta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParametroContaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoparametrocontaConstantesFunciones.resaltaridTipoParametroConta,this.tipoparametrocontaConstantesFunciones.activaridTipoParametroConta,this,true,"idTipoParametroConta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparametrocontaConstantesFunciones.resaltaridTipoParametroConta,this.tipoparametrocontaConstantesFunciones.activaridTipoParametroConta,this,true,"idTipoParametroConta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoParametroConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroConta,TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoparametrocontaConstantesFunciones.mostrarid_empresaTipoParametroConta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoparametrocontaConstantesFunciones.resaltarid_empresaTipoParametroConta,this,this.tipoparametrocontaConstantesFunciones.activarid_empresaTipoParametroConta));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoparametrocontaConstantesFunciones.resaltarid_empresaTipoParametroConta,this,this.tipoparametrocontaConstantesFunciones.activarid_empresaTipoParametroConta,false,"id_empresaTipoParametroConta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoParametroContaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoParametroConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroConta,TipoParametroContaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoparametrocontaConstantesFunciones.mostrarcodigoTipoParametroConta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParametroContaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoparametrocontaConstantesFunciones.resaltarcodigoTipoParametroConta,this.tipoparametrocontaConstantesFunciones.activarcodigoTipoParametroConta,this,true,"codigoTipoParametroConta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparametrocontaConstantesFunciones.resaltarcodigoTipoParametroConta,this.tipoparametrocontaConstantesFunciones.activarcodigoTipoParametroConta,this,true,"codigoTipoParametroConta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoParametroContaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoParametroConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroConta,TipoParametroContaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoparametrocontaConstantesFunciones.mostrarnombreTipoParametroConta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParametroContaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoparametrocontaConstantesFunciones.resaltarnombreTipoParametroConta,this.tipoparametrocontaConstantesFunciones.activarnombreTipoParametroConta,this,true,"nombreTipoParametroConta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparametrocontaConstantesFunciones.resaltarnombreTipoParametroConta,this.tipoparametrocontaConstantesFunciones.activarnombreTipoParametroConta,this,true,"nombreTipoParametroConta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoParametroContaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroContaDetalle && this.tipoparametrocontaConstantesFunciones.mostrarParametroContaDetalleTipoParametroConta && !TipoParametroContaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Conta Detalles");
				tableColumn.setHeaderValue("Parametro Conta Detalles");
				tableColumn.setCellRenderer(new ParametroContaDetalleTableCell(tipoparametrocontaConstantesFunciones.resaltarParametroContaDetalleTipoParametroConta,this,this.tipoparametrocontaConstantesFunciones.activarParametroContaDetalleTipoParametroConta));
				tableColumn.setCellEditor(new ParametroContaDetalleTableCell(tipoparametrocontaConstantesFunciones.resaltarParametroContaDetalleTipoParametroConta,this,this.tipoparametrocontaConstantesFunciones.activarParametroContaDetalleTipoParametroConta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoParametroConta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParametroConta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParametroConta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoParametroConta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoParametroConta.addColumn(tableColumn);
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
			
			this.jTableDatosTipoParametroConta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoParametroConta.moveColumn(this.jTableDatosTipoParametroConta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoParametroConta.moveColumn(this.jTableDatosTipoParametroConta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoParametroConta.moveColumn(this.jTableDatosTipoParametroConta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoParametroConta.moveColumn(this.jTableDatosTipoParametroConta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoParametroConta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoParametroConta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoParametroConta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoParametroConta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoParametroConta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoParametroConta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoParametroConta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoParametroConta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoparametrocontaLogic.getTipoParametroContas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoparametrocontas.size()-1;
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
		//this.jTableDatosTipoParametroConta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoParametroConta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoParametroConta();
			
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
				
				//this.isEsNuevoTipoParametroConta=false;
					
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
				if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoParametroConta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParametroConta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParametroConta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoparametroconta.getsType().equals("DUPLICADO")
				   || this.tipoparametroconta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoParametroConta=true;
				
				} else {
					this.isEsNuevoTipoParametroConta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoparametroconta.getId()>=0 && !this.tipoparametroconta.getIsNew()) {						
						this.isEsNuevoTipoParametroConta=false;
						
					} else {
						this.isEsNuevoTipoParametroConta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoParametroConta(esRelaciones);						
				
				this.seleccionarTipoParametroConta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoparametroconta.getId()<0) {
					this.isEsNuevoTipoParametroConta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoParametroConta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoParametroConta(evt,rowIndex);
				}	
				
				if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoParametroConta: " + this.dDif); 
					}
				}								
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoParametroConta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoparametroconta)) {
					if(this.tipoparametroconta.getId()>0) {
						this.tipoparametroconta.setIsDeleted(true);
						
						this.tipoparametrocontasEliminados.add(this.tipoparametroconta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparametrocontaLogic.getTipoParametroContas().remove(this.tipoparametroconta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparametrocontas.remove(this.tipoparametroconta);				
					}
					
					
					((TipoParametroContaModel) this.jTableDatosTipoParametroConta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParametroConta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoParametroConta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoParametroConta) {
			
			if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParametroConta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParametroConta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoParametroConta(this.tipoparametroconta);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoparametrocontaConstantesFunciones.cargarid_empresaTipoParametroConta || this.tipoparametrocontaConstantesFunciones.event_dependid_empresaTipoParametroConta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoparametroconta.getid_empresa());
									//this.inicializarActualizarBindingTipoParametroConta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoparametroconta.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoparametroconta.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoparametroconta.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoParametroConta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoParametroConta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParametroConta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParametroConta(TipoParametroConta tipoparametroconta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoParametroConta(tipoparametroconta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParametroConta(TipoParametroConta tipoparametroconta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoParametroConta(tipoparametroconta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoParametroConta(tipoparametroconta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoParametroConta(tipoparametroconta);
	}
	
	public void setVariablesObjetoActualToFormularioTipoParametroConta(TipoParametroConta tipoparametroconta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.setText(tipoparametroconta.getId().toString());
			this.jInternalFrameDetalleFormTipoParametroConta.jTextFieldcodigoTipoParametroConta.setText(tipoparametroconta.getcodigo());
			this.jInternalFrameDetalleFormTipoParametroConta.jTextAreanombreTipoParametroConta.setText(tipoparametroconta.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoParametroConta tipoparametrocontaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoparametrocontaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoParametroConta tipoparametrocontaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoparametrocontaLocal=this.tipoparametroconta;
			} else {
				tipoparametrocontaLocal=this.tipoparametrocontaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoparametrocontaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoParametroConta(tipoparametrocontaLocal,true);
					
					if(tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoparametrocontaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoparametrocontaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoParametroConta(TipoParametroConta tipoparametroconta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParametroConta(tipoparametroconta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(tipoparametroconta);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParametroConta(TipoParametroConta tipoparametroconta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParametroConta(tipoparametroconta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParametroConta(TipoParametroConta tipoparametroconta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.getText()==null || this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.getText()=="" || this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.setText("0");
			}

			if(conColumnasBase) {tipoparametroconta.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParametroContaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroConta.jLabelIdTipoParametroConta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoparametroconta.setcodigo(this.jInternalFrameDetalleFormTipoParametroConta.jTextFieldcodigoTipoParametroConta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParametroContaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroConta.jLabelcodigoTipoParametroConta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoparametroconta.setnombre(this.jInternalFrameDetalleFormTipoParametroConta.jTextAreanombreTipoParametroConta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParametroContaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParametroConta.jLabelnombreTipoParametroConta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParametroConta(TipoParametroConta tipoparametrocontaBean,TipoParametroConta tipoparametroconta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoParametroConta(TipoParametroConta tipoparametrocontaOrigen,TipoParametroConta tipoparametroconta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparametrocontaOrigen.getId()!=null && !tipoparametrocontaOrigen.getId().equals(0L))) {tipoparametroconta.setId(tipoparametrocontaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoparametrocontaOrigen.getcodigo()!=null && !tipoparametrocontaOrigen.getcodigo().equals(""))) {tipoparametroconta.setcodigo(tipoparametrocontaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoparametrocontaOrigen.getnombre()!=null && !tipoparametrocontaOrigen.getnombre().equals(""))) {tipoparametroconta.setnombre(tipoparametrocontaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParametroConta(TipoParametroConta tipoparametroconta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.setText(tipoparametroconta.getId().toString());
			this.jInternalFrameDetalleFormTipoParametroConta.jTextFieldcodigoTipoParametroConta.setText(tipoparametroconta.getcodigo());
			this.jInternalFrameDetalleFormTipoParametroConta.jTextAreanombreTipoParametroConta.setText(tipoparametroconta.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParametroConta(TipoParametroContaBean tipoparametrocontaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.setText(tipoparametrocontaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoParametroConta.jTextFieldcodigoTipoParametroConta.setText(tipoparametrocontaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoParametroConta.jTextAreanombreTipoParametroConta.setText(tipoparametrocontaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoParametroConta(TipoParametroContaParameterReturnGeneral tipoparametrocontaReturnGeneral,TipoParametroContaBean tipoparametrocontaBean,Boolean conDefault) throws Exception { 
		try {
			TipoParametroConta tipoparametrocontaLocal=new TipoParametroConta();
			
			tipoparametrocontaLocal=tipoparametrocontaReturnGeneral.getTipoParametroConta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparametrocontaLocal.getId()!=null && !tipoparametrocontaLocal.getId().equals(0L))) {tipoparametrocontaBean.setId(tipoparametrocontaLocal.getId());}}
			if(conDefault || (!conDefault && tipoparametrocontaLocal.getcodigo()!=null && !tipoparametrocontaLocal.getcodigo().equals(""))) {tipoparametrocontaBean.setcodigo(tipoparametrocontaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoparametrocontaLocal.getnombre()!=null && !tipoparametrocontaLocal.getnombre().equals(""))) {tipoparametrocontaBean.setnombre(tipoparametrocontaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoParametroContaGenerico(Long idTipoParametroContaSeleccionado,JComboBox jComboBoxTipoParametroConta,List<TipoParametroConta> tipoparametrocontasLocal)throws Exception {
		try {
			TipoParametroConta  tipoparametrocontaTemp=null;

			for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontasLocal) {
				if(tipoparametrocontaAux.getId()!=null && tipoparametrocontaAux.getId().equals(idTipoParametroContaSeleccionado)) {
					tipoparametrocontaTemp=tipoparametrocontaAux;
					break;
				}
			}

			jComboBoxTipoParametroConta.setSelectedItem(tipoparametrocontaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoParametroContaGenerico(JComboBox jComboBoxTipoParametroConta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParametroConta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoParametroConta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParametroConta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoParametroConta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroContaDetalle")) {
			jButtonParametroContaDetalleActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparametroconta=(TipoParametroConta) tipoparametrocontaLogic.getTipoParametroContas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparametroconta =(TipoParametroConta) tipoparametrocontas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoparametroconta.getIsNew() && !tipoparametroconta.getIsChanged() && !tipoparametroconta.getIsDeleted()) {
				sDescripcion=tipoparametroconta.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoparametroconta.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoParametroConta tipoparametrocontaRow=new TipoParametroConta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparametrocontaRow=(TipoParametroConta) tipoparametrocontaLogic.getTipoParametroContas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparametrocontaRow=(TipoParametroConta) tipoparametrocontas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroContaDetalleActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoParametroConta tipoparametroconta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoParametroConta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroconta = (TipoParametroConta)this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoparametroconta = (TipoParametroConta)this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoparametroconta!=null) {
						this.tipoparametroconta = tipoparametroconta;
					} else {
						this.tipoparametroconta = new TipoParametroConta();
					}
				}

				if(this.isTienePermisosParametroContaDetalle && this.permiteMantenimiento(this.tipoparametroconta)) {
					ParametroContaDetalleBeanSwingJInternalFrame parametrocontadetalleBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFramePopup=new ParametroContaDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocontadetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFramePopup;
					} else {
						parametrocontadetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame;
					}

					List<TipoParametroConta> tipoparametrocontas=new ArrayList<TipoParametroConta>();
					tipoparametrocontas.add(this.tipoparametroconta);
					if(!esRelacionado) {
						//parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.setConGuardarRelaciones(false);
						//parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocontadetalleBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoParametroConta.cargarParametroContaDetalleBeanSwingJInternalFrame(tipoparametrocontas,this.tipoparametroconta,parametrocontadetalleBeanSwingJInternalFrame,/*conInicializar,*/parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.getConGuardarRelaciones(),parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
					parametrocontadetalleBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocontadetalleBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContaDetalle("no_relacionado");

						parametrocontadetalleBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroContaDetalleConstantesFunciones.ITAMANIOFILATABLA + (ParametroContaDetalleConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocontadetalleBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoParametroConta=(TitledBorder)this.jScrollPanelDatosTipoParametroConta.getBorder();
						TitledBorder titledBorderParametroContaDetalle=(TitledBorder)parametrocontadetalleBeanSwingJInternalFrame.jScrollPanelDatosParametroContaDetalle.getBorder();

						titledBorderParametroContaDetalle.setTitle(titledBorderTipoParametroConta.getTitle() + " -> Parametro Conta Detalle");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocontadetalleBeanSwingJInternalFrame);
						}

						parametrocontadetalleBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocontadetalleBeanSwingJInternalFrame);

						parametrocontadetalleBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Conta Detalle",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoParametroConta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoParametroConta.setVisible((this.isVisibilidadCeldaNuevoTipoParametroConta && this.isPermisoNuevoTipoParametroConta));			
			this.jButtonDuplicarTipoParametroConta.setVisible((this.isVisibilidadCeldaDuplicarTipoParametroConta && this.isPermisoDuplicarTipoParametroConta));			
			this.jButtonCopiarTipoParametroConta.setVisible((this.isVisibilidadCeldaCopiarTipoParametroConta && this.isPermisoCopiarTipoParametroConta));
			this.jButtonVerFormTipoParametroConta.setVisible((this.isVisibilidadCeldaVerFormTipoParametroConta && this.isPermisoVerFormTipoParametroConta));
			
			this.jButtonAbrirOrderByTipoParametroConta.setVisible((this.isVisibilidadCeldaOrdenTipoParametroConta && this.isPermisoOrdenTipoParametroConta));			
			
			this.jButtonNuevoRelacionesTipoParametroConta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta && this.isPermisoNuevoTipoParametroConta));			
			this.jButtonNuevoGuardarCambiosTipoParametroConta.setVisible((this.isVisibilidadCeldaNuevoTipoParametroConta && this.isPermisoNuevoTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta));
			
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonModificarTipoParametroConta.setVisible((this.isVisibilidadCeldaModificarTipoParametroConta && this.isPermisoActualizarTipoParametroConta));	
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonActualizarTipoParametroConta.setVisible((this.isVisibilidadCeldaActualizarTipoParametroConta && this.isPermisoActualizarTipoParametroConta));	
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonEliminarTipoParametroConta.setVisible((this.isVisibilidadCeldaEliminarTipoParametroConta && this.isPermisoEliminarTipoParametroConta));
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonCancelarTipoParametroConta.setVisible(this.isVisibilidadCeldaCancelarTipoParametroConta);							
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosTipoParametroConta.setVisible((this.isVisibilidadCeldaGuardarTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoParametroConta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaNuevoTipoParametroConta && this.isPermisoNuevoTipoParametroConta));						
			this.jButtonDuplicarToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaDuplicarTipoParametroConta && this.isPermisoDuplicarTipoParametroConta));						
			this.jButtonCopiarToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaCopiarTipoParametroConta && this.isPermisoCopiarTipoParametroConta));			
			this.jButtonVerFormToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaVerFormTipoParametroConta && this.isPermisoVerFormTipoParametroConta));			
			this.jButtonAbrirOrderByToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaOrdenTipoParametroConta && this.isPermisoOrdenTipoParametroConta));
			this.jButtonNuevoRelacionesToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta && this.isPermisoNuevoTipoParametroConta));			
			this.jButtonNuevoGuardarCambiosToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaNuevoTipoParametroConta && this.isPermisoNuevoTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta));			
			
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonModificarToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaModificarTipoParametroConta && this.isPermisoActualizarTipoParametroConta));	
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonActualizarToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaActualizarTipoParametroConta  && this.isPermisoActualizarTipoParametroConta));	
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonEliminarToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaEliminarTipoParametroConta && this.isPermisoEliminarTipoParametroConta));
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonCancelarToolBarTipoParametroConta.setVisible(this.isVisibilidadCeldaCancelarTipoParametroConta);				
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaGuardarTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoParametroConta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoParametroConta.setVisible((this.isVisibilidadCeldaNuevoTipoParametroConta && this.isPermisoNuevoTipoParametroConta));			
			this.jMenuItemDuplicarTipoParametroConta.setVisible((this.isVisibilidadCeldaDuplicarTipoParametroConta && this.isPermisoDuplicarTipoParametroConta));			
			this.jMenuItemCopiarTipoParametroConta.setVisible((this.isVisibilidadCeldaCopiarTipoParametroConta && this.isPermisoCopiarTipoParametroConta));			
			this.jMenuItemVerFormTipoParametroConta.setVisible((this.isVisibilidadCeldaVerFormTipoParametroConta && this.isPermisoVerFormTipoParametroConta));			
			this.jMenuItemAbrirOrderByTipoParametroConta.setVisible((this.isVisibilidadCeldaOrdenTipoParametroConta && this.isPermisoOrdenTipoParametroConta));			
			//this.jMenuItemMostrarOcultarTipoParametroConta.setVisible((this.isVisibilidadCeldaOrdenTipoParametroConta && this.isPermisoOrdenTipoParametroConta));
			this.jMenuItemDetalleAbrirOrderByTipoParametroConta.setVisible((this.isVisibilidadCeldaOrdenTipoParametroConta && this.isPermisoOrdenTipoParametroConta));			
			//this.jMenuItemDetalleMostrarOcultarTipoParametroConta.setVisible((this.isVisibilidadCeldaOrdenTipoParametroConta && this.isPermisoOrdenTipoParametroConta));			
			this.jMenuItemNuevoRelacionesTipoParametroConta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta && this.isPermisoNuevoTipoParametroConta));			
			this.jMenuItemNuevoGuardarCambiosTipoParametroConta.setVisible((this.isVisibilidadCeldaNuevoTipoParametroConta && this.isPermisoNuevoTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta));									
			
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemModificarTipoParametroConta.setVisible((this.isVisibilidadCeldaModificarTipoParametroConta && this.isPermisoActualizarTipoParametroConta));	
			this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemActualizarTipoParametroConta.setVisible((this.isVisibilidadCeldaActualizarTipoParametroConta && this.isPermisoActualizarTipoParametroConta));	
			this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemEliminarTipoParametroConta.setVisible((this.isVisibilidadCeldaEliminarTipoParametroConta && this.isPermisoEliminarTipoParametroConta));
			this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemCancelarTipoParametroConta.setVisible(this.isVisibilidadCeldaCancelarTipoParametroConta);				
			}
			
			this.jMenuItemGuardarCambiosTipoParametroConta.setVisible((this.isVisibilidadCeldaGuardarTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta));						
			this.jMenuItemGuardarCambiosTablaTipoParametroConta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoParametroConta=this.jButtonNuevoTipoParametroConta.isVisible();
			this.isVisibilidadCeldaDuplicarTipoParametroConta=this.jButtonDuplicarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaCopiarTipoParametroConta=this.jButtonCopiarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaVerFormTipoParametroConta=this.jButtonVerFormTipoParametroConta.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoParametroConta=this.jButtonAbrirOrderByTipoParametroConta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=this.jButtonNuevoRelacionesTipoParametroConta.isVisible();
			this.isVisibilidadCeldaModificarTipoParametroConta=this.jButtonModificarTipoParametroConta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			this.isVisibilidadCeldaActualizarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jButtonActualizarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaEliminarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jButtonEliminarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaCancelarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jButtonCancelarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaGuardarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosTipoParametroConta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=this.jButtonGuardarCambiosTablaTipoParametroConta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoParametroConta=this.jButtonNuevoToolBarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=this.jButtonNuevoRelacionesToolBarTipoParametroConta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			this.isVisibilidadCeldaModificarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jButtonModificarToolBarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaActualizarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jButtonActualizarToolBarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaEliminarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jButtonEliminarToolBarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaCancelarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jButtonCancelarToolBarTipoParametroConta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParametroConta=this.jButtonGuardarCambiosToolBarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=this.jButtonGuardarCambiosTablaToolBarTipoParametroConta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoParametroConta=this.jMenuItemNuevoTipoParametroConta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=this.jMenuItemNuevoRelacionesTipoParametroConta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			this.isVisibilidadCeldaModificarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemModificarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaActualizarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemActualizarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaEliminarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemEliminarTipoParametroConta.isVisible();
			this.isVisibilidadCeldaCancelarTipoParametroConta=this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemCancelarTipoParametroConta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParametroConta=this.jMenuItemGuardarCambiosTipoParametroConta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=this.jMenuItemGuardarCambiosTablaTipoParametroConta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoParametroConta(Boolean esInicializar) {
		if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParametroConta();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoParametroConta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoParametroConta() {
		this.jButtonNuevoTipoParametroConta.setVisible(this.isPermisoNuevoTipoParametroConta);			
		this.jButtonDuplicarTipoParametroConta.setVisible(this.isPermisoDuplicarTipoParametroConta);			
		this.jButtonCopiarTipoParametroConta.setVisible(this.isPermisoCopiarTipoParametroConta);			
		this.jButtonVerFormTipoParametroConta.setVisible(this.isPermisoVerFormTipoParametroConta);			
		
		this.jButtonAbrirOrderByTipoParametroConta.setVisible(this.isPermisoOrdenTipoParametroConta);					
		
		this.jButtonNuevoRelacionesTipoParametroConta.setVisible(this.isPermisoNuevoTipoParametroConta);			
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonModificarTipoParametroConta.setVisible(this.isPermisoActualizarTipoParametroConta);	
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonActualizarTipoParametroConta.setVisible(this.isPermisoActualizarTipoParametroConta);	
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonEliminarTipoParametroConta.setVisible(this.isPermisoEliminarTipoParametroConta);
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonCancelarTipoParametroConta.setVisible(this.isVisibilidadCeldaCancelarTipoParametroConta);						
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosTipoParametroConta.setVisible(this.isPermisoGuardarCambiosTipoParametroConta);							
		}
		
		this.jButtonGuardarCambiosTablaTipoParametroConta.setVisible(this.isPermisoActualizarTipoParametroConta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParametroConta() {
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonModificarTipoParametroConta.setVisible(this.isPermisoActualizarTipoParametroConta);	
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonActualizarTipoParametroConta.setVisible(this.isPermisoActualizarTipoParametroConta);	
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonEliminarTipoParametroConta.setVisible(this.isPermisoEliminarTipoParametroConta);
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonCancelarTipoParametroConta.setVisible(this.isVisibilidadCeldaCancelarTipoParametroConta);							
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosTipoParametroConta.setVisible((this.isVisibilidadCeldaGuardarTipoParametroConta && this.isPermisoGuardarCambiosTipoParametroConta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoParametroConta() {
		if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoParametroConta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoParametroConta() {
	}
	
	public void jTableDatosTipoParametroContaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoParametroConta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoParametroContaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParametroConta(this.gettipoparametroconta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparametroconta==null) {
						this.tipoparametroconta = new TipoParametroConta();
					}

					this.setVariablesFormularioToObjetoActualTipoParametroConta(this.tipoparametroconta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
				}

				if(this.tipoparametroconta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoparametroconta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParametroConta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoParametroContaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoParametroConta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoParametroConta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoParametroConta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoParametroConta(this.gettipoparametroconta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoparametrocontaLogic.getConnexion());

				if(this.tipoparametroconta.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoparametroconta.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoParametroConta=(TitledBorder)this.jScrollPanelDatosTipoParametroConta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoParametroConta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoParametroContaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParametroConta(this.gettipoparametroconta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparametroconta==null) {
						this.tipoparametroconta = new TipoParametroConta();
					}

					this.setVariablesFormularioToObjetoActualTipoParametroConta(this.tipoparametroconta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
				}

				if(this.tipoparametroconta.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoparametroconta.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParametroConta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoParametroContaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParametroConta(this.gettipoparametroconta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparametroconta==null) {
						this.tipoparametroconta = new TipoParametroConta();
					}

					this.setVariablesFormularioToObjetoActualTipoParametroConta(this.tipoparametroconta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
				}

				if(this.tipoparametroconta.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoparametroconta.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParametroConta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoParametroContaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParametroConta(this.gettipoparametroconta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparametroconta==null) {
						this.tipoparametroconta = new TipoParametroConta();
					}

					this.setVariablesFormularioToObjetoActualTipoParametroConta(this.tipoparametroconta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);
				}

				if(this.tipoparametroconta.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoparametroconta.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParametroConta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoParametroContaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoParametroConta(false,false);

			this.getTipoParametroContasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoParametroConta(false);

			//if(TipoParametroContaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoParametroConta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparametrocontaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoParametroConta() {
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
		

		if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
			this.jInternalFrameDetalleFormTipoParametroConta.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoParametroConta.dispose();
			this.jInternalFrameDetalleFormTipoParametroConta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoParametroConta!=null) {
			this.jInternalFrameReporteDinamicoTipoParametroConta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoParametroConta.dispose();
			this.jInternalFrameReporteDinamicoTipoParametroConta=null;
		}
		
		if(this.jInternalFrameImportacionTipoParametroConta!=null) {
			this.jInternalFrameImportacionTipoParametroConta.setVisible(false);	    			
			this.jInternalFrameImportacionTipoParametroConta.dispose();
			this.jInternalFrameImportacionTipoParametroConta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoParametroConta();
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoParametroConta")) {
				jButtonNuevoTipoParametroContaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoParametroConta")) {
				jButtonDuplicarTipoParametroContaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoParametroConta")) {
				jButtonCopiarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoParametroConta")) {
				jButtonVerFormTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoParametroConta")) {
				jButtonNuevoTipoParametroContaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoParametroConta")) {
				jButtonDuplicarTipoParametroContaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoParametroConta")) {
				jButtonNuevoTipoParametroContaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoParametroConta")) {
				jButtonDuplicarTipoParametroContaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoParametroConta")) {
				jButtonNuevoTipoParametroContaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoParametroConta")) {
				jButtonNuevoTipoParametroContaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoParametroConta")) {
				jButtonNuevoTipoParametroContaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoParametroConta")) {
				jButtonModificarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoParametroConta")) {
				jButtonModificarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoParametroConta")) {
				jButtonModificarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoParametroConta")) {
				jButtonActualizarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoParametroConta")) {
				jButtonActualizarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoParametroConta")) {
				jButtonActualizarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoParametroConta")) {
				jButtonEliminarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoParametroConta")) {
				jButtonEliminarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoParametroConta")) {
				jButtonEliminarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoParametroConta")) {
				jButtonCancelarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoParametroConta")) {
				jButtonCancelarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoParametroConta")) {
				jButtonCancelarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoParametroConta")) {
				jButtonCerrarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoParametroConta")) {
				jButtonCerrarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoParametroConta")) {
				jButtonCerrarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoParametroConta")) {
				jButtonMostrarOcultarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoParametroConta")) {
				jButtonCancelarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoParametroConta")) {
				jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoParametroConta")) {
				jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoParametroConta")) {
				jButtonCopiarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoParametroConta")) {
				jButtonVerFormTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoParametroConta")) {
				jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoParametroConta")) {
				jButtonCopiarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoParametroConta")) {
				jButtonVerFormTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoParametroConta")) {
				jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoParametroConta")) {
				jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoParametroConta")) {
				jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoParametroConta")) {
				jButtonRecargarInformacionTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoParametroConta")) {
				jButtonRecargarInformacionTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoParametroConta")) {
				jButtonRecargarInformacionTipoParametroContaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoParametroConta")) {
				jButtonAnterioresTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoParametroConta")) {
				jButtonAnterioresTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoParametroConta")) {
				jButtonAnterioresTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoParametroConta")) {
				jButtonSiguientesTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoParametroConta")) {
				jButtonSiguientesTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoParametroConta")) {
				jButtonSiguientesTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoParametroConta") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoParametroConta")) {
				jButtonAbrirOrderByTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoParametroConta") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoParametroConta")) {
				jButtonMostrarOcultarTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParametroConta")) {
				jButtonNuevoGuardarCambiosTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoParametroConta")) {
				jButtonNuevoGuardarCambiosTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoParametroConta")) {
				jButtonNuevoGuardarCambiosTipoParametroContaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoParametroConta")) {
				jButtonCerrarReporteDinamicoTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoParametroConta")) {
				jButtonGenerarReporteDinamicoTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoParametroConta")) {
				
				jButtonGenerarExcelReporteDinamicoTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoParametroConta")) {
				jButtonCerrarImportacionTipoParametroContaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoParametroConta")) {
				
				jButtonGenerarImportacionTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoParametroConta")) {
				
				jButtonAbrirImportacionTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoParametroConta")) {
				jComboBoxTiposAccionesTipoParametroContaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoParametroConta")) {
				jComboBoxTiposRelacionesTipoParametroContaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoParametroConta")) {
				jComboBoxTiposAccionesTipoParametroContaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoParametroConta")) {
				
				jComboBoxTiposSeleccionarTipoParametroContaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoParametroConta")) {
				jTextFieldValorCampoGeneralTipoParametroContaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoParametroConta")) {
				jButtonAbrirOrderByTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoParametroConta")) {
				jButtonAbrirOrderByTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoParametroConta")) {
				jButtonCerrarOrderByTipoParametroContaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParametroContaBusqueda")) {
				this.jButtonidTipoParametroContaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoParametroContaUpdate")) {
				this.jButtonid_empresaTipoParametroContaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoParametroContaBusqueda")) {
				this.jButtonid_empresaTipoParametroContaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoParametroContaBusqueda")) {
				this.jButtoncodigoTipoParametroContaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParametroContaBusqueda")) {
				this.jButtonnombreTipoParametroContaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoParametroConta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroContaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				


				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoParametroConta tipoparametrocontaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoparametrocontaLocal=this.tipoparametroconta;
			} else {
				tipoparametrocontaLocal=this.tipoparametrocontaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
							
				
				


				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroContaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
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
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
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
			
			


			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroContaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
								
						
				


				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
								
				
				


				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroContaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroContaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroContaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
							
				
				


				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroContaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
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
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
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
			
			


			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroContaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
								
				
				


				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroContaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroContaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroContaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoParametroConta")) {
					jCheckBoxSeleccionarTodosTipoParametroContaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoParametroConta")) {
					jCheckBoxSeleccionadosTipoParametroContaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoParametroConta")) {
					
				}
				
				


				
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
												
				
				


				
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroContaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroContaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
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
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
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
			
			


			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParametroContaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparametroconta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparametroconta);
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
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
				
				


				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParametroConta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParametroConta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParametroContaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparametrocontaAnterior =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoParametroConta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoParametroContaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoParametroConta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoparametroconta =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoparametroconta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoParametroConta")) {
				
				}
				
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoParametroConta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoParametroConta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoParametroConta")) {
			
			}
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoParametroConta();
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoParametroConta")) {
				jButtonNuevoTipoParametroContaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoParametroConta")) {
				jButtonDuplicarTipoParametroContaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoParametroConta")) {
				jButtonCopiarTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoParametroConta")) {
				jButtonVerFormTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoParametroConta")) {
				jButtonNuevoTipoParametroContaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoParametroConta")) {
				jButtonModificarTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoParametroConta")) {
				jButtonActualizarTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoParametroConta")) {
				jButtonEliminarTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoParametroConta")) {
				jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoParametroConta")) {
				jButtonCancelarTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoParametroConta")) {
				jButtonCerrarTipoParametroContaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoParametroConta")) {
				jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParametroConta")) {
				jButtonNuevoGuardarCambiosTipoParametroContaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoParametroConta")) {
				jButtonAbrirOrderByTipoParametroContaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoParametroConta")) {
				jButtonRecargarInformacionTipoParametroContaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoParametroConta")) {
				jButtonAnterioresTipoParametroContaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoParametroConta")) {
				jButtonSiguientesTipoParametroContaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParametroContaBusqueda")) {
				this.jButtonidTipoParametroContaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoParametroContaUpdate")) {
				this.jButtonid_empresaTipoParametroContaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoParametroContaBusqueda")) {
				this.jButtonid_empresaTipoParametroContaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoParametroContaBusqueda")) {
				this.jButtoncodigoTipoParametroContaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParametroContaBusqueda")) {
				this.jButtonnombreTipoParametroContaBusquedaActionPerformed(evt);
			}
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoParametroConta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoParametroConta")) {
				closingInternalFrameTipoParametroConta();
				
			} else if(sTipo.equals("jButtonCancelarTipoParametroConta")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoParametroConta = (JInternalFrameBase)evt.getSource();
	            	
	            TipoParametroContaBeanSwingJInternalFrame jInternalFrameParent=(TipoParametroContaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParametroConta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoParametroContaActionPerformed(null);
			}
			
			TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparametroconta,new Object(),this.tipoparametrocontaParameterGeneral,this.tipoparametrocontaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoParametroConta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoParametroConta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoParametroConta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoparametroconta)) {
			if(!esControlTabla) {
				if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoParametroConta(this.tipoparametroconta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);			
				}
				
				if(this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoParametroConta(this.tipoparametroconta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparametrocontaReturnGeneral=tipoparametrocontaLogic.procesarEventosTipoParametroContasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparametrocontaLogic.getTipoParametroContas(),this.tipoparametroconta,this.tipoparametrocontaParameterGeneral,this.isEsNuevoTipoParametroConta,classes);//this.tipoparametrocontaLogic.getTipoParametroConta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoParametroConta(this.tipoparametrocontaReturnGeneral,this.tipoparametrocontaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoParametroConta(classes,this.tipoparametrocontaReturnGeneral,this.tipoparametrocontaBean,false);
					}
						
					if(this.tipoparametrocontaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoParametroConta(this.tipoparametrocontaReturnGeneral.getTipoParametroConta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoParametroConta(this.tipoparametrocontaReturnGeneral.getTipoParametroConta());	
					}
						
					if(this.tipoparametrocontaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoParametroConta(this.tipoparametrocontaReturnGeneral.getTipoParametroConta(),classes);//this.tipoparametrocontaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoParametroConta(this.tipoparametroconta,classes);//this.tipoparametrocontaBean);									
				}
			
				if(TipoParametroContaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoParametroConta(this.tipoparametroconta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParametroConta(this.tipoparametroconta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoparametrocontaAnterior!=null) {
						this.tipoparametroconta=this.tipoparametrocontaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparametrocontaReturnGeneral=tipoparametrocontaLogic.procesarEventosTipoParametroContasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparametrocontaLogic.getTipoParametroContas(),this.tipoparametroconta,this.tipoparametrocontaParameterGeneral,this.isEsNuevoTipoParametroConta,classes);//this.tipoparametrocontaLogic.getTipoParametroConta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparametrocontaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoparametrocontaReturnGeneral.getTipoParametroConta(),tipoparametrocontaLogic.getTipoParametroContas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoparametrocontaReturnGeneral.getTipoParametroConta(),this.tipoparametrocontas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoParametroConta.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoParametroConta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoParametroConta();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoParametroConta() throws Exception {
		
		TipoParametroContaModel tipoparametrocontaModel=(TipoParametroContaModel)this.jTableDatosTipoParametroConta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparametrocontaModel.tipoparametrocontas=this.tipoparametrocontaLogic.getTipoParametroContas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoparametrocontaModel.tipoparametrocontas=this.tipoparametrocontas;
		}
		
		
		((TipoParametroContaModel) this.jTableDatosTipoParametroConta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoParametroConta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoparametrocontaAnterior(),this.tipoparametrocontaLogic.getTipoParametroContas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoparametrocontaAnterior(),this.tipoparametrocontas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoParametroConta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoParametroConta(TipoParametroConta tipoparametroconta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContaDetalle.class)) {
					this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.setParametroContaDetalles(tipoparametroconta.getParametroContaDetalles());
					this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContaDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
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
										
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparametroconta,new Object(),generalEntityParameterGeneral,this.tipoparametrocontaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoParametroContaConstantesFunciones.getClassesRelationshipsOfTipoParametroConta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoParametroContaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoParametroConta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoParametroConta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoParametroContaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparametroconta,new Object(),generalEntityParameterGeneral,this.tipoparametrocontaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoParametroConta(TipoParametroContaBean tipoparametrocontaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContaDetalle.class)) {
					this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.setParametroContaDetalles(tipoparametroconta.getParametroContaDetalles());
					this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContaDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoParametroConta(ArrayList<Classe> classes,TipoParametroContaReturnGeneral tipoparametrocontaReturnGeneral,TipoParametroContaBean tipoparametrocontaBean,Boolean conDefault) throws Exception {
		
			this.tipoparametrocontaBean.setParametroContaDetalles(tipoparametrocontaReturnGeneral.getTipoParametroConta().getParametroContaDetalles());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoParametroConta(TipoParametroConta tipoparametroconta,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContaDetalle.class)) {
					tipoparametroconta.setParametroContaDetalles(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleLogic.getParametroContaDetalles());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoparametroconta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoParametroConta = new TipoParametroContaDetalleFormJInternalFrame(jDesktopPane,this.tipoparametrocontaSessionBean.getConGuardarRelaciones(),this.tipoparametrocontaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParametroConta);
		this.jInternalFrameDetalleFormTipoParametroConta.setVisible(false);
		this.jInternalFrameDetalleFormTipoParametroConta.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoParametroConta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoParametroConta.tipoparametrocontaLogic=this.tipoparametrocontaLogic;
		
		this.cargarCombosFrameForeignKeyTipoParametroConta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParametroConta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParametroConta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoParametroConta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoParametroConta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoParametroConta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParametroConta"));
		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonModificarTipoParametroConta.addActionListener(new ButtonActionListener(this,"ModificarTipoParametroConta"));

		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonModificarToolBarTipoParametroConta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParametroConta"));
					
		this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemModificarTipoParametroConta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParametroConta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonActualizarTipoParametroConta.addActionListener (new ButtonActionListener(this,"ActualizarTipoParametroConta"));
		
		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonActualizarToolBarTipoParametroConta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParametroConta"));
						
		this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemActualizarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParametroConta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonEliminarTipoParametroConta.addActionListener (new ButtonActionListener(this,"EliminarTipoParametroConta"));
		
		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonEliminarToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParametroConta"));
								
		this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemEliminarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParametroConta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonCancelarTipoParametroConta.addActionListener (new ButtonActionListener(this,"CancelarTipoParametroConta"));
		
		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonCancelarToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParametroConta"));
					
		this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemCancelarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParametroConta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemDetalleCerrarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParametroConta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParametroConta"));
		
		
		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParametroConta"));
		
		
		
		this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParametroConta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonidTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParametroContaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonid_empresaTipoParametroContaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoParametroContaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonid_empresaTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoParametroContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtoncodigoTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoParametroContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonnombreTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParametroContaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoParametroConta.jTabbedPaneRelacionesTipoParametroConta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParametroConta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoParametroConta"));
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParametroConta"));
		}
		
		this.jTableDatosTipoParametroConta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoParametroConta"));
		
		this.jTableDatosTipoParametroConta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoParametroConta"));
		
		this.jButtonNuevoTipoParametroConta.addActionListener(new ButtonActionListener(this,"NuevoTipoParametroConta"));
		
		this.jButtonDuplicarTipoParametroConta.addActionListener(new ButtonActionListener(this,"DuplicarTipoParametroConta"));
		
		this.jButtonCopiarTipoParametroConta.addActionListener(new ButtonActionListener(this,"CopiarTipoParametroConta"));
		
		this.jButtonVerFormTipoParametroConta.addActionListener(new ButtonActionListener(this,"VerFormTipoParametroConta"));
		
		
		this.jButtonNuevoToolBarTipoParametroConta.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoParametroConta"));
			
		this.jButtonDuplicarToolBarTipoParametroConta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoParametroConta"));
			
		this.jMenuItemNuevoTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoParametroConta"));
			
		this.jMenuItemDuplicarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoParametroConta"));		
		
		
		this.jButtonNuevoRelacionesTipoParametroConta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoParametroConta"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoParametroConta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoParametroConta"));
			
		this.jMenuItemNuevoRelacionesTipoParametroConta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoParametroConta"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonModificarTipoParametroConta.addActionListener(new ButtonActionListener(this,"ModificarTipoParametroConta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonModificarToolBarTipoParametroConta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParametroConta"));
			
			this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemModificarTipoParametroConta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParametroConta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonActualizarTipoParametroConta.addActionListener (new ButtonActionListener(this,"ActualizarTipoParametroConta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonActualizarToolBarTipoParametroConta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParametroConta"));
				
			this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemActualizarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParametroConta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonEliminarTipoParametroConta.addActionListener (new ButtonActionListener(this,"EliminarTipoParametroConta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonEliminarToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParametroConta"));
						
			this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemEliminarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParametroConta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonCancelarTipoParametroConta.addActionListener (new ButtonActionListener(this,"CancelarTipoParametroConta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonCancelarToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParametroConta"));
			
			this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemCancelarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParametroConta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoParametroConta"));		
		
		
		this.jButtonCerrarTipoParametroConta.addActionListener (new ButtonActionListener(this,"CerrarTipoParametroConta"));
		
		
		this.jButtonCerrarToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoParametroConta"));
			
		this.jMenuItemCerrarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoParametroConta"));
			
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jMenuItemDetalleCerrarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParametroConta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosTipoParametroConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoParametroConta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParametroConta"));
		}
		
		this.jButtonCopiarToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoParametroConta"));
			
		this.jButtonVerFormToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoParametroConta"));
		
		this.jMenuItemGuardarCambiosTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoParametroConta"));
			
		this.jMenuItemCopiarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoParametroConta"));		
		
		this.jMenuItemVerFormTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoParametroConta"));		
		
		
		this.jButtonGuardarCambiosTablaTipoParametroConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParametroConta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoParametroConta"));
			
		this.jMenuItemGuardarCambiosTablaTipoParametroConta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParametroConta"));		
		
		
		
		this.jButtonRecargarInformacionTipoParametroConta.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoParametroConta"));
					
		this.jButtonRecargarInformacionToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoParametroConta"));
		
		this.jMenuItemRecargarInformacionTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoParametroConta"));		
		
		
		
		this.jButtonAnterioresTipoParametroConta.addActionListener (new ButtonActionListener(this,"AnterioresTipoParametroConta"));
		
		
		this.jButtonAnterioresToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoParametroConta"));
		
		this.jMenuItemAnterioresTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoParametroConta"));		
		
		
		this.jButtonSiguientesTipoParametroConta.addActionListener (new ButtonActionListener(this,"SiguientesTipoParametroConta"));
		
		
		this.jButtonSiguientesToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoParametroConta"));
			
		this.jMenuItemSiguientesTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoParametroConta"));
			
		this.jMenuItemAbrirOrderByTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoParametroConta"));
			
		this.jMenuItemMostrarOcultarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoParametroConta"));
			
		this.jMenuItemDetalleAbrirOrderByTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoParametroConta"));
			
		this.jMenuItemDetalleMostarOcultarTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoParametroConta"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoParametroConta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoParametroConta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoParametroConta"));
			
		this.jMenuItemNuevoGuardarCambiosTipoParametroConta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoParametroConta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoParametroConta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoParametroConta"));

		this.jCheckBoxSeleccionadosTipoParametroConta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoParametroConta"));
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParametroConta"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoParametroConta.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoParametroConta"));
			
		this.jComboBoxTiposAccionesTipoParametroConta.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoParametroConta"));
					
		this.jComboBoxTiposSeleccionarTipoParametroConta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoParametroConta"));
			
		this.jTextFieldValorCampoGeneralTipoParametroConta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoParametroConta"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonidTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParametroContaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonid_empresaTipoParametroContaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoParametroContaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonid_empresaTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoParametroContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtoncodigoTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoParametroContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonnombreTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParametroContaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoParametroConta!=null) {
				this.jInternalFrameReporteDinamicoTipoParametroConta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParametroConta"));
				this.jInternalFrameReporteDinamicoTipoParametroConta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParametroConta"));
				this.jInternalFrameReporteDinamicoTipoParametroConta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParametroConta"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoParametroConta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParametroConta"));				
			//this.jButtonGenerarReporteDinamicoTipoParametroConta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParametroConta"));
			//this.jButtonGenerarExcelReporteDinamicoTipoParametroConta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParametroConta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoParametroConta!=null) {
				this.jInternalFrameImportacionTipoParametroConta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParametroConta"));
				this.jInternalFrameImportacionTipoParametroConta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParametroConta"));
				this.jInternalFrameImportacionTipoParametroConta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParametroConta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoParametroConta.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoParametroConta"));
			
			this.jButtonAbrirOrderByToolBarTipoParametroConta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoParametroConta"));			
			
			if(this.jInternalFrameOrderByTipoParametroConta!=null) {
				this.jInternalFrameOrderByTipoParametroConta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParametroConta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParametroConta.jTabbedPaneRelacionesTipoParametroConta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParametroConta"));
		
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
            		closingInternalFrameTipoParametroConta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoParametroConta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoParametroConta = (JInternalFrameBase)event.getSource();
	            	
	            TipoParametroContaBeanSwingJInternalFrame jInternalFrameParent=(TipoParametroContaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParametroConta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoParametroContaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoParametroConta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoParametroContaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoParametroConta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoParametroConta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroContaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroContaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroContaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoParametroConta";
		inputMap = this.jButtonNuevoTipoParametroConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoParametroConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParametroContaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroContaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroContaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParametroContaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoParametroConta";
		inputMap = this.jButtonNuevoRelacionesTipoParametroConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoParametroConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParametroContaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoParametroConta";
		inputMap = this.jButtonModificarTipoParametroConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoParametroConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoParametroContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoParametroConta";
		inputMap = this.jButtonActualizarTipoParametroConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoParametroConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoParametroContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoParametroConta";
		inputMap = this.jButtonEliminarTipoParametroConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoParametroConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoParametroContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoParametroConta";
		inputMap = this.jButtonCancelarTipoParametroConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoParametroConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoParametroContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoParametroConta";
		inputMap = this.jButtonCerrarTipoParametroConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoParametroConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoParametroContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoParametroConta";
		inputMap = this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosTipoParametroConta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonGuardarCambiosTipoParametroConta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoParametroContaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoParametroConta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoParametroContaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoParametroConta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoParametroContaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoParametroConta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoParametroContaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoParametroConta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoParametroContaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonidTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParametroContaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonid_empresaTipoParametroContaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoParametroContaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonid_empresaTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoParametroContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtoncodigoTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoParametroContaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParametroConta.jButtonnombreTipoParametroContaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParametroContaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoParametroConta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoParametroContaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoParametroContaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoParametroConta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoParametroConta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontaLogic.getTipoParametroContas()) {
					tipoparametrocontaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontas) {
					tipoparametrocontaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoParametroContaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParametroConta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontaLogic.getTipoParametroContas()) {
						tipoparametrocontaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontas) {
						tipoparametrocontaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontaLogic.getTipoParametroContas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParametroConta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParametroConta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParametroConta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroConta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoParametroContaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParametroConta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoParametroConta.getSelectedRows();
			
			TipoParametroConta tipoparametrocontaLocal=new TipoParametroConta();
			
			//this.seleccionarTodosTipoParametroConta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparametrocontaLocal =(TipoParametroConta) this.tipoparametrocontaLogic.getTipoParametroContas().toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoparametrocontaLocal =(TipoParametroConta) this.tipoparametrocontas.toArray()[this.jTableDatosTipoParametroConta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoparametrocontaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontaLogic.getTipoParametroContas()) {
						tipoparametrocontaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontas) {
						tipoparametrocontaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoParametroConta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParametroConta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParametroConta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParametroConta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoParametroContaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoParametroContaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoParametroContaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoParametroConta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoParametroConta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontaLogic.getTipoParametroContas()) {
				
						if(sTipoSeleccionar.equals(TipoParametroContaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoparametrocontaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoParametroContaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparametrocontaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontas) {
					
						if(sTipoSeleccionar.equals(TipoParametroContaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoparametrocontaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoParametroContaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparametrocontaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParametroConta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoParametroContaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoParametroConta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoParametroConta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoParametroConta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoParametroConta) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoParametroConta(conSplash);
				
					this.generarReporteTipoParametroContasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoParametroContasSeleccionados();
				//this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParametroContasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParametroContasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParametroConta();
				
				this.exportarTipoParametroContasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoParametroContas();
				//this.importarTipoParametroContas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParametroConta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoParametroContasSeleccionados();
				//this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Parametro Conta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoParametroConta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoParametroConta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoParametroConta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Parametro Conta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoParametroContaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoParametroConta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoParametroConta(conSplash);
					
						//this.actualizarParametrosGeneralTipoParametroConta();
						
						this.generarReporteProcesoAccionTipoParametroContasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoParametroContaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Parametro ContaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Parametro Conta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoParametroConta();
				
						this.actualizarParametrosGeneralTipoParametroConta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoparametrocontaReturnGeneral=tipoparametrocontaLogic.procesarAccionTipoParametroContasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoparametrocontaLogic.getTipoParametroContas(),this.tipoparametrocontaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoParametroContaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoParametroConta();
					
					TipoParametroContaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoParametroContaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParametroConta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxTiposAccionesFormularioTipoParametroConta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoParametroConta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoParametroContaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoParametroConta();
			
			if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();		
			TipoParametroConta tipoparametroconta=new TipoParametroConta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoParametroConta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoParametroConta.getSelectedItem();
			
			
			
			
			tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoparametrocontasSeleccionados.size()==1) {
				for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontasSeleccionados) {
					tipoparametroconta=tipoparametrocontaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Conta Detalle")) {
					jButtonParametroContaDetalleActionPerformed(null,rowIndex,true,false,tipoparametroconta);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoParametroConta();
			
      		//this.finishProcessTipoParametroConta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoParametroContaReturnGeneral() throws Exception {
		if(this.tipoparametrocontaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoparametrocontaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoparametrocontaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoparametrocontaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoparametrocontaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoparametrocontaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoParametroConta(false);
		}
		
		if(this.tipoparametrocontaReturnGeneral.getConRetornoLista() || this.tipoparametrocontaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoparametrocontaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparametrocontaLogic.setTipoParametroContas(this.tipoparametrocontaReturnGeneral.getTipoParametroContas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoparametrocontaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparametrocontaLogic.setTipoParametroConta(this.tipoparametrocontaReturnGeneral.getTipoParametroConta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoParametroConta(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoParametroConta() throws Exception {
		
		
	}
	
	public ArrayList<TipoParametroConta> getTipoParametroContasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoParametroConta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontaLogic.getTipoParametroContas()) {
					if(tipoparametrocontaAux.getIsSelected()) {
						tipoparametrocontasSeleccionados.add(tipoparametrocontaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParametroConta tipoparametrocontaAux:this.tipoparametrocontas) {
					if(tipoparametrocontaAux.getIsSelected()) {
						tipoparametrocontasSeleccionados.add(tipoparametrocontaAux);				
					}
				}
			}
			
			if(tipoparametrocontasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoparametrocontasSeleccionados.addAll(this.tipoparametrocontaLogic.getTipoParametroContas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoparametrocontasSeleccionados.addAll(this.tipoparametrocontas);				
					}
				}
			}
		} else {
			tipoparametrocontasSeleccionados.add(this.tipoparametroconta);
		}
		
		return tipoparametrocontasSeleccionados;
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
	
	public void generarReporteTipoParametroContasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoParametroContasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoParametroContasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParametroContasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParametroContasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoParametroContasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Parametro Conta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoParametroContasSeleccionados() throws Exception {
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();		
		
		tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoParametroContas("Todos",tipoparametrocontasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoParametroContasSeleccionados() throws Exception {
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();		
		
		tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoParametroContas("Todos",tipoparametrocontasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoParametroContasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();
		
		tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoParametroContas("Todos",tipoparametrocontasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoParametroContasSeleccionados() throws Exception {
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoParametroConta();
		
		
		tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoParametroConta();
		
		
		//this.generarReporteTipoParametroContas("Todos",tipoparametrocontasSeleccionados ,tipoparametrocontaImplementable,tipoparametrocontaImplementableHome);
	}
	
	public void mostrarImportacionTipoParametroContas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoParametroConta();
		
		this.abrirFrameImportacionTipoParametroConta();		
		
			
		//this.generarReporteTipoParametroContas("Todos",tipoparametrocontasSeleccionados ,tipoparametrocontaImplementable,tipoparametrocontaImplementableHome);
	}
	
	public void importarTipoParametroContas() throws Exception {		
	
	}
	
	public void exportarTipoParametroContasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoParametroContasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoParametroContasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoParametroContasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Parametro Conta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoParametroContasSeleccionados() throws Exception {
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();		
		
		tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroconta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoParametroConta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoParametroConta(tipoparametrocontaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoparametrocontaAux.setsDetalleGeneralEntityReporte(tipoparametrocontaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Conta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoParametroConta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoParametroContaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParametroContaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParametroContaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParametroContaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoParametroConta(TipoParametroConta tipoparametroconta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoparametroconta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparametroconta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparametroconta.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparametroconta.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparametroconta.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoParametroContasSeleccionados() throws Exception {
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();		
		
		tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroconta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoParametroContas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoParametroConta(row);				
				iRow++;
			}				
			
			for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoParametroConta(tipoparametrocontaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Conta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoParametroContasSeleccionados() throws Exception {
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();		
		
		tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparametroconta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoparametrocontas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoparametroconta");
			//elementRoot.appendChild(element);
		
			for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontasSeleccionados) {
				element = document.createElement("tipoparametroconta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoParametroConta(tipoparametrocontaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Parametro Conta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoParametroConta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParametroContaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoParametroConta(TipoParametroConta tipoparametroconta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparametroconta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparametroconta.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparametroconta.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparametroconta.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoParametroConta(TipoParametroConta tipoparametroconta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoParametroContaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoparametroconta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoParametroContaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoparametroconta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoParametroContaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoparametroconta.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoParametroContaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoparametroconta.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoParametroContaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoparametroconta.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoParametroContasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados=new ArrayList<TipoParametroConta>();
		
		tipoparametrocontasSeleccionados=this.getTipoParametroContasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoParametroConta(tipoparametrocontasSeleccionados);
		
		this.generarReporteTipoParametroContas("Todos",tipoparametrocontasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoParametroConta(ArrayList<TipoParametroConta> tipoparametrocontasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontasSeleccionados) {
				tipoparametrocontaAux.setsDetalleGeneralEntityReporte(tipoparametrocontaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoparametrocontaAux.setsDescripcionGeneralEntityReporte1(tipoparametrocontaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoParametroContaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoparametrocontaAux.setsDescripcionGeneralEntityReporte1(tipoparametrocontaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoParametroContaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoparametrocontaAux.setsDescripcionGeneralEntityReporte1(tipoparametrocontaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParametroContaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoParametroConta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoParametroConta=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=true;
				this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=true;
			}
			
			this.isVisibilidadCeldaModificarTipoParametroConta=false;
			this.isVisibilidadCeldaActualizarTipoParametroConta=false;
			this.isVisibilidadCeldaEliminarTipoParametroConta=false;
			this.isVisibilidadCeldaCancelarTipoParametroConta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroConta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroConta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoParametroConta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=false;
			this.isVisibilidadCeldaModificarTipoParametroConta=false;
			this.isVisibilidadCeldaActualizarTipoParametroConta=true;
			this.isVisibilidadCeldaEliminarTipoParametroConta=false;
			this.isVisibilidadCeldaCancelarTipoParametroConta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroConta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroConta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoParametroConta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=false;
			this.isVisibilidadCeldaModificarTipoParametroConta=false;
			this.isVisibilidadCeldaActualizarTipoParametroConta=true;
			this.isVisibilidadCeldaEliminarTipoParametroConta=true;
			this.isVisibilidadCeldaCancelarTipoParametroConta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroConta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroConta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoParametroConta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=false;
			this.isVisibilidadCeldaModificarTipoParametroConta=false;
			this.isVisibilidadCeldaActualizarTipoParametroConta=true;
			this.isVisibilidadCeldaEliminarTipoParametroConta=false;
			this.isVisibilidadCeldaCancelarTipoParametroConta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroConta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroConta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoParametroConta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=true;
			this.isVisibilidadCeldaModificarTipoParametroConta=false;
			this.isVisibilidadCeldaActualizarTipoParametroConta=false;
			this.isVisibilidadCeldaEliminarTipoParametroConta=false;
			this.isVisibilidadCeldaCancelarTipoParametroConta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroConta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroConta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoParametroConta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=false;
			this.isVisibilidadCeldaActualizarTipoParametroConta=false;
			this.isVisibilidadCeldaEliminarTipoParametroConta=false;
			this.isVisibilidadCeldaCancelarTipoParametroConta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroConta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroConta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoParametroConta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=false;
			this.isVisibilidadCeldaModificarTipoParametroConta=true;
			this.isVisibilidadCeldaActualizarTipoParametroConta=false;
			this.isVisibilidadCeldaEliminarTipoParametroConta=false;
			this.isVisibilidadCeldaCancelarTipoParametroConta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParametroConta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParametroConta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoParametroContaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoParametroConta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=true;
		} else {
			this.actualizarEstadoPanelsTipoParametroConta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoParametroConta=false;
			//this.isVisibilidadCeldaVerFormTipoParametroConta=false;
			this.isVisibilidadCeldaDuplicarTipoParametroConta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoParametroConta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoparametrocontaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=false;												
			}
			
			this.jButtonCerrarTipoParametroConta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParametroConta=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoparametroconta)) {
			this.isVisibilidadCeldaActualizarTipoParametroConta=false;
			this.isVisibilidadCeldaEliminarTipoParametroConta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParametroConta() {
		this.isVisibilidadCeldaNuevoTipoParametroConta=false;
		this.isVisibilidadCeldaGuardarCambiosTipoParametroConta=false;
	}
	
	public void actualizarEstadoPanelsTipoParametroConta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoParametroConta!=null) {
				this.jScrollPanelDatosEdicionTipoParametroConta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParametroConta!=null) {
				this.jTabbedPaneBusquedasTipoParametroConta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParametroConta!=null) {
				this.jScrollPanelDatosTipoParametroConta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParametroConta!=null) {
				this.jPanelPaginacionTipoParametroConta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParametroConta!=null) {
				this.jPanelParametrosReportesTipoParametroConta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoParametroConta!=null) {
				this.jScrollPanelDatosEdicionTipoParametroConta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParametroConta!=null) {
				this.jTabbedPaneBusquedasTipoParametroConta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoParametroConta!=null) {
				this.jScrollPanelDatosTipoParametroConta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParametroConta!=null) {
				this.jPanelPaginacionTipoParametroConta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParametroConta!=null) {
				this.jPanelParametrosReportesTipoParametroConta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoParametroConta!=null) {
				this.jScrollPanelDatosEdicionTipoParametroConta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParametroConta!=null) {
				this.jTabbedPaneBusquedasTipoParametroConta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParametroConta!=null) {
				this.jScrollPanelDatosTipoParametroConta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParametroConta!=null) {
				this.jPanelPaginacionTipoParametroConta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParametroConta!=null) {
				this.jPanelParametrosReportesTipoParametroConta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoParametroConta!=null) {
				this.jScrollPanelDatosEdicionTipoParametroConta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParametroConta!=null) {
				this.jTabbedPaneBusquedasTipoParametroConta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParametroConta!=null) {
				this.jScrollPanelDatosTipoParametroConta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParametroConta!=null) {
				this.jPanelPaginacionTipoParametroConta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParametroConta!=null) {
				this.jPanelParametrosReportesTipoParametroConta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoParametroConta!=null) {
				this.jScrollPanelDatosEdicionTipoParametroConta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParametroConta!=null) {
				this.jTabbedPaneBusquedasTipoParametroConta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParametroConta!=null) {
				this.jScrollPanelDatosTipoParametroConta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParametroConta!=null) {
				this.jPanelPaginacionTipoParametroConta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParametroConta!=null) {
				this.jPanelParametrosReportesTipoParametroConta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoParametroConta!=null) {
				this.jScrollPanelDatosEdicionTipoParametroConta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParametroConta!=null) {
				this.jTabbedPaneBusquedasTipoParametroConta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParametroConta!=null) {
				this.jScrollPanelDatosTipoParametroConta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParametroConta!=null) {
				this.jPanelPaginacionTipoParametroConta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParametroConta!=null) {
				this.jPanelParametrosReportesTipoParametroConta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoParametroConta!=null) {
				this.jScrollPanelDatosEdicionTipoParametroConta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParametroConta!=null) {
				this.jTabbedPaneBusquedasTipoParametroConta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParametroConta!=null) {
				this.jScrollPanelDatosTipoParametroConta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParametroConta!=null) {
				this.jPanelPaginacionTipoParametroConta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParametroConta!=null) {
				this.jPanelParametrosReportesTipoParametroConta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoParametroConta!=null) {
					this.jTabbedPaneBusquedasTipoParametroConta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoParametroConta!=null) {
				this.jPanelParametrosReportesTipoParametroConta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParametroConta!=null) {
				this.jTabbedPaneBusquedasTipoParametroConta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoParametroConta!=null) {
				this.jPanelParametrosReportesTipoParametroConta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoParametroContaParaParametroContaDetalles() throws Exception {
		Boolean isPaginaPopupParametroContaDetalle=false;

		try {

			if(this.tipoparametrocontaSessionBean==null) {
				this.tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleSessionBean==null) {
				this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
			}

			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleSessionBean.setsPathNavegacionActual(tipoparametrocontaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroContaDetalle=this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroContaDetalle(true);
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContaDetalle(TipoParametroContaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleSessionBean.setisBusquedaDesdeForeignKeySesionTipoParametroConta(true);
			this.jInternalFrameDetalleFormTipoParametroConta.parametrocontadetalleSessionBean.setlidTipoParametroContaActual(this.idTipoParametroContaActual);

			tipoparametrocontaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoParametroConta(true);
			tipoparametrocontaSessionBean.setlIdTipoParametroContaActualForeignKey(this.idTipoParametroContaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoParametroContaSessionBean tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
		
		if(this.tipoparametrocontaSessionBean==null) {
			this.tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
		}
		
		this.tipoparametrocontaSessionBean.setsUltimaBusquedaTipoParametroConta(this.getsAccionBusqueda());
		this.tipoparametrocontaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoparametrocontaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoparametrocontaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoParametroContaSessionBean tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
		
		if(this.tipoparametrocontaSessionBean==null) {
			this.tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
		}
		
		if(this.tipoparametrocontaSessionBean.getsUltimaBusquedaTipoParametroConta()!=null&&!this.tipoparametrocontaSessionBean.getsUltimaBusquedaTipoParametroConta().equals("")) {
			this.setsAccionBusqueda(tipoparametrocontaSessionBean.getsUltimaBusquedaTipoParametroConta());
			this.setiNumeroPaginacion(tipoparametrocontaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoparametrocontaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoparametrocontaSessionBean.getid_empresa());
				tipoparametrocontaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoparametrocontaSessionBean.setsUltimaBusquedaTipoParametroConta("");
		this.tipoparametrocontaSessionBean.setiNumeroPaginacion(TipoParametroContaConstantesFunciones.INUMEROPAGINACION);
		this.tipoparametrocontaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoParametroConta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoParametroConta() {
		this.updateBorderResaltarBusquedasFormularioTipoParametroConta();
		this.updateVisibilidadBusquedasFormularioTipoParametroConta();
		this.updateHabilitarBusquedasFormularioTipoParametroConta();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoParametroConta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoParametroConta.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoParametroConta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoParametroConta.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoParametroConta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoParametroConta.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoParametroConta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoParametroConta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoParametroConta() throws Exception {

		if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoParametroConta();
		this.updateVisibilidadResaltarControlesFormularioTipoParametroConta();
		this.updateHabilitarResaltarControlesFormularioTipoParametroConta();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoParametroConta() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoparametrocontaConstantesFunciones.resaltaridTipoParametroConta!=null && this.jInternalFrameDetalleFormTipoParametroConta!=null) {this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.setBorder(this.tipoparametrocontaConstantesFunciones.resaltaridTipoParametroConta);}
		if(this.tipoparametrocontaConstantesFunciones.resaltarid_empresaTipoParametroConta!=null && this.jInternalFrameDetalleFormTipoParametroConta!=null) {this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.setBorder(this.tipoparametrocontaConstantesFunciones.resaltarid_empresaTipoParametroConta);}
		if(this.tipoparametrocontaConstantesFunciones.resaltarcodigoTipoParametroConta!=null && this.jInternalFrameDetalleFormTipoParametroConta!=null) {this.jInternalFrameDetalleFormTipoParametroConta.jTextFieldcodigoTipoParametroConta.setBorder(this.tipoparametrocontaConstantesFunciones.resaltarcodigoTipoParametroConta);}
		if(this.tipoparametrocontaConstantesFunciones.resaltarnombreTipoParametroConta!=null && this.jInternalFrameDetalleFormTipoParametroConta!=null) {this.jInternalFrameDetalleFormTipoParametroConta.jTextAreanombreTipoParametroConta.setBorder(this.tipoparametrocontaConstantesFunciones.resaltarnombreTipoParametroConta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoParametroConta() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
	
		//this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.setVisible(this.tipoparametrocontaConstantesFunciones.mostraridTipoParametroConta);
		this.jInternalFrameDetalleFormTipoParametroConta.jPanelidTipoParametroConta.setVisible(this.tipoparametrocontaConstantesFunciones.mostraridTipoParametroConta);
		//this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.setVisible(this.tipoparametrocontaConstantesFunciones.mostrarid_empresaTipoParametroConta);
		this.jInternalFrameDetalleFormTipoParametroConta.jPanelid_empresaTipoParametroConta.setVisible(this.tipoparametrocontaConstantesFunciones.mostrarid_empresaTipoParametroConta);
		//this.jInternalFrameDetalleFormTipoParametroConta.jTextFieldcodigoTipoParametroConta.setVisible(this.tipoparametrocontaConstantesFunciones.mostrarcodigoTipoParametroConta);
		this.jInternalFrameDetalleFormTipoParametroConta.jPanelcodigoTipoParametroConta.setVisible(this.tipoparametrocontaConstantesFunciones.mostrarcodigoTipoParametroConta);
		//this.jInternalFrameDetalleFormTipoParametroConta.jTextAreanombreTipoParametroConta.setVisible(this.tipoparametrocontaConstantesFunciones.mostrarnombreTipoParametroConta);
		this.jInternalFrameDetalleFormTipoParametroConta.jPanelnombreTipoParametroConta.setVisible(this.tipoparametrocontaConstantesFunciones.mostrarnombreTipoParametroConta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoParametroConta() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParametroConta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParametroConta!=null) {
	
		this.jInternalFrameDetalleFormTipoParametroConta.jLabelidTipoParametroConta.setEnabled(this.tipoparametrocontaConstantesFunciones.activaridTipoParametroConta);
		this.jInternalFrameDetalleFormTipoParametroConta.jComboBoxid_empresaTipoParametroConta.setEnabled(this.tipoparametrocontaConstantesFunciones.activarid_empresaTipoParametroConta);
		this.jInternalFrameDetalleFormTipoParametroConta.jTextFieldcodigoTipoParametroConta.setEnabled(this.tipoparametrocontaConstantesFunciones.activarcodigoTipoParametroConta);
		this.jInternalFrameDetalleFormTipoParametroConta.jTextAreanombreTipoParametroConta.setEnabled(this.tipoparametrocontaConstantesFunciones.activarnombreTipoParametroConta);
		}
	}
	
		
}