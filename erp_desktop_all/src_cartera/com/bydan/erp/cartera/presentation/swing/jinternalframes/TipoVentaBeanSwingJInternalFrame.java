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

import com.bydan.erp.cartera.util.TipoVentaConstantesFunciones;
import com.bydan.erp.cartera.util.TipoVentaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoVentaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoVentaBean;
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
public class TipoVentaBeanSwingJInternalFrame extends TipoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoVenta> tipoventaValidator = new ClassValidator<TipoVenta>(TipoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoVenta tipoventa;	
	public TipoVenta tipoventaAux;
	public TipoVenta tipoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoVenta tipoventaTotales;
	public Long idTipoVentaActual;
	public Long iIdNuevoTipoVenta=0L;
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
	
	public Boolean isPermisoTodoTipoVenta;
	public Boolean isPermisoNuevoTipoVenta;
	public Boolean isPermisoActualizarTipoVenta;
	public Boolean isPermisoActualizarOriginalTipoVenta;
	public Boolean isPermisoEliminarTipoVenta;
	public Boolean isPermisoGuardarCambiosTipoVenta;
	public Boolean isPermisoConsultaTipoVenta;
	public Boolean isPermisoBusquedaTipoVenta;
	public Boolean isPermisoReporteTipoVenta;
	public Boolean isPermisoPaginacionMedioTipoVenta;
	public Boolean isPermisoPaginacionAltoTipoVenta;
	public Boolean isPermisoPaginacionTodoTipoVenta;
	public Boolean isPermisoCopiarTipoVenta;
	public Boolean isPermisoVerFormTipoVenta;
	public Boolean isPermisoDuplicarTipoVenta;
	public Boolean isPermisoOrdenTipoVenta;
	
	
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
	
	public TipoVentaParameterReturnGeneral tipoventaReturnGeneral;
	public TipoVentaParameterReturnGeneral tipoventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoVenta=false;
	public Boolean esParaAccionDesdeFormularioTipoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoVentaLogic tipoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoVenta tipoventaBean;
	public TipoVentaConstantesFunciones tipoventaConstantesFunciones;
	//public TipoVentaParameterReturnGeneral tipoventaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoVenta> tipoventas;	
	//public List<TipoVenta> tipoventasEliminados;
	//public List<TipoVenta> tipoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarTipoVenta=true;
	public Boolean isVisibilidadCeldaCopiarTipoVenta=true;
	public Boolean isVisibilidadCeldaVerFormTipoVenta=true;
	public Boolean isVisibilidadCeldaOrdenTipoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoVenta=false;
	public Boolean isVisibilidadCeldaModificarTipoVenta=false;
	public Boolean isVisibilidadCeldaActualizarTipoVenta=false;
	public Boolean isVisibilidadCeldaEliminarTipoVenta=false;
	public Boolean isVisibilidadCeldaCancelarTipoVenta=false;
	public Boolean isVisibilidadCeldaGuardarTipoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoVenta=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoVenta() {
		return this.iIdNuevoTipoVenta;
	}

	public void setiIdNuevoTipoVenta(Long iIdNuevoTipoVenta) {
		this.iIdNuevoTipoVenta = iIdNuevoTipoVenta;
	}
	
	public Long getidTipoVentaActual() {
		return this.idTipoVentaActual;
	}

	public void setidTipoVentaActual(Long idTipoVentaActual) {
		this.idTipoVentaActual = idTipoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoVenta gettipoventa() {
		return this.tipoventa;
	}

	public void settipoventa(TipoVenta tipoventa) {
		this.tipoventa = tipoventa;
	}
	
	public TipoVenta gettipoventaAux() {
		return this.tipoventaAux;
	}

	public void settipoventaAux(TipoVenta tipoventaAux) {
		this.tipoventaAux = tipoventaAux;
	}				
	
	public TipoVenta gettipoventaAnterior() {
		return this.tipoventaAnterior;
	}

	public void settipoventaAnterior(TipoVenta tipoventaAnterior) {
		this.tipoventaAnterior = tipoventaAnterior;
	}	
	
	public TipoVenta gettipoventaTotales() {
		return this.tipoventaTotales;
	}

	public void settipoventaTotales(TipoVenta tipoventaTotales) {
		this.tipoventaTotales = tipoventaTotales;
	}	
	
	public TipoVenta gettipoventaBean() {
		return this.tipoventaBean;
	}

	public void settipoventaBean(TipoVenta tipoventaBean) {
		this.tipoventaBean = tipoventaBean;
	}	
	
	public TipoVentaParameterReturnGeneral gettipoventaReturnGeneral() {
		return this.tipoventaReturnGeneral;
	}

	public void settipoventaReturnGeneral(TipoVentaParameterReturnGeneral tipoventaReturnGeneral) {
		this.tipoventaReturnGeneral = tipoventaReturnGeneral;
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
	
	
	public TipoVentaLogic getTipoVentaLogic()	{		
		return tipoventaLogic;
	}

	public void setTipoVentaLogic(TipoVentaLogic tipoventaLogic) {
		this.tipoventaLogic = tipoventaLogic;
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
	
	public Boolean getIsEsNuevoTipoVenta() {
		return isEsNuevoTipoVenta;
	}

	public void setIsEsNuevoTipoVenta(Boolean isEsNuevoTipoVenta) {
		this.isEsNuevoTipoVenta = isEsNuevoTipoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoVenta() {
		return esParaAccionDesdeFormularioTipoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioTipoVenta(Boolean esParaAccionDesdeFormularioTipoVenta) {
		this.esParaAccionDesdeFormularioTipoVenta = esParaAccionDesdeFormularioTipoVenta;
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

			if(this.tipoventaSessionBean==null) {
				this.tipoventaSessionBean=new TipoVentaSessionBean();
			}

			if(!this.tipoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoventaSessionBean.getlidEmpresaActual());
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

					if(this.tipoventa!=null) {
						this.tipoventa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoVenta!=null) {
						this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoVenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoVenta!=null) {
						if(this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoVentaGenerico)throws Exception
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
				jComboBoxid_empresaTipoVentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoVentaGenerico!=null && jComboBoxid_empresaTipoVentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoVenta tipoventa,JComboBox jComboBoxid_empresaTipoVentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoVentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoVentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoventa.setid_empresa(empresaAux.getId());
				tipoventa.setempresa_descripcion(TipoVentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoventa.setEmpresa(empresaAux);			}
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

					if(!TipoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoVenta!=null) { 
							this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoVenta!=null) { 
					}

					if(!TipoVentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoVenta!=null) {
							this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoVenta!=null) {
							this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoVentaConstantesFunciones.refrescarForeignKeysDescripcionesTipoVenta(this.tipoventaLogic.getTipoVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoVentaConstantesFunciones.refrescarForeignKeysDescripcionesTipoVenta(this.tipoventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoventaLogic.setTipoVentas(this.tipoventas);
			tipoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoVentaParameterReturnGeneral getTipoVentaParameterGeneral() {
		return this.tipoventaParameterGeneral;
	}
	
	public void setTipoVentaParameterGeneral(TipoVentaParameterReturnGeneral tipoventaParameterGeneral) {
		this.tipoventaParameterGeneral = tipoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoVenta() {
		return isPermisoTodoTipoVenta;
	}

	public void setIsPermisoTodoTipoVenta(Boolean isPermisoTodoTipoVenta) {
		this.isPermisoTodoTipoVenta = isPermisoTodoTipoVenta;
	}

	public Boolean getIsPermisoNuevoTipoVenta() {
		return isPermisoNuevoTipoVenta;
	}

	public void setIsPermisoNuevoTipoVenta(Boolean isPermisoNuevoTipoVenta) {
		this.isPermisoNuevoTipoVenta = isPermisoNuevoTipoVenta;
	}

	public Boolean getIsPermisoActualizarTipoVenta() {
		return isPermisoActualizarTipoVenta;
	}

	public void setIsPermisoActualizarTipoVenta(Boolean isPermisoActualizarTipoVenta) {
		this.isPermisoActualizarTipoVenta = isPermisoActualizarTipoVenta;
	}

	public Boolean getIsPermisoEliminarTipoVenta() {
		return isPermisoEliminarTipoVenta;
	}

	public void setIsPermisoEliminarTipoVenta(Boolean isPermisoEliminarTipoVenta) {
		this.isPermisoEliminarTipoVenta = isPermisoEliminarTipoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosTipoVenta() {
		return isPermisoGuardarCambiosTipoVenta;
	}

	public void setIsPermisoGuardarCambiosTipoVenta(Boolean isPermisoGuardarCambiosTipoVenta) {
		this.isPermisoGuardarCambiosTipoVenta = isPermisoGuardarCambiosTipoVenta;
	}
	
	public Boolean getIsPermisoConsultaTipoVenta() {
		return isPermisoConsultaTipoVenta;
	}

	public void setIsPermisoConsultaTipoVenta(Boolean isPermisoConsultaTipoVenta) {
		this.isPermisoConsultaTipoVenta = isPermisoConsultaTipoVenta;
	}

	public Boolean getIsPermisoBusquedaTipoVenta() {
		return isPermisoBusquedaTipoVenta;
	}

	public void setIsPermisoBusquedaTipoVenta(Boolean isPermisoBusquedaTipoVenta) {
		this.isPermisoBusquedaTipoVenta = isPermisoBusquedaTipoVenta;
	}

	public Boolean getIsPermisoReporteTipoVenta() {
		return isPermisoReporteTipoVenta;
	}

	public void setIsPermisoReporteTipoVenta(Boolean isPermisoReporteTipoVenta) {
		this.isPermisoReporteTipoVenta = isPermisoReporteTipoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoVenta() {
		return isPermisoPaginacionMedioTipoVenta;
	}

	public void setIsPermisoPaginacionMedioTipoVenta(Boolean isPermisoPaginacionMedioTipoVenta) {
		this.isPermisoPaginacionMedioTipoVenta = isPermisoPaginacionMedioTipoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoVenta() {
		return isPermisoPaginacionTodoTipoVenta;
	}

	public void setIsPermisoPaginacionTodoTipoVenta(Boolean isPermisoPaginacionTodoTipoVenta) {
		this.isPermisoPaginacionTodoTipoVenta = isPermisoPaginacionTodoTipoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoVenta() {
		return isPermisoPaginacionAltoTipoVenta;
	}

	public void setIsPermisoPaginacionAltoTipoVenta(Boolean isPermisoPaginacionAltoTipoVenta) {
		this.isPermisoPaginacionAltoTipoVenta = isPermisoPaginacionAltoTipoVenta;
	}
	
	public Boolean getIsPermisoCopiarTipoVenta() {
		return isPermisoCopiarTipoVenta;
	}

	public void setIsPermisoCopiarTipoVenta(Boolean isPermisoCopiarTipoVenta) {
		this.isPermisoCopiarTipoVenta = isPermisoCopiarTipoVenta;
	}
	
	public Boolean getIsPermisoVerFormTipoVenta() {
		return isPermisoVerFormTipoVenta;
	}

	public void setIsPermisoVerFormTipoVenta(Boolean isPermisoVerFormTipoVenta) {
		this.isPermisoVerFormTipoVenta = isPermisoVerFormTipoVenta;
	}
	
	public Boolean getIsPermisoDuplicarTipoVenta() {
		return isPermisoDuplicarTipoVenta;
	}

	public void setIsPermisoDuplicarTipoVenta(Boolean isPermisoDuplicarTipoVenta) {
		this.isPermisoDuplicarTipoVenta = isPermisoDuplicarTipoVenta;
	}
	
	public Boolean getIsPermisoOrdenTipoVenta() {
		return isPermisoOrdenTipoVenta;
	}

	public void setIsPermisoOrdenTipoVenta(Boolean isPermisoOrdenTipoVenta) {
		this.isPermisoOrdenTipoVenta = isPermisoOrdenTipoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoVenta() {
		return isVisibilidadCeldaNuevoTipoVenta;
	}

	public void setIsVisibilidadCeldaNuevoTipoVenta(Boolean isVisibilidadCeldaNuevoTipoVenta) {
		this.isVisibilidadCeldaNuevoTipoVenta = isVisibilidadCeldaNuevoTipoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoVenta() {
		return isVisibilidadCeldaDuplicarTipoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarTipoVenta(Boolean isVisibilidadCeldaDuplicarTipoVenta) {
		this.isVisibilidadCeldaDuplicarTipoVenta = isVisibilidadCeldaDuplicarTipoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoVenta() {
		return isVisibilidadCeldaCopiarTipoVenta;
	}

	public void setIsVisibilidadCeldaCopiarTipoVenta(Boolean isVisibilidadCeldaCopiarTipoVenta) {
		this.isVisibilidadCeldaCopiarTipoVenta = isVisibilidadCeldaCopiarTipoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoVenta() {
		return isVisibilidadCeldaVerFormTipoVenta;
	}

	public void setIsVisibilidadCeldaVerFormTipoVenta(Boolean isVisibilidadCeldaVerFormTipoVenta) {
		this.isVisibilidadCeldaVerFormTipoVenta = isVisibilidadCeldaVerFormTipoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoVenta() {
		return isVisibilidadCeldaOrdenTipoVenta;
	}

	public void setIsVisibilidadCeldaOrdenTipoVenta(Boolean isVisibilidadCeldaOrdenTipoVenta) {
		this.isVisibilidadCeldaOrdenTipoVenta = isVisibilidadCeldaOrdenTipoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoVenta() {
		return isVisibilidadCeldaNuevoRelacionesTipoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoVenta(Boolean isVisibilidadCeldaNuevoRelacionesTipoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesTipoVenta = isVisibilidadCeldaNuevoRelacionesTipoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoVenta() {
		return isVisibilidadCeldaModificarTipoVenta;
	}

	public void setIsVisibilidadCeldaModificarTipoVenta(Boolean isVisibilidadCeldaModificarTipoVenta) {
		this.isVisibilidadCeldaModificarTipoVenta = isVisibilidadCeldaModificarTipoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoVenta() {
		return isVisibilidadCeldaActualizarTipoVenta;
	}

	public void setIsVisibilidadCeldaActualizarTipoVenta(Boolean isVisibilidadCeldaActualizarTipoVenta) {
		this.isVisibilidadCeldaActualizarTipoVenta = isVisibilidadCeldaActualizarTipoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoVenta() {
		return isVisibilidadCeldaEliminarTipoVenta;
	}

	public void setIsVisibilidadCeldaEliminarTipoVenta(Boolean isVisibilidadCeldaEliminarTipoVenta) {
		this.isVisibilidadCeldaEliminarTipoVenta = isVisibilidadCeldaEliminarTipoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoVenta() {
		return isVisibilidadCeldaCancelarTipoVenta;
	}

	public void setIsVisibilidadCeldaCancelarTipoVenta(Boolean isVisibilidadCeldaCancelarTipoVenta) {
		this.isVisibilidadCeldaCancelarTipoVenta = isVisibilidadCeldaCancelarTipoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoVenta() {
		return isVisibilidadCeldaGuardarTipoVenta;
	}

	public void setIsVisibilidadCeldaGuardarTipoVenta(Boolean isVisibilidadCeldaGuardarTipoVenta) {
		this.isVisibilidadCeldaGuardarTipoVenta = isVisibilidadCeldaGuardarTipoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoVenta() {
		return isVisibilidadCeldaGuardarCambiosTipoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoVenta(Boolean isVisibilidadCeldaGuardarCambiosTipoVenta) {
		this.isVisibilidadCeldaGuardarCambiosTipoVenta = isVisibilidadCeldaGuardarCambiosTipoVenta;
	}
		
	public TipoVentaSessionBean gettipoventaSessionBean() {
		return this.tipoventaSessionBean;
	}
	
	public void settipoventaSessionBean(TipoVentaSessionBean tipoventaSessionBean) {
		this.tipoventaSessionBean=tipoventaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoVenta(TipoVenta tipoventa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoventa,null);
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
	
	public void bugActualizarReferenciaActual(TipoVenta tipoventa,TipoVenta tipoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoVenta(tipoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoventaAux.setId(tipoventa.getId());
		tipoventaAux.setVersionRow(tipoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoVenta();
		
			int intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoVenta(this.tipoventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoventaValidator.getInvalidValues(this.tipoventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoventaLogic.setDatosCliente(datosCliente);
			tipoventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoventaAux=new  TipoVenta();
				
				tipoventaAux.setIsNew(true);
				tipoventaAux.setIsChanged(true);
				
				tipoventaAux.setTipoVentaOriginal(this.tipoventa);
				
				tipoventaAux.setId(this.tipoventa.getId());	
				tipoventaAux.setVersionRow(this.tipoventa.getVersionRow());	
				tipoventaAux.setid_empresa(this.tipoventa.getid_empresa());	
				tipoventaAux.setcodigo(this.tipoventa.getcodigo());	
				tipoventaAux.setnombre(this.tipoventa.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoventaAux,tipoventaLogic.getTipoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoventaAux,tipoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoventaLogic.saveTipoVentas();//WithConnection
						//tipoventaLogic.getSetVersionRowTipoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoventa,tipoventaAux);
					
					this.refrescarForeignKeysDescripcionesTipoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoventaAux=new  TipoVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoventaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoventaSessionBean.getEsGuardarRelacionado() && this.tipoventa.getId()>=0)) {
						
					tipoventaAux.setIsNew(false);
				}
				
				tipoventaAux.setIsDeleted(false);
			
				tipoventaAux.setId(this.tipoventa.getId());	
				tipoventaAux.setVersionRow(this.tipoventa.getVersionRow());	
				tipoventaAux.setid_empresa(this.tipoventa.getid_empresa());	
				tipoventaAux.setcodigo(this.tipoventa.getcodigo());	
				tipoventaAux.setnombre(this.tipoventa.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoventaAux,tipoventaLogic.getTipoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoventaAux,tipoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoventaLogic.saveTipoVentas();//WithConnection
						//tipoventaLogic.getSetVersionRowTipoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoventa,tipoventaAux);
					
					this.refrescarForeignKeysDescripcionesTipoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoventaAux=new  TipoVenta();
				
				tipoventaAux.setIsNew(false);
				tipoventaAux.setIsChanged(false);
				
				tipoventaAux.setIsDeleted(true);
				
				tipoventaAux.setId(this.tipoventa.getId());	
				tipoventaAux.setVersionRow(this.tipoventa.getVersionRow());	
				tipoventaAux.setid_empresa(this.tipoventa.getid_empresa());	
				tipoventaAux.setcodigo(this.tipoventa.getcodigo());	
				tipoventaAux.setnombre(this.tipoventa.getnombre());	
				
				if(this.tipoventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoventaAux.getId()>=0) {	
						this.tipoventasEliminados.add(tipoventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoventaAux,tipoventaLogic.getTipoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoventaAux,tipoventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoventaLogic.saveTipoVentas();//WithConnection
						//tipoventaLogic.getSetVersionRowTipoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoventaAux,tipoventaLogic.getTipoVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoventaAux,tipoventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.getTipoVentas().addAll(this.tipoventasEliminados);
					
					tipoventaLogic.saveTipoVentas();//WithConnection
					//tipoventaLogic.getSetVersionRowTipoVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoVenta();
				
				this.tipoventasEliminados= new ArrayList<TipoVenta>();		
			}
			
			if(this.tipoventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Venta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Venta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoventa=tipoventaAux;
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
      		//this.finishProcessTipoVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoVenta tipoventaLocal) throws Exception {
		
		if(this.tipoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoVenta tipoventaLocal) throws Exception {	
		if(this.tipoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoventaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoventaValidator.getInvalidValues(this.tipoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoVenta tipoventa,List<TipoVenta> tipoventas) throws Exception {
		try	{		
			TipoVentaConstantesFunciones.actualizarLista(tipoventa,tipoventas,this.tipoventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoVenta tipoventa,List<TipoVenta> tipoventas) throws Exception {
		try	{			
			TipoVentaConstantesFunciones.actualizarSelectedLista(tipoventa,tipoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoVenta> tipoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoventasLocal=this.tipoventaLogic.getTipoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoventasLocal=this.tipoventas;
			}
			//ARCHITECTURE
		
			for(TipoVenta tipoventaLocal:tipoventasLocal) {
				if(this.permiteMantenimiento(tipoventaLocal) && tipoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoVentaConstantesFunciones.getTipoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoVentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVenta.jLabelid_empresaTipoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoVentaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVenta.jLabelcodigoTipoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoVentaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVenta.jLabelnombreTipoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVenta.jLabelid_empresaTipoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVenta.jLabelcodigoTipoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVenta.jLabelnombreTipoVenta,"");
		
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
		this.iIdNuevoTipoVenta--;	
		
		
		this.tipoventaAux=new TipoVenta();
		
		this.tipoventaAux.setId(this.iIdNuevoTipoVenta);
		this.tipoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoventaLogic.getTipoVentas().add(this.tipoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoventas.add(this.tipoventaAux);
		}
		//ARCHITECTURE
		
		this.tipoventa=this.tipoventaAux;
		
		if(TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoVenta(this.tipoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoVenta(this.tipoventa);
		}
				
		//this.setDefaultControlesTipoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoVenta(this.tipoventaBean,this.tipoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoventaSessionBean.getConGuardarRelaciones()) {
			classes=TipoVentaConstantesFunciones.getClassesRelationshipsOfTipoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoventaReturnGeneral=tipoventaLogic.procesarEventosTipoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoventaLogic.getTipoVentas(),this.tipoventa,this.tipoventaParameterGeneral,this.isEsNuevoTipoVenta,classes);//this.tipoventaLogic.getTipoVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoVenta(this.tipoventaReturnGeneral,this.tipoventaBean,false);
		
		if(this.tipoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoVenta(this.tipoventaReturnGeneral.getTipoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoVenta(this.tipoventaReturnGeneral.getTipoVenta());
		}
		
		if(this.tipoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoVenta(this.tipoventaReturnGeneral.getTipoVenta(),classes);//this.tipoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoVenta(this.tipoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoVenta(false);
						
			if(tipoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVenta();
			}
			
			this.actualizarVisualTableDatosTipoVenta();
			
			this.jTableDatosTipoVenta.setRowSelectionInterval(this.getIndiceNuevoTipoVenta(), this.getIndiceNuevoTipoVenta());
			
			this.seleccionarFilaTablaTipoVentaActual();
						
			this.actualizarEstadoCeldasBotonesTipoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoVenta.jTextFieldcodigoTipoVenta.setEnabled(isHabilitar && this.tipoventaConstantesFunciones.activarcodigoTipoVenta);
		this.jInternalFrameDetalleFormTipoVenta.jTextAreanombreTipoVenta.setEnabled(isHabilitar && this.tipoventaConstantesFunciones.activarnombreTipoVenta);	
		//
		this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.setEnabled(isHabilitar && this.tipoventaConstantesFunciones.activarid_empresaTipoVenta);
	};
	
	public void setDefaultControlesTipoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoventaSessionBean.setConGuardarRelaciones(true);			
			this.tipoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoVenta.jTabbedPaneRelacionesTipoVenta.setVisible(true);
			
					
		} else {
			//this.tipoventaSessionBean.setConGuardarRelaciones(false);			
			this.tipoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoVenta.jTabbedPaneRelacionesTipoVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVenta tipoventaAux:this.tipoventaLogic.getTipoVentas()) {
				if(tipoventaAux.getId().equals(this.iIdNuevoTipoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVenta tipoventaAux:this.tipoventas) {
				if(tipoventaAux.getId().equals(this.iIdNuevoTipoVenta)) {
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
	
	public int getIndiceActualTipoVenta(TipoVenta tipoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVenta tipoventaAux:this.tipoventaLogic.getTipoVentas()) {
				if(tipoventaAux.getId().equals(tipoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVenta tipoventaAux:this.tipoventas) {
				if(tipoventaAux.getId().equals(tipoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoVenta(TipoVenta tipoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVenta tipoventaAux:this.tipoventaLogic.getTipoVentas()) {
				if(tipoventaAux.getTipoVentaOriginal().getId().equals(tipoventaOriginal.getId())) {
					existe=true;
					tipoventaOriginal.setId(tipoventaAux.getId());
					tipoventaOriginal.setVersionRow(tipoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVenta tipoventaAux:this.tipoventas) {
				if(tipoventaAux.getTipoVentaOriginal().getId().equals(tipoventaOriginal.getId())) {
					existe=true;
					tipoventaOriginal.setId(tipoventaAux.getId());
					tipoventaOriginal.setVersionRow(tipoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoVenta(Boolean esParaCancelar) throws Exception {
		tipoventasAux=new ArrayList<TipoVenta>();
		tipoventaAux=new TipoVenta();
		
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoVenta tipoventaAux:this.tipoventaLogic.getTipoVentas()) {
					if(tipoventaAux.getId()<0) {
						tipoventasAux.add(tipoventaAux);
					}		
				}
				this.iIdNuevoTipoVenta=0L;
				this.tipoventaLogic.getTipoVentas().removeAll(tipoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVenta tipoventaAux:this.tipoventas) {
					if(tipoventaAux.getId()<0) {
						tipoventasAux.add(tipoventaAux);
					}		
				}
				this.iIdNuevoTipoVenta=0L;
				this.tipoventas.removeAll(tipoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoVenta 
					&& this.tipoventaLogic.getTipoVentas().size()>0
					) {
					tipoventaAux=this.tipoventaLogic.getTipoVentas().get(this.tipoventaLogic.getTipoVentas().size() - 1);
				
					if(tipoventaAux.getId()<0) {
						this.tipoventaLogic.getTipoVentas().remove(tipoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoVenta && this.tipoventas.size()>0) {
					tipoventaAux=this.tipoventas.get(this.tipoventas.size() - 1);
				
					if(tipoventaAux.getId()<0) {
						this.tipoventas.remove(tipoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoventa.getId()<0) {
				this.tipoventaLogic.getTipoVentas().remove(this.tipoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoventa.getId()<0) {
				this.tipoventas.remove(this.tipoventa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoVenta(List<TipoVenta> tipoventasAux) throws Exception {
		TipoVentaConstantesFunciones.setEstadosInicialesTipoVenta(tipoventasAux);
	}
	
	public void setEstadosInicialesTipoVenta(TipoVenta tipoventaAux) throws Exception {
		TipoVentaConstantesFunciones.setEstadosInicialesTipoVenta(tipoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoVentaActual()) {
				if(!this.isEsNuevoTipoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Venta ?", "MANTENIMIENTO DE Tipo Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoVenta tipoventa) throws Exception {
		TipoVentaConstantesFunciones.seleccionarAsignar(this.tipoventa,tipoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoVenta=this.isPermisoActualizarOriginalTipoVenta;
			
			
			this.seleccionarAsignar(tipoventa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoVentaConstantesFunciones.quitarEspaciosTipoVenta(this.tipoventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoventaSessionBean.setsFuncionBusquedaRapida(this.tipoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoVenta(esParaCancelar);				
				this.cancelarNuevoTipoVenta(esParaCancelar);								
			}
			
			this.tipoventa=new TipoVenta();
			
			this.inicializarTipoVenta();
			
			this.actualizarEstadoCeldasBotonesTipoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoVenta() throws Exception {
		try {
			TipoVentaConstantesFunciones.inicializarTipoVenta(this.tipoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoventaLogic.getTipoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoVentas(String sAccionBusqueda,List<TipoVenta> tipoventasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Ventas");		
		parameters.put("busquedapor", TipoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoVenta=new JRBeanArrayDataSource(TipoVentaJInternalFrame.TraerTipoVentaBeans(tipoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoVentaBean.TraerTipoVentaBeans(tipoventasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoVentas(sAccionBusqueda,sTipoArchivoReporte,tipoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoVentas(sAccionBusqueda,sTipoArchivoReporte,tipoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoVentaActionPerformed(null);
					//this.generarExcelReporteTipoVentas(sAccionBusqueda,sTipoArchivoReporte,tipoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoVentas(sAccionBusqueda,sTipoArchivoReporte,tipoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoVentas(sAccionBusqueda,sTipoArchivoReporte,tipoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoVentas(sAccionBusqueda,sTipoArchivoReporte,tipoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVenta> tipoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoVenta tipoventa : tipoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoVentaConstantesFunciones.generarExcelReporteDataTipoVenta("NORMAL",row,workbook,tipoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoVenta(String sTipo,Row row,Workbook workbook) {
		
		TipoVentaConstantesFunciones.generarExcelReporteHeaderTipoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVenta> tipoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoVenta tipoventa : tipoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoVentaConstantesFunciones.getTipoVentaDescripcion(tipoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoVentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoVentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoventa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoVentaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoVentaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoventa.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoVentaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoVentaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoventa.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVenta> tipoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoVenta> tipoventasRespaldo=null;
		
		classes=TipoVentaConstantesFunciones.getClassesRelationshipsOfTipoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoventaLogic.setDatosCliente(this.datosCliente);
		this.tipoventaLogic.setDatosDeep(this.datosDeep);
		this.tipoventaLogic.setIsConDeep(true);
		
		tipoventasRespaldo=this.tipoventaLogic.getTipoVentas();
		
		this.tipoventaLogic.setTipoVentas(tipoventasParaReportes);	
		this.tipoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoventasParaReportes=this.tipoventaLogic.getTipoVentas();
		this.tipoventaLogic.setTipoVentas(tipoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoVenta tipoventa : tipoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoVentaConstantesFunciones.generarExcelReporteDataTipoVenta("NORMAL",row,workbook,tipoventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoVentaConstantesFunciones.getTipoVentaDescripcion(tipoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoVenta() throws Exception {		
		this.startProcessTipoVenta(true);
	}
	
	public void startProcessTipoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoVenta ,this.jPanelParametrosReportesTipoVenta, this.jScrollPanelDatosTipoVenta,this.jPanelPaginacionTipoVenta, this.jScrollPanelDatosEdicionTipoVenta, this.jPanelAccionesTipoVenta,this.jPanelAccionesFormularioTipoVenta,this.jmenuBarTipoVenta,this.jmenuBarDetalleTipoVenta,this.jTtoolBarTipoVenta,this.jTtoolBarDetalleTipoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoVenta=this.jTabbedPaneBusquedasTipoVenta; 
		
		final JPanel jPanelParametrosReportesTipoVenta=this.jPanelParametrosReportesTipoVenta;
		//final JScrollPane jScrollPanelDatosTipoVenta=this.jScrollPanelDatosTipoVenta;
		final JTable jTableDatosTipoVenta=this.jTableDatosTipoVenta;		
		final JPanel jPanelPaginacionTipoVenta=this.jPanelPaginacionTipoVenta;
		//final JScrollPane jScrollPanelDatosEdicionTipoVenta=this.jScrollPanelDatosEdicionTipoVenta;
		final JPanel jPanelAccionesTipoVenta=this.jPanelAccionesTipoVenta;
		
		JPanel jPanelCamposAuxiliarTipoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			jPanelCamposAuxiliarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jPanelCamposTipoVenta;
			jPanelAccionesFormularioAuxiliarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jPanelAccionesFormularioTipoVenta;
		}
		
		final JPanel jPanelCamposTipoVenta=jPanelCamposAuxiliarTipoVenta;
		final JPanel jPanelAccionesFormularioTipoVenta=jPanelAccionesFormularioAuxiliarTipoVenta;
		
		
		final JMenuBar jmenuBarTipoVenta=this.jmenuBarTipoVenta;
		final JToolBar jTtoolBarTipoVenta=this.jTtoolBarTipoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			jmenuBarDetalleAuxiliarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jmenuBarDetalleTipoVenta;
			jTtoolBarDetalleAuxiliarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jTtoolBarDetalleTipoVenta;
		}
		
		final JMenuBar jmenuBarDetalleTipoVenta=jmenuBarDetalleAuxiliarTipoVenta;
		final JToolBar jTtoolBarDetalleTipoVenta=jTtoolBarDetalleAuxiliarTipoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoVenta;
			processRunnable.jTableDatos=jTableDatosTipoVenta;
			processRunnable.jPanelCampos=jPanelCamposTipoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesTipoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarTipoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoVenta;
			processRunnable.jTtoolBar=jTtoolBarTipoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoVenta ,jPanelParametrosReportesTipoVenta,jTableDatosTipoVenta, /*jScrollPanelDatosTipoVenta,*/jPanelCamposTipoVenta,jPanelPaginacionTipoVenta, /*jScrollPanelDatosEdicionTipoVenta,*/ jPanelAccionesTipoVenta,jPanelAccionesFormularioTipoVenta,jmenuBarTipoVenta,jmenuBarDetalleTipoVenta,jTtoolBarTipoVenta,jTtoolBarDetalleTipoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoVenta ,jPanelParametrosReportesTipoVenta, jScrollPanelDatosTipoVenta,jPanelPaginacionTipoVenta, jScrollPanelDatosEdicionTipoVenta, jPanelAccionesTipoVenta,jPanelAccionesFormularioTipoVenta,jmenuBarTipoVenta,jmenuBarDetalleTipoVenta,jTtoolBarTipoVenta,jTtoolBarDetalleTipoVenta);
						
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
	
	public void finishProcessTipoVenta() {// throws Exception 
		this.finishProcessTipoVenta(true);
	}
	
	public void finishProcessTipoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoVenta ,this.jPanelParametrosReportesTipoVenta, this.jScrollPanelDatosTipoVenta,this.jPanelPaginacionTipoVenta, this.jScrollPanelDatosEdicionTipoVenta, this.jPanelAccionesTipoVenta,this.jPanelAccionesFormularioTipoVenta,this.jmenuBarTipoVenta,this.jmenuBarDetalleTipoVenta,this.jTtoolBarTipoVenta,this.jTtoolBarDetalleTipoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoVenta=this.jTabbedPaneBusquedasTipoVenta; 
		
		final JPanel jPanelParametrosReportesTipoVenta=this.jPanelParametrosReportesTipoVenta;
		//final JScrollPane jScrollPanelDatosTipoVenta=this.jScrollPanelDatosTipoVenta;
		final JTable jTableDatosTipoVenta=this.jTableDatosTipoVenta;		
		final JPanel jPanelPaginacionTipoVenta=this.jPanelPaginacionTipoVenta;
		//final JScrollPane jScrollPanelDatosEdicionTipoVenta=this.jScrollPanelDatosEdicionTipoVenta;
		final JPanel jPanelAccionesTipoVenta=this.jPanelAccionesTipoVenta;
		
		JPanel jPanelCamposAuxiliarTipoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			jPanelCamposAuxiliarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jPanelCamposTipoVenta;
			jPanelAccionesFormularioAuxiliarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jPanelAccionesFormularioTipoVenta;
		}
		
		final JPanel jPanelCamposTipoVenta=jPanelCamposAuxiliarTipoVenta;
		final JPanel jPanelAccionesFormularioTipoVenta=jPanelAccionesFormularioAuxiliarTipoVenta;
		
		
		final JMenuBar jmenuBarTipoVenta=this.jmenuBarTipoVenta;		
		final JToolBar jTtoolBarTipoVenta=this.jTtoolBarTipoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			jmenuBarDetalleAuxiliarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jmenuBarDetalleTipoVenta;
			jTtoolBarDetalleAuxiliarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jTtoolBarDetalleTipoVenta;		
		}
		
		final JMenuBar jmenuBarDetalleTipoVenta=jmenuBarDetalleAuxiliarTipoVenta;
		final JToolBar jTtoolBarDetalleTipoVenta=jTtoolBarDetalleAuxiliarTipoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoVenta;
			processRunnable.jTableDatos=jTableDatosTipoVenta;
			processRunnable.jPanelCampos=jPanelCamposTipoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesTipoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarTipoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoVenta;
			processRunnable.jTtoolBar=jTtoolBarTipoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoVenta ,jPanelParametrosReportesTipoVenta, jTableDatosTipoVenta,/*jScrollPanelDatosTipoVenta,*/jPanelCamposTipoVenta,jPanelPaginacionTipoVenta, /*jScrollPanelDatosEdicionTipoVenta,*/ jPanelAccionesTipoVenta,jPanelAccionesFormularioTipoVenta,jmenuBarTipoVenta,jmenuBarDetalleTipoVenta,jTtoolBarTipoVenta,jTtoolBarDetalleTipoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoventaConstantesFunciones.getsFinalQueryTipoVenta();
		String  finalQueryPaginacionTodos=this.tipoventaConstantesFunciones.getsFinalQueryTipoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoVentaConstantesFunciones.getArrayColumnasGlobalesNoTipoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoVentaConstantesFunciones.getArrayColumnasGlobalesTipoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoventasEliminados= new ArrayList<TipoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoVenta();
		
				///*TipoVentaSessionBean*/this.tipoventaSessionBean=new TipoVentaSessionBean();
			
			if(this.tipoventaSessionBean==null) {
				this.tipoventaSessionBean=new TipoVentaSessionBean();
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
					this.iNumeroPaginacion=TipoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoVentaConstantesFunciones.getClassesForeignKeysOfTipoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoventasAux= new ArrayList<TipoVenta>();
			
				
			tipoventaLogic.setDatosCliente(this.datosCliente);
			tipoventaLogic.setDatosDeep(this.datosDeep);
			tipoventaLogic.setIsConDeep(true);
			
			
			tipoventaLogic.getTipoVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoventaLogic.getTodosTipoVentas(finalQueryGlobal,pagination);
					
					//tipoventaLogic.getTodosTipoVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoventaLogic.getTipoVentas()==null|| tipoventaLogic.getTipoVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoventasAux= new ArrayList<TipoVenta>();
							tipoventasAux.addAll(tipoventaLogic.getTipoVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoventasAux= new ArrayList<TipoVenta>();
							tipoventasAux.addAll(tipoventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoventaLogic.getTodosTipoVentas(finalQueryGlobal+"",this.pagination);												
							
							//tipoventaLogic.getTodosTipoVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoVentas("Todos",tipoventaLogic.getTipoVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoventaLogic.setTipoVentas(new ArrayList<TipoVenta>());					
							tipoventaLogic.getTipoVentas().addAll(tipoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoventas=new ArrayList<TipoVenta>();
							tipoventas.addAll(tipoventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoVenta=this.idActual;
				
				} else if(this.idTipoVentaActual!=null && this.idTipoVentaActual!=0L) {
					idTipoVenta=idTipoVentaActual;
				}
				
					
				this.sDetalleReporte=TipoVentaConstantesFunciones.getDetalleIndicePorId(idTipoVenta);
				
				this.tipoventas=new ArrayList<TipoVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoventaLogic.getEntity(idTipoVenta);
					
					//tipoventaLogic.getEntityWithConnection(idTipoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoventaLogic.setTipoVentas(new ArrayList<TipoVenta>());
					tipoventaLogic.getTipoVentas().add(tipoventaLogic.getTipoVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoventas=new ArrayList<TipoVenta>();
					this.tipoventas.add(tipoventa);
				}
				
				if(tipoventaLogic.getTipoVenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoventaLogic.getTipoVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoventaLogic.getTipoVentas()==null||tipoventaLogic.getTipoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoventas==null|| tipoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoventasAux=new ArrayList<TipoVenta>();
						tipoventasAux.addAll(tipoventaLogic.getTipoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoventasAux=new ArrayList<TipoVenta>();
							tipoventasAux.addAll(tipoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoventaLogic.getTipoVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoVentas("FK_IdEmpresa",tipoventaLogic.getTipoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoVentas("FK_IdEmpresa",tipoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoventaLogic.setTipoVentas(new ArrayList<TipoVenta>());
						tipoventaLogic.getTipoVentas().addAll(tipoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoventas=new ArrayList<TipoVenta>();
							tipoventas.addAll(tipoventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoventaLogic.getTipoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoventaLogic.getTipoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoVenta tipoventa) {
		Boolean permite=true;
		
		if(this.tipoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoVentaConstantesFunciones.getOrderByListaTipoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoVentaConstantesFunciones.getOrderByListaTipoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVenta tipoventa:tipoventaLogic.getTipoVentas()) {
				if(tipoventa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoventaTotales=tipoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVenta tipoventa:this.tipoventas) {
				if(tipoventa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoventaTotales=tipoventa;
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
			this.tipoventaAux=new TipoVenta();
			this.tipoventaAux.setsType(Constantes2.S_TOTALES);
			this.tipoventaAux.setIsNew(false);
			this.tipoventaAux.setIsChanged(false);
			this.tipoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoVentaConstantesFunciones.TotalizarValoresFilaTipoVenta(this.tipoventaLogic.getTipoVentas(),this.tipoventaAux);
				
				this.tipoventaLogic.getTipoVentas().add(this.tipoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoVentaConstantesFunciones.TotalizarValoresFilaTipoVenta(this.tipoventas,this.tipoventaAux);
				
				this.tipoventas.add(this.tipoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoventaTotales=new TipoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoventaLogic.getTipoVentas().remove(tipoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoventas.remove(tipoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoventaTotales=new TipoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVenta tipoventa:tipoventaLogic.getTipoVentas()) {
				if(tipoventa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoventaTotales=tipoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoVentaConstantesFunciones.TotalizarValoresFilaTipoVenta(this.tipoventaLogic.getTipoVentas(),tipoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVenta tipoventa:this.tipoventas) {
				if(tipoventa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoventaTotales=tipoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoVentaConstantesFunciones.TotalizarValoresFilaTipoVenta(this.tipoventas,tipoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoVentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoVentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoventaLogic.getTipoVentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoVenta() {
		this.isPermisoTodoTipoVenta=false;
		this.isPermisoNuevoTipoVenta=false;
		this.isPermisoActualizarTipoVenta=false;
		this.isPermisoActualizarOriginalTipoVenta=false;
		this.isPermisoEliminarTipoVenta=false;
		this.isPermisoGuardarCambiosTipoVenta=false;
		this.isPermisoConsultaTipoVenta=false;
		this.isPermisoBusquedaTipoVenta=false;
		this.isPermisoReporteTipoVenta=false;		
		this.isPermisoOrdenTipoVenta=false;		
		this.isPermisoPaginacionMedioTipoVenta=false;		
		this.isPermisoPaginacionAltoTipoVenta=false;
		this.isPermisoPaginacionTodoTipoVenta=false;
		this.isPermisoCopiarTipoVenta=false;		
		this.isPermisoVerFormTipoVenta=false;		
		this.isPermisoDuplicarTipoVenta=false;		
		this.isPermisoOrdenTipoVenta=false;		
	}
	
	public void setPermisosUsuarioTipoVenta(Boolean isPermiso) {
		this.isPermisoTodoTipoVenta=isPermiso;
		this.isPermisoNuevoTipoVenta=isPermiso;
		this.isPermisoActualizarTipoVenta=isPermiso;
		this.isPermisoActualizarOriginalTipoVenta=isPermiso;
		this.isPermisoEliminarTipoVenta=isPermiso;
		this.isPermisoGuardarCambiosTipoVenta=isPermiso;
		this.isPermisoConsultaTipoVenta=isPermiso;
		this.isPermisoBusquedaTipoVenta=isPermiso;
		this.isPermisoReporteTipoVenta=isPermiso;
		this.isPermisoOrdenTipoVenta=isPermiso;		
		this.isPermisoPaginacionMedioTipoVenta=isPermiso;		
		this.isPermisoPaginacionAltoTipoVenta=isPermiso;		
		this.isPermisoPaginacionTodoTipoVenta=isPermiso;		
		this.isPermisoCopiarTipoVenta=isPermiso;		
		this.isPermisoVerFormTipoVenta=isPermiso;		
		this.isPermisoDuplicarTipoVenta=isPermiso;
		this.isPermisoOrdenTipoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoVenta(Boolean isPermiso) {
		//this.isPermisoTodoTipoVenta=isPermiso;
		this.isPermisoNuevoTipoVenta=isPermiso;
		this.isPermisoActualizarTipoVenta=isPermiso;
		this.isPermisoActualizarOriginalTipoVenta=isPermiso;
		this.isPermisoEliminarTipoVenta=isPermiso;
		this.isPermisoGuardarCambiosTipoVenta=isPermiso;
		//this.isPermisoConsultaTipoVenta=isPermiso;
		//this.isPermisoBusquedaTipoVenta=isPermiso;
		//this.isPermisoReporteTipoVenta=isPermiso;
		//this.isPermisoOrdenTipoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioTipoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoTipoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoTipoVenta=isPermiso;		
		//this.isPermisoCopiarTipoVenta=isPermiso;		
		//this.isPermisoDuplicarTipoVenta=isPermiso;
		//this.isPermisoOrdenTipoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoVenta=this.isPermisoActualizarTipoVenta;
			this.isPermisoEliminarTipoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoVenta.setToolTipText(this.jTableDatosTipoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoVenta() throws Exception {
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
	public void inicializarCombosForeignKeyTipoVentaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoVentaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoVentaParameterReturnGeneral tipoventaReturnGeneral=new TipoVentaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoventaConstantesFunciones.cargarid_empresaTipoVenta)
					 || (this.esRecargarFks && this.tipoventaConstantesFunciones.cargarid_empresaTipoVenta)) {

					if(!this.tipoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoventaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoventaReturnGeneral=tipoventaLogic.cargarCombosLoteForeignKeyTipoVenta(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoventaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoVenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoventaSessionBean==null) {
				this.tipoventaSessionBean=new TipoVentaSessionBean();
			}

			if(!this.tipoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoVenta(TipoVenta tipoventa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoVenta(TipoVenta tipoventa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoVenta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoVenta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta!=null && this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoventaSessionBean=new TipoVentaSessionBean(); 
		this.tipoventaConstantesFunciones=new TipoVentaConstantesFunciones(); 
		this.tipoventaBean=new TipoVenta();//(this.tipoventaConstantesFunciones); 		
		this.tipoventaReturnGeneral=new TipoVentaParameterReturnGeneral(); 
		
		this.tipoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoVenta(true);
			
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
			
			this.tipoventaConstantesFunciones=new TipoVentaConstantesFunciones(); 
			this.tipoventaBean=new TipoVenta();//this.tipoventaConstantesFunciones); 			
			this.tipoventaReturnGeneral=new TipoVentaParameterReturnGeneral(); 
		
			TipoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoventa=new TipoVenta();
			this.tipoventas = new ArrayList<TipoVenta>();
			this.tipoventasAux = new ArrayList<TipoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic=new TipoVentaLogic();
				this.tipoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoVenta);	
					}
					
					if(this.jInternalFrameImportacionTipoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoVenta);
				this.jInternalFrameDetalleFormTipoVenta.setVisible(false);
				this.jInternalFrameDetalleFormTipoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoVenta);
					this.jInternalFrameReporteDinamicoTipoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoVenta);
					this.jInternalFrameImportacionTipoVenta.setVisible(false);
					this.jInternalFrameImportacionTipoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoVenta);
					this.jInternalFrameOrderByTipoVenta.setVisible(false);
					this.jInternalFrameOrderByTipoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoventaReturnGeneral=new TipoVentaParameterReturnGeneral();
			
			this.tipoventaParameterGeneral=new TipoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoventaSessionBean.getEsGuardarRelacionado(),this.tipoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoventaSessionBean.getEsGuardarRelacionado(),this.tipoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoVenta=false;
			this.isVisibilidadCeldaDuplicarTipoVenta=true;
			this.isVisibilidadCeldaCopiarTipoVenta=true;
			this.isVisibilidadCeldaVerFormTipoVenta=true;
			this.isVisibilidadCeldaOrdenTipoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=false;
			this.isVisibilidadCeldaModificarTipoVenta=false;
			this.isVisibilidadCeldaActualizarTipoVenta=false;
			this.isVisibilidadCeldaEliminarTipoVenta=false;
			this.isVisibilidadCeldaCancelarTipoVenta=false;
			this.isVisibilidadCeldaGuardarTipoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoVenta(false);
			
			this.setPermisosUsuarioTipoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoventaSessionBean.getEsGuardarRelacionado() && this.tipoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoVentaClasesRelacionadas();
			}
			
			if(this.tipoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoVenta();
			}
			
			if(!this.isPermisoBusquedaTipoVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoVenta,this.isPermisoPaginacionMedioTipoVenta,this.isPermisoPaginacionTodoTipoVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoVentaConstantesFunciones.getTiposSeleccionarTipoVenta());
				
				this.tiposColumnasSelect=TipoVentaConstantesFunciones.getTiposSeleccionarTipoVenta(true);
				
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
			//if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVenta() ;
			
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
				tipoventaImplementable= (TipoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoventaImplementableHome= (TipoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoventas= new ArrayList<TipoVenta>();
			this.tipoventasEliminados= new ArrayList<TipoVenta>();
						
			this.isEsNuevoTipoVenta=false;
			this.esParaAccionDesdeFormularioTipoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoVenta();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoVenta")) {
				iIndex=this.jInternalFrameDetalleFormTipoVenta.jTabbedPaneRelacionesTipoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoVenta.jTabbedPaneRelacionesTipoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoVenta();	
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
	
	public void cargarCombosForeignKeyTipoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoVenta();
		
		this.cargarCombosFrameForeignKeyTipoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoVenta();
		}
	}
	
	
	
	public void jButtonNuevoTipoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
			
			if(jTableDatosTipoVenta.getRowCount()>=1) {
				jTableDatosTipoVenta.removeRowSelectionInterval(0, jTableDatosTipoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoVenta(true);			
			//this.tipoventa=new TipoVenta();
			//this.tipoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVenta() ;
			
			if(TipoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);				
			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
			if(this.tipoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoVenta.getSelectedRows().length;			
			}
			
			tipoventasSeleccionados=this.getTipoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoVenta--;			
				//TipoVenta tipoventaAux= new TipoVenta();			
				//tipoventaAux.setId(this.iIdNuevoTipoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoVenta tipoventaOrigen=new TipoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoVenta tipoventaOrigen : tipoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoventaOrigen =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoventaOrigen =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoVenta(tipoventaOrigen,this.tipoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoventaLogic.getTipoVentas().add(this.tipoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoventas.add(this.tipoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoVenta(false);
				
				this.jTableDatosTipoVenta.setRowSelectionInterval(this.getIndiceNuevoTipoVenta(), this.getIndiceNuevoTipoVenta());
				
				int iLastRow =  this.jTableDatosTipoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();									
		
			TipoVenta tipoventaOrigen=new TipoVenta();
			TipoVenta tipoventaDestino=new TipoVenta();
				
			tipoventasSeleccionados=this.getTipoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoventaOrigen =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoventaOrigen =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoventaDestino =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoventaDestino =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoventaOrigen =tipoventasSeleccionados.get(0);
				tipoventaDestino =tipoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoVenta(tipoventaOrigen,tipoventaDestino,true,false);
				
				tipoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoventaDestino,tipoventaLogic.getTipoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoventaDestino,tipoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoVenta(false);
				
				//this.jTableDatosTipoVenta.setRowSelectionInterval(this.getIndiceNuevoTipoVenta(), this.getIndiceNuevoTipoVenta());
				
				int iLastRow =  this.jTableDatosTipoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoVenta.setVisible(!isVisible);
			this.jPanelPaginacionTipoVenta.setVisible(!isVisible);
			this.jPanelAccionesTipoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoVenta();
			
			this.abrirFrameOrderByTipoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormTipoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoVenta.setSize(this.jInternalFrameDetalleFormTipoVenta.iWidthFormulario,this.jInternalFrameDetalleFormTipoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormTipoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoVenta.jContentPaneDetalleTipoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoVenta.jTabbedPaneRelacionesTipoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoVenta.jContentPaneDetalleTipoVenta.getWidth(),TipoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoVenta.jTabbedPaneRelacionesTipoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoVenta.jContentPaneDetalleTipoVenta.getWidth(),TipoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoVenta.jTabbedPaneRelacionesTipoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoVenta.jContentPaneDetalleTipoVenta.getWidth(),TipoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormTipoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVenta,false,this);
				} else {
					this.jInternalFrameOrderByTipoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoVenta);
				this.jInternalFrameOrderByTipoVenta.setVisible(false);
				this.jInternalFrameOrderByTipoVenta.setSelected(false);
				
				this.jInternalFrameOrderByTipoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByTipoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoVenta==null) {
				
				this.jInternalFrameImportacionTipoVenta=new ImportacionJInternalFrame(TipoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoVenta);
				this.jInternalFrameImportacionTipoVenta.setVisible(false);
				this.jInternalFrameImportacionTipoVenta.setSelected(false);


				this.jInternalFrameImportacionTipoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoVenta"));
				this.jInternalFrameImportacionTipoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoVenta"));
				this.jInternalFrameImportacionTipoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoVenta==null) {
				this.jInternalFrameReporteDinamicoTipoVenta=new ReporteDinamicoJInternalFrame(TipoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoVenta);
				this.jInternalFrameReporteDinamicoTipoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVenta"));
				this.jInternalFrameReporteDinamicoTipoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVenta"));
				this.jInternalFrameReporteDinamicoTipoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoVenta);
			
	       	this.jInternalFrameDetalleFormTipoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormTipoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoVenta.dispose();
			//this.jInternalFrameDetalleFormTipoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoVenta.setVisible(true);
	        this.jInternalFrameImportacionTipoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoVenta.setVisible(true);
	        this.jInternalFrameOrderByTipoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoVenta.setVisible(false);
	        this.jInternalFrameOrderByTipoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoVenta.setVisible(false);
	        this.jInternalFrameImportacionTipoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoVenta(true);
			//this.isEsNuevoTipoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVenta(false) ;
			
			if(tipoventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoVenta(true);
			//this.isEsNuevoTipoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoVenta(false) ;
			
			if(TipoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoVenta(false);
			
			//if(!this.isEsNuevoTipoVenta) {								
				int intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoVenta(this.tipoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
				
			}
			
			if(this.permiteMantenimiento(this.tipoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoVenta=true;
					this.inicializarActualizarBindingTablaTipoVenta(false);
					this.isEsNuevoTipoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVenta(false);
				
				this.habilitarDeshabilitarControlesTipoVenta(false);
			
												
				
				if(TipoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoVentaActionPerformed(evt,tipoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoVenta(this.tipoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				this.tipoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				this.tipoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoVentaModel) this.jTableDatosTipoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoVenta=true;
				this.inicializarActualizarBindingTablaTipoVenta(false);
				this.isEsNuevoTipoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVenta(false);
				
				this.habilitarDeshabilitarControlesTipoVenta(false);
				
				
				
				if(TipoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoVenta.getRowCount()>=1) {
				jTableDatosTipoVenta.removeRowSelectionInterval(0, jTableDatosTipoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVenta(false) ;
			
			this.isEsNuevoTipoVenta=false;
			
			if(TipoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoVenta(false);
				
				//SI ES MANUAL
				if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoVenta--;			
			//TipoVenta tipoventaAux= new TipoVenta();			
			//tipoventaAux.setId(this.iIdNuevoTipoVenta);
			
			if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
			
			this.tipoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoventaLogic.getTipoVentas().add(this.tipoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoventas.add(this.tipoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoVenta(false);
			
			this.jTableDatosTipoVenta.setRowSelectionInterval(this.getIndiceNuevoTipoVenta(), this.getIndiceNuevoTipoVenta());
			
			int iLastRow =  this.jTableDatosTipoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVenta(false);
			
			//SI ES MANUAL
			if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVenta();
			}
			
			//this.abrirFrameTreeTipoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo VentaS ?", "MANTENIMIENTO DE Tipo Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoventaReturnGeneral=tipoventaLogic.procesarImportacionTipoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoVenta.setFileImportacion(this.jInternalFrameImportacionTipoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();		

		tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoVentas("Todos",tipoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoVentaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoVentaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoVentaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoVentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoVentaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoVentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoVentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoVentaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoVentaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();		
		
		tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoVentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoVenta tipoventa:tipoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoventa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoVentaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoVentaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoVenta tipoventa:tipoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoventa.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoVentaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoVentaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoVenta tipoventa:tipoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoventa.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoVenta(row);				
			//	iRow++;
			//}				
			
			//for(TipoVenta tipoventaAux:tipoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoVenta(tipoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Venta",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVenta(false);
			
			//SI ES MANUAL
			if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVenta(false);
			
			//SI ES MANUAL
			if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVenta(false);
			
			//SI ES MANUAL
			if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoVenta();
		
		this.inicializarActualizarBindingBotonesManualTipoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoVenta.jCheckBoxPostAccionNuevoTipoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoVenta.jCheckBoxPostAccionSinCerrarTipoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoVenta.jCheckBoxPostAccionSinMensajeTipoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoVenta!=null) {
				this.jInternalFrameDetalleFormTipoVenta.jCheckBoxPostAccionNuevoTipoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoVenta.jCheckBoxPostAccionSinCerrarTipoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoVenta.jCheckBoxPostAccionSinMensajeTipoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoVenta() throws Exception {
		try	{
			if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoVenta.addItem(reporte);
			}
			
			
			if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoVenta!=null) {
				this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoVenta!=null) {
				this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoVenta(Boolean esInicializar) throws Exception {				
		if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoVenta() throws Exception {
		this.inicializarActualizarBindingTablaTipoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoventaLogic.getTipoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoVenta.setModel(new TipoVentaModel(this.tipoventaLogic.getTipoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoVenta.setModel(new TipoVentaModel(this.tipoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoVenta!=null && this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoVentaConstantesFunciones.SCLASSWEBTITULO,tipoventaConstantesFunciones.resaltarSeleccionarTipoVenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoVentaConstantesFunciones.SCLASSWEBTITULO,tipoventaConstantesFunciones.resaltarSeleccionarTipoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVenta,TipoVentaConstantesFunciones.LABEL_ID));

		if(this.tipoventaConstantesFunciones.mostraridTipoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoventaConstantesFunciones.resaltaridTipoVenta,this.tipoventaConstantesFunciones.activaridTipoVenta,this,true,"idTipoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoventaConstantesFunciones.resaltaridTipoVenta,this.tipoventaConstantesFunciones.activaridTipoVenta,this,true,"idTipoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVenta,TipoVentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoventaConstantesFunciones.mostrarid_empresaTipoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoventaConstantesFunciones.resaltarid_empresaTipoVenta,this,this.tipoventaConstantesFunciones.activarid_empresaTipoVenta));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoventaConstantesFunciones.resaltarid_empresaTipoVenta,this,this.tipoventaConstantesFunciones.activarid_empresaTipoVenta,false,"id_empresaTipoVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVenta,TipoVentaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoventaConstantesFunciones.mostrarcodigoTipoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVentaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoventaConstantesFunciones.resaltarcodigoTipoVenta,this.tipoventaConstantesFunciones.activarcodigoTipoVenta,this,true,"codigoTipoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoventaConstantesFunciones.resaltarcodigoTipoVenta,this.tipoventaConstantesFunciones.activarcodigoTipoVenta,this,true,"codigoTipoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVenta,TipoVentaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoventaConstantesFunciones.mostrarnombreTipoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVentaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoventaConstantesFunciones.resaltarnombreTipoVenta,this.tipoventaConstantesFunciones.activarnombreTipoVenta,this,true,"nombreTipoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoventaConstantesFunciones.resaltarnombreTipoVenta,this.tipoventaConstantesFunciones.activarnombreTipoVenta,this,true,"nombreTipoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoventaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoventaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoVenta && this.isPermisoGuardarCambiosTipoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoventaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoventaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosTipoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoVenta && this.isPermisoGuardarCambiosTipoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoVenta && this.isPermisoGuardarCambiosTipoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoVenta.moveColumn(this.jTableDatosTipoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoVenta.moveColumn(this.jTableDatosTipoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoVenta.moveColumn(this.jTableDatosTipoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoventaLogic.getTipoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoventas.size()-1;
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
		//this.jTableDatosTipoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoVenta();
			
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
				
				//this.isEsNuevoTipoVenta=false;
					
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
				if(this.tipoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoventa.getsType().equals("DUPLICADO")
				   || this.tipoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoVenta=true;
				
				} else {
					this.isEsNuevoTipoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoventa.getId()>=0 && !this.tipoventa.getIsNew()) {						
						this.isEsNuevoTipoVenta=false;
						
					} else {
						this.isEsNuevoTipoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoVenta(esRelaciones);						
				
				this.seleccionarTipoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoventa.getId()<0) {
					this.isEsNuevoTipoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoVenta(evt,rowIndex);
				}	
				
				if(this.tipoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoVenta: " + this.dDif); 
					}
				}								
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoventa)) {
					if(this.tipoventa.getId()>0) {
						this.tipoventa.setIsDeleted(true);
						
						this.tipoventasEliminados.add(this.tipoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoventaLogic.getTipoVentas().remove(this.tipoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoventas.remove(this.tipoventa);				
					}
					
					
					((TipoVentaModel) this.jTableDatosTipoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoVenta) {
			
			if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoVenta(this.tipoventa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoventaConstantesFunciones.cargarid_empresaTipoVenta || this.tipoventaConstantesFunciones.event_dependid_empresaTipoVenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoventa.getid_empresa());
									//this.inicializarActualizarBindingTipoVenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoventa.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoventa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoventa.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoVenta(TipoVenta tipoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoVenta(tipoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoVenta(TipoVenta tipoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoVenta(tipoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoVenta(tipoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoVenta(tipoventa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoVenta(TipoVenta tipoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.setText(tipoventa.getId().toString());
			this.jInternalFrameDetalleFormTipoVenta.jTextFieldcodigoTipoVenta.setText(tipoventa.getcodigo());
			this.jInternalFrameDetalleFormTipoVenta.jTextAreanombreTipoVenta.setText(tipoventa.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoVenta tipoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoVenta tipoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoventaLocal=this.tipoventa;
			} else {
				tipoventaLocal=this.tipoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoVenta(tipoventaLocal,true);
					
					if(tipoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoVenta(TipoVenta tipoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoVenta(tipoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(tipoventa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoVenta(TipoVenta tipoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoVenta(tipoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoVenta(TipoVenta tipoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.getText()==null || this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.getText()=="" || this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.setText("0");
			}

			if(conColumnasBase) {tipoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVenta.jLabelIdTipoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoventa.setcodigo(this.jInternalFrameDetalleFormTipoVenta.jTextFieldcodigoTipoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVentaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVenta.jLabelcodigoTipoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoventa.setnombre(this.jInternalFrameDetalleFormTipoVenta.jTextAreanombreTipoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVentaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVenta.jLabelnombreTipoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoVenta(TipoVenta tipoventaBean,TipoVenta tipoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoVenta(TipoVenta tipoventaOrigen,TipoVenta tipoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoventaOrigen.getId()!=null && !tipoventaOrigen.getId().equals(0L))) {tipoventa.setId(tipoventaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoventaOrigen.getcodigo()!=null && !tipoventaOrigen.getcodigo().equals(""))) {tipoventa.setcodigo(tipoventaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoventaOrigen.getnombre()!=null && !tipoventaOrigen.getnombre().equals(""))) {tipoventa.setnombre(tipoventaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoVenta(TipoVenta tipoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.setText(tipoventa.getId().toString());
			this.jInternalFrameDetalleFormTipoVenta.jTextFieldcodigoTipoVenta.setText(tipoventa.getcodigo());
			this.jInternalFrameDetalleFormTipoVenta.jTextAreanombreTipoVenta.setText(tipoventa.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoVenta(TipoVentaBean tipoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.setText(tipoventaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoVenta.jTextFieldcodigoTipoVenta.setText(tipoventaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoVenta.jTextAreanombreTipoVenta.setText(tipoventaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoVenta(TipoVentaParameterReturnGeneral tipoventaReturnGeneral,TipoVentaBean tipoventaBean,Boolean conDefault) throws Exception { 
		try {
			TipoVenta tipoventaLocal=new TipoVenta();
			
			tipoventaLocal=tipoventaReturnGeneral.getTipoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoventaLocal.getId()!=null && !tipoventaLocal.getId().equals(0L))) {tipoventaBean.setId(tipoventaLocal.getId());}}
			if(conDefault || (!conDefault && tipoventaLocal.getcodigo()!=null && !tipoventaLocal.getcodigo().equals(""))) {tipoventaBean.setcodigo(tipoventaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoventaLocal.getnombre()!=null && !tipoventaLocal.getnombre().equals(""))) {tipoventaBean.setnombre(tipoventaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoVentaGenerico(Long idTipoVentaSeleccionado,JComboBox jComboBoxTipoVenta,List<TipoVenta> tipoventasLocal)throws Exception {
		try {
			TipoVenta  tipoventaTemp=null;

			for(TipoVenta tipoventaAux:tipoventasLocal) {
				if(tipoventaAux.getId()!=null && tipoventaAux.getId().equals(idTipoVentaSeleccionado)) {
					tipoventaTemp=tipoventaAux;
					break;
				}
			}

			jComboBoxTipoVenta.setSelectedItem(tipoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoVentaGenerico(JComboBox jComboBoxTipoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoventa=(TipoVenta) tipoventaLogic.getTipoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoventa =(TipoVenta) tipoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoventa.getIsNew() && !tipoventa.getIsChanged() && !tipoventa.getIsDeleted()) {
				sDescripcion=tipoventa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoventa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoVenta tipoventaRow=new TipoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoventaRow=(TipoVenta) tipoventaLogic.getTipoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoventaRow=(TipoVenta) tipoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoVenta && this.isPermisoNuevoTipoVenta));			
			this.jButtonDuplicarTipoVenta.setVisible((this.isVisibilidadCeldaDuplicarTipoVenta && this.isPermisoDuplicarTipoVenta));			
			this.jButtonCopiarTipoVenta.setVisible((this.isVisibilidadCeldaCopiarTipoVenta && this.isPermisoCopiarTipoVenta));
			this.jButtonVerFormTipoVenta.setVisible((this.isVisibilidadCeldaVerFormTipoVenta && this.isPermisoVerFormTipoVenta));
			
			this.jButtonAbrirOrderByTipoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoVenta && this.isPermisoOrdenTipoVenta));			
			
			this.jButtonNuevoRelacionesTipoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVenta && this.isPermisoNuevoTipoVenta));			
			this.jButtonNuevoGuardarCambiosTipoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoVenta && this.isPermisoNuevoTipoVenta && this.isPermisoGuardarCambiosTipoVenta));
			
			if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonModificarTipoVenta.setVisible((this.isVisibilidadCeldaModificarTipoVenta && this.isPermisoActualizarTipoVenta));	
			this.jInternalFrameDetalleFormTipoVenta.jButtonActualizarTipoVenta.setVisible((this.isVisibilidadCeldaActualizarTipoVenta && this.isPermisoActualizarTipoVenta));	
			this.jInternalFrameDetalleFormTipoVenta.jButtonEliminarTipoVenta.setVisible((this.isVisibilidadCeldaEliminarTipoVenta && this.isPermisoEliminarTipoVenta));
			this.jInternalFrameDetalleFormTipoVenta.jButtonCancelarTipoVenta.setVisible(this.isVisibilidadCeldaCancelarTipoVenta);							
			this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosTipoVenta.setVisible((this.isVisibilidadCeldaGuardarTipoVenta && this.isPermisoGuardarCambiosTipoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVenta && this.isPermisoGuardarCambiosTipoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoVenta && this.isPermisoNuevoTipoVenta));						
			this.jButtonDuplicarToolBarTipoVenta.setVisible((this.isVisibilidadCeldaDuplicarTipoVenta && this.isPermisoDuplicarTipoVenta));						
			this.jButtonCopiarToolBarTipoVenta.setVisible((this.isVisibilidadCeldaCopiarTipoVenta && this.isPermisoCopiarTipoVenta));			
			this.jButtonVerFormToolBarTipoVenta.setVisible((this.isVisibilidadCeldaVerFormTipoVenta && this.isPermisoVerFormTipoVenta));			
			this.jButtonAbrirOrderByToolBarTipoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoVenta && this.isPermisoOrdenTipoVenta));
			this.jButtonNuevoRelacionesToolBarTipoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVenta && this.isPermisoNuevoTipoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarTipoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoVenta && this.isPermisoNuevoTipoVenta && this.isPermisoGuardarCambiosTipoVenta));			
			
			if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonModificarToolBarTipoVenta.setVisible((this.isVisibilidadCeldaModificarTipoVenta && this.isPermisoActualizarTipoVenta));	
			this.jInternalFrameDetalleFormTipoVenta.jButtonActualizarToolBarTipoVenta.setVisible((this.isVisibilidadCeldaActualizarTipoVenta  && this.isPermisoActualizarTipoVenta));	
			this.jInternalFrameDetalleFormTipoVenta.jButtonEliminarToolBarTipoVenta.setVisible((this.isVisibilidadCeldaEliminarTipoVenta && this.isPermisoEliminarTipoVenta));
			this.jInternalFrameDetalleFormTipoVenta.jButtonCancelarToolBarTipoVenta.setVisible(this.isVisibilidadCeldaCancelarTipoVenta);				
			this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosToolBarTipoVenta.setVisible((this.isVisibilidadCeldaGuardarTipoVenta && this.isPermisoGuardarCambiosTipoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVenta && this.isPermisoGuardarCambiosTipoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoVenta && this.isPermisoNuevoTipoVenta));			
			this.jMenuItemDuplicarTipoVenta.setVisible((this.isVisibilidadCeldaDuplicarTipoVenta && this.isPermisoDuplicarTipoVenta));			
			this.jMenuItemCopiarTipoVenta.setVisible((this.isVisibilidadCeldaCopiarTipoVenta && this.isPermisoCopiarTipoVenta));			
			this.jMenuItemVerFormTipoVenta.setVisible((this.isVisibilidadCeldaVerFormTipoVenta && this.isPermisoVerFormTipoVenta));			
			this.jMenuItemAbrirOrderByTipoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoVenta && this.isPermisoOrdenTipoVenta));			
			//this.jMenuItemMostrarOcultarTipoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoVenta && this.isPermisoOrdenTipoVenta));
			this.jMenuItemDetalleAbrirOrderByTipoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoVenta && this.isPermisoOrdenTipoVenta));			
			//this.jMenuItemDetalleMostrarOcultarTipoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoVenta && this.isPermisoOrdenTipoVenta));			
			this.jMenuItemNuevoRelacionesTipoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVenta && this.isPermisoNuevoTipoVenta));			
			this.jMenuItemNuevoGuardarCambiosTipoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoVenta && this.isPermisoNuevoTipoVenta && this.isPermisoGuardarCambiosTipoVenta));									
			
			if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			this.jInternalFrameDetalleFormTipoVenta.jMenuItemModificarTipoVenta.setVisible((this.isVisibilidadCeldaModificarTipoVenta && this.isPermisoActualizarTipoVenta));	
			this.jInternalFrameDetalleFormTipoVenta.jMenuItemActualizarTipoVenta.setVisible((this.isVisibilidadCeldaActualizarTipoVenta && this.isPermisoActualizarTipoVenta));	
			this.jInternalFrameDetalleFormTipoVenta.jMenuItemEliminarTipoVenta.setVisible((this.isVisibilidadCeldaEliminarTipoVenta && this.isPermisoEliminarTipoVenta));
			this.jInternalFrameDetalleFormTipoVenta.jMenuItemCancelarTipoVenta.setVisible(this.isVisibilidadCeldaCancelarTipoVenta);				
			}
			
			this.jMenuItemGuardarCambiosTipoVenta.setVisible((this.isVisibilidadCeldaGuardarTipoVenta && this.isPermisoGuardarCambiosTipoVenta));						
			this.jMenuItemGuardarCambiosTablaTipoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVenta && this.isPermisoGuardarCambiosTipoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoVenta=this.jButtonNuevoTipoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarTipoVenta=this.jButtonDuplicarTipoVenta.isVisible();
			this.isVisibilidadCeldaCopiarTipoVenta=this.jButtonCopiarTipoVenta.isVisible();
			this.isVisibilidadCeldaVerFormTipoVenta=this.jButtonVerFormTipoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoVenta=this.jButtonAbrirOrderByTipoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=this.jButtonNuevoRelacionesTipoVenta.isVisible();
			this.isVisibilidadCeldaModificarTipoVenta=this.jButtonModificarTipoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			this.isVisibilidadCeldaActualizarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jButtonActualizarTipoVenta.isVisible();
			this.isVisibilidadCeldaEliminarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jButtonEliminarTipoVenta.isVisible();
			this.isVisibilidadCeldaCancelarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jButtonCancelarTipoVenta.isVisible();
			this.isVisibilidadCeldaGuardarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosTipoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=this.jButtonGuardarCambiosTablaTipoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoVenta=this.jButtonNuevoToolBarTipoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=this.jButtonNuevoRelacionesToolBarTipoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			this.isVisibilidadCeldaModificarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jButtonModificarToolBarTipoVenta.isVisible();
			this.isVisibilidadCeldaActualizarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jButtonActualizarToolBarTipoVenta.isVisible();
			this.isVisibilidadCeldaEliminarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jButtonEliminarToolBarTipoVenta.isVisible();
			this.isVisibilidadCeldaCancelarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jButtonCancelarToolBarTipoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoVenta=this.jButtonGuardarCambiosToolBarTipoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=this.jButtonGuardarCambiosTablaToolBarTipoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoVenta=this.jMenuItemNuevoTipoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=this.jMenuItemNuevoRelacionesTipoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			this.isVisibilidadCeldaModificarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jMenuItemModificarTipoVenta.isVisible();
			this.isVisibilidadCeldaActualizarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jMenuItemActualizarTipoVenta.isVisible();
			this.isVisibilidadCeldaEliminarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jMenuItemEliminarTipoVenta.isVisible();
			this.isVisibilidadCeldaCancelarTipoVenta=this.jInternalFrameDetalleFormTipoVenta.jMenuItemCancelarTipoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoVenta=this.jMenuItemGuardarCambiosTipoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=this.jMenuItemGuardarCambiosTablaTipoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoVenta(Boolean esInicializar) {
		if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoVenta() {
		this.jButtonNuevoTipoVenta.setVisible(this.isPermisoNuevoTipoVenta);			
		this.jButtonDuplicarTipoVenta.setVisible(this.isPermisoDuplicarTipoVenta);			
		this.jButtonCopiarTipoVenta.setVisible(this.isPermisoCopiarTipoVenta);			
		this.jButtonVerFormTipoVenta.setVisible(this.isPermisoVerFormTipoVenta);			
		
		this.jButtonAbrirOrderByTipoVenta.setVisible(this.isPermisoOrdenTipoVenta);					
		
		this.jButtonNuevoRelacionesTipoVenta.setVisible(this.isPermisoNuevoTipoVenta);			
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonModificarTipoVenta.setVisible(this.isPermisoActualizarTipoVenta);	
			this.jInternalFrameDetalleFormTipoVenta.jButtonActualizarTipoVenta.setVisible(this.isPermisoActualizarTipoVenta);	
			this.jInternalFrameDetalleFormTipoVenta.jButtonEliminarTipoVenta.setVisible(this.isPermisoEliminarTipoVenta);
			this.jInternalFrameDetalleFormTipoVenta.jButtonCancelarTipoVenta.setVisible(this.isVisibilidadCeldaCancelarTipoVenta);						
			this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosTipoVenta.setVisible(this.isPermisoGuardarCambiosTipoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaTipoVenta.setVisible(this.isPermisoActualizarTipoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoVenta() {
		this.jInternalFrameDetalleFormTipoVenta.jButtonModificarTipoVenta.setVisible(this.isPermisoActualizarTipoVenta);	
		this.jInternalFrameDetalleFormTipoVenta.jButtonActualizarTipoVenta.setVisible(this.isPermisoActualizarTipoVenta);	
		this.jInternalFrameDetalleFormTipoVenta.jButtonEliminarTipoVenta.setVisible(this.isPermisoEliminarTipoVenta);
		this.jInternalFrameDetalleFormTipoVenta.jButtonCancelarTipoVenta.setVisible(this.isVisibilidadCeldaCancelarTipoVenta);							
		this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosTipoVenta.setVisible((this.isVisibilidadCeldaGuardarTipoVenta && this.isPermisoGuardarCambiosTipoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoVenta() {
		if(TipoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoVenta() {
	}
	
	public void jTableDatosTipoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVenta(this.gettipoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoventa==null) {
						this.tipoventa = new TipoVenta();
					}

					this.setVariablesFormularioToObjetoActualTipoVenta(this.tipoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
				}

				if(this.tipoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoVenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoVenta(this.gettipoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoventaLogic.getConnexion());

				if(this.tipoventa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoventa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoVenta=(TitledBorder)this.jScrollPanelDatosTipoVenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoVenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVenta(this.gettipoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoventa==null) {
						this.tipoventa = new TipoVenta();
					}

					this.setVariablesFormularioToObjetoActualTipoVenta(this.tipoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
				}

				if(this.tipoventa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoventa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVenta(this.gettipoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoventa==null) {
						this.tipoventa = new TipoVenta();
					}

					this.setVariablesFormularioToObjetoActualTipoVenta(this.tipoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
				}

				if(this.tipoventa.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoventa.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVenta(this.gettipoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoventa==null) {
						this.tipoventa = new TipoVenta();
					}

					this.setVariablesFormularioToObjetoActualTipoVenta(this.tipoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);
				}

				if(this.tipoventa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoventa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoVenta(false,false);

			this.getTipoVentasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoVenta(false);

			//if(TipoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoVenta() {
		if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) {
			this.jInternalFrameDetalleFormTipoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoVenta.dispose();
			this.jInternalFrameDetalleFormTipoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoVenta!=null) {
			this.jInternalFrameReporteDinamicoTipoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoVenta.dispose();
			this.jInternalFrameReporteDinamicoTipoVenta=null;
		}
		
		if(this.jInternalFrameImportacionTipoVenta!=null) {
			this.jInternalFrameImportacionTipoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionTipoVenta.dispose();
			this.jInternalFrameImportacionTipoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoVenta();
			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoVenta")) {
				jButtonNuevoTipoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoVenta")) {
				jButtonDuplicarTipoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoVenta")) {
				jButtonCopiarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoVenta")) {
				jButtonVerFormTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoVenta")) {
				jButtonNuevoTipoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoVenta")) {
				jButtonDuplicarTipoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoVenta")) {
				jButtonNuevoTipoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoVenta")) {
				jButtonDuplicarTipoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoVenta")) {
				jButtonNuevoTipoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoVenta")) {
				jButtonNuevoTipoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoVenta")) {
				jButtonNuevoTipoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoVenta")) {
				jButtonModificarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoVenta")) {
				jButtonModificarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoVenta")) {
				jButtonModificarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoVenta")) {
				jButtonActualizarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoVenta")) {
				jButtonActualizarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoVenta")) {
				jButtonActualizarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoVenta")) {
				jButtonEliminarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoVenta")) {
				jButtonEliminarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoVenta")) {
				jButtonEliminarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoVenta")) {
				jButtonCancelarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoVenta")) {
				jButtonCancelarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoVenta")) {
				jButtonCancelarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoVenta")) {
				jButtonCerrarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoVenta")) {
				jButtonCerrarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoVenta")) {
				jButtonCerrarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoVenta")) {
				jButtonMostrarOcultarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoVenta")) {
				jButtonCancelarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoVenta")) {
				jButtonGuardarCambiosTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoVenta")) {
				jButtonGuardarCambiosTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoVenta")) {
				jButtonCopiarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoVenta")) {
				jButtonVerFormTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoVenta")) {
				jButtonGuardarCambiosTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoVenta")) {
				jButtonCopiarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoVenta")) {
				jButtonVerFormTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoVenta")) {
				jButtonGuardarCambiosTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoVenta")) {
				jButtonGuardarCambiosTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoVenta")) {
				jButtonGuardarCambiosTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoVenta")) {
				jButtonRecargarInformacionTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoVenta")) {
				jButtonRecargarInformacionTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoVenta")) {
				jButtonRecargarInformacionTipoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoVenta")) {
				jButtonAnterioresTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoVenta")) {
				jButtonAnterioresTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoVenta")) {
				jButtonAnterioresTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoVenta")) {
				jButtonSiguientesTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoVenta")) {
				jButtonSiguientesTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoVenta")) {
				jButtonSiguientesTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoVenta")) {
				jButtonAbrirOrderByTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoVenta")) {
				jButtonMostrarOcultarTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoVenta")) {
				jButtonNuevoGuardarCambiosTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoVenta")) {
				jButtonNuevoGuardarCambiosTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoVenta")) {
				jButtonNuevoGuardarCambiosTipoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoVenta")) {
				jButtonCerrarReporteDinamicoTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoVenta")) {
				jButtonGenerarReporteDinamicoTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoVenta")) {
				jButtonCerrarImportacionTipoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoVenta")) {
				
				jButtonGenerarImportacionTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoVenta")) {
				
				jButtonAbrirImportacionTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoVenta")) {
				jComboBoxTiposAccionesTipoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoVenta")) {
				jComboBoxTiposRelacionesTipoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoVenta")) {
				jComboBoxTiposAccionesTipoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoVenta")) {
				
				jComboBoxTiposSeleccionarTipoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoVenta")) {
				jTextFieldValorCampoGeneralTipoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoVenta")) {
				jButtonAbrirOrderByTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoVenta")) {
				jButtonAbrirOrderByTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoVenta")) {
				jButtonCerrarOrderByTipoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoVentaBusqueda")) {
				this.jButtonidTipoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoVentaUpdate")) {
				this.jButtonid_empresaTipoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoVentaBusqueda")) {
				this.jButtonid_empresaTipoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoVentaBusqueda")) {
				this.jButtoncodigoTipoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoVentaBusqueda")) {
				this.jButtonnombreTipoVentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				


				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoVenta tipoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoventaLocal=this.tipoventa;
			} else {
				tipoventaLocal=this.tipoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
							
				
				


				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaAnterior =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoventaAnterior =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
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
			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
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
			
			


			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
								
						
				


				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
								
				
				


				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaAnterior =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoventaAnterior =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaAnterior =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoventaAnterior =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
							
				
				


				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoventaAnterior =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoventaAnterior =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
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
			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
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
			
			


			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
								
				
				


				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaAnterior =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoventaAnterior =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoVenta")) {
					jCheckBoxSeleccionarTodosTipoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoVenta")) {
					jCheckBoxSeleccionadosTipoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoVenta")) {
					
				}
				
				


				
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
												
				
				


				
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoventaAnterior =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoventaAnterior =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
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
			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
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
			
			


			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoventa);
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
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
				
				


				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoventaAnterior =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoventaAnterior =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoventa =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoventa =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoVenta")) {
				
				}
				
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoVenta")) {
			
			}
			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoVenta();
			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoVenta")) {
				jButtonNuevoTipoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoVenta")) {
				jButtonDuplicarTipoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoVenta")) {
				jButtonCopiarTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoVenta")) {
				jButtonVerFormTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoVenta")) {
				jButtonNuevoTipoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoVenta")) {
				jButtonModificarTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoVenta")) {
				jButtonActualizarTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoVenta")) {
				jButtonEliminarTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoVenta")) {
				jButtonGuardarCambiosTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoVenta")) {
				jButtonCancelarTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoVenta")) {
				jButtonCerrarTipoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoVenta")) {
				jButtonGuardarCambiosTipoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoVenta")) {
				jButtonNuevoGuardarCambiosTipoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoVenta")) {
				jButtonAbrirOrderByTipoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoVenta")) {
				jButtonRecargarInformacionTipoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoVenta")) {
				jButtonAnterioresTipoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoVenta")) {
				jButtonSiguientesTipoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoVentaBusqueda")) {
				this.jButtonidTipoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoVentaUpdate")) {
				this.jButtonid_empresaTipoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoVentaBusqueda")) {
				this.jButtonid_empresaTipoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoVentaBusqueda")) {
				this.jButtoncodigoTipoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoVentaBusqueda")) {
				this.jButtonnombreTipoVentaBusquedaActionPerformed(evt);
			}
			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoVenta")) {
				closingInternalFrameTipoVenta();
				
			} else if(sTipo.equals("jButtonCancelarTipoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            TipoVentaBeanSwingJInternalFrame jInternalFrameParent=(TipoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoVentaActionPerformed(null);
			}
			
			TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoventa,new Object(),this.tipoventaParameterGeneral,this.tipoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoventa)) {
			if(!esControlTabla) {
				if(TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoVenta(this.tipoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);			
				}
				
				if(this.tipoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoVenta(this.tipoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoventaReturnGeneral=tipoventaLogic.procesarEventosTipoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoventaLogic.getTipoVentas(),this.tipoventa,this.tipoventaParameterGeneral,this.isEsNuevoTipoVenta,classes);//this.tipoventaLogic.getTipoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoVenta(this.tipoventaReturnGeneral,this.tipoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoVenta(classes,this.tipoventaReturnGeneral,this.tipoventaBean,false);
					}
						
					if(this.tipoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoVenta(this.tipoventaReturnGeneral.getTipoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoVenta(this.tipoventaReturnGeneral.getTipoVenta());	
					}
						
					if(this.tipoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoVenta(this.tipoventaReturnGeneral.getTipoVenta(),classes);//this.tipoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoVenta(this.tipoventa,classes);//this.tipoventaBean);									
				}
			
				if(TipoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoVenta(this.tipoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVenta(this.tipoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoventaAnterior!=null) {
						this.tipoventa=this.tipoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoventaReturnGeneral=tipoventaLogic.procesarEventosTipoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoventaLogic.getTipoVentas(),this.tipoventa,this.tipoventaParameterGeneral,this.isEsNuevoTipoVenta,classes);//this.tipoventaLogic.getTipoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoventaReturnGeneral.getTipoVenta(),tipoventaLogic.getTipoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoventaReturnGeneral.getTipoVenta(),this.tipoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoVenta() throws Exception {
		
		TipoVentaModel tipoventaModel=(TipoVentaModel)this.jTableDatosTipoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoventaModel.tipoventas=this.tipoventaLogic.getTipoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoventaModel.tipoventas=this.tipoventas;
		}
		
		
		((TipoVentaModel) this.jTableDatosTipoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoventaAnterior(),this.tipoventaLogic.getTipoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoventaAnterior(),this.tipoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoVenta(TipoVenta tipoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
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
										
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoventa,new Object(),generalEntityParameterGeneral,this.tipoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoVentaConstantesFunciones.getClassesRelationshipsOfTipoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoventa,new Object(),generalEntityParameterGeneral,this.tipoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoVenta(TipoVentaBean tipoventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoVenta(ArrayList<Classe> classes,TipoVentaReturnGeneral tipoventaReturnGeneral,TipoVentaBean tipoventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoVenta(TipoVenta tipoventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoVenta = new TipoVentaDetalleFormJInternalFrame(jDesktopPane,this.tipoventaSessionBean.getConGuardarRelaciones(),this.tipoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoVenta);
		this.jInternalFrameDetalleFormTipoVenta.setVisible(false);
		this.jInternalFrameDetalleFormTipoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoVenta.tipoventaLogic=this.tipoventaLogic;
		
		this.cargarCombosFrameForeignKeyTipoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoVenta"));
		
		this.jInternalFrameDetalleFormTipoVenta.jButtonModificarTipoVenta.addActionListener(new ButtonActionListener(this,"ModificarTipoVenta"));

		
		this.jInternalFrameDetalleFormTipoVenta.jButtonModificarToolBarTipoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoVenta"));
					
		this.jInternalFrameDetalleFormTipoVenta.jMenuItemModificarTipoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVenta.jButtonActualizarTipoVenta.addActionListener (new ButtonActionListener(this,"ActualizarTipoVenta"));
		
		
		this.jInternalFrameDetalleFormTipoVenta.jButtonActualizarToolBarTipoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoVenta"));
						
		this.jInternalFrameDetalleFormTipoVenta.jMenuItemActualizarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVenta.jButtonEliminarTipoVenta.addActionListener (new ButtonActionListener(this,"EliminarTipoVenta"));
		
		
		this.jInternalFrameDetalleFormTipoVenta.jButtonEliminarToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoVenta"));
								
		this.jInternalFrameDetalleFormTipoVenta.jMenuItemEliminarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVenta.jButtonCancelarTipoVenta.addActionListener (new ButtonActionListener(this,"CancelarTipoVenta"));
		
		
		this.jInternalFrameDetalleFormTipoVenta.jButtonCancelarToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoVenta"));
					
		this.jInternalFrameDetalleFormTipoVenta.jMenuItemCancelarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoVenta.jMenuItemDetalleCerrarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVenta"));
		
		
		
		this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVenta"));
		
		
		
		this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtonidTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoVenta.jButtonid_empresaTipoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtonid_empresaTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtoncodigoTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtonnombreTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoVenta.jTabbedPaneRelacionesTipoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoVenta"));
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoVenta"));
		}
		
		this.jTableDatosTipoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoVenta"));
		
		this.jTableDatosTipoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoVenta"));
		
		this.jButtonNuevoTipoVenta.addActionListener(new ButtonActionListener(this,"NuevoTipoVenta"));
		
		this.jButtonDuplicarTipoVenta.addActionListener(new ButtonActionListener(this,"DuplicarTipoVenta"));
		
		this.jButtonCopiarTipoVenta.addActionListener(new ButtonActionListener(this,"CopiarTipoVenta"));
		
		this.jButtonVerFormTipoVenta.addActionListener(new ButtonActionListener(this,"VerFormTipoVenta"));
		
		
		this.jButtonNuevoToolBarTipoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoVenta"));
			
		this.jButtonDuplicarToolBarTipoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoVenta"));
			
		this.jMenuItemNuevoTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoVenta"));
			
		this.jMenuItemDuplicarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoVenta"));		
		
		
		this.jButtonNuevoRelacionesTipoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoVenta"));
			
		this.jMenuItemNuevoRelacionesTipoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonModificarTipoVenta.addActionListener(new ButtonActionListener(this,"ModificarTipoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonModificarToolBarTipoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoVenta"));
			
			this.jInternalFrameDetalleFormTipoVenta.jMenuItemModificarTipoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoVenta.jButtonActualizarTipoVenta.addActionListener (new ButtonActionListener(this,"ActualizarTipoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonActualizarToolBarTipoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoVenta"));
				
			this.jInternalFrameDetalleFormTipoVenta.jMenuItemActualizarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonEliminarTipoVenta.addActionListener (new ButtonActionListener(this,"EliminarTipoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonEliminarToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoVenta"));
						
			this.jInternalFrameDetalleFormTipoVenta.jMenuItemEliminarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonCancelarTipoVenta.addActionListener (new ButtonActionListener(this,"CancelarTipoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonCancelarToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoVenta"));
			
			this.jInternalFrameDetalleFormTipoVenta.jMenuItemCancelarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoVenta"));		
		
		
		this.jButtonCerrarTipoVenta.addActionListener (new ButtonActionListener(this,"CerrarTipoVenta"));
		
		
		this.jButtonCerrarToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoVenta"));
			
		this.jMenuItemCerrarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoVenta"));
			
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jMenuItemDetalleCerrarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosTipoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVenta"));
		}
		
		this.jButtonCopiarToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoVenta"));
			
		this.jButtonVerFormToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoVenta"));
		
		this.jMenuItemGuardarCambiosTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoVenta"));
			
		this.jMenuItemCopiarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoVenta"));		
		
		this.jMenuItemVerFormTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaTipoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoVenta"));
			
		this.jMenuItemGuardarCambiosTablaTipoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoVenta"));		
		
		
		
		this.jButtonRecargarInformacionTipoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoVenta"));
					
		this.jButtonRecargarInformacionToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoVenta"));
		
		this.jMenuItemRecargarInformacionTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoVenta"));		
		
		
		
		this.jButtonAnterioresTipoVenta.addActionListener (new ButtonActionListener(this,"AnterioresTipoVenta"));
		
		
		this.jButtonAnterioresToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoVenta"));
		
		this.jMenuItemAnterioresTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoVenta"));		
		
		
		this.jButtonSiguientesTipoVenta.addActionListener (new ButtonActionListener(this,"SiguientesTipoVenta"));
		
		
		this.jButtonSiguientesToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoVenta"));
			
		this.jMenuItemSiguientesTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoVenta"));
			
		this.jMenuItemAbrirOrderByTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoVenta"));
			
		this.jMenuItemMostrarOcultarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoVenta"));
			
		this.jMenuItemDetalleMostarOcultarTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosTipoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoVenta"));

		this.jCheckBoxSeleccionadosTipoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoVenta"));
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoVenta"));
			
		this.jComboBoxTiposAccionesTipoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoVenta"));
					
		this.jComboBoxTiposSeleccionarTipoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoVenta"));
			
		this.jTextFieldValorCampoGeneralTipoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtonidTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoVenta.jButtonid_empresaTipoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtonid_empresaTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtoncodigoTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtonnombreTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoVenta!=null) {
				this.jInternalFrameReporteDinamicoTipoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVenta"));
				this.jInternalFrameReporteDinamicoTipoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVenta"));
				this.jInternalFrameReporteDinamicoTipoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVenta"));				
			//this.jButtonGenerarReporteDinamicoTipoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoTipoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoVenta!=null) {
				this.jInternalFrameImportacionTipoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoVenta"));
				this.jInternalFrameImportacionTipoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoVenta"));
				this.jInternalFrameImportacionTipoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoVenta"));
			
			this.jButtonAbrirOrderByToolBarTipoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoVenta"));			
			
			if(this.jInternalFrameOrderByTipoVenta!=null) {
				this.jInternalFrameOrderByTipoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVenta.jTabbedPaneRelacionesTipoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoVenta"));
		
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
            		closingInternalFrameTipoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoVenta = (JInternalFrameBase)event.getSource();
	            	
	            TipoVentaBeanSwingJInternalFrame jInternalFrameParent=(TipoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoVenta";
		inputMap = this.jButtonNuevoTipoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoVenta";
		inputMap = this.jButtonNuevoRelacionesTipoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoVenta";
		inputMap = this.jButtonModificarTipoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoVenta";
		inputMap = this.jButtonActualizarTipoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoVenta";
		inputMap = this.jButtonEliminarTipoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoVenta";
		inputMap = this.jButtonCancelarTipoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoVenta";
		inputMap = this.jButtonCerrarTipoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoVenta";
		inputMap = this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosTipoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoVenta.jButtonGuardarCambiosTipoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtonidTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoVenta.jButtonid_empresaTipoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtonid_empresaTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtoncodigoTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVenta.jButtonnombreTipoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVentaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoVenta tipoventaAux:this.tipoventaLogic.getTipoVentas()) {
					tipoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVenta tipoventaAux:tipoventas) {
					tipoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoVenta tipoventaAux:this.tipoventaLogic.getTipoVentas()) {
						tipoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVenta tipoventaAux:tipoventas) {
						tipoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoVenta tipoventaAux:this.tipoventaLogic.getTipoVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVenta tipoventaAux:tipoventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoVenta.getSelectedRows();
			
			TipoVenta tipoventaLocal=new TipoVenta();
			
			//this.seleccionarTodosTipoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoventaLocal =(TipoVenta) this.tipoventaLogic.getTipoVentas().toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoventaLocal =(TipoVenta) this.tipoventas.toArray()[this.jTableDatosTipoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoVenta tipoventaAux:this.tipoventaLogic.getTipoVentas()) {
						tipoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVenta tipoventaAux:tipoventas) {
						tipoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoVenta tipoventaAux:this.tipoventaLogic.getTipoVentas()) {
				
						if(sTipoSeleccionar.equals(TipoVentaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoventaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoVentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoventaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVenta tipoventaAux:tipoventas) {
					
						if(sTipoSeleccionar.equals(TipoVentaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoventaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoVentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoventaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoVenta(conSplash);
				
					this.generarReporteTipoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoVentasSeleccionados();
				//this.jComboBoxTiposAccionesTipoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoVenta();
				
				this.exportarTipoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoVentas();
				//this.importarTipoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoVentasSeleccionados();
				//this.jComboBoxTiposAccionesTipoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVenta.jComboBoxTiposAccionesFormularioTipoVenta.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoVenta();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoVenta();
			
			if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();		
			TipoVenta tipoventa=new TipoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoVenta.getSelectedItem();
			
			
			
			
			tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoventasSeleccionados.size()==1) {
				for(TipoVenta tipoventaAux:tipoventasSeleccionados) {
					tipoventa=tipoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoVenta();
			
      		//this.finishProcessTipoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoVentaReturnGeneral() throws Exception {
		if(this.tipoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoVenta(false);
		}
		
		if(this.tipoventaReturnGeneral.getConRetornoLista() || this.tipoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoventaLogic.setTipoVentas(this.tipoventaReturnGeneral.getTipoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoventaLogic.setTipoVenta(this.tipoventaReturnGeneral.getTipoVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoVenta() throws Exception {
		
		
	}
	
	public ArrayList<TipoVenta> getTipoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoVenta tipoventaAux:tipoventaLogic.getTipoVentas()) {
					if(tipoventaAux.getIsSelected()) {
						tipoventasSeleccionados.add(tipoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVenta tipoventaAux:this.tipoventas) {
					if(tipoventaAux.getIsSelected()) {
						tipoventasSeleccionados.add(tipoventaAux);				
					}
				}
			}
			
			if(tipoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoventasSeleccionados.addAll(this.tipoventaLogic.getTipoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoventasSeleccionados.addAll(this.tipoventas);				
					}
				}
			}
		} else {
			tipoventasSeleccionados.add(this.tipoventa);
		}
		
		return tipoventasSeleccionados;
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
	
	public void generarReporteTipoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoVentasSeleccionados() throws Exception {
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();		
		
		tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoVentas("Todos",tipoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoVentasSeleccionados() throws Exception {
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();		
		
		tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoVentas("Todos",tipoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();
		
		tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoVentas("Todos",tipoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoVentasSeleccionados() throws Exception {
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoVenta();
		
		
		tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoVenta();
		
		
		//this.generarReporteTipoVentas("Todos",tipoventasSeleccionados ,tipoventaImplementable,tipoventaImplementableHome);
	}
	
	public void mostrarImportacionTipoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoVenta();
		
		this.abrirFrameImportacionTipoVenta();		
		
			
		//this.generarReporteTipoVentas("Todos",tipoventasSeleccionados ,tipoventaImplementable,tipoventaImplementableHome);
	}
	
	public void importarTipoVentas() throws Exception {		
	
	}
	
	public void exportarTipoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoVentasSeleccionados() throws Exception {
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();		
		
		tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoVenta tipoventaAux:tipoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoVenta(tipoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoventaAux.setsDetalleGeneralEntityReporte(tipoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVentaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVentaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoVenta(TipoVenta tipoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoventa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoventa.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoventa.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoVentasSeleccionados() throws Exception {
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();		
		
		tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoVenta(row);				
				iRow++;
			}				
			
			for(TipoVenta tipoventaAux:tipoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoVenta(tipoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoVentasSeleccionados() throws Exception {
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();		
		
		tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoventa");
			//elementRoot.appendChild(element);
		
			for(TipoVenta tipoventaAux:tipoventasSeleccionados) {
				element = document.createElement("tipoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoVenta(tipoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoVentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVentaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVentaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoVenta(TipoVenta tipoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoventa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoventa.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoventa.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoVenta(TipoVenta tipoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoVentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoventa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoVentaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoventa.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoVentaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoventa.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoVenta> tipoventasSeleccionados=new ArrayList<TipoVenta>();
		
		tipoventasSeleccionados=this.getTipoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoVenta(tipoventasSeleccionados);
		
		this.generarReporteTipoVentas("Todos",tipoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoVenta(ArrayList<TipoVenta> tipoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoVenta tipoventaAux:tipoventasSeleccionados) {
				tipoventaAux.setsDetalleGeneralEntityReporte(tipoventaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoVentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoventaAux.setsDescripcionGeneralEntityReporte1(tipoventaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoVentaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoventaAux.setsDescripcionGeneralEntityReporte1(tipoventaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoVentaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoventaAux.setsDescripcionGeneralEntityReporte1(tipoventaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosTipoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarTipoVenta=false;
			this.isVisibilidadCeldaActualizarTipoVenta=false;
			this.isVisibilidadCeldaEliminarTipoVenta=false;
			this.isVisibilidadCeldaCancelarTipoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=false;
			this.isVisibilidadCeldaModificarTipoVenta=false;
			this.isVisibilidadCeldaActualizarTipoVenta=true;
			this.isVisibilidadCeldaEliminarTipoVenta=false;
			this.isVisibilidadCeldaCancelarTipoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=false;
			this.isVisibilidadCeldaModificarTipoVenta=false;
			this.isVisibilidadCeldaActualizarTipoVenta=true;
			this.isVisibilidadCeldaEliminarTipoVenta=true;
			this.isVisibilidadCeldaCancelarTipoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=false;
			this.isVisibilidadCeldaModificarTipoVenta=false;
			this.isVisibilidadCeldaActualizarTipoVenta=true;
			this.isVisibilidadCeldaEliminarTipoVenta=false;
			this.isVisibilidadCeldaCancelarTipoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=true;
			this.isVisibilidadCeldaModificarTipoVenta=false;
			this.isVisibilidadCeldaActualizarTipoVenta=false;
			this.isVisibilidadCeldaEliminarTipoVenta=false;
			this.isVisibilidadCeldaCancelarTipoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=false;
			this.isVisibilidadCeldaActualizarTipoVenta=false;
			this.isVisibilidadCeldaEliminarTipoVenta=false;
			this.isVisibilidadCeldaCancelarTipoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=false;
			this.isVisibilidadCeldaModificarTipoVenta=true;
			this.isVisibilidadCeldaActualizarTipoVenta=false;
			this.isVisibilidadCeldaEliminarTipoVenta=false;
			this.isVisibilidadCeldaCancelarTipoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=true;
		} else {
			this.actualizarEstadoPanelsTipoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoVenta=false;
			//this.isVisibilidadCeldaVerFormTipoVenta=false;
			this.isVisibilidadCeldaDuplicarTipoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoventaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoVenta=false;												
			}
			
			this.jButtonCerrarTipoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoventa)) {
			this.isVisibilidadCeldaActualizarTipoVenta=false;
			this.isVisibilidadCeldaEliminarTipoVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoVenta() {
	}
	
	public void actualizarEstadoPanelsTipoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVenta!=null) {
				this.jTabbedPaneBusquedasTipoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVenta!=null) {
				this.jScrollPanelDatosTipoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVenta!=null) {
				this.jPanelPaginacionTipoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVenta!=null) {
				this.jPanelParametrosReportesTipoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVenta!=null) {
				this.jTabbedPaneBusquedasTipoVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoVenta!=null) {
				this.jScrollPanelDatosTipoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVenta!=null) {
				this.jPanelPaginacionTipoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVenta!=null) {
				this.jPanelParametrosReportesTipoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVenta!=null) {
				this.jTabbedPaneBusquedasTipoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoVenta!=null) {
				this.jScrollPanelDatosTipoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVenta!=null) {
				this.jPanelPaginacionTipoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVenta!=null) {
				this.jPanelParametrosReportesTipoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVenta!=null) {
				this.jTabbedPaneBusquedasTipoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoVenta!=null) {
				this.jScrollPanelDatosTipoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVenta!=null) {
				this.jPanelPaginacionTipoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVenta!=null) {
				this.jPanelParametrosReportesTipoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVenta!=null) {
				this.jTabbedPaneBusquedasTipoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVenta!=null) {
				this.jScrollPanelDatosTipoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVenta!=null) {
				this.jPanelPaginacionTipoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVenta!=null) {
				this.jPanelParametrosReportesTipoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVenta!=null) {
				this.jTabbedPaneBusquedasTipoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVenta!=null) {
				this.jScrollPanelDatosTipoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVenta!=null) {
				this.jPanelPaginacionTipoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVenta!=null) {
				this.jPanelParametrosReportesTipoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVenta!=null) {
				this.jTabbedPaneBusquedasTipoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVenta!=null) {
				this.jScrollPanelDatosTipoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVenta!=null) {
				this.jPanelPaginacionTipoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVenta!=null) {
				this.jPanelParametrosReportesTipoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoVenta!=null) {
					this.jTabbedPaneBusquedasTipoVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoVenta!=null) {
				this.jPanelParametrosReportesTipoVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVenta!=null) {
				this.jTabbedPaneBusquedasTipoVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoVenta!=null) {
				this.jPanelParametrosReportesTipoVenta.setVisible(true);
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
		
		//TipoVentaSessionBean tipoventaSessionBean=new TipoVentaSessionBean();
		
		if(this.tipoventaSessionBean==null) {
			this.tipoventaSessionBean=new TipoVentaSessionBean();
		}
		
		this.tipoventaSessionBean.setsUltimaBusquedaTipoVenta(this.getsAccionBusqueda());
		this.tipoventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoventaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoVentaSessionBean tipoventaSessionBean=new TipoVentaSessionBean();
		
		if(this.tipoventaSessionBean==null) {
			this.tipoventaSessionBean=new TipoVentaSessionBean();
		}
		
		if(this.tipoventaSessionBean.getsUltimaBusquedaTipoVenta()!=null&&!this.tipoventaSessionBean.getsUltimaBusquedaTipoVenta().equals("")) {
			this.setsAccionBusqueda(tipoventaSessionBean.getsUltimaBusquedaTipoVenta());
			this.setiNumeroPaginacion(tipoventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoventaSessionBean.getid_empresa());
				tipoventaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoventaSessionBean.setsUltimaBusquedaTipoVenta("");
		this.tipoventaSessionBean.setiNumeroPaginacion(TipoVentaConstantesFunciones.INUMEROPAGINACION);
		this.tipoventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoVenta() {
		this.updateBorderResaltarBusquedasFormularioTipoVenta();
		this.updateVisibilidadBusquedasFormularioTipoVenta();
		this.updateHabilitarBusquedasFormularioTipoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoVenta.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoVenta.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoVenta.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoVenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoVenta();
		this.updateVisibilidadResaltarControlesFormularioTipoVenta();
		this.updateHabilitarResaltarControlesFormularioTipoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoventaConstantesFunciones.resaltaridTipoVenta!=null && this.jInternalFrameDetalleFormTipoVenta!=null) {this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.setBorder(this.tipoventaConstantesFunciones.resaltaridTipoVenta);}
		if(this.tipoventaConstantesFunciones.resaltarid_empresaTipoVenta!=null && this.jInternalFrameDetalleFormTipoVenta!=null) {this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.setBorder(this.tipoventaConstantesFunciones.resaltarid_empresaTipoVenta);}
		if(this.tipoventaConstantesFunciones.resaltarcodigoTipoVenta!=null && this.jInternalFrameDetalleFormTipoVenta!=null) {this.jInternalFrameDetalleFormTipoVenta.jTextFieldcodigoTipoVenta.setBorder(this.tipoventaConstantesFunciones.resaltarcodigoTipoVenta);}
		if(this.tipoventaConstantesFunciones.resaltarnombreTipoVenta!=null && this.jInternalFrameDetalleFormTipoVenta!=null) {this.jInternalFrameDetalleFormTipoVenta.jTextAreanombreTipoVenta.setBorder(this.tipoventaConstantesFunciones.resaltarnombreTipoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) {
	
		//this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.setVisible(this.tipoventaConstantesFunciones.mostraridTipoVenta);
		this.jInternalFrameDetalleFormTipoVenta.jPanelidTipoVenta.setVisible(this.tipoventaConstantesFunciones.mostraridTipoVenta);
		//this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.setVisible(this.tipoventaConstantesFunciones.mostrarid_empresaTipoVenta);
		this.jInternalFrameDetalleFormTipoVenta.jPanelid_empresaTipoVenta.setVisible(this.tipoventaConstantesFunciones.mostrarid_empresaTipoVenta);
		//this.jInternalFrameDetalleFormTipoVenta.jTextFieldcodigoTipoVenta.setVisible(this.tipoventaConstantesFunciones.mostrarcodigoTipoVenta);
		this.jInternalFrameDetalleFormTipoVenta.jPanelcodigoTipoVenta.setVisible(this.tipoventaConstantesFunciones.mostrarcodigoTipoVenta);
		//this.jInternalFrameDetalleFormTipoVenta.jTextAreanombreTipoVenta.setVisible(this.tipoventaConstantesFunciones.mostrarnombreTipoVenta);
		this.jInternalFrameDetalleFormTipoVenta.jPanelnombreTipoVenta.setVisible(this.tipoventaConstantesFunciones.mostrarnombreTipoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormTipoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoVenta!=null) {
	
		this.jInternalFrameDetalleFormTipoVenta.jLabelidTipoVenta.setEnabled(this.tipoventaConstantesFunciones.activaridTipoVenta);
		this.jInternalFrameDetalleFormTipoVenta.jComboBoxid_empresaTipoVenta.setEnabled(this.tipoventaConstantesFunciones.activarid_empresaTipoVenta);
		this.jInternalFrameDetalleFormTipoVenta.jTextFieldcodigoTipoVenta.setEnabled(this.tipoventaConstantesFunciones.activarcodigoTipoVenta);
		this.jInternalFrameDetalleFormTipoVenta.jTextAreanombreTipoVenta.setEnabled(this.tipoventaConstantesFunciones.activarnombreTipoVenta);
		}
	}
	
		
}